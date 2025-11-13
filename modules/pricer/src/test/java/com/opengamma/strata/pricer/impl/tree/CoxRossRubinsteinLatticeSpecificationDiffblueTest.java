package com.opengamma.strata.pricer.impl.tree;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CoxRossRubinsteinLatticeSpecificationDiffblueTest {
  /**
   * Test {@link CoxRossRubinsteinLatticeSpecification#getParametersTrinomial(double, double,
   * double)}.
   *
   * <p>Method under test: {@link
   * CoxRossRubinsteinLatticeSpecification#getParametersTrinomial(double, double, double)}
   */
  @Test
  @DisplayName("Test getParametersTrinomial(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray CoxRossRubinsteinLatticeSpecification.getParametersTrinomial(double, double, double)"
  })
  void testGetParametersTrinomial() {
    // Arrange and Act
    DoubleArray actualParametersTrinomial =
        new CoxRossRubinsteinLatticeSpecification().getParametersTrinomial(10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-2.0334734677583508E24d, actualParametersTrinomial.min());
    List<Double> toListResult = actualParametersTrinomial.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-2.0334734677583508E24d, toListResult.get(4).doubleValue());
    assertEquals(1, actualParametersTrinomial.dimensions());
    assertEquals(1.0167367338781669E24d, toListResult.get(5).doubleValue());
    assertEquals(1.0167367338801838E24d, actualParametersTrinomial.max());
    assertEquals(1.0167367338801838E24d, toListResult.get(3).doubleValue());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(2.643867436107327E19d, actualParametersTrinomial.sum());
    assertEquals(2.643867436123257E19d, toListResult.get(0).doubleValue());
    assertEquals(3.782337897645561E-20d, toListResult.get(2).doubleValue());
    assertEquals(6, actualParametersTrinomial.size());
    assertFalse(actualParametersTrinomial.isEmpty());
    assertArrayEquals(
        new double[] {
          2.643867436123257E19d,
          1.0d,
          3.782337897645561E-20d,
          1.0167367338801838E24d,
          -2.0334734677583508E24d,
          1.0167367338781669E24d
        },
        actualParametersTrinomial.toArrayUnsafe(),
        0.0);
  }
}
