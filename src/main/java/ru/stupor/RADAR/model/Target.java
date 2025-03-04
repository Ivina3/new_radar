package ru.stupor.RADAR.model;

import lombok.Data;

@Data
public class Target {
    private Integer distance;
    private Integer position;
    private Integer velocity;
    private Integer speed;
    private Integer signal;
    private Integer trackNumber;
    private Integer targetType;

    private Integer reserve1;
    private Integer reserve2;
    private Integer reserve3;
    private Integer reserve4;

    private Integer predictDistance;
    private Integer predictDirection;
    private Integer predictSpeed;
    private Integer predictSpeedDirection;

}
