package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PriceIndexCsvLookupDiffblueTest {
  /**
   * Test {@link PriceIndexCsvLookup#lookupAll()}.
   *
   * <p>Method under test: {@link PriceIndexCsvLookup#lookupAll()}
   */
  @Test
  @DisplayName("Test lookupAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map PriceIndexCsvLookup.lookupAll()"})
  void testLookupAll() {
    // Arrange and Act
    Map<String, PriceIndex> actualLookupAllResult = PriceIndexCsvLookup.INSTANCE.lookupAll();

    // Assert
    assertEquals(9, actualLookupAllResult.size());
    assertTrue(actualLookupAllResult.get("CH-CPI") instanceof ImmutablePriceIndex);
    assertTrue(actualLookupAllResult.get("EU-AI-CPI") instanceof ImmutablePriceIndex);
    assertTrue(actualLookupAllResult.get("EU-EXT-CPI") instanceof ImmutablePriceIndex);
    assertTrue(actualLookupAllResult.get("FR-EXT-CPI") instanceof ImmutablePriceIndex);
    assertTrue(actualLookupAllResult.get("GB-HICP") instanceof ImmutablePriceIndex);
    assertTrue(actualLookupAllResult.get("GB-RPI") instanceof ImmutablePriceIndex);
    assertTrue(actualLookupAllResult.get("GB-RPIX") instanceof ImmutablePriceIndex);
    assertTrue(actualLookupAllResult.get("JP-CPI-EXF") instanceof ImmutablePriceIndex);
    assertTrue(actualLookupAllResult.get("US-CPI-U") instanceof ImmutablePriceIndex);
  }
}
