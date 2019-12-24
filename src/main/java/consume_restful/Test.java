package consume_restful;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-12-24 10:40
 **/
@SpringBootApplication
public class Test {
    private final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        SpringApplication.run(Test.class,args);
    }

    @Bean
    public RestTemplate getTemp(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(final RestTemplate restTemplate){
        return args ->{
            Msg msg = restTemplate.getForObject(
                    "https://gturnquist-quoters.cfapps.io/api/random",
                    Msg.class);
            logger.info(msg.toString());
        };
    }

}
