package com.employee.dao;

import com.employee.model.Employee;
import java.util.List;

public interface IEmployeeDAO {
  List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3)
      throws Exception;
}
