package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DaysAdjustment.Builder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketTenorDiffblueTest {
  /**
   * Test {@link MarketTenor#ofSpot(Tenor)}.
   *
   * <ul>
   *   <li>When {@link Tenor#TENOR_1D}.
   *   <li>Then return Code is {@code SN}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#ofSpot(Tenor)}
   */
  @Test
  @DisplayName("Test ofSpot(Tenor); when TENOR_1D; then return Code is 'SN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.ofSpot(Tenor)"})
  void testOfSpot_whenTenor_1d_thenReturnCodeIsSn() {
    // Arrange and Act
    MarketTenor actualOfSpotResult = MarketTenor.ofSpot(Tenor.TENOR_1D);

    // Assert
    assertEquals("SN", actualOfSpotResult.getCode());
    assertEquals("SN", actualOfSpotResult.toString());
    assertEquals(Tenor.TENOR_1D, actualOfSpotResult.getTenor());
  }

  /**
   * Test {@link MarketTenor#ofSpot(Tenor)}.
   *
   * <ul>
   *   <li>When {@link Tenor#TENOR_1W}.
   *   <li>Then return Code is {@code SW}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#ofSpot(Tenor)}
   */
  @Test
  @DisplayName("Test ofSpot(Tenor); when TENOR_1W; then return Code is 'SW'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.ofSpot(Tenor)"})
  void testOfSpot_whenTenor_1w_thenReturnCodeIsSw() {
    // Arrange and Act
    MarketTenor actualOfSpotResult = MarketTenor.ofSpot(Tenor.TENOR_1W);

    // Assert
    assertEquals("SW", actualOfSpotResult.getCode());
    assertEquals("SW", actualOfSpotResult.toString());
    assertEquals(Tenor.TENOR_1W, actualOfSpotResult.getTenor());
  }

  /**
   * Test {@link MarketTenor#ofSpot(Tenor)}.
   *
   * <ul>
   *   <li>When {@link Tenor#TENOR_10M}.
   *   <li>Then return Code is {@code 10M}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#ofSpot(Tenor)}
   */
  @Test
  @DisplayName("Test ofSpot(Tenor); when TENOR_10M; then return Code is '10M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.ofSpot(Tenor)"})
  void testOfSpot_whenTenor_10m_thenReturnCodeIs10m() {
    // Arrange and Act
    MarketTenor actualOfSpotResult = MarketTenor.ofSpot(Tenor.TENOR_10M);

    // Assert
    assertEquals("10M", actualOfSpotResult.getCode());
    assertEquals("10M", actualOfSpotResult.toString());
    assertSame(Tenor.TENOR_10M, actualOfSpotResult.getTenor());
  }

  /**
   * Test {@link MarketTenor#ofSpotDays(int)}.
   *
   * <ul>
   *   <li>When {@code 2527}.
   *   <li>Then return Code is {@code 361W}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#ofSpotDays(int)}
   */
  @Test
  @DisplayName("Test ofSpotDays(int); when '2527'; then return Code is '361W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.ofSpotDays(int)"})
  void testOfSpotDays_when2527_thenReturnCodeIs361w() {
    // Arrange and Act
    MarketTenor actualOfSpotDaysResult = MarketTenor.ofSpotDays(2527);

    // Assert
    assertEquals("361W", actualOfSpotDaysResult.getCode());
    assertEquals("361W", actualOfSpotDaysResult.toString());
    Tenor tenor = actualOfSpotDaysResult.getTenor();
    assertEquals("361W", tenor.toString());
    assertEquals(2527, tenor.getPeriod().getDays());
  }

  /**
   * Test {@link MarketTenor#ofSpotDays(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Tenor toString is {@code 1D}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#ofSpotDays(int)}
   */
  @Test
  @DisplayName("Test ofSpotDays(int); when one; then return Tenor toString is '1D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.ofSpotDays(int)"})
  void testOfSpotDays_whenOne_thenReturnTenorToStringIs1d() {
    // Arrange and Act
    MarketTenor actualOfSpotDaysResult = MarketTenor.ofSpotDays(1);

    // Assert
    Tenor tenor = actualOfSpotDaysResult.getTenor();
    assertEquals("1D", tenor.toString());
    assertEquals("SN", actualOfSpotDaysResult.getCode());
    assertEquals("SN", actualOfSpotDaysResult.toString());
    assertEquals(1, tenor.getPeriod().getDays());
  }

  /**
   * Test {@link MarketTenor#ofSpotDays(int)}.
   *
   * <ul>
   *   <li>When seven.
   *   <li>Then return Tenor toString is {@code 1W}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#ofSpotDays(int)}
   */
  @Test
  @DisplayName("Test ofSpotDays(int); when seven; then return Tenor toString is '1W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.ofSpotDays(int)"})
  void testOfSpotDays_whenSeven_thenReturnTenorToStringIs1w() {
    // Arrange and Act
    MarketTenor actualOfSpotDaysResult = MarketTenor.ofSpotDays(7);

    // Assert
    Tenor tenor = actualOfSpotDaysResult.getTenor();
    assertEquals("1W", tenor.toString());
    assertEquals("SW", actualOfSpotDaysResult.getCode());
    assertEquals("SW", actualOfSpotDaysResult.toString());
    assertEquals(7, tenor.getPeriod().getDays());
  }

  /**
   * Test {@link MarketTenor#ofSpotDays(int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return Code is {@code 2D}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#ofSpotDays(int)}
   */
  @Test
  @DisplayName("Test ofSpotDays(int); when two; then return Code is '2D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.ofSpotDays(int)"})
  void testOfSpotDays_whenTwo_thenReturnCodeIs2d() {
    // Arrange and Act
    MarketTenor actualOfSpotDaysResult = MarketTenor.ofSpotDays(2);

    // Assert
    assertEquals("2D", actualOfSpotDaysResult.getCode());
    assertEquals("2D", actualOfSpotDaysResult.toString());
    Tenor tenor = actualOfSpotDaysResult.getTenor();
    assertEquals("2D", tenor.toString());
    assertEquals(2, tenor.getPeriod().getDays());
  }

  /**
   * Test {@link MarketTenor#ofSpotMonths(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Code is {@code 1M}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#ofSpotMonths(int)}
   */
  @Test
  @DisplayName("Test ofSpotMonths(int); when one; then return Code is '1M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.ofSpotMonths(int)"})
  void testOfSpotMonths_whenOne_thenReturnCodeIs1m() {
    // Arrange and Act
    MarketTenor actualOfSpotMonthsResult = MarketTenor.ofSpotMonths(1);

    // Assert
    assertEquals("1M", actualOfSpotMonthsResult.getCode());
    assertEquals("1M", actualOfSpotMonthsResult.toString());
    Tenor tenor = actualOfSpotMonthsResult.getTenor();
    assertEquals("1M", tenor.toString());
    assertEquals(3, tenor.getUnits().size());
    assertFalse(actualOfSpotMonthsResult.isNonStandardSpotLag());
    assertFalse(tenor.isWeekBased());
    assertTrue(tenor.isMonthBased());
  }

  /**
   * Test {@link MarketTenor#ofSpotYears(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Code is {@code 1Y}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#ofSpotYears(int)}
   */
  @Test
  @DisplayName("Test ofSpotYears(int); when one; then return Code is '1Y'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.ofSpotYears(int)"})
  void testOfSpotYears_whenOne_thenReturnCodeIs1y() {
    // Arrange and Act
    MarketTenor actualOfSpotYearsResult = MarketTenor.ofSpotYears(1);

    // Assert
    assertEquals("1Y", actualOfSpotYearsResult.getCode());
    assertEquals("1Y", actualOfSpotYearsResult.toString());
    Tenor tenor = actualOfSpotYearsResult.getTenor();
    assertEquals("1Y", tenor.toString());
    assertEquals(3, tenor.getUnits().size());
    assertFalse(actualOfSpotYearsResult.isNonStandardSpotLag());
    assertFalse(tenor.isWeekBased());
    assertTrue(tenor.isMonthBased());
  }

  /**
   * Test {@link MarketTenor#parse(String)}.
   *
   * <ul>
   *   <li>When {@code ON}.
   *   <li>Then return Code is {@code ON}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'ON'; then return Code is 'ON'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.parse(String)"})
  void testParse_whenOn_thenReturnCodeIsOn() {
    // Arrange and Act
    MarketTenor actualParseResult = MarketTenor.parse("ON");

    // Assert
    assertEquals("ON", actualParseResult.getCode());
    assertEquals("ON", actualParseResult.toString());
    assertTrue(actualParseResult.isNonStandardSpotLag());
  }

  /**
   * Test {@link MarketTenor#parse(String)}.
   *
   * <ul>
   *   <li>When {@code SN}.
   *   <li>Then return Code is {@code SN}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'SN'; then return Code is 'SN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.parse(String)"})
  void testParse_whenSn_thenReturnCodeIsSn() {
    // Arrange and Act
    MarketTenor actualParseResult = MarketTenor.parse("SN");

    // Assert
    assertEquals("SN", actualParseResult.getCode());
    assertEquals("SN", actualParseResult.toString());
    assertFalse(actualParseResult.isNonStandardSpotLag());
  }

  /**
   * Test {@link MarketTenor#parse(String)}.
   *
   * <ul>
   *   <li>When {@code SW}.
   *   <li>Then return Tenor toString is {@code 1W}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'SW'; then return Tenor toString is '1W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.parse(String)"})
  void testParse_whenSw_thenReturnTenorToStringIs1w() {
    // Arrange and Act
    MarketTenor actualParseResult = MarketTenor.parse("SW");

    // Assert
    Tenor tenor = actualParseResult.getTenor();
    assertEquals("1W", tenor.toString());
    assertEquals("SW", actualParseResult.getCode());
    assertEquals("SW", actualParseResult.toString());
    assertEquals(7, tenor.getPeriod().getDays());
    assertTrue(tenor.isWeekBased());
  }

  /**
   * Test {@link MarketTenor#parse(String)}.
   *
   * <ul>
   *   <li>When {@code TN}.
   *   <li>Then return Code is {@code TN}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'TN'; then return Code is 'TN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor MarketTenor.parse(String)"})
  void testParse_whenTn_thenReturnCodeIsTn() {
    // Arrange and Act
    MarketTenor actualParseResult = MarketTenor.parse("TN");

    // Assert
    assertEquals("TN", actualParseResult.getCode());
    assertEquals("TN", actualParseResult.toString());
    assertTrue(actualParseResult.isNonStandardSpotLag());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketTenor#getCode()}
   *   <li>{@link MarketTenor#getTenor()}
   *   <li>{@link MarketTenor#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String MarketTenor.getCode()",
    "Tenor MarketTenor.getTenor()",
    "String MarketTenor.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    MarketTenor ofSpotDaysResult = MarketTenor.ofSpotDays(1);

    // Act
    String actualCode = ofSpotDaysResult.getCode();
    Tenor actualTenor = ofSpotDaysResult.getTenor();

    // Assert
    assertEquals("SN", actualCode);
    assertEquals("SN", ofSpotDaysResult.toString());
    assertEquals(Tenor.TENOR_1D, actualTenor);
  }

  /**
   * Test {@link MarketTenor#isNonStandardSpotLag()}.
   *
   * <ul>
   *   <li>Given {@link MarketTenor#ON}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#isNonStandardSpotLag()}
   */
  @Test
  @DisplayName("Test isNonStandardSpotLag(); given ON; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketTenor.isNonStandardSpotLag()"})
  void testIsNonStandardSpotLag_givenOn_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(MarketTenor.ON.isNonStandardSpotLag());
  }

  /**
   * Test {@link MarketTenor#isNonStandardSpotLag()}.
   *
   * <ul>
   *   <li>Given {@link MarketTenor#SN}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#isNonStandardSpotLag()}
   */
  @Test
  @DisplayName("Test isNonStandardSpotLag(); given SN; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketTenor.isNonStandardSpotLag()"})
  void testIsNonStandardSpotLag_givenSn_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MarketTenor.SN.isNonStandardSpotLag());
  }

  /**
   * Test {@link MarketTenor#adjustSpotLag(DaysAdjustment)}.
   *
   * <ul>
   *   <li>Given {@link MarketTenor#ON}.
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return Days is zero.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#adjustSpotLag(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test adjustSpotLag(DaysAdjustment); given ON; when NONE; then return Days is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment MarketTenor.adjustSpotLag(DaysAdjustment)"})
  void testAdjustSpotLag_givenOn_whenNone_thenReturnDaysIsZero() {
    // Arrange and Act
    DaysAdjustment actualAdjustSpotLagResult = MarketTenor.ON.adjustSpotLag(DaysAdjustment.NONE);

    // Assert
    HolidayCalendarId calendar = actualAdjustSpotLagResult.getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals(0, actualAdjustSpotLagResult.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, actualAdjustSpotLagResult.getAdjustment().getCalendar());
    assertSame(calendar, actualAdjustSpotLagResult.getResultCalendar());
  }

  /**
   * Test {@link MarketTenor#adjustSpotLag(DaysAdjustment)}.
   *
   * <ul>
   *   <li>Given {@link MarketTenor#SN}.
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return {@link DaysAdjustment#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#adjustSpotLag(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test adjustSpotLag(DaysAdjustment); given SN; when NONE; then return NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment MarketTenor.adjustSpotLag(DaysAdjustment)"})
  void testAdjustSpotLag_givenSn_whenNone_thenReturnNone() {
    // Arrange, Act and Assert
    assertSame(DaysAdjustment.NONE, MarketTenor.SN.adjustSpotLag(DaysAdjustment.NONE));
  }

  /**
   * Test {@link MarketTenor#adjustSpotLag(DaysAdjustment)}.
   *
   * <ul>
   *   <li>Given {@link MarketTenor#TN}.
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return Days is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#adjustSpotLag(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test adjustSpotLag(DaysAdjustment); given TN; when NONE; then return Days is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment MarketTenor.adjustSpotLag(DaysAdjustment)"})
  void testAdjustSpotLag_givenTn_whenNone_thenReturnDaysIsOne() {
    // Arrange and Act
    DaysAdjustment actualAdjustSpotLagResult = MarketTenor.TN.adjustSpotLag(DaysAdjustment.NONE);

    // Assert
    HolidayCalendarId calendar = actualAdjustSpotLagResult.getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals(1, actualAdjustSpotLagResult.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, actualAdjustSpotLagResult.getAdjustment().getCalendar());
    assertSame(calendar, actualAdjustSpotLagResult.getResultCalendar());
  }

  /**
   * Test {@link MarketTenor#adjustSpotLag(DaysAdjustment)}.
   *
   * <ul>
   *   <li>Then return ResultCalendar Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#adjustSpotLag(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test adjustSpotLag(DaysAdjustment); then return ResultCalendar Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment MarketTenor.adjustSpotLag(DaysAdjustment)"})
  void testAdjustSpotLag_thenReturnResultCalendarNameIsAusy() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();

    // Act
    DaysAdjustment actualAdjustSpotLagResult =
        MarketTenor.ON.adjustSpotLag(
            builderResult
                .adjustment(
                    BusinessDayAdjustment.builder()
                        .calendar(HolidayCalendarIds.AUSY)
                        .convention(BusinessDayConventions.FOLLOWING)
                        .build())
                .calendar(HolidayCalendarIds.AUSY)
                .days(1)
                .build());

    // Assert
    HolidayCalendarId resultCalendar = actualAdjustSpotLagResult.getResultCalendar();
    assertEquals("AUSY", resultCalendar.getName());
    assertEquals("AUSY", resultCalendar.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, resultCalendar.getReferenceDataType());
    assertSame(resultCalendar, actualAdjustSpotLagResult.getAdjustment().getCalendar());
  }

  /**
   * Test {@link MarketTenor#compareTo(MarketTenor)} with {@code MarketTenor}.
   *
   * <ul>
   *   <li>Given ofSpotMonths {@link Integer#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#compareTo(MarketTenor)}
   */
  @Test
  @DisplayName("Test compareTo(MarketTenor) with 'MarketTenor'; given ofSpotMonths MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MarketTenor.compareTo(MarketTenor)"})
  void testCompareToWithMarketTenor_givenOfSpotMonthsMax_value() {
    // Arrange
    MarketTenor ofSpotMonthsResult = MarketTenor.ofSpotMonths(Integer.MAX_VALUE);

    // Act and Assert
    assertEquals(0, ofSpotMonthsResult.compareTo(MarketTenor.ofSpotMonths(Integer.MAX_VALUE)));
  }

  /**
   * Test {@link MarketTenor#compareTo(MarketTenor)} with {@code MarketTenor}.
   *
   * <ul>
   *   <li>Given ofSpotMonths {@link Integer#MAX_VALUE}.
   *   <li>When {@link MarketTenor#SN}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#compareTo(MarketTenor)}
   */
  @Test
  @DisplayName(
      "Test compareTo(MarketTenor) with 'MarketTenor'; given ofSpotMonths MAX_VALUE; when SN; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MarketTenor.compareTo(MarketTenor)"})
  void testCompareToWithMarketTenor_givenOfSpotMonthsMax_value_whenSn_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, MarketTenor.ofSpotMonths(Integer.MAX_VALUE).compareTo(MarketTenor.SN));
  }

  /**
   * Test {@link MarketTenor#compareTo(MarketTenor)} with {@code MarketTenor}.
   *
   * <ul>
   *   <li>Given {@link MarketTenor#ON}.
   *   <li>When {@link MarketTenor#ON}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#compareTo(MarketTenor)}
   */
  @Test
  @DisplayName(
      "Test compareTo(MarketTenor) with 'MarketTenor'; given ON; when ON; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MarketTenor.compareTo(MarketTenor)"})
  void testCompareToWithMarketTenor_givenOn_whenOn_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, MarketTenor.ON.compareTo(MarketTenor.ON));
  }

  /**
   * Test {@link MarketTenor#compareTo(MarketTenor)} with {@code MarketTenor}.
   *
   * <ul>
   *   <li>Given {@link MarketTenor#SN}.
   *   <li>When {@link MarketTenor#ON}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#compareTo(MarketTenor)}
   */
  @Test
  @DisplayName("Test compareTo(MarketTenor) with 'MarketTenor'; given SN; when ON; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MarketTenor.compareTo(MarketTenor)"})
  void testCompareToWithMarketTenor_givenSn_whenOn_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, MarketTenor.SN.compareTo(MarketTenor.ON));
  }

  /**
   * Test {@link MarketTenor#compareTo(MarketTenor)} with {@code MarketTenor}.
   *
   * <ul>
   *   <li>Given {@link MarketTenor#SN}.
   *   <li>When {@link MarketTenor#SN}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#compareTo(MarketTenor)}
   */
  @Test
  @DisplayName(
      "Test compareTo(MarketTenor) with 'MarketTenor'; given SN; when SN; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MarketTenor.compareTo(MarketTenor)"})
  void testCompareToWithMarketTenor_givenSn_whenSn_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, MarketTenor.SN.compareTo(MarketTenor.SN));
  }

  /**
   * Test {@link MarketTenor#compareTo(MarketTenor)} with {@code MarketTenor}.
   *
   * <ul>
   *   <li>When ofSpotMonths {@link Integer#MAX_VALUE}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#compareTo(MarketTenor)}
   */
  @Test
  @DisplayName(
      "Test compareTo(MarketTenor) with 'MarketTenor'; when ofSpotMonths MAX_VALUE; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MarketTenor.compareTo(MarketTenor)"})
  void testCompareToWithMarketTenor_whenOfSpotMonthsMax_value_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1, MarketTenor.SN.compareTo(MarketTenor.ofSpotMonths(Integer.MAX_VALUE)));
  }

  /**
   * Test {@link MarketTenor#equals(Object)}, and {@link MarketTenor#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketTenor#equals(Object)}
   *   <li>{@link MarketTenor#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketTenor.equals(Object)", "int MarketTenor.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MarketTenor marketTenor = MarketTenor.ON;
    MarketTenor marketTenor2 = MarketTenor.ON;

    // Act and Assert
    assertEquals(marketTenor, marketTenor2);
    assertEquals(marketTenor.hashCode(), marketTenor2.hashCode());
  }

  /**
   * Test {@link MarketTenor#equals(Object)}, and {@link MarketTenor#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketTenor#equals(Object)}
   *   <li>{@link MarketTenor#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketTenor.equals(Object)", "int MarketTenor.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MarketTenor marketTenor = MarketTenor.ON;

    // Act and Assert
    assertEquals(marketTenor, marketTenor);
    int expectedHashCodeResult = marketTenor.hashCode();
    assertEquals(expectedHashCodeResult, marketTenor.hashCode());
  }

  /**
   * Test {@link MarketTenor#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketTenor.equals(Object)", "int MarketTenor.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(MarketTenor.SN, MarketTenor.ON);
  }

  /**
   * Test {@link MarketTenor#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketTenor.equals(Object)", "int MarketTenor.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(MarketTenor.ON, null);
  }

  /**
   * Test {@link MarketTenor#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketTenor#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketTenor.equals(Object)", "int MarketTenor.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(MarketTenor.ON, "Different type to MarketTenor");
  }
}
