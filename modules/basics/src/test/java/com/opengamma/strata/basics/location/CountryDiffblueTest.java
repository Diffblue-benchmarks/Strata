package com.opengamma.strata.basics.location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CountryDiffblueTest {
  /**
   * Test {@link Country#getAvailableCountries()}.
   *
   * <p>Method under test: {@link Country#getAvailableCountries()}
   */
  @Test
  @DisplayName("Test getAvailableCountries()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set Country.getAvailableCountries()"})
  void testGetAvailableCountries() {
    // Arrange and Act
    Set<Country> actualAvailableCountries = Country.getAvailableCountries();

    // Assert
    assertEquals(252, actualAvailableCountries.size());
  }

  /**
   * Test {@link Country#of(String)}.
   *
   * <ul>
   *   <li>When {@code GB}.
   *   <li>Then return Code is {@code GB}.
   * </ul>
   *
   * <p>Method under test: {@link Country#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'GB'; then return Code is 'GB'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Country Country.of(String)"})
  void testOf_whenGb_thenReturnCodeIsGb() {
    // Arrange and Act
    Country actualOfResult = Country.of("GB");

    // Assert
    assertEquals("GB", actualOfResult.getCode());
    assertEquals("GB", actualOfResult.toString());
    assertEquals("GBR", actualOfResult.getCode3Char());
  }

  /**
   * Test {@link Country#parse(String)}.
   *
   * <ul>
   *   <li>When {@code GB}.
   *   <li>Then return Code is {@code GB}.
   * </ul>
   *
   * <p>Method under test: {@link Country#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'GB'; then return Code is 'GB'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Country Country.parse(String)"})
  void testParse_whenGb_thenReturnCodeIsGb() {
    // Arrange and Act
    Country actualParseResult = Country.parse("GB");

    // Assert
    assertEquals("GB", actualParseResult.getCode());
    assertEquals("GB", actualParseResult.toString());
    assertEquals("GBR", actualParseResult.getCode3Char());
  }

  /**
   * Test {@link Country#of3Char(String)}.
   *
   * <ul>
   *   <li>When {@code GBR}.
   *   <li>Then return Code is {@code GB}.
   * </ul>
   *
   * <p>Method under test: {@link Country#of3Char(String)}
   */
  @Test
  @DisplayName("Test of3Char(String); when 'GBR'; then return Code is 'GB'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Country Country.of3Char(String)"})
  void testOf3Char_whenGbr_thenReturnCodeIsGb() {
    // Arrange and Act
    Country actualOf3CharResult = Country.of3Char("GBR");

    // Assert
    assertEquals("GB", actualOf3CharResult.getCode());
    assertEquals("GB", actualOf3CharResult.toString());
    assertEquals("GBR", actualOf3CharResult.getCode3Char());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Country#getCode()}
   *   <li>{@link Country#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Country.getCode()", "String Country.toString()"})
  void testGettersAndSetters() {
    // Arrange
    Country country = Country.AR;

    // Act
    String actualCode = country.getCode();

    // Assert
    assertEquals("AR", actualCode);
    assertEquals("AR", country.toString());
  }

  /**
   * Test {@link Country#getCode3Char()}.
   *
   * <ul>
   *   <li>Given {@link Country#AR}.
   *   <li>Then return {@code ARG}.
   * </ul>
   *
   * <p>Method under test: {@link Country#getCode3Char()}
   */
  @Test
  @DisplayName("Test getCode3Char(); given AR; then return 'ARG'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Country.getCode3Char()"})
  void testGetCode3Char_givenAr_thenReturnArg() {
    // Arrange, Act and Assert
    assertEquals("ARG", Country.AR.getCode3Char());
  }

  /**
   * Test {@link Country#getCode3Char()}.
   *
   * <ul>
   *   <li>Given {@link Country#EU}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Country#getCode3Char()}
   */
  @Test
  @DisplayName("Test getCode3Char(); given EU; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Country.getCode3Char()"})
  void testGetCode3Char_givenEu_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Country.EU.getCode3Char());
  }

  /**
   * Test {@link Country#compareTo(Country)} with {@code Country}.
   *
   * <ul>
   *   <li>When {@link Country#AR}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Country#compareTo(Country)}
   */
  @Test
  @DisplayName("Test compareTo(Country) with 'Country'; when AR; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Country.compareTo(Country)"})
  void testCompareToWithCountry_whenAr_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, Country.AR.compareTo(Country.AR));
  }

  /**
   * Test {@link Country#equals(Object)}, and {@link Country#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Country#equals(Object)}
   *   <li>{@link Country#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Country.equals(Object)", "int Country.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Country country = Country.AR;
    Country country2 = Country.AR;

    // Act and Assert
    assertEquals(country, country2);
    assertEquals(country.hashCode(), country2.hashCode());
  }

  /**
   * Test {@link Country#equals(Object)}, and {@link Country#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Country#equals(Object)}
   *   <li>{@link Country#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Country.equals(Object)", "int Country.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Country country = Country.AR;

    // Act and Assert
    assertEquals(country, country);
    int expectedHashCodeResult = country.hashCode();
    assertEquals(expectedHashCodeResult, country.hashCode());
  }

  /**
   * Test {@link Country#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Country#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Country.equals(Object)", "int Country.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Country.AT, Country.AR);
  }

  /**
   * Test {@link Country#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Country#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Country.equals(Object)", "int Country.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Country.AR, null);
  }

  /**
   * Test {@link Country#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Country#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Country.equals(Object)", "int Country.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Country.AR, "Different type to Country");
  }
}
