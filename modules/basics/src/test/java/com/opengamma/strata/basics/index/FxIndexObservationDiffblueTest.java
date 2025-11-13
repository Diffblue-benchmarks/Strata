package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.basics.date.HolidayCalendar;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import com.opengamma.strata.basics.date.HolidayCalendars;
import com.opengamma.strata.basics.index.FxIndexObservation.Meta;
import java.time.LocalDate;
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

class FxIndexObservationDiffblueTest {
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
    Class<? extends FxIndexObservation> actualBeanTypeResult = FxIndexObservation.meta().beanType();

    // Assert
    Class<FxIndexObservation> expectedBeanTypeResult = FxIndexObservation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#fixingDate()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#maturityDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.fixingDate()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.maturityDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FxIndexObservation.meta();

    // Act
    MetaProperty<LocalDate> actualFixingDateResult = metaResult.fixingDate();
    MetaProperty<FxIndex> actualIndexResult = metaResult.index();

    // Assert
    assertTrue(actualFixingDateResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(metaResult.maturityDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingDate}.
   *   <li>Then return name is {@code fixingDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingDate'; then return name is 'fixingDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingDate_thenReturnNameIsFixingDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxIndexObservation.meta().metaPropertyGet("fixingDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FxIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> maturityDateResult = ((Meta) metaBeanResult).maturityDate();
    assertTrue(maturityDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixingDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingDate());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, maturityDateResult.metaBean());
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
        FxIndexObservation.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> fixingDateResult = ((Meta) metaBeanResult).fixingDate();
    assertTrue(fixingDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> maturityDateResult = ((Meta) metaBeanResult).maturityDate();
    assertTrue(maturityDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<FxIndex> expectedPropertyTypeResult = FxIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
    assertSame(metaBeanResult, fixingDateResult.metaBean());
    assertSame(metaBeanResult, maturityDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code maturityDate}.
   *   <li>Then return name is {@code maturityDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'maturityDate'; then return name is 'maturityDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMaturityDate_thenReturnNameIsMaturityDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxIndexObservation.meta().metaPropertyGet("maturityDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> fixingDateResult = ((Meta) metaBeanResult).fixingDate();
    assertTrue(fixingDateResult instanceof DirectMetaProperty);
    MetaProperty<FxIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("maturityDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).maturityDate());
    assertSame(metaBeanResult, fixingDateResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
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
    assertNull(FxIndexObservation.meta().metaPropertyGet("Property Name"));
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
        FxIndexObservation.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("index");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("fixingDate");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("maturityDate");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("fixingDate", getResult2.name());
    assertEquals("index", getResult.name());
    assertEquals("maturityDate", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<FxIndex> expectedPropertyTypeResult = FxIndex.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<FxIndexObservation> expectedDeclaringTypeResult = FxIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<FxIndexObservation> expectedDeclaringTypeResult2 = FxIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<FxIndexObservation> expectedDeclaringTypeResult3 = FxIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
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
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@code fixingDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); given FRI_SAT; when 'fixingDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_givenFri_sat_whenFixingDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = FxIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    FxIndexObservation bean = FxIndexObservation.of(FxIndices.EUR_CHF_ECB, fixingDate, refData);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "fixingDate", false);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(fixingDate, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@code index}.
   *   <li>Then return {@link ImmutableFxIndex}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); given FRI_SAT; when 'index'; then return ImmutableFxIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_givenFri_sat_whenIndex_thenReturnImmutableFxIndex() {
    // Arrange
    Meta metaResult = FxIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    FxIndexObservation bean =
        FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "index", false);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertTrue(actualPropertyGetResult instanceof ImmutableFxIndex);
    assertEquals("EUR/CHF-ECB", ((ImmutableFxIndex) actualPropertyGetResult).getName());
    HolidayCalendarId fixingCalendar =
        ((ImmutableFxIndex) actualPropertyGetResult).getFixingCalendar();
    assertEquals("EUTA", fixingCalendar.getName());
    assertEquals("EUTA", fixingCalendar.toString());
    assertEquals(-2, ((ImmutableFxIndex) actualPropertyGetResult).getFixingDateOffset().getDays());
    assertEquals(2, ((ImmutableFxIndex) actualPropertyGetResult).getMaturityDateOffset().getDays());
    CurrencyPair currencyPair = ((ImmutableFxIndex) actualPropertyGetResult).getCurrencyPair();
    assertEquals(5, currencyPair.getRateDigits());
    assertFalse(currencyPair.isIdentity());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, fixingCalendar.getReferenceDataType());
    CurrencyPair actualToConventionalResult = currencyPair.toConventional();
    assertSame(currencyPair, actualToConventionalResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@code maturityDate}.
   *   <li>Then return toString is {@code 1970-01-05}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); given FRI_SAT; when 'maturityDate'; then return toString is '1970-01-05'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_givenFri_sat_whenMaturityDate_thenReturnToStringIs19700105() {
    // Arrange
    Meta metaResult = FxIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    FxIndexObservation bean =
        FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "maturityDate", false);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-05", actualPropertyGetResult.toString());
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
    assertNull(FxIndexObservation.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = FxIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    FxIndexObservation bean =
        FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@code fixingDate}.
   *   <li>Then calls {@link ReferenceData#getValue(ReferenceDataId)}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); given FRI_SAT; when 'fixingDate'; then calls getValue(ReferenceDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_givenFri_sat_whenFixingDate_thenCallsGetValue() {
    // Arrange
    Meta metaResult = FxIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation bean =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    // Act
    metaResult.propertySet(bean, "fixingDate", "New Value", true);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@code index}.
   *   <li>Then calls {@link ReferenceData#getValue(ReferenceDataId)}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); given FRI_SAT; when 'index'; then calls getValue(ReferenceDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_givenFri_sat_whenIndex_thenCallsGetValue() {
    // Arrange
    Meta metaResult = FxIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation bean =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    // Act
    metaResult.propertySet(bean, "index", "New Value", true);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@code maturityDate}.
   *   <li>Then calls {@link ReferenceData#getValue(ReferenceDataId)}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); given FRI_SAT; when 'maturityDate'; then calls getValue(ReferenceDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_givenFri_sat_whenMaturityDate_thenCallsGetValue() {
    // Arrange
    Meta metaResult = FxIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation bean =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    // Act
    metaResult.propertySet(bean, "maturityDate", "New Value", true);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when Bean; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBean_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            FxIndexObservation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
    // Arrange
    Meta metaResult = FxIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation bean =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> metaResult.propertySet(bean, "fixingDate", "New Value", false));
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
  }

  /**
   * Test {@link FxIndexObservation#of(FxIndex, LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return MaturityDate toString is {@code 1970-01-05}.
   * </ul>
   *
   * <p>Method under test: {@link FxIndexObservation#of(FxIndex, LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(FxIndex, LocalDate, ReferenceData); given FRI_SAT; then return MaturityDate toString is '1970-01-05'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxIndexObservation FxIndexObservation.of(FxIndex, LocalDate, ReferenceData)"})
  void testOf_givenFri_sat_thenReturnMaturityDateToStringIs19700105() {
    // Arrange
    FxIndex index = FxIndices.EUR_CHF_ECB;
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    FxIndexObservation actualOfResult = FxIndexObservation.of(index, fixingDate, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-05", actualOfResult.getMaturityDate().toString());
    CurrencyPair currencyPair = actualOfResult.getCurrencyPair();
    assertEquals(5, currencyPair.getRateDigits());
    assertFalse(currencyPair.isIdentity());
    CurrencyPair actualToConventionalResult = currencyPair.toConventional();
    assertSame(currencyPair, actualToConventionalResult);
    assertSame(fixingDate, actualOfResult.getFixingDate());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link FxIndexObservation#of(FxIndex, LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#NO_HOLIDAYS}.
   *   <li>Then return MaturityDate toString is {@code 1970-01-03}.
   * </ul>
   *
   * <p>Method under test: {@link FxIndexObservation#of(FxIndex, LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(FxIndex, LocalDate, ReferenceData); given NO_HOLIDAYS; then return MaturityDate toString is '1970-01-03'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxIndexObservation FxIndexObservation.of(FxIndex, LocalDate, ReferenceData)"})
  void testOf_givenNo_holidays_thenReturnMaturityDateToStringIs19700103() {
    // Arrange
    FxIndex index = FxIndices.EUR_CHF_ECB;
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.NO_HOLIDAYS);

    // Act
    FxIndexObservation actualOfResult = FxIndexObservation.of(index, fixingDate, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-03", actualOfResult.getMaturityDate().toString());
    CurrencyPair currencyPair = actualOfResult.getCurrencyPair();
    assertEquals(5, currencyPair.getRateDigits());
    assertFalse(currencyPair.isIdentity());
    CurrencyPair actualToConventionalResult = currencyPair.toConventional();
    assertSame(currencyPair, actualToConventionalResult);
    assertSame(fixingDate, actualOfResult.getFixingDate());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link FxIndexObservation#getCurrencyPair()}.
   *
   * <ul>
   *   <li>Then return Counter Code is {@code CHF}.
   * </ul>
   *
   * <p>Method under test: {@link FxIndexObservation#getCurrencyPair()}
   */
  @Test
  @DisplayName("Test getCurrencyPair(); then return Counter Code is 'CHF'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair FxIndexObservation.getCurrencyPair()"})
  void testGetCurrencyPair_thenReturnCounterCodeIsChf() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    FxIndexObservation ofResult =
        FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData);

    // Act
    CurrencyPair actualCurrencyPair = ofResult.getCurrencyPair();

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    Currency counter = actualCurrencyPair.getCounter();
    assertEquals("CHF", counter.getCode());
    assertEquals("CHF", counter.toString());
    Currency base = actualCurrencyPair.getBase();
    assertEquals("EUR", base.getCode());
    assertEquals("EUR", base.toString());
    assertEquals(2, base.getMinorUnitDigits());
    assertEquals(2, counter.getMinorUnitDigits());
    CurrencyPair inverseResult = actualCurrencyPair.inverse();
    assertEquals(5, inverseResult.getRateDigits());
    assertEquals(5, actualCurrencyPair.getRateDigits());
    assertFalse(inverseResult.isIdentity());
    assertFalse(actualCurrencyPair.isIdentity());
    assertEquals(actualCurrencyPair, inverseResult.inverse());
    assertEquals(actualCurrencyPair, inverseResult.toConventional());
    assertSame(base, inverseResult.getCounter());
    assertSame(counter, inverseResult.getBase());
    CurrencyPair actualToConventionalResult = actualCurrencyPair.toConventional();
    assertSame(actualCurrencyPair, actualToConventionalResult);
  }

  /**
   * Test {@link FxIndexObservation#equals(Object)}, and {@link FxIndexObservation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxIndexObservation#equals(Object)}
   *   <li>{@link FxIndexObservation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxIndexObservation.equals(Object)",
    "int FxIndexObservation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    FxIndexObservation ofResult =
        FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData);

    ReferenceData refData2 = mock(ReferenceData.class);
    when(refData2.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    FxIndexObservation ofResult2 =
        FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData2);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link FxIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxIndexObservation.equals(Object)",
    "int FxIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData), 1);
  }

  /**
   * Test {@link FxIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxIndexObservation.equals(Object)",
    "int FxIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData), null);
  }

  /**
   * Test {@link FxIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxIndexObservation.equals(Object)",
    "int FxIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    FxIndexObservation ofResult =
        FxIndexObservation.of(FxIndices.EUR_GBP_ECB, LocalDate.of(1970, 1, 1), refData);

    ReferenceData refData2 = mock(ReferenceData.class);
    when(refData2.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        ofResult, FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData2));
  }

  /**
   * Test {@link FxIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxIndexObservation.equals(Object)",
    "int FxIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    FxIndexObservation ofResult =
        FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.now(), refData);

    ReferenceData refData2 = mock(ReferenceData.class);
    when(refData2.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        ofResult, FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData2));
  }

  /**
   * Test {@link FxIndexObservation#meta()}.
   *
   * <p>Method under test: {@link FxIndexObservation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxIndexObservation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FxIndexObservation.meta();

    // Assert
    MetaProperty<LocalDate> fixingDateResult = actualMetaResult.fixingDate();
    assertTrue(fixingDateResult instanceof DirectMetaProperty);
    MetaProperty<FxIndex> indexResult = actualMetaResult.index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> maturityDateResult = actualMetaResult.maturityDate();
    assertTrue(maturityDateResult instanceof DirectMetaProperty);
    assertEquals("fixingDate", fixingDateResult.name());
    assertEquals("index", indexResult.name());
    assertEquals("maturityDate", maturityDateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, fixingDateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, indexResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, maturityDateResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<FxIndex> expectedPropertyTypeResult = FxIndex.class;
    assertEquals(expectedPropertyTypeResult, indexResult.propertyType());
    Class<FxIndexObservation> expectedDeclaringTypeResult = FxIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult, fixingDateResult.declaringType());
    Class<FxIndexObservation> expectedDeclaringTypeResult2 = FxIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult2, indexResult.declaringType());
    Class<FxIndexObservation> expectedDeclaringTypeResult3 = FxIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult3, maturityDateResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, fixingDateResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, maturityDateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, fixingDateResult.metaBean());
    assertSame(meta, indexResult.metaBean());
    assertSame(meta, maturityDateResult.metaBean());
  }

  /**
   * Test {@link FxIndexObservation#FxIndexObservation(FxIndex, LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When {@link FxIndices#EUR_CHF_ECB}.
   *   <li>Then return CurrencyPair RateDigits is five.
   * </ul>
   *
   * <p>Method under test: {@link FxIndexObservation#FxIndexObservation(FxIndex, LocalDate,
   * LocalDate)}
   */
  @Test
  @DisplayName(
      "Test new FxIndexObservation(FxIndex, LocalDate, LocalDate); when EUR_CHF_ECB; then return CurrencyPair RateDigits is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FxIndexObservation.<init>(FxIndex, LocalDate, LocalDate)"})
  void testNewFxIndexObservation_whenEur_chf_ecb_thenReturnCurrencyPairRateDigitsIsFive() {
    // Arrange
    FxIndex index = FxIndices.EUR_CHF_ECB;
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);
    LocalDate maturityDate = LocalDate.of(1970, 1, 1);

    // Act
    FxIndexObservation actualFxIndexObservation =
        new FxIndexObservation(index, fixingDate, maturityDate);

    // Assert
    CurrencyPair currencyPair = actualFxIndexObservation.getCurrencyPair();
    assertEquals(5, currencyPair.getRateDigits());
    assertFalse(currencyPair.isIdentity());
    CurrencyPair actualToConventionalResult = currencyPair.toConventional();
    assertSame(currencyPair, actualToConventionalResult);
    assertSame(fixingDate, actualFxIndexObservation.getFixingDate());
    assertSame(maturityDate, actualFxIndexObservation.getMaturityDate());
    assertSame(index, actualFxIndexObservation.getIndex());
  }

  /**
   * Test {@link FxIndexObservation#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link ReferenceData} {@link ReferenceData#getValue(ReferenceDataId)} return {@link
   *       HolidayCalendars#FRI_SAT}.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link FxIndexObservation#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given ReferenceData getValue(ReferenceDataId) return FRI_SAT; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxIndexObservation.metaBean()"})
  void testMetaBean_givenReferenceDataGetValueReturnFri_sat_thenReturnInstance() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    FxIndexObservation ofResult =
        FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData);

    // Act
    Meta actualMetaBeanResult = ofResult.metaBean();

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertSame(Meta.INSTANCE, actualMetaBeanResult);
  }

  /**
   * Test {@link FxIndexObservation#getIndex()}.
   *
   * <ul>
   *   <li>Given {@link ReferenceData} {@link ReferenceData#getValue(ReferenceDataId)} return {@link
   *       HolidayCalendars#FRI_SAT}.
   *   <li>Then return {@link ImmutableFxIndex}.
   * </ul>
   *
   * <p>Method under test: {@link FxIndexObservation#getIndex()}
   */
  @Test
  @DisplayName(
      "Test getIndex(); given ReferenceData getValue(ReferenceDataId) return FRI_SAT; then return ImmutableFxIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxIndex FxIndexObservation.getIndex()"})
  void testGetIndex_givenReferenceDataGetValueReturnFri_sat_thenReturnImmutableFxIndex() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    FxIndexObservation ofResult =
        FxIndexObservation.of(FxIndices.EUR_CHF_ECB, LocalDate.of(1970, 1, 1), refData);

    // Act
    FxIndex actualIndex = ofResult.getIndex();

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertTrue(actualIndex instanceof ImmutableFxIndex);
    assertEquals("EUR/CHF-ECB", actualIndex.getName());
    HolidayCalendarId fixingCalendar = actualIndex.getFixingCalendar();
    assertEquals("EUTA", fixingCalendar.getName());
    assertEquals("EUTA", fixingCalendar.toString());
    assertEquals(-2, actualIndex.getFixingDateOffset().getDays());
    assertEquals(2, actualIndex.getMaturityDateOffset().getDays());
    CurrencyPair currencyPair = actualIndex.getCurrencyPair();
    assertEquals(5, currencyPair.getRateDigits());
    assertFalse(currencyPair.isIdentity());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, fixingCalendar.getReferenceDataType());
    CurrencyPair actualToConventionalResult = currencyPair.toConventional();
    assertSame(currencyPair, actualToConventionalResult);
  }
}
