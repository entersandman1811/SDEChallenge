package com.sdechallenge;


/**
 * Interface for a data structure that can provide the moving average of the last N elements added,
 * add elements to the structure and get access to the elements
 */
public interface MovingAverage {
    /**
     * Add an element
     * @param element Element to be added
     */
    public void add(Long element);

    /**
     * Returns all the elements
     *
     * @return the all the elements
     */
    public Long getElements();

    /**
     *  Provide the moving average of the last N elements added
     * @return moving average
     */
    public Long getMovingAverage();
}