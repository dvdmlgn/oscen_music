package app.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.models.Genre;

@RestController
@RequestMapping(value = "genres")
public class GenreController {

  @GetMapping(value = "get")
  public List<Genre> getAllGenres() {
    return Stream.of(new Genre.Builder().withId("hip_hop").withName("hip hop").build(),

      new Genre.Builder().withId("classical").withName("classical").build()).collect(Collectors.toList());
  }

}
