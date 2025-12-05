package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.calc.runner.CalculationParametersId;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableId;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataRequirementsBuilderDiffblueTest {
  /**
   * Test {@link MarketDataRequirementsBuilder#addTimeSeries(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Then return build TimeSeries size is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#addTimeSeries(Collection)}
   */
  @Test
  @DisplayName(
      "Test addTimeSeries(Collection) with 'Collection'; then return build TimeSeries size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addTimeSeries(Collection)"
  })
  void testAddTimeSeriesWithCollection_thenReturnBuildTimeSeriesSizeIsOne() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    ArrayList<ObservableId> ids = new ArrayList<>();
    ids.add(new MarketDataNodeTest().new TestIdA("42"));

    // Act and Assert
    assertEquals(1, builderResult.addTimeSeries(ids).build().getTimeSeries().size());
    assertEquals(1, builderResult.build().getTimeSeries().size());
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#addTimeSeries(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Then return build TimeSeries size is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#addTimeSeries(Collection)}
   */
  @Test
  @DisplayName(
      "Test addTimeSeries(Collection) with 'Collection'; then return build TimeSeries size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addTimeSeries(Collection)"
  })
  void testAddTimeSeriesWithCollection_thenReturnBuildTimeSeriesSizeIsOne2() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    ArrayList<ObservableId> ids = new ArrayList<>();
    ids.add(new MarketDataNodeTest().new TestIdA("42"));
    ids.add(new MarketDataNodeTest().new TestIdA("42"));

    // Act and Assert
    assertEquals(1, builderResult.addTimeSeries(ids).build().getTimeSeries().size());
    assertEquals(1, builderResult.build().getTimeSeries().size());
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#addTimeSeries(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#addTimeSeries(Collection)}
   */
  @Test
  @DisplayName(
      "Test addTimeSeries(Collection) with 'Collection'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addTimeSeries(Collection)"
  })
  void testAddTimeSeriesWithCollection_whenArrayList_thenReturnBuilder() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    // Act
    MarketDataRequirementsBuilder actualAddTimeSeriesResult =
        builderResult.addTimeSeries(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualAddTimeSeriesResult);
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#addTimeSeries(ObservableId[])} with {@code
   * ObservableId[]}.
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#addTimeSeries(ObservableId[])}
   */
  @Test
  @DisplayName("Test addTimeSeries(ObservableId[]) with 'ObservableId[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addTimeSeries(ObservableId[])"
  })
  void testAddTimeSeriesWithObservableId() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    // Act
    MarketDataRequirementsBuilder actualAddTimeSeriesResult =
        builderResult.addTimeSeries(new MarketDataNodeTest().new TestIdA("42"));

    // Assert
    assertEquals(1, builderResult.build().getTimeSeries().size());
    assertSame(builderResult, actualAddTimeSeriesResult);
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#addValues(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Then return build NonObservables size is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#addValues(Collection)}
   */
  @Test
  @DisplayName(
      "Test addValues(Collection) with 'Collection'; then return build NonObservables size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addValues(Collection)"
  })
  void testAddValuesWithCollection_thenReturnBuildNonObservablesSizeIsOne() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    ArrayList<MarketDataId<?>> ids = new ArrayList<>();
    ids.add(CalculationParametersId.of("ids"));
    ids.add(CalculationParametersId.of("ids"));

    // Act and Assert
    assertEquals(1, builderResult.addValues(ids).build().getNonObservables().size());
    assertEquals(1, builderResult.build().getNonObservables().size());
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#addValues(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Then return build NonObservables size is two.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#addValues(Collection)}
   */
  @Test
  @DisplayName(
      "Test addValues(Collection) with 'Collection'; then return build NonObservables size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addValues(Collection)"
  })
  void testAddValuesWithCollection_thenReturnBuildNonObservablesSizeIsTwo() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    ArrayList<MarketDataId<?>> ids = new ArrayList<>();
    ids.add(mock(MarketDataId.class));
    ids.add(mock(MarketDataId.class));

    // Act and Assert
    assertEquals(2, builderResult.addValues(ids).build().getNonObservables().size());
    assertEquals(2, builderResult.build().getNonObservables().size());
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#addValues(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Then return build NonObservables size is two.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#addValues(Collection)}
   */
  @Test
  @DisplayName(
      "Test addValues(Collection) with 'Collection'; then return build NonObservables size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addValues(Collection)"
  })
  void testAddValuesWithCollection_thenReturnBuildNonObservablesSizeIsTwo2() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    ArrayList<MarketDataId<?>> ids = new ArrayList<>();
    ids.add(CalculationParametersId.of("ids"));
    ids.add(mock(MarketDataId.class));

    // Act and Assert
    assertEquals(2, builderResult.addValues(ids).build().getNonObservables().size());
    assertEquals(2, builderResult.build().getNonObservables().size());
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#addValues(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return build NonObservables Empty.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#addValues(Collection)}
   */
  @Test
  @DisplayName(
      "Test addValues(Collection) with 'Collection'; when ArrayList(); then return build NonObservables Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addValues(Collection)"
  })
  void testAddValuesWithCollection_whenArrayList_thenReturnBuildNonObservablesEmpty() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    // Act and Assert
    MarketDataRequirements marketDataRequirements =
        builderResult.addValues(new ArrayList<>()).build();
    ImmutableSet<MarketDataId<?>> nonObservables = marketDataRequirements.getNonObservables();
    assertTrue(nonObservables.isEmpty());
    assertSame(nonObservables, marketDataRequirements.getObservables());
    assertSame(nonObservables, marketDataRequirements.getOutputCurrencies());
    assertSame(nonObservables, marketDataRequirements.getTimeSeries());
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#addValues(MarketDataId[])} with {@code
   * MarketDataId[]}.
   *
   * <ul>
   *   <li>Then return build Observables size is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#addValues(MarketDataId[])}
   */
  @Test
  @DisplayName(
      "Test addValues(MarketDataId[]) with 'MarketDataId[]'; then return build Observables size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addValues(MarketDataId[])"
  })
  void testAddValuesWithMarketDataId_thenReturnBuildObservablesSizeIsOne() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    // Act and Assert
    MarketDataRequirements marketDataRequirements =
        builderResult.addValues(new MarketDataNodeTest().new TestIdA("42")).build();
    assertEquals(1, marketDataRequirements.getObservables().size());
    assertEquals(1, builderResult.build().getObservables().size());
    ImmutableSet<MarketDataId<?>> nonObservables = marketDataRequirements.getNonObservables();
    assertTrue(nonObservables.isEmpty());
    assertSame(nonObservables, marketDataRequirements.getOutputCurrencies());
    assertSame(nonObservables, marketDataRequirements.getTimeSeries());
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#addValues(MarketDataId[])} with {@code
   * MarketDataId[]}.
   *
   * <ul>
   *   <li>When {@link CalculationParametersId} with name is {@code ids}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#addValues(MarketDataId[])}
   */
  @Test
  @DisplayName(
      "Test addValues(MarketDataId[]) with 'MarketDataId[]'; when CalculationParametersId with name is 'ids'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addValues(MarketDataId[])"
  })
  void testAddValuesWithMarketDataId_whenCalculationParametersIdWithNameIsIds() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    // Act and Assert
    MarketDataRequirements marketDataRequirements =
        builderResult.addValues(CalculationParametersId.of("ids")).build();
    assertEquals(1, marketDataRequirements.getNonObservables().size());
    assertEquals(1, builderResult.build().getNonObservables().size());
    ImmutableSet<ObservableId> observables = marketDataRequirements.getObservables();
    assertTrue(observables.isEmpty());
    assertSame(observables, marketDataRequirements.getOutputCurrencies());
    assertSame(observables, marketDataRequirements.getTimeSeries());
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#addValues(MarketDataId[])} with {@code
   * MarketDataId[]}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#addValues(MarketDataId[])}
   */
  @Test
  @DisplayName("Test addValues(MarketDataId[]) with 'MarketDataId[]'; when MarketDataId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addValues(MarketDataId[])"
  })
  void testAddValuesWithMarketDataId_whenMarketDataId() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    // Act and Assert
    MarketDataRequirements marketDataRequirements =
        builderResult.addValues(mock(MarketDataId.class)).build();
    assertEquals(1, marketDataRequirements.getNonObservables().size());
    assertEquals(1, builderResult.build().getNonObservables().size());
    ImmutableSet<ObservableId> observables = marketDataRequirements.getObservables();
    assertTrue(observables.isEmpty());
    assertSame(observables, marketDataRequirements.getOutputCurrencies());
    assertSame(observables, marketDataRequirements.getTimeSeries());
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#addRequirements(MarketDataRequirements)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link
   * MarketDataRequirementsBuilder#addRequirements(MarketDataRequirements)}
   */
  @Test
  @DisplayName("Test addRequirements(MarketDataRequirements); when empty; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataRequirementsBuilder MarketDataRequirementsBuilder.addRequirements(MarketDataRequirements)"
  })
  void testAddRequirements_whenEmpty_thenReturnBuilder() {
    // Arrange
    MarketDataRequirementsBuilder builderResult = MarketDataRequirements.builder();

    // Act
    MarketDataRequirementsBuilder actualAddRequirementsResult =
        builderResult.addRequirements(MarketDataRequirements.empty());

    // Assert
    assertSame(builderResult, actualAddRequirementsResult);
  }

  /**
   * Test {@link MarketDataRequirementsBuilder#build()}.
   *
   * <p>Method under test: {@link MarketDataRequirementsBuilder#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MarketDataRequirementsBuilder.<init>()",
    "MarketDataRequirements MarketDataRequirementsBuilder.build()"
  })
  void testBuild() {
    // Arrange and Act
    MarketDataRequirements actualMarketDataRequirements = MarketDataRequirements.builder().build();

    // Assert
    assertSame(
        actualMarketDataRequirements.getNonObservables(),
        actualMarketDataRequirements.getObservables());
    assertSame(
        actualMarketDataRequirements.getNonObservables(),
        actualMarketDataRequirements.getOutputCurrencies());
    assertSame(
        actualMarketDataRequirements.getNonObservables(),
        actualMarketDataRequirements.getTimeSeries());
  }
}
