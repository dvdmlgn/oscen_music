package com.oscen.catalogue.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderClassName = "Builder")
public class BundleDto {

  private final int id;
}
