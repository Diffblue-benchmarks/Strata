package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.product.PositionInfo.Meta;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PositionInfoDiffblueTest {
  /**
   * Test {@link PositionInfo#empty()}.
   *
   * <p>Method under test: {@link PositionInfo#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.empty()"})
  void testEmpty() {
    // Arrange and Act
    PositionInfo actualEmptyResult = PositionInfo.empty();

    // Assert
    assertFalse(actualEmptyResult.getId().isPresent());
    assertTrue(actualEmptyResult.getAttributes().isEmpty());
    assertTrue(actualEmptyResult.getAttributeTypes().isEmpty());
  }

  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends PositionInfo> actualBeanTypeResult = PositionInfo.meta().beanType();

    // Assert
    Class<PositionInfo> expectedBeanTypeResult = PositionInfo.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#attributes()}
   *   <li>{@link Meta#id()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.attributes()", "MetaProperty Meta.id()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = PositionInfo.meta();

    // Act
    MetaProperty<ImmutableMap<AttributeType<?>, Object>> actualAttributesResult =
        metaResult.attributes();

    // Assert
    assertTrue(actualAttributesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.id() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code attributes}.
   *   <li>Then metaBean id return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'attributes'; then metaBean id return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAttributes_thenMetaBeanIdReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = PositionInfo.meta().metaPropertyGet("attributes");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<StandardId> idResult = ((Meta) metaBeanResult).id();
    assertTrue(idResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("attributes", actualMetaPropertyGetResult.name());
    assertEquals("id", idResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, idResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<StandardId> expectedPropertyTypeResult2 = StandardId.class;
    assertEquals(expectedPropertyTypeResult2, idResult.propertyType());
    Class<PositionInfo> expectedDeclaringTypeResult = PositionInfo.class;
    assertEquals(expectedDeclaringTypeResult, idResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).attributes());
    assertSame(Meta.INSTANCE, idResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code id}.
   *   <li>Then metaBean attributes return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'id'; then metaBean attributes return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenId_thenMetaBeanAttributesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = PositionInfo.meta().metaPropertyGet("id");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<AttributeType<?>, Object>> attributesResult =
        ((Meta) metaBeanResult).attributes();
    assertTrue(attributesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("attributes", attributesResult.name());
    assertEquals("id", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, attributesResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, attributesResult.propertyType());
    Class<StandardId> expectedPropertyTypeResult2 = StandardId.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    Class<PositionInfo> expectedDeclaringTypeResult = PositionInfo.class;
    assertEquals(expectedDeclaringTypeResult, attributesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).id());
    assertSame(Meta.INSTANCE, attributesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PositionInfo.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        PositionInfo.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("id");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("attributes");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("attributes", getResult2.name());
    assertEquals("id", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<StandardId> expectedPropertyTypeResult2 = StandardId.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<PositionInfo> expectedDeclaringTypeResult = PositionInfo.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<PositionInfo> expectedDeclaringTypeResult2 = PositionInfo.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code attributes}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'attributes'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenAttributes_thenReturnMap() {
    // Arrange
    Meta metaResult = PositionInfo.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(PositionInfo.empty(), "attributes", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PositionInfo.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = PositionInfo.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(PositionInfo.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code id}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'id'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenId_thenReturnNull() {
    // Arrange
    Meta metaResult = PositionInfo.meta();

    // Act and Assert
    assertNull(metaResult.propertyGet(PositionInfo.empty(), "id", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code attributes}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'attributes'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAttributes_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> PositionInfo.meta().propertySet(mock(Bean.class), "attributes", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> PositionInfo.meta().propertySet(mock(Bean.class), "attributes", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code id}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'id'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> PositionInfo.meta().propertySet(mock(Bean.class), "id", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            PositionInfo.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link PositionInfo#of(StandardId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return not Id Present.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#of(StandardId)}
   */
  @Test
  @DisplayName("Test of(StandardId); when 'null'; then return not Id Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.of(StandardId)"})
  void testOf_whenNull_thenReturnNotIdPresent() {
    // Arrange and Act
    PositionInfo actualOfResult = PositionInfo.of(null);

    // Assert
    assertFalse(actualOfResult.getId().isPresent());
    assertTrue(actualOfResult.getAttributes().isEmpty());
    assertTrue(actualOfResult.getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link PositionInfo#from(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PositionInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test from(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.from(PortfolioItemInfo)"})
  void testFrom() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("attributeType", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo info = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualFromResult = PositionInfo.from(info);

    // Assert
    assertEquals(2, actualFromResult.getAttributeTypes().size());
    assertEquals(2, actualFromResult.getAttributes().size());
    Optional<StandardId> id2 = actualFromResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#from(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PositionInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test from(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.from(PortfolioItemInfo)"})
  void testFrom2() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("BuySell", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo info = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualFromResult = PositionInfo.from(info);

    // Assert
    assertEquals(2, actualFromResult.getAttributeTypes().size());
    assertEquals(2, actualFromResult.getAttributes().size());
    Optional<StandardId> id2 = actualFromResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#from(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code AttributeType}.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test from(PortfolioItemInfo); given 'com.opengamma.strata.product.AttributeType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.from(PortfolioItemInfo)"})
  void testFrom_givenComOpengammaStrataProductAttributeType() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo info = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualFromResult = PositionInfo.from(info);

    // Assert
    assertEquals(1, actualFromResult.getAttributeTypes().size());
    assertEquals(1, actualFromResult.getAttributes().size());
    Optional<StandardId> id2 = actualFromResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#from(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test from(PortfolioItemInfo); given 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.from(PortfolioItemInfo)"})
  void testFrom_givenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo info = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualFromResult = PositionInfo.from(info);

    // Assert
    assertEquals(1, actualFromResult.getAttributeTypes().size());
    assertEquals(1, actualFromResult.getAttributes().size());
    Optional<StandardId> id2 = actualFromResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#from(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return not Id Present.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test from(PortfolioItemInfo); when empty; then return not Id Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.from(PortfolioItemInfo)"})
  void testFrom_whenEmpty_thenReturnNotIdPresent() {
    // Arrange and Act
    PositionInfo actualFromResult = PositionInfo.from(ItemInfo.empty());

    // Assert
    assertFalse(actualFromResult.getId().isPresent());
    assertTrue(actualFromResult.getAttributes().isEmpty());
    assertTrue(actualFromResult.getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link PositionInfo#from(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return not Id Present.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test from(PortfolioItemInfo); when empty; then return not Id Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.from(PortfolioItemInfo)"})
  void testFrom_whenEmpty_thenReturnNotIdPresent2() {
    // Arrange and Act
    PositionInfo actualFromResult = PositionInfo.from(PositionInfo.empty());

    // Assert
    assertFalse(actualFromResult.getId().isPresent());
    assertTrue(actualFromResult.getAttributes().isEmpty());
    assertTrue(actualFromResult.getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link PositionInfo#from(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return not Id Present.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test from(PortfolioItemInfo); when empty; then return not Id Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.from(PortfolioItemInfo)"})
  void testFrom_whenEmpty_thenReturnNotIdPresent3() {
    // Arrange and Act
    PositionInfo actualFromResult = PositionInfo.from(TradeInfo.empty());

    // Assert
    assertFalse(actualFromResult.getId().isPresent());
    assertTrue(actualFromResult.getAttributes().isEmpty());
    assertTrue(actualFromResult.getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link PositionInfo#from(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return Attributes Empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test from(PortfolioItemInfo); when StandardId with 'Scheme' and value is '42'; then return Attributes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.from(PortfolioItemInfo)"})
  void testFrom_whenStandardIdWithSchemeAndValueIs42_thenReturnAttributesEmpty() {
    // Arrange
    StandardId id = StandardId.of("Scheme", "42");
    ItemInfo info = new ItemInfo(id, new HashMap<>());

    // Act
    PositionInfo actualFromResult = PositionInfo.from(info);

    // Assert
    assertTrue(actualFromResult.getAttributes().isEmpty());
    assertTrue(actualFromResult.getAttributeTypes().isEmpty());
    Optional<StandardId> id2 = actualFromResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#withId(StandardId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#withId(StandardId)}
   */
  @Test
  @DisplayName("Test withId(StandardId); when 'null'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.withId(StandardId)"})
  void testWithId_whenNull_thenReturnEmpty() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    // Act
    PositionInfo actualWithIdResult = emptyResult.withId(null);

    // Assert
    assertEquals(emptyResult, actualWithIdResult);
  }

  /**
   * Test {@link PositionInfo#getAttributeTypes()}.
   *
   * <p>Method under test: {@link PositionInfo#getAttributeTypes()}
   */
  @Test
  @DisplayName("Test getAttributeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet PositionInfo.getAttributeTypes()"})
  void testGetAttributeTypes() {
    // Arrange, Act and Assert
    assertTrue(PositionInfo.empty().getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link PositionInfo#findAttribute(AttributeType)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#findAttribute(AttributeType)}
   */
  @Test
  @DisplayName(
      "Test findAttribute(AttributeType); when 'java.lang.Object'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional PositionInfo.findAttribute(AttributeType)"})
  void testFindAttribute_whenJavaLangObject_thenReturnNotPresent() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertFalse(emptyResult.findAttribute(type2).isPresent());
  }

  /**
   * Test {@link PositionInfo#withAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#withAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test withAttribute(AttributeType, Object); when 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.withAttribute(AttributeType, Object)"})
  void testWithAttribute_whenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    PositionInfo actualWithAttributeResult = emptyResult.withAttribute(type2, "Value");

    // Assert
    assertEquals(1, actualWithAttributeResult.getAttributeTypes().size());
    assertEquals(1, actualWithAttributeResult.getAttributes().size());
    assertFalse(actualWithAttributeResult.getId().isPresent());
  }

  /**
   * Test {@link PositionInfo#withAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#withAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test withAttribute(AttributeType, Object); when 'java.lang.Object'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.withAttribute(AttributeType, Object)"})
  void testWithAttribute_whenJavaLangObject_thenReturnEmpty() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    PositionInfo actualWithAttributeResult = emptyResult.withAttribute(type2, null);

    // Assert
    assertEquals(emptyResult, actualWithAttributeResult);
  }

  /**
   * Test {@link PositionInfo#withAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#withAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName("Test withAttribute(AttributeType, Object); when 'null'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.withAttribute(AttributeType, Object)"})
  void testWithAttribute_whenNull_thenReturnEmpty() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    // Act
    PositionInfo actualWithAttributeResult = emptyResult.withAttribute(null, null);

    // Assert
    assertEquals(emptyResult, actualWithAttributeResult);
  }

  /**
   * Test {@link PositionInfo#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.withAttributes(Attributes)"})
  void testWithAttributes_whenEmpty_thenReturnEmpty() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    // Act
    PositionInfo actualWithAttributesResult = emptyResult.withAttributes(ItemInfo.empty());

    // Assert
    assertEquals(emptyResult, actualWithAttributesResult);
  }

  /**
   * Test {@link PositionInfo#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.withAttributes(Attributes)"})
  void testWithAttributes_whenEmpty_thenReturnEmpty2() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();
    PositionInfo other = PositionInfo.empty();

    // Act
    PositionInfo actualWithAttributesResult = emptyResult.withAttributes(other);

    // Assert
    assertEquals(other, actualWithAttributesResult);
  }

  /**
   * Test {@link PositionInfo#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.withAttributes(Attributes)"})
  void testWithAttributes_whenEmpty_thenReturnEmpty3() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    // Act
    PositionInfo actualWithAttributesResult = emptyResult.withAttributes(SimpleAttributes.empty());

    // Assert
    assertEquals(emptyResult, actualWithAttributesResult);
  }

  /**
   * Test {@link PositionInfo#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#withAttributes(Attributes)}
   */
  @Test
  @DisplayName("Test withAttributes(Attributes); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.withAttributes(Attributes)"})
  void testWithAttributes_whenEmpty_thenReturnEmpty4() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    // Act
    PositionInfo actualWithAttributesResult = emptyResult.withAttributes(TradeInfo.empty());

    // Assert
    assertEquals(emptyResult, actualWithAttributesResult);
  }

  /**
   * Test {@link PositionInfo#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#withAttributes(Attributes)}
   */
  @Test
  @DisplayName(
      "Test withAttributes(Attributes); when 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.withAttributes(Attributes)"})
  void testWithAttributes_whenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("attributes", type, "attributes");

    // Act
    PositionInfo actualWithAttributesResult =
        emptyResult.withAttributes(SimpleAttributes.of(type2, "Value"));

    // Assert
    assertEquals(1, actualWithAttributesResult.getAttributeTypes().size());
    assertEquals(1, actualWithAttributesResult.getAttributes().size());
    assertFalse(actualWithAttributesResult.getId().isPresent());
  }

  /**
   * Test {@link PositionInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PositionInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("attributeType", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(2, actualCombinedWithResult.getAttributeTypes().size());
    assertEquals(2, actualCombinedWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualCombinedWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PositionInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith2() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("BuySell", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(2, actualCombinedWithResult.getAttributeTypes().size());
    assertEquals(2, actualCombinedWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualCombinedWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code AttributeType}.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(PortfolioItemInfo); given 'com.opengamma.strata.product.AttributeType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_givenComOpengammaStrataProductAttributeType() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(1, actualCombinedWithResult.getAttributeTypes().size());
    assertEquals(1, actualCombinedWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualCombinedWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(PortfolioItemInfo); given 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_givenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(1, actualCombinedWithResult.getAttributeTypes().size());
    assertEquals(1, actualCombinedWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualCombinedWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_whenEmpty_thenReturnEmpty() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    // Act
    PositionInfo actualCombinedWithResult = emptyResult.combinedWith(ItemInfo.empty());

    // Assert
    assertEquals(emptyResult, actualCombinedWithResult);
  }

  /**
   * Test {@link PositionInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_whenEmpty_thenReturnEmpty2() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();
    PositionInfo other = PositionInfo.empty();

    // Act
    PositionInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link PositionInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_whenEmpty_thenReturnEmpty3() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    // Act
    PositionInfo actualCombinedWithResult = emptyResult.combinedWith(TradeInfo.empty());

    // Assert
    assertEquals(emptyResult, actualCombinedWithResult);
  }

  /**
   * Test {@link PositionInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return Attributes Empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(PortfolioItemInfo); when StandardId with 'Scheme' and value is '42'; then return Attributes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_whenStandardIdWithSchemeAndValueIs42_thenReturnAttributesEmpty() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();
    StandardId id = StandardId.of("Scheme", "42");
    ItemInfo other = new ItemInfo(id, new HashMap<>());

    // Act
    PositionInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult.getAttributes().isEmpty());
    assertTrue(actualCombinedWithResult.getAttributeTypes().isEmpty());
    Optional<StandardId> id2 = actualCombinedWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PositionInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("attributeType", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertEquals(2, actualOverrideWithResult.getAttributeTypes().size());
    assertEquals(2, actualOverrideWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link PositionInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith2() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("BuySell", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertEquals(2, actualOverrideWithResult.getAttributeTypes().size());
    assertEquals(2, actualOverrideWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code AttributeType}.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test overrideWith(PortfolioItemInfo); given 'com.opengamma.strata.product.AttributeType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_givenComOpengammaStrataProductAttributeType() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertEquals(1, actualOverrideWithResult.getAttributeTypes().size());
    assertEquals(1, actualOverrideWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test overrideWith(PortfolioItemInfo); given 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_givenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    PositionInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertEquals(1, actualOverrideWithResult.getAttributeTypes().size());
    assertEquals(1, actualOverrideWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_whenEmpty_thenReturnEmpty() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    // Act
    PositionInfo actualOverrideWithResult = emptyResult.overrideWith(ItemInfo.empty());

    // Assert
    assertEquals(emptyResult, actualOverrideWithResult);
  }

  /**
   * Test {@link PositionInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_whenEmpty_thenReturnEmpty2() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();
    PositionInfo other = PositionInfo.empty();

    // Act
    PositionInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertEquals(other, actualOverrideWithResult);
  }

  /**
   * Test {@link PositionInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_whenEmpty_thenReturnEmpty3() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    // Act
    PositionInfo actualOverrideWithResult = emptyResult.overrideWith(TradeInfo.empty());

    // Assert
    assertEquals(emptyResult, actualOverrideWithResult);
  }

  /**
   * Test {@link PositionInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return Attributes Empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test overrideWith(PortfolioItemInfo); when StandardId with 'Scheme' and value is '42'; then return Attributes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo PositionInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_whenStandardIdWithSchemeAndValueIs42_thenReturnAttributesEmpty() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();
    StandardId id = StandardId.of("Scheme", "42");
    ItemInfo other = new ItemInfo(id, new HashMap<>());

    // Act
    PositionInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertTrue(actualOverrideWithResult.getAttributes().isEmpty());
    assertTrue(actualOverrideWithResult.getAttributeTypes().isEmpty());
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link PositionInfo#meta()}.
   *
   * <p>Method under test: {@link PositionInfo#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PositionInfo.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = PositionInfo.meta();

    // Assert
    MetaProperty<ImmutableMap<AttributeType<?>, Object>> attributesResult =
        actualMetaResult.attributes();
    assertTrue(attributesResult instanceof DirectMetaProperty);
    MetaProperty<StandardId> idResult = actualMetaResult.id();
    assertTrue(idResult instanceof DirectMetaProperty);
    assertEquals("attributes", attributesResult.name());
    assertEquals("id", idResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, attributesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, idResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, attributesResult.propertyType());
    Class<StandardId> expectedPropertyTypeResult2 = StandardId.class;
    assertEquals(expectedPropertyTypeResult2, idResult.propertyType());
    Class<PositionInfo> expectedDeclaringTypeResult = PositionInfo.class;
    assertEquals(expectedDeclaringTypeResult, attributesResult.declaringType());
    Class<PositionInfo> expectedDeclaringTypeResult2 = PositionInfo.class;
    assertEquals(expectedDeclaringTypeResult2, idResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, attributesResult.metaBean());
    assertSame(meta, idResult.metaBean());
  }

  /**
   * Test {@link PositionInfo#PositionInfo(StandardId, Map)}.
   *
   * <p>Method under test: {@link PositionInfo#PositionInfo(StandardId, Map)}
   */
  @Test
  @DisplayName("Test new PositionInfo(StandardId, Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PositionInfo.<init>(StandardId, Map)"})
  void testNewPositionInfo() {
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
    PositionInfo actualPositionInfo = new PositionInfo(null, attributes);

    // Assert
    assertEquals(2, actualPositionInfo.getAttributeTypes().size());
    assertFalse(actualPositionInfo.getId().isPresent());
    assertEquals(attributes, actualPositionInfo.getAttributes());
  }

  /**
   * Test {@link PositionInfo#PositionInfo(StandardId, Map)}.
   *
   * <p>Method under test: {@link PositionInfo#PositionInfo(StandardId, Map)}
   */
  @Test
  @DisplayName("Test new PositionInfo(StandardId, Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PositionInfo.<init>(StandardId, Map)"})
  void testNewPositionInfo2() {
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
    PositionInfo actualPositionInfo = new PositionInfo(null, attributes);

    // Assert
    assertEquals(2, actualPositionInfo.getAttributeTypes().size());
    assertFalse(actualPositionInfo.getId().isPresent());
    assertEquals(attributes, actualPositionInfo.getAttributes());
  }

  /**
   * Test {@link PositionInfo#PositionInfo(StandardId, Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#PositionInfo(StandardId, Map)}
   */
  @Test
  @DisplayName(
      "Test new PositionInfo(StandardId, Map); given 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PositionInfo.<init>(StandardId, Map)"})
  void testNewPositionInfo_givenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("attributes", type, "attributes");
    attributes.put(registerInstanceResult, "Value");

    // Act
    PositionInfo actualPositionInfo = new PositionInfo(null, attributes);

    // Assert
    assertEquals(1, actualPositionInfo.getAttributeTypes().size());
    assertFalse(actualPositionInfo.getId().isPresent());
    assertEquals(attributes, actualPositionInfo.getAttributes());
  }

  /**
   * Test {@link PositionInfo#PositionInfo(StandardId, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return AttributeTypes Empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#PositionInfo(StandardId, Map)}
   */
  @Test
  @DisplayName(
      "Test new PositionInfo(StandardId, Map); when HashMap(); then return AttributeTypes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PositionInfo.<init>(StandardId, Map)"})
  void testNewPositionInfo_whenHashMap_thenReturnAttributeTypesEmpty() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();

    // Act
    PositionInfo actualPositionInfo = new PositionInfo(null, attributes);

    // Assert
    assertFalse(actualPositionInfo.getId().isPresent());
    assertTrue(actualPositionInfo.getAttributeTypes().isEmpty());
    assertEquals(attributes, actualPositionInfo.getAttributes());
  }

  /**
   * Test {@link PositionInfo#metaBean()}.
   *
   * <p>Method under test: {@link PositionInfo#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PositionInfo.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, PositionInfo.empty().metaBean());
  }

  /**
   * Test {@link PositionInfo#getId()}.
   *
   * <p>Method under test: {@link PositionInfo#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional PositionInfo.getId()"})
  void testGetId() {
    // Arrange, Act and Assert
    assertFalse(PositionInfo.empty().getId().isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PositionInfo#toString()}
   *   <li>{@link PositionInfo#getAttributes()}
   *   <li>{@link PositionInfo#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap PositionInfo.getAttributes()",
    "PositionInfoBuilder PositionInfo.toBuilder()",
    "String PositionInfo.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    // Act
    String actualToStringResult = emptyResult.toString();
    ImmutableMap<AttributeType<?>, Object> actualAttributes = emptyResult.getAttributes();
    emptyResult.toBuilder();

    // Assert
    assertEquals("PositionInfo{id=null, attributes={}}", actualToStringResult);
    assertTrue(actualAttributes.isEmpty());
  }

  /**
   * Test {@link PositionInfo#equals(Object)}, and {@link PositionInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PositionInfo#equals(Object)}
   *   <li>{@link PositionInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionInfo.equals(Object)", "int PositionInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();
    PositionInfo emptyResult2 = PositionInfo.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link PositionInfo#equals(Object)}, and {@link PositionInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PositionInfo#equals(Object)}
   *   <li>{@link PositionInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionInfo.equals(Object)", "int PositionInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    PositionInfo ofResult = PositionInfo.of(null);
    PositionInfo emptyResult = PositionInfo.empty();

    // Act and Assert
    assertEquals(ofResult, emptyResult);
    assertEquals(ofResult.hashCode(), emptyResult.hashCode());
  }

  /**
   * Test {@link PositionInfo#equals(Object)}, and {@link PositionInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PositionInfo#equals(Object)}
   *   <li>{@link PositionInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionInfo.equals(Object)", "int PositionInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PositionInfo emptyResult = PositionInfo.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link PositionInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionInfo.equals(Object)", "int PositionInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PositionInfo.empty(), 1);
  }

  /**
   * Test {@link PositionInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionInfo.equals(Object)", "int PositionInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    PositionInfo ofResult = PositionInfo.of(StandardId.of("Scheme", "42"));

    // Act and Assert
    assertNotEquals(ofResult, PositionInfo.empty());
  }

  /**
   * Test {@link PositionInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionInfo.equals(Object)", "int PositionInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PositionInfo.empty(), null);
  }

  /**
   * Test {@link PositionInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionInfo.equals(Object)", "int PositionInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PositionInfo.empty(), "Different type to PositionInfo");
  }
}
