package app.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.models.Song;
import app.models.SongList;

@RestController
@RequestMapping(value = "promotions")
public class PromotionController {

  @GetMapping(value = "get")
  public SongList getPromotions() {
    final List<Song> promotions = Stream.of(new Song.Builder().withId(1).withName("promotion first song").build(),

      new Song.Builder().withId(2).withName("promotion second song").build()).collect(Collectors.toList());

    return new SongList(promotions, "promotions");
  }

}
