package com.tribel.nodes;

public abstract class Aircraft<T extends Enum<T>> {

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
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public double getCourse() {
		return course;
	}

	public void setCourse(double course) {
		this.course = course;
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

}
