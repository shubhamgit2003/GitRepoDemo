package com.shd.model;

public class SingletoneClass {
	private static int counter;
	private static SingletoneClass ref;
	static{
		counter=0;
	}
	private SingletoneClass(){
		super();
	}
	public static int getcounter(){
		return counter;
	}
	public static SingletoneClass getSingletoneclass(){
		if(ref == null){
			ref= new SingletoneClass();
		}
		else{
			counter++;
		}
		return ref;
	}
}
