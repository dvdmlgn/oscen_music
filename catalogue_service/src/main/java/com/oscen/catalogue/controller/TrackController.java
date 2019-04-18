package com.oscen.catalogue.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oscen.catalogue.dto.TrackDto;
import com.oscen.catalogue.service.TrackService;

@RestController
@RequestMapping(value = "track")
public class TrackController {

  private final TrackService service;

  @Inject
  public TrackController(final TrackService service) {
    this.service = service;
  }

  @GetMapping
  public String routeIsActiveResponse() {
    return "hello there from track";
  }

  @GetMapping("featured")
  public List<TrackDto> getFeatruedTracks(@RequestParam(value = "offset")
  final int offsetIteration) {
    return this.service.getFeaturedTracks(offsetIteration);
  }

  @GetMapping(value = "byname")
  public List<TrackDto> getTracksByName(@RequestParam(value = "name")
  final String name) {
    return this.service.getTracksByName(name);
  }

  @GetMapping(value = "byartist")
  public List<TrackDto> getTracksByArtist(@RequestParam(value = "artist")
  final String artistName) {
    return this.service.getTracksByArtist(artistName);
  }

}
