package com.ui.showcase.immutables;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class EnclosedUseCaseTest {
    private static final String NAME = "name";

    @Test
    void createsBuilderWithNew() {
        EnclosedUseCase instance = new EnclosedUseCaseBuilder()
                .name(NAME)
                .build();

        assertThat(instance.name()).isEqualTo(NAME);
    }
}