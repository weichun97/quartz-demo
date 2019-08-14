package com.chun.quartz.listener;

import com.chun.quartz.HelloJob;
import com.chun.quartz.listener.job.JobListener;
import com.chun.quartz.listener.trigger.TriggerListener;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.EverythingMatcher;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * @Author chun
 * @Date 2019/8/14 12:09
 */
public class ListenerTest {

    public static void main(String[] args) throws SchedulerException {
        // 创建调度容器并开启
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        // 添加监听器
        scheduler.getListenerManager().addJobListener(new JobListener(), EverythingMatcher.allJobs());
        scheduler.getListenerManager().addTriggerListener(new TriggerListener(), EverythingMatcher.allTriggers());

        // 开启 scheduler
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
                .withSchedule(CronScheduleBuilder.cronSchedule("0/1 * * * * ?"))
                .build();

        scheduler.scheduleJob(job, trigger);
    }
}
