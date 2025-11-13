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
import com.opengamma.strata.market.option.MoneynessStrike.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MoneynessStrikeDiffblueTest {
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
    Class<? extends MoneynessStrike> actualBeanTypeResult = MoneynessStrike.meta().beanType();

    // Assert
    Class<MoneynessStrike> expectedBeanTypeResult = MoneynessStrike.class;
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
    assertNull(MoneynessStrike.meta().metaPropertyGet("Property Name"));
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
    MetaProperty<?> actualMetaPropertyGetResult = MoneynessStrike.meta().metaPropertyGet("value");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("value", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<MoneynessStrike> expectedDeclaringTypeResult = MoneynessStrike.class;
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        MoneynessStrike.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("value");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("value", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<MoneynessStrike> expectedDeclaringTypeResult = MoneynessStrike.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = MoneynessStrike.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double) metaResult.propertyGet(MoneynessStrike.of(10.0d), "value", true)).doubleValue());
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
    assertNull(MoneynessStrike.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = MoneynessStrike.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(MoneynessStrike.of(10.0d), "Property Name", false));
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
        () -> MoneynessStrike.meta().propertySet(mock(Bean.class), "value", "New Value", false));
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
        () ->
            MoneynessStrike.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> MoneynessStrike.meta().propertySet(mock(Bean.class), "value", "New Value", true));
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
    assertTrue(MoneynessStrike.meta().value() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link MoneynessStrike#of(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Type Name is {@code Moneyness}.
   * </ul>
   *
   * <p>Method under test: {@link MoneynessStrike#of(double)}
   */
  @Test
  @DisplayName("Test of(double); when ten; then return Type Name is 'Moneyness'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MoneynessStrike MoneynessStrike.of(double)"})
  void testOf_whenTen_thenReturnTypeNameIsMoneyness() {
    // Arrange and Act
    MoneynessStrike actualOfResult = MoneynessStrike.of(10.0d);

    // Assert
    StrikeType type = actualOfResult.getType();
    assertEquals("Moneyness", type.getName());
    assertEquals("Moneyness", type.toString());
    assertEquals("Moneyness=10.0", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getValue());
  }

  /**
   * Test {@link MoneynessStrike#ofStrikeAndForward(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Type Name is {@code Moneyness}.
   * </ul>
   *
   * <p>Method under test: {@link MoneynessStrike#ofStrikeAndForward(double, double)}
   */
  @Test
  @DisplayName(
      "Test ofStrikeAndForward(double, double); when ten; then return Type Name is 'Moneyness'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MoneynessStrike MoneynessStrike.ofStrikeAndForward(double, double)"})
  void testOfStrikeAndForward_whenTen_thenReturnTypeNameIsMoneyness() {
    // Arrange and Act
    MoneynessStrike actualOfStrikeAndForwardResult =
        MoneynessStrike.ofStrikeAndForward(10.0d, 10.0d);

    // Assert
    StrikeType type = actualOfStrikeAndForwardResult.getType();
    assertEquals("Moneyness", type.getName());
    assertEquals("Moneyness", type.toString());
    assertEquals("Moneyness=1.0", actualOfStrikeAndForwardResult.getLabel());
    assertEquals(1.0d, actualOfStrikeAndForwardResult.getValue());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MoneynessStrike#toString()}
   *   <li>{@link MoneynessStrike#getType()}
   *   <li>{@link MoneynessStrike#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "StrikeType MoneynessStrike.getType()",
    "double MoneynessStrike.getValue()",
    "String MoneynessStrike.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    MoneynessStrike ofResult = MoneynessStrike.of(10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    StrikeType actualType = ofResult.getType();

    // Assert
    assertEquals("MoneynessStrike{value=10.0}", actualToStringResult);
    assertEquals(10.0d, ofResult.getValue());
    assertSame(StrikeType.MONEYNESS, actualType);
  }

  /**
   * Test {@link MoneynessStrike#withValue(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link MoneynessStrike} with moneyness is ten.
   * </ul>
   *
   * <p>Method under test: {@link MoneynessStrike#withValue(double)}
   */
  @Test
  @DisplayName(
      "Test withValue(double); when ten; then return MoneynessStrike with moneyness is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MoneynessStrike MoneynessStrike.withValue(double)"})
  void testWithValue_whenTen_thenReturnMoneynessStrikeWithMoneynessIsTen() {
    // Arrange
    MoneynessStrike ofResult = MoneynessStrike.of(10.0d);

    // Act
    MoneynessStrike actualWithValueResult = ofResult.withValue(10.0d);

    // Assert
    assertEquals(ofResult, actualWithValueResult);
  }

  /**
   * Test {@link MoneynessStrike#meta()}.
   *
   * <p>Method under test: {@link MoneynessStrike#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MoneynessStrike.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = MoneynessStrike.meta();

    // Assert
    MetaProperty<Double> valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("double", valueResult.propertyType().getName());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<MoneynessStrike> expectedDeclaringTypeResult = MoneynessStrike.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
  }

  /**
   * Test {@link MoneynessStrike#metaBean()}.
   *
   * <p>Method under test: {@link MoneynessStrike#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MoneynessStrike.metaBean()"})
  void testMetaBean() {
    // Arrange
    MoneynessStrike ofResult = MoneynessStrike.of(10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link MoneynessStrike#equals(Object)}, and {@link MoneynessStrike#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MoneynessStrike#equals(Object)}
   *   <li>{@link MoneynessStrike#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MoneynessStrike.equals(Object)", "int MoneynessStrike.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MoneynessStrike ofResult = MoneynessStrike.of(10.0d);
    MoneynessStrike ofResult2 = MoneynessStrike.of(10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link MoneynessStrike#equals(Object)}, and {@link MoneynessStrike#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MoneynessStrike#equals(Object)}
   *   <li>{@link MoneynessStrike#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MoneynessStrike.equals(Object)", "int MoneynessStrike.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MoneynessStrike ofResult = MoneynessStrike.of(10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link MoneynessStrike#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MoneynessStrike#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MoneynessStrike.equals(Object)", "int MoneynessStrike.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    MoneynessStrike ofResult = MoneynessStrike.of(10.0d);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link MoneynessStrike#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MoneynessStrike#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MoneynessStrike.equals(Object)", "int MoneynessStrike.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    MoneynessStrike ofResult = MoneynessStrike.of(10.0d);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to MoneynessStrike");
  }
}
