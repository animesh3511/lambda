package com.example.oms;
import java.lang.System;
import java.util.function.*;


public class Main {

    public static void main(String[] args)
    {

        System.out.println("My System starts ");

        MyInterface i = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("hello from MyInterface i");
            }
        };
       i.sayHello();

        MyInterface i1 = () -> System.out.println("hello from MyInterface i1 using lambda");

        i1.sayHello();

        SumInterface s = (a,b)->  a+b;

        System.out.println("sum => "+s.sum(5,5));

        lengthInterface l = (str) -> str.length();
        System.out.println("length of string is "+l.claculateLength("animesh"));


        Supplier<Integer> s1 = ()-> 2*2;
        System.out.println("supplier "+s1.get());


        Predicate<String> p = str -> str.startsWith("a");


        boolean result = p.test("animesh");
        System.out.println("Result: " + result);

        Consumer<String> c = (str)-> System.out.println(str);
        c.accept("Consumer implementation");

        Function<String,Integer> f = (str)->str.length();
        System.out.println("length of string is "+f.apply("liverpool is the best football club in the world"));

        UnaryOperator<Integer> u = (a)-> a*a;
        System.out.println("square "+u.apply(12));

        BinaryOperator<Integer> bo = (a,b)-> a>b?a:b;

        System.out.println("BinaryOperator "+bo.apply(38,46));

        BiFunction<String,Integer,String> b1= (str,a)-> str + a;

        System.out.println("BiFunction : "+b1.apply("number is : ",10));


    }

}
