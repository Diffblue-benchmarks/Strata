package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import java.util.HashMap;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PortfolioItemInfoDiffblueTest {
  /**
   * Test {@link PortfolioItemInfo#empty()}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.empty()"})
  void testEmpty() {
    // Arrange and Act
    PortfolioItemInfo actualEmptyResult = PortfolioItemInfo.empty();

    // Assert
    assertTrue(actualEmptyResult instanceof ItemInfo);
    assertFalse(actualEmptyResult.getId().isPresent());
    assertTrue(((ItemInfo) actualEmptyResult).getAttributes().isEmpty());
    assertTrue(actualEmptyResult.getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link PortfolioItemInfo#of(AttributeType, Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return {@link ItemInfo}.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemInfo#of(AttributeType, Object)}
   */
  @Test
  @DisplayName("Test of(AttributeType, Object); when 'java.lang.Object'; then return ItemInfo")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.of(AttributeType, Object)"})
  void testOf_whenJavaLangObject_thenReturnItemInfo() {
    // Arrange
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    PortfolioItemInfo actualOfResult = PortfolioItemInfo.of(type2, "Value");

    // Assert
    assertTrue(actualOfResult instanceof ItemInfo);
    assertEquals(1, actualOfResult.getAttributeTypes().size());
    assertEquals(1, ((ItemInfo) actualOfResult).getAttributes().size());
    assertFalse(actualOfResult.getId().isPresent());
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    PortfolioItemInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof ItemInfo);
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith2() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    PortfolioItemInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof ItemInfo);
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith3() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("BuySell", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    PortfolioItemInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof ItemInfo);
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith4() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    PortfolioItemInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof ItemInfo);
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith5() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    Class<Object> type2 = Object.class;
    AttributeType<Object> registerInstanceResult2 =
        AttributeType.registerInstance("attributes", type2, "attributes");

    attributes.put(registerInstanceResult, registerInstanceResult2);
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PortfolioItemInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof ItemInfo);
    Optional<StandardId> id2 = actualCombinedWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith6() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult = AttributeType.registerInstance("42", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("BuySell", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    Class<Object> type3 = Object.class;
    AttributeType<?> registerInstanceResult3 =
        AttributeType.registerInstance("Name", type3, "Aliases");
    attributes.put(registerInstanceResult3, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    PortfolioItemInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof ItemInfo);
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo); given empty; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    ItemInfo other = ItemInfo.empty();

    // Act
    PortfolioItemInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertSame(other, actualCombinedWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo); given empty; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_givenEmpty_whenEmpty_thenReturnEmpty2() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    // Act
    PortfolioItemInfo actualCombinedWithResult = emptyResult.combinedWith(PositionInfo.empty());

    // Assert
    assertSame(emptyResult, actualCombinedWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given one.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo); given one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_givenOne() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, 1);
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PortfolioItemInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof ItemInfo);
    Optional<StandardId> id2 = actualCombinedWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>When empty.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(PortfolioItemInfo); given StandardId with 'Scheme' and value is '42'; when empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_givenStandardIdWithSchemeAndValueIs42_whenEmpty() {
    // Arrange
    StandardId id = StandardId.of("Scheme", "42");
    ItemInfo itemInfo = new ItemInfo(id, new HashMap<>());

    // Act
    PortfolioItemInfo actualCombinedWithResult = itemInfo.combinedWith(ItemInfo.empty());

    // Assert
    assertSame(itemInfo, actualCombinedWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with scheme is {@code attributes} and value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(PortfolioItemInfo); given StandardId with scheme is 'attributes' and value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_givenStandardIdWithSchemeIsAttributesAndValueIs42() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, StandardId.of("attributes", "42"));
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PortfolioItemInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof ItemInfo);
    Optional<StandardId> id2 = actualCombinedWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Then return {@link ItemInfo#ItemInfo(StandardId, Map)} with id is {@link StandardId} and
   *       attributes is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(PortfolioItemInfo); then return ItemInfo(StandardId, Map) with id is StandardId and attributes is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_thenReturnItemInfoWithIdIsStandardIdAndAttributesIsHashMap() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    StandardId id = StandardId.of("Scheme", "42");
    ItemInfo other = new ItemInfo(id, new HashMap<>());

    // Act
    PortfolioItemInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof ItemInfo);
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    PortfolioItemInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertTrue(actualOverrideWithResult instanceof ItemInfo);
    assertEquals(other, actualOverrideWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith2() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("attributes", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    PortfolioItemInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertTrue(actualOverrideWithResult instanceof ItemInfo);
    assertEquals(other, actualOverrideWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith3() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    PortfolioItemInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertTrue(actualOverrideWithResult instanceof ItemInfo);
    assertEquals(other, actualOverrideWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith4() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("BuySell", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    PortfolioItemInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertTrue(actualOverrideWithResult instanceof ItemInfo);
    assertEquals(other, actualOverrideWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith5() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("BuySell", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("attributes", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    Class<Object> type3 = Object.class;
    AttributeType<?> registerInstanceResult3 =
        AttributeType.registerInstance("Name", type3, "Aliases");
    attributes.put(registerInstanceResult3, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    PortfolioItemInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertTrue(actualOverrideWithResult instanceof ItemInfo);
    assertEquals(other, actualOverrideWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith6() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    Class<Object> type2 = Object.class;
    AttributeType<Object> registerInstanceResult2 =
        AttributeType.registerInstance("attributes", type2, "attributes");

    attributes.put(registerInstanceResult, registerInstanceResult2);
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PortfolioItemInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertTrue(actualOverrideWithResult instanceof ItemInfo);
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given one.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo); given one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_givenOne() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, 1);
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PortfolioItemInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertTrue(actualOverrideWithResult instanceof ItemInfo);
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Then return {@link ItemInfo#ItemInfo(StandardId, Map)} with id is {@link StandardId} and
   *       attributes is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test overrideWith(PortfolioItemInfo); then return ItemInfo(StandardId, Map) with id is StandardId and attributes is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_thenReturnItemInfoWithIdIsStandardIdAndAttributesIsHashMap() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    StandardId id = StandardId.of("Scheme", "42");
    ItemInfo other = new ItemInfo(id, new HashMap<>());

    // Act
    PortfolioItemInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertTrue(actualOverrideWithResult instanceof ItemInfo);
    assertEquals(other, actualOverrideWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_whenEmpty_thenReturnEmpty() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();
    ItemInfo other = ItemInfo.empty();

    // Act
    PortfolioItemInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertSame(other, actualOverrideWithResult);
  }

  /**
   * Test {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemInfo PortfolioItemInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_whenEmpty_thenReturnEmpty2() {
    // Arrange
    ItemInfo emptyResult = ItemInfo.empty();

    // Act
    PortfolioItemInfo actualOverrideWithResult = emptyResult.overrideWith(PositionInfo.empty());

    // Assert
    assertSame(emptyResult, actualOverrideWithResult);
  }
}
