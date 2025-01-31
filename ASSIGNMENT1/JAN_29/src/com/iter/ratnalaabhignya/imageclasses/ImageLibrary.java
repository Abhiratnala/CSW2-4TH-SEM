package com.iter.ratnalaabhignya.imageclasses;
import java.util.*;
public class ImageLibrary {
	image arrayOfImageObject[];
	private int maxsize;
	private int imgcount;
	public ImageLibrary(int max) {
		maxsize=max;
		arrayOfImageObject =new image[maxsize];
		imgcount=0;
		}
	public void AddImage(image ob) {
		
		arrayOfImageObject[imgcount++]=new image(ob.getImageWidth(),ob.getImageHeight(),ob.getColorCode());
	}
	public void display() {
		for(int i=0;i<imgcount;i++) {
			System.out.println(arrayOfImageObject[i].toString());
		}
	}
		public image getImage(int index) {
			return arrayOfImageObject[index];
		}
		public image searchImage(image ob) {
		    for (int i = 0; i < imgcount; i++) { // Use < instead of <=
		        if (arrayOfImageObject[i].equals(ob)) { // Use equals() for object comparison
		            return arrayOfImageObject[i]; // Return the found object
		        }
		    }
		    return null; // Return null if the object is not found
		}
		
		
}


