package dev.ivanqueiroz.springbatchdicas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeExceptionMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBatchDicasApplication implements CommandLineRunner {

  private static final Logger log = LoggerFactory.getLogger(SpringBatchDicasApplication.class);

  @Autowired
  JobLauncher jobLauncher;

  @Autowired
  private ApplicationContext appContext;

  public static void main(String[] args) {
    System.exit(SpringApplication.exit(SpringApplication.run(SpringBatchDicasApplication.class, args)));
  }

  @Override
  public void run(String... args) throws Exception {
    log.info("Executando.");
    Job job = appContext.getBean("importUserJob", Job.class);
    JobParameters params =
      new JobParametersBuilder().addString("importUserJob", String.valueOf(System.currentTimeMillis())).toJobParameters();
    jobLauncher.run(job, params);
  }

  /**
   * Mapeia erros para o exit code 1, para ser pego pelo Control-m
   * */
  @Bean
  ExitCodeExceptionMapper exitCodeToexceptionMapper() {
    return exception -> 1;
  }
}
