package com.study.pattern.state.stateEntity;

import com.study.pattern.state.AbstractState;
import com.study.pattern.state.constant.EnumOfState;

/**
 * Created by panyingting on 2017/11/9.
 */
public class StateRunnable extends AbstractState {

    @Override
    public void running() {
        super.context.setState(EnumOfState.RUNNING);
        System.out.println("状态设置成功:运行中....");
    }

    @Override
    public void block() {
        super.context.setState(EnumOfState.BLOCK);
        System.out.println("状态设置成功:已堵塞....");
    }

}
