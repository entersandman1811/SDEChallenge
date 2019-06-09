package com.sdechallenge;


import org.junit.Assert;
import org.junit.Test;

public class MovingAverageArrayListTest {

	@Test
	public void testEmpty() {
		MovingAverage movingAverage = new MovingAverageImplementation(2L);
		Assert.assertEquals(0, movingAverage.getMovingAverage();
	}

	@Test
	public void testMovingAverage() {
		MovingAverage movingAverage = new MovingAverageImplementation(2L);
		movingAverage.add(3L);
		movingAverage.add(9L);
		movingAverage.add(6L);
		Assert.assertEquals(6, movingAverage.getMovingAverage());
	}

}