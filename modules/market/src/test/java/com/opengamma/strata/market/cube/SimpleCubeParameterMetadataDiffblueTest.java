package com.opengamma.strata.market.cube;

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
import com.opengamma.strata.market.cube.SimpleCubeParameterMetadata.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SimpleCubeParameterMetadataDiffblueTest {
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
    Class<? extends SimpleCubeParameterMetadata> actualBeanTypeResult =
        SimpleCubeParameterMetadata.meta().beanType();

    // Assert
    Class<SimpleCubeParameterMetadata> expectedBeanTypeResult = SimpleCubeParameterMetadata.class;
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
   *   <li>{@link Meta#zValue()}
   *   <li>{@link Meta#zValueType()}
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
    "MetaProperty Meta.yValueType()",
    "MetaProperty Meta.zValue()",
    "MetaProperty Meta.zValueType()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SimpleCubeParameterMetadata.meta();

    // Act
    MetaProperty<Double> actualXValueResult = metaResult.xValue();
    MetaProperty<ValueType> actualXValueTypeResult = metaResult.xValueType();
    MetaProperty<Double> actualYValueResult = metaResult.yValue();
    MetaProperty<ValueType> actualYValueTypeResult = metaResult.yValueType();
    MetaProperty<Double> actualZValueResult = metaResult.zValue();

    // Assert
    assertTrue(actualXValueResult instanceof DirectMetaProperty);
    assertTrue(actualXValueTypeResult instanceof DirectMetaProperty);
    assertTrue(actualYValueResult instanceof DirectMetaProperty);
    assertTrue(actualYValueTypeResult instanceof DirectMetaProperty);
    assertTrue(actualZValueResult instanceof DirectMetaProperty);
    assertTrue(metaResult.zValueType() instanceof DirectMetaProperty);
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
    assertNull(SimpleCubeParameterMetadata.meta().metaPropertyGet("Property Name"));
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
        SimpleCubeParameterMetadata.meta().metaPropertyGet("xValueType");

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
    MetaProperty<Double> zValueResult = ((Meta) metaBeanResult).zValue();
    assertTrue(zValueResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> zValueTypeResult = ((Meta) metaBeanResult).zValueType();
    assertTrue(zValueTypeResult instanceof DirectMetaProperty);
    assertEquals("xValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValueType());
    assertSame(metaBeanResult, xValueResult.metaBean());
    assertSame(metaBeanResult, yValueResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
    assertSame(metaBeanResult, zValueResult.metaBean());
    assertSame(metaBeanResult, zValueTypeResult.metaBean());
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
        SimpleCubeParameterMetadata.meta().metaPropertyGet("xValue");

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
    MetaProperty<Double> zValueResult = ((Meta) metaBeanResult).zValue();
    assertTrue(zValueResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> zValueTypeResult = ((Meta) metaBeanResult).zValueType();
    assertTrue(zValueTypeResult instanceof DirectMetaProperty);
    assertEquals("xValue", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValue());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
    assertSame(metaBeanResult, zValueResult.metaBean());
    assertSame(metaBeanResult, zValueTypeResult.metaBean());
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
        SimpleCubeParameterMetadata.meta().metaPropertyGet("yValueType");

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
    MetaProperty<Double> zValueResult = ((Meta) metaBeanResult).zValue();
    assertTrue(zValueResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> zValueTypeResult = ((Meta) metaBeanResult).zValueType();
    assertTrue(zValueTypeResult instanceof DirectMetaProperty);
    assertEquals("yValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValueType());
    assertSame(metaBeanResult, xValueResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueResult.metaBean());
    assertSame(metaBeanResult, zValueResult.metaBean());
    assertSame(metaBeanResult, zValueTypeResult.metaBean());
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
        SimpleCubeParameterMetadata.meta().metaPropertyGet("yValue");

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
    MetaProperty<Double> zValueResult = ((Meta) metaBeanResult).zValue();
    assertTrue(zValueResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> zValueTypeResult = ((Meta) metaBeanResult).zValueType();
    assertTrue(zValueTypeResult instanceof DirectMetaProperty);
    assertEquals("yValue", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValue());
    assertSame(metaBeanResult, xValueResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
    assertSame(metaBeanResult, zValueResult.metaBean());
    assertSame(metaBeanResult, zValueTypeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code zValueType}.
   *   <li>Then return name is {@code zValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'zValueType'; then return name is 'zValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenZValueType_thenReturnNameIsZValueType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SimpleCubeParameterMetadata.meta().metaPropertyGet("zValueType");

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
    MetaProperty<ValueType> yValueTypeResult = ((Meta) metaBeanResult).yValueType();
    assertTrue(yValueTypeResult instanceof DirectMetaProperty);
    MetaProperty<Double> zValueResult = ((Meta) metaBeanResult).zValue();
    assertTrue(zValueResult instanceof DirectMetaProperty);
    assertEquals("zValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zValueType());
    assertSame(metaBeanResult, xValueResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
    assertSame(metaBeanResult, zValueResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code zValue}.
   *   <li>Then return name is {@code zValue}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'zValue'; then return name is 'zValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenZValue_thenReturnNameIsZValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SimpleCubeParameterMetadata.meta().metaPropertyGet("zValue");

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
    MetaProperty<ValueType> yValueTypeResult = ((Meta) metaBeanResult).yValueType();
    assertTrue(yValueTypeResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> zValueTypeResult = ((Meta) metaBeanResult).zValueType();
    assertTrue(zValueTypeResult instanceof DirectMetaProperty);
    assertEquals("zValue", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zValue());
    assertSame(metaBeanResult, xValueResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
    assertSame(metaBeanResult, zValueTypeResult.metaBean());
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
        SimpleCubeParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(6, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("xValue") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("xValueType") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yValue") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yValueType") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("zValue") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("zValueType") instanceof DirectMetaProperty);
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
        SimpleCubeParameterMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = SimpleCubeParameterMetadata.meta();
    SimpleCubeParameterMetadata bean =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code xValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'xValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenXValueType() {
    // Arrange
    Meta metaResult = SimpleCubeParameterMetadata.meta();
    SimpleCubeParameterMetadata bean =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "xValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).BLACK_VOLATILITY;
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
    assertSame(valueType, bean.getZValueType());
    assertSame(valueType, actualPropertyGetResult);
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
    Meta metaResult = SimpleCubeParameterMetadata.meta();
    SimpleCubeParameterMetadata bean =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertEquals(10.0d, ((Double) metaResult.propertyGet(bean, "xValue", true)).doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code yValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'yValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenYValueType() {
    // Arrange
    Meta metaResult = SimpleCubeParameterMetadata.meta();
    SimpleCubeParameterMetadata bean =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "yValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).BLACK_VOLATILITY;
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
    assertSame(valueType, bean.getZValueType());
    assertSame(valueType, actualPropertyGetResult);
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
    Meta metaResult = SimpleCubeParameterMetadata.meta();
    SimpleCubeParameterMetadata bean =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertEquals(10.0d, ((Double) metaResult.propertyGet(bean, "yValue", true)).doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code zValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'zValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenZValueType() {
    // Arrange
    Meta metaResult = SimpleCubeParameterMetadata.meta();
    SimpleCubeParameterMetadata bean =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "zValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).BLACK_VOLATILITY;
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
    assertSame(valueType, bean.getZValueType());
    assertSame(valueType, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code zValue}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'zValue'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenZValue_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = SimpleCubeParameterMetadata.meta();
    SimpleCubeParameterMetadata bean =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertEquals(10.0d, ((Double) metaResult.propertyGet(bean, "zValue", true)).doubleValue());
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
            SimpleCubeParameterMetadata.meta()
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
            SimpleCubeParameterMetadata.meta()
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
            SimpleCubeParameterMetadata.meta()
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
            SimpleCubeParameterMetadata.meta()
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
            SimpleCubeParameterMetadata.meta()
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
            SimpleCubeParameterMetadata.meta()
                .propertySet(mock(Bean.class), "yValue", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code zValueType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'zValueType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenZValueType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SimpleCubeParameterMetadata.meta()
                .propertySet(mock(Bean.class), "zValueType", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code zValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'zValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenZValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SimpleCubeParameterMetadata.meta()
                .propertySet(mock(Bean.class), "zValue", "New Value", true));
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#of(ValueType, double, ValueType, double, ValueType,
   * double)}.
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#of(ValueType, double, ValueType,
   * double, ValueType, double)}
   */
  @Test
  @DisplayName("Test of(ValueType, double, ValueType, double, ValueType, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SimpleCubeParameterMetadata SimpleCubeParameterMetadata.of(ValueType, double, ValueType, double, ValueType, double)"
  })
  void testOf() {
    // Arrange and Act
    SimpleCubeParameterMetadata actualOfResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Assert
    assertEquals(
        "BlackVolatility=10.0, BlackVolatility=10.0, BlackVolatility=10.0",
        actualOfResult.getIdentifier());
    assertEquals(
        "BlackVolatility=10.0, BlackVolatility=10.0, BlackVolatility=10.0",
        actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getXValue());
    assertEquals(10.0d, actualOfResult.getYValue());
    assertEquals(10.0d, actualOfResult.getZValue());
    ValueType valueType = ValueType.BLACK_VOLATILITY;
    assertSame(valueType, actualOfResult.getXValueType());
    assertSame(valueType, actualOfResult.getYValueType());
    assertSame(valueType, actualOfResult.getZValueType());
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#getLabel()}.
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#getLabel()}
   */
  @Test
  @DisplayName("Test getLabel()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SimpleCubeParameterMetadata.getLabel()"})
  void testGetLabel() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertEquals(
        "BlackVolatility=10.0, BlackVolatility=10.0, BlackVolatility=10.0", ofResult.getLabel());
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SimpleCubeParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertEquals(
        "BlackVolatility=10.0, BlackVolatility=10.0, BlackVolatility=10.0",
        ofResult.getIdentifier());
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SimpleCubeParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SimpleCubeParameterMetadata.meta();

    // Assert
    assertTrue(actualMetaResult.xValue() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yValue() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.zValue() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.zValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SimpleCubeParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleCubeParameterMetadata#toString()}
   *   <li>{@link SimpleCubeParameterMetadata#getXValue()}
   *   <li>{@link SimpleCubeParameterMetadata#getXValueType()}
   *   <li>{@link SimpleCubeParameterMetadata#getYValue()}
   *   <li>{@link SimpleCubeParameterMetadata#getYValueType()}
   *   <li>{@link SimpleCubeParameterMetadata#getZValue()}
   *   <li>{@link SimpleCubeParameterMetadata#getZValueType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SimpleCubeParameterMetadata.getXValue()",
    "ValueType SimpleCubeParameterMetadata.getXValueType()",
    "double SimpleCubeParameterMetadata.getYValue()",
    "ValueType SimpleCubeParameterMetadata.getYValueType()",
    "double SimpleCubeParameterMetadata.getZValue()",
    "ValueType SimpleCubeParameterMetadata.getZValueType()",
    "String SimpleCubeParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    double actualXValue = ofResult.getXValue();
    ValueType actualXValueType = ofResult.getXValueType();
    double actualYValue = ofResult.getYValue();
    ValueType actualYValueType = ofResult.getYValueType();
    double actualZValue = ofResult.getZValue();

    // Assert
    assertEquals(
        "SimpleCubeParameterMetadata{xValueType=BlackVolatility, xValue=10.0, yValueType=BlackVolatility,"
            + " yValue=10.0, zValueType=BlackVolatility, zValue=10.0}",
        actualToStringResult);
    assertEquals(10.0d, actualXValue);
    assertEquals(10.0d, actualYValue);
    assertEquals(10.0d, actualZValue);
    ValueType valueType = ValueType.BLACK_VOLATILITY;
    assertSame(valueType, actualXValueType);
    assertSame(valueType, actualYValueType);
    assertSame(valueType, ofResult.getZValueType());
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#equals(Object)}, and {@link
   * SimpleCubeParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleCubeParameterMetadata#equals(Object)}
   *   <li>{@link SimpleCubeParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCubeParameterMetadata.equals(Object)",
    "int SimpleCubeParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);
    SimpleCubeParameterMetadata ofResult2 =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#equals(Object)}, and {@link
   * SimpleCubeParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleCubeParameterMetadata#equals(Object)}
   *   <li>{@link SimpleCubeParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCubeParameterMetadata.equals(Object)",
    "int SimpleCubeParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCubeParameterMetadata.equals(Object)",
    "int SimpleCubeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d),
        1);
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCubeParameterMetadata.equals(Object)",
    "int SimpleCubeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.CORRELATION,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d));
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCubeParameterMetadata.equals(Object)",
    "int SimpleCubeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            0.5d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d));
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCubeParameterMetadata.equals(Object)",
    "int SimpleCubeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.CORRELATION,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d));
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCubeParameterMetadata.equals(Object)",
    "int SimpleCubeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            0.5d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d));
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCubeParameterMetadata.equals(Object)",
    "int SimpleCubeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.CORRELATION,
            10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d));
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCubeParameterMetadata.equals(Object)",
    "int SimpleCubeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            0.5d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d));
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCubeParameterMetadata.equals(Object)",
    "int SimpleCubeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d),
        null);
  }

  /**
   * Test {@link SimpleCubeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleCubeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleCubeParameterMetadata.equals(Object)",
    "int SimpleCubeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d),
        "Different type to SimpleCubeParameterMetadata");
  }
}
