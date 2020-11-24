package com.allenie.batch.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class HelloWorldTasklet implements Tasklet {
  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldTasklet.class);

  @Override
  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext)
      throws Exception {
    LOGGER.info("Hello World Tasklet!");
    return RepeatStatus.FINISHED;
  }
}
