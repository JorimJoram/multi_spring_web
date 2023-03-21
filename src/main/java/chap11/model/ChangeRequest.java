package chap11.model;

public class ChangeRequest {
	private String email;
	private String password;
	private String newPassword;
	private String confirmPassword;
	
	@Override
	public String toString() {
		return String.format(this.email +"\t" +this.password + "\t" +this.newPassword + "\t" +this.confirmPassword);
	}

	public ChangeRequest() {
		
	}

	public String getEmail() {
		return email;
	}


	public String getNewPassword() {
		return newPassword;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
