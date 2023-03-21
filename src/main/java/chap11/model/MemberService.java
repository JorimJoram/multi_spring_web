package chap11.model;

import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	private MemberDaoSpring memberDao;
	
	public MemberService(MemberDaoSpring memberDao) {
		this.memberDao = memberDao;
	}
	
	public boolean checkLoginAuth(LoginCommand command) {
		boolean result = false;
		
		Member member = memberDao.selectByEmail(command.getEmail());
		if(member != null && member.checkPassword(command.getPassword())) {
			result = true;
		}
		
		return result;
	}
	
	public Member searchMember(String email) {
		return memberDao.selectByEmail(email);
	}
	
	public Collection<Member> getAllMember(){
		return memberDao.selectAll();
	}
}
