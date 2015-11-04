package com.tribel.aircraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

import nodes.ControlCenterNode;

public class ControlCenter {
	
	private static Logger logger = Logger.getLogger(ControlCenter.class.getName());
	private ControlCenterNode node;
	private List<Aircraft> aircraftsList;
	
	public ControlCenter() {
		aircraftsList = new ArrayList<>();
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				aircraftsList.stream().forEach(x -> logger.info(x.toString()));	
			}
		}, 5000, 10000);
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
	
	public void addAircraft(Aircraft air) {
		aircraftsList.add(air);
	}
	
	public void setNode(ControlCenterNode node) {
		this.node = node;
	}
	
}
