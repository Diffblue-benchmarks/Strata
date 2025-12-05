package com.opengamma.strata.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataNotFoundExceptionDiffblueTest {
  /**
   * Test {@link MarketDataNotFoundException#MarketDataNotFoundException(String)}.
   *
   * <p>Method under test: {@link MarketDataNotFoundException#MarketDataNotFoundException(String)}
   */
  @Test
  @DisplayName("Test new MarketDataNotFoundException(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MarketDataNotFoundException.<init>(String)"})
  void testNewMarketDataNotFoundException() {
    // Arrange and Act
    MarketDataNotFoundException actualMarketDataNotFoundException =
        new MarketDataNotFoundException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualMarketDataNotFoundException.getMessage());
    assertNull(actualMarketDataNotFoundException.getCause());
    assertEquals(0, actualMarketDataNotFoundException.getSuppressed().length);
  }
}
