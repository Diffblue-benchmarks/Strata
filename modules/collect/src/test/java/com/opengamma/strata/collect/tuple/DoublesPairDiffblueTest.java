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
import com.opengamma.strata.collect.tuple.DoublesPair.Meta;
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

class DoublesPairDiffblueTest {
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
    Class<? extends DoublesPair> actualBeanTypeResult = DoublesPair.meta().beanType();

    // Assert
    Class<DoublesPair> expectedBeanTypeResult = DoublesPair.class;
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
    Meta metaResult = DoublesPair.meta();

    // Act
    MetaProperty<Double> actualFirstResult = metaResult.first();

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
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = DoublesPair.meta().metaPropertyGet("first");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> secondResult = ((Meta) metaBeanResult).second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("double", secondResult.propertyType().getName());
    assertEquals("first", actualMetaPropertyGetResult.name());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    Class<DoublesPair> expectedDeclaringTypeResult = DoublesPair.class;
    assertEquals(expectedDeclaringTypeResult, secondResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).first());
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
    // Arrange, Act and Assert
    assertNull(DoublesPair.meta().metaPropertyGet("Property Name"));
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
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = DoublesPair.meta().metaPropertyGet("second");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> firstResult = ((Meta) metaBeanResult).first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("double", firstResult.propertyType().getName());
    assertEquals("first", firstResult.name());
    assertEquals("second", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    Class<DoublesPair> expectedDeclaringTypeResult = DoublesPair.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).second());
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
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = DoublesPair.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("first");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("second");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("first", getResult.name());
    assertEquals("second", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<DoublesPair> expectedDeclaringTypeResult = DoublesPair.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<DoublesPair> expectedDeclaringTypeResult2 = DoublesPair.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = DoublesPair.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double) metaResult.propertyGet(DoublesPair.of(10.0d, 10.0d), "first", true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnDoubleValueIsTen2() {
    // Arrange
    Meta metaResult = DoublesPair.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double) metaResult.propertyGet(DoublesPair.of(10.0d, 10.0d), "second", true))
            .doubleValue());
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
    assertNull(DoublesPair.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> DoublesPair.meta().propertySet(mock(Bean.class), "first", "New Value", false));
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
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> DoublesPair.meta().propertySet(mock(Bean.class), "first", "New Value", true));
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
        () -> DoublesPair.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> DoublesPair.meta().propertySet(mock(Bean.class), "second", "New Value", true));
  }

  /**
   * Test {@link DoublesPair#of(double, double)}.
   *
   * <p>Method under test: {@link DoublesPair#of(double, double)}
   */
  @Test
  @DisplayName("Test of(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoublesPair DoublesPair.of(double, double)"})
  void testOf() {
    // Arrange and Act
    DoublesPair actualOfResult = DoublesPair.of(10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getFirst());
    assertEquals(10.0d, actualOfResult.getSecond());
    assertEquals(2, actualOfResult.size());
  }

  /**
   * Test {@link DoublesPair#ofPair(Pair)}.
   *
   * <ul>
   *   <li>When of ten and ten.
   *   <li>Then return First is ten.
   * </ul>
   *
   * <p>Method under test: {@link DoublesPair#ofPair(Pair)}
   */
  @Test
  @DisplayName("Test ofPair(Pair); when of ten and ten; then return First is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoublesPair DoublesPair.ofPair(Pair)"})
  void testOfPair_whenOfTenAndTen_thenReturnFirstIsTen() {
    // Arrange
    Pair<Double, Double> pair = Pair.of(10.0d, 10.0d);

    // Act
    DoublesPair actualOfPairResult = DoublesPair.ofPair(pair);

    // Assert
    assertEquals(10.0d, actualOfPairResult.getFirst());
    assertEquals(10.0d, actualOfPairResult.getSecond());
    assertEquals(2, actualOfPairResult.size());
  }

  /**
   * Test {@link DoublesPair#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoublesPair#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '42'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoublesPair DoublesPair.parse(String)"})
  void testParse_when42_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> DoublesPair.parse("42"));
  }

  /**
   * Test {@link DoublesPair#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Pair Str}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoublesPair#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Pair Str'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoublesPair DoublesPair.parse(String)"})
  void testParse_whenPairStr_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> DoublesPair.parse("Pair Str"));
  }

  /**
   * Test {@link DoublesPair#elements()}.
   *
   * <ul>
   *   <li>Given {@link DoublesPair} with first is ten and second is ten.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link DoublesPair#elements()}
   */
  @Test
  @DisplayName(
      "Test elements(); given DoublesPair with first is ten and second is ten; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList DoublesPair.elements()"})
  void testElements_givenDoublesPairWithFirstIsTenAndSecondIsTen_thenReturnSizeIsTwo() {
    // Arrange
    DoublesPair ofResult = DoublesPair.of(10.0d, 10.0d);

    // Act
    ImmutableList<Object> actualElementsResult = ofResult.elements();

    // Assert
    assertEquals(2, actualElementsResult.size());
    assertEquals(10.0d, ((Double) actualElementsResult.get(0)).doubleValue());
    assertEquals(10.0d, ((Double) actualElementsResult.get(1)).doubleValue());
  }

  /**
   * Test {@link DoublesPair#toPair()}.
   *
   * <ul>
   *   <li>Then return First doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link DoublesPair#toPair()}
   */
  @Test
  @DisplayName("Test toPair(); then return First doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair DoublesPair.toPair()"})
  void testToPair_thenReturnFirstDoubleValueIsTen() {
    // Arrange
    DoublesPair ofResult = DoublesPair.of(10.0d, 10.0d);

    // Act
    Pair<Double, Double> actualToPairResult = ofResult.toPair();

    // Assert
    assertEquals(10.0d, actualToPairResult.getFirst().doubleValue());
    assertEquals(10.0d, actualToPairResult.getSecond().doubleValue());
    assertEquals(2, actualToPairResult.size());
  }

  /**
   * Test {@link DoublesPair#compareTo(DoublesPair)} with {@code DoublesPair}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link DoublesPair#compareTo(DoublesPair)}
   */
  @Test
  @DisplayName("Test compareTo(DoublesPair) with 'DoublesPair'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoublesPair.compareTo(DoublesPair)"})
  void testCompareToWithDoublesPair_thenReturnMinusOne() {
    // Arrange
    DoublesPair ofResult = DoublesPair.of(0.5d, 10.0d);

    // Act and Assert
    assertEquals(-1, ofResult.compareTo(DoublesPair.of(10.0d, 10.0d)));
  }

  /**
   * Test {@link DoublesPair#compareTo(DoublesPair)} with {@code DoublesPair}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DoublesPair#compareTo(DoublesPair)}
   */
  @Test
  @DisplayName("Test compareTo(DoublesPair) with 'DoublesPair'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoublesPair.compareTo(DoublesPair)"})
  void testCompareToWithDoublesPair_thenReturnZero() {
    // Arrange
    DoublesPair ofResult = DoublesPair.of(10.0d, 10.0d);

    // Act and Assert
    assertEquals(0, ofResult.compareTo(DoublesPair.of(10.0d, 10.0d)));
  }

  /**
   * Test {@link DoublesPair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoublesPair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoublesPair.equals(Object)", "int DoublesPair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DoublesPair ofResult = DoublesPair.of(10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, "Obj");
  }

  /**
   * Test {@link DoublesPair#meta()}.
   *
   * <p>Method under test: {@link DoublesPair#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DoublesPair.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DoublesPair.meta();

    // Assert
    MetaProperty<Double> firstResult = actualMetaResult.first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    MetaProperty<Double> secondResult = actualMetaResult.second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("double", firstResult.propertyType().getName());
    assertEquals("double", secondResult.propertyType().getName());
    assertEquals("first", firstResult.name());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DoublesPair> expectedDeclaringTypeResult = DoublesPair.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<DoublesPair> expectedDeclaringTypeResult2 = DoublesPair.class;
    assertEquals(expectedDeclaringTypeResult2, secondResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, firstResult.metaBean());
    assertSame(meta, secondResult.metaBean());
  }

  /**
   * Test {@link DoublesPair#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link DoublesPair} with first is ten and second is ten.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link DoublesPair#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given DoublesPair with first is ten and second is ten; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DoublesPair.metaBean()"})
  void testMetaBean_givenDoublesPairWithFirstIsTenAndSecondIsTen_thenReturnInstance() {
    // Arrange
    DoublesPair ofResult = DoublesPair.of(10.0d, 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }
}
