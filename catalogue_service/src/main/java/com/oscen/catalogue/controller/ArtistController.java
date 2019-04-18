package com.oscen.catalogue.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oscen.catalogue.dto.ArtistDto;
import com.oscen.catalogue.service.ArtistService;

@RestController
@RequestMapping(value = "artist")
public class ArtistController {

  private final ArtistService service;

  @Inject
  public ArtistController(final ArtistService service) {
    this.service = service;
  }

  @GetMapping
  public String routeIsActiveResponse() {
    return "hello there from artist";
  }

  @GetMapping("featured")
  public List<ArtistDto> getFeaturedArtists(@RequestParam(value = "offset")
  final int offsetIteration) {
    return this.service.getFeaturedArtists(offsetIteration);
  }

  @GetMapping(value = "byname")
  public List<ArtistDto> getArtistsByName(@RequestParam
  final String name) {
    return this.service.getArtistsByName(name);
  }

  @GetMapping("byGenre")
  public List<ArtistDto> getFeaturedArtistsByGenre(@RequestParam
  final String genre, @RequestParam(value = "offset")
  final int offsetIteration) {
    return this.service.getFeaturedArtistsByGenre(genre, offsetIteration);
  }

}
