package com.ui.showcase.immutables;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.in;


class BeanLikeUseCaseTest {

    private static final String OTHER_NAME = "other name";

    @Test
    void createsUninitializedInstance() {
        ModifiableBeanLikeUseCase instance = ModifiableBeanLikeUseCase.create();

        assertThat(instance.isInitialized()).isFalse();
        assertThatCode(instance::toImmutable).isInstanceOf(IllegalStateException.class);
    }

    @Test
    void createsInstanceAndConvertsToImmutable() {
        ModifiableBeanLikeUseCase modifiableInstance = ModifiableBeanLikeUseCase.create()
                .setName("name");
        modifiableInstance.setName(OTHER_NAME);
        BeanLikeUseCase immutableInstance = modifiableInstance.toImmutable();

        assertThat(modifiableInstance.nameIsSet()).isTrue();
        assertThat(modifiableInstance.getName()).isEqualTo(OTHER_NAME);
        assertThat(modifiableInstance.isInitialized()).isTrue();

        assertThat(immutableInstance.getName()).isEqualTo(OTHER_NAME);
    }
}