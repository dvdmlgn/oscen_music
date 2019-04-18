package com.oscen.service;

import com.oscen.dto.TrackDto;

import java.util.List;

public interface TrackSearchService {

    List<TrackDto> getFeaturedTracks(final int offsetIteration);

    List<TrackDto> getTracksByName(final String Name);

    TrackDto getTrackById(final long id);

    List<TrackDto> getTracksById(final List<Long> ids);

    List<TrackDto> getTracksByArtistName(final String artistName);

    List<TrackDto> getTracksByArtistId(final long artistId);

    List<TrackDto> getTracksByAlbumName(final String albumName);

    List<TrackDto> getTracksByAlbumId(final long albumId);

    List<TrackDto> getFeaturedTracksByGenre(final String genre, final int offsetIteration);
}
