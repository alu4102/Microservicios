package com.in28minutes.microservices.limitsservice.bean;

public class LimitConfiguration {

	private int maximum;
	private int minimum;
	
	protected LimitConfiguration() {}
	
	public LimitConfiguration(int maximun, int minimun) {
		super();
		this.maximum = maximun;
		this.minimum = minimun;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
	
}
