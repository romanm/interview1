package org.java.annotation;

@ClassPreamble (
		author = "John Doe",
		date = "3/17/2002",
		currentRevision = 6,
		lastModified = "4/12/2004",
		lastModifiedBy = "Jane Doe",
		// Note array notation
		reviewers = {"Alice", "Bob", "Cindy"}
		)
public class Generation3List {
	String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
