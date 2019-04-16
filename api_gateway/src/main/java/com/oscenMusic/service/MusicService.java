package com.oscenMusic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscenMusic.client.MusicClient;

@Service
public class MusicService {

  private final MusicClient musicClient;

  @Autowired
  public MusicService(final MusicClient musicClient) {
    this.musicClient = musicClient;
  }

  public List<String> getAllSongs() {
    return musicClient.getAllSongs();
  }

}
