package com.ui.showcase.immutables;

import org.immutables.criteria.Criteria;
import org.immutables.value.Value;

@Value.Immutable
@Criteria
@Criteria.Repository
@Value.Style(visibility = Value.Style.ImplementationVisibility.PRIVATE)
public interface StorageUseCase {
    @Criteria.Id
    String id();
    String name();
}
