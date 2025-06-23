package com.ola.elc;
import com.ola.blc.DriverAssignment;
import com.ola.blc.FareCalculation;
import com.ola.blc.LiveTracking;
import com.ola.blc.PaymentProcessing;
import com.ola.blc.RatingSystem;
import com.ola.blc.RideRequest;

public class OlaRidingApp
{

	public static void main(String[] args) throws InterruptedException 
	{
		RideRequest request = new RideRequest();
		DriverAssignment driver = new DriverAssignment();
		FareCalculation fare = new FareCalculation();
		LiveTracking  tracking = new LiveTracking();
		PaymentProcessing payment = new PaymentProcessing();
		RatingSystem rating = new RatingSystem();
		request.start();
		fare.start();
		try 
		{
			request.join();
		}
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		driver.start();
		driver.join();
		tracking.start();
		payment.start();
		payment.join();
		rating.start();
	}

}
