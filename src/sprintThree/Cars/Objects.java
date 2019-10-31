package sprintThree.Cars;

//Part 2
//Create 3 cars objects
//set parameters to them and print country, model and maker

class CarExample extends Car{
    public static void main(String[] args){
        Model one = new Model();
        one.setCountry("USA");
        one.setMaker("Ford");
        one.setModel("Mustang");
        one.getAll();

        Model two = new Model();
        two.setCountry("Germany");
        two.setMaker("BMW");
        two.setModel("325xi");
        two.getAll();

        Model three = new Model();
        three.setCountry("UK");
        three.setMaker("Jaguar");
        three.setModel("F-PACE");
        three.getAll();
    }
}
