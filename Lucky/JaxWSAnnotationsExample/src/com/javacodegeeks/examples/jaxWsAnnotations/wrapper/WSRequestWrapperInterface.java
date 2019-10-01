package com.javacodegeeks.examples.jaxWsAnnotations.wrapper;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.RequestWrapper;

@WebService
@SOAPBinding(style=Style.RPC)
public interface WSRequestWrapperInterface {
	@WebMethod
	@RequestWrapper(localName="CTF", 
	targetNamespace="http://javacodegeeks.com/tempUtil", 
	className="com.javacodegeeks.examples.jaxWsAnnotations.webservice.CTF")
	float celsiusToFarhenheit(float celsius);
}
