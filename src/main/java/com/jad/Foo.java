package com.jad;

public class Foo {
    private Bar bar;
    private Baz[] bazs;
    private Qux qux;
    private Corge corge;
    private Grault[] grauls;

    public Foo(Bar bar, Baz[] bazs, Qux qux, Corge corge, Grault[] grauls) {
        this.bar = bar;
        this.bazs = bazs;
        this.qux = qux;
        this.corge = corge;
        this.grauls = grauls;
    }

    public void addBaz(Baz baz) {
        Baz[] newBazs = new Baz[this.bazs.length + 1];
        this.bazs = newBazs;
    }

    public void addGrault() {
        Grault[] newGrauls = new Grault[this.grauls.length + 1];
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

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void setBazs(Baz[] bazs) {
        this.bazs = bazs;
    }

    public void setQux(Qux qux) {
        this.qux = qux;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public void setGrauls(Grault[] grauls) {
        this.grauls = grauls;
    }
}
