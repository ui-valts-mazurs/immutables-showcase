package com.ui.showcase.immutables;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Builds instances of type {@link EnclosedUseCase EnclosedUseCase}.
 * Initialize attributes and then invoke the {@link #build()} method to create an
 * immutable instance.
 * <p><em>{@code EnclosedUseCaseBuilder} is not thread-safe and generally should not be stored in a field or collection,
 * but instead used immediately to create instances.</em>
 */
@Generated(from = "EnclosedUseCase", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@NotThreadSafe
public final class EnclosedUseCaseBuilder {
  private static final long INIT_BIT_NAME = 0x1L;
  private long initBits = 0x1L;

  private @Nullable String name;

  /**
   * Creates a builder for {@link EnclosedUseCase EnclosedUseCase} instances.
   * <pre>
   * new EnclosedUseCaseBuilder()
   *    .name(String) // required {@link EnclosedUseCase#name() name}
   *    .build();
   * </pre>
   */
  public EnclosedUseCaseBuilder() {
  }

  /**
   * Fill a builder with attribute values from the provided {@code EnclosedUseCase} instance.
   * Regular attribute values will be replaced with those from the given instance.
   * Absent optional values will not replace present values.
   * @param instance The instance from which to copy values
   * @return {@code this} builder for use in a chained invocation
   */
  @CanIgnoreReturnValue 
  public final EnclosedUseCaseBuilder from(EnclosedUseCase instance) {
    Objects.requireNonNull(instance, "instance");
    name(instance.name());
    return this;
  }

  /**
   * Initializes the value for the {@link EnclosedUseCase#name() name} attribute.
   * @param name The value for name 
   * @return {@code this} builder for use in a chained invocation
   */
  @CanIgnoreReturnValue 
  public final EnclosedUseCaseBuilder name(String name) {
    this.name = Objects.requireNonNull(name, "name");
    initBits &= ~INIT_BIT_NAME;
    return this;
  }

  /**
   * Builds a new {@link EnclosedUseCase EnclosedUseCase}.
   * @return An immutable instance of EnclosedUseCase
   * @throws java.lang.IllegalStateException if any required attributes are missing
   */
  public EnclosedUseCase build() {
    if (initBits != 0) {
      throw new IllegalStateException(formatRequiredAttributesMessage());
    }
    return new EnclosedUseCaseBuilder.ImmutableEnclosedUseCase(this);
  }

  private String formatRequiredAttributesMessage() {
    List<String> attributes = new ArrayList<>();
    if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
    return "Cannot build EnclosedUseCase, some of required attributes are not set " + attributes;
  }

  /**
   * Immutable implementation of {@link EnclosedUseCase}.
   * <p>
   * Use the builder to create immutable instances:
   * {@code new EnclosedUseCaseBuilder()}.
   */
  @Generated(from = "EnclosedUseCase", generator = "Immutables")
  @Immutable
  @CheckReturnValue
  private static final class ImmutableEnclosedUseCase implements EnclosedUseCase {
    private final String name;

    private ImmutableEnclosedUseCase(EnclosedUseCaseBuilder builder) {
      this.name = builder.name;
    }

    /**
     * @return The value of the {@code name} attribute
     */
    @Override
    public String name() {
      return name;
    }

    /**
     * This instance is equal to all instances of {@code ImmutableEnclosedUseCase} that have equal attribute values.
     * @return {@code true} if {@code this} is equal to {@code another} instance
     */
    @Override
    public boolean equals(@Nullable Object another) {
      if (this == another) return true;
      return another instanceof EnclosedUseCaseBuilder.ImmutableEnclosedUseCase
          && equalTo((EnclosedUseCaseBuilder.ImmutableEnclosedUseCase) another);
    }

    private boolean equalTo(EnclosedUseCaseBuilder.ImmutableEnclosedUseCase another) {
      return name.equals(another.name);
    }

    /**
     * Computes a hash code from attributes: {@code name}.
     * @return hashCode value
     */
    @Override
    public int hashCode() {
      @Var int h = 5381;
      h += (h << 5) + name.hashCode();
      return h;
    }

    /**
     * Prints the immutable value {@code EnclosedUseCase} with attribute values.
     * @return A string representation of the value
     */
    @Override
    public String toString() {
      return MoreObjects.toStringHelper("EnclosedUseCase")
          .omitNullValues()
          .add("name", name)
          .toString();
    }
  }
}
