package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.collect.result.Failure;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.MarketDataBox;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultMarketDataFactoryDiffblueTest {
  /**
   * Test {@link DefaultMarketDataFactory#DefaultMarketDataFactory(ObservableDataProvider,
   * TimeSeriesProvider, List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultMarketDataFactory#DefaultMarketDataFactory(ObservableDataProvider, TimeSeriesProvider,
   * List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultMarketDataFactory(ObservableDataProvider, TimeSeriesProvider, List); when ArrayList(); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultMarketDataFactory.<init>(ObservableDataProvider, TimeSeriesProvider, List)"
  })
  void testNewDefaultMarketDataFactory_whenArrayList_thenDoesNotThrow() {
    // Arrange
    ObservableDataProvider observableDataProvider = mock(ObservableDataProvider.class);
    TimeSeriesProvider timeSeriesProvider = mock(TimeSeriesProvider.class);

    // Act
    assertDoesNotThrow(
        () ->
            new DefaultMarketDataFactory(
                observableDataProvider, timeSeriesProvider, new ArrayList<>()));
  }

  /**
   * Test {@link DefaultMarketDataFactory#create(MarketDataRequirements, MarketDataConfig,
   * MarketData, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return ValuationDate toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultMarketDataFactory#create(MarketDataRequirements,
   * MarketDataConfig, MarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test create(MarketDataRequirements, MarketDataConfig, MarketData, ReferenceData); then return ValuationDate toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltMarketData DefaultMarketDataFactory.create(MarketDataRequirements, MarketDataConfig, MarketData, ReferenceData)"
  })
  void testCreate_thenReturnValuationDateToStringIs19700101() {
    // Arrange
    ObservableDataProvider observableDataProvider = mock(ObservableDataProvider.class);
    TimeSeriesProvider timeSeriesProvider = mock(TimeSeriesProvider.class);

    DefaultMarketDataFactory ofResult =
        MarketDataFactory.of(observableDataProvider, timeSeriesProvider, new ArrayList<>());
    MarketDataRequirements requirements = MarketDataRequirements.empty();
    MarketDataConfig marketDataConfig = MarketDataConfig.empty();

    MarketData suppliedData = mock(MarketData.class);
    LocalDate ofResult2 = LocalDate.of(1970, 1, 1);
    when(suppliedData.getValuationDate()).thenReturn(ofResult2);

    // Act
    BuiltMarketData actualCreateResult =
        ofResult.create(requirements, marketDataConfig, suppliedData, mock(ReferenceData.class));

    // Assert
    verify(suppliedData).getValuationDate();
    LocalDate valuationDate = actualCreateResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate.toString());
    BuiltScenarioMarketData underlying = actualCreateResult.getUnderlying();
    assertEquals(1, underlying.getScenarioCount());
    ImmutableMap<MarketDataId<?>, Failure> timeSeriesFailures =
        actualCreateResult.getTimeSeriesFailures();
    assertTrue(timeSeriesFailures.isEmpty());
    Set<MarketDataId<?>> ids = actualCreateResult.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, actualCreateResult.getTimeSeriesIds());
    assertSame(ids, underlying.getIds());
    assertSame(ids, underlying.getTimeSeriesIds());
    assertSame(ofResult2, valuationDate);
    assertSame(timeSeriesFailures, actualCreateResult.getValueFailures());
    assertSame(timeSeriesFailures, underlying.getTimeSeriesFailures());
    assertSame(timeSeriesFailures, underlying.getValueFailures());
  }

  /**
   * Test {@link DefaultMarketDataFactory#createMultiScenario(MarketDataRequirements,
   * MarketDataConfig, MarketData, ReferenceData, ScenarioDefinition)} with {@code
   * MarketDataRequirements}, {@code MarketDataConfig}, {@code MarketData}, {@code ReferenceData},
   * {@code ScenarioDefinition}.
   *
   * <p>Method under test: {@link
   * DefaultMarketDataFactory#createMultiScenario(MarketDataRequirements, MarketDataConfig,
   * MarketData, ReferenceData, ScenarioDefinition)}
   */
  @Test
  @DisplayName(
      "Test createMultiScenario(MarketDataRequirements, MarketDataConfig, MarketData, ReferenceData, ScenarioDefinition) with 'MarketDataRequirements', 'MarketDataConfig', 'MarketData', 'ReferenceData', 'ScenarioDefinition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltScenarioMarketData DefaultMarketDataFactory.createMultiScenario(MarketDataRequirements, MarketDataConfig, MarketData, ReferenceData, ScenarioDefinition)"
  })
  void
      testCreateMultiScenarioWithMarketDataRequirementsMarketDataConfigMarketDataReferenceDataScenarioDefinition() {
    // Arrange
    ObservableDataProvider observableDataProvider = mock(ObservableDataProvider.class);
    TimeSeriesProvider timeSeriesProvider = mock(TimeSeriesProvider.class);

    DefaultMarketDataFactory ofResult =
        MarketDataFactory.of(observableDataProvider, timeSeriesProvider, new ArrayList<>());
    MarketDataRequirements requirements = MarketDataRequirements.empty();
    MarketDataConfig marketDataConfig = MarketDataConfig.empty();

    MarketData suppliedData = mock(MarketData.class);
    when(suppliedData.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    BuiltScenarioMarketData actualCreateMultiScenarioResult =
        ofResult.createMultiScenario(
            requirements, marketDataConfig, suppliedData, refData, ScenarioDefinition.empty());

    // Assert
    verify(suppliedData).getValuationDate();
    assertEquals(1, actualCreateMultiScenarioResult.getScenarioCount());
    ImmutableScenarioMarketData underlying = actualCreateMultiScenarioResult.getUnderlying();
    assertEquals(1, underlying.getScenarioCount());
    MarketDataBox<LocalDate> valuationDate = actualCreateMultiScenarioResult.getValuationDate();
    assertFalse(valuationDate.isScenarioValue());
    ImmutableMap<MarketDataId<?>, Failure> timeSeriesFailures =
        actualCreateMultiScenarioResult.getTimeSeriesFailures();
    assertTrue(timeSeriesFailures.isEmpty());
    Set<MarketDataId<?>> ids = actualCreateMultiScenarioResult.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, actualCreateMultiScenarioResult.getTimeSeriesIds());
    assertSame(ids, underlying.getIds());
    assertSame(ids, underlying.getTimeSeriesIds());
    assertSame(valuationDate, underlying.getValuationDate());
    assertSame(timeSeriesFailures, actualCreateMultiScenarioResult.getValueFailures());
    assertSame(timeSeriesFailures, underlying.getTimeSeries());
    assertSame(timeSeriesFailures, underlying.getValues());
  }

  /**
   * Test {@link DefaultMarketDataFactory#createMultiScenario(MarketDataRequirements,
   * MarketDataConfig, ScenarioMarketData, ReferenceData, ScenarioDefinition)} with {@code
   * MarketDataRequirements}, {@code MarketDataConfig}, {@code ScenarioMarketData}, {@code
   * ReferenceData}, {@code ScenarioDefinition}.
   *
   * <p>Method under test: {@link
   * DefaultMarketDataFactory#createMultiScenario(MarketDataRequirements, MarketDataConfig,
   * ScenarioMarketData, ReferenceData, ScenarioDefinition)}
   */
  @Test
  @DisplayName(
      "Test createMultiScenario(MarketDataRequirements, MarketDataConfig, ScenarioMarketData, ReferenceData, ScenarioDefinition) with 'MarketDataRequirements', 'MarketDataConfig', 'ScenarioMarketData', 'ReferenceData', 'ScenarioDefinition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltScenarioMarketData DefaultMarketDataFactory.createMultiScenario(MarketDataRequirements, MarketDataConfig, ScenarioMarketData, ReferenceData, ScenarioDefinition)"
  })
  void
      testCreateMultiScenarioWithMarketDataRequirementsMarketDataConfigScenarioMarketDataReferenceDataScenarioDefinition() {
    // Arrange
    ObservableDataProvider observableDataProvider = mock(ObservableDataProvider.class);
    TimeSeriesProvider timeSeriesProvider = mock(TimeSeriesProvider.class);

    DefaultMarketDataFactory ofResult =
        MarketDataFactory.of(observableDataProvider, timeSeriesProvider, new ArrayList<>());
    MarketDataRequirements requirements = MarketDataRequirements.empty();
    MarketDataConfig marketDataConfig = MarketDataConfig.empty();

    MarketDataBox<LocalDate> marketDataBox = mock(MarketDataBox.class);
    when(marketDataBox.isSingleValue()).thenReturn(true);
    when(marketDataBox.getScenarioCount()).thenReturn(3);

    ScenarioMarketData suppliedData = mock(ScenarioMarketData.class);
    when(suppliedData.getValuationDate()).thenReturn(marketDataBox);
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    BuiltScenarioMarketData actualCreateMultiScenarioResult =
        ofResult.createMultiScenario(
            requirements, marketDataConfig, suppliedData, refData, ScenarioDefinition.empty());

    // Assert
    verify(marketDataBox, atLeast(1)).getScenarioCount();
    verify(marketDataBox).isSingleValue();
    verify(suppliedData).getValuationDate();
    assertEquals(1, actualCreateMultiScenarioResult.getScenarioCount());
    ImmutableScenarioMarketData underlying = actualCreateMultiScenarioResult.getUnderlying();
    assertEquals(1, underlying.getScenarioCount());
    ImmutableMap<MarketDataId<?>, Failure> timeSeriesFailures =
        actualCreateMultiScenarioResult.getTimeSeriesFailures();
    assertTrue(timeSeriesFailures.isEmpty());
    Set<MarketDataId<?>> ids = actualCreateMultiScenarioResult.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, actualCreateMultiScenarioResult.getTimeSeriesIds());
    assertSame(ids, underlying.getIds());
    assertSame(ids, underlying.getTimeSeriesIds());
    assertSame(timeSeriesFailures, actualCreateMultiScenarioResult.getValueFailures());
    assertSame(timeSeriesFailures, underlying.getTimeSeries());
    assertSame(timeSeriesFailures, underlying.getValues());
  }

  /**
   * Test {@link DefaultMarketDataFactory#createMultiScenario(MarketDataRequirements,
   * MarketDataConfig, ScenarioMarketData, ReferenceData, ScenarioDefinition)} with {@code
   * MarketDataRequirements}, {@code MarketDataConfig}, {@code ScenarioMarketData}, {@code
   * ReferenceData}, {@code ScenarioDefinition}.
   *
   * <p>Method under test: {@link
   * DefaultMarketDataFactory#createMultiScenario(MarketDataRequirements, MarketDataConfig,
   * ScenarioMarketData, ReferenceData, ScenarioDefinition)}
   */
  @Test
  @DisplayName(
      "Test createMultiScenario(MarketDataRequirements, MarketDataConfig, ScenarioMarketData, ReferenceData, ScenarioDefinition) with 'MarketDataRequirements', 'MarketDataConfig', 'ScenarioMarketData', 'ReferenceData', 'ScenarioDefinition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltScenarioMarketData DefaultMarketDataFactory.createMultiScenario(MarketDataRequirements, MarketDataConfig, ScenarioMarketData, ReferenceData, ScenarioDefinition)"
  })
  void
      testCreateMultiScenarioWithMarketDataRequirementsMarketDataConfigScenarioMarketDataReferenceDataScenarioDefinition2() {
    // Arrange
    ObservableDataProvider observableDataProvider = mock(ObservableDataProvider.class);
    TimeSeriesProvider timeSeriesProvider = mock(TimeSeriesProvider.class);

    DefaultMarketDataFactory ofResult =
        MarketDataFactory.of(observableDataProvider, timeSeriesProvider, new ArrayList<>());
    MarketDataRequirements requirements = MarketDataRequirements.empty();
    MarketDataConfig marketDataConfig = MarketDataConfig.empty();

    MarketDataBox<LocalDate> marketDataBox = mock(MarketDataBox.class);
    when(marketDataBox.isSingleValue()).thenReturn(false);
    when(marketDataBox.getScenarioCount()).thenReturn(3);

    ScenarioMarketData suppliedData = mock(ScenarioMarketData.class);
    when(suppliedData.getValuationDate()).thenReturn(marketDataBox);
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    BuiltScenarioMarketData actualCreateMultiScenarioResult =
        ofResult.createMultiScenario(
            requirements, marketDataConfig, suppliedData, refData, ScenarioDefinition.empty());

    // Assert
    verify(marketDataBox, atLeast(1)).getScenarioCount();
    verify(marketDataBox).isSingleValue();
    verify(suppliedData).getValuationDate();
    assertEquals(1, actualCreateMultiScenarioResult.getScenarioCount());
    ImmutableScenarioMarketData underlying = actualCreateMultiScenarioResult.getUnderlying();
    assertEquals(1, underlying.getScenarioCount());
    ImmutableMap<MarketDataId<?>, Failure> timeSeriesFailures =
        actualCreateMultiScenarioResult.getTimeSeriesFailures();
    assertTrue(timeSeriesFailures.isEmpty());
    Set<MarketDataId<?>> ids = actualCreateMultiScenarioResult.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, actualCreateMultiScenarioResult.getTimeSeriesIds());
    assertSame(ids, underlying.getIds());
    assertSame(ids, underlying.getTimeSeriesIds());
    assertSame(timeSeriesFailures, actualCreateMultiScenarioResult.getValueFailures());
    assertSame(timeSeriesFailures, underlying.getTimeSeries());
    assertSame(timeSeriesFailures, underlying.getValues());
  }
}
