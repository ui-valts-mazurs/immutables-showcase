package com.ui.showcase.immutables;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link LegacyUseCase}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLegacyUseCase.builder()}.
 */
@Generated(from = "LegacyUseCase", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableLegacyUseCase implements LegacyUseCase {
  private final String id;
  private final @Nullable String nullableText;
  private final @Nullable Optional<String> optionalText;
  private final List<String> textList;

  private ImmutableLegacyUseCase(
      String id,
      @Nullable String nullableText,
      @Nullable Optional<String> optionalText,
      List<String> textList) {
    this.id = id;
    this.nullableText = nullableText;
    this.optionalText = optionalText;
    this.textList = textList;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @Override
  public String id() {
    return id;
  }

  /**
   * @return The value of the {@code nullableText} attribute
   */
  @Override
  public @Nullable String nullableText() {
    return nullableText;
  }

  /**
   * @return The value of the {@code optionalText} attribute
   */
  @Override
  public @Nullable Optional<String> optionalText() {
    return optionalText;
  }

  /**
   * @return The value of the {@code textList} attribute
   */
  @Override
  public List<String> textList() {
    return textList;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LegacyUseCase#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLegacyUseCase withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableLegacyUseCase(newValue, this.nullableText, this.optionalText, this.textList);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LegacyUseCase#nullableText() nullableText} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nullableText (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLegacyUseCase withNullableText(@Nullable String value) {
    if (Objects.equals(this.nullableText, value)) return this;
    return new ImmutableLegacyUseCase(this.id, value, this.optionalText, this.textList);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link LegacyUseCase#optionalText() optionalText} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for optionalText (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLegacyUseCase withOptionalText(@Nullable Optional<String> value) {
    if (Objects.equals(this.optionalText, value)) return this;
    return new ImmutableLegacyUseCase(this.id, this.nullableText, value, this.textList);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LegacyUseCase#textList() textList}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLegacyUseCase withTextList(String... elements) {
    List<String> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), false, true));
    return new ImmutableLegacyUseCase(this.id, this.nullableText, this.optionalText, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link LegacyUseCase#textList() textList}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of textList elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLegacyUseCase withTextList(Iterable<String> elements) {
    if (this.textList == elements) return this;
    List<String> newValue = createUnmodifiableList(false, createSafeList(elements, false, true));
    return new ImmutableLegacyUseCase(this.id, this.nullableText, this.optionalText, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLegacyUseCase} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLegacyUseCase
        && equalTo((ImmutableLegacyUseCase) another);
  }

  private boolean equalTo(ImmutableLegacyUseCase another) {
    return id.equals(another.id)
        && Objects.equals(nullableText, another.nullableText)
        && Objects.equals(optionalText, another.optionalText)
        && textList.equals(another.textList);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code nullableText}, {@code optionalText}, {@code textList}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + Objects.hashCode(nullableText);
    h += (h << 5) + Objects.hashCode(optionalText);
    h += (h << 5) + textList.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code LegacyUseCase} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "LegacyUseCase{"
        + "id=" + id
        + ", nullableText=" + nullableText
        + ", optionalText=" + optionalText
        + ", textList=" + textList
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link LegacyUseCase} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable LegacyUseCase instance
   */
  public static ImmutableLegacyUseCase copyOf(LegacyUseCase instance) {
    if (instance instanceof ImmutableLegacyUseCase) {
      return (ImmutableLegacyUseCase) instance;
    }
    return ImmutableLegacyUseCase.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableLegacyUseCase ImmutableLegacyUseCase}.
   * <pre>
   * ImmutableLegacyUseCase.builder()
   *    .id(String) // required {@link LegacyUseCase#id() id}
   *    .nullableText(String | null) // nullable {@link LegacyUseCase#nullableText() nullableText}
   *    .optionalText(Optional&amp;lt;String&amp;gt; | null) // nullable {@link LegacyUseCase#optionalText() optionalText}
   *    .addTextList|addAllTextList(String) // {@link LegacyUseCase#textList() textList} elements
   *    .build();
   * </pre>
   * @return A new ImmutableLegacyUseCase builder
   */
  public static ImmutableLegacyUseCase.Builder builder() {
    return new ImmutableLegacyUseCase.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableLegacyUseCase ImmutableLegacyUseCase}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "LegacyUseCase", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String id;
    private @Nullable String nullableText;
    private @Nullable Optional<String> optionalText;
    private List<String> textList = new ArrayList<String>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code LegacyUseCase} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(LegacyUseCase instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      @Nullable String nullableTextValue = instance.nullableText();
      if (nullableTextValue != null) {
        nullableText(nullableTextValue);
      }
      @Nullable Optional<String> optionalTextValue = instance.optionalText();
      if (optionalTextValue != null) {
        optionalText(optionalTextValue);
      }
      addAllTextList(instance.textList());
      return this;
    }

    /**
     * Initializes the value for the {@link LegacyUseCase#id() id} attribute.
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
     * Initializes the value for the {@link LegacyUseCase#nullableText() nullableText} attribute.
     * @param nullableText The value for nullableText (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder nullableText(@Nullable String nullableText) {
      this.nullableText = nullableText;
      return this;
    }

    /**
     * Initializes the value for the {@link LegacyUseCase#optionalText() optionalText} attribute.
     * @param optionalText The value for optionalText (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder optionalText(@Nullable Optional<String> optionalText) {
      this.optionalText = optionalText;
      return this;
    }

    /**
     * Adds one element to {@link LegacyUseCase#textList() textList} list.
     * @param element A textList element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addTextList(@Nullable String element) {
      if (element != null) this.textList.add(element);
      return this;
    }

    /**
     * Adds elements to {@link LegacyUseCase#textList() textList} list.
     * @param elements An array of textList elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addTextList(String... elements) {
      for (String element : elements) {
        if (element != null) this.textList.add(element);
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link LegacyUseCase#textList() textList} list.
     * @param elements An iterable of textList elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder textList(Iterable<String> elements) {
      this.textList.clear();
      return addAllTextList(elements);
    }

    /**
     * Adds elements to {@link LegacyUseCase#textList() textList} list.
     * @param elements An iterable of textList elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllTextList(Iterable<String> elements) {
      for (String element : elements) {
        if (element != null) this.textList.add(element);
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableLegacyUseCase ImmutableLegacyUseCase}.
     * @return An immutable instance of LegacyUseCase
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableLegacyUseCase build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableLegacyUseCase(id, nullableText, optionalText, createUnmodifiableList(true, textList));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      return "Cannot build LegacyUseCase, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
