package com.opengamma.strata.collect.named;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExtendedEnumDiffblueTest {
  /**
   * Test {@link ExtendedEnum#of(Class)}.
   *
   * <ul>
   *   <li>When {@code Named}.
   *   <li>Then return alternateNames Empty.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedEnum#of(Class)}
   */
  @Test
  @DisplayName(
      "Test of(Class); when 'com.opengamma.strata.collect.named.Named'; then return alternateNames Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum ExtendedEnum.of(Class)"})
  void testOf_whenComOpengammaStrataCollectNamedNamed_thenReturnAlternateNamesEmpty() {
    // Arrange
    Class<Named> type = Named.class;

    // Act
    ExtendedEnum<Named> actualOfResult = ExtendedEnum.of(type);

    // Assert
    assertTrue(actualOfResult.alternateNames().isEmpty());
    Class<Named> expectedType = Named.class;
    assertEquals(expectedType, actualOfResult.getType());
  }

  /**
   * Test {@link ExtendedEnum#find(String)}.
   *
   * <p>Method under test: {@link ExtendedEnum#find(String)}
   */
  @Test
  @DisplayName("Test find(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional ExtendedEnum.find(String)"})
  void testFind() {
    // Arrange
    Class<Named> type = Named.class;
    ExtendedEnum<Named> ofResult = ExtendedEnum.of(type);

    // Act and Assert
    assertFalse(ofResult.find("Name").isPresent());
  }

  /**
   * Test {@link ExtendedEnum#lookupAll()}.
   *
   * <p>Method under test: {@link ExtendedEnum#lookupAll()}
   */
  @Test
  @DisplayName("Test lookupAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap ExtendedEnum.lookupAll()"})
  void testLookupAll() {
    // Arrange
    Class<Named> type = Named.class;
    ExtendedEnum<Named> ofResult = ExtendedEnum.of(type);

    // Act and Assert
    assertTrue(ofResult.lookupAll().isEmpty());
  }

  /**
   * Test {@link ExtendedEnum#lookupAllNormalized()}.
   *
   * <p>Method under test: {@link ExtendedEnum#lookupAllNormalized()}
   */
  @Test
  @DisplayName("Test lookupAllNormalized()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap ExtendedEnum.lookupAllNormalized()"})
  void testLookupAllNormalized() {
    // Arrange
    Class<Named> type = Named.class;
    ExtendedEnum<Named> ofResult = ExtendedEnum.of(type);

    // Act and Assert
    assertTrue(ofResult.lookupAllNormalized().isEmpty());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExtendedEnum#toString()}
   *   <li>{@link ExtendedEnum#alternateNames()}
   *   <li>{@link ExtendedEnum#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap ExtendedEnum.alternateNames()",
    "Class ExtendedEnum.getType()",
    "String ExtendedEnum.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Class<Named> type = Named.class;
    ExtendedEnum<Named> ofResult = ExtendedEnum.of(type);

    // Act
    String actualToStringResult = ofResult.toString();
    ImmutableMap<String, String> actualAlternateNamesResult = ofResult.alternateNames();
    Class<Named> actualType = ofResult.getType();

    // Assert
    assertEquals("ExtendedEnum[Named]", actualToStringResult);
    assertTrue(actualAlternateNamesResult.isEmpty());
    Class<Named> expectedType = Named.class;
    assertEquals(expectedType, actualType);
  }

  /**
   * Test {@link ExtendedEnum#externalNameGroups()}.
   *
   * <p>Method under test: {@link ExtendedEnum#externalNameGroups()}
   */
  @Test
  @DisplayName("Test externalNameGroups()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet ExtendedEnum.externalNameGroups()"})
  void testExternalNameGroups() {
    // Arrange
    Class<Named> type = Named.class;
    ExtendedEnum<Named> ofResult = ExtendedEnum.of(type);

    // Act and Assert
    assertTrue(ofResult.externalNameGroups().isEmpty());
  }

  /**
   * Test {@link ExtendedEnum#externalNames(String)}.
   *
   * <ul>
   *   <li>When {@code Group}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedEnum#externalNames(String)}
   */
  @Test
  @DisplayName("Test externalNames(String); when 'Group'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum.ExternalEnumNames ExtendedEnum.externalNames(String)"})
  void testExternalNames_whenGroup() {
    // Arrange
    Class<Named> type = Named.class;
    ExtendedEnum<Named> ofResult = ExtendedEnum.of(type);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.externalNames("Group"));
  }

  /**
   * Test {@link ExtendedEnum#externalNames(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedEnum#externalNames(String)}
   */
  @Test
  @DisplayName("Test externalNames(String); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum.ExternalEnumNames ExtendedEnum.externalNames(String)"})
  void testExternalNames_whenNull() {
    // Arrange
    Class<Named> type = Named.class;
    ExtendedEnum<Named> ofResult = ExtendedEnum.of(type);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.externalNames(null));
  }

  /**
   * Test {@link ExtendedEnum#findLenient(String)}.
   *
   * <p>Method under test: {@link ExtendedEnum#findLenient(String)}
   */
  @Test
  @DisplayName("Test findLenient(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional ExtendedEnum.findLenient(String)"})
  void testFindLenient() {
    // Arrange
    Class<Named> type = Named.class;
    ExtendedEnum<Named> ofResult = ExtendedEnum.of(type);

    // Act and Assert
    assertFalse(ofResult.findLenient("Name").isPresent());
  }
}
