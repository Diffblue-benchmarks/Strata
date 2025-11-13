package com.opengamma.strata.basics.value;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ValueDerivativesDiffblueTest {
  /**
   * Test {@link ValueDerivatives#of(double, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return Value is ten.
   * </ul>
   *
   * <p>Method under test: {@link ValueDerivatives#of(double, DoubleArray)}
   */
  @Test
  @DisplayName("Test of(double, DoubleArray); when DoubleArray; then return Value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives ValueDerivatives.of(double, DoubleArray)"})
  void testOf_whenDoubleArray_thenReturnValueIsTen() {
    // Arrange and Act
    ValueDerivatives actualOfResult = ValueDerivatives.of(10.0d, DoubleArray.of());

    // Assert
    assertEquals(10.0d, actualOfResult.getValue());
    assertSame(DoubleArray.EMPTY, actualOfResult.getDerivatives());
  }

  /**
   * Test {@link ValueDerivatives#getDerivative(int)}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ValueDerivatives#getDerivative(int)}
   */
  @Test
  @DisplayName("Test getDerivative(int); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ValueDerivatives.getDerivative(int)"})
  void testGetDerivative_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, ValueDerivatives.of(10.0d, DoubleArray.filled(3)).getDerivative(1));
  }

  /**
   * Test {@link ValueDerivatives#meta()}.
   *
   * <p>Method under test: {@link ValueDerivatives#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean ValueDerivatives.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<ValueDerivatives> actualMetaResult = ValueDerivatives.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("derivatives"));
    assertTrue(metaPropertyMapResult.containsKey("value"));
    assertTrue(actualMetaResult.isBuildable());
    Class<ValueDerivatives> expectedBeanTypeResult = ValueDerivatives.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link ValueDerivatives#metaBean()}.
   *
   * <p>Method under test: {@link ValueDerivatives#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean ValueDerivatives.metaBean()"})
  void testMetaBean() {
    // Arrange
    ValueDerivatives ofResult = ValueDerivatives.of(10.0d, DoubleArray.of());

    // Act
    TypedMetaBean<ValueDerivatives> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("derivatives"));
    assertTrue(metaPropertyMapResult.containsKey("value"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<ValueDerivatives> expectedBeanTypeResult = ValueDerivatives.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueDerivatives#toString()}
   *   <li>{@link ValueDerivatives#getDerivatives()}
   *   <li>{@link ValueDerivatives#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray ValueDerivatives.getDerivatives()",
    "double ValueDerivatives.getValue()",
    "String ValueDerivatives.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ValueDerivatives ofResult = ValueDerivatives.of(10.0d, DoubleArray.of());

    // Act
    String actualToStringResult = ofResult.toString();
    DoubleArray actualDerivatives = ofResult.getDerivatives();

    // Assert
    assertEquals("ValueDerivatives{value=10.0, derivatives=[]}", actualToStringResult);
    assertEquals(10.0d, ofResult.getValue());
    assertSame(DoubleArray.EMPTY, actualDerivatives);
  }

  /**
   * Test {@link ValueDerivatives#equals(Object)}, and {@link ValueDerivatives#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueDerivatives#equals(Object)}
   *   <li>{@link ValueDerivatives#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueDerivatives.equals(Object)", "int ValueDerivatives.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ValueDerivatives ofResult = ValueDerivatives.of(10.0d, DoubleArray.of());
    ValueDerivatives ofResult2 = ValueDerivatives.of(10.0d, DoubleArray.of());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link ValueDerivatives#equals(Object)}, and {@link ValueDerivatives#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueDerivatives#equals(Object)}
   *   <li>{@link ValueDerivatives#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueDerivatives.equals(Object)", "int ValueDerivatives.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ValueDerivatives ofResult = ValueDerivatives.of(10.0d, DoubleArray.of());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link ValueDerivatives#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueDerivatives#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueDerivatives.equals(Object)", "int ValueDerivatives.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ValueDerivatives ofResult = ValueDerivatives.of(10.0d, DoubleArray.of());

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link ValueDerivatives#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueDerivatives#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueDerivatives.equals(Object)", "int ValueDerivatives.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ValueDerivatives ofResult = ValueDerivatives.of(0.5d, DoubleArray.of());

    // Act and Assert
    assertNotEquals(ofResult, ValueDerivatives.of(10.0d, DoubleArray.of()));
  }

  /**
   * Test {@link ValueDerivatives#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueDerivatives#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueDerivatives.equals(Object)", "int ValueDerivatives.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ValueDerivatives ofResult = ValueDerivatives.of(10.0d, DoubleArray.filled(3));

    // Act and Assert
    assertNotEquals(ofResult, ValueDerivatives.of(10.0d, DoubleArray.of()));
  }

  /**
   * Test {@link ValueDerivatives#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueDerivatives#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueDerivatives.equals(Object)", "int ValueDerivatives.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ValueDerivatives ofResult = ValueDerivatives.of(10.0d, DoubleArray.of());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link ValueDerivatives#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueDerivatives#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueDerivatives.equals(Object)", "int ValueDerivatives.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ValueDerivatives ofResult = ValueDerivatives.of(10.0d, DoubleArray.of());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to ValueDerivatives");
  }
}
