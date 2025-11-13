package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SamplePlusOneNearestIndexQuantileMethodDiffblueTest {
  /**
   * Test {@link SamplePlusOneNearestIndexQuantileMethod#index(double)}.
   *
   * <p>Method under test: {@link SamplePlusOneNearestIndexQuantileMethod#index(double)}
   */
  @Test
  @DisplayName("Test index(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SamplePlusOneNearestIndexQuantileMethod.index(double)"})
  void testIndex() {
    // Arrange, Act and Assert
    assertEquals(10, SamplePlusOneNearestIndexQuantileMethod.DEFAULT.index(10.0d));
  }

  /**
   * Test {@link SamplePlusOneNearestIndexQuantileMethod#sampleCorrection(int)}.
   *
   * <p>Method under test: {@link SamplePlusOneNearestIndexQuantileMethod#sampleCorrection(int)}
   */
  @Test
  @DisplayName("Test sampleCorrection(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SamplePlusOneNearestIndexQuantileMethod.sampleCorrection(int)"})
  void testSampleCorrection() {
    // Arrange, Act and Assert
    assertEquals(4, SamplePlusOneNearestIndexQuantileMethod.DEFAULT.sampleCorrection(3));
  }

  /**
   * Test {@link SamplePlusOneNearestIndexQuantileMethod#indexShift()}.
   *
   * <p>Method under test: {@link SamplePlusOneNearestIndexQuantileMethod#indexShift()}
   */
  @Test
  @DisplayName("Test indexShift()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SamplePlusOneNearestIndexQuantileMethod.indexShift()"})
  void testIndexShift() {
    // Arrange, Act and Assert
    assertEquals(0.5d, SamplePlusOneNearestIndexQuantileMethod.DEFAULT.indexShift());
  }
}
