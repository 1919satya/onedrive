package com.javacodegeeks.examples.jaxWsAnnotations.webresult;

import javax.jws.WebService;

@WebService(endpointInterface="com.javacodegeeks.examples.jaxWsAnnotations.webresult.WSAnnotationsWebResultI")
public class WSAnnotationsWebResultImpl implements WSAnnotationsWebResultI {
	@Override
	public float celsiusToFarhenheit(float celsius) {
		return ((celsius - 32)*5)/9;
	}
}
