package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.ParameterizedFunctionalCurveDefinition.Builder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatesCurveGroupDefinitionBuilderDiffblueTest {
  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#build()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroupDefinitionBuilder#build()}
   *   <li>{@link RatesCurveGroupDefinitionBuilder#computeJacobian(boolean)}
   *   <li>{@link RatesCurveGroupDefinitionBuilder#computePvSensitivityToMarketQuote(boolean)}
   * </ul>
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurveGroupDefinitionBuilder.<init>()",
    "RatesCurveGroupDefinition RatesCurveGroupDefinitionBuilder.build()",
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.computeJacobian(boolean)",
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.computePvSensitivityToMarketQuote(boolean)"
  })
  void testBuild() {
    // Arrange and Act
    RatesCurveGroupDefinitionBuilder actualComputePvSensitivityToMarketQuoteResult =
        RatesCurveGroupDefinition.builder()
            .computeJacobian(true)
            .computePvSensitivityToMarketQuote(true);
    CurveGroupName name = CurveGroupName.of("Name");
    RatesCurveGroupDefinition actualRatesCurveGroupDefinition =
        actualComputePvSensitivityToMarketQuoteResult.name(name).build();

    // Assert
    assertEquals(0, actualRatesCurveGroupDefinition.getTotalParameterCount());
    assertTrue(actualRatesCurveGroupDefinition.isComputeJacobian());
    assertTrue(actualRatesCurveGroupDefinition.isComputePvSensitivityToMarketQuote());
    assertSame(name, actualRatesCurveGroupDefinition.getName());
    assertSame(
        actualRatesCurveGroupDefinition.getCurveDefinitions(),
        actualRatesCurveGroupDefinition.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#RatesCurveGroupDefinitionBuilder(CurveGroupName,
   * Map, Map, Map, boolean, boolean)}.
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinitionBuilder#RatesCurveGroupDefinitionBuilder(CurveGroupName, Map, Map,
   * Map, boolean, boolean)}
   */
  @Test
  @DisplayName(
      "Test new RatesCurveGroupDefinitionBuilder(CurveGroupName, Map, Map, Map, boolean, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurveGroupDefinitionBuilder.<init>(CurveGroupName, Map, Map, Map, boolean, boolean)"
  })
  void testNewRatesCurveGroupDefinitionBuilder() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<CurveName, RatesCurveGroupEntry> entries = new HashMap<>();
    HashMap<CurveName, CurveDefinition> curveDefinitions = new HashMap<>();

    // Act
    RatesCurveGroupDefinitionBuilder actualRatesCurveGroupDefinitionBuilder =
        new RatesCurveGroupDefinitionBuilder(
            name, entries, curveDefinitions, new HashMap<>(), true, true);

    // Assert
    RatesCurveGroupDefinition ratesCurveGroupDefinition =
        actualRatesCurveGroupDefinitionBuilder.build();
    assertEquals(0, ratesCurveGroupDefinition.getTotalParameterCount());
    assertTrue(ratesCurveGroupDefinition.getSeasonalityDefinitions().isEmpty());
    assertTrue(ratesCurveGroupDefinition.isComputeJacobian());
    assertTrue(ratesCurveGroupDefinition.isComputePvSensitivityToMarketQuote());
    ImmutableList<CurveDefinition> curveDefinitions2 =
        ratesCurveGroupDefinition.getCurveDefinitions();
    assertTrue(curveDefinitions2.isEmpty());
    assertSame(name, ratesCurveGroupDefinition.getName());
    assertSame(curveDefinitions2, ratesCurveGroupDefinition.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#name(CurveGroupName)}.
   *
   * <ul>
   *   <li>When {@link CurveGroupName} with {@code Name}.
   *   <li>Then builder build TotalParameterCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#name(CurveGroupName)}
   */
  @Test
  @DisplayName(
      "Test name(CurveGroupName); when CurveGroupName with 'Name'; then builder build TotalParameterCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.name(CurveGroupName)"
  })
  void testName_whenCurveGroupNameWithName_thenBuilderBuildTotalParameterCountIsZero() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();
    CurveGroupName name = CurveGroupName.of("Name");

    // Act
    RatesCurveGroupDefinitionBuilder actualNameResult = builderResult.name(name);

    // Assert
    RatesCurveGroupDefinition ratesCurveGroupDefinition = builderResult.build();
    assertEquals(0, ratesCurveGroupDefinition.getTotalParameterCount());
    assertFalse(ratesCurveGroupDefinition.isComputePvSensitivityToMarketQuote());
    assertTrue(ratesCurveGroupDefinition.isComputeJacobian());
    assertSame(name, ratesCurveGroupDefinition.getName());
    assertSame(builderResult, actualNameResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition, Index, Index[])}
   * with {@code curveDefinition}, {@code index}, {@code otherIndices}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition,
   * Index, Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveDefinition, Index, Index[]) with 'curveDefinition', 'index', 'otherIndices'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveDefinition, Index, Index[])"
  })
  void testAddForwardCurveWithCurveDefinitionIndexOtherIndices() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();
    builderResult.addForwardCurve(
        CurveName.of("curveDefinition"), mock(Index.class), mock(Index.class));

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            mock(Index.class),
            mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition, Index, Index[])}
   * with {@code curveDefinition}, {@code index}, {@code otherIndices}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition,
   * Index, Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveDefinition, Index, Index[]) with 'curveDefinition', 'index', 'otherIndices'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveDefinition, Index, Index[])"
  })
  void testAddForwardCurveWithCurveDefinitionIndexOtherIndices2() {
    // Arrange
    RatesCurveGroupDefinitionBuilder ratesCurveGroupDefinitionBuilder =
        new RatesCurveGroupDefinitionBuilder();
    ratesCurveGroupDefinitionBuilder.addForwardCurve(
        CurveName.of("curveDefinition"), mock(Index.class), mock(Index.class));

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        ratesCurveGroupDefinitionBuilder.addForwardCurve(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            mock(Index.class),
            mock(Index.class));

    // Assert
    assertSame(ratesCurveGroupDefinitionBuilder, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition, Index, Index[])}
   * with {@code curveDefinition}, {@code index}, {@code otherIndices}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition,
   * Index, Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveDefinition, Index, Index[]) with 'curveDefinition', 'index', 'otherIndices'; given CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveDefinition, Index, Index[])"
  })
  void testAddForwardCurveWithCurveDefinitionIndexOtherIndices_givenCurveNameWithName() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();
    builderResult.addForwardCurve(CurveName.of("Name"), mock(Index.class), mock(Index.class));

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            mock(Index.class),
            mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition, Index, Index[])}
   * with {@code curveDefinition}, {@code index}, {@code otherIndices}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition,
   * Index, Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveDefinition, Index, Index[]) with 'curveDefinition', 'index', 'otherIndices'; given CurveName with 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveDefinition, Index, Index[])"
  })
  void testAddForwardCurveWithCurveDefinitionIndexOtherIndices_givenCurveNameWithName2() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();
    builderResult.addForwardCurve(CurveName.of("name"), mock(Index.class), mock(Index.class));

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            mock(Index.class),
            mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition, Index, Index[])}
   * with {@code curveDefinition}, {@code index}, {@code otherIndices}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition,
   * Index, Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveDefinition, Index, Index[]) with 'curveDefinition', 'index', 'otherIndices'; given CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveDefinition, Index, Index[])"
  })
  void testAddForwardCurveWithCurveDefinitionIndexOtherIndices_givenCurveNameWithName3() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();
    builderResult.addForwardCurve(CurveName.of("Name"), mock(Index.class), mock(Index.class));

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition, Index, Index[])}
   * with {@code curveDefinition}, {@code index}, {@code otherIndices}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition,
   * Index, Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveDefinition, Index, Index[]) with 'curveDefinition', 'index', 'otherIndices'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveDefinition, Index, Index[])"
  })
  void testAddForwardCurveWithCurveDefinitionIndexOtherIndices_thenReturnBuilder() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            mock(Index.class),
            mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition, Index, Index[])}
   * with {@code curveDefinition}, {@code index}, {@code otherIndices}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition,
   * Index, Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveDefinition, Index, Index[]) with 'curveDefinition', 'index', 'otherIndices'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveDefinition, Index, Index[])"
  })
  void testAddForwardCurveWithCurveDefinitionIndexOtherIndices_thenReturnBuilder2() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition, Index, Index[])}
   * with {@code curveDefinition}, {@code index}, {@code otherIndices}.
   *
   * <ul>
   *   <li>When {@link Index} and {@link Index}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition,
   * Index, Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveDefinition, Index, Index[]) with 'curveDefinition', 'index', 'otherIndices'; when Index and Index")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveDefinition, Index, Index[])"
  })
  void testAddForwardCurveWithCurveDefinitionIndexOtherIndices_whenIndexAndIndex() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            mock(Index.class),
            mock(Index.class),
            mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition, Index, Index[])}
   * with {@code curveDefinition}, {@code index}, {@code otherIndices}.
   *
   * <ul>
   *   <li>When {@link Index} and {@link Index}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveDefinition,
   * Index, Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveDefinition, Index, Index[]) with 'curveDefinition', 'index', 'otherIndices'; when Index and Index")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveDefinition, Index, Index[])"
  })
  void testAddForwardCurveWithCurveDefinitionIndexOtherIndices_whenIndexAndIndex2() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            mock(Index.class),
            mock(Index.class),
            mock(Index.class),
            mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index, Index[])} with
   * {@code curveName}, {@code index}, {@code otherIndices}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index,
   * Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveName, Index, Index[]) with 'curveName', 'index', 'otherIndices'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveName, Index, Index[])"
  })
  void testAddForwardCurveWithCurveNameIndexOtherIndices() {
    // Arrange
    RatesCurveGroupDefinitionBuilder ratesCurveGroupDefinitionBuilder =
        new RatesCurveGroupDefinitionBuilder();

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        ratesCurveGroupDefinitionBuilder.addForwardCurve(
            CurveName.of("Name"), mock(Index.class), mock(Index.class));

    // Assert
    assertSame(ratesCurveGroupDefinitionBuilder, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index, Index[])} with
   * {@code curveName}, {@code index}, {@code otherIndices}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index,
   * Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveName, Index, Index[]) with 'curveName', 'index', 'otherIndices'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveName, Index, Index[])"
  })
  void testAddForwardCurveWithCurveNameIndexOtherIndices2() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();
    builderResult.computeJacobian(true);

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(CurveName.of("Name"), mock(Index.class), mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index, Index[])} with
   * {@code curveName}, {@code index}, {@code otherIndices}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index,
   * Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveName, Index, Index[]) with 'curveName', 'index', 'otherIndices'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveName, Index, Index[])"
  })
  void testAddForwardCurveWithCurveNameIndexOtherIndices3() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();
    builderResult.addForwardCurve(CurveName.of("Name"), mock(Index.class), mock(Index.class));

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(CurveName.of("Name"), mock(Index.class), mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index, Index[])} with
   * {@code curveName}, {@code index}, {@code otherIndices}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index,
   * Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveName, Index, Index[]) with 'curveName', 'index', 'otherIndices'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveName, Index, Index[])"
  })
  void testAddForwardCurveWithCurveNameIndexOtherIndices4() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();
    builderResult.addForwardCurve(CurveName.of("Name"), mock(Index.class), mock(Index.class));

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(CurveName.of("Name"), mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index, Index[])} with
   * {@code curveName}, {@code index}, {@code otherIndices}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index,
   * Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveName, Index, Index[]) with 'curveName', 'index', 'otherIndices'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveName, Index, Index[])"
  })
  void testAddForwardCurveWithCurveNameIndexOtherIndices5() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();
    builderResult.addForwardCurve(CurveName.of("Name"), mock(Index.class));

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(CurveName.of("Name"), mock(Index.class), mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index, Index[])} with
   * {@code curveName}, {@code index}, {@code otherIndices}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index,
   * Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveName, Index, Index[]) with 'curveName', 'index', 'otherIndices'; given builder; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveName, Index, Index[])"
  })
  void testAddForwardCurveWithCurveNameIndexOtherIndices_givenBuilder_thenReturnBuilder() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(CurveName.of("Name"), mock(Index.class), mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index, Index[])} with
   * {@code curveName}, {@code index}, {@code otherIndices}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index,
   * Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveName, Index, Index[]) with 'curveName', 'index', 'otherIndices'; given builder; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveName, Index, Index[])"
  })
  void testAddForwardCurveWithCurveNameIndexOtherIndices_givenBuilder_thenReturnBuilder2() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(CurveName.of("Name"), mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index, Index[])} with
   * {@code curveName}, {@code index}, {@code otherIndices}.
   *
   * <ul>
   *   <li>When {@link Index} and {@link Index}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index,
   * Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveName, Index, Index[]) with 'curveName', 'index', 'otherIndices'; when Index and Index")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveName, Index, Index[])"
  })
  void testAddForwardCurveWithCurveNameIndexOtherIndices_whenIndexAndIndex() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(
            CurveName.of("Name"), mock(Index.class), mock(Index.class), mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index, Index[])} with
   * {@code curveName}, {@code index}, {@code otherIndices}.
   *
   * <ul>
   *   <li>When {@link Index} and {@link Index}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addForwardCurve(CurveName, Index,
   * Index[])}
   */
  @Test
  @DisplayName(
      "Test addForwardCurve(CurveName, Index, Index[]) with 'curveName', 'index', 'otherIndices'; when Index and Index")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addForwardCurve(CurveName, Index, Index[])"
  })
  void testAddForwardCurveWithCurveNameIndexOtherIndices_whenIndexAndIndex2() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();

    // Act
    RatesCurveGroupDefinitionBuilder actualAddForwardCurveResult =
        builderResult.addForwardCurve(
            CurveName.of("Name"),
            mock(Index.class),
            mock(Index.class),
            mock(Index.class),
            mock(Index.class));

    // Assert
    assertSame(builderResult, actualAddForwardCurveResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinitionBuilder#addSeasonality(CurveName, SeasonalityDefinition)}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>When {@code null}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionBuilder#addSeasonality(CurveName,
   * SeasonalityDefinition)}
   */
  @Test
  @DisplayName(
      "Test addSeasonality(CurveName, SeasonalityDefinition); given builder; when 'null'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinitionBuilder.addSeasonality(CurveName, SeasonalityDefinition)"
  })
  void testAddSeasonality_givenBuilder_whenNull_thenReturnBuilder() {
    // Arrange
    RatesCurveGroupDefinitionBuilder builderResult = RatesCurveGroupDefinition.builder();

    // Act
    RatesCurveGroupDefinitionBuilder actualAddSeasonalityResult =
        builderResult.addSeasonality(CurveName.of("Name"), null);

    // Assert
    assertSame(builderResult, actualAddSeasonalityResult);
  }
}
