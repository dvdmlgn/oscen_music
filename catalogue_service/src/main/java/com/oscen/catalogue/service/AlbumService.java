package com.oscen.catalogue.service;

import java.util.List;

import com.oscen.catalogue.dto.AlbumDto;
import com.oscen.catalogue.dto.ArtistDto;

public interface AlbumService {

  List<AlbumDto> getFeaturedAlbums(final int offsetIteration);

  List<AlbumDto> getFeaturedAlbumsByGenre(final String genre, final int offsetIteration);

  List<AlbumDto> getAlbumsByArtist(final ArtistDto artist);
}
