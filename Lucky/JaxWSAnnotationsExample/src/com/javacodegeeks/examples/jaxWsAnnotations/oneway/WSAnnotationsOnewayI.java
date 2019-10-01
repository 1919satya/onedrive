package com.javacodegeeks.examples.jaxWsAnnotations.oneway;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface WSAnnotationsOnewayI {
	@WebMethod
	@Oneway
	void sayHello();
}
