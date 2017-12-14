package com.hlw.zwd;

import com.liumapp.DNSQueen.queen.Queen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = {"com.hlw"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);

    }
}
