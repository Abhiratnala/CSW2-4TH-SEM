package com.iter.ratnalaabhignya.libraryclass;
abstract class LibraryResource {
	public LibraryResource(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private String title;
	private String author;
	abstract void dsiplayDetails();
}
