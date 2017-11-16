package com.study.pattern.state;

import com.study.pattern.state.constant.EnumOfState;

/**
 * Created by panyingting on 2017/11/9.
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        try{
            CustomThread thread = new CustomThread();
            thread.setState(EnumOfState.NEW);
            // 场景一

            thread.block();

            thread.runnable();
            // 场景二

            thread.runnable();
            thread.running();
            thread.block();
            thread.runnable(); ///
            thread.running();
            thread.terminal();
        }catch(Exception e){
//            Thread.sleep(10L);
            System.err.println("==========\n"+e.getMessage());
        }




    }

}
