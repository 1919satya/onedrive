package com.javacodegeeks.examples.jaxWsAnnotations.webservice;

public class WSAnnotationWebServiceIProxy implements com.javacodegeeks.examples.jaxWsAnnotations.webservice.WSAnnotationWebServiceI {
  private String _endpoint = null;
  private com.javacodegeeks.examples.jaxWsAnnotations.webservice.WSAnnotationWebServiceI wSAnnotationWebServiceI = null;
  
  public WSAnnotationWebServiceIProxy() {
    _initWSAnnotationWebServiceIProxy();
  }
  
  public WSAnnotationWebServiceIProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSAnnotationWebServiceIProxy();
  }
  
  private void _initWSAnnotationWebServiceIProxy() {
    try {
      wSAnnotationWebServiceI = (new com.javacodegeeks.examples.jaxWsAnnotations.webservice.WsAnnotationsWebServiceImplServiceLocator()).getWsAnnotationsWebServiceImplPort();
      if (wSAnnotationWebServiceI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSAnnotationWebServiceI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSAnnotationWebServiceI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSAnnotationWebServiceI != null)
      ((javax.xml.rpc.Stub)wSAnnotationWebServiceI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.javacodegeeks.examples.jaxWsAnnotations.webservice.WSAnnotationWebServiceI getWSAnnotationWebServiceI() {
    if (wSAnnotationWebServiceI == null)
      _initWSAnnotationWebServiceIProxy();
    return wSAnnotationWebServiceI;
  }
  
  public float celsiusToFarhenheit(float arg0) throws java.rmi.RemoteException{
    if (wSAnnotationWebServiceI == null)
      _initWSAnnotationWebServiceIProxy();
    return wSAnnotationWebServiceI.celsiusToFarhenheit(arg0);
  }
  
  
}