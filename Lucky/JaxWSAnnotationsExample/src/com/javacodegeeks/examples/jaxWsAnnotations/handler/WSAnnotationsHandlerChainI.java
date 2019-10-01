package com.javacodegeeks.examples.jaxWsAnnotations.handler;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface WSAnnotationsHandlerChainI {
	@HandlerChain(file = "soap-handler.xml")
	@WebMethod
	float celsiusToFarhenheit(float celsius);
}
