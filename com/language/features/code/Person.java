package com.language.features.code;

/*
1、当对象被回收时，系统自动调用该对象的finalize方法，子类可以重写该方法，做一些释放资源的操作；
2、什么时候被回收：当某个对象没有任何引用的时候，jvm就认为这个对象是一个垃圾对象，就会使用垃圾回收机制来销毁该对戏，在销毁该对象前，会先调用finalize方法；
3、垃圾回收机制的调用，是由系统来决定，也可以通过System.gc() 主动触发垃圾回收机制；
4、	finalize：Object中提供的方法，用于垃圾回收之前自动被垃圾回收器调用的方法
	注意：finalize方法执行在垃圾回收机制之前，但垃圾回收机制具有不确定性，不确定什么时候进行垃圾回收。所以finalize方法无法保证对 手动需要释放的资源 进行及时回收
5、IO流资源不能被GC直接释放（IO流使用了虚拟机之外的资源，所以虚拟机无法通过垃圾回收释放资源），但可以通过finalize方法释放。该方法防止程序员忘记需要手动释放资源——依旧需要手动调用close方法释放资源

*/
public class Person {
    public static void main(String[] args) {
        Car car = new Car();
        // car指向null，堆区对象没有任何引用，垃圾回收机制会回收堆区的对象空间，释放出内存，在销毁对象前，会调用该对象的finalize()方法
        // 需要在Car类中重写finalize方法，否则调用Object类的finalize，即默认处理
        // 但是并不是car=null之后，马上回收堆区对象，而是由JVM的垃圾回收算法去处理
        car = null;
        // 通过该方法主动触发垃圾回收机制，不用等待了
        System.gc();
    }
}


class Car {
    // 重写Object类的finalize方法
    @Override
    protected void finalize() throws Throwable {
        System.out.println("调用Object类的子类Car的finalize方法");
        super.finalize();
    }
}

