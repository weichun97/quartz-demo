package com.chun.quartz.listener.trigger;

import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.listeners.TriggerListenerSupport;

/**
 * @Author chun
 * @Date 2019/8/14 14:29
 */
public class TriggerListener extends TriggerListenerSupport {
    @Override
    public String getName() {
        return "TriggerListener";
    }

    /**
     * (1)
     * Trigger被激发 它关联的job即将被运行
     * @param trigger
     * @param context
     */
    @Override
    public void triggerFired(Trigger trigger, JobExecutionContext context) {
        System.out.println(this.getName()+ ":" + trigger.getJobKey().getGroup() + "." + trigger.getJobKey().getName() + "被触发");
    }

    /**
     * (2)
     * Trigger被激发 它关联的job即将被运行,先执行(1)，在执行(2) 如果返回TRUE 那么任务job会被终止
     * @param trigger
     * @param context
     * @return
     */
    @Override
    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        return false;
    }

    /**
     * (3)
     * 当Trigger错过被激发时执行,比如当前时间有很多触发器都需要执行，但是线程池中的有效线程都在工作，
     * 那么有的触发器就有可能超时，错过这一轮的触发。
     * @param trigger
     */
    @Override
    public void triggerMisfired(Trigger trigger) {
        System.out.println(this.getName()+ ":" + trigger.getJobKey().getGroup() + "." + trigger.getJobKey().getName() + "错过被触发");
    }

    /**
     * (4)
     * 任务完成时触发
     * @param trigger
     * @param context
     * @param triggerInstructionCode
     */
    @Override
    public void triggerComplete(Trigger trigger, JobExecutionContext context, Trigger.CompletedExecutionInstruction triggerInstructionCode) {
        System.out.println(this.getName()+ ":" + trigger.getJobKey().getGroup() + "." + trigger.getJobKey().getName() + "任务完成");
    }
}
