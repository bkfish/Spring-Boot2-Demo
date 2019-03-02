package com.wj.demo.socketio;

import com.corundumstudio.socketio.SocketIOServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SocketioServerRunner implements CommandLineRunner {
    private final SocketIOServer server;
    private static final Logger logger = LoggerFactory.getLogger(SocketioServerRunner.class);

    @Autowired
    public SocketioServerRunner(SocketIOServer server) {
        this.server = server;
    }

    @Override
    public void run(String... args) {
        logger.info("SocketIO server is started!");
        server.start();
    }
}
