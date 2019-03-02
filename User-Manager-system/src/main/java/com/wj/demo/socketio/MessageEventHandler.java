package com.wj.demo.socketio;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageEventHandler {
    private final SocketIOServer socketIOServer;
    private static final Logger logger = LoggerFactory.getLogger(MessageEventHandler.class);

    @Autowired
    public MessageEventHandler(SocketIOServer socketIOServer) {
        this.socketIOServer = socketIOServer;
    }

    @OnConnect
    public void onConnect(SocketIOClient client) {
        if (client != null) {
            logger.info(client.getSessionId().toString() + " is connected!");
        } else {
            logger.error("Connection failed");
        }
    }

    @OnDisconnect
    public void onDisconnect(SocketIOClient client) {
        logger.info(client.getSessionId().toString() + " is disconnected!");
        client.disconnect();
    }
}
