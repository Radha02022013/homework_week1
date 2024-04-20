package methodtypes;

public class NoReturnNoParameters {


    public static void main(String[] args) {
        addition();
        NoReturnNoParameters obj = new NoReturnNoParameters();
        obj.subtraction();
    }


    //No return type No params
    public static void addition() {
        int a = 5;
        int b = 10;
        int ans = a + b;
//concatenation
        System.out.println("Addition of two numbers " + a + " and " + b + " is " + ans);
        //Addition of two numbers 5 and 10 is 15

    }
    //No return type No params
    public void subtraction(){
        int a = 5;
        int b = 2;
        int ans = a-b;
        System.out.println("subtraction of two numbers "+a+ " and " +b+ " is "+ans);

    }
}
