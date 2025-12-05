package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.common.PayReceive;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwapLegDiffblueTest {
  /**
   * Test {@link SwapLeg#allCurrencies()}.
   *
   * <p>Method under test: {@link SwapLeg#allCurrencies()}
   */
  @Test
  @DisplayName("Test allCurrencies()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet SwapLeg.allCurrencies()"})
  void testAllCurrencies() {
    // Arrange
    MockSwapLeg ofResult =
        MockSwapLeg.of(
            SwapLegType.FIXED,
            PayReceive.PAY,
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            null);

    // Act and Assert
    assertEquals(1, ofResult.allCurrencies().size());
  }

  /**
   * Test {@link SwapLeg#allIndices()}.
   *
   * <p>Method under test: {@link SwapLeg#allIndices()}
   */
  @Test
  @DisplayName("Test allIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet SwapLeg.allIndices()"})
  void testAllIndices() {
    // Arrange
    MockSwapLeg ofResult =
        MockSwapLeg.of(
            SwapLegType.FIXED,
            PayReceive.PAY,
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            null);

    // Act and Assert
    assertEquals(3, ofResult.allIndices().size());
  }

  /**
   * Test {@link SwapLeg#allIndices()}.
   *
   * <p>Method under test: {@link SwapLeg#allIndices()}
   */
  @Test
  @DisplayName("Test allIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet SwapLeg.allIndices()"})
  void testAllIndices2() {
    // Arrange
    MockSwapLeg ofResult =
        MockSwapLeg.of(
            SwapLegType.IBOR,
            PayReceive.PAY,
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            null);

    // Act and Assert
    assertEquals(3, ofResult.allIndices().size());
  }

  /**
   * Test {@link SwapLeg#replaceStartDate(LocalDate)}.
   *
   * <p>Method under test: {@link SwapLeg#replaceStartDate(LocalDate)}
   */
  @Test
  @DisplayName("Test replaceStartDate(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwapLeg SwapLeg.replaceStartDate(LocalDate)"})
  void testReplaceStartDate() {
    // Arrange
    MockSwapLeg ofResult =
        MockSwapLeg.of(
            SwapLegType.FIXED,
            PayReceive.PAY,
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            null);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> ofResult.replaceStartDate(LocalDate.of(1970, 1, 1)));
  }
}
