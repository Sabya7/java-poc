package com.sabya.javapoc.reactive.learn;

import com.sabya.javapoc.reactive.learn.model.User;
import com.sabya.javapoc.reactive.learn.repository.BlockingRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Part11BlockingToReactive {

//========================================================================================

    // TODO Create a Flux for reading all users from the blocking repository deferred until the flux is subscribed, and run it with a bounded elastic scheduler
    Flux<User> blockingRepositoryToFlux(BlockingRepository<User> repository) {
        return null;
    }

//========================================================================================

    // TODO Insert users contained in the Flux parameter in the blocking repository using a bounded elastic scheduler and return a Mono<Void> that signal the end of the operation
    Mono<Void> fluxToBlockingRepository(Flux<User> flux, BlockingRepository<User> repository) {
        return null;
    }

}
