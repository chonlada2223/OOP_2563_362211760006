package LAB7;

import java.util.ArrayList;
import java.util.Scanner;

//รับค่าข้อมูลของวัตถุ Car ทั้งหมด 3 จำนวนจากผู้ใช้พร้อมทั้งแสดงข้อมูลทั้งหมดทางหน้าจอภาพ
public class CarApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("How many car do you have?: ");
        int num = sc.nextInt();


        ArrayList<Car> myCar = new ArrayList<Car>();

        for (int i = 0; i <num ; i++) {
            //input data to object
            System.out.println("Please,enter car info "+(i+1)+":");
            Car c = inputDataObject();
            myCar.add(c);

        }
        //display data in ArrayList
        displayDataObject(myCar);




    }//main

    private static void displayDataObject(ArrayList<Car> myCar) {
        System.out.println("All Objects in ArrayList: ");
        for (Car c:myCar) {
            System.out.println(c.toString());
        }
    }

    private static Car inputDataObject() {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();
        System.out.println("Enter car id: ");
        String id =sc.nextLine();
        c.setId(id);


        System.out.println("Enter car color: ");
        c.setColor(sc.nextLine());

        System.out.println("Enter car brand: ");
        c.setBrand(sc.nextLine());

        return c;
    }


}//class
