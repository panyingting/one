package com.study.pattern.proxy.proxy;

import com.study.pattern.proxy.ServiceSubject;
import com.study.pattern.proxy.Subject;

/**
 * Created by panyingting on 2017/11/9.
 */
public class ProxyService extends Proxy{

    public ProxyService(){
        super(new ServiceSubject());
    }
    public ProxyService(Subject _subject){
        super(_subject);
    }

    public String service(String address) {
        String result = null;
        if(!connected(address)){
            result =  "服务器拒绝访问.......";
        }else{
            result = super.subject.service(address);
        }
        case1:{
            System.out.println("");
            break case1;
        }
        return result;
    }
}
