package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExcelInterpolationQuantileMethodDiffblueTest {
  /**
   * Test {@link ExcelInterpolationQuantileMethod#indexCorrection()}.
   *
   * <p>Method under test: {@link ExcelInterpolationQuantileMethod#indexCorrection()}
   */
  @Test
  @DisplayName("Test indexCorrection()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ExcelInterpolationQuantileMethod.indexCorrection()"})
  void testIndexCorrection() {
    // Arrange, Act and Assert
    assertEquals(1.0d, ExcelInterpolationQuantileMethod.DEFAULT.indexCorrection());
  }

  /**
   * Test {@link ExcelInterpolationQuantileMethod#sampleCorrection(int)}.
   *
   * <p>Method under test: {@link ExcelInterpolationQuantileMethod#sampleCorrection(int)}
   */
  @Test
  @DisplayName("Test sampleCorrection(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ExcelInterpolationQuantileMethod.sampleCorrection(int)"})
  void testSampleCorrection() {
    // Arrange, Act and Assert
    assertEquals(2, ExcelInterpolationQuantileMethod.DEFAULT.sampleCorrection(3));
  }
}
