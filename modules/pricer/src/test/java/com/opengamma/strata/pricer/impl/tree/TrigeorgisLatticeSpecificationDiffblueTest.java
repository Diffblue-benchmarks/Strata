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

class TrigeorgisLatticeSpecificationDiffblueTest {
  /**
   * Test {@link TrigeorgisLatticeSpecification#getParametersTrinomial(double, double, double)}.
   *
   * <p>Method under test: {@link TrigeorgisLatticeSpecification#getParametersTrinomial(double,
   * double, double)}
   */
  @Test
  @DisplayName("Test getParametersTrinomial(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray TrigeorgisLatticeSpecification.getParametersTrinomial(double, double, double)"
  })
  void testGetParametersTrinomial() {
    // Arrange and Act
    DoubleArray actualParametersTrinomial =
        new TrigeorgisLatticeSpecification().getParametersTrinomial(10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-52.666666666666664d, actualParametersTrinomial.min());
    List<Double> toListResult = actualParametersTrinomial.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-52.666666666666664d, toListResult.get(4).doubleValue());
    assertEquals(1, actualParametersTrinomial.dimensions());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(1.6319677271903638E-24d, toListResult.get(2).doubleValue());
    assertEquals(23.181849616632224d, toListResult.get(3).doubleValue());
    assertEquals(30.48481705003444d, toListResult.get(5).doubleValue());
    assertEquals(6, actualParametersTrinomial.size());
    assertEquals(6.127572153167667E23d, actualParametersTrinomial.max());
    assertEquals(6.127572153167667E23d, actualParametersTrinomial.sum());
    assertEquals(6.127572153167667E23d, toListResult.get(0).doubleValue());
    assertFalse(actualParametersTrinomial.isEmpty());
    assertArrayEquals(
        new double[] {
          6.127572153167667E23d,
          1.0d,
          1.6319677271903638E-24d,
          23.181849616632224d,
          -52.666666666666664d,
          30.48481705003444d
        },
        actualParametersTrinomial.toArrayUnsafe(),
        0.0);
  }
}
