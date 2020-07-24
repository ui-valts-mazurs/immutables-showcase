package com.ui.showcase.immutables;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class LegacyUseCaseTest {
    private static final String ID = "id";
    private static final String ITEM_1 = "item1";
    private static final String ITEM_2 = "item2";

    @Test
    void setsNull() {
        LegacyUseCase instance = ImmutableLegacyUseCase.builder()
                .id(ID)
                .nullableText(null)
                .build();

        assertThat(instance.nullableText()).isNull();
        assertThat(instance.optionalText()).isNull(); // This is not what you expected, right?
    }

    @Test
    void setsOptionalNull() {
        LegacyUseCase instance = ImmutableLegacyUseCase.builder()
                .id(ID)
                .optionalText(null) // this is NOT how you use Optional!
                .build();

        assertThat(instance.nullableText()).isNull();
        assertThat(instance.optionalText()).isNull(); // Yeah, Optional which is null again
    }

    @Test
    void filtersOutNullsFromList() {
        LegacyUseCase instance = ImmutableLegacyUseCase.builder()
                .id(ID)
                .addTextList(ITEM_1, null, ITEM_2)
                .build();

        assertThat(instance.textList()).containsExactly(ITEM_1, ITEM_2);
    }
}