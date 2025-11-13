package com.opengamma.strata.pricer.capfloor;

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
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.Curve;
import com.opengamma.strata.market.curve.CurveInfoType;
import com.opengamma.strata.market.curve.CurveMetadata;
import com.opengamma.strata.pricer.capfloor.BlackIborCapletFloorletExpiryFlatVolatilities.Meta;
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

class BlackIborCapletFloorletExpiryFlatVolatilitiesDiffblueTest {
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
    Class<? extends BlackIborCapletFloorletExpiryFlatVolatilities> actualBeanTypeResult =
        BlackIborCapletFloorletExpiryFlatVolatilities.meta().beanType();

    // Assert
    Class<BlackIborCapletFloorletExpiryFlatVolatilities> expectedBeanTypeResult =
        BlackIborCapletFloorletExpiryFlatVolatilities.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#curve()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#valuationDateTime()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.curve()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.valuationDateTime()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = BlackIborCapletFloorletExpiryFlatVolatilities.meta();

    // Act
    MetaProperty<Curve> actualCurveResult = metaResult.curve();
    MetaProperty<IborIndex> actualIndexResult = metaResult.index();

    // Assert
    assertTrue(actualCurveResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDateTime() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code curve}.
   *   <li>Then return name is {@code curve}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'curve'; then return name is 'curve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurve_thenReturnNameIsCurve() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BlackIborCapletFloorletExpiryFlatVolatilities.meta().metaPropertyGet("curve");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult =
        ((Meta) metaBeanResult).valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("curve", actualMetaPropertyGetResult.name());
    Class<Curve> expectedPropertyTypeResult = Curve.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).curve());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, valuationDateTimeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return name is {@code index}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'index'; then return name is 'index'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndex_thenReturnNameIsIndex() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BlackIborCapletFloorletExpiryFlatVolatilities.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Curve> curveResult = ((Meta) metaBeanResult).curve();
    assertTrue(curveResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult =
        ((Meta) metaBeanResult).valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<IborIndex> expectedPropertyTypeResult = IborIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
    assertSame(metaBeanResult, curveResult.metaBean());
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
    assertNull(
        BlackIborCapletFloorletExpiryFlatVolatilities.meta().metaPropertyGet("Property Name"));
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
        BlackIborCapletFloorletExpiryFlatVolatilities.meta().metaPropertyGet("valuationDateTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Curve> curveResult = ((Meta) metaBeanResult).curve();
    assertTrue(curveResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("valuationDateTime", actualMetaPropertyGetResult.name());
    Class<ZonedDateTime> expectedPropertyTypeResult = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDateTime());
    assertSame(metaBeanResult, curveResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
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
        BlackIborCapletFloorletExpiryFlatVolatilities.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("index");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("curve");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("valuationDateTime");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("curve", getResult2.name());
    assertEquals("index", getResult.name());
    assertEquals("valuationDateTime", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<IborIndex> expectedPropertyTypeResult = IborIndex.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<Curve> expectedPropertyTypeResult2 = Curve.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<BlackIborCapletFloorletExpiryFlatVolatilities> expectedDeclaringTypeResult =
        BlackIborCapletFloorletExpiryFlatVolatilities.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<BlackIborCapletFloorletExpiryFlatVolatilities> expectedDeclaringTypeResult2 =
        BlackIborCapletFloorletExpiryFlatVolatilities.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<BlackIborCapletFloorletExpiryFlatVolatilities> expectedDeclaringTypeResult3 =
        BlackIborCapletFloorletExpiryFlatVolatilities.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<ZonedDateTime> expectedPropertyTypeResult3 = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
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
        BlackIborCapletFloorletExpiryFlatVolatilities.meta()
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
            BlackIborCapletFloorletExpiryFlatVolatilities.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code curve}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'curve'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurve_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BlackIborCapletFloorletExpiryFlatVolatilities.meta()
                .propertySet(mock(Bean.class), "curve", "New Value", true));
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
            BlackIborCapletFloorletExpiryFlatVolatilities.meta()
                .propertySet(mock(Bean.class), "curve", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'index'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndex_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BlackIborCapletFloorletExpiryFlatVolatilities.meta()
                .propertySet(mock(Bean.class), "index", "New Value", true));
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
            BlackIborCapletFloorletExpiryFlatVolatilities.meta()
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
            BlackIborCapletFloorletExpiryFlatVolatilities.meta()
                .propertySet(mock(Bean.class), "valuationDateTime", "New Value", true));
  }

  /**
   * Test {@link BlackIborCapletFloorletExpiryFlatVolatilities#of(IborIndex, ZonedDateTime, Curve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#findInfo(CurveInfoType)} return empty.
   *   <li>Then calls {@link CurveMetadata#findInfo(CurveInfoType)}.
   * </ul>
   *
   * <p>Method under test: {@link BlackIborCapletFloorletExpiryFlatVolatilities#of(IborIndex,
   * ZonedDateTime, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, ZonedDateTime, Curve); given CurveMetadata findInfo(CurveInfoType) return empty; then calls findInfo(CurveInfoType)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BlackIborCapletFloorletExpiryFlatVolatilities BlackIborCapletFloorletExpiryFlatVolatilities.of(IborIndex, ZonedDateTime, Curve)"
  })
  void testOf_givenCurveMetadataFindInfoReturnEmpty_thenCallsFindInfo() {
    // Arrange
    IborIndex index = mock(IborIndex.class);
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    Optional<Object> emptyResult = Optional.empty();
    when(curveMetadata.findInfo(Mockito.<CurveInfoType<Object>>any())).thenReturn(emptyResult);
    when(curveMetadata.getYValueType()).thenReturn(ValueType.of("BlackVolatility"));
    when(curveMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> BlackIborCapletFloorletExpiryFlatVolatilities.of(index, valuationDateTime, curve));
    verify(curve, atLeast(1)).getMetadata();
    verify(curveMetadata).findInfo(isA(CurveInfoType.class));
    verify(curveMetadata).getXValueType();
    verify(curveMetadata).getYValueType();
  }

  /**
   * Test {@link BlackIborCapletFloorletExpiryFlatVolatilities#of(IborIndex, ZonedDateTime, Curve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#findInfo(CurveInfoType)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then calls {@link CurveMetadata#findInfo(CurveInfoType)}.
   * </ul>
   *
   * <p>Method under test: {@link BlackIborCapletFloorletExpiryFlatVolatilities#of(IborIndex,
   * ZonedDateTime, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, ZonedDateTime, Curve); given CurveMetadata findInfo(CurveInfoType) throw IllegalArgumentException(); then calls findInfo(CurveInfoType)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BlackIborCapletFloorletExpiryFlatVolatilities BlackIborCapletFloorletExpiryFlatVolatilities.of(IborIndex, ZonedDateTime, Curve)"
  })
  void testOf_givenCurveMetadataFindInfoThrowIllegalArgumentException_thenCallsFindInfo() {
    // Arrange
    IborIndex index = mock(IborIndex.class);
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.findInfo(Mockito.<CurveInfoType<Object>>any()))
        .thenThrow(new IllegalArgumentException());
    when(curveMetadata.getYValueType()).thenReturn(ValueType.of("BlackVolatility"));
    when(curveMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> BlackIborCapletFloorletExpiryFlatVolatilities.of(index, valuationDateTime, curve));
    verify(curve, atLeast(1)).getMetadata();
    verify(curveMetadata).findInfo(isA(CurveInfoType.class));
    verify(curveMetadata).getXValueType();
    verify(curveMetadata).getYValueType();
  }

  /**
   * Test {@link BlackIborCapletFloorletExpiryFlatVolatilities#of(IborIndex, ZonedDateTime, Curve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#getYValueType()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link BlackIborCapletFloorletExpiryFlatVolatilities#of(IborIndex,
   * ZonedDateTime, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, ZonedDateTime, Curve); given CurveMetadata getYValueType() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BlackIborCapletFloorletExpiryFlatVolatilities BlackIborCapletFloorletExpiryFlatVolatilities.of(IborIndex, ZonedDateTime, Curve)"
  })
  void testOf_givenCurveMetadataGetYValueTypeThrowIllegalArgumentException() {
    // Arrange
    IborIndex index = mock(IborIndex.class);
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.getYValueType()).thenThrow(new IllegalArgumentException());
    when(curveMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> BlackIborCapletFloorletExpiryFlatVolatilities.of(index, valuationDateTime, curve));
    verify(curve, atLeast(1)).getMetadata();
    verify(curveMetadata).getXValueType();
    verify(curveMetadata).getYValueType();
  }

  /**
   * Test {@link BlackIborCapletFloorletExpiryFlatVolatilities#of(IborIndex, ZonedDateTime, Curve)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link BlackIborCapletFloorletExpiryFlatVolatilities#of(IborIndex,
   * ZonedDateTime, Curve)}
   */
  @Test
  @DisplayName("Test of(IborIndex, ZonedDateTime, Curve); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BlackIborCapletFloorletExpiryFlatVolatilities BlackIborCapletFloorletExpiryFlatVolatilities.of(IborIndex, ZonedDateTime, Curve)"
  })
  void testOf_givenIllegalArgumentException() {
    // Arrange
    IborIndex index = mock(IborIndex.class);
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> BlackIborCapletFloorletExpiryFlatVolatilities.of(index, valuationDateTime, curve));
    verify(curve).getMetadata();
  }

  /**
   * Test {@link BlackIborCapletFloorletExpiryFlatVolatilities#meta()}.
   *
   * <p>Method under test: {@link BlackIborCapletFloorletExpiryFlatVolatilities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta BlackIborCapletFloorletExpiryFlatVolatilities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = BlackIborCapletFloorletExpiryFlatVolatilities.meta();

    // Assert
    MetaProperty<Curve> curveResult = actualMetaResult.curve();
    assertTrue(curveResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexResult = actualMetaResult.index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult = actualMetaResult.valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("curve", curveResult.name());
    assertEquals("index", indexResult.name());
    assertEquals("valuationDateTime", valuationDateTimeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, curveResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, indexResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valuationDateTimeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<IborIndex> expectedPropertyTypeResult = IborIndex.class;
    assertEquals(expectedPropertyTypeResult, indexResult.propertyType());
    Class<Curve> expectedPropertyTypeResult2 = Curve.class;
    assertEquals(expectedPropertyTypeResult2, curveResult.propertyType());
    Class<BlackIborCapletFloorletExpiryFlatVolatilities> expectedDeclaringTypeResult =
        BlackIborCapletFloorletExpiryFlatVolatilities.class;
    assertEquals(expectedDeclaringTypeResult, curveResult.declaringType());
    Class<BlackIborCapletFloorletExpiryFlatVolatilities> expectedDeclaringTypeResult2 =
        BlackIborCapletFloorletExpiryFlatVolatilities.class;
    assertEquals(expectedDeclaringTypeResult2, indexResult.declaringType());
    Class<BlackIborCapletFloorletExpiryFlatVolatilities> expectedDeclaringTypeResult3 =
        BlackIborCapletFloorletExpiryFlatVolatilities.class;
    assertEquals(expectedDeclaringTypeResult3, valuationDateTimeResult.declaringType());
    Class<ZonedDateTime> expectedPropertyTypeResult3 = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult3, valuationDateTimeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, curveResult.metaBean());
    assertSame(meta, indexResult.metaBean());
    assertSame(meta, valuationDateTimeResult.metaBean());
  }
}
