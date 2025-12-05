package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SamplePlusOneInterpolationQuantileMethodDiffblueTest {
  /**
   * Test {@link SamplePlusOneInterpolationQuantileMethod#indexCorrection()}.
   *
   * <p>Method under test: {@link SamplePlusOneInterpolationQuantileMethod#indexCorrection()}
   */
  @Test
  @DisplayName("Test indexCorrection()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SamplePlusOneInterpolationQuantileMethod.indexCorrection()"})
  void testIndexCorrection() {
    // Arrange, Act and Assert
    assertEquals(0.0d, SamplePlusOneInterpolationQuantileMethod.DEFAULT.indexCorrection());
  }

  /**
   * Test {@link SamplePlusOneInterpolationQuantileMethod#sampleCorrection(int)}.
   *
   * <p>Method under test: {@link SamplePlusOneInterpolationQuantileMethod#sampleCorrection(int)}
   */
  @Test
  @DisplayName("Test sampleCorrection(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SamplePlusOneInterpolationQuantileMethod.sampleCorrection(int)"})
  void testSampleCorrection() {
    // Arrange, Act and Assert
    assertEquals(4, SamplePlusOneInterpolationQuantileMethod.DEFAULT.sampleCorrection(3));
  }
}
