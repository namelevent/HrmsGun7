package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.DataResult;
import kodlamaio.northwind.core.utilities.Result;
import kodlamaio.northwind.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {
	
	DataResult<List<SystemPersonnel>> getAll();
	Result add(SystemPersonnel systemPersonnel);

}
