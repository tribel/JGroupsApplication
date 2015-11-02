package com.tribel.nodes;

import java.util.ArrayList;
import java.util.List;

public class ControlCenter {
	
	private List<Aircraft> aircraftsList;

	public ControlCenter() {
		aircraftsList = new ArrayList<>();
	}
	
	public ControlCenter(List<Aircraft> list) {
		this();
		aircraftsList.addAll(list);
	}

	public List<Aircraft> getAircraftsList() {
		return aircraftsList;
	}

	public void setAircraftsList(List<Aircraft> aircraftsList) {
		this.aircraftsList = aircraftsList;
	}
	
}
