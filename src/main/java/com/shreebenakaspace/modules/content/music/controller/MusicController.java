package com.shreebenakaspace.modules.content.music.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/music")
@Tag(name = "Music APIs", description = "Operations related to music content")
public class MusicController {

   @Operation(summary = "Get all songs")
    @GetMapping("/songs")
    public List<String> getSongs() {
        return List.of("Song 1", "Song 2", "Song 3");
    }

}
