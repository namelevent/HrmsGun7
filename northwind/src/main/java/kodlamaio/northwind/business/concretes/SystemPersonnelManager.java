package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.SystemPersonnelService;
import kodlamaio.northwind.core.utilities.DataResult;
import kodlamaio.northwind.core.utilities.Result;
import kodlamaio.northwind.core.utilities.SuccessDataResult;
import kodlamaio.northwind.core.utilities.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.SystemPersonnelDao;
import kodlamaio.northwind.entities.concretes.SystemPersonnel;

@Service
public class SystemPersonnelManager implements SystemPersonnelService {
	
	private SystemPersonnelDao systemPersonnelDao;
	
	public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
		this.systemPersonnelDao = systemPersonnelDao;
	}

	@Override
	public DataResult<List<SystemPersonnel>> getAll() {
		return new SuccessDataResult<List<SystemPersonnel>>(this.systemPersonnelDao.findAll(),"Sistem Personeli Listelendi");
	}

	@Override
	public Result add(SystemPersonnel systemPersonnel) {
		this.systemPersonnelDao.save(systemPersonnel);
		return new SuccessResult("Sistem Personeli Eklendi");
	}

}
