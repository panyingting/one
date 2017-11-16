package com.study.pattern.decorator2;

import com.study.pattern.decorator2.decorator.FontTypeDecorator;
import com.study.pattern.decorator2.decorator.ImagesDecorator;

/**
 * Created by panyingting on 2017/11/16.
 */
public class Client {

    public static void main(String[] args) {

        Display phoneDIsplay = new PhoneDisplay();
        Display decorator = new FontTypeDecorator(new ImagesDecorator(phoneDIsplay));

        decorator.display();

    }
}
