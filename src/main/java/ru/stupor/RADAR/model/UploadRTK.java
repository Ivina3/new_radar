package ru.stupor.RADAR.model;


import lombok.Data;

import java.math.BigInteger;

@Data
public class UploadRTK {
    private BigInteger latitude;
    private BigInteger longitude;
    private BigInteger headingAngle;
    private Integer numberSatellites;
    private Integer elevation;
}
