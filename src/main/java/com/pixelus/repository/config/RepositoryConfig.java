package com.pixelus.repository.config;

import com.pixelus.playerstats.PlayerStats;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class RepositoryConfig extends RepositoryRestMvcConfiguration {

    @Override
    protected void configureRepositoryRestConfiguration(final RepositoryRestConfiguration config) {
        config.exposeIdsFor(PlayerStats.class);
    }
}