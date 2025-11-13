package com.opengamma.strata.pricer.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.pricer.model.HullWhiteOneFactorPiecewiseConstantParametersProvider.Meta;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
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

class HullWhiteOneFactorPiecewiseConstantParametersProviderDiffblueTest {
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
    Class<? extends HullWhiteOneFactorPiecewiseConstantParametersProvider> actualBeanTypeResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.meta().beanType();

    // Assert
    Class<HullWhiteOneFactorPiecewiseConstantParametersProvider> expectedBeanTypeResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#parameters()}
   *   <li>{@link Meta#valuationDateTime()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.parameters()",
    "MetaProperty Meta.valuationDateTime()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = HullWhiteOneFactorPiecewiseConstantParametersProvider.meta();

    // Act
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<HullWhiteOneFactorPiecewiseConstantParameters> actualParametersResult =
        metaResult.parameters();

    // Assert
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualParametersResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDateTime() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return name is {@code dayCount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'dayCount'; then return name is 'dayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDayCount_thenReturnNameIsDayCount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<HullWhiteOneFactorPiecewiseConstantParameters> parametersResult =
        ((Meta) metaBeanResult).parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult =
        ((Meta) metaBeanResult).valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
    assertSame(metaBeanResult, parametersResult.metaBean());
    assertSame(metaBeanResult, valuationDateTimeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then return name is {@code parameters}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'parameters'; then return name is 'parameters'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenParameters_thenReturnNameIsParameters() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.meta().metaPropertyGet("parameters");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult =
        ((Meta) metaBeanResult).valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("parameters", actualMetaPropertyGetResult.name());
    Class<HullWhiteOneFactorPiecewiseConstantParameters> expectedPropertyTypeResult =
        HullWhiteOneFactorPiecewiseConstantParameters.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).parameters());
    assertSame(metaBeanResult, dayCountResult.metaBean());
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
        HullWhiteOneFactorPiecewiseConstantParametersProvider.meta()
            .metaPropertyGet("Property Name"));
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
        HullWhiteOneFactorPiecewiseConstantParametersProvider.meta()
            .metaPropertyGet("valuationDateTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<HullWhiteOneFactorPiecewiseConstantParameters> parametersResult =
        ((Meta) metaBeanResult).parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    assertEquals("valuationDateTime", actualMetaPropertyGetResult.name());
    Class<ZonedDateTime> expectedPropertyTypeResult = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDateTime());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, parametersResult.metaBean());
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
        HullWhiteOneFactorPiecewiseConstantParametersProvider.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("parameters");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("dayCount");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("valuationDateTime");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("dayCount", getResult2.name());
    assertEquals("parameters", getResult.name());
    assertEquals("valuationDateTime", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<HullWhiteOneFactorPiecewiseConstantParameters> expectedPropertyTypeResult2 =
        HullWhiteOneFactorPiecewiseConstantParameters.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<HullWhiteOneFactorPiecewiseConstantParametersProvider> expectedDeclaringTypeResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<HullWhiteOneFactorPiecewiseConstantParametersProvider> expectedDeclaringTypeResult2 =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<HullWhiteOneFactorPiecewiseConstantParametersProvider> expectedDeclaringTypeResult3 =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<ZonedDateTime> expectedPropertyTypeResult3 = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult3.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDayCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            HullWhiteOneFactorPiecewiseConstantParametersProvider.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", true));
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
            HullWhiteOneFactorPiecewiseConstantParametersProvider.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'parameters'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenParameters_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            HullWhiteOneFactorPiecewiseConstantParametersProvider.meta()
                .propertySet(mock(Bean.class), "parameters", "New Value", true));
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
            HullWhiteOneFactorPiecewiseConstantParametersProvider.meta()
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
            HullWhiteOneFactorPiecewiseConstantParametersProvider.meta()
                .propertySet(mock(Bean.class), "valuationDateTime", "New Value", true));
  }

  /**
   * Test {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#of(HullWhiteOneFactorPiecewiseConstantParameters,
   * DayCount, ZonedDateTime)} with {@code parameters}, {@code dayCount}, {@code valuationDateTime}.
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#of(HullWhiteOneFactorPiecewiseConstantParameters,
   * DayCount, ZonedDateTime)}
   */
  @Test
  @DisplayName(
      "Test of(HullWhiteOneFactorPiecewiseConstantParameters, DayCount, ZonedDateTime) with 'parameters', 'dayCount', 'valuationDateTime'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HullWhiteOneFactorPiecewiseConstantParametersProvider HullWhiteOneFactorPiecewiseConstantParametersProvider.of(HullWhiteOneFactorPiecewiseConstantParameters, DayCount, ZonedDateTime)"
  })
  void testOfWithParametersDayCountValuationDateTime() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());
    DayCount dayCount = mock(DayCount.class);
    ZonedDateTime valuationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    // Act
    HullWhiteOneFactorPiecewiseConstantParametersProvider actualOfResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, valuationDateTime);

    // Assert
    assertSame(valuationDateTime, actualOfResult.getValuationDateTime());
    assertSame(parameters, actualOfResult.getParameters());
    assertSame(dayCount, actualOfResult.getDayCount());
  }

  /**
   * Test {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#of(HullWhiteOneFactorPiecewiseConstantParameters,
   * DayCount, LocalDate, LocalTime, ZoneId)} with {@code parameters}, {@code dayCount}, {@code
   * valuationDate}, {@code valuationTime}, {@code valuationZone}.
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#of(HullWhiteOneFactorPiecewiseConstantParameters,
   * DayCount, LocalDate, LocalTime, ZoneId)}
   */
  @Test
  @DisplayName(
      "Test of(HullWhiteOneFactorPiecewiseConstantParameters, DayCount, LocalDate, LocalTime, ZoneId) with 'parameters', 'dayCount', 'valuationDate', 'valuationTime', 'valuationZone'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HullWhiteOneFactorPiecewiseConstantParametersProvider HullWhiteOneFactorPiecewiseConstantParametersProvider.of(HullWhiteOneFactorPiecewiseConstantParameters, DayCount, LocalDate, LocalTime, ZoneId)"
  })
  void testOfWithParametersDayCountValuationDateValuationTimeValuationZone() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());
    DayCount dayCount = mock(DayCount.class);
    ZoneOffset valuationZone = ZoneOffset.ofTotalSeconds(1);

    // Act
    HullWhiteOneFactorPiecewiseConstantParametersProvider actualOfResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, valuationZone);

    // Assert
    assertSame(parameters, actualOfResult.getParameters());
    assertSame(valuationZone, actualOfResult.getValuationDateTime().getZone());
    assertSame(dayCount, actualOfResult.getDayCount());
  }

  /**
   * Test {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#futuresConvexityFactor(LocalDate,
   * LocalDate, LocalDate)}.
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#futuresConvexityFactor(LocalDate,
   * LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test futuresConvexityFactor(LocalDate, LocalDate, LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantParametersProvider.futuresConvexityFactor(LocalDate, LocalDate, LocalDate)"
  })
  void testFuturesConvexityFactor() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC));

    // Act
    double actualFuturesConvexityFactorResult =
        ofResult.futuresConvexityFactor(
            LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Assert
    verify(dayCount, atLeast(1)).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    assertEquals(1.0d, actualFuturesConvexityFactorResult);
  }

  /**
   * Test {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#futuresConvexityFactor(LocalDate,
   * LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link DayCount} {@link DayCount#yearFraction(LocalDate, LocalDate)} return ten.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#futuresConvexityFactor(LocalDate,
   * LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test futuresConvexityFactor(LocalDate, LocalDate, LocalDate); given DayCount yearFraction(LocalDate, LocalDate) return ten; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantParametersProvider.futuresConvexityFactor(LocalDate, LocalDate, LocalDate)"
  })
  void testFuturesConvexityFactor_givenDayCountYearFractionReturnTen_thenReturnOne() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));

    // Act
    double actualFuturesConvexityFactorResult =
        ofResult.futuresConvexityFactor(
            LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Assert
    verify(dayCount, atLeast(1)).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    assertEquals(1.0d, actualFuturesConvexityFactorResult);
  }

  /**
   * Test {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#futuresConvexityFactorAdjoint(LocalDate,
   * LocalDate, LocalDate)}.
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#futuresConvexityFactorAdjoint(LocalDate,
   * LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test futuresConvexityFactorAdjoint(LocalDate, LocalDate, LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives HullWhiteOneFactorPiecewiseConstantParametersProvider.futuresConvexityFactorAdjoint(LocalDate, LocalDate, LocalDate)"
  })
  void testFuturesConvexityFactorAdjoint() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC));

    // Act
    ValueDerivatives actualFuturesConvexityFactorAdjointResult =
        ofResult.futuresConvexityFactorAdjoint(
            LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Assert
    verify(dayCount, atLeast(1)).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    DoubleArray derivatives = actualFuturesConvexityFactorAdjointResult.getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(1, derivatives.dimensions());
    assertEquals(1, derivatives.size());
    assertEquals(1.0d, actualFuturesConvexityFactorAdjointResult.getValue());
    assertFalse(derivatives.isEmpty());
    assertArrayEquals(new double[] {0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#futuresConvexityFactorAdjoint(LocalDate,
   * LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Then return Derivatives max is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#futuresConvexityFactorAdjoint(LocalDate,
   * LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test futuresConvexityFactorAdjoint(LocalDate, LocalDate, LocalDate); then return Derivatives max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives HullWhiteOneFactorPiecewiseConstantParametersProvider.futuresConvexityFactorAdjoint(LocalDate, LocalDate, LocalDate)"
  })
  void testFuturesConvexityFactorAdjoint_thenReturnDerivativesMaxIsZero() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));

    // Act
    ValueDerivatives actualFuturesConvexityFactorAdjointResult =
        ofResult.futuresConvexityFactorAdjoint(
            LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Assert
    verify(dayCount, atLeast(1)).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    DoubleArray derivatives = actualFuturesConvexityFactorAdjointResult.getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(1, derivatives.dimensions());
    assertEquals(1, derivatives.size());
    assertEquals(1.0d, actualFuturesConvexityFactorAdjointResult.getValue());
    assertFalse(derivatives.isEmpty());
    assertArrayEquals(new double[] {0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#relativeTime(LocalDate)}.
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#relativeTime(LocalDate)}
   */
  @Test
  @DisplayName("Test relativeTime(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantParametersProvider.relativeTime(LocalDate)"
  })
  void testRelativeTime() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC));

    // Act
    ofResult.relativeTime(LocalDate.of(1970, 1, 1));

    // Assert
    verify(dayCount).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#relativeTime(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link DayCount} {@link DayCount#yearFraction(LocalDate, LocalDate)} return ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#relativeTime(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test relativeTime(LocalDate); given DayCount yearFraction(LocalDate, LocalDate) return ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantParametersProvider.relativeTime(LocalDate)"
  })
  void testRelativeTime_givenDayCountYearFractionReturnTen_thenReturnTen() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));

    // Act
    double actualRelativeTimeResult = ofResult.relativeTime(LocalDate.of(1970, 1, 1));

    // Assert
    verify(dayCount).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    assertEquals(10.0d, actualRelativeTimeResult);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#alpha(LocalDate, LocalDate,
   * LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link DayCount} {@link DayCount#yearFraction(LocalDate, LocalDate)} return ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#alpha(LocalDate, LocalDate, LocalDate,
   * LocalDate)}
   */
  @Test
  @DisplayName(
      "Test alpha(LocalDate, LocalDate, LocalDate, LocalDate); given DayCount yearFraction(LocalDate, LocalDate) return ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantParametersProvider.alpha(LocalDate, LocalDate, LocalDate, LocalDate)"
  })
  void testAlpha_givenDayCountYearFractionReturnTen_thenReturnZero() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));

    // Act
    double actualAlphaResult =
        ofResult.alpha(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1));

    // Assert
    verify(dayCount, atLeast(1)).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    assertEquals(0.0d, actualAlphaResult);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#alpha(LocalDate, LocalDate,
   * LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay two and two.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#alpha(LocalDate, LocalDate, LocalDate,
   * LocalDate)}
   */
  @Test
  @DisplayName(
      "Test alpha(LocalDate, LocalDate, LocalDate, LocalDate); when ofYearDay two and two; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantParametersProvider.alpha(LocalDate, LocalDate, LocalDate, LocalDate)"
  })
  void testAlpha_whenOfYearDayTwoAndTwo_thenReturnZero() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));

    // Act
    double actualAlphaResult =
        ofResult.alpha(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            LocalDate.ofYearDay(2, 2),
            LocalDate.of(1970, 1, 1));

    // Assert
    verify(dayCount, atLeast(1)).yearFraction(Mockito.<LocalDate>any(), isA(LocalDate.class));
    assertEquals(0.0d, actualAlphaResult);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#alphaAdjoint(LocalDate,
   * LocalDate, LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link DayCount} {@link DayCount#yearFraction(LocalDate, LocalDate)} return ten.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#alphaAdjoint(LocalDate, LocalDate,
   * LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test alphaAdjoint(LocalDate, LocalDate, LocalDate, LocalDate); given DayCount yearFraction(LocalDate, LocalDate) return ten; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives HullWhiteOneFactorPiecewiseConstantParametersProvider.alphaAdjoint(LocalDate, LocalDate, LocalDate, LocalDate)"
  })
  void testAlphaAdjoint_givenDayCountYearFractionReturnTen_thenReturnValueIsZero() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));

    // Act
    ValueDerivatives actualAlphaAdjointResult =
        ofResult.alphaAdjoint(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1));

    // Assert
    verify(dayCount, atLeast(1)).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    assertEquals(0.0d, actualAlphaAdjointResult.getValue());
    DoubleArray derivatives = actualAlphaAdjointResult.getDerivatives();
    assertEquals(1, derivatives.dimensions());
    assertEquals(1, derivatives.size());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertFalse(derivatives.isEmpty());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {Double.NaN}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#alphaAdjoint(LocalDate,
   * LocalDate, LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay two and two.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#alphaAdjoint(LocalDate, LocalDate,
   * LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test alphaAdjoint(LocalDate, LocalDate, LocalDate, LocalDate); when ofYearDay two and two; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives HullWhiteOneFactorPiecewiseConstantParametersProvider.alphaAdjoint(LocalDate, LocalDate, LocalDate, LocalDate)"
  })
  void testAlphaAdjoint_whenOfYearDayTwoAndTwo_thenReturnValueIsZero() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters, dayCount, LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));

    // Act
    ValueDerivatives actualAlphaAdjointResult =
        ofResult.alphaAdjoint(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            LocalDate.ofYearDay(2, 2),
            LocalDate.of(1970, 1, 1));

    // Assert
    verify(dayCount, atLeast(1)).yearFraction(Mockito.<LocalDate>any(), isA(LocalDate.class));
    assertEquals(0.0d, actualAlphaAdjointResult.getValue());
    DoubleArray derivatives = actualAlphaAdjointResult.getDerivatives();
    assertEquals(1, derivatives.dimensions());
    assertEquals(1, derivatives.size());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertFalse(derivatives.isEmpty());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {Double.NaN}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#meta()}.
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta HullWhiteOneFactorPiecewiseConstantParametersProvider.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = HullWhiteOneFactorPiecewiseConstantParametersProvider.meta();

    // Assert
    MetaProperty<DayCount> dayCountResult = actualMetaResult.dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    MetaProperty<HullWhiteOneFactorPiecewiseConstantParameters> parametersResult =
        actualMetaResult.parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult = actualMetaResult.valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("dayCount", dayCountResult.name());
    assertEquals("parameters", parametersResult.name());
    assertEquals("valuationDateTime", valuationDateTimeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dayCountResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, parametersResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valuationDateTimeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, dayCountResult.propertyType());
    Class<HullWhiteOneFactorPiecewiseConstantParameters> expectedPropertyTypeResult2 =
        HullWhiteOneFactorPiecewiseConstantParameters.class;
    assertEquals(expectedPropertyTypeResult2, parametersResult.propertyType());
    Class<HullWhiteOneFactorPiecewiseConstantParametersProvider> expectedDeclaringTypeResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.class;
    assertEquals(expectedDeclaringTypeResult, dayCountResult.declaringType());
    Class<HullWhiteOneFactorPiecewiseConstantParametersProvider> expectedDeclaringTypeResult2 =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.class;
    assertEquals(expectedDeclaringTypeResult2, parametersResult.declaringType());
    Class<HullWhiteOneFactorPiecewiseConstantParametersProvider> expectedDeclaringTypeResult3 =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.class;
    assertEquals(expectedDeclaringTypeResult3, valuationDateTimeResult.declaringType());
    Class<ZonedDateTime> expectedPropertyTypeResult3 = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult3, valuationDateTimeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, dayCountResult.metaBean());
    assertSame(meta, parametersResult.metaBean());
    assertSame(meta, valuationDateTimeResult.metaBean());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); given DoubleArray with value is ten; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta HullWhiteOneFactorPiecewiseConstantParametersProvider.metaBean()"})
  void testMetaBean_givenDoubleArrayWithValueIsTen_thenReturnInstance() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());
    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters,
            mock(DayCount.class),
            LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantParametersProvider.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantParametersProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());
    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters,
            mock(DayCount.class),
            LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));
    DoubleArray volatility2 = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters2 =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility2, DoubleArray.of());

    // Act and Assert
    assertNotEquals(
        ofResult,
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters2,
            mock(DayCount.class),
            LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC)));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantParametersProvider.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantParametersProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    // Act and Assert
    assertNotEquals(
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters,
            mock(DayCount.class),
            LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC)),
        1);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantParametersProvider.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantParametersProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    // Act and Assert
    assertNotEquals(
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters,
            mock(DayCount.class),
            LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC)),
        null);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParametersProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParametersProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantParametersProvider.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantParametersProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters =
        HullWhiteOneFactorPiecewiseConstantParameters.of(1000.0d, volatility, DoubleArray.of());
    HullWhiteOneFactorPiecewiseConstantParametersProvider ofResult =
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters,
            mock(DayCount.class),
            LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));
    DoubleArray volatility2 = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters parameters2 =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility2, DoubleArray.of());

    // Act and Assert
    assertNotEquals(
        ofResult,
        HullWhiteOneFactorPiecewiseConstantParametersProvider.of(
            parameters2,
            mock(DayCount.class),
            LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC)));
  }
}
