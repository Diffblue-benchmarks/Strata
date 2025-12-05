package com.opengamma.strata.examples.marketdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExampleMarketDataDiffblueTest {
  /**
   * Test {@link ExampleMarketData#builder()}.
   *
   * <p>Method under test: {@link ExampleMarketData#builder()}
   */
  @Test
  @DisplayName("Test builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExampleMarketDataBuilder ExampleMarketData.builder()"})
  void testBuilder() {
    // Arrange and Act
    ExampleMarketDataBuilder actualBuilderResult = ExampleMarketData.builder();

    // Assert
    assertTrue(actualBuilderResult instanceof DirectoryMarketDataBuilder);
    assertEquals(2, actualBuilderResult.loadAllRatesCurves().size());
  }
}
