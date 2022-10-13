package api.crud.dto.empdto;

public class EmployeeDto 
{
	private int id;
	private String e_name;
	private int e_phone;
	private String e_city;
	private boolean e_active;
	private int e_id; 
	private static int counter = 0;
	private EmployeeDetailDto detailDto;	
	
	
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		counter++;
		this.e_id = counter;
		detailDto.setEmp_id(this.e_id);
	}
	public EmployeeDetailDto getDetailDto() {
		return detailDto;
	}
	public void setDetailDto(EmployeeDetailDto detailDto) {
		this.detailDto = detailDto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_phone() {
		return e_phone;
	}
	public void setE_phone(int e_phone) {
		this.e_phone = e_phone;
	}
	public String getE_city() {
		return e_city;
	}
	public void setE_city(String e_city) {
		this.e_city = e_city;
	}
	public boolean isE_active() {
		return e_active;
	}
	public void setE_active(boolean e_active) {
		this.e_active = e_active;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", e_name=" + e_name + ", e_phone=" + e_phone + ", e_city=" + e_city
				+ ", e_active=" + e_active + ", e_id=" + e_id + ", " + detailDto.toString() + "]";
	}
	
}