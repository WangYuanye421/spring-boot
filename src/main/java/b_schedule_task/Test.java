package b_schedule_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-12-23 22:59
 **/
@SpringBootApplication
@EnableScheduling
public class Test {

    public static void main(String[] args) {
        SpringApplication.run(Test.class,args);

    }
}
