package chap11.model;

import chap11.exception.*;

public class ChangePasswordService {
private MemberDao memberDao;
	
	public ChangePasswordService() {
	}
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void changePassword(String email, String oldPassword, String newPassword) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException();
		}
		
		if(oldPassword.equals(newPassword)) {
			throw new WrongIdPasswordException();
		}
		
		member.changePassword(oldPassword, newPassword);
		memberDao.update(member);
	}
	
	public void changePassword(String email, String oldPassword, String newPassword, String confirmPassword) {
		Member member = memberDao.selectByEmail(email);
		
		if(member == null) {
			throw new MemberNotFoundException();
		}
		
		if(oldPassword.equals(newPassword)) {
			throw new WrongIdPasswordException();
		}
		
		if(!newPassword.equals(confirmPassword)) {
			throw new WrongNewPasswordException();
		}
		
		member.changePassword(oldPassword, newPassword);
		memberDao.update(member);
	}
}
