package Nov.ex_06112024_OOPs_Constructors;

public class Car {

    String model;
    int year;
    String name;


    // Default Constructor - No Arg.
    Car(){
        name = "Unknown Name";
        model = "XYZ";
        year = 0;
        System.out.println("DC is executed!");
    }

}
