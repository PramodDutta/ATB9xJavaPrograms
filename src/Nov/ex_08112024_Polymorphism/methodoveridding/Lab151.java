package Nov.ex_08112024_Polymorphism.methodoveridding;

public class Lab151 {
    public static void main(String[] args) {
        Pramod p = new Pramod();
        p.home();

        Father f  = new Father();
        f.home();

        // Dynamic Dispatch.
        Father f1 = new Pramod();
        f1.home();

        // WebDriver driver = new ChromeDriver();

//        Pramod p1  = new Father();
//        p1.home();



    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
    void f2(){

    }
}

class Pramod extends Father{

    @Override
    void home(){
        System.out.println("3BHK");
    }

    void f1(){

    }

}