package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Serializable, Cloneable{

    Entry<String> root;

    public CustomTree(Entry<String> elementName){
        this.root = elementName;
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return Entry.count;
    }

    public String set(int index, String element){
        throw new UnsupportedOperationException();
    }

    public void add(int index, String element){
        throw new UnsupportedOperationException();
    }

    public String remove(int index){
        throw new UnsupportedOperationException();
    }

    public List<String> subList(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    
    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int index, Collection<? extends String> e){
        throw new UnsupportedOperationException();
    }

    public String getParent(String s){

    }

    @Override
    public boolean add(String s) {

        return super.add(s);
    }

    static class Entry<T> implements Serializable{
        static int count = -1;
        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String element){
            count++;
            this.elementName = element;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        boolean isAvailableToAddChildren(){
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }
}
