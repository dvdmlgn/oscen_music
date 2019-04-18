package com.oscen.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder(builderClassName = "Builder")
public class TrackDto {

    private long id;

    private String name;

    private long albumId;

    private List<Long> artistIds;

    private boolean isExplicit;

    private int popularity;

    private float msrp;

    private boolean isOnSale;

    private float salePrice;
}
