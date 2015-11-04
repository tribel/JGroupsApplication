package com.tribel.aircraft;

import nodes.ClusterNode;

public abstract class Aircraft<T extends Enum<T>> {

	protected ClusterNode node;
	protected T type;
	protected int number;
	protected double latitude;
	protected double longitude;
	protected double altitude;
	protected double course;

	public Aircraft() {
	}

	public Aircraft(T t, int number, double latitude, double longitude,
			double altitude, double course) {
		
		this.type = t;
		this.number = number;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.course = course;
	}

	public Aircraft(ClusterNode node, T type, int number, double latitude,
			double longitude, double altitude, double course) {
		
		this.node = node;
		this.type = type;
		this.number = number;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.course = course;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		double deltaLat = latitude - this.latitude;
		this.latitude = latitude;
		node.sendMessage(new AircraftMessage(deltaLat, this.number, "latitude"));
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		double deltaLong = longitude - this.longitude;
		this.longitude = longitude;
		node.sendMessage(new AircraftMessage(deltaLong, this.number,"longitude"));
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		double deltaAltitude = altitude - this.altitude;
		this.altitude = altitude;
		node.sendMessage(new AircraftMessage(deltaAltitude, this.number, "altitude"));
	}

	public double getCourse() {
		return course;
	}

	public void setCourse(double course) {
		double deltaCource = course - this.course;
		this.course = course;
		node.sendMessage(new AircraftMessage(deltaCource, this.number, "cource"));
	}

	public T getType() {
		return type;
	}

	public void setType(T t) {
		if (t instanceof AircraftSuperType) {
			this.type = t;
		}
		else throw new ClassCastException();
	}

	public void setNode(ClusterNode node) {
		this.node = node;
		
	}

	@Override
	public String toString() {
		return "Aircraft [node=" + node + ", type=" + type + ", number="
				+ number + ", latitude=" + latitude + ", longitude="
				+ longitude + ", altitude=" + altitude + ", course=" + course
				+ "]";
	}
	

}
