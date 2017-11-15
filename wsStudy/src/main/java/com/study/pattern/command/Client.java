package com.study.pattern.command;

/**
 * Created by panyingting on 2017/11/8.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

//        invoker.setCommand(Command.COMMAND1);
        invoker.setCommand(Command.COMMAND2);
        invoker.action();

    }
}
