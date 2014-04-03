package org.java;

public class ObjectWithStatic {
static Integer sti;
Integer loi;
public static Integer getSti() {
	return sti;
}
public static void setSti(Integer sti) {
	ObjectWithStatic.sti = sti;
}
public Integer getLoi() {
	return loi;
}
public void setLoi(Integer loi) {
	this.loi = loi;
}
}
