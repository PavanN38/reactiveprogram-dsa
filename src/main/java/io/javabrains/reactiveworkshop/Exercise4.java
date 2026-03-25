package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()
        Flux<Integer> i = ReactiveSources.intNumbersFlux().onBackpressureLatest();
        i.subscribe(ii -> System.out.println(ii));

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
        Integer number = ReactiveSources.intNumberMono().block();
        System.out.println(number);

        // Get the value from the Mono into an integer variable
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
