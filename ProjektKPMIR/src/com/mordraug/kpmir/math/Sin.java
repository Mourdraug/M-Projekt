package com.mordraug.kpmir.math;

public class Sin extends Trygonometric {

	public Sin(MathElement a) {
		super(a);
	}

	@Override
	public double value() {
		return (double)Math.round(Math.sin(arg.value())*1000000000)/1000000000;
	}

	@Override
	public String string() {
		return "sin("+arg.string()+")";
	}

}
