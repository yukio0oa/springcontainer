package com.bit2017.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestBeanFactory {
    public static void main( String[] args ){
    	testBeanFactory();
    	testBeanFactory2();
    }
    
    public static void testBeanFactory() {
    	BeanFactory bf = 
    		new XmlBeanFactory( 
    			new ClassPathResource( "config/applicationContext.xml" ) );
    
    	User user1 = (User)bf.getBean( "user1" );
    	User user2 = bf.getBean( User.class );
    	
    	System.out.println( user1.getName() );
    	System.out.println( user2.getName() );
    	System.out.println( user1 == user2 ); // singleton 이다.
    }
    
    public static void testBeanFactory2() {
    	BeanFactory bf = 
    		new XmlBeanFactory( 
    			new ClassPathResource( "config/applicationContext2.xml" ) );
    
    	User user1 = (User)bf.getBean( "user" ); // scanning 생성시 id는 클래스이름 앞에 문자를 소문자로 바꾼 이름이다.
    	User user2 = bf.getBean( User.class );
    	
    	System.out.println( user1.getName() );
    	System.out.println( user2.getName() );
    	System.out.println( user1 == user2 ); // singleton 이다.
    }    
}
