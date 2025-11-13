package com.opengamma.strata.market.option;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.option.DeltaStrike.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DeltaStrikeDiffblueTest {
  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends DeltaStrike> actualBeanTypeResult = DeltaStrike.meta().beanType();

    // Assert
    Class<DeltaStrike> expectedBeanTypeResult = DeltaStrike.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(DeltaStrike.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'value'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValue_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = DeltaStrike.meta().metaPropertyGet("value");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("value", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<DeltaStrike> expectedDeclaringTypeResult = DeltaStrike.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = DeltaStrike.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("value");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("value", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<DeltaStrike> expectedDeclaringTypeResult = DeltaStrike.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(DeltaStrike.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link DeltaStrike} with delta is {@code 0.5}.
   *   <li>Then return doubleValue is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when DeltaStrike with delta is '0.5'; then return doubleValue is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDeltaStrikeWithDeltaIs05_thenReturnDoubleValueIs05() {
    // Arrange
    Meta metaResult = DeltaStrike.meta();

    // Act and Assert
    assertEquals(
        0.5d, ((Double) metaResult.propertyGet(DeltaStrike.of(0.5d), "value", true)).doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = DeltaStrike.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(DeltaStrike.of(0.5d), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> DeltaStrike.meta().propertySet(mock(Bean.class), "value", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> DeltaStrike.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'value'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> DeltaStrike.meta().propertySet(mock(Bean.class), "value", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#value()}.
   *
   * <p>Method under test: {@link Meta#value()}
   */
  @Test
  @DisplayName("Test Meta value()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.value()"})
  void testMetaValue() {
    // Arrange, Act and Assert
    assertTrue(DeltaStrike.meta().value() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link DeltaStrike#of(double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return Type Name is {@code Delta}.
   * </ul>
   *
   * <p>Method under test: {@link DeltaStrike#of(double)}
   */
  @Test
  @DisplayName("Test of(double); when '0.5'; then return Type Name is 'Delta'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DeltaStrike DeltaStrike.of(double)"})
  void testOf_when05_thenReturnTypeNameIsDelta() {
    // Arrange and Act
    DeltaStrike actualOfResult = DeltaStrike.of(0.5d);

    // Assert
    StrikeType type = actualOfResult.getType();
    assertEquals("Delta", type.getName());
    assertEquals("Delta", type.toString());
    assertEquals("Delta=0.5", actualOfResult.getLabel());
    assertEquals(0.5d, actualOfResult.getValue());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DeltaStrike#toString()}
   *   <li>{@link DeltaStrike#getType()}
   *   <li>{@link DeltaStrike#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "StrikeType DeltaStrike.getType()",
    "double DeltaStrike.getValue()",
    "String DeltaStrike.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DeltaStrike ofResult = DeltaStrike.of(0.5d);

    // Act
    String actualToStringResult = ofResult.toString();
    StrikeType actualType = ofResult.getType();

    // Assert
    assertEquals("DeltaStrike{value=0.5}", actualToStringResult);
    assertEquals(0.5d, ofResult.getValue());
    assertSame(StrikeType.DELTA, actualType);
  }

  /**
   * Test {@link DeltaStrike#withValue(double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Type Name is {@code Delta}.
   * </ul>
   *
   * <p>Method under test: {@link DeltaStrike#withValue(double)}
   */
  @Test
  @DisplayName("Test withValue(double); when one; then return Type Name is 'Delta'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DeltaStrike DeltaStrike.withValue(double)"})
  void testWithValue_whenOne_thenReturnTypeNameIsDelta() {
    // Arrange
    DeltaStrike ofResult = DeltaStrike.of(0.5d);

    // Act
    DeltaStrike actualWithValueResult = ofResult.withValue(1.0d);

    // Assert
    StrikeType type = actualWithValueResult.getType();
    assertEquals("Delta", type.getName());
    assertEquals("Delta", type.toString());
    assertEquals("Delta=1.0", actualWithValueResult.getLabel());
    assertEquals(1.0d, actualWithValueResult.getValue());
  }

  /**
   * Test {@link DeltaStrike#meta()}.
   *
   * <p>Method under test: {@link DeltaStrike#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DeltaStrike.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DeltaStrike.meta();

    // Assert
    MetaProperty<Double> valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("double", valueResult.propertyType().getName());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DeltaStrike> expectedDeclaringTypeResult = DeltaStrike.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
  }

  /**
   * Test {@link DeltaStrike#metaBean()}.
   *
   * <p>Method under test: {@link DeltaStrike#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DeltaStrike.metaBean()"})
  void testMetaBean() {
    // Arrange
    DeltaStrike ofResult = DeltaStrike.of(0.5d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link DeltaStrike#equals(Object)}, and {@link DeltaStrike#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DeltaStrike#equals(Object)}
   *   <li>{@link DeltaStrike#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DeltaStrike.equals(Object)", "int DeltaStrike.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DeltaStrike ofResult = DeltaStrike.of(0.5d);
    DeltaStrike ofResult2 = DeltaStrike.of(0.5d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DeltaStrike#equals(Object)}, and {@link DeltaStrike#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DeltaStrike#equals(Object)}
   *   <li>{@link DeltaStrike#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DeltaStrike.equals(Object)", "int DeltaStrike.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DeltaStrike ofResult = DeltaStrike.of(0.5d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DeltaStrike#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DeltaStrike#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DeltaStrike.equals(Object)", "int DeltaStrike.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DeltaStrike ofResult = DeltaStrike.of(0.5d);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link DeltaStrike#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DeltaStrike#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DeltaStrike.equals(Object)", "int DeltaStrike.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DeltaStrike ofResult = DeltaStrike.of(0.5d);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to DeltaStrike");
  }
}
