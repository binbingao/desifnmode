package com.zhenbin.simulation;

public class OozinozRocket extends PhysicalRocket implements RocketSim{

	public double getMass() {
		System.out.println("OozinozRocket getMass");
		return 0;
	}

	public double getThrust() {
		System.out.println("OozinozRocket getThrust");
		return 0;
	}

	public void setSimTime(double t) {
		System.out.println("OozinozRocket setSimTime");
		
	}

}
