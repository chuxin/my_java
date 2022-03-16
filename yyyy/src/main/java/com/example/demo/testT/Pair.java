package com.example.demo.testT;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }

    // 静态方法不能引用泛型类型<T>，必须定义其他类型（例如<K>）来实现静态泛型方法
    public static<X> Pair<X> create(X first, X second) {
        return new Pair<X>(first, second);
    }
}
