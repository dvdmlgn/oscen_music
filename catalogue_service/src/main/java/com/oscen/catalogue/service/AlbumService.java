package com.oscen.catalogue.service;

import java.util.List;

import com.oscen.catalogue.dto.AlbumDto;

public interface AlbumService {

  List<AlbumDto> getFeaturedAlbums(final int offsetIteration);

  List<AlbumDto> getFeaturedAlbumsByGenre(final String genre, final int offsetIteration);

  List<AlbumDto> getAlbumsByArtist(final String artistName);
}
