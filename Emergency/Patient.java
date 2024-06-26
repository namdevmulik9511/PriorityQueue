package com.Flynaut.SaaS.Emergency;
public class Patient
{
    private String name;
    private int priority;
    private boolean arrivedByAmbulance;
	
    public Patient(String name, int priority, boolean arrivedByAmbulance) {
		super();
		this.name = name;
		this.priority = priority;
		this.arrivedByAmbulance = arrivedByAmbulance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isArrivedByAmbulance() {
		return arrivedByAmbulance;
	}

	public void setArrivedByAmbulance(boolean arrivedByAmbulance) {
		this.arrivedByAmbulance = arrivedByAmbulance;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", priority=" + priority + ", arrivedByAmbulance=" + arrivedByAmbulance + "]";
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}

