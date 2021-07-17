package com.fred.rxjava.ejemplos;

import io.reactivex.rxjava3.core.Observable;

public class Ejemplo02 {
    public static void main(String[] args) {

        Observable<String> nombres = Observable
                .just("Fred", "Alex", "Marco", "Frank", "Antony", "Alessia", "Ivan", "Eduardo");

        /*2 MAP => OPERADOR DE TRANSFORMACION*/
        nombres.map(String::length).subscribe(System.out::println);
    }
}
