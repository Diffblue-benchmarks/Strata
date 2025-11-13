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
import com.opengamma.strata.market.option.LogMoneynessStrike.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LogMoneynessStrikeDiffblueTest {
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
    Class<? extends LogMoneynessStrike> actualBeanTypeResult = LogMoneynessStrike.meta().beanType();

    // Assert
    Class<LogMoneynessStrike> expectedBeanTypeResult = LogMoneynessStrike.class;
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
    assertNull(LogMoneynessStrike.meta().metaPropertyGet("Property Name"));
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
    MetaProperty<?> actualMetaPropertyGetResult =
        LogMoneynessStrike.meta().metaPropertyGet("value");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("value", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<LogMoneynessStrike> expectedDeclaringTypeResult = LogMoneynessStrike.class;
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
        LogMoneynessStrike.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("value");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("value", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<LogMoneynessStrike> expectedDeclaringTypeResult = LogMoneynessStrike.class;
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
    Meta metaResult = LogMoneynessStrike.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double) metaResult.propertyGet(LogMoneynessStrike.of(10.0d), "value", true))
            .doubleValue());
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
    assertNull(LogMoneynessStrike.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = LogMoneynessStrike.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(LogMoneynessStrike.of(10.0d), "Property Name", false));
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
        () -> LogMoneynessStrike.meta().propertySet(mock(Bean.class), "value", "New Value", false));
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
            LogMoneynessStrike.meta()
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
        () -> LogMoneynessStrike.meta().propertySet(mock(Bean.class), "value", "New Value", true));
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
    assertTrue(LogMoneynessStrike.meta().value() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link LogMoneynessStrike#of(double)}.
   *
   * <p>Method under test: {@link LogMoneynessStrike#of(double)}
   */
  @Test
  @DisplayName("Test of(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LogMoneynessStrike LogMoneynessStrike.of(double)"})
  void testOf() {
    // Arrange and Act
    LogMoneynessStrike actualOfResult = LogMoneynessStrike.of(10.0d);

    // Assert
    StrikeType type = actualOfResult.getType();
    assertEquals("LogMoneyness", type.getName());
    assertEquals("LogMoneyness", type.toString());
    assertEquals("LogMoneyness=10.0", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getValue());
  }

  /**
   * Test {@link LogMoneynessStrike#ofStrikeAndForward(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Type Name is {@code LogMoneyness}.
   * </ul>
   *
   * <p>Method under test: {@link LogMoneynessStrike#ofStrikeAndForward(double, double)}
   */
  @Test
  @DisplayName(
      "Test ofStrikeAndForward(double, double); when ten; then return Type Name is 'LogMoneyness'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LogMoneynessStrike LogMoneynessStrike.ofStrikeAndForward(double, double)"})
  void testOfStrikeAndForward_whenTen_thenReturnTypeNameIsLogMoneyness() {
    // Arrange and Act
    LogMoneynessStrike actualOfStrikeAndForwardResult =
        LogMoneynessStrike.ofStrikeAndForward(10.0d, 10.0d);

    // Assert
    StrikeType type = actualOfStrikeAndForwardResult.getType();
    assertEquals("LogMoneyness", type.getName());
    assertEquals("LogMoneyness", type.toString());
    assertEquals("LogMoneyness=0.0", actualOfStrikeAndForwardResult.getLabel());
    assertEquals(0.0d, actualOfStrikeAndForwardResult.getValue());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LogMoneynessStrike#toString()}
   *   <li>{@link LogMoneynessStrike#getType()}
   *   <li>{@link LogMoneynessStrike#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "StrikeType LogMoneynessStrike.getType()",
    "double LogMoneynessStrike.getValue()",
    "String LogMoneynessStrike.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LogMoneynessStrike ofResult = LogMoneynessStrike.of(10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    StrikeType actualType = ofResult.getType();

    // Assert
    assertEquals("LogMoneynessStrike{value=10.0}", actualToStringResult);
    assertEquals(10.0d, ofResult.getValue());
    assertSame(StrikeType.LOG_MONEYNESS, actualType);
  }

  /**
   * Test {@link LogMoneynessStrike#withValue(double)}.
   *
   * <p>Method under test: {@link LogMoneynessStrike#withValue(double)}
   */
  @Test
  @DisplayName("Test withValue(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Strike LogMoneynessStrike.withValue(double)"})
  void testWithValue() {
    // Arrange
    LogMoneynessStrike ofResult = LogMoneynessStrike.of(10.0d);

    // Act
    Strike actualWithValueResult = ofResult.withValue(10.0d);

    // Assert
    assertTrue(actualWithValueResult instanceof LogMoneynessStrike);
    assertEquals(ofResult, actualWithValueResult);
  }

  /**
   * Test {@link LogMoneynessStrike#meta()}.
   *
   * <p>Method under test: {@link LogMoneynessStrike#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LogMoneynessStrike.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = LogMoneynessStrike.meta();

    // Assert
    MetaProperty<Double> valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("double", valueResult.propertyType().getName());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<LogMoneynessStrike> expectedDeclaringTypeResult = LogMoneynessStrike.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
  }

  /**
   * Test {@link LogMoneynessStrike#metaBean()}.
   *
   * <p>Method under test: {@link LogMoneynessStrike#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LogMoneynessStrike.metaBean()"})
  void testMetaBean() {
    // Arrange
    LogMoneynessStrike ofResult = LogMoneynessStrike.of(10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link LogMoneynessStrike#equals(Object)}, and {@link LogMoneynessStrike#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LogMoneynessStrike#equals(Object)}
   *   <li>{@link LogMoneynessStrike#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LogMoneynessStrike.equals(Object)",
    "int LogMoneynessStrike.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LogMoneynessStrike ofResult = LogMoneynessStrike.of(10.0d);
    LogMoneynessStrike ofResult2 = LogMoneynessStrike.of(10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link LogMoneynessStrike#equals(Object)}, and {@link LogMoneynessStrike#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LogMoneynessStrike#equals(Object)}
   *   <li>{@link LogMoneynessStrike#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LogMoneynessStrike.equals(Object)",
    "int LogMoneynessStrike.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LogMoneynessStrike ofResult = LogMoneynessStrike.of(10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link LogMoneynessStrike#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LogMoneynessStrike#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LogMoneynessStrike.equals(Object)",
    "int LogMoneynessStrike.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    LogMoneynessStrike ofResult = LogMoneynessStrike.of(10.0d);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link LogMoneynessStrike#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LogMoneynessStrike#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LogMoneynessStrike.equals(Object)",
    "int LogMoneynessStrike.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    LogMoneynessStrike ofResult = LogMoneynessStrike.of(10.0d);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to LogMoneynessStrike");
  }
}
