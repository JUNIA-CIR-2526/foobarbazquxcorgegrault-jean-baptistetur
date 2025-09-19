package com.jad;

public class Main {
    public static void main(String[] args) {
        Bar bar = new Bar();
        Foo foo = new Foo(bar);

        Baz baz = new Baz();
        foo.addBaz(baz);

        foo.addGrault();

        Corge corge = new Corge(foo);
        foo.setCorge(corge);
    }
}