package app.models;

import java.util.List;

public class SongList {
  public String type;

  public List<Song> songList;

  public SongList(final List<Song> songs, final String type) {
    this.songList = songs;
    this.type = type;
  }
}
