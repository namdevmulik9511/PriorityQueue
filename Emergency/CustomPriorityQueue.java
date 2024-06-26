package com.Flynaut.SaaS.Emergency;

import java.util.PriorityQueue;
import java.util.Comparator;
public class CustomPriorityQueue 
{
	Comparator<Patient> comparator=new Comparator<Patient>() {
		
		@Override
		public int compare(Patient p1, Patient p2)
		{
			if (p1.isArrivedByAmbulance() && !p2.isArrivedByAmbulance()) 
			{
				return -1;
			} 
			else if (!p1.isArrivedByAmbulance() && p2.isArrivedByAmbulance()) 
			{
				return 1;
			}
			else 
			{
				return Integer.compare(p2.getPriority(), p1.getPriority());
			}
		}
	};
	private PriorityQueue<Patient> queue=new PriorityQueue<>(comparator);

	public void addPatient(Patient patient)
	{
		queue.add(patient);
	}
	// Process the next patient
	public Patient processNextPatient() 
	{
		return queue.poll();
	}

	// Check if there are any patients left to process
	public boolean hasPatients() {
		return !queue.isEmpty();
	}

}
