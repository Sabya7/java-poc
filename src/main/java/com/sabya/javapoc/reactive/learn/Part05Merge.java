package com.sabya.javapoc.reactive.learn;

import com.sabya.javapoc.reactive.learn.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Part05Merge {

//========================================================================================
    Flux<User> mergeFluxWithInterleave(Flux<User> flux1, Flux<User> flux2) {
        return flux1.mergeWith(flux2);
    }

//========================================================================================

    Flux<User> mergeFluxWithNoInterleave(Flux<User> flux1, Flux<User> flux2) {
        return flux1.concatWith(flux2);
    }

//========================================================================================

    Flux<User> createFluxFromMultipleMono(Mono<User> mono1, Mono<User> mono2) {
        return mono1.concatWith(mono2);
    }

}
