package com.ui.showcase.immutables;

import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
public interface TypicalUseCase {
    String id();

    String name();

    Long someNumber();

    Optional<String> optionalText();

    List<String> textList();

    @Value.Default
    default String internalId() {
        return TypicalUseCase.class.getSimpleName() + id();
    }

    @Value.Derived
    default String description() {
        return name() + " with a number " + someNumber();
    }

    @Value.Lazy
    default String joinedText() {
        return String.join(", ", textList());
    }
}
