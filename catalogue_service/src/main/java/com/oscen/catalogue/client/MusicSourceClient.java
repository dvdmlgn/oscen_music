package com.oscen.catalogue.client;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oscen.catalogue.dto.AlbumDto;
import com.oscen.catalogue.dto.ArtistDto;
import com.oscen.catalogue.dto.TrackDto;

@Service
public class MusicSourceClient {

  private static final int resultLimit = 12;

  /**
   * @param offset:
   * @return
   */
  public List<TrackDto> getFeaturedTracks(final int offsetIteration) {
    // @todo: do implementation
    return null;
  }

  public List<TrackDto> getTracksByName(final String name) {
    // @todo: do implementation
    return null;
  }

  public List<TrackDto> getTracksByArtist(final ArtistDto artist) {
    // @todo: do implementation
    return null;
  }

  public List<TrackDto> getFeaturedTracksByGenre(final String genre, final int offsetIteration) {
    // @todo: do implementation
    return null;
  }

  public List<ArtistDto> getFeaturedArtists(final int offsetIteration) {
    // @todo: do implementation
    return null;
  }

  public List<ArtistDto> getFeaturedArtistsByGenre(final String genre, final int offsetIteration) {
    // @todo: do implementation
    return null;
  }

  public List<ArtistDto> getArtistsByName(final String name) {
    // @todo: do implementation
    return null;
  }

  public List<AlbumDto> getFeaturedAlbums(final int offsetIteration) {
    // @todo: do implementation
    return null;
  }

  public List<AlbumDto> getFeaturedAlbumsByGenre(final String genre, final int offsetIteration) {
    // @todo: do implementation
    return null;
  }

  public List<AlbumDto> getAlbumsByArtist(final ArtistDto artist) {
    // @todo: do implementation
    return null;
  }

}
