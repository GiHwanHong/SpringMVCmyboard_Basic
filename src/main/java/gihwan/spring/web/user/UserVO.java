package gihwan.spring.web.user;

public class UserVO {
	private String id;
	private String passwrod;
	private String name;
	private String role;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswrod() {
		return passwrod;
	}

	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", passwrod=" + passwrod + ", name=" + name + ", role=" + role + "]";
	}

}
