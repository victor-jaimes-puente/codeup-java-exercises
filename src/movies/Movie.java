package movies;

public class Movie {
    private String name;
    private String catagory;

    public  Movie(String name, String Catagory){
        setName(name);
        setCatagory(catagory);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){ this.name = name;}

    public String getCatagory(){
        return this.catagory;
    }
    public void setCatagory(String catagory){
        this.catagory = catagory;
    }
}
