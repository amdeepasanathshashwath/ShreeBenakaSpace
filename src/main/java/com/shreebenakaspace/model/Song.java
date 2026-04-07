package com.shreebenakaspace.model;

import jakarta.persistence.*;

@Entity
@Table(name="songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title;

    private String singer;

    private String category;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public String getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setCategory(String category) {
        this.category = category;
    }
//Why this toString is required what it does in backround
/*    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                ", category='" + category + '\'' +
                '}';
    }*/
}


