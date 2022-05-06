package web;


import data.Movie;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin //this is to help with local dev testing
@RestController
@RequestMapping("/api/movies")
public class MoviesController {

    @GetMapping
    public Movie one(){
        return new Movie();
    }
}
/* This handy annotation is what is called a *composed annotation*.

    Meaning, its behaviors are composed of the actions of other annotations.

            `@GetMapping` acts as a shortcut for

            `@RequestMapping(method = RequestMethod.GET)`. */


}
