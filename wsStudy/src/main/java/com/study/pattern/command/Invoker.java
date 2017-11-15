package com.study.pattern.command;

/**
 * Created by panyingting on 2017/11/8.
 */
public class Invoker {

    private Command command;

    public void setCommand(Command _command){
        command = _command;
    }

    public void action(){
        command.execute();
    }
}
