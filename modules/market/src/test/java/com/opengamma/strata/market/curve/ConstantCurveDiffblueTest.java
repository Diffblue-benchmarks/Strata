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
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.ConstantCurve.Meta;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
import com.opengamma.strata.market.param.UnitParameterSensitivity;
import java.util.ArrayList;
import java.util.HashMap;
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

class ConstantCurveDiffblueTest {
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
    Class<? extends ConstantCurve> actualBeanTypeResult = ConstantCurve.meta().beanType();

    // Assert
    Class<ConstantCurve> expectedBeanTypeResult = ConstantCurve.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#metadata()}
   *   <li>{@link Meta#yValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metadata()", "MetaProperty Meta.yValue()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ConstantCurve.meta();

    // Act
    MetaProperty<CurveMetadata> actualMetadataResult = metaResult.metadata();

    // Assert
    assertTrue(actualMetadataResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yValue() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code metadata}.
   *   <li>Then metaBean yValue return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'metadata'; then metaBean yValue return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMetadata_thenMetaBeanYValueReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ConstantCurve.meta().metaPropertyGet("metadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> yValueResult = ((Meta) metaBeanResult).yValue();
    assertTrue(yValueResult instanceof DirectMetaProperty);
    assertEquals("double", yValueResult.propertyType().getName());
    assertEquals("metadata", actualMetaPropertyGetResult.name());
    assertEquals("yValue", yValueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, yValueResult.style());
    Class<ConstantCurve> expectedDeclaringTypeResult = ConstantCurve.class;
    assertEquals(expectedDeclaringTypeResult, yValueResult.declaringType());
    Class<CurveMetadata> expectedPropertyTypeResult = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).metadata());
    assertSame(Meta.INSTANCE, yValueResult.metaBean());
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
    assertNull(ConstantCurve.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yValue}.
   *   <li>Then metaBean metadata return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yValue'; then metaBean metadata return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYValue_thenMetaBeanMetadataReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ConstantCurve.meta().metaPropertyGet("yValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("metadata", metadataResult.name());
    assertEquals("yValue", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, metadataResult.style());
    Class<ConstantCurve> expectedDeclaringTypeResult = ConstantCurve.class;
    assertEquals(expectedDeclaringTypeResult, metadataResult.declaringType());
    Class<CurveMetadata> expectedPropertyTypeResult = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult, metadataResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValue());
    assertSame(Meta.INSTANCE, metadataResult.metaBean());
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
        ConstantCurve.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("metadata");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("yValue");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("metadata", getResult.name());
    assertEquals("yValue", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<ConstantCurve> expectedDeclaringTypeResult = ConstantCurve.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ConstantCurve> expectedDeclaringTypeResult2 = ConstantCurve.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<CurveMetadata> expectedPropertyTypeResult = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata} with name is {@link CurveName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then return DefaultCurveMetadata with name is CurveName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnDefaultCurveMetadataWithNameIsCurveName() {
    // Arrange
    Meta metaResult = ConstantCurve.meta();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act and Assert
    assertSame(
        metadata, metaResult.propertyGet(ConstantCurve.of(metadata, 10.0d), "metadata", true));
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
    assertNull(ConstantCurve.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = ConstantCurve.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d),
                "Property Name",
                false));
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
    Meta metaResult = ConstantCurve.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d),
                    "yValue",
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
        () -> ConstantCurve.meta().propertySet(mock(Bean.class), "metadata", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code metadata}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'metadata'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMetadata_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ConstantCurve.meta().propertySet(mock(Bean.class), "metadata", "New Value", true));
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
            ConstantCurve.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> ConstantCurve.meta().propertySet(mock(Bean.class), "yValue", "New Value", true));
  }

  /**
   * Test {@link ConstantCurve#of(CurveMetadata, double)} with {@code CurveMetadata}, {@code
   * double}.
   *
   * <ul>
   *   <li>Then return ParameterCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#of(CurveMetadata, double)}
   */
  @Test
  @DisplayName(
      "Test of(CurveMetadata, double) with 'CurveMetadata', 'double'; then return ParameterCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantCurve ConstantCurve.of(CurveMetadata, double)"})
  void testOfWithCurveMetadataDouble_thenReturnParameterCountIsOne() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);

    // Act
    ConstantCurve actualOfResult = ConstantCurve.of(metadata, 10.0d);

    // Assert
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(10.0d, actualOfResult.getYValue());
    assertSame(name, actualOfResult.getName());
    assertSame(metadata, actualOfResult.getMetadata());
  }

  /**
   * Test {@link ConstantCurve#of(CurveName, double)} with {@code CurveName}, {@code double}.
   *
   * <ul>
   *   <li>Then Metadata return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#of(CurveName, double)}
   */
  @Test
  @DisplayName(
      "Test of(CurveName, double) with 'CurveName', 'double'; then Metadata return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantCurve ConstantCurve.of(CurveName, double)"})
  void testOfWithCurveNameDouble_thenMetadataReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    ConstantCurve actualOfResult = ConstantCurve.of(name, 10.0d);

    // Assert
    CurveMetadata metadata = actualOfResult.getMetadata();
    assertTrue(metadata instanceof DefaultCurveMetadata);
    ValueType xValueType = metadata.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(10.0d, actualOfResult.getYValue());
    assertFalse(metadata.getParameterMetadata().isPresent());
    assertTrue(((DefaultCurveMetadata) metadata).getInfo().isEmpty());
    assertSame(xValueType, metadata.getYValueType());
    assertSame(name, actualOfResult.getName());
    assertSame(name, metadata.getCurveName());
  }

  /**
   * Test {@link ConstantCurve#of(String, double)} with {@code String}, {@code double}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then Metadata return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#of(String, double)}
   */
  @Test
  @DisplayName(
      "Test of(String, double) with 'String', 'double'; when 'Name'; then Metadata return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantCurve ConstantCurve.of(String, double)"})
  void testOfWithStringDouble_whenName_thenMetadataReturnDefaultCurveMetadata() {
    // Arrange and Act
    ConstantCurve actualOfResult = ConstantCurve.of("Name", 10.0d);

    // Assert
    CurveMetadata metadata = actualOfResult.getMetadata();
    assertTrue(metadata instanceof DefaultCurveMetadata);
    CurveName name = actualOfResult.getName();
    assertEquals("Name", name.getName());
    ValueType xValueType = metadata.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(10.0d, actualOfResult.getYValue());
    assertFalse(metadata.getParameterMetadata().isPresent());
    assertTrue(((DefaultCurveMetadata) metadata).getInfo().isEmpty());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, name.getMarketDataType());
    assertSame(name, metadata.getCurveName());
    assertSame(xValueType, metadata.getYValueType());
  }

  /**
   * Test {@link ConstantCurve#getParameter(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when zero; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantCurve.getParameter(int)"})
  void testGetParameter_whenZero_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d).getParameter(0));
  }

  /**
   * Test {@link ConstantCurve#withParameter(int, double)}.
   *
   * <p>Method under test: {@link ConstantCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantCurve ConstantCurve.withParameter(int, double)"})
  void testWithParameter() {
    // Arrange
    ConstantCurve ofResult = ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);

    // Act
    ConstantCurve actualWithParameterResult = ofResult.withParameter(0, 10.0d);

    // Assert
    assertEquals(ofResult, actualWithParameterResult);
  }

  /**
   * Test {@link ConstantCurve#withPerturbation(ParameterPerturbation)}.
   *
   * <p>Method under test: {@link ConstantCurve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantCurve ConstantCurve.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation() {
    // Arrange
    ConstantCurve ofResult = ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    ConstantCurve actualWithPerturbationResult = ofResult.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
    assertEquals(ofResult, actualWithPerturbationResult);
  }

  /**
   * Test {@link ConstantCurve#yValue(double)}.
   *
   * <p>Method under test: {@link ConstantCurve#yValue(double)}
   */
  @Test
  @DisplayName("Test yValue(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantCurve.yValue(double)"})
  void testYValue() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d, ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d).yValue(2.0d));
  }

  /**
   * Test {@link ConstantCurve#yValueParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>Then return Sensitivity dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#yValueParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test yValueParameterSensitivity(double); then return Sensitivity dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivity ConstantCurve.yValueParameterSensitivity(double)"})
  void testYValueParameterSensitivity_thenReturnSensitivityDimensionsIsOne() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    UnitParameterSensitivity actualYValueParameterSensitivityResult =
        ConstantCurve.of(DefaultCurveMetadata.of(name), 10.0d).yValueParameterSensitivity(2.0d);

    // Assert
    DoubleArray sensitivity = actualYValueParameterSensitivityResult.getSensitivity();
    assertEquals(1, sensitivity.dimensions());
    assertEquals(1, sensitivity.size());
    assertEquals(1, actualYValueParameterSensitivityResult.getParameterCount());
    assertEquals(1, actualYValueParameterSensitivityResult.getParameterMetadata().size());
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
   * Test {@link ConstantCurve#firstDerivative(double)}.
   *
   * <p>Method under test: {@link ConstantCurve#firstDerivative(double)}
   */
  @Test
  @DisplayName("Test firstDerivative(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantCurve.firstDerivative(double)"})
  void testFirstDerivative() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d)
            .firstDerivative(2.0d));
  }

  /**
   * Test {@link ConstantCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link ConstantCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantCurve ConstantCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata() {
    // Arrange
    ConstantCurve ofResult = ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);

    // Act
    ConstantCurve actualWithMetadataResult =
        ofResult.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(ofResult, actualWithMetadataResult);
  }

  /**
   * Test {@link ConstantCurve#withMetadata(CurveMetadata)}.
   *
   * <ul>
   *   <li>Given of {@code curveName}.
   *   <li>Then return Metadata Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test withMetadata(CurveMetadata); given of 'curveName'; then return Metadata Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantCurve ConstantCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata_givenOfCurveName_thenReturnMetadataInfoSizeIsOne() {
    // Arrange
    ConstantCurve ofResult = ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);

    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult2 = CurveInfoType.of("curveName");
    info.put(ofResult2, "Value");
    CurveName curveName = CurveName.of("metadata");

    DefaultCurveMetadata metadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    ConstantCurve actualWithMetadataResult = ofResult.withMetadata(metadata);

    // Assert
    CurveMetadata metadata2 = actualWithMetadataResult.getMetadata();
    assertTrue(metadata2 instanceof DefaultCurveMetadata);
    ValueType xValueType = metadata2.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    CurveName name = actualWithMetadataResult.getName();
    assertEquals("metadata", name.getName());
    assertEquals(1, ((DefaultCurveMetadata) metadata2).getInfo().size());
    assertSame(xValueType, metadata2.getYValueType());
    assertSame(curveName, name);
    assertSame(curveName, metadata2.getCurveName());
  }

  /**
   * Test {@link ConstantCurve#withMetadata(CurveMetadata)}.
   *
   * <ul>
   *   <li>Given of {@code Name}.
   *   <li>Then return Metadata Info size is two.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test withMetadata(CurveMetadata); given of 'Name'; then return Metadata Info size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantCurve ConstantCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata_givenOfName_thenReturnMetadataInfoSizeIsTwo() {
    // Arrange
    ConstantCurve ofResult = ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);

    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult2 = CurveInfoType.of("Name");
    info.put(ofResult2, "Value");
    CurveInfoType<?> ofResult3 = CurveInfoType.of("curveName");
    info.put(ofResult3, "Value");
    CurveName curveName = CurveName.of("metadata");

    DefaultCurveMetadata metadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    ConstantCurve actualWithMetadataResult = ofResult.withMetadata(metadata);

    // Assert
    CurveMetadata metadata2 = actualWithMetadataResult.getMetadata();
    assertTrue(metadata2 instanceof DefaultCurveMetadata);
    ValueType xValueType = metadata2.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    CurveName name = actualWithMetadataResult.getName();
    assertEquals("metadata", name.getName());
    assertEquals(2, ((DefaultCurveMetadata) metadata2).getInfo().size());
    assertSame(xValueType, metadata2.getYValueType());
    assertSame(curveName, name);
    assertSame(curveName, metadata2.getCurveName());
  }

  /**
   * Test {@link ConstantCurve#withMetadata(CurveMetadata)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with name is {@code metadata}.
   *   <li>Then return Metadata Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test withMetadata(CurveMetadata); when CurveName with name is 'metadata'; then return Metadata Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantCurve ConstantCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata_whenCurveNameWithNameIsMetadata_thenReturnMetadataInfoEmpty() {
    // Arrange
    ConstantCurve ofResult = ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);
    CurveName curveName = CurveName.of("metadata");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata metadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    ConstantCurve actualWithMetadataResult = ofResult.withMetadata(metadata);

    // Assert
    CurveMetadata metadata2 = actualWithMetadataResult.getMetadata();
    assertTrue(metadata2 instanceof DefaultCurveMetadata);
    ValueType xValueType = metadata2.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    CurveName name = actualWithMetadataResult.getName();
    assertEquals("metadata", name.getName());
    assertTrue(((DefaultCurveMetadata) metadata2).getInfo().isEmpty());
    assertSame(xValueType, metadata2.getYValueType());
    assertSame(curveName, name);
    assertSame(curveName, metadata2.getCurveName());
  }

  /**
   * Test {@link ConstantCurve#meta()}.
   *
   * <p>Method under test: {@link ConstantCurve#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ConstantCurve.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ConstantCurve.meta();

    // Assert
    MetaProperty<CurveMetadata> metadataResult = actualMetaResult.metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<Double> yValueResult = actualMetaResult.yValue();
    assertTrue(yValueResult instanceof DirectMetaProperty);
    assertEquals("double", yValueResult.propertyType().getName());
    assertEquals("metadata", metadataResult.name());
    assertEquals("yValue", yValueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, metadataResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, yValueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ConstantCurve> expectedDeclaringTypeResult = ConstantCurve.class;
    assertEquals(expectedDeclaringTypeResult, metadataResult.declaringType());
    Class<ConstantCurve> expectedDeclaringTypeResult2 = ConstantCurve.class;
    assertEquals(expectedDeclaringTypeResult2, yValueResult.declaringType());
    Class<CurveMetadata> expectedPropertyTypeResult = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult, metadataResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metadataResult.metaBean());
    assertSame(meta, yValueResult.metaBean());
  }

  /**
   * Test {@link ConstantCurve#metaBean()}.
   *
   * <p>Method under test: {@link ConstantCurve#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ConstantCurve.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantCurve#toString()}
   *   <li>{@link ConstantCurve#getMetadata()}
   *   <li>{@link ConstantCurve#getParameterCount()}
   *   <li>{@link ConstantCurve#getYValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveMetadata ConstantCurve.getMetadata()",
    "int ConstantCurve.getParameterCount()",
    "double ConstantCurve.getYValue()",
    "String ConstantCurve.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    ConstantCurve ofResult = ConstantCurve.of(metadata, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    CurveMetadata actualMetadata = ofResult.getMetadata();
    int actualParameterCount = ofResult.getParameterCount();

    // Assert
    assertEquals(
        "ConstantCurve{metadata=DefaultCurveMetadata{curveName=Name, xValueType=Unknown, yValueType=Unknown,"
            + " info={}, parameterMetadata=null}, yValue=10.0}",
        actualToStringResult);
    assertEquals(1, actualParameterCount);
    assertEquals(10.0d, ofResult.getYValue());
    assertSame(metadata, actualMetadata);
  }

  /**
   * Test {@link ConstantCurve#equals(Object)}, and {@link ConstantCurve#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantCurve#equals(Object)}
   *   <li>{@link ConstantCurve#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantCurve.equals(Object)", "int ConstantCurve.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ConstantCurve ofResult = ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);
    ConstantCurve ofResult2 =
        ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link ConstantCurve#equals(Object)}, and {@link ConstantCurve#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantCurve#equals(Object)}
   *   <li>{@link ConstantCurve#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantCurve.equals(Object)", "int ConstantCurve.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ConstantCurve ofResult = ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link ConstantCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantCurve.equals(Object)", "int ConstantCurve.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CurveName curveName = CurveName.of("Name");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata metadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    ConstantCurve ofResult = ConstantCurve.of(metadata, 10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult, ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d));
  }

  /**
   * Test {@link ConstantCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantCurve.equals(Object)", "int ConstantCurve.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ConstantCurve ofResult = ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 2.0d);

    // Act and Assert
    assertNotEquals(
        ofResult, ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d));
  }

  /**
   * Test {@link ConstantCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantCurve.equals(Object)", "int ConstantCurve.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d), null);
  }

  /**
   * Test {@link ConstantCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantCurve.equals(Object)", "int ConstantCurve.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d),
        "Different type to ConstantCurve");
  }
}
