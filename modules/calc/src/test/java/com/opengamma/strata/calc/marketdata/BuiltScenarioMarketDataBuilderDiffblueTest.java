package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.result.Failure;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.MarketDataBox;
import java.time.LocalDate;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BuiltScenarioMarketDataBuilderDiffblueTest {
  /**
   * Test {@link BuiltScenarioMarketDataBuilder#BuiltScenarioMarketDataBuilder(MarketDataBox)}.
   *
   * <p>Method under test: {@link
   * BuiltScenarioMarketDataBuilder#BuiltScenarioMarketDataBuilder(MarketDataBox)}
   */
  @Test
  @DisplayName("Test new BuiltScenarioMarketDataBuilder(MarketDataBox)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BuiltScenarioMarketDataBuilder.<init>(MarketDataBox)"})
  void testNewBuiltScenarioMarketDataBuilder() {
    // Arrange
    MarketDataBox<LocalDate> valuationDate = mock(MarketDataBox.class);
    when(valuationDate.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new BuiltScenarioMarketDataBuilder(valuationDate));
    verify(valuationDate).getScenarioCount();
  }

  /**
   * Test {@link BuiltScenarioMarketDataBuilder#BuiltScenarioMarketDataBuilder(MarketDataBox)}.
   *
   * <p>Method under test: {@link
   * BuiltScenarioMarketDataBuilder#BuiltScenarioMarketDataBuilder(MarketDataBox)}
   */
  @Test
  @DisplayName("Test new BuiltScenarioMarketDataBuilder(MarketDataBox)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BuiltScenarioMarketDataBuilder.<init>(MarketDataBox)"})
  void testNewBuiltScenarioMarketDataBuilder2() {
    // Arrange
    MarketDataBox<LocalDate> valuationDate = mock(MarketDataBox.class);
    when(valuationDate.isSingleValue()).thenThrow(new IllegalArgumentException());
    when(valuationDate.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new BuiltScenarioMarketDataBuilder(valuationDate));
    verify(valuationDate).getScenarioCount();
    verify(valuationDate).isSingleValue();
  }

  /**
   * Test {@link BuiltScenarioMarketDataBuilder#BuiltScenarioMarketDataBuilder(MarketDataBox)}.
   *
   * <ul>
   *   <li>Given zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BuiltScenarioMarketDataBuilder#BuiltScenarioMarketDataBuilder(MarketDataBox)}
   */
  @Test
  @DisplayName("Test new BuiltScenarioMarketDataBuilder(MarketDataBox); given zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BuiltScenarioMarketDataBuilder.<init>(MarketDataBox)"})
  void testNewBuiltScenarioMarketDataBuilder_givenZero() {
    // Arrange
    MarketDataBox<LocalDate> valuationDate = mock(MarketDataBox.class);
    when(valuationDate.getScenarioCount()).thenReturn(0);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new BuiltScenarioMarketDataBuilder(valuationDate));
    verify(valuationDate).getScenarioCount();
  }

  /**
   * Test {@link BuiltScenarioMarketDataBuilder#BuiltScenarioMarketDataBuilder(LocalDate)}.
   *
   * <ul>
   *   <li>Then return build ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * BuiltScenarioMarketDataBuilder#BuiltScenarioMarketDataBuilder(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test new BuiltScenarioMarketDataBuilder(LocalDate); then return build ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BuiltScenarioMarketDataBuilder.<init>(LocalDate)"})
  void testNewBuiltScenarioMarketDataBuilder_thenReturnBuildScenarioCountIsOne() {
    // Arrange, Act and Assert
    BuiltScenarioMarketData builtScenarioMarketData =
        new BuiltScenarioMarketDataBuilder(LocalDate.of(1970, 1, 1)).build();
    assertEquals(1, builtScenarioMarketData.getScenarioCount());
    ImmutableScenarioMarketData underlying = builtScenarioMarketData.getUnderlying();
    assertEquals(1, underlying.getScenarioCount());
    MarketDataBox<LocalDate> valuationDate = builtScenarioMarketData.getValuationDate();
    assertFalse(valuationDate.isScenarioValue());
    ImmutableMap<MarketDataId<?>, Failure> timeSeriesFailures =
        builtScenarioMarketData.getTimeSeriesFailures();
    assertTrue(timeSeriesFailures.isEmpty());
    Set<MarketDataId<?>> ids = builtScenarioMarketData.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, builtScenarioMarketData.getTimeSeriesIds());
    assertSame(ids, underlying.getIds());
    assertSame(ids, underlying.getTimeSeriesIds());
    assertSame(valuationDate, underlying.getValuationDate());
    assertSame(timeSeriesFailures, builtScenarioMarketData.getValueFailures());
    assertSame(timeSeriesFailures, underlying.getTimeSeries());
    assertSame(timeSeriesFailures, underlying.getValues());
  }

  /**
   * Test {@link BuiltScenarioMarketDataBuilder#addValue(MarketDataId, Object)}.
   *
   * <ul>
   *   <li>Given builder {@link MarketDataBox}.
   *   <li>Then return builder {@link MarketDataBox}.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketDataBuilder#addValue(MarketDataId, Object)}
   */
  @Test
  @DisplayName(
      "Test addValue(MarketDataId, Object); given builder MarketDataBox; then return builder MarketDataBox")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltScenarioMarketDataBuilder BuiltScenarioMarketDataBuilder.addValue(MarketDataId, Object)"
  })
  void testAddValue_givenBuilderMarketDataBox_thenReturnBuilderMarketDataBox() {
    // Arrange
    MarketDataBox<LocalDate> valuationDate = mock(MarketDataBox.class);
    when(valuationDate.isSingleValue()).thenReturn(true);
    when(valuationDate.getScenarioCount()).thenReturn(3);
    BuiltScenarioMarketDataBuilder builderResult = BuiltScenarioMarketData.builder(valuationDate);

    // Act
    BuiltScenarioMarketDataBuilder actualAddValueResult =
        builderResult.addValue(mock(MarketDataId.class), "Value");

    // Assert
    verify(valuationDate).getScenarioCount();
    verify(valuationDate).isSingleValue();
    assertSame(builderResult, actualAddValueResult);
  }

  /**
   * Test {@link BuiltScenarioMarketDataBuilder#addBox(MarketDataId, MarketDataBox)}.
   *
   * <p>Method under test: {@link BuiltScenarioMarketDataBuilder#addBox(MarketDataId,
   * MarketDataBox)}
   */
  @Test
  @DisplayName("Test addBox(MarketDataId, MarketDataBox)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltScenarioMarketDataBuilder BuiltScenarioMarketDataBuilder.addBox(MarketDataId, MarketDataBox)"
  })
  void testAddBox() {
    // Arrange
    MarketDataBox<LocalDate> valuationDate = mock(MarketDataBox.class);
    when(valuationDate.isSingleValue()).thenReturn(false);
    when(valuationDate.getScenarioCount()).thenReturn(3);
    BuiltScenarioMarketDataBuilder builtScenarioMarketDataBuilder =
        new BuiltScenarioMarketDataBuilder(valuationDate);

    MarketDataId<Object> id = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getMarketDataType()).thenReturn(forNameResult);

    MarketDataBox<Object> box = mock(MarketDataBox.class);
    Class<Object> forNameResult2 = Object.class;
    org.mockito.Mockito.<Class<?>>when(box.getMarketDataType()).thenReturn(forNameResult2);
    when(box.isSingleValue()).thenReturn(false);
    when(box.getScenarioCount()).thenReturn(3);

    // Act
    BuiltScenarioMarketDataBuilder actualAddBoxResult =
        builtScenarioMarketDataBuilder.addBox(id, box);

    // Assert
    verify(id).getMarketDataType();
    verify(box).getMarketDataType();
    verify(box).getScenarioCount();
    verify(valuationDate, atLeast(1)).getScenarioCount();
    verify(valuationDate).isSingleValue();
    verify(box).isSingleValue();
    assertSame(builtScenarioMarketDataBuilder, actualAddBoxResult);
  }

  /**
   * Test {@link BuiltScenarioMarketDataBuilder#addBox(MarketDataId, MarketDataBox)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return builder {@link MarketDataBox}.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketDataBuilder#addBox(MarketDataId,
   * MarketDataBox)}
   */
  @Test
  @DisplayName(
      "Test addBox(MarketDataId, MarketDataBox); given 'false'; then return builder MarketDataBox")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltScenarioMarketDataBuilder BuiltScenarioMarketDataBuilder.addBox(MarketDataId, MarketDataBox)"
  })
  void testAddBox_givenFalse_thenReturnBuilderMarketDataBox() {
    // Arrange
    MarketDataBox<LocalDate> valuationDate = mock(MarketDataBox.class);
    when(valuationDate.isSingleValue()).thenReturn(true);
    when(valuationDate.getScenarioCount()).thenReturn(3);
    BuiltScenarioMarketDataBuilder builderResult = BuiltScenarioMarketData.builder(valuationDate);

    MarketDataId<Object> id = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getMarketDataType()).thenReturn(forNameResult);

    MarketDataBox<Object> box = mock(MarketDataBox.class);
    Class<Object> forNameResult2 = Object.class;
    org.mockito.Mockito.<Class<?>>when(box.getMarketDataType()).thenReturn(forNameResult2);
    when(box.isSingleValue()).thenReturn(false);
    when(box.getScenarioCount()).thenReturn(3);

    // Act
    BuiltScenarioMarketDataBuilder actualAddBoxResult = builderResult.addBox(id, box);

    // Assert
    verify(id).getMarketDataType();
    verify(box).getMarketDataType();
    verify(valuationDate).getScenarioCount();
    verify(box).getScenarioCount();
    verify(valuationDate).isSingleValue();
    verify(box).isSingleValue();
    assertSame(builderResult, actualAddBoxResult);
  }

  /**
   * Test {@link BuiltScenarioMarketDataBuilder#addBox(MarketDataId, MarketDataBox)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketDataBuilder#addBox(MarketDataId,
   * MarketDataBox)}
   */
  @Test
  @DisplayName("Test addBox(MarketDataId, MarketDataBox); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltScenarioMarketDataBuilder BuiltScenarioMarketDataBuilder.addBox(MarketDataId, MarketDataBox)"
  })
  void testAddBox_givenIllegalArgumentException() {
    // Arrange
    MarketDataBox<LocalDate> valuationDate = mock(MarketDataBox.class);
    when(valuationDate.isSingleValue()).thenReturn(true);
    when(valuationDate.getScenarioCount()).thenReturn(3);
    BuiltScenarioMarketDataBuilder builderResult = BuiltScenarioMarketData.builder(valuationDate);

    MarketDataId<Object> id = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getMarketDataType()).thenReturn(forNameResult);

    MarketDataBox<Object> box = mock(MarketDataBox.class);
    org.mockito.Mockito.<Class<?>>when(box.getMarketDataType())
        .thenThrow(new IllegalArgumentException());
    when(box.isSingleValue()).thenReturn(true);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> builderResult.addBox(id, box));
    verify(id).getMarketDataType();
    verify(box).getMarketDataType();
    verify(valuationDate).getScenarioCount();
    verify(valuationDate).isSingleValue();
    verify(box).isSingleValue();
  }

  /**
   * Test {@link BuiltScenarioMarketDataBuilder#addBox(MarketDataId, MarketDataBox)}.
   *
   * <ul>
   *   <li>Given {@link MarketDataBox} {@link MarketDataBox#getScenarioCount()} return twelve.
   *   <li>When {@link MarketDataId}.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketDataBuilder#addBox(MarketDataId,
   * MarketDataBox)}
   */
  @Test
  @DisplayName(
      "Test addBox(MarketDataId, MarketDataBox); given MarketDataBox getScenarioCount() return twelve; when MarketDataId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltScenarioMarketDataBuilder BuiltScenarioMarketDataBuilder.addBox(MarketDataId, MarketDataBox)"
  })
  void testAddBox_givenMarketDataBoxGetScenarioCountReturnTwelve_whenMarketDataId() {
    // Arrange
    MarketDataBox<LocalDate> valuationDate = mock(MarketDataBox.class);
    when(valuationDate.isSingleValue()).thenReturn(false);
    when(valuationDate.getScenarioCount()).thenReturn(12);
    BuiltScenarioMarketDataBuilder builtScenarioMarketDataBuilder =
        new BuiltScenarioMarketDataBuilder(valuationDate);
    MarketDataId<Object> id = mock(MarketDataId.class);

    MarketDataBox<Object> box = mock(MarketDataBox.class);
    when(box.isSingleValue()).thenReturn(false);
    when(box.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> builtScenarioMarketDataBuilder.addBox(id, box));
    verify(box).getScenarioCount();
    verify(valuationDate, atLeast(1)).getScenarioCount();
    verify(valuationDate).isSingleValue();
    verify(box).isSingleValue();
  }

  /**
   * Test {@link BuiltScenarioMarketDataBuilder#addBox(MarketDataId, MarketDataBox)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return builder {@link MarketDataBox}.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketDataBuilder#addBox(MarketDataId,
   * MarketDataBox)}
   */
  @Test
  @DisplayName(
      "Test addBox(MarketDataId, MarketDataBox); given 'true'; then return builder MarketDataBox")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltScenarioMarketDataBuilder BuiltScenarioMarketDataBuilder.addBox(MarketDataId, MarketDataBox)"
  })
  void testAddBox_givenTrue_thenReturnBuilderMarketDataBox() {
    // Arrange
    MarketDataBox<LocalDate> valuationDate = mock(MarketDataBox.class);
    when(valuationDate.isSingleValue()).thenReturn(true);
    when(valuationDate.getScenarioCount()).thenReturn(3);
    BuiltScenarioMarketDataBuilder builderResult = BuiltScenarioMarketData.builder(valuationDate);

    MarketDataId<Object> id = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getMarketDataType()).thenReturn(forNameResult);

    MarketDataBox<Object> box = mock(MarketDataBox.class);
    Class<Object> forNameResult2 = Object.class;
    org.mockito.Mockito.<Class<?>>when(box.getMarketDataType()).thenReturn(forNameResult2);
    when(box.isSingleValue()).thenReturn(true);

    // Act
    BuiltScenarioMarketDataBuilder actualAddBoxResult = builderResult.addBox(id, box);

    // Assert
    verify(id).getMarketDataType();
    verify(box).getMarketDataType();
    verify(valuationDate).getScenarioCount();
    verify(valuationDate).isSingleValue();
    verify(box).isSingleValue();
    assertSame(builderResult, actualAddBoxResult);
  }

  /**
   * Test {@link BuiltScenarioMarketDataBuilder#addTimeSeries(ObservableId,
   * LocalDateDoubleTimeSeries)}.
   *
   * <ul>
   *   <li>Then builder {@link MarketDataBox} build Underlying TimeSeries size is one.
   * </ul>
   *
   * <p>Method under test: {@link BuiltScenarioMarketDataBuilder#addTimeSeries(ObservableId,
   * LocalDateDoubleTimeSeries)}
   */
  @Test
  @DisplayName(
      "Test addTimeSeries(ObservableId, LocalDateDoubleTimeSeries); then builder MarketDataBox build Underlying TimeSeries size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltScenarioMarketDataBuilder BuiltScenarioMarketDataBuilder.addTimeSeries(ObservableId, LocalDateDoubleTimeSeries)"
  })
  void testAddTimeSeries_thenBuilderMarketDataBoxBuildUnderlyingTimeSeriesSizeIsOne() {
    // Arrange
    MarketDataBox<LocalDate> valuationDate = mock(MarketDataBox.class);
    when(valuationDate.isSingleValue()).thenReturn(true);
    when(valuationDate.getScenarioCount()).thenReturn(3);
    BuiltScenarioMarketDataBuilder builderResult = BuiltScenarioMarketData.builder(valuationDate);

    // Act
    BuiltScenarioMarketDataBuilder actualAddTimeSeriesResult =
        builderResult.addTimeSeries(
            new MarketDataNodeTest().new TestIdA("42"), mock(LocalDateDoubleTimeSeries.class));

    // Assert
    verify(valuationDate).getScenarioCount();
    verify(valuationDate).isSingleValue();
    BuiltScenarioMarketData builtScenarioMarketData = builderResult.build();
    ImmutableScenarioMarketData underlying = builtScenarioMarketData.getUnderlying();
    assertEquals(1, underlying.getTimeSeries().size());
    Set<ObservableId> timeSeriesIds = builtScenarioMarketData.getTimeSeriesIds();
    assertEquals(1, timeSeriesIds.size());
    assertSame(timeSeriesIds, underlying.getTimeSeriesIds());
    assertSame(builderResult, actualAddTimeSeriesResult);
  }
}
