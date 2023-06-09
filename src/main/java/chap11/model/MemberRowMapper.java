package chap11.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper<Member>{

	@Override
	public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
		Member member = new Member(rs.getString("email"),
				rs.getString("password"), rs.getString("name"),
				rs.getTimestamp("regdate").toLocalDateTime());
		member.setId(rs.getLong("id"));
		return member; //test
	}
	
}
