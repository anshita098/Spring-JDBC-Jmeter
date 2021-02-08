package com.jmeter.spring.model;

/**
 * Pojo class of Number Table.
*/
public class NumClass {
	private int id;
	private int pointer;
	
	public NumClass() {
	}

	public NumClass(int pointer) {
		this.pointer = pointer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPointer() {
		return pointer;
	}

	public void setPointer(int pointer) {
		this.pointer = pointer;
	}	
}
