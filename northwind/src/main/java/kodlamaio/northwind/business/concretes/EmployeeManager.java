package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.EmployeeService;
import kodlamaio.northwind.core.utilities.DataResult;
import kodlamaio.northwind.core.utilities.Result;
import kodlamaio.northwind.core.utilities.SuccessDataResult;
import kodlamaio.northwind.core.utilities.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.EmployeeDao;
import kodlamaio.northwind.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"İş Arayanlar Listelendi");
	}

	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("İş Arayan Eklendi");
	}

}
