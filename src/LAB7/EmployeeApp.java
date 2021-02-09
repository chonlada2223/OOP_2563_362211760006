package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {

       //use default constructor
       Employee emp1 = new Employee();
       //assign constructor
        Employee emp2 = new Employee("Chonlada",22,"Student",18000);

        //class displayData
        emp1.displayData();
        emp2.displayData();

        //assign data to emp1
        emp1.setName("Chonlada");
        emp1.setAge(22);
        emp1.setPosition("Student");
        emp1.setSalary(18000);

        emp1.displayData();
        System.out.println("Emp name :"+emp1.getName());


    }//main
}//class
