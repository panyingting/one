package com.study.pattern.command;

import com.study.pattern.command.receiver.Receiver;
import com.study.pattern.command.receiver.ReceiverImpl1;
import com.study.pattern.command.receiver.ReceiverImpl2;

/**
 * Created by panyingting on 2017/11/8.
 */
public enum Command {
    COMMAND1(new ReceiverImpl1()),
    COMMAND2(new ReceiverImpl2());

    private final ThreadLocal<Receiver> receiver =  new ThreadLocal<Receiver>();;
    Command(Receiver _receiver){
        receiver.set(_receiver);
    }

    public  void execute(){
        receiver.get().doSomething();
    }
}



