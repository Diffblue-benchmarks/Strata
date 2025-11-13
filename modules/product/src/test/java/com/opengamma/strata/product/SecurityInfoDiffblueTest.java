package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.product.SecurityInfo.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SecurityInfoDiffblueTest {
  /**
   * Test {@link SecurityInfo#meta()}.
   *
   * <p>Method under test: {@link SecurityInfo#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SecurityInfo.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SecurityInfo.meta();

    // Assert
    MetaProperty<ImmutableMap<AttributeType<?>, Object>> attributesResult =
        actualMetaResult.attributes();
    assertTrue(attributesResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> idResult = actualMetaResult.id();
    assertTrue(idResult instanceof DirectMetaProperty);
    MetaProperty<SecurityPriceInfo> priceInfoResult = actualMetaResult.priceInfo();
    assertTrue(priceInfoResult instanceof DirectMetaProperty);
    assertEquals("attributes", attributesResult.name());
    assertEquals("id", idResult.name());
    assertEquals("priceInfo", priceInfoResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, attributesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, idResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, priceInfoResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, attributesResult.propertyType());
    Class<SecurityId> expectedPropertyTypeResult2 = SecurityId.class;
    assertEquals(expectedPropertyTypeResult2, idResult.propertyType());
    Class<SecurityInfo> expectedDeclaringTypeResult = SecurityInfo.class;
    assertEquals(expectedDeclaringTypeResult, attributesResult.declaringType());
    Class<SecurityInfo> expectedDeclaringTypeResult2 = SecurityInfo.class;
    assertEquals(expectedDeclaringTypeResult2, idResult.declaringType());
    Class<SecurityInfo> expectedDeclaringTypeResult3 = SecurityInfo.class;
    assertEquals(expectedDeclaringTypeResult3, priceInfoResult.declaringType());
    Class<SecurityPriceInfo> expectedPropertyTypeResult3 = SecurityPriceInfo.class;
    assertEquals(expectedPropertyTypeResult3, priceInfoResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, attributesResult.metaBean());
    assertSame(meta, idResult.metaBean());
    assertSame(meta, priceInfoResult.metaBean());
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
    Class<? extends SecurityInfo> actualBeanTypeResult = SecurityInfo.meta().beanType();

    // Assert
    Class<SecurityInfo> expectedBeanTypeResult = SecurityInfo.class;
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
   *   <li>{@link Meta#priceInfo()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.attributes()",
    "MetaProperty Meta.id()",
    "MetaProperty Meta.priceInfo()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SecurityInfo.meta();

    // Act
    MetaProperty<ImmutableMap<AttributeType<?>, Object>> actualAttributesResult =
        metaResult.attributes();
    MetaProperty<SecurityId> actualIdResult = metaResult.id();

    // Assert
    assertTrue(actualAttributesResult instanceof DirectMetaProperty);
    assertTrue(actualIdResult instanceof DirectMetaProperty);
    assertTrue(metaResult.priceInfo() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code attributes}.
   *   <li>Then return name is {@code attributes}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'attributes'; then return name is 'attributes'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAttributes_thenReturnNameIsAttributes() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = SecurityInfo.meta().metaPropertyGet("attributes");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<SecurityId> idResult = ((Meta) metaBeanResult).id();
    assertTrue(idResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SecurityPriceInfo> priceInfoResult = ((Meta) metaBeanResult).priceInfo();
    assertTrue(priceInfoResult instanceof DirectMetaProperty);
    assertEquals("attributes", actualMetaPropertyGetResult.name());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).attributes());
    assertSame(metaBeanResult, idResult.metaBean());
    assertSame(metaBeanResult, priceInfoResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code id}.
   *   <li>Then return name is {@code id}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'id'; then return name is 'id'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenId_thenReturnNameIsId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = SecurityInfo.meta().metaPropertyGet("id");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<AttributeType<?>, Object>> attributesResult =
        ((Meta) metaBeanResult).attributes();
    assertTrue(attributesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SecurityPriceInfo> priceInfoResult = ((Meta) metaBeanResult).priceInfo();
    assertTrue(priceInfoResult instanceof DirectMetaProperty);
    assertEquals("id", actualMetaPropertyGetResult.name());
    Class<SecurityId> expectedPropertyTypeResult = SecurityId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).id());
    assertSame(metaBeanResult, attributesResult.metaBean());
    assertSame(metaBeanResult, priceInfoResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code priceInfo}.
   *   <li>Then return name is {@code priceInfo}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'priceInfo'; then return name is 'priceInfo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPriceInfo_thenReturnNameIsPriceInfo() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = SecurityInfo.meta().metaPropertyGet("priceInfo");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<AttributeType<?>, Object>> attributesResult =
        ((Meta) metaBeanResult).attributes();
    assertTrue(attributesResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> idResult = ((Meta) metaBeanResult).id();
    assertTrue(idResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("priceInfo", actualMetaPropertyGetResult.name());
    Class<SecurityPriceInfo> expectedPropertyTypeResult = SecurityPriceInfo.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).priceInfo());
    assertSame(metaBeanResult, attributesResult.metaBean());
    assertSame(metaBeanResult, idResult.metaBean());
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
    assertNull(SecurityInfo.meta().metaPropertyGet("Property Name"));
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
        SecurityInfo.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("id");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("attributes");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("priceInfo");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("attributes", getResult2.name());
    assertEquals("id", getResult.name());
    assertEquals("priceInfo", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<SecurityId> expectedPropertyTypeResult2 = SecurityId.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<SecurityInfo> expectedDeclaringTypeResult = SecurityInfo.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<SecurityInfo> expectedDeclaringTypeResult2 = SecurityInfo.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<SecurityInfo> expectedDeclaringTypeResult3 = SecurityInfo.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<SecurityPriceInfo> expectedPropertyTypeResult3 = SecurityPriceInfo.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult3.metaBean());
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
    assertNull(SecurityInfo.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> SecurityInfo.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
        () -> SecurityInfo.meta().propertySet(mock(Bean.class), "attributes", "New Value", true));
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
        () -> SecurityInfo.meta().propertySet(mock(Bean.class), "attributes", "New Value", false));
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
        () -> SecurityInfo.meta().propertySet(mock(Bean.class), "id", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code priceInfo}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'priceInfo'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPriceInfo_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> SecurityInfo.meta().propertySet(mock(Bean.class), "priceInfo", "New Value", true));
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
            SecurityInfo.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
