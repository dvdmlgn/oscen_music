package com.oscen.catalogue.service.implementation;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.oscen.catalogue.client.MusicSourceClient;
import com.oscen.catalogue.dto.TrackDto;
import com.oscen.catalogue.service.TrackService;

@Service
public class TrackServiceImpl implements TrackService {
  private final MusicSourceClient client;

  @Inject
  public TrackServiceImpl(final MusicSourceClient client) {
    this.client = client;
  }

  @Override
  public List<TrackDto> getFeaturedTracks(final int offsetIteration) {
    return client.getFeaturedTracks(offsetIteration);
  }

  @Override
  public List<TrackDto> getTracksByName(final String name) {
    return client.getTracksByName(name);
  }

  @Override
  public List<TrackDto> getTracksByArtist(final String artistName) {
    // @cleanup: need to test and verify that this works, and get/find a cleaner solution?
    return (List<TrackDto>) client.getArtistsByName(artistName)
        .stream()
        .map(artist -> client.getTracksByArtist(artist));
  }

  @Override
  public List<TrackDto> getFeaturesTracksByGenre(final String genre, final int offsetIteration) {
    return client.getFeaturedTracksByGenre(genre, offsetIteration);
  }
}
