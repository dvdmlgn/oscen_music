package com.oscen.catalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class CatalogueServiceApplication {

  public static void main(final String[] args) {
    SpringApplication.run(CatalogueServiceApplication.class);
  }

}
