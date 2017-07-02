package one.beans;

import org.springframework.beans.factory.BeanNameAware;

public class MyBean implements BeanNameAware{
	
	public MyBean(){
		System.out.println("MyBean constructor......");
	}
	
	public void print(){
		System.out.println("MyBean Print............333333");
		System.out.println("MyBean Print............333333");
		System.out.println("MyBean Print............333333");
		System.out.println("MyBean Print............333333");
	}

	public void setBeanName(String name) {
		System.out.println("............Bean Name:"+name);
	}

}
