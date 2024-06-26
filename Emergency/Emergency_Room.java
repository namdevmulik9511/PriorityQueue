package com.Flynaut.SaaS.Emergency;

public class Emergency_Room 
{
	public static void main(String[] args) 
	{
		CustomPriorityQueue customPriorityQueue=new CustomPriorityQueue();
		customPriorityQueue.addPatient(new Patient("Somu",1,true));
		customPriorityQueue.addPatient(new Patient("Gomu",4,false));
		customPriorityQueue.addPatient(new Patient("Tomu",3,false));
		customPriorityQueue.addPatient(new Patient("Ramu",2,false));
		
		System.out.println("EmergencyRoom ...");
		while(customPriorityQueue.hasPatients())
		{
			Patient nextPatient=customPriorityQueue.processNextPatient();
			System.out.println(nextPatient);
		}

	}

}
