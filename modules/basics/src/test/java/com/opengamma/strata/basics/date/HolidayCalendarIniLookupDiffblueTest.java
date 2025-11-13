package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import java.time.DayOfWeek;
import java.util.Map;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HolidayCalendarIniLookupDiffblueTest {
  /**
   * Test {@link HolidayCalendarIniLookup#lookupAll()}.
   *
   * <p>Method under test: {@link HolidayCalendarIniLookup#lookupAll()}
   */
  @Test
  @DisplayName("Test lookupAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map HolidayCalendarIniLookup.lookupAll()"})
  void testLookupAll() {
    // Arrange and Act
    Map<String, HolidayCalendar> actualLookupAllResult =
        HolidayCalendarIniLookup.INSTANCE.lookupAll();

    // Assert
    assertEquals(1, actualLookupAllResult.size());
    HolidayCalendar getResult = actualLookupAllResult.get("THBA");
    assertTrue(getResult instanceof ImmutableHolidayCalendar);
    assertEquals("THBA", getResult.getName());
    HolidayCalendarId id = getResult.getId();
    assertEquals("THBA", id.getName());
    assertEquals("THBA", id.toString());
    assertEquals(1161, ((ImmutableHolidayCalendar) getResult).getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = ((ImmutableHolidayCalendar) getResult).getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(((ImmutableHolidayCalendar) getResult).getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarIniLookup#defaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarIniLookup#defaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test defaultByCurrency(Currency); when AED; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarIniLookup.defaultByCurrency(Currency)"})
  void testDefaultByCurrency_whenAed_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> HolidayCalendarIniLookup.INSTANCE.defaultByCurrency(Currency.AED));
  }

  /**
   * Test {@link HolidayCalendarIniLookup#defaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AUD}.
   *   <li>Then return Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarIniLookup#defaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test defaultByCurrency(Currency); when AUD; then return Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarIniLookup.defaultByCurrency(Currency)"})
  void testDefaultByCurrency_whenAud_thenReturnNameIsAusy() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyResult =
        HolidayCalendarIniLookup.INSTANCE.defaultByCurrency(Currency.AUD);

    // Assert
    assertEquals("AUSY", actualDefaultByCurrencyResult.getName());
    assertEquals("AUSY", actualDefaultByCurrencyResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualDefaultByCurrencyResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarIniLookup#defaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#CLP}.
   *   <li>Then return Name is {@code CLSA}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarIniLookup#defaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test defaultByCurrency(Currency); when CLP; then return Name is 'CLSA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarIniLookup.defaultByCurrency(Currency)"})
  void testDefaultByCurrency_whenClp_thenReturnNameIsClsa() {
    // Arrange and Act
    HolidayCalendarId actualDefaultByCurrencyResult =
        HolidayCalendarIniLookup.INSTANCE.defaultByCurrency(Currency.CLP);

    // Assert
    assertEquals("CLSA", actualDefaultByCurrencyResult.getName());
    assertEquals("CLSA", actualDefaultByCurrencyResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualDefaultByCurrencyResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarIniLookup#defaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarIniLookup#defaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test defaultByCurrency(Currency); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId HolidayCalendarIniLookup.defaultByCurrency(Currency)"})
  void testDefaultByCurrency_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> HolidayCalendarIniLookup.INSTANCE.defaultByCurrency(null));
  }

  /**
   * Test {@link HolidayCalendarIniLookup#findDefaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarIniLookup#findDefaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test findDefaultByCurrency(Currency); when AED; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional HolidayCalendarIniLookup.findDefaultByCurrency(Currency)"})
  void testFindDefaultByCurrency_whenAed_thenReturnNotPresent() {
    // Arrange, Act and Assert
    assertFalse(HolidayCalendarIniLookup.INSTANCE.findDefaultByCurrency(Currency.AED).isPresent());
  }

  /**
   * Test {@link HolidayCalendarIniLookup#findDefaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AUD}.
   *   <li>Then return {@link Optional#get()} Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarIniLookup#findDefaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test findDefaultByCurrency(Currency); when AUD; then return get() Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional HolidayCalendarIniLookup.findDefaultByCurrency(Currency)"})
  void testFindDefaultByCurrency_whenAud_thenReturnGetNameIsAusy() {
    // Arrange and Act
    Optional<HolidayCalendarId> actualFindDefaultByCurrencyResult =
        HolidayCalendarIniLookup.INSTANCE.findDefaultByCurrency(Currency.AUD);

    // Assert
    HolidayCalendarId getResult = actualFindDefaultByCurrencyResult.get();
    assertEquals("AUSY", getResult.getName());
    assertEquals("AUSY", getResult.toString());
    assertTrue(actualFindDefaultByCurrencyResult.isPresent());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, getResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarIniLookup#findDefaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#CLP}.
   *   <li>Then return {@link Optional#get()} Name is {@code CLSA}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarIniLookup#findDefaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test findDefaultByCurrency(Currency); when CLP; then return get() Name is 'CLSA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional HolidayCalendarIniLookup.findDefaultByCurrency(Currency)"})
  void testFindDefaultByCurrency_whenClp_thenReturnGetNameIsClsa() {
    // Arrange and Act
    Optional<HolidayCalendarId> actualFindDefaultByCurrencyResult =
        HolidayCalendarIniLookup.INSTANCE.findDefaultByCurrency(Currency.CLP);

    // Assert
    HolidayCalendarId getResult = actualFindDefaultByCurrencyResult.get();
    assertEquals("CLSA", getResult.getName());
    assertEquals("CLSA", getResult.toString());
    assertTrue(actualFindDefaultByCurrencyResult.isPresent());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, getResult.getReferenceDataType());
  }

  /**
   * Test {@link HolidayCalendarIniLookup#findDefaultByCurrency(Currency)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarIniLookup#findDefaultByCurrency(Currency)}
   */
  @Test
  @DisplayName("Test findDefaultByCurrency(Currency); when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional HolidayCalendarIniLookup.findDefaultByCurrency(Currency)"})
  void testFindDefaultByCurrency_whenNull_thenReturnNotPresent() {
    // Arrange, Act and Assert
    assertFalse(HolidayCalendarIniLookup.INSTANCE.findDefaultByCurrency(null).isPresent());
  }

  /**
   * Test {@link HolidayCalendarIniLookup#loadFromIni(String)}.
   *
   * <ul>
   *   <li>When {@code HolidayCalendarDefaultData.ini}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarIniLookup#loadFromIni(String)}
   */
  @Test
  @DisplayName("Test loadFromIni(String); when 'HolidayCalendarDefaultData.ini'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap HolidayCalendarIniLookup.loadFromIni(String)"})
  void testLoadFromIni_whenHolidayCalendarDefaultDataIni_thenReturnEmpty() {
    // Arrange and Act
    ImmutableMap<String, HolidayCalendar> actualLoadFromIniResult =
        HolidayCalendarIniLookup.loadFromIni("HolidayCalendarDefaultData.ini");

    // Assert
    assertTrue(actualLoadFromIniResult.isEmpty());
  }

  /**
   * Test {@link HolidayCalendarIniLookup#loadDefaultsFromIni(String)}.
   *
   * <ul>
   *   <li>Then return size is thirty-one.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendarIniLookup#loadDefaultsFromIni(String)}
   */
  @Test
  @DisplayName("Test loadDefaultsFromIni(String); then return size is thirty-one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap HolidayCalendarIniLookup.loadDefaultsFromIni(String)"})
  void testLoadDefaultsFromIni_thenReturnSizeIsThirtyOne() {
    // Arrange and Act
    ImmutableMap<Currency, HolidayCalendarId> actualLoadDefaultsFromIniResult =
        HolidayCalendarIniLookup.loadDefaultsFromIni("HolidayCalendarDefaultData.ini");

    // Assert
    assertEquals(31, actualLoadDefaultsFromIniResult.size());
  }
}
