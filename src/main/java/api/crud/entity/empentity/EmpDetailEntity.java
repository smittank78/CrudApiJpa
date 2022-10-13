package api.crud.entity.empentity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "f_emp_detail")
public class EmpDetailEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int d_id;
	private int q_id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id",referencedColumnName = "e_id")
	private EmpEntity empEntity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public EmpEntity getEmpEntity() {
		return empEntity;
	}

	public void setEmpEntity(EmpEntity empEntity) {
		this.empEntity = empEntity;
	}

	@Override
	public String toString() {
		return "EmpDetailEntity [id=" + id + ", d_id=" + d_id + ", q_id=" + q_id + ", empEntity=" + empEntity + "]";
	}
		
}