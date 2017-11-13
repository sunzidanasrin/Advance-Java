
package com.urmi.dao;

import com.urmi.Domain.Student;
import java.util.List;


public interface StudentDao {
   public void save(Student s);
   
   public void update(Student s);
   
   public void delete(int id);
   
   public List<Student > getStudents();
   
   public Student getStudent (int id);
}
