package com.example

import com.example.domain.Book
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.CircuitBreaker
import io.reactivex.Flowable

@Client(id = "service2")
@CircuitBreaker(delay = "5s", attempts = "5", multiplier = "3", reset = "30s")
interface Service2Client {
    @Get("/books")
    Flowable<ArrayList<Book>> findBooks();
}
