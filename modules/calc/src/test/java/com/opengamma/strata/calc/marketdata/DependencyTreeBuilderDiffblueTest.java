package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DependencyTreeBuilderDiffblueTest {
  /**
   * Test {@link DependencyTreeBuilder#of(ScenarioMarketData, MarketDataRequirements,
   * MarketDataConfig, Map)}.
   *
   * <p>Method under test: {@link DependencyTreeBuilder#of(ScenarioMarketData,
   * MarketDataRequirements, MarketDataConfig, Map)}
   */
  @Test
  @DisplayName("Test of(ScenarioMarketData, MarketDataRequirements, MarketDataConfig, Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DependencyTreeBuilder DependencyTreeBuilder.of(ScenarioMarketData, MarketDataRequirements, MarketDataConfig, Map)"
  })
  void testOf() {
    // Arrange
    BuiltScenarioMarketData suppliedData = BuiltScenarioMarketData.empty();
    MarketDataRequirements requirements = MarketDataRequirements.empty();
    MarketDataConfig marketDataConfig = MarketDataConfig.empty();

    // Act
    DependencyTreeBuilder actualOfResult =
        DependencyTreeBuilder.of(suppliedData, requirements, marketDataConfig, new HashMap<>());

    // Assert
    assertTrue(actualOfResult.dependencyNodes().isEmpty());
  }

  /**
   * Test {@link DependencyTreeBuilder#dependencyNodes()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link DependencyTreeBuilder#dependencyNodes()}
   */
  @Test
  @DisplayName("Test dependencyNodes(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List DependencyTreeBuilder.dependencyNodes()"})
  void testDependencyNodes_thenReturnEmpty() {
    // Arrange
    BuiltScenarioMarketData suppliedData = BuiltScenarioMarketData.empty();
    MarketDataRequirements requirements = MarketDataRequirements.empty();
    MarketDataConfig marketDataConfig = MarketDataConfig.empty();

    DependencyTreeBuilder ofResult =
        DependencyTreeBuilder.of(suppliedData, requirements, marketDataConfig, new HashMap<>());

    // Act and Assert
    assertTrue(ofResult.dependencyNodes().isEmpty());
  }
}
