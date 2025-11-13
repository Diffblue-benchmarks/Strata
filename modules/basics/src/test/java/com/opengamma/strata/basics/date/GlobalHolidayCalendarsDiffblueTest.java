package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import java.time.DayOfWeek;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GlobalHolidayCalendarsDiffblueTest {
  /**
   * Test {@link GlobalHolidayCalendars#generateFrankfurt()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateFrankfurt()}
   */
  @Test
  @DisplayName("Test generateFrankfurt()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateFrankfurt()"})
  void testGenerateFrankfurt() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateFrankfurtResult =
        GlobalHolidayCalendars.generateFrankfurt();

    // Assert
    assertEquals("DEFR", actualGenerateFrankfurtResult.getName());
    HolidayCalendarId id = actualGenerateFrankfurtResult.getId();
    assertEquals("DEFR", id.getName());
    assertEquals("DEFR", id.toString());
    assertEquals(1513, actualGenerateFrankfurtResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateFrankfurtResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateFrankfurtResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateZurich()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateZurich()}
   */
  @Test
  @DisplayName("Test generateZurich()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateZurich()"})
  void testGenerateZurich() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateZurichResult = GlobalHolidayCalendars.generateZurich();

    // Assert
    assertEquals("CHZU", actualGenerateZurichResult.getName());
    HolidayCalendarId id = actualGenerateZurichResult.getId();
    assertEquals("CHZU", id.getName());
    assertEquals("CHZU", id.toString());
    assertEquals(1246, actualGenerateZurichResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateZurichResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateZurichResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateEuropeanTarget()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateEuropeanTarget()}
   */
  @Test
  @DisplayName("Test generateEuropeanTarget()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateEuropeanTarget()"})
  void testGenerateEuropeanTarget() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateEuropeanTargetResult =
        GlobalHolidayCalendars.generateEuropeanTarget();

    // Assert
    assertEquals("EUTA", actualGenerateEuropeanTargetResult.getName());
    HolidayCalendarId id = actualGenerateEuropeanTargetResult.getId();
    assertEquals("EUTA", id.getName());
    assertEquals("EUTA", id.toString());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateEuropeanTargetResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertEquals(494, actualGenerateEuropeanTargetResult.getHolidays().size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateEuropeanTargetResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateUsGovtSecurities()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateUsGovtSecurities()}
   */
  @Test
  @DisplayName("Test generateUsGovtSecurities()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateUsGovtSecurities()"})
  void testGenerateUsGovtSecurities() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateUsGovtSecuritiesResult =
        GlobalHolidayCalendars.generateUsGovtSecurities();

    // Assert
    assertEquals("USGS", actualGenerateUsGovtSecuritiesResult.getName());
    HolidayCalendarId id = actualGenerateUsGovtSecuritiesResult.getId();
    assertEquals("USGS", id.getName());
    assertEquals("USGS", id.toString());
    assertEquals(1643, actualGenerateUsGovtSecuritiesResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateUsGovtSecuritiesResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateUsGovtSecuritiesResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateUsNewYork()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateUsNewYork()}
   */
  @Test
  @DisplayName("Test generateUsNewYork()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateUsNewYork()"})
  void testGenerateUsNewYork() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateUsNewYorkResult =
        GlobalHolidayCalendars.generateUsNewYork();

    // Assert
    assertEquals("USNY", actualGenerateUsNewYorkResult.getName());
    HolidayCalendarId id = actualGenerateUsNewYorkResult.getId();
    assertEquals("USNY", id.getName());
    assertEquals("USNY", id.toString());
    assertEquals(1448, actualGenerateUsNewYorkResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateUsNewYorkResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateUsNewYorkResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateNewYorkFed()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateNewYorkFed()}
   */
  @Test
  @DisplayName("Test generateNewYorkFed()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateNewYorkFed()"})
  void testGenerateNewYorkFed() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateNewYorkFedResult =
        GlobalHolidayCalendars.generateNewYorkFed();

    // Assert
    assertEquals("NYFD", actualGenerateNewYorkFedResult.getName());
    HolidayCalendarId id = actualGenerateNewYorkFedResult.getId();
    assertEquals("NYFD", id.getName());
    assertEquals("NYFD", id.toString());
    assertEquals(1448, actualGenerateNewYorkFedResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateNewYorkFedResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateNewYorkFedResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateNewYorkStockExchange()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateNewYorkStockExchange()}
   */
  @Test
  @DisplayName("Test generateNewYorkStockExchange()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar GlobalHolidayCalendars.generateNewYorkStockExchange()"
  })
  void testGenerateNewYorkStockExchange() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateNewYorkStockExchangeResult =
        GlobalHolidayCalendars.generateNewYorkStockExchange();

    // Assert
    assertEquals("NYSE", actualGenerateNewYorkStockExchangeResult.getName());
    HolidayCalendarId id = actualGenerateNewYorkStockExchangeResult.getId();
    assertEquals("NYSE", id.getName());
    assertEquals("NYSE", id.toString());
    assertEquals(1435, actualGenerateNewYorkStockExchangeResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateNewYorkStockExchangeResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateNewYorkStockExchangeResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateMontreal()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateMontreal()}
   */
  @Test
  @DisplayName("Test generateMontreal()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateMontreal()"})
  void testGenerateMontreal() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateMontrealResult =
        GlobalHolidayCalendars.generateMontreal();

    // Assert
    assertEquals("CAMO", actualGenerateMontrealResult.getName());
    HolidayCalendarId id = actualGenerateMontrealResult.getId();
    assertEquals("CAMO", id.getName());
    assertEquals("CAMO", id.toString());
    assertEquals(1200, actualGenerateMontrealResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateMontrealResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateMontrealResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateOslo()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateOslo()}
   */
  @Test
  @DisplayName("Test generateOslo()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateOslo()"})
  void testGenerateOslo() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateOsloResult = GlobalHolidayCalendars.generateOslo();

    // Assert
    assertEquals("NOOS", actualGenerateOsloResult.getName());
    HolidayCalendarId id = actualGenerateOsloResult.getId();
    assertEquals("NOOS", id.getName());
    assertEquals("NOOS", id.toString());
    assertEquals(1496, actualGenerateOsloResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateOsloResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateOsloResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateAuckland()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateAuckland()}
   */
  @Test
  @DisplayName("Test generateAuckland()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateAuckland()"})
  void testGenerateAuckland() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateAucklandResult =
        GlobalHolidayCalendars.generateAuckland();

    // Assert
    assertEquals("NZAU", actualGenerateAucklandResult.getName());
    HolidayCalendarId id = actualGenerateAucklandResult.getId();
    assertEquals("NZAU", id.getName());
    assertEquals("NZAU", id.toString());
    assertEquals(1612, actualGenerateAucklandResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateAucklandResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateAucklandResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateWellington()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateWellington()}
   */
  @Test
  @DisplayName("Test generateWellington()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateWellington()"})
  void testGenerateWellington() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateWellingtonResult =
        GlobalHolidayCalendars.generateWellington();

    // Assert
    assertEquals("NZWE", actualGenerateWellingtonResult.getName());
    HolidayCalendarId id = actualGenerateWellingtonResult.getId();
    assertEquals("NZWE", id.getName());
    assertEquals("NZWE", id.toString());
    assertEquals(1612, actualGenerateWellingtonResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateWellingtonResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateWellingtonResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateNewZealand()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateNewZealand()}
   */
  @Test
  @DisplayName("Test generateNewZealand()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateNewZealand()"})
  void testGenerateNewZealand() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateNewZealandResult =
        GlobalHolidayCalendars.generateNewZealand();

    // Assert
    assertEquals("NZBD", actualGenerateNewZealandResult.getName());
    HolidayCalendarId id = actualGenerateNewZealandResult.getId();
    assertEquals("NZBD", id.getName());
    assertEquals("NZBD", id.toString());
    assertEquals(1462, actualGenerateNewZealandResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateNewZealandResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateNewZealandResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateWarsaw()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateWarsaw()}
   */
  @Test
  @DisplayName("Test generateWarsaw()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateWarsaw()"})
  void testGenerateWarsaw() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateWarsawResult = GlobalHolidayCalendars.generateWarsaw();

    // Assert
    assertEquals("PLWA", actualGenerateWarsawResult.getName());
    HolidayCalendarId id = actualGenerateWarsawResult.getId();
    assertEquals("PLWA", id.getName());
    assertEquals("PLWA", id.toString());
    assertEquals(1354, actualGenerateWarsawResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateWarsawResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateWarsawResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateSydney()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateSydney()}
   */
  @Test
  @DisplayName("Test generateSydney()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateSydney()"})
  void testGenerateSydney() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateSydneyResult = GlobalHolidayCalendars.generateSydney();

    // Assert
    assertEquals("AUSY", actualGenerateSydneyResult.getName());
    HolidayCalendarId id = actualGenerateSydneyResult.getId();
    assertEquals("AUSY", id.getName());
    assertEquals("AUSY", id.toString());
    assertEquals(1456, actualGenerateSydneyResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateSydneyResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateSydneyResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generateBrazil()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generateBrazil()}
   */
  @Test
  @DisplayName("Test generateBrazil()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generateBrazil()"})
  void testGenerateBrazil() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGenerateBrazilResult = GlobalHolidayCalendars.generateBrazil();

    // Assert
    assertEquals("BRBD", actualGenerateBrazilResult.getName());
    HolidayCalendarId id = actualGenerateBrazilResult.getId();
    assertEquals("BRBD", id.getName());
    assertEquals("BRBD", id.toString());
    assertEquals(1488, actualGenerateBrazilResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGenerateBrazilResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGenerateBrazilResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#generatePrague()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#generatePrague()}
   */
  @Test
  @DisplayName("Test generatePrague()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar GlobalHolidayCalendars.generatePrague()"})
  void testGeneratePrague() {
    // Arrange and Act
    ImmutableHolidayCalendar actualGeneratePragueResult = GlobalHolidayCalendars.generatePrague();

    // Assert
    assertEquals("CZPR", actualGeneratePragueResult.getName());
    HolidayCalendarId id = actualGeneratePragueResult.getId();
    assertEquals("CZPR", id.getName());
    assertEquals("CZPR", id.toString());
    assertEquals(1414, actualGeneratePragueResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualGeneratePragueResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(weekendDays.contains(DayOfWeek.SUNDAY));
    assertTrue(actualGeneratePragueResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link GlobalHolidayCalendars#christmasBumpedSatSun(int)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return toString is {@code 0005-12-27}.
   * </ul>
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#christmasBumpedSatSun(int)}
   */
  @Test
  @DisplayName("Test christmasBumpedSatSun(int); when five; then return toString is '0005-12-27'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate GlobalHolidayCalendars.christmasBumpedSatSun(int)"})
  void testChristmasBumpedSatSun_whenFive_thenReturnToStringIs00051227() {
    // Arrange and Act
    LocalDate actualChristmasBumpedSatSunResult = GlobalHolidayCalendars.christmasBumpedSatSun(5);

    // Assert
    assertEquals("0005-12-27", actualChristmasBumpedSatSunResult.toString());
  }

  /**
   * Test {@link GlobalHolidayCalendars#christmasBumpedSatSun(int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return toString is {@code -0001-12-27}.
   * </ul>
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#christmasBumpedSatSun(int)}
   */
  @Test
  @DisplayName(
      "Test christmasBumpedSatSun(int); when minus one; then return toString is '-0001-12-27'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate GlobalHolidayCalendars.christmasBumpedSatSun(int)"})
  void testChristmasBumpedSatSun_whenMinusOne_thenReturnToStringIs00011227() {
    // Arrange and Act
    LocalDate actualChristmasBumpedSatSunResult = GlobalHolidayCalendars.christmasBumpedSatSun(-1);

    // Assert
    assertEquals("-0001-12-27", actualChristmasBumpedSatSunResult.toString());
  }

  /**
   * Test {@link GlobalHolidayCalendars#christmasBumpedSatSun(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toString is {@code 0001-12-25}.
   * </ul>
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#christmasBumpedSatSun(int)}
   */
  @Test
  @DisplayName("Test christmasBumpedSatSun(int); when one; then return toString is '0001-12-25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate GlobalHolidayCalendars.christmasBumpedSatSun(int)"})
  void testChristmasBumpedSatSun_whenOne_thenReturnToStringIs00011225() {
    // Arrange and Act
    LocalDate actualChristmasBumpedSatSunResult = GlobalHolidayCalendars.christmasBumpedSatSun(1);

    // Assert
    assertEquals("0001-12-25", actualChristmasBumpedSatSunResult.toString());
  }

  /**
   * Test {@link GlobalHolidayCalendars#boxingDayBumpedSatSun(int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return toString is {@code -0001-12-28}.
   * </ul>
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#boxingDayBumpedSatSun(int)}
   */
  @Test
  @DisplayName(
      "Test boxingDayBumpedSatSun(int); when minus one; then return toString is '-0001-12-28'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate GlobalHolidayCalendars.boxingDayBumpedSatSun(int)"})
  void testBoxingDayBumpedSatSun_whenMinusOne_thenReturnToStringIs00011228() {
    // Arrange and Act
    LocalDate actualBoxingDayBumpedSatSunResult = GlobalHolidayCalendars.boxingDayBumpedSatSun(-1);

    // Assert
    assertEquals("-0001-12-28", actualBoxingDayBumpedSatSunResult.toString());
  }

  /**
   * Test {@link GlobalHolidayCalendars#boxingDayBumpedSatSun(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toString is {@code 0001-12-26}.
   * </ul>
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#boxingDayBumpedSatSun(int)}
   */
  @Test
  @DisplayName("Test boxingDayBumpedSatSun(int); when one; then return toString is '0001-12-26'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate GlobalHolidayCalendars.boxingDayBumpedSatSun(int)"})
  void testBoxingDayBumpedSatSun_whenOne_thenReturnToStringIs00011226() {
    // Arrange and Act
    LocalDate actualBoxingDayBumpedSatSunResult = GlobalHolidayCalendars.boxingDayBumpedSatSun(1);

    // Assert
    assertEquals("0001-12-26", actualBoxingDayBumpedSatSunResult.toString());
  }

  /**
   * Test {@link GlobalHolidayCalendars#boxingDayBumpedSatSun(int)}.
   *
   * <ul>
   *   <li>When twenty-six.
   *   <li>Then return toString is {@code 0026-12-28}.
   * </ul>
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#boxingDayBumpedSatSun(int)}
   */
  @Test
  @DisplayName(
      "Test boxingDayBumpedSatSun(int); when twenty-six; then return toString is '0026-12-28'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate GlobalHolidayCalendars.boxingDayBumpedSatSun(int)"})
  void testBoxingDayBumpedSatSun_whenTwentySix_thenReturnToStringIs00261228() {
    // Arrange and Act
    LocalDate actualBoxingDayBumpedSatSunResult = GlobalHolidayCalendars.boxingDayBumpedSatSun(26);

    // Assert
    assertEquals("0026-12-28", actualBoxingDayBumpedSatSunResult.toString());
  }

  /**
   * Test {@link GlobalHolidayCalendars#easter(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toString is {@code 0001-04-01}.
   * </ul>
   *
   * <p>Method under test: {@link GlobalHolidayCalendars#easter(int)}
   */
  @Test
  @DisplayName("Test easter(int); when one; then return toString is '0001-04-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate GlobalHolidayCalendars.easter(int)"})
  void testEaster_whenOne_thenReturnToStringIs00010401() {
    // Arrange and Act
    LocalDate actualEasterResult = GlobalHolidayCalendars.easter(1);

    // Assert
    assertEquals("0001-04-01", actualEasterResult.toString());
  }
}
