package com.fred.rxjava.ejemplos;

import io.reactivex.rxjava3.core.Observable;

public class Ejemplo01 {

    public static void main(String[] args) {
        Observable<String> nombres = Observable
                .just("Fred", "Alex", "Marco", "Frank", "Antony", "Alessia", "Ivan", "Eduardo");

        /*1*/
        nombres.subscribe(System.out::println);

//
    }

}
