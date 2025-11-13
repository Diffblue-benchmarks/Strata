package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.param.CurrencyParameterSensitivity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurrencyParameterSensitivityTokenEvaluatorDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link
   *       CurrencyParameterSensitivityTokenEvaluator}
   *   <li>{@link CurrencyParameterSensitivityTokenEvaluator#getTargetType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CurrencyParameterSensitivityTokenEvaluator.<init>()",
    "Class CurrencyParameterSensitivityTokenEvaluator.getTargetType()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Class<?> actualTargetType = new CurrencyParameterSensitivityTokenEvaluator().getTargetType();

    // Assert
    Class<CurrencyParameterSensitivity> expectedTargetType = CurrencyParameterSensitivity.class;
    assertEquals(expectedTargetType, actualTargetType);
  }
}
