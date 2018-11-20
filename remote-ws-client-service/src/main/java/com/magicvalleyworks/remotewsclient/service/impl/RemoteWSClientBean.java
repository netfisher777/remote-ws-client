package com.magicvalleyworks.remotewsclient.service.impl;

import com.magicvalleyworks.remotewsclient.service.api.IRemoteWSClient;
import com.magicvalleyworks.remotewstarget.wsfacadeapi.Data;
import com.magicvalleyworks.remotewstarget.wsfacadeapi.SimpleWebService;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@Local(value = IRemoteWSClient.class)
public class RemoteWSClientBean implements IRemoteWSClient {

    @Inject
    private SimpleWebService simpleWebService;

    @Override
    public String callRemoteWS() {
        Data data = new Data();
        data.setData("ws call test");
        data = simpleWebService.processDataRequest(data);
        return data.getData();
    }
}
