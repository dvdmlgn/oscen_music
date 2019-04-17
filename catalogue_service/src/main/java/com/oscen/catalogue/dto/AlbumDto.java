package com.oscen.catalogue.dto;

import java.util.List;

import com.oscen.catalogue.common.AlbumType;

public class AlbumDto {

  private int id;

  private String name;

  private List<ArtistDto> artists;

  private List<String> genres;

  private AlbumType albumType;

  private int popularity;

  private List<TrackDto> trackList;

  private float msrp;

  private boolean isOnSale;

  /**
   * <p>
   * if the track is not currently on sale.. -> salePrice is equal `-1.0`
   * </p>
   */
  private float salePrice;

  /**
   * <p>
   * we don't want to allow anyone to instantiate a AlbumDto object using the default constructor.. -> we want them to
   * use a Builder instead.
   * </p>
   */
  private AlbumDto() {}

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public List<ArtistDto> getArtists() {
    return this.artists;
  }

  public List<String> getGenres() {
    return this.genres;
  }

  public AlbumType getAlbumType() {
    return this.albumType;
  }

  public int getPopularity() {
    return this.popularity;
  }

  public List<TrackDto> getTrackList() {
    return this.trackList;
  }

  public float getMsrp() {
    return this.msrp;
  }

  public boolean IsOnSale() {
    return this.isOnSale;
  }

  public float getSalePrice() {
    return this.salePrice;
  }

  public static class Builder {
    private final AlbumDto album;

    public Builder() {
      album = new AlbumDto();
    }

    public Builder withId(final int id) {
      album.id = id;
      return this;
    }

    public Builder withName(final String name) {
      album.name = name;
      return this;
    }

    public Builder withArtists(final List<ArtistDto> artists) {
      album.artists = artists;
      return this;
    }

    public Builder withGenres(final List<String> genres) {
      album.genres = genres;
      return this;
    }

    public Builder withAlbumType(final AlbumType albumType) {
      album.albumType = albumType;
      return this;
    }

    public Builder withPopularity(final int popularity) {
      album.popularity = popularity;
      return this;
    }

    public Builder withTrackList(final List<TrackDto> trackList) {
      album.trackList = trackList;
      return this;
    }

    public Builder withMsrp(final float msrp) {
      album.msrp = msrp;
      return this;
    }

    public Builder withIsOnSale(final boolean isOnSale) {
      album.isOnSale = isOnSale;
      return this;
    }

    public Builder withSalePrice(final float salePrice) {
      album.salePrice = salePrice;
      return this;
    }

    public AlbumDto build() {
      return this.album;
    }

  }

}
