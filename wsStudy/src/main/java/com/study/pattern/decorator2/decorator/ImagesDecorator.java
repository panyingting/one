package com.study.pattern.decorator2.decorator;

import com.study.pattern.decorator2.Display;

/**
 * Created by panyingting on 2017/11/16.
 */
public class ImagesDecorator extends DisplayDecorator{

    public ImagesDecorator(Display _display){
        super(_display);
    }

    public void display() {
        addImages();
        super.display.display();
    }

    private void addImages(){
        System.out.println("加上壁纸");
    }
}
