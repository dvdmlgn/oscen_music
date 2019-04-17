package com.oscen.catalogue.dto;

import java.util.List;

public class ArtistDto {

  private int id;

  private String name;

  private List<String> genres;

  private int popularity;

  /**
   * <p>
   * we don't want to allow anyone to instantiate a AlbumDto object using the default constructor.. -> we want them to
   * use a Builder instead.
   * </p>
   */
  private ArtistDto() {}

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public List<String> getGenres() {
    return this.genres;
  }

  public int getPopularity() {
    return this.popularity;
  }

  public static class Builder {
    private final ArtistDto artist;

    public Builder() {
      artist = new ArtistDto();
    }

    public Builder withId(final int id) {
      artist.id = id;
      return this;
    }

    public Builder withName(final String name) {
      artist.name = name;
      return this;
    }

    public Builder withGenres(final List<String> genres) {
      artist.genres = genres;
      return this;
    }

    public Builder withPopularity(final int popularity) {
      artist.popularity = popularity;
      return this;
    }

    public ArtistDto build() {
      return this.artist;
    }

  }

}
