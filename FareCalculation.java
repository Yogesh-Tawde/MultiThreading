package com.ola.blc;

public class FareCalculation extends Thread
{
	@Override 
    public void run()
    {
    	System.out.println("Calculating estimated fare...");
    	try 
    	{
			Thread.sleep(1000,500);
		} 
    	catch (InterruptedException e) 
    	{
			
			e.printStackTrace();
		}
    	System.out.println("Estimated Fare is:135.75 RS");
    }

}
