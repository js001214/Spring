package com.spring.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ("userService")	//Spring Framework에 Bean 등록 : userService
public class UserServiceImpl implements UserService {
//@Service로 UserServiceImpl을 userService로 객체화 시킨다.
	// 비즈니스 로직을 처리하는 클래스 
	
	// @Autowried 어노테이션이 Spring Framework에 생성 Bean
	@Autowired	// 의 타입을 찾아서 주입 (DI)
	UserDAO userDAO;
	
	@Override
	public UserDTO getUser(UserDTO dto) {
		
		System.out.println(dto.getId());
		System.out.println(dto.getPassword());
		
		// UserDTO user = userDAO.getUser(dto);
		return userDAO.getUser(dto);
	}

}
