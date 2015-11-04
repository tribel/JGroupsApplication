package com.tribel.aircraft;

public class AircraftMessage {
	
	private double delta;
	private int aircraftNumber;
	private String changeParameter;
	
	
	public AircraftMessage(double delta, int aircraftNumber,
			String changeParameter) {
		
		this.delta = delta;
		this.aircraftNumber = aircraftNumber;
		this.changeParameter = changeParameter;
	}

	public double getDelta() {
		return delta;
	}

	public int getAircraftNumber() {
		return aircraftNumber;
	}

	public String getChangeParameter() {
		return changeParameter;
	}

	@Override
	public String toString() {
		return "AircraftMessage [delta=" + delta + ", aircraftNumber="
				+ aircraftNumber + ", changeParameter=" + changeParameter + "]";
	}
	
	
	
}
