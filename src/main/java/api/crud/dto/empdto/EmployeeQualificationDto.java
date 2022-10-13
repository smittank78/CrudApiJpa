package api.crud.dto.empdto;

public class EmployeeQualificationDto 
{
	private int q_id;
	private String q_degree;
	
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getDegree() {
		return q_degree;
	}
	public void setDegree(String q_degree) {
		this.q_degree = q_degree;
	}
	@Override
	public String toString() {
		return "EmployeeQualificationDto [q_id=" + q_id + ", q_degree=" + q_degree + "]";
	}
	
}