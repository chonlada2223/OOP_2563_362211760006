package LAB5;
import java.util.Scanner;

public class Exercise_LAB5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        finDValue (num);


    }

    private static void finDValue(int num) {
        int count =0;
        for (int i = num; i >=0 ; i--) {
            if (i%3==0 && i%5==0){
                System.out.print(i+" ");
                count++;
            }
            if (count == 3){
                break;
            }

        }
    }
}