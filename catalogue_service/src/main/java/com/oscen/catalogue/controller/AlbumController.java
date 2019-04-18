package com.oscen.catalogue.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oscen.catalogue.dto.AlbumDto;
import com.oscen.catalogue.service.AlbumService;

@RestController
@RequestMapping("album")
public class AlbumController {

  private final AlbumService serivce;

  @Inject
  public AlbumController(final AlbumService service) {
    this.serivce = service;
  }

  @GetMapping
  public String routeIsActiveReponse() {
    return "hello there from album";
  }

  @GetMapping("featured")
  public List<AlbumDto> getFeaturedAlbums(@RequestParam(value = "offset")
  final int offsetIteration) {
    return this.serivce.getFeaturedAlbums(offsetIteration);
  }

  @GetMapping("byartist")
  public List<AlbumDto> getAlbumsByArtist(@RequestParam
  final String name) {
    return this.serivce.getAlbumsByArtist(name);
  }

}
