package com.study.pattern.decorator2.decorator;

import com.study.pattern.decorator2.Display;

/**
 * Created by panyingting on 2017/11/16.
 */
public abstract class DisplayDecorator implements Display {

    protected Display display;
    public DisplayDecorator(Display _display){
        display = _display;
    }

}
