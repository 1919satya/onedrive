/**
 * WsAnnotationsWebServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.javacodegeeks.examples.jaxWsAnnotations.webservice;

public class WsAnnotationsWebServiceImplServiceLocator extends org.apache.axis.client.Service implements com.javacodegeeks.examples.jaxWsAnnotations.webservice.WsAnnotationsWebServiceImplService {

    public WsAnnotationsWebServiceImplServiceLocator() {
    }


    public WsAnnotationsWebServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsAnnotationsWebServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsAnnotationsWebServiceImplPort
    private java.lang.String WsAnnotationsWebServiceImplPort_address = "http://127.0.0.1:9999/ctf";

    public java.lang.String getWsAnnotationsWebServiceImplPortAddress() {
        return WsAnnotationsWebServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsAnnotationsWebServiceImplPortWSDDServiceName = "WsAnnotationsWebServiceImplPort";

    public java.lang.String getWsAnnotationsWebServiceImplPortWSDDServiceName() {
        return WsAnnotationsWebServiceImplPortWSDDServiceName;
    }

    public void setWsAnnotationsWebServiceImplPortWSDDServiceName(java.lang.String name) {
        WsAnnotationsWebServiceImplPortWSDDServiceName = name;
    }

    public com.javacodegeeks.examples.jaxWsAnnotations.webservice.WSAnnotationWebServiceI getWsAnnotationsWebServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsAnnotationsWebServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsAnnotationsWebServiceImplPort(endpoint);
    }

    public com.javacodegeeks.examples.jaxWsAnnotations.webservice.WSAnnotationWebServiceI getWsAnnotationsWebServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.javacodegeeks.examples.jaxWsAnnotations.webservice.WsAnnotationsWebServiceImplPortBindingStub _stub = new com.javacodegeeks.examples.jaxWsAnnotations.webservice.WsAnnotationsWebServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getWsAnnotationsWebServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsAnnotationsWebServiceImplPortEndpointAddress(java.lang.String address) {
        WsAnnotationsWebServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.javacodegeeks.examples.jaxWsAnnotations.webservice.WSAnnotationWebServiceI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.javacodegeeks.examples.jaxWsAnnotations.webservice.WsAnnotationsWebServiceImplPortBindingStub _stub = new com.javacodegeeks.examples.jaxWsAnnotations.webservice.WsAnnotationsWebServiceImplPortBindingStub(new java.net.URL(WsAnnotationsWebServiceImplPort_address), this);
                _stub.setPortName(getWsAnnotationsWebServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WsAnnotationsWebServiceImplPort".equals(inputPortName)) {
            return getWsAnnotationsWebServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.jaxWsAnnotations.examples.javacodegeeks.com/", "WsAnnotationsWebServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.jaxWsAnnotations.examples.javacodegeeks.com/", "WsAnnotationsWebServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsAnnotationsWebServiceImplPort".equals(portName)) {
            setWsAnnotationsWebServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
