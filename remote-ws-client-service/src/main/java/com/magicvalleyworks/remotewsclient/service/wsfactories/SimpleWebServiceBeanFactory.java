package com.magicvalleyworks.remotewsclient.service.wsfactories;

import com.magicvalleyworks.remotewstarget.cbwc.factories.AbstractConsulBasedWebServiceFactory;
import com.magicvalleyworks.remotewstarget.wsfacadeapi.SimpleWebService;
import com.magicvalleyworks.remotewstarget.wsfacadeapi.SimpleWebService_Service;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class SimpleWebServiceBeanFactory extends AbstractConsulBasedWebServiceFactory {
    @Produces
    @ApplicationScoped
    public SimpleWebService createSimpleWebServiceBean() {
        return createWebServicePort(new SimpleWebService_Service(), SimpleWebService.class, "SimpleWebService");
    }
}
