package app.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Song {

  @JsonProperty("id")
  public int id;

  @JsonProperty("name")
  public String name;



  private Song() {}

  public class Builder {
    private int id;
    private String name;

    public Builder() {}

    public Builder withId(int id) {
      this.id = id;
      return this;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Song build() {
      Song song = new Song();
      song.id = this.id;
      song.name = this.name;

      return song;
    }

  }

}
