package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.DataResult;
import kodlamaio.northwind.core.utilities.Result;
import kodlamaio.northwind.entities.concretes.Employee;

public interface EmployeeService {
	
	DataResult<List<Employee>> getAll();
	Result add(Employee employee);

}
