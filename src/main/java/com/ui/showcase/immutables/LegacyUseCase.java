package com.ui.showcase.immutables;

import org.immutables.value.Value;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

@Value.Immutable
@Value.Style(jdkOnly = true)
public interface LegacyUseCase {
    String id();

    @Nullable
    String nullableText();

    // Please DON'T use nullable optionals. This leads only to confusion
    @Nullable
    Optional<String> optionalText();

    //@AllowNulls
    @SkipNulls
    List<String> textList();
}
