package one.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BeanNeedDependent {

	@Autowired
	@Qualifier("MyBean_1")
	private MyBean myBean;

	public MyBean getMyBean() {
		return myBean;
	}

	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}
	
	 
}
