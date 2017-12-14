package com.hlw.zwd.worker;

import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import org.springframework.stereotype.Component;

@Component
public class TestB extends StandReadyWorker {
    @Override
    public String doWhatYouShouldDo(String s) {
        System.out.println("I am B");
        return null;
    }
}
