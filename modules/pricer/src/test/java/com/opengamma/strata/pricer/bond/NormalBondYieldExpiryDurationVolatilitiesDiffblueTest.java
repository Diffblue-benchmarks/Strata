package com.opengamma.strata.pricer.bond;

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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.surface.Surface;
import com.opengamma.strata.market.surface.SurfaceInfoType;
import com.opengamma.strata.market.surface.SurfaceMetadata;
import com.opengamma.strata.pricer.bond.NormalBondYieldExpiryDurationVolatilities.Meta;
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

class NormalBondYieldExpiryDurationVolatilitiesDiffblueTest {
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
    Class<? extends NormalBondYieldExpiryDurationVolatilities> actualBeanTypeResult =
        NormalBondYieldExpiryDurationVolatilities.meta().beanType();

    // Assert
    Class<NormalBondYieldExpiryDurationVolatilities> expectedBeanTypeResult =
        NormalBondYieldExpiryDurationVolatilities.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#surface()}
   *   <li>{@link Meta#valuationDateTime()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.surface()",
    "MetaProperty Meta.valuationDateTime()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = NormalBondYieldExpiryDurationVolatilities.meta();

    // Act
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<Surface> actualSurfaceResult = metaResult.surface();

    // Assert
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualSurfaceResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDateTime() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return name is {@code currency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'currency'; then return name is 'currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrency_thenReturnNameIsCurrency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalBondYieldExpiryDurationVolatilities.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Surface> surfaceResult = ((Meta) metaBeanResult).surface();
    assertTrue(surfaceResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult =
        ((Meta) metaBeanResult).valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
    assertSame(metaBeanResult, surfaceResult.metaBean());
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
    assertNull(NormalBondYieldExpiryDurationVolatilities.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code surface}.
   *   <li>Then return name is {@code surface}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'surface'; then return name is 'surface'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSurface_thenReturnNameIsSurface() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalBondYieldExpiryDurationVolatilities.meta().metaPropertyGet("surface");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult =
        ((Meta) metaBeanResult).valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("surface", actualMetaPropertyGetResult.name());
    Class<Surface> expectedPropertyTypeResult = Surface.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).surface());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, valuationDateTimeResult.metaBean());
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
        NormalBondYieldExpiryDurationVolatilities.meta().metaPropertyGet("valuationDateTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Surface> surfaceResult = ((Meta) metaBeanResult).surface();
    assertTrue(surfaceResult instanceof DirectMetaProperty);
    assertEquals("valuationDateTime", actualMetaPropertyGetResult.name());
    Class<ZonedDateTime> expectedPropertyTypeResult = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDateTime());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, surfaceResult.metaBean());
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
        NormalBondYieldExpiryDurationVolatilities.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("currency");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("surface");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("valuationDateTime");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("currency", getResult.name());
    assertEquals("surface", getResult2.name());
    assertEquals("valuationDateTime", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<Surface> expectedPropertyTypeResult2 = Surface.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<NormalBondYieldExpiryDurationVolatilities> expectedDeclaringTypeResult =
        NormalBondYieldExpiryDurationVolatilities.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<NormalBondYieldExpiryDurationVolatilities> expectedDeclaringTypeResult2 =
        NormalBondYieldExpiryDurationVolatilities.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<NormalBondYieldExpiryDurationVolatilities> expectedDeclaringTypeResult3 =
        NormalBondYieldExpiryDurationVolatilities.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
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
        NormalBondYieldExpiryDurationVolatilities.meta()
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
            NormalBondYieldExpiryDurationVolatilities.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            NormalBondYieldExpiryDurationVolatilities.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", true));
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
            NormalBondYieldExpiryDurationVolatilities.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", false));
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
            NormalBondYieldExpiryDurationVolatilities.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code surface}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'surface'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSurface_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            NormalBondYieldExpiryDurationVolatilities.meta()
                .propertySet(mock(Bean.class), "surface", "New Value", true));
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
            NormalBondYieldExpiryDurationVolatilities.meta()
                .propertySet(mock(Bean.class), "valuationDateTime", "New Value", true));
  }

  /**
   * Test {@link NormalBondYieldExpiryDurationVolatilities#of(Currency, ZonedDateTime, Surface)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link NormalBondYieldExpiryDurationVolatilities#of(Currency,
   * ZonedDateTime, Surface)}
   */
  @Test
  @DisplayName("Test of(Currency, ZonedDateTime, Surface); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NormalBondYieldExpiryDurationVolatilities NormalBondYieldExpiryDurationVolatilities.of(Currency, ZonedDateTime, Surface)"
  })
  void testOf_givenIllegalArgumentException() {
    // Arrange
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    Surface surface = mock(Surface.class);
    when(surface.getMetadata()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NormalBondYieldExpiryDurationVolatilities.of(null, valuationDateTime, surface));
    verify(surface).getMetadata();
  }

  /**
   * Test {@link NormalBondYieldExpiryDurationVolatilities#of(Currency, ZonedDateTime, Surface)}.
   *
   * <ul>
   *   <li>Given {@link SurfaceMetadata} {@link SurfaceMetadata#findInfo(SurfaceInfoType)} return
   *       empty.
   *   <li>Then calls {@link SurfaceMetadata#findInfo(SurfaceInfoType)}.
   * </ul>
   *
   * <p>Method under test: {@link NormalBondYieldExpiryDurationVolatilities#of(Currency,
   * ZonedDateTime, Surface)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, ZonedDateTime, Surface); given SurfaceMetadata findInfo(SurfaceInfoType) return empty; then calls findInfo(SurfaceInfoType)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NormalBondYieldExpiryDurationVolatilities NormalBondYieldExpiryDurationVolatilities.of(Currency, ZonedDateTime, Surface)"
  })
  void testOf_givenSurfaceMetadataFindInfoReturnEmpty_thenCallsFindInfo() {
    // Arrange
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    SurfaceMetadata surfaceMetadata = mock(SurfaceMetadata.class);
    Optional<Object> emptyResult = Optional.empty();
    when(surfaceMetadata.findInfo(Mockito.<SurfaceInfoType<Object>>any())).thenReturn(emptyResult);
    when(surfaceMetadata.getZValueType()).thenReturn(ValueType.of("NormalVolatility"));
    when(surfaceMetadata.getYValueType()).thenReturn(ValueType.of("YearFraction"));
    when(surfaceMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Surface surface = mock(Surface.class);
    when(surface.getMetadata()).thenReturn(surfaceMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NormalBondYieldExpiryDurationVolatilities.of(null, valuationDateTime, surface));
    verify(surface, atLeast(1)).getMetadata();
    verify(surfaceMetadata).findInfo(isA(SurfaceInfoType.class));
    verify(surfaceMetadata).getXValueType();
    verify(surfaceMetadata).getYValueType();
    verify(surfaceMetadata).getZValueType();
  }

  /**
   * Test {@link NormalBondYieldExpiryDurationVolatilities#of(Currency, ZonedDateTime, Surface)}.
   *
   * <ul>
   *   <li>Given {@link SurfaceMetadata} {@link SurfaceMetadata#findInfo(SurfaceInfoType)} throw
   *       {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link NormalBondYieldExpiryDurationVolatilities#of(Currency,
   * ZonedDateTime, Surface)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, ZonedDateTime, Surface); given SurfaceMetadata findInfo(SurfaceInfoType) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NormalBondYieldExpiryDurationVolatilities NormalBondYieldExpiryDurationVolatilities.of(Currency, ZonedDateTime, Surface)"
  })
  void testOf_givenSurfaceMetadataFindInfoThrowIllegalArgumentException() {
    // Arrange
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    SurfaceMetadata surfaceMetadata = mock(SurfaceMetadata.class);
    when(surfaceMetadata.findInfo(Mockito.<SurfaceInfoType<Object>>any()))
        .thenThrow(new IllegalArgumentException());
    when(surfaceMetadata.getZValueType()).thenReturn(ValueType.of("NormalVolatility"));
    when(surfaceMetadata.getYValueType()).thenReturn(ValueType.of("YearFraction"));
    when(surfaceMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Surface surface = mock(Surface.class);
    when(surface.getMetadata()).thenReturn(surfaceMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NormalBondYieldExpiryDurationVolatilities.of(null, valuationDateTime, surface));
    verify(surface, atLeast(1)).getMetadata();
    verify(surfaceMetadata).findInfo(isA(SurfaceInfoType.class));
    verify(surfaceMetadata).getXValueType();
    verify(surfaceMetadata).getYValueType();
    verify(surfaceMetadata).getZValueType();
  }

  /**
   * Test {@link NormalBondYieldExpiryDurationVolatilities#of(Currency, ZonedDateTime, Surface)}.
   *
   * <ul>
   *   <li>Given {@link SurfaceMetadata} {@link SurfaceMetadata#getYValueType()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link NormalBondYieldExpiryDurationVolatilities#of(Currency,
   * ZonedDateTime, Surface)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, ZonedDateTime, Surface); given SurfaceMetadata getYValueType() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NormalBondYieldExpiryDurationVolatilities NormalBondYieldExpiryDurationVolatilities.of(Currency, ZonedDateTime, Surface)"
  })
  void testOf_givenSurfaceMetadataGetYValueTypeThrowIllegalArgumentException() {
    // Arrange
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    SurfaceMetadata surfaceMetadata = mock(SurfaceMetadata.class);
    when(surfaceMetadata.getYValueType()).thenThrow(new IllegalArgumentException());
    when(surfaceMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Surface surface = mock(Surface.class);
    when(surface.getMetadata()).thenReturn(surfaceMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NormalBondYieldExpiryDurationVolatilities.of(null, valuationDateTime, surface));
    verify(surface, atLeast(1)).getMetadata();
    verify(surfaceMetadata).getXValueType();
    verify(surfaceMetadata).getYValueType();
  }

  /**
   * Test {@link NormalBondYieldExpiryDurationVolatilities#of(Currency, ZonedDateTime, Surface)}.
   *
   * <ul>
   *   <li>Given {@link SurfaceMetadata} {@link SurfaceMetadata#getZValueType()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link NormalBondYieldExpiryDurationVolatilities#of(Currency,
   * ZonedDateTime, Surface)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, ZonedDateTime, Surface); given SurfaceMetadata getZValueType() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NormalBondYieldExpiryDurationVolatilities NormalBondYieldExpiryDurationVolatilities.of(Currency, ZonedDateTime, Surface)"
  })
  void testOf_givenSurfaceMetadataGetZValueTypeThrowIllegalArgumentException() {
    // Arrange
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    SurfaceMetadata surfaceMetadata = mock(SurfaceMetadata.class);
    when(surfaceMetadata.getZValueType()).thenThrow(new IllegalArgumentException());
    when(surfaceMetadata.getYValueType()).thenReturn(ValueType.of("YearFraction"));
    when(surfaceMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Surface surface = mock(Surface.class);
    when(surface.getMetadata()).thenReturn(surfaceMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NormalBondYieldExpiryDurationVolatilities.of(null, valuationDateTime, surface));
    verify(surface, atLeast(1)).getMetadata();
    verify(surfaceMetadata).getXValueType();
    verify(surfaceMetadata).getYValueType();
    verify(surfaceMetadata).getZValueType();
  }

  /**
   * Test {@link NormalBondYieldExpiryDurationVolatilities#meta()}.
   *
   * <p>Method under test: {@link NormalBondYieldExpiryDurationVolatilities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta NormalBondYieldExpiryDurationVolatilities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = NormalBondYieldExpiryDurationVolatilities.meta();

    // Assert
    MetaProperty<Currency> currencyResult = actualMetaResult.currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<Surface> surfaceResult = actualMetaResult.surface();
    assertTrue(surfaceResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult = actualMetaResult.valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("currency", currencyResult.name());
    assertEquals("surface", surfaceResult.name());
    assertEquals("valuationDateTime", valuationDateTimeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, currencyResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, surfaceResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valuationDateTimeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, currencyResult.propertyType());
    Class<Surface> expectedPropertyTypeResult2 = Surface.class;
    assertEquals(expectedPropertyTypeResult2, surfaceResult.propertyType());
    Class<NormalBondYieldExpiryDurationVolatilities> expectedDeclaringTypeResult =
        NormalBondYieldExpiryDurationVolatilities.class;
    assertEquals(expectedDeclaringTypeResult, currencyResult.declaringType());
    Class<NormalBondYieldExpiryDurationVolatilities> expectedDeclaringTypeResult2 =
        NormalBondYieldExpiryDurationVolatilities.class;
    assertEquals(expectedDeclaringTypeResult2, surfaceResult.declaringType());
    Class<NormalBondYieldExpiryDurationVolatilities> expectedDeclaringTypeResult3 =
        NormalBondYieldExpiryDurationVolatilities.class;
    assertEquals(expectedDeclaringTypeResult3, valuationDateTimeResult.declaringType());
    Class<ZonedDateTime> expectedPropertyTypeResult3 = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult3, valuationDateTimeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, currencyResult.metaBean());
    assertSame(meta, surfaceResult.metaBean());
    assertSame(meta, valuationDateTimeResult.metaBean());
  }
}
