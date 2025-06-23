package com.ola.blc;

public class LiveTracking extends Thread
{
	@Override 
    public void run()
    {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Updating ride location..."+20*i+" %completed");
			
			
		}
    	System.out.println("Ride Completed");
    }

}

