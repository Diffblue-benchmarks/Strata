package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import java.util.Optional;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SimpleAttributesDiffblueTest {
  /**
   * Test {@link SimpleAttributes#empty()}.
   *
   * <p>Method under test: {@link SimpleAttributes#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.empty()"})
  void testEmpty() {
    // Arrange and Act
    SimpleAttributes actualEmptyResult = SimpleAttributes.empty();

    // Assert
    assertTrue(actualEmptyResult.getAttributes().isEmpty());
    assertTrue(actualEmptyResult.getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link SimpleAttributes#of(AttributeType, Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#of(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test of(AttributeType, Object); when 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.of(AttributeType, Object)"})
  void testOf_whenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    SimpleAttributes actualOfResult = SimpleAttributes.of(type2, "Value");

    // Assert
    assertEquals(1, actualOfResult.getAttributeTypes().size());
    assertEquals(1, actualOfResult.getAttributes().size());
  }

  /**
   * Test {@link SimpleAttributes#from(Attributes)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return Attributes Empty.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#from(Attributes)}
   */
  @Test
  @DisplayName("Test from(Attributes); when empty; then return Attributes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.from(Attributes)"})
  void testFrom_whenEmpty_thenReturnAttributesEmpty() {
    // Arrange and Act
    SimpleAttributes actualFromResult = SimpleAttributes.from(ItemInfo.empty());

    // Assert
    assertTrue(actualFromResult.getAttributes().isEmpty());
    assertTrue(actualFromResult.getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link SimpleAttributes#from(Attributes)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return Attributes Empty.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#from(Attributes)}
   */
  @Test
  @DisplayName("Test from(Attributes); when empty; then return Attributes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.from(Attributes)"})
  void testFrom_whenEmpty_thenReturnAttributesEmpty2() {
    // Arrange and Act
    SimpleAttributes actualFromResult = SimpleAttributes.from(SimpleAttributes.empty());

    // Assert
    assertTrue(actualFromResult.getAttributes().isEmpty());
    assertTrue(actualFromResult.getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link SimpleAttributes#getAttributeTypes()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#getAttributeTypes()}
   */
  @Test
  @DisplayName("Test getAttributeTypes(); given empty; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet SimpleAttributes.getAttributeTypes()"})
  void testGetAttributeTypes_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(SimpleAttributes.empty().getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link SimpleAttributes#getAttributeTypes()}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#getAttributeTypes()}
   */
  @Test
  @DisplayName("Test getAttributeTypes(); given 'java.lang.Object'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet SimpleAttributes.getAttributeTypes()"})
  void testGetAttributeTypes_givenJavaLangObject_thenReturnSizeIsOne() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertEquals(1, SimpleAttributes.of(type2, "Value").getAttributeTypes().size());
  }

  /**
   * Test {@link SimpleAttributes#findAttribute(AttributeType)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code Object}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#findAttribute(AttributeType)}
   */
  @Test
  @DisplayName(
      "Test findAttribute(AttributeType); given empty; when 'java.lang.Object'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional SimpleAttributes.findAttribute(AttributeType)"})
  void testFindAttribute_givenEmpty_whenJavaLangObject_thenReturnNotPresent() {
    // Arrange
    SimpleAttributes emptyResult = SimpleAttributes.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertFalse(emptyResult.findAttribute(type2).isPresent());
  }

  /**
   * Test {@link SimpleAttributes#findAttribute(AttributeType)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@code Object}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#findAttribute(AttributeType)}
   */
  @Test
  @DisplayName(
      "Test findAttribute(AttributeType); given 'java.lang.Object'; when 'java.lang.Object'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional SimpleAttributes.findAttribute(AttributeType)"})
  void testFindAttribute_givenJavaLangObject_whenJavaLangObject_thenReturnGetIsValue() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");
    SimpleAttributes ofResult = SimpleAttributes.of(type2, "Value");
    Class<Object> type3 = Object.class;
    AttributeType<Object> type4 = AttributeType.registerInstance("Name", type3, "Aliases");

    // Act
    Optional<Object> actualFindAttributeResult = ofResult.findAttribute(type4);

    // Assert
    assertEquals("Value", actualFindAttributeResult.get());
    assertTrue(actualFindAttributeResult.isPresent());
  }

  /**
   * Test {@link SimpleAttributes#withAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return AttributeTypes size is two.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#withAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test withAttribute(AttributeType, Object); given 'java.lang.Object'; then return AttributeTypes size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.withAttribute(AttributeType, Object)"})
  void testWithAttribute_givenJavaLangObject_thenReturnAttributeTypesSizeIsTwo() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("attributes", type, "attributes");
    SimpleAttributes ofResult = SimpleAttributes.of(type2, "Value");
    Class<Object> type3 = Object.class;
    AttributeType<Object> type4 = AttributeType.registerInstance("Name", type3, "Aliases");

    // Act
    SimpleAttributes actualWithAttributeResult = ofResult.withAttribute(type4, "Value");

    // Assert
    assertEquals(2, actualWithAttributeResult.getAttributeTypes().size());
    assertEquals(2, actualWithAttributeResult.getAttributes().size());
  }

  /**
   * Test {@link SimpleAttributes#withAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#withAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test withAttribute(AttributeType, Object); when 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.withAttribute(AttributeType, Object)"})
  void testWithAttribute_whenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    SimpleAttributes emptyResult = SimpleAttributes.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    SimpleAttributes actualWithAttributeResult = emptyResult.withAttribute(type2, "Value");

    // Assert
    assertEquals(1, actualWithAttributeResult.getAttributeTypes().size());
    assertEquals(1, actualWithAttributeResult.getAttributes().size());
  }

  /**
   * Test {@link SimpleAttributes#withAttributes(Attributes)}.
   *
   * <p>Method under test: {@link SimpleAttributes#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.withAttributes(Attributes)"})
  void testWithAttributes() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("attributes", type, "attributes");
    SimpleAttributes ofResult = SimpleAttributes.of(type2, "Value");

    // Act
    SimpleAttributes actualWithAttributesResult = ofResult.withAttributes(ItemInfo.empty());

    // Assert
    assertEquals(ofResult, actualWithAttributesResult);
  }

  /**
   * Test {@link SimpleAttributes#withAttributes(Attributes)}.
   *
   * <p>Method under test: {@link SimpleAttributes#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.withAttributes(Attributes)"})
  void testWithAttributes2() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("attributes", type, "attributes");
    SimpleAttributes ofResult = SimpleAttributes.of(type2, "Value");
    Class<Object> type3 = Object.class;
    AttributeType<Object> type4 = AttributeType.registerInstance("attributes", type3, "attributes");

    // Act
    SimpleAttributes actualWithAttributesResult =
        ofResult.withAttributes(SimpleAttributes.of(type4, "Value"));

    // Assert
    assertEquals(ofResult, actualWithAttributesResult);
  }

  /**
   * Test {@link SimpleAttributes#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes); given empty; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.withAttributes(Attributes)"})
  void testWithAttributes_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange
    SimpleAttributes emptyResult = SimpleAttributes.empty();

    // Act
    SimpleAttributes actualWithAttributesResult = emptyResult.withAttributes(ItemInfo.empty());

    // Assert
    assertEquals(emptyResult, actualWithAttributesResult);
  }

  /**
   * Test {@link SimpleAttributes#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes); given empty; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.withAttributes(Attributes)"})
  void testWithAttributes_givenEmpty_whenEmpty_thenReturnEmpty2() {
    // Arrange
    SimpleAttributes emptyResult = SimpleAttributes.empty();
    SimpleAttributes other = SimpleAttributes.empty();

    // Act
    SimpleAttributes actualWithAttributesResult = emptyResult.withAttributes(other);

    // Assert
    assertEquals(other, actualWithAttributesResult);
  }

  /**
   * Test {@link SimpleAttributes#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>Then return AttributeTypes size is two.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes); then return AttributeTypes size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.withAttributes(Attributes)"})
  void testWithAttributes_thenReturnAttributeTypesSizeIsTwo() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "attributes");
    SimpleAttributes ofResult = SimpleAttributes.of(type2, "Value");
    Class<Object> type3 = Object.class;
    AttributeType<Object> type4 = AttributeType.registerInstance("attributes", type3, "attributes");

    // Act
    SimpleAttributes actualWithAttributesResult =
        ofResult.withAttributes(SimpleAttributes.of(type4, "Value"));

    // Assert
    assertEquals(2, actualWithAttributesResult.getAttributeTypes().size());
    assertEquals(2, actualWithAttributesResult.getAttributes().size());
  }

  /**
   * Test {@link SimpleAttributes#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>Then return {@link SimpleAttributes} with type is {@link
   *       AttributeType#registerInstance(String, Class, String[])} and {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#withAttributes(Attributes)}
   */
  @Test
  @DisplayName(
      "Test withAttributes(Attributes); then return SimpleAttributes with type is registerInstance(String, Class, String[]) and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleAttributes SimpleAttributes.withAttributes(Attributes)"})
  void testWithAttributes_thenReturnSimpleAttributesWithTypeIsRegisterInstanceAndValue() {
    // Arrange
    SimpleAttributes emptyResult = SimpleAttributes.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("attributes", type, "attributes");
    SimpleAttributes other = SimpleAttributes.of(type2, "Value");

    // Act
    SimpleAttributes actualWithAttributesResult = emptyResult.withAttributes(other);

    // Assert
    assertEquals(other, actualWithAttributesResult);
  }

  /**
   * Test {@link SimpleAttributes#meta()}.
   *
   * <p>Method under test: {@link SimpleAttributes#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SimpleAttributes.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SimpleAttributes> actualMetaResult = SimpleAttributes.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("attributes"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SimpleAttributes> expectedBeanTypeResult = SimpleAttributes.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SimpleAttributes#metaBean()}.
   *
   * <p>Method under test: {@link SimpleAttributes#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SimpleAttributes.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<SimpleAttributes> actualMetaBeanResult = SimpleAttributes.empty().metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("attributes"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SimpleAttributes> expectedBeanTypeResult = SimpleAttributes.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleAttributes#toString()}
   *   <li>{@link SimpleAttributes#getAttributes()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableMap SimpleAttributes.getAttributes()",
    "String SimpleAttributes.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SimpleAttributes emptyResult = SimpleAttributes.empty();

    // Act
    String actualToStringResult = emptyResult.toString();

    // Assert
    assertEquals("SimpleAttributes{attributes={}}", actualToStringResult);
    assertTrue(emptyResult.getAttributes().isEmpty());
  }

  /**
   * Test {@link SimpleAttributes#equals(Object)}, and {@link SimpleAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleAttributes#equals(Object)}
   *   <li>{@link SimpleAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleAttributes.equals(Object)", "int SimpleAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SimpleAttributes emptyResult = SimpleAttributes.empty();
    SimpleAttributes emptyResult2 = SimpleAttributes.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link SimpleAttributes#equals(Object)}, and {@link SimpleAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleAttributes#equals(Object)}
   *   <li>{@link SimpleAttributes#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleAttributes.equals(Object)", "int SimpleAttributes.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SimpleAttributes emptyResult = SimpleAttributes.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link SimpleAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleAttributes.equals(Object)", "int SimpleAttributes.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");
    SimpleAttributes ofResult = SimpleAttributes.of(type2, "Value");

    // Act and Assert
    assertNotEquals(ofResult, SimpleAttributes.empty());
  }

  /**
   * Test {@link SimpleAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleAttributes.equals(Object)", "int SimpleAttributes.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SimpleAttributes.empty(), null);
  }

  /**
   * Test {@link SimpleAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleAttributes#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SimpleAttributes.equals(Object)", "int SimpleAttributes.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SimpleAttributes.empty(), "Different type to SimpleAttributes");
  }
}
