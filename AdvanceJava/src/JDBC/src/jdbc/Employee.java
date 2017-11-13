
package jdbc;


public class Employee {
    private int employeeID;
    private String firstName;

    public Employee() {
    }

    public Employee(int employeeID, String firstName) {
        this.employeeID = employeeID;
        this.firstName = firstName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
}
