package com.oscen.controller;

import com.oscen.dto.TrackDto;
import com.oscen.service.TrackSearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("track")
public class TrackSearchController {

    private TrackSearchService service;

    @Inject
    public TrackSearchController(TrackSearchService service) {
        this.service = service;
    }

    @GetMapping
    public String testRoute() {
        return "hello there from the track route";
    }

    @GetMapping("featured")
    public List<TrackDto> getFeaturedTracks(@RequestParam final int offsetIteration) {
        return this.service.getFeaturedTracks(offsetIteration);
    }

    @GetMapping("byname")
    public List<TrackDto> getTracksByName(@RequestParam final String name) {
        return this.service.getTracksByName(name);
    }

    @GetMapping("byid")
    public TrackDto getTrackById(@RequestParam final long id) {
        return this.service.getTrackById(id);
    }

    @GetMapping("byids")
    public List<TrackDto> getTracksByIds(@RequestParam List<Long> ids) {
        return this.service.getTracksById(ids);
    }

    @GetMapping("byartistname")
    public List<TrackDto> getTracksByArtistName(@RequestParam final String artistName) {
        return this.service.getTracksByArtistName(artistName);
    }

    @GetMapping("byartistid")
    public List<TrackDto> getTracksByArtistId(@RequestParam final long artistId) {
        return this.service.getTracksByArtistId(artistId);
    }

    @GetMapping("byalbumname")
    public List<TrackDto> getTracksByAlbumName(@RequestParam final String albumName) {
        return this.service.getTracksByAlbumName(albumName);
    }

    @GetMapping("byalbumid")
    public List<TrackDto> getTracksByAlbumId(@RequestParam final long albumId) {
        return this.service.getTracksByAlbumId(albumId);
    }



}
