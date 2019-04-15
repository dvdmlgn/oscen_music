package app.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.models.Artist;

@RestController
@RequestMapping(value = "artists")
public class ArtistController {

  @GetMapping(value = "get")
  public List<Artist> getArtists() {
    return Stream.of(new Artist.Builder().withId(1).withName("David Bowie").build(),

      new Artist.Builder().withId(2).withName("Andre 3000").build()).collect(Collectors.toList());
  }

}
