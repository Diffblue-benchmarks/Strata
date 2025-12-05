package com.opengamma.strata.market.surface;

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
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
import com.opengamma.strata.market.param.UnitParameterSensitivity;
import com.opengamma.strata.market.surface.ConstantSurface.Meta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

class ConstantSurfaceDiffblueTest {
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
    Class<? extends ConstantSurface> actualBeanTypeResult = ConstantSurface.meta().beanType();

    // Assert
    Class<ConstantSurface> expectedBeanTypeResult = ConstantSurface.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#metadata()}
   *   <li>{@link Meta#zValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metadata()", "MetaProperty Meta.zValue()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ConstantSurface.meta();

    // Act
    MetaProperty<SurfaceMetadata> actualMetadataResult = metaResult.metadata();

    // Assert
    assertTrue(actualMetadataResult instanceof DirectMetaProperty);
    assertTrue(metaResult.zValue() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code metadata}.
   *   <li>Then metaBean zValue return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'metadata'; then metaBean zValue return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMetadata_thenMetaBeanZValueReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ConstantSurface.meta().metaPropertyGet("metadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> zValueResult = ((Meta) metaBeanResult).zValue();
    assertTrue(zValueResult instanceof DirectMetaProperty);
    assertEquals("double", zValueResult.propertyType().getName());
    assertEquals("metadata", actualMetaPropertyGetResult.name());
    assertEquals("zValue", zValueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, zValueResult.style());
    Class<ConstantSurface> expectedDeclaringTypeResult = ConstantSurface.class;
    assertEquals(expectedDeclaringTypeResult, zValueResult.declaringType());
    Class<SurfaceMetadata> expectedPropertyTypeResult = SurfaceMetadata.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).metadata());
    assertSame(Meta.INSTANCE, zValueResult.metaBean());
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
    assertNull(ConstantSurface.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code zValue}.
   *   <li>Then metaBean metadata return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'zValue'; then metaBean metadata return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenZValue_thenMetaBeanMetadataReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ConstantSurface.meta().metaPropertyGet("zValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("metadata", metadataResult.name());
    assertEquals("zValue", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, metadataResult.style());
    Class<ConstantSurface> expectedDeclaringTypeResult = ConstantSurface.class;
    assertEquals(expectedDeclaringTypeResult, metadataResult.declaringType());
    Class<SurfaceMetadata> expectedPropertyTypeResult = SurfaceMetadata.class;
    assertEquals(expectedPropertyTypeResult, metadataResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zValue());
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
        ConstantSurface.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("metadata");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("zValue");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("metadata", getResult.name());
    assertEquals("zValue", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<ConstantSurface> expectedDeclaringTypeResult = ConstantSurface.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ConstantSurface> expectedDeclaringTypeResult2 = ConstantSurface.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<SurfaceMetadata> expectedPropertyTypeResult = SurfaceMetadata.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultSurfaceMetadata} with name is {@link SurfaceName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then return DefaultSurfaceMetadata with name is SurfaceName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnDefaultSurfaceMetadataWithNameIsSurfaceName() {
    // Arrange
    Meta metaResult = ConstantSurface.meta();
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));

    // Act and Assert
    assertSame(
        metadata, metaResult.propertyGet(ConstantSurface.of(metadata, 10.0d), "metadata", true));
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
    assertNull(ConstantSurface.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = ConstantSurface.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d),
                "Property Name",
                false));
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
    Meta metaResult = ConstantSurface.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d),
                    "zValue",
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
        () -> ConstantSurface.meta().propertySet(mock(Bean.class), "metadata", "New Value", false));
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
        () -> ConstantSurface.meta().propertySet(mock(Bean.class), "metadata", "New Value", true));
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
            ConstantSurface.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> ConstantSurface.meta().propertySet(mock(Bean.class), "zValue", "New Value", true));
  }

  /**
   * Test {@link ConstantSurface#of(String, double)} with {@code String}, {@code double}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then Metadata return {@link DefaultSurfaceMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#of(String, double)}
   */
  @Test
  @DisplayName(
      "Test of(String, double) with 'String', 'double'; when 'Name'; then Metadata return DefaultSurfaceMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantSurface ConstantSurface.of(String, double)"})
  void testOfWithStringDouble_whenName_thenMetadataReturnDefaultSurfaceMetadata() {
    // Arrange and Act
    ConstantSurface actualOfResult = ConstantSurface.of("Name", 10.0d);

    // Assert
    SurfaceMetadata metadata = actualOfResult.getMetadata();
    assertTrue(metadata instanceof DefaultSurfaceMetadata);
    SurfaceName name = actualOfResult.getName();
    assertEquals("Name", name.getName());
    ValueType xValueType = metadata.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(10.0d, actualOfResult.getZValue());
    assertFalse(metadata.getParameterMetadata().isPresent());
    assertTrue(((DefaultSurfaceMetadata) metadata).getInfo().isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, name.getMarketDataType());
    assertSame(name, metadata.getSurfaceName());
    assertSame(xValueType, metadata.getYValueType());
    assertSame(xValueType, metadata.getZValueType());
  }

  /**
   * Test {@link ConstantSurface#of(SurfaceMetadata, double)} with {@code SurfaceMetadata}, {@code
   * double}.
   *
   * <ul>
   *   <li>Then return ParameterCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#of(SurfaceMetadata, double)}
   */
  @Test
  @DisplayName(
      "Test of(SurfaceMetadata, double) with 'SurfaceMetadata', 'double'; then return ParameterCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantSurface ConstantSurface.of(SurfaceMetadata, double)"})
  void testOfWithSurfaceMetadataDouble_thenReturnParameterCountIsOne() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(name);

    // Act
    ConstantSurface actualOfResult = ConstantSurface.of(metadata, 10.0d);

    // Assert
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(10.0d, actualOfResult.getZValue());
    assertSame(metadata, actualOfResult.getMetadata());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link ConstantSurface#of(SurfaceName, double)} with {@code SurfaceName}, {@code double}.
   *
   * <ul>
   *   <li>Then Metadata return {@link DefaultSurfaceMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#of(SurfaceName, double)}
   */
  @Test
  @DisplayName(
      "Test of(SurfaceName, double) with 'SurfaceName', 'double'; then Metadata return DefaultSurfaceMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantSurface ConstantSurface.of(SurfaceName, double)"})
  void testOfWithSurfaceNameDouble_thenMetadataReturnDefaultSurfaceMetadata() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    ConstantSurface actualOfResult = ConstantSurface.of(name, 10.0d);

    // Assert
    SurfaceMetadata metadata = actualOfResult.getMetadata();
    assertTrue(metadata instanceof DefaultSurfaceMetadata);
    ValueType xValueType = metadata.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(10.0d, actualOfResult.getZValue());
    assertFalse(metadata.getParameterMetadata().isPresent());
    assertTrue(((DefaultSurfaceMetadata) metadata).getInfo().isEmpty());
    assertSame(xValueType, metadata.getYValueType());
    assertSame(xValueType, metadata.getZValueType());
    assertSame(name, actualOfResult.getName());
    assertSame(name, metadata.getSurfaceName());
  }

  /**
   * Test {@link ConstantSurface#getParameter(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when zero; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantSurface.getParameter(int)"})
  void testGetParameter_whenZero_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d)
            .getParameter(0));
  }

  /**
   * Test {@link ConstantSurface#withParameter(int, double)}.
   *
   * <p>Method under test: {@link ConstantSurface#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantSurface ConstantSurface.withParameter(int, double)"})
  void testWithParameter() {
    // Arrange
    ConstantSurface ofResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d);

    // Act
    ConstantSurface actualWithParameterResult = ofResult.withParameter(0, 10.0d);

    // Assert
    assertEquals(ofResult, actualWithParameterResult);
  }

  /**
   * Test {@link ConstantSurface#withPerturbation(ParameterPerturbation)}.
   *
   * <p>Method under test: {@link ConstantSurface#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantSurface ConstantSurface.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation() {
    // Arrange
    ConstantSurface ofResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    ConstantSurface actualWithPerturbationResult = ofResult.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
    assertEquals(ofResult, actualWithPerturbationResult);
  }

  /**
   * Test {@link ConstantSurface#zValue(double, double)} with {@code x}, {@code y}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#zValue(double, double)}
   */
  @Test
  @DisplayName("Test zValue(double, double) with 'x', 'y'; when '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantSurface.zValue(double, double)"})
  void testZValueWithXY_when05() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d)
            .zValue(0.5d, 3.0d));
  }

  /**
   * Test {@link ConstantSurface#zValue(double, double)} with {@code x}, {@code y}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#zValue(double, double)}
   */
  @Test
  @DisplayName("Test zValue(double, double) with 'x', 'y'; when '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantSurface.zValue(double, double)"})
  void testZValueWithXY_when052() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d)
            .zValue(-0.5d, 3.0d));
  }

  /**
   * Test {@link ConstantSurface#zValue(double, double)} with {@code x}, {@code y}.
   *
   * <ul>
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#zValue(double, double)}
   */
  @Test
  @DisplayName("Test zValue(double, double) with 'x', 'y'; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantSurface.zValue(double, double)"})
  void testZValueWithXY_whenTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d)
            .zValue(10.0d, 3.0d));
  }

  /**
   * Test {@link ConstantSurface#zValue(double, double)} with {@code x}, {@code y}.
   *
   * <ul>
   *   <li>When two.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#zValue(double, double)}
   */
  @Test
  @DisplayName("Test zValue(double, double) with 'x', 'y'; when two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantSurface.zValue(double, double)"})
  void testZValueWithXY_whenTwo() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d)
            .zValue(2.0d, 3.0d));
  }

  /**
   * Test {@link ConstantSurface#zValueParameterSensitivity(double, double)} with {@code x}, {@code
   * y}.
   *
   * <ul>
   *   <li>Then return Sensitivity dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#zValueParameterSensitivity(double, double)}
   */
  @Test
  @DisplayName(
      "Test zValueParameterSensitivity(double, double) with 'x', 'y'; then return Sensitivity dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity ConstantSurface.zValueParameterSensitivity(double, double)"
  })
  void testZValueParameterSensitivityWithXY_thenReturnSensitivityDimensionsIsOne() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    UnitParameterSensitivity actualZValueParameterSensitivityResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(name), 10.0d)
            .zValueParameterSensitivity(2.0d, 3.0d);

    // Assert
    DoubleArray sensitivity = actualZValueParameterSensitivityResult.getSensitivity();
    assertEquals(1, sensitivity.dimensions());
    assertEquals(1, sensitivity.size());
    assertEquals(1, actualZValueParameterSensitivityResult.getParameterCount());
    assertEquals(1, actualZValueParameterSensitivityResult.getParameterMetadata().size());
    assertEquals(1, sensitivity.toList().size());
    assertEquals(1.0d, sensitivity.max());
    assertEquals(1.0d, sensitivity.min());
    assertEquals(1.0d, sensitivity.sum());
    assertEquals(1.0d, actualZValueParameterSensitivityResult.total());
    assertFalse(sensitivity.isEmpty());
    assertFalse(actualZValueParameterSensitivityResult.getParameterSplit().isPresent());
    assertSame(name, actualZValueParameterSensitivityResult.getMarketDataName());
    assertArrayEquals(new double[] {1.0d}, sensitivity.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ConstantSurface#firstPartialDerivatives(double, double)}.
   *
   * <ul>
   *   <li>Given {@link SurfaceName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#firstPartialDerivatives(double, double)}
   */
  @Test
  @DisplayName("Test firstPartialDerivatives(double, double); given SurfaceName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives ConstantSurface.firstPartialDerivatives(double, double)"})
  void testFirstPartialDerivatives_givenSurfaceNameWithName() {
    // Arrange and Act
    ValueDerivatives actualFirstPartialDerivativesResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d)
            .firstPartialDerivatives(2.0d, 3.0d);

    // Assert
    DoubleArray derivatives = actualFirstPartialDerivativesResult.getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1, derivatives.dimensions());
    assertEquals(10.0d, actualFirstPartialDerivativesResult.getValue());
    assertEquals(2, derivatives.size());
    assertFalse(derivatives.isEmpty());
    assertArrayEquals(new double[] {0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ConstantSurface#firstPartialDerivatives(double, double)}.
   *
   * <ul>
   *   <li>Given {@link SurfaceName} with name is {@code derivatives}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#firstPartialDerivatives(double, double)}
   */
  @Test
  @DisplayName(
      "Test firstPartialDerivatives(double, double); given SurfaceName with name is 'derivatives'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives ConstantSurface.firstPartialDerivatives(double, double)"})
  void testFirstPartialDerivatives_givenSurfaceNameWithNameIsDerivatives() {
    // Arrange and Act
    ValueDerivatives actualFirstPartialDerivativesResult =
        ConstantSurface.of(SurfaceName.of("derivatives"), 10.0d)
            .firstPartialDerivatives(2.0d, 3.0d);

    // Assert
    DoubleArray derivatives = actualFirstPartialDerivativesResult.getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1, derivatives.dimensions());
    assertEquals(10.0d, actualFirstPartialDerivativesResult.getValue());
    assertEquals(2, derivatives.size());
    assertFalse(derivatives.isEmpty());
    assertArrayEquals(new double[] {0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ConstantSurface#withMetadata(SurfaceMetadata)}.
   *
   * <p>Method under test: {@link ConstantSurface#withMetadata(SurfaceMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(SurfaceMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantSurface ConstantSurface.withMetadata(SurfaceMetadata)"})
  void testWithMetadata() {
    // Arrange
    ConstantSurface ofResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d);

    // Act
    ConstantSurface actualWithMetadataResult =
        ofResult.withMetadata(DefaultSurfaceMetadata.of(SurfaceName.of("Name")));

    // Assert
    assertEquals(ofResult, actualWithMetadataResult);
  }

  /**
   * Test {@link ConstantSurface#withMetadata(SurfaceMetadata)}.
   *
   * <ul>
   *   <li>Given of {@code Name}.
   *   <li>Then return Metadata Info size is two.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#withMetadata(SurfaceMetadata)}
   */
  @Test
  @DisplayName(
      "Test withMetadata(SurfaceMetadata); given of 'Name'; then return Metadata Info size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantSurface ConstantSurface.withMetadata(SurfaceMetadata)"})
  void testWithMetadata_givenOfName_thenReturnMetadataInfoSizeIsTwo() {
    // Arrange
    ConstantSurface ofResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d);

    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("Name");
    info.put(ofResult2, "Value");
    SurfaceInfoType<?> ofResult3 = SurfaceInfoType.of("surfaceName");
    info.put(ofResult3, "Value");
    SurfaceName surfaceName = SurfaceName.of("metadata");

    DefaultSurfaceMetadata metadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    ConstantSurface actualWithMetadataResult = ofResult.withMetadata(metadata);

    // Assert
    SurfaceMetadata metadata2 = actualWithMetadataResult.getMetadata();
    assertTrue(metadata2 instanceof DefaultSurfaceMetadata);
    ValueType xValueType = metadata2.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    SurfaceName name = actualWithMetadataResult.getName();
    assertEquals("metadata", name.getName());
    assertEquals(2, ((DefaultSurfaceMetadata) metadata2).getInfo().size());
    assertSame(xValueType, metadata2.getYValueType());
    assertSame(xValueType, metadata2.getZValueType());
    assertSame(surfaceName, name);
    assertSame(surfaceName, metadata2.getSurfaceName());
  }

  /**
   * Test {@link ConstantSurface#withMetadata(SurfaceMetadata)}.
   *
   * <ul>
   *   <li>Given of {@code surfaceName}.
   *   <li>Then return Metadata Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#withMetadata(SurfaceMetadata)}
   */
  @Test
  @DisplayName(
      "Test withMetadata(SurfaceMetadata); given of 'surfaceName'; then return Metadata Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantSurface ConstantSurface.withMetadata(SurfaceMetadata)"})
  void testWithMetadata_givenOfSurfaceName_thenReturnMetadataInfoSizeIsOne() {
    // Arrange
    ConstantSurface ofResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d);

    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("surfaceName");
    info.put(ofResult2, "Value");
    SurfaceName surfaceName = SurfaceName.of("metadata");

    DefaultSurfaceMetadata metadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    ConstantSurface actualWithMetadataResult = ofResult.withMetadata(metadata);

    // Assert
    SurfaceMetadata metadata2 = actualWithMetadataResult.getMetadata();
    assertTrue(metadata2 instanceof DefaultSurfaceMetadata);
    ValueType xValueType = metadata2.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    SurfaceName name = actualWithMetadataResult.getName();
    assertEquals("metadata", name.getName());
    assertEquals(1, ((DefaultSurfaceMetadata) metadata2).getInfo().size());
    assertSame(xValueType, metadata2.getYValueType());
    assertSame(xValueType, metadata2.getZValueType());
    assertSame(surfaceName, name);
    assertSame(surfaceName, metadata2.getSurfaceName());
  }

  /**
   * Test {@link ConstantSurface#withMetadata(SurfaceMetadata)}.
   *
   * <ul>
   *   <li>When {@link SurfaceName} with name is {@code metadata}.
   *   <li>Then return Metadata Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#withMetadata(SurfaceMetadata)}
   */
  @Test
  @DisplayName(
      "Test withMetadata(SurfaceMetadata); when SurfaceName with name is 'metadata'; then return Metadata Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantSurface ConstantSurface.withMetadata(SurfaceMetadata)"})
  void testWithMetadata_whenSurfaceNameWithNameIsMetadata_thenReturnMetadataInfoEmpty() {
    // Arrange
    ConstantSurface ofResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d);
    SurfaceName surfaceName = SurfaceName.of("metadata");
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();

    DefaultSurfaceMetadata metadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    ConstantSurface actualWithMetadataResult = ofResult.withMetadata(metadata);

    // Assert
    SurfaceMetadata metadata2 = actualWithMetadataResult.getMetadata();
    assertTrue(metadata2 instanceof DefaultSurfaceMetadata);
    ValueType xValueType = metadata2.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    SurfaceName name = actualWithMetadataResult.getName();
    assertEquals("metadata", name.getName());
    assertTrue(((DefaultSurfaceMetadata) metadata2).getInfo().isEmpty());
    assertSame(xValueType, metadata2.getYValueType());
    assertSame(xValueType, metadata2.getZValueType());
    assertSame(surfaceName, name);
    assertSame(surfaceName, metadata2.getSurfaceName());
  }

  /**
   * Test {@link ConstantSurface#meta()}.
   *
   * <p>Method under test: {@link ConstantSurface#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ConstantSurface.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ConstantSurface.meta();

    // Assert
    MetaProperty<SurfaceMetadata> metadataResult = actualMetaResult.metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<Double> zValueResult = actualMetaResult.zValue();
    assertTrue(zValueResult instanceof DirectMetaProperty);
    assertEquals("double", zValueResult.propertyType().getName());
    assertEquals("metadata", metadataResult.name());
    assertEquals("zValue", zValueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, metadataResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, zValueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ConstantSurface> expectedDeclaringTypeResult = ConstantSurface.class;
    assertEquals(expectedDeclaringTypeResult, metadataResult.declaringType());
    Class<ConstantSurface> expectedDeclaringTypeResult2 = ConstantSurface.class;
    assertEquals(expectedDeclaringTypeResult2, zValueResult.declaringType());
    Class<SurfaceMetadata> expectedPropertyTypeResult = SurfaceMetadata.class;
    assertEquals(expectedPropertyTypeResult, metadataResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metadataResult.metaBean());
    assertSame(meta, zValueResult.metaBean());
  }

  /**
   * Test {@link ConstantSurface#metaBean()}.
   *
   * <p>Method under test: {@link ConstantSurface#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ConstantSurface.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantSurface#toString()}
   *   <li>{@link ConstantSurface#getMetadata()}
   *   <li>{@link ConstantSurface#getParameterCount()}
   *   <li>{@link ConstantSurface#getZValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata ConstantSurface.getMetadata()",
    "int ConstantSurface.getParameterCount()",
    "double ConstantSurface.getZValue()",
    "String ConstantSurface.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    ConstantSurface ofResult = ConstantSurface.of(metadata, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    SurfaceMetadata actualMetadata = ofResult.getMetadata();
    int actualParameterCount = ofResult.getParameterCount();

    // Assert
    assertEquals(
        "ConstantSurface{metadata=DefaultSurfaceMetadata{surfaceName=Name, xValueType=Unknown, yValueType=Unknown,"
            + " zValueType=Unknown, info={}, parameterMetadata=null}, zValue=10.0}",
        actualToStringResult);
    assertEquals(1, actualParameterCount);
    assertEquals(10.0d, ofResult.getZValue());
    assertSame(metadata, actualMetadata);
  }

  /**
   * Test {@link ConstantSurface#equals(Object)}, and {@link ConstantSurface#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantSurface#equals(Object)}
   *   <li>{@link ConstantSurface#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantSurface.equals(Object)", "int ConstantSurface.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ConstantSurface ofResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d);
    ConstantSurface ofResult2 =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link ConstantSurface#equals(Object)}, and {@link ConstantSurface#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantSurface#equals(Object)}
   *   <li>{@link ConstantSurface#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantSurface.equals(Object)", "int ConstantSurface.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ConstantSurface ofResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link ConstantSurface#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantSurface.equals(Object)", "int ConstantSurface.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SurfaceName surfaceName = SurfaceName.of("Name");
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();

    DefaultSurfaceMetadata metadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    ConstantSurface ofResult = ConstantSurface.of(metadata, 10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult, ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d));
  }

  /**
   * Test {@link ConstantSurface#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantSurface.equals(Object)", "int ConstantSurface.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ConstantSurface ofResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 2.0d);

    // Act and Assert
    assertNotEquals(
        ofResult, ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d));
  }

  /**
   * Test {@link ConstantSurface#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantSurface.equals(Object)", "int ConstantSurface.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d), null);
  }

  /**
   * Test {@link ConstantSurface#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurface#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConstantSurface.equals(Object)", "int ConstantSurface.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d),
        "Different type to ConstantSurface");
  }
}
