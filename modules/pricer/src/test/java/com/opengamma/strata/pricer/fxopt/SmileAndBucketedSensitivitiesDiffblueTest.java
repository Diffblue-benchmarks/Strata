package com.opengamma.strata.pricer.fxopt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SmileAndBucketedSensitivitiesDiffblueTest {
  /**
   * Test {@link SmileAndBucketedSensitivities#of(SmileDeltaParameters, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return Smile is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SmileAndBucketedSensitivities#of(SmileDeltaParameters,
   * DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test of(SmileDeltaParameters, DoubleMatrix); when DoubleMatrix; then return Smile is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SmileAndBucketedSensitivities SmileAndBucketedSensitivities.of(SmileDeltaParameters, DoubleMatrix)"
  })
  void testOf_whenDoubleMatrix_thenReturnSmileIsNull() {
    // Arrange and Act
    SmileAndBucketedSensitivities actualOfResult =
        SmileAndBucketedSensitivities.of(null, DoubleMatrix.of());

    // Assert
    assertNull(actualOfResult.getSmile());
    assertSame(DoubleMatrix.EMPTY, actualOfResult.getSensitivities());
  }

  /**
   * Test {@link SmileAndBucketedSensitivities#meta()}.
   *
   * <p>Method under test: {@link SmileAndBucketedSensitivities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SmileAndBucketedSensitivities.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SmileAndBucketedSensitivities> actualMetaResult =
        SmileAndBucketedSensitivities.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("sensitivities"));
    assertTrue(metaPropertyMapResult.containsKey("smile"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SmileAndBucketedSensitivities> expectedBeanTypeResult =
        SmileAndBucketedSensitivities.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SmileAndBucketedSensitivities#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link SmileAndBucketedSensitivities#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SmileAndBucketedSensitivities.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange
    SmileAndBucketedSensitivities ofResult =
        SmileAndBucketedSensitivities.of(null, DoubleMatrix.of());

    // Act
    TypedMetaBean<SmileAndBucketedSensitivities> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("sensitivities"));
    assertTrue(metaPropertyMapResult.containsKey("smile"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SmileAndBucketedSensitivities> expectedBeanTypeResult =
        SmileAndBucketedSensitivities.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
