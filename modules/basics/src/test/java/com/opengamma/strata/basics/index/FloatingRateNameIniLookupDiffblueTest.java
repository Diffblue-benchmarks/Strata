package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FloatingRateNameIniLookupDiffblueTest {
  /**
   * Test {@link FloatingRateNameIniLookup#lookupAll()}.
   *
   * <p>Method under test: {@link FloatingRateNameIniLookup#lookupAll()}
   */
  @Test
  @DisplayName("Test lookupAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map FloatingRateNameIniLookup.lookupAll()"})
  void testLookupAll() {
    // Arrange and Act
    Map<String, FloatingRateName> actualLookupAllResult =
        FloatingRateNameIniLookup.INSTANCE.lookupAll();

    // Assert
    assertEquals(449, actualLookupAllResult.size());
    assertTrue(actualLookupAllResult.get("AUD-BBR") instanceof ImmutableFloatingRateName);
    assertTrue(actualLookupAllResult.get("CNY-REPO") instanceof ImmutableFloatingRateName);
    assertTrue(
        actualLookupAllResult.get("CZK-CZEONIA-OIS COMPOUND") instanceof ImmutableFloatingRateName);
    assertTrue(
        actualLookupAllResult.get("EUR-EURIBOR-Telerate") instanceof ImmutableFloatingRateName);
    assertTrue(
        actualLookupAllResult.get("GBP-LIBOR-BBA-Bloomberg") instanceof ImmutableFloatingRateName);
    assertTrue(actualLookupAllResult.get("HKD-HIBOR-ISDC") instanceof ImmutableFloatingRateName);
    assertTrue(actualLookupAllResult.get("JPY-TIBOR-EUROYEN") instanceof ImmutableFloatingRateName);
    assertTrue(
        actualLookupAllResult.get("MYR-KLIBOR-Reference Banks")
            instanceof ImmutableFloatingRateName);
    assertTrue(
        actualLookupAllResult.get("SEK-STIBOR-BLOOMBERG") instanceof ImmutableFloatingRateName);
    assertTrue(
        actualLookupAllResult.get("THB-THBFIX-REFERENCE BANKS")
            instanceof ImmutableFloatingRateName);
    assertTrue(actualLookupAllResult.get("USD-FED-FUNDS") instanceof ImmutableFloatingRateName);
  }

  /**
   * Test {@link FloatingRateNameIniLookup#defaultIborIndex(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateNameIniLookup#defaultIborIndex(Currency)}
   */
  @Test
  @DisplayName("Test defaultIborIndex(Currency); when AED; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName FloatingRateNameIniLookup.defaultIborIndex(Currency)"})
  void testDefaultIborIndex_whenAed_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FloatingRateNameIniLookup.INSTANCE.defaultIborIndex(Currency.AED));
  }

  /**
   * Test {@link FloatingRateNameIniLookup#defaultIborIndex(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AUD}.
   *   <li>Then return {@link ImmutableFloatingRateName}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateNameIniLookup#defaultIborIndex(Currency)}
   */
  @Test
  @DisplayName("Test defaultIborIndex(Currency); when AUD; then return ImmutableFloatingRateName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName FloatingRateNameIniLookup.defaultIborIndex(Currency)"})
  void testDefaultIborIndex_whenAud_thenReturnImmutableFloatingRateName() {
    // Arrange and Act
    FloatingRateName actualDefaultIborIndexResult =
        FloatingRateNameIniLookup.INSTANCE.defaultIborIndex(Currency.AUD);

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
   * Test {@link FloatingRateNameIniLookup#defaultIborIndex(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#BRL}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateNameIniLookup#defaultIborIndex(Currency)}
   */
  @Test
  @DisplayName("Test defaultIborIndex(Currency); when BRL; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName FloatingRateNameIniLookup.defaultIborIndex(Currency)"})
  void testDefaultIborIndex_whenBrl_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FloatingRateNameIniLookup.INSTANCE.defaultIborIndex(Currency.BRL));
  }

  /**
   * Test {@link FloatingRateNameIniLookup#defaultIborIndex(Currency)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateNameIniLookup#defaultIborIndex(Currency)}
   */
  @Test
  @DisplayName("Test defaultIborIndex(Currency); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName FloatingRateNameIniLookup.defaultIborIndex(Currency)"})
  void testDefaultIborIndex_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FloatingRateNameIniLookup.INSTANCE.defaultIborIndex(null));
  }

  /**
   * Test {@link FloatingRateNameIniLookup#defaultOvernightIndex(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateNameIniLookup#defaultOvernightIndex(Currency)}
   */
  @Test
  @DisplayName(
      "Test defaultOvernightIndex(Currency); when AED; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName FloatingRateNameIniLookup.defaultOvernightIndex(Currency)"})
  void testDefaultOvernightIndex_whenAed_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FloatingRateNameIniLookup.INSTANCE.defaultOvernightIndex(Currency.AED));
  }

  /**
   * Test {@link FloatingRateNameIniLookup#defaultOvernightIndex(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AUD}.
   *   <li>Then return toFloatingRateIndex Name is {@code AUD-AONIA}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateNameIniLookup#defaultOvernightIndex(Currency)}
   */
  @Test
  @DisplayName(
      "Test defaultOvernightIndex(Currency); when AUD; then return toFloatingRateIndex Name is 'AUD-AONIA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName FloatingRateNameIniLookup.defaultOvernightIndex(Currency)"})
  void testDefaultOvernightIndex_whenAud_thenReturnToFloatingRateIndexNameIsAudAonia() {
    // Arrange and Act
    FloatingRateName actualDefaultOvernightIndexResult =
        FloatingRateNameIniLookup.INSTANCE.defaultOvernightIndex(Currency.AUD);

    // Assert
    assertTrue(actualDefaultOvernightIndexResult instanceof ImmutableFloatingRateName);
    FloatingRateIndex toFloatingRateIndexResult =
        actualDefaultOvernightIndexResult.toFloatingRateIndex();
    assertTrue(toFloatingRateIndexResult instanceof ImmutableOvernightIndex);
    assertEquals("AUD-AONIA", toFloatingRateIndexResult.getName());
    assertEquals("AUD-AONIA", actualDefaultOvernightIndexResult.getName());
    assertEquals(
        "AUD-AONIA",
        ((ImmutableFloatingRateName) actualDefaultOvernightIndexResult).getExternalName());
    assertEquals(
        "AUD-AONIA",
        ((ImmutableFloatingRateName) actualDefaultOvernightIndexResult).getIndexName());
    assertEquals(
        0, ((ImmutableOvernightIndex) toFloatingRateIndexResult).getPublicationDateOffset());
    assertSame(actualDefaultOvernightIndexResult, toFloatingRateIndexResult.getFloatingRateName());
    Currency currency = Currency.AUD;
    assertSame(currency, toFloatingRateIndexResult.getCurrency());
    assertSame(currency, actualDefaultOvernightIndexResult.getCurrency());
  }

  /**
   * Test {@link FloatingRateNameIniLookup#defaultOvernightIndex(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#BRL}.
   *   <li>Then return toFloatingRateIndex Name is {@code BRL-CDI}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateNameIniLookup#defaultOvernightIndex(Currency)}
   */
  @Test
  @DisplayName(
      "Test defaultOvernightIndex(Currency); when BRL; then return toFloatingRateIndex Name is 'BRL-CDI'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName FloatingRateNameIniLookup.defaultOvernightIndex(Currency)"})
  void testDefaultOvernightIndex_whenBrl_thenReturnToFloatingRateIndexNameIsBrlCdi() {
    // Arrange and Act
    FloatingRateName actualDefaultOvernightIndexResult =
        FloatingRateNameIniLookup.INSTANCE.defaultOvernightIndex(Currency.BRL);

    // Assert
    assertTrue(actualDefaultOvernightIndexResult instanceof ImmutableFloatingRateName);
    FloatingRateIndex toFloatingRateIndexResult =
        actualDefaultOvernightIndexResult.toFloatingRateIndex();
    assertTrue(toFloatingRateIndexResult instanceof ImmutableOvernightIndex);
    assertEquals("BRL-CDI", toFloatingRateIndexResult.getName());
    assertEquals("BRL-CDI", actualDefaultOvernightIndexResult.getName());
    assertEquals(
        "BRL-CDI",
        ((ImmutableFloatingRateName) actualDefaultOvernightIndexResult).getExternalName());
    assertEquals(
        "BRL-CDI", ((ImmutableFloatingRateName) actualDefaultOvernightIndexResult).getIndexName());
    assertEquals(
        1, ((ImmutableOvernightIndex) toFloatingRateIndexResult).getPublicationDateOffset());
    assertSame(actualDefaultOvernightIndexResult, toFloatingRateIndexResult.getFloatingRateName());
    Currency currency = Currency.BRL;
    assertSame(currency, toFloatingRateIndexResult.getCurrency());
    assertSame(currency, actualDefaultOvernightIndexResult.getCurrency());
  }

  /**
   * Test {@link FloatingRateNameIniLookup#defaultOvernightIndex(Currency)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateNameIniLookup#defaultOvernightIndex(Currency)}
   */
  @Test
  @DisplayName(
      "Test defaultOvernightIndex(Currency); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName FloatingRateNameIniLookup.defaultOvernightIndex(Currency)"})
  void testDefaultOvernightIndex_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FloatingRateNameIniLookup.INSTANCE.defaultOvernightIndex(null));
  }
}
