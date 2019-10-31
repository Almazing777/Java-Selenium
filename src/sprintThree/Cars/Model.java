package sprintThree.Cars;

//Create methods
//Set country - should set a country for car object
//Set model - should set a model for car object
//Set maker - - should set a maker for car object
//Get country - Should return country of car
//Get model - Should return model of car
//Get maker - - Should return maker of car

class Model extends Car{

    private String country;
    private String maker;
    private String model;

    //getter methods
    public void getCountry(){
        System.out.println(country);
    }

    public void getModel(){
        System.out.println(model);
    }

    public void getMaker(){
        System.out.println(maker);
    }

    public void getAll(){
        System.out.println(country + " " + maker + " " + model);
    }

    //setter methods
    public void setCountry(String c){
        country = c;
    }

    public void setModel(String m){
        model = m;
    }

    public void setMaker(String mk){
        maker = mk;
    }

}
