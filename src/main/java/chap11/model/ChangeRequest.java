package chap11.model;

public class ChangeRequest {
	private String email;
	private String oldPassword;
	private String newPassword;
	
	public ChangeRequest() {
		
	}

	public String getEmail() {
		return email;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
