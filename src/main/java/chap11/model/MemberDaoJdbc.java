package chap11.model;

import java.sql.*;
import java.util.*;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberDaoJdbc extends MemberDao{
	@Autowired
	private DataSource ds;
	
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;
	
	
	
	public MemberDaoJdbc() {
		
	}
	
	@Override
	public Member selectByEmail(String email) {
		Member member = null;
		this.sql = "select * from member where email = ?";
		
		try {
			this.conn = this.ds.getConnection();
			this.pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, email);
			
			this.rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member(rs.getString("email"), rs.getString("password"), rs.getString("name"), rs.getTimestamp("regdate").toLocalDateTime());
				member.setId(rs.getLong("id"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(!conn.isClosed()) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return member;
		//return members.get(email);
	}
	@Override
	public void insert(Member member) {
		this.sql = "insert into member(id, email, password, name) values (member_id_seq.nextval, ?, ?, ?)";
		try {
			this.conn = this.ds.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(!conn.isClosed())
					conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//member.setId(++MemberDao.nextId);
		//members.put(member.getEmail(), member);
	}
	@Override
	public void update(Member member) {
		this.sql = "update member set password = ? where email = ?";
		try {
			this.conn = this.ds.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, member.getPassword());
			pstmt.setString(2, member.getEmail());
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(!conn.isClosed())
					conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		//members.put(member.getEmail(), member);
	}
	@Override
	public Collection<Member> selectAll(){
		ArrayList<Member> memberList = new ArrayList<Member>();
		Member member = null;
		this.sql = "select * from member";
		
		try {
			this.conn = this.ds.getConnection();
			this.stmt = this.conn.createStatement();
			this.rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				member = new Member(rs.getString("email"), rs.getString("password"), rs.getString("name"), rs.getTimestamp("regdate").toLocalDateTime());
				member.setId(rs.getLong("id"));
				memberList.add(member);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{
				if(!conn.isClosed()) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return memberList;
		//return members.values();
	}
	
	
} 
