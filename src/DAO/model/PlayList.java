package DAO.model;

public class PlayList {
    private int id;
    private String title;
    private int countSoundTracks;
    private int creatorID;
    private boolean isPrivate;

    public PlayList(int id, String title, int creatorID, boolean isPrivate, int countSoundTracks) {
        this.id = id;
        this.title = title;
        this.creatorID = creatorID;
        this.isPrivate = isPrivate;
        this.countSoundTracks = countSoundTracks;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    public void setCountSoundTracks(int countSoundTracks){
        this.countSoundTracks = countSoundTracks;
    }
    public int getCountSoundTracks(){
        return this.countSoundTracks;
    }

    public void setCreatorID(int creatorID){
        this.creatorID = creatorID;
    }
    public int getCreatorID(){
        return this.creatorID;
    }

    public void setPrivate(boolean isPrivate){
        this.isPrivate = isPrivate;
    }
    public boolean getPrivate(){
        return this.isPrivate;
    }
}
