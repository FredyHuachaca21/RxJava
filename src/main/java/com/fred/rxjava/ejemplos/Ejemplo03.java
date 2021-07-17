package com.fred.rxjava.ejemplos;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Ejemplo03 {
    public static void main(String[] args) {

        Observable<Long> secondsIntervals = Observable.interval(1, TimeUnit.SECONDS);

        secondsIntervals.subscribe(System.out::println);

        sleep(10000);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
