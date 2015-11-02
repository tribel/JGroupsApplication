package com.tribel.app;



import org.jgroups.JChannel;



public class Application {
		
	static {
		System.setProperty("java.net.preferIPv6Stack" , "false");
 		System.setProperty("java.net.preferIPv4Stack" , "true");
	}
	
	JChannel channel;
	
	public void start() throws Exception{
		channel = new JChannel();
		channel.connect("AirCluster");
			
	}
	
	public void end() throws Exception {
	
		channel.close();
	}
	
	
 	public static void main(String[] args) throws Exception{
 
 
 		JChannel jChannel = new JChannel();
 		
 		jChannel.connect("cluster");
 		jChannel.close();

		
 	}
}
