package com.oscen.client;

import com.oscen.dto.TrackDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackSourceClient {

    public List<TrackDto> getFeaturedTracks(final int offsetIteration) {
        return null;
    }

    public List<TrackDto> getTracksByName(final String Name) {
        return null;
    }

    public TrackDto getTrackById(final long id) {
        return null;
    }

    public List<TrackDto> getTracksById(final List<Long> ids) {
        return null;
    }

    public List<TrackDto> getTracksByArtistName(final String artistName) {
        return null;
    }

    public List<TrackDto> getTracksByArtistId(final long artistId) {
        return null;
    }

    public List<TrackDto> getTracksByAlbumName(final String albumName)  {
        return null;
    }

    public List<TrackDto> getTracksByAlbumId(final long albumId)  {
        return null;
    }

    public List<TrackDto> getFeaturedTracksByGenre(final String genre, final int offsetIteration) {
        return null;
    }
}
