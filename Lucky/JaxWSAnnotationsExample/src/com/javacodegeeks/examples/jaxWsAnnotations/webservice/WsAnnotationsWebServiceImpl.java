package com.javacodegeeks.examples.jaxWsAnnotations.webservice;

import javax.jws.WebService;

@WebService(endpointInterface="com.javacodegeeks.examples.jaxWsAnnotations.webservice.WSAnnotationWebServiceI")
public class WsAnnotationsWebServiceImpl implements WSAnnotationWebServiceI {
	@Override
	public float celsiusToFarhenheit(float celsius) {
		return ((celsius - 32)*5)/9;
	}
}
