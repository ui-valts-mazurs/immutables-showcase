package com.ui.showcase.immutables;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
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
 * Immutable implementation of {@link TypicalUseCase}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTypicalUseCase.builder()}.
 */
@Generated(from = "TypicalUseCase", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableTypicalUseCase implements TypicalUseCase {
  private final String id;
  private final String name;
  private final Long someNumber;
  private final @Nullable String optionalText;
  private final ImmutableList<String> textList;
  private final String internalId;
  private transient final String description;

  private ImmutableTypicalUseCase(ImmutableTypicalUseCase.Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.someNumber = builder.someNumber;
    this.optionalText = builder.optionalText;
    this.textList = builder.textList.build();
    if (builder.internalId != null) {
      initShim.internalId(builder.internalId);
    }
    this.internalId = initShim.internalId();
    this.description = initShim.description();
    this.initShim = null;
  }

  private ImmutableTypicalUseCase(
      String id,
      String name,
      Long someNumber,
      @Nullable String optionalText,
      ImmutableList<String> textList,
      String internalId) {
    this.id = id;
    this.name = name;
    this.someNumber = someNumber;
    this.optionalText = optionalText;
    this.textList = textList;
    initShim.internalId(internalId);
    this.internalId = initShim.internalId();
    this.description = initShim.description();
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  @SuppressWarnings("Immutable")
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "TypicalUseCase", generator = "Immutables")
  private final class InitShim {
    private byte internalIdBuildStage = STAGE_UNINITIALIZED;
    private String internalId;

    String internalId() {
      if (internalIdBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (internalIdBuildStage == STAGE_UNINITIALIZED) {
        internalIdBuildStage = STAGE_INITIALIZING;
        this.internalId = Objects.requireNonNull(internalIdInitialize(), "internalId");
        internalIdBuildStage = STAGE_INITIALIZED;
      }
      return this.internalId;
    }

    void internalId(String internalId) {
      this.internalId = internalId;
      internalIdBuildStage = STAGE_INITIALIZED;
    }

    private byte descriptionBuildStage = STAGE_UNINITIALIZED;
    private String description;

    String description() {
      if (descriptionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (descriptionBuildStage == STAGE_UNINITIALIZED) {
        descriptionBuildStage = STAGE_INITIALIZING;
        this.description = Objects.requireNonNull(descriptionInitialize(), "description");
        descriptionBuildStage = STAGE_INITIALIZED;
      }
      return this.description;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (internalIdBuildStage == STAGE_INITIALIZING) attributes.add("internalId");
      if (descriptionBuildStage == STAGE_INITIALIZING) attributes.add("description");
      return "Cannot build TypicalUseCase, attribute initializers form cycle " + attributes;
    }
  }

  private String internalIdInitialize() {
    return TypicalUseCase.super.internalId();
  }

  private String descriptionInitialize() {
    return TypicalUseCase.super.description();
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
   * @return The value of the {@code someNumber} attribute
   */
  @Override
  public Long someNumber() {
    return someNumber;
  }

  /**
   * @return The value of the {@code optionalText} attribute
   */
  @Override
  public Optional<String> optionalText() {
    return Optional.ofNullable(optionalText);
  }

  /**
   * @return The value of the {@code textList} attribute
   */
  @Override
  public ImmutableList<String> textList() {
    return textList;
  }

  /**
   * @return The value of the {@code internalId} attribute
   */
  @Override
  public String internalId() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.internalId()
        : this.internalId;
  }

  /**
   * @return The computed-at-construction value of the {@code description} attribute
   */
  @Override
  public String description() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.description()
        : this.description;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TypicalUseCase#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTypicalUseCase withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableTypicalUseCase(newValue, this.name, this.someNumber, this.optionalText, this.textList, this.internalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TypicalUseCase#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTypicalUseCase withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableTypicalUseCase(this.id, newValue, this.someNumber, this.optionalText, this.textList, this.internalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TypicalUseCase#someNumber() someNumber} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for someNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTypicalUseCase withSomeNumber(Long value) {
    Long newValue = Objects.requireNonNull(value, "someNumber");
    if (this.someNumber.equals(newValue)) return this;
    return new ImmutableTypicalUseCase(this.id, this.name, newValue, this.optionalText, this.textList, this.internalId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TypicalUseCase#optionalText() optionalText} attribute.
   * @param value The value for optionalText
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTypicalUseCase withOptionalText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "optionalText");
    if (Objects.equals(this.optionalText, newValue)) return this;
    return new ImmutableTypicalUseCase(this.id, this.name, this.someNumber, newValue, this.textList, this.internalId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TypicalUseCase#optionalText() optionalText} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for optionalText
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTypicalUseCase withOptionalText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.optionalText, value)) return this;
    return new ImmutableTypicalUseCase(this.id, this.name, this.someNumber, value, this.textList, this.internalId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TypicalUseCase#textList() textList}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTypicalUseCase withTextList(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTypicalUseCase(this.id, this.name, this.someNumber, this.optionalText, newValue, this.internalId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TypicalUseCase#textList() textList}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of textList elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTypicalUseCase withTextList(Iterable<String> elements) {
    if (this.textList == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTypicalUseCase(this.id, this.name, this.someNumber, this.optionalText, newValue, this.internalId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TypicalUseCase#internalId() internalId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for internalId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTypicalUseCase withInternalId(String value) {
    String newValue = Objects.requireNonNull(value, "internalId");
    if (this.internalId.equals(newValue)) return this;
    return new ImmutableTypicalUseCase(this.id, this.name, this.someNumber, this.optionalText, this.textList, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTypicalUseCase} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTypicalUseCase
        && equalTo((ImmutableTypicalUseCase) another);
  }

  private boolean equalTo(ImmutableTypicalUseCase another) {
    return id.equals(another.id)
        && name.equals(another.name)
        && someNumber.equals(another.someNumber)
        && Objects.equals(optionalText, another.optionalText)
        && textList.equals(another.textList)
        && internalId.equals(another.internalId)
        && description.equals(another.description);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code name}, {@code someNumber}, {@code optionalText}, {@code textList}, {@code internalId}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + someNumber.hashCode();
    h += (h << 5) + Objects.hashCode(optionalText);
    h += (h << 5) + textList.hashCode();
    h += (h << 5) + internalId.hashCode();
    h += (h << 5) + description.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TypicalUseCase} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TypicalUseCase")
        .omitNullValues()
        .add("id", id)
        .add("name", name)
        .add("someNumber", someNumber)
        .add("optionalText", optionalText)
        .add("textList", textList)
        .add("internalId", internalId)
        .add("description", description)
        .toString();
  }

  @SuppressWarnings("Immutable")
  private transient volatile long lazyInitBitmap;

  private static final long JOINED_TEXT_LAZY_INIT_BIT = 0x1L;

  @SuppressWarnings("Immutable")
  private transient String joinedText;

  /**
   * {@inheritDoc}
   * <p>
   * Returns a lazily initialized value of the {@link TypicalUseCase#joinedText() joinedText} attribute.
   * Initialized once and only once and stored for subsequent access with proper synchronization.
   * In case of any exception or error thrown by the lazy value initializer,
   * the result will not be memoised (i.e. remembered) and on next call computation
   * will be attempted again.
   * @return A lazily initialized value of the {@code joinedText} attribute
   */
  @Override
  public String joinedText() {
    if ((lazyInitBitmap & JOINED_TEXT_LAZY_INIT_BIT) == 0) {
      synchronized (this) {
        if ((lazyInitBitmap & JOINED_TEXT_LAZY_INIT_BIT) == 0) {
          this.joinedText = Objects.requireNonNull(TypicalUseCase.super.joinedText(), "joinedText");
          lazyInitBitmap |= JOINED_TEXT_LAZY_INIT_BIT;
        }
      }
    }
    return joinedText;
  }

  /**
   * Creates an immutable copy of a {@link TypicalUseCase} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TypicalUseCase instance
   */
  public static ImmutableTypicalUseCase copyOf(TypicalUseCase instance) {
    if (instance instanceof ImmutableTypicalUseCase) {
      return (ImmutableTypicalUseCase) instance;
    }
    return ImmutableTypicalUseCase.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTypicalUseCase ImmutableTypicalUseCase}.
   * <pre>
   * ImmutableTypicalUseCase.builder()
   *    .id(String) // required {@link TypicalUseCase#id() id}
   *    .name(String) // required {@link TypicalUseCase#name() name}
   *    .someNumber(Long) // required {@link TypicalUseCase#someNumber() someNumber}
   *    .optionalText(String) // optional {@link TypicalUseCase#optionalText() optionalText}
   *    .addTextList|addAllTextList(String) // {@link TypicalUseCase#textList() textList} elements
   *    .internalId(String) // optional {@link TypicalUseCase#internalId() internalId}
   *    .build();
   * </pre>
   * @return A new ImmutableTypicalUseCase builder
   */
  public static ImmutableTypicalUseCase.Builder builder() {
    return new ImmutableTypicalUseCase.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTypicalUseCase ImmutableTypicalUseCase}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TypicalUseCase", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long INIT_BIT_SOME_NUMBER = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String id;
    private @Nullable String name;
    private @Nullable Long someNumber;
    private @Nullable String optionalText;
    private ImmutableList.Builder<String> textList = ImmutableList.builder();
    private @Nullable String internalId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TypicalUseCase} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(TypicalUseCase instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      name(instance.name());
      someNumber(instance.someNumber());
      Optional<String> optionalTextOptional = instance.optionalText();
      if (optionalTextOptional.isPresent()) {
        optionalText(optionalTextOptional);
      }
      addAllTextList(instance.textList());
      internalId(instance.internalId());
      return this;
    }

    /**
     * Initializes the value for the {@link TypicalUseCase#id() id} attribute.
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
     * Initializes the value for the {@link TypicalUseCase#name() name} attribute.
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
     * Initializes the value for the {@link TypicalUseCase#someNumber() someNumber} attribute.
     * @param someNumber The value for someNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder someNumber(Long someNumber) {
      this.someNumber = Objects.requireNonNull(someNumber, "someNumber");
      initBits &= ~INIT_BIT_SOME_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link TypicalUseCase#optionalText() optionalText} to optionalText.
     * @param optionalText The value for optionalText
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder optionalText(String optionalText) {
      this.optionalText = Objects.requireNonNull(optionalText, "optionalText");
      return this;
    }

    /**
     * Initializes the optional value {@link TypicalUseCase#optionalText() optionalText} to optionalText.
     * @param optionalText The value for optionalText
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder optionalText(Optional<String> optionalText) {
      this.optionalText = optionalText.orElse(null);
      return this;
    }

    /**
     * Adds one element to {@link TypicalUseCase#textList() textList} list.
     * @param element A textList element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addTextList(String element) {
      this.textList.add(element);
      return this;
    }

    /**
     * Adds elements to {@link TypicalUseCase#textList() textList} list.
     * @param elements An array of textList elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addTextList(String... elements) {
      this.textList.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link TypicalUseCase#textList() textList} list.
     * @param elements An iterable of textList elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder textList(Iterable<String> elements) {
      this.textList = ImmutableList.builder();
      return addAllTextList(elements);
    }

    /**
     * Adds elements to {@link TypicalUseCase#textList() textList} list.
     * @param elements An iterable of textList elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllTextList(Iterable<String> elements) {
      this.textList.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link TypicalUseCase#internalId() internalId} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link TypicalUseCase#internalId() internalId}.</em>
     * @param internalId The value for internalId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder internalId(String internalId) {
      this.internalId = Objects.requireNonNull(internalId, "internalId");
      return this;
    }

    /**
     * Builds a new {@link ImmutableTypicalUseCase ImmutableTypicalUseCase}.
     * @return An immutable instance of TypicalUseCase
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTypicalUseCase build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTypicalUseCase(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_SOME_NUMBER) != 0) attributes.add("someNumber");
      return "Cannot build TypicalUseCase, some of required attributes are not set " + attributes;
    }
  }
}
