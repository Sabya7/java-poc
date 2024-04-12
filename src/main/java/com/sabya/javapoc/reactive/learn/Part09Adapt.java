package com.sabya.javapoc.reactive.learn;

import com.sabya.javapoc.reactive.learn.model.User;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class Part09Adapt {

//========================================================================================

    Flowable<User> fromFluxToFlowable(Flux<User> flux) {
        return Flowable.fromPublisher(flux);
    }


    Flux<User> fromFlowableToFlux(Flowable<User> flowable) {
        return Flux.from(flowable);
    }

//========================================================================================


    Observable<User> fromFluxToObservable(Flux<User> flux) {
        return Observable.fromPublisher(flux);
    }

    Flux<User> fromObservableToFlux(Observable<User> observable) {
        return Flux.create(e -> {
            observable.subscribe(e::next,e::error,e::complete);
        });
    }

//========================================================================================

    Single<User> fromMonoToSingle(Mono<User> mono) {
        return Single.fromPublisher(mono);
    }


    Mono<User> fromSingleToMono(Single<User> single) {
        return Mono.create(e -> {
            single.subscribe(e::success,e::error);
        });
    }

//========================================================================================

    CompletableFuture<User> fromMonoToCompletableFuture(Mono<User> mono) {
        return mono.toFuture();
    }


    Mono<User> fromCompletableFutureToMono(CompletableFuture<User> future) {
        return Mono.fromFuture(future);
    }

}
