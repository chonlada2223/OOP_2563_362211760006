package LAB4;

public class ex_method {
    public static void B(int num) {
        System.out.println("Hello B"+num);

    }


    public static void main(String[] args) {
        System.out.println("Hello Main");
        A();
        B(10);
        int result = C(5,5);
        System.out.println(result);


    }//main





    public static void A(){
        System.out.println("Hello A");
    }//A

    public static int C(int x,int y){
        System.out.println("Hello C");
        return x+y;
    }

}
