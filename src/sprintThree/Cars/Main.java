package sprintThree.Cars;

//Part 2
//Create 3 cars objects
//set parameters to them and print country, model and maker

class CarExample extends Car{
    public static void main(String[] args){
        Car one = new Car();
        one.setCountry("USA");
        one.setMaker("Ford");
        one.setModel("Mustang");
        System.out.println("Ford: " + one.getCountry() + " " + one.getModel() + " " + one.getMaker());

        Car two = new Car();
        two.setCountry("Germany");
        two.setMaker("BMW");
        two.setModel("325xi");
        System.out.println("BMW: " + two.getCountry() + " " + two.getModel() + " " + two.getMaker());

        Car three = new Car();
        three.setCountry("UK");
        three.setMaker("Jaguar");
        three.setModel("F-PACE");
        System.out.println("Jaguar: " + three.getCountry() + " " + three.getModel() + " " + three.getMaker());
    }
}
