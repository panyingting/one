package com.study.pattern.state;

import com.study.pattern.state.constant.EnumOfState;

/**
 * Created by panyingting on 2017/11/9.
 */
public class CustomThread {

    private EnumOfState state;

    public void news() {
        state.news();
    }

    public void runnable() {
        state.runnable();
    }

    public void running() {
        state.running();
    }

    public void block() {
        state.block();
    }

    public void terminal() {
        state.terminal();
    }

    public void setState(EnumOfState _state){
        state = _state;
        _state.setContext(this);
    }
}
