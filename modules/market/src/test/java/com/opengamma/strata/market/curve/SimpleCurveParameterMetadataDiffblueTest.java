package com.opengamma.strata.market.curve;

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
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.SimpleCurveParameterMetadata.Meta;
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

class SimpleCurveParameterMetadataDiffblueTest {
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
    Class<? extends SimpleCurveParameterMetadata> actualBeanTypeResult =
        SimpleCurveParameterMetadata.meta().beanType();

    // Assert
    Class<SimpleCurveParameterMetadata> expectedBeanTypeResult = SimpleCurveParameterMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#xValue()}
   *   <li>{@link Meta#xValueType()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.xValue()", "MetaProperty Meta.xValueType()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SimpleCurveParameterMetadata.meta();

    // Act
    MetaProperty<Double> actualXValueResult = metaResult.xValue();

    // Assert
    assertTrue(actualXValueResult instanceof DirectMetaProperty);
    assertTrue(metaResult.xValueType() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean xValue return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean xValue return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanXValueReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SimpleCurveParameterMetadata.meta().metaPropertyGet("xValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> xValueResult = ((Meta) metaBeanResult).xValue();
    assertTrue(xValueResult instanceof DirectMetaProperty);
    assertEquals("double", xValueResult.propertyType().getName());
    assertEquals("xValue", xValueResult.name());
    assertEquals("xValueType", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, xValueResult.style());
    Class<ValueType> expectedPropertyTypeResult = ValueType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<SimpleCurveParameterMetadata> expectedDeclaringTypeResult =
        SimpleCurveParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, xValueResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValueType());
    assertSame(Meta.INSTANCE, xValueResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean xValueType return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean xValueType return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanXValueTypeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SimpleCurveParameterMetadata.meta().metaPropertyGet("xValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> xValueTypeResult = ((Meta) metaBeanResult).xValueType();
    assertTrue(xValueTypeResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("xValue", actualMetaPropertyGetResult.name());
    assertEquals("xValueType", xValueTypeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, xValueTypeResult.style());
    Class<ValueType> expectedPropertyTypeResult = ValueType.class;
    assertEquals(expectedPropertyTypeResult, xValueTypeResult.propertyType());
    Class<SimpleCurveParameterMetadata> expectedDeclaringTypeResult =
        SimpleCurveParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, xValueTypeResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValue());
    assertSame(Meta.INSTANCE, xValueTypeResult.metaBean());
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
    assertNull(SimpleCurveParameterMetadata.meta().metaPropertyGet("Property Name"));
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
        SimpleCurveParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("xValueType");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("xValue");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("xValue", getResult2.name());
    assertEquals("xValueType", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ValueType> expectedPropertyTypeResult = ValueType.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<SimpleCurveParameterMetadata> expectedDeclaringTypeResult =
        SimpleCurveParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<SimpleCurveParameterMetadata> expectedDeclaringTypeResult2 =
        SimpleCurveParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet() {
    // Arrange
    Meta metaResult = SimpleCurveParameterMetadata.meta();
    SimpleCurveParameterMetadata bean =
        SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "xValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).BLACK_VOLATILITY;
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, actualPropertyGetResult);
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
    assertNull(
        SimpleCurveParameterMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = SimpleCurveParameterMetadata.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code xValue}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'xValue'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenXValue_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = SimpleCurveParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d),
                    "xValue",
                    true))
            .doubleValue());
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
            SimpleCurveParameterMetadata.meta()
                .propertySet(mock(Bean.class), "xValue", "New Value", false));
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
            SimpleCurveParameterMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code xValueType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'xValueType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenXValueType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SimpleCurveParameterMetadata.meta()
                .propertySet(mock(Bean.class), "xValueType", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code xValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'xValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenXValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SimpleCurveParameterMetadata.meta()
                .propertySet(mock(Bean.class), "xValue", "New Value", true));
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#of(ValueType, double)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return Identifier is {@code BlackVolatility=10.0}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCurveParameterMetadata#of(ValueType, double)}
   */
  @Test
  @DisplayName(
      "Test of(ValueType, double); when BLACK_VOLATILITY; then return Identifier is 'BlackVolatility=10.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SimpleCurveParameterMetadata SimpleCurveParameterMetadata.of(ValueType, double)"
  })
  void testOf_whenBlack_volatility_thenReturnIdentifierIsBlackVolatility100() {
    // Arrange and Act
    SimpleCurveParameterMetadata actualOfResult =
        SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d);

    // Assert
    assertEquals("BlackVolatility=10.0", actualOfResult.getIdentifier());
    assertEquals("BlackVolatility=10.0", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getXValue());
    assertSame(ValueType.BLACK_VOLATILITY, actualOfResult.getXValueType());
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#getLabel()}.
   *
   * <p>Method under test: {@link SimpleCurveParameterMetadata#getLabel()}
   */
  @Test
  @DisplayName("Test getLabel()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SimpleCurveParameterMetadata.getLabel()"})
  void testGetLabel() {
    // Arrange, Act and Assert
    assertEquals(
        "BlackVolatility=10.0",
        SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d).getLabel());
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link SimpleCurveParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SimpleCurveParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange, Act and Assert
    assertEquals(
        "BlackVolatility=10.0",
        SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d).getIdentifier());
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link SimpleCurveParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SimpleCurveParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SimpleCurveParameterMetadata.meta();

    // Assert
    MetaProperty<Double> xValueResult = actualMetaResult.xValue();
    assertTrue(xValueResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> xValueTypeResult = actualMetaResult.xValueType();
    assertTrue(xValueTypeResult instanceof DirectMetaProperty);
    assertEquals("double", xValueResult.propertyType().getName());
    assertEquals("xValue", xValueResult.name());
    assertEquals("xValueType", xValueTypeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, xValueResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, xValueTypeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ValueType> expectedPropertyTypeResult = ValueType.class;
    assertEquals(expectedPropertyTypeResult, xValueTypeResult.propertyType());
    Class<SimpleCurveParameterMetadata> expectedDeclaringTypeResult =
        SimpleCurveParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, xValueResult.declaringType());
    Class<SimpleCurveParameterMetadata> expectedDeclaringTypeResult2 =
        SimpleCurveParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, xValueTypeResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, xValueResult.metaBean());
    assertSame(meta, xValueTypeResult.metaBean());
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link SimpleCurveParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SimpleCurveParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleCurveParameterMetadata#toString()}
   *   <li>{@link SimpleCurveParameterMetadata#getXValue()}
   *   <li>{@link SimpleCurveParameterMetadata#getXValueType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SimpleCurveParameterMetadata.getXValue()",
    "ValueType SimpleCurveParameterMetadata.getXValueType()",
    "String SimpleCurveParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SimpleCurveParameterMetadata ofResult =
        SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    double actualXValue = ofResult.getXValue();

    // Assert
    assertEquals(
        "SimpleCurveParameterMetadata{xValueType=BlackVolatility, xValue=10.0}",
        actualToStringResult);
    assertEquals(10.0d, actualXValue);
    assertSame(ValueType.BLACK_VOLATILITY, ofResult.getXValueType());
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#equals(Object)}, and {@link
   * SimpleCurveParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleCurveParameterMetadata#equals(Object)}
   *   <li>{@link SimpleCurveParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCurveParameterMetadata.equals(Object)",
    "int SimpleCurveParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SimpleCurveParameterMetadata ofResult =
        SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d);
    SimpleCurveParameterMetadata ofResult2 =
        SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#equals(Object)}, and {@link
   * SimpleCurveParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleCurveParameterMetadata#equals(Object)}
   *   <li>{@link SimpleCurveParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCurveParameterMetadata.equals(Object)",
    "int SimpleCurveParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SimpleCurveParameterMetadata ofResult =
        SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCurveParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCurveParameterMetadata.equals(Object)",
    "int SimpleCurveParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d), 1);
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCurveParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCurveParameterMetadata.equals(Object)",
    "int SimpleCurveParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SimpleCurveParameterMetadata ofResult =
        SimpleCurveParameterMetadata.of(ValueType.CORRELATION, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d));
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCurveParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCurveParameterMetadata.equals(Object)",
    "int SimpleCurveParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SimpleCurveParameterMetadata ofResult =
        SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 0.5d);

    // Act and Assert
    assertNotEquals(ofResult, SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d));
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCurveParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCurveParameterMetadata.equals(Object)",
    "int SimpleCurveParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d), null);
  }

  /**
   * Test {@link SimpleCurveParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCurveParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCurveParameterMetadata.equals(Object)",
    "int SimpleCurveParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d),
        "Different type to SimpleCurveParameterMetadata");
  }
}
