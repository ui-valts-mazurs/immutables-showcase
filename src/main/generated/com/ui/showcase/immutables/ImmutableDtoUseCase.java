package com.ui.showcase.immutables;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
 * Immutable implementation of {@link DtoUseCase}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDtoUseCase.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableDtoUseCase.of()}.
 */
@Generated(from = "DtoUseCase", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableDtoUseCase implements DtoUseCase {
  private final String name;

  private ImmutableDtoUseCase(String name) {
    this.name = Objects.requireNonNull(name, "name");
  }

  private ImmutableDtoUseCase(ImmutableDtoUseCase original, String name) {
    this.name = name;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("custom_name")
  @Override
  public String name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DtoUseCase#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDtoUseCase withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableDtoUseCase(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDtoUseCase} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDtoUseCase
        && equalTo((ImmutableDtoUseCase) another);
  }

  private boolean equalTo(ImmutableDtoUseCase another) {
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
   * Prints the immutable value {@code DtoUseCase} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("DtoUseCase")
        .omitNullValues()
        .add("name", name)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DtoUseCase", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DtoUseCase {
    @Nullable String name;
    @JsonProperty("custom_name")
    public void setName(String name) {
      this.name = name;
    }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDtoUseCase fromJson(Json json) {
    ImmutableDtoUseCase.Builder builder = ImmutableDtoUseCase.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code DtoUseCase} instance.
   * @param name The value for the {@code name} attribute
   * @return An immutable DtoUseCase instance
   */
  public static ImmutableDtoUseCase of(String name) {
    return new ImmutableDtoUseCase(name);
  }

  /**
   * Creates an immutable copy of a {@link DtoUseCase} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DtoUseCase instance
   */
  public static ImmutableDtoUseCase copyOf(DtoUseCase instance) {
    if (instance instanceof ImmutableDtoUseCase) {
      return (ImmutableDtoUseCase) instance;
    }
    return ImmutableDtoUseCase.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDtoUseCase ImmutableDtoUseCase}.
   * <pre>
   * ImmutableDtoUseCase.builder()
   *    .name(String) // required {@link DtoUseCase#name() name}
   *    .build();
   * </pre>
   * @return A new ImmutableDtoUseCase builder
   */
  public static ImmutableDtoUseCase.Builder builder() {
    return new ImmutableDtoUseCase.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDtoUseCase ImmutableDtoUseCase}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DtoUseCase", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DtoUseCase} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(DtoUseCase instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      return this;
    }

    /**
     * Initializes the value for the {@link DtoUseCase#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("custom_name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableDtoUseCase ImmutableDtoUseCase}.
     * @return An immutable instance of DtoUseCase
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDtoUseCase build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDtoUseCase(null, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build DtoUseCase, some of required attributes are not set " + attributes;
    }
  }
}
