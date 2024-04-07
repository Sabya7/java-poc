package com.sabya.javapoc.reactive.learn;

import reactor.test.StepVerifier;

import reactor.core.publisher.Flux;
import org.junit.jupiter.api.*;

/**
 * Learn how to use StepVerifier to test Mono, Flux or any other kind of Reactive Streams Publisher.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/test/release/api/reactor/test/StepVerifier.html">StepVerifier Javadoc</a>
 */
public class Part03StepVerifier {

//========================================================================================

    @Test
    void expectFooBarComplete(Flux<String> flux) {
        StepVerifier.create(Flux.just("foo","bar")).expectNext("foo").expectNext("bar").verifyComplete();
    }

//========================================================================================

//
//    void expectFooBarError(Flux<String> flux) {
//        StepVerifier.create(flux).expectNext("foo").expectNext("bar").verifyError();
//    }
//
////========================================================================================
//
//    // TODO Use StepVerifier to check that the flux parameter emits a User with "swhite"username
//    // and another one with "jpinkman" then completes successfully.
//    void expectSkylerJesseComplete(Flux<User> flux) {
//        fail();
//    }
//
////========================================================================================
//
//    // TODO Expect 10 elements then complete and notice how long the test takes.
//    void expect10Elements(Flux<Long> flux) {
//        fail();
//    }
//
////========================================================================================
//
//    // TODO Expect 3600 elements at intervals of 1 second, and verify quicker than 3600s
//    // by manipulating virtual time thanks to StepVerifier#withVirtualTime, notice how long the test takes
//    void expect3600Elements(Supplier<Flux<Long>> supplier) {
//        fail();
//    }
//
//    private void fail() {
//        throw new AssertionError("workshop not implemented");
//    }

}
