package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.ScenarioFxRateProvider;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LookupScenarioFxRateProviderDiffblueTest {
  /**
   * Test {@link LookupScenarioFxRateProvider#of(ScenarioMarketData, FxRateLookup)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return {@link LookupScenarioFxRateProvider}.
   * </ul>
   *
   * <p>Method under test: {@link LookupScenarioFxRateProvider#of(ScenarioMarketData, FxRateLookup)}
   */
  @Test
  @DisplayName(
      "Test of(ScenarioMarketData, FxRateLookup); when empty; then return LookupScenarioFxRateProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioFxRateProvider LookupScenarioFxRateProvider.of(ScenarioMarketData, FxRateLookup)"
  })
  void testOf_whenEmpty_thenReturnLookupScenarioFxRateProvider() {
    // Arrange and Act
    ScenarioFxRateProvider actualOfResult =
        LookupScenarioFxRateProvider.of(
            ImmutableScenarioMarketData.empty(), mock(FxRateLookup.class));

    // Assert
    assertTrue(actualOfResult instanceof LookupScenarioFxRateProvider);
    assertEquals(0, actualOfResult.getScenarioCount());
  }
}
