package api.crud.dto.empdto;

public class EmployeeDetailDto 
{
	private int emp_id;
	private int d_id;
	private int q_id;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
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
	@Override
	public String toString() {
		return "EmployeeDetalDto [emp_id=" + emp_id + ", d_id=" + d_id + ", q_id=" + q_id + "]";
	}
	
}