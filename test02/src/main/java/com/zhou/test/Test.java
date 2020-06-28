package com.zhou.test;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception{
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withDescription("工作描述")
                .withIdentity("工作名称","1组").build();

        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule();
        simpleScheduleBuilder.withIntervalInSeconds(2);
        simpleScheduleBuilder.withRepeatCount(5);

        Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("2 * * ? * *"))
                .withDescription("铜哥的触发器").withIdentity("铜哥","1")
                .startAt(new Date()).build();

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.scheduleJob(jobDetail,trigger);

        scheduler.start();

    }
}
