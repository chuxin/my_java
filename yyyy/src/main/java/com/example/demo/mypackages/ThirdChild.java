package com.example.demo.mypackages;

import com.example.demo.mypackages.OOPknowledge;

public class ThirdChild extends OOPknowledge {

    @Override
    public void getThirdChildValue() {
        System.out.println("我是子类 ThirdChild ");
    }

    // overload
    public int getThirdChildValue22(int test) {
        System.out.println("我是子类方法 getThirdChildValue22 - " + test);
        return 22;
    }
}
