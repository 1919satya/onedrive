package com.javacodegeeks.examples.jaxWsAnnotations.wrapper;

import javax.jws.WebMethod;
import javax.xml.ws.ResponseWrapper;

public interface WSResponseWrapperInterfaceI {
	@WebMethod
	@ResponseWrapper(localName="CTFResponse", 
	targetNamespace="http://javacodegeeks.com/tempUtil", 
	className="com.javacodegeeks.examples.jaxWsAnnotations.webservice.CTFResponse")
	float celsiusToFarhenheit(float celsius);
}
