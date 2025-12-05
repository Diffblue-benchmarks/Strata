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
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.AddFixedCurve.Meta;
import com.opengamma.strata.market.curve.ConstantNodalCurve.Builder;
import com.opengamma.strata.market.curve.CurveTest.TestingCurve;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
import com.opengamma.strata.market.param.UnitParameterSensitivity;
import java.util.Map;
import java.util.NoSuchElementException;
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

class AddFixedCurveDiffblueTest {
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
    Class<? extends AddFixedCurve> actualBeanTypeResult = AddFixedCurve.meta().beanType();

    // Assert
    Class<AddFixedCurve> expectedBeanTypeResult = AddFixedCurve.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#fixedCurve()}
   *   <li>{@link Meta#spreadCurve()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.fixedCurve()", "MetaProperty Meta.spreadCurve()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = AddFixedCurve.meta();

    // Act
    MetaProperty<Curve> actualFixedCurveResult = metaResult.fixedCurve();

    // Assert
    assertTrue(actualFixedCurveResult instanceof DirectMetaProperty);
    assertTrue(metaResult.spreadCurve() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean fixedCurve return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean fixedCurve return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanFixedCurveReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        AddFixedCurve.meta().metaPropertyGet("spreadCurve");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Curve> fixedCurveResult = ((Meta) metaBeanResult).fixedCurve();
    assertTrue(fixedCurveResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixedCurve", fixedCurveResult.name());
    assertEquals("spreadCurve", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, fixedCurveResult.style());
    Class<AddFixedCurve> expectedDeclaringTypeResult = AddFixedCurve.class;
    assertEquals(expectedDeclaringTypeResult, fixedCurveResult.declaringType());
    Class<Curve> expectedPropertyTypeResult = Curve.class;
    assertEquals(expectedPropertyTypeResult, fixedCurveResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).spreadCurve());
    assertSame(Meta.INSTANCE, fixedCurveResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean spreadCurve return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean spreadCurve return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanSpreadCurveReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        AddFixedCurve.meta().metaPropertyGet("fixedCurve");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Curve> spreadCurveResult = ((Meta) metaBeanResult).spreadCurve();
    assertTrue(spreadCurveResult instanceof DirectMetaProperty);
    assertEquals("fixedCurve", actualMetaPropertyGetResult.name());
    assertEquals("spreadCurve", spreadCurveResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, spreadCurveResult.style());
    Class<AddFixedCurve> expectedDeclaringTypeResult = AddFixedCurve.class;
    assertEquals(expectedDeclaringTypeResult, spreadCurveResult.declaringType());
    Class<Curve> expectedPropertyTypeResult = Curve.class;
    assertEquals(expectedPropertyTypeResult, spreadCurveResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixedCurve());
    assertSame(Meta.INSTANCE, spreadCurveResult.metaBean());
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
    assertNull(AddFixedCurve.meta().metaPropertyGet("Property Name"));
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
        AddFixedCurve.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("fixedCurve");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("spreadCurve");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("fixedCurve", getResult.name());
    assertEquals("spreadCurve", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<AddFixedCurve> expectedDeclaringTypeResult = AddFixedCurve.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<AddFixedCurve> expectedDeclaringTypeResult2 = AddFixedCurve.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<Curve> expectedPropertyTypeResult = Curve.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<Curve> expectedPropertyTypeResult2 = Curve.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
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
    assertNull(AddFixedCurve.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = AddFixedCurve.meta();

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

    AddFixedCurve bean = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixedCurve}.
   *   <li>Then return {@link ConstantNodalCurve}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'fixedCurve'; then return ConstantNodalCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFixedCurve_thenReturnConstantNodalCurve() {
    // Arrange
    Meta metaResult = AddFixedCurve.meta();

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

    AddFixedCurve bean = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "fixedCurve", true);

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
    Meta metaResult = AddFixedCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    ConstantNodalCurve fixedCurve =
        builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve bean = AddFixedCurve.of(fixedCurve, spreadCurve);

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
        () -> AddFixedCurve.meta().propertySet(mock(Bean.class), "fixedCurve", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixedCurve}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixedCurve'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixedCurve_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> AddFixedCurve.meta().propertySet(mock(Bean.class), "fixedCurve", "New Value", true));
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
            AddFixedCurve.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> AddFixedCurve.meta().propertySet(mock(Bean.class), "spreadCurve", "New Value", true));
  }

  /**
   * Test {@link AddFixedCurve#of(Curve, Curve)}.
   *
   * <ul>
   *   <li>Then FixedCurve return {@link ConstantNodalCurve}.
   * </ul>
   *
   * <p>Method under test: {@link AddFixedCurve#of(Curve, Curve)}
   */
  @Test
  @DisplayName("Test of(Curve, Curve); then FixedCurve return ConstantNodalCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.of(Curve, Curve)"})
  void testOf_thenFixedCurveReturnConstantNodalCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    ConstantNodalCurve fixedCurve =
        builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata2 = DefaultCurveMetadata.of(name);
    ConstantNodalCurve spreadCurve =
        builderResult2.metadata(metadata2).xValue(10.0d).yValue(10.0d).build();

    // Act
    AddFixedCurve actualOfResult = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Assert
    Curve fixedCurve2 = actualOfResult.getFixedCurve();
    assertTrue(fixedCurve2 instanceof ConstantNodalCurve);
    CurveMetadata metadata3 = actualOfResult.getMetadata();
    assertTrue(metadata3 instanceof DefaultCurveMetadata);
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(metadata, metadata3);
    assertSame(fixedCurve, fixedCurve2);
    assertSame(spreadCurve, actualOfResult.getSpreadCurve());
    assertSame(name, actualOfResult.getName());
    assertSame(metadata2, metadata3);
  }

  /**
   * Test {@link AddFixedCurve#getMetadata()}.
   *
   * <p>Method under test: {@link AddFixedCurve#getMetadata()}
   */
  @Test
  @DisplayName("Test getMetadata()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata AddFixedCurve.getMetadata()"})
  void testGetMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    ConstantNodalCurve spreadCurve =
        builderResult2.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    // Act and Assert
    assertSame(metadata, AddFixedCurve.of(fixedCurve, spreadCurve).getMetadata());
  }

  /**
   * Test {@link AddFixedCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link AddFixedCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata() {
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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    AddFixedCurve actualWithMetadataResult =
        ofResult.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(ofResult, actualWithMetadataResult);
  }

  /**
   * Test {@link AddFixedCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link AddFixedCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata2() {
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

    CombinedCurve fixedCurve =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve3);

    // Act
    AddFixedCurve actualWithMetadataResult =
        ofResult.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(ofResult, actualWithMetadataResult);
  }

  /**
   * Test {@link AddFixedCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link AddFixedCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata3() {
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

    CombinedCurve fixedCurve =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve2);

    // Act
    AddFixedCurve actualWithMetadataResult =
        ofResult.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(ofResult, actualWithMetadataResult);
  }

  /**
   * Test {@link AddFixedCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link AddFixedCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata4() {
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

    CombinedCurve fixedCurve =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve2);

    // Act
    AddFixedCurve actualWithMetadataResult =
        ofResult.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(ofResult, actualWithMetadataResult);
  }

  /**
   * Test {@link AddFixedCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link AddFixedCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata5() {
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

    CombinedCurve fixedCurve =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

    ParameterizedFunctionalCurve.Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    ParameterizedFunctionalCurve.Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve spreadCurve2 =
        metadataResult
            .parameters(DoubleArray.of(10.0d))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve2);

    // Act
    AddFixedCurve actualWithMetadataResult =
        ofResult.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(ofResult, actualWithMetadataResult);
  }

  /**
   * Test {@link AddFixedCurve#getParameterCount()}.
   *
   * <p>Method under test: {@link AddFixedCurve#getParameterCount()}
   */
  @Test
  @DisplayName("Test getParameterCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AddFixedCurve.getParameterCount()"})
  void testGetParameterCount() {
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

    // Act and Assert
    assertEquals(1, AddFixedCurve.of(fixedCurve, spreadCurve).getParameterCount());
  }

  /**
   * Test {@link AddFixedCurve#getParameter(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link AddFixedCurve#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when zero; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AddFixedCurve.getParameter(int)"})
  void testGetParameter_whenZero_thenReturnTen() {
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

    // Act and Assert
    assertEquals(10.0d, AddFixedCurve.of(fixedCurve, spreadCurve).getParameter(0));
  }

  /**
   * Test {@link AddFixedCurve#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link SimpleCurveParameterMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link AddFixedCurve#getParameterMetadata(int)}
   */
  @Test
  @DisplayName(
      "Test getParameterMetadata(int); when zero; then return SimpleCurveParameterMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata AddFixedCurve.getParameterMetadata(int)"})
  void testGetParameterMetadata_whenZero_thenReturnSimpleCurveParameterMetadata() {
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

    // Act
    ParameterMetadata actualParameterMetadata =
        AddFixedCurve.of(fixedCurve, spreadCurve).getParameterMetadata(0);

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
   * Test {@link AddFixedCurve#withParameter(int, double)}.
   *
   * <p>Method under test: {@link AddFixedCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withParameter(int, double)"})
  void testWithParameter() {
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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    AddFixedCurve actualWithParameterResult = ofResult.withParameter(0, 10.0d);

    // Assert
    assertEquals(ofResult, actualWithParameterResult);
  }

  /**
   * Test {@link AddFixedCurve#withParameter(int, double)}.
   *
   * <p>Method under test: {@link AddFixedCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withParameter(int, double)"})
  void testWithParameter2() {
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

    CombinedCurve fixedCurve =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));

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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve3);

    // Act
    AddFixedCurve actualWithParameterResult = ofResult.withParameter(0, 10.0d);

    // Assert
    assertEquals(ofResult, actualWithParameterResult);
  }

  /**
   * Test {@link AddFixedCurve#withParameter(int, double)}.
   *
   * <p>Method under test: {@link AddFixedCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withParameter(int, double)"})
  void testWithParameter3() {
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

    CombinedCurve fixedCurve =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));
    AddFixedCurve ofResult =
        AddFixedCurve.of(
            fixedCurve, ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d));

    // Act
    AddFixedCurve actualWithParameterResult = ofResult.withParameter(0, 10.0d);

    // Assert
    assertEquals(ofResult, actualWithParameterResult);
  }

  /**
   * Test {@link AddFixedCurve#withParameter(int, double)}.
   *
   * <ul>
   *   <li>Then FixedCurve return {@link CombinedCurve}.
   * </ul>
   *
   * <p>Method under test: {@link AddFixedCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double); then FixedCurve return CombinedCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withParameter(int, double)"})
  void testWithParameter_thenFixedCurveReturnCombinedCurve() {
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

    CombinedCurve fixedCurve =
        CombinedCurve.of(baseCurve, spreadCurve, DefaultCurveMetadata.of(CurveName.of("Name")));
    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, new TestingCurve(10.0d));

    // Act
    AddFixedCurve actualWithParameterResult = ofResult.withParameter(1, 10.0d);

    // Assert
    Curve fixedCurve2 = actualWithParameterResult.getFixedCurve();
    assertTrue(fixedCurve2 instanceof CombinedCurve);
    assertTrue(((CombinedCurve) fixedCurve2).getSpreadCurve() instanceof ConstantNodalCurve);
    Curve spreadCurve2 = actualWithParameterResult.getSpreadCurve();
    assertTrue(spreadCurve2 instanceof TestingCurve);
    CurveMetadata metadata = actualWithParameterResult.getMetadata();
    assertTrue(metadata instanceof DefaultCurveMetadata);
    CurveMetadata metadata2 = spreadCurve2.getMetadata();
    assertTrue(metadata2 instanceof DefaultCurveMetadata);
    CurveName name = actualWithParameterResult.getName();
    assertEquals("Curve", name.getName());
    assertEquals(1, spreadCurve2.getParameterCount());
    assertEquals(metadata, metadata2);
    assertSame(name, spreadCurve2.getName());
    assertSame(name, metadata.getCurveName());
  }

  /**
   * Test {@link AddFixedCurve#withPerturbation(ParameterPerturbation)}.
   *
   * <p>Method under test: {@link AddFixedCurve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation() {
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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    AddFixedCurve actualWithPerturbationResult = ofResult.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
    assertEquals(ofResult, actualWithPerturbationResult);
  }

  /**
   * Test {@link AddFixedCurve#yValue(double)}.
   *
   * <p>Method under test: {@link AddFixedCurve#yValue(double)}
   */
  @Test
  @DisplayName("Test yValue(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AddFixedCurve.yValue(double)"})
  void testYValue() {
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

    // Act and Assert
    assertEquals(20.0d, AddFixedCurve.of(fixedCurve, spreadCurve).yValue(2.0d));
  }

  /**
   * Test {@link AddFixedCurve#yValueParameterSensitivity(double)}.
   *
   * <p>Method under test: {@link AddFixedCurve#yValueParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test yValueParameterSensitivity(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivity AddFixedCurve.yValueParameterSensitivity(double)"})
  void testYValueParameterSensitivity() {
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
    ConstantNodalCurve spreadCurve =
        builderResult2.metadata(DefaultCurveMetadata.of(name)).xValue(10.0d).yValue(10.0d).build();

    // Act
    UnitParameterSensitivity actualYValueParameterSensitivityResult =
        AddFixedCurve.of(fixedCurve, spreadCurve).yValueParameterSensitivity(2.0d);

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
   * Test {@link AddFixedCurve#firstDerivative(double)}.
   *
   * <p>Method under test: {@link AddFixedCurve#firstDerivative(double)}
   */
  @Test
  @DisplayName("Test firstDerivative(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AddFixedCurve.firstDerivative(double)"})
  void testFirstDerivative() {
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

    // Act and Assert
    assertEquals(0.0d, AddFixedCurve.of(fixedCurve, spreadCurve).firstDerivative(2.0d));
  }

  /**
   * Test {@link AddFixedCurve#split()}.
   *
   * <p>Method under test: {@link AddFixedCurve#split()}
   */
  @Test
  @DisplayName("Test split()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList AddFixedCurve.split()"})
  void testSplit() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    ConstantNodalCurve fixedCurve =
        builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    ImmutableList<Curve> actualSplitResult = AddFixedCurve.of(fixedCurve, spreadCurve).split();

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
   * Test {@link AddFixedCurve#withUnderlyingCurve(int, Curve)}.
   *
   * <p>Method under test: {@link AddFixedCurve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName("Test withUnderlyingCurve(int, Curve)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve() {
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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

    Builder builderResult3 = ConstantNodalCurve.builder();

    // Act
    AddFixedCurve actualWithUnderlyingCurveResult =
        ofResult.withUnderlyingCurve(
            0,
            builderResult3
                .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
                .xValue(10.0d)
                .yValue(10.0d)
                .build());

    // Assert
    assertEquals(ofResult, actualWithUnderlyingCurveResult);
  }

  /**
   * Test {@link AddFixedCurve#withUnderlyingCurve(int, Curve)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link AddFixedCurve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName(
      "Test withUnderlyingCurve(int, Curve); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve_whenMinusOne_thenThrowIllegalArgumentException() {
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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

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

    AddFixedCurve curve = AddFixedCurve.of(fixedCurve2, spreadCurve2);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.withUnderlyingCurve(-1, curve));
  }

  /**
   * Test {@link AddFixedCurve#withUnderlyingCurve(int, Curve)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then FixedCurve return {@link ConstantNodalCurve}.
   * </ul>
   *
   * <p>Method under test: {@link AddFixedCurve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName(
      "Test withUnderlyingCurve(int, Curve); when one; then FixedCurve return ConstantNodalCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AddFixedCurve AddFixedCurve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve_whenOne_thenFixedCurveReturnConstantNodalCurve() {
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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

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

    AddFixedCurve curve = AddFixedCurve.of(fixedCurve2, spreadCurve2);

    // Act
    AddFixedCurve actualWithUnderlyingCurveResult = ofResult.withUnderlyingCurve(1, curve);

    // Assert
    assertTrue(actualWithUnderlyingCurveResult.getFixedCurve() instanceof ConstantNodalCurve);
    assertTrue(actualWithUnderlyingCurveResult.getMetadata() instanceof DefaultCurveMetadata);
    assertSame(curve, actualWithUnderlyingCurveResult.getSpreadCurve());
  }

  /**
   * Test {@link AddFixedCurve#meta()}.
   *
   * <p>Method under test: {@link AddFixedCurve#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta AddFixedCurve.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = AddFixedCurve.meta();

    // Assert
    MetaProperty<Curve> fixedCurveResult = actualMetaResult.fixedCurve();
    assertTrue(fixedCurveResult instanceof DirectMetaProperty);
    MetaProperty<Curve> spreadCurveResult = actualMetaResult.spreadCurve();
    assertTrue(spreadCurveResult instanceof DirectMetaProperty);
    assertEquals("fixedCurve", fixedCurveResult.name());
    assertEquals("spreadCurve", spreadCurveResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, fixedCurveResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, spreadCurveResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<AddFixedCurve> expectedDeclaringTypeResult = AddFixedCurve.class;
    assertEquals(expectedDeclaringTypeResult, fixedCurveResult.declaringType());
    Class<AddFixedCurve> expectedDeclaringTypeResult2 = AddFixedCurve.class;
    assertEquals(expectedDeclaringTypeResult2, spreadCurveResult.declaringType());
    Class<Curve> expectedPropertyTypeResult = Curve.class;
    assertEquals(expectedPropertyTypeResult, fixedCurveResult.propertyType());
    Class<Curve> expectedPropertyTypeResult2 = Curve.class;
    assertEquals(expectedPropertyTypeResult2, spreadCurveResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, fixedCurveResult.metaBean());
    assertSame(meta, spreadCurveResult.metaBean());
  }

  /**
   * Test {@link AddFixedCurve#metaBean()}.
   *
   * <p>Method under test: {@link AddFixedCurve#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta AddFixedCurve.metaBean()"})
  void testMetaBean() {
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

    // Act and Assert
    assertSame(Meta.INSTANCE, AddFixedCurve.of(fixedCurve, spreadCurve).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AddFixedCurve#toString()}
   *   <li>{@link AddFixedCurve#getFixedCurve()}
   *   <li>{@link AddFixedCurve#getSpreadCurve()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Curve AddFixedCurve.getFixedCurve()",
    "Curve AddFixedCurve.getSpreadCurve()",
    "String AddFixedCurve.toString()"
  })
  void testGettersAndSetters() {
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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act
    String actualToStringResult = ofResult.toString();
    Curve actualFixedCurve = ofResult.getFixedCurve();
    Curve actualSpreadCurve = ofResult.getSpreadCurve();

    // Assert
    assertTrue(actualFixedCurve instanceof ConstantNodalCurve);
    assertTrue(actualSpreadCurve instanceof ConstantNodalCurve);
    assertEquals(
        "AddFixedCurve{fixedCurve=ConstantNodalCurve{metadata=DefaultCurveMetadata{curveName=Name, xValueType=Unknown,"
            + " yValueType=Unknown, info={}, parameterMetadata=null}, xValue=10.0, yValue=10.0}, spreadCurve"
            + "=ConstantNodalCurve{metadata=DefaultCurveMetadata{curveName=Name, xValueType=Unknown, yValueType=Unknown,"
            + " info={}, parameterMetadata=null}, xValue=10.0, yValue=10.0}}",
        actualToStringResult);
    assertEquals(actualFixedCurve, actualSpreadCurve);
  }

  /**
   * Test {@link AddFixedCurve#equals(Object)}, and {@link AddFixedCurve#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AddFixedCurve#equals(Object)}
   *   <li>{@link AddFixedCurve#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AddFixedCurve.equals(Object)", "int AddFixedCurve.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

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

    AddFixedCurve ofResult2 = AddFixedCurve.of(fixedCurve2, spreadCurve2);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link AddFixedCurve#equals(Object)}, and {@link AddFixedCurve#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AddFixedCurve#equals(Object)}
   *   <li>{@link AddFixedCurve#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AddFixedCurve.equals(Object)", "int AddFixedCurve.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link AddFixedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AddFixedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AddFixedCurve.equals(Object)", "int AddFixedCurve.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
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

    // Act and Assert
    assertNotEquals(AddFixedCurve.of(fixedCurve, spreadCurve), 1);
  }

  /**
   * Test {@link AddFixedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AddFixedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AddFixedCurve.equals(Object)", "int AddFixedCurve.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
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

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

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

    AddFixedCurve ofResult2 = AddFixedCurve.of(fixedCurve2, spreadCurve2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link AddFixedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AddFixedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AddFixedCurve.equals(Object)", "int AddFixedCurve.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
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
            .metadata(DefaultCurveMetadata.of(CurveName.of("name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

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

    AddFixedCurve ofResult2 = AddFixedCurve.of(fixedCurve2, spreadCurve2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link AddFixedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AddFixedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AddFixedCurve.equals(Object)", "int AddFixedCurve.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
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

    // Act and Assert
    assertNotEquals(AddFixedCurve.of(fixedCurve, spreadCurve), null);
  }

  /**
   * Test {@link AddFixedCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AddFixedCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AddFixedCurve.equals(Object)", "int AddFixedCurve.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
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

    // Act and Assert
    assertNotEquals(AddFixedCurve.of(fixedCurve, spreadCurve), "Different type to AddFixedCurve");
  }
}
