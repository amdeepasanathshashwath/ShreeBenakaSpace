package com.shreebenakaspace.controller;

import com.shreebenakaspace.model.Song;
import com.shreebenakaspace.model.Song;
import com.shreebenakaspace.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {
  /*  Method	Endpoint
    GET	/songs
    POST	/songs
    GET	/songs/{id}
    PUT	/songs/{id}
    DELETE	/songs/{id}
    GET /songs
POST /songs
GET /songs/{id}
    */
    @Autowired
    private SongService service;

   //Get All Songs
    @GetMapping
    public List<Song> getAllSongs(){
        return service.getAllSongs();
    }
    //Post add Songs
  //  @PatchMapping

    @PostMapping
     public String addSong(@RequestBody Song song){
        service.addSong(song);
        return "Succefully Song added";
    }

    // 🔍 GET by ID
    @GetMapping("/{id}")
    public Song getSongById(@PathVariable int id) {
        return service.getSongById(id);
    }

    // Get search by singer
    @GetMapping("/search")
    public List<Song> getSongBySinger(@RequestBody String  singer){
        return service.searchBySinger(singer);
    }

    // 🔄 UPDATE
    @PutMapping("/{id}")
    public Song updateSong(@PathVariable int id, @RequestBody Song song) {
        return service.updateSong(id,song);
    }

    // ❌ DELETE
    @DeleteMapping("/{id}")
    public String deleteSong(@PathVariable int id) {
        service.deleteSong(id);
        return "Song deleted successfully";
    }


}
