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

class SabrInterestRateParametersDiffblueTest {
  /**
   * Test {@link SabrInterestRateParameters#meta()}.
   *
   * <p>Method under test: {@link SabrInterestRateParameters#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SabrInterestRateParameters.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SabrInterestRateParameters> actualMetaResult = SabrInterestRateParameters.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(6, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("alphaSurface"));
    assertTrue(metaPropertyMapResult.containsKey("betaSurface"));
    assertTrue(metaPropertyMapResult.containsKey("nuSurface"));
    assertTrue(metaPropertyMapResult.containsKey("rhoSurface"));
    assertTrue(metaPropertyMapResult.containsKey("sabrVolatilityFormula"));
    assertTrue(metaPropertyMapResult.containsKey("shiftSurface"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SabrInterestRateParameters> expectedBeanTypeResult = SabrInterestRateParameters.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }
}
