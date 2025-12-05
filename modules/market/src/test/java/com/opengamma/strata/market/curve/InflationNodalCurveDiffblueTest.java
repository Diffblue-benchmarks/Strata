package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ShiftType;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.ConstantNodalCurve.Builder;
import com.opengamma.strata.market.curve.InflationNodalCurve.Meta;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.UnitParameterSensitivity;
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

class InflationNodalCurveDiffblueTest {
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
    Class<? extends InflationNodalCurve> actualBeanTypeResult =
        InflationNodalCurve.meta().beanType();

    // Assert
    Class<InflationNodalCurve> expectedBeanTypeResult = InflationNodalCurve.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#adjustmentType()}
   *   <li>{@link Meta#seasonality()}
   *   <li>{@link Meta#underlying()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.adjustmentType()",
    "MetaProperty Meta.seasonality()",
    "MetaProperty Meta.underlying()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = InflationNodalCurve.meta();

    // Act
    MetaProperty<ShiftType> actualAdjustmentTypeResult = metaResult.adjustmentType();
    MetaProperty<DoubleArray> actualSeasonalityResult = metaResult.seasonality();

    // Assert
    assertTrue(actualAdjustmentTypeResult instanceof DirectMetaProperty);
    assertTrue(actualSeasonalityResult instanceof DirectMetaProperty);
    assertTrue(metaResult.underlying() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code adjustmentType}.
   *   <li>Then return name is {@code adjustmentType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'adjustmentType'; then return name is 'adjustmentType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAdjustmentType_thenReturnNameIsAdjustmentType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationNodalCurve.meta().metaPropertyGet("adjustmentType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> seasonalityResult = ((Meta) metaBeanResult).seasonality();
    assertTrue(seasonalityResult instanceof DirectMetaProperty);
    MetaProperty<NodalCurve> underlyingResult = ((Meta) metaBeanResult).underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    assertEquals("adjustmentType", actualMetaPropertyGetResult.name());
    Class<ShiftType> expectedPropertyTypeResult = ShiftType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).adjustmentType());
    assertSame(metaBeanResult, seasonalityResult.metaBean());
    assertSame(metaBeanResult, underlyingResult.metaBean());
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
    assertNull(InflationNodalCurve.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code seasonality}.
   *   <li>Then return name is {@code seasonality}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'seasonality'; then return name is 'seasonality'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSeasonality_thenReturnNameIsSeasonality() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationNodalCurve.meta().metaPropertyGet("seasonality");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ShiftType> adjustmentTypeResult = ((Meta) metaBeanResult).adjustmentType();
    assertTrue(adjustmentTypeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<NodalCurve> underlyingResult = ((Meta) metaBeanResult).underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    assertEquals("seasonality", actualMetaPropertyGetResult.name());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).seasonality());
    assertSame(metaBeanResult, adjustmentTypeResult.metaBean());
    assertSame(metaBeanResult, underlyingResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code underlying}.
   *   <li>Then return name is {@code underlying}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'underlying'; then return name is 'underlying'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenUnderlying_thenReturnNameIsUnderlying() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationNodalCurve.meta().metaPropertyGet("underlying");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ShiftType> adjustmentTypeResult = ((Meta) metaBeanResult).adjustmentType();
    assertTrue(adjustmentTypeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> seasonalityResult = ((Meta) metaBeanResult).seasonality();
    assertTrue(seasonalityResult instanceof DirectMetaProperty);
    assertEquals("underlying", actualMetaPropertyGetResult.name());
    Class<NodalCurve> expectedPropertyTypeResult = NodalCurve.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).underlying());
    assertSame(metaBeanResult, adjustmentTypeResult.metaBean());
    assertSame(metaBeanResult, seasonalityResult.metaBean());
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
        InflationNodalCurve.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("underlying");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("adjustmentType");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("seasonality");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("adjustmentType", getResult2.name());
    assertEquals("seasonality", getResult3.name());
    assertEquals("underlying", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<InflationNodalCurve> expectedDeclaringTypeResult = InflationNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<InflationNodalCurve> expectedDeclaringTypeResult2 = InflationNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<InflationNodalCurve> expectedDeclaringTypeResult3 = InflationNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<NodalCurve> expectedPropertyTypeResult3 = NodalCurve.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
    assertSame(meta, metaBeanResult);
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
    assertNull(InflationNodalCurve.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when CurveName with 'Name'; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCurveNameWithName_thenReturnFilledThree() {
    // Arrange
    Meta metaResult = InflationNodalCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();
    DoubleArray seasonality = DoubleArray.filled(3);

    InflationNodalCurve bean = InflationNodalCurve.of(curve, seasonality, ShiftType.RELATIVE);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "seasonality", true);

    // Assert
    assertSame(seasonality, actualPropertyGetResult);
    DoubleArray doubleArray = ((DoubleArray) actualPropertyGetResult).EMPTY;
    assertSame(doubleArray, bean.getXValues());
    assertSame(doubleArray, bean.getYValues());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code adjustmentType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'adjustmentType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAdjustmentType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationNodalCurve.meta()
                .propertySet(mock(Bean.class), "adjustmentType", "New Value", true));
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
            InflationNodalCurve.meta()
                .propertySet(mock(Bean.class), "adjustmentType", "New Value", false));
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
            InflationNodalCurve.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code seasonality}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'seasonality'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSeasonality_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationNodalCurve.meta()
                .propertySet(mock(Bean.class), "seasonality", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlying}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'underlying'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnderlying_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationNodalCurve.meta()
                .propertySet(mock(Bean.class), "underlying", "New Value", true));
  }

  /**
   * Test {@link InflationNodalCurve#of(NodalCurve, DoubleArray, ShiftType)} with {@code curve},
   * {@code seasonality}, {@code adjustmentType}.
   *
   * <ul>
   *   <li>Then return AdjustmentType is {@code ABSOLUTE}.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#of(NodalCurve, DoubleArray, ShiftType)}
   */
  @Test
  @DisplayName(
      "Test of(NodalCurve, DoubleArray, ShiftType) with 'curve', 'seasonality', 'adjustmentType'; then return AdjustmentType is 'ABSOLUTE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InflationNodalCurve InflationNodalCurve.of(NodalCurve, DoubleArray, ShiftType)"
  })
  void testOfWithCurveSeasonalityAdjustmentType_thenReturnAdjustmentTypeIsAbsolute() {
    // Arrange
    ConstantNodalCurve curve =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 0.5d, 10.0d);

    // Act
    InflationNodalCurve actualOfResult =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.ABSOLUTE);

    // Assert
    NodalCurve underlying = actualOfResult.getUnderlying();
    assertTrue(underlying instanceof ConstantNodalCurve);
    CurveMetadata metadata = actualOfResult.getMetadata();
    assertTrue(metadata instanceof DefaultCurveMetadata);
    assertEquals(ShiftType.ABSOLUTE, actualOfResult.getAdjustmentType());
    assertSame(metadata, underlying.getMetadata());
    assertArrayEquals(new double[] {0.5d}, underlying.getXValues().toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {10.0d}, underlying.getYValues().toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, actualOfResult.getSeasonality().toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link InflationNodalCurve#of(NodalCurve, DoubleArray, ShiftType)} with {@code curve},
   * {@code seasonality}, {@code adjustmentType}.
   *
   * <ul>
   *   <li>Then return AdjustmentType is {@code RELATIVE}.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#of(NodalCurve, DoubleArray, ShiftType)}
   */
  @Test
  @DisplayName(
      "Test of(NodalCurve, DoubleArray, ShiftType) with 'curve', 'seasonality', 'adjustmentType'; then return AdjustmentType is 'RELATIVE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InflationNodalCurve InflationNodalCurve.of(NodalCurve, DoubleArray, ShiftType)"
  })
  void testOfWithCurveSeasonalityAdjustmentType_thenReturnAdjustmentTypeIsRelative() {
    // Arrange
    ConstantNodalCurve curve =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 0.5d, 10.0d);

    // Act
    InflationNodalCurve actualOfResult =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE);

    // Assert
    NodalCurve underlying = actualOfResult.getUnderlying();
    assertTrue(underlying instanceof ConstantNodalCurve);
    CurveMetadata metadata = actualOfResult.getMetadata();
    assertTrue(metadata instanceof DefaultCurveMetadata);
    assertEquals(ShiftType.RELATIVE, actualOfResult.getAdjustmentType());
    assertSame(metadata, underlying.getMetadata());
    assertArrayEquals(new double[] {0.5d}, underlying.getXValues().toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {10.0d}, underlying.getYValues().toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, actualOfResult.getSeasonality().toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link InflationNodalCurve#getMetadata()}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata} with name is {@link CurveName}.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#getMetadata()}
   */
  @Test
  @DisplayName("Test getMetadata(); then return DefaultCurveMetadata with name is CurveName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata InflationNodalCurve.getMetadata()"})
  void testGetMetadata_thenReturnDefaultCurveMetadataWithNameIsCurveName() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    ConstantNodalCurve curve = builderResult.metadata(metadata).xValue(0.5d).yValue(10.0d).build();

    // Act and Assert
    assertSame(
        metadata,
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE).getMetadata());
  }

  /**
   * Test {@link InflationNodalCurve#yValue(double)}.
   *
   * <p>Method under test: {@link InflationNodalCurve#yValue(double)}
   */
  @Test
  @DisplayName("Test yValue(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InflationNodalCurve.yValue(double)"})
  void testYValue() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(
        10.0d,
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.ABSOLUTE).yValue(2.0d));
  }

  /**
   * Test {@link InflationNodalCurve#yValue(double)}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#yValue(double)}
   */
  @Test
  @DisplayName("Test yValue(double); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InflationNodalCurve.yValue(double)"})
  void testYValue_thenReturnTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(
        10.0d,
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE).yValue(2.0d));
  }

  /**
   * Test {@link InflationNodalCurve#getParameterCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#getParameterCount()}
   */
  @Test
  @DisplayName("Test getParameterCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int InflationNodalCurve.getParameterCount()"})
  void testGetParameterCount_thenReturnZero() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(
        0,
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE)
            .getParameterCount());
  }

  /**
   * Test {@link InflationNodalCurve#getParameter(int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when minus one; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InflationNodalCurve.getParameter(int)"})
  void testGetParameter_whenMinusOne_thenReturnTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(
        10.0d,
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE).getParameter(-1));
  }

  /**
   * Test {@link InflationNodalCurve#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return {@link SimpleCurveParameterMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#getParameterMetadata(int)}
   */
  @Test
  @DisplayName(
      "Test getParameterMetadata(int); when minus one; then return SimpleCurveParameterMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata InflationNodalCurve.getParameterMetadata(int)"})
  void testGetParameterMetadata_whenMinusOne_thenReturnSimpleCurveParameterMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();

    // Act
    ParameterMetadata actualParameterMetadata =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE)
            .getParameterMetadata(-1);

    // Assert
    assertTrue(actualParameterMetadata instanceof SimpleCurveParameterMetadata);
    ValueType xValueType = ((SimpleCurveParameterMetadata) actualParameterMetadata).getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertEquals("Unknown=0.5", actualParameterMetadata.getIdentifier());
    assertEquals("Unknown=0.5", actualParameterMetadata.getLabel());
    assertEquals(0.5d, ((SimpleCurveParameterMetadata) actualParameterMetadata).getXValue());
  }

  /**
   * Test {@link InflationNodalCurve#getXValues()}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#getXValues()}
   */
  @Test
  @DisplayName("Test getXValues(); then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray InflationNodalCurve.getXValues()"})
  void testGetXValues_thenReturnEmpty() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE).getXValues());
  }

  /**
   * Test {@link InflationNodalCurve#getYValues()}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#getYValues()}
   */
  @Test
  @DisplayName("Test getYValues(); then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray InflationNodalCurve.getYValues()"})
  void testGetYValues_thenReturnEmpty() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE).getYValues());
  }

  /**
   * Test {@link InflationNodalCurve#yValueParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>Then return ParameterCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#yValueParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test yValueParameterSensitivity(double); then return ParameterCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity InflationNodalCurve.yValueParameterSensitivity(double)"
  })
  void testYValueParameterSensitivity_thenReturnParameterCountIsZero() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    ConstantNodalCurve curve =
        builderResult.metadata(DefaultCurveMetadata.of(name)).xValue(0.5d).yValue(10.0d).build();

    // Act
    UnitParameterSensitivity actualYValueParameterSensitivityResult =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.ABSOLUTE)
            .yValueParameterSensitivity(2.0d);

    // Assert
    assertEquals(0, actualYValueParameterSensitivityResult.getParameterCount());
    assertEquals(0.0d, actualYValueParameterSensitivityResult.total());
    assertFalse(actualYValueParameterSensitivityResult.getParameterSplit().isPresent());
    assertTrue(actualYValueParameterSensitivityResult.getParameterMetadata().isEmpty());
    assertEquals(DoubleArray.EMPTY, actualYValueParameterSensitivityResult.getSensitivity());
    assertSame(name, actualYValueParameterSensitivityResult.getMarketDataName());
  }

  /**
   * Test {@link InflationNodalCurve#yValueParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#yValueParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test yValueParameterSensitivity(double); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity InflationNodalCurve.yValueParameterSensitivity(double)"
  })
  void testYValueParameterSensitivity_thenThrowIllegalArgumentException() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE)
                .yValueParameterSensitivity(2.0d));
  }

  /**
   * Test {@link InflationNodalCurve#firstDerivative(double)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#firstDerivative(double)}
   */
  @Test
  @DisplayName("Test firstDerivative(double); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InflationNodalCurve.firstDerivative(double)"})
  void testFirstDerivative_thenThrowUnsupportedOperationException() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE)
                .firstDerivative(2.0d));
  }

  /**
   * Test {@link InflationNodalCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link InflationNodalCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"InflationNodalCurve InflationNodalCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();
    InflationNodalCurve ofResult =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE);

    // Act
    InflationNodalCurve actualWithMetadataResult =
        ofResult.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(ofResult, actualWithMetadataResult);
  }

  /**
   * Test {@link InflationNodalCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link InflationNodalCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"InflationNodalCurve InflationNodalCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata2() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();
    InflationNodalCurve ofResult =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.ABSOLUTE);

    // Act
    InflationNodalCurve actualWithMetadataResult =
        ofResult.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(ofResult, actualWithMetadataResult);
  }

  /**
   * Test {@link InflationNodalCurve#withYValues(DoubleArray)}.
   *
   * <p>Method under test: {@link InflationNodalCurve#withYValues(DoubleArray)}
   */
  @Test
  @DisplayName("Test withYValues(DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"InflationNodalCurve InflationNodalCurve.withYValues(DoubleArray)"})
  void testWithYValues() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();
    InflationNodalCurve ofResult =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE);

    // Act
    InflationNodalCurve actualWithYValuesResult = ofResult.withYValues(DoubleArray.of());

    // Assert
    assertEquals(ofResult, actualWithYValuesResult);
  }

  /**
   * Test {@link InflationNodalCurve#withYValues(DoubleArray)}.
   *
   * <p>Method under test: {@link InflationNodalCurve#withYValues(DoubleArray)}
   */
  @Test
  @DisplayName("Test withYValues(DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"InflationNodalCurve InflationNodalCurve.withYValues(DoubleArray)"})
  void testWithYValues2() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();
    InflationNodalCurve ofResult =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.ABSOLUTE);

    // Act
    InflationNodalCurve actualWithYValuesResult = ofResult.withYValues(DoubleArray.of());

    // Assert
    assertEquals(ofResult, actualWithYValuesResult);
  }

  /**
   * Test {@link InflationNodalCurve#withValues(DoubleArray, DoubleArray)}.
   *
   * <p>Method under test: {@link InflationNodalCurve#withValues(DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName("Test withValues(DoubleArray, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InflationNodalCurve InflationNodalCurve.withValues(DoubleArray, DoubleArray)"
  })
  void testWithValues() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();
    InflationNodalCurve ofResult =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE);
    DoubleArray xValues = DoubleArray.of();

    // Act
    InflationNodalCurve actualWithValuesResult = ofResult.withValues(xValues, DoubleArray.of());

    // Assert
    assertEquals(ofResult, actualWithValuesResult);
  }

  /**
   * Test {@link InflationNodalCurve#withValues(DoubleArray, DoubleArray)}.
   *
   * <p>Method under test: {@link InflationNodalCurve#withValues(DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName("Test withValues(DoubleArray, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InflationNodalCurve InflationNodalCurve.withValues(DoubleArray, DoubleArray)"
  })
  void testWithValues2() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();
    InflationNodalCurve ofResult =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.ABSOLUTE);
    DoubleArray xValues = DoubleArray.of();

    // Act
    InflationNodalCurve actualWithValuesResult = ofResult.withValues(xValues, DoubleArray.of());

    // Assert
    assertEquals(ofResult, actualWithValuesResult);
  }

  /**
   * Test {@link InflationNodalCurve#withParameter(int, double)}.
   *
   * <p>Method under test: {@link InflationNodalCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"InflationNodalCurve InflationNodalCurve.withParameter(int, double)"})
  void testWithParameter() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();
    InflationNodalCurve ofResult =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE);

    // Act
    InflationNodalCurve actualWithParameterResult = ofResult.withParameter(-1, 10.0d);

    // Assert
    assertEquals(ofResult, actualWithParameterResult);
  }

  /**
   * Test {@link InflationNodalCurve#withParameter(int, double)}.
   *
   * <p>Method under test: {@link InflationNodalCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"InflationNodalCurve InflationNodalCurve.withParameter(int, double)"})
  void testWithParameter2() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();
    InflationNodalCurve ofResult =
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.ABSOLUTE);

    // Act
    InflationNodalCurve actualWithParameterResult = ofResult.withParameter(-1, 10.0d);

    // Assert
    assertEquals(ofResult, actualWithParameterResult);
  }

  /**
   * Test {@link InflationNodalCurve#meta()}.
   *
   * <p>Method under test: {@link InflationNodalCurve#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta InflationNodalCurve.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = InflationNodalCurve.meta();

    // Assert
    MetaProperty<ShiftType> adjustmentTypeResult = actualMetaResult.adjustmentType();
    assertTrue(adjustmentTypeResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> seasonalityResult = actualMetaResult.seasonality();
    assertTrue(seasonalityResult instanceof DirectMetaProperty);
    MetaProperty<NodalCurve> underlyingResult = actualMetaResult.underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    assertEquals("adjustmentType", adjustmentTypeResult.name());
    assertEquals("seasonality", seasonalityResult.name());
    assertEquals("underlying", underlyingResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, adjustmentTypeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, seasonalityResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, underlyingResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, seasonalityResult.propertyType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, adjustmentTypeResult.propertyType());
    Class<InflationNodalCurve> expectedDeclaringTypeResult = InflationNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult, adjustmentTypeResult.declaringType());
    Class<InflationNodalCurve> expectedDeclaringTypeResult2 = InflationNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult2, seasonalityResult.declaringType());
    Class<InflationNodalCurve> expectedDeclaringTypeResult3 = InflationNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult3, underlyingResult.declaringType());
    Class<NodalCurve> expectedPropertyTypeResult3 = NodalCurve.class;
    assertEquals(expectedPropertyTypeResult3, underlyingResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, adjustmentTypeResult.metaBean());
    assertSame(meta, seasonalityResult.metaBean());
    assertSame(meta, underlyingResult.metaBean());
  }

  /**
   * Test {@link InflationNodalCurve#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link InflationNodalCurve#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta InflationNodalCurve.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        InflationNodalCurve.of(curve, DoubleArray.filled(3), ShiftType.RELATIVE).metaBean());
  }
}
