package com.ui.showcase.immutables;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableDtoUseCase.class)
@JsonDeserialize(as = ImmutableDtoUseCase.class)
@Value.Style(passAnnotations = {DtoUseCase.CustomAnnotation.class}, of = "new", allParameters = true)
public interface DtoUseCase {
    @interface CustomAnnotation {
    }

    @JsonProperty("custom_name")
    @Value.Parameter
    @CustomAnnotation
    String name();
}
