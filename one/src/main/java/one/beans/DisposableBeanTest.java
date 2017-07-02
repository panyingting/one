package one.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DisposableBeanTest implements DisposableBean, InitializingBean{

	public void destroy() throws Exception {
		
		System.out.println("DisposableBeanTest destroy().");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("DisposableBeanTest afterPropertiesSet().");
		
	}

}
