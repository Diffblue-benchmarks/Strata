package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwapIndexDiffblueTest {
  /**
   * Test {@link SwapIndex#extendedEnum()}.
   *
   * <p>Method under test: {@link SwapIndex#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum SwapIndex.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<SwapIndex> actualExtendedEnumResult = SwapIndex.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<SwapIndex> expectedType = SwapIndex.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }

  /**
   * Test {@link SwapIndex#calculateFixingDateTime(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toLocalDateTime toLocalTime toString is {@code 11:00}.
   * </ul>
   *
   * <p>Method under test: {@link SwapIndex#calculateFixingDateTime(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test calculateFixingDateTime(LocalDate); then return toLocalDateTime toLocalTime toString is '11:00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ZonedDateTime SwapIndex.calculateFixingDateTime(LocalDate)"})
  void testCalculateFixingDateTime_thenReturnToLocalDateTimeToLocalTimeToStringIs1100() {
    // Arrange
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    // Act
    ZonedDateTime actualCalculateFixingDateTimeResult =
        SwapIndices.EUR_EURIBOR_1100_10Y.calculateFixingDateTime(fixingDate);

    // Assert
    LocalDateTime toLocalDateTimeResult = actualCalculateFixingDateTimeResult.toLocalDateTime();
    assertEquals("11:00", toLocalDateTimeResult.toLocalTime().toString());
    assertEquals("Europe/Berlin", actualCalculateFixingDateTimeResult.getZone().toString());
    assertSame(fixingDate, toLocalDateTimeResult.toLocalDate());
  }
}
