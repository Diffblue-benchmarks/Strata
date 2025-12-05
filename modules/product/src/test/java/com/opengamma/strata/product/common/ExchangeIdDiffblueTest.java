package com.opengamma.strata.product.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExchangeIdDiffblueTest {
  /**
   * Test {@link ExchangeId#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link ExchangeId#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExchangeId ExchangeId.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    ExchangeId actualOfResult = ExchangeId.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExchangeId#getName()}
   *   <li>{@link ExchangeId#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ExchangeId.getName()", "String ExchangeId.toString()"})
  void testGettersAndSetters() {
    // Arrange
    ExchangeId ofResult = ExchangeId.of("Name");

    // Act
    String actualName = ofResult.getName();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Name", ofResult.toString());
  }

  /**
   * Test {@link ExchangeId#equals(Object)}, and {@link ExchangeId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExchangeId#equals(Object)}
   *   <li>{@link ExchangeId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExchangeId.equals(Object)", "int ExchangeId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ExchangeId exchangeId = ExchangeIds.ECAG;
    ExchangeId exchangeId2 = ExchangeIds.ECAG;

    // Act and Assert
    assertEquals(exchangeId, exchangeId2);
    assertEquals(exchangeId.hashCode(), exchangeId2.hashCode());
  }

  /**
   * Test {@link ExchangeId#equals(Object)}, and {@link ExchangeId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExchangeId#equals(Object)}
   *   <li>{@link ExchangeId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExchangeId.equals(Object)", "int ExchangeId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ExchangeId exchangeId = ExchangeIds.ECAG;

    // Act and Assert
    assertEquals(exchangeId, exchangeId);
    int expectedHashCodeResult = exchangeId.hashCode();
    assertEquals(expectedHashCodeResult, exchangeId.hashCode());
  }

  /**
   * Test {@link ExchangeId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExchangeId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExchangeId.equals(Object)", "int ExchangeId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ExchangeIds.HUDX, ExchangeIds.ECAG);
  }

  /**
   * Test {@link ExchangeId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExchangeId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExchangeId.equals(Object)", "int ExchangeId.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ExchangeIds.ECAG, null);
  }

  /**
   * Test {@link ExchangeId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExchangeId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExchangeId.equals(Object)", "int ExchangeId.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ExchangeIds.ECAG, "Different type to ExchangeId");
  }
}
