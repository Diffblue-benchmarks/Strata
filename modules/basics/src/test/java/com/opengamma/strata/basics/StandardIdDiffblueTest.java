package com.opengamma.strata.basics;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId.Meta;
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

class StandardIdDiffblueTest {
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
    Class<? extends StandardId> actualBeanTypeResult = StandardId.meta().beanType();

    // Assert
    Class<StandardId> expectedBeanTypeResult = StandardId.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#scheme()}
   *   <li>{@link Meta#value()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.scheme()", "MetaProperty Meta.value()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = StandardId.meta();

    // Act
    MetaProperty<String> actualSchemeResult = metaResult.scheme();

    // Assert
    assertTrue(actualSchemeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.value() instanceof DirectMetaProperty);
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
    assertNull(StandardId.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code scheme}.
   *   <li>Then metaBean value return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'scheme'; then metaBean value return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenScheme_thenMetaBeanValueReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = StandardId.meta().metaPropertyGet("scheme");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> valueResult = ((Meta) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("scheme", actualMetaPropertyGetResult.name());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    Class<StandardId> expectedDeclaringTypeResult = StandardId.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).scheme());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then metaBean scheme return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'value'; then metaBean scheme return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValue_thenMetaBeanSchemeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = StandardId.meta().metaPropertyGet("value");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> schemeResult = ((Meta) metaBeanResult).scheme();
    assertTrue(schemeResult instanceof DirectMetaProperty);
    assertEquals("scheme", schemeResult.name());
    assertEquals("value", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, schemeResult.style());
    Class<StandardId> expectedDeclaringTypeResult = StandardId.class;
    assertEquals(expectedDeclaringTypeResult, schemeResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, schemeResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).value());
    assertSame(Meta.INSTANCE, schemeResult.metaBean());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = StandardId.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("scheme");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("value");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("scheme", getResult.name());
    assertEquals("value", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<StandardId> expectedDeclaringTypeResult = StandardId.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<StandardId> expectedDeclaringTypeResult2 = StandardId.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
    assertNull(StandardId.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> StandardId.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when StandardId with 'Scheme' and value is '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenStandardIdWithSchemeAndValueIs42_thenReturn42() {
    // Arrange
    Meta metaResult = StandardId.meta();

    // Act and Assert
    assertEquals("42", metaResult.propertyGet(StandardId.of("Scheme", "42"), "value", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return {@code Scheme}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when StandardId with 'Scheme' and value is '42'; then return 'Scheme'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenStandardIdWithSchemeAndValueIs42_thenReturnScheme() {
    // Arrange
    Meta metaResult = StandardId.meta();

    // Act and Assert
    assertEquals("Scheme", metaResult.propertyGet(StandardId.of("Scheme", "42"), "scheme", true));
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
        () -> StandardId.meta().propertySet(mock(Bean.class), "scheme", "New Value", false));
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
        () -> StandardId.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code scheme}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'scheme'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenScheme_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> StandardId.meta().propertySet(mock(Bean.class), "scheme", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'value'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> StandardId.meta().propertySet(mock(Bean.class), "value", "New Value", true));
  }

  /**
   * Test {@link StandardId#of(String, String)}.
   *
   * <ul>
   *   <li>When {@code Scheme}.
   *   <li>Then return Value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#of(String, String)}
   */
  @Test
  @DisplayName("Test of(String, String); when 'Scheme'; then return Value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StandardId StandardId.of(String, String)"})
  void testOf_whenScheme_thenReturnValueIs42() {
    // Arrange and Act
    StandardId actualOfResult = StandardId.of("Scheme", "42");

    // Assert
    assertEquals("42", actualOfResult.getValue());
    assertEquals("Scheme", actualOfResult.getScheme());
  }

  /**
   * Test {@link StandardId#parse(String)}.
   *
   * <ul>
   *   <li>When {@code str~str}.
   *   <li>Then return Scheme is {@code str}.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'str~str'; then return Scheme is 'str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StandardId StandardId.parse(String)"})
  void testParse_whenStrStr_thenReturnSchemeIsStr() {
    // Arrange and Act
    StandardId actualParseResult = StandardId.parse("str~str");

    // Assert
    assertEquals("str", actualParseResult.getScheme());
    assertEquals("str", actualParseResult.getValue());
  }

  /**
   * Test {@link StandardId#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Str'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StandardId StandardId.parse(String)"})
  void testParse_whenStr_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> StandardId.parse("Str"));
  }

  /**
   * Test {@link StandardId#encodeScheme(String)}.
   *
   * <ul>
   *   <li>When {@code ~Scheme}.
   *   <li>Then return {@code %7EScheme}.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#encodeScheme(String)}
   */
  @Test
  @DisplayName("Test encodeScheme(String); when '~Scheme'; then return '%7EScheme'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StandardId.encodeScheme(String)"})
  void testEncodeScheme_whenScheme_thenReturn7EScheme() {
    // Arrange, Act and Assert
    assertEquals("%7EScheme", StandardId.encodeScheme("~Scheme"));
  }

  /**
   * Test {@link StandardId#encodeScheme(String)}.
   *
   * <ul>
   *   <li>When {@code Scheme}.
   *   <li>Then return {@code Scheme}.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#encodeScheme(String)}
   */
  @Test
  @DisplayName("Test encodeScheme(String); when 'Scheme'; then return 'Scheme'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StandardId.encodeScheme(String)"})
  void testEncodeScheme_whenScheme_thenReturnScheme() {
    // Arrange, Act and Assert
    assertEquals("Scheme", StandardId.encodeScheme("Scheme"));
  }

  /**
   * Test {@link StandardId#encodeScheme(String)}.
   *
   * <ul>
   *   <li>When {@code Scheme~}.
   *   <li>Then return {@code Scheme%7E}.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#encodeScheme(String)}
   */
  @Test
  @DisplayName("Test encodeScheme(String); when 'Scheme~'; then return 'Scheme%7E'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StandardId.encodeScheme(String)"})
  void testEncodeScheme_whenScheme_thenReturnScheme7e() {
    // Arrange, Act and Assert
    assertEquals("Scheme%7E", StandardId.encodeScheme("Scheme~"));
  }

  /**
   * Test {@link StandardId#encodeScheme(String)}.
   *
   * <ul>
   *   <li>When {@code ~~}.
   *   <li>Then return {@code %7E%7E}.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#encodeScheme(String)}
   */
  @Test
  @DisplayName("Test encodeScheme(String); when '~~'; then return '%7E%7E'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StandardId.encodeScheme(String)"})
  void testEncodeScheme_whenTildeTilde_thenReturn7e7e() {
    // Arrange, Act and Assert
    assertEquals("%7E%7E", StandardId.encodeScheme("~~"));
  }

  /**
   * Test {@link StandardId#encodeScheme(String)}.
   *
   * <ul>
   *   <li>When {@code ~}.
   *   <li>Then return {@code %7E}.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#encodeScheme(String)}
   */
  @Test
  @DisplayName("Test encodeScheme(String); when '~'; then return '%7E'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String StandardId.encodeScheme(String)"})
  void testEncodeScheme_whenTilde_thenReturn7e() {
    // Arrange, Act and Assert
    assertEquals("%7E", StandardId.encodeScheme("~"));
  }

  /**
   * Test {@link StandardId#compareTo(StandardId)} with {@code StandardId}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#compareTo(StandardId)}
   */
  @Test
  @DisplayName(
      "Test compareTo(StandardId) with 'StandardId'; given StandardId with 'Scheme' and value is '42'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int StandardId.compareTo(StandardId)"})
  void testCompareToWithStandardId_givenStandardIdWithSchemeAndValueIs42_thenReturnZero() {
    // Arrange
    StandardId ofResult = StandardId.of("Scheme", "42");

    // Act and Assert
    assertEquals(0, ofResult.compareTo(StandardId.of("Scheme", "42")));
  }

  /**
   * Test {@link StandardId#compareTo(StandardId)} with {@code StandardId}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#compareTo(StandardId)}
   */
  @Test
  @DisplayName("Test compareTo(StandardId) with 'StandardId'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int StandardId.compareTo(StandardId)"})
  void testCompareToWithStandardId_thenReturnMinusOne() {
    // Arrange
    StandardId ofResult = StandardId.of(":/+.=_-", "42");

    // Act and Assert
    assertEquals(-1, ofResult.compareTo(StandardId.of("Scheme", "42")));
  }

  /**
   * Test {@link StandardId#compareTo(StandardId)} with {@code StandardId}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#compareTo(StandardId)}
   */
  @Test
  @DisplayName("Test compareTo(StandardId) with 'StandardId'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int StandardId.compareTo(StandardId)"})
  void testCompareToWithStandardId_thenReturnOne() {
    // Arrange
    StandardId ofResult = StandardId.of("com.opengamma.strata.basics.StandardId", "42");

    // Act and Assert
    assertEquals(1, ofResult.compareTo(StandardId.of("Scheme", "42")));
  }

  /**
   * Test {@link StandardId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StandardId.equals(Object)", "int StandardId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(StandardId.of("Scheme", "42"), "Obj");
  }

  /**
   * Test {@link StandardId#meta()}.
   *
   * <p>Method under test: {@link StandardId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta StandardId.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = StandardId.meta();

    // Assert
    MetaProperty<String> schemeResult = actualMetaResult.scheme();
    assertTrue(schemeResult instanceof DirectMetaProperty);
    MetaProperty<String> valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("scheme", schemeResult.name());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, schemeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<StandardId> expectedDeclaringTypeResult = StandardId.class;
    assertEquals(expectedDeclaringTypeResult, schemeResult.declaringType());
    Class<StandardId> expectedDeclaringTypeResult2 = StandardId.class;
    assertEquals(expectedDeclaringTypeResult2, valueResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, schemeResult.propertyType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, valueResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, schemeResult.metaBean());
    assertSame(meta, valueResult.metaBean());
  }

  /**
   * Test {@link StandardId#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link StandardId#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given StandardId with 'Scheme' and value is '42'; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta StandardId.metaBean()"})
  void testMetaBean_givenStandardIdWithSchemeAndValueIs42_thenReturnInstance() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, StandardId.of("Scheme", "42").metaBean());
  }
}
