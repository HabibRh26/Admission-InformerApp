package com.example.user.kids_edu.model;

/**
 * Created by User on 3/31/2018.
 */

public class LettersImageGrid {
    private  int imageId;
    private String name;
    private int audioId;

    public LettersImageGrid(int imageId, String name, int audioId) {
        this.imageId = imageId;
        this.name = name;
        this.audioId = audioId;
    }

    public int getImageId() {
        return imageId;
    }

    public int getAudioId(){return audioId;}

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
