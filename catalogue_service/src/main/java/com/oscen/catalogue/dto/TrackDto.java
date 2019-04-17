package com.oscen.catalogue.dto;

/**
 * <p>
 * this classes properties are not final as they are going to be set from our nested Builder class below
 * </p>
 */
import java.util.List;

public class TrackDto {

  private int id;

  private String name;

  private AlbumDto album;

  private List<ArtistDto> artists;

  private boolean isExplicit;

  private int popularity;

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
   * we don't want to allow anyone to instantiate a TrackDto object using the default constructor.. -> we want them to
   * use a Builder instead.
   * </p>
   */
  private TrackDto() {}

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public AlbumDto getAlbum() {
    return this.album;
  }

  public List<ArtistDto> getArtists() {
    return this.artists;
  }

  public boolean isExplicit() {
    return this.isExplicit;
  }

  public int getPopularity() {
    return this.popularity;
  }

  public float getMsrp() {
    return this.msrp;
  }

  public boolean isOnSale() {
    return this.isOnSale;
  }

  public float getSalePrice() {
    return this.salePrice;
  }

  public static class Builder {
    private final TrackDto track;

    public Builder() {
      track = new TrackDto();
    }

    public Builder withId(final int id) {
      track.id = id;
      return this;
    }

    public Builder withName(final String name) {
      track.name = name;
      return this;
    }

    public Builder withAlbum(final AlbumDto album) {
      track.album = album;
      return this;
    }

    public Builder withArtists(final List<ArtistDto> artists) {
      track.artists = artists;
      return this;
    }

    public Builder withIsExplicit(final boolean isExplicit) {
      track.isExplicit = isExplicit;
      return this;
    }

    public Builder withPopularity(final int popularity) {
      track.popularity = popularity;
      return this;
    }

    public Builder withMsrp(final float msrp) {
      track.msrp = msrp;
      return this;
    }

    public Builder withIsOnSale(final boolean isOnSale) {
      track.isOnSale = isOnSale;
      return this;
    }

    public Builder withSalePrice(final float salePrice) {
      track.salePrice = salePrice;
      return this;
    }

    public TrackDto build() {
      return this.track;
    }

  }

}
