package one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import one.beans.BeanNeedDependent;
import one.beans.MyBean;

public class MainTest {

	public static void main(String[]args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyBean myBean = (MyBean) context.getBean("MyBean_alias_2");
		myBean.print();
		
		MyBean bean1 = context.getBean("myBeanByFactory",MyBean.class);
		bean1.print();
		
		BeanNeedDependent tBeanNeedDependent = context.getBean("beanNeedDependent",BeanNeedDependent.class);
		System.out.println("**************"+tBeanNeedDependent.getMyBean());
		
		
		
		
		context.close();
	}
}
