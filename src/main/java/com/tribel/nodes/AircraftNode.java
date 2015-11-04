package com.tribel.nodes;

import org.jgroups.Receiver;

public class AircraftNode extends ClusterNode{

	public AircraftNode() {
		super();
		
	}
	
	public AircraftNode(Receiver receiver, String clustName) {
		super(receiver, clustName);
	}
	
	
}
