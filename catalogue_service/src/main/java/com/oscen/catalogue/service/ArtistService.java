package com.oscen.catalogue.service;

import java.util.List;

import com.oscen.catalogue.dto.ArtistDto;

public interface ArtistService {

  List<ArtistDto> getFeaturedArtists(final int offsetIteration);

  List<ArtistDto> getArtistsByName(final String name);

  List<ArtistDto> getFeaturedArtistsByGenre(final String genre, final int offsetIteration);

}
