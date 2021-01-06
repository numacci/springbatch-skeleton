package com.numacci.batch.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldListener extends JobExecutionListenerSupport {
  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldListener.class);

  @Override
  public void beforeJob(JobExecution jobExecution) {
    super.beforeJob(jobExecution);
    LOGGER.info("Hello World before job!");
  }
  
  @Override
  public void afterJob(JobExecution jobExecution) {
    super.afterJob(jobExecution);
    LOGGER.info("Hello World after job!");
  }
}
