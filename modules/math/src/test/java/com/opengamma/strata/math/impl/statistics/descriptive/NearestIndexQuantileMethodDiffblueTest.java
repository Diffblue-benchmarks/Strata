package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NearestIndexQuantileMethodDiffblueTest {
  /**
   * Test {@link NearestIndexQuantileMethod#index(double)}.
   *
   * <p>Method under test: {@link NearestIndexQuantileMethod#index(double)}
   */
  @Test
  @DisplayName("Test index(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int NearestIndexQuantileMethod.index(double)"})
  void testIndex() {
    // Arrange, Act and Assert
    assertEquals(10, NearestIndexQuantileMethod.DEFAULT.index(10.0d));
  }

  /**
   * Test {@link NearestIndexQuantileMethod#sampleCorrection(int)}.
   *
   * <p>Method under test: {@link NearestIndexQuantileMethod#sampleCorrection(int)}
   */
  @Test
  @DisplayName("Test sampleCorrection(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int NearestIndexQuantileMethod.sampleCorrection(int)"})
  void testSampleCorrection() {
    // Arrange, Act and Assert
    assertEquals(3, NearestIndexQuantileMethod.DEFAULT.sampleCorrection(3));
  }

  /**
   * Test {@link NearestIndexQuantileMethod#indexShift()}.
   *
   * <p>Method under test: {@link NearestIndexQuantileMethod#indexShift()}
   */
  @Test
  @DisplayName("Test indexShift()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NearestIndexQuantileMethod.indexShift()"})
  void testIndexShift() {
    // Arrange, Act and Assert
    assertEquals(0.5d, NearestIndexQuantileMethod.DEFAULT.indexShift());
  }
}
