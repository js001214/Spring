package polimorphism05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		//객체 생성을 Spring Framework에서 생성후 DI를 통해서 객체를 주입
			// 1. XML 파일에서 객체를 생성 주입 :
				//src/main/resource : 주로 설정에 관련된 내용을 저장 하는 곳 (mybatis 매퍼설정, bean 의 xml, db Connection)
					//applicationContext.xml	: Bean을 셋팅하는 파일, Spring Framework에서 생성
		
		// 2. @ (어노테이션)을 사용해서 객체를 생성후 DI (객체를 주입)	<=== Spring Boot 사용하는 방식
			
			//a. @ (어노테이션)을 사용할 수 있도록 설정이 필요함.
				//applicationContext.xml : Bean 구성 파일 , 어노테이션을 사용할 수 있도록 설정 필요.
					//<context:component-scan base-package="polimorphism05"></context:component-scan>
					//<context:component-scan base-package="com.spring"></context:component-scan>

		//b. 클래스위에 @Component 어노테이션을 붙여서 객체를 생성 <== 클래스 위부에서 할당
					// 다양한 종류의 클래스가 존재하기 때문에 클래스의 종류에 따라서 여러이름으로 어노테이션을 붙임.
				//@Component	: 일반적인 클래스를 Bean (객체화) 생성
				//@Service		: 비즈니스 로직을 처리하는 클래스에 Bean 생성
				//@Repository	: 데이터 베이스 연동을 처리하는 DAO 클래스에 생성
				//@Controller	: 사용자 요청을 Controller 클래스에 붙여주는 
				//객체를 만들때는 소문자로 만들어야 한다.
			//c. Spring Framework에서 생성된 객체를 의존성 주입(DI)하는 어노테이션 (클래스 변수 위에 할당) // 만들어진 객체를 불러드림
					// 클래스 내부에서 클래스 변수에 할당.
				//@Autowired : 해당 타입의 객체를 찾아서 자동으로 할당하는 어노테이션,
						// 해당타입의 객체가 여러개 존재할 경우 오류가 발생
				//@Qualifier : 특정 객체 이름을 사용해서 불러오는것, @Autowired와같이 사용함
			
				//@Inject : 자바에서 제공되는 어노테이션, @Autowried와 동일한 어노테이션 (타입으로 객체를 가지고온다)
				//@Resource : 자바에서 제공되는 어노테이션, <== 이름으로 객체를 식별
						// @Autowrired + @Qualifier를 하나로 사용함.

		
		
		//1. Spring 컨테이너를 구동
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring 컨테이너로 부터 필요한 객체를 Lookup(찾는다)한다. : DI (객체를 주입)
		TV tv = (TV) factory.getBean("tv3");
		
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
