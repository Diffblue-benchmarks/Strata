package com.opengamma.strata.market.sensitivity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveSensitivitiesTypeDiffblueTest {
  /**
   * Test {@link CurveSensitivitiesType#of(String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivitiesType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivitiesType CurveSensitivitiesType.of(String)"})
  void testOf_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            CurveSensitivitiesType.of(
                "Sensitivity type must only contain the characters A-Z, a-z, 0-9 and -"));
  }

  /**
   * Test {@link CurveSensitivitiesType#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivitiesType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivitiesType CurveSensitivitiesType.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    CurveSensitivitiesType actualOfResult = CurveSensitivitiesType.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
  }
}
