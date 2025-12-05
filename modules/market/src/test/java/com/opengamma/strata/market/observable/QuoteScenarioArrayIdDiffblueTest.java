package com.opengamma.strata.market.observable;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.data.FieldName;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.MarketDataBox;
import com.opengamma.strata.market.observable.QuoteScenarioArrayId.Meta;
import java.util.List;
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

class QuoteScenarioArrayIdDiffblueTest {
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
    Class<? extends QuoteScenarioArrayId> actualBeanTypeResult =
        QuoteScenarioArrayId.meta().beanType();

    // Assert
    Class<QuoteScenarioArrayId> expectedBeanTypeResult = QuoteScenarioArrayId.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#id()}.
   *
   * <p>Method under test: {@link Meta#id()}
   */
  @Test
  @DisplayName("Test Meta id()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.id()"})
  void testMetaId() {
    // Arrange, Act and Assert
    assertTrue(QuoteScenarioArrayId.meta().id() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code id}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'id'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenId_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = QuoteScenarioArrayId.meta().metaPropertyGet("id");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("id", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<QuoteId> expectedPropertyTypeResult = QuoteId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<QuoteScenarioArrayId> expectedDeclaringTypeResult = QuoteScenarioArrayId.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
    assertNull(QuoteScenarioArrayId.meta().metaPropertyGet("Property Name"));
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
        QuoteScenarioArrayId.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("id");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("id", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<QuoteId> expectedPropertyTypeResult = QuoteId.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<QuoteScenarioArrayId> expectedDeclaringTypeResult = QuoteScenarioArrayId.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@link QuoteId} with {@link StandardId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return QuoteId with StandardId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnQuoteIdWithStandardId() {
    // Arrange
    Meta metaResult = QuoteScenarioArrayId.meta();
    QuoteId quoteId = QuoteId.of(StandardId.of("Scheme", "42"));

    // Act and Assert
    assertSame(quoteId, metaResult.propertyGet(QuoteScenarioArrayId.of(quoteId), "id", true));
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
    assertNull(QuoteScenarioArrayId.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> QuoteScenarioArrayId.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
        () -> QuoteScenarioArrayId.meta().propertySet(mock(Bean.class), "id", "New Value", false));
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
        () -> QuoteScenarioArrayId.meta().propertySet(mock(Bean.class), "id", "New Value", true));
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
            QuoteScenarioArrayId.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link QuoteScenarioArrayId#of(StandardId, FieldName)} with {@code id}, {@code fieldName}.
   *
   * <ul>
   *   <li>Then return Id ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArrayId#of(StandardId, FieldName)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId, FieldName) with 'id', 'fieldName'; then return Id ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QuoteScenarioArrayId QuoteScenarioArrayId.of(StandardId, FieldName)"})
  void testOfWithIdFieldName_thenReturnIdObservableSourceNameIsNone() {
    // Arrange
    StandardId id = StandardId.of("Scheme", "42");
    FieldName fieldName = FieldName.of("Name");

    // Act
    QuoteScenarioArrayId actualOfResult = QuoteScenarioArrayId.of(id, fieldName);

    // Assert
    QuoteId id2 = actualOfResult.getId();
    ObservableSource observableSource = id2.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<QuoteScenarioArray> expectedScenarioMarketDataType = QuoteScenarioArray.class;
    assertEquals(expectedScenarioMarketDataType, actualOfResult.getScenarioMarketDataType());
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, id2.getMarketDataType());
    assertSame(id2, actualOfResult.getMarketDataId());
    assertSame(id, id2.getStandardId());
    assertSame(fieldName, id2.getFieldName());
  }

  /**
   * Test {@link QuoteScenarioArrayId#of(QuoteId)} with {@code quoteId}.
   *
   * <ul>
   *   <li>Then return ScenarioMarketDataType is {@link QuoteScenarioArray}.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArrayId#of(QuoteId)}
   */
  @Test
  @DisplayName(
      "Test of(QuoteId) with 'quoteId'; then return ScenarioMarketDataType is QuoteScenarioArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QuoteScenarioArrayId QuoteScenarioArrayId.of(QuoteId)"})
  void testOfWithQuoteId_thenReturnScenarioMarketDataTypeIsQuoteScenarioArray() {
    // Arrange
    QuoteId quoteId = QuoteId.of(StandardId.of("Scheme", "42"));

    // Act
    QuoteScenarioArrayId actualOfResult = QuoteScenarioArrayId.of(quoteId);

    // Assert
    Class<QuoteScenarioArray> expectedScenarioMarketDataType = QuoteScenarioArray.class;
    assertEquals(expectedScenarioMarketDataType, actualOfResult.getScenarioMarketDataType());
    assertSame(quoteId, actualOfResult.getId());
    assertSame(quoteId, actualOfResult.getMarketDataId());
  }

  /**
   * Test {@link QuoteScenarioArrayId#getMarketDataId()}.
   *
   * <ul>
   *   <li>Then return {@link QuoteId} with {@link StandardId}.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArrayId#getMarketDataId()}
   */
  @Test
  @DisplayName("Test getMarketDataId(); then return QuoteId with StandardId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QuoteId QuoteScenarioArrayId.getMarketDataId()"})
  void testGetMarketDataId_thenReturnQuoteIdWithStandardId() {
    // Arrange
    QuoteId quoteId = QuoteId.of(StandardId.of("Scheme", "42"));

    // Act and Assert
    assertSame(quoteId, QuoteScenarioArrayId.of(quoteId).getMarketDataId());
  }

  /**
   * Test {@link QuoteScenarioArrayId#createScenarioValue(MarketDataBox, int)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return Quotes max is ten.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArrayId#createScenarioValue(MarketDataBox, int)}
   */
  @Test
  @DisplayName(
      "Test createScenarioValue(MarketDataBox, int); given ten; then return Quotes max is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuoteScenarioArray QuoteScenarioArrayId.createScenarioValue(MarketDataBox, int)"
  })
  void testCreateScenarioValue_givenTen_thenReturnQuotesMaxIsTen() {
    // Arrange
    QuoteScenarioArrayId ofResult =
        QuoteScenarioArrayId.of(QuoteId.of(StandardId.of("Scheme", "42")));

    MarketDataBox<Double> marketDataBox = mock(MarketDataBox.class);
    when(marketDataBox.getValue(anyInt())).thenReturn(10.0d);

    // Act
    QuoteScenarioArray actualCreateScenarioValueResult =
        ofResult.createScenarioValue(marketDataBox, 3);

    // Assert
    verify(marketDataBox, atLeast(1)).getValue(anyInt());
    DoubleArray quotes = actualCreateScenarioValueResult.getQuotes();
    assertEquals(10.0d, quotes.max());
    assertEquals(10.0d, quotes.min());
    Stream<Double> streamResult = actualCreateScenarioValueResult.stream();
    List<Double> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals(10.0d, collectResult.get(0).doubleValue());
    assertEquals(10.0d, collectResult.get(1).doubleValue());
    assertEquals(10.0d, collectResult.get(2).doubleValue());
    assertEquals(3, quotes.size());
    assertEquals(3, actualCreateScenarioValueResult.getScenarioCount());
    assertEquals(3, quotes.toList().size());
    assertEquals(30.0d, quotes.sum());
    assertFalse(quotes.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, quotes.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link QuoteScenarioArrayId#createScenarioValue(MarketDataBox, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Quotes size is zero.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArrayId#createScenarioValue(MarketDataBox, int)}
   */
  @Test
  @DisplayName(
      "Test createScenarioValue(MarketDataBox, int); when zero; then return Quotes size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuoteScenarioArray QuoteScenarioArrayId.createScenarioValue(MarketDataBox, int)"
  })
  void testCreateScenarioValue_whenZero_thenReturnQuotesSizeIsZero() {
    // Arrange and Act
    QuoteScenarioArray actualCreateScenarioValueResult =
        QuoteScenarioArrayId.of(QuoteId.of(StandardId.of("Scheme", "42")))
            .createScenarioValue(mock(MarketDataBox.class), 0);

    // Assert
    DoubleArray quotes = actualCreateScenarioValueResult.getQuotes();
    assertEquals(0, quotes.size());
    assertEquals(0, actualCreateScenarioValueResult.getScenarioCount());
    assertEquals(0.0d, quotes.sum());
    assertTrue(quotes.isEmpty());
    assertTrue(quotes.toList().isEmpty());
    Stream<Double> streamResult = actualCreateScenarioValueResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertArrayEquals(new double[] {}, quotes.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link QuoteScenarioArrayId#meta()}.
   *
   * <p>Method under test: {@link QuoteScenarioArrayId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta QuoteScenarioArrayId.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = QuoteScenarioArrayId.meta();

    // Assert
    MetaProperty<QuoteId> idResult = actualMetaResult.id();
    assertTrue(idResult instanceof DirectMetaProperty);
    assertEquals("id", idResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, idResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<QuoteId> expectedPropertyTypeResult = QuoteId.class;
    assertEquals(expectedPropertyTypeResult, idResult.propertyType());
    Class<QuoteScenarioArrayId> expectedDeclaringTypeResult = QuoteScenarioArrayId.class;
    assertEquals(expectedDeclaringTypeResult, idResult.declaringType());
    assertSame(Meta.INSTANCE, idResult.metaBean());
  }

  /**
   * Test {@link QuoteScenarioArrayId#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArrayId#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given StandardId with 'Scheme' and value is '42'; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta QuoteScenarioArrayId.metaBean()"})
  void testMetaBean_givenStandardIdWithSchemeAndValueIs42_thenReturnInstance() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        QuoteScenarioArrayId.of(QuoteId.of(StandardId.of("Scheme", "42"))).metaBean());
  }

  /**
   * Test {@link QuoteScenarioArrayId#equals(Object)}, and {@link QuoteScenarioArrayId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link QuoteScenarioArrayId#equals(Object)}
   *   <li>{@link QuoteScenarioArrayId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean QuoteScenarioArrayId.equals(Object)",
    "int QuoteScenarioArrayId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    QuoteScenarioArrayId ofResult =
        QuoteScenarioArrayId.of(QuoteId.of(StandardId.of("Scheme", "42")));
    QuoteScenarioArrayId ofResult2 =
        QuoteScenarioArrayId.of(QuoteId.of(StandardId.of("Scheme", "42")));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link QuoteScenarioArrayId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArrayId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean QuoteScenarioArrayId.equals(Object)",
    "int QuoteScenarioArrayId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(QuoteScenarioArrayId.of(QuoteId.of(StandardId.of("Scheme", "42"))), 1);
  }

  /**
   * Test {@link QuoteScenarioArrayId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuoteScenarioArrayId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean QuoteScenarioArrayId.equals(Object)",
    "int QuoteScenarioArrayId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(QuoteScenarioArrayId.of(QuoteId.of(StandardId.of("Scheme", "42"))), null);
  }
}
