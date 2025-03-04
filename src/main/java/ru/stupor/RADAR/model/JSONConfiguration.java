package ru.stupor.RADAR.model;


import lombok.Data;

@Data
public class JSONConfiguration {
    private Integer type;
    private Integer bytes;
    private Integer reserve;
    private String message;
}
