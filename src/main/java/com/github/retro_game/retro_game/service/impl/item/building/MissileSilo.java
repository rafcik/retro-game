package com.github.retro_game.retro_game.service.impl.item.building;

import com.github.retro_game.retro_game.model.entity.Body;
import com.github.retro_game.retro_game.model.entity.BuildingKind;
import com.github.retro_game.retro_game.model.entity.CoordinatesKind;
import com.github.retro_game.retro_game.model.entity.Resources;

import java.util.Collections;
import java.util.Map;

public class MissileSilo extends BuildingItem {
  private static final Map<BuildingKind, Integer> buildingsRequirements =
      Collections.singletonMap(BuildingKind.SHIPYARD, 1);

  @Override
  public boolean meetsSpecialRequirements(Body body) {
    return body.getCoordinates().getKind() == CoordinatesKind.PLANET;
  }

  @Override
  public Map<BuildingKind, Integer> getBuildingsRequirements() {
    return buildingsRequirements;
  }

  @Override
  public Resources getBaseCost() {
    return new Resources(20000.0, 20000.0, 1000.0);
  }
}
