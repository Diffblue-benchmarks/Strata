package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ValueRootTypeDiffblueTest {
  /**
   * Test {@link ValueRootType#token()}.
   *
   * <p>Method under test: {@link ValueRootType#token()}
   */
  @Test
  @DisplayName("Test token()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ValueRootType.token()"})
  void testToken() {
    // Arrange, Act and Assert
    assertEquals("Measures", ValueRootType.valueOf("MEASURES").token());
  }

  /**
   * Test {@link ValueRootType#parseToken(String)}.
   *
   * <ul>
   *   <li>When {@code MEASURES}.
   *   <li>Then return {@code MEASURES}.
   * </ul>
   *
   * <p>Method under test: {@link ValueRootType#parseToken(String)}
   */
  @Test
  @DisplayName("Test parseToken(String); when 'MEASURES'; then return 'MEASURES'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueRootType ValueRootType.parseToken(String)"})
  void testParseToken_whenMeasures_thenReturnMeasures() {
    // Arrange, Act and Assert
    assertEquals(ValueRootType.MEASURES, ValueRootType.parseToken("MEASURES"));
  }

  /**
   * Test {@link ValueRootType#parseToken(String)}.
   *
   * <ul>
   *   <li>When {@code Root String}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ValueRootType#parseToken(String)}
   */
  @Test
  @DisplayName("Test parseToken(String); when 'Root String'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueRootType ValueRootType.parseToken(String)"})
  void testParseToken_whenRootString_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ValueRootType.parseToken("Root String"));
  }
}
