package com.oscen.catalogue.service.implementation;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.oscen.catalogue.client.MusicSourceClient;
import com.oscen.catalogue.dto.AlbumDto;
import com.oscen.catalogue.dto.ArtistDto;
import com.oscen.catalogue.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {
  private final MusicSourceClient client;

  @Inject
  public AlbumServiceImpl(final MusicSourceClient client) {
    this.client = client;
  }

  @Override
  public List<AlbumDto> getFeaturedAlbums(final int offsetIteration) {
    return client.getFeaturedAlbums(offsetIteration);
  }

  @Override
  public List<AlbumDto> getFeaturedAlbumsByGenre(final String genre, final int offsetIteration) {
    return client.getFeaturedAlbumsByGenre(genre, offsetIteration);
  }

  @Override
  public List<AlbumDto> getAlbumsByArtist(final ArtistDto artist) {
    return client.getAlbumsByArtist(artist);
  }
}
