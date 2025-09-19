package com.jad;

class Foo {
    private Bar bar;
    private Baz[] bazs;
    private Qux qux;
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
        Grault[] newGrauls = new Grault[this.grauls.length + 1];
        System.arraycopy(this.grauls, 0, newGrauls, 0, this.grauls.length);
        newGrauls[this.grauls.length] = new Grault(this);
        this.grauls = newGrauls;
    }

    public Bar getBar() {
        return bar;
    }

    public Baz[] getBazs() {
        return bazs;
    }

    public Qux getQux() {
        return qux;
    }

    public Corge getCorge() {
        return corge;
    }

    public Grault[] getGrauls() {
        return grauls;
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