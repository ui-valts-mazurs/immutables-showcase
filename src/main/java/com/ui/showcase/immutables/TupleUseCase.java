package com.ui.showcase.immutables;

import org.immutables.value.Value;

public interface TupleUseCase {
    @Value.Style(
            // Generate construction method using all attributes as parameters
            allParameters = true,
            // Changing generated name just for fun
            typeImmutable = "*Tuple",
            // We may also disable builder
            defaults = @Value.Immutable(builder = false))
    @interface Tuple {
    }

    @Value.Immutable
    @Tuple
    interface Point {
        int xCoordinate();

        int yCoordinate();
    }
}
