package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BivariateNormalDistributionDiffblueTest {
  /**
   * Test {@link BivariateNormalDistribution#getInverseCDF(double[])} with {@code double[]}.
   *
   * <p>Method under test: {@link BivariateNormalDistribution#getInverseCDF(double[])}
   */
  @Test
  @DisplayName("Test getInverseCDF(double[]) with 'double[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BivariateNormalDistribution.getInverseCDF(double[])"})
  void testGetInverseCDFWithDouble() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            new BivariateNormalDistribution()
                .getInverseCDF(
                    new double[] {
                      10.0d, Double.NEGATIVE_INFINITY, 10.0d, Double.NEGATIVE_INFINITY
                    }));
  }

  /**
   * Test {@link BivariateNormalDistribution#getPDF(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and two.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BivariateNormalDistribution#getPDF(double[])}
   */
  @Test
  @DisplayName(
      "Test getPDF(double[]) with 'double[]'; when array of double with two and two; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BivariateNormalDistribution.getPDF(double[])"})
  void testGetPDFWithDouble_whenArrayOfDoubleWithTwoAndTwo_thenReturnNaN() {
    // Arrange and Act
    double actualPDF = new BivariateNormalDistribution().getPDF(new double[] {2.0d, 2.0d, -1.0d});

    // Assert
    assertEquals(Double.NaN, actualPDF);
  }

  /**
   * Test {@link BivariateNormalDistribution#nextRandom()}.
   *
   * <p>Method under test: {@link BivariateNormalDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BivariateNormalDistribution.nextRandom()"})
  void testNextRandom() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> new BivariateNormalDistribution().nextRandom());
  }
}
