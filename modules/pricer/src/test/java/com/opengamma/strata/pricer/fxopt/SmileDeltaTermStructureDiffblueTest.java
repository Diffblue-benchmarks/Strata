package com.opengamma.strata.pricer.fxopt;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SmileDeltaTermStructureDiffblueTest {
  /**
   * Test {@link SmileDeltaTermStructure#getSmileCount()}.
   *
   * <p>Method under test: {@link SmileDeltaTermStructure#getSmileCount()}
   */
  @Test
  @DisplayName("Test getSmileCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SmileDeltaTermStructure.getSmileCount()"})
  void testGetSmileCount() {
    // Arrange, Act and Assert
    assertEquals(5, FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().getSmileCount());
  }

  /**
   * Test {@link SmileDeltaTermStructure#getStrikeCount()}.
   *
   * <p>Method under test: {@link SmileDeltaTermStructure#getStrikeCount()}
   */
  @Test
  @DisplayName("Test getStrikeCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SmileDeltaTermStructure.getStrikeCount()"})
  void testGetStrikeCount() {
    // Arrange, Act and Assert
    assertEquals(5, FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().getStrikeCount());
  }

  /**
   * Test {@link SmileDeltaTermStructure#getDelta()}.
   *
   * <p>Method under test: {@link SmileDeltaTermStructure#getDelta()}
   */
  @Test
  @DisplayName("Test getDelta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray SmileDeltaTermStructure.getDelta()"})
  void testGetDelta() {
    // Arrange and Act
    DoubleArray actualDelta = FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().getDelta();

    // Assert
    assertEquals(0.1d, actualDelta.min());
    List<Double> toListResult = actualDelta.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.1d, toListResult.get(0).doubleValue());
    assertEquals(0.25d, actualDelta.max());
    assertEquals(0.25d, toListResult.get(1).doubleValue());
    assertEquals(0.35d, actualDelta.sum());
    assertEquals(1, actualDelta.dimensions());
    assertEquals(2, actualDelta.size());
    assertFalse(actualDelta.isEmpty());
    assertArrayEquals(new double[] {0.1d, 0.25d}, actualDelta.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SmileDeltaTermStructure#getExpiryTenors()}.
   *
   * <p>Method under test: {@link SmileDeltaTermStructure#getExpiryTenors()}
   */
  @Test
  @DisplayName("Test getExpiryTenors()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SmileDeltaTermStructure.getExpiryTenors()"})
  void testGetExpiryTenors() {
    // Arrange and Act
    List<Optional<Tenor>> actualExpiryTenors =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().getExpiryTenors();

    // Assert
    assertEquals(5, actualExpiryTenors.size());
    Optional<Tenor> getResult = actualExpiryTenors.get(0);
    assertFalse(getResult.isPresent());
    assertSame(getResult, actualExpiryTenors.get(1));
    assertSame(getResult, actualExpiryTenors.get(2));
    assertSame(getResult, actualExpiryTenors.get(3));
    assertSame(getResult, actualExpiryTenors.get(4));
  }

  /**
   * Test {@link SmileDeltaTermStructure#getDeltaFull()}.
   *
   * <p>Method under test: {@link SmileDeltaTermStructure#getDeltaFull()}
   */
  @Test
  @DisplayName("Test getDeltaFull()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray SmileDeltaTermStructure.getDeltaFull()"})
  void testGetDeltaFull() {
    // Arrange and Act
    DoubleArray actualDeltaFull =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().getDeltaFull();

    // Assert
    assertEquals(0.1d, actualDeltaFull.min());
    List<Double> toListResult = actualDeltaFull.toList();
    assertEquals(5, toListResult.size());
    assertEquals(0.1d, toListResult.get(0).doubleValue());
    assertEquals(0.25d, toListResult.get(1).doubleValue());
    assertEquals(0.5d, toListResult.get(2).doubleValue());
    assertEquals(0.75d, toListResult.get(3).doubleValue());
    assertEquals(0.9d, actualDeltaFull.max());
    assertEquals(0.9d, toListResult.get(4).doubleValue());
    assertEquals(1, actualDeltaFull.dimensions());
    assertEquals(2.5d, actualDeltaFull.sum());
    assertEquals(5, actualDeltaFull.size());
    assertFalse(actualDeltaFull.isEmpty());
    assertArrayEquals(
        new double[] {0.1d, 0.25d, 0.5d, 0.75d, 0.9d}, actualDeltaFull.toArrayUnsafe(), 0.0);
  }
}
