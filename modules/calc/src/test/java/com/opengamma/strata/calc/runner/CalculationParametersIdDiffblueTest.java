package com.opengamma.strata.calc.runner;

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

class CalculationParametersIdDiffblueTest {
  /**
   * Test {@link CalculationParametersId#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParametersId#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationParametersId CalculationParametersId.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    CalculationParametersId actualOfResult = CalculationParametersId.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    Class<CalculationParameters> expectedMarketDataType = CalculationParameters.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationParametersId#toString()}
   *   <li>{@link CalculationParametersId#getMarketDataType()}
   *   <li>{@link CalculationParametersId#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class CalculationParametersId.getMarketDataType()",
    "String CalculationParametersId.getName()",
    "String CalculationParametersId.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CalculationParametersId ofResult = CalculationParametersId.of("Name");

    // Act
    String actualToStringResult = ofResult.toString();
    Class<CalculationParameters> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    assertEquals("CalculationParametersId{name=Name}", actualToStringResult);
    assertEquals("Name", ofResult.getName());
    Class<CalculationParameters> expectedMarketDataType = CalculationParameters.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }

  /**
   * Test {@link CalculationParametersId#meta()}.
   *
   * <p>Method under test: {@link CalculationParametersId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationParametersId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CalculationParametersId> actualMetaResult = CalculationParametersId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CalculationParametersId> expectedBeanTypeResult = CalculationParametersId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CalculationParametersId#metaBean()}.
   *
   * <p>Method under test: {@link CalculationParametersId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationParametersId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<CalculationParametersId> actualMetaBeanResult =
        CalculationParametersId.STANDARD.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CalculationParametersId> expectedBeanTypeResult = CalculationParametersId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link CalculationParametersId#equals(Object)}, and {@link
   * CalculationParametersId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationParametersId#equals(Object)}
   *   <li>{@link CalculationParametersId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationParametersId.equals(Object)",
    "int CalculationParametersId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CalculationParametersId calculationParametersId = CalculationParametersId.STANDARD;
    CalculationParametersId calculationParametersId2 = CalculationParametersId.STANDARD;

    // Act and Assert
    assertEquals(calculationParametersId, calculationParametersId2);
    assertEquals(calculationParametersId.hashCode(), calculationParametersId2.hashCode());
  }

  /**
   * Test {@link CalculationParametersId#equals(Object)}, and {@link
   * CalculationParametersId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationParametersId#equals(Object)}
   *   <li>{@link CalculationParametersId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationParametersId.equals(Object)",
    "int CalculationParametersId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CalculationParametersId calculationParametersId = CalculationParametersId.STANDARD;

    // Act and Assert
    assertEquals(calculationParametersId, calculationParametersId);
    int expectedHashCodeResult = calculationParametersId.hashCode();
    assertEquals(expectedHashCodeResult, calculationParametersId.hashCode());
  }

  /**
   * Test {@link CalculationParametersId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParametersId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationParametersId.equals(Object)",
    "int CalculationParametersId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CalculationParametersId.of("Name"), CalculationParametersId.STANDARD);
  }

  /**
   * Test {@link CalculationParametersId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParametersId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationParametersId.equals(Object)",
    "int CalculationParametersId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CalculationParametersId.STANDARD, null);
  }

  /**
   * Test {@link CalculationParametersId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParametersId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationParametersId.equals(Object)",
    "int CalculationParametersId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CalculationParametersId.STANDARD, "Different type to CalculationParametersId");
  }
}
