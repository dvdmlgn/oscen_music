package app.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.models.Album;
import app.models.Song;
import app.models.SongList;

@RestController
@RequestMapping(value = "albums")
public class AlbumController {

  @GetMapping(value = "getbyartist")
  public List<Album> getAlbumsByArtist(@RequestParam(value = "artist")
  final String artist) {

    final List<Song> songs = Stream
        .of(new Song.Builder().withId(3).withName("third song").build(),
          new Song.Builder().withId(4).withName("fourth song").build())
        .collect(Collectors.toList());

    final SongList songList = new SongList(songs, "songs");

    return Stream.of(new Album.Builder().withId(1).withName("the album").withSongList(songList).build())
        .collect(Collectors.toList());
  }

}
