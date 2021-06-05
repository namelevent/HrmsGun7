package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employer")
public class Employer{
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	private String company_name;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "phone_number")
	private long phone_number;

}
