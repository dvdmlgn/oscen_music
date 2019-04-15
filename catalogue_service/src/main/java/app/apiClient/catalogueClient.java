package app.apiClient;

import java.util.List;

import app.models.Song;

public interface catalogueClient {

  List<Song> getSongs(int offset);
  List<Song> getSongsByArtist(String artistName);
  List<Song> getSongsbyAlbum(String albumName);

}
