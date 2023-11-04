public class SoundTrack {
    private String soundTrackName;
    private String artist;
    private int uploaderID;
    private int soundTrackID;

    public int getSoundTrackID() {
        return soundTrackID;
    }

    public int getUploaderID() {
        return uploaderID;
    }

    public String getSoundTrackName(){
        return soundTrackName;
    }
    public void setSoundTrackName(String name){
        soundTrackName = name;
    }

    public String getArtist(){
        return artist;
    }
    public void setArtist(String name){
        artist = name;
    }
}
