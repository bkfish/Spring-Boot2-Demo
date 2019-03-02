package com.wj.demo.socketio;

import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.SpringAnnotationScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SocketIOConfig {
    private static final String TOKEN = "token";
    @Value("${socketio.host}")
    private String host;
    @Value("${socketio.port}")
    private Integer port;

    private static final Logger logger = LoggerFactory.getLogger(SocketIOConfig.class);

    @Bean
    public SocketIOServer socketIOServer() {
        com.corundumstudio.socketio.Configuration configuration = new com.corundumstudio.socketio.Configuration();
        configuration.setHostname(host);
        configuration.setPort(port);
        // TODO:添加身份验证
        configuration.setAuthorizationListener(data -> {
            String token = data.getSingleUrlParam(TOKEN);
            return true;
        });
        return new SocketIOServer(configuration);
    }

    @Bean
    public SpringAnnotationScanner springAnnotationScanner(SocketIOServer socketIOServer) {
        return new SpringAnnotationScanner(socketIOServer);
    }
}
