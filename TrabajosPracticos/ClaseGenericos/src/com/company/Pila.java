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



   /*

       private Nodo<T> primero;

       public Pila(Nodo<T> primero) {
           this.primero = primero;
       }

       public void push(T value) {
           Nodo actual;
           for(actual = this.primero; actual.getsiguiente() != null; actual = actual.getsiguiente()) {
           }

           actual.setsiguiente(new Nodo(value));
       }

       public T pop() {
           Nodo<T> ant = null;

           Nodo actual;
           for(actual = this.primero; actual.getsiguiente() != null; actual = actual.getsiguiente()) {
               ant = actual;
           }

           T result = (T) actual.getValor();
           assert ant != null;
           ant.setsiguiente((Nodo)null);
           return result;
       }

       public int size() {
           int result = 1;

           for(Nodo actual = this.primero; actual.getsiguiente() != null; ++result) {
               actual = actual.getsiguiente();
           }

           return result;
       }

       public void MostrarPila() {
           Nodo actual;
           for(actual = this.primero; actual.getsiguiente() != null; actual = actual.getsiguiente()) {
               System.out.println(actual.getValor());
           }

           System.out.println(actual.getValor());
       }
  */
}
