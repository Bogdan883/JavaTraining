//Ex. 1
package com.lseg.Tema8;

public class Furniture {

    private Chairs chairs;
    private Table table;

    public Furniture(Chairs chairs, Table table) {
        this.chairs = chairs;
        this.table = table;
    }

    public Chairs getChairs() {
        return chairs;
    }

    public Table getTable() {
        return table;
    }

    public void setChairs(Chairs chairs) {
        this.chairs = chairs;
    }

    public void setTable(Table table) {
        this.table = table;
    }
}
