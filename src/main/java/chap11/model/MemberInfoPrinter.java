package chap11.model;

import org.springframework.beans.factory.annotation.Autowired;

import chap11.exception.MemberNotFoundException;

public class MemberInfoPrinter {
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberPrinter printer;
	
	/*
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}*/
	
	public MemberInfoPrinter() {
		
	}
	/*
	public void setMemberPrinter(MemberPrinter printer) {
		this.printer = printer;
	}*/
	
	public void printMemberInfo(String email) {
		Member member = memberDao.selectByEmail(email);
		
		if(member == null)
			throw new MemberNotFoundException();
		printer.print(member);
		System.out.println();
	}
}
