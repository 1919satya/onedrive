package com.javacodegeeks.examples.jaxWsAnnotations.webresult;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface WSAnnotationsWebResultI {
	@WebMethod
	@WebResult(partName="farhenheitResponse")
	float celsiusToFarhenheit(float celsius);
}
