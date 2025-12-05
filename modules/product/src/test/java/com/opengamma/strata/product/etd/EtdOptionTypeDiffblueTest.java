package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdOptionTypeDiffblueTest {
  /**
   * Test {@link EtdOptionType#of(String)}.
   *
   * <ul>
   *   <li>When {@code AMERICAN}.
   *   <li>Then return {@code AMERICAN}.
   * </ul>
   *
   * <p>Method under test: {@link EtdOptionType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'AMERICAN'; then return 'AMERICAN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType EtdOptionType.of(String)"})
  void testOf_whenAmerican_thenReturnAmerican() {
    // Arrange, Act and Assert
    assertEquals(EtdOptionType.AMERICAN, EtdOptionType.of("AMERICAN"));
  }

  /**
   * Test {@link EtdOptionType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then return {@code AMERICAN}.
   * </ul>
   *
   * <p>Method under test: {@link EtdOptionType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'A'; then return 'AMERICAN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType EtdOptionType.parseCode(String)"})
  void testParseCode_whenA_thenReturnAmerican() {
    // Arrange, Act and Assert
    assertEquals(EtdOptionType.AMERICAN, EtdOptionType.parseCode("A"));
  }

  /**
   * Test {@link EtdOptionType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code Code}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link EtdOptionType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'Code'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType EtdOptionType.parseCode(String)"})
  void testParseCode_whenCode_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> EtdOptionType.parseCode("Code"));
  }

  /**
   * Test {@link EtdOptionType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code E}.
   *   <li>Then return {@code EUROPEAN}.
   * </ul>
   *
   * <p>Method under test: {@link EtdOptionType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'E'; then return 'EUROPEAN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType EtdOptionType.parseCode(String)"})
  void testParseCode_whenE_thenReturnEuropean() {
    // Arrange, Act and Assert
    assertEquals(EtdOptionType.EUROPEAN, EtdOptionType.parseCode("E"));
  }

  /**
   * Test {@link EtdOptionType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code T}.
   *   <li>Then return {@code ASIAN}.
   * </ul>
   *
   * <p>Method under test: {@link EtdOptionType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'T'; then return 'ASIAN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType EtdOptionType.parseCode(String)"})
  void testParseCode_whenT_thenReturnAsian() {
    // Arrange, Act and Assert
    assertEquals(EtdOptionType.ASIAN, EtdOptionType.parseCode("T"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EtdOptionType#toString()}
   *   <li>{@link EtdOptionType#getCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String EtdOptionType.getCode()", "String EtdOptionType.toString()"})
  void testGettersAndSetters() {
    // Arrange
    EtdOptionType valueOfResult = EtdOptionType.valueOf("AMERICAN");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("A", valueOfResult.getCode());
    assertEquals("American", actualToStringResult);
  }
}
