package kodlamaio.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.SystemPersonnelService;
import kodlamaio.northwind.core.utilities.DataResult;
import kodlamaio.northwind.core.utilities.Result;
import kodlamaio.northwind.entities.concretes.SystemPersonnel;

@RestController
@RequestMapping("/api/systemPersonnel")
public class SytemPersonnelController {
	
	private SystemPersonnelService systemPersonnelService;
	
	@Autowired
	public SytemPersonnelController(SystemPersonnelService systemPersonnelService) {
		this.systemPersonnelService = systemPersonnelService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<SystemPersonnel>> getAll() {
		return this.systemPersonnelService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SystemPersonnel systemPersonnel) {
		return this.systemPersonnelService.add(systemPersonnel);
	}
	

}
