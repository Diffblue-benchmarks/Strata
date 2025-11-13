package com.opengamma.strata.pricer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PricingExceptionDiffblueTest {
  /**
   * Test {@link PricingException#PricingException(String)}.
   *
   * <ul>
   *   <li>When {@code An error occurred}.
   *   <li>Then return Cause is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link PricingException#PricingException(String)}
   */
  @Test
  @DisplayName(
      "Test new PricingException(String); when 'An error occurred'; then return Cause is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PricingException.<init>(String)",
    "void PricingException.<init>(String, Throwable)"
  })
  void testNewPricingException_whenAnErrorOccurred_thenReturnCauseIsNull() {
    // Arrange and Act
    PricingException actualPricingException = new PricingException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualPricingException.getMessage());
    assertNull(actualPricingException.getCause());
    assertEquals(0, actualPricingException.getSuppressed().length);
  }

  /**
   * Test {@link PricingException#PricingException(String, Throwable)}.
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then return Cause is {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link PricingException#PricingException(String, Throwable)}
   */
  @Test
  @DisplayName(
      "Test new PricingException(String, Throwable); when Throwable(); then return Cause is Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PricingException.<init>(String)",
    "void PricingException.<init>(String, Throwable)"
  })
  void testNewPricingException_whenThrowable_thenReturnCauseIsThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    PricingException actualPricingException = new PricingException("An error occurred", cause);

    // Assert
    assertEquals("An error occurred", actualPricingException.getMessage());
    assertEquals(0, actualPricingException.getSuppressed().length);
    assertSame(cause, actualPricingException.getCause());
  }
}
