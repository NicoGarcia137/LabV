package com.company;

import java.util.LinkedList;
import java.util.List;

public class Pila <T>{
    private List<T> list;

    public Pila() {
        setList(new LinkedList<T>());
    }


    public List<T> getList() {
        return list;
    }

    public void setList(LinkedList<T> list) {
        this.list = list;
    }

    public T pop(){
        if(getList().isEmpty() || getList() == null){
            return null;
        }else {
            return getList().get(getList().size()-1);
        }
    }
    public void push(T element){
        getList().add(element);
    }
    public int size(){
        if(getList().isEmpty() || getList() == null){
            return 0;
        }else {
            return getList().size();
        }
    }

}
