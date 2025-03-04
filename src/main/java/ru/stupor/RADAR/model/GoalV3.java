package ru.stupor.RADAR.model;


import lombok.Data;

@Data
public class GoalV3 {
    private Integer x;
    private Integer y;
    private Integer z;
    private Integer xSpeed;
    private Integer ySpeed;
    private Integer zSpeed;
    private Integer targetId;
    private Integer signal;
    private Integer RCS;

    private Integer reserve1;
    private Integer reserve2;
    private Integer reserve3;

    private Integer targetType;
    private Integer reserve4;
    private Integer reserve5;
    private Integer reserve6;
    private Integer reserve7;
    private Integer reserve8;
    private Integer checkMark;

}
