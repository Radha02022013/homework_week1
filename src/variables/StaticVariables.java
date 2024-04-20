package variables;

public class StaticVariables {
    /**
     * static variable - class
     * scope - within the class
     * Memory allocation-when class is loaded
     * store - no heap memory
     */

    static int a = 10;
  static String name = "Prime Testing";

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(StaticVariables.a);
        System.out.println(StaticVariables.name);
        System.out.println(name);

    }

    public void m1(){
        System.out.println(a);
        System.out.println(StaticVariables.a);

    }

    }




