package com.example.user.kids_edu.model;

public class MathDigitListView {
    public MathDigitListView(int audioId, int imageId) {
        this.audioId = audioId;
        this.imageId = imageId;
    }

    private int audioId;
    private int imageId;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getAudioId() {
        return audioId;
    }

    public void setAudioId(int audioId) {
        this.audioId = audioId;
    }
}
