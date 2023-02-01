package zy.service.impl;

import com.zy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.PrintStream;

/**
 * If you structure your code as suggested above (locating your application class in a top package), you
 * can add @ComponentScan without any arguments or use the @SpringBootApplication annotation which
 * implicitly includes it. All of your application components (@Component, @Service, @Repository,
 *
 * @Controller, and others) are automatically registered as Spring Beans.
 * If a bean has more than one constructor, you will need to mark the one you want Spring to use with
 * @Autowired:
 */

@Service
public class MyAccountService implements AccountService {
    private String name;
    private PrintStream out;

    @Autowired
    public MyAccountService(String name) {
        this.name = name;
    }

    public MyAccountService(PrintStream out, String name) {
        this.out = out;
        this.name = name;
    }
}
