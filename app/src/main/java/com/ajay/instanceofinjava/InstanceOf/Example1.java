package com.ajay.instanceofinjava.InstanceOf;

public class Example1 extends Kobra{

    public static void main(String args[]) {

        Example1 example1 = new Example1();
        Example1 example11 = null;
       // Example1 example111 = new Kobra(); // cant put parent object in child (downcast)
    //    Example1 example111 = (Example1) new Kobra();  // even after casting you cant put parent into child (runtime exception)

        System.out.println(example1 instanceof Example1); // true
        System.out.println(example1 instanceof Kobra);  // true  ..child is also object of parent class

        System.out.println(example11 instanceof Example1);

        //============ you can even put child into parent

        Kobra k = new Example1();

        System.out.println(k instanceof Example1);

    }
}
