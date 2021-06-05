package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.DataResult;
import kodlamaio.northwind.core.utilities.Result;
import kodlamaio.northwind.entities.concretes.Employer;

public interface EmployerService {
	
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);

}
