package com.tribel.nodes;

import java.io.InputStream;
import java.io.OutputStream;

import org.jgroups.Address;
import org.jgroups.Message;
import org.jgroups.Receiver;
import org.jgroups.View;

import com.google.gson.Gson;
import com.tribel.aircraft.AircraftMessage;

public class ControlCenterNode extends ClusterNode implements Receiver{
	
    public ControlCenterNode() {
		super();
	}
    
    public ControlCenterNode(String clustName) {
    	super();
    	super.connectToCluster(clustName);
    }
	
	@Override
	public void receive(Message msg) {
		System.out.println(msg.getSrc()
				+ "   "
				+ new Gson().fromJson(msg.getObject().toString(),
						AircraftMessage.class));
		
	}

	@Override
	public void getState(OutputStream output) throws Exception {
	}

	@Override
	public void setState(InputStream input) throws Exception {
	}

	@Override
	public void viewAccepted(View new_view) {
	}

	@Override
	public void suspect(Address suspected_mbr) {	
	}

	@Override
	public void block() {
	}

	@Override
	public void unblock() {	
	}

}
