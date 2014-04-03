package org.java.serialize;

public interface SaveLoad {
	public void save(Object  o, String file);
	public Object load(String file);
}
