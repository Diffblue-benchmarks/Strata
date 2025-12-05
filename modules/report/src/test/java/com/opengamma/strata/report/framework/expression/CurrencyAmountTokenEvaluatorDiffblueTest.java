package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurrencyAmountTokenEvaluatorDiffblueTest {
  /**
   * Test {@link CurrencyAmountTokenEvaluator#tokens(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountTokenEvaluator#tokens(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test tokens(CurrencyAmount) with 'CurrencyAmount'; when 'null'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet CurrencyAmountTokenEvaluator.tokens(CurrencyAmount)"})
  void testTokensWithCurrencyAmount_whenNull_thenReturnSizeIsTwo() {
    // Arrange and Act
    ImmutableSet<String> actualTokensResult = new CurrencyAmountTokenEvaluator().tokens(null);

    // Assert
    assertEquals(2, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("amount"));
    assertTrue(actualTokensResult.contains("currency"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link CurrencyAmountTokenEvaluator}
   *   <li>{@link CurrencyAmountTokenEvaluator#getTargetType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CurrencyAmountTokenEvaluator.<init>()",
    "Class CurrencyAmountTokenEvaluator.getTargetType()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Class<CurrencyAmount> actualTargetType = new CurrencyAmountTokenEvaluator().getTargetType();

    // Assert
    Class<CurrencyAmount> expectedTargetType = CurrencyAmount.class;
    assertEquals(expectedTargetType, actualTargetType);
  }
}
