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
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.CombinedCurve.Meta;
import com.opengamma.strata.market.curve.ConstantNodalCurve.Builder;
import com.opengamma.strata.market.curve.CurveTest.TestingCurve;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
import com.opengamma.strata.market.param.ParameterSize;
import com.opengamma.strata.market.param.UnitParameterSensitivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiFunction;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CombinedCurveDiffblueTest {
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
    Class<? extends CombinedCurve> actualBeanTypeResult = CombinedCurve.meta().beanType();

    // Assert
    Class<CombinedCurve> expectedBeanTypeResult = CombinedCurve.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#baseCurve()}
   *   <li>{@link Meta#metadata()}
   *   <li>{@link Meta#spreadCurve()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.baseCurve()",
    "MetaProperty Meta.metadata()",
    "MetaProperty Meta.spreadCurve()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CombinedCurve.meta();

    // Act
    MetaProperty<Curve> actualBaseCurveResult = metaResult.baseCurve();
    MetaProperty<CurveMetadata> actualMetadataResult = metaResult.metadata();

    // Assert
    assertTrue(actualBaseCurveResult instanceof DirectMetaProperty);
    assertTrue(actualMetadataResult instanceof DirectMetaProperty);
    assertTrue(metaResult.spreadCurve() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code baseCurve}.
   *   <li>Then return name is {@code baseCurve}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'baseCurve'; then return name is 'baseCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenBaseCurve_thenReturnNameIsBaseCurve() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CombinedCurve.meta().metaPropertyGet("baseCurve");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<Curve> spreadCurveResult = ((Meta) metaBeanResult).spreadCurve();
    assertTrue(spreadCurveResult instanceof DirectMetaProperty);
    assertEquals("baseCurve", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).baseCurve());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, spreadCurveResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code metadata}.
   *   <li>Then return name is {@code metadata}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'metadata'; then return name is 'metadata'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMetadata_thenReturnNameIsMetadata() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CombinedCurve.meta().metaPropertyGet("metadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Curve> baseCurveResult = ((Meta) metaBeanResult).baseCurve();
    assertTrue(baseCurveResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Curve> spreadCurveResult = ((Meta) metaBeanResult).spreadCurve();
    assertTrue(spreadCurveResult instanceof DirectMetaProperty);
    assertEquals("metadata", actualMetaPropertyGetResult.name());
    Class<CurveMetadata> expectedPropertyTypeResult = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).metadata());
    assertSame(metaBeanResult, baseCurveResult.metaBean());
    assertSame(metaBeanResult, spreadCurveResult.metaBean());
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
    assertNull(CombinedCurve.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code spreadCurve}.
   *   <li>Then return name is {@code spreadCurve}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'spreadCurve'; then return name is 'spreadCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSpreadCurve_thenReturnNameIsSpreadCurve() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CombinedCurve.meta().metaPropertyGet("spreadCurve");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Curve> baseCurveResult = ((Meta) metaBeanResult).baseCurve();
    assertTrue(baseCurveResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    assertEquals("spreadCurve", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).spreadCurve());
    assertSame(metaBeanResult, baseCurveResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
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
        CombinedCurve.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("baseCurve");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("metadata");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("spreadCurve");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("baseCurve", getResult.name());
    assertEquals("metadata", getResult2.name());
    assertEquals("spreadCurve", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<CombinedCurve> expectedDeclaringTypeResult = CombinedCurve.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<CombinedCurve> expectedDeclaringTypeResult2 = CombinedCurve.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<CombinedCurve> expectedDeclaringTypeResult3 = CombinedCurve.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<Curve> expectedPropertyTypeResult = Curve.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<Curve> expectedPropertyTypeResult2 = Curve.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<CurveMetadata> expectedPropertyTypeResult3 = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult3, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
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
    Meta metaResult = CombinedCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    CombinedCurve bean = CombinedCurve.of(baseCurve, spreadCurve, metadata);

    // Act and Assert
    assertSame(metadata, metaResult.propertyGet(bean, "metadata", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code baseCurve}.
   *   <li>Then return {@link ConstantNodalCurve}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'baseCurve'; then return ConstantNodalCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBaseCurve_thenReturnConstantNodalCurve() {
    // Arrange
    Meta metaResult = CombinedCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve bean =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "baseCurve", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof ConstantNodalCurve);
    assertTrue(
        ((ConstantNodalCurve) actualPropertyGetResult).getMetadata()
            instanceof DefaultCurveMetadata);
    DoubleArray xValues = ((ConstantNodalCurve) actualPropertyGetResult).getXValues();
    assertEquals(xValues, ((ConstantNodalCurve) actualPropertyGetResult).getYValues());
    assertArrayEquals(new double[] {10.0d}, xValues.toArrayUnsafe(), 0.0);
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
    assertNull(CombinedCurve.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = CombinedCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve bean =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code spreadCurve}.
   *   <li>Then return Name is {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'spreadCurve'; then return Name is CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSpreadCurve_thenReturnNameIsCurveNameWithName() {
    // Arrange
    Meta metaResult = CombinedCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    ConstantNodalCurve baseCurve =
        builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve bean =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "spreadCurve", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof ConstantNodalCurve);
    CurveMetadata metadata2 = ((ConstantNodalCurve) actualPropertyGetResult).getMetadata();
    assertTrue(metadata2 instanceof DefaultCurveMetadata);
    DoubleArray xValues = ((ConstantNodalCurve) actualPropertyGetResult).getXValues();
    assertEquals(xValues, ((ConstantNodalCurve) actualPropertyGetResult).getYValues());
    assertEquals(name, ((ConstantNodalCurve) actualPropertyGetResult).getName());
    assertEquals(metadata, metadata2);
    assertArrayEquals(new double[] {10.0d}, xValues.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code baseCurve}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'baseCurve'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBaseCurve_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CombinedCurve.meta().propertySet(mock(Bean.class), "baseCurve", "New Value", true));
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
        () -> CombinedCurve.meta().propertySet(mock(Bean.class), "baseCurve", "New Value", false));
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
        () -> CombinedCurve.meta().propertySet(mock(Bean.class), "metadata", "New Value", true));
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
            CombinedCurve.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code spreadCurve}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'spreadCurve'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSpreadCurve_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CombinedCurve.meta().propertySet(mock(Bean.class), "spreadCurve", "New Value", true));
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve spreadCurve3 =
        CombinedCurve.of(baseCurve2, spreadCurve2, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve, spreadCurve3);

    // Assert
    Curve baseCurve3 = actualOfResult.getBaseCurve();
    assertTrue(baseCurve3 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) baseCurve3).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(spreadCurve3, actualOfResult.getSpreadCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve2() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);
    ConstantCurve spreadCurve2 =
        ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve, spreadCurve2);

    // Assert
    Curve baseCurve2 = actualOfResult.getBaseCurve();
    assertTrue(baseCurve2 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) baseCurve2).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(spreadCurve2, actualOfResult.getSpreadCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve3() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);

    ParameterizedFunctionalCurve.Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    ParameterizedFunctionalCurve.Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve spreadCurve2 =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve, spreadCurve2);

    // Assert
    Curve baseCurve2 = actualOfResult.getBaseCurve();
    assertTrue(baseCurve2 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) baseCurve2).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(spreadCurve2, actualOfResult.getSpreadCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve4() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve baseCurve2 =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve spreadCurve3 = AddFixedCurve.of(fixedCurve, spreadCurve2);

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve2, spreadCurve3);

    // Assert
    Curve spreadCurve4 = actualOfResult.getSpreadCurve();
    assertTrue(spreadCurve4 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) spreadCurve4).getFixedCurve() instanceof ConstantNodalCurve);
    assertTrue(((AddFixedCurve) spreadCurve4).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(baseCurve2, actualOfResult.getBaseCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve5() {
    // Arrange
    ConstantCurve baseCurve =
        ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve spreadCurve2 = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve, spreadCurve2);

    // Assert
    Curve spreadCurve3 = actualOfResult.getSpreadCurve();
    assertTrue(spreadCurve3 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) spreadCurve3).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertTrue(spreadCurve3.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(baseCurve, actualOfResult.getBaseCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve6() {
    // Arrange
    ParameterizedFunctionalCurve.Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    ParameterizedFunctionalCurve.Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve baseCurve =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve spreadCurve2 = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve, spreadCurve2);

    // Assert
    Curve spreadCurve3 = actualOfResult.getSpreadCurve();
    assertTrue(spreadCurve3 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) spreadCurve3).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertTrue(spreadCurve3.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(baseCurve, actualOfResult.getBaseCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve7() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    ParallelShiftedCurve spreadCurve2 = ParallelShiftedCurve.absolute(curve, 10.0d);

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve, spreadCurve2);

    // Assert
    Curve baseCurve2 = actualOfResult.getBaseCurve();
    assertTrue(baseCurve2 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) baseCurve2).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(spreadCurve2, actualOfResult.getSpreadCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve8() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    ParallelShiftedCurve baseCurve = ParallelShiftedCurve.absolute(curve, 10.0d);

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve spreadCurve2 = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve, spreadCurve2);

    // Assert
    Curve spreadCurve3 = actualOfResult.getSpreadCurve();
    assertTrue(spreadCurve3 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) spreadCurve3).getFixedCurve() instanceof ConstantNodalCurve);
    assertTrue(((AddFixedCurve) spreadCurve3).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertTrue(spreadCurve3.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(baseCurve, actualOfResult.getBaseCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve, CurveMetadata)} with {@code baseCurve}, {@code
   * spreadCurve}, {@code metadata}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve, CurveMetadata)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve, CurveMetadata) with 'baseCurve', 'spreadCurve', 'metadata'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve, CurveMetadata)"})
  void testOfWithBaseCurveSpreadCurveMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve baseCurve2 =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve spreadCurve3 = AddFixedCurve.of(fixedCurve, spreadCurve2);

    // Act
    CombinedCurve actualOfResult =
        CombinedCurve.of(baseCurve2, spreadCurve3, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    Curve spreadCurve4 = actualOfResult.getSpreadCurve();
    assertTrue(spreadCurve4 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) spreadCurve4).getFixedCurve() instanceof ConstantNodalCurve);
    assertTrue(((AddFixedCurve) spreadCurve4).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(baseCurve2, actualOfResult.getBaseCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve, CurveMetadata)} with {@code baseCurve}, {@code
   * spreadCurve}, {@code metadata}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve, CurveMetadata)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve, CurveMetadata) with 'baseCurve', 'spreadCurve', 'metadata'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve, CurveMetadata)"})
  void testOfWithBaseCurveSpreadCurveMetadata2() {
    // Arrange
    TestingCurve baseCurve = new TestingCurve(10.0d);

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve spreadCurve2 = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    CombinedCurve actualOfResult =
        CombinedCurve.of(baseCurve, spreadCurve2, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    Curve spreadCurve3 = actualOfResult.getSpreadCurve();
    assertTrue(spreadCurve3 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) spreadCurve3).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(baseCurve, actualOfResult.getBaseCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve, CurveMetadata)} with {@code baseCurve}, {@code
   * spreadCurve}, {@code metadata}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve, CurveMetadata)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve, CurveMetadata) with 'baseCurve', 'spreadCurve', 'metadata'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve, CurveMetadata)"})
  void testOfWithBaseCurveSpreadCurveMetadata3() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve spreadCurve3 =
        CombinedCurve.of(baseCurve2, spreadCurve2, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    CombinedCurve actualOfResult =
        CombinedCurve.of(baseCurve, spreadCurve3, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    Curve baseCurve3 = actualOfResult.getBaseCurve();
    assertTrue(baseCurve3 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) baseCurve3).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(spreadCurve3, actualOfResult.getSpreadCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve, CurveMetadata)} with {@code baseCurve}, {@code
   * spreadCurve}, {@code metadata}.
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve, CurveMetadata)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve, CurveMetadata) with 'baseCurve', 'spreadCurve', 'metadata'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve, CurveMetadata)"})
  void testOfWithBaseCurveSpreadCurveMetadata4() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);
    TestingCurve spreadCurve2 = new TestingCurve(10.0d);

    // Act
    CombinedCurve actualOfResult =
        CombinedCurve.of(baseCurve, spreadCurve2, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    Curve baseCurve2 = actualOfResult.getBaseCurve();
    assertTrue(baseCurve2 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) baseCurve2).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(spreadCurve2, actualOfResult.getSpreadCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve, CurveMetadata)} with {@code baseCurve}, {@code
   * spreadCurve}, {@code metadata}.
   *
   * <ul>
   *   <li>Then BaseCurve return {@link AddFixedCurve}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve, CurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test of(Curve, Curve, CurveMetadata) with 'baseCurve', 'spreadCurve', 'metadata'; then BaseCurve return AddFixedCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve, CurveMetadata)"})
  void testOfWithBaseCurveSpreadCurveMetadata_thenBaseCurveReturnAddFixedCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve spreadCurve3 = AddFixedCurve.of(fixedCurve2, spreadCurve2);

    // Act
    CombinedCurve actualOfResult =
        CombinedCurve.of(baseCurve, spreadCurve3, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    Curve baseCurve2 = actualOfResult.getBaseCurve();
    assertTrue(baseCurve2 instanceof AddFixedCurve);
    assertTrue(actualOfResult.getSpreadCurve() instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) baseCurve2).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve, CurveMetadata)} with {@code baseCurve}, {@code
   * spreadCurve}, {@code metadata}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve, CurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test of(Curve, Curve, CurveMetadata) with 'baseCurve', 'spreadCurve', 'metadata'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve, CurveMetadata)"})
  void testOfWithBaseCurveSpreadCurveMetadata_thenThrowIllegalArgumentException() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve spreadCurve3 = AddFixedCurve.of(fixedCurve2, spreadCurve2);
    CurveName curveName = CurveName.of("baseCurve");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata metadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CombinedCurve.of(baseCurve, spreadCurve3, metadata));
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <ul>
   *   <li>Then return Name Name is {@code Curve+Name}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'; then return Name Name is 'Curve+Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve_thenReturnNameNameIsCurveName() {
    // Arrange
    TestingCurve baseCurve = new TestingCurve(10.0d);

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve spreadCurve2 = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve, spreadCurve2);

    // Assert
    Curve spreadCurve3 = actualOfResult.getSpreadCurve();
    assertTrue(spreadCurve3 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) spreadCurve3).getSpreadCurve() instanceof ConstantNodalCurve);
    CurveMetadata metadata = actualOfResult.getMetadata();
    assertTrue(metadata instanceof DefaultCurveMetadata);
    CurveName name = actualOfResult.getName();
    assertEquals("Curve+Name", name.getName());
    assertSame(baseCurve, actualOfResult.getBaseCurve());
    assertSame(name, metadata.getCurveName());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <ul>
   *   <li>Then return Name Name is {@code Name+Curve}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'; then return Name Name is 'Name+Curve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve_thenReturnNameNameIsNameCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);
    TestingCurve spreadCurve2 = new TestingCurve(10.0d);

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve, spreadCurve2);

    // Assert
    Curve baseCurve2 = actualOfResult.getBaseCurve();
    assertTrue(baseCurve2 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) baseCurve2).getSpreadCurve() instanceof ConstantNodalCurve);
    CurveMetadata metadata = actualOfResult.getMetadata();
    assertTrue(metadata instanceof DefaultCurveMetadata);
    CurveName name = actualOfResult.getName();
    assertEquals("Name+Curve", name.getName());
    assertSame(spreadCurve2, actualOfResult.getSpreadCurve());
    assertSame(name, metadata.getCurveName());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <ul>
   *   <li>Then return ParameterCount is four.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'; then return ParameterCount is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve_thenReturnParameterCountIsFour() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);

    ParameterizedFunctionalCurve.Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    ParameterizedFunctionalCurve.Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve spreadCurve2 =
        metadataResult
            .parameters(DoubleArray.filled(3))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve, spreadCurve2);

    // Assert
    Curve baseCurve2 = actualOfResult.getBaseCurve();
    assertTrue(baseCurve2 instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) baseCurve2).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(4, actualOfResult.getParameterCount());
    assertSame(spreadCurve2, actualOfResult.getSpreadCurve());
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <ul>
   *   <li>Then SpreadCurve return {@link AddFixedCurve}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'; then SpreadCurve return AddFixedCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve_thenSpreadCurveReturnAddFixedCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve spreadCurve3 = AddFixedCurve.of(fixedCurve2, spreadCurve2);

    // Act
    CombinedCurve actualOfResult = CombinedCurve.of(baseCurve, spreadCurve3);

    // Assert
    Curve baseCurve2 = actualOfResult.getBaseCurve();
    assertTrue(baseCurve2 instanceof AddFixedCurve);
    assertTrue(actualOfResult.getSpreadCurve() instanceof AddFixedCurve);
    assertTrue(((AddFixedCurve) baseCurve2).getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
  }

  /**
   * Test {@link CombinedCurve#of(Curve, Curve)} with {@code baseCurve}, {@code spreadCurve}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(Curve, Curve) with 'baseCurve', 'spreadCurve'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.of(Curve, Curve)"})
  void testOfWithBaseCurveSpreadCurve_thenThrowIllegalArgumentException() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve baseCurve = AddFixedCurve.of(fixedCurve, spreadCurve);

    ParameterizedFunctionalCurve.Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));
    CurveName curveName = CurveName.of("xValueType");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata metadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    ParameterizedFunctionalCurve.Builder metadataResult =
        derivativeFunctionResult.metadata(metadata);
    ParameterizedFunctionalCurve spreadCurve2 =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CombinedCurve.of(baseCurve, spreadCurve2));
  }

  /**
   * Test {@link CombinedCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link CombinedCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    CombinedCurve actualWithMetadataResult =
        ofResult.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(ofResult, actualWithMetadataResult);
  }

  /**
   * Test {@link CombinedCurve#withMetadata(CurveMetadata)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata_thenThrowIllegalArgumentException() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));
    CurveName curveName = CurveName.of("baseCurve");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata metadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.withMetadata(metadata));
  }

  /**
   * Test {@link CombinedCurve#getParameterCount()}.
   *
   * <p>Method under test: {@link CombinedCurve#getParameterCount()}
   */
  @Test
  @DisplayName("Test getParameterCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CombinedCurve.getParameterCount()"})
  void testGetParameterCount() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertEquals(2, ofResult.getParameterCount());
  }

  /**
   * Test {@link CombinedCurve#getParameter(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when one; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double CombinedCurve.getParameter(int)"})
  void testGetParameter_whenOne_thenReturnTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertEquals(10.0d, ofResult.getParameter(1));
  }

  /**
   * Test {@link CombinedCurve#getParameter(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when zero; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double CombinedCurve.getParameter(int)"})
  void testGetParameter_whenZero_thenReturnTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertEquals(10.0d, ofResult.getParameter(0));
  }

  /**
   * Test {@link CombinedCurve#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@link SimpleCurveParameterMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#getParameterMetadata(int)}
   */
  @Test
  @DisplayName("Test getParameterMetadata(int); when one; then return SimpleCurveParameterMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata CombinedCurve.getParameterMetadata(int)"})
  void testGetParameterMetadata_whenOne_thenReturnSimpleCurveParameterMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    ParameterMetadata actualParameterMetadata = ofResult.getParameterMetadata(1);

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
   * Test {@link CombinedCurve#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link SimpleCurveParameterMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#getParameterMetadata(int)}
   */
  @Test
  @DisplayName(
      "Test getParameterMetadata(int); when zero; then return SimpleCurveParameterMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata CombinedCurve.getParameterMetadata(int)"})
  void testGetParameterMetadata_whenZero_thenReturnSimpleCurveParameterMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    ParameterMetadata actualParameterMetadata = ofResult.getParameterMetadata(0);

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
   * Test {@link CombinedCurve#withParameter(int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then BaseCurve return {@link ConstantNodalCurve}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName(
      "Test withParameter(int, double); when one; then BaseCurve return ConstantNodalCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withParameter(int, double)"})
  void testWithParameter_whenOne_thenBaseCurveReturnConstantNodalCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    CombinedCurve actualWithParameterResult = ofResult.withParameter(1, 10.0d);

    // Assert
    Curve baseCurve2 = actualWithParameterResult.getBaseCurve();
    assertTrue(baseCurve2 instanceof ConstantNodalCurve);
    Curve spreadCurve2 = actualWithParameterResult.getSpreadCurve();
    assertTrue(spreadCurve2 instanceof ConstantNodalCurve);
    assertTrue(actualWithParameterResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(baseCurve2, spreadCurve2);
  }

  /**
   * Test {@link CombinedCurve#withParameter(int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then BaseCurve return {@link ConstantNodalCurve}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName(
      "Test withParameter(int, double); when zero; then BaseCurve return ConstantNodalCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withParameter(int, double)"})
  void testWithParameter_whenZero_thenBaseCurveReturnConstantNodalCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    CombinedCurve actualWithParameterResult = ofResult.withParameter(0, 10.0d);

    // Assert
    Curve baseCurve2 = actualWithParameterResult.getBaseCurve();
    assertTrue(baseCurve2 instanceof ConstantNodalCurve);
    Curve spreadCurve2 = actualWithParameterResult.getSpreadCurve();
    assertTrue(spreadCurve2 instanceof ConstantNodalCurve);
    assertTrue(actualWithParameterResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(baseCurve2, spreadCurve2);
  }

  /**
   * Test {@link CombinedCurve#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then BaseCurve return {@link ConstantNodalCurve}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName(
      "Test withPerturbation(ParameterPerturbation); given ten; then BaseCurve return ConstantNodalCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation_givenTen_thenBaseCurveReturnConstantNodalCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    CurveName name = CurveName.of("Name");

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(name));

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    CombinedCurve actualWithPerturbationResult = ofResult.withPerturbation(perturbation);

    // Assert
    verify(perturbation, atLeast(1))
        .perturbParameter(anyInt(), eq(10.0d), isA(ParameterMetadata.class));
    Curve baseCurve2 = actualWithPerturbationResult.getBaseCurve();
    assertTrue(baseCurve2 instanceof ConstantNodalCurve);
    Curve spreadCurve2 = actualWithPerturbationResult.getSpreadCurve();
    assertTrue(spreadCurve2 instanceof ConstantNodalCurve);
    assertTrue(actualWithPerturbationResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(2, actualWithPerturbationResult.getParameterCount());
    assertEquals(baseCurve2, spreadCurve2);
    assertSame(name, actualWithPerturbationResult.getName());
  }

  /**
   * Test {@link CombinedCurve#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation_thenThrowIllegalArgumentException() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.withPerturbation(perturbation));
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
  }

  /**
   * Test {@link CombinedCurve#yValue(double)}.
   *
   * <p>Method under test: {@link CombinedCurve#yValue(double)}
   */
  @Test
  @DisplayName("Test yValue(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double CombinedCurve.yValue(double)"})
  void testYValue() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertEquals(20.0d, ofResult.yValue(2.0d));
  }

  /**
   * Test {@link CombinedCurve#yValueParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>Then return ParameterMetadata size is two.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#yValueParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test yValueParameterSensitivity(double); then return ParameterMetadata size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivity CombinedCurve.yValueParameterSensitivity(double)"})
  void testYValueParameterSensitivity_thenReturnParameterMetadataSizeIsTwo() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("marketDataName")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    CurveName name = CurveName.of("Name");

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(name));

    // Act
    UnitParameterSensitivity actualYValueParameterSensitivityResult =
        ofResult.yValueParameterSensitivity(2.0d);

    // Assert
    ImmutableList<ParameterMetadata> parameterMetadata =
        actualYValueParameterSensitivityResult.getParameterMetadata();
    assertEquals(2, parameterMetadata.size());
    ParameterMetadata getResult = parameterMetadata.get(0);
    assertTrue(getResult instanceof SimpleCurveParameterMetadata);
    ParameterMetadata getResult2 = parameterMetadata.get(1);
    assertTrue(getResult2 instanceof SimpleCurveParameterMetadata);
    DoubleArray sensitivity = actualYValueParameterSensitivityResult.getSensitivity();
    assertEquals(1, sensitivity.dimensions());
    assertEquals(1.0d, sensitivity.max());
    assertEquals(1.0d, sensitivity.min());
    assertEquals(2, sensitivity.size());
    assertEquals(2, actualYValueParameterSensitivityResult.getParameterCount());
    assertEquals(2, sensitivity.toList().size());
    Optional<List<ParameterSize>> parameterSplit =
        actualYValueParameterSensitivityResult.getParameterSplit();
    assertEquals(2, parameterSplit.get().size());
    assertEquals(2.0d, sensitivity.sum());
    assertEquals(2.0d, actualYValueParameterSensitivityResult.total());
    assertFalse(sensitivity.isEmpty());
    assertTrue(parameterSplit.isPresent());
    assertEquals(getResult, getResult2);
    assertSame(name, actualYValueParameterSensitivityResult.getMarketDataName());
    assertArrayEquals(new double[] {1.0d, 1.0d}, sensitivity.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CombinedCurve#firstDerivative(double)}.
   *
   * <p>Method under test: {@link CombinedCurve#firstDerivative(double)}
   */
  @Test
  @DisplayName("Test firstDerivative(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double CombinedCurve.firstDerivative(double)"})
  void testFirstDerivative() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertEquals(0.0d, ofResult.firstDerivative(2.0d));
  }

  /**
   * Test {@link CombinedCurve#createParameterSensitivity(DoubleArray)} with {@code sensitivities}.
   *
   * <p>Method under test: {@link CombinedCurve#createParameterSensitivity(DoubleArray)}
   */
  @Test
  @DisplayName("Test createParameterSensitivity(DoubleArray) with 'sensitivities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity CombinedCurve.createParameterSensitivity(DoubleArray)"
  })
  void testCreateParameterSensitivityWithSensitivities() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("marketDataName")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    CurveName name = CurveName.of("Name");

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(name));
    DoubleArray sensitivities = DoubleArray.filled(2);

    // Act
    UnitParameterSensitivity actualCreateParameterSensitivityResult =
        ofResult.createParameterSensitivity(sensitivities);

    // Assert
    ImmutableList<ParameterMetadata> parameterMetadata =
        actualCreateParameterSensitivityResult.getParameterMetadata();
    assertEquals(2, parameterMetadata.size());
    ParameterMetadata getResult = parameterMetadata.get(0);
    assertTrue(getResult instanceof SimpleCurveParameterMetadata);
    ParameterMetadata getResult2 = parameterMetadata.get(1);
    assertTrue(getResult2 instanceof SimpleCurveParameterMetadata);
    assertEquals(0.0d, actualCreateParameterSensitivityResult.total());
    assertEquals(2, actualCreateParameterSensitivityResult.getParameterCount());
    Optional<List<ParameterSize>> parameterSplit =
        actualCreateParameterSensitivityResult.getParameterSplit();
    assertEquals(2, parameterSplit.get().size());
    assertTrue(parameterSplit.isPresent());
    assertEquals(sensitivities, actualCreateParameterSensitivityResult.getSensitivity());
    assertEquals(getResult, getResult2);
    assertSame(name, actualCreateParameterSensitivityResult.getMarketDataName());
  }

  /**
   * Test {@link CombinedCurve#split()}.
   *
   * <p>Method under test: {@link CombinedCurve#split()}
   */
  @Test
  @DisplayName("Test split()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList CombinedCurve.split()"})
  void testSplit() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    ConstantNodalCurve baseCurve =
        builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    ImmutableList<Curve> actualSplitResult = ofResult.split();

    // Assert
    assertEquals(2, actualSplitResult.size());
    Curve getResult = actualSplitResult.get(0);
    assertTrue(getResult instanceof ConstantNodalCurve);
    Curve getResult2 = actualSplitResult.get(1);
    assertTrue(getResult2 instanceof ConstantNodalCurve);
    CurveMetadata metadata2 = getResult.getMetadata();
    assertTrue(metadata2 instanceof DefaultCurveMetadata);
    assertEquals(1, getResult.getParameterCount());
    assertEquals(10.0d, ((ConstantNodalCurve) getResult).getXValue());
    assertEquals(10.0d, ((ConstantNodalCurve) getResult).getYValue());
    assertEquals(getResult, getResult2);
    assertSame(name, getResult.getName());
    assertSame(metadata, metadata2);
  }

  /**
   * Test {@link CombinedCurve#withUnderlyingCurve(int, Curve)}.
   *
   * <p>Method under test: {@link CombinedCurve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName("Test withUnderlyingCurve(int, Curve)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve curve = AddFixedCurve.of(fixedCurve, spreadCurve2);

    // Act
    CombinedCurve actualWithUnderlyingCurveResult = ofResult.withUnderlyingCurve(1, curve);

    // Assert
    assertTrue(actualWithUnderlyingCurveResult.getBaseCurve() instanceof ConstantNodalCurve);
    assertTrue(actualWithUnderlyingCurveResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(curve, actualWithUnderlyingCurveResult.getSpreadCurve());
  }

  /**
   * Test {@link CombinedCurve#withUnderlyingCurve(int, Curve)}.
   *
   * <p>Method under test: {@link CombinedCurve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName("Test withUnderlyingCurve(int, Curve)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve2() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve curve =
        CombinedCurve.of(
            baseCurve2, spreadCurve2, DefaultCurveMetadata.of(CurveName.of("baseCurve")));

    // Act
    CombinedCurve actualWithUnderlyingCurveResult = ofResult.withUnderlyingCurve(1, curve);

    // Assert
    assertTrue(actualWithUnderlyingCurveResult.getBaseCurve() instanceof ConstantNodalCurve);
    assertTrue(actualWithUnderlyingCurveResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(curve, actualWithUnderlyingCurveResult.getSpreadCurve());
  }

  /**
   * Test {@link CombinedCurve#withUnderlyingCurve(int, Curve)}.
   *
   * <p>Method under test: {@link CombinedCurve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName("Test withUnderlyingCurve(int, Curve)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve3() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve curve = AddFixedCurve.of(fixedCurve, spreadCurve2);

    // Act
    CombinedCurve actualWithUnderlyingCurveResult = ofResult.withUnderlyingCurve(0, curve);

    // Assert
    assertTrue(actualWithUnderlyingCurveResult.getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualWithUnderlyingCurveResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(curve, actualWithUnderlyingCurveResult.getBaseCurve());
  }

  /**
   * Test {@link CombinedCurve#withUnderlyingCurve(int, Curve)}.
   *
   * <p>Method under test: {@link CombinedCurve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName("Test withUnderlyingCurve(int, Curve)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve4() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve curve =
        CombinedCurve.of(
            baseCurve2, spreadCurve2, DefaultCurveMetadata.of(CurveName.of("baseCurve")));

    // Act
    CombinedCurve actualWithUnderlyingCurveResult = ofResult.withUnderlyingCurve(0, curve);

    // Assert
    assertTrue(actualWithUnderlyingCurveResult.getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualWithUnderlyingCurveResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(curve, actualWithUnderlyingCurveResult.getBaseCurve());
  }

  /**
   * Test {@link CombinedCurve#withUnderlyingCurve(int, Curve)}.
   *
   * <ul>
   *   <li>Then return BaseCurve is {@link TestingCurve#TestingCurve(double)} with value is ten.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName(
      "Test withUnderlyingCurve(int, Curve); then return BaseCurve is TestingCurve(double) with value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve_thenReturnBaseCurveIsTestingCurveWithValueIsTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));
    TestingCurve curve = new TestingCurve(10.0d);

    // Act
    CombinedCurve actualWithUnderlyingCurveResult = ofResult.withUnderlyingCurve(0, curve);

    // Assert
    assertTrue(actualWithUnderlyingCurveResult.getSpreadCurve() instanceof ConstantNodalCurve);
    assertTrue(actualWithUnderlyingCurveResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(curve, actualWithUnderlyingCurveResult.getBaseCurve());
  }

  /**
   * Test {@link CombinedCurve#withUnderlyingCurve(int, Curve)}.
   *
   * <ul>
   *   <li>Then return SpreadCurve is {@link TestingCurve#TestingCurve(double)} with value is ten.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName(
      "Test withUnderlyingCurve(int, Curve); then return SpreadCurve is TestingCurve(double) with value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve_thenReturnSpreadCurveIsTestingCurveWithValueIsTen() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));
    TestingCurve curve = new TestingCurve(10.0d);

    // Act
    CombinedCurve actualWithUnderlyingCurveResult = ofResult.withUnderlyingCurve(1, curve);

    // Assert
    assertTrue(actualWithUnderlyingCurveResult.getBaseCurve() instanceof ConstantNodalCurve);
    assertTrue(actualWithUnderlyingCurveResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(curve, actualWithUnderlyingCurveResult.getSpreadCurve());
  }

  /**
   * Test {@link CombinedCurve#withUnderlyingCurve(int, Curve)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName(
      "Test withUnderlyingCurve(int, Curve); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedCurve CombinedCurve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve curve = AddFixedCurve.of(fixedCurve, spreadCurve2);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.withUnderlyingCurve(-1, curve));
  }

  /**
   * Test {@link CombinedCurve#meta()}.
   *
   * <p>Method under test: {@link CombinedCurve#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CombinedCurve.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CombinedCurve.meta();

    // Assert
    MetaProperty<Curve> baseCurveResult = actualMetaResult.baseCurve();
    assertTrue(baseCurveResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = actualMetaResult.metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<Curve> spreadCurveResult = actualMetaResult.spreadCurve();
    assertTrue(spreadCurveResult instanceof DirectMetaProperty);
    assertEquals("baseCurve", baseCurveResult.name());
    assertEquals("metadata", metadataResult.name());
    assertEquals("spreadCurve", spreadCurveResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, baseCurveResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, metadataResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, spreadCurveResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CombinedCurve> expectedDeclaringTypeResult = CombinedCurve.class;
    assertEquals(expectedDeclaringTypeResult, baseCurveResult.declaringType());
    Class<CombinedCurve> expectedDeclaringTypeResult2 = CombinedCurve.class;
    assertEquals(expectedDeclaringTypeResult2, metadataResult.declaringType());
    Class<CombinedCurve> expectedDeclaringTypeResult3 = CombinedCurve.class;
    assertEquals(expectedDeclaringTypeResult3, spreadCurveResult.declaringType());
    Class<Curve> expectedPropertyTypeResult = Curve.class;
    assertEquals(expectedPropertyTypeResult, baseCurveResult.propertyType());
    Class<Curve> expectedPropertyTypeResult2 = Curve.class;
    assertEquals(expectedPropertyTypeResult2, spreadCurveResult.propertyType());
    Class<CurveMetadata> expectedPropertyTypeResult3 = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult3, metadataResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, baseCurveResult.metaBean());
    assertSame(meta, metadataResult.metaBean());
    assertSame(meta, spreadCurveResult.metaBean());
  }

  /**
   * Test {@link CombinedCurve#metaBean()}.
   *
   * <p>Method under test: {@link CombinedCurve#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CombinedCurve.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CombinedCurve#toString()}
   *   <li>{@link CombinedCurve#getBaseCurve()}
   *   <li>{@link CombinedCurve#getMetadata()}
   *   <li>{@link CombinedCurve#getSpreadCurve()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Curve CombinedCurve.getBaseCurve()",
    "CurveMetadata CombinedCurve.getMetadata()",
    "Curve CombinedCurve.getSpreadCurve()",
    "String CombinedCurve.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    CombinedCurve ofResult = CombinedCurve.of(baseCurve, spreadCurve, metadata);

    // Act
    String actualToStringResult = ofResult.toString();
    Curve actualBaseCurve = ofResult.getBaseCurve();
    CurveMetadata actualMetadata = ofResult.getMetadata();
    Curve actualSpreadCurve = ofResult.getSpreadCurve();

    // Assert
    assertTrue(actualBaseCurve instanceof ConstantNodalCurve);
    assertTrue(actualSpreadCurve instanceof ConstantNodalCurve);
    assertEquals(
        "CombinedCurve{baseCurve=ConstantNodalCurve{metadata=DefaultCurveMetadata{curveName=Name, xValueType=Unknown,"
            + " yValueType=Unknown, info={}, parameterMetadata=null}, xValue=10.0, yValue=10.0}, spreadCurve"
            + "=ConstantNodalCurve{metadata=DefaultCurveMetadata{curveName=Name, xValueType=Unknown, yValueType=Unknown,"
            + " info={}, parameterMetadata=null}, xValue=10.0, yValue=10.0}, metadata=DefaultCurveMetadata{curveName=Name,"
            + " xValueType=Unknown, yValueType=Unknown, info={}, parameterMetadata=null}}",
        actualToStringResult);
    assertEquals(actualBaseCurve, actualSpreadCurve);
    assertSame(metadata, actualMetadata);
  }

  /**
   * Test {@link CombinedCurve#equals(Object)}, and {@link CombinedCurve#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CombinedCurve#equals(Object)}
   *   <li>{@link CombinedCurve#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedCurve.equals(Object)", "int CombinedCurve.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult2 =
        CombinedCurve.of(baseCurve2, spreadCurve2, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CombinedCurve#equals(Object)}, and {@link CombinedCurve#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CombinedCurve#equals(Object)}
   *   <li>{@link CombinedCurve#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedCurve.equals(Object)", "int CombinedCurve.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CombinedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedCurve.equals(Object)", "int CombinedCurve.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name"))), 1);
  }

  /**
   * Test {@link CombinedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedCurve.equals(Object)", "int CombinedCurve.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(
        ofResult,
        CombinedCurve.of(baseCurve2, spreadCurve2, DefaultCurveMetadata.of(CurveName.of("Name"))));
  }

  /**
   * Test {@link CombinedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedCurve.equals(Object)", "int CombinedCurve.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(
        ofResult,
        CombinedCurve.of(baseCurve2, spreadCurve2, DefaultCurveMetadata.of(CurveName.of("Name"))));
  }

  /**
   * Test {@link CombinedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedCurve.equals(Object)", "int CombinedCurve.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    CombinedCurve ofResult =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("name")));

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(
        ofResult,
        CombinedCurve.of(baseCurve2, spreadCurve2, DefaultCurveMetadata.of(CurveName.of("Name"))));
  }

  /**
   * Test {@link CombinedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedCurve.equals(Object)", "int CombinedCurve.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name"))),
        null);
  }

  /**
   * Test {@link CombinedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedCurve.equals(Object)", "int CombinedCurve.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve baseCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name"))),
        "Different type to CombinedCurve");
  }
}
