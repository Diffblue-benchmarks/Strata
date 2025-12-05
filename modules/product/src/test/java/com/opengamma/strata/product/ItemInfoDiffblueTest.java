package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.direct.MinimalMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ItemInfoDiffblueTest {
  /**
   * Test {@link ItemInfo#empty()}.
   *
   * <p>Method under test: {@link ItemInfo#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ItemInfo ItemInfo.empty()"})
  void testEmpty() {
    // Arrange and Act
    ItemInfo actualEmptyResult = ItemInfo.empty();

    // Assert
    assertFalse(actualEmptyResult.getId().isPresent());
    assertTrue(actualEmptyResult.getAttributes().isEmpty());
    assertTrue(actualEmptyResult.getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link ItemInfo#withId(StandardId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#withId(StandardId)}
   */
  @Test
  @DisplayName("Test withId(StandardId); when 'null'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ItemInfo ItemInfo.withId(StandardId)"})
  void testWithId_whenNull_thenReturnEmpty() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    // Act
    ItemInfo actualWithIdResult = emptyResult.withId(null);

    // Assert
    assertEquals(emptyResult, actualWithIdResult);
  }

  /**
   * Test {@link ItemInfo#getAttributeTypes()}.
   *
   * <p>Method under test: {@link ItemInfo#getAttributeTypes()}
   */
  @Test
  @DisplayName("Test getAttributeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet ItemInfo.getAttributeTypes()"})
  void testGetAttributeTypes() {
    // Arrange, Act and Assert
    assertTrue(ItemInfo.empty().getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link ItemInfo#findAttribute(AttributeType)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#findAttribute(AttributeType)}
   */
  @Test
  @DisplayName(
      "Test findAttribute(AttributeType); when 'java.lang.Object'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional ItemInfo.findAttribute(AttributeType)"})
  void testFindAttribute_whenJavaLangObject_thenReturnNotPresent() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertFalse(emptyResult.findAttribute(type2).isPresent());
  }

  /**
   * Test {@link ItemInfo#withAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#withAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test withAttribute(AttributeType, Object); when 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ItemInfo ItemInfo.withAttribute(AttributeType, Object)"})
  void testWithAttribute_whenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    ItemInfo actualWithAttributeResult = emptyResult.withAttribute(type2, "Value");

    // Assert
    assertEquals(1, actualWithAttributeResult.getAttributeTypes().size());
    assertEquals(1, actualWithAttributeResult.getAttributes().size());
    assertFalse(actualWithAttributeResult.getId().isPresent());
  }

  /**
   * Test {@link ItemInfo#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ItemInfo ItemInfo.withAttributes(Attributes)"})
  void testWithAttributes_whenEmpty_thenReturnEmpty() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    ItemInfo other = ItemInfo.empty();

    // Act
    ItemInfo actualWithAttributesResult = emptyResult.withAttributes(other);

    // Assert
    assertEquals(other, actualWithAttributesResult);
  }

  /**
   * Test {@link ItemInfo#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ItemInfo ItemInfo.withAttributes(Attributes)"})
  void testWithAttributes_whenEmpty_thenReturnEmpty2() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    // Act
    ItemInfo actualWithAttributesResult = emptyResult.withAttributes(PositionInfo.empty());

    // Assert
    assertEquals(emptyResult, actualWithAttributesResult);
  }

  /**
   * Test {@link ItemInfo#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ItemInfo ItemInfo.withAttributes(Attributes)"})
  void testWithAttributes_whenEmpty_thenReturnEmpty3() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    // Act
    ItemInfo actualWithAttributesResult = emptyResult.withAttributes(SimpleAttributes.empty());

    // Assert
    assertEquals(emptyResult, actualWithAttributesResult);
  }

  /**
   * Test {@link ItemInfo#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#withAttributes(Attributes)}
   */
  @Test
  @DisplayName(
      "Test withAttributes(Attributes); when 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ItemInfo ItemInfo.withAttributes(Attributes)"})
  void testWithAttributes_whenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("attributes", type, "attributes");

    // Act
    ItemInfo actualWithAttributesResult =
        emptyResult.withAttributes(SimpleAttributes.of(type2, "Value"));

    // Assert
    assertEquals(1, actualWithAttributesResult.getAttributeTypes().size());
    assertEquals(1, actualWithAttributesResult.getAttributes().size());
    assertFalse(actualWithAttributesResult.getId().isPresent());
  }

  /**
   * Test {@link ItemInfo#meta()}.
   *
   * <p>Method under test: {@link ItemInfo#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean ItemInfo.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<ItemInfo> actualMetaResult = ItemInfo.meta();

    // Assert
    assertTrue(actualMetaResult instanceof MinimalMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("attributes"));
    assertTrue(metaPropertyMapResult.containsKey("id"));
    assertTrue(actualMetaResult.isBuildable());
    Class<ItemInfo> expectedBeanTypeResult = ItemInfo.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link ItemInfo#ItemInfo(StandardId, Map)}.
   *
   * <p>Method under test: {@link ItemInfo#ItemInfo(StandardId, Map)}
   */
  @Test
  @DisplayName("Test new ItemInfo(StandardId, Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ItemInfo.<init>(StandardId, Map)"})
  void testNewItemInfo() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "attributes");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("attributes", type2, "attributes");
    attributes.put(registerInstanceResult2, "Value");

    // Act
    ItemInfo actualItemInfo = new ItemInfo(null, attributes);

    // Assert
    assertEquals(2, actualItemInfo.getAttributeTypes().size());
    assertFalse(actualItemInfo.getId().isPresent());
    assertEquals(attributes, actualItemInfo.getAttributes());
  }

  /**
   * Test {@link ItemInfo#ItemInfo(StandardId, Map)}.
   *
   * <p>Method under test: {@link ItemInfo#ItemInfo(StandardId, Map)}
   */
  @Test
  @DisplayName("Test new ItemInfo(StandardId, Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ItemInfo.<init>(StandardId, Map)"})
  void testNewItemInfo2() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("42", type, "attributes");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("attributes", type2, "attributes");
    attributes.put(registerInstanceResult2, "Value");

    // Act
    ItemInfo actualItemInfo = new ItemInfo(null, attributes);

    // Assert
    assertEquals(2, actualItemInfo.getAttributeTypes().size());
    assertFalse(actualItemInfo.getId().isPresent());
    assertEquals(attributes, actualItemInfo.getAttributes());
  }

  /**
   * Test {@link ItemInfo#ItemInfo(StandardId, Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#ItemInfo(StandardId, Map)}
   */
  @Test
  @DisplayName(
      "Test new ItemInfo(StandardId, Map); given 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ItemInfo.<init>(StandardId, Map)"})
  void testNewItemInfo_givenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("attributes", type, "attributes");
    attributes.put(registerInstanceResult, "Value");

    // Act
    ItemInfo actualItemInfo = new ItemInfo(null, attributes);

    // Assert
    assertEquals(1, actualItemInfo.getAttributeTypes().size());
    assertFalse(actualItemInfo.getId().isPresent());
    assertEquals(attributes, actualItemInfo.getAttributes());
  }

  /**
   * Test {@link ItemInfo#ItemInfo(StandardId, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return AttributeTypes Empty.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#ItemInfo(StandardId, Map)}
   */
  @Test
  @DisplayName(
      "Test new ItemInfo(StandardId, Map); when HashMap(); then return AttributeTypes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ItemInfo.<init>(StandardId, Map)"})
  void testNewItemInfo_whenHashMap_thenReturnAttributeTypesEmpty() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();

    // Act
    ItemInfo actualItemInfo = new ItemInfo(null, attributes);

    // Assert
    assertFalse(actualItemInfo.getId().isPresent());
    assertTrue(actualItemInfo.getAttributeTypes().isEmpty());
    assertEquals(attributes, actualItemInfo.getAttributes());
  }

  /**
   * Test {@link ItemInfo#metaBean()}.
   *
   * <p>Method under test: {@link ItemInfo#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean ItemInfo.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<ItemInfo> actualMetaBeanResult = ItemInfo.empty().metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof MinimalMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("attributes"));
    assertTrue(metaPropertyMapResult.containsKey("id"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<ItemInfo> expectedBeanTypeResult = ItemInfo.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link ItemInfo#getId()}.
   *
   * <p>Method under test: {@link ItemInfo#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional ItemInfo.getId()"})
  void testGetId() {
    // Arrange, Act and Assert
    assertFalse(ItemInfo.empty().getId().isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ItemInfo#toString()}
   *   <li>{@link ItemInfo#getAttributes()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableMap ItemInfo.getAttributes()",
    "String ItemInfo.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    // Act
    String actualToStringResult = emptyResult.toString();

    // Assert
    assertEquals("ItemInfo{id=null, attributes={}}", actualToStringResult);
    assertTrue(emptyResult.getAttributes().isEmpty());
  }

  /**
   * Test {@link ItemInfo#equals(Object)}, and {@link ItemInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ItemInfo#equals(Object)}
   *   <li>{@link ItemInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ItemInfo.equals(Object)", "int ItemInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    ItemInfo emptyResult2 = ItemInfo.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link ItemInfo#equals(Object)}, and {@link ItemInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ItemInfo#equals(Object)}
   *   <li>{@link ItemInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ItemInfo.equals(Object)", "int ItemInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ItemInfo itemInfo = new ItemInfo(null, new HashMap<>());
    ItemInfo emptyResult = ItemInfo.empty();

    // Act and Assert
    assertEquals(itemInfo, emptyResult);
    assertEquals(itemInfo.hashCode(), emptyResult.hashCode());
  }

  /**
   * Test {@link ItemInfo#equals(Object)}, and {@link ItemInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ItemInfo#equals(Object)}
   *   <li>{@link ItemInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ItemInfo.equals(Object)", "int ItemInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link ItemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ItemInfo.equals(Object)", "int ItemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ItemInfo.empty(), 1);
  }

  /**
   * Test {@link ItemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ItemInfo.equals(Object)", "int ItemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    ItemInfo itemInfo = new ItemInfo(null, attributes);

    // Act and Assert
    assertNotEquals(itemInfo, ItemInfo.empty());
  }

  /**
   * Test {@link ItemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ItemInfo.equals(Object)", "int ItemInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    ItemInfo itemInfo = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act and Assert
    assertNotEquals(itemInfo, ItemInfo.empty());
  }

  /**
   * Test {@link ItemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ItemInfo.equals(Object)", "int ItemInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ItemInfo.empty(), null);
  }

  /**
   * Test {@link ItemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ItemInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ItemInfo.equals(Object)", "int ItemInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ItemInfo.empty(), "Different type to ItemInfo");
  }
}
