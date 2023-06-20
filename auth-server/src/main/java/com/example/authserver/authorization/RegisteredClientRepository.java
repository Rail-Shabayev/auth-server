package com.example.authserver.authorization;

import org.springframework.lang.Nullable;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;

public interface RegisteredClientRepository {

    @Nullable
    RegisteredClient findBy(String id);

    @Nullable
    RegisteredClient findByClientId(String clientId);
}
