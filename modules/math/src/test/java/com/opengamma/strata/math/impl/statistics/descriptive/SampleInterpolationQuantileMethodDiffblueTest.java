package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SampleInterpolationQuantileMethodDiffblueTest {
  /**
   * Test {@link SampleInterpolationQuantileMethod#indexCorrection()}.
   *
   * <p>Method under test: {@link SampleInterpolationQuantileMethod#indexCorrection()}
   */
  @Test
  @DisplayName("Test indexCorrection()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SampleInterpolationQuantileMethod.indexCorrection()"})
  void testIndexCorrection() {
    // Arrange, Act and Assert
    assertEquals(0.0d, SampleInterpolationQuantileMethod.DEFAULT.indexCorrection());
  }

  /**
   * Test {@link SampleInterpolationQuantileMethod#sampleCorrection(int)}.
   *
   * <p>Method under test: {@link SampleInterpolationQuantileMethod#sampleCorrection(int)}
   */
  @Test
  @DisplayName("Test sampleCorrection(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SampleInterpolationQuantileMethod.sampleCorrection(int)"})
  void testSampleCorrection() {
    // Arrange, Act and Assert
    assertEquals(3, SampleInterpolationQuantileMethod.DEFAULT.sampleCorrection(3));
  }
}
