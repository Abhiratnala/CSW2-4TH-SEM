package com.iter.ratnalaabhignya.imageclasses;

public class image {

	public int getImageWidth() {
		return imageWidth;
	}
	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
	}
	public int getImageHeight() {
		return imageHeight;
	}
	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
	}
	public int getColorCode() {
		return colorCode;
	}
	public void setColorCode(int colorCode) {
		this.colorCode = colorCode;
	}
	private int imageWidth;
	private int imageHeight;
	private int colorCode;
	public image() {
		imageWidth=20;
		imageHeight=30;
		colorCode=00225;
	}
	public image(int w,int h,int c) {
		imageWidth=w;
		imageHeight=h;
		colorCode=c;
	}
	@Override
	public String toString()//preexisting method which we are redifining 
	{
		return (imageWidth+" "+imageHeight+" "+	colorCode);
	}
	@Override
	public boolean equals(Object o) {
		image obj=(image) o;
		 if( (imageWidth==obj.imageWidth) && (imageHeight==obj.imageHeight) && (colorCode==obj.colorCode)){
			 return true;
		 }
		 else
			 return false;
		 
	}
	
}
