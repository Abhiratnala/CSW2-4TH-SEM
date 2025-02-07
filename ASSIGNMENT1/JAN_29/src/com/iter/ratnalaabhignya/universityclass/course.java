package com.iter.ratnalaabhignya.universityclass;
public class course extends student {
	String Branch;

	public String getBranch() {
		return Branch;
	}

	public course(String n, int r, String branch) {
		super(n, r);
		Branch = branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}
	
 
}
