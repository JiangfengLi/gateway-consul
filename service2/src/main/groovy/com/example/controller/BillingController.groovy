package com.example.controller

import com.example.domain.Book
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.retry.annotation.CircuitBreaker
import io.reactivex.Flowable

@Controller("/books")
@CircuitBreaker(delay = "5s", attempts = "5", multiplier = "3", reset = "30s")
class BookController {

    @Get
    Flowable<ArrayList<Book>> index(){
        Book book1 = new Book(title: "Title1", author: "author1", isbn: "xxxxxxx")
        Book book2 = new Book(title: "Title2", author: "author2", isbn: "xxxxxxx")
        Book book3 = new Book(title: "Title3", author: "author3", isbn: "xxxxxxx")

        Flowable.just([book1, book2, book3])
    }
}
