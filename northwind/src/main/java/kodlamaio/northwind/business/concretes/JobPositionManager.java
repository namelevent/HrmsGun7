package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobPositionService;
import kodlamaio.northwind.core.utilities.DataResult;
import kodlamaio.northwind.core.utilities.Result;
import kodlamaio.northwind.core.utilities.SuccessDataResult;
import kodlamaio.northwind.core.utilities.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.JobPositionDao;
import kodlamaio.northwind.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
    
	public JobPositionManager(JobPositionDao jobPositionDao) {
		
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"İş Poazisyonları Listelendi");
	}


	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş Pozisyonu Eklendi");
	}
	
	

}
