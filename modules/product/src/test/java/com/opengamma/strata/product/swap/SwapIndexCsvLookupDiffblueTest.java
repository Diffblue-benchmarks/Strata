package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwapIndexCsvLookupDiffblueTest {
  /**
   * Test {@link SwapIndexCsvLookup#lookupAll()}.
   *
   * <p>Method under test: {@link SwapIndexCsvLookup#lookupAll()}
   */
  @Test
  @DisplayName("Test lookupAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map SwapIndexCsvLookup.lookupAll()"})
  void testLookupAll() {
    // Arrange and Act
    Map<String, SwapIndex> actualLookupAllResult = SwapIndexCsvLookup.INSTANCE.lookupAll();

    // Assert
    assertEquals(120, actualLookupAllResult.size());
    assertTrue(actualLookupAllResult.get("EUR-EURIBOR-1100-8Y") instanceof ImmutableSwapIndex);
    assertTrue(actualLookupAllResult.get("EUR-EURIBOR-1200-1Y") instanceof ImmutableSwapIndex);
    assertTrue(actualLookupAllResult.get("EUR-EURIBOR-1200-9Y") instanceof ImmutableSwapIndex);
    assertTrue(actualLookupAllResult.get("GBP-LIBOR-1100-1Y") instanceof ImmutableSwapIndex);
    assertTrue(actualLookupAllResult.get("GBP-LIBOR-1100-9Y") instanceof ImmutableSwapIndex);
    assertTrue(actualLookupAllResult.get("GBP-SONIA-1100-12Y") instanceof ImmutableSwapIndex);
    assertTrue(actualLookupAllResult.get("GBP-SONIA-1100-3Y") instanceof ImmutableSwapIndex);
    assertTrue(actualLookupAllResult.get("JPY-TONA-1030-15Y") instanceof ImmutableSwapIndex);
    assertTrue(actualLookupAllResult.get("JPY-TONA-1530-1Y") instanceof ImmutableSwapIndex);
    assertTrue(actualLookupAllResult.get("USD-LIBOR-1100-30Y") instanceof ImmutableSwapIndex);
    assertTrue(actualLookupAllResult.get("USD-LIBOR-1100-8Y") instanceof ImmutableSwapIndex);
  }
}
