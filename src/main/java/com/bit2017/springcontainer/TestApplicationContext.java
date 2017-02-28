package com.bit2017.springcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {

	public static void main(String[] args) {
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext( "config/applicationContext3.xml" );
	
		// bean 설정으로 생성하면 아이디가 자동으로 부여 되지 않는다.
		// User user = (User)ac.getBean( "user" );
		
		// 같은 클래스의 빈이 2개이상있으면 클래스 이름으로 가져오는 것은 실패
		// User user = ac.getBean( User.class );
		// System.out.println( user );
		
		// 아이디로 가져오기
		User user1 = (User)ac.getBean( "user1" );
		System.out.println( user1 );
		
		// 이름으로 가져오기
		user1 = (User)ac.getBean( "usr1" );
		System.out.println( user1 );
		
		// 생성자로 생성한 빈 가져오기
		Member member1 = (Member)ac.getBean( "member1" );
		System.out.println( member1 );
		
		// 파라미터가 2개 이상인 생성자로 생성한 빈 가져오기
		User user2 = (User)ac.getBean( "user2" );
		System.out.println( user2 );
		
		// 파라미터 순서 바꿔서 생성
		User user3 = (User)ac.getBean( "user3" );
		System.out.println( user3 );
		
		// setter를 사용해서 인스탄스 변수를 셋팅한 빈 가져오기
		User user4 = (User)ac.getBean( "user4" );
		System.out.println( user4 );
		
		Student s = (Student)ac.getBean( "student" );
		System.out.println( s );
		
	}
}
