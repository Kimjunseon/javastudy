package com.bitacademy.paint.shape;

import com.bitacademy.paint.i.Drawable;

public abstract class Shape implements Drawable{
	private String fillColor;
	private String lineColor;
	
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}


}
