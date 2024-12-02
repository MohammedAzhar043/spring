package com.springcore.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo1")
public class Demo {

	@Value("#{ 10+20}")
	private int x;

	@Value("#{ 10*20+10}")
	private int y;

	/* use to call the methods */
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;

	private int i;
	@Value("#{T(java.lang.Math).PI}")
	private double e;

	/* creating the object by using the expression lang */
	@Value("#{new java.lang.String('Mohammed Azhar')}")
	private String name;

	/* creating the boolean value related variable */
	@Value("#{(8>2 and 2==2)}")
	private boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
