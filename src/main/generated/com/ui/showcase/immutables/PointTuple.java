package com.ui.showcase.immutables;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.Var;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link TupleUseCase.Point}.
 * <p>
 * Use the static factory method to create immutable instances:
 * {@code PointTuple.of()}.
 */
@Generated(from = "TupleUseCase.Point", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class PointTuple implements TupleUseCase.Point {
  private final int xCoordinate;
  private final int yCoordinate;

  private PointTuple(int xCoordinate, int yCoordinate) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
  }

  /**
   * @return The value of the {@code xCoordinate} attribute
   */
  @Override
  public int xCoordinate() {
    return xCoordinate;
  }

  /**
   * @return The value of the {@code yCoordinate} attribute
   */
  @Override
  public int yCoordinate() {
    return yCoordinate;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TupleUseCase.Point#xCoordinate() xCoordinate} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for xCoordinate
   * @return A modified copy of the {@code this} object
   */
  public final PointTuple withXCoordinate(int value) {
    if (this.xCoordinate == value) return this;
    return new PointTuple(value, this.yCoordinate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TupleUseCase.Point#yCoordinate() yCoordinate} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for yCoordinate
   * @return A modified copy of the {@code this} object
   */
  public final PointTuple withYCoordinate(int value) {
    if (this.yCoordinate == value) return this;
    return new PointTuple(this.xCoordinate, value);
  }

  /**
   * This instance is equal to all instances of {@code PointTuple} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof PointTuple
        && equalTo((PointTuple) another);
  }

  private boolean equalTo(PointTuple another) {
    return xCoordinate == another.xCoordinate
        && yCoordinate == another.yCoordinate;
  }

  /**
   * Computes a hash code from attributes: {@code xCoordinate}, {@code yCoordinate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + xCoordinate;
    h += (h << 5) + yCoordinate;
    return h;
  }

  /**
   * Prints the immutable value {@code Point} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Point")
        .omitNullValues()
        .add("xCoordinate", xCoordinate)
        .add("yCoordinate", yCoordinate)
        .toString();
  }

  /**
   * Construct a new immutable {@code Point} instance.
   * @param xCoordinate The value for the {@code xCoordinate} attribute
   * @param yCoordinate The value for the {@code yCoordinate} attribute
   * @return An immutable Point instance
   */
  public static PointTuple of(int xCoordinate, int yCoordinate) {
    return new PointTuple(xCoordinate, yCoordinate);
  }

  /**
   * Creates an immutable copy of a {@link TupleUseCase.Point} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Point instance
   */
  public static PointTuple copyOf(TupleUseCase.Point instance) {
    if (instance instanceof PointTuple) {
      return (PointTuple) instance;
    }
    return PointTuple.of(instance.xCoordinate(), instance.yCoordinate());
  }
}
