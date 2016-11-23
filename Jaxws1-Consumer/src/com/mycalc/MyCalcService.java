
package com.mycalc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MyCalcService", targetNamespace = "MyCalc.com", wsdlLocation = "http://localhost:8080/one?wsdl")
public class MyCalcService
    extends Service
{

    private final static URL MYCALCSERVICE_WSDL_LOCATION;
    private final static WebServiceException MYCALCSERVICE_EXCEPTION;
    private final static QName MYCALCSERVICE_QNAME = new QName("MyCalc.com", "MyCalcService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/one?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYCALCSERVICE_WSDL_LOCATION = url;
        MYCALCSERVICE_EXCEPTION = e;
    }

    public MyCalcService() {
        super(__getWsdlLocation(), MYCALCSERVICE_QNAME);
    }

    public MyCalcService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYCALCSERVICE_QNAME, features);
    }

    public MyCalcService(URL wsdlLocation) {
        super(wsdlLocation, MYCALCSERVICE_QNAME);
    }

    public MyCalcService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYCALCSERVICE_QNAME, features);
    }

    public MyCalcService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyCalcService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MyName
     */
    @WebEndpoint(name = "MyPort")
    public MyName getMyPort() {
        return super.getPort(new QName("MyCalc.com", "MyPort"), MyName.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyName
     */
    @WebEndpoint(name = "MyPort")
    public MyName getMyPort(WebServiceFeature... features) {
        return super.getPort(new QName("MyCalc.com", "MyPort"), MyName.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYCALCSERVICE_EXCEPTION!= null) {
            throw MYCALCSERVICE_EXCEPTION;
        }
        return MYCALCSERVICE_WSDL_LOCATION;
    }

}
