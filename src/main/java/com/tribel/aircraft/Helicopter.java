package com.tribel.aircraft;

import com.tribel.nodes.ClusterNode;

public class Helicopter extends Aircraft<HelicopType> {

	public Helicopter() {
		super();
	}

	public Helicopter(ClusterNode node, HelicopType t, int number, double latitude,
			double longitude, double altitude, double course) {
		
		super(node, t, number, latitude, longitude, altitude, course);
	}

	
}
