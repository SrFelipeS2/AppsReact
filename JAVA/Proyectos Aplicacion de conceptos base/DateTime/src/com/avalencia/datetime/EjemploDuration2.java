package com.avalencia.datetime;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class EjemploDuration2 {
    public static void main(String[] args) {
        Instant i1 = Instant.now();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Instant i2 = Instant.now();
        Duration tiempo = Duration.between(i1,i2);
        System.out.println("tiempo = "+ tiempo);
    }
}
