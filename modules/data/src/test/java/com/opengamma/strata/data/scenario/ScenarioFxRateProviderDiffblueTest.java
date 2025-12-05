package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.ObservableSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ScenarioFxRateProviderDiffblueTest {
  /**
   * Test {@link ScenarioFxRateProvider#of(ScenarioMarketData, ObservableSource)} with {@code
   * marketData}, {@code source}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link DefaultScenarioFxRateProvider}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioFxRateProvider#of(ScenarioMarketData, ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(ScenarioMarketData, ObservableSource) with 'marketData', 'source'; when 'null'; then return DefaultScenarioFxRateProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioFxRateProvider ScenarioFxRateProvider.of(ScenarioMarketData, ObservableSource)"
  })
  void testOfWithMarketDataSource_whenNull_thenReturnDefaultScenarioFxRateProvider() {
    // Arrange, Act and Assert
    assertTrue(
        ScenarioFxRateProvider.of(null, ObservableSource.NONE)
            instanceof DefaultScenarioFxRateProvider);
  }

  /**
   * Test {@link ScenarioFxRateProvider#of(ScenarioMarketData)} with {@code marketData}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link DefaultScenarioFxRateProvider}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioFxRateProvider#of(ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(ScenarioMarketData) with 'marketData'; when 'null'; then return DefaultScenarioFxRateProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioFxRateProvider ScenarioFxRateProvider.of(ScenarioMarketData)"})
  void testOfWithMarketData_whenNull_thenReturnDefaultScenarioFxRateProvider() {
    // Arrange, Act and Assert
    assertTrue(ScenarioFxRateProvider.of(null) instanceof DefaultScenarioFxRateProvider);
  }
}
