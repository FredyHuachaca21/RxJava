package com.fred.rxjava.ejemplos;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Ejemplo04 {
    public static void main(String[] args) {

        Observable<Long> secondsIntervals = Observable.interval(1, TimeUnit.SECONDS);

        secondsIntervals.subscribe(System.out::println);

        sleep(5000);
        observableConOnNextyOnComplete();
        observableConOnError();
    }


    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void observableConOnNextyOnComplete() {
        Observable<String> nombres = Observable.create(
                emitter -> {
                    emitter.onNext("Fredy");
                    emitter.onNext("Alex");
                    emitter.onNext("Marco");
                    emitter.onNext("Frank");
                    emitter.onNext("Antony");
                    emitter.onNext("Alessia");
                    emitter.onNext("Ivan");
                    emitter.onNext("Eduardo");

                    emitter.onComplete();
                }
        );

        nombres.subscribe(System.out::println);
    }

    private static void observableConOnError() {
        Observable<String> nombres = Observable.create(
                emitter -> {
                    try {
                        emitter.onNext("Fredy");
                        emitter.onNext("Alex");
                        emitter.onNext("Marco");
                        emitter.onNext("Frank");
                        emitter.onNext("Antony");
                        emitter.onNext("Alessia");
                        emitter.onNext("Ivan");
                        emitter.onNext("Eduardo");

                        emitter.onComplete();
                    }catch (Throwable e){
                        emitter.onError(e);
                    }
                }
        );

        nombres.subscribe(System.out::println, Throwable::printStackTrace);
    }
}
