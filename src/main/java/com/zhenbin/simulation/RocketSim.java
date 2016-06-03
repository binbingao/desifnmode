package com.zhenbin.simulation;

public interface RocketSim {
	abstract double getMass();
	public double getThrust();
	void setSimTime(double t);
}
