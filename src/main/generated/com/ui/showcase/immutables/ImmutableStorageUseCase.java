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
 * Immutable implementation of {@link StorageUseCase}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStorageUseCase.builder()}.
 */
@Generated(from = "StorageUseCase", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableStorageUseCase implements StorageUseCase {
  private final String id;
  private final String name;

  private ImmutableStorageUseCase(String id, String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @Override
  public String id() {
    return id;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StorageUseCase#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStorageUseCase withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableStorageUseCase(newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link StorageUseCase#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableStorageUseCase withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableStorageUseCase(this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStorageUseCase} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStorageUseCase
        && equalTo((ImmutableStorageUseCase) another);
  }

  private boolean equalTo(ImmutableStorageUseCase another) {
    return id.equals(another.id)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code StorageUseCase} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("StorageUseCase")
        .omitNullValues()
        .add("id", id)
        .add("name", name)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link StorageUseCase} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StorageUseCase instance
   */
  public static ImmutableStorageUseCase copyOf(StorageUseCase instance) {
    if (instance instanceof ImmutableStorageUseCase) {
      return (ImmutableStorageUseCase) instance;
    }
    return ImmutableStorageUseCase.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableStorageUseCase ImmutableStorageUseCase}.
   * <pre>
   * ImmutableStorageUseCase.builder()
   *    .id(String) // required {@link StorageUseCase#id() id}
   *    .name(String) // required {@link StorageUseCase#name() name}
   *    .build();
   * </pre>
   * @return A new ImmutableStorageUseCase builder
   */
  public static ImmutableStorageUseCase.Builder builder() {
    return new ImmutableStorageUseCase.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableStorageUseCase ImmutableStorageUseCase}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StorageUseCase", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String id;
    private @Nullable String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code StorageUseCase} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(StorageUseCase instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      name(instance.name());
      return this;
    }

    /**
     * Initializes the value for the {@link StorageUseCase#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder id(String id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link StorageUseCase#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableStorageUseCase ImmutableStorageUseCase}.
     * @return An immutable instance of StorageUseCase
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableStorageUseCase build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableStorageUseCase(id, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build StorageUseCase, some of required attributes are not set " + attributes;
    }
  }
}
