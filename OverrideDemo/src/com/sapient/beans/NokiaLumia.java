package com.sapient.beans;

public class NokiaLumia extends Nokia1100{
	public double price =15000;
	public void doConverse(){
		System.out.println("3g converse");
		
	}
	
	public void captureVideo(){
		System.out.println("capture video");
	}
	public void do2gconverse(){
		super.doConverse(); // to access the method in super class
	}
}
	
