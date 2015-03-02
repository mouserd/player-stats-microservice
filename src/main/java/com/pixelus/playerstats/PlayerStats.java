package com.pixelus.playerstats;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlayerStats {

    @Id
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private Integer careerGames;

    @Column(nullable = false)
    private Integer careerGoals;

    protected PlayerStats() {
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Integer getCareerGames() {
        return careerGames;
    }

    public void setCareerGames(final Integer careerGames) {
        this.careerGames = careerGames;
    }

    public Integer getCareerGoals() {
        return careerGoals;
    }

    public void setCareerGoals(final Integer careerGoals) {
        this.careerGoals = careerGoals;
    }
}
