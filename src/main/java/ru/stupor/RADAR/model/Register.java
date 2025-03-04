package ru.stupor.RADAR.model;

import lombok.Data;

import java.util.List;

@Data
public class Register {
    private Integer number;
    private List<Integer> address;
    private List<Integer> data;

}
