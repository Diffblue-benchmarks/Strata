package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurrencyParameterSensitivitiesTokenEvaluatorDiffblueTest {
  /**
   * Test {@link
   * CurrencyParameterSensitivitiesTokenEvaluator#tokens(CurrencyParameterSensitivities)} with
   * {@code CurrencyParameterSensitivities}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * CurrencyParameterSensitivitiesTokenEvaluator#tokens(CurrencyParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test tokens(CurrencyParameterSensitivities) with 'CurrencyParameterSensitivities'; when empty; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Set CurrencyParameterSensitivitiesTokenEvaluator.tokens(CurrencyParameterSensitivities)"
  })
  void testTokensWithCurrencyParameterSensitivities_whenEmpty_thenReturnEmpty() {
    // Arrange
    CurrencyParameterSensitivitiesTokenEvaluator currencyParameterSensitivitiesTokenEvaluator =
        new CurrencyParameterSensitivitiesTokenEvaluator();

    // Act and Assert
    assertTrue(
        currencyParameterSensitivitiesTokenEvaluator
            .tokens(CurrencyParameterSensitivities.empty())
            .isEmpty());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link
   *       CurrencyParameterSensitivitiesTokenEvaluator}
   *   <li>{@link CurrencyParameterSensitivitiesTokenEvaluator#getTargetType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CurrencyParameterSensitivitiesTokenEvaluator.<init>()",
    "Class CurrencyParameterSensitivitiesTokenEvaluator.getTargetType()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Class<?> actualTargetType = new CurrencyParameterSensitivitiesTokenEvaluator().getTargetType();

    // Assert
    Class<CurrencyParameterSensitivities> expectedTargetType = CurrencyParameterSensitivities.class;
    assertEquals(expectedTargetType, actualTargetType);
  }
}
