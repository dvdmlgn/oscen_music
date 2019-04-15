package app.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist {
  @JsonProperty("id")
  public int id;

  @JsonProperty("name")
  public String name;

  private Artist() {}

  public static class Builder {
    private int id;

    private String name;

    public Builder() {}

    public Builder withId(final int id) {
      this.id = id;
      return this;
    }

    public Builder withName(final String name) {
      this.name = name;
      return this;
    }

    public Artist build() {
      final Artist artist = new Artist();
      artist.id = this.id;
      artist.name = this.name;

      return artist;
    }

  }

}
