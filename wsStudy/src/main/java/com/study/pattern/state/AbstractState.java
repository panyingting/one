package com.study.pattern.state;

import com.study.pattern.state.stateEntity.IState;

/**
 * Created by panyingting on 2017/11/9.
 */
public abstract class AbstractState  implements IState {

    protected CustomThread context;

    public void setContext(CustomThread _context){
        context = _context;
    }

    public void news() {
        throwIllegalException("状态设置错误: 非法状态");
    }

    public void runnable() {
        throwIllegalException("状态设置错误: 非法状态");
    }

    public void running() {
        throwIllegalException("状态设置错误: 非法状态");
    }

    public void block() {
        throwIllegalException("状态设置错误: 非法状态");
    }

    public void terminal() {
        throwIllegalException("状态设置错误: 非法状态");
    }

    protected void throwIllegalException(String desc){
        throw  new IllegalStateException(desc);
    }
}
