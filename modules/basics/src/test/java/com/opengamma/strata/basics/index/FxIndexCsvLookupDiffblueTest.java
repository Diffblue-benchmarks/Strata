package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxIndexCsvLookupDiffblueTest {
  /**
   * Test {@link FxIndexCsvLookup#lookupAll()}.
   *
   * <p>Method under test: {@link FxIndexCsvLookup#lookupAll()}
   */
  @Test
  @DisplayName("Test lookupAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map FxIndexCsvLookup.lookupAll()"})
  void testLookupAll() {
    // Arrange and Act
    Map<String, FxIndex> actualLookupAllResult = FxIndexCsvLookup.INSTANCE.lookupAll();

    // Assert
    assertEquals(Short.SIZE, actualLookupAllResult.size());
    assertTrue(actualLookupAllResult.get("EUR/JPY-ECB") instanceof ImmutableFxIndex);
    assertTrue(actualLookupAllResult.get("EUR/USD-ECB") instanceof ImmutableFxIndex);
    assertTrue(actualLookupAllResult.get("EUR/USD-WM") instanceof ImmutableFxIndex);
    assertTrue(actualLookupAllResult.get("GBP/USD-WM") instanceof ImmutableFxIndex);
    assertTrue(actualLookupAllResult.get("USD/CLP-DOLAR-OBS-CLP10") instanceof ImmutableFxIndex);
    assertTrue(actualLookupAllResult.get("USD/CNY-SAEC-CNY01") instanceof ImmutableFxIndex);
    assertTrue(actualLookupAllResult.get("USD/COP-TRM-COP02") instanceof ImmutableFxIndex);
    assertTrue(actualLookupAllResult.get("USD/INR-FBIL-INR01") instanceof ImmutableFxIndex);
    assertTrue(actualLookupAllResult.get("USD/JPY-WM") instanceof ImmutableFxIndex);
    assertTrue(actualLookupAllResult.get("USD/KRW-KFTC18-KRW02") instanceof ImmutableFxIndex);
    assertTrue(actualLookupAllResult.get("USD/SGD-VWAP-SGD3") instanceof ImmutableFxIndex);
  }
}
