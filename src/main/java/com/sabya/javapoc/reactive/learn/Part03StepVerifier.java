package com.sabya.javapoc.reactive.learn;

import reactor.test.StepVerifier;

import reactor.core.publisher.Flux;
import org.junit.jupiter.api.*;

import java.time.Duration;

/**
 * Learn how to use StepVerifier to test Mono, Flux or any other kind of Reactive Streams Publisher.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/test/release/api/reactor/test/StepVerifier.html">StepVerifier Javadoc</a>
 */
public class Part03StepVerifier {

//========================================================================================

    @Test
    void expectFooBarComplete() {
        Flux<String> flux1 = Flux.just("foo", "bar");
        StepVerifier.create(flux1).expectNext("foo","bar").verifyComplete();
    }

//========================================================================================


    @Test
    void expectFooBarError() {
        StepVerifier.create(Flux.just("foo", "bar").concatWith(Flux.error(new RuntimeException()))).expectNext("foo").expectNext("bar").verifyError();
    }
//
////========================================================================================
//
class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
    // and another one with "jpinkman" then completes successfully.
    @Test
    void expectSkylerJesseComplete() {
        StepVerifier.create(Flux.just(new User("swhite"))).assertNext(u -> u.getUsername().equals("swhite")).verifyComplete();
    }
//
////========================================================================================
//

    @Test
    void expect10Elements() {
        StepVerifier.create(Flux.range(0, 10)).expectNextCount(10).verifyComplete();
    }
//
////========================================================================================

   @Test
    void expect3600Elements() {
       StepVerifier.withVirtualTime(() -> Flux.interval(Duration.ofSeconds(1)).take(3600)).expectSubscription().thenAwait(Duration.ofSeconds(3600))
                .expectNextCount(3600)
                .verifyComplete();
    }
//
//    private void fail() {
//        throw new AssertionError("workshop not implemented");
//    }

}
