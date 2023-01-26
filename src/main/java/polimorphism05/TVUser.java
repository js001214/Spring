package polimorphism05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		//��ü ������ Spring Framework���� ������ DI�� ���ؼ� ��ü�� ����
			// 1. XML ���Ͽ��� ��ü�� ���� ���� :
				//src/main/resource : �ַ� ������ ���õ� ������ ���� �ϴ� �� (mybatis ���ۼ���, bean �� xml, db Connection)
					//applicationContext.xml	: Bean�� �����ϴ� ����, Spring Framework���� ����
		
		// 2. @ (������̼�)�� ����ؼ� ��ü�� ������ DI (��ü�� ����)	<=== Spring Boot ����ϴ� ���
			
			//a. @ (������̼�)�� ����� �� �ֵ��� ������ �ʿ���.
				//applicationContext.xml : Bean ���� ���� , ������̼��� ����� �� �ֵ��� ���� �ʿ�.
					//<context:component-scan base-package="polimorphism05"></context:component-scan>
			//b. Ŭ�������� @Component ������̼��� �ٿ��� ��ü�� ����
					// �پ��� ������ Ŭ������ �����ϱ� ������ Ŭ������ ������ ���� �����̸����� ������̼��� ����.
				//@Component	: �Ϲ����� Ŭ������ Bean (��üȭ) ����
				//@Service		: ����Ͻ� ������ ó���ϴ� Ŭ������ Bean ����
				//@Repository	: ������ ���̽� ������ ó���ϴ� DAO Ŭ������ ����
				//@Controller	: ����� ��û�� Controller Ŭ������ �ٿ��ִ� 
		
			//c. Spring Framework���� ������ ��ü�� ������ ����(DI)�ϴ� ������̼� (Ŭ���� ���� ���� �Ҵ�) // ������� ��ü�� �ҷ��帲
					// Ŭ���� ���ο��� Ŭ���� ������ �Ҵ�.
				//@Autowired : �ش� Ÿ���� ��ü�� ã�Ƽ� �ڵ����� �Ҵ��ϴ� ������̼�,
						// �ش�Ÿ���� ��ü�� ������ ������ ��� ������ �߻�
				//@Qualifier : Ư�� ��ü �̸��� ����ؼ� �ҷ����°�, @Autowired�Ͱ��� �����
			
				//@Inject : �ڹٿ��� �����Ǵ� ������̼�, @Autowried�� ������ ������̼� (Ÿ������ ��ü�� �������´�)
				//@Resource : �ڹٿ��� �����Ǵ� ������̼�, <== �̸����� ��ü�� �ĺ�
						// @Autowrired + @Qualifier�� �ϳ��� �����.

		
		
		//1. Spring �����̳ʸ� ����
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring �����̳ʷ� ���� �ʿ��� ��ü�� Lookup(ã�´�)�Ѵ�. : DI (��ü�� ����)
		TV tv = (TV) factory.getBean("tv3");
		
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}