package com.study.pattern.proxy.proxy;

import com.study.pattern.proxy.Subject;

/**
 * Created by panyingting on 2017/11/9.
 */
public abstract class Proxy implements Subject {

    final Subject subject;

    public Proxy(Subject _subject){
        subject = _subject;
    }

    protected boolean connected(String address){
        if(address == null)
            return false;
        return true;
    }
}
