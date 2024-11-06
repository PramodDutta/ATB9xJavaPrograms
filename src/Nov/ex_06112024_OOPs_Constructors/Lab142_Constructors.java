package Nov.ex_06112024_OOPs_Constructors;

public class Lab142_Constructors {
    public static void main(String[] args) {
        Car tesla = new Car();
        System.out.println(tesla.year);
        System.out.println(tesla.name);
        System.out.println(tesla.model);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);


    }
}
