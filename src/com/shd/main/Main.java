package com.shd.main;

import com.shd.model.SingletoneClass;

public class Main {

	public static void main(String[] args) {
		SingletoneClass ref = SingletoneClass.getSingletoneclass();
		System.out.println("initial Counter value = "+ref.getcounter());
		for(int i=0;i<5;i++){
			ref= SingletoneClass.getSingletoneclass();
			System.out.printf("\nInitial Counter value = %d",ref.getcounter());
			try{
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
