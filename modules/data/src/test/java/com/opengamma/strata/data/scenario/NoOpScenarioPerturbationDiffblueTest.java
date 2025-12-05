package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.joda.beans.MetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NoOpScenarioPerturbationDiffblueTest {
  /**
   * Test {@link NoOpScenarioPerturbation#meta()}.
   *
   * <p>Method under test: {@link NoOpScenarioPerturbation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean NoOpScenarioPerturbation.meta()"})
  void testMeta() {
    // Arrange and Act
    MetaBean actualMetaResult = NoOpScenarioPerturbation.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    assertTrue(actualMetaResult.metaPropertyMap().isEmpty());
    assertTrue(actualMetaResult.isBuildable());
    Class<NoOpScenarioPerturbation> expectedBeanTypeResult = NoOpScenarioPerturbation.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }
}
