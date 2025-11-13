package com.opengamma.strata.data;

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

class FxRateIdDiffblueTest {
  /**
   * Test {@link FxRateId#meta()}.
   *
   * <p>Method under test: {@link FxRateId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean FxRateId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<FxRateId> actualMetaResult = FxRateId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(metaPropertyMapResult.containsKey("pair"));
    assertTrue(actualMetaResult.isBuildable());
    Class<FxRateId> expectedBeanTypeResult = FxRateId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }
}
