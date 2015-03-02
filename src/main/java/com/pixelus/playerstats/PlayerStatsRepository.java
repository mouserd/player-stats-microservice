package com.pixelus.playerstats;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "playerstats", path = "playerstats")
public interface PlayerStatsRepository extends CrudRepository<PlayerStats, String> {
}
