package com.allenie.batch.helloworld;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class HelloWorldJob {
  
  private JobBuilderFactory jobBuilderFactory;
  
  private StepBuilderFactory stepBuilderFactory;
  
  private HelloWorldListener helloWorldListener;
  
  private HelloWorldTasklet tasklet;
  
  public HelloWorldJob(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory,
      HelloWorldListener helloWorldListener, HelloWorldTasklet tasklet) {
    super();
    this.jobBuilderFactory = jobBuilderFactory;
    this.stepBuilderFactory = stepBuilderFactory;
    this.helloWorldListener = helloWorldListener;
    this.tasklet = tasklet;
  }

  @Bean
  public Step step() {
    return stepBuilderFactory.get("step")
        .tasklet(tasklet)
        .build();
  }
  
  @Bean
  public Job job(Step step) {
    return jobBuilderFactory.get("job")
        .incrementer(new RunIdIncrementer())
        .listener(helloWorldListener)
        .start(step)
        .build();
  }
}
