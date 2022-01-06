package com.estudo.gof;

public interface Iterator {
	public void first();

	public void next();

	public boolean isDone();

	public Object currentItem();

	public int getIndex();

	public byte getLength();
}
