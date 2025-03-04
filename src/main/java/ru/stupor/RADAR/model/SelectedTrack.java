package ru.stupor.RADAR.model;


import lombok.Data;

import java.util.List;

@Data
public class SelectedTrack {
    private Integer number;
    private Integer reserve;
    private List<Integer> id;

}
