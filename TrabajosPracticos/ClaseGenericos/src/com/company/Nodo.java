package com.company;

public class Nodo<T> {
    private T valor;
    private Nodo<T> siguiente;

    public Nodo(T valor, Nodo<T> siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public Nodo(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public T getValor() {
        return (T) this.siguiente;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getsiguiente() {
        return this.siguiente;
    }

    public void setsiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}

