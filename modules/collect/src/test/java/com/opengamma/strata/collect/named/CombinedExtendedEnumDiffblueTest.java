package com.opengamma.strata.collect.named;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CombinedExtendedEnumDiffblueTest {
  /**
   * Test {@link CombinedExtendedEnum#of(Class)}.
   *
   * <ul>
   *   <li>When {@code Named}.
   *   <li>Then return not find {@code Name} Present.
   * </ul>
   *
   * <p>Method under test: {@link CombinedExtendedEnum#of(Class)}
   */
  @Test
  @DisplayName(
      "Test of(Class); when 'com.opengamma.strata.collect.named.Named'; then return not find 'Name' Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CombinedExtendedEnum CombinedExtendedEnum.of(Class)"})
  void testOf_whenComOpengammaStrataCollectNamedNamed_thenReturnNotFindNamePresent() {
    // Arrange
    Class<Named> type = Named.class;

    // Act
    CombinedExtendedEnum<Named> actualOfResult = CombinedExtendedEnum.of(type);

    // Assert
    assertFalse(actualOfResult.find("Name").isPresent());
  }

  /**
   * Test {@link CombinedExtendedEnum#find(String)}.
   *
   * <p>Method under test: {@link CombinedExtendedEnum#find(String)}
   */
  @Test
  @DisplayName("Test find(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional CombinedExtendedEnum.find(String)"})
  void testFind() {
    // Arrange
    Class<Named> type = Named.class;
    CombinedExtendedEnum<Named> ofResult = CombinedExtendedEnum.of(type);

    // Act and Assert
    assertFalse(ofResult.find("Name").isPresent());
  }

  /**
   * Test {@link CombinedExtendedEnum#toString()}.
   *
   * <p>Method under test: {@link CombinedExtendedEnum#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CombinedExtendedEnum.toString()"})
  void testToString() {
    // Arrange
    Class<Named> type = Named.class;
    CombinedExtendedEnum<Named> ofResult = CombinedExtendedEnum.of(type);

    // Act and Assert
    assertEquals("CombinedExtendedEnum[Named]", ofResult.toString());
  }
}
