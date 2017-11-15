package com.study.pattern.state.constant;

import com.study.pattern.state.CustomThread;
import com.study.pattern.state.stateEntity.*;

/**
 * Created by panyingting on 2017/11/9.
 */
public enum EnumOfState {

    NEW(new StateNew()),
    RUNNABLE(new StateRunnable()),
    RUNNING(new StateRunning()),
    BLOCK(new StateBlock()),
    TERMINATION(new StateTernination());


    private final IState state;

    EnumOfState(IState _state){
        state = _state;
    }

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

    public void setContext(CustomThread _context){
        state.setContext(_context);
    }
}
