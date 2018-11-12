package com.magicvalleyworks.remotewsclient.web.controller;

import com.magicvalleyworks.remotewsclient.service.api.IRemoteWSClient;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/remoteWSClient")
public class RemoteWSClientController {

    @EJB
    private IRemoteWSClient remoteWSClient;

    @GET
    @Path("/callRemoteWS")
    public String callRemoteWS() {
        return remoteWSClient.callRemoteWS();
    }

}
