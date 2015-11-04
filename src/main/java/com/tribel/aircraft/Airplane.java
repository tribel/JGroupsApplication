package com.tribel.aircraft;

import nodes.ClusterNode;

public class Airplane extends Aircraft<AirplaneType>{

	
	public Airplane() {
	}

	public Airplane(ClusterNode node, AirplaneType t, int number, double latitude,
			double longitude, double altitude, double course) {
		
		super(node, t, number, latitude, longitude, altitude, course);		
	}


}
