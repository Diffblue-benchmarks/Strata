package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.data.TestingObservableId;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableScenarioMarketDataBuilderDiffblueTest {
  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#values(Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#values(Map)}
   */
  @Test
  @DisplayName(
      "Test values(Map); given 'java.lang.Object'; then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.values(Map)"
  })
  void testValues_givenJavaLangObject_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act
    ImmutableScenarioMarketDataBuilder actualValuesResult = builderResult.values(values);

    // Assert
    verify(marketDataId).getMarketDataType();
    assertSame(builderResult, actualValuesResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#values(Map)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#values(Map)}
   */
  @Test
  @DisplayName("Test values(Map); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.values(Map)"
  })
  void testValues_thenThrowIllegalArgumentException() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    when(marketDataId.getMarketDataType()).thenThrow(new IllegalArgumentException());

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> builderResult.values(values));
    verify(marketDataId).getMarketDataType();
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#values(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#values(Map)}
   */
  @Test
  @DisplayName(
      "Test values(Map); when HashMap(); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.values(Map)"
  })
  void testValues_whenHashMap_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableScenarioMarketDataBuilder actualValuesResult = builderResult.values(new HashMap<>());

    // Assert
    assertSame(builderResult, actualValuesResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#timeSeries(Map)}.
   *
   * <ul>
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#timeSeries(Map)}
   */
  @Test
  @DisplayName("Test timeSeries(Map); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.timeSeries(Map)"
  })
  void testTimeSeries_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableScenarioMarketDataBuilder actualTimeSeriesResult =
        builderResult.timeSeries(new HashMap<>());

    // Assert
    assertSame(builderResult, actualTimeSeriesResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addValue(MarketDataId, Object)}.
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addValue(MarketDataId, Object)}
   */
  @Test
  @DisplayName("Test addValue(MarketDataId, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addValue(MarketDataId, Object)"
  })
  void testAddValue() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);

    ImmutableScenarioMarketDataBuilder immutableScenarioMarketDataBuilder =
        new ImmutableScenarioMarketDataBuilder(valuationDate);
    immutableScenarioMarketDataBuilder.addValueMap(new HashMap<>());

    // Act
    ImmutableScenarioMarketDataBuilder actualAddValueResult =
        immutableScenarioMarketDataBuilder.addValue(mock(MarketDataId.class), "Value");

    // Assert
    assertSame(immutableScenarioMarketDataBuilder, actualAddValueResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addValueMap(Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addValueMap(Map)}
   */
  @Test
  @DisplayName("Test addValueMap(Map); given 'java.lang.Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addValueMap(Map)"
  })
  void testAddValueMap_givenJavaLangObject() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act
    ImmutableScenarioMarketDataBuilder actualAddValueMapResult = builderResult.addValueMap(values);

    // Assert
    verify(marketDataId).getMarketDataType();
    assertSame(builderResult, actualAddValueMapResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addValueMap(Map)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addValueMap(Map)}
   */
  @Test
  @DisplayName("Test addValueMap(Map); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addValueMap(Map)"
  })
  void testAddValueMap_thenThrowIllegalArgumentException() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    when(marketDataId.getMarketDataType()).thenThrow(new IllegalArgumentException());

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> builderResult.addValueMap(values));
    verify(marketDataId).getMarketDataType();
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addValueMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addValueMap(Map)}
   */
  @Test
  @DisplayName(
      "Test addValueMap(Map); when HashMap(); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addValueMap(Map)"
  })
  void testAddValueMap_whenHashMap_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableScenarioMarketDataBuilder actualAddValueMapResult =
        builderResult.addValueMap(new HashMap<>());

    // Assert
    assertSame(builderResult, actualAddValueMapResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addScenarioValue(MarketDataId, List)} with
   * {@code id}, {@code values}.
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addScenarioValue(MarketDataId,
   * List)}
   */
  @Test
  @DisplayName("Test addScenarioValue(MarketDataId, List) with 'id', 'values'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addScenarioValue(MarketDataId, List)"
  })
  void testAddScenarioValueWithIdValues() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);
    builderResult.addScenarioValue(id, new ArrayList<>());
    MarketDataId<Object> id2 = mock(MarketDataId.class);

    // Act
    ImmutableScenarioMarketDataBuilder actualAddScenarioValueResult =
        builderResult.addScenarioValue(id2, new ArrayList<>());

    // Assert
    assertSame(builderResult, actualAddScenarioValueResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addScenarioValue(MarketDataId, List)} with
   * {@code id}, {@code values}.
   *
   * <ul>
   *   <li>Given builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addScenarioValue(MarketDataId,
   * List)}
   */
  @Test
  @DisplayName(
      "Test addScenarioValue(MarketDataId, List) with 'id', 'values'; given builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addScenarioValue(MarketDataId, List)"
  })
  void testAddScenarioValueWithIdValues_givenBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);

    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    ImmutableScenarioMarketDataBuilder actualAddScenarioValueResult =
        builderResult.addScenarioValue(id, values);

    // Assert
    assertSame(builderResult, actualAddScenarioValueResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addScenarioValue(MarketDataId, List)} with
   * {@code id}, {@code values}.
   *
   * <ul>
   *   <li>Given builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addScenarioValue(MarketDataId,
   * List)}
   */
  @Test
  @DisplayName(
      "Test addScenarioValue(MarketDataId, List) with 'id', 'values'; given builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addScenarioValue(MarketDataId, List)"
  })
  void testAddScenarioValueWithIdValues_givenBuilderLocalDateWith1970AndOneAndOne2() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);

    ArrayList<Object> values = new ArrayList<>();
    values.add("42");
    values.add("42");

    // Act
    ImmutableScenarioMarketDataBuilder actualAddScenarioValueResult =
        builderResult.addScenarioValue(id, values);

    // Assert
    assertSame(builderResult, actualAddScenarioValueResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addScenarioValue(MarketDataId, List)} with
   * {@code id}, {@code values}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addScenarioValue(MarketDataId,
   * List)}
   */
  @Test
  @DisplayName(
      "Test addScenarioValue(MarketDataId, List) with 'id', 'values'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addScenarioValue(MarketDataId, List)"
  })
  void testAddScenarioValueWithIdValues_thenThrowIllegalArgumentException() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);
    builderResult.addScenarioValue(id, new ArrayList<>());
    MarketDataId<Object> id2 = mock(MarketDataId.class);

    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> builderResult.addScenarioValue(id2, values));
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addScenarioValue(MarketDataId, List)} with
   * {@code id}, {@code values}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addScenarioValue(MarketDataId,
   * List)}
   */
  @Test
  @DisplayName("Test addScenarioValue(MarketDataId, List) with 'id', 'values'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addScenarioValue(MarketDataId, List)"
  })
  void testAddScenarioValueWithIdValues_whenArrayList() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);

    // Act
    ImmutableScenarioMarketDataBuilder actualAddScenarioValueResult =
        builderResult.addScenarioValue(id, new ArrayList<>());

    // Assert
    assertSame(builderResult, actualAddScenarioValueResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addScenarioValueMap(Map)}.
   *
   * <ul>
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addScenarioValueMap(Map)}
   */
  @Test
  @DisplayName(
      "Test addScenarioValueMap(Map); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addScenarioValueMap(Map)"
  })
  void testAddScenarioValueMap_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableScenarioMarketDataBuilder actualAddScenarioValueMapResult =
        builderResult.addScenarioValueMap(new HashMap<>());

    // Assert
    assertSame(builderResult, actualAddScenarioValueMapResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addBox(MarketDataId, MarketDataBox)}.
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addBox(MarketDataId,
   * MarketDataBox)}
   */
  @Test
  @DisplayName("Test addBox(MarketDataId, MarketDataBox)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addBox(MarketDataId, MarketDataBox)"
  })
  void testAddBox() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);
    builderResult.addScenarioValue(id, new ArrayList<>());
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    ScenarioMarketDataBox<?> value = ScenarioMarketDataBox.of(new ArrayList<>());

    // Act
    ImmutableScenarioMarketDataBuilder actualAddBoxResult = builderResult.addBox(id2, value);

    // Assert
    assertSame(builderResult, actualAddBoxResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addBox(MarketDataId, MarketDataBox)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>When of {@link ArrayList#ArrayList()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addBox(MarketDataId,
   * MarketDataBox)}
   */
  @Test
  @DisplayName(
      "Test addBox(MarketDataId, MarketDataBox); given ArrayList() add '42'; when of ArrayList(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addBox(MarketDataId, MarketDataBox)"
  })
  void testAddBox_givenArrayListAdd42_whenOfArrayList_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));
    builderResult.addScenarioValue(mock(MarketDataId.class), values);
    MarketDataId<Object> id = mock(MarketDataId.class);
    ScenarioMarketDataBox<?> value = ScenarioMarketDataBox.of(new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> builderResult.addBox(id, value));
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addBox(MarketDataId, MarketDataBox)}.
   *
   * <ul>
   *   <li>When {@link EmptyMarketDataBox} (default constructor).
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addBox(MarketDataId,
   * MarketDataBox)}
   */
  @Test
  @DisplayName(
      "Test addBox(MarketDataId, MarketDataBox); when EmptyMarketDataBox (default constructor); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addBox(MarketDataId, MarketDataBox)"
  })
  void testAddBox_whenEmptyMarketDataBox_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);

    // Act
    ImmutableScenarioMarketDataBuilder actualAddBoxResult =
        builderResult.addBox(id, new EmptyMarketDataBox());

    // Assert
    assertSame(builderResult, actualAddBoxResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addBox(MarketDataId, MarketDataBox)}.
   *
   * <ul>
   *   <li>When of {@link ArrayList#ArrayList()}.
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addBox(MarketDataId,
   * MarketDataBox)}
   */
  @Test
  @DisplayName(
      "Test addBox(MarketDataId, MarketDataBox); when of ArrayList(); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addBox(MarketDataId, MarketDataBox)"
  })
  void testAddBox_whenOfArrayList_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);
    ScenarioMarketDataBox<?> value = ScenarioMarketDataBox.of(new ArrayList<>());

    // Act
    ImmutableScenarioMarketDataBuilder actualAddBoxResult = builderResult.addBox(id, value);

    // Assert
    assertSame(builderResult, actualAddBoxResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addBox(MarketDataId, MarketDataBox)}.
   *
   * <ul>
   *   <li>When of {@code Value}.
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addBox(MarketDataId,
   * MarketDataBox)}
   */
  @Test
  @DisplayName(
      "Test addBox(MarketDataId, MarketDataBox); when of 'Value'; then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addBox(MarketDataId, MarketDataBox)"
  })
  void testAddBox_whenOfValue_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);
    SingleMarketDataBox<?> value = SingleMarketDataBox.of("Value");

    // Act
    ImmutableScenarioMarketDataBuilder actualAddBoxResult = builderResult.addBox(id, value);

    // Assert
    assertSame(builderResult, actualAddBoxResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addBoxMap(Map)}.
   *
   * <ul>
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addBoxMap(Map)}
   */
  @Test
  @DisplayName("Test addBoxMap(Map); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addBoxMap(Map)"
  })
  void testAddBoxMap_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableScenarioMarketDataBuilder actualAddBoxMapResult =
        builderResult.addBoxMap(new HashMap<>());

    // Assert
    assertSame(builderResult, actualAddBoxMapResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addTimeSeries(ObservableId,
   * LocalDateDoubleTimeSeries)}.
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addTimeSeries(ObservableId,
   * LocalDateDoubleTimeSeries)}
   */
  @Test
  @DisplayName("Test addTimeSeries(ObservableId, LocalDateDoubleTimeSeries)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addTimeSeries(ObservableId, LocalDateDoubleTimeSeries)"
  })
  void testAddTimeSeries() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    ImmutableScenarioMarketDataBuilder immutableScenarioMarketDataBuilder =
        new ImmutableScenarioMarketDataBuilder(valuationDate);

    // Act
    ImmutableScenarioMarketDataBuilder actualAddTimeSeriesResult =
        immutableScenarioMarketDataBuilder.addTimeSeries(
            new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Assert
    assertSame(immutableScenarioMarketDataBuilder, actualAddTimeSeriesResult);
  }

  /**
   * Test {@link ImmutableScenarioMarketDataBuilder#addTimeSeriesMap(Map)}.
   *
   * <ul>
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableScenarioMarketDataBuilder#addTimeSeriesMap(Map)}
   */
  @Test
  @DisplayName(
      "Test addTimeSeriesMap(Map); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableScenarioMarketDataBuilder ImmutableScenarioMarketDataBuilder.addTimeSeriesMap(Map)"
  })
  void testAddTimeSeriesMap_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableScenarioMarketDataBuilder builderResult =
        ImmutableScenarioMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableScenarioMarketDataBuilder actualAddTimeSeriesMapResult =
        builderResult.addTimeSeriesMap(new HashMap<>());

    // Assert
    assertSame(builderResult, actualAddTimeSeriesMapResult);
  }
}
