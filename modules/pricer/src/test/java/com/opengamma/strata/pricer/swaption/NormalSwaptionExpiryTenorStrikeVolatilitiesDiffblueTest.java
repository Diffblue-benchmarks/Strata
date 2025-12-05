package com.opengamma.strata.pricer.swaption;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.cube.Cube;
import com.opengamma.strata.market.cube.CubeInfoType;
import com.opengamma.strata.market.cube.CubeMetadata;
import com.opengamma.strata.pricer.swaption.NormalSwaptionExpiryTenorStrikeVolatilities.Meta;
import com.opengamma.strata.product.swap.type.FixedFloatSwapConvention;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NormalSwaptionExpiryTenorStrikeVolatilitiesDiffblueTest {
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
    Class<? extends NormalSwaptionExpiryTenorStrikeVolatilities> actualBeanTypeResult =
        NormalSwaptionExpiryTenorStrikeVolatilities.meta().beanType();

    // Assert
    Class<NormalSwaptionExpiryTenorStrikeVolatilities> expectedBeanTypeResult =
        NormalSwaptionExpiryTenorStrikeVolatilities.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#convention()}
   *   <li>{@link Meta#cube()}
   *   <li>{@link Meta#valuationDateTime()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.convention()",
    "MetaProperty Meta.cube()",
    "MetaProperty Meta.valuationDateTime()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = NormalSwaptionExpiryTenorStrikeVolatilities.meta();

    // Act
    MetaProperty<FixedFloatSwapConvention> actualConventionResult = metaResult.convention();
    MetaProperty<Cube> actualCubeResult = metaResult.cube();

    // Assert
    assertTrue(actualConventionResult instanceof DirectMetaProperty);
    assertTrue(actualCubeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDateTime() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then return name is {@code convention}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'convention'; then return name is 'convention'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenConvention_thenReturnNameIsConvention() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalSwaptionExpiryTenorStrikeVolatilities.meta().metaPropertyGet("convention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Cube> cubeResult = ((Meta) metaBeanResult).cube();
    assertTrue(cubeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult =
        ((Meta) metaBeanResult).valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("convention", actualMetaPropertyGetResult.name());
    Class<FixedFloatSwapConvention> expectedPropertyTypeResult = FixedFloatSwapConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).convention());
    assertSame(metaBeanResult, cubeResult.metaBean());
    assertSame(metaBeanResult, valuationDateTimeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code cube}.
   *   <li>Then return name is {@code cube}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'cube'; then return name is 'cube'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCube_thenReturnNameIsCube() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalSwaptionExpiryTenorStrikeVolatilities.meta().metaPropertyGet("cube");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FixedFloatSwapConvention> conventionResult = ((Meta) metaBeanResult).convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult =
        ((Meta) metaBeanResult).valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("cube", actualMetaPropertyGetResult.name());
    Class<Cube> expectedPropertyTypeResult = Cube.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).cube());
    assertSame(metaBeanResult, conventionResult.metaBean());
    assertSame(metaBeanResult, valuationDateTimeResult.metaBean());
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
    assertNull(NormalSwaptionExpiryTenorStrikeVolatilities.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valuationDateTime}.
   *   <li>Then return name is {@code valuationDateTime}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valuationDateTime'; then return name is 'valuationDateTime'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValuationDateTime_thenReturnNameIsValuationDateTime() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalSwaptionExpiryTenorStrikeVolatilities.meta().metaPropertyGet("valuationDateTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FixedFloatSwapConvention> conventionResult = ((Meta) metaBeanResult).convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    MetaProperty<Cube> cubeResult = ((Meta) metaBeanResult).cube();
    assertTrue(cubeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("valuationDateTime", actualMetaPropertyGetResult.name());
    Class<ZonedDateTime> expectedPropertyTypeResult = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDateTime());
    assertSame(metaBeanResult, conventionResult.metaBean());
    assertSame(metaBeanResult, cubeResult.metaBean());
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
        NormalSwaptionExpiryTenorStrikeVolatilities.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("convention");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("cube");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("valuationDateTime");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("convention", getResult.name());
    assertEquals("cube", getResult2.name());
    assertEquals("valuationDateTime", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<Cube> expectedPropertyTypeResult = Cube.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<NormalSwaptionExpiryTenorStrikeVolatilities> expectedDeclaringTypeResult =
        NormalSwaptionExpiryTenorStrikeVolatilities.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<NormalSwaptionExpiryTenorStrikeVolatilities> expectedDeclaringTypeResult2 =
        NormalSwaptionExpiryTenorStrikeVolatilities.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<NormalSwaptionExpiryTenorStrikeVolatilities> expectedDeclaringTypeResult3 =
        NormalSwaptionExpiryTenorStrikeVolatilities.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<FixedFloatSwapConvention> expectedPropertyTypeResult2 = FixedFloatSwapConvention.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<ZonedDateTime> expectedPropertyTypeResult3 = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
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
        NormalSwaptionExpiryTenorStrikeVolatilities.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
        () ->
            NormalSwaptionExpiryTenorStrikeVolatilities.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'convention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenConvention_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            NormalSwaptionExpiryTenorStrikeVolatilities.meta()
                .propertySet(mock(Bean.class), "convention", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code cube}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'cube'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCube_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            NormalSwaptionExpiryTenorStrikeVolatilities.meta()
                .propertySet(mock(Bean.class), "cube", "New Value", true));
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
            NormalSwaptionExpiryTenorStrikeVolatilities.meta()
                .propertySet(mock(Bean.class), "convention", "New Value", false));
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
            NormalSwaptionExpiryTenorStrikeVolatilities.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valuationDateTime}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valuationDateTime'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValuationDateTime_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            NormalSwaptionExpiryTenorStrikeVolatilities.meta()
                .propertySet(mock(Bean.class), "valuationDateTime", "New Value", true));
  }

  /**
   * Test {@link NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention,
   * ZonedDateTime, Cube)}.
   *
   * <ul>
   *   <li>Given {@link CubeMetadata} {@link CubeMetadata#findInfo(CubeInfoType)} return empty.
   *   <li>Then calls {@link CubeMetadata#findInfo(CubeInfoType)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention, ZonedDateTime, Cube)}
   */
  @Test
  @DisplayName(
      "Test of(FixedFloatSwapConvention, ZonedDateTime, Cube); given CubeMetadata findInfo(CubeInfoType) return empty; then calls findInfo(CubeInfoType)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NormalSwaptionExpiryTenorStrikeVolatilities NormalSwaptionExpiryTenorStrikeVolatilities.of(FixedFloatSwapConvention, ZonedDateTime, Cube)"
  })
  void testOf_givenCubeMetadataFindInfoReturnEmpty_thenCallsFindInfo() {
    // Arrange
    FixedFloatSwapConvention convention = mock(FixedFloatSwapConvention.class);
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    CubeMetadata cubeMetadata = mock(CubeMetadata.class);
    Optional<Object> emptyResult = Optional.empty();
    when(cubeMetadata.findInfo(Mockito.<CubeInfoType<Object>>any())).thenReturn(emptyResult);
    when(cubeMetadata.getWValueType()).thenReturn(ValueType.of("NormalVolatility"));
    when(cubeMetadata.getZValueType()).thenReturn(ValueType.of("Strike"));
    when(cubeMetadata.getYValueType()).thenReturn(ValueType.of("YearFraction"));
    when(cubeMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Cube cube = mock(Cube.class);
    when(cube.getMetadata()).thenReturn(cubeMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NormalSwaptionExpiryTenorStrikeVolatilities.of(convention, valuationDateTime, cube));
    verify(cube, atLeast(1)).getMetadata();
    verify(cubeMetadata).findInfo(isA(CubeInfoType.class));
    verify(cubeMetadata).getWValueType();
    verify(cubeMetadata).getXValueType();
    verify(cubeMetadata).getYValueType();
    verify(cubeMetadata).getZValueType();
  }

  /**
   * Test {@link NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention,
   * ZonedDateTime, Cube)}.
   *
   * <ul>
   *   <li>Given {@link CubeMetadata} {@link CubeMetadata#findInfo(CubeInfoType)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then calls {@link CubeMetadata#findInfo(CubeInfoType)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention, ZonedDateTime, Cube)}
   */
  @Test
  @DisplayName(
      "Test of(FixedFloatSwapConvention, ZonedDateTime, Cube); given CubeMetadata findInfo(CubeInfoType) throw IllegalArgumentException(); then calls findInfo(CubeInfoType)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NormalSwaptionExpiryTenorStrikeVolatilities NormalSwaptionExpiryTenorStrikeVolatilities.of(FixedFloatSwapConvention, ZonedDateTime, Cube)"
  })
  void testOf_givenCubeMetadataFindInfoThrowIllegalArgumentException_thenCallsFindInfo() {
    // Arrange
    FixedFloatSwapConvention convention = mock(FixedFloatSwapConvention.class);
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    CubeMetadata cubeMetadata = mock(CubeMetadata.class);
    when(cubeMetadata.findInfo(Mockito.<CubeInfoType<Object>>any()))
        .thenThrow(new IllegalArgumentException());
    when(cubeMetadata.getWValueType()).thenReturn(ValueType.of("NormalVolatility"));
    when(cubeMetadata.getZValueType()).thenReturn(ValueType.of("Strike"));
    when(cubeMetadata.getYValueType()).thenReturn(ValueType.of("YearFraction"));
    when(cubeMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Cube cube = mock(Cube.class);
    when(cube.getMetadata()).thenReturn(cubeMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NormalSwaptionExpiryTenorStrikeVolatilities.of(convention, valuationDateTime, cube));
    verify(cube, atLeast(1)).getMetadata();
    verify(cubeMetadata).findInfo(isA(CubeInfoType.class));
    verify(cubeMetadata).getWValueType();
    verify(cubeMetadata).getXValueType();
    verify(cubeMetadata).getYValueType();
    verify(cubeMetadata).getZValueType();
  }

  /**
   * Test {@link NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention,
   * ZonedDateTime, Cube)}.
   *
   * <ul>
   *   <li>Given {@link CubeMetadata} {@link CubeMetadata#getWValueType()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention, ZonedDateTime, Cube)}
   */
  @Test
  @DisplayName(
      "Test of(FixedFloatSwapConvention, ZonedDateTime, Cube); given CubeMetadata getWValueType() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NormalSwaptionExpiryTenorStrikeVolatilities NormalSwaptionExpiryTenorStrikeVolatilities.of(FixedFloatSwapConvention, ZonedDateTime, Cube)"
  })
  void testOf_givenCubeMetadataGetWValueTypeThrowIllegalArgumentException() {
    // Arrange
    FixedFloatSwapConvention convention = mock(FixedFloatSwapConvention.class);
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    CubeMetadata cubeMetadata = mock(CubeMetadata.class);
    when(cubeMetadata.getWValueType()).thenThrow(new IllegalArgumentException());
    when(cubeMetadata.getZValueType()).thenReturn(ValueType.of("Strike"));
    when(cubeMetadata.getYValueType()).thenReturn(ValueType.of("YearFraction"));
    when(cubeMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Cube cube = mock(Cube.class);
    when(cube.getMetadata()).thenReturn(cubeMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NormalSwaptionExpiryTenorStrikeVolatilities.of(convention, valuationDateTime, cube));
    verify(cube, atLeast(1)).getMetadata();
    verify(cubeMetadata).getWValueType();
    verify(cubeMetadata).getXValueType();
    verify(cubeMetadata).getYValueType();
    verify(cubeMetadata).getZValueType();
  }

  /**
   * Test {@link NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention,
   * ZonedDateTime, Cube)}.
   *
   * <ul>
   *   <li>Given {@link CubeMetadata} {@link CubeMetadata#getYValueType()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention, ZonedDateTime, Cube)}
   */
  @Test
  @DisplayName(
      "Test of(FixedFloatSwapConvention, ZonedDateTime, Cube); given CubeMetadata getYValueType() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NormalSwaptionExpiryTenorStrikeVolatilities NormalSwaptionExpiryTenorStrikeVolatilities.of(FixedFloatSwapConvention, ZonedDateTime, Cube)"
  })
  void testOf_givenCubeMetadataGetYValueTypeThrowIllegalArgumentException() {
    // Arrange
    FixedFloatSwapConvention convention = mock(FixedFloatSwapConvention.class);
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    CubeMetadata cubeMetadata = mock(CubeMetadata.class);
    when(cubeMetadata.getYValueType()).thenThrow(new IllegalArgumentException());
    when(cubeMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Cube cube = mock(Cube.class);
    when(cube.getMetadata()).thenReturn(cubeMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NormalSwaptionExpiryTenorStrikeVolatilities.of(convention, valuationDateTime, cube));
    verify(cube, atLeast(1)).getMetadata();
    verify(cubeMetadata).getXValueType();
    verify(cubeMetadata).getYValueType();
  }

  /**
   * Test {@link NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention,
   * ZonedDateTime, Cube)}.
   *
   * <ul>
   *   <li>Given {@link CubeMetadata} {@link CubeMetadata#getZValueType()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention, ZonedDateTime, Cube)}
   */
  @Test
  @DisplayName(
      "Test of(FixedFloatSwapConvention, ZonedDateTime, Cube); given CubeMetadata getZValueType() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NormalSwaptionExpiryTenorStrikeVolatilities NormalSwaptionExpiryTenorStrikeVolatilities.of(FixedFloatSwapConvention, ZonedDateTime, Cube)"
  })
  void testOf_givenCubeMetadataGetZValueTypeThrowIllegalArgumentException() {
    // Arrange
    FixedFloatSwapConvention convention = mock(FixedFloatSwapConvention.class);
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    CubeMetadata cubeMetadata = mock(CubeMetadata.class);
    when(cubeMetadata.getZValueType()).thenThrow(new IllegalArgumentException());
    when(cubeMetadata.getYValueType()).thenReturn(ValueType.of("YearFraction"));
    when(cubeMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Cube cube = mock(Cube.class);
    when(cube.getMetadata()).thenReturn(cubeMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NormalSwaptionExpiryTenorStrikeVolatilities.of(convention, valuationDateTime, cube));
    verify(cube, atLeast(1)).getMetadata();
    verify(cubeMetadata).getXValueType();
    verify(cubeMetadata).getYValueType();
    verify(cubeMetadata).getZValueType();
  }

  /**
   * Test {@link NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention,
   * ZonedDateTime, Cube)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalSwaptionExpiryTenorStrikeVolatilities#of(FixedFloatSwapConvention, ZonedDateTime, Cube)}
   */
  @Test
  @DisplayName(
      "Test of(FixedFloatSwapConvention, ZonedDateTime, Cube); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NormalSwaptionExpiryTenorStrikeVolatilities NormalSwaptionExpiryTenorStrikeVolatilities.of(FixedFloatSwapConvention, ZonedDateTime, Cube)"
  })
  void testOf_givenIllegalArgumentException() {
    // Arrange
    FixedFloatSwapConvention convention = mock(FixedFloatSwapConvention.class);
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    Cube cube = mock(Cube.class);
    when(cube.getMetadata()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NormalSwaptionExpiryTenorStrikeVolatilities.of(convention, valuationDateTime, cube));
    verify(cube).getMetadata();
  }

  /**
   * Test {@link NormalSwaptionExpiryTenorStrikeVolatilities#meta()}.
   *
   * <p>Method under test: {@link NormalSwaptionExpiryTenorStrikeVolatilities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta NormalSwaptionExpiryTenorStrikeVolatilities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = NormalSwaptionExpiryTenorStrikeVolatilities.meta();

    // Assert
    MetaProperty<FixedFloatSwapConvention> conventionResult = actualMetaResult.convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    MetaProperty<Cube> cubeResult = actualMetaResult.cube();
    assertTrue(cubeResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult = actualMetaResult.valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("convention", conventionResult.name());
    assertEquals("cube", cubeResult.name());
    assertEquals("valuationDateTime", valuationDateTimeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, conventionResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, cubeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valuationDateTimeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Cube> expectedPropertyTypeResult = Cube.class;
    assertEquals(expectedPropertyTypeResult, cubeResult.propertyType());
    Class<NormalSwaptionExpiryTenorStrikeVolatilities> expectedDeclaringTypeResult =
        NormalSwaptionExpiryTenorStrikeVolatilities.class;
    assertEquals(expectedDeclaringTypeResult, conventionResult.declaringType());
    Class<NormalSwaptionExpiryTenorStrikeVolatilities> expectedDeclaringTypeResult2 =
        NormalSwaptionExpiryTenorStrikeVolatilities.class;
    assertEquals(expectedDeclaringTypeResult2, cubeResult.declaringType());
    Class<NormalSwaptionExpiryTenorStrikeVolatilities> expectedDeclaringTypeResult3 =
        NormalSwaptionExpiryTenorStrikeVolatilities.class;
    assertEquals(expectedDeclaringTypeResult3, valuationDateTimeResult.declaringType());
    Class<FixedFloatSwapConvention> expectedPropertyTypeResult2 = FixedFloatSwapConvention.class;
    assertEquals(expectedPropertyTypeResult2, conventionResult.propertyType());
    Class<ZonedDateTime> expectedPropertyTypeResult3 = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult3, valuationDateTimeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, conventionResult.metaBean());
    assertSame(meta, cubeResult.metaBean());
    assertSame(meta, valuationDateTimeResult.metaBean());
  }
}
