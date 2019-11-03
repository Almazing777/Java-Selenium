package sprintThree.Cars;

public class Car {
    private String country;
    private String maker;
    private String model;

    //getter methods
    public String getCountry() {
        return country;
    }

    public String getModel(){
        return model;
    }

    public String getMaker(){
        return maker;
    }

    //setter methods
    public void setCountry(String c){
        this.country = c;
    }

    public void setModel(String m){
        this.model = m;
    }

    public void setMaker(String mk){
        this.maker = mk;
    }
}

