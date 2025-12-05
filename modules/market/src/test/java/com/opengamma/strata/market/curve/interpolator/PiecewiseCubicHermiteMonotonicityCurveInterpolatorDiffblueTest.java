package com.opengamma.strata.market.curve.interpolator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PiecewiseCubicHermiteMonotonicityCurveInterpolatorDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PiecewiseCubicHermiteMonotonicityCurveInterpolator#toString()}
   *   <li>{@link PiecewiseCubicHermiteMonotonicityCurveInterpolator#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String PiecewiseCubicHermiteMonotonicityCurveInterpolator.getName()",
    "String PiecewiseCubicHermiteMonotonicityCurveInterpolator.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    PiecewiseCubicHermiteMonotonicityCurveInterpolator
        piecewiseCubicHermiteMonotonicityCurveInterpolator =
            PiecewiseCubicHermiteMonotonicityCurveInterpolator.INSTANCE;

    // Act
    String actualToStringResult = piecewiseCubicHermiteMonotonicityCurveInterpolator.toString();

    // Assert
    assertEquals(
        "PiecewiseCubicHermiteMonotonicity",
        piecewiseCubicHermiteMonotonicityCurveInterpolator.getName());
    assertEquals("PiecewiseCubicHermiteMonotonicity", actualToStringResult);
  }
}
