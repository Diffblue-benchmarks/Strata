package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AttributesDiffblueTest {
  /**
   * Test {@link Attributes#empty()}.
   *
   * <p>Method under test: {@link Attributes#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Attributes Attributes.empty()"})
  void testEmpty() {
    // Arrange and Act
    Attributes actualEmptyResult = Attributes.empty();

    // Assert
    assertTrue(actualEmptyResult instanceof SimpleAttributes);
    assertTrue(((SimpleAttributes) actualEmptyResult).getAttributes().isEmpty());
    assertTrue(actualEmptyResult.getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link Attributes#of(AttributeType, Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return {@link SimpleAttributes}.
   * </ul>
   *
   * <p>Method under test: {@link Attributes#of(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test of(AttributeType, Object); when 'java.lang.Object'; then return SimpleAttributes")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Attributes Attributes.of(AttributeType, Object)"})
  void testOf_whenJavaLangObject_thenReturnSimpleAttributes() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    Attributes actualOfResult = Attributes.of(type2, "Value");

    // Assert
    assertTrue(actualOfResult instanceof SimpleAttributes);
    assertEquals(1, actualOfResult.getAttributeTypes().size());
    assertEquals(1, ((SimpleAttributes) actualOfResult).getAttributes().size());
  }

  /**
   * Test {@link Attributes#getAttribute(AttributeType)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Attributes#getAttribute(AttributeType)}
   */
  @Test
  @DisplayName(
      "Test getAttribute(AttributeType); when 'java.lang.Object'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Attributes.getAttribute(AttributeType)"})
  void testGetAttribute_whenJavaLangObject_thenThrowIllegalArgumentException() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> emptyResult.getAttribute(type2));
  }

  /**
   * Test {@link Attributes#containsAttribute(AttributeType, Object)} with {@code type}, {@code
   * attributeValue}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Attributes#containsAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test containsAttribute(AttributeType, Object) with 'type', 'attributeValue'; when 'java.lang.Object'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Attributes.containsAttribute(AttributeType, Object)"})
  void testContainsAttributeWithTypeAttributeValue_whenJavaLangObject_thenReturnFalse() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertFalse(emptyResult.containsAttribute(type2, "Attribute Value"));
  }

  /**
   * Test {@link Attributes#containsAttribute(AttributeType)} with {@code type}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Attributes#containsAttribute(AttributeType)}
   */
  @Test
  @DisplayName(
      "Test containsAttribute(AttributeType) with 'type'; when 'java.lang.Object'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Attributes.containsAttribute(AttributeType)"})
  void testContainsAttributeWithType_whenJavaLangObject_thenReturnFalse() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertFalse(emptyResult.containsAttribute(type2));
  }

  /**
   * Test {@link Attributes#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link Attributes#withAttributes(Attributes)}
   */
  @Test
  @DisplayName(
      "Test withAttributes(Attributes); when 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Attributes Attributes.withAttributes(Attributes)"})
  void testWithAttributes_whenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("attributes", type, "attributes");

    // Act
    ItemInfo actualWithAttributesResult =
        emptyResult.withAttributes(SimpleAttributes.of(type2, "Value"));

    // Assert
    assertTrue(actualWithAttributesResult instanceof ItemInfo);
    assertEquals(1, actualWithAttributesResult.getAttributeTypes().size());
    assertEquals(1, ((ItemInfo) actualWithAttributesResult).getAttributes().size());
    assertFalse(((ItemInfo) actualWithAttributesResult).getId().isPresent());
  }
}
