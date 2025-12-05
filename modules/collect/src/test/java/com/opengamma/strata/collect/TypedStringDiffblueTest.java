package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TypedStringDiffblueTest {
  /**
   * Test {@link TypedString#getName()}.
   *
   * <p>Method under test: {@link TypedString#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String TypedString.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("Name", SampleType.of("Name").getName());
  }

  /**
   * Test {@link TypedString#compareTo(TypedString)} with {@code SampleType}.
   *
   * <ul>
   *   <li>When {@link SampleType} with {@code Name}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link TypedString#compareTo(TypedString)}
   */
  @Test
  @DisplayName(
      "Test compareTo(TypedString) with 'SampleType'; when SampleType with 'Name'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int TypedString.compareTo(TypedString)"})
  void testCompareToWithSampleType_whenSampleTypeWithName_thenReturnZero() {
    // Arrange
    SampleType ofResult = SampleType.of("Name");

    // Act and Assert
    assertEquals(0, ofResult.compareTo(SampleType.of("Name")));
  }

  /**
   * Test {@link TypedString#equals(Object)}, and {@link TypedString#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TypedString#equals(Object)}
   *   <li>{@link TypedString#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypedString.equals(Object)", "int TypedString.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SampleType ofResult = SampleType.of("Name");
    SampleType ofResult2 = SampleType.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link TypedString#equals(Object)}, and {@link TypedString#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TypedString#equals(Object)}
   *   <li>{@link TypedString#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypedString.equals(Object)", "int TypedString.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SampleType ofResult = SampleType.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link TypedString#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TypedString#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypedString.equals(Object)", "int TypedString.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SampleType.of("Name"), "Name");
  }

  /**
   * Test {@link TypedString#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TypedString#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypedString.equals(Object)", "int TypedString.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SampleType.of("Name"), null);
  }

  /**
   * Test {@link TypedString#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TypedString#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TypedString.equals(Object)", "int TypedString.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SampleType.of("Name"), "Different type to TypedString");
  }

  /**
   * Test {@link TypedString#toString()}.
   *
   * <p>Method under test: {@link TypedString#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String TypedString.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Name", SampleType.of("Name").toString());
  }
}
