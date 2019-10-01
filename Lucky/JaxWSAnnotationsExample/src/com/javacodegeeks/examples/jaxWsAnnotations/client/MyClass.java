package com.javacodegeeks.examples.jaxWsAnnotations.client;

import java.rmi.RemoteException;

import com.javacodegeeks.examples.jaxWsAnnotations.webservice.WSAnnotationWebServiceIProxy;

public class MyClass {
	
	public static void main(String[] args) {
		float res;
		WSAnnotationWebServiceIProxy annotationWebServiceIProxy=new WSAnnotationWebServiceIProxy();
		try {
		 res=annotationWebServiceIProxy.celsiusToFarhenheit(41);
			System.out.println(res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
