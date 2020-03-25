package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class GenericaClase<T extends Comparable> implements Comparable  {


    private List<T> arregloGenerico;


    public GenericaClase( List<T> arregloNuevo) {
       arregloGenerico=new ArrayList<T>(arregloNuevo);

    }

    public boolean exists (T element)
    {
        return getArregloGenerico().contains(element);
    }


    public List<T> getArregloGenerico() {
        return  arregloGenerico;
    }






    public T getMax()
    {
        T max=null;
        if(getArregloGenerico().isEmpty())
        {
           return null;
        }
        else
        {
             max= getArregloGenerico().get(0);
            for (T nodo:getArregloGenerico())
            {
                  if(max.compareTo(nodo)<0 || getArregloGenerico() ==null)
                  {
                      max=nodo;

                  }
            }
            return max;
        }
    }
    public T getMin()
    {
        T min=null;
        if(getArregloGenerico().isEmpty() || getArregloGenerico() ==null)
        {
            return null;
        }
        else
        {
            min= getArregloGenerico().get(0);
            for (T nodo:getArregloGenerico())
            {
                if(min.compareTo(nodo)>0)
                {
                    min=nodo;

                }
            }
            return min;
        }
    }



/*
    public T ultimoElemento(T element)
    {
        T last=getArregloGenerico().get(getArregloGenerico().size()-1);
                  getArregloGenerico().remove(getArregloGenerico().size()-1);
          return last;

    }

*/
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
