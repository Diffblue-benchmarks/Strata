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
import com.opengamma.strata.collect.tuple.Triple.Meta;
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

class TripleDiffblueTest {
  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#first()}
   *   <li>{@link Meta#second()}
   *   <li>{@link Meta#third()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.first()",
    "MetaProperty Meta.second()",
    "MetaProperty Meta.third()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = Triple.meta();

    // Act
    MetaProperty actualFirstResult = metaResult.first();
    MetaProperty actualSecondResult = metaResult.second();

    // Assert
    assertTrue(actualFirstResult instanceof DirectMetaProperty);
    assertTrue(actualSecondResult instanceof DirectMetaProperty);
    assertTrue(metaResult.third() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code first}.
   *   <li>Then return name is {@code first}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'first'; then return name is 'first'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFirst_thenReturnNameIsFirst() {
    // Arrange
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult = metaTripleResult.metaPropertyGet("first");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Object> secondResult = ((Meta<Object, Object, Object>) metaBeanResult).second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    MetaProperty<Object> thirdResult = ((Meta<Object, Object, Object>) metaBeanResult).third();
    assertTrue(thirdResult instanceof DirectMetaProperty);
    assertEquals("first", actualMetaPropertyGetResult.name());
    assertSame(
        actualMetaPropertyGetResult, ((Meta<Object, Object, Object>) metaBeanResult).first());
    assertSame(metaBeanResult, secondResult.metaBean());
    assertSame(metaBeanResult, thirdResult.metaBean());
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
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Act and Assert
    assertNull(metaTripleResult.metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code second}.
   *   <li>Then return name is {@code second}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'second'; then return name is 'second'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSecond_thenReturnNameIsSecond() {
    // Arrange
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult = metaTripleResult.metaPropertyGet("second");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Object> firstResult = ((Meta<Object, Object, Object>) metaBeanResult).first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Object> thirdResult = ((Meta<Object, Object, Object>) metaBeanResult).third();
    assertTrue(thirdResult instanceof DirectMetaProperty);
    assertEquals("second", actualMetaPropertyGetResult.name());
    assertSame(
        actualMetaPropertyGetResult, ((Meta<Object, Object, Object>) metaBeanResult).second());
    assertSame(metaBeanResult, firstResult.metaBean());
    assertSame(metaBeanResult, thirdResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code third}.
   *   <li>Then return name is {@code third}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'third'; then return name is 'third'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenThird_thenReturnNameIsThird() {
    // Arrange
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult = metaTripleResult.metaPropertyGet("third");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Object> firstResult = ((Meta<Object, Object, Object>) metaBeanResult).first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Object> secondResult = ((Meta<Object, Object, Object>) metaBeanResult).second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("third", actualMetaPropertyGetResult.name());
    assertSame(
        actualMetaPropertyGetResult, ((Meta<Object, Object, Object>) metaBeanResult).third());
    assertSame(metaBeanResult, firstResult.metaBean());
    assertSame(metaBeanResult, secondResult.metaBean());
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
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = metaTripleResult.metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("first");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("second");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("third");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("first", getResult.name());
    assertEquals("second", getResult2.name());
    assertEquals("third", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<Triple> expectedDeclaringTypeResult = Triple.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<Triple> expectedDeclaringTypeResult2 = Triple.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<Triple> expectedDeclaringTypeResult3 = Triple.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<Object> expectedPropertyTypeResult3 = Object.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
    // Arrange
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Act and Assert
    assertNull(metaTripleResult.propertyGet(mock(Bean.class), "Property Name", true));
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
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);
    Triple<Object, Object, Object> bean = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaTripleResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Triple} with {@code First} and {@code Second} and {@code Third}.
   *   <li>Then return {@code First}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when Triple with 'First' and 'Second' and 'Third'; then return 'First'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTripleWithFirstAndSecondAndThird_thenReturnFirst() {
    // Arrange
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);
    Triple<Object, Object, Object> bean = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertEquals("First", metaTripleResult.propertyGet(bean, "first", true));
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
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> metaTripleResult.propertySet(mock(Bean.class), "first", "New Value", false));
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
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Act and Assert
    assertDoesNotThrow(
        () -> metaTripleResult.propertySet(mock(Bean.class), "first", "New Value", true));
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
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaTripleResult.propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Act and Assert
    assertDoesNotThrow(
        () -> metaTripleResult.propertySet(mock(Bean.class), "second", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code third}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'third'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenThird_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;
    Class<Object> cls3 = Object.class;

    Meta<Object, Object, Object> metaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Act and Assert
    assertDoesNotThrow(
        () -> metaTripleResult.propertySet(mock(Bean.class), "third", "New Value", true));
  }

  /**
   * Test {@link Triple#of(Object, Object, Object)}.
   *
   * <ul>
   *   <li>When {@code First}.
   *   <li>Then return {@code First}.
   * </ul>
   *
   * <p>Method under test: {@link Triple#of(Object, Object, Object)}
   */
  @Test
  @DisplayName("Test of(Object, Object, Object); when 'First'; then return 'First'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Triple Triple.of(Object, Object, Object)"})
  void testOf_whenFirst_thenReturnFirst() {
    // Arrange and Act
    Triple<Object, Object, Object> actualOfResult = Triple.of("First", "Second", "Third");

    // Assert
    assertEquals("First", actualOfResult.getFirst());
    assertEquals("Second", actualOfResult.getSecond());
    assertEquals("Third", actualOfResult.getThird());
    assertEquals(3, actualOfResult.size());
  }

  /**
   * Test {@link Triple#combining(BiFunction, BiFunction, BiFunction)}.
   *
   * <p>Method under test: {@link Triple#combining(BiFunction, BiFunction, BiFunction)}
   */
  @Test
  @DisplayName("Test combining(BiFunction, BiFunction, BiFunction)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Triple.combining(BiFunction, BiFunction, BiFunction)"})
  void testCombining() {
    // Arrange
    BiFunction<Object, Object, Object> combinerFirst = mock(BiFunction.class);
    when(combinerFirst.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    BiFunction<Object, Object, Object> combinerSecond = mock(BiFunction.class);
    when(combinerSecond.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    BiFunction<Object, Object, Object> combinerThird = mock(BiFunction.class);
    when(combinerThird.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    BinaryOperator<Triple<Object, Object, Object>> actualCombiningResult =
        Triple.combining(combinerFirst, combinerSecond, combinerThird);
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");
    Triple<Object, Object, Object> ofResult2 = Triple.of("First", "Second", "Third");
    Triple<Object, Object, Object> actualApplyResult =
        actualCombiningResult.apply(ofResult, ofResult2);

    // Assert
    verify(combinerFirst).apply(isA(Object.class), isA(Object.class));
    verify(combinerSecond).apply(isA(Object.class), isA(Object.class));
    verify(combinerThird).apply(isA(Object.class), isA(Object.class));
    assertEquals("Apply", actualApplyResult.getFirst());
    assertEquals("Apply", actualApplyResult.getSecond());
    assertEquals("Apply", actualApplyResult.getThird());
    assertEquals("First", ofResult.getFirst());
    assertEquals("Second", ofResult.getSecond());
    assertEquals("Third", ofResult.getThird());
    assertEquals(3, actualApplyResult.size());
    assertEquals(3, ofResult.size());
  }

  /**
   * Test {@link Triple#combinedWith(Triple, BiFunction, BiFunction, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link Triple} with {@code First} and {@code Second} and {@code Third}.
   *   <li>Then return First is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link Triple#combinedWith(Triple, BiFunction, BiFunction, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(Triple, BiFunction, BiFunction, BiFunction); when Triple with 'First' and 'Second' and 'Third'; then return First is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Triple Triple.combinedWith(Triple, BiFunction, BiFunction, BiFunction)"})
  void testCombinedWith_whenTripleWithFirstAndSecondAndThird_thenReturnFirstIsApply() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");
    Triple<Object, Object, Object> other = Triple.of("First", "Second", "Third");

    BiFunction<Object, Object, Object> combinerFirst = mock(BiFunction.class);
    when(combinerFirst.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    BiFunction<Object, Object, Object> combinerSecond = mock(BiFunction.class);
    when(combinerSecond.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    BiFunction<Object, Object, Object> combinerThird = mock(BiFunction.class);
    when(combinerThird.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Triple<Object, Object, Object> actualCombinedWithResult =
        ofResult.combinedWith(other, combinerFirst, combinerSecond, combinerThird);

    // Assert
    verify(combinerFirst).apply(isA(Object.class), isA(Object.class));
    verify(combinerSecond).apply(isA(Object.class), isA(Object.class));
    verify(combinerThird).apply(isA(Object.class), isA(Object.class));
    assertEquals("Apply", actualCombinedWithResult.getFirst());
    assertEquals("Apply", actualCombinedWithResult.getSecond());
    assertEquals("Apply", actualCombinedWithResult.getThird());
    assertEquals(3, actualCombinedWithResult.size());
  }

  /**
   * Test {@link Triple#elements()}.
   *
   * <p>Method under test: {@link Triple#elements()}
   */
  @Test
  @DisplayName("Test elements()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Triple.elements()"})
  void testElements() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");

    // Act
    ImmutableList<Object> actualElementsResult = ofResult.elements();

    // Assert
    assertEquals(3, actualElementsResult.size());
    assertEquals("First", actualElementsResult.get(0));
    assertEquals("Second", actualElementsResult.get(1));
    assertEquals("Third", actualElementsResult.get(2));
  }

  /**
   * Test {@link Triple#compareTo(Triple)} with {@code Triple}.
   *
   * <ul>
   *   <li>Given {@link Triple} with {@code First} and {@code Second} and {@code Third}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Triple#compareTo(Triple)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Triple) with 'Triple'; given Triple with 'First' and 'Second' and 'Third'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Triple.compareTo(Triple)"})
  void testCompareToWithTriple_givenTripleWithFirstAndSecondAndThird_thenReturnZero() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");
    Triple<Object, Object, Object> other = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertEquals(0, ofResult.compareTo(other));
  }

  /**
   * Test {@link Triple#compareTo(Triple)} with {@code Triple}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link Triple#compareTo(Triple)}
   */
  @Test
  @DisplayName("Test compareTo(Triple) with 'Triple'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Triple.compareTo(Triple)"})
  void testCompareToWithTriple_thenReturnMinusOne() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("42", "Second", "Third");
    Triple<Object, Object, Object> other = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertEquals(-1, ofResult.compareTo(other));
  }

  /**
   * Test {@link Triple#compareTo(Triple)} with {@code Triple}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Triple#compareTo(Triple)}
   */
  @Test
  @DisplayName("Test compareTo(Triple) with 'Triple'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Triple.compareTo(Triple)"})
  void testCompareToWithTriple_thenReturnOne() {
    // Arrange
    Triple<Object, Object, Object> ofResult =
        Triple.of("com.opengamma.strata.collect.tuple.Triple", "Second", "Third");
    Triple<Object, Object, Object> other = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertEquals(1, ofResult.compareTo(other));
  }

  /**
   * Test {@link Triple#meta()}.
   *
   * <p>Method under test: {@link Triple#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Triple.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = Triple.meta();

    // Assert
    MetaProperty firstResult = actualMetaResult.first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    MetaProperty secondResult = actualMetaResult.second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    MetaProperty thirdResult = actualMetaResult.third();
    assertTrue(thirdResult instanceof DirectMetaProperty);
    assertEquals("first", firstResult.name());
    assertEquals("second", secondResult.name());
    assertEquals("third", thirdResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, thirdResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Triple> expectedDeclaringTypeResult = Triple.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<Triple> expectedDeclaringTypeResult2 = Triple.class;
    assertEquals(expectedDeclaringTypeResult2, secondResult.declaringType());
    Class<Triple> expectedDeclaringTypeResult3 = Triple.class;
    assertEquals(expectedDeclaringTypeResult3, thirdResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, firstResult.propertyType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, secondResult.propertyType());
    Class<Object> expectedPropertyTypeResult3 = Object.class;
    assertEquals(expectedPropertyTypeResult3, thirdResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, firstResult.metaBean());
    assertSame(meta, secondResult.metaBean());
    assertSame(meta, thirdResult.metaBean());
  }

  /**
   * Test {@link Triple#metaTriple(Class, Class, Class)}.
   *
   * <p>Method under test: {@link Triple#metaTriple(Class, Class, Class)}
   */
  @Test
  @DisplayName("Test metaTriple(Class, Class, Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Triple.metaTriple(Class, Class, Class)"})
  void testMetaTriple() {
    // Arrange
    Class<Object> cls1 = Object.class;
    Class<Object> cls2 = Object.class;
    Class<Object> cls3 = Object.class;

    // Act
    Meta<Object, Object, Object> actualMetaTripleResult = Triple.metaTriple(cls1, cls2, cls3);

    // Assert
    MetaProperty<Object> firstResult = actualMetaTripleResult.first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    MetaProperty<Object> secondResult = actualMetaTripleResult.second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    MetaProperty<Object> thirdResult = actualMetaTripleResult.third();
    assertTrue(thirdResult instanceof DirectMetaProperty);
    assertEquals("first", firstResult.name());
    assertEquals("second", secondResult.name());
    assertEquals("third", thirdResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, thirdResult.style());
    assertTrue(actualMetaTripleResult.isBuildable());
    Class<Triple> expectedDeclaringTypeResult = Triple.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<Triple> expectedDeclaringTypeResult2 = Triple.class;
    assertEquals(expectedDeclaringTypeResult2, secondResult.declaringType());
    Class<Triple> expectedDeclaringTypeResult3 = Triple.class;
    assertEquals(expectedDeclaringTypeResult3, thirdResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, firstResult.propertyType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, secondResult.propertyType());
    Class<Object> expectedPropertyTypeResult3 = Object.class;
    assertEquals(expectedPropertyTypeResult3, thirdResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, firstResult.metaBean());
    assertSame(meta, secondResult.metaBean());
    assertSame(meta, thirdResult.metaBean());
  }

  /**
   * Test {@link Triple#metaBean()}.
   *
   * <p>Method under test: {@link Triple#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Triple.metaBean()"})
  void testMetaBean() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Triple#toString()}
   *   <li>{@link Triple#getFirst()}
   *   <li>{@link Triple#getSecond()}
   *   <li>{@link Triple#getThird()}
   *   <li>{@link Triple#size()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object Triple.getFirst()",
    "Object Triple.getSecond()",
    "Object Triple.getThird()",
    "int Triple.size()",
    "String Triple.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");

    // Act
    String actualToStringResult = ofResult.toString();
    Object actualFirst = ofResult.getFirst();
    Object actualSecond = ofResult.getSecond();
    Object actualThird = ofResult.getThird();

    // Assert
    assertEquals("First", actualFirst);
    assertEquals("Second", actualSecond);
    assertEquals("Third", actualThird);
    assertEquals("[First, Second, Third]", actualToStringResult);
    assertEquals(3, ofResult.size());
  }

  /**
   * Test {@link Triple#equals(Object)}, and {@link Triple#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Triple#equals(Object)}
   *   <li>{@link Triple#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Triple.equals(Object)", "int Triple.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");
    Triple<Object, Object, Object> ofResult2 = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link Triple#equals(Object)}, and {@link Triple#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Triple#equals(Object)}
   *   <li>{@link Triple#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Triple.equals(Object)", "int Triple.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link Triple#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Triple#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Triple.equals(Object)", "int Triple.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link Triple#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Triple#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Triple.equals(Object)", "int Triple.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of(1, "Second", "Third");
    Triple<Object, Object, Object> ofResult2 = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link Triple#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Triple#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Triple.equals(Object)", "int Triple.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");
    Triple<Object, Object, Object> ofResult2 = Triple.of(ofResult, "Second", "Third");
    Triple<Object, Object, Object> ofResult3 = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertNotEquals(ofResult2, ofResult3);
  }

  /**
   * Test {@link Triple#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Triple#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Triple.equals(Object)", "int Triple.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", 1, "Third");
    Triple<Object, Object, Object> ofResult2 = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link Triple#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Triple#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Triple.equals(Object)", "int Triple.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");
    Triple<Object, Object, Object> ofResult2 = Triple.of("First", ofResult, "Third");
    Triple<Object, Object, Object> ofResult3 = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertNotEquals(ofResult2, ofResult3);
  }

  /**
   * Test {@link Triple#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Triple#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Triple.equals(Object)", "int Triple.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", 1);
    Triple<Object, Object, Object> ofResult2 = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link Triple#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Triple#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Triple.equals(Object)", "int Triple.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");
    Triple<Object, Object, Object> ofResult2 = Triple.of("First", "Second", ofResult);
    Triple<Object, Object, Object> ofResult3 = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertNotEquals(ofResult2, ofResult3);
  }

  /**
   * Test {@link Triple#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Triple#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Triple.equals(Object)", "int Triple.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link Triple#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Triple#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Triple.equals(Object)", "int Triple.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Triple<Object, Object, Object> ofResult = Triple.of("First", "Second", "Third");

    // Act and Assert
    assertNotEquals(ofResult, "Different type to Triple");
  }
}
