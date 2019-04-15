package app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "song")
public class songController {

  @GetMapping(value = "get")
  public String getSongs() {
    return "you want to get some songs";
  }

  @GetMapping(value = "getbyid")
  public String getSongById(@RequestParam(value = "id") final int id ) {
    return String.format("you're looking for a song with an Id of: %d", id);
  }

  @GetMapping(value = "getbyartist")
  public String getByArtist(@RequestParam(value = "artist") final String artist) {
    return String.format("you wanted to find some songs by %s", artist);
  }

}
