package io.github.rpablo30.featuretoggle.dto;

import io.github.rpablo30.featuretoggle.entity.Feature;
import io.github.rpablo30.featuretoggle.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeatureDto {

    private String name;
    private Boolean active;

    public FeatureDto() {

    }

    public FeatureDto(String name, Boolean active) {
        this.name = name;
        this.active = active;
    }

    public FeatureDto(Feature entity) {
        this.name = entity.getName();
        this.active = entity.getActive();
    }




}
