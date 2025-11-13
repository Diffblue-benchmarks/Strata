package com.opengamma.strata.pricer.model;

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

class SabrParametersDiffblueTest {
  /**
   * Test {@link SabrParameters#meta()}.
   *
   * <p>Method under test: {@link SabrParameters#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SabrParameters.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SabrParameters> actualMetaResult = SabrParameters.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(6, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("alphaCurve"));
    assertTrue(metaPropertyMapResult.containsKey("betaCurve"));
    assertTrue(metaPropertyMapResult.containsKey("nuCurve"));
    assertTrue(metaPropertyMapResult.containsKey("rhoCurve"));
    assertTrue(metaPropertyMapResult.containsKey("sabrVolatilityFormula"));
    assertTrue(metaPropertyMapResult.containsKey("shiftCurve"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SabrParameters> expectedBeanTypeResult = SabrParameters.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }
}
