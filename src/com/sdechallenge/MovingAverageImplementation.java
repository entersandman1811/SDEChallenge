package com.sdechallenge;

import java.util.LinkedList;
import java.util.Queue;


class MovingAverageImplementation implements MovingAeverage {
    private Long n;
    private LinkedList<Long> elements;;
    private Queue<Long> slidngWindow;
    private Long sum;


    MovingAverageArrayListImpl(Long n) {
        this.n = n;
        this.elements = new LinkedList<Long>();
        this.sum = 0;
        this.elements = new LinkedList<Long>();
    }

    public void add( int element){
        sum += element;
        slidngWindow.add(element)
        elements.add(element);
        if (slidngWindow.size() == n){
            sum -= slidngWindow.remove();
        }
    }

    public LinkedList<Long> getElements(){
        return elements;
    }

    public BigDecimal getMovingAverage(){
        return sum/n;
    }
}