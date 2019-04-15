package app.models;

public class Genre {
  public String id;

  public String name;

  private Genre() {}

  public static class Builder {
    private String id;

    private String name;

    public Builder() {}

    public Builder withId(final String id) {
      this.id = id;
      return this;
    }

    public Builder withName(final String name) {
      this.name = name;
      return this;
    }

    public Genre build() {
      final Genre genre = new Genre();
      genre.id = this.id;
      genre.name = this.name;

      return genre;
    }

  }

}
