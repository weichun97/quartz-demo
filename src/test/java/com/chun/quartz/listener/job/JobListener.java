package com.chun.quartz.listener.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.listeners.JobListenerSupport;

/**
 * @Author chun
 * @Date 2019/8/14 12:03
 */
public class JobListener extends JobListenerSupport {

    @Override
    public String getName() {
        return "HelloJobListener";
    }

    /**
     * 执行前调用
     * @param context
     */
    @Override
    public void jobToBeExecuted(JobExecutionContext context) {
        String jobName = context.getJobDetail().getKey().getName();
        String jobGroup = context.getJobDetail().getKey().getGroup();
        System.out.println(this.getName() + ":" + jobGroup + "." + jobName + " 开始执行");
    }

    /**
     * (2)
     * 这个方法正常情况下不执行,但是如果当TriggerListener中的vetoJobExecution方法返回true时,那么执行这个方法.
     * 需要注意的是 如果方法(2)执行 那么(1),(3)这个俩个方法不会执行,因为任务被终止了嘛.
     * Called by the Scheduler when a JobDetail was about to be executed (an associated Trigger has occurred),
     * but a TriggerListener vetoed it's execution.
     */
    @Override
    public void jobExecutionVetoed(JobExecutionContext context) {
    }

    /**
     * 执行完成调用
     * @param context
     * @param jobException
     */
    @Override
    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {

        String jobName = context.getJobDetail().getKey().getName();
        String jobGroup = context.getJobDetail().getKey().getGroup();
        System.out.println(this.getName() + ":" + jobGroup + "." + jobName + " 执行完成");
    }
}
