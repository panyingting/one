package com.study.pattern.strategy.calculations;

/**
 * Created by panyingting on 2017/11/14.
 */
public enum CollectorType {

    CMS("com.study.pattern.strategy.calculations.CMSCollector"),
    Serial_Old("com.study.pattern.strategy.calculations.SerialOldCollector");

    private String className;

    CollectorType(String _className){
        className = _className;
    }

    public String getValue(){
        return className;
    }

}
