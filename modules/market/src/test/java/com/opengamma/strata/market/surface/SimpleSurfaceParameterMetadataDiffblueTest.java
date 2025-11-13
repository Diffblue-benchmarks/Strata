package com.opengamma.strata.market.surface;

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
import com.opengamma.strata.market.surface.SimpleSurfaceParameterMetadata.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SimpleSurfaceParameterMetadataDiffblueTest {
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
    Class<? extends SimpleSurfaceParameterMetadata> actualBeanTypeResult =
        SimpleSurfaceParameterMetadata.meta().beanType();

    // Assert
    Class<SimpleSurfaceParameterMetadata> expectedBeanTypeResult =
        SimpleSurfaceParameterMetadata.class;
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
   *   <li>{@link Meta#yValue()}
   *   <li>{@link Meta#yValueType()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.xValue()",
    "MetaProperty Meta.xValueType()",
    "MetaProperty Meta.yValue()",
    "MetaProperty Meta.yValueType()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SimpleSurfaceParameterMetadata.meta();

    // Act
    MetaProperty<Double> actualXValueResult = metaResult.xValue();
    MetaProperty<ValueType> actualXValueTypeResult = metaResult.xValueType();
    MetaProperty<Double> actualYValueResult = metaResult.yValue();

    // Assert
    assertTrue(actualXValueResult instanceof DirectMetaProperty);
    assertTrue(actualXValueTypeResult instanceof DirectMetaProperty);
    assertTrue(actualYValueResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yValueType() instanceof DirectMetaProperty);
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
    assertNull(SimpleSurfaceParameterMetadata.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code xValueType}.
   *   <li>Then return name is {@code xValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'xValueType'; then return name is 'xValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenXValueType_thenReturnNameIsXValueType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SimpleSurfaceParameterMetadata.meta().metaPropertyGet("xValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> xValueResult = ((Meta) metaBeanResult).xValue();
    assertTrue(xValueResult instanceof DirectMetaProperty);
    MetaProperty<Double> yValueResult = ((Meta) metaBeanResult).yValue();
    assertTrue(yValueResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> yValueTypeResult = ((Meta) metaBeanResult).yValueType();
    assertTrue(yValueTypeResult instanceof DirectMetaProperty);
    assertEquals("xValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValueType());
    assertSame(metaBeanResult, xValueResult.metaBean());
    assertSame(metaBeanResult, yValueResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code xValue}.
   *   <li>Then return name is {@code xValue}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'xValue'; then return name is 'xValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenXValue_thenReturnNameIsXValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SimpleSurfaceParameterMetadata.meta().metaPropertyGet("xValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> xValueTypeResult = ((Meta) metaBeanResult).xValueType();
    assertTrue(xValueTypeResult instanceof DirectMetaProperty);
    MetaProperty<Double> yValueResult = ((Meta) metaBeanResult).yValue();
    assertTrue(yValueResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> yValueTypeResult = ((Meta) metaBeanResult).yValueType();
    assertTrue(yValueTypeResult instanceof DirectMetaProperty);
    assertEquals("xValue", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValue());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yValueType}.
   *   <li>Then return name is {@code yValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yValueType'; then return name is 'yValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYValueType_thenReturnNameIsYValueType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SimpleSurfaceParameterMetadata.meta().metaPropertyGet("yValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> xValueResult = ((Meta) metaBeanResult).xValue();
    assertTrue(xValueResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> xValueTypeResult = ((Meta) metaBeanResult).xValueType();
    assertTrue(xValueTypeResult instanceof DirectMetaProperty);
    MetaProperty<Double> yValueResult = ((Meta) metaBeanResult).yValue();
    assertTrue(yValueResult instanceof DirectMetaProperty);
    assertEquals("yValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValueType());
    assertSame(metaBeanResult, xValueResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yValue}.
   *   <li>Then return name is {@code yValue}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'yValue'; then return name is 'yValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYValue_thenReturnNameIsYValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SimpleSurfaceParameterMetadata.meta().metaPropertyGet("yValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> xValueResult = ((Meta) metaBeanResult).xValue();
    assertTrue(xValueResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> xValueTypeResult = ((Meta) metaBeanResult).xValueType();
    assertTrue(xValueTypeResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> yValueTypeResult = ((Meta) metaBeanResult).yValueType();
    assertTrue(yValueTypeResult instanceof DirectMetaProperty);
    assertEquals("yValue", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValue());
    assertSame(metaBeanResult, xValueResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
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
        SimpleSurfaceParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("xValue") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("xValueType") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yValue") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yValueType") instanceof DirectMetaProperty);
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
    Meta metaResult = SimpleSurfaceParameterMetadata.meta();
    SimpleSurfaceParameterMetadata bean =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "xValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).BLACK_VOLATILITY;
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
    assertSame(valueType, actualPropertyGetResult);
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
  void testMetaPropertyGet2() {
    // Arrange
    Meta metaResult = SimpleSurfaceParameterMetadata.meta();
    SimpleSurfaceParameterMetadata bean =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "yValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).BLACK_VOLATILITY;
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
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
        SimpleSurfaceParameterMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = SimpleSurfaceParameterMetadata.meta();
    SimpleSurfaceParameterMetadata bean =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
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
    Meta metaResult = SimpleSurfaceParameterMetadata.meta();
    SimpleSurfaceParameterMetadata bean =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertEquals(10.0d, ((Double) metaResult.propertyGet(bean, "xValue", true)).doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code yValue}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'yValue'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenYValue_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = SimpleSurfaceParameterMetadata.meta();
    SimpleSurfaceParameterMetadata bean =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertEquals(10.0d, ((Double) metaResult.propertyGet(bean, "yValue", true)).doubleValue());
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
            SimpleSurfaceParameterMetadata.meta()
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
            SimpleSurfaceParameterMetadata.meta()
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
            SimpleSurfaceParameterMetadata.meta()
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
            SimpleSurfaceParameterMetadata.meta()
                .propertySet(mock(Bean.class), "xValue", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yValueType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yValueType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYValueType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SimpleSurfaceParameterMetadata.meta()
                .propertySet(mock(Bean.class), "yValueType", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SimpleSurfaceParameterMetadata.meta()
                .propertySet(mock(Bean.class), "yValue", "New Value", true));
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#of(ValueType, double, ValueType, double)}.
   *
   * <ul>
   *   <li>Then return Identifier is {@code BlackVolatility=10.0, BlackVolatility=10.0}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#of(ValueType, double, ValueType,
   * double)}
   */
  @Test
  @DisplayName(
      "Test of(ValueType, double, ValueType, double); then return Identifier is 'BlackVolatility=10.0, BlackVolatility=10.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SimpleSurfaceParameterMetadata SimpleSurfaceParameterMetadata.of(ValueType, double, ValueType, double)"
  })
  void testOf_thenReturnIdentifierIsBlackVolatility100BlackVolatility100() {
    // Arrange and Act
    SimpleSurfaceParameterMetadata actualOfResult =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Assert
    assertEquals("BlackVolatility=10.0, BlackVolatility=10.0", actualOfResult.getIdentifier());
    assertEquals("BlackVolatility=10.0, BlackVolatility=10.0", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getXValue());
    assertEquals(10.0d, actualOfResult.getYValue());
    ValueType valueType = ValueType.BLACK_VOLATILITY;
    assertSame(valueType, actualOfResult.getXValueType());
    assertSame(valueType, actualOfResult.getYValueType());
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#getLabel()}.
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#getLabel()}
   */
  @Test
  @DisplayName("Test getLabel()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SimpleSurfaceParameterMetadata.getLabel()"})
  void testGetLabel() {
    // Arrange
    SimpleSurfaceParameterMetadata ofResult =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertEquals("BlackVolatility=10.0, BlackVolatility=10.0", ofResult.getLabel());
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SimpleSurfaceParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange
    SimpleSurfaceParameterMetadata ofResult =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertEquals("BlackVolatility=10.0, BlackVolatility=10.0", ofResult.getIdentifier());
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SimpleSurfaceParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SimpleSurfaceParameterMetadata.meta();

    // Assert
    assertTrue(actualMetaResult.xValue() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yValue() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SimpleSurfaceParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange
    SimpleSurfaceParameterMetadata ofResult =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleSurfaceParameterMetadata#toString()}
   *   <li>{@link SimpleSurfaceParameterMetadata#getXValue()}
   *   <li>{@link SimpleSurfaceParameterMetadata#getXValueType()}
   *   <li>{@link SimpleSurfaceParameterMetadata#getYValue()}
   *   <li>{@link SimpleSurfaceParameterMetadata#getYValueType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SimpleSurfaceParameterMetadata.getXValue()",
    "ValueType SimpleSurfaceParameterMetadata.getXValueType()",
    "double SimpleSurfaceParameterMetadata.getYValue()",
    "ValueType SimpleSurfaceParameterMetadata.getYValueType()",
    "String SimpleSurfaceParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SimpleSurfaceParameterMetadata ofResult =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    double actualXValue = ofResult.getXValue();
    ValueType actualXValueType = ofResult.getXValueType();
    double actualYValue = ofResult.getYValue();

    // Assert
    assertEquals(
        "SimpleSurfaceParameterMetadata{xValueType=BlackVolatility, xValue=10.0, yValueType=BlackVolatility,"
            + " yValue=10.0}",
        actualToStringResult);
    assertEquals(10.0d, actualXValue);
    assertEquals(10.0d, actualYValue);
    ValueType valueType = ValueType.BLACK_VOLATILITY;
    assertSame(valueType, actualXValueType);
    assertSame(valueType, ofResult.getYValueType());
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#equals(Object)}, and {@link
   * SimpleSurfaceParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleSurfaceParameterMetadata#equals(Object)}
   *   <li>{@link SimpleSurfaceParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleSurfaceParameterMetadata.equals(Object)",
    "int SimpleSurfaceParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SimpleSurfaceParameterMetadata ofResult =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);
    SimpleSurfaceParameterMetadata ofResult2 =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#equals(Object)}, and {@link
   * SimpleSurfaceParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleSurfaceParameterMetadata#equals(Object)}
   *   <li>{@link SimpleSurfaceParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleSurfaceParameterMetadata.equals(Object)",
    "int SimpleSurfaceParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SimpleSurfaceParameterMetadata ofResult =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleSurfaceParameterMetadata.equals(Object)",
    "int SimpleSurfaceParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d),
        1);
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleSurfaceParameterMetadata.equals(Object)",
    "int SimpleSurfaceParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SimpleSurfaceParameterMetadata ofResult =
        SimpleSurfaceParameterMetadata.of(
            ValueType.CORRELATION, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d));
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleSurfaceParameterMetadata.equals(Object)",
    "int SimpleSurfaceParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SimpleSurfaceParameterMetadata ofResult =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 0.5d, ValueType.BLACK_VOLATILITY, 10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d));
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleSurfaceParameterMetadata.equals(Object)",
    "int SimpleSurfaceParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    SimpleSurfaceParameterMetadata ofResult =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.CORRELATION, 10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d));
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleSurfaceParameterMetadata.equals(Object)",
    "int SimpleSurfaceParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    SimpleSurfaceParameterMetadata ofResult =
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 0.5d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d));
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleSurfaceParameterMetadata.equals(Object)",
    "int SimpleSurfaceParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d),
        null);
  }

  /**
   * Test {@link SimpleSurfaceParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleSurfaceParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleSurfaceParameterMetadata.equals(Object)",
    "int SimpleSurfaceParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SimpleSurfaceParameterMetadata.of(
            ValueType.BLACK_VOLATILITY, 10.0d, ValueType.BLACK_VOLATILITY, 10.0d),
        "Different type to SimpleSurfaceParameterMetadata");
  }
}
