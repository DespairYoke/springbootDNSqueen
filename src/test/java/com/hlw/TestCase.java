package com.hlw;

import com.hlw.zwd.Main;
import com.liumapp.DNSQueen.queen.Queen;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Main.class)
public class TestCase {
    @Test
    public void test(){
        Queen queen=new Queen();
        queen.setPort(40213);
        try {
            queen.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        queen.say("hello world");
        try {
            System.out.println(queen.hear());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
