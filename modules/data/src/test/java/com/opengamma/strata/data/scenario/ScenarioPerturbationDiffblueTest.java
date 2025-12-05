package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ScenarioPerturbationDiffblueTest {
  /**
   * Test {@link ScenarioPerturbation#none()}.
   *
   * <p>Method under test: {@link ScenarioPerturbation#none()}
   */
  @Test
  @DisplayName("Test none()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioPerturbation ScenarioPerturbation.none()"})
  void testNone() {
    // Arrange and Act
    ScenarioPerturbation<Object> actualNoneResult = ScenarioPerturbation.none();

    // Assert
    assertTrue(actualNoneResult instanceof NoOpScenarioPerturbation);
    assertEquals(1, actualNoneResult.getScenarioCount());
    Class<Object> expectedMarketDataType = Object.class;
    assertEquals(expectedMarketDataType, actualNoneResult.getMarketDataType());
  }
}
