package com.opengamma.strata.calc.runner;

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

class CalculationResultDiffblueTest {
  /**
   * Test {@link CalculationResult#meta()}.
   *
   * <p>Method under test: {@link CalculationResult#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationResult.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CalculationResult> actualMetaResult = CalculationResult.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("columnIndex"));
    assertTrue(metaPropertyMapResult.containsKey("result"));
    assertTrue(metaPropertyMapResult.containsKey("rowIndex"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CalculationResult> expectedBeanTypeResult = CalculationResult.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }
}
