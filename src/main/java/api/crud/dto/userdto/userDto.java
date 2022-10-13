package api.crud.dto.userdto;

public class userDto 
{
	private int id;
	private String name;
	private int phone;
	private String city;
	private boolean active;
	private int u_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	@Override
	public String toString() {
		return "userDto [id=" + id + ", name=" + name + ", phone=" + phone + ", city=" + city + ", active=" + active
				+ ", u_id=" + u_id + "]";
	}
	
}