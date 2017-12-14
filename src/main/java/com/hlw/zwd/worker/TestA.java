package com.hlw.zwd.worker;

import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import org.springframework.stereotype.Component;

@Component
public class TestA extends StandReadyWorker {
    @Override
    public String doWhatYouShouldDo(String s) {
        System.out.println("I am A");
        return null;
    }
}
