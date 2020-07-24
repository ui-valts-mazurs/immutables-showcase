package com.ui.showcase.immutables;

import com.google.common.collect.ImmutableList;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.SoftAssertions.assertSoftly;


class TypicalUseCaseTest {
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final long SOME_NUMBER = 123L;
    private static final String TEXT = "text";
    private static final String LIST_ITEM_1 = "list item 1";
    private static final String LIST_ITEM_2 = "list item 2";
    private static final String LIST_ITEM_3 = "list item 3";
    private static final String LIST_ITEM_4 = "list item 4";
    private static final TypicalUseCase FULL_INSTANCE = ImmutableTypicalUseCase.builder()
            .id(ID)
            .name(NAME)
            .someNumber(SOME_NUMBER)
            .optionalText(TEXT)
            .addTextList(LIST_ITEM_1, LIST_ITEM_2, LIST_ITEM_3, LIST_ITEM_4)
            .build();

    @Test
    void createsInstance() {
        TypicalUseCase instance = ImmutableTypicalUseCase.builder()
                .id(ID)
                .name(NAME)
                .someNumber(SOME_NUMBER)
                .optionalText(TEXT)
                .addAllTextList(ImmutableList.of(LIST_ITEM_1, LIST_ITEM_2))
                .addTextList(LIST_ITEM_3, LIST_ITEM_4)
                .build();

        assertThat(instance).isEqualTo(FULL_INSTANCE);
        assertThat(instance.description()).isEqualTo("name with a number 123");
        assertThat(instance.joinedText()).isEqualTo("list item 1, list item 2, list item 3, list item 4");
    }

    @Test
    void demonstratesOptional() {
        TypicalUseCase instance = ImmutableTypicalUseCase.builder()
                .id(ID)
                .name(NAME)
                .someNumber(SOME_NUMBER)
                .optionalText(Optional.of(TEXT))
                .optionalText(Optional.empty())
                .build();

        assertThat(instance.optionalText()).isEmpty();
    }

    @Test
    void createsMinimalInstance() {
        TypicalUseCase instance = ImmutableTypicalUseCase.builder()
                .id(ID)
                .name(NAME)
                .someNumber(SOME_NUMBER)
                .build();

        assertSoftly(softly -> {
            softly.assertThat(instance.id()).isEqualTo(ID);
            softly.assertThat(instance.name()).isEqualTo(NAME);
            softly.assertThat(instance.someNumber()).isEqualTo(SOME_NUMBER);
            softly.assertThat(instance.optionalText()).isEmpty();
            softly.assertThat(instance.textList()).isEmpty();
        });
    }

    @Test
    void failsWhenRequiredFieldNotSet() {
        assertThatCode(() -> ImmutableTypicalUseCase.builder()
                .id(ID)
                .name(NAME)
                .build())
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void failsWhenTryingToSetNullOnRequired() {
        assertThatCode(() -> ImmutableTypicalUseCase.builder()
                .id(ID)
                .name(NAME)
                .someNumber(null)
                .build())
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void failsWhenTryingToSetNullOnOptional() {
        assertThatCode(() -> ImmutableTypicalUseCase.builder()
                .id(ID)
                .name(NAME)
                .someNumber(SOME_NUMBER)
                .optionalText((String) null)
                .build())
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void failsWhenTryingToSetNullInList() {
        assertThatCode(() -> ImmutableTypicalUseCase.builder()
                .id(ID)
                .name(NAME)
                .someNumber(SOME_NUMBER)
                .addTextList((String) null)
                .build())
                .isInstanceOf(NullPointerException.class);
    }
}