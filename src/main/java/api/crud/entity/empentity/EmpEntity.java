package api.crud.entity.empentity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "f_emp")
public class EmpEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int e_id; 
	private String name;
	private int phone;
	private String city;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "empEntity",targetEntity = EmpDetailEntity.class)
	private List<EmpDetailEntity>  detailEntity = new ArrayList<EmpDetailEntity>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<EmpDetailEntity> getDetailEntity() {
		return detailEntity;
	}

	public void setDetailEntity(List<EmpDetailEntity> detailEntity) {
		this.detailEntity = detailEntity;
	}

	@Override
	public String toString() {
		return "EmpEntity [id=" + id + ", e_id=" + e_id + ", name=" + name + ", phone=" + phone + ", city=" + city
				+ ", detailEntity=" + detailEntity + "]";
	}

	
}