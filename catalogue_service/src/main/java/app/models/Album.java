package app.models;

public class Album {
  public int id;

  public String name;

  public SongList songList;

  private Album() {}

  public static class Builder {
    private int id;

    private String name;

    private SongList songList;

    public Builder() {}

    public Builder withId(final int id) {
      this.id = id;
      return this;
    }

    public Builder withName(final String name) {
      this.name = name;
      return this;
    }

    public Builder withSongList(final SongList songList) {
      this.songList = songList;
      return this;
    }

    public Album build() {
      final Album album = new Album();
      album.id = this.id;
      album.name = this.name;
      album.songList = this.songList;

      return album;
    }

  }

}
