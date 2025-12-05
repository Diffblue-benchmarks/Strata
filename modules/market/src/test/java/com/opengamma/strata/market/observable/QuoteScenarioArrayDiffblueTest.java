package com.opengamma.strata.market.observable;

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
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.observable.QuoteScenarioArray.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class QuoteScenarioArrayDiffblueTest {
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
    Class<? extends QuoteScenarioArray> actualBeanTypeResult = QuoteScenarioArray.meta().beanType();

    // Assert
    Class<QuoteScenarioArray> expectedBeanTypeResult = QuoteScenarioArray.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
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
    assertNull(QuoteScenarioArray.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code quotes}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'quotes'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenQuotes_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        QuoteScenarioArray.meta().metaPropertyGet("quotes");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("quotes", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<QuoteScenarioArray> expectedDeclaringTypeResult = QuoteScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
        QuoteScenarioArray.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("quotes");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("quotes", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<QuoteScenarioArray> expectedDeclaringTypeResult = QuoteScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then {@link QuoteScenarioArray} with quotes is {@link DoubleArray} Quotes is {@link
   *       DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then QuoteScenarioArray with quotes is DoubleArray Quotes is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenQuoteScenarioArrayWithQuotesIsDoubleArrayQuotesIsEmpty() {
    // Arrange
    Meta metaResult = QuoteScenarioArray.meta();
    QuoteScenarioArray bean = QuoteScenarioArray.of(DoubleArray.of());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "quotes", true);

    // Assert
    DoubleArray doubleArray = ((DoubleArray) actualPropertyGetResult).EMPTY;
    assertSame(doubleArray, bean.getQuotes());
    assertSame(doubleArray, actualPropertyGetResult);
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
    assertNull(QuoteScenarioArray.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = QuoteScenarioArray.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                QuoteScenarioArray.of(DoubleArray.of()), "Property Name", false));
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
        () ->
            QuoteScenarioArray.meta().propertySet(mock(Bean.class), "quotes", "New Value", false));
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
            QuoteScenarioArray.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code quotes}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'quotes'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenQuotes_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> QuoteScenarioArray.meta().propertySet(mock(Bean.class), "quotes", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#quotes()}.
   *
   * <p>Method under test: {@link Meta#quotes()}
   */
  @Test
  @DisplayName("Test Meta quotes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.quotes()"})
  void testMetaQuotes() {
    // Arrange, Act and Assert
    assertTrue(QuoteScenarioArray.meta().quotes() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link QuoteScenarioArray#of(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArray#of(DoubleArray)}
   */
  @Test
  @DisplayName("Test of(DoubleArray); when DoubleArray; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QuoteScenarioArray QuoteScenarioArray.of(DoubleArray)"})
  void testOf_whenDoubleArray_thenReturnScenarioCountIsZero() {
    // Arrange and Act
    QuoteScenarioArray actualOfResult = QuoteScenarioArray.of(DoubleArray.of());

    // Assert
    assertEquals(0, actualOfResult.getScenarioCount());
    Stream<Double> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertSame(DoubleArray.EMPTY, actualOfResult.getQuotes());
  }

  /**
   * Test {@link QuoteScenarioArray#getScenarioCount()}.
   *
   * <p>Method under test: {@link QuoteScenarioArray#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int QuoteScenarioArray.getScenarioCount()"})
  void testGetScenarioCount() {
    // Arrange, Act and Assert
    assertEquals(0, QuoteScenarioArray.of(DoubleArray.of()).getScenarioCount());
  }

  /**
   * Test {@link QuoteScenarioArray#get(int)}.
   *
   * <ul>
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArray#get(int)}
   */
  @Test
  @DisplayName("Test get(int); then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double QuoteScenarioArray.get(int)"})
  void testGet_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, QuoteScenarioArray.of(DoubleArray.filled(3)).get(1).doubleValue());
  }

  /**
   * Test {@link QuoteScenarioArray#stream()}.
   *
   * <p>Method under test: {@link QuoteScenarioArray#stream()}
   */
  @Test
  @DisplayName("Test stream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream QuoteScenarioArray.stream()"})
  void testStream() {
    // Arrange and Act
    Stream<Double> actualStreamResult = QuoteScenarioArray.of(DoubleArray.of()).stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link QuoteScenarioArray#meta()}.
   *
   * <p>Method under test: {@link QuoteScenarioArray#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta QuoteScenarioArray.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = QuoteScenarioArray.meta();

    // Assert
    MetaProperty<DoubleArray> quotesResult = actualMetaResult.quotes();
    assertTrue(quotesResult instanceof DirectMetaProperty);
    assertEquals("quotes", quotesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, quotesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, quotesResult.propertyType());
    Class<QuoteScenarioArray> expectedDeclaringTypeResult = QuoteScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, quotesResult.declaringType());
    assertSame(Meta.INSTANCE, quotesResult.metaBean());
  }

  /**
   * Test {@link QuoteScenarioArray#metaBean()}.
   *
   * <p>Method under test: {@link QuoteScenarioArray#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta QuoteScenarioArray.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, QuoteScenarioArray.of(DoubleArray.of()).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link QuoteScenarioArray#toString()}
   *   <li>{@link QuoteScenarioArray#getQuotes()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray QuoteScenarioArray.getQuotes()",
    "String QuoteScenarioArray.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    QuoteScenarioArray ofResult = QuoteScenarioArray.of(DoubleArray.of());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("QuoteScenarioArray{quotes=[]}", actualToStringResult);
    assertSame(DoubleArray.EMPTY, ofResult.getQuotes());
  }

  /**
   * Test {@link QuoteScenarioArray#equals(Object)}, and {@link QuoteScenarioArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link QuoteScenarioArray#equals(Object)}
   *   <li>{@link QuoteScenarioArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean QuoteScenarioArray.equals(Object)",
    "int QuoteScenarioArray.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    QuoteScenarioArray ofResult = QuoteScenarioArray.of(DoubleArray.of());
    QuoteScenarioArray ofResult2 = QuoteScenarioArray.of(DoubleArray.of());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link QuoteScenarioArray#equals(Object)}, and {@link QuoteScenarioArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link QuoteScenarioArray#equals(Object)}
   *   <li>{@link QuoteScenarioArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean QuoteScenarioArray.equals(Object)",
    "int QuoteScenarioArray.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    QuoteScenarioArray ofResult = QuoteScenarioArray.of(DoubleArray.of());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link QuoteScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean QuoteScenarioArray.equals(Object)",
    "int QuoteScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(QuoteScenarioArray.of(DoubleArray.of()), null);
  }

  /**
   * Test {@link QuoteScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean QuoteScenarioArray.equals(Object)",
    "int QuoteScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        QuoteScenarioArray.of(DoubleArray.of()), "Different type to QuoteScenarioArray");
  }
}
