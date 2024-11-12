package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab160_Interface_P1 {
}


abstract class ABC{
    ABC(){

    }

    abstract void m1();

    void m2(){
        System.out.println("Complete Method!");
    }
}

interface I{
    void m1();
    void m2();

//    void m3(){
//
//    }

    default void m4(){
        System.out.println("Default method");
    }

    default void m5(){
        System.out.println("Default method in Interface!");
    }

    static void m6(){
        System.out.println("Static method in Interface!");
    }




}