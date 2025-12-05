package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IndexAboveQuantileMethodDiffblueTest {
  /**
   * Test {@link IndexAboveQuantileMethod#index(double)}.
   *
   * <p>Method under test: {@link IndexAboveQuantileMethod#index(double)}
   */
  @Test
  @DisplayName("Test index(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IndexAboveQuantileMethod.index(double)"})
  void testIndex() {
    // Arrange, Act and Assert
    assertEquals(10, IndexAboveQuantileMethod.DEFAULT.index(10.0d));
  }

  /**
   * Test {@link IndexAboveQuantileMethod#sampleCorrection(int)}.
   *
   * <p>Method under test: {@link IndexAboveQuantileMethod#sampleCorrection(int)}
   */
  @Test
  @DisplayName("Test sampleCorrection(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IndexAboveQuantileMethod.sampleCorrection(int)"})
  void testSampleCorrection() {
    // Arrange, Act and Assert
    assertEquals(3, IndexAboveQuantileMethod.DEFAULT.sampleCorrection(3));
  }

  /**
   * Test {@link IndexAboveQuantileMethod#indexShift()}.
   *
   * <p>Method under test: {@link IndexAboveQuantileMethod#indexShift()}
   */
  @Test
  @DisplayName("Test indexShift()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double IndexAboveQuantileMethod.indexShift()"})
  void testIndexShift() {
    // Arrange, Act and Assert
    assertEquals(0.0d, IndexAboveQuantileMethod.DEFAULT.indexShift());
  }
}
