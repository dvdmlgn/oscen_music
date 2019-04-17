package com.oscen.catalogue.service;

import java.util.List;

import com.oscen.catalogue.dto.TrackDto;

public interface TrackService {

  List<TrackDto> getFeaturedTracks(final int offsetIteration);

  List<TrackDto> getTracksByName(final String Name);

  List<TrackDto> getTracksByArtist(final String artistName);

  List<TrackDto> getFeaturesTracksByGenre(final String genre, final int offsetIteration);

}
