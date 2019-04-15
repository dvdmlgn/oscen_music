package app.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.models.Song;
import app.models.SongList;

@RestController
@RequestMapping(value = "songs")
public class SongController {

  @GetMapping(value = "get")
  public SongList getSongs() {

    final List<Song> songs = Stream.of(new Song.Builder().withId(1).withName("first song").build(),

      new Song.Builder().withId(2).withName("second song").build()).collect(Collectors.toList());

    return new SongList(songs, "songs");
  }

  @GetMapping(value = "getbyid")
  public Song getSongById(@RequestParam(value = "id")
  final int id) {
    return new Song.Builder().withId(id).withName("name of the song").build();
  }

  @GetMapping(value = "getbyartist")
  public SongList getByArtist(@RequestParam(value = "artist")
  final String artist) {
    final List<Song> songs = Stream.of(new Song.Builder().withId(3).withName("third song").build(),

      new Song.Builder().withId(4).withName("fourth song").build()).collect(Collectors.toList());

    return new SongList(songs, "songs");
  }

}
