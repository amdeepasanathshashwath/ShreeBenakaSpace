package com.shreebenakaspace.repository;

import com.shreebenakaspace.model.Song;
import org.w3c.dom.stylesheets.LinkStyle;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


/*⚙️ Step 4: Repository Layer (In-Memory Storage)
We simulate DB using a list.*/

public class SongRepository {
    private List<Song>  songList = new ArrayList<Song>();

    public void addSong(Song song){
        songList.add(song);
    }

    public List<Song> getAllSong(){
        return songList;
    }
}
