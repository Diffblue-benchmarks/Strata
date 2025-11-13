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
import com.opengamma.strata.collect.tuple.LongDoublePair.Meta;
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

class LongDoublePairDiffblueTest {
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
    Class<? extends LongDoublePair> actualBeanTypeResult = LongDoublePair.meta().beanType();

    // Assert
    Class<LongDoublePair> expectedBeanTypeResult = LongDoublePair.class;
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
    Meta metaResult = LongDoublePair.meta();

    // Act
    MetaProperty<Long> actualFirstResult = metaResult.first();

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
    MetaProperty<?> actualMetaPropertyGetResult = LongDoublePair.meta().metaPropertyGet("first");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> secondResult = ((Meta) metaBeanResult).second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("double", secondResult.propertyType().getName());
    assertEquals("first", actualMetaPropertyGetResult.name());
    assertEquals("long", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    Class<LongDoublePair> expectedDeclaringTypeResult = LongDoublePair.class;
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
    assertNull(LongDoublePair.meta().metaPropertyGet("Property Name"));
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
    MetaProperty<?> actualMetaPropertyGetResult = LongDoublePair.meta().metaPropertyGet("second");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Long> firstResult = ((Meta) metaBeanResult).first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("first", firstResult.name());
    assertEquals("long", firstResult.propertyType().getName());
    assertEquals("second", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    Class<LongDoublePair> expectedDeclaringTypeResult = LongDoublePair.class;
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        LongDoublePair.meta().metaPropertyMap();

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
    assertEquals("long", getResult.propertyType().getName());
    assertEquals("second", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<LongDoublePair> expectedDeclaringTypeResult = LongDoublePair.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<LongDoublePair> expectedDeclaringTypeResult2 = LongDoublePair.class;
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
    Meta metaResult = LongDoublePair.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double) metaResult.propertyGet(LongDoublePair.of(-906279820L, 10.0d), "second", true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return longValue is {@code -906279820}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then return longValue is '-906279820'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnLongValueIs906279820() {
    // Arrange
    Meta metaResult = LongDoublePair.meta();

    // Act and Assert
    assertEquals(
        -906279820L,
        ((Long) metaResult.propertyGet(LongDoublePair.of(-906279820L, 10.0d), "first", true))
            .longValue());
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
    assertNull(LongDoublePair.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> LongDoublePair.meta().propertySet(mock(Bean.class), "first", "New Value", false));
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
        () -> LongDoublePair.meta().propertySet(mock(Bean.class), "first", "New Value", true));
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
            LongDoublePair.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> LongDoublePair.meta().propertySet(mock(Bean.class), "second", "New Value", true));
  }

  /**
   * Test {@link LongDoublePair#of(long, double)}.
   *
   * <p>Method under test: {@link LongDoublePair#of(long, double)}
   */
  @Test
  @DisplayName("Test of(long, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongDoublePair LongDoublePair.of(long, double)"})
  void testOf() {
    // Arrange and Act
    LongDoublePair actualOfResult = LongDoublePair.of(1L, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getSecond());
    assertEquals(1L, actualOfResult.getFirst());
    assertEquals(2, actualOfResult.size());
  }

  /**
   * Test {@link LongDoublePair#ofPair(Pair)}.
   *
   * <ul>
   *   <li>When of one and ten.
   *   <li>Then return Second is ten.
   * </ul>
   *
   * <p>Method under test: {@link LongDoublePair#ofPair(Pair)}
   */
  @Test
  @DisplayName("Test ofPair(Pair); when of one and ten; then return Second is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongDoublePair LongDoublePair.ofPair(Pair)"})
  void testOfPair_whenOfOneAndTen_thenReturnSecondIsTen() {
    // Arrange
    Pair<Long, Double> pair = Pair.of(1L, 10.0d);

    // Act
    LongDoublePair actualOfPairResult = LongDoublePair.ofPair(pair);

    // Assert
    assertEquals(10.0d, actualOfPairResult.getSecond());
    assertEquals(1L, actualOfPairResult.getFirst());
    assertEquals(2, actualOfPairResult.size());
  }

  /**
   * Test {@link LongDoublePair#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LongDoublePair#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '42'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongDoublePair LongDoublePair.parse(String)"})
  void testParse_when42_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> LongDoublePair.parse("42"));
  }

  /**
   * Test {@link LongDoublePair#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Pair Str}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LongDoublePair#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Pair Str'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongDoublePair LongDoublePair.parse(String)"})
  void testParse_whenPairStr_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> LongDoublePair.parse("Pair Str"));
  }

  /**
   * Test {@link LongDoublePair#elements()}.
   *
   * <ul>
   *   <li>Given {@link LongDoublePair} with first is one and second is ten.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link LongDoublePair#elements()}
   */
  @Test
  @DisplayName(
      "Test elements(); given LongDoublePair with first is one and second is ten; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList LongDoublePair.elements()"})
  void testElements_givenLongDoublePairWithFirstIsOneAndSecondIsTen_thenReturnSizeIsTwo() {
    // Arrange
    LongDoublePair ofResult = LongDoublePair.of(1L, 10.0d);

    // Act
    ImmutableList<Object> actualElementsResult = ofResult.elements();

    // Assert
    assertEquals(2, actualElementsResult.size());
    assertEquals(10.0d, ((Double) actualElementsResult.get(1)).doubleValue());
    assertEquals(1L, ((Long) actualElementsResult.get(0)).longValue());
  }

  /**
   * Test {@link LongDoublePair#toPair()}.
   *
   * <ul>
   *   <li>Then return Second doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link LongDoublePair#toPair()}
   */
  @Test
  @DisplayName("Test toPair(); then return Second doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair LongDoublePair.toPair()"})
  void testToPair_thenReturnSecondDoubleValueIsTen() {
    // Arrange
    LongDoublePair ofResult = LongDoublePair.of(1L, 10.0d);

    // Act
    Pair<Long, Double> actualToPairResult = ofResult.toPair();

    // Assert
    assertEquals(10.0d, actualToPairResult.getSecond().doubleValue());
    assertEquals(1L, actualToPairResult.getFirst().longValue());
    assertEquals(2, actualToPairResult.size());
  }

  /**
   * Test {@link LongDoublePair#compareTo(LongDoublePair)} with {@code LongDoublePair}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link LongDoublePair#compareTo(LongDoublePair)}
   */
  @Test
  @DisplayName("Test compareTo(LongDoublePair) with 'LongDoublePair'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LongDoublePair.compareTo(LongDoublePair)"})
  void testCompareToWithLongDoublePair_thenReturnMinusOne() {
    // Arrange
    LongDoublePair ofResult = LongDoublePair.of(0L, 10.0d);

    // Act and Assert
    assertEquals(-1, ofResult.compareTo(LongDoublePair.of(1L, 10.0d)));
  }

  /**
   * Test {@link LongDoublePair#compareTo(LongDoublePair)} with {@code LongDoublePair}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LongDoublePair#compareTo(LongDoublePair)}
   */
  @Test
  @DisplayName("Test compareTo(LongDoublePair) with 'LongDoublePair'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LongDoublePair.compareTo(LongDoublePair)"})
  void testCompareToWithLongDoublePair_thenReturnZero() {
    // Arrange
    LongDoublePair ofResult = LongDoublePair.of(1L, 10.0d);

    // Act and Assert
    assertEquals(0, ofResult.compareTo(LongDoublePair.of(1L, 10.0d)));
  }

  /**
   * Test {@link LongDoublePair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LongDoublePair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongDoublePair.equals(Object)", "int LongDoublePair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    LongDoublePair ofResult = LongDoublePair.of(1L, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, "Obj");
  }

  /**
   * Test {@link LongDoublePair#meta()}.
   *
   * <p>Method under test: {@link LongDoublePair#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LongDoublePair.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = LongDoublePair.meta();

    // Assert
    MetaProperty<Long> firstResult = actualMetaResult.first();
    assertTrue(firstResult instanceof DirectMetaProperty);
    MetaProperty<Double> secondResult = actualMetaResult.second();
    assertTrue(secondResult instanceof DirectMetaProperty);
    assertEquals("double", secondResult.propertyType().getName());
    assertEquals("first", firstResult.name());
    assertEquals("long", firstResult.propertyType().getName());
    assertEquals("second", secondResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, firstResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, secondResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<LongDoublePair> expectedDeclaringTypeResult = LongDoublePair.class;
    assertEquals(expectedDeclaringTypeResult, firstResult.declaringType());
    Class<LongDoublePair> expectedDeclaringTypeResult2 = LongDoublePair.class;
    assertEquals(expectedDeclaringTypeResult2, secondResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, firstResult.metaBean());
    assertSame(meta, secondResult.metaBean());
  }

  /**
   * Test {@link LongDoublePair#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link LongDoublePair} with first is one and second is ten.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link LongDoublePair#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given LongDoublePair with first is one and second is ten; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LongDoublePair.metaBean()"})
  void testMetaBean_givenLongDoublePairWithFirstIsOneAndSecondIsTen_thenReturnInstance() {
    // Arrange
    LongDoublePair ofResult = LongDoublePair.of(1L, 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }
}
