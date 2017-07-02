package one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import one.beans.AppConfig;

public class AnnotationBeanTest {

	public static void main(String[]args){
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.close();
	}
}
