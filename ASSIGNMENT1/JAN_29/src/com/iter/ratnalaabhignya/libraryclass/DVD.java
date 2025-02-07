package com.iter.ratnalaabhignya.libraryclass;

public class DVD extends LibraryResource{
		int pageCount, issueDate,duration;

		public int getPageCount() {
			return pageCount;
		}

		public void setPageCount(int pageCount) {
			this.pageCount = pageCount;
		}

		public int getIssueDate() {
			return issueDate;
		}

		public void setIssueDate(int issueDate) {
			this.issueDate = issueDate;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public DVD(int pageCount, int issueDate, int duration,String t,String n) {
			super(t,n);
			this.pageCount = pageCount;
			this.issueDate = issueDate;
			this.duration = duration;
			
		}
		public void dsiplayDetails() {
			System.out.println(pageCount+"  "+ issueDate+"  "+duration+" "+super.getTitle()+"  "+super.getAuthor());
		

	}


}
