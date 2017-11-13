
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DataRetrieveService {
    
    static Connection conn = DbConnection.getConnection("xe", "hr", "hr");
    
    public static List<Employee> getEmployee() {
        List<Employee> list = new ArrayList();
    try{
    Employee employee;
        PreparedStatement stmt = conn.prepareStatement("select * from employees");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            employee = new Employee();
            employee.setEmployeeID(rs.getInt(1));
            employee.setFirstName(rs.getString(2));
            
            list.add(employee);
        }
    }catch (Exception e){
    e.printStackTrace();
    }
    
    return list;
    }
}
