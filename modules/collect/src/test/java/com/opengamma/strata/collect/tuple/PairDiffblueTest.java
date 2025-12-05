package com.opengamma.strata.collect.tuple;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.tuple.Pair.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PairDiffblueTest {
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
    Meta metaResult = Pair.meta();

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
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    Meta<Object, Object> metaPairResult = Pair.metaPair(cls1, cls2);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult = metaPairResult.metaPropertyGet("first");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Object> secondResult = ((Meta<Object, Object>) metaBeanResult).second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("first", actualMetaPropertyGetResult.name());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    Class<Pair> expectedDeclaringTypeResult = Pair.class;
    assertEquals(expectedDeclaringTypeResult, secondResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, secondResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object, Object>) metaBeanResult).first());
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
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    Meta<Object, Object> metaPairResult = Pair.metaPair(cls1, cls2);

    // Act and Assert
    assertNull(metaPairResult.metaPropertyGet("Property Name"));
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
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    Meta<Object, Object> metaPairResult = Pair.metaPair(cls1, cls2);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult = metaPairResult.metaPropertyGet("second");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Object> firstResult = ((Meta<Object, Object>) metaBeanResult).first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("first", firstResult.name());
    assertEquals("second", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    Class<Pair> expectedDeclaringTypeResult = Pair.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, firstResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object, Object>) metaBeanResult).second());
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
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    Meta<Object, Object> metaPairResult = Pair.metaPair(cls1, cls2);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = metaPairResult.metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("first");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("second");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("first", getResult.name());
    assertEquals("second", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<Pair> expectedDeclaringTypeResult = Pair.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<Pair> expectedDeclaringTypeResult2 = Pair.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
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
    // Arrange
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    Meta<Object, Object> metaPairResult = Pair.metaPair(cls1, cls2);

    // Act and Assert
    assertNull(metaPairResult.propertyGet(mock(Bean.class), "Property Name", true));
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
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    Meta<Object, Object> metaPairResult = Pair.metaPair(cls1, cls2);
    Pair<Object, Object> bean = Pair.of("First", "Second");

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaPairResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Pair} with {@code First} and {@code Second}.
   *   <li>Then return {@code First}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when Pair with 'First' and 'Second'; then return 'First'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenPairWithFirstAndSecond_thenReturnFirst() {
    // Arrange
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    Meta<Object, Object> metaPairResult = Pair.metaPair(cls1, cls2);
    Pair<Object, Object> bean = Pair.of("First", "Second");

    // Act and Assert
    assertEquals("First", metaPairResult.propertyGet(bean, "first", true));
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
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    Meta<Object, Object> metaPairResult = Pair.metaPair(cls1, cls2);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> metaPairResult.propertySet(mock(Bean.class), "first", "New Value", false));
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
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    Meta<Object, Object> metaPairResult = Pair.metaPair(cls1, cls2);

    // Act and Assert
    assertDoesNotThrow(
        () -> metaPairResult.propertySet(mock(Bean.class), "first", "New Value", true));
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
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    Meta<Object, Object> metaPairResult = Pair.metaPair(cls1, cls2);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaPairResult.propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    Meta<Object, Object> metaPairResult = Pair.metaPair(cls1, cls2);

    // Act and Assert
    assertDoesNotThrow(
        () -> metaPairResult.propertySet(mock(Bean.class), "second", "New Value", true));
  }

  /**
   * Test {@link Pair#of(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code Second}.
   *   <li>Then return {@code First}.
   * </ul>
   *
   * <p>Method under test: {@link Pair#of(Object, Object)}
   */
  @Test
  @DisplayName("Test of(Object, Object); when 'Second'; then return 'First'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair Pair.of(Object, Object)"})
  void testOf_whenSecond_thenReturnFirst() {
    // Arrange and Act
    Pair<Object, Object> actualOfResult = Pair.of("First", "Second");

    // Assert
    assertEquals("First", actualOfResult.getFirst());
    assertEquals("Second", actualOfResult.getSecond());
    assertEquals(2, actualOfResult.size());
  }

  /**
   * Test {@link Pair#combining(BiFunction, BiFunction)}.
   *
   * <p>Method under test: {@link Pair#combining(BiFunction, BiFunction)}
   */
  @Test
  @DisplayName("Test combining(BiFunction, BiFunction)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Pair.combining(BiFunction, BiFunction)"})
  void testCombining() {
    // Arrange
    BiFunction<Object, Object, Object> combinerFirst = mock(BiFunction.class);
    when(combinerFirst.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    BiFunction<Object, Object, Object> combinerSecond = mock(BiFunction.class);
    when(combinerSecond.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    BinaryOperator<Pair<Object, Object>> actualCombiningResult =
        Pair.combining(combinerFirst, combinerSecond);
    Pair<Object, Object> ofResult = Pair.of("First", "Second");
    Pair<Object, Object> ofResult2 = Pair.of("First", "Second");
    Pair<Object, Object> actualApplyResult = actualCombiningResult.apply(ofResult, ofResult2);

    // Assert
    verify(combinerFirst).apply(isA(Object.class), isA(Object.class));
    verify(combinerSecond).apply(isA(Object.class), isA(Object.class));
    assertEquals("Apply", actualApplyResult.getFirst());
    assertEquals("Apply", actualApplyResult.getSecond());
    assertEquals("First", ofResult.getFirst());
    assertEquals("Second", ofResult.getSecond());
    assertEquals(2, actualApplyResult.size());
    assertEquals(2, ofResult.size());
  }

  /**
   * Test {@link Pair#combinedWith(Pair, BiFunction, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link Pair} with {@code First} and {@code Second}.
   *   <li>Then return First is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link Pair#combinedWith(Pair, BiFunction, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(Pair, BiFunction, BiFunction); when Pair with 'First' and 'Second'; then return First is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair Pair.combinedWith(Pair, BiFunction, BiFunction)"})
  void testCombinedWith_whenPairWithFirstAndSecond_thenReturnFirstIsApply() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");
    Pair<Object, Object> other = Pair.of("First", "Second");

    BiFunction<Object, Object, Object> combinerFirst = mock(BiFunction.class);
    when(combinerFirst.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    BiFunction<Object, Object, Object> combinerSecond = mock(BiFunction.class);
    when(combinerSecond.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Pair<Object, Object> actualCombinedWithResult =
        ofResult.combinedWith(other, combinerFirst, combinerSecond);

    // Assert
    verify(combinerFirst).apply(isA(Object.class), isA(Object.class));
    verify(combinerSecond).apply(isA(Object.class), isA(Object.class));
    assertEquals("Apply", actualCombinedWithResult.getFirst());
    assertEquals("Apply", actualCombinedWithResult.getSecond());
    assertEquals(2, actualCombinedWithResult.size());
  }

  /**
   * Test {@link Pair#elements()}.
   *
   * <p>Method under test: {@link Pair#elements()}
   */
  @Test
  @DisplayName("Test elements()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Pair.elements()"})
  void testElements() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");

    // Act
    ImmutableList<Object> actualElementsResult = ofResult.elements();

    // Assert
    assertEquals(2, actualElementsResult.size());
    assertEquals("First", actualElementsResult.get(0));
    assertEquals("Second", actualElementsResult.get(1));
  }

  /**
   * Test {@link Pair#compareTo(Pair)} with {@code Pair}.
   *
   * <ul>
   *   <li>Given {@link Pair} with {@code First} and {@code Second}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Pair#compareTo(Pair)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Pair) with 'Pair'; given Pair with 'First' and 'Second'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Pair.compareTo(Pair)"})
  void testCompareToWithPair_givenPairWithFirstAndSecond_thenReturnZero() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");
    Pair<Object, Object> other = Pair.of("First", "Second");

    // Act and Assert
    assertEquals(0, ofResult.compareTo(other));
  }

  /**
   * Test {@link Pair#compareTo(Pair)} with {@code Pair}.
   *
   * <ul>
   *   <li>Given {@link Pair} with first is {@code 42} and {@code Second}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link Pair#compareTo(Pair)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Pair) with 'Pair'; given Pair with first is '42' and 'Second'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Pair.compareTo(Pair)"})
  void testCompareToWithPair_givenPairWithFirstIs42AndSecond_thenReturnMinusOne() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("42", "Second");
    Pair<Object, Object> other = Pair.of("First", "Second");

    // Act and Assert
    assertEquals(-1, ofResult.compareTo(other));
  }

  /**
   * Test {@link Pair#compareTo(Pair)} with {@code Pair}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Pair#compareTo(Pair)}
   */
  @Test
  @DisplayName("Test compareTo(Pair) with 'Pair'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Pair.compareTo(Pair)"})
  void testCompareToWithPair_thenReturnOne() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("com.opengamma.strata.collect.tuple.Pair", "Second");
    Pair<Object, Object> other = Pair.of("First", "Second");

    // Act and Assert
    assertEquals(1, ofResult.compareTo(other));
  }

  /**
   * Test {@link Pair#meta()}.
   *
   * <p>Method under test: {@link Pair#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Pair.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = Pair.meta();

    // Assert
    MetaProperty firstResult = actualMetaResult.first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    MetaProperty secondResult = actualMetaResult.second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("first", firstResult.name());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Pair> expectedDeclaringTypeResult = Pair.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<Pair> expectedDeclaringTypeResult2 = Pair.class;
    assertEquals(expectedDeclaringTypeResult2, secondResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, firstResult.propertyType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, secondResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, firstResult.metaBean());
    assertSame(meta, secondResult.metaBean());
  }

  /**
   * Test {@link Pair#metaPair(Class, Class)}.
   *
   * <p>Method under test: {@link Pair#metaPair(Class, Class)}
   */
  @Test
  @DisplayName("Test metaPair(Class, Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Pair.metaPair(Class, Class)"})
  void testMetaPair() {
    // Arrange
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;

    // Act
    Meta<Object, Object> actualMetaPairResult = Pair.metaPair(cls1, cls2);

    // Assert
    MetaProperty<Object> firstResult = actualMetaPairResult.first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    MetaProperty<Object> secondResult = actualMetaPairResult.second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("first", firstResult.name());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    assertTrue(actualMetaPairResult.isBuildable());
    Class<Pair> expectedDeclaringTypeResult = Pair.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<Pair> expectedDeclaringTypeResult2 = Pair.class;
    assertEquals(expectedDeclaringTypeResult2, secondResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, firstResult.propertyType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, secondResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, firstResult.metaBean());
    assertSame(meta, secondResult.metaBean());
  }

  /**
   * Test {@link Pair#metaBean()}.
   *
   * <p>Method under test: {@link Pair#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Pair.metaBean()"})
  void testMetaBean() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Pair#toString()}
   *   <li>{@link Pair#getFirst()}
   *   <li>{@link Pair#getSecond()}
   *   <li>{@link Pair#size()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object Pair.getFirst()",
    "Object Pair.getSecond()",
    "int Pair.size()",
    "String Pair.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");

    // Act
    String actualToStringResult = ofResult.toString();
    Object actualFirst = ofResult.getFirst();
    Object actualSecond = ofResult.getSecond();

    // Assert
    assertEquals("First", actualFirst);
    assertEquals("Second", actualSecond);
    assertEquals("[First, Second]", actualToStringResult);
    assertEquals(2, ofResult.size());
  }

  /**
   * Test {@link Pair#equals(Object)}, and {@link Pair#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Pair#equals(Object)}
   *   <li>{@link Pair#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");
    Pair<Object, Object> ofResult2 = Pair.of("First", "Second");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link Pair#equals(Object)}, and {@link Pair#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Pair#equals(Object)}
   *   <li>{@link Pair#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of(1, "Second");
    Pair<Object, Object> ofResult2 = Pair.of("First", "Second");

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");
    Pair<Object, Object> ofResult2 = Pair.of(ofResult, "Second");
    Pair<Object, Object> ofResult3 = Pair.of("First", "Second");

    // Act and Assert
    assertNotEquals(ofResult2, ofResult3);
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", 1);
    Pair<Object, Object> ofResult2 = Pair.of("First", "Second");

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");
    Pair<Object, Object> ofResult2 = Pair.of("First", ofResult);
    Pair<Object, Object> ofResult3 = Pair.of("First", "Second");

    // Act and Assert
    assertNotEquals(ofResult2, ofResult3);
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Pair.equals(Object)", "int Pair.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Object> ofResult = Pair.of("First", "Second");

    // Act and Assert
    assertNotEquals(ofResult, "Different type to Pair");
  }
}
