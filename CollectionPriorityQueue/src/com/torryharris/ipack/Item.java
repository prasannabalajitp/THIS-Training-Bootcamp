package com.torryharris.ipack;

public class Item implements Comparable<Item>{
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Item i) {
        if (id>i.id){
            return 1;
        }
        else
            if (id==i.id){
                return 0;
            }
            else return -1;
    }
}
