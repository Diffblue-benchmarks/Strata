package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.data.TestingObservableId;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SingleScenarioMarketDataDiffblueTest {
  /**
   * Test {@link SingleScenarioMarketData#of(ScenarioMarketData, int)}.
   *
   * <p>Method under test: {@link SingleScenarioMarketData#of(ScenarioMarketData, int)}
   */
  @Test
  @DisplayName("Test of(ScenarioMarketData, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SingleScenarioMarketData SingleScenarioMarketData.of(ScenarioMarketData, int)"
  })
  void testOf() {
    // Arrange
    RepeatedScenarioMarketData marketData =
        RepeatedScenarioMarketData.of(3, mock(MarketData.class));

    // Act and Assert
    assertSame(marketData, SingleScenarioMarketData.of(marketData, 1).getMarketData());
  }

  /**
   * Test {@link SingleScenarioMarketData#of(ScenarioMarketData, int)}.
   *
   * <ul>
   *   <li>Given three.
   *   <li>Then return ScenarioIndex is one.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#of(ScenarioMarketData, int)}
   */
  @Test
  @DisplayName("Test of(ScenarioMarketData, int); given three; then return ScenarioIndex is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SingleScenarioMarketData SingleScenarioMarketData.of(ScenarioMarketData, int)"
  })
  void testOf_givenThree_thenReturnScenarioIndexIsOne() {
    // Arrange
    ScenarioMarketData marketData = mock(ScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    SingleScenarioMarketData actualOfResult = SingleScenarioMarketData.of(marketData, 1);

    // Assert
    verify(marketData).getScenarioCount();
    assertEquals(1, actualOfResult.getScenarioIndex());
    assertTrue(actualOfResult.getIds().isEmpty());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link SingleScenarioMarketData#getValuationDate()}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate SingleScenarioMarketData.getValuationDate()"})
  void testGetValuationDate_thenReturnToStringIs19700101() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);

    // Act
    LocalDate actualValuationDate =
        SingleScenarioMarketData.of(RepeatedScenarioMarketData.of(3, marketData), 1)
            .getValuationDate();

    // Assert
    verify(marketData).getValuationDate();
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(ofResult, actualValuationDate);
  }

  /**
   * Test {@link SingleScenarioMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@link MarketData} {@link MarketData#containsValue(MarketDataId)} return {@code
   *       true}.
   *   <li>Then calls {@link MarketData#containsValue(MarketDataId)}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(MarketDataId); given MarketData containsValue(MarketDataId) return 'true'; then calls containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SingleScenarioMarketData.containsValue(MarketDataId)"})
  void testContainsValue_givenMarketDataContainsValueReturnTrue_thenCallsContainsValue() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    when(marketData.containsValue(Mockito.<MarketDataId<?>>any())).thenReturn(true);

    // Act
    boolean actualContainsValueResult =
        SingleScenarioMarketData.of(RepeatedScenarioMarketData.of(3, marketData), 1)
            .containsValue(mock(MarketDataId.class));

    // Assert
    verify(marketData).containsValue(isA(MarketDataId.class));
    assertTrue(actualContainsValueResult);
  }

  /**
   * Test {@link SingleScenarioMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@link ScenarioMarketData} {@link ScenarioMarketData#containsValue(MarketDataId)}
   *       return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(MarketDataId); given ScenarioMarketData containsValue(MarketDataId) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SingleScenarioMarketData.containsValue(MarketDataId)"})
  void testContainsValue_givenScenarioMarketDataContainsValueReturnTrue_thenReturnTrue() {
    // Arrange
    ScenarioMarketData marketData = mock(ScenarioMarketData.class);
    when(marketData.containsValue(Mockito.<MarketDataId<?>>any())).thenReturn(true);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    boolean actualContainsValueResult =
        SingleScenarioMarketData.of(marketData, 1).containsValue(mock(MarketDataId.class));

    // Assert
    verify(marketData).containsValue(isA(MarketDataId.class));
    verify(marketData).getScenarioCount();
    assertTrue(actualContainsValueResult);
  }

  /**
   * Test {@link SingleScenarioMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SingleScenarioMarketData.containsValue(MarketDataId)"})
  void testContainsValue_thenReturnFalse() {
    // Arrange
    ScenarioMarketData marketData = mock(ScenarioMarketData.class);
    when(marketData.containsValue(Mockito.<MarketDataId<?>>any())).thenReturn(false);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    boolean actualContainsValueResult =
        SingleScenarioMarketData.of(marketData, 1).containsValue(mock(MarketDataId.class));

    // Assert
    verify(marketData).containsValue(isA(MarketDataId.class));
    verify(marketData).getScenarioCount();
    assertFalse(actualContainsValueResult);
  }

  /**
   * Test {@link SingleScenarioMarketData#findValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@link ScenarioMarketData} {@link ScenarioMarketData#findValue(MarketDataId)}
   *       return empty.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test findValue(MarketDataId); given ScenarioMarketData findValue(MarketDataId) return empty; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional SingleScenarioMarketData.findValue(MarketDataId)"})
  void testFindValue_givenScenarioMarketDataFindValueReturnEmpty_thenReturnNotPresent() {
    // Arrange
    ScenarioMarketData marketData = mock(ScenarioMarketData.class);
    Optional<MarketDataBox<Object>> emptyResult = Optional.empty();
    when(marketData.findValue(Mockito.<MarketDataId<Object>>any())).thenReturn(emptyResult);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    Optional<Object> actualFindValueResult =
        SingleScenarioMarketData.of(marketData, 1).findValue(mock(MarketDataId.class));

    // Assert
    verify(marketData).findValue(isA(MarketDataId.class));
    verify(marketData).getScenarioCount();
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link SingleScenarioMarketData#findValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Then return {@link Optional} with {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId); then return Optional with 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional SingleScenarioMarketData.findValue(MarketDataId)"})
  void testFindValue_thenReturnOptionalWithValue() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    Optional<Object> ofResult = Optional.of("Value");
    when(marketData.findValue(Mockito.<MarketDataId<Object>>any())).thenReturn(ofResult);

    // Act
    Optional<Object> actualFindValueResult =
        SingleScenarioMarketData.of(RepeatedScenarioMarketData.of(3, marketData), 1)
            .findValue(mock(MarketDataId.class));

    // Assert
    verify(marketData).findValue(isA(MarketDataId.class));
    assertEquals(ofResult, actualFindValueResult);
  }

  /**
   * Test {@link SingleScenarioMarketData#getIds()}.
   *
   * <ul>
   *   <li>Given {@link MarketData} {@link MarketData#getIds()} return {@link HashSet#HashSet()}.
   *   <li>Then calls {@link MarketData#getIds()}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); given MarketData getIds() return HashSet(); then calls getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SingleScenarioMarketData.getIds()"})
  void testGetIds_givenMarketDataGetIdsReturnHashSet_thenCallsGetIds() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    Mockito.<Set<MarketDataId<?>>>when(marketData.getIds()).thenReturn(new HashSet<>());

    // Act
    Set<MarketDataId<?>> actualIds =
        SingleScenarioMarketData.of(RepeatedScenarioMarketData.of(3, marketData), 1).getIds();

    // Assert
    verify(marketData).getIds();
    assertTrue(actualIds.isEmpty());
  }

  /**
   * Test {@link SingleScenarioMarketData#getIds()}.
   *
   * <ul>
   *   <li>Given {@link ScenarioMarketData} {@link ScenarioMarketData#getIds()} return {@link
   *       HashSet#HashSet()}.
   *   <li>Then calls {@link ScenarioMarketData#getIds()}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#getIds()}
   */
  @Test
  @DisplayName(
      "Test getIds(); given ScenarioMarketData getIds() return HashSet(); then calls getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SingleScenarioMarketData.getIds()"})
  void testGetIds_givenScenarioMarketDataGetIdsReturnHashSet_thenCallsGetIds() {
    // Arrange
    ScenarioMarketData marketData = mock(ScenarioMarketData.class);
    Mockito.<Set<MarketDataId<?>>>when(marketData.getIds()).thenReturn(new HashSet<>());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    Set<MarketDataId<?>> actualIds = SingleScenarioMarketData.of(marketData, 1).getIds();

    // Assert
    verify(marketData).getIds();
    verify(marketData).getScenarioCount();
    assertTrue(actualIds.isEmpty());
  }

  /**
   * Test {@link SingleScenarioMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@link MarketData} {@link MarketData#findIds(MarketDataName)} return {@link
   *       HashSet#HashSet()}.
   *   <li>Then calls {@link MarketData#findIds(MarketDataName)}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findIds(MarketDataName); given MarketData findIds(MarketDataName) return HashSet(); then calls findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SingleScenarioMarketData.findIds(MarketDataName)"})
  void testFindIds_givenMarketDataFindIdsReturnHashSet_thenCallsFindIds() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    when(marketData.findIds(Mockito.<MarketDataName<Object>>any())).thenReturn(new HashSet<>());

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult =
        SingleScenarioMarketData.of(RepeatedScenarioMarketData.of(3, marketData), 1).findIds(null);

    // Assert
    verify(marketData).findIds(isNull());
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link SingleScenarioMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@link ScenarioMarketData} {@link ScenarioMarketData#findIds(MarketDataName)}
   *       return {@link HashSet#HashSet()}.
   *   <li>Then calls {@link ScenarioMarketData#findIds(MarketDataName)}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findIds(MarketDataName); given ScenarioMarketData findIds(MarketDataName) return HashSet(); then calls findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SingleScenarioMarketData.findIds(MarketDataName)"})
  void testFindIds_givenScenarioMarketDataFindIdsReturnHashSet_thenCallsFindIds() {
    // Arrange
    ScenarioMarketData marketData = mock(ScenarioMarketData.class);
    when(marketData.findIds(Mockito.<MarketDataName<Object>>any())).thenReturn(new HashSet<>());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult =
        SingleScenarioMarketData.of(marketData, 1).findIds(null);

    // Assert
    verify(marketData).findIds(isNull());
    verify(marketData).getScenarioCount();
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link SingleScenarioMarketData#getTimeSeriesIds()}.
   *
   * <ul>
   *   <li>Then calls {@link ScenarioMarketData#getScenarioCount()}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds(); then calls getScenarioCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SingleScenarioMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds_thenCallsGetScenarioCount() {
    // Arrange
    ScenarioMarketData marketData = mock(ScenarioMarketData.class);
    when(marketData.getTimeSeriesIds()).thenReturn(new HashSet<>());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    Set<ObservableId> actualTimeSeriesIds =
        SingleScenarioMarketData.of(marketData, 1).getTimeSeriesIds();

    // Assert
    verify(marketData).getScenarioCount();
    verify(marketData).getTimeSeriesIds();
    assertTrue(actualTimeSeriesIds.isEmpty());
  }

  /**
   * Test {@link SingleScenarioMarketData#getTimeSeriesIds()}.
   *
   * <ul>
   *   <li>Then calls {@link MarketData#getTimeSeriesIds()}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds(); then calls getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SingleScenarioMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds_thenCallsGetTimeSeriesIds() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeriesIds()).thenReturn(new HashSet<>());

    // Act
    Set<ObservableId> actualTimeSeriesIds =
        SingleScenarioMarketData.of(RepeatedScenarioMarketData.of(3, marketData), 1)
            .getTimeSeriesIds();

    // Assert
    verify(marketData).getTimeSeriesIds();
    assertTrue(actualTimeSeriesIds.isEmpty());
  }

  /**
   * Test {@link SingleScenarioMarketData#getTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Then calls {@link ScenarioMarketData#getScenarioCount()}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName("Test getTimeSeries(ObservableId); then calls getScenarioCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeries SingleScenarioMarketData.getTimeSeries(ObservableId)"
  })
  void testGetTimeSeries_thenCallsGetScenarioCount() {
    // Arrange
    ScenarioMarketData marketData = mock(ScenarioMarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));
    when(marketData.getScenarioCount()).thenReturn(3);
    SingleScenarioMarketData ofResult = SingleScenarioMarketData.of(marketData, 1);

    // Act
    ofResult.getTimeSeries(new TestingObservableId("42"));

    // Assert
    verify(marketData).getScenarioCount();
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link SingleScenarioMarketData#getTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Then calls {@link MarketData#getTimeSeries(ObservableId)}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName("Test getTimeSeries(ObservableId); then calls getTimeSeries(ObservableId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeries SingleScenarioMarketData.getTimeSeries(ObservableId)"
  })
  void testGetTimeSeries_thenCallsGetTimeSeries() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));
    SingleScenarioMarketData ofResult =
        SingleScenarioMarketData.of(RepeatedScenarioMarketData.of(3, marketData), 1);

    // Act
    ofResult.getTimeSeries(new TestingObservableId("42"));

    // Assert
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link SingleScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link SingleScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SingleScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SingleScenarioMarketData> actualMetaResult = SingleScenarioMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(metaPropertyMapResult.containsKey("scenarioIndex"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SingleScenarioMarketData> expectedBeanTypeResult = SingleScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SingleScenarioMarketData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SingleScenarioMarketData.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange and Act
    TypedMetaBean<SingleScenarioMarketData> actualMetaBeanResult =
        SingleScenarioMarketData.of(RepeatedScenarioMarketData.of(3, mock(MarketData.class)), 1)
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(metaPropertyMapResult.containsKey("scenarioIndex"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SingleScenarioMarketData> expectedBeanTypeResult = SingleScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
