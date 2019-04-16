package com.oscenMusic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oscenMusic.service.MusicService;

@RestController
@RequestMapping(value = "music")
public class MusicController {
  private final MusicService musicService;

  @Autowired
  public MusicController(final MusicService musicService) {
    this.musicService = musicService;
  }

  @GetMapping
  public String hello() {
    return "hello from music service";
  }

  @GetMapping
  public List<String> getAllSongs() {
    return musicService.getAllSongs();
  }
}
