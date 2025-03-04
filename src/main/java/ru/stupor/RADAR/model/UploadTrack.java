package ru.stupor.RADAR.model;

import lombok.Data;


import java.math.BigInteger;
import java.util.List;

@Data
public class UploadTrack {
    private BigInteger timestamp;
    private Integer frameId;
    private Integer targetQuantity;
    private Goal goal;
    private List<Target> targets;
}
