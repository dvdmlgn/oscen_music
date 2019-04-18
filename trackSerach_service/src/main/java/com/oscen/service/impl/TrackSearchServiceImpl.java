package com.oscen.service.impl;

import com.oscen.client.TrackSourceClient;
import com.oscen.dto.TrackDto;
import com.oscen.service.TrackSearchService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class TrackSearchServiceImpl implements TrackSearchService {

    private TrackSourceClient client;

    @Inject
    public TrackSearchServiceImpl(TrackSourceClient client) {
        this.client = client;
    }

    @Override
    public List<TrackDto> getFeaturedTracks(final int offsetIteration) {
        return this.client.getFeaturedTracks(offsetIteration);
    }

    @Override
    public List<TrackDto> getTracksByName(final String name) {
        return this.client.getTracksByName(name);
    }

    @Override
    public TrackDto getTrackById(final long id) {
        return this.client.getTrackById(id);
    }

    @Override
    public List<TrackDto> getTracksById(final List<Long> ids) {
        return this.client.getTracksById(ids);
    }

    @Override
    public List<TrackDto> getTracksByArtistName(final String artistName) {
        return this.client.getTracksByArtistName(artistName);
    }

    @Override
    public List<TrackDto> getTracksByArtistId(final long artistId) {
        return this.client.getTracksByArtistId(artistId);
    }

    @Override
    public List<TrackDto> getTracksByAlbumName(final String albumName) {
        return this.client.getTracksByAlbumName(albumName);
    }

    @Override
    public List<TrackDto> getTracksByAlbumId(final long albumId) {
        return this.client.getTracksByAlbumId(albumId);
    }

    @Override
    public List<TrackDto> getFeaturedTracksByGenre(final String genre, final int offsetIteration) {
        return this.client.getFeaturedTracksByGenre(genre, offsetIteration);
    }
}
