package com.sabya.javapoc.reactive.learn;

import com.sabya.javapoc.reactive.learn.model.User;
import com.sabya.javapoc.reactive.learn.repository.BlockingRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class Part11BlockingToReactive {

//========================================================================================
        Flux<User> blockingRepositoryToFlux(BlockingRepository<User> repository) {
            return Flux.defer(() -> Flux.fromIterable(repository.findAll()))
                    .subscribeOn(Schedulers.boundedElastic());
        }


        Mono<Void> fluxToBlockingRepository(Flux<User> flux, BlockingRepository<User> repository) {
            return flux
                    .flatMap(user -> Mono.fromRunnable(() -> repository.save(user))
                            .subscribeOn(Schedulers.boundedElastic()))
                    .then();
        }

}
