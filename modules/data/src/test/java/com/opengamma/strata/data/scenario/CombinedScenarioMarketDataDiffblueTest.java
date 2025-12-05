package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CombinedScenarioMarketDataDiffblueTest {
  /**
   * Test {@link CombinedScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link CombinedScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CombinedScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CombinedScenarioMarketData> actualMetaResult = CombinedScenarioMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("scenarioCount"));
    assertTrue(metaPropertyMapResult.containsKey("underlying1"));
    assertTrue(metaPropertyMapResult.containsKey("underlying2"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CombinedScenarioMarketData> expectedBeanTypeResult = CombinedScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }
}
