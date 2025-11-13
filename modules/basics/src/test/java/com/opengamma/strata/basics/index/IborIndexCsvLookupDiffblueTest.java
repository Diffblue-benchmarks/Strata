package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborIndexCsvLookupDiffblueTest {
  /**
   * Test {@link IborIndexCsvLookup#lookupAll()}.
   *
   * <p>Method under test: {@link IborIndexCsvLookup#lookupAll()}
   */
  @Test
  @DisplayName("Test lookupAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map IborIndexCsvLookup.lookupAll()"})
  void testLookupAll() {
    // Arrange and Act
    Map<String, IborIndex> actualLookupAllResult = IborIndexCsvLookup.INSTANCE.lookupAll();

    // Assert
    assertEquals(271, actualLookupAllResult.size());
    assertTrue(actualLookupAllResult.get("AUD-BBSW-2M") instanceof ImmutableIborIndex);
    assertTrue(actualLookupAllResult.get("CHF-LIBOR-6M") instanceof ImmutableIborIndex);
    assertTrue(actualLookupAllResult.get("CZK-PRIBOR-2M") instanceof ImmutableIborIndex);
    assertTrue(actualLookupAllResult.get("CZK-PRIBOR-2W") instanceof ImmutableIborIndex);
    assertTrue(actualLookupAllResult.get("DKK-CIBOR-2M") instanceof ImmutableIborIndex);
    assertTrue(actualLookupAllResult.get("DKK-CIBOR-2W") instanceof ImmutableIborIndex);
    assertTrue(actualLookupAllResult.get("GBP-LIBOR-7M") instanceof ImmutableIborIndex);
    assertTrue(actualLookupAllResult.get("GBP-SONIAICETERM-3M") instanceof ImmutableIborIndex);
    assertTrue(actualLookupAllResult.get("HUF-BUBOR-12M") instanceof ImmutableIborIndex);
    assertTrue(actualLookupAllResult.get("JPY-LIBOR-2W") instanceof ImmutableIborIndex);
    assertTrue(actualLookupAllResult.get("JPY-TIBOR-EUROYEN-4M") instanceof ImmutableIborIndex);
  }
}
