package com.oscen.catalogue.client;

import java.util.List;

import com.oscen.catalogue.dto.ArtistDto;
import com.oscen.catalogue.dto.TrackDto;

public class MusicSorceClient {

  /**
   * @param offset:
   * @property limit: is currently set to 12 -> you will get 12 tracks back every time you make a request
   * @return
   */
  public List<TrackDto> getFeaturedTracks(final int offset) {
    final int limit = 12;
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

}
