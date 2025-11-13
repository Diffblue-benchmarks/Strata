package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.date.HolidayCalendar;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.collect.named.ExtendedEnum;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FloatingRateNameDiffblueTest {
  /**
   * Test {@link FloatingRateName#extendedEnum()}.
   *
   * <p>Method under test: {@link FloatingRateName#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum FloatingRateName.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<FloatingRateName> actualExtendedEnumResult = FloatingRateName.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<FloatingRateName> expectedType = FloatingRateName.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }

  /**
   * Test {@link FloatingRateName#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateName#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Str'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName FloatingRateName.parse(String)"})
  void testParse_whenStr_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> FloatingRateName.parse("Str"));
  }

  /**
   * Test {@link FloatingRateName#tryParse(String)}.
   *
   * <p>Method under test: {@link FloatingRateName#tryParse(String)}
   */
  @Test
  @DisplayName("Test tryParse(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional FloatingRateName.tryParse(String)"})
  void testTryParse() {
    // Arrange and Act
    Optional<FloatingRateName> actualTryParseResult = FloatingRateName.tryParse("Str");

    // Assert
    assertFalse(actualTryParseResult.isPresent());
  }

  /**
   * Test {@link FloatingRateName#defaultIborIndex(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AUD}.
   *   <li>Then return {@link ImmutableFloatingRateName}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateName#defaultIborIndex(Currency)}
   */
  @Test
  @DisplayName("Test defaultIborIndex(Currency); when AUD; then return ImmutableFloatingRateName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName FloatingRateName.defaultIborIndex(Currency)"})
  void testDefaultIborIndex_whenAud_thenReturnImmutableFloatingRateName() {
    // Arrange and Act
    FloatingRateName actualDefaultIborIndexResult = FloatingRateName.defaultIborIndex(Currency.AUD);

    // Assert
    assertTrue(actualDefaultIborIndexResult instanceof ImmutableFloatingRateName);
    assertTrue(actualDefaultIborIndexResult.toFloatingRateIndex() instanceof ImmutableIborIndex);
    assertEquals("AUD-BBSW", actualDefaultIborIndexResult.getName());
    assertEquals(
        "AUD-BBSW", ((ImmutableFloatingRateName) actualDefaultIborIndexResult).getExternalName());
    assertEquals(
        "AUD-BBSW-", ((ImmutableFloatingRateName) actualDefaultIborIndexResult).getIndexName());
    assertEquals(6, actualDefaultIborIndexResult.getTenors().size());
    assertEquals(FloatingRateType.IBOR, actualDefaultIborIndexResult.getType());
    assertSame(Currency.AUD, actualDefaultIborIndexResult.getCurrency());
  }

  /**
   * Test {@link FloatingRateName#defaultOvernightIndex(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AUD}.
   *   <li>Then return {@link ImmutableFloatingRateName}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateName#defaultOvernightIndex(Currency)}
   */
  @Test
  @DisplayName(
      "Test defaultOvernightIndex(Currency); when AUD; then return ImmutableFloatingRateName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName FloatingRateName.defaultOvernightIndex(Currency)"})
  void testDefaultOvernightIndex_whenAud_thenReturnImmutableFloatingRateName() {
    // Arrange and Act
    FloatingRateName actualDefaultOvernightIndexResult =
        FloatingRateName.defaultOvernightIndex(Currency.AUD);

    // Assert
    assertTrue(actualDefaultOvernightIndexResult instanceof ImmutableFloatingRateName);
    assertTrue(
        actualDefaultOvernightIndexResult.toFloatingRateIndex() instanceof ImmutableOvernightIndex);
    assertEquals("AUD-AONIA", actualDefaultOvernightIndexResult.getName());
    assertEquals(
        "AUD-AONIA",
        ((ImmutableFloatingRateName) actualDefaultOvernightIndexResult).getExternalName());
    assertEquals(
        "AUD-AONIA",
        ((ImmutableFloatingRateName) actualDefaultOvernightIndexResult).getIndexName());
    assertEquals(
        FloatingRateType.OVERNIGHT_COMPOUNDED, actualDefaultOvernightIndexResult.getType());
    assertTrue(actualDefaultOvernightIndexResult.getTenors().isEmpty());
    assertSame(Currency.AUD, actualDefaultOvernightIndexResult.getCurrency());
  }

  /**
   * Test {@link FloatingRateName#getCurrency()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateName#getCurrency()}
   */
  @Test
  @DisplayName("Test getCurrency(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency FloatingRateName.getCurrency()"})
  void testGetCurrency_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.OTHER)
                .getCurrency());
  }

  /**
   * Test {@link FloatingRateName#getDefaultTenor()}.
   *
   * <ul>
   *   <li>Then return {@link Tenor#TENOR_1D}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateName#getDefaultTenor()}
   */
  @Test
  @DisplayName("Test getDefaultTenor(); then return TENOR_1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor FloatingRateName.getDefaultTenor()"})
  void testGetDefaultTenor_thenReturnTenor_1d() {
    // Arrange, Act and Assert
    assertSame(
        Tenor.TENOR_1D,
        ImmutableFloatingRateName.of(
                "External Name", "Index Name", FloatingRateType.OVERNIGHT_AVERAGED)
            .getDefaultTenor());
  }

  /**
   * Test {@link FloatingRateName#getDefaultTenor()}.
   *
   * <ul>
   *   <li>Then return {@link Tenor#TENOR_1Y}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateName#getDefaultTenor()}
   */
  @Test
  @DisplayName("Test getDefaultTenor(); then return TENOR_1Y")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor FloatingRateName.getDefaultTenor()"})
  void testGetDefaultTenor_thenReturnTenor_1y() {
    // Arrange, Act and Assert
    assertSame(
        Tenor.TENOR_1Y,
        ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.PRICE)
            .getDefaultTenor());
  }

  /**
   * Test {@link FloatingRateName#toFloatingRateIndex(Tenor)} with {@code Tenor}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateName#toFloatingRateIndex(Tenor)}
   */
  @Test
  @DisplayName("Test toFloatingRateIndex(Tenor) with 'Tenor'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.index.FloatingRateIndex FloatingRateName.toFloatingRateIndex(Tenor)"
  })
  void testToFloatingRateIndexWithTenor_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.OTHER)
                .toFloatingRateIndex(Tenor.TENOR_10M));
  }

  /**
   * Test {@link FloatingRateName#toFloatingRateIndex()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateName#toFloatingRateIndex()}
   */
  @Test
  @DisplayName("Test toFloatingRateIndex(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.index.FloatingRateIndex FloatingRateName.toFloatingRateIndex()"
  })
  void testToFloatingRateIndex_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.OTHER)
                .toFloatingRateIndex());
  }

  /**
   * Test {@link FloatingRateName#toIborIndexFixingOffset()}.
   *
   * <ul>
   *   <li>Given {@link FloatingRateNames#AUD_BBSW}.
   *   <li>Then return ResultCalendar Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateName#toIborIndexFixingOffset()}
   */
  @Test
  @DisplayName(
      "Test toIborIndexFixingOffset(); given AUD_BBSW; then return ResultCalendar Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment FloatingRateName.toIborIndexFixingOffset()"})
  void testToIborIndexFixingOffset_givenAud_bbsw_thenReturnResultCalendarNameIsAusy() {
    // Arrange and Act
    DaysAdjustment actualToIborIndexFixingOffsetResult =
        FloatingRateNames.AUD_BBSW.toIborIndexFixingOffset();

    // Assert
    HolidayCalendarId resultCalendar = actualToIborIndexFixingOffsetResult.getResultCalendar();
    assertEquals("AUSY", resultCalendar.getName());
    assertEquals("AUSY", resultCalendar.toString());
    HolidayCalendarId calendar = actualToIborIndexFixingOffsetResult.getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals(0, actualToIborIndexFixingOffsetResult.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    Class<HolidayCalendar> expectedReferenceDataType2 = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType2, resultCalendar.getReferenceDataType());
    assertSame(resultCalendar, actualToIborIndexFixingOffsetResult.getAdjustment().getCalendar());
  }
}
