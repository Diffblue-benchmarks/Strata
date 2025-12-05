package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ShiftType;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.ConstantNodalCurve.Builder;
import com.opengamma.strata.market.curve.ParallelShiftedCurve.Meta;
import com.opengamma.strata.market.param.LabelParameterMetadata;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
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
import org.mockito.Mockito;

class ParallelShiftedCurveDiffblueTest {
  /**
   * Test {@link ParallelShiftedCurve#absolute(Curve, double)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then return ShiftAmount is ten.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#absolute(Curve, double)}
   */
  @Test
  @DisplayName(
      "Test absolute(Curve, double); when CurveName with 'Name'; then return ShiftAmount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParallelShiftedCurve ParallelShiftedCurve.absolute(Curve, double)"})
  void testAbsolute_whenCurveNameWithName_thenReturnShiftAmountIsTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    ConstantNodalCurve spreadCurve =
        builderResult2.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    AddFixedCurve curve = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    ParallelShiftedCurve actualAbsoluteResult = ParallelShiftedCurve.absolute(curve, 10.0d);

    // Assert
    assertEquals(10.0d, actualAbsoluteResult.getShiftAmount());
    assertEquals(2, actualAbsoluteResult.getParameterCount());
    assertEquals(ShiftType.ABSOLUTE, actualAbsoluteResult.getShiftType());
    assertSame(curve, actualAbsoluteResult.getUnderlyingCurve());
    assertSame(name, actualAbsoluteResult.getName());
    assertSame(metadata, actualAbsoluteResult.getMetadata());
  }

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
    Class<? extends ParallelShiftedCurve> actualBeanTypeResult =
        ParallelShiftedCurve.meta().beanType();

    // Assert
    Class<ParallelShiftedCurve> expectedBeanTypeResult = ParallelShiftedCurve.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#shiftAmount()}
   *   <li>{@link Meta#shiftType()}
   *   <li>{@link Meta#underlyingCurve()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.shiftAmount()",
    "MetaProperty Meta.shiftType()",
    "MetaProperty Meta.underlyingCurve()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ParallelShiftedCurve.meta();

    // Act
    MetaProperty<Double> actualShiftAmountResult = metaResult.shiftAmount();
    MetaProperty<ShiftType> actualShiftTypeResult = metaResult.shiftType();

    // Assert
    assertTrue(actualShiftAmountResult instanceof DirectMetaProperty);
    assertTrue(actualShiftTypeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.underlyingCurve() instanceof DirectMetaProperty);
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
    assertNull(ParallelShiftedCurve.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code shiftAmount}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'shiftAmount'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenShiftAmount_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ParallelShiftedCurve.meta().metaPropertyGet("shiftAmount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = ((Meta) metaBeanResult).shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    MetaProperty<Curve> underlyingCurveResult = ((Meta) metaBeanResult).underlyingCurve();
    assertTrue(underlyingCurveResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("shiftAmount", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shiftAmount());
    assertSame(metaBeanResult, shiftTypeResult.metaBean());
    assertSame(metaBeanResult, underlyingCurveResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code shiftType}.
   *   <li>Then return name is {@code shiftType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'shiftType'; then return name is 'shiftType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenShiftType_thenReturnNameIsShiftType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ParallelShiftedCurve.meta().metaPropertyGet("shiftType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> shiftAmountResult = ((Meta) metaBeanResult).shiftAmount();
    assertTrue(shiftAmountResult instanceof DirectMetaProperty);
    MetaProperty<Curve> underlyingCurveResult = ((Meta) metaBeanResult).underlyingCurve();
    assertTrue(underlyingCurveResult instanceof DirectMetaProperty);
    assertEquals("shiftType", actualMetaPropertyGetResult.name());
    Class<ShiftType> expectedPropertyTypeResult = ShiftType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shiftType());
    assertSame(metaBeanResult, shiftAmountResult.metaBean());
    assertSame(metaBeanResult, underlyingCurveResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code underlyingCurve}.
   *   <li>Then return name is {@code underlyingCurve}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'underlyingCurve'; then return name is 'underlyingCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenUnderlyingCurve_thenReturnNameIsUnderlyingCurve() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ParallelShiftedCurve.meta().metaPropertyGet("underlyingCurve");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> shiftAmountResult = ((Meta) metaBeanResult).shiftAmount();
    assertTrue(shiftAmountResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = ((Meta) metaBeanResult).shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    assertEquals("underlyingCurve", actualMetaPropertyGetResult.name());
    Class<Curve> expectedPropertyTypeResult = Curve.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).underlyingCurve());
    assertSame(metaBeanResult, shiftAmountResult.metaBean());
    assertSame(metaBeanResult, shiftTypeResult.metaBean());
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
        ParallelShiftedCurve.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("underlyingCurve");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("shiftAmount");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("shiftType");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("shiftAmount", getResult2.name());
    assertEquals("shiftType", getResult3.name());
    assertEquals("underlyingCurve", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ShiftType> expectedPropertyTypeResult = ShiftType.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<Curve> expectedPropertyTypeResult2 = Curve.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<ParallelShiftedCurve> expectedDeclaringTypeResult = ParallelShiftedCurve.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ParallelShiftedCurve> expectedDeclaringTypeResult2 = ParallelShiftedCurve.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<ParallelShiftedCurve> expectedDeclaringTypeResult3 = ParallelShiftedCurve.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
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
    assertNull(ParallelShiftedCurve.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = ParallelShiftedCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                ParallelShiftedCurve.absolute(curve, 10.0d), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftAmount}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'shiftAmount'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenShiftAmount_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = ParallelShiftedCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    ParallelShiftedCurve.absolute(curve, 10.0d), "shiftAmount", true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'shiftType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenShiftType_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = ParallelShiftedCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    assertDoesNotThrow(
        () ->
            metaResult.propertyGet(ParallelShiftedCurve.absolute(curve, 10.0d), "shiftType", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlyingCurve}.
   *   <li>Then return {@link ConstantNodalCurve}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'underlyingCurve'; then return ConstantNodalCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenUnderlyingCurve_thenReturnConstantNodalCurve() {
    // Arrange
    Meta metaResult = ParallelShiftedCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    ConstantNodalCurve curve = builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            ParallelShiftedCurve.absolute(curve, 10.0d), "underlyingCurve", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof ConstantNodalCurve);
    CurveMetadata metadata2 = ((ConstantNodalCurve) actualPropertyGetResult).getMetadata();
    assertTrue(metadata2 instanceof DefaultCurveMetadata);
    assertEquals(1, ((ConstantNodalCurve) actualPropertyGetResult).getParameterCount());
    assertEquals(10.0d, ((ConstantNodalCurve) actualPropertyGetResult).getXValue());
    assertEquals(10.0d, ((ConstantNodalCurve) actualPropertyGetResult).getYValue());
    assertSame(name, ((ConstantNodalCurve) actualPropertyGetResult).getName());
    assertSame(metadata, metadata2);
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
            ParallelShiftedCurve.meta()
                .propertySet(mock(Bean.class), "shiftAmount", "New Value", false));
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
            ParallelShiftedCurve.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftAmount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'shiftAmount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenShiftAmount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ParallelShiftedCurve.meta()
                .propertySet(mock(Bean.class), "shiftAmount", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'shiftType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenShiftType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ParallelShiftedCurve.meta()
                .propertySet(mock(Bean.class), "shiftType", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlyingCurve}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'underlyingCurve'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnderlyingCurve_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ParallelShiftedCurve.meta()
                .propertySet(mock(Bean.class), "underlyingCurve", "New Value", true));
  }

  /**
   * Test {@link ParallelShiftedCurve#relative(Curve, double)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then return ShiftAmount is ten.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#relative(Curve, double)}
   */
  @Test
  @DisplayName(
      "Test relative(Curve, double); when CurveName with 'Name'; then return ShiftAmount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParallelShiftedCurve ParallelShiftedCurve.relative(Curve, double)"})
  void testRelative_whenCurveNameWithName_thenReturnShiftAmountIsTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    ConstantNodalCurve spreadCurve =
        builderResult2.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    AddFixedCurve curve = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    ParallelShiftedCurve actualRelativeResult = ParallelShiftedCurve.relative(curve, 10.0d);

    // Assert
    assertEquals(10.0d, actualRelativeResult.getShiftAmount());
    assertEquals(2, actualRelativeResult.getParameterCount());
    assertEquals(ShiftType.RELATIVE, actualRelativeResult.getShiftType());
    assertSame(curve, actualRelativeResult.getUnderlyingCurve());
    assertSame(name, actualRelativeResult.getName());
    assertSame(metadata, actualRelativeResult.getMetadata());
  }

  /**
   * Test {@link ParallelShiftedCurve#of(Curve, ShiftType, double)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then return ShiftAmount is ten.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#of(Curve, ShiftType, double)}
   */
  @Test
  @DisplayName(
      "Test of(Curve, ShiftType, double); when CurveName with 'Name'; then return ShiftAmount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParallelShiftedCurve ParallelShiftedCurve.of(Curve, ShiftType, double)"})
  void testOf_whenCurveNameWithName_thenReturnShiftAmountIsTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    ConstantNodalCurve spreadCurve =
        builderResult2.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    AddFixedCurve curve = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    ParallelShiftedCurve actualOfResult = ParallelShiftedCurve.of(curve, ShiftType.RELATIVE, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getShiftAmount());
    assertEquals(2, actualOfResult.getParameterCount());
    assertEquals(ShiftType.RELATIVE, actualOfResult.getShiftType());
    assertSame(curve, actualOfResult.getUnderlyingCurve());
    assertSame(name, actualOfResult.getName());
    assertSame(metadata, actualOfResult.getMetadata());
  }

  /**
   * Test {@link ParallelShiftedCurve#getMetadata()}.
   *
   * <p>Method under test: {@link ParallelShiftedCurve#getMetadata()}
   */
  @Test
  @DisplayName("Test getMetadata()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata ParallelShiftedCurve.getMetadata()"})
  void testGetMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    ConstantNodalCurve curve = builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    // Act and Assert
    assertSame(metadata, ParallelShiftedCurve.absolute(curve, 10.0d).getMetadata());
  }

  /**
   * Test {@link ParallelShiftedCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link ParallelShiftedCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParallelShiftedCurve ParallelShiftedCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    ParallelShiftedCurve absoluteResult = ParallelShiftedCurve.absolute(curve, 10.0d);

    // Act
    ParallelShiftedCurve actualWithMetadataResult =
        absoluteResult.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(absoluteResult, actualWithMetadataResult);
  }

  /**
   * Test {@link ParallelShiftedCurve#getName()}.
   *
   * <p>Method under test: {@link ParallelShiftedCurve#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveName ParallelShiftedCurve.getName()"})
  void testGetName() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    ConstantNodalCurve curve =
        builderResult.metadata(DefaultCurveMetadata.of(name)).xValue(10.0d).yValue(10.0d).build();

    // Act and Assert
    assertSame(name, ParallelShiftedCurve.absolute(curve, 10.0d).getName());
  }

  /**
   * Test {@link ParallelShiftedCurve#getParameterCount()}.
   *
   * <p>Method under test: {@link ParallelShiftedCurve#getParameterCount()}
   */
  @Test
  @DisplayName("Test getParameterCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ParallelShiftedCurve.getParameterCount()"})
  void testGetParameterCount() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(2, ParallelShiftedCurve.absolute(curve, 10.0d).getParameterCount());
  }

  /**
   * Test {@link ParallelShiftedCurve#getParameter(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when one; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ParallelShiftedCurve.getParameter(int)"})
  void testGetParameter_whenOne_thenReturnTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(10.0d, ParallelShiftedCurve.absolute(curve, 10.0d).getParameter(1));
  }

  /**
   * Test {@link ParallelShiftedCurve#getParameter(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when zero; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ParallelShiftedCurve.getParameter(int)"})
  void testGetParameter_whenZero_thenReturnTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(10.0d, ParallelShiftedCurve.absolute(curve, 10.0d).getParameter(0));
  }

  /**
   * Test {@link ParallelShiftedCurve#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@link LabelParameterMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#getParameterMetadata(int)}
   */
  @Test
  @DisplayName("Test getParameterMetadata(int); when one; then return LabelParameterMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata ParallelShiftedCurve.getParameterMetadata(int)"})
  void testGetParameterMetadata_whenOne_thenReturnLabelParameterMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    ParameterMetadata actualParameterMetadata =
        ParallelShiftedCurve.absolute(curve, 10.0d).getParameterMetadata(1);

    // Assert
    assertTrue(actualParameterMetadata instanceof LabelParameterMetadata);
    assertEquals("AbsoluteShift", actualParameterMetadata.getIdentifier());
    assertEquals("AbsoluteShift", actualParameterMetadata.getLabel());
  }

  /**
   * Test {@link ParallelShiftedCurve#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link SimpleCurveParameterMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#getParameterMetadata(int)}
   */
  @Test
  @DisplayName(
      "Test getParameterMetadata(int); when zero; then return SimpleCurveParameterMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata ParallelShiftedCurve.getParameterMetadata(int)"})
  void testGetParameterMetadata_whenZero_thenReturnSimpleCurveParameterMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    ParameterMetadata actualParameterMetadata =
        ParallelShiftedCurve.absolute(curve, 10.0d).getParameterMetadata(0);

    // Assert
    assertTrue(actualParameterMetadata instanceof SimpleCurveParameterMetadata);
    ValueType xValueType = ((SimpleCurveParameterMetadata) actualParameterMetadata).getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertEquals("Unknown=10.0", actualParameterMetadata.getIdentifier());
    assertEquals("Unknown=10.0", actualParameterMetadata.getLabel());
    assertEquals(10.0d, ((SimpleCurveParameterMetadata) actualParameterMetadata).getXValue());
  }

  /**
   * Test {@link ParallelShiftedCurve#withParameter(int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then UnderlyingCurve return {@link ConstantNodalCurve}.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName(
      "Test withParameter(int, double); when one; then UnderlyingCurve return ConstantNodalCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParallelShiftedCurve ParallelShiftedCurve.withParameter(int, double)"})
  void testWithParameter_whenOne_thenUnderlyingCurveReturnConstantNodalCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    ParallelShiftedCurve actualWithParameterResult =
        ParallelShiftedCurve.absolute(curve, 10.0d).withParameter(1, 10.0d);

    // Assert
    Curve underlyingCurve = actualWithParameterResult.getUnderlyingCurve();
    assertTrue(underlyingCurve instanceof ConstantNodalCurve);
    CurveMetadata metadata = actualWithParameterResult.getMetadata();
    assertTrue(metadata instanceof DefaultCurveMetadata);
    DoubleArray xValues = ((ConstantNodalCurve) underlyingCurve).getXValues();
    assertEquals(xValues, ((ConstantNodalCurve) underlyingCurve).getYValues());
    assertSame(metadata, underlyingCurve.getMetadata());
    assertArrayEquals(new double[] {10.0d}, xValues.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ParallelShiftedCurve#withParameter(int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then UnderlyingCurve return {@link ConstantNodalCurve}.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName(
      "Test withParameter(int, double); when zero; then UnderlyingCurve return ConstantNodalCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParallelShiftedCurve ParallelShiftedCurve.withParameter(int, double)"})
  void testWithParameter_whenZero_thenUnderlyingCurveReturnConstantNodalCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    ParallelShiftedCurve actualWithParameterResult =
        ParallelShiftedCurve.absolute(curve, 10.0d).withParameter(0, 10.0d);

    // Assert
    Curve underlyingCurve = actualWithParameterResult.getUnderlyingCurve();
    assertTrue(underlyingCurve instanceof ConstantNodalCurve);
    CurveMetadata metadata = actualWithParameterResult.getMetadata();
    assertTrue(metadata instanceof DefaultCurveMetadata);
    DoubleArray xValues = ((ConstantNodalCurve) underlyingCurve).getXValues();
    assertEquals(xValues, ((ConstantNodalCurve) underlyingCurve).getYValues());
    assertSame(metadata, underlyingCurve.getMetadata());
    assertArrayEquals(new double[] {10.0d}, xValues.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ParallelShiftedCurve#withPerturbation(ParameterPerturbation)}.
   *
   * <p>Method under test: {@link ParallelShiftedCurve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParallelShiftedCurve ParallelShiftedCurve.withPerturbation(ParameterPerturbation)"
  })
  void testWithPerturbation() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    ParallelShiftedCurve absoluteResult = ParallelShiftedCurve.absolute(curve, 10.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    ParallelShiftedCurve actualWithPerturbationResult =
        absoluteResult.withPerturbation(perturbation);

    // Assert
    verify(perturbation, atLeast(1))
        .perturbParameter(anyInt(), eq(10.0d), Mockito.<ParameterMetadata>any());
    assertEquals(absoluteResult, actualWithPerturbationResult);
  }

  /**
   * Test {@link ParallelShiftedCurve#yValue(double)}.
   *
   * <ul>
   *   <li>Then return one hundred ten.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#yValue(double)}
   */
  @Test
  @DisplayName("Test yValue(double); then return one hundred ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ParallelShiftedCurve.yValue(double)"})
  void testYValue_thenReturnOneHundredTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(110.0d, ParallelShiftedCurve.relative(curve, 10.0d).yValue(2.0d));
  }

  /**
   * Test {@link ParallelShiftedCurve#yValue(double)}.
   *
   * <ul>
   *   <li>Then return twenty.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#yValue(double)}
   */
  @Test
  @DisplayName("Test yValue(double); then return twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ParallelShiftedCurve.yValue(double)"})
  void testYValue_thenReturnTwenty() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(20.0d, ParallelShiftedCurve.absolute(curve, 10.0d).yValue(2.0d));
  }

  /**
   * Test {@link ParallelShiftedCurve#yValueParameterSensitivity(double)}.
   *
   * <p>Method under test: {@link ParallelShiftedCurve#yValueParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test yValueParameterSensitivity(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity ParallelShiftedCurve.yValueParameterSensitivity(double)"
  })
  void testYValueParameterSensitivity() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    ConstantNodalCurve curve =
        builderResult.metadata(DefaultCurveMetadata.of(name)).xValue(10.0d).yValue(10.0d).build();

    // Act
    UnitParameterSensitivity actualYValueParameterSensitivityResult =
        ParallelShiftedCurve.absolute(curve, 10.0d).yValueParameterSensitivity(2.0d);

    // Assert
    ImmutableList<ParameterMetadata> parameterMetadata =
        actualYValueParameterSensitivityResult.getParameterMetadata();
    assertEquals(1, parameterMetadata.size());
    assertTrue(parameterMetadata.get(0) instanceof SimpleCurveParameterMetadata);
    DoubleArray sensitivity = actualYValueParameterSensitivityResult.getSensitivity();
    assertEquals(1, sensitivity.dimensions());
    assertEquals(1, sensitivity.size());
    assertEquals(1, actualYValueParameterSensitivityResult.getParameterCount());
    assertEquals(1, sensitivity.toList().size());
    assertEquals(1.0d, sensitivity.max());
    assertEquals(1.0d, sensitivity.min());
    assertEquals(1.0d, sensitivity.sum());
    assertEquals(1.0d, actualYValueParameterSensitivityResult.total());
    assertFalse(sensitivity.isEmpty());
    assertFalse(actualYValueParameterSensitivityResult.getParameterSplit().isPresent());
    assertSame(name, actualYValueParameterSensitivityResult.getMarketDataName());
    assertArrayEquals(new double[] {1.0d}, sensitivity.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ParallelShiftedCurve#firstDerivative(double)}.
   *
   * <p>Method under test: {@link ParallelShiftedCurve#firstDerivative(double)}
   */
  @Test
  @DisplayName("Test firstDerivative(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ParallelShiftedCurve.firstDerivative(double)"})
  void testFirstDerivative() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(0.0d, ParallelShiftedCurve.absolute(curve, 10.0d).firstDerivative(2.0d));
  }

  /**
   * Test {@link ParallelShiftedCurve#firstDerivative(double)}.
   *
   * <p>Method under test: {@link ParallelShiftedCurve#firstDerivative(double)}
   */
  @Test
  @DisplayName("Test firstDerivative(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ParallelShiftedCurve.firstDerivative(double)"})
  void testFirstDerivative2() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(0.0d, ParallelShiftedCurve.relative(curve, 10.0d).firstDerivative(2.0d));
  }

  /**
   * Test {@link ParallelShiftedCurve#meta()}.
   *
   * <p>Method under test: {@link ParallelShiftedCurve#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ParallelShiftedCurve.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ParallelShiftedCurve.meta();

    // Assert
    MetaProperty<Double> shiftAmountResult = actualMetaResult.shiftAmount();
    assertTrue(shiftAmountResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = actualMetaResult.shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    MetaProperty<Curve> underlyingCurveResult = actualMetaResult.underlyingCurve();
    assertTrue(underlyingCurveResult instanceof DirectMetaProperty);
    assertEquals("double", shiftAmountResult.propertyType().getName());
    assertEquals("shiftAmount", shiftAmountResult.name());
    assertEquals("shiftType", shiftTypeResult.name());
    assertEquals("underlyingCurve", underlyingCurveResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, shiftAmountResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, shiftTypeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, underlyingCurveResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ShiftType> expectedPropertyTypeResult = ShiftType.class;
    assertEquals(expectedPropertyTypeResult, shiftTypeResult.propertyType());
    Class<Curve> expectedPropertyTypeResult2 = Curve.class;
    assertEquals(expectedPropertyTypeResult2, underlyingCurveResult.propertyType());
    Class<ParallelShiftedCurve> expectedDeclaringTypeResult = ParallelShiftedCurve.class;
    assertEquals(expectedDeclaringTypeResult, shiftAmountResult.declaringType());
    Class<ParallelShiftedCurve> expectedDeclaringTypeResult2 = ParallelShiftedCurve.class;
    assertEquals(expectedDeclaringTypeResult2, shiftTypeResult.declaringType());
    Class<ParallelShiftedCurve> expectedDeclaringTypeResult3 = ParallelShiftedCurve.class;
    assertEquals(expectedDeclaringTypeResult3, underlyingCurveResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, shiftAmountResult.metaBean());
    assertSame(meta, shiftTypeResult.metaBean());
    assertSame(meta, underlyingCurveResult.metaBean());
  }

  /**
   * Test {@link ParallelShiftedCurve#metaBean()}.
   *
   * <p>Method under test: {@link ParallelShiftedCurve#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ParallelShiftedCurve.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertSame(Meta.INSTANCE, ParallelShiftedCurve.absolute(curve, 10.0d).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ParallelShiftedCurve#toString()}
   *   <li>{@link ParallelShiftedCurve#getShiftAmount()}
   *   <li>{@link ParallelShiftedCurve#getShiftType()}
   *   <li>{@link ParallelShiftedCurve#getUnderlyingCurve()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double ParallelShiftedCurve.getShiftAmount()",
    "ShiftType ParallelShiftedCurve.getShiftType()",
    "Curve ParallelShiftedCurve.getUnderlyingCurve()",
    "String ParallelShiftedCurve.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    ParallelShiftedCurve absoluteResult = ParallelShiftedCurve.absolute(curve, 10.0d);

    // Act
    String actualToStringResult = absoluteResult.toString();
    double actualShiftAmount = absoluteResult.getShiftAmount();
    ShiftType actualShiftType = absoluteResult.getShiftType();

    // Assert
    assertTrue(absoluteResult.getUnderlyingCurve() instanceof ConstantNodalCurve);
    assertEquals(
        "ParallelShiftedCurve{underlyingCurve=ConstantNodalCurve{metadata=DefaultCurveMetadata{curveName=Name,"
            + " xValueType=Unknown, yValueType=Unknown, info={}, parameterMetadata=null}, xValue=10.0, yValue=10.0},"
            + " shiftType=Absolute, shiftAmount=10.0}",
        actualToStringResult);
    assertEquals(10.0d, actualShiftAmount);
    assertEquals(ShiftType.ABSOLUTE, actualShiftType);
  }

  /**
   * Test {@link ParallelShiftedCurve#equals(Object)}, and {@link ParallelShiftedCurve#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ParallelShiftedCurve#equals(Object)}
   *   <li>{@link ParallelShiftedCurve#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParallelShiftedCurve.equals(Object)",
    "int ParallelShiftedCurve.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    ParallelShiftedCurve absoluteResult = ParallelShiftedCurve.absolute(curve, 10.0d);

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve curve2 =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    ParallelShiftedCurve absoluteResult2 = ParallelShiftedCurve.absolute(curve2, 10.0d);

    // Act and Assert
    assertEquals(absoluteResult, absoluteResult2);
    assertEquals(absoluteResult.hashCode(), absoluteResult2.hashCode());
  }

  /**
   * Test {@link ParallelShiftedCurve#equals(Object)}, and {@link ParallelShiftedCurve#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ParallelShiftedCurve#equals(Object)}
   *   <li>{@link ParallelShiftedCurve#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParallelShiftedCurve.equals(Object)",
    "int ParallelShiftedCurve.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    ParallelShiftedCurve absoluteResult = ParallelShiftedCurve.absolute(curve, 10.0d);

    // Act and Assert
    assertEquals(absoluteResult, absoluteResult);
    int expectedHashCodeResult = absoluteResult.hashCode();
    assertEquals(expectedHashCodeResult, absoluteResult.hashCode());
  }

  /**
   * Test {@link ParallelShiftedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParallelShiftedCurve.equals(Object)",
    "int ParallelShiftedCurve.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    ParallelShiftedCurve relativeResult = ParallelShiftedCurve.relative(curve, 10.0d);

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve curve2 =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(relativeResult, ParallelShiftedCurve.absolute(curve2, 10.0d));
  }

  /**
   * Test {@link ParallelShiftedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParallelShiftedCurve.equals(Object)",
    "int ParallelShiftedCurve.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    ParallelShiftedCurve absoluteResult = ParallelShiftedCurve.absolute(curve, 10.0d);

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve curve2 =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(absoluteResult, ParallelShiftedCurve.absolute(curve2, 10.0d));
  }

  /**
   * Test {@link ParallelShiftedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParallelShiftedCurve.equals(Object)",
    "int ParallelShiftedCurve.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    ParallelShiftedCurve absoluteResult = ParallelShiftedCurve.absolute(curve, 0.5d);

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve curve2 =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(absoluteResult, ParallelShiftedCurve.absolute(curve2, 10.0d));
  }

  /**
   * Test {@link ParallelShiftedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParallelShiftedCurve.equals(Object)",
    "int ParallelShiftedCurve.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(ParallelShiftedCurve.absolute(curve, 10.0d), null);
  }

  /**
   * Test {@link ParallelShiftedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParallelShiftedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParallelShiftedCurve.equals(Object)",
    "int ParallelShiftedCurve.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(
        ParallelShiftedCurve.absolute(curve, 10.0d), "Different type to ParallelShiftedCurve");
  }
}
