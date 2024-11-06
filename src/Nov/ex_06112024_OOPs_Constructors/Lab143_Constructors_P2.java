package Nov.ex_06112024_OOPs_Constructors;

import java.util.Scanner;

public class Lab143_Constructors_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car2 t1 = new Car2("tesla", 2015);
        System.out.println(t1.model);
        System.out.println(t1.year);

        t1.display();


        Car2 t2 = new Car2("nano", 2013);
        System.out.println(t2.model);
        System.out.println(t2.year);
        // t2.model

        t2.display();

        System.out.println("Enter the model name");
        String model_name_input = sc.next();
        System.out.println("Enter the year ");
        int year_input = sc.nextInt();

        Car2 t3 = new Car2(model_name_input, year_input);

        System.out.println(t3.year);
        System.out.println(t3.model);

        t3.display();


    }
}

class Car2 {
    String model;
    int year;



    // Parameterized constructor
    Car2(String model_name, int year_created) {
        System.out.println("PC");
        this.model = model_name;
        this.year = year_created;
    }

    void display() {
        System.out.println("Car2 Details -> " + this.model + " - "+ this.year);
    }


}