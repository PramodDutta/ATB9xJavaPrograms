package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab155_Super {
    public static void main(String[] args) {
            Car c = new Car();

    }


}

class Car extends Vehicle{
    private int maxSpeed = 281;

    @Override
    void display() {
        System.out.println("Child");
    }

    Car(){
        super(10);
        System.out.println("DC Car");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
        this.display();
        super.display();
    }

}



class Vehicle{
    public int maxSpeed = 180;

    void display(){
        System.out.println("Parent");
    }


    Vehicle(){
        System.out.println("DC Vehicle");
    }

    Vehicle(int a){
        System.out.println("PC Vehicle");
    }

    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int a) {
        System.out.println("Hello Vehicle");
    }


}