package Nov.ex_05112024_OOPs;

public class Lab139_OOPs_Object_Class {
    public static void main(String[] args) {
        StudentsATB s1 = new StudentsATB();
        s1.name = "Pramod"; // A
        s1.eat(10); // B
        System.out.println(s1);



        // ```
        //1. StudentsATB - Class Loading
        //2. s1 - Object Ref.
        //3. new StudentsATB() -> Object creation
        //```

        StudentsATB s2 = new StudentsATB();
        s2.name = "Amit";
        s2.eat(20); // B
        System.out.println(s2);





        Person p1;
        // Person - Class Loaders - Load the class
        // p1 -> ref - null
        // Byte, Bits -> 8, 64



    }
}


