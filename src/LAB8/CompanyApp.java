package LAB8;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Employee do you have?:");
        int num = sc.nextInt();

        ArrayList <Employee> myEmp = new ArrayList<Employee>();

        for (int i = 0; i < num; i++) {
            //input data to object
            System.out.println("please, Enter Employee info"+(i+1)+":");
            Employee o = inputDataobject();
            myEmp.add(o);

        }

        //display data in ArrayList
        displayObject(myEmp);


    }//main
    private static void displayObject (ArrayList<Employee> myEmp){
        System.out.println("All objects in ArrayList: ");
        for (Employee a:myEmp){
            System.out.println(a.toString());
        }
    }


    private static Employee inputDataobject() {
        Scanner sc = new Scanner(System.in);

        Employee o = new Employee();
        System.out.println("Enter Employee Pid:");
        String id = sc.nextLine();
        o.setPid(id);

        System.out.println("Enter Employee Name:");
        o.setName(sc.nextLine());

        System.out.println("Enter Employee Age");
        o.setAge(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter Employee Gender");
        o.setGender(sc.nextLine());

        System.out.println("Enter Employee Tel:");
        o.setTel(sc.nextLine());

        System.out.println("Enter Employee EmpID:");
        o.setEmpID(sc.nextLine());

        System.out.println("Enter Employee Position:");
        o.setPosition(sc.nextLine());

        System.out.println("Enter Employee Salary:");
        o.setSalary(Double.parseDouble(sc.nextLine()));

        return o;
    }

}//class