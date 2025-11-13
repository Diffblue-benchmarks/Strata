package com.opengamma.strata.calc.marketdata;

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
import com.opengamma.strata.calc.marketdata.BuiltScenarioMarketData.Meta;
import com.opengamma.strata.collect.result.Failure;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.data.MarketDataNotFoundException;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BuiltScenarioMarketDataDiffblueTest {
  /**
   * Test {@link BuiltScenarioMarketData#empty()}.
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BuiltScenarioMarketData BuiltScenarioMarketData.empty()"})
  void testEmpty() {
    // Arrange and Act
    BuiltScenarioMarketData actualEmptyResult = BuiltScenarioMarketData.empty();

    // Assert
    assertEquals(0, actualEmptyResult.getScenarioCount());
    ImmutableScenarioMarketData underlying = actualEmptyResult.getUnderlying();
    assertEquals(0, underlying.getScenarioCount());
    assertFalse(actualEmptyResult.getValuationDate().isScenarioValue());
    assertFalse(underlying.getValuationDate().isScenarioValue());
    ImmutableMap<MarketDataId<?>, Failure> timeSeriesFailures =
        actualEmptyResult.getTimeSeriesFailures();
    assertTrue(timeSeriesFailures.isEmpty());
    Set<MarketDataId<?>> ids = actualEmptyResult.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, actualEmptyResult.getTimeSeriesIds());
    assertSame(ids, underlying.getIds());
    assertSame(ids, underlying.getTimeSeriesIds());
    assertSame(timeSeriesFailures, actualEmptyResult.getValueFailures());
    assertSame(timeSeriesFailures, underlying.getTimeSeries());
    assertSame(timeSeriesFailures, underlying.getValues());
  }

  /**
   * Test {@link BuiltScenarioMarketData#getValuationDate()}.
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.MarketDataBox BuiltScenarioMarketData.getValuationDate()"
  })
  void testGetValuationDate() {
    // Arrange, Act and Assert
    assertFalse(BuiltScenarioMarketData.empty().getValuationDate().isScenarioValue());
  }

  /**
   * Test {@link BuiltScenarioMarketData#getScenarioCount()}.
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BuiltScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount() {
    // Arrange, Act and Assert
    assertEquals(0, BuiltScenarioMarketData.empty().getScenarioCount());
  }

  /**
   * Test {@link BuiltScenarioMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId); when MarketDataId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BuiltScenarioMarketData.containsValue(MarketDataId)"})
  void testContainsValue_whenMarketDataId() {
    // Arrange, Act and Assert
    assertFalse(BuiltScenarioMarketData.empty().containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link BuiltScenarioMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BuiltScenarioMarketData.containsValue(MarketDataId)"})
  void testContainsValue_whenNull() {
    // Arrange, Act and Assert
    assertFalse(BuiltScenarioMarketData.empty().containsValue(null));
  }

  /**
   * Test {@link BuiltScenarioMarketData#getValue(MarketDataId)}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test getValue(MarketDataId); when MarketDataId; then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.MarketDataBox BuiltScenarioMarketData.getValue(MarketDataId)"
  })
  void testGetValue_whenMarketDataId_thenThrowMarketDataNotFoundException() {
    // Arrange, Act and Assert
    assertThrows(
        MarketDataNotFoundException.class,
        () -> BuiltScenarioMarketData.empty().getValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link BuiltScenarioMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional BuiltScenarioMarketData.findValue(MarketDataId)"})
  void testFindValue() {
    // Arrange, Act and Assert
    assertFalse(BuiltScenarioMarketData.empty().findValue(mock(MarketDataId.class)).isPresent());
  }

  /**
   * Test {@link BuiltScenarioMarketData#getIds()}.
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BuiltScenarioMarketData.getIds()"})
  void testGetIds() {
    // Arrange, Act and Assert
    assertTrue(BuiltScenarioMarketData.empty().getIds().isEmpty());
  }

  /**
   * Test {@link BuiltScenarioMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BuiltScenarioMarketData.findIds(MarketDataName)"})
  void testFindIds() {
    // Arrange, Act and Assert
    assertTrue(BuiltScenarioMarketData.empty().findIds(null).isEmpty());
  }

  /**
   * Test {@link BuiltScenarioMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BuiltScenarioMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds() {
    // Arrange, Act and Assert
    assertTrue(BuiltScenarioMarketData.empty().getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link BuiltScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta BuiltScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = BuiltScenarioMarketData.meta();

    // Assert
    MetaProperty<ImmutableMap<MarketDataId<?>, Failure>> timeSeriesFailuresResult =
        actualMetaResult.timeSeriesFailures();
    assertTrue(timeSeriesFailuresResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableScenarioMarketData> underlyingResult = actualMetaResult.underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<MarketDataId<?>, Failure>> valueFailuresResult =
        actualMetaResult.valueFailures();
    assertTrue(valueFailuresResult instanceof DirectMetaProperty);
    assertEquals("timeSeriesFailures", timeSeriesFailuresResult.name());
    assertEquals("underlying", underlyingResult.name());
    assertEquals("valueFailures", valueFailuresResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, timeSeriesFailuresResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, underlyingResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueFailuresResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, timeSeriesFailuresResult.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, valueFailuresResult.propertyType());
    Class<BuiltScenarioMarketData> expectedDeclaringTypeResult = BuiltScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult, timeSeriesFailuresResult.declaringType());
    Class<BuiltScenarioMarketData> expectedDeclaringTypeResult2 = BuiltScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult2, underlyingResult.declaringType());
    Class<BuiltScenarioMarketData> expectedDeclaringTypeResult3 = BuiltScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult3, valueFailuresResult.declaringType());
    Class<ImmutableScenarioMarketData> expectedPropertyTypeResult3 =
        ImmutableScenarioMarketData.class;
    assertEquals(expectedPropertyTypeResult3, underlyingResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, timeSeriesFailuresResult.metaBean());
    assertSame(meta, underlyingResult.metaBean());
    assertSame(meta, valueFailuresResult.metaBean());
  }

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
    Class<? extends BuiltScenarioMarketData> actualBeanTypeResult =
        BuiltScenarioMarketData.meta().beanType();

    // Assert
    Class<BuiltScenarioMarketData> expectedBeanTypeResult = BuiltScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#timeSeriesFailures()}
   *   <li>{@link Meta#underlying()}
   *   <li>{@link Meta#valueFailures()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.timeSeriesFailures()",
    "MetaProperty Meta.underlying()",
    "MetaProperty Meta.valueFailures()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = BuiltScenarioMarketData.meta();

    // Act
    MetaProperty<ImmutableMap<MarketDataId<?>, Failure>> actualTimeSeriesFailuresResult =
        metaResult.timeSeriesFailures();
    MetaProperty<ImmutableScenarioMarketData> actualUnderlyingResult = metaResult.underlying();

    // Assert
    assertTrue(actualTimeSeriesFailuresResult instanceof DirectMetaProperty);
    assertTrue(actualUnderlyingResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valueFailures() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code timeSeriesFailures}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'timeSeriesFailures'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsTimeSeriesFailures() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BuiltScenarioMarketData.meta().metaPropertyGet("timeSeriesFailures");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableScenarioMarketData> underlyingResult =
        ((Meta) metaBeanResult).underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<MarketDataId<?>, Failure>> valueFailuresResult =
        ((Meta) metaBeanResult).valueFailures();
    assertTrue(valueFailuresResult instanceof DirectMetaProperty);
    assertEquals("timeSeriesFailures", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeSeriesFailures());
    assertSame(metaBeanResult, underlyingResult.metaBean());
    assertSame(metaBeanResult, valueFailuresResult.metaBean());
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
    assertNull(BuiltScenarioMarketData.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code underlying}.
   *   <li>Then return name is {@code underlying}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'underlying'; then return name is 'underlying'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenUnderlying_thenReturnNameIsUnderlying() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BuiltScenarioMarketData.meta().metaPropertyGet("underlying");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<MarketDataId<?>, Failure>> timeSeriesFailuresResult =
        ((Meta) metaBeanResult).timeSeriesFailures();
    assertTrue(timeSeriesFailuresResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<MarketDataId<?>, Failure>> valueFailuresResult =
        ((Meta) metaBeanResult).valueFailures();
    assertTrue(valueFailuresResult instanceof DirectMetaProperty);
    assertEquals("underlying", actualMetaPropertyGetResult.name());
    Class<ImmutableScenarioMarketData> expectedPropertyTypeResult =
        ImmutableScenarioMarketData.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).underlying());
    assertSame(metaBeanResult, timeSeriesFailuresResult.metaBean());
    assertSame(metaBeanResult, valueFailuresResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valueFailures}.
   *   <li>Then return name is {@code valueFailures}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valueFailures'; then return name is 'valueFailures'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValueFailures_thenReturnNameIsValueFailures() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BuiltScenarioMarketData.meta().metaPropertyGet("valueFailures");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<MarketDataId<?>, Failure>> timeSeriesFailuresResult =
        ((Meta) metaBeanResult).timeSeriesFailures();
    assertTrue(timeSeriesFailuresResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableScenarioMarketData> underlyingResult =
        ((Meta) metaBeanResult).underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    assertEquals("valueFailures", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valueFailures());
    assertSame(metaBeanResult, timeSeriesFailuresResult.metaBean());
    assertSame(metaBeanResult, underlyingResult.metaBean());
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
        BuiltScenarioMarketData.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("underlying");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("timeSeriesFailures");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("valueFailures");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("timeSeriesFailures", getResult2.name());
    assertEquals("underlying", getResult.name());
    assertEquals("valueFailures", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<BuiltScenarioMarketData> expectedDeclaringTypeResult = BuiltScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<BuiltScenarioMarketData> expectedDeclaringTypeResult2 = BuiltScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<BuiltScenarioMarketData> expectedDeclaringTypeResult3 = BuiltScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<ImmutableScenarioMarketData> expectedPropertyTypeResult3 =
        ImmutableScenarioMarketData.class;
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
    assertNull(BuiltScenarioMarketData.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = BuiltScenarioMarketData.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(BuiltScenarioMarketData.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeSeriesFailures}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'timeSeriesFailures'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTimeSeriesFailures_thenReturnMap() {
    // Arrange
    Meta metaResult = BuiltScenarioMarketData.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(BuiltScenarioMarketData.empty(), "timeSeriesFailures", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlying}.
   *   <li>Then return {@link ImmutableScenarioMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'underlying'; then return ImmutableScenarioMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenUnderlying_thenReturnImmutableScenarioMarketData() {
    // Arrange
    Meta metaResult = BuiltScenarioMarketData.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(BuiltScenarioMarketData.empty(), "underlying", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof ImmutableScenarioMarketData);
    assertEquals(0, ((ImmutableScenarioMarketData) actualPropertyGetResult).getScenarioCount());
    assertFalse(
        ((ImmutableScenarioMarketData) actualPropertyGetResult)
            .getValuationDate()
            .isScenarioValue());
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        ((ImmutableScenarioMarketData) actualPropertyGetResult).getTimeSeries();
    assertTrue(timeSeries.isEmpty());
    Set<MarketDataId<?>> ids = ((ImmutableScenarioMarketData) actualPropertyGetResult).getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, ((ImmutableScenarioMarketData) actualPropertyGetResult).getTimeSeriesIds());
    assertSame(timeSeries, ((ImmutableScenarioMarketData) actualPropertyGetResult).getValues());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code valueFailures}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'valueFailures'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValueFailures_thenReturnMap() {
    // Arrange
    Meta metaResult = BuiltScenarioMarketData.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(BuiltScenarioMarketData.empty(), "valueFailures", true);

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
            BuiltScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "timeSeriesFailures", "New Value", false));
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
            BuiltScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeSeriesFailures}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'timeSeriesFailures'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTimeSeriesFailures_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BuiltScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "timeSeriesFailures", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlying}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'underlying'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnderlying_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BuiltScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "underlying", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valueFailures}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valueFailures'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValueFailures_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BuiltScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "valueFailures", "New Value", true));
  }

  /**
   * Test {@link BuiltScenarioMarketData#BuiltScenarioMarketData(ImmutableScenarioMarketData, Map,
   * Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return TimeSeriesFailures is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BuiltScenarioMarketData#BuiltScenarioMarketData(ImmutableScenarioMarketData, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new BuiltScenarioMarketData(ImmutableScenarioMarketData, Map, Map); when HashMap(); then return TimeSeriesFailures is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BuiltScenarioMarketData.<init>(ImmutableScenarioMarketData, Map, Map)"})
  void testNewBuiltScenarioMarketData_whenHashMap_thenReturnTimeSeriesFailuresIsHashMap() {
    // Arrange
    ImmutableScenarioMarketData underlying = ImmutableScenarioMarketData.empty();
    HashMap<MarketDataId<?>, Failure> valueFailures = new HashMap<>();

    // Act
    BuiltScenarioMarketData actualBuiltScenarioMarketData =
        new BuiltScenarioMarketData(underlying, valueFailures, new HashMap<>());

    // Assert
    ImmutableMap<MarketDataId<?>, Failure> timeSeriesFailures =
        actualBuiltScenarioMarketData.getTimeSeriesFailures();
    assertEquals(valueFailures, timeSeriesFailures);
    assertSame(timeSeriesFailures, actualBuiltScenarioMarketData.getValueFailures());
    ImmutableScenarioMarketData underlying2 = actualBuiltScenarioMarketData.getUnderlying();
    assertSame(timeSeriesFailures, underlying2.getTimeSeries());
    assertSame(timeSeriesFailures, underlying2.getValues());
  }

  /**
   * Test {@link BuiltScenarioMarketData#metaBean()}.
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta BuiltScenarioMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, BuiltScenarioMarketData.empty().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BuiltScenarioMarketData#toString()}
   *   <li>{@link BuiltScenarioMarketData#getTimeSeriesFailures()}
   *   <li>{@link BuiltScenarioMarketData#getUnderlying()}
   *   <li>{@link BuiltScenarioMarketData#getValueFailures()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap BuiltScenarioMarketData.getTimeSeriesFailures()",
    "ImmutableScenarioMarketData BuiltScenarioMarketData.getUnderlying()",
    "ImmutableMap BuiltScenarioMarketData.getValueFailures()",
    "String BuiltScenarioMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    BuiltScenarioMarketData emptyResult = BuiltScenarioMarketData.empty();

    // Act
    emptyResult.toString();
    ImmutableMap<MarketDataId<?>, Failure> actualTimeSeriesFailures =
        emptyResult.getTimeSeriesFailures();
    ImmutableScenarioMarketData actualUnderlying = emptyResult.getUnderlying();
    ImmutableMap<MarketDataId<?>, Failure> actualValueFailures = emptyResult.getValueFailures();

    // Assert
    assertEquals(0, actualUnderlying.getScenarioCount());
    assertFalse(actualUnderlying.getValuationDate().isScenarioValue());
    assertTrue(actualUnderlying.getIds().isEmpty());
    assertSame(actualTimeSeriesFailures, actualValueFailures);
    assertSame(actualTimeSeriesFailures, actualUnderlying.getTimeSeries());
    assertSame(actualTimeSeriesFailures, actualUnderlying.getValues());
  }

  /**
   * Test {@link BuiltScenarioMarketData#equals(Object)}, and {@link
   * BuiltScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BuiltScenarioMarketData#equals(Object)}
   *   <li>{@link BuiltScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BuiltScenarioMarketData.equals(Object)",
    "int BuiltScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BuiltScenarioMarketData emptyResult = BuiltScenarioMarketData.empty();
    BuiltScenarioMarketData emptyResult2 = BuiltScenarioMarketData.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link BuiltScenarioMarketData#equals(Object)}, and {@link
   * BuiltScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BuiltScenarioMarketData#equals(Object)}
   *   <li>{@link BuiltScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BuiltScenarioMarketData.equals(Object)",
    "int BuiltScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ImmutableScenarioMarketData underlying = ImmutableScenarioMarketData.empty();
    HashMap<MarketDataId<?>, Failure> valueFailures = new HashMap<>();

    BuiltScenarioMarketData builtScenarioMarketData =
        new BuiltScenarioMarketData(underlying, valueFailures, new HashMap<>());
    BuiltScenarioMarketData emptyResult = BuiltScenarioMarketData.empty();

    // Act and Assert
    assertEquals(builtScenarioMarketData, emptyResult);
    assertEquals(builtScenarioMarketData.hashCode(), emptyResult.hashCode());
  }

  /**
   * Test {@link BuiltScenarioMarketData#equals(Object)}, and {@link
   * BuiltScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BuiltScenarioMarketData#equals(Object)}
   *   <li>{@link BuiltScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BuiltScenarioMarketData.equals(Object)",
    "int BuiltScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BuiltScenarioMarketData emptyResult = BuiltScenarioMarketData.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link BuiltScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BuiltScenarioMarketData.equals(Object)",
    "int BuiltScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ImmutableScenarioMarketData underlying = ImmutableScenarioMarketData.empty();
    HashMap<MarketDataId<?>, Failure> valueFailures = new HashMap<>();

    // Act and Assert
    assertNotEquals(new BuiltScenarioMarketData(underlying, valueFailures, new HashMap<>()), 1);
  }

  /**
   * Test {@link BuiltScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BuiltScenarioMarketData.equals(Object)",
    "int BuiltScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BuiltScenarioMarketData.empty(), null);
  }

  /**
   * Test {@link BuiltScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BuiltScenarioMarketData.equals(Object)",
    "int BuiltScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BuiltScenarioMarketData.empty(), "Different type to BuiltScenarioMarketData");
  }
}
