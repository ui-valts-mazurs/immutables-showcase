package com.ui.showcase.immutables;

import com.ui.showcase.immutables.TupleUseCase.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class TupleUseCaseTest {

    private static final int X_COORDINATE = 1;
    private static final int Y_COORDINATE = 2;

    @Test
    void createsPoint() {
        Point point = PointTuple.of(X_COORDINATE, Y_COORDINATE);

        assertThat(point.xCoordinate()).isEqualTo(X_COORDINATE);
        assertThat(point.yCoordinate()).isEqualTo(Y_COORDINATE);
    }
}