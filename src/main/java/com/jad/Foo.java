package com.jad;

public class Foo {
    private final Bar bar;
    private Baz[] bazs;
    private final Qux qux;
    private Corge corge;
    private Grault[] grauls;

    public Foo(Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
        this.bazs = new Baz[0];
        this.grauls = new Grault[0];
    }

    public void addBaz(Baz baz) {
        Baz[] newBazs = new Baz[this.bazs.length + 1];
        System.arraycopy(this.bazs, 0, newBazs, 0, this.bazs.length);
        newBazs[this.bazs.length] = baz;
        this.bazs = newBazs;
    }

    public void addGrault() {
        Baz[] newBazs = new Baz[this.bazs.length + 1];
        System.arraycopy(this.bazs, 0, newBazs, 0, this.bazs.length);
        newBazs[this.bazs.length] = baz;
        this.grauls = newGrauls;
    }

    public Bar getBar() {
        return this.bar;
    }

    public Baz[] getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public Grault[] getGrauls() {
        return this.grauls;
    }
    public void setCorge(Corge corge) {
        this.corge = corge;
    }
}