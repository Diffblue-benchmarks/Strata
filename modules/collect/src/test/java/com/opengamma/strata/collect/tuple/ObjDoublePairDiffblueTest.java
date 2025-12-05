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
import com.opengamma.strata.collect.tuple.ObjDoublePair.Meta;
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

class ObjDoublePairDiffblueTest {
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
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);

    // Act
    Class<? extends ObjDoublePair<Object>> actualBeanTypeResult =
        metaObjDoublePairResult.beanType();

    // Assert
    Class<ObjDoublePair> expectedBeanTypeResult = ObjDoublePair.class;
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
    Meta metaResult = ObjDoublePair.meta();

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
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult = metaObjDoublePairResult.metaPropertyGet("first");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> secondResult = ((Meta<Object>) metaBeanResult).second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("double", secondResult.propertyType().getName());
    assertEquals("first", actualMetaPropertyGetResult.name());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    Class<ObjDoublePair> expectedDeclaringTypeResult = ObjDoublePair.class;
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
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);

    // Act and Assert
    assertNull(metaObjDoublePairResult.metaPropertyGet("Property Name"));
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
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult = metaObjDoublePairResult.metaPropertyGet("second");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Object> firstResult = ((Meta<Object>) metaBeanResult).first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("first", firstResult.name());
    assertEquals("second", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    Class<ObjDoublePair> expectedDeclaringTypeResult = ObjDoublePair.class;
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
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        metaObjDoublePairResult.metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("first");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("second");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("first", getResult.name());
    assertEquals("second", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<ObjDoublePair> expectedDeclaringTypeResult = ObjDoublePair.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ObjDoublePair> expectedDeclaringTypeResult2 = ObjDoublePair.class;
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
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);

    // Act and Assert
    assertNull(metaObjDoublePairResult.propertyGet(mock(Bean.class), "Property Name", true));
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
    Class<Object> cls = Object.class;
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> bean = ObjDoublePair.ofPair(pair);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaObjDoublePairResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code first}.
   *   <li>Then return {@code First}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'first'; then return 'First'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFirst_thenReturnFirst() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> bean = ObjDoublePair.ofPair(pair);

    // Act and Assert
    assertEquals("First", metaObjDoublePairResult.propertyGet(bean, "first", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code second}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'second'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSecond_thenReturnDoubleValueIsTen() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> bean = ObjDoublePair.ofPair(pair);

    // Act and Assert
    assertEquals(
        10.0d, ((Double) metaObjDoublePairResult.propertyGet(bean, "second", true)).doubleValue());
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
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> metaObjDoublePairResult.propertySet(mock(Bean.class), "first", "New Value", false));
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
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);

    // Act and Assert
    assertDoesNotThrow(
        () -> metaObjDoublePairResult.propertySet(mock(Bean.class), "first", "New Value", true));
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
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaObjDoublePairResult.propertySet(
                mock(Bean.class), "Property Name", "New Value", true));
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
    Meta<Object> metaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);

    // Act and Assert
    assertDoesNotThrow(
        () -> metaObjDoublePairResult.propertySet(mock(Bean.class), "second", "New Value", true));
  }

  /**
   * Test {@link ObjDoublePair#of(Object, double)}.
   *
   * <ul>
   *   <li>When {@code First}.
   *   <li>Then return {@code First}.
   * </ul>
   *
   * <p>Method under test: {@link ObjDoublePair#of(Object, double)}
   */
  @Test
  @DisplayName("Test of(Object, double); when 'First'; then return 'First'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ObjDoublePair ObjDoublePair.of(Object, double)"})
  void testOf_whenFirst_thenReturnFirst() {
    // Arrange and Act
    ObjDoublePair<Object> actualOfResult = ObjDoublePair.of("First", 10.0d);

    // Assert
    assertEquals("First", actualOfResult.getFirst());
    assertEquals(10.0d, actualOfResult.getSecond());
    assertEquals(2, actualOfResult.size());
  }

  /**
   * Test {@link ObjDoublePair#ofPair(Pair)}.
   *
   * <ul>
   *   <li>When of {@code First} and ten.
   *   <li>Then return {@code First}.
   * </ul>
   *
   * <p>Method under test: {@link ObjDoublePair#ofPair(Pair)}
   */
  @Test
  @DisplayName("Test ofPair(Pair); when of 'First' and ten; then return 'First'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ObjDoublePair ObjDoublePair.ofPair(Pair)"})
  void testOfPair_whenOfFirstAndTen_thenReturnFirst() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);

    // Act
    ObjDoublePair<Object> actualOfPairResult = ObjDoublePair.ofPair(pair);

    // Assert
    assertEquals("First", actualOfPairResult.getFirst());
    assertEquals(10.0d, actualOfPairResult.getSecond());
    assertEquals(2, actualOfPairResult.size());
  }

  /**
   * Test {@link ObjDoublePair#elements()}.
   *
   * <p>Method under test: {@link ObjDoublePair#elements()}
   */
  @Test
  @DisplayName("Test elements()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList ObjDoublePair.elements()"})
  void testElements() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);

    // Act
    ImmutableList<Object> actualElementsResult = ofPairResult.elements();

    // Assert
    assertEquals(2, actualElementsResult.size());
    assertEquals("First", actualElementsResult.get(0));
    assertEquals(10.0d, ((Double) actualElementsResult.get(1)).doubleValue());
  }

  /**
   * Test {@link ObjDoublePair#toPair()}.
   *
   * <p>Method under test: {@link ObjDoublePair#toPair()}
   */
  @Test
  @DisplayName("Test toPair()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair ObjDoublePair.toPair()"})
  void testToPair() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);

    // Act and Assert
    assertEquals(pair, ofPairResult.toPair());
  }

  /**
   * Test {@link ObjDoublePair#compareTo(ObjDoublePair)} with {@code ObjDoublePair}.
   *
   * <ul>
   *   <li>Given ofPair of {@code 42} and ten.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link ObjDoublePair#compareTo(ObjDoublePair)}
   */
  @Test
  @DisplayName(
      "Test compareTo(ObjDoublePair) with 'ObjDoublePair'; given ofPair of '42' and ten; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ObjDoublePair.compareTo(ObjDoublePair)"})
  void testCompareToWithObjDoublePair_givenOfPairOf42AndTen_thenReturnMinusOne() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("42", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);
    Pair<Object, Double> pair2 = Pair.of("First", 10.0d);
    ObjDoublePair<Object> other = ObjDoublePair.ofPair(pair2);

    // Act and Assert
    assertEquals(-1, ofPairResult.compareTo(other));
  }

  /**
   * Test {@link ObjDoublePair#compareTo(ObjDoublePair)} with {@code ObjDoublePair}.
   *
   * <ul>
   *   <li>Given ofPair of {@code First} and ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ObjDoublePair#compareTo(ObjDoublePair)}
   */
  @Test
  @DisplayName(
      "Test compareTo(ObjDoublePair) with 'ObjDoublePair'; given ofPair of 'First' and ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ObjDoublePair.compareTo(ObjDoublePair)"})
  void testCompareToWithObjDoublePair_givenOfPairOfFirstAndTen_thenReturnZero() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);
    Pair<Object, Double> pair2 = Pair.of("First", 10.0d);
    ObjDoublePair<Object> other = ObjDoublePair.ofPair(pair2);

    // Act and Assert
    assertEquals(0, ofPairResult.compareTo(other));
  }

  /**
   * Test {@link ObjDoublePair#compareTo(ObjDoublePair)} with {@code ObjDoublePair}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ObjDoublePair#compareTo(ObjDoublePair)}
   */
  @Test
  @DisplayName("Test compareTo(ObjDoublePair) with 'ObjDoublePair'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ObjDoublePair.compareTo(ObjDoublePair)"})
  void testCompareToWithObjDoublePair_thenReturnOne() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("com.opengamma.strata.collect.tuple.Pair", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);
    Pair<Object, Double> pair2 = Pair.of("First", 10.0d);
    ObjDoublePair<Object> other = ObjDoublePair.ofPair(pair2);

    // Act and Assert
    assertEquals(1, ofPairResult.compareTo(other));
  }

  /**
   * Test {@link ObjDoublePair#meta()}.
   *
   * <p>Method under test: {@link ObjDoublePair#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ObjDoublePair.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ObjDoublePair.meta();

    // Assert
    MetaProperty firstResult = actualMetaResult.first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    MetaProperty<Double> secondResult = actualMetaResult.second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("double", secondResult.propertyType().getName());
    assertEquals("first", firstResult.name());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ObjDoublePair> expectedDeclaringTypeResult = ObjDoublePair.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<ObjDoublePair> expectedDeclaringTypeResult2 = ObjDoublePair.class;
    assertEquals(expectedDeclaringTypeResult2, secondResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, firstResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, firstResult.metaBean());
    assertSame(meta, secondResult.metaBean());
  }

  /**
   * Test {@link ObjDoublePair#metaObjDoublePair(Class)}.
   *
   * <p>Method under test: {@link ObjDoublePair#metaObjDoublePair(Class)}
   */
  @Test
  @DisplayName("Test metaObjDoublePair(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ObjDoublePair.metaObjDoublePair(Class)"})
  void testMetaObjDoublePair() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Meta<Object> actualMetaObjDoublePairResult = ObjDoublePair.metaObjDoublePair(cls);

    // Assert
    MetaProperty<Object> firstResult = actualMetaObjDoublePairResult.first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    MetaProperty<Double> secondResult = actualMetaObjDoublePairResult.second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("double", secondResult.propertyType().getName());
    assertEquals("first", firstResult.name());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    assertTrue(actualMetaObjDoublePairResult.isBuildable());
    Class<ObjDoublePair> expectedDeclaringTypeResult = ObjDoublePair.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<ObjDoublePair> expectedDeclaringTypeResult2 = ObjDoublePair.class;
    assertEquals(expectedDeclaringTypeResult2, secondResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, firstResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, firstResult.metaBean());
    assertSame(meta, secondResult.metaBean());
  }

  /**
   * Test {@link ObjDoublePair#metaBean()}.
   *
   * <p>Method under test: {@link ObjDoublePair#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ObjDoublePair.metaBean()"})
  void testMetaBean() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofPairResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ObjDoublePair#toString()}
   *   <li>{@link ObjDoublePair#getFirst()}
   *   <li>{@link ObjDoublePair#getSecond()}
   *   <li>{@link ObjDoublePair#size()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object ObjDoublePair.getFirst()",
    "double ObjDoublePair.getSecond()",
    "int ObjDoublePair.size()",
    "String ObjDoublePair.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);

    // Act
    String actualToStringResult = ofPairResult.toString();
    Object actualFirst = ofPairResult.getFirst();
    double actualSecond = ofPairResult.getSecond();

    // Assert
    assertEquals("First", actualFirst);
    assertEquals("[First, 10.0]", actualToStringResult);
    assertEquals(10.0d, actualSecond);
    assertEquals(2, ofPairResult.size());
  }

  /**
   * Test {@link ObjDoublePair#equals(Object)}, and {@link ObjDoublePair#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ObjDoublePair#equals(Object)}
   *   <li>{@link ObjDoublePair#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjDoublePair.equals(Object)", "int ObjDoublePair.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);
    Pair<Object, Double> pair2 = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult2 = ObjDoublePair.ofPair(pair2);

    // Act and Assert
    assertEquals(ofPairResult, ofPairResult2);
    assertEquals(ofPairResult.hashCode(), ofPairResult2.hashCode());
  }

  /**
   * Test {@link ObjDoublePair#equals(Object)}, and {@link ObjDoublePair#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ObjDoublePair#equals(Object)}
   *   <li>{@link ObjDoublePair#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjDoublePair.equals(Object)", "int ObjDoublePair.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);

    // Act and Assert
    assertEquals(ofPairResult, ofPairResult);
    int expectedHashCodeResult = ofPairResult.hashCode();
    assertEquals(expectedHashCodeResult, ofPairResult.hashCode());
  }

  /**
   * Test {@link ObjDoublePair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjDoublePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjDoublePair.equals(Object)", "int ObjDoublePair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);

    // Act and Assert
    assertNotEquals(ofPairResult, 1);
  }

  /**
   * Test {@link ObjDoublePair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjDoublePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjDoublePair.equals(Object)", "int ObjDoublePair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Pair<Object, Double> pair = Pair.of(1, 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);
    Pair<Object, Double> pair2 = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult2 = ObjDoublePair.ofPair(pair2);

    // Act and Assert
    assertNotEquals(ofPairResult, ofPairResult2);
  }

  /**
   * Test {@link ObjDoublePair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjDoublePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjDoublePair.equals(Object)", "int ObjDoublePair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);
    Pair<Object, Double> pair2 = Pair.of(ofPairResult, 10.0d);
    ObjDoublePair<Object> ofPairResult2 = ObjDoublePair.ofPair(pair2);
    Pair<Object, Double> pair3 = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult3 = ObjDoublePair.ofPair(pair3);

    // Act and Assert
    assertNotEquals(ofPairResult2, ofPairResult3);
  }

  /**
   * Test {@link ObjDoublePair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjDoublePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjDoublePair.equals(Object)", "int ObjDoublePair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 0.5d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);
    Pair<Object, Double> pair2 = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult2 = ObjDoublePair.ofPair(pair2);

    // Act and Assert
    assertNotEquals(ofPairResult, ofPairResult2);
  }

  /**
   * Test {@link ObjDoublePair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjDoublePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjDoublePair.equals(Object)", "int ObjDoublePair.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);

    // Act and Assert
    assertNotEquals(ofPairResult, null);
  }

  /**
   * Test {@link ObjDoublePair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ObjDoublePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjDoublePair.equals(Object)", "int ObjDoublePair.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Double> pair = Pair.of("First", 10.0d);
    ObjDoublePair<Object> ofPairResult = ObjDoublePair.ofPair(pair);

    // Act and Assert
    assertNotEquals(ofPairResult, "Different type to ObjDoublePair");
  }
}
