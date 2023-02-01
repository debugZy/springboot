package com.zy;

import com.zy.config.AnotherConfiguration;
import com.zy.config.SomeConfig;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootConfiguration(proxyBeanMethods = false)
@EnableAutoConfiguration
@Import({SomeConfig.class, AnotherConfiguration.class})
public class Application {
    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
//        需要完全禁用重新启动支持devtools
//        System.setProperty("spring.devtools.restart.enabled", "false");
//        SpringApplication.run(Application.class, args);
//        SpringApplication application = new SpringApplication(Application.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.run(args);
    }
}
