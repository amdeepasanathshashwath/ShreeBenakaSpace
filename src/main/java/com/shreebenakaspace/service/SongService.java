package com.shreebenakaspace.service;

import com.shreebenakaspace.exception.SongNotFoundException;
import com.shreebenakaspace.model.Song;
import com.shreebenakaspace.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class SongService {

    private SongRepository repository = new SongRepository();
    @Autowired
    private SongRepository songRepository;

    public void addSong(Song song){
        repository.addSong(song);
    }
    public List<Song> getAllSongs() {
        return repository.getAllSong();
    }

    // 🔍 Search by title (Java 8 Stream)
    public List<Song> searchByTitle(String title){
        return repository.getAllSong()
                .stream()
                .filter(song -> song.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }


/*    // 🎤 Search by singer (java 8)
    public List<Song> searchBySinger(String singer){
        return repository.getAllSong().stream().
                filter(song -> song.getSinger().equalsIgnoreCase(singer)).
                collect(Collectors.toList());
    }*/
    // 🎤 Search by singer (<java 8)
    public List<Song> searchBySinger(String singer){
        return songRepository.getAllSong();
    }


    // 🎼 Filter by category(java 8)
    public List<Song> searchByCategory(String category){
        return repository.getAllSong()
                .stream()
                .filter(song -> song.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());

    }

    public Song getSongById(int id) {
        return repository.getAllSong()
                .stream()
                .filter(song -> song.getId() == id)
                .findFirst()
                .orElseThrow(() -> new SongNotFoundException("Song not found with id: " + id));
    }

    // 🔄 UPDATE
    public Song updateSong(int id, Song updatedSong) {
        Song existing = getSongById(id);

        existing.setTitle(updatedSong.getTitle());
        existing.setSinger(updatedSong.getSinger());
        existing.setCategory(updatedSong.getCategory());

        return existing;
    }

    // ❌ DELETE
    public void deleteSong(int id) {
        Song song = getSongById(id);
        repository.getAllSong().remove(song);
    }

}
