package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import com.opengamma.strata.basics.ReferenceDataNotFoundException;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyPair;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HolidayCalendarIdDiffblueTest {
  /**
   * Test {@link HolidayCalendarId#of(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return Name is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when '42'; then return Name is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.of(String)"})
  void testOf_when42_thenReturnNameIs42() {
    // Arrange and Act
    HolidayCalendarId actualOfResult = HolidayCalendarId.of("42");

    // Assert
    assertEquals("42", actualOfResult.getName());
    assertEquals("42", actualOfResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualOfResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#of(String)}.
   *
   * <ul>
   *   <li>When {@code Unique Name}.
   *   <li>Then return Name is {@code Unique Name}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Unique Name'; then return Name is 'Unique Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.of(String)"})
  void testOf_whenUniqueName_thenReturnNameIsUniqueName() {
    // Arrange and Act
    HolidayCalendarId actualOfResult = HolidayCalendarId.of("Unique Name");

    // Assert
    assertEquals("Unique Name", actualOfResult.getName());
    assertEquals("Unique Name", actualOfResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualOfResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#defaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AUD}.
   *   <li>Then return Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#defaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test defaultByCurrency(Currency); when AUD; then return Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.defaultByCurrency(Currency)"})
  void testDefaultByCurrency_whenAud_thenReturnNameIsAusy() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyResult =
        HolidayCalendarId.defaultByCurrency(Currency.AUD);

    // Assert
    assertEquals("AUSY", actualDefaultByCurrencyResult.getName());
    assertEquals("AUSY", actualDefaultByCurrencyResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualDefaultByCurrencyResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#defaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#CLP}.
   *   <li>Then return Name is {@code CLSA}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#defaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test defaultByCurrency(Currency); when CLP; then return Name is 'CLSA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.defaultByCurrency(Currency)"})
  void testDefaultByCurrency_whenClp_thenReturnNameIsClsa() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyResult =
        HolidayCalendarId.defaultByCurrency(Currency.CLP);

    // Assert
    assertEquals("CLSA", actualDefaultByCurrencyResult.getName());
    assertEquals("CLSA", actualDefaultByCurrencyResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualDefaultByCurrencyResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#findDefaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#findDefaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test findDefaultByCurrency(Currency); when AED; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional HolidayCalendarId.findDefaultByCurrency(Currency)"})
  void testFindDefaultByCurrency_whenAed_thenReturnNotPresent() {
    // Arrange and Act
    Optional<HolidayCalendarId> actualFindDefaultByCurrencyResult =
        HolidayCalendarId.findDefaultByCurrency(Currency.AED);

    // Assert
    assertFalse(actualFindDefaultByCurrencyResult.isPresent());
  }

  /**
   * Test {@link HolidayCalendarId#findDefaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AUD}.
   *   <li>Then return {@link Optional#get()} Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#findDefaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test findDefaultByCurrency(Currency); when AUD; then return get() Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional HolidayCalendarId.findDefaultByCurrency(Currency)"})
  void testFindDefaultByCurrency_whenAud_thenReturnGetNameIsAusy() {
    // Arrange and Act
    Optional<HolidayCalendarId> actualFindDefaultByCurrencyResult =
        HolidayCalendarId.findDefaultByCurrency(Currency.AUD);

    // Assert
    HolidayCalendarId getResult = actualFindDefaultByCurrencyResult.get();
    assertEquals("AUSY", getResult.getName());
    assertEquals("AUSY", getResult.toString());
    assertTrue(actualFindDefaultByCurrencyResult.isPresent());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, getResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#findDefaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#findDefaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test findDefaultByCurrency(Currency); when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional HolidayCalendarId.findDefaultByCurrency(Currency)"})
  void testFindDefaultByCurrency_whenNull_thenReturnNotPresent() {
    // Arrange and Act
    Optional<HolidayCalendarId> actualFindDefaultByCurrencyResult =
        HolidayCalendarId.findDefaultByCurrency(null);

    // Assert
    assertFalse(actualFindDefaultByCurrencyResult.isPresent());
  }

  /**
   * Test {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}.
   *
   * <ul>
   *   <li>Then return Name is {@code AUSY+BRBD}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}
   */
  @Test
  @DisplayName("Test defaultByCurrencyPair(CurrencyPair); then return Name is 'AUSY+BRBD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.defaultByCurrencyPair(CurrencyPair)"})
  void testDefaultByCurrencyPair_thenReturnNameIsAusyBrbd() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyPairResult =
        HolidayCalendarId.defaultByCurrencyPair(CurrencyPair.of(Currency.AUD, Currency.BRL));

    // Assert
    assertEquals("AUSY+BRBD", actualDefaultByCurrencyPairResult.getName());
    assertEquals("AUSY+BRBD", actualDefaultByCurrencyPairResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType, actualDefaultByCurrencyPairResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}.
   *
   * <ul>
   *   <li>Then return Name is {@code AUSY+CATO}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}
   */
  @Test
  @DisplayName("Test defaultByCurrencyPair(CurrencyPair); then return Name is 'AUSY+CATO'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.defaultByCurrencyPair(CurrencyPair)"})
  void testDefaultByCurrencyPair_thenReturnNameIsAusyCato() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyPairResult =
        HolidayCalendarId.defaultByCurrencyPair(CurrencyPair.of(Currency.AUD, Currency.CAD));

    // Assert
    assertEquals("AUSY+CATO", actualDefaultByCurrencyPairResult.getName());
    assertEquals("AUSY+CATO", actualDefaultByCurrencyPairResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType, actualDefaultByCurrencyPairResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}.
   *
   * <ul>
   *   <li>Then return Name is {@code AUSY+CLSA}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}
   */
  @Test
  @DisplayName("Test defaultByCurrencyPair(CurrencyPair); then return Name is 'AUSY+CLSA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.defaultByCurrencyPair(CurrencyPair)"})
  void testDefaultByCurrencyPair_thenReturnNameIsAusyClsa() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyPairResult =
        HolidayCalendarId.defaultByCurrencyPair(CurrencyPair.of(Currency.AUD, Currency.CLP));

    // Assert
    assertEquals("AUSY+CLSA", actualDefaultByCurrencyPairResult.getName());
    assertEquals("AUSY+CLSA", actualDefaultByCurrencyPairResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType, actualDefaultByCurrencyPairResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}.
   *
   * <ul>
   *   <li>Then return Name is {@code AUSY+EUTA}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}
   */
  @Test
  @DisplayName("Test defaultByCurrencyPair(CurrencyPair); then return Name is 'AUSY+EUTA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.defaultByCurrencyPair(CurrencyPair)"})
  void testDefaultByCurrencyPair_thenReturnNameIsAusyEuta() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyPairResult =
        HolidayCalendarId.defaultByCurrencyPair(CurrencyPair.of(Currency.AUD, Currency.EUR));

    // Assert
    assertEquals("AUSY+EUTA", actualDefaultByCurrencyPairResult.getName());
    assertEquals("AUSY+EUTA", actualDefaultByCurrencyPairResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType, actualDefaultByCurrencyPairResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test defaultByCurrencyPair(CurrencyPair); when CurrencyPair with base is AED and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.defaultByCurrencyPair(CurrencyPair)"})
  void testDefaultByCurrencyPair_whenCurrencyPairWithBaseIsAedAndCounterIsAed() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyPairResult =
        HolidayCalendarId.defaultByCurrencyPair(CurrencyPair.of(Currency.AED, Currency.AED));

    // Assert
    assertEquals("NoHolidays", actualDefaultByCurrencyPairResult.getName());
    assertEquals("NoHolidays", actualDefaultByCurrencyPairResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType, actualDefaultByCurrencyPairResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AUD}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test defaultByCurrencyPair(CurrencyPair); when CurrencyPair with base is AED and counter is AUD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.defaultByCurrencyPair(CurrencyPair)"})
  void testDefaultByCurrencyPair_whenCurrencyPairWithBaseIsAedAndCounterIsAud() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyPairResult =
        HolidayCalendarId.defaultByCurrencyPair(CurrencyPair.of(Currency.AED, Currency.AUD));

    // Assert
    assertEquals("AUSY", actualDefaultByCurrencyPairResult.getName());
    assertEquals("AUSY", actualDefaultByCurrencyPairResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType, actualDefaultByCurrencyPairResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#ARS} and counter is {@link
   *       Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test defaultByCurrencyPair(CurrencyPair); when CurrencyPair with base is ARS and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.defaultByCurrencyPair(CurrencyPair)"})
  void testDefaultByCurrencyPair_whenCurrencyPairWithBaseIsArsAndCounterIsAed() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyPairResult =
        HolidayCalendarId.defaultByCurrencyPair(CurrencyPair.of(Currency.ARS, Currency.AED));

    // Assert
    assertEquals("NoHolidays", actualDefaultByCurrencyPairResult.getName());
    assertEquals("NoHolidays", actualDefaultByCurrencyPairResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType, actualDefaultByCurrencyPairResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test defaultByCurrencyPair(CurrencyPair); when CurrencyPair with base is AUD and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.defaultByCurrencyPair(CurrencyPair)"})
  void testDefaultByCurrencyPair_whenCurrencyPairWithBaseIsAudAndCounterIsAed() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyPairResult =
        HolidayCalendarId.defaultByCurrencyPair(CurrencyPair.of(Currency.AUD, Currency.AED));

    // Assert
    assertEquals("AUSY", actualDefaultByCurrencyPairResult.getName());
    assertEquals("AUSY", actualDefaultByCurrencyPairResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType, actualDefaultByCurrencyPairResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#AUD}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#defaultByCurrencyPair(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test defaultByCurrencyPair(CurrencyPair); when CurrencyPair with base is AUD and counter is AUD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.defaultByCurrencyPair(CurrencyPair)"})
  void testDefaultByCurrencyPair_whenCurrencyPairWithBaseIsAudAndCounterIsAud() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyPairResult =
        HolidayCalendarId.defaultByCurrencyPair(CurrencyPair.of(Currency.AUD, Currency.AUD));

    // Assert
    assertEquals("AUSY", actualDefaultByCurrencyPairResult.getName());
    assertEquals("AUSY", actualDefaultByCurrencyPairResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType, actualDefaultByCurrencyPairResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#isCompositeCalendar(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>When {@link HolidayCalendarIds#AUSY}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#isCompositeCalendar(HolidayCalendarId)}
   */
  @Test
  @DisplayName("Test isCompositeCalendar(HolidayCalendarId); when AUSY; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendarId.isCompositeCalendar(HolidayCalendarId)"})
  void testIsCompositeCalendar_whenAusy_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(HolidayCalendarId.isCompositeCalendar(HolidayCalendarIds.AUSY));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HolidayCalendarId#getName()}
   *   <li>{@link HolidayCalendarId#getReferenceDataType()}
   *   <li>{@link HolidayCalendarId#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String HolidayCalendarId.getName()",
    "Class HolidayCalendarId.getReferenceDataType()",
    "String HolidayCalendarId.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    HolidayCalendarId holidayCalendarId = HolidayCalendarIds.AUSY;

    // Act
    String actualName = holidayCalendarId.getName();
    Class<HolidayCalendar> actualReferenceDataType = holidayCalendarId.getReferenceDataType();

    // Assert
    assertEquals("AUSY", actualName);
    assertEquals("AUSY", holidayCalendarId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualReferenceDataType);
  }

  /**
   * Test {@link HolidayCalendarId#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return {@link WeekendHolidayCalendar#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData); given FRI_SAT; then return FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendar HolidayCalendarId.resolve(ReferenceData)"})
  void testResolve_givenFri_sat_thenReturnFri_sat() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    HolidayCalendar actualResolveResult = HolidayCalendarIds.AUSY.resolve(refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertSame(((WeekendHolidayCalendar) actualResolveResult).FRI_SAT, actualResolveResult);
  }

  /**
   * Test {@link HolidayCalendarId#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Then throw {@link ReferenceDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData); then throw ReferenceDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendar HolidayCalendarId.resolve(ReferenceData)"})
  void testResolve_thenThrowReferenceDataNotFoundException() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenThrow(new ReferenceDataNotFoundException("An error occurred"));

    // Act and Assert
    assertThrows(
        ReferenceDataNotFoundException.class, () -> HolidayCalendarIds.AUSY.resolve(refData));
    verify(refData).getValue(isA(ReferenceDataId.class));
  }

  /**
   * Test {@link HolidayCalendarId#queryValueOrNull(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return {@link WeekendHolidayCalendar#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#queryValueOrNull(ReferenceData)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceData); given FRI_SAT; then return FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendar HolidayCalendarId.queryValueOrNull(ReferenceData)"})
  void testQueryValueOrNull_givenFri_sat_thenReturnFri_sat() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.queryValueOrNull(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    HolidayCalendar actualQueryValueOrNullResult =
        HolidayCalendarIds.AUSY.queryValueOrNull(refData);

    // Assert
    verify(refData).queryValueOrNull(isA(ReferenceDataId.class));
    assertSame(
        ((WeekendHolidayCalendar) actualQueryValueOrNullResult).FRI_SAT,
        actualQueryValueOrNullResult);
  }

  /**
   * Test {@link HolidayCalendarId#queryValueOrNull(ReferenceData)}.
   *
   * <ul>
   *   <li>Then throw {@link ReferenceDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#queryValueOrNull(ReferenceData)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceData); then throw ReferenceDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendar HolidayCalendarId.queryValueOrNull(ReferenceData)"})
  void testQueryValueOrNull_thenThrowReferenceDataNotFoundException() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);
    when(refData.queryValueOrNull(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenThrow(new ReferenceDataNotFoundException("An error occurred"));

    // Act and Assert
    assertThrows(
        ReferenceDataNotFoundException.class,
        () -> HolidayCalendarIds.AUSY.queryValueOrNull(refData));
    verify(refData).queryValueOrNull(isA(ReferenceDataId.class));
  }

  /**
   * Test {@link HolidayCalendarId#combinedWith(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendarIds#AUSY}.
   *   <li>When {@link HolidayCalendarIds#AUSY}.
   *   <li>Then return {@link HolidayCalendarIds#AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#combinedWith(HolidayCalendarId)}
   */
  @Test
  @DisplayName("Test combinedWith(HolidayCalendarId); given AUSY; when AUSY; then return AUSY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.combinedWith(HolidayCalendarId)"})
  void testCombinedWith_givenAusy_whenAusy_thenReturnAusy() {
    // Arrange
    HolidayCalendarId other = HolidayCalendarIds.AUSY;

    // Act
    HolidayCalendarId actualCombinedWithResult = HolidayCalendarIds.AUSY.combinedWith(other);

    // Assert
    assertSame(other, actualCombinedWithResult);
  }

  /**
   * Test {@link HolidayCalendarId#combinedWith(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendarIds#BRBD}.
   *   <li>When {@link HolidayCalendarIds#AUSY}.
   *   <li>Then return Name is {@code AUSY+BRBD}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#combinedWith(HolidayCalendarId)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(HolidayCalendarId); given BRBD; when AUSY; then return Name is 'AUSY+BRBD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.combinedWith(HolidayCalendarId)"})
  void testCombinedWith_givenBrbd_whenAusy_thenReturnNameIsAusyBrbd() {
    // Arrange and Act
    HolidayCalendarId actualCombinedWithResult =
        HolidayCalendarIds.BRBD.combinedWith(HolidayCalendarIds.AUSY);

    // Assert
    assertEquals("AUSY+BRBD", actualCombinedWithResult.getName());
    assertEquals("AUSY+BRBD", actualCombinedWithResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualCombinedWithResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#combinedWith(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendarIds#BRBD}.
   *   <li>When {@link HolidayCalendarIds#NO_HOLIDAYS}.
   *   <li>Then return {@link HolidayCalendarIds#BRBD}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#combinedWith(HolidayCalendarId)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(HolidayCalendarId); given BRBD; when NO_HOLIDAYS; then return BRBD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.combinedWith(HolidayCalendarId)"})
  void testCombinedWith_givenBrbd_whenNo_holidays_thenReturnBrbd() {
    // Arrange
    HolidayCalendarId holidayCalendarId = HolidayCalendarIds.BRBD;

    // Act
    HolidayCalendarId actualCombinedWithResult =
        holidayCalendarId.combinedWith(HolidayCalendarIds.NO_HOLIDAYS);

    // Assert
    assertSame(holidayCalendarId, actualCombinedWithResult);
  }

  /**
   * Test {@link HolidayCalendarId#combinedWith(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendarIds#CAMO}.
   *   <li>When {@link HolidayCalendarIds#BRBD}.
   *   <li>Then return Name is {@code BRBD+CAMO}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#combinedWith(HolidayCalendarId)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(HolidayCalendarId); given CAMO; when BRBD; then return Name is 'BRBD+CAMO'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.combinedWith(HolidayCalendarId)"})
  void testCombinedWith_givenCamo_whenBrbd_thenReturnNameIsBrbdCamo() {
    // Arrange and Act
    HolidayCalendarId actualCombinedWithResult =
        HolidayCalendarIds.CAMO.combinedWith(HolidayCalendarIds.BRBD);

    // Assert
    assertEquals("BRBD+CAMO", actualCombinedWithResult.getName());
    assertEquals("BRBD+CAMO", actualCombinedWithResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualCombinedWithResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#combinedWith(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendarIds#NO_HOLIDAYS}.
   *   <li>When {@link HolidayCalendarIds#AUSY}.
   *   <li>Then return {@link HolidayCalendarIds#AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#combinedWith(HolidayCalendarId)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(HolidayCalendarId); given NO_HOLIDAYS; when AUSY; then return AUSY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.combinedWith(HolidayCalendarId)"})
  void testCombinedWith_givenNo_holidays_whenAusy_thenReturnAusy() {
    // Arrange
    HolidayCalendarId other = HolidayCalendarIds.AUSY;

    // Act
    HolidayCalendarId actualCombinedWithResult = HolidayCalendarIds.NO_HOLIDAYS.combinedWith(other);

    // Assert
    assertSame(other, actualCombinedWithResult);
  }

  /**
   * Test {@link HolidayCalendarId#linkedWith(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendarIds#AUSY}.
   *   <li>When {@link HolidayCalendarIds#AUSY}.
   *   <li>Then return {@link HolidayCalendarIds#AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#linkedWith(HolidayCalendarId)}
   */
  @Test
  @DisplayName("Test linkedWith(HolidayCalendarId); given AUSY; when AUSY; then return AUSY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.linkedWith(HolidayCalendarId)"})
  void testLinkedWith_givenAusy_whenAusy_thenReturnAusy() {
    // Arrange
    HolidayCalendarId other = HolidayCalendarIds.AUSY;

    // Act
    HolidayCalendarId actualLinkedWithResult = HolidayCalendarIds.AUSY.linkedWith(other);

    // Assert
    assertSame(other, actualLinkedWithResult);
  }

  /**
   * Test {@link HolidayCalendarId#linkedWith(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendarIds#BRBD}.
   *   <li>When {@link HolidayCalendarIds#AUSY}.
   *   <li>Then return Name is {@code AUSY~BRBD}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#linkedWith(HolidayCalendarId)}
   */
  @Test
  @DisplayName(
      "Test linkedWith(HolidayCalendarId); given BRBD; when AUSY; then return Name is 'AUSY~BRBD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.linkedWith(HolidayCalendarId)"})
  void testLinkedWith_givenBrbd_whenAusy_thenReturnNameIsAusyBrbd() {
    // Arrange and Act
    HolidayCalendarId actualLinkedWithResult =
        HolidayCalendarIds.BRBD.linkedWith(HolidayCalendarIds.AUSY);

    // Assert
    assertEquals("AUSY~BRBD", actualLinkedWithResult.getName());
    assertEquals("AUSY~BRBD", actualLinkedWithResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualLinkedWithResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#linkedWith(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendarIds#BRBD}.
   *   <li>When {@link HolidayCalendarIds#NO_HOLIDAYS}.
   *   <li>Then return {@link HolidayCalendarIds#NO_HOLIDAYS}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#linkedWith(HolidayCalendarId)}
   */
  @Test
  @DisplayName(
      "Test linkedWith(HolidayCalendarId); given BRBD; when NO_HOLIDAYS; then return NO_HOLIDAYS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.linkedWith(HolidayCalendarId)"})
  void testLinkedWith_givenBrbd_whenNo_holidays_thenReturnNo_holidays() {
    // Arrange
    HolidayCalendarId other = HolidayCalendarIds.NO_HOLIDAYS;

    // Act
    HolidayCalendarId actualLinkedWithResult = HolidayCalendarIds.BRBD.linkedWith(other);

    // Assert
    assertSame(other, actualLinkedWithResult);
  }

  /**
   * Test {@link HolidayCalendarId#linkedWith(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendarIds#CAMO}.
   *   <li>When {@link HolidayCalendarIds#BRBD}.
   *   <li>Then return Name is {@code BRBD~CAMO}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#linkedWith(HolidayCalendarId)}
   */
  @Test
  @DisplayName(
      "Test linkedWith(HolidayCalendarId); given CAMO; when BRBD; then return Name is 'BRBD~CAMO'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.linkedWith(HolidayCalendarId)"})
  void testLinkedWith_givenCamo_whenBrbd_thenReturnNameIsBrbdCamo() {
    // Arrange and Act
    HolidayCalendarId actualLinkedWithResult =
        HolidayCalendarIds.CAMO.linkedWith(HolidayCalendarIds.BRBD);

    // Assert
    assertEquals("BRBD~CAMO", actualLinkedWithResult.getName());
    assertEquals("BRBD~CAMO", actualLinkedWithResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualLinkedWithResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarId#linkedWith(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendarIds#NO_HOLIDAYS}.
   *   <li>When {@link HolidayCalendarIds#AUSY}.
   *   <li>Then return {@link HolidayCalendarIds#NO_HOLIDAYS}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#linkedWith(HolidayCalendarId)}
   */
  @Test
  @DisplayName(
      "Test linkedWith(HolidayCalendarId); given NO_HOLIDAYS; when AUSY; then return NO_HOLIDAYS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarId.linkedWith(HolidayCalendarId)"})
  void testLinkedWith_givenNo_holidays_whenAusy_thenReturnNo_holidays() {
    // Arrange
    HolidayCalendarId holidayCalendarId = HolidayCalendarIds.NO_HOLIDAYS;

    // Act
    HolidayCalendarId actualLinkedWithResult =
        holidayCalendarId.linkedWith(HolidayCalendarIds.AUSY);

    // Assert
    assertSame(holidayCalendarId, actualLinkedWithResult);
  }

  /**
   * Test {@link HolidayCalendarId#equals(Object)}, and {@link HolidayCalendarId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HolidayCalendarId#equals(Object)}
   *   <li>{@link HolidayCalendarId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HolidayCalendarId.equals(Object)",
    "int HolidayCalendarId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HolidayCalendarId holidayCalendarId = HolidayCalendarIds.AUSY;
    HolidayCalendarId holidayCalendarId2 = HolidayCalendarIds.AUSY;

    // Act and Assert
    assertEquals(holidayCalendarId, holidayCalendarId2);
    assertEquals(holidayCalendarId.hashCode(), holidayCalendarId2.hashCode());
  }

  /**
   * Test {@link HolidayCalendarId#equals(Object)}, and {@link HolidayCalendarId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HolidayCalendarId#equals(Object)}
   *   <li>{@link HolidayCalendarId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HolidayCalendarId.equals(Object)",
    "int HolidayCalendarId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HolidayCalendarId holidayCalendarId = HolidayCalendarIds.AUSY;

    // Act and Assert
    assertEquals(holidayCalendarId, holidayCalendarId);
    int expectedHashCodeResult = holidayCalendarId.hashCode();
    assertEquals(expectedHashCodeResult, holidayCalendarId.hashCode());
  }

  /**
   * Test {@link HolidayCalendarId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HolidayCalendarId.equals(Object)",
    "int HolidayCalendarId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(HolidayCalendarIds.BRBD, HolidayCalendarIds.AUSY);
  }

  /**
   * Test {@link HolidayCalendarId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HolidayCalendarId.equals(Object)",
    "int HolidayCalendarId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(HolidayCalendarIds.AUSY, null);
  }

  /**
   * Test {@link HolidayCalendarId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HolidayCalendarId.equals(Object)",
    "int HolidayCalendarId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(HolidayCalendarIds.AUSY, "Different type to HolidayCalendarId");
  }
}
