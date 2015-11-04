package com.tribel.nodes;

import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.Receiver;

import com.google.gson.Gson;
import com.tribel.aircraft.AircraftMessage;

public class ClusterNode {
	
	protected JChannel channel;
	
	public ClusterNode() {
		try {
			channel = new JChannel();
		} catch (Exception e) {
			System.out.println("Creation error" + e);
		}
		
	}
	
	public ClusterNode(Receiver receiver, String clustName) {
		this();
		channel.setReceiver(receiver);
		connectToCluster(clustName);		
	}
	
	
	
	public void connectToCluster(String name) {
		try {
			channel.connect(name);
		} catch (Exception e) {
			System.out.println("Connect eror " + e);
		}
	}
	
	public void setReceiver(Receiver receiver) {
		channel.setReceiver(receiver);
	}
	
	public void sendMessage(AircraftMessage msg) {
		try {
			channel.send(new Message(null, new Gson().toJson(msg)));
		} catch (Exception e) {
			System.out.println();
		}
	}
	
	public void closeConnection() {
		channel.close();
	}
} 
