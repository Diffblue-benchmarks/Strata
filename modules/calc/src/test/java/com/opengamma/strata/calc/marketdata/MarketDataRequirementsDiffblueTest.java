package com.opengamma.strata.calc.marketdata;

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
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.marketdata.MarketDataRequirements.Meta;
import com.opengamma.strata.calc.runner.CalculationParametersId;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableId;
import java.util.ArrayList;
import java.util.List;
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

class MarketDataRequirementsDiffblueTest {
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
    Class<? extends MarketDataRequirements> actualBeanTypeResult =
        MarketDataRequirements.meta().beanType();

    // Assert
    Class<MarketDataRequirements> expectedBeanTypeResult = MarketDataRequirements.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#nonObservables()}
   *   <li>{@link Meta#observables()}
   *   <li>{@link Meta#outputCurrencies()}
   *   <li>{@link Meta#timeSeries()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.nonObservables()",
    "MetaProperty Meta.observables()",
    "MetaProperty Meta.outputCurrencies()",
    "MetaProperty Meta.timeSeries()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = MarketDataRequirements.meta();

    // Act
    MetaProperty<ImmutableSet<MarketDataId<?>>> actualNonObservablesResult =
        metaResult.nonObservables();
    MetaProperty<ImmutableSet<ObservableId>> actualObservablesResult = metaResult.observables();
    MetaProperty<ImmutableSet<Currency>> actualOutputCurrenciesResult =
        metaResult.outputCurrencies();

    // Assert
    assertTrue(actualNonObservablesResult instanceof DirectMetaProperty);
    assertTrue(actualObservablesResult instanceof DirectMetaProperty);
    assertTrue(actualOutputCurrenciesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.timeSeries() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code nonObservables}.
   *   <li>Then return name is {@code nonObservables}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'nonObservables'; then return name is 'nonObservables'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenNonObservables_thenReturnNameIsNonObservables() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        MarketDataRequirements.meta().metaPropertyGet("nonObservables");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<ObservableId>> observablesResult =
        ((Meta) metaBeanResult).observables();
    assertTrue(observablesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<Currency>> outputCurrenciesResult =
        ((Meta) metaBeanResult).outputCurrencies();
    assertTrue(outputCurrenciesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<ObservableId>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    assertEquals("nonObservables", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).nonObservables());
    assertSame(metaBeanResult, observablesResult.metaBean());
    assertSame(metaBeanResult, outputCurrenciesResult.metaBean());
    assertSame(metaBeanResult, timeSeriesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code observables}.
   *   <li>Then return name is {@code observables}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'observables'; then return name is 'observables'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenObservables_thenReturnNameIsObservables() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        MarketDataRequirements.meta().metaPropertyGet("observables");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<MarketDataId<?>>> nonObservablesResult =
        ((Meta) metaBeanResult).nonObservables();
    assertTrue(nonObservablesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<Currency>> outputCurrenciesResult =
        ((Meta) metaBeanResult).outputCurrencies();
    assertTrue(outputCurrenciesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<ObservableId>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    assertEquals("observables", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).observables());
    assertSame(metaBeanResult, nonObservablesResult.metaBean());
    assertSame(metaBeanResult, outputCurrenciesResult.metaBean());
    assertSame(metaBeanResult, timeSeriesResult.metaBean());
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
        MarketDataRequirements.meta().metaPropertyGet("outputCurrencies");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<MarketDataId<?>>> nonObservablesResult =
        ((Meta) metaBeanResult).nonObservables();
    assertTrue(nonObservablesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<ObservableId>> observablesResult =
        ((Meta) metaBeanResult).observables();
    assertTrue(observablesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<ObservableId>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    assertEquals("outputCurrencies", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).outputCurrencies());
    assertSame(metaBeanResult, nonObservablesResult.metaBean());
    assertSame(metaBeanResult, observablesResult.metaBean());
    assertSame(metaBeanResult, timeSeriesResult.metaBean());
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
    assertNull(MarketDataRequirements.meta().metaPropertyGet("Property Name"));
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
        MarketDataRequirements.meta().metaPropertyGet("timeSeries");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<MarketDataId<?>>> nonObservablesResult =
        ((Meta) metaBeanResult).nonObservables();
    assertTrue(nonObservablesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<ObservableId>> observablesResult =
        ((Meta) metaBeanResult).observables();
    assertTrue(observablesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<Currency>> outputCurrenciesResult =
        ((Meta) metaBeanResult).outputCurrencies();
    assertTrue(outputCurrenciesResult instanceof DirectMetaProperty);
    assertEquals("timeSeries", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeSeries());
    assertSame(metaBeanResult, nonObservablesResult.metaBean());
    assertSame(metaBeanResult, observablesResult.metaBean());
    assertSame(metaBeanResult, outputCurrenciesResult.metaBean());
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
        MarketDataRequirements.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("nonObservables") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("observables") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("outputCurrencies") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("timeSeries") instanceof DirectMetaProperty);
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
    assertNull(MarketDataRequirements.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = MarketDataRequirements.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(MarketDataRequirements.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code nonObservables}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'nonObservables'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenNonObservables_thenReturnSet() {
    // Arrange
    Meta metaResult = MarketDataRequirements.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(MarketDataRequirements.empty(), "nonObservables", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Set);
    assertTrue(((Set<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code observables}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'observables'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenObservables_thenReturnSet() {
    // Arrange
    Meta metaResult = MarketDataRequirements.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(MarketDataRequirements.empty(), "observables", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Set);
    assertTrue(((Set<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code outputCurrencies}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'outputCurrencies'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenOutputCurrencies_thenReturnSet() {
    // Arrange
    Meta metaResult = MarketDataRequirements.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(MarketDataRequirements.empty(), "outputCurrencies", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Set);
    assertTrue(((Set<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeSeries}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'timeSeries'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTimeSeries_thenReturnSet() {
    // Arrange
    Meta metaResult = MarketDataRequirements.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(MarketDataRequirements.empty(), "timeSeries", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Set);
    assertTrue(((Set<Object>) actualPropertyGetResult).isEmpty());
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
            MarketDataRequirements.meta()
                .propertySet(mock(Bean.class), "nonObservables", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code nonObservables}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'nonObservables'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenNonObservables_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            MarketDataRequirements.meta()
                .propertySet(mock(Bean.class), "nonObservables", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code observables}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'observables'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenObservables_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            MarketDataRequirements.meta()
                .propertySet(mock(Bean.class), "observables", "New Value", true));
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
            MarketDataRequirements.meta()
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
            MarketDataRequirements.meta()
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
            MarketDataRequirements.meta()
                .propertySet(mock(Bean.class), "timeSeries", "New Value", true));
  }

  /**
   * Test {@link MarketDataRequirements#of(MarketDataId)} with {@code id}.
   *
   * <ul>
   *   <li>Then return Observables size is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirements#of(MarketDataId)}
   */
  @Test
  @DisplayName("Test of(MarketDataId) with 'id'; then return Observables size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataRequirements MarketDataRequirements.of(MarketDataId)"})
  void testOfWithId_thenReturnObservablesSizeIsOne() {
    // Arrange and Act
    MarketDataRequirements actualOfResult =
        MarketDataRequirements.of(new MarketDataNodeTest().new TestIdA("42"));

    // Assert
    assertEquals(1, actualOfResult.getObservables().size());
    ImmutableSet<MarketDataId<?>> nonObservables = actualOfResult.getNonObservables();
    assertTrue(nonObservables.isEmpty());
    assertSame(nonObservables, actualOfResult.getOutputCurrencies());
    assertSame(nonObservables, actualOfResult.getTimeSeries());
  }

  /**
   * Test {@link MarketDataRequirements#of(MarketDataId)} with {@code id}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   *   <li>Then return NonObservables size is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirements#of(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataId) with 'id'; when MarketDataId; then return NonObservables size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataRequirements MarketDataRequirements.of(MarketDataId)"})
  void testOfWithId_whenMarketDataId_thenReturnNonObservablesSizeIsOne() {
    // Arrange and Act
    MarketDataRequirements actualOfResult = MarketDataRequirements.of(mock(MarketDataId.class));

    // Assert
    assertEquals(1, actualOfResult.getNonObservables().size());
    ImmutableSet<ObservableId> observables = actualOfResult.getObservables();
    assertTrue(observables.isEmpty());
    assertSame(observables, actualOfResult.getOutputCurrencies());
    assertSame(observables, actualOfResult.getTimeSeries());
  }

  /**
   * Test {@link MarketDataRequirements#of(MarketDataId)} with {@code id}.
   *
   * <ul>
   *   <li>When {@link CalculationParametersId#STANDARD}.
   *   <li>Then return NonObservables size is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirements#of(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataId) with 'id'; when STANDARD; then return NonObservables size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataRequirements MarketDataRequirements.of(MarketDataId)"})
  void testOfWithId_whenStandard_thenReturnNonObservablesSizeIsOne() {
    // Arrange and Act
    MarketDataRequirements actualOfResult =
        MarketDataRequirements.of(CalculationParametersId.STANDARD);

    // Assert
    assertEquals(1, actualOfResult.getNonObservables().size());
    ImmutableSet<ObservableId> observables = actualOfResult.getObservables();
    assertTrue(observables.isEmpty());
    assertSame(observables, actualOfResult.getOutputCurrencies());
    assertSame(observables, actualOfResult.getTimeSeries());
  }

  /**
   * Test {@link MarketDataRequirements#empty()}.
   *
   * <p>Method under test: {@link MarketDataRequirements#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataRequirements MarketDataRequirements.empty()"})
  void testEmpty() {
    // Arrange and Act
    MarketDataRequirements actualEmptyResult = MarketDataRequirements.empty();

    // Assert
    ImmutableSet<MarketDataId<?>> nonObservables = actualEmptyResult.getNonObservables();
    assertTrue(nonObservables.isEmpty());
    assertSame(nonObservables, actualEmptyResult.getObservables());
    assertSame(nonObservables, actualEmptyResult.getOutputCurrencies());
    assertSame(nonObservables, actualEmptyResult.getTimeSeries());
  }

  /**
   * Test {@link MarketDataRequirements#combine(List)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link ArrayList#ArrayList()} add empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirements#combine(List)}
   */
  @Test
  @DisplayName("Test combine(List); given empty; when ArrayList() add empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataRequirements MarketDataRequirements.combine(List)"})
  void testCombine_givenEmpty_whenArrayListAddEmpty_thenReturnEmpty() {
    // Arrange
    ArrayList<MarketDataRequirements> requirements = new ArrayList<>();
    MarketDataRequirements emptyResult = MarketDataRequirements.empty();
    requirements.add(emptyResult);

    // Act and Assert
    assertEquals(emptyResult, MarketDataRequirements.combine(requirements));
  }

  /**
   * Test {@link MarketDataRequirements#combine(List)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link ArrayList#ArrayList()} add empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirements#combine(List)}
   */
  @Test
  @DisplayName("Test combine(List); given empty; when ArrayList() add empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataRequirements MarketDataRequirements.combine(List)"})
  void testCombine_givenEmpty_whenArrayListAddEmpty_thenReturnEmpty2() {
    // Arrange
    ArrayList<MarketDataRequirements> requirements = new ArrayList<>();
    requirements.add(MarketDataRequirements.empty());
    MarketDataRequirements emptyResult = MarketDataRequirements.empty();
    requirements.add(emptyResult);

    // Act and Assert
    assertEquals(emptyResult, MarketDataRequirements.combine(requirements));
  }

  /**
   * Test {@link MarketDataRequirements#combine(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return NonObservables Empty.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirements#combine(List)}
   */
  @Test
  @DisplayName("Test combine(List); when ArrayList(); then return NonObservables Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataRequirements MarketDataRequirements.combine(List)"})
  void testCombine_whenArrayList_thenReturnNonObservablesEmpty() {
    // Arrange and Act
    MarketDataRequirements actualCombineResult = MarketDataRequirements.combine(new ArrayList<>());

    // Assert
    ImmutableSet<MarketDataId<?>> nonObservables = actualCombineResult.getNonObservables();
    assertTrue(nonObservables.isEmpty());
    assertSame(nonObservables, actualCombineResult.getObservables());
    assertSame(nonObservables, actualCombineResult.getOutputCurrencies());
    assertSame(nonObservables, actualCombineResult.getTimeSeries());
  }

  /**
   * Test {@link MarketDataRequirements#meta()}.
   *
   * <p>Method under test: {@link MarketDataRequirements#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MarketDataRequirements.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = MarketDataRequirements.meta();

    // Assert
    assertTrue(actualMetaResult.nonObservables() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.observables() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.outputCurrencies() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.timeSeries() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link MarketDataRequirements#metaBean()}.
   *
   * <p>Method under test: {@link MarketDataRequirements#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MarketDataRequirements.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, MarketDataRequirements.empty().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataRequirements#toString()}
   *   <li>{@link MarketDataRequirements#getNonObservables()}
   *   <li>{@link MarketDataRequirements#getObservables()}
   *   <li>{@link MarketDataRequirements#getOutputCurrencies()}
   *   <li>{@link MarketDataRequirements#getTimeSeries()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet MarketDataRequirements.getNonObservables()",
    "ImmutableSet MarketDataRequirements.getObservables()",
    "ImmutableSet MarketDataRequirements.getOutputCurrencies()",
    "ImmutableSet MarketDataRequirements.getTimeSeries()",
    "String MarketDataRequirements.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    MarketDataRequirements emptyResult = MarketDataRequirements.empty();

    // Act
    String actualToStringResult = emptyResult.toString();
    ImmutableSet<MarketDataId<?>> actualNonObservables = emptyResult.getNonObservables();
    ImmutableSet<ObservableId> actualObservables = emptyResult.getObservables();
    ImmutableSet<Currency> actualOutputCurrencies = emptyResult.getOutputCurrencies();

    // Assert
    assertEquals(
        "MarketDataRequirements{observables=[], nonObservables=[], timeSeries=[], outputCurrencies=[]}",
        actualToStringResult);
    assertSame(actualNonObservables, actualObservables);
    assertSame(actualNonObservables, actualOutputCurrencies);
    assertSame(actualNonObservables, emptyResult.getTimeSeries());
  }

  /**
   * Test {@link MarketDataRequirements#equals(Object)}, and {@link
   * MarketDataRequirements#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataRequirements#equals(Object)}
   *   <li>{@link MarketDataRequirements#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataRequirements.equals(Object)",
    "int MarketDataRequirements.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MarketDataRequirements emptyResult = MarketDataRequirements.empty();
    MarketDataRequirements emptyResult2 = MarketDataRequirements.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link MarketDataRequirements#equals(Object)}, and {@link
   * MarketDataRequirements#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataRequirements#equals(Object)}
   *   <li>{@link MarketDataRequirements#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataRequirements.equals(Object)",
    "int MarketDataRequirements.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    MarketDataRequirements combineResult = MarketDataRequirements.combine(new ArrayList<>());
    MarketDataRequirements emptyResult = MarketDataRequirements.empty();

    // Act and Assert
    assertEquals(combineResult, emptyResult);
    assertEquals(combineResult.hashCode(), emptyResult.hashCode());
  }

  /**
   * Test {@link MarketDataRequirements#equals(Object)}, and {@link
   * MarketDataRequirements#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataRequirements#equals(Object)}
   *   <li>{@link MarketDataRequirements#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataRequirements.equals(Object)",
    "int MarketDataRequirements.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MarketDataRequirements emptyResult = MarketDataRequirements.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link MarketDataRequirements#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirements#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataRequirements.equals(Object)",
    "int MarketDataRequirements.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MarketDataRequirements combineResult = MarketDataRequirements.combine(new ArrayList<>());

    // Act and Assert
    assertNotEquals(combineResult, 1);
  }

  /**
   * Test {@link MarketDataRequirements#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirements#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataRequirements.equals(Object)",
    "int MarketDataRequirements.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(MarketDataRequirements.empty(), null);
  }

  /**
   * Test {@link MarketDataRequirements#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRequirements#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataRequirements.equals(Object)",
    "int MarketDataRequirements.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(MarketDataRequirements.empty(), "Different type to MarketDataRequirements");
  }
}
