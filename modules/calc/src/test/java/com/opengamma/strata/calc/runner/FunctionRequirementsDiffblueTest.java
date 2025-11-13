package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.marketdata.TestObservableId;
import com.opengamma.strata.calc.runner.FunctionRequirements.Builder;
import com.opengamma.strata.calc.runner.FunctionRequirements.Meta;
import com.opengamma.strata.data.FxMatrixId;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.data.ObservableSource;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FunctionRequirementsDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>Then builder build ObservableSource is {@link ObservableSource#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; then builder build ObservableSource is NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_thenBuilderBuildObservableSourceIsNone() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Object actualGetResult = builderResult.get("observableSource");

    // Assert
    ObservableSource observableSource = ((ObservableSource) actualGetResult).NONE;
    assertSame(observableSource, builderResult.build().getObservableSource());
    assertSame(observableSource, actualGetResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code outputCurrencies}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'outputCurrencies'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenOutputCurrencies_thenReturnSet() {
    // Arrange and Act
    Object actualGetResult = FunctionRequirements.builder().get("outputCurrencies");

    // Assert
    assertTrue(actualGetResult instanceof Set);
    assertTrue(((Set<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> FunctionRequirements.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code timeSeriesRequirements}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'timeSeriesRequirements'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenTimeSeriesRequirements_thenReturnSet() {
    // Arrange and Act
    Object actualGetResult = FunctionRequirements.builder().get("timeSeriesRequirements");

    // Assert
    assertTrue(actualGetResult instanceof Set);
    assertTrue(((Set<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code valueRequirements}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'valueRequirements'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenValueRequirements_thenReturnSet() {
    // Arrange and Act
    Object actualGetResult = FunctionRequirements.builder().get("valueRequirements");

    // Assert
    assertTrue(actualGetResult instanceof Set);
    assertTrue(((Set<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#observableSource(ObservableSource)}.
   *
   * <ul>
   *   <li>When {@link ObservableSource} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#observableSource(ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test Builder observableSource(ObservableSource); when ObservableSource with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.observableSource(ObservableSource)"})
  void testBuilderObservableSource_whenObservableSourceWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();
    ObservableSource observableSource = ObservableSource.of("Name");

    // Act
    Builder actualObservableSourceResult = builderResult.observableSource(observableSource);

    // Assert
    assertSame(builderResult, actualObservableSourceResult);
    assertSame(observableSource, builderResult.build().getObservableSource());
  }

  /**
   * Test Builder {@link Builder#outputCurrencies(Currency[])} with {@code Currency[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#outputCurrencies(Currency[])}
   */
  @Test
  @DisplayName("Test Builder outputCurrencies(Currency[]) with 'Currency[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.outputCurrencies(Currency[])"})
  void testBuilderOutputCurrenciesWithCurrency_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualOutputCurrenciesResult = builderResult.outputCurrencies();

    // Assert
    assertSame(builderResult, actualOutputCurrenciesResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> FunctionRequirements.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code observableSource}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'observableSource'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenObservableSource_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();
    ObservableSource ofResult = ObservableSource.of("Name");

    // Act
    Builder actualSetResult = builderResult.set("observableSource", ofResult);

    // Assert
    assertSame(builderResult, actualSetResult);
    assertSame(ofResult, builderResult.build().getObservableSource());
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#timeSeriesRequirements(ObservableId[])} with {@code
   * ObservableId[]}.
   *
   * <p>Method under test: {@link Builder#timeSeriesRequirements(ObservableId[])}
   */
  @Test
  @DisplayName("Test Builder timeSeriesRequirements(ObservableId[]) with 'ObservableId[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.timeSeriesRequirements(ObservableId[])"})
  void testBuilderTimeSeriesRequirementsWithObservableId() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualTimeSeriesRequirementsResult =
        builderResult.timeSeriesRequirements(TestObservableId.of((StandardId) null));

    // Assert
    assertSame(builderResult, actualTimeSeriesRequirementsResult);
  }

  /**
   * Test Builder {@link Builder#timeSeriesRequirements(ObservableId[])} with {@code
   * ObservableId[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#timeSeriesRequirements(ObservableId[])}
   */
  @Test
  @DisplayName(
      "Test Builder timeSeriesRequirements(ObservableId[]) with 'ObservableId[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.timeSeriesRequirements(ObservableId[])"})
  void testBuilderTimeSeriesRequirementsWithObservableId_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualTimeSeriesRequirementsResult = builderResult.timeSeriesRequirements();

    // Assert
    assertSame(builderResult, actualTimeSeriesRequirementsResult);
  }

  /**
   * Test Builder {@link Builder#valueRequirements(MarketDataId[])} with {@code MarketDataId[]}.
   *
   * <p>Method under test: {@link Builder#valueRequirements(MarketDataId[])}
   */
  @Test
  @DisplayName("Test Builder valueRequirements(MarketDataId[]) with 'MarketDataId[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valueRequirements(MarketDataId[])"})
  void testBuilderValueRequirementsWithMarketDataId() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualValueRequirementsResult =
        builderResult.valueRequirements(
            CalculationParametersId.of("valueRequirements"), mock(MarketDataId.class));

    // Assert
    assertSame(builderResult, actualValueRequirementsResult);
  }

  /**
   * Test Builder {@link Builder#valueRequirements(MarketDataId[])} with {@code MarketDataId[]}.
   *
   * <p>Method under test: {@link Builder#valueRequirements(MarketDataId[])}
   */
  @Test
  @DisplayName("Test Builder valueRequirements(MarketDataId[]) with 'MarketDataId[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valueRequirements(MarketDataId[])"})
  void testBuilderValueRequirementsWithMarketDataId2() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();
    CalculationParametersId ofResult = CalculationParametersId.of("valueRequirements");

    // Act
    Builder actualValueRequirementsResult =
        builderResult.valueRequirements(ofResult, CalculationParametersId.of("valueRequirements"));

    // Assert
    assertSame(builderResult, actualValueRequirementsResult);
  }

  /**
   * Test Builder {@link Builder#valueRequirements(MarketDataId[])} with {@code MarketDataId[]}.
   *
   * <p>Method under test: {@link Builder#valueRequirements(MarketDataId[])}
   */
  @Test
  @DisplayName("Test Builder valueRequirements(MarketDataId[]) with 'MarketDataId[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valueRequirements(MarketDataId[])"})
  void testBuilderValueRequirementsWithMarketDataId3() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();
    CalculationParametersId ofResult = CalculationParametersId.of("Name");

    // Act
    Builder actualValueRequirementsResult =
        builderResult.valueRequirements(ofResult, CalculationParametersId.of("valueRequirements"));

    // Assert
    assertSame(builderResult, actualValueRequirementsResult);
  }

  /**
   * Test Builder {@link Builder#valueRequirements(MarketDataId[])} with {@code MarketDataId[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valueRequirements(MarketDataId[])}
   */
  @Test
  @DisplayName(
      "Test Builder valueRequirements(MarketDataId[]) with 'MarketDataId[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valueRequirements(MarketDataId[])"})
  void testBuilderValueRequirementsWithMarketDataId_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualValueRequirementsResult = builderResult.valueRequirements();

    // Assert
    assertSame(builderResult, actualValueRequirementsResult);
  }

  /**
   * Test Builder {@link Builder#valueRequirements(MarketDataId[])} with {@code MarketDataId[]}.
   *
   * <ul>
   *   <li>When {@link MarketDataId} and {@link MarketDataId}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valueRequirements(MarketDataId[])}
   */
  @Test
  @DisplayName(
      "Test Builder valueRequirements(MarketDataId[]) with 'MarketDataId[]'; when MarketDataId and MarketDataId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valueRequirements(MarketDataId[])"})
  void testBuilderValueRequirementsWithMarketDataId_whenMarketDataIdAndMarketDataId() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualValueRequirementsResult =
        builderResult.valueRequirements(mock(MarketDataId.class), mock(MarketDataId.class));

    // Assert
    assertSame(builderResult, actualValueRequirementsResult);
  }

  /**
   * Test Builder {@link Builder#valueRequirements(MarketDataId[])} with {@code MarketDataId[]}.
   *
   * <ul>
   *   <li>When {@link MarketDataId} and {@link MarketDataId}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valueRequirements(MarketDataId[])}
   */
  @Test
  @DisplayName(
      "Test Builder valueRequirements(MarketDataId[]) with 'MarketDataId[]'; when MarketDataId and MarketDataId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valueRequirements(MarketDataId[])"})
  void testBuilderValueRequirementsWithMarketDataId_whenMarketDataIdAndMarketDataId2() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualValueRequirementsResult =
        builderResult.valueRequirements(
            mock(MarketDataId.class), mock(MarketDataId.class), mock(MarketDataId.class));

    // Assert
    assertSame(builderResult, actualValueRequirementsResult);
  }

  /**
   * Test Builder {@link Builder#valueRequirements(MarketDataId[])} with {@code MarketDataId[]}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valueRequirements(MarketDataId[])}
   */
  @Test
  @DisplayName(
      "Test Builder valueRequirements(MarketDataId[]) with 'MarketDataId[]'; when MarketDataId; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valueRequirements(MarketDataId[])"})
  void testBuilderValueRequirementsWithMarketDataId_whenMarketDataId_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualValueRequirementsResult =
        builderResult.valueRequirements(mock(MarketDataId.class));

    // Assert
    assertSame(builderResult, actualValueRequirementsResult);
  }

  /**
   * Test Builder {@link Builder#valueRequirements(MarketDataId[])} with {@code MarketDataId[]}.
   *
   * <ul>
   *   <li>When {@link CalculationParametersId#STANDARD} and {@link MarketDataId}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valueRequirements(MarketDataId[])}
   */
  @Test
  @DisplayName(
      "Test Builder valueRequirements(MarketDataId[]) with 'MarketDataId[]'; when STANDARD and MarketDataId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valueRequirements(MarketDataId[])"})
  void testBuilderValueRequirementsWithMarketDataId_whenStandardAndMarketDataId() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualValueRequirementsResult =
        builderResult.valueRequirements(CalculationParametersId.STANDARD, mock(MarketDataId.class));

    // Assert
    assertSame(builderResult, actualValueRequirementsResult);
  }

  /**
   * Test Builder {@link Builder#valueRequirements(MarketDataId[])} with {@code MarketDataId[]}.
   *
   * <ul>
   *   <li>When standard and {@link MarketDataId}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valueRequirements(MarketDataId[])}
   */
  @Test
  @DisplayName(
      "Test Builder valueRequirements(MarketDataId[]) with 'MarketDataId[]'; when standard and MarketDataId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valueRequirements(MarketDataId[])"})
  void testBuilderValueRequirementsWithMarketDataId_whenStandardAndMarketDataId2() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualValueRequirementsResult =
        builderResult.valueRequirements(FxMatrixId.standard(), mock(MarketDataId.class));

    // Assert
    assertSame(builderResult, actualValueRequirementsResult);
  }

  /**
   * Test Builder {@link Builder#valueRequirements(MarketDataId[])} with {@code MarketDataId[]}.
   *
   * <ul>
   *   <li>When {@link CalculationParametersId#STANDARD} and {@link
   *       CalculationParametersId#STANDARD}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valueRequirements(MarketDataId[])}
   */
  @Test
  @DisplayName(
      "Test Builder valueRequirements(MarketDataId[]) with 'MarketDataId[]'; when STANDARD and STANDARD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valueRequirements(MarketDataId[])"})
  void testBuilderValueRequirementsWithMarketDataId_whenStandardAndStandard() {
    // Arrange
    Builder builderResult = FunctionRequirements.builder();

    // Act
    Builder actualValueRequirementsResult =
        builderResult.valueRequirements(
            CalculationParametersId.STANDARD, CalculationParametersId.STANDARD);

    // Assert
    assertSame(builderResult, actualValueRequirementsResult);
  }

  /**
   * Test {@link FunctionRequirements#empty()}.
   *
   * <p>Method under test: {@link FunctionRequirements#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements FunctionRequirements.empty()"})
  void testEmpty() {
    // Arrange and Act
    FunctionRequirements actualEmptyResult = FunctionRequirements.empty();

    // Assert
    ObservableSource observableSource = actualEmptyResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    ImmutableSet<Currency> outputCurrencies = actualEmptyResult.getOutputCurrencies();
    assertTrue(outputCurrencies.isEmpty());
    assertSame(outputCurrencies, actualEmptyResult.getTimeSeriesRequirements());
    assertSame(outputCurrencies, actualEmptyResult.getValueRequirements());
  }

  /**
   * Test {@link FunctionRequirements#combinedWith(FunctionRequirements)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FunctionRequirements#combinedWith(FunctionRequirements)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(FunctionRequirements); given empty; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FunctionRequirements FunctionRequirements.combinedWith(FunctionRequirements)"
  })
  void testCombinedWith_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange
    FunctionRequirements emptyResult = FunctionRequirements.empty();
    FunctionRequirements other = FunctionRequirements.empty();

    // Act
    FunctionRequirements actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link FunctionRequirements#meta()}.
   *
   * <p>Method under test: {@link FunctionRequirements#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FunctionRequirements.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FunctionRequirements.meta();

    // Assert
    assertTrue(actualMetaResult.observableSource() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.outputCurrencies() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.timeSeriesRequirements() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.valueRequirements() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link FunctionRequirements#metaBean()}.
   *
   * <p>Method under test: {@link FunctionRequirements#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FunctionRequirements.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, FunctionRequirements.empty().metaBean());
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
    Class<? extends FunctionRequirements> actualBeanTypeResult =
        FunctionRequirements.meta().beanType();

    // Assert
    Class<FunctionRequirements> expectedBeanTypeResult = FunctionRequirements.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#builder()}.
   *
   * <p>Method under test: {@link Meta#builder()}
   */
  @Test
  @DisplayName("Test Meta builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Meta.builder()"})
  void testMetaBuilder() {
    // Arrange, Act and Assert
    FunctionRequirements functionRequirements = FunctionRequirements.meta().builder().build();
    ObservableSource observableSource = functionRequirements.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    ImmutableSet<Currency> outputCurrencies = functionRequirements.getOutputCurrencies();
    assertTrue(outputCurrencies.isEmpty());
    assertSame(outputCurrencies, functionRequirements.getTimeSeriesRequirements());
    assertSame(outputCurrencies, functionRequirements.getValueRequirements());
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#observableSource()}
   *   <li>{@link Meta#outputCurrencies()}
   *   <li>{@link Meta#timeSeriesRequirements()}
   *   <li>{@link Meta#valueRequirements()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.observableSource()",
    "MetaProperty Meta.outputCurrencies()",
    "MetaProperty Meta.timeSeriesRequirements()",
    "MetaProperty Meta.valueRequirements()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FunctionRequirements.meta();

    // Act
    MetaProperty<ObservableSource> actualObservableSourceResult = metaResult.observableSource();
    MetaProperty<ImmutableSet<Currency>> actualOutputCurrenciesResult =
        metaResult.outputCurrencies();
    MetaProperty<ImmutableSet<ObservableId>> actualTimeSeriesRequirementsResult =
        metaResult.timeSeriesRequirements();

    // Assert
    assertTrue(actualObservableSourceResult instanceof DirectMetaProperty);
    assertTrue(actualOutputCurrenciesResult instanceof DirectMetaProperty);
    assertTrue(actualTimeSeriesRequirementsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valueRequirements() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code timeSeriesRequirements}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'timeSeriesRequirements'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsTimeSeriesRequirements() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FunctionRequirements.meta().metaPropertyGet("timeSeriesRequirements");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ObservableSource> observableSourceResult =
        ((Meta) metaBeanResult).observableSource();
    assertTrue(observableSourceResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<Currency>> outputCurrenciesResult =
        ((Meta) metaBeanResult).outputCurrencies();
    assertTrue(outputCurrenciesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<? extends MarketDataId<?>>> valueRequirementsResult =
        ((Meta) metaBeanResult).valueRequirements();
    assertTrue(valueRequirementsResult instanceof DirectMetaProperty);
    assertEquals("timeSeriesRequirements", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeSeriesRequirements());
    assertSame(metaBeanResult, observableSourceResult.metaBean());
    assertSame(metaBeanResult, outputCurrenciesResult.metaBean());
    assertSame(metaBeanResult, valueRequirementsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code observableSource}.
   *   <li>Then return name is {@code observableSource}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'observableSource'; then return name is 'observableSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenObservableSource_thenReturnNameIsObservableSource() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FunctionRequirements.meta().metaPropertyGet("observableSource");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<Currency>> outputCurrenciesResult =
        ((Meta) metaBeanResult).outputCurrencies();
    assertTrue(outputCurrenciesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<ObservableId>> timeSeriesRequirementsResult =
        ((Meta) metaBeanResult).timeSeriesRequirements();
    assertTrue(timeSeriesRequirementsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<? extends MarketDataId<?>>> valueRequirementsResult =
        ((Meta) metaBeanResult).valueRequirements();
    assertTrue(valueRequirementsResult instanceof DirectMetaProperty);
    assertEquals("observableSource", actualMetaPropertyGetResult.name());
    Class<ObservableSource> expectedPropertyTypeResult = ObservableSource.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).observableSource());
    assertSame(metaBeanResult, outputCurrenciesResult.metaBean());
    assertSame(metaBeanResult, timeSeriesRequirementsResult.metaBean());
    assertSame(metaBeanResult, valueRequirementsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code outputCurrencies}.
   *   <li>Then return name is {@code outputCurrencies}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'outputCurrencies'; then return name is 'outputCurrencies'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenOutputCurrencies_thenReturnNameIsOutputCurrencies() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FunctionRequirements.meta().metaPropertyGet("outputCurrencies");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ObservableSource> observableSourceResult =
        ((Meta) metaBeanResult).observableSource();
    assertTrue(observableSourceResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<ObservableId>> timeSeriesRequirementsResult =
        ((Meta) metaBeanResult).timeSeriesRequirements();
    assertTrue(timeSeriesRequirementsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<? extends MarketDataId<?>>> valueRequirementsResult =
        ((Meta) metaBeanResult).valueRequirements();
    assertTrue(valueRequirementsResult instanceof DirectMetaProperty);
    assertEquals("outputCurrencies", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).outputCurrencies());
    assertSame(metaBeanResult, observableSourceResult.metaBean());
    assertSame(metaBeanResult, timeSeriesRequirementsResult.metaBean());
    assertSame(metaBeanResult, valueRequirementsResult.metaBean());
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
    assertNull(FunctionRequirements.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valueRequirements}.
   *   <li>Then return name is {@code valueRequirements}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valueRequirements'; then return name is 'valueRequirements'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValueRequirements_thenReturnNameIsValueRequirements() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FunctionRequirements.meta().metaPropertyGet("valueRequirements");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ObservableSource> observableSourceResult =
        ((Meta) metaBeanResult).observableSource();
    assertTrue(observableSourceResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<Currency>> outputCurrenciesResult =
        ((Meta) metaBeanResult).outputCurrencies();
    assertTrue(outputCurrenciesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<ObservableId>> timeSeriesRequirementsResult =
        ((Meta) metaBeanResult).timeSeriesRequirements();
    assertTrue(timeSeriesRequirementsResult instanceof DirectMetaProperty);
    assertEquals("valueRequirements", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valueRequirements());
    assertSame(metaBeanResult, observableSourceResult.metaBean());
    assertSame(metaBeanResult, outputCurrenciesResult.metaBean());
    assertSame(metaBeanResult, timeSeriesRequirementsResult.metaBean());
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
        FunctionRequirements.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("observableSource") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("outputCurrencies") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("timeSeriesRequirements") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("valueRequirements") instanceof DirectMetaProperty);
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
    assertNull(FunctionRequirements.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when empty; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEmpty_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = FunctionRequirements.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(FunctionRequirements.empty(), "Property Name", false));
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
            FunctionRequirements.meta()
                .propertySet(mock(Bean.class), "observableSource", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code observableSource}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'observableSource'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenObservableSource_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FunctionRequirements.meta()
                .propertySet(mock(Bean.class), "observableSource", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code outputCurrencies}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'outputCurrencies'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenOutputCurrencies_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FunctionRequirements.meta()
                .propertySet(mock(Bean.class), "outputCurrencies", "New Value", true));
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
            FunctionRequirements.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeSeriesRequirements}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'timeSeriesRequirements'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTimeSeriesRequirements_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FunctionRequirements.meta()
                .propertySet(mock(Bean.class), "timeSeriesRequirements", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valueRequirements}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valueRequirements'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValueRequirements_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FunctionRequirements.meta()
                .propertySet(mock(Bean.class), "valueRequirements", "New Value", true));
  }
}
