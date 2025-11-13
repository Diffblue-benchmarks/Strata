package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.data.MarketDataNotFoundException;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.data.TestingObservableId;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData.Meta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableScenarioMarketDataDiffblueTest {
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
    Class<? extends ImmutableScenarioMarketData> actualBeanTypeResult =
        ImmutableScenarioMarketData.meta().beanType();

    // Assert
    Class<ImmutableScenarioMarketData> expectedBeanTypeResult = ImmutableScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#scenarioCount()}
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
    "MetaProperty Meta.scenarioCount()",
    "MetaProperty Meta.timeSeries()",
    "MetaProperty Meta.valuationDate()",
    "MetaProperty Meta.values()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableScenarioMarketData.meta();

    // Act
    MetaProperty<Integer> actualScenarioCountResult = metaResult.scenarioCount();
    MetaProperty<ImmutableMap<ObservableId, LocalDateDoubleTimeSeries>> actualTimeSeriesResult =
        metaResult.timeSeries();
    MetaProperty<MarketDataBox<LocalDate>> actualValuationDateResult = metaResult.valuationDate();

    // Assert
    assertTrue(actualScenarioCountResult instanceof DirectMetaProperty);
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
    assertNull(ImmutableScenarioMarketData.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code scenarioCount}.
   *   <li>Then return propertyType Name is {@code int}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'scenarioCount'; then return propertyType Name is 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenScenarioCount_thenReturnPropertyTypeNameIsInt() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableScenarioMarketData.meta().metaPropertyGet("scenarioCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<ObservableId, LocalDateDoubleTimeSeries>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    MetaProperty<MarketDataBox<LocalDate>> valuationDateResult =
        ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<MarketDataId<?>, MarketDataBox<?>>> valuesResult =
        ((Meta) metaBeanResult).values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("scenarioCount", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).scenarioCount());
    assertSame(metaBeanResult, timeSeriesResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
    assertSame(metaBeanResult, valuesResult.metaBean());
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
        ImmutableScenarioMarketData.meta().metaPropertyGet("timeSeries");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> scenarioCountResult = ((Meta) metaBeanResult).scenarioCount();
    assertTrue(scenarioCountResult instanceof DirectMetaProperty);
    MetaProperty<MarketDataBox<LocalDate>> valuationDateResult =
        ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<MarketDataId<?>, MarketDataBox<?>>> valuesResult =
        ((Meta) metaBeanResult).values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("timeSeries", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeSeries());
    assertSame(metaBeanResult, scenarioCountResult.metaBean());
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
        ImmutableScenarioMarketData.meta().metaPropertyGet("valuationDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> scenarioCountResult = ((Meta) metaBeanResult).scenarioCount();
    assertTrue(scenarioCountResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<ObservableId, LocalDateDoubleTimeSeries>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<MarketDataId<?>, MarketDataBox<?>>> valuesResult =
        ((Meta) metaBeanResult).values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("valuationDate", actualMetaPropertyGetResult.name());
    Class<MarketDataBox> expectedPropertyTypeResult = MarketDataBox.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDate());
    assertSame(metaBeanResult, scenarioCountResult.metaBean());
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
        ImmutableScenarioMarketData.meta().metaPropertyGet("values");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> scenarioCountResult = ((Meta) metaBeanResult).scenarioCount();
    assertTrue(scenarioCountResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<ObservableId, LocalDateDoubleTimeSeries>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    MetaProperty<MarketDataBox<LocalDate>> valuationDateResult =
        ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("values", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).values());
    assertSame(metaBeanResult, scenarioCountResult.metaBean());
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
        ImmutableScenarioMarketData.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("scenarioCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("timeSeries") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("valuationDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("values") instanceof DirectMetaProperty);
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
    assertNull(
        ImmutableScenarioMarketData.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = ImmutableScenarioMarketData.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(ImmutableScenarioMarketData.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code scenarioCount}.
   *   <li>Then return intValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'scenarioCount'; then return intValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenScenarioCount_thenReturnIntValueIsZero() {
    // Arrange
    Meta metaResult = ImmutableScenarioMarketData.meta();

    // Act and Assert
    assertEquals(
        0,
        ((Integer)
                metaResult.propertyGet(ImmutableScenarioMarketData.empty(), "scenarioCount", true))
            .intValue());
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
    Meta metaResult = ImmutableScenarioMarketData.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(ImmutableScenarioMarketData.empty(), "timeSeries", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return {@link EmptyMarketDataBox}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'valuationDate'; then return EmptyMarketDataBox")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValuationDate_thenReturnEmptyMarketDataBox() {
    // Arrange
    Meta metaResult = ImmutableScenarioMarketData.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(ImmutableScenarioMarketData.empty(), "valuationDate", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof EmptyMarketDataBox);
    assertEquals(0, ((EmptyMarketDataBox) actualPropertyGetResult).getScenarioCount());
    assertFalse(((EmptyMarketDataBox) actualPropertyGetResult).isScenarioValue());
    assertTrue(((EmptyMarketDataBox) actualPropertyGetResult).isSingleValue());
    Class<Void> expectedMarketDataType = Void.class;
    assertEquals(
        expectedMarketDataType, ((EmptyMarketDataBox) actualPropertyGetResult).getMarketDataType());
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
    Meta metaResult = ImmutableScenarioMarketData.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(ImmutableScenarioMarketData.empty(), "values", true);

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
            ImmutableScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "scenarioCount", "New Value", false));
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
            ImmutableScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code scenarioCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'scenarioCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenScenarioCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "scenarioCount", "New Value", true));
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
            ImmutableScenarioMarketData.meta()
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
            ImmutableScenarioMarketData.meta()
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
            ImmutableScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "values", "New Value", true));
  }

  /**
   * Test {@link ImmutableScenarioMarketData#of(int, LocalDate, Map, Map)} with {@code int}, {@code
   * LocalDate}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>Given {@link TestingObservableId#TestingObservableId(String)} with id is {@code
   *       scenarioCount}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#of(int, LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, LocalDate, Map, Map) with 'int', 'LocalDate', 'Map', 'Map'; given TestingObservableId(String) with id is 'scenarioCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketData ImmutableScenarioMarketData.of(int, LocalDate, Map, Map)"
  })
  void testOfWithIntLocalDateMapMap_givenTestingObservableIdWithIdIsScenarioCount() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("Id"), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(new TestingObservableId("scenarioCount"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ImmutableScenarioMarketData actualOfResult =
        ImmutableScenarioMarketData.of(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(actualOfResult.getValuationDate() instanceof SingleMarketDataBox);
    assertEquals(2, actualOfResult.getTimeSeriesIds().size());
    assertEquals(3, actualOfResult.getScenarioCount());
    assertEquals(timeSeries, actualOfResult.getTimeSeries());
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#of(int, LocalDate, Map, Map)} with {@code int}, {@code
   * LocalDate}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIds size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#of(int, LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, LocalDate, Map, Map) with 'int', 'LocalDate', 'Map', 'Map'; then return TimeSeriesIds size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketData ImmutableScenarioMarketData.of(int, LocalDate, Map, Map)"
  })
  void testOfWithIntLocalDateMapMap_thenReturnTimeSeriesIdsSizeIsOne() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ImmutableScenarioMarketData actualOfResult =
        ImmutableScenarioMarketData.of(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(actualOfResult.getValuationDate() instanceof SingleMarketDataBox);
    assertEquals(1, actualOfResult.getTimeSeriesIds().size());
    assertEquals(3, actualOfResult.getScenarioCount());
    assertEquals(timeSeries, actualOfResult.getTimeSeries());
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#of(int, LocalDate, Map, Map)} with {@code int}, {@code
   * LocalDate}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIds size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#of(int, LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, LocalDate, Map, Map) with 'int', 'LocalDate', 'Map', 'Map'; then return TimeSeriesIds size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketData ImmutableScenarioMarketData.of(int, LocalDate, Map, Map)"
  })
  void testOfWithIntLocalDateMapMap_thenReturnTimeSeriesIdsSizeIsTwo() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("Id"), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ImmutableScenarioMarketData actualOfResult =
        ImmutableScenarioMarketData.of(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(actualOfResult.getValuationDate() instanceof SingleMarketDataBox);
    assertEquals(2, actualOfResult.getTimeSeriesIds().size());
    assertEquals(3, actualOfResult.getScenarioCount());
    assertEquals(timeSeries, actualOfResult.getTimeSeries());
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#of(int, LocalDate, Map, Map)} with {@code int}, {@code
   * LocalDate}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return TimeSeries Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#of(int, LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, LocalDate, Map, Map) with 'int', 'LocalDate', 'Map', 'Map'; when three; then return TimeSeries Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketData ImmutableScenarioMarketData.of(int, LocalDate, Map, Map)"
  })
  void testOfWithIntLocalDateMapMap_whenThree_thenReturnTimeSeriesEmpty() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    // Act
    ImmutableScenarioMarketData actualOfResult =
        ImmutableScenarioMarketData.of(3, valuationDate, values, new HashMap<>());

    // Assert
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        actualOfResult.getTimeSeries();
    assertTrue(timeSeries.isEmpty());
    assertSame(timeSeries, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#of(int, MarketDataBox, Map, Map)} with {@code int},
   * {@code MarketDataBox}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>Given {@link TestingObservableId#TestingObservableId(String)} with id is {@code
   *       scenarioCount}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#of(int, MarketDataBox, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, MarketDataBox, Map, Map) with 'int', 'MarketDataBox', 'Map', 'Map'; given TestingObservableId(String) with id is 'scenarioCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketData ImmutableScenarioMarketData.of(int, MarketDataBox, Map, Map)"
  })
  void testOfWithIntMarketDataBoxMapMap_givenTestingObservableIdWithIdIsScenarioCount() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("Id"), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(new TestingObservableId("scenarioCount"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ImmutableScenarioMarketData actualOfResult =
        ImmutableScenarioMarketData.of(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(actualOfResult.getValuationDate() instanceof ScenarioMarketDataBox);
    assertEquals(2, actualOfResult.getTimeSeriesIds().size());
    assertEquals(3, actualOfResult.getScenarioCount());
    assertEquals(timeSeries, actualOfResult.getTimeSeries());
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#of(int, MarketDataBox, Map, Map)} with {@code int},
   * {@code MarketDataBox}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIds size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#of(int, MarketDataBox, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, MarketDataBox, Map, Map) with 'int', 'MarketDataBox', 'Map', 'Map'; then return TimeSeriesIds size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketData ImmutableScenarioMarketData.of(int, MarketDataBox, Map, Map)"
  })
  void testOfWithIntMarketDataBoxMapMap_thenReturnTimeSeriesIdsSizeIsOne() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ImmutableScenarioMarketData actualOfResult =
        ImmutableScenarioMarketData.of(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(actualOfResult.getValuationDate() instanceof ScenarioMarketDataBox);
    assertEquals(1, actualOfResult.getTimeSeriesIds().size());
    assertEquals(3, actualOfResult.getScenarioCount());
    assertEquals(timeSeries, actualOfResult.getTimeSeries());
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#of(int, MarketDataBox, Map, Map)} with {@code int},
   * {@code MarketDataBox}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIds size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#of(int, MarketDataBox, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, MarketDataBox, Map, Map) with 'int', 'MarketDataBox', 'Map', 'Map'; then return TimeSeriesIds size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketData ImmutableScenarioMarketData.of(int, MarketDataBox, Map, Map)"
  })
  void testOfWithIntMarketDataBoxMapMap_thenReturnTimeSeriesIdsSizeIsTwo() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("Id"), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ImmutableScenarioMarketData actualOfResult =
        ImmutableScenarioMarketData.of(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(actualOfResult.getValuationDate() instanceof ScenarioMarketDataBox);
    assertEquals(2, actualOfResult.getTimeSeriesIds().size());
    assertEquals(3, actualOfResult.getScenarioCount());
    assertEquals(timeSeries, actualOfResult.getTimeSeries());
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#of(int, MarketDataBox, Map, Map)} with {@code int},
   * {@code MarketDataBox}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return TimeSeries Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#of(int, MarketDataBox, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, MarketDataBox, Map, Map) with 'int', 'MarketDataBox', 'Map', 'Map'; when three; then return TimeSeries Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketData ImmutableScenarioMarketData.of(int, MarketDataBox, Map, Map)"
  })
  void testOfWithIntMarketDataBoxMapMap_whenThree_thenReturnTimeSeriesEmpty() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    // Act
    ImmutableScenarioMarketData actualOfResult =
        ImmutableScenarioMarketData.of(3, valuationDate, values, new HashMap<>());

    // Assert
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        actualOfResult.getTimeSeries();
    assertTrue(timeSeries.isEmpty());
    assertSame(timeSeries, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#checkType(MarketDataId, MarketDataBox, int)}.
   *
   * <ul>
   *   <li>When {@link EmptyMarketDataBox} (default constructor).
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#checkType(MarketDataId, MarketDataBox,
   * int)}
   */
  @Test
  @DisplayName(
      "Test checkType(MarketDataId, MarketDataBox, int); when EmptyMarketDataBox (default constructor); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImmutableScenarioMarketData.checkType(MarketDataId, MarketDataBox, int)"
  })
  void testCheckType_whenEmptyMarketDataBox_thenDoesNotThrow() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);

    // Act and Assert
    assertDoesNotThrow(
        () -> ImmutableScenarioMarketData.checkType(id, new EmptyMarketDataBox(), 3));
  }

  /**
   * Test {@link ImmutableScenarioMarketData#checkType(MarketDataId, MarketDataBox, int)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#checkType(MarketDataId, MarketDataBox,
   * int)}
   */
  @Test
  @DisplayName(
      "Test checkType(MarketDataId, MarketDataBox, int); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImmutableScenarioMarketData.checkType(MarketDataId, MarketDataBox, int)"
  })
  void testCheckType_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ImmutableScenarioMarketData.checkType(mock(MarketDataId.class), null, 3));
  }

  /**
   * Test {@link ImmutableScenarioMarketData#checkType(MarketDataId, MarketDataBox, int)}.
   *
   * <ul>
   *   <li>When of {@link ArrayList#ArrayList()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#checkType(MarketDataId, MarketDataBox,
   * int)}
   */
  @Test
  @DisplayName(
      "Test checkType(MarketDataId, MarketDataBox, int); when of ArrayList(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImmutableScenarioMarketData.checkType(MarketDataId, MarketDataBox, int)"
  })
  void testCheckType_whenOfArrayList_thenThrowIllegalArgumentException() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    ScenarioMarketDataBox<?> box = ScenarioMarketDataBox.of(new ArrayList<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ImmutableScenarioMarketData.checkType(id, box, 3));
  }

  /**
   * Test {@link ImmutableScenarioMarketData#checkType(MarketDataId, MarketDataBox, int)}.
   *
   * <ul>
   *   <li>When of {@code Value}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#checkType(MarketDataId, MarketDataBox,
   * int)}
   */
  @Test
  @DisplayName(
      "Test checkType(MarketDataId, MarketDataBox, int); when of 'Value'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImmutableScenarioMarketData.checkType(MarketDataId, MarketDataBox, int)"
  })
  void testCheckType_whenOfValue_thenDoesNotThrow() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    SingleMarketDataBox<?> box = SingleMarketDataBox.of("Value");

    // Act and Assert
    assertDoesNotThrow(() -> ImmutableScenarioMarketData.checkType(id, box, 3));
  }

  /**
   * Test {@link ImmutableScenarioMarketData#checkType(MarketDataId, MarketDataBox, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#checkType(MarketDataId, MarketDataBox,
   * int)}
   */
  @Test
  @DisplayName("Test checkType(MarketDataId, MarketDataBox, int); when zero; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImmutableScenarioMarketData.checkType(MarketDataId, MarketDataBox, int)"
  })
  void testCheckType_whenZero_thenDoesNotThrow() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    ScenarioMarketDataBox<?> box = ScenarioMarketDataBox.of(new ArrayList<>());

    // Act and Assert
    assertDoesNotThrow(() -> ImmutableScenarioMarketData.checkType(id, box, 0));
  }

  /**
   * Test {@link ImmutableScenarioMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId); when MarketDataId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableScenarioMarketData.containsValue(MarketDataId)"})
  void testContainsValue_whenMarketDataId() {
    // Arrange, Act and Assert
    assertFalse(ImmutableScenarioMarketData.empty().containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ImmutableScenarioMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableScenarioMarketData.containsValue(MarketDataId)"})
  void testContainsValue_whenNull() {
    // Arrange, Act and Assert
    assertFalse(ImmutableScenarioMarketData.empty().containsValue(null));
  }

  /**
   * Test {@link ImmutableScenarioMarketData#getValue(MarketDataId)}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test getValue(MarketDataId); when MarketDataId; then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ImmutableScenarioMarketData.getValue(MarketDataId)"})
  void testGetValue_whenMarketDataId_thenThrowMarketDataNotFoundException() {
    // Arrange, Act and Assert
    assertThrows(
        MarketDataNotFoundException.class,
        () -> ImmutableScenarioMarketData.empty().getValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ImmutableScenarioMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional ImmutableScenarioMarketData.findValue(MarketDataId)"})
  void testFindValue() {
    // Arrange, Act and Assert
    assertFalse(
        ImmutableScenarioMarketData.empty().findValue(mock(MarketDataId.class)).isPresent());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#getIds()}.
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set ImmutableScenarioMarketData.getIds()"})
  void testGetIds() {
    // Arrange, Act and Assert
    assertTrue(ImmutableScenarioMarketData.empty().getIds().isEmpty());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set ImmutableScenarioMarketData.findIds(MarketDataName)"})
  void testFindIds() {
    // Arrange, Act and Assert
    assertTrue(ImmutableScenarioMarketData.empty().findIds(mock(MarketDataName.class)).isEmpty());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set ImmutableScenarioMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds() {
    // Arrange, Act and Assert
    assertTrue(ImmutableScenarioMarketData.empty().getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#combinedWith(ImmutableScenarioMarketData)} with {@code
   * ImmutableScenarioMarketData}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImmutableScenarioMarketData#combinedWith(ImmutableScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ImmutableScenarioMarketData) with 'ImmutableScenarioMarketData'; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketData ImmutableScenarioMarketData.combinedWith(ImmutableScenarioMarketData)"
  })
  void testCombinedWithWithImmutableScenarioMarketData_whenEmpty_thenReturnEmpty() {
    // Arrange
    ImmutableScenarioMarketData emptyResult = ImmutableScenarioMarketData.empty();
    ImmutableScenarioMarketData other = ImmutableScenarioMarketData.empty();

    // Act
    ImmutableScenarioMarketData actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketData#combinedWith(ScenarioMarketData)} with {@code
   * ScenarioMarketData}.
   *
   * <ul>
   *   <li>Then return {@link ImmutableScenarioMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#combinedWith(ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ScenarioMarketData) with 'ScenarioMarketData'; then return ImmutableScenarioMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioMarketData ImmutableScenarioMarketData.combinedWith(ScenarioMarketData)"
  })
  void testCombinedWithWithScenarioMarketData_thenReturnImmutableScenarioMarketData() {
    // Arrange
    ImmutableScenarioMarketData emptyResult = ImmutableScenarioMarketData.empty();
    ImmutableScenarioMarketData other = ImmutableScenarioMarketData.empty();

    // Act
    ScenarioMarketData actualCombinedWithResult =
        emptyResult.combinedWith((ScenarioMarketData) other);

    // Assert
    assertTrue(actualCombinedWithResult instanceof ImmutableScenarioMarketData);
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableScenarioMarketData.meta();

    // Assert
    assertTrue(actualMetaResult.scenarioCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.timeSeries() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.valuationDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.values() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#ImmutableScenarioMarketData(int, MarketDataBox, Map,
   * Map)}.
   *
   * <ul>
   *   <li>Given {@link TestingObservableId#TestingObservableId(String)} with id is {@code
   *       scenarioCount}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#ImmutableScenarioMarketData(int,
   * MarketDataBox, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableScenarioMarketData(int, MarketDataBox, Map, Map); given TestingObservableId(String) with id is 'scenarioCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableScenarioMarketData.<init>(int, MarketDataBox, Map, Map)"})
  void testNewImmutableScenarioMarketData_givenTestingObservableIdWithIdIsScenarioCount() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("Id"), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(new TestingObservableId("scenarioCount"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ImmutableScenarioMarketData actualImmutableScenarioMarketData =
        new ImmutableScenarioMarketData(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(
        actualImmutableScenarioMarketData.getValuationDate() instanceof ScenarioMarketDataBox);
    assertEquals(2, actualImmutableScenarioMarketData.getTimeSeriesIds().size());
    assertEquals(3, actualImmutableScenarioMarketData.getScenarioCount());
    assertEquals(timeSeries, actualImmutableScenarioMarketData.getTimeSeries());
    assertEquals(values, actualImmutableScenarioMarketData.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#ImmutableScenarioMarketData(int, MarketDataBox, Map,
   * Map)}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIds size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#ImmutableScenarioMarketData(int,
   * MarketDataBox, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableScenarioMarketData(int, MarketDataBox, Map, Map); then return TimeSeriesIds size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableScenarioMarketData.<init>(int, MarketDataBox, Map, Map)"})
  void testNewImmutableScenarioMarketData_thenReturnTimeSeriesIdsSizeIsOne() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ImmutableScenarioMarketData actualImmutableScenarioMarketData =
        new ImmutableScenarioMarketData(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(
        actualImmutableScenarioMarketData.getValuationDate() instanceof ScenarioMarketDataBox);
    assertEquals(1, actualImmutableScenarioMarketData.getTimeSeriesIds().size());
    assertEquals(3, actualImmutableScenarioMarketData.getScenarioCount());
    assertEquals(timeSeries, actualImmutableScenarioMarketData.getTimeSeries());
    assertEquals(values, actualImmutableScenarioMarketData.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#ImmutableScenarioMarketData(int, MarketDataBox, Map,
   * Map)}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIds size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#ImmutableScenarioMarketData(int,
   * MarketDataBox, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableScenarioMarketData(int, MarketDataBox, Map, Map); then return TimeSeriesIds size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableScenarioMarketData.<init>(int, MarketDataBox, Map, Map)"})
  void testNewImmutableScenarioMarketData_thenReturnTimeSeriesIdsSizeIsTwo() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("Id"), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ImmutableScenarioMarketData actualImmutableScenarioMarketData =
        new ImmutableScenarioMarketData(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(
        actualImmutableScenarioMarketData.getValuationDate() instanceof ScenarioMarketDataBox);
    assertEquals(2, actualImmutableScenarioMarketData.getTimeSeriesIds().size());
    assertEquals(3, actualImmutableScenarioMarketData.getScenarioCount());
    assertEquals(timeSeries, actualImmutableScenarioMarketData.getTimeSeries());
    assertEquals(values, actualImmutableScenarioMarketData.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#ImmutableScenarioMarketData(int, MarketDataBox, Map,
   * Map)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return TimeSeries Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#ImmutableScenarioMarketData(int,
   * MarketDataBox, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableScenarioMarketData(int, MarketDataBox, Map, Map); when three; then return TimeSeries Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableScenarioMarketData.<init>(int, MarketDataBox, Map, Map)"})
  void testNewImmutableScenarioMarketData_whenThree_thenReturnTimeSeriesEmpty() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    // Act
    ImmutableScenarioMarketData actualImmutableScenarioMarketData =
        new ImmutableScenarioMarketData(3, valuationDate, values, new HashMap<>());

    // Assert
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        actualImmutableScenarioMarketData.getTimeSeries();
    assertTrue(timeSeries.isEmpty());
    assertSame(timeSeries, actualImmutableScenarioMarketData.getValues());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#metaBean()}.
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableScenarioMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, ImmutableScenarioMarketData.empty().metaBean());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#equals(Object)}, and {@link
   * ImmutableScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableScenarioMarketData#equals(Object)}
   *   <li>{@link ImmutableScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableScenarioMarketData.equals(Object)",
    "int ImmutableScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImmutableScenarioMarketData emptyResult = ImmutableScenarioMarketData.empty();
    ImmutableScenarioMarketData emptyResult2 = ImmutableScenarioMarketData.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#equals(Object)}, and {@link
   * ImmutableScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableScenarioMarketData#equals(Object)}
   *   <li>{@link ImmutableScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableScenarioMarketData.equals(Object)",
    "int ImmutableScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImmutableScenarioMarketData emptyResult = ImmutableScenarioMarketData.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link ImmutableScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableScenarioMarketData.equals(Object)",
    "int ImmutableScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ImmutableScenarioMarketData.empty(), 1);
  }

  /**
   * Test {@link ImmutableScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableScenarioMarketData.equals(Object)",
    "int ImmutableScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ImmutableScenarioMarketData.empty(), null);
  }

  /**
   * Test {@link ImmutableScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableScenarioMarketData.equals(Object)",
    "int ImmutableScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ImmutableScenarioMarketData.empty(), "Different type to ImmutableScenarioMarketData");
  }
}
