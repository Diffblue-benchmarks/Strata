package com.opengamma.strata.collect.tuple;

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
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.tuple.ObjIntPair.Meta;
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

class ObjIntPairDiffblueTest {
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);

    // Act
    Class<? extends ObjIntPair<Object>> actualBeanTypeResult = metaObjIntPairResult.beanType();

    // Assert
    Class<ObjIntPair> expectedBeanTypeResult = ObjIntPair.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#first()}
   *   <li>{@link Meta#second()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.first()", "MetaProperty Meta.second()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ObjIntPair.meta();

    // Act
    MetaProperty actualFirstResult = metaResult.first();

    // Assert
    assertTrue(actualFirstResult instanceof DirectMetaProperty);
    assertTrue(metaResult.second() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code first}.
   *   <li>Then metaBean second return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'first'; then metaBean second return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFirst_thenMetaBeanSecondReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult = metaObjIntPairResult.metaPropertyGet("first");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> secondResult = ((Meta<Object>) metaBeanResult).second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("first", actualMetaPropertyGetResult.name());
    assertEquals("int", secondResult.propertyType().getName());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    Class<ObjIntPair> expectedDeclaringTypeResult = ObjIntPair.class;
    assertEquals(expectedDeclaringTypeResult, secondResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).first());
    assertSame(Meta.INSTANCE, secondResult.metaBean());
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);

    // Act and Assert
    assertNull(metaObjIntPairResult.metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code second}.
   *   <li>Then metaBean first return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'second'; then metaBean first return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSecond_thenMetaBeanFirstReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult = metaObjIntPairResult.metaPropertyGet("second");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Object> firstResult = ((Meta<Object>) metaBeanResult).first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("first", firstResult.name());
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("second", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    Class<ObjIntPair> expectedDeclaringTypeResult = ObjIntPair.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, firstResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).second());
    assertSame(Meta.INSTANCE, firstResult.metaBean());
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        metaObjIntPairResult.metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("first");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("second");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("first", getResult.name());
    assertEquals("int", getResult2.propertyType().getName());
    assertEquals("second", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<ObjIntPair> expectedDeclaringTypeResult = ObjIntPair.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ObjIntPair> expectedDeclaringTypeResult2 = ObjIntPair.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);

    // Act and Assert
    assertNull(metaObjIntPairResult.propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When ofPair of {@code First} and {@code -906279820}.
   *   <li>Then return {@code First}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when ofPair of 'First' and '-906279820'; then return 'First'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenOfPairOfFirstAnd906279820_thenReturnFirst() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);
    Pair<Object, Integer> pair = Pair.of("First", -906279820);
    ObjIntPair<Object> bean = ObjIntPair.ofPair(pair);

    // Act and Assert
    assertEquals("First", metaObjIntPairResult.propertyGet(bean, "first", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When ofPair of {@code First} and {@code -906279820}.
   *   <li>Then return intValue is {@code -906279820}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when ofPair of 'First' and '-906279820'; then return intValue is '-906279820'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenOfPairOfFirstAnd906279820_thenReturnIntValueIs906279820() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);
    Pair<Object, Integer> pair = Pair.of("First", -906279820);
    ObjIntPair<Object> bean = ObjIntPair.ofPair(pair);

    // Act and Assert
    assertEquals(
        -906279820, ((Integer) metaObjIntPairResult.propertyGet(bean, "second", true)).intValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When ofPair of {@code First} and one.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when ofPair of 'First' and one; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenOfPairOfFirstAndOne_thenThrowNoSuchElementException() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> bean = ObjIntPair.ofPair(pair);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaObjIntPairResult.propertyGet(bean, "Property Name", false));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> metaObjIntPairResult.propertySet(mock(Bean.class), "first", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code first}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'first'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFirst_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);

    // Act and Assert
    assertDoesNotThrow(
        () -> metaObjIntPairResult.propertySet(mock(Bean.class), "first", "New Value", true));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaObjIntPairResult.propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code second}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'second'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSecond_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);

    // Act and Assert
    assertDoesNotThrow(
        () -> metaObjIntPairResult.propertySet(mock(Bean.class), "second", "New Value", true));
  }

  /**
   * Test {@link ObjIntPair#of(Object, int)}.
   *
   * <ul>
   *   <li>When {@code First}.
   *   <li>Then return {@code First}.
   * </ul>
   *
   * <p>Method under test: {@link ObjIntPair#of(Object, int)}
   */
  @Test
  @DisplayName("Test of(Object, int); when 'First'; then return 'First'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ObjIntPair ObjIntPair.of(Object, int)"})
  void testOf_whenFirst_thenReturnFirst() {
    // Arrange and Act
    ObjIntPair<Object> actualOfResult = ObjIntPair.of("First", 1);

    // Assert
    assertEquals("First", actualOfResult.getFirst());
    assertEquals(1, actualOfResult.getSecond());
    assertEquals(2, actualOfResult.size());
  }

  /**
   * Test {@link ObjIntPair#ofPair(Pair)}.
   *
   * <ul>
   *   <li>When of {@code First} and one.
   *   <li>Then return {@code First}.
   * </ul>
   *
   * <p>Method under test: {@link ObjIntPair#ofPair(Pair)}
   */
  @Test
  @DisplayName("Test ofPair(Pair); when of 'First' and one; then return 'First'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ObjIntPair ObjIntPair.ofPair(Pair)"})
  void testOfPair_whenOfFirstAndOne_thenReturnFirst() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);

    // Act
    ObjIntPair<Object> actualOfPairResult = ObjIntPair.ofPair(pair);

    // Assert
    assertEquals("First", actualOfPairResult.getFirst());
    assertEquals(1, actualOfPairResult.getSecond());
    assertEquals(2, actualOfPairResult.size());
  }

  /**
   * Test {@link ObjIntPair#elements()}.
   *
   * <p>Method under test: {@link ObjIntPair#elements()}
   */
  @Test
  @DisplayName("Test elements()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList ObjIntPair.elements()"})
  void testElements() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);

    // Act
    ImmutableList<Object> actualElementsResult = ofPairResult.elements();

    // Assert
    assertEquals(2, actualElementsResult.size());
    assertEquals("First", actualElementsResult.get(0));
    assertEquals(1, ((Integer) actualElementsResult.get(1)).intValue());
  }

  /**
   * Test {@link ObjIntPair#toPair()}.
   *
   * <p>Method under test: {@link ObjIntPair#toPair()}
   */
  @Test
  @DisplayName("Test toPair()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair ObjIntPair.toPair()"})
  void testToPair() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);

    // Act and Assert
    assertEquals(pair, ofPairResult.toPair());
  }

  /**
   * Test {@link ObjIntPair#compareTo(ObjIntPair)} with {@code ObjIntPair}.
   *
   * <ul>
   *   <li>Given ofPair of {@code 42} and one.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link ObjIntPair#compareTo(ObjIntPair)}
   */
  @Test
  @DisplayName(
      "Test compareTo(ObjIntPair) with 'ObjIntPair'; given ofPair of '42' and one; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ObjIntPair.compareTo(ObjIntPair)"})
  void testCompareToWithObjIntPair_givenOfPairOf42AndOne_thenReturnMinusOne() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("42", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);
    Pair<Object, Integer> pair2 = Pair.of("First", 1);
    ObjIntPair<Object> other = ObjIntPair.ofPair(pair2);

    // Act and Assert
    assertEquals(-1, ofPairResult.compareTo(other));
  }

  /**
   * Test {@link ObjIntPair#compareTo(ObjIntPair)} with {@code ObjIntPair}.
   *
   * <ul>
   *   <li>Given ofPair of {@code First} and one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ObjIntPair#compareTo(ObjIntPair)}
   */
  @Test
  @DisplayName(
      "Test compareTo(ObjIntPair) with 'ObjIntPair'; given ofPair of 'First' and one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ObjIntPair.compareTo(ObjIntPair)"})
  void testCompareToWithObjIntPair_givenOfPairOfFirstAndOne_thenReturnZero() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);
    Pair<Object, Integer> pair2 = Pair.of("First", 1);
    ObjIntPair<Object> other = ObjIntPair.ofPair(pair2);

    // Act and Assert
    assertEquals(0, ofPairResult.compareTo(other));
  }

  /**
   * Test {@link ObjIntPair#compareTo(ObjIntPair)} with {@code ObjIntPair}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ObjIntPair#compareTo(ObjIntPair)}
   */
  @Test
  @DisplayName("Test compareTo(ObjIntPair) with 'ObjIntPair'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ObjIntPair.compareTo(ObjIntPair)"})
  void testCompareToWithObjIntPair_thenReturnOne() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("com.opengamma.strata.collect.tuple.Pair", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);
    Pair<Object, Integer> pair2 = Pair.of("First", 1);
    ObjIntPair<Object> other = ObjIntPair.ofPair(pair2);

    // Act and Assert
    assertEquals(1, ofPairResult.compareTo(other));
  }

  /**
   * Test {@link ObjIntPair#meta()}.
   *
   * <p>Method under test: {@link ObjIntPair#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ObjIntPair.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ObjIntPair.meta();

    // Assert
    MetaProperty firstResult = actualMetaResult.first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    MetaProperty<Integer> secondResult = actualMetaResult.second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("first", firstResult.name());
    assertEquals("int", secondResult.propertyType().getName());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ObjIntPair> expectedDeclaringTypeResult = ObjIntPair.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<ObjIntPair> expectedDeclaringTypeResult2 = ObjIntPair.class;
    assertEquals(expectedDeclaringTypeResult2, secondResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, firstResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, firstResult.metaBean());
    assertSame(meta, secondResult.metaBean());
  }

  /**
   * Test {@link ObjIntPair#metaObjIntPair(Class)}.
   *
   * <p>Method under test: {@link ObjIntPair#metaObjIntPair(Class)}
   */
  @Test
  @DisplayName("Test metaObjIntPair(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ObjIntPair.metaObjIntPair(Class)"})
  void testMetaObjIntPair() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Meta<Object> actualMetaObjIntPairResult = ObjIntPair.metaObjIntPair(cls);

    // Assert
    MetaProperty<Object> firstResult = actualMetaObjIntPairResult.first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    MetaProperty<Integer> secondResult = actualMetaObjIntPairResult.second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("first", firstResult.name());
    assertEquals("int", secondResult.propertyType().getName());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    assertTrue(actualMetaObjIntPairResult.isBuildable());
    Class<ObjIntPair> expectedDeclaringTypeResult = ObjIntPair.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<ObjIntPair> expectedDeclaringTypeResult2 = ObjIntPair.class;
    assertEquals(expectedDeclaringTypeResult2, secondResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, firstResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, firstResult.metaBean());
    assertSame(meta, secondResult.metaBean());
  }

  /**
   * Test {@link ObjIntPair#metaBean()}.
   *
   * <p>Method under test: {@link ObjIntPair#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ObjIntPair.metaBean()"})
  void testMetaBean() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofPairResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ObjIntPair#toString()}
   *   <li>{@link ObjIntPair#getFirst()}
   *   <li>{@link ObjIntPair#getSecond()}
   *   <li>{@link ObjIntPair#size()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object ObjIntPair.getFirst()",
    "int ObjIntPair.getSecond()",
    "int ObjIntPair.size()",
    "String ObjIntPair.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);

    // Act
    String actualToStringResult = ofPairResult.toString();
    Object actualFirst = ofPairResult.getFirst();
    int actualSecond = ofPairResult.getSecond();

    // Assert
    assertEquals("First", actualFirst);
    assertEquals("[First, 1]", actualToStringResult);
    assertEquals(1, actualSecond);
    assertEquals(2, ofPairResult.size());
  }

  /**
   * Test {@link ObjIntPair#equals(Object)}, and {@link ObjIntPair#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ObjIntPair#equals(Object)}
   *   <li>{@link ObjIntPair#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjIntPair.equals(Object)", "int ObjIntPair.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);
    Pair<Object, Integer> pair2 = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult2 = ObjIntPair.ofPair(pair2);

    // Act and Assert
    assertEquals(ofPairResult, ofPairResult2);
    assertEquals(ofPairResult.hashCode(), ofPairResult2.hashCode());
  }

  /**
   * Test {@link ObjIntPair#equals(Object)}, and {@link ObjIntPair#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ObjIntPair#equals(Object)}
   *   <li>{@link ObjIntPair#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjIntPair.equals(Object)", "int ObjIntPair.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);

    // Act and Assert
    assertEquals(ofPairResult, ofPairResult);
    int expectedHashCodeResult = ofPairResult.hashCode();
    assertEquals(expectedHashCodeResult, ofPairResult.hashCode());
  }

  /**
   * Test {@link ObjIntPair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjIntPair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjIntPair.equals(Object)", "int ObjIntPair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);

    // Act and Assert
    assertNotEquals(ofPairResult, 1);
  }

  /**
   * Test {@link ObjIntPair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjIntPair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjIntPair.equals(Object)", "int ObjIntPair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of(1, 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);
    Pair<Object, Integer> pair2 = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult2 = ObjIntPair.ofPair(pair2);

    // Act and Assert
    assertNotEquals(ofPairResult, ofPairResult2);
  }

  /**
   * Test {@link ObjIntPair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjIntPair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjIntPair.equals(Object)", "int ObjIntPair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);
    Pair<Object, Integer> pair2 = Pair.of(ofPairResult, 1);
    ObjIntPair<Object> ofPairResult2 = ObjIntPair.ofPair(pair2);
    Pair<Object, Integer> pair3 = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult3 = ObjIntPair.ofPair(pair3);

    // Act and Assert
    assertNotEquals(ofPairResult2, ofPairResult3);
  }

  /**
   * Test {@link ObjIntPair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjIntPair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjIntPair.equals(Object)", "int ObjIntPair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 0);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);
    Pair<Object, Integer> pair2 = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult2 = ObjIntPair.ofPair(pair2);

    // Act and Assert
    assertNotEquals(ofPairResult, ofPairResult2);
  }

  /**
   * Test {@link ObjIntPair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjIntPair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjIntPair.equals(Object)", "int ObjIntPair.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);

    // Act and Assert
    assertNotEquals(ofPairResult, null);
  }

  /**
   * Test {@link ObjIntPair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjIntPair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjIntPair.equals(Object)", "int ObjIntPair.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Integer> pair = Pair.of("First", 1);
    ObjIntPair<Object> ofPairResult = ObjIntPair.ofPair(pair);

    // Act and Assert
    assertNotEquals(ofPairResult, "Different type to ObjIntPair");
  }
}
