package com.ui.showcase.immutables;

import org.immutables.value.Value;

@Value.Modifiable
@Value.Immutable
public interface BeanLikeUseCase {
    String getName();
}
