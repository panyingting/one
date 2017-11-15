package com.study.pattern.state.stateEntity;

import com.study.pattern.state.CustomThread;

/**
 * Created by panyingting on 2017/11/9.
 */
public interface IState {

    void setContext(CustomThread _context);

    void news();

    void runnable();

    void running();

    void block();

    void terminal();

}
