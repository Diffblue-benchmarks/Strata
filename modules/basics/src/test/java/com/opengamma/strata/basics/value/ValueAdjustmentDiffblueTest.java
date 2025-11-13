package com.opengamma.strata.basics.value;

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
import com.opengamma.strata.basics.value.ValueAdjustment.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ValueAdjustmentDiffblueTest {
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
    Class<? extends ValueAdjustment> actualBeanTypeResult = ValueAdjustment.meta().beanType();

    // Assert
    Class<ValueAdjustment> expectedBeanTypeResult = ValueAdjustment.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#modifyingValue()}
   *   <li>{@link Meta#type()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.modifyingValue()", "MetaProperty Meta.type()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ValueAdjustment.meta();

    // Act
    MetaProperty<Double> actualModifyingValueResult = metaResult.modifyingValue();

    // Assert
    assertTrue(actualModifyingValueResult instanceof DirectMetaProperty);
    assertTrue(metaResult.type() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean modifyingValue return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean modifyingValue return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanModifyingValueReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ValueAdjustment.meta().metaPropertyGet("type");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> modifyingValueResult = ((Meta) metaBeanResult).modifyingValue();
    assertTrue(modifyingValueResult instanceof DirectMetaProperty);
    assertEquals("double", modifyingValueResult.propertyType().getName());
    assertEquals("modifyingValue", modifyingValueResult.name());
    assertEquals("type", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, modifyingValueResult.style());
    Class<ValueAdjustment> expectedDeclaringTypeResult = ValueAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, modifyingValueResult.declaringType());
    Class<ValueAdjustmentType> expectedPropertyTypeResult = ValueAdjustmentType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).type());
    assertSame(Meta.INSTANCE, modifyingValueResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean type return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean type return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanTypeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ValueAdjustment.meta().metaPropertyGet("modifyingValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ValueAdjustmentType> typeResult = ((Meta) metaBeanResult).type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("modifyingValue", actualMetaPropertyGetResult.name());
    assertEquals("type", typeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, typeResult.style());
    Class<ValueAdjustment> expectedDeclaringTypeResult = ValueAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, typeResult.declaringType());
    Class<ValueAdjustmentType> expectedPropertyTypeResult = ValueAdjustmentType.class;
    assertEquals(expectedPropertyTypeResult, typeResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).modifyingValue());
    assertSame(Meta.INSTANCE, typeResult.metaBean());
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
    assertNull(ValueAdjustment.meta().metaPropertyGet("Property Name"));
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
        ValueAdjustment.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("modifyingValue");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("type");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("modifyingValue", getResult.name());
    assertEquals("type", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<ValueAdjustment> expectedDeclaringTypeResult = ValueAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ValueAdjustment> expectedDeclaringTypeResult2 = ValueAdjustment.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<ValueAdjustmentType> expectedPropertyTypeResult = ValueAdjustmentType.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
    assertNull(ValueAdjustment.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> ValueAdjustment.meta().propertyGet(ValueAdjustment.NONE, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code modifyingValue}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'modifyingValue'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenModifyingValue_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ((Double) ValueAdjustment.meta().propertyGet(ValueAdjustment.NONE, "modifyingValue", true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'type'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ValueAdjustment.meta().propertyGet(ValueAdjustment.NONE, "type", true));
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
        () ->
            ValueAdjustment.meta()
                .propertySet(mock(Bean.class), "modifyingValue", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code modifyingValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'modifyingValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenModifyingValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ValueAdjustment.meta()
                .propertySet(mock(Bean.class), "modifyingValue", "New Value", true));
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
            ValueAdjustment.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'type'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ValueAdjustment.meta().propertySet(mock(Bean.class), "type", "New Value", true));
  }

  /**
   * Test {@link ValueAdjustment#ofReplace(double)}.
   *
   * <p>Method under test: {@link ValueAdjustment#ofReplace(double)}
   */
  @Test
  @DisplayName("Test ofReplace(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueAdjustment ValueAdjustment.ofReplace(double)"})
  void testOfReplace() {
    // Arrange and Act
    ValueAdjustment actualOfReplaceResult = ValueAdjustment.ofReplace(10.0d);

    // Assert
    assertEquals(10.0d, actualOfReplaceResult.getModifyingValue());
    assertEquals(ValueAdjustmentType.REPLACE, actualOfReplaceResult.getType());
  }

  /**
   * Test {@link ValueAdjustment#ofDeltaAmount(double)}.
   *
   * <p>Method under test: {@link ValueAdjustment#ofDeltaAmount(double)}
   */
  @Test
  @DisplayName("Test ofDeltaAmount(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueAdjustment ValueAdjustment.ofDeltaAmount(double)"})
  void testOfDeltaAmount() {
    // Arrange and Act
    ValueAdjustment actualOfDeltaAmountResult = ValueAdjustment.ofDeltaAmount(0.5d);

    // Assert
    assertEquals(0.5d, actualOfDeltaAmountResult.getModifyingValue());
    assertEquals(ValueAdjustmentType.DELTA_AMOUNT, actualOfDeltaAmountResult.getType());
  }

  /**
   * Test {@link ValueAdjustment#ofDeltaMultiplier(double)}.
   *
   * <p>Method under test: {@link ValueAdjustment#ofDeltaMultiplier(double)}
   */
  @Test
  @DisplayName("Test ofDeltaMultiplier(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueAdjustment ValueAdjustment.ofDeltaMultiplier(double)"})
  void testOfDeltaMultiplier() {
    // Arrange and Act
    ValueAdjustment actualOfDeltaMultiplierResult = ValueAdjustment.ofDeltaMultiplier(0.5d);

    // Assert
    assertEquals(0.5d, actualOfDeltaMultiplierResult.getModifyingValue());
    assertEquals(ValueAdjustmentType.DELTA_MULTIPLIER, actualOfDeltaMultiplierResult.getType());
  }

  /**
   * Test {@link ValueAdjustment#ofMultiplier(double)}.
   *
   * <p>Method under test: {@link ValueAdjustment#ofMultiplier(double)}
   */
  @Test
  @DisplayName("Test ofMultiplier(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueAdjustment ValueAdjustment.ofMultiplier(double)"})
  void testOfMultiplier() {
    // Arrange and Act
    ValueAdjustment actualOfMultiplierResult = ValueAdjustment.ofMultiplier(10.0d);

    // Assert
    assertEquals(10.0d, actualOfMultiplierResult.getModifyingValue());
    assertEquals(ValueAdjustmentType.MULTIPLIER, actualOfMultiplierResult.getType());
  }

  /**
   * Test {@link ValueAdjustment#toString()}.
   *
   * <ul>
   *   <li>Given {@link ValueAdjustment#NONE}.
   *   <li>Then return {@code ValueAdjustment[result = input]}.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); given NONE; then return 'ValueAdjustment[result = input]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ValueAdjustment.toString()"})
  void testToString_givenNone_thenReturnValueAdjustmentResultInput() {
    // Arrange, Act and Assert
    assertEquals("ValueAdjustment[result = input]", ValueAdjustment.NONE.toString());
  }

  /**
   * Test {@link ValueAdjustment#toString()}.
   *
   * <ul>
   *   <li>Given ofDeltaAmount {@code 0.5}.
   *   <li>Then return {@code ValueAdjustment[result = input + 0.5]}.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustment#toString()}
   */
  @Test
  @DisplayName(
      "Test toString(); given ofDeltaAmount '0.5'; then return 'ValueAdjustment[result = input + 0.5]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ValueAdjustment.toString()"})
  void testToString_givenOfDeltaAmount05_thenReturnValueAdjustmentResultInput05() {
    // Arrange
    ValueAdjustment ofDeltaAmountResult = ValueAdjustment.ofDeltaAmount(0.5d);

    // Act and Assert
    assertEquals("ValueAdjustment[result = input + 0.5]", ofDeltaAmountResult.toString());
  }

  /**
   * Test {@link ValueAdjustment#toString()}.
   *
   * <ul>
   *   <li>Given ofMultiplier ten.
   *   <li>Then return {@code ValueAdjustment[result = input * 10.0]}.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustment#toString()}
   */
  @Test
  @DisplayName(
      "Test toString(); given ofMultiplier ten; then return 'ValueAdjustment[result = input * 10.0]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ValueAdjustment.toString()"})
  void testToString_givenOfMultiplierTen_thenReturnValueAdjustmentResultInput100() {
    // Arrange
    ValueAdjustment ofMultiplierResult = ValueAdjustment.ofMultiplier(10.0d);

    // Act and Assert
    assertEquals("ValueAdjustment[result = input * 10.0]", ofMultiplierResult.toString());
  }

  /**
   * Test {@link ValueAdjustment#toString()}.
   *
   * <ul>
   *   <li>Then return {@code ValueAdjustment[result = input + input * 0.5]}.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'ValueAdjustment[result = input + input * 0.5]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ValueAdjustment.toString()"})
  void testToString_thenReturnValueAdjustmentResultInputInput05() {
    // Arrange
    ValueAdjustment ofDeltaMultiplierResult = ValueAdjustment.ofDeltaMultiplier(0.5d);

    // Act and Assert
    assertEquals(
        "ValueAdjustment[result = input + input * 0.5]", ofDeltaMultiplierResult.toString());
  }

  /**
   * Test {@link ValueAdjustment#adjust(double)}.
   *
   * <ul>
   *   <li>Given {@link ValueAdjustment#NONE}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustment#adjust(double)}
   */
  @Test
  @DisplayName("Test adjust(double); given NONE; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ValueAdjustment.adjust(double)"})
  void testAdjust_givenNone_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, ValueAdjustment.NONE.adjust(10.0d));
  }

  /**
   * Test {@link ValueAdjustment#adjust(double)}.
   *
   * <ul>
   *   <li>Given ofDeltaMultiplier {@code 0.5}.
   *   <li>Then return fifteen.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustment#adjust(double)}
   */
  @Test
  @DisplayName("Test adjust(double); given ofDeltaMultiplier '0.5'; then return fifteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ValueAdjustment.adjust(double)"})
  void testAdjust_givenOfDeltaMultiplier05_thenReturnFifteen() {
    // Arrange
    ValueAdjustment ofDeltaMultiplierResult = ValueAdjustment.ofDeltaMultiplier(0.5d);

    // Act and Assert
    assertEquals(15.0d, ofDeltaMultiplierResult.adjust(10.0d));
  }

  /**
   * Test {@link ValueAdjustment#adjust(double)}.
   *
   * <ul>
   *   <li>Given ofMultiplier ten.
   *   <li>Then return one hundred.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustment#adjust(double)}
   */
  @Test
  @DisplayName("Test adjust(double); given ofMultiplier ten; then return one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ValueAdjustment.adjust(double)"})
  void testAdjust_givenOfMultiplierTen_thenReturnOneHundred() {
    // Arrange
    ValueAdjustment ofMultiplierResult = ValueAdjustment.ofMultiplier(10.0d);

    // Act and Assert
    assertEquals(100.0d, ofMultiplierResult.adjust(10.0d));
  }

  /**
   * Test {@link ValueAdjustment#meta()}.
   *
   * <p>Method under test: {@link ValueAdjustment#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValueAdjustment.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ValueAdjustment.meta();

    // Assert
    MetaProperty<Double> modifyingValueResult = actualMetaResult.modifyingValue();
    assertTrue(modifyingValueResult instanceof DirectMetaProperty);
    MetaProperty<ValueAdjustmentType> typeResult = actualMetaResult.type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("double", modifyingValueResult.propertyType().getName());
    assertEquals("modifyingValue", modifyingValueResult.name());
    assertEquals("type", typeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, modifyingValueResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, typeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ValueAdjustment> expectedDeclaringTypeResult = ValueAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, modifyingValueResult.declaringType());
    Class<ValueAdjustment> expectedDeclaringTypeResult2 = ValueAdjustment.class;
    assertEquals(expectedDeclaringTypeResult2, typeResult.declaringType());
    Class<ValueAdjustmentType> expectedPropertyTypeResult = ValueAdjustmentType.class;
    assertEquals(expectedPropertyTypeResult, typeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, modifyingValueResult.metaBean());
    assertSame(meta, typeResult.metaBean());
  }

  /**
   * Test {@link ValueAdjustment#metaBean()}.
   *
   * <p>Method under test: {@link ValueAdjustment#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValueAdjustment.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, ValueAdjustment.NONE.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueAdjustment#getModifyingValue()}
   *   <li>{@link ValueAdjustment#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double ValueAdjustment.getModifyingValue()",
    "ValueAdjustmentType ValueAdjustment.getType()"
  })
  void testGettersAndSetters() {
    // Arrange
    ValueAdjustment ofDeltaAmountResult = ValueAdjustment.ofDeltaAmount(0.5d);

    // Act
    double actualModifyingValue = ofDeltaAmountResult.getModifyingValue();

    // Assert
    assertEquals(0.5d, actualModifyingValue);
    assertEquals(ValueAdjustmentType.DELTA_AMOUNT, ofDeltaAmountResult.getType());
  }

  /**
   * Test {@link ValueAdjustment#equals(Object)}, and {@link ValueAdjustment#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueAdjustment#equals(Object)}
   *   <li>{@link ValueAdjustment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueAdjustment.equals(Object)", "int ValueAdjustment.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ValueAdjustment valueAdjustment = ValueAdjustment.NONE;
    ValueAdjustment valueAdjustment2 = ValueAdjustment.NONE;

    // Act and Assert
    assertEquals(valueAdjustment, valueAdjustment2);
    assertEquals(valueAdjustment.hashCode(), valueAdjustment2.hashCode());
  }

  /**
   * Test {@link ValueAdjustment#equals(Object)}, and {@link ValueAdjustment#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueAdjustment#equals(Object)}
   *   <li>{@link ValueAdjustment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueAdjustment.equals(Object)", "int ValueAdjustment.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ValueAdjustment ofDeltaAmountResult = ValueAdjustment.ofDeltaAmount(0.5d);
    ValueAdjustment ofDeltaAmountResult2 = ValueAdjustment.ofDeltaAmount(0.5d);

    // Act and Assert
    assertEquals(ofDeltaAmountResult, ofDeltaAmountResult2);
    assertEquals(ofDeltaAmountResult.hashCode(), ofDeltaAmountResult2.hashCode());
  }

  /**
   * Test {@link ValueAdjustment#equals(Object)}, and {@link ValueAdjustment#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueAdjustment#equals(Object)}
   *   <li>{@link ValueAdjustment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueAdjustment.equals(Object)", "int ValueAdjustment.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ValueAdjustment valueAdjustment = ValueAdjustment.NONE;

    // Act and Assert
    assertEquals(valueAdjustment, valueAdjustment);
    int expectedHashCodeResult = valueAdjustment.hashCode();
    assertEquals(expectedHashCodeResult, valueAdjustment.hashCode());
  }

  /**
   * Test {@link ValueAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueAdjustment.equals(Object)", "int ValueAdjustment.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ValueAdjustment ofDeltaAmountResult = ValueAdjustment.ofDeltaAmount(0.5d);

    // Act and Assert
    assertNotEquals(ofDeltaAmountResult, ValueAdjustment.NONE);
  }

  /**
   * Test {@link ValueAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueAdjustment.equals(Object)", "int ValueAdjustment.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ValueAdjustment ofDeltaAmountResult = ValueAdjustment.ofDeltaAmount(0.5d);

    // Act and Assert
    assertNotEquals(ofDeltaAmountResult, ValueAdjustment.ofDeltaMultiplier(0.5d));
  }

  /**
   * Test {@link ValueAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueAdjustment.equals(Object)", "int ValueAdjustment.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ValueAdjustment.NONE, null);
  }

  /**
   * Test {@link ValueAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueAdjustment.equals(Object)", "int ValueAdjustment.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ValueAdjustment.NONE, "Different type to ValueAdjustment");
  }
}
