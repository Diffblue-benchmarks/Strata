package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MidwayInterpolationQuantileMethodDiffblueTest {
  /**
   * Test {@link MidwayInterpolationQuantileMethod#indexCorrection()}.
   *
   * <p>Method under test: {@link MidwayInterpolationQuantileMethod#indexCorrection()}
   */
  @Test
  @DisplayName("Test indexCorrection()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MidwayInterpolationQuantileMethod.indexCorrection()"})
  void testIndexCorrection() {
    // Arrange, Act and Assert
    assertEquals(0.5d, MidwayInterpolationQuantileMethod.DEFAULT.indexCorrection());
  }

  /**
   * Test {@link MidwayInterpolationQuantileMethod#sampleCorrection(int)}.
   *
   * <p>Method under test: {@link MidwayInterpolationQuantileMethod#sampleCorrection(int)}
   */
  @Test
  @DisplayName("Test sampleCorrection(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MidwayInterpolationQuantileMethod.sampleCorrection(int)"})
  void testSampleCorrection() {
    // Arrange, Act and Assert
    assertEquals(3, MidwayInterpolationQuantileMethod.DEFAULT.sampleCorrection(3));
  }
}
