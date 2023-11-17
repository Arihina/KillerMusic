package DAO.model;

public class User {
    private int id;
    private String name;
    private String password;
    private String email;
    private String role;
    private boolean uploader;

    public User(int id, String name, String password, String email, String role, boolean uploader){
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.role = role;
        this.uploader = uploader;
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

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }

    public void setUploader(boolean uploader){
        this.uploader = uploader;
    }
    public boolean getUploader(){
        return this.uploader;
    }
}
