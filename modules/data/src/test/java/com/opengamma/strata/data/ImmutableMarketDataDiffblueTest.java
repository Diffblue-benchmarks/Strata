package com.opengamma.strata.data;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.ImmutableMarketData.Meta;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableMarketDataDiffblueTest {
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
    Class<? extends ImmutableMarketData> actualBeanTypeResult =
        ImmutableMarketData.meta().beanType();

    // Assert
    Class<ImmutableMarketData> expectedBeanTypeResult = ImmutableMarketData.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#timeSeries()}
   *   <li>{@link Meta#valuationDate()}
   *   <li>{@link Meta#values()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.timeSeries()",
    "MetaProperty Meta.valuationDate()",
    "MetaProperty Meta.values()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableMarketData.meta();

    // Act
    MetaProperty<ImmutableMap<ObservableId, LocalDateDoubleTimeSeries>> actualTimeSeriesResult =
        metaResult.timeSeries();
    MetaProperty<LocalDate> actualValuationDateResult = metaResult.valuationDate();

    // Assert
    assertTrue(actualTimeSeriesResult instanceof DirectMetaProperty);
    assertTrue(actualValuationDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.values() instanceof DirectMetaProperty);
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
    assertNull(ImmutableMarketData.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code timeSeries}.
   *   <li>Then return name is {@code timeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'timeSeries'; then return name is 'timeSeries'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTimeSeries_thenReturnNameIsTimeSeries() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableMarketData.meta().metaPropertyGet("timeSeries");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<MarketDataId<?>, Object>> valuesResult =
        ((Meta) metaBeanResult).values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("timeSeries", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeSeries());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
    assertSame(metaBeanResult, valuesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return name is {@code valuationDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valuationDate'; then return name is 'valuationDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValuationDate_thenReturnNameIsValuationDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableMarketData.meta().metaPropertyGet("valuationDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<ObservableId, LocalDateDoubleTimeSeries>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<MarketDataId<?>, Object>> valuesResult =
        ((Meta) metaBeanResult).values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("valuationDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDate());
    assertSame(metaBeanResult, timeSeriesResult.metaBean());
    assertSame(metaBeanResult, valuesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then return name is {@code values}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'values'; then return name is 'values'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValues_thenReturnNameIsValues() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableMarketData.meta().metaPropertyGet("values");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<ObservableId, LocalDateDoubleTimeSeries>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("values", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).values());
    assertSame(metaBeanResult, timeSeriesResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
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
        ImmutableMarketData.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("valuationDate");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("timeSeries");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("values");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("timeSeries", getResult2.name());
    assertEquals("valuationDate", getResult.name());
    assertEquals("values", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<ImmutableMarketData> expectedDeclaringTypeResult = ImmutableMarketData.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ImmutableMarketData> expectedDeclaringTypeResult2 = ImmutableMarketData.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<ImmutableMarketData> expectedDeclaringTypeResult3 = ImmutableMarketData.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
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
    assertNull(ImmutableMarketData.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = ImmutableMarketData.meta();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                ImmutableMarketData.of(valuationDate, new HashMap<>()), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeSeries}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'timeSeries'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTimeSeries_thenReturnMap() {
    // Arrange
    Meta metaResult = ImmutableMarketData.meta();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            ImmutableMarketData.of(valuationDate, new HashMap<>()), "timeSeries", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'valuationDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValuationDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = ImmutableMarketData.meta();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            ImmutableMarketData.of(valuationDate, new HashMap<>()), "valuationDate", true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(valuationDate, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'values'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValues_thenReturnMap() {
    // Arrange
    Meta metaResult = ImmutableMarketData.meta();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            ImmutableMarketData.of(valuationDate, new HashMap<>()), "values", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
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
            ImmutableMarketData.meta()
                .propertySet(mock(Bean.class), "timeSeries", "New Value", false));
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
            ImmutableMarketData.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeSeries}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'timeSeries'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTimeSeries_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableMarketData.meta()
                .propertySet(mock(Bean.class), "timeSeries", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valuationDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValuationDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableMarketData.meta()
                .propertySet(mock(Bean.class), "valuationDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'values'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValues_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableMarketData.meta().propertySet(mock(Bean.class), "values", "New Value", true));
  }

  /**
   * Test {@link ImmutableMarketData#of(LocalDate, Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return Ids size is four.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#of(LocalDate, Map)}
   */
  @Test
  @DisplayName("Test of(LocalDate, Map); given 'java.lang.Object'; then return Ids size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.of(LocalDate, Map)"})
  void testOf_givenJavaLangObject_thenReturnIdsSizeIsFour() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    MarketDataId<Object> marketDataId3 = mock(MarketDataId.class);
    Class<Object> forNameResult3 = Object.class;
    when(marketDataId3.getMarketDataType()).thenReturn(forNameResult3);

    MarketDataId<Object> marketDataId4 = mock(MarketDataId.class);
    Class<Object> forNameResult4 = Object.class;
    when(marketDataId4.getMarketDataType()).thenReturn(forNameResult4);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId4, "Value");
    values.put(marketDataId3, "Value");
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act
    ImmutableMarketData actualOfResult = ImmutableMarketData.of(valuationDate, values);

    // Assert
    verify(marketDataId4).getMarketDataType();
    verify(marketDataId3).getMarketDataType();
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertEquals(4, actualOfResult.getIds().size());
    assertTrue(actualOfResult.getTimeSeries().isEmpty());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertEquals(values, actualOfResult.getValues());
    assertSame(valuationDate, actualOfResult.getValuationDate());
  }

  /**
   * Test {@link ImmutableMarketData#of(LocalDate, Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return Ids size is three.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#of(LocalDate, Map)}
   */
  @Test
  @DisplayName("Test of(LocalDate, Map); given 'java.lang.Object'; then return Ids size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.of(LocalDate, Map)"})
  void testOf_givenJavaLangObject_thenReturnIdsSizeIsThree() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    MarketDataId<Object> marketDataId3 = mock(MarketDataId.class);
    Class<Object> forNameResult3 = Object.class;
    when(marketDataId3.getMarketDataType()).thenReturn(forNameResult3);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId3, "Value");
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act
    ImmutableMarketData actualOfResult = ImmutableMarketData.of(valuationDate, values);

    // Assert
    verify(marketDataId3).getMarketDataType();
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertEquals(3, actualOfResult.getIds().size());
    assertTrue(actualOfResult.getTimeSeries().isEmpty());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertEquals(values, actualOfResult.getValues());
    assertSame(valuationDate, actualOfResult.getValuationDate());
  }

  /**
   * Test {@link ImmutableMarketData#of(LocalDate, Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashMap#HashMap()} {@link MarketDataId} is {@code Value}.
   *   <li>Then return Ids size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#of(LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Map); given 'java.lang.Object'; when HashMap() MarketDataId is 'Value'; then return Ids size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.of(LocalDate, Map)"})
  void testOf_givenJavaLangObject_whenHashMapMarketDataIdIsValue_thenReturnIdsSizeIsOne() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act
    ImmutableMarketData actualOfResult = ImmutableMarketData.of(valuationDate, values);

    // Assert
    verify(marketDataId).getMarketDataType();
    assertEquals(1, actualOfResult.getIds().size());
    assertTrue(actualOfResult.getTimeSeries().isEmpty());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertEquals(values, actualOfResult.getValues());
    assertSame(valuationDate, actualOfResult.getValuationDate());
  }

  /**
   * Test {@link ImmutableMarketData#of(LocalDate, Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link HashMap#HashMap()} {@link MarketDataId} is {@code Value}.
   *   <li>Then return Ids size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#of(LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Map); given 'java.lang.Object'; when HashMap() MarketDataId is 'Value'; then return Ids size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.of(LocalDate, Map)"})
  void testOf_givenJavaLangObject_whenHashMapMarketDataIdIsValue_thenReturnIdsSizeIsTwo() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act
    ImmutableMarketData actualOfResult = ImmutableMarketData.of(valuationDate, values);

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertEquals(2, actualOfResult.getIds().size());
    assertTrue(actualOfResult.getTimeSeries().isEmpty());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertEquals(values, actualOfResult.getValues());
    assertSame(valuationDate, actualOfResult.getValuationDate());
  }

  /**
   * Test {@link ImmutableMarketData#of(LocalDate, Map)}.
   *
   * <ul>
   *   <li>Given {@link MarketDataId} {@link MarketDataId#getMarketDataType()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#of(LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Map); given MarketDataId getMarketDataType() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.of(LocalDate, Map)"})
  void testOf_givenMarketDataIdGetMarketDataTypeThrowIllegalArgumentException() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    when(marketDataId.getMarketDataType()).thenThrow(new IllegalArgumentException());

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ImmutableMarketData.of(valuationDate, values));
    verify(marketDataId).getMarketDataType();
  }

  /**
   * Test {@link ImmutableMarketData#of(LocalDate, Map)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link HashMap#HashMap()} {@link MarketDataId} is {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#of(LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Map); given 'null'; when HashMap() MarketDataId is 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.of(LocalDate, Map)"})
  void testOf_givenNull_whenHashMapMarketDataIdIsNull_thenThrowIllegalArgumentException() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    MarketDataId<Object> marketDataId3 = mock(MarketDataId.class);
    Class<Object> forNameResult3 = Object.class;
    when(marketDataId3.getMarketDataType()).thenReturn(forNameResult3);

    MarketDataId<Object> marketDataId4 = mock(MarketDataId.class);
    Class<Object> forNameResult4 = Object.class;
    when(marketDataId4.getMarketDataType()).thenReturn(forNameResult4);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId4, null);
    values.put(marketDataId3, "Value");
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ImmutableMarketData.of(valuationDate, values));
    verify(marketDataId4).getMarketDataType();
  }

  /**
   * Test {@link ImmutableMarketData#of(LocalDate, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return TimeSeries is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#of(LocalDate, Map)}
   */
  @Test
  @DisplayName("Test of(LocalDate, Map); when HashMap(); then return TimeSeries is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.of(LocalDate, Map)"})
  void testOf_whenHashMap_thenReturnTimeSeriesIsHashMap() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();

    // Act
    ImmutableMarketData actualOfResult = ImmutableMarketData.of(valuationDate, values);

    // Assert
    Set<MarketDataId<?>> ids = actualOfResult.getIds();
    assertTrue(ids.isEmpty());
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        actualOfResult.getTimeSeries();
    assertEquals(values, timeSeries);
    assertSame(ids, actualOfResult.getTimeSeriesIds());
    assertSame(timeSeries, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableMarketData#checkType(MarketDataId, Object)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#checkType(MarketDataId, Object)}
   */
  @Test
  @DisplayName("Test checkType(MarketDataId, Object); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableMarketData.checkType(MarketDataId, Object)"})
  void testCheckType_givenIllegalArgumentException() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    when(id.getMarketDataType()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ImmutableMarketData.checkType(id, "Value"));
    verify(id).getMarketDataType();
  }

  /**
   * Test {@link ImmutableMarketData#checkType(MarketDataId, Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link MarketDataId} {@link MarketDataId#getMarketDataType()} return {@link Object}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#checkType(MarketDataId, Object)}
   */
  @Test
  @DisplayName(
      "Test checkType(MarketDataId, Object); given 'java.lang.Object'; when MarketDataId getMarketDataType() return Object")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableMarketData.checkType(MarketDataId, Object)"})
  void testCheckType_givenJavaLangObject_whenMarketDataIdGetMarketDataTypeReturnObject() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getMarketDataType()).thenReturn(forNameResult);

    // Act
    ImmutableMarketData.checkType(id, "Value");

    // Assert
    verify(id).getMarketDataType();
  }

  /**
   * Test {@link ImmutableMarketData#checkType(MarketDataId, Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#checkType(MarketDataId, Object)}
   */
  @Test
  @DisplayName(
      "Test checkType(MarketDataId, Object); given 'java.lang.Object'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableMarketData.checkType(MarketDataId, Object)"})
  void testCheckType_givenJavaLangObject_whenNull_thenThrowIllegalArgumentException() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getMarketDataType()).thenReturn(forNameResult);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ImmutableMarketData.checkType(id, null));
    verify(id).getMarketDataType();
  }

  /**
   * Test {@link ImmutableMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ImmutableMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableMarketData.containsValue(MarketDataId)"})
  void testContainsValue() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act
    boolean actualContainsValueResult =
        ImmutableMarketData.of(LocalDate.ofYearDay(5, 5), values)
            .containsValue(mock(MarketDataId.class));

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertFalse(actualContainsValueResult);
  }

  /**
   * Test {@link ImmutableMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(MarketDataId); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableMarketData.containsValue(MarketDataId)"})
  void testContainsValue_givenJavaLangObject_thenCallsGetMarketDataType() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act
    boolean actualContainsValueResult =
        ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values)
            .containsValue(mock(MarketDataId.class));

    // Assert
    verify(marketDataId).getMarketDataType();
    assertFalse(actualContainsValueResult);
  }

  /**
   * Test {@link ImmutableMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(MarketDataId); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableMarketData.containsValue(MarketDataId)"})
  void testContainsValue_givenJavaLangObject_thenCallsGetMarketDataType2() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act
    boolean actualContainsValueResult =
        ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values)
            .containsValue(mock(MarketDataId.class));

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertFalse(actualContainsValueResult);
  }

  /**
   * Test {@link ImmutableMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId); given LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableMarketData.containsValue(MarketDataId)"})
  void testContainsValue_givenLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertFalse(
        ImmutableMarketData.of(valuationDate, new HashMap<>())
            .containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(ImmutableMarketData)} with {@code
   * ImmutableMarketData}.
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(ImmutableMarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(ImmutableMarketData) with 'ImmutableMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.combinedWith(ImmutableMarketData)"})
  void testCombinedWithWithImmutableMarketData() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData ofResult = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act
    ImmutableMarketData actualCombinedWithResult =
        ofResult.combinedWith(ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Assert
    assertEquals(ofResult, actualCombinedWithResult);
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(ImmutableMarketData)} with {@code
   * ImmutableMarketData}.
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(ImmutableMarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(ImmutableMarketData) with 'ImmutableMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.combinedWith(ImmutableMarketData)"})
  void testCombinedWithWithImmutableMarketData2() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData ofResult = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act
    ImmutableMarketData actualCombinedWithResult =
        ofResult.combinedWith(ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Assert
    verify(marketDataId).getMarketDataType();
    assertEquals(ofResult, actualCombinedWithResult);
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(ImmutableMarketData)} with {@code
   * ImmutableMarketData}.
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(ImmutableMarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(ImmutableMarketData) with 'ImmutableMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.combinedWith(ImmutableMarketData)"})
  void testCombinedWithWithImmutableMarketData3() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");
    ImmutableMarketData ofResult = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act
    ImmutableMarketData actualCombinedWithResult =
        ofResult.combinedWith(ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertEquals(ofResult, actualCombinedWithResult);
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(ImmutableMarketData)} with {@code
   * ImmutableMarketData}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link MarketDataId} is {@link Integer#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(ImmutableMarketData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ImmutableMarketData) with 'ImmutableMarketData'; given HashMap() MarketDataId is MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.combinedWith(ImmutableMarketData)"})
  void testCombinedWithWithImmutableMarketData_givenHashMapMarketDataIdIsMin_value() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, Integer.MIN_VALUE);
    values.put(marketDataId, "Value");
    ImmutableMarketData ofResult = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);

    MarketDataId<Object> marketDataId3 = mock(MarketDataId.class);
    Class<Object> forNameResult3 = Object.class;
    when(marketDataId3.getMarketDataType()).thenReturn(forNameResult3);

    HashMap<MarketDataId<?>, Object> values2 = new HashMap<>();
    values2.put(marketDataId3, "Value");

    // Act
    ImmutableMarketData actualCombinedWithResult =
        ofResult.combinedWith(ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values2));

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    verify(marketDataId3).getMarketDataType();
    assertEquals(3, actualCombinedWithResult.getValues().size());
    assertEquals(3, actualCombinedWithResult.getIds().size());
    assertTrue(actualCombinedWithResult.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(ImmutableMarketData)} with {@code
   * ImmutableMarketData}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>Then return Values size is three.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(ImmutableMarketData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ImmutableMarketData) with 'ImmutableMarketData'; given 'Value'; then return Values size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketData.combinedWith(ImmutableMarketData)"})
  void testCombinedWithWithImmutableMarketData_givenValue_thenReturnValuesSizeIsThree() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");
    ImmutableMarketData ofResult = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);

    MarketDataId<Object> marketDataId3 = mock(MarketDataId.class);
    Class<Object> forNameResult3 = Object.class;
    when(marketDataId3.getMarketDataType()).thenReturn(forNameResult3);

    HashMap<MarketDataId<?>, Object> values2 = new HashMap<>();
    values2.put(marketDataId3, "Value");

    // Act
    ImmutableMarketData actualCombinedWithResult =
        ofResult.combinedWith(ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values2));

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    verify(marketDataId3).getMarketDataType();
    assertEquals(3, actualCombinedWithResult.getValues().size());
    assertEquals(3, actualCombinedWithResult.getIds().size());
    assertTrue(actualCombinedWithResult.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(MarketData)} with {@code MarketData}.
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData) with 'MarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData ImmutableMarketData.combinedWith(MarketData)"})
  void testCombinedWithWithMarketData() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData ofResult = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData other =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act
    MarketData actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof CombinedMarketData);
    assertTrue(
        ((CombinedMarketData) actualCombinedWithResult).getUnderlying1()
            instanceof ImmutableMarketData);
    assertSame(other, ((CombinedMarketData) actualCombinedWithResult).getUnderlying2());
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(MarketData)} with {@code MarketData}.
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData) with 'MarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData ImmutableMarketData.combinedWith(MarketData)"})
  void testCombinedWithWithMarketData2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData ofResult = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate3, new HashMap<>()));
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData other =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    // Act
    MarketData actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof CombinedMarketData);
    assertTrue(
        ((CombinedMarketData) actualCombinedWithResult).getUnderlying1()
            instanceof ImmutableMarketData);
    assertSame(other, ((CombinedMarketData) actualCombinedWithResult).getUnderlying2());
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(MarketData)} with {@code MarketData}.
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData) with 'MarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData ImmutableMarketData.combinedWith(MarketData)"})
  void testCombinedWithWithMarketData3() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();

    ImmutableMarketData immutableMarketData =
        new ImmutableMarketData(valuationDate, values, new HashMap<>());

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values2 = new HashMap<>();
    values2.put(marketDataId, "Value");
    ImmutableMarketData other = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values2);

    // Act
    MarketData actualCombinedWithResult = immutableMarketData.combinedWith((MarketData) other);

    // Assert
    verify(marketDataId).getMarketDataType();
    assertTrue(actualCombinedWithResult instanceof ImmutableMarketData);
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(MarketData)} with {@code MarketData}.
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData) with 'MarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData ImmutableMarketData.combinedWith(MarketData)"})
  void testCombinedWithWithMarketData4() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();

    ImmutableMarketData immutableMarketData =
        new ImmutableMarketData(valuationDate, values, new HashMap<>());
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> other = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    MarketData actualCombinedWithResult = immutableMarketData.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof CombinedMarketData);
    assertTrue(
        ((CombinedMarketData) actualCombinedWithResult).getUnderlying1()
            instanceof ImmutableMarketData);
    assertSame(other, ((CombinedMarketData) actualCombinedWithResult).getUnderlying2());
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(MarketData)} with {@code MarketData}.
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData) with 'MarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData ImmutableMarketData.combinedWith(MarketData)"})
  void testCombinedWithWithMarketData5() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();

    ImmutableMarketData immutableMarketData =
        new ImmutableMarketData(valuationDate, values, new HashMap<>());
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> other =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act
    MarketData actualCombinedWithResult = immutableMarketData.combinedWith(other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof CombinedMarketData);
    assertTrue(
        ((CombinedMarketData) actualCombinedWithResult).getUnderlying1()
            instanceof ImmutableMarketData);
    assertSame(other, ((CombinedMarketData) actualCombinedWithResult).getUnderlying2());
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(MarketData)} with {@code MarketData}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} IfAbsent {@link MarketDataId} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(MarketData) with 'MarketData'; given HashMap() IfAbsent MarketDataId is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData ImmutableMarketData.combinedWith(MarketData)"})
  void testCombinedWithWithMarketData_givenHashMapIfAbsentMarketDataIdIsValue() {
    // Arrange
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.putIfAbsent(mock(MarketDataId.class), "Value");
    values.put(mock(MarketDataId.class), "Value");
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();

    ImmutableMarketData immutableMarketData =
        new ImmutableMarketData(valuationDate, values, timeSeries);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act
    MarketData actualCombinedWithResult =
        immutableMarketData.combinedWith(
            (MarketData) ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Assert
    assertTrue(actualCombinedWithResult instanceof ImmutableMarketData);
    assertEquals(2, ((ImmutableMarketData) actualCombinedWithResult).getValues().size());
    assertEquals(2, actualCombinedWithResult.getIds().size());
    assertTrue(actualCombinedWithResult.getTimeSeriesIds().isEmpty());
    assertEquals(timeSeries, ((ImmutableMarketData) actualCombinedWithResult).getTimeSeries());
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(MarketData)} with {@code MarketData}.
   *
   * <ul>
   *   <li>Then return Ids Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData) with 'MarketData'; then return Ids Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData ImmutableMarketData.combinedWith(MarketData)"})
  void testCombinedWithWithMarketData_thenReturnIdsEmpty() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();

    ImmutableMarketData immutableMarketData =
        new ImmutableMarketData(valuationDate, values, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act
    MarketData actualCombinedWithResult =
        immutableMarketData.combinedWith(
            (MarketData) ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Assert
    assertTrue(actualCombinedWithResult instanceof ImmutableMarketData);
    Set<MarketDataId<?>> ids = actualCombinedWithResult.getIds();
    assertTrue(ids.isEmpty());
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        ((ImmutableMarketData) actualCombinedWithResult).getTimeSeries();
    assertEquals(values, timeSeries);
    assertSame(timeSeries, ((ImmutableMarketData) actualCombinedWithResult).getValues());
    assertSame(ids, actualCombinedWithResult.getTimeSeriesIds());
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(MarketData)} with {@code MarketData}.
   *
   * <ul>
   *   <li>Then return TimeSeries size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(MarketData) with 'MarketData'; then return TimeSeries size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData ImmutableMarketData.combinedWith(MarketData)"})
  void testCombinedWithWithMarketData_thenReturnTimeSeriesSizeIsOne() {
    // Arrange
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    ImmutableMarketData immutableMarketData =
        new ImmutableMarketData(valuationDate, new HashMap<>(), timeSeries);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act
    MarketData actualCombinedWithResult =
        immutableMarketData.combinedWith(
            (MarketData) ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Assert
    assertTrue(actualCombinedWithResult instanceof ImmutableMarketData);
    assertEquals(1, ((ImmutableMarketData) actualCombinedWithResult).getTimeSeries().size());
    assertEquals(1, actualCombinedWithResult.getTimeSeriesIds().size());
    assertTrue(((ImmutableMarketData) actualCombinedWithResult).getValues().isEmpty());
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(MarketData)} with {@code MarketData}.
   *
   * <ul>
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData) with 'MarketData'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData ImmutableMarketData.combinedWith(MarketData)"})
  void testCombinedWithWithMarketData_thenReturnValuesSizeIsOne() {
    // Arrange
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(mock(MarketDataId.class), "Value");
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();

    ImmutableMarketData immutableMarketData =
        new ImmutableMarketData(valuationDate, values, timeSeries);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act
    MarketData actualCombinedWithResult =
        immutableMarketData.combinedWith(
            (MarketData) ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Assert
    assertTrue(actualCombinedWithResult instanceof ImmutableMarketData);
    assertEquals(1, ((ImmutableMarketData) actualCombinedWithResult).getValues().size());
    assertEquals(1, actualCombinedWithResult.getIds().size());
    assertTrue(actualCombinedWithResult.getTimeSeriesIds().isEmpty());
    assertEquals(timeSeries, ((ImmutableMarketData) actualCombinedWithResult).getTimeSeries());
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(MarketData)} with {@code MarketData}.
   *
   * <ul>
   *   <li>Then return Values size is three.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData) with 'MarketData'; then return Values size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData ImmutableMarketData.combinedWith(MarketData)"})
  void testCombinedWithWithMarketData_thenReturnValuesSizeIsThree() {
    // Arrange
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.putIfAbsent(mock(MarketDataId.class), "foo");
    values.put(mock(MarketDataId.class), "Value");
    values.put(mock(MarketDataId.class), "Value");
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();

    ImmutableMarketData immutableMarketData =
        new ImmutableMarketData(valuationDate, values, timeSeries);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act
    MarketData actualCombinedWithResult =
        immutableMarketData.combinedWith(
            (MarketData) ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Assert
    assertTrue(actualCombinedWithResult instanceof ImmutableMarketData);
    assertEquals(3, ((ImmutableMarketData) actualCombinedWithResult).getValues().size());
    assertEquals(3, actualCombinedWithResult.getIds().size());
    assertTrue(actualCombinedWithResult.getTimeSeriesIds().isEmpty());
    assertEquals(timeSeries, ((ImmutableMarketData) actualCombinedWithResult).getTimeSeries());
  }

  /**
   * Test {@link ImmutableMarketData#combinedWith(MarketData)} with {@code MarketData}.
   *
   * <ul>
   *   <li>Then return Values size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData) with 'MarketData'; then return Values size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData ImmutableMarketData.combinedWith(MarketData)"})
  void testCombinedWithWithMarketData_thenReturnValuesSizeIsTwo() {
    // Arrange
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(mock(MarketDataId.class), "Value");
    values.put(mock(MarketDataId.class), "Value");
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();

    ImmutableMarketData immutableMarketData =
        new ImmutableMarketData(valuationDate, values, timeSeries);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act
    MarketData actualCombinedWithResult =
        immutableMarketData.combinedWith(
            (MarketData) ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Assert
    assertTrue(actualCombinedWithResult instanceof ImmutableMarketData);
    assertEquals(2, ((ImmutableMarketData) actualCombinedWithResult).getValues().size());
    assertEquals(2, actualCombinedWithResult.getIds().size());
    assertTrue(actualCombinedWithResult.getTimeSeriesIds().isEmpty());
    assertEquals(timeSeries, ((ImmutableMarketData) actualCombinedWithResult).getTimeSeries());
  }

  /**
   * Test {@link ImmutableMarketData#getValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link MarketDataId}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test getValue(MarketDataId); given 'java.lang.Object'; when MarketDataId; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ImmutableMarketData.getValue(MarketDataId)"})
  void testGetValue_givenJavaLangObject_whenMarketDataId_thenCallsGetMarketDataType() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act and Assert
    assertThrows(
        MarketDataNotFoundException.class,
        () ->
            ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values)
                .getValue(mock(MarketDataId.class)));
    verify(marketDataId).getMarketDataType();
  }

  /**
   * Test {@link ImmutableMarketData#getValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@link MarketDataId}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test getValue(MarketDataId); given 'java.lang.Object'; when MarketDataId; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ImmutableMarketData.getValue(MarketDataId)"})
  void testGetValue_givenJavaLangObject_whenMarketDataId_thenCallsGetMarketDataType2() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act and Assert
    assertThrows(
        MarketDataNotFoundException.class,
        () ->
            ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values)
                .getValue(mock(MarketDataId.class)));
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
  }

  /**
   * Test {@link ImmutableMarketData#getValue(MarketDataId)}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test getValue(MarketDataId); when MarketDataId; then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ImmutableMarketData.getValue(MarketDataId)"})
  void testGetValue_whenMarketDataId_thenThrowMarketDataNotFoundException() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertThrows(
        MarketDataNotFoundException.class,
        () ->
            ImmutableMarketData.of(valuationDate, new HashMap<>())
                .getValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ImmutableMarketData#findValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMarketData} with valuationDate is now and values is {@link
   *       HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test findValue(MarketDataId); given ImmutableMarketData with valuationDate is now and values is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ImmutableMarketData.findValue(MarketDataId)"})
  void testFindValue_givenImmutableMarketDataWithValuationDateIsNowAndValuesIsHashMap() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act
    Optional<Object> actualFindValueResult =
        ImmutableMarketData.of(LocalDate.now(), values).findValue(mock(MarketDataId.class));

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link ImmutableMarketData#findValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test findValue(MarketDataId); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ImmutableMarketData.findValue(MarketDataId)"})
  void testFindValue_givenJavaLangObject_thenCallsGetMarketDataType() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act
    Optional<Object> actualFindValueResult =
        ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values)
            .findValue(mock(MarketDataId.class));

    // Assert
    verify(marketDataId).getMarketDataType();
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link ImmutableMarketData#findValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test findValue(MarketDataId); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ImmutableMarketData.findValue(MarketDataId)"})
  void testFindValue_givenJavaLangObject_thenCallsGetMarketDataType2() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act
    Optional<Object> actualFindValueResult =
        ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values)
            .findValue(mock(MarketDataId.class));

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link ImmutableMarketData#findValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId); given LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ImmutableMarketData.findValue(MarketDataId)"})
  void testFindValue_givenLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertFalse(
        ImmutableMarketData.of(valuationDate, new HashMap<>())
            .findValue(mock(MarketDataId.class))
            .isPresent());
  }

  /**
   * Test {@link ImmutableMarketData#getIds()}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); given 'java.lang.Object'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ImmutableMarketData.getIds()"})
  void testGetIds_givenJavaLangObject_thenReturnSizeIsOne() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act
    Set<MarketDataId<?>> actualIds =
        ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values).getIds();

    // Assert
    verify(marketDataId).getMarketDataType();
    assertEquals(1, actualIds.size());
  }

  /**
   * Test {@link ImmutableMarketData#getIds()}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); given 'java.lang.Object'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ImmutableMarketData.getIds()"})
  void testGetIds_givenJavaLangObject_thenReturnSizeIsTwo() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act
    Set<MarketDataId<?>> actualIds =
        ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values).getIds();

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertEquals(2, actualIds.size());
  }

  /**
   * Test {@link ImmutableMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ImmutableMarketData.getIds()"})
  void testGetIds_thenReturnEmpty() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertTrue(ImmutableMarketData.of(valuationDate, new HashMap<>()).getIds().isEmpty());
  }

  /**
   * Test {@link ImmutableMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link ImmutableMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ImmutableMarketData.findIds(MarketDataName)"})
  void testFindIds() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertTrue(
        ImmutableMarketData.of(valuationDate, new HashMap<>())
            .findIds(mock(MarketDataName.class))
            .isEmpty());
  }

  /**
   * Test {@link ImmutableMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findIds(MarketDataName); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ImmutableMarketData.findIds(MarketDataName)"})
  void testFindIds_givenJavaLangObject_thenCallsGetMarketDataType() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult =
        ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values)
            .findIds(mock(MarketDataName.class));

    // Assert
    verify(marketDataId).getMarketDataType();
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link ImmutableMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findIds(MarketDataName); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ImmutableMarketData.findIds(MarketDataName)"})
  void testFindIds_givenJavaLangObject_thenCallsGetMarketDataType2() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult =
        ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values)
            .findIds(mock(MarketDataName.class));

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link ImmutableMarketData#getTimeSeriesIds()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ImmutableMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds_thenReturnEmpty() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertTrue(ImmutableMarketData.of(valuationDate, new HashMap<>()).getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link ImmutableMarketData#getTimeSeriesIds()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ImmutableMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds_thenReturnSizeIsOne() {
    // Arrange
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    ImmutableMarketData immutableMarketData =
        new ImmutableMarketData(valuationDate, new HashMap<>(), timeSeries);

    // Act and Assert
    assertEquals(1, immutableMarketData.getTimeSeriesIds().size());
  }

  /**
   * Test {@link ImmutableMarketData#getTimeSeriesIds()}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds(); then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ImmutableMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds_thenReturnSizeIsTwo() {
    // Arrange
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("Id"), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    ImmutableMarketData immutableMarketData =
        new ImmutableMarketData(valuationDate, new HashMap<>(), timeSeries);

    // Act and Assert
    assertEquals(2, immutableMarketData.getTimeSeriesIds().size());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableMarketData#toString()}
   *   <li>{@link ImmutableMarketData#getTimeSeries()}
   *   <li>{@link ImmutableMarketData#getValuationDate()}
   *   <li>{@link ImmutableMarketData#getValues()}
   *   <li>{@link ImmutableMarketData#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap ImmutableMarketData.getTimeSeries()",
    "LocalDate ImmutableMarketData.getValuationDate()",
    "ImmutableMap ImmutableMarketData.getValues()",
    "ImmutableMarketDataBuilder ImmutableMarketData.toBuilder()",
    "String ImmutableMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData ofResult = ImmutableMarketData.of(valuationDate, new HashMap<>());

    // Act
    String actualToStringResult = ofResult.toString();
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> actualTimeSeries =
        ofResult.getTimeSeries();
    LocalDate actualValuationDate = ofResult.getValuationDate();
    ImmutableMap<MarketDataId<?>, Object> actualValues = ofResult.getValues();
    ofResult.toBuilder();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertEquals(
        "ImmutableMarketData{valuationDate=1970-01-01, values={}, timeSeries={}}",
        actualToStringResult);
    assertSame(actualTimeSeries, actualValues);
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link ImmutableMarketData#meta()}.
   *
   * <p>Method under test: {@link ImmutableMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableMarketData.meta();

    // Assert
    MetaProperty<ImmutableMap<ObservableId, LocalDateDoubleTimeSeries>> timeSeriesResult =
        actualMetaResult.timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = actualMetaResult.valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<MarketDataId<?>, Object>> valuesResult = actualMetaResult.values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("timeSeries", timeSeriesResult.name());
    assertEquals("valuationDate", valuationDateResult.name());
    assertEquals("values", valuesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, timeSeriesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valuationDateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valuesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, timeSeriesResult.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, valuesResult.propertyType());
    Class<ImmutableMarketData> expectedDeclaringTypeResult = ImmutableMarketData.class;
    assertEquals(expectedDeclaringTypeResult, timeSeriesResult.declaringType());
    Class<ImmutableMarketData> expectedDeclaringTypeResult2 = ImmutableMarketData.class;
    assertEquals(expectedDeclaringTypeResult2, valuationDateResult.declaringType());
    Class<ImmutableMarketData> expectedDeclaringTypeResult3 = ImmutableMarketData.class;
    assertEquals(expectedDeclaringTypeResult3, valuesResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, valuationDateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, timeSeriesResult.metaBean());
    assertSame(meta, valuationDateResult.metaBean());
    assertSame(meta, valuesResult.metaBean());
  }

  /**
   * Test {@link ImmutableMarketData#ImmutableMarketData(LocalDate, Map, Map)}.
   *
   * <ul>
   *   <li>Given {@link MarketDataId}.
   *   <li>Then return Ids size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#ImmutableMarketData(LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableMarketData(LocalDate, Map, Map); given MarketDataId; then return Ids size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableMarketData.<init>(LocalDate, Map, Map)"})
  void testNewImmutableMarketData_givenMarketDataId_thenReturnIdsSizeIsOne() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(mock(MarketDataId.class), "Value");
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();

    // Act
    ImmutableMarketData actualImmutableMarketData =
        new ImmutableMarketData(valuationDate, values, timeSeries);

    // Assert
    assertEquals(1, actualImmutableMarketData.getIds().size());
    assertTrue(actualImmutableMarketData.getTimeSeriesIds().isEmpty());
    assertEquals(timeSeries, actualImmutableMarketData.getTimeSeries());
    assertEquals(values, actualImmutableMarketData.getValues());
  }

  /**
   * Test {@link ImmutableMarketData#ImmutableMarketData(LocalDate, Map, Map)}.
   *
   * <ul>
   *   <li>Given {@link MarketDataId}.
   *   <li>Then return Ids size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#ImmutableMarketData(LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableMarketData(LocalDate, Map, Map); given MarketDataId; then return Ids size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableMarketData.<init>(LocalDate, Map, Map)"})
  void testNewImmutableMarketData_givenMarketDataId_thenReturnIdsSizeIsTwo() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(mock(MarketDataId.class), "Value");
    values.put(mock(MarketDataId.class), "Value");
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();

    // Act
    ImmutableMarketData actualImmutableMarketData =
        new ImmutableMarketData(valuationDate, values, timeSeries);

    // Assert
    assertEquals(2, actualImmutableMarketData.getIds().size());
    assertTrue(actualImmutableMarketData.getTimeSeriesIds().isEmpty());
    assertEquals(timeSeries, actualImmutableMarketData.getTimeSeries());
    assertEquals(values, actualImmutableMarketData.getValues());
  }

  /**
   * Test {@link ImmutableMarketData#ImmutableMarketData(LocalDate, Map, Map)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return Ids size is three.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#ImmutableMarketData(LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableMarketData(LocalDate, Map, Map); given one; then return Ids size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableMarketData.<init>(LocalDate, Map, Map)"})
  void testNewImmutableMarketData_givenOne_thenReturnIdsSizeIsThree() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.putIfAbsent(mock(MarketDataId.class), 1);
    values.put(mock(MarketDataId.class), "Value");
    values.put(mock(MarketDataId.class), "Value");
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();

    // Act
    ImmutableMarketData actualImmutableMarketData =
        new ImmutableMarketData(valuationDate, values, timeSeries);

    // Assert
    assertEquals(3, actualImmutableMarketData.getIds().size());
    assertTrue(actualImmutableMarketData.getTimeSeriesIds().isEmpty());
    assertEquals(timeSeries, actualImmutableMarketData.getTimeSeries());
    assertEquals(values, actualImmutableMarketData.getValues());
  }

  /**
   * Test {@link ImmutableMarketData#ImmutableMarketData(LocalDate, Map, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} IfAbsent {@link MarketDataId} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#ImmutableMarketData(LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableMarketData(LocalDate, Map, Map); when HashMap() IfAbsent MarketDataId is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableMarketData.<init>(LocalDate, Map, Map)"})
  void testNewImmutableMarketData_whenHashMapIfAbsentMarketDataIdIsValue() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.putIfAbsent(mock(MarketDataId.class), "Value");
    values.put(mock(MarketDataId.class), "Value");
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();

    // Act
    ImmutableMarketData actualImmutableMarketData =
        new ImmutableMarketData(valuationDate, values, timeSeries);

    // Assert
    assertEquals(2, actualImmutableMarketData.getIds().size());
    assertTrue(actualImmutableMarketData.getTimeSeriesIds().isEmpty());
    assertEquals(timeSeries, actualImmutableMarketData.getTimeSeries());
    assertEquals(values, actualImmutableMarketData.getValues());
  }

  /**
   * Test {@link ImmutableMarketData#ImmutableMarketData(LocalDate, Map, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return TimeSeries Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#ImmutableMarketData(LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableMarketData(LocalDate, Map, Map); when HashMap(); then return TimeSeries Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableMarketData.<init>(LocalDate, Map, Map)"})
  void testNewImmutableMarketData_whenHashMap_thenReturnTimeSeriesEmpty() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();

    // Act
    ImmutableMarketData actualImmutableMarketData =
        new ImmutableMarketData(valuationDate, values, new HashMap<>());

    // Assert
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        actualImmutableMarketData.getTimeSeries();
    assertTrue(timeSeries.isEmpty());
    Set<MarketDataId<?>> ids = actualImmutableMarketData.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, actualImmutableMarketData.getTimeSeriesIds());
    assertSame(timeSeries, actualImmutableMarketData.getValues());
  }

  /**
   * Test {@link ImmutableMarketData#metaBean()}.
   *
   * <p>Method under test: {@link ImmutableMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertSame(Meta.INSTANCE, ImmutableMarketData.of(valuationDate, new HashMap<>()).metaBean());
  }

  /**
   * Test {@link ImmutableMarketData#equals(Object)}, and {@link ImmutableMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableMarketData#equals(Object)}
   *   <li>{@link ImmutableMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableMarketData.equals(Object)",
    "int ImmutableMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData ofResult = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData ofResult2 = ImmutableMarketData.of(valuationDate2, new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link ImmutableMarketData#equals(Object)}, and {@link ImmutableMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableMarketData#equals(Object)}
   *   <li>{@link ImmutableMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableMarketData.equals(Object)",
    "int ImmutableMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData ofResult = ImmutableMarketData.of(valuationDate, new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link ImmutableMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableMarketData.equals(Object)",
    "int ImmutableMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(ImmutableMarketData.of(valuationDate, new HashMap<>()), 1);
  }

  /**
   * Test {@link ImmutableMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableMarketData.equals(Object)",
    "int ImmutableMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LocalDate valuationDate = LocalDate.now();
    ImmutableMarketData ofResult = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(ofResult, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
  }

  /**
   * Test {@link ImmutableMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableMarketData.equals(Object)",
    "int ImmutableMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData ofResult = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(ofResult, ImmutableMarketData.of(valuationDate, new HashMap<>()));
  }

  /**
   * Test {@link ImmutableMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableMarketData.equals(Object)",
    "int ImmutableMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(ImmutableMarketData.of(valuationDate, new HashMap<>()), null);
  }

  /**
   * Test {@link ImmutableMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableMarketData.equals(Object)",
    "int ImmutableMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(
        ImmutableMarketData.of(valuationDate, new HashMap<>()),
        "Different type to ImmutableMarketData");
  }
}
