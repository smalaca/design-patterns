package com.smalaca.templatemethod.client;

import com.smalaca.templatemethod.functionality.TemplateMethod;
import com.smalaca.templatemethod.functionality.first.FirstTemplateMethod;
import com.smalaca.templatemethod.functionality.second.SecondTemplateMethod;

public class Client {
    public void doInFirstWay() {
        doSomething(new FirstTemplateMethod());
    }

    public void doInSecondWay(){
        doSomething(new SecondTemplateMethod());
    }

    private void doSomething(TemplateMethod templateMethod) {
        //some code
        templateMethod.doSomething();
    }
}
