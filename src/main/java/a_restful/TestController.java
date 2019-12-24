package a_restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-12-23 16:52
 **/
@RestController
public class TestController {
    private final AtomicLong count = new AtomicLong();
    private final String temp = "hello,%s";
    @RequestMapping("/greeting")
    public Greeting say(@RequestParam(name = "name",defaultValue = "world")String name){
        Greeting greeting = new Greeting(count.incrementAndGet(), String.format(temp,name));
        return greeting;
    }
}
