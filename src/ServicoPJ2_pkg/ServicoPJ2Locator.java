/**
 * ServicoPJ2Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ServicoPJ2_pkg;

public class ServicoPJ2Locator extends org.apache.axis.client.Service implements ServicoPJ2_pkg.ServicoPJ2 {

    public ServicoPJ2Locator() {
    }


    public ServicoPJ2Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicoPJ2Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServicoPJ2HttpPort
    private java.lang.String ServicoPJ2HttpPort_address = "http://webhml.tjms.jus.br/tjwssgpge/services/ServicoPJ2";

    public java.lang.String getServicoPJ2HttpPortAddress() {
        return ServicoPJ2HttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicoPJ2HttpPortWSDDServiceName = "ServicoPJ2HttpPort";

    public java.lang.String getServicoPJ2HttpPortWSDDServiceName() {
        return ServicoPJ2HttpPortWSDDServiceName;
    }

    public void setServicoPJ2HttpPortWSDDServiceName(java.lang.String name) {
        ServicoPJ2HttpPortWSDDServiceName = name;
    }

    public ServicoPJ2_pkg.ServicoPJ2PortType getServicoPJ2HttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicoPJ2HttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicoPJ2HttpPort(endpoint);
    }

    public ServicoPJ2_pkg.ServicoPJ2PortType getServicoPJ2HttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ServicoPJ2_pkg.ServicoPJ2HttpBindingStub _stub = new ServicoPJ2_pkg.ServicoPJ2HttpBindingStub(portAddress, this);
            _stub.setPortName(getServicoPJ2HttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicoPJ2HttpPortEndpointAddress(java.lang.String address) {
        ServicoPJ2HttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ServicoPJ2_pkg.ServicoPJ2PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ServicoPJ2_pkg.ServicoPJ2HttpBindingStub _stub = new ServicoPJ2_pkg.ServicoPJ2HttpBindingStub(new java.net.URL(ServicoPJ2HttpPort_address), this);
                _stub.setPortName(getServicoPJ2HttpPortWSDDServiceName());
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
        if ("ServicoPJ2HttpPort".equals(inputPortName)) {
            return getServicoPJ2HttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("ServicoPJ2", "ServicoPJ2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("ServicoPJ2", "ServicoPJ2HttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServicoPJ2HttpPort".equals(portName)) {
            setServicoPJ2HttpPortEndpointAddress(address);
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