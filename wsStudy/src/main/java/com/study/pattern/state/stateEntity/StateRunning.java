package com.study.pattern.state.stateEntity;

import com.study.pattern.state.AbstractState;
import com.study.pattern.state.constant.EnumOfState;

/**
 * Created by panyingting on 2017/11/9.
 */
public class StateRunning extends AbstractState {

    @Override
    public void block(){
        super.context.setState(EnumOfState.BLOCK);
        System.out.println("状态设置成功：已堵塞.....");
    }

    @Override
    public void terminal(){
        super.context.setState(EnumOfState.TERMINATION);
        System.out.println("状态设置成功：已消亡......");
    }
}
