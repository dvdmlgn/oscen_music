package com.oscen.catalogue.service.implementation;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.oscen.catalogue.client.MusicSourceClient;
import com.oscen.catalogue.dto.ArtistDto;
import com.oscen.catalogue.service.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {
  private final MusicSourceClient client;

  @Inject
  public ArtistServiceImpl(final MusicSourceClient client) {
    this.client = client;
  }

  @Override
  public List<ArtistDto> getFeaturedArtists(final int offsetIteration) {
    return client.getFeaturedArtists(offsetIteration);
  }

  @Override
  public List<ArtistDto> getArtistsByName(final String name) {
    return client.getArtistsByName(name);
  }

  @Override
  public List<ArtistDto> getFeaturedArtistsByGenre(final String genre, final int offsetIteration) {
    return client.getFeaturedArtistsByGenre(genre, offsetIteration);
  }
}
