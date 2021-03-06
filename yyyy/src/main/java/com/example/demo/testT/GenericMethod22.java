package com.example.demo.testT;

public class GenericMethod22<T> {
    private T key;

    public GenericMethod22(T key) {
        this.key = key;
    }

    // 我想说的其实是这个，虽然在方法中使用了泛型，但是这并不是一个泛型方法。
    // 这只是类中一个普通的成员方法，只不过他的返回值是在声明泛型类已经声明过的泛型。
    // 所以在这个方法中才可以继续使用 T 这个泛型。
    public T getKey(){
        return key;
    }

    /**
     * 这个方法显然是有问题的，在编译器会给我们提示这样的错误信息"cannot reslove symbol E"
     * 因为在类的声明中并未声明泛型E，所以在使用E做形参和返回值类型时，编译器会无法识别。
     */
//    public E setKey(E key){
//        this.key = key;
//    }

    // 这也不是一个泛型方法，这就是一个普通的方法，只是使用了Generic<Number>这个泛型类做形参而已。
    public void showKeyValue1(Generic<Number> obj){
        System.out.println("泛型测试 showKeyValue " + obj.getKey());
    }

    // 这也不是一个泛型方法，这也是一个普通的方法，只不过使用了泛型通配符?
    public void showKeyValue2(Generic<?> obj) {
        System.out.println("泛型测试 showKeyValue2 " + obj.getKey());
    }

    /**
     * 这个方法是有问题的，编译器会为我们提示错误信息："UnKnown class 'E' "
     * 虽然我们声明了<T>,也表明了这是一个可以处理泛型的类型的泛型方法。
     * 但是只声明了泛型类型T，并未声明泛型类型E，因此编译器并不知道该如何处理E这个类型。
     */
//    public <T> T showKeyName(Generic<E> container){
//
//    }

    /**
     * 这个方法也是有问题的，编译器会为我们提示错误信息："UnKnown class 'T' "
     * 对于编译器来说T这个类型并未项目中声明过，因此编译也不知道该如何编译这个类。
     * 所以这也不是一个正确的泛型方法声明。
     */
//    public void showkey(T genericObj){
//
//    }
}
