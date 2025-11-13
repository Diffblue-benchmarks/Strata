package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OvernightIndexCsvLookupDiffblueTest {
  /**
   * Test {@link OvernightIndexCsvLookup#lookupAll()}.
   *
   * <p>Method under test: {@link OvernightIndexCsvLookup#lookupAll()}
   */
  @Test
  @DisplayName("Test lookupAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map OvernightIndexCsvLookup.lookupAll()"})
  void testLookupAll() {
    // Arrange and Act
    Map<String, OvernightIndex> actualLookupAllResult =
        OvernightIndexCsvLookup.INSTANCE.lookupAll();

    // Assert
    assertEquals(34, actualLookupAllResult.size());
    assertTrue(actualLookupAllResult.get("DKK-DESTR") instanceof ImmutableOvernightIndex);
    assertTrue(actualLookupAllResult.get("HKD-HONIA") instanceof ImmutableOvernightIndex);
    assertTrue(actualLookupAllResult.get("HUF-HUFONIA") instanceof ImmutableOvernightIndex);
    assertTrue(actualLookupAllResult.get("ILS-OTELBOR") instanceof ImmutableOvernightIndex);
    assertTrue(actualLookupAllResult.get("INR-OMIBOR") instanceof ImmutableOvernightIndex);
    assertTrue(actualLookupAllResult.get("JPY-TONAR") instanceof ImmutableOvernightIndex);
    assertTrue(actualLookupAllResult.get("NOK-NOWA") instanceof ImmutableOvernightIndex);
    assertTrue(actualLookupAllResult.get("SGD-SONAR") instanceof ImmutableOvernightIndex);
    assertTrue(actualLookupAllResult.get("SGD-SORA") instanceof ImmutableOvernightIndex);
    assertTrue(actualLookupAllResult.get("THB-THOR") instanceof ImmutableOvernightIndex);
    assertTrue(actualLookupAllResult.get("USD-FED-FUND") instanceof ImmutableOvernightIndex);
  }
}
