package com.opengamma.strata.measure.cms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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

class CmsSabrExtrapolationParamsDiffblueTest {
  /**
   * Test {@link CmsSabrExtrapolationParams#of(double, double)}.
   *
   * <p>Method under test: {@link CmsSabrExtrapolationParams#of(double, double)}
   */
  @Test
  @DisplayName("Test of(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CmsSabrExtrapolationParams CmsSabrExtrapolationParams.of(double, double)"})
  void testOf() {
    // Arrange and Act
    CmsSabrExtrapolationParams actualOfResult = CmsSabrExtrapolationParams.of(10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getCutOffStrike());
    assertEquals(10.0d, actualOfResult.getMu());
  }

  /**
   * Test {@link CmsSabrExtrapolationParams#meta()}.
   *
   * <p>Method under test: {@link CmsSabrExtrapolationParams#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CmsSabrExtrapolationParams.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CmsSabrExtrapolationParams> actualMetaResult = CmsSabrExtrapolationParams.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("cutOffStrike"));
    assertTrue(metaPropertyMapResult.containsKey("mu"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CmsSabrExtrapolationParams> expectedBeanTypeResult = CmsSabrExtrapolationParams.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CmsSabrExtrapolationParams#metaBean()}.
   *
   * <p>Method under test: {@link CmsSabrExtrapolationParams#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CmsSabrExtrapolationParams.metaBean()"})
  void testMetaBean() {
    // Arrange
    CmsSabrExtrapolationParams ofResult = CmsSabrExtrapolationParams.of(10.0d, 10.0d);

    // Act
    TypedMetaBean<CmsSabrExtrapolationParams> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("cutOffStrike"));
    assertTrue(metaPropertyMapResult.containsKey("mu"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CmsSabrExtrapolationParams> expectedBeanTypeResult = CmsSabrExtrapolationParams.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CmsSabrExtrapolationParams#toString()}
   *   <li>{@link CmsSabrExtrapolationParams#getCutOffStrike()}
   *   <li>{@link CmsSabrExtrapolationParams#getMu()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double CmsSabrExtrapolationParams.getCutOffStrike()",
    "double CmsSabrExtrapolationParams.getMu()",
    "String CmsSabrExtrapolationParams.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CmsSabrExtrapolationParams ofResult = CmsSabrExtrapolationParams.of(10.0d, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    double actualCutOffStrike = ofResult.getCutOffStrike();

    // Assert
    assertEquals("CmsSabrExtrapolationParams{cutOffStrike=10.0, mu=10.0}", actualToStringResult);
    assertEquals(10.0d, actualCutOffStrike);
    assertEquals(10.0d, ofResult.getMu());
  }

  /**
   * Test {@link CmsSabrExtrapolationParams#equals(Object)}, and {@link
   * CmsSabrExtrapolationParams#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CmsSabrExtrapolationParams#equals(Object)}
   *   <li>{@link CmsSabrExtrapolationParams#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CmsSabrExtrapolationParams.equals(Object)",
    "int CmsSabrExtrapolationParams.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CmsSabrExtrapolationParams ofResult = CmsSabrExtrapolationParams.of(10.0d, 10.0d);
    CmsSabrExtrapolationParams ofResult2 = CmsSabrExtrapolationParams.of(10.0d, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CmsSabrExtrapolationParams#equals(Object)}, and {@link
   * CmsSabrExtrapolationParams#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CmsSabrExtrapolationParams#equals(Object)}
   *   <li>{@link CmsSabrExtrapolationParams#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CmsSabrExtrapolationParams.equals(Object)",
    "int CmsSabrExtrapolationParams.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CmsSabrExtrapolationParams ofResult = CmsSabrExtrapolationParams.of(10.0d, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CmsSabrExtrapolationParams#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CmsSabrExtrapolationParams#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CmsSabrExtrapolationParams.equals(Object)",
    "int CmsSabrExtrapolationParams.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CmsSabrExtrapolationParams ofResult = CmsSabrExtrapolationParams.of(10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link CmsSabrExtrapolationParams#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CmsSabrExtrapolationParams#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CmsSabrExtrapolationParams.equals(Object)",
    "int CmsSabrExtrapolationParams.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CmsSabrExtrapolationParams ofResult = CmsSabrExtrapolationParams.of(0.5d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, CmsSabrExtrapolationParams.of(10.0d, 10.0d));
  }

  /**
   * Test {@link CmsSabrExtrapolationParams#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CmsSabrExtrapolationParams#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CmsSabrExtrapolationParams.equals(Object)",
    "int CmsSabrExtrapolationParams.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CmsSabrExtrapolationParams ofResult = CmsSabrExtrapolationParams.of(10.0d, 0.5d);

    // Act and Assert
    assertNotEquals(ofResult, CmsSabrExtrapolationParams.of(10.0d, 10.0d));
  }

  /**
   * Test {@link CmsSabrExtrapolationParams#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CmsSabrExtrapolationParams#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CmsSabrExtrapolationParams.equals(Object)",
    "int CmsSabrExtrapolationParams.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CmsSabrExtrapolationParams ofResult = CmsSabrExtrapolationParams.of(10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link CmsSabrExtrapolationParams#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CmsSabrExtrapolationParams#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CmsSabrExtrapolationParams.equals(Object)",
    "int CmsSabrExtrapolationParams.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CmsSabrExtrapolationParams ofResult = CmsSabrExtrapolationParams.of(10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to CmsSabrExtrapolationParams");
  }
}
