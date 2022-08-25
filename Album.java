package com.hellowworld;

public class Album {
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public int getId() {
        return id;
    }

    private int artistId;

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public int getArtistId() {
        return artistId;
    }
}
