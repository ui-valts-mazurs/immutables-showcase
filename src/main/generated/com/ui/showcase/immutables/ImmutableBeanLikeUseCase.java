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
 * Immutable implementation of {@link BeanLikeUseCase}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBeanLikeUseCase.builder()}.
 */
@Generated(from = "BeanLikeUseCase", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableBeanLikeUseCase implements BeanLikeUseCase {
  private final String name;

  private ImmutableBeanLikeUseCase(String name) {
    this.name = name;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BeanLikeUseCase#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBeanLikeUseCase withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableBeanLikeUseCase(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBeanLikeUseCase} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBeanLikeUseCase
        && equalTo((ImmutableBeanLikeUseCase) another);
  }

  private boolean equalTo(ImmutableBeanLikeUseCase another) {
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
   * Prints the immutable value {@code BeanLikeUseCase} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("BeanLikeUseCase")
        .omitNullValues()
        .add("name", name)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link BeanLikeUseCase} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BeanLikeUseCase instance
   */
  public static ImmutableBeanLikeUseCase copyOf(BeanLikeUseCase instance) {
    if (instance instanceof ImmutableBeanLikeUseCase) {
      return (ImmutableBeanLikeUseCase) instance;
    }
    return ImmutableBeanLikeUseCase.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBeanLikeUseCase ImmutableBeanLikeUseCase}.
   * <pre>
   * ImmutableBeanLikeUseCase.builder()
   *    .name(String) // required {@link BeanLikeUseCase#getName() name}
   *    .build();
   * </pre>
   * @return A new ImmutableBeanLikeUseCase builder
   */
  public static ImmutableBeanLikeUseCase.Builder builder() {
    return new ImmutableBeanLikeUseCase.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBeanLikeUseCase ImmutableBeanLikeUseCase}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "BeanLikeUseCase", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ModifiableBeanLikeUseCase} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(ModifiableBeanLikeUseCase instance) {
      Objects.requireNonNull(instance, "instance");
      if (instance.nameIsSet()) {
        name(instance.getName());
      }
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code BeanLikeUseCase} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(BeanLikeUseCase instance) {
      Objects.requireNonNull(instance, "instance");
      if (instance instanceof ModifiableBeanLikeUseCase) {
        return from((ModifiableBeanLikeUseCase) instance);
      }
      name(instance.getName());
      return this;
    }

    /**
     * Initializes the value for the {@link BeanLikeUseCase#getName() name} attribute.
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
     * Builds a new {@link ImmutableBeanLikeUseCase ImmutableBeanLikeUseCase}.
     * @return An immutable instance of BeanLikeUseCase
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBeanLikeUseCase build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBeanLikeUseCase(name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build BeanLikeUseCase, some of required attributes are not set " + attributes;
    }
  }
}
