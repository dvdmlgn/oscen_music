package com.oscen.catalogue.service;

import java.util.List;

import com.oscen.catalogue.dto.ArtistDto;
import com.oscen.catalogue.dto.TrackDto;

public interface TrackService {

  List<TrackDto> getFeaturedTracks(final int offsetIteration);

  List<TrackDto> getTracksByName(final String Name);

  List<TrackDto> getTracksByArtist(final ArtistDto artist);

  List<TrackDto> getFeaturesTracksByGenre(final String genre, final int offsetIteration);

}
