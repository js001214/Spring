package com.spring.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.spring.common.JDBCUtil;

@Repository("userDAO")	//DAO 에 객체를 자동으로 Spring Framework에 생성 :Bean(객체) 생성
public class UserDAO {	//class UserDAO를 userDAO로 객체화

	//JDCB 관련 변수 선언 (Connection, PreparedStatement(Statement), ResultSet)
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// SQL 쿼리를 담은 상수를 선언 : (insert, update, delete, getUserList : 생략)
	private final String USER_GET = "select * from users where id = ? and password = ?";
	
	// 회원 정보를 가지고 오는 메소드 : getUser(dto);
	
	public UserDTO getUser(UserDTO dto) {
		//객체 선언 : DB에서 select한 레코드를 user에 담아서 리턴
		UserDTO user = new UserDTO();
		
		// System.out.println("DAO - " + dto.getId());
		// System.out.println("DAO - " + dto.getPassword());
		
		try {
			System.out.println("==> JDBC로 getUser()시작");
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			
			//pstmt에 할당된 쿼리에 ? , ? 에 변수값을 할당후 실행 : dto에 변수값으로 할당.
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			
			rs = pstmt.executeQuery();	//select문이므로 executeQuery()를 실행후 rs로 리턴
			
			//rs에 담긴 값을 가져와서 DTO (user)에 저장후 리턴 돌려줌
			
			if (rs.next()){ //레코드의 값이 존재할때 커서를 해당 레코드로 이동
				
				System.out.println("DB에서 값이 잘 select 되었습니다. ");
				
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
				
				System.out.println("JDBC로 DB를 잘 쿼리해서 DTO로 잘 전송");
			}
		
		}catch (Exception e) {
			e.printStackTrace();//개발이 완료된 후 주석 처리
			System.out.println("JDBC로 쿼리 생행중 오류 발생");
		}finally {
			// 모두 사용한 개체를 제거 : conn, pstmt, rs
			JDBCUtil.close(rs, pstmt, conn);
			
		}
		
		
		
		return user;
	}

}
