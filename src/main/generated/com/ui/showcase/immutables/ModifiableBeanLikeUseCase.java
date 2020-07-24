package com.ui.showcase.immutables;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * A modifiable implementation of the {@link BeanLikeUseCase BeanLikeUseCase} type.
 * <p>Use the {@link #create()} static factory methods to create new instances.
 * Use the {@link #toImmutable()} method to convert to canonical immutable instances.
 * <p><em>ModifiableBeanLikeUseCase is not thread-safe</em>
 * @see ImmutableBeanLikeUseCase
 */
@Generated(from = "BeanLikeUseCase", generator = "Modifiables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated({"Modifiables.generator", "BeanLikeUseCase"})
@NotThreadSafe
public final class ModifiableBeanLikeUseCase implements BeanLikeUseCase {
  private static final long INIT_BIT_NAME = 0x1L;
  private long initBits = 0x1L;

  private String name;

  private ModifiableBeanLikeUseCase() {}

  /**
   * Construct a modifiable instance of {@code BeanLikeUseCase}.
   * @return A new modifiable instance
   */
  public static ModifiableBeanLikeUseCase create() {
    return new ModifiableBeanLikeUseCase();
  }

  /**
   * @return value of {@code name} attribute
   */
  @Override
  public final String getName() {
    if (!nameIsSet()) {
      checkRequiredAttributes();
    }
    return name;
  }

  /**
   * Clears the object by setting all attributes to their initial values.
   * @return {@code this} for use in a chained invocation
   */
  @CanIgnoreReturnValue
  public ModifiableBeanLikeUseCase clear() {
    initBits = 0x1L;
    name = null;
    return this;
  }

  /**
   * Fill this modifiable instance with attribute values from the provided {@link BeanLikeUseCase} instance.
   * Regular attribute values will be overridden, i.e. replaced with ones of an instance.
   * Any of the instance's absent optional values will not be copied (will not override current values).
   * @param instance The instance from which to copy values
   * @return {@code this} for use in a chained invocation
   */
  public ModifiableBeanLikeUseCase from(BeanLikeUseCase instance) {
    Objects.requireNonNull(instance, "instance");
    if (instance instanceof ModifiableBeanLikeUseCase) {
      from((ModifiableBeanLikeUseCase) instance);
      return this;
    }
    setName(instance.getName());
    return this;
  }

  /**
   * Fill this modifiable instance with attribute values from the provided {@link BeanLikeUseCase} instance.
   * Regular attribute values will be overridden, i.e. replaced with ones of an instance.
   * Any of the instance's absent optional values will not be copied (will not override current values).
   * @param instance The instance from which to copy values
   * @return {@code this} for use in a chained invocation
   */
  public ModifiableBeanLikeUseCase from(ModifiableBeanLikeUseCase instance) {
    Objects.requireNonNull(instance, "instance");
    if (instance.nameIsSet()) {
      setName(instance.getName());
    }
    return this;
  }

  /**
   * Assigns a value to the {@link BeanLikeUseCase#getName() name} attribute.
   * @param name The value for name
   * @return {@code this} for use in a chained invocation
   */
  @CanIgnoreReturnValue
  public ModifiableBeanLikeUseCase setName(String name) {
    this.name = Objects.requireNonNull(name, "name");
    initBits &= ~INIT_BIT_NAME;
    return this;
  }

  /**
   * Returns {@code true} if the required attribute {@link BeanLikeUseCase#getName() name} is set.
   * @return {@code true} if set
   */
  public final boolean nameIsSet() {
    return (initBits & INIT_BIT_NAME) == 0;
  }


  /**
   * Reset an attribute to its initial value.
   * @return {@code this} for use in a chained invocation
   */
  @CanIgnoreReturnValue
  public final ModifiableBeanLikeUseCase unsetName() {
    initBits |= INIT_BIT_NAME;
    name = null;
    return this;
  }

  /**
   * Returns {@code true} if all required attributes are set, indicating that the object is initialized.
   * @return {@code true} if set
   */
  public final boolean isInitialized() {
    return initBits == 0;
  }

  private void checkRequiredAttributes() {
    if (!isInitialized()) {
      throw new IllegalStateException(formatRequiredAttributesMessage());
    }
  }

  private String formatRequiredAttributesMessage() {
    List<String> attributes = new ArrayList<>();
    if (!nameIsSet()) attributes.add("name");
    return "BeanLikeUseCase is not initialized, some of the required attributes are not set " + attributes;
  }

  /**
   * Converts to {@link ImmutableBeanLikeUseCase ImmutableBeanLikeUseCase}.
   * @return An immutable instance of BeanLikeUseCase
   */
  public final ImmutableBeanLikeUseCase toImmutable() {
    checkRequiredAttributes();
    return ImmutableBeanLikeUseCase.copyOf(this);
  }

  /**
   * This instance is equal to all instances of {@code ModifiableBeanLikeUseCase} that have equal attribute values.
   * An uninitialized instance is equal only to itself.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    if (!(another instanceof ModifiableBeanLikeUseCase)) return false;
    ModifiableBeanLikeUseCase other = (ModifiableBeanLikeUseCase) another;
    if (!isInitialized() || !other.isInitialized()) {
      return false;
    }
    return equalTo(other);
  }

  private boolean equalTo(ModifiableBeanLikeUseCase another) {
    return name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Generates a string representation of this {@code BeanLikeUseCase}.
   * If uninitialized, some attribute values may appear as question marks.
   * @return A string representation
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ModifiableBeanLikeUseCase")
        .add("name", nameIsSet() ? getName() : "?")
        .toString();
  }
}
