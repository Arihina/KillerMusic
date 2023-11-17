package DAO.model;

public class SoundTrack {
    private int id;
    private String name;
    private String artist;
    private String text;
    private double length;
    private int uploaderID;

    public SoundTrack(int id, String name, String artist, double length, int uploaderID){
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.uploaderID = uploaderID;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }
    public String getArtist(){
        return this.artist;
    }

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }

    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return this.length;
    }

    public void setUploaderID(int uploaderID){
        this.uploaderID = uploaderID;
    }
    public int setUploaderID(){
        return this.uploaderID;
    }
}
