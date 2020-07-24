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
 * Builds instances of type {@link StorageUseCase StorageUseCase}.
 * Initialize attributes and then invoke the {@link #build()} method to create an
 * immutable instance.
 * <p><em>{@code StorageUseCaseBuilder} is not thread-safe and generally should not be stored in a field or collection,
 * but instead used immediately to create instances.</em>
 */
@Generated(from = "StorageUseCase", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@NotThreadSafe
public final class StorageUseCaseBuilder {
  private static final long INIT_BIT_ID = 0x1L;
  private static final long INIT_BIT_NAME = 0x2L;
  private long initBits = 0x3L;

  private @Nullable String id;
  private @Nullable String name;

  /**
   * Creates a builder for {@link StorageUseCase StorageUseCase} instances.
   * <pre>
   * new StorageUseCaseBuilder()
   *    .id(String) // required {@link StorageUseCase#id() id}
   *    .name(String) // required {@link StorageUseCase#name() name}
   *    .build();
   * </pre>
   */
  public StorageUseCaseBuilder() {
  }

  /**
   * Fill a builder with attribute values from the provided {@code StorageUseCase} instance.
   * Regular attribute values will be replaced with those from the given instance.
   * Absent optional values will not replace present values.
   * @param instance The instance from which to copy values
   * @return {@code this} builder for use in a chained invocation
   */
  @CanIgnoreReturnValue 
  public final StorageUseCaseBuilder from(StorageUseCase instance) {
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
  public final StorageUseCaseBuilder id(String id) {
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
  public final StorageUseCaseBuilder name(String name) {
    this.name = Objects.requireNonNull(name, "name");
    initBits &= ~INIT_BIT_NAME;
    return this;
  }

  /**
   * Builds a new {@link StorageUseCase StorageUseCase}.
   * @return An immutable instance of StorageUseCase
   * @throws java.lang.IllegalStateException if any required attributes are missing
   */
  public StorageUseCase build() {
    if (initBits != 0) {
      throw new IllegalStateException(formatRequiredAttributesMessage());
    }
    return new StorageUseCaseBuilder.ImmutableStorageUseCase(this);
  }

  private String formatRequiredAttributesMessage() {
    List<String> attributes = new ArrayList<>();
    if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
    if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
    return "Cannot build StorageUseCase, some of required attributes are not set " + attributes;
  }

  /**
   * Immutable implementation of {@link StorageUseCase}.
   * <p>
   * Use the builder to create immutable instances:
   * {@code new StorageUseCaseBuilder()}.
   */
  @Generated(from = "StorageUseCase", generator = "Immutables")
  @Immutable
  @CheckReturnValue
  private static final class ImmutableStorageUseCase implements StorageUseCase {
    private final String id;
    private final String name;

    private ImmutableStorageUseCase(StorageUseCaseBuilder builder) {
      this.id = builder.id;
      this.name = builder.name;
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
     * This instance is equal to all instances of {@code ImmutableStorageUseCase} that have equal attribute values.
     * @return {@code true} if {@code this} is equal to {@code another} instance
     */
    @Override
    public boolean equals(@Nullable Object another) {
      if (this == another) return true;
      return another instanceof StorageUseCaseBuilder.ImmutableStorageUseCase
          && equalTo((StorageUseCaseBuilder.ImmutableStorageUseCase) another);
    }

    private boolean equalTo(StorageUseCaseBuilder.ImmutableStorageUseCase another) {
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
  }
}
