package com.iter.ratnalaabhignya.carclass;

public class car {
		private String make, model;
		public car(String m,String n) {
			make=m;
			model=n;
		}
		public void getter() {
			System.out.println("model: "+model +"  "+"make :"+make);
			System.out.println();
		}
		public void setter(String m,String n) {
			make=m;
			model=n;
		}
	}

}
