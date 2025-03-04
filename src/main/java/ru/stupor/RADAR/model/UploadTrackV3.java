package ru.stupor.RADAR.model;


import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
public class UploadTrackV3 {
    private BigInteger timestamp;
    private BigInteger frameId;
    private BigInteger uploadTimestamp;
    private Integer start;
    private Integer end;
    private Integer direction;
    private Integer targetQuantity;
    private GoalV3 goal;
    private List<TargetV3> goals;
}

