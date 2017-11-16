package com.study.pattern.decorator2.decorator;

import com.study.pattern.decorator2.Display;

/**
 * Created by panyingting on 2017/11/16.
 */
public class FontTypeDecorator extends DisplayDecorator {

    public FontTypeDecorator(Display _display){
        super(_display);
    }
    public void display() {
        fontDecorator();
        super.display.display();
    }

    private void fontDecorator(){
        System.out.println("字体修饰");
    }
}
