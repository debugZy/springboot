package com.spring.test;

import com.zy.Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
public class ApplicationTest {
    @Test
    public void move() {
        int c= 8;
        c>>=3;
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
        int y = 8;
        y<<=2;
        System.out.println(y);
        System.out.println(Integer.toBinaryString(y));
    }
}
