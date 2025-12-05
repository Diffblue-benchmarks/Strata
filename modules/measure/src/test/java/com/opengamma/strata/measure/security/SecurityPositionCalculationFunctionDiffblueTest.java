package com.opengamma.strata.measure.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.SecurityPosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SecurityPositionCalculationFunctionDiffblueTest {
  /**
   * Test {@link SecurityPositionCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link SecurityPositionCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class SecurityPositionCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<SecurityPosition> actualTargetTypeResult =
        new SecurityPositionCalculationFunction().targetType();

    // Assert
    Class<SecurityPosition> expectedTargetTypeResult = SecurityPosition.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link SecurityPositionCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link SecurityPositionCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set SecurityPositionCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(1, new SecurityPositionCalculationFunction().supportedMeasures().size());
  }
}
