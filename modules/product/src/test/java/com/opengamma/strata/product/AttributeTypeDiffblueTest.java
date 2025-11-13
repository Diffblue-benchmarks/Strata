package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AttributeTypeDiffblueTest {
  /**
   * Test {@link AttributeType#of(String)}.
   *
   * <ul>
   *   <li>When {@code ' must not be null}.
   *   <li>Then return Name is {@code ' must not be null}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeType#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String); when '' must not be null'; then return Name is '' must not be null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AttributeType AttributeType.of(String)"})
  void testOf_whenMustNotBeNull_thenReturnNameIsMustNotBeNull() {
    // Arrange and Act
    AttributeType<Object> actualOfResult = AttributeType.of("' must not be null");

    // Assert
    assertEquals("' must not be null", actualOfResult.getName());
    assertEquals("' must not be null", actualOfResult.toString());
  }

  /**
   * Test {@link AttributeType#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AttributeType AttributeType.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    AttributeType<Object> actualOfResult = AttributeType.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
  }

  /**
   * Test {@link AttributeType#registerInstance(String, Class, String[])}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeType#registerInstance(String, Class, String[])}
   */
  @Test
  @DisplayName(
      "Test registerInstance(String, Class, String[]); when 'java.lang.Object'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AttributeType AttributeType.registerInstance(String, Class, String[])"})
  void testRegisterInstance_whenJavaLangObject_thenReturnName() {
    // Arrange
    Class<Object> type = Object.class;

    // Act
    AttributeType<Object> actualRegisterInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Assert
    assertEquals("Name", actualRegisterInstanceResult.getName());
    assertEquals("Name", actualRegisterInstanceResult.toString());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AttributeType#getName()}
   *   <li>{@link AttributeType#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AttributeType.getName()", "String AttributeType.toString()"})
  void testGettersAndSetters() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    String actualName = registerInstanceResult.getName();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Name", registerInstanceResult.toString());
  }

  /**
   * Test {@link AttributeType#captureWildcard()}.
   *
   * <p>Method under test: {@link AttributeType#captureWildcard()}
   */
  @Test
  @DisplayName("Test captureWildcard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AttributeType AttributeType.captureWildcard()"})
  void testCaptureWildcard() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    AttributeType<Object> actualCaptureWildcardResult = registerInstanceResult.captureWildcard();

    // Assert
    assertSame(registerInstanceResult, actualCaptureWildcardResult);
  }

  /**
   * Test {@link AttributeType#normalized()}.
   *
   * <p>Method under test: {@link AttributeType#normalized()}
   */
  @Test
  @DisplayName("Test normalized()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AttributeType AttributeType.normalized()"})
  void testNormalized() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    AttributeType<Object> actualNormalizedResult = registerInstanceResult.normalized();

    // Assert
    assertSame(registerInstanceResult, actualNormalizedResult);
  }

  /**
   * Test {@link AttributeType#toStoredForm(Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeType#toStoredForm(Object)}
   */
  @Test
  @DisplayName(
      "Test toStoredForm(Object); given 'java.lang.Object'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AttributeType.toStoredForm(Object)"})
  void testToStoredForm_givenJavaLangObject_whenNull_thenReturnNull() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertNull(registerInstanceResult.toStoredForm(null));
  }

  /**
   * Test {@link AttributeType#toStoredForm(Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeType#toStoredForm(Object)}
   */
  @Test
  @DisplayName(
      "Test toStoredForm(Object); given 'java.lang.Object'; when 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AttributeType.toStoredForm(Object)"})
  void testToStoredForm_givenJavaLangObject_whenValue_thenReturnValue() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertEquals("Value", registerInstanceResult.toStoredForm("Value"));
  }

  /**
   * Test {@link AttributeType#fromStoredForm(Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@code null}.
   *   <li>Then {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeType#fromStoredForm(Object)}
   */
  @Test
  @DisplayName("Test fromStoredForm(Object); given 'java.lang.Object'; when 'null'; then 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AttributeType.fromStoredForm(Object)"})
  void testFromStoredForm_givenJavaLangObject_whenNull_thenNull() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertNull(null);
    assertNull(registerInstanceResult.fromStoredForm(null));
  }

  /**
   * Test {@link AttributeType#fromStoredForm(Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@code Stored Value}.
   *   <li>Then return {@code Stored Value}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeType#fromStoredForm(Object)}
   */
  @Test
  @DisplayName(
      "Test fromStoredForm(Object); given 'java.lang.Object'; when 'Stored Value'; then return 'Stored Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AttributeType.fromStoredForm(Object)"})
  void testFromStoredForm_givenJavaLangObject_whenStoredValue_thenReturnStoredValue() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertEquals("Stored Value", registerInstanceResult.fromStoredForm("Stored Value"));
  }

  /**
   * Test {@link AttributeType#compareTo(AttributeType)} with {@code AttributeType}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link AttributeType#compareTo(AttributeType)}
   */
  @Test
  @DisplayName(
      "Test compareTo(AttributeType) with 'AttributeType'; when 'java.lang.Object'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AttributeType.compareTo(AttributeType)"})
  void testCompareToWithAttributeType_whenJavaLangObject_thenReturnZero() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    Class<Object> type2 = Object.class;
    AttributeType<Object> other = AttributeType.registerInstance("Name", type2, "Aliases");

    // Act and Assert
    assertEquals(0, registerInstanceResult.compareTo(other));
  }

  /**
   * Test {@link AttributeType#equals(Object)}, and {@link AttributeType#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AttributeType#equals(Object)}
   *   <li>{@link AttributeType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttributeType.equals(Object)", "int AttributeType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    Class<Object> type2 = Object.class;
    AttributeType<Object> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");

    // Act and Assert
    assertEquals(registerInstanceResult, registerInstanceResult2);
    assertEquals(registerInstanceResult.hashCode(), registerInstanceResult2.hashCode());
  }

  /**
   * Test {@link AttributeType#equals(Object)}, and {@link AttributeType#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AttributeType#equals(Object)}
   *   <li>{@link AttributeType#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttributeType.equals(Object)", "int AttributeType.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertEquals(registerInstanceResult, registerInstanceResult);
    int expectedHashCodeResult = registerInstanceResult.hashCode();
    assertEquals(expectedHashCodeResult, registerInstanceResult.hashCode());
  }

  /**
   * Test {@link AttributeType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AttributeType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttributeType.equals(Object)", "int AttributeType.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertNotEquals(registerInstanceResult, "Name");
  }

  /**
   * Test {@link AttributeType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AttributeType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttributeType.equals(Object)", "int AttributeType.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertNotEquals(registerInstanceResult, null);
  }

  /**
   * Test {@link AttributeType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AttributeType#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AttributeType.equals(Object)", "int AttributeType.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertNotEquals(registerInstanceResult, "Different type to AttributeType");
  }
}
