package com.chun.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.DateBuilder.evenMinuteDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * @Author chun
 * @Date 2019/8/13 17:51
 */
public class CronTriggerTest {

    public static void main(String[] args) throws SchedulerException {
        // 创建调度容器并开启
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.start();

        // 创建 jobDetail
        JobDetail job = newJob(HelloJob.class)
                .withIdentity("myJob", "group1")
                .build();

        Trigger trigger = null;

        /**
         * 每3秒钟执行一次
         */
//        trigger = newTrigger().withIdentity("myTrigger", "group1")
//                .startNow()
//                .forJob(job)
//                .withSchedule(CronScheduleBuilder.cronSchedule("0/3 * * * * ?"))
//                .build();

        trigger = newTrigger().withIdentity("myTrigger", "group1")
                .startNow()
                .forJob(job)
                .withSchedule(CronScheduleBuilder.dailyAtHourAndMinute(14, 58))
                .build();

        scheduler.scheduleJob(job, trigger);
    }
}
