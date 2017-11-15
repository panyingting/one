package com.study.pattern.state.stateEntity;

import com.study.pattern.state.AbstractState;
import com.study.pattern.state.constant.EnumOfState;

/**
 * Created by panyingting on 2017/11/9.
 */

public class StateBlock extends AbstractState {

    @Override
    public void runnable(){
        super.context.setState(EnumOfState.RUNNABLE);
        System.out.println("状态设置成功：已就绪......");
    }
}
