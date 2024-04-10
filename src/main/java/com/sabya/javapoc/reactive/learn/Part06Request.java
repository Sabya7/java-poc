package com.sabya.javapoc.reactive.learn;

import com.sabya.javapoc.reactive.learn.model.User;
import com.sabya.javapoc.reactive.learn.repository.ReactiveRepository;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class Part06Request {

//========================================================================================
    
    StepVerifier requestAllExpectFour(Flux<User> flux) {
        return StepVerifier.create(flux).expectNextCount(4).expectComplete();
    }

//========================================================================================


    StepVerifier requestOneExpectSkylerThenRequestOneExpectJesse(Flux<User> flux) {
        return StepVerifier.create(flux).thenRequest(1).expectNext(User.SKYLER).thenRequest(1).expectNext(User.JESSE).thenCancel();
    }

//========================================================================================


    Flux<User> fluxWithLog() {
        return Flux.just(User.JESSE, User.SAUL).log();
    }

//========================================================================================

     Flux<User> fluxWithDoOnPrintln() {
        return  Flux.just(User.JESSE, User.SAUL).doFirst(() -> System.out.println("Starring:"))
                .doOnNext(u -> System.out.println(u.getFirstname() + " " +u.getLastname()))
                .doOnComplete(() -> System.out.println("The end!"));
    }

}