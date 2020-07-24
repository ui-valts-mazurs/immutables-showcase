package com.ui.showcase.immutables;

import org.immutables.value.Value;

@Value.Style(visibility = Value.Style.ImplementationVisibility.PRIVATE)
@Value.Immutable
public interface EnclosedUseCase {
    String name();
}
