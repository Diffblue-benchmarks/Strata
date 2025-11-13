package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
import com.opengamma.strata.basics.date.HolidayCalendar;
import com.opengamma.strata.basics.date.HolidayCalendars;
import com.opengamma.strata.basics.index.IborIndexObservation.Meta;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class IborIndexObservationDiffblueTest {
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
    Class<? extends IborIndexObservation> actualBeanTypeResult =
        IborIndexObservation.meta().beanType();

    // Assert
    Class<IborIndexObservation> expectedBeanTypeResult = IborIndexObservation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#effectiveDate()}
   *   <li>{@link Meta#fixingDate()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#maturityDate()}
   *   <li>{@link Meta#yearFraction()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.effectiveDate()",
    "MetaProperty Meta.fixingDate()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.maturityDate()",
    "MetaProperty Meta.yearFraction()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = IborIndexObservation.meta();

    // Act
    MetaProperty<LocalDate> actualEffectiveDateResult = metaResult.effectiveDate();
    MetaProperty<LocalDate> actualFixingDateResult = metaResult.fixingDate();
    MetaProperty<IborIndex> actualIndexResult = metaResult.index();
    MetaProperty<LocalDate> actualMaturityDateResult = metaResult.maturityDate();

    // Assert
    assertTrue(actualEffectiveDateResult instanceof DirectMetaProperty);
    assertTrue(actualFixingDateResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualMaturityDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yearFraction() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code effectiveDate}.
   *   <li>Then return name is {@code effectiveDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'effectiveDate'; then return name is 'effectiveDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenEffectiveDate_thenReturnNameIsEffectiveDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborIndexObservation.meta().metaPropertyGet("effectiveDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> fixingDateResult = ((Meta) metaBeanResult).fixingDate();
    assertTrue(fixingDateResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> maturityDateResult = ((Meta) metaBeanResult).maturityDate();
    assertTrue(maturityDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("effectiveDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).effectiveDate());
    assertSame(metaBeanResult, fixingDateResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, maturityDateResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
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
        IborIndexObservation.meta().metaPropertyGet("fixingDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> effectiveDateResult = ((Meta) metaBeanResult).effectiveDate();
    assertTrue(effectiveDateResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> maturityDateResult = ((Meta) metaBeanResult).maturityDate();
    assertTrue(maturityDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("fixingDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingDate());
    assertSame(metaBeanResult, effectiveDateResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, maturityDateResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
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
        IborIndexObservation.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> effectiveDateResult = ((Meta) metaBeanResult).effectiveDate();
    assertTrue(effectiveDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> fixingDateResult = ((Meta) metaBeanResult).fixingDate();
    assertTrue(fixingDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> maturityDateResult = ((Meta) metaBeanResult).maturityDate();
    assertTrue(maturityDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<IborIndex> expectedPropertyTypeResult = IborIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
    assertSame(metaBeanResult, effectiveDateResult.metaBean());
    assertSame(metaBeanResult, fixingDateResult.metaBean());
    assertSame(metaBeanResult, maturityDateResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
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
        IborIndexObservation.meta().metaPropertyGet("maturityDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> effectiveDateResult = ((Meta) metaBeanResult).effectiveDate();
    assertTrue(effectiveDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> fixingDateResult = ((Meta) metaBeanResult).fixingDate();
    assertTrue(fixingDateResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("maturityDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).maturityDate());
    assertSame(metaBeanResult, effectiveDateResult.metaBean());
    assertSame(metaBeanResult, fixingDateResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
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
    assertNull(IborIndexObservation.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yearFraction'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYearFraction_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborIndexObservation.meta().metaPropertyGet("yearFraction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> effectiveDateResult = ((Meta) metaBeanResult).effectiveDate();
    assertTrue(effectiveDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> fixingDateResult = ((Meta) metaBeanResult).fixingDate();
    assertTrue(fixingDateResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> maturityDateResult = ((Meta) metaBeanResult).maturityDate();
    assertTrue(maturityDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("yearFraction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yearFraction());
    assertSame(metaBeanResult, effectiveDateResult.metaBean());
    assertSame(metaBeanResult, fixingDateResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, maturityDateResult.metaBean());
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
        IborIndexObservation.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("effectiveDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("maturityDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yearFraction") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@code effectiveDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); given FRI_SAT; when 'effectiveDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_givenFri_sat_whenEffectiveDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = IborIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    IborIndexObservation bean =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, fixingDate, refData);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "effectiveDate", false);

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
    Meta metaResult = IborIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    IborIndexObservation bean =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, fixingDate, refData);

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
   *   <li>When {@code maturityDate}.
   *   <li>Then return toString is {@code 1970-02-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); given FRI_SAT; when 'maturityDate'; then return toString is '1970-02-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_givenFri_sat_whenMaturityDate_thenReturnToStringIs19700201() {
    // Arrange
    Meta metaResult = IborIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation bean =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "maturityDate", false);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-02-01", actualPropertyGetResult.toString());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then FloatingRateName return {@link ImmutableFloatingRateName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then FloatingRateName return ImmutableFloatingRateName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenFloatingRateNameReturnImmutableFloatingRateName() {
    // Arrange
    Meta metaResult = IborIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation bean =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "index", false);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertTrue(
        ((ImmutableIborIndex) actualPropertyGetResult).getFloatingRateName()
            instanceof ImmutableFloatingRateName);
    assertTrue(actualPropertyGetResult instanceof ImmutableIborIndex);
    assertEquals("AUD-BBSW-1M", ((ImmutableIborIndex) actualPropertyGetResult).getName());
    assertTrue(((ImmutableIborIndex) actualPropertyGetResult).isActive());
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
    assertNull(IborIndexObservation.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = IborIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation bean =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then return doubleValue is {@code 0.08493150684931507}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'yearFraction'; then return doubleValue is '0.08493150684931507'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenYearFraction_thenReturnDoubleValueIs008493150684931507() {
    // Arrange
    Meta metaResult = IborIndexObservation.meta();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation bean =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "yearFraction", false);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals(0.08493150684931507d, ((Double) actualPropertyGetResult).doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code effectiveDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'effectiveDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenEffectiveDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborIndexObservation.meta()
                .propertySet(mock(Bean.class), "effectiveDate", "New Value", true));
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
            IborIndexObservation.meta()
                .propertySet(mock(Bean.class), "effectiveDate", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixingDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixingDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborIndexObservation.meta()
                .propertySet(mock(Bean.class), "fixingDate", "New Value", true));
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
            IborIndexObservation.meta().propertySet(mock(Bean.class), "index", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code maturityDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'maturityDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMaturityDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborIndexObservation.meta()
                .propertySet(mock(Bean.class), "maturityDate", "New Value", true));
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
            IborIndexObservation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yearFraction'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYearFraction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborIndexObservation.meta()
                .propertySet(mock(Bean.class), "yearFraction", "New Value", true));
  }

  /**
   * Test {@link IborIndexObservation#of(IborIndex, LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@link IborIndices#AUD_BBSW_1M}.
   *   <li>Then return MaturityDate toString is {@code 1970-02-01}.
   * </ul>
   *
   * <p>Method under test: {@link IborIndexObservation#of(IborIndex, LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, LocalDate, ReferenceData); given FRI_SAT; when AUD_BBSW_1M; then return MaturityDate toString is '1970-02-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborIndexObservation IborIndexObservation.of(IborIndex, LocalDate, ReferenceData)"
  })
  void testOf_givenFri_sat_whenAud_bbsw_1m_thenReturnMaturityDateToStringIs19700201() {
    // Arrange
    IborIndex index = IborIndices.AUD_BBSW_1M;
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    IborIndexObservation actualOfResult = IborIndexObservation.of(index, fixingDate, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-02-01", actualOfResult.getMaturityDate().toString());
    Currency currency = actualOfResult.getCurrency();
    assertEquals("AUD", currency.getCode());
    assertEquals("AUD", currency.toString());
    assertEquals(0.08493150684931507d, actualOfResult.getYearFraction());
    assertEquals(2, currency.getMinorUnitDigits());
    assertSame(fixingDate, actualOfResult.getEffectiveDate());
    assertSame(fixingDate, actualOfResult.getFixingDate());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link IborIndexObservation#getCurrency()}.
   *
   * <p>Method under test: {@link IborIndexObservation#getCurrency()}
   */
  @Test
  @DisplayName("Test getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency IborIndexObservation.getCurrency()"})
  void testGetCurrency() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation ofResult =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    // Act
    Currency actualCurrency = ofResult.getCurrency();

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    IborIndex index = ofResult.getIndex();
    assertTrue(index instanceof ImmutableIborIndex);
    Currency currency = Currency.AUD;
    assertSame(currency, index.getCurrency());
    assertSame(currency, actualCurrency);
  }

  /**
   * Test {@link IborIndexObservation#meta()}.
   *
   * <p>Method under test: {@link IborIndexObservation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborIndexObservation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = IborIndexObservation.meta();

    // Assert
    assertTrue(actualMetaResult.effectiveDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.fixingDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.index() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.maturityDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yearFraction() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link IborIndexObservation#IborIndexObservation(IborIndex, LocalDate, LocalDate,
   * LocalDate, double)}.
   *
   * <ul>
   *   <li>When {@link IborIndices#AUD_BBSW_1M}.
   *   <li>Then return Currency Code is {@code AUD}.
   * </ul>
   *
   * <p>Method under test: {@link IborIndexObservation#IborIndexObservation(IborIndex, LocalDate,
   * LocalDate, LocalDate, double)}
   */
  @Test
  @DisplayName(
      "Test new IborIndexObservation(IborIndex, LocalDate, LocalDate, LocalDate, double); when AUD_BBSW_1M; then return Currency Code is 'AUD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IborIndexObservation.<init>(IborIndex, LocalDate, LocalDate, LocalDate, double)"
  })
  void testNewIborIndexObservation_whenAud_bbsw_1m_thenReturnCurrencyCodeIsAud() {
    // Arrange
    IborIndex index = IborIndices.AUD_BBSW_1M;
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);
    LocalDate effectiveDate = LocalDate.of(1970, 1, 1);
    LocalDate maturityDate = LocalDate.of(1970, 1, 1);

    // Act
    IborIndexObservation actualIborIndexObservation =
        new IborIndexObservation(index, fixingDate, effectiveDate, maturityDate, 10.0d);

    // Assert
    Currency currency = actualIborIndexObservation.getCurrency();
    assertEquals("AUD", currency.getCode());
    assertEquals("AUD", currency.toString());
    assertEquals(10.0d, actualIborIndexObservation.getYearFraction());
    assertEquals(2, currency.getMinorUnitDigits());
    assertSame(effectiveDate, actualIborIndexObservation.getEffectiveDate());
    assertSame(fixingDate, actualIborIndexObservation.getFixingDate());
    assertSame(maturityDate, actualIborIndexObservation.getMaturityDate());
    assertSame(index, actualIborIndexObservation.getIndex());
  }

  /**
   * Test {@link IborIndexObservation#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link ReferenceData} {@link ReferenceData#getValue(ReferenceDataId)} return {@link
   *       HolidayCalendars#FRI_SAT}.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link IborIndexObservation#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given ReferenceData getValue(ReferenceDataId) return FRI_SAT; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborIndexObservation.metaBean()"})
  void testMetaBean_givenReferenceDataGetValueReturnFri_sat_thenReturnInstance() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation ofResult =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    // Act
    Meta actualMetaBeanResult = ofResult.metaBean();

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertSame(Meta.INSTANCE, actualMetaBeanResult);
  }

  /**
   * Test {@link IborIndexObservation#getIndex()}.
   *
   * <ul>
   *   <li>Then FloatingRateName return {@link ImmutableFloatingRateName}.
   * </ul>
   *
   * <p>Method under test: {@link IborIndexObservation#getIndex()}
   */
  @Test
  @DisplayName("Test getIndex(); then FloatingRateName return ImmutableFloatingRateName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborIndex IborIndexObservation.getIndex()"})
  void testGetIndex_thenFloatingRateNameReturnImmutableFloatingRateName() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation ofResult =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    // Act
    IborIndex actualIndex = ofResult.getIndex();

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertTrue(actualIndex.getFloatingRateName() instanceof ImmutableFloatingRateName);
    assertTrue(actualIndex instanceof ImmutableIborIndex);
    assertEquals("AUD-BBSW-1M", actualIndex.getName());
    assertTrue(actualIndex.isActive());
  }

  /**
   * Test {@link IborIndexObservation#equals(Object)}, and {@link IborIndexObservation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborIndexObservation#equals(Object)}
   *   <li>{@link IborIndexObservation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborIndexObservation.equals(Object)",
    "int IborIndexObservation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation ofResult =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    ReferenceData refData2 = mock(ReferenceData.class);
    when(refData2.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation ofResult2 =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData2);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link IborIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborIndexObservation.equals(Object)",
    "int IborIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    IborIndexObservation iborIndexObservation =
        new IborIndexObservation(
            IborIndices.AUD_BBSW_1M,
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            10.0d);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        iborIndexObservation,
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData));
  }

  /**
   * Test {@link IborIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborIndexObservation.equals(Object)",
    "int IborIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData), 1);
  }

  /**
   * Test {@link IborIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborIndexObservation.equals(Object)",
    "int IborIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData), null);
  }

  /**
   * Test {@link IborIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborIndexObservation.equals(Object)",
    "int IborIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation ofResult =
        IborIndexObservation.of(IborIndices.AUD_BBSW_2M, LocalDate.of(1970, 1, 1), refData);

    ReferenceData refData2 = mock(ReferenceData.class);
    when(refData2.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        ofResult,
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData2));
  }

  /**
   * Test {@link IborIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborIndexObservation.equals(Object)",
    "int IborIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    IborIndexObservation ofResult =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.now(), refData);

    ReferenceData refData2 = mock(ReferenceData.class);
    when(refData2.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        ofResult,
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData2));
  }

  /**
   * Test {@link IborIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborIndexObservation.equals(Object)",
    "int IborIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.THU_FRI);
    IborIndexObservation ofResult =
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData);

    ReferenceData refData2 = mock(ReferenceData.class);
    when(refData2.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        ofResult,
        IborIndexObservation.of(IborIndices.AUD_BBSW_1M, LocalDate.of(1970, 1, 1), refData2));
  }
}
