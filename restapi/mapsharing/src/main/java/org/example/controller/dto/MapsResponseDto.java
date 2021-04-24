package org.example.controller.dto;

import lombok.Getter;
import org.example.domain.maps.Maps;

@Getter
public class MapsResponseDto {
    private Long mapIdx;
    private String name;
    private String desc;
    private Long color;
    private Long open;

    public MapsResponseDto(Maps entity) {
        this.mapIdx = entity.getMapIdx();
        this.name = entity.getName();
        this.desc = entity.getDesc();
        this.color = entity.getColor();
        this.open = entity.getOpen();
    }
}
