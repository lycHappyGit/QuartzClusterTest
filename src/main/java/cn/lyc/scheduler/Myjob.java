package cn.lyc.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class Myjob extends QuartzJobBean{

	public void aa(){
		
		
	}

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(format.format(new Date()) + " 定时任务开始执行...");
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(format.format(new Date()) + " hello hello...");
		System.out.println(format.format(new Date()) + " 定时任务开始执完成");
	}
}
