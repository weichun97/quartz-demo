package com.chun.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.calendar.HolidayCalendar;

import java.util.Date;

import static org.quartz.CronScheduleBuilder.dailyAtHourAndMinute;
import static org.quartz.DateBuilder.*;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * @Author chun
 * @Date 2019/8/13 17:51
 */
public class SimpleTriggerTest {

    public static void main(String[] args) throws SchedulerException {
        // 创建调度容器并开启
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.start();

        // 创建 jobDetail
        JobDetail job = newJob(HelloJob.class)
                .withIdentity("myJob", "group1")
                .build();

        /**
         * startAt  定时器的开始时间
         * forJob   指定只有选中的 job 可以使用
         * withIntervalInSeconds    多少秒重复一次
         * withRepeatCount    重复的次数(重复5次表示总共执行了6次)
         */
//        Trigger t = newTrigger()
//                .withIdentity("myTrigger", "group1")
//                .startAt(DateBuilder.dateOf(10, 42, 59))
//                .forJob("myJob", "group1")
//                .withSchedule(SimpleScheduleBuilder
//                        .simpleSchedule()
//                        .withIntervalInSeconds(1)
//                        .withRepeatCount(5))
//                .build();

        /**
         * 未来5秒钟执行
         */
//        Trigger t = newTrigger()
//                .withIdentity("myTrigger", "group1")
//                .startAt(DateBuilder.futureDate(5, DateBuilder.IntervalUnit.SECOND)) // use DateBuilder to create a date in the future
//                .forJob("myJob", "group1")
//                .withSchedule(SimpleScheduleBuilder
//                        .simpleSchedule()
//                        .withIntervalInSeconds(1)
//                        .withRepeatCount(5))
//                .build();

        /**
         * endAt 结束时间
         */
//        Trigger t = newTrigger()
//                .withIdentity("myTrigger", "group1")
//                .startAt(DateBuilder.futureDate(5, DateBuilder.IntervalUnit.SECOND)) // use DateBuilder to create a date in the future
//                .forJob("myJob", "group1")
//                .withSchedule(SimpleScheduleBuilder
//                        .simpleSchedule()
//                        .withIntervalInSeconds(1)
//                        .repeatForever())
//                .endAt(dateOf(10, 54, 0))
//                .build();

        /**
         * evenMinuteDate 整分
         */
        Trigger t = newTrigger()
                .withIdentity("myTrigger", "group1")
                .startAt(evenMinuteDate(null))
                .forJob("myJob", "group1")
                .withSchedule(SimpleScheduleBuilder
                        .simpleSchedule()
                        .withIntervalInSeconds(1)
                        .repeatForever())
                .build();


        // 运行
        scheduler.scheduleJob(job, t);
    }
}
