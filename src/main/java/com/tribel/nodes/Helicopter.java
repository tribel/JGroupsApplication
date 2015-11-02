package com.tribel.nodes;

public class Helicopter extends Aircraft<HelicopType>{

	public Helicopter() {
		super();
	}

	public Helicopter(HelicopType t, int number, double latitude,
			double longitude, double altitude, double course) {
		
		super(t, number, latitude, longitude, altitude, course);
	}

}
