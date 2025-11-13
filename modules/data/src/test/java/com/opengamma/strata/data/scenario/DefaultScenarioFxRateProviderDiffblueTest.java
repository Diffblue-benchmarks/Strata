package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.ObservableSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultScenarioFxRateProviderDiffblueTest {
  /**
   * Test {@link DefaultScenarioFxRateProvider#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioFxRateProvider#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultScenarioFxRateProvider.getScenarioCount()"})
  void testGetScenarioCount_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0,
        new DefaultScenarioFxRateProvider(
                ImmutableScenarioMarketData.empty(), ObservableSource.NONE)
            .getScenarioCount());
  }
}
