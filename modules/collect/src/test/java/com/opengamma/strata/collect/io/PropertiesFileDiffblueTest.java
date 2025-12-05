package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PropertiesFileDiffblueTest {
  /**
   * Test {@link PropertiesFile#of(PropertySet)} with {@code keyValueMap}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return Properties is empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertiesFile#of(PropertySet)}
   */
  @Test
  @DisplayName(
      "Test of(PropertySet) with 'keyValueMap'; when empty; then return Properties is empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertiesFile PropertiesFile.of(PropertySet)"})
  void testOfWithKeyValueMap_whenEmpty_thenReturnPropertiesIsEmpty() {
    // Arrange
    PropertySet keyValueMap = PropertySet.empty();

    // Act and Assert
    assertSame(keyValueMap, PropertiesFile.of(keyValueMap).getProperties());
  }

  /**
   * Test {@link PropertiesFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>Then return not Properties Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertiesFile#of(CharSource)}
   */
  @Test
  @DisplayName("Test of(CharSource) with 'source'; then return not Properties Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertiesFile PropertiesFile.of(CharSource)"})
  void testOfWithSource_thenReturnNotPropertiesEmpty() {
    // Arrange, Act and Assert
    assertFalse(PropertiesFile.of(StringCharSource.of("source")).getProperties().isEmpty());
  }

  /**
   * Test {@link PropertiesFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PropertiesFile#of(CharSource)}
   */
  @Test
  @DisplayName("Test of(CharSource) with 'source'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertiesFile PropertiesFile.of(CharSource)"})
  void testOfWithSource_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> PropertiesFile.of(StringCharSource.of(" = ")));
  }

  /**
   * Test {@link PropertiesFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then return Properties Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertiesFile#of(CharSource)}
   */
  @Test
  @DisplayName("Test of(CharSource) with 'source'; when EMPTY; then return Properties Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertiesFile PropertiesFile.of(CharSource)"})
  void testOfWithSource_whenEmpty_thenReturnPropertiesEmpty() {
    // Arrange, Act and Assert
    assertTrue(PropertiesFile.of(StringCharSource.EMPTY).getProperties().isEmpty());
  }

  /**
   * Test {@link PropertiesFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link PropertiesFile#of(CharSource)}
   */
  @Test
  @DisplayName("Test of(CharSource) with 'source'; when StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertiesFile PropertiesFile.of(CharSource)"})
  void testOfWithSource_whenStringCharSourceWithStrIsNumberSign() {
    // Arrange, Act and Assert
    assertTrue(PropertiesFile.of(StringCharSource.of("#")).getProperties().isEmpty());
  }

  /**
   * Test {@link PropertiesFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link PropertiesFile#of(CharSource)}
   */
  @Test
  @DisplayName("Test of(CharSource) with 'source'; when StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertiesFile PropertiesFile.of(CharSource)"})
  void testOfWithSource_whenStringCharSourceWithStrIsSemicolon() {
    // Arrange, Act and Assert
    assertTrue(PropertiesFile.of(StringCharSource.of(";")).getProperties().isEmpty());
  }

  /**
   * Test {@link PropertiesFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>When {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying is
   *       {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link PropertiesFile#of(CharSource)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource) with 'source'; when UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertiesFile PropertiesFile.of(CharSource)"})
  void testOfWithSource_whenUnicodeBomCharSourceWithUnderlyingIsEmpty() {
    // Arrange, Act and Assert
    assertTrue(
        PropertiesFile.of(new UnicodeBomCharSource(ArrayByteSource.EMPTY))
            .getProperties()
            .isEmpty());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PropertiesFile#toString()}
   *   <li>{@link PropertiesFile#getProperties()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PropertySet PropertiesFile.getProperties()",
    "String PropertiesFile.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    PropertiesFile ofResult = PropertiesFile.of(StringCharSource.EMPTY);

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("{}", actualToStringResult);
    assertTrue(ofResult.getProperties().isEmpty());
  }

  /**
   * Test {@link PropertiesFile#equals(Object)}, and {@link PropertiesFile#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PropertiesFile#equals(Object)}
   *   <li>{@link PropertiesFile#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertiesFile.equals(Object)", "int PropertiesFile.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PropertiesFile ofResult = PropertiesFile.of(StringCharSource.EMPTY);
    PropertiesFile ofResult2 = PropertiesFile.of(StringCharSource.EMPTY);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link PropertiesFile#equals(Object)}, and {@link PropertiesFile#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PropertiesFile#equals(Object)}
   *   <li>{@link PropertiesFile#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertiesFile.equals(Object)", "int PropertiesFile.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PropertiesFile ofResult = PropertiesFile.of(StringCharSource.EMPTY);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link PropertiesFile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PropertiesFile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertiesFile.equals(Object)", "int PropertiesFile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PropertiesFile.of(StringCharSource.EMPTY), 1);
  }

  /**
   * Test {@link PropertiesFile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PropertiesFile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertiesFile.equals(Object)", "int PropertiesFile.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PropertiesFile.of(StringCharSource.EMPTY), null);
  }

  /**
   * Test {@link PropertiesFile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PropertiesFile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertiesFile.equals(Object)", "int PropertiesFile.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PropertiesFile.of(StringCharSource.EMPTY), "Different type to PropertiesFile");
  }
}
