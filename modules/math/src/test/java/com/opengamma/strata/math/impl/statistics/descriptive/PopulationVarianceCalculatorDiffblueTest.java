package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PopulationVarianceCalculatorDiffblueTest {
  /**
   * Test new {@link PopulationVarianceCalculator} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * PopulationVarianceCalculator}
   */
  @Test
  @DisplayName("Test new PopulationVarianceCalculator (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PopulationVarianceCalculator.<init>()"})
  void testNewPopulationVarianceCalculator() {
    // Arrange, Act and Assert
    assertEquals(
        16.0d,
        new PopulationVarianceCalculator()
            .apply(new double[] {2.0d, 10.0d, 2.0d, 10.0d})
            .doubleValue());
  }
}
