package api.crud.dto.empdto;

public class EmployeeDepartmentDto 
{
	private int d_id;
	private String d_tech;
	private String d_lang;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_tech() {
		return d_tech;
	}
	public void setD_tech(String d_tech) {
		this.d_tech = d_tech;
	}
	public String getD_lang() {
		return d_lang;
	}
	public void setD_lang(String d_lang) {
		this.d_lang = d_lang;
	}
	@Override
	public String toString() {
		return "EmployeeDepartmentDto [d_id=" + d_id + ", d_tech=" + d_tech + ", d_lang=" + d_lang + "]";
	}
	
	
}