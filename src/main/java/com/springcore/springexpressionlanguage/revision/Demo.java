package com.springcore.springexpressionlanguage.revision;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{10+20+60}")
	private int x;

	@Value("#{10+80+90}")
	private int y;

	/* calling a static variable by using the spring expression language */
	@Value("#{  T(java.lang.Math).E}")
	private double e;

	/* calling a static method by using the spring expression language */
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double sqrt;

	/* creating an object by using the spring expression language */
	@Value("#{ new String('Mohammed Azhar')}")
	private String name;

	@Value("#{8>4}")
	private boolean isActive;

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getE() {
		return e;
	}

	public double getSqrt() {
		return sqrt;
	}

	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}

	public void setE(double e) {
		this.e = e;
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
		return "Demo [x=" + x + ", y=" + y + ", e=" + e + ", sqrt=" + sqrt + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
