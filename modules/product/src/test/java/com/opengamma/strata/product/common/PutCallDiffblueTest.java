package com.opengamma.strata.product.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PutCallDiffblueTest {
  /**
   * Test {@link PutCall#of(String)}.
   *
   * <ul>
   *   <li>When {@code CALL}.
   *   <li>Then return {@code CALL}.
   * </ul>
   *
   * <p>Method under test: {@link PutCall#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'CALL'; then return 'CALL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PutCall PutCall.of(String)"})
  void testOf_whenCall_thenReturnCall() {
    // Arrange, Act and Assert
    assertEquals(PutCall.CALL, PutCall.of("CALL"));
  }

  /**
   * Test {@link PutCall#ofPut(boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code CALL}.
   * </ul>
   *
   * <p>Method under test: {@link PutCall#ofPut(boolean)}
   */
  @Test
  @DisplayName("Test ofPut(boolean); when 'false'; then return 'CALL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PutCall PutCall.ofPut(boolean)"})
  void testOfPut_whenFalse_thenReturnCall() {
    // Arrange, Act and Assert
    assertEquals(PutCall.CALL, PutCall.ofPut(false));
  }

  /**
   * Test {@link PutCall#ofPut(boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code PUT}.
   * </ul>
   *
   * <p>Method under test: {@link PutCall#ofPut(boolean)}
   */
  @Test
  @DisplayName("Test ofPut(boolean); when 'true'; then return 'PUT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PutCall PutCall.ofPut(boolean)"})
  void testOfPut_whenTrue_thenReturnPut() {
    // Arrange, Act and Assert
    assertEquals(PutCall.PUT, PutCall.ofPut(true));
  }

  /**
   * Test {@link PutCall#isPut()}.
   *
   * <ul>
   *   <li>Given {@code CALL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PutCall#isPut()}
   */
  @Test
  @DisplayName("Test isPut(); given 'CALL'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PutCall.isPut()"})
  void testIsPut_givenCall_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(PutCall.CALL.isPut());
  }

  /**
   * Test {@link PutCall#isPut()}.
   *
   * <ul>
   *   <li>Given {@code PUT}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PutCall#isPut()}
   */
  @Test
  @DisplayName("Test isPut(); given 'PUT'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PutCall.isPut()"})
  void testIsPut_givenPut_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(PutCall.PUT.isPut());
  }

  /**
   * Test {@link PutCall#isCall()}.
   *
   * <ul>
   *   <li>Given {@link PutCall#CALL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PutCall#isCall()}
   */
  @Test
  @DisplayName("Test isCall(); given CALL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PutCall.isCall()"})
  void testIsCall_givenCall_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(PutCall.CALL.isCall());
  }

  /**
   * Test {@link PutCall#isCall()}.
   *
   * <ul>
   *   <li>Given {@code PUT}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PutCall#isCall()}
   */
  @Test
  @DisplayName("Test isCall(); given 'PUT'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PutCall.isCall()"})
  void testIsCall_givenPut_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(PutCall.PUT.isCall());
  }

  /**
   * Test {@link PutCall#opposite()}.
   *
   * <ul>
   *   <li>Given {@code CALL}.
   *   <li>Then return {@code PUT}.
   * </ul>
   *
   * <p>Method under test: {@link PutCall#opposite()}
   */
  @Test
  @DisplayName("Test opposite(); given 'CALL'; then return 'PUT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PutCall PutCall.opposite()"})
  void testOpposite_givenCall_thenReturnPut() {
    // Arrange, Act and Assert
    assertEquals(PutCall.PUT, PutCall.CALL.opposite());
  }

  /**
   * Test {@link PutCall#opposite()}.
   *
   * <ul>
   *   <li>Given {@code PUT}.
   *   <li>Then return {@code CALL}.
   * </ul>
   *
   * <p>Method under test: {@link PutCall#opposite()}
   */
  @Test
  @DisplayName("Test opposite(); given 'PUT'; then return 'CALL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PutCall PutCall.opposite()"})
  void testOpposite_givenPut_thenReturnCall() {
    // Arrange, Act and Assert
    assertEquals(PutCall.CALL, PutCall.PUT.opposite());
  }

  /**
   * Test {@link PutCall#toString()}.
   *
   * <p>Method under test: {@link PutCall#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PutCall.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Put", PutCall.valueOf("PUT").toString());
  }
}
