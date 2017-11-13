
package jdbc;

import java.util.List;


public class App {
    public static void main(String[] args) {
       List<Employee> list= DataRetrieveService.getEmployee();
        for (Employee employee : list) {
            System.out.println("employeeID : "+ employee.getEmployeeID()+" firstName : " + employee.getFirstName());
        }
    }
 
}
