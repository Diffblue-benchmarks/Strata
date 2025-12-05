package com.opengamma.strata.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataFxRateProviderDiffblueTest {
  /**
   * Test {@link MarketDataFxRateProvider#of(MarketData, ObservableSource)} with {@code marketData},
   * {@code fxRatesSource}.
   *
   * <ul>
   *   <li>Then return not TriangulationCurrency Present.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataFxRateProvider#of(MarketData, ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(MarketData, ObservableSource) with 'marketData', 'fxRatesSource'; then return not TriangulationCurrency Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataFxRateProvider MarketDataFxRateProvider.of(MarketData, ObservableSource)"
  })
  void testOfWithMarketDataFxRatesSource_thenReturnNotTriangulationCurrencyPresent() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act
    MarketDataFxRateProvider actualOfResult =
        MarketDataFxRateProvider.of(marketData, ObservableSource.NONE);

    // Assert
    assertFalse(actualOfResult.getTriangulationCurrency().isPresent());
    assertSame(marketData, actualOfResult.getMarketData());
    assertSame(ObservableSource.NONE, actualOfResult.getFxRatesSource());
  }

  /**
   * Test {@link MarketDataFxRateProvider#of(MarketData)} with {@code marketData}.
   *
   * <ul>
   *   <li>Then return FxRatesSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataFxRateProvider#of(MarketData)}
   */
  @Test
  @DisplayName("Test of(MarketData) with 'marketData'; then return FxRatesSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataFxRateProvider MarketDataFxRateProvider.of(MarketData)"})
  void testOfWithMarketData_thenReturnFxRatesSourceNameIsNone() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act
    MarketDataFxRateProvider actualOfResult = MarketDataFxRateProvider.of(marketData);

    // Assert
    ObservableSource fxRatesSource = actualOfResult.getFxRatesSource();
    assertEquals("None", fxRatesSource.getName());
    assertEquals("None", fxRatesSource.toString());
    assertFalse(actualOfResult.getTriangulationCurrency().isPresent());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link MarketDataFxRateProvider#meta()}.
   *
   * <p>Method under test: {@link MarketDataFxRateProvider#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean MarketDataFxRateProvider.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<MarketDataFxRateProvider> actualMetaResult = MarketDataFxRateProvider.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("fxRatesSource"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(metaPropertyMapResult.containsKey("triangulationCurrency"));
    assertTrue(actualMetaResult.isBuildable());
    Class<MarketDataFxRateProvider> expectedBeanTypeResult = MarketDataFxRateProvider.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link MarketDataFxRateProvider#metaBean()}.
   *
   * <p>Method under test: {@link MarketDataFxRateProvider#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean MarketDataFxRateProvider.metaBean()"})
  void testMetaBean() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act
    TypedMetaBean<MarketDataFxRateProvider> actualMetaBeanResult =
        MarketDataFxRateProvider.of(marketData, ObservableSource.NONE).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("fxRatesSource"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(metaPropertyMapResult.containsKey("triangulationCurrency"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<MarketDataFxRateProvider> expectedBeanTypeResult = MarketDataFxRateProvider.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataFxRateProvider#toString()}
   *   <li>{@link MarketDataFxRateProvider#getFxRatesSource()}
   *   <li>{@link MarketDataFxRateProvider#getMarketData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ObservableSource MarketDataFxRateProvider.getFxRatesSource()",
    "MarketData MarketDataFxRateProvider.getMarketData()",
    "String MarketDataFxRateProvider.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    MarketDataFxRateProvider ofResult =
        MarketDataFxRateProvider.of(marketData, ObservableSource.NONE);

    // Act
    String actualToStringResult = ofResult.toString();
    ObservableSource actualFxRatesSource = ofResult.getFxRatesSource();

    // Assert
    assertEquals(
        "MarketDataFxRateProvider{marketData=CombinedMarketData{underlying1=ImmutableMarketData{valuationDate"
            + "=1970-01-01, values={}, timeSeries={}}, underlying2=ImmutableMarketData{valuationDate=1970-01-01,"
            + " values={}, timeSeries={}}}, fxRatesSource=None, triangulationCurrency=null}",
        actualToStringResult);
    assertSame(marketData, ofResult.getMarketData());
    assertSame(ObservableSource.NONE, actualFxRatesSource);
  }

  /**
   * Test {@link MarketDataFxRateProvider#getTriangulationCurrency()}.
   *
   * <p>Method under test: {@link MarketDataFxRateProvider#getTriangulationCurrency()}
   */
  @Test
  @DisplayName("Test getTriangulationCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional MarketDataFxRateProvider.getTriangulationCurrency()"})
  void testGetTriangulationCurrency() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertFalse(
        MarketDataFxRateProvider.of(marketData, ObservableSource.NONE)
            .getTriangulationCurrency()
            .isPresent());
  }

  /**
   * Test {@link MarketDataFxRateProvider#equals(Object)}, and {@link
   * MarketDataFxRateProvider#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataFxRateProvider#equals(Object)}
   *   <li>{@link MarketDataFxRateProvider#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataFxRateProvider.equals(Object)",
    "int MarketDataFxRateProvider.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    MarketDataFxRateProvider ofResult =
        MarketDataFxRateProvider.of(marketData, ObservableSource.NONE);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate3, new HashMap<>());
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate4, new HashMap<>()));
    MarketDataFxRateProvider ofResult2 =
        MarketDataFxRateProvider.of(marketData2, ObservableSource.NONE);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link MarketDataFxRateProvider#equals(Object)}, and {@link
   * MarketDataFxRateProvider#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataFxRateProvider#equals(Object)}
   *   <li>{@link MarketDataFxRateProvider#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataFxRateProvider.equals(Object)",
    "int MarketDataFxRateProvider.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    MarketDataFxRateProvider ofResult =
        MarketDataFxRateProvider.of(marketData, ObservableSource.NONE);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link MarketDataFxRateProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataFxRateProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataFxRateProvider.equals(Object)",
    "int MarketDataFxRateProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));
    MarketDataFxRateProvider ofResult =
        MarketDataFxRateProvider.of(marketData, ObservableSource.NONE);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying13 = ImmutableMarketData.of(valuationDate4, new HashMap<>());
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData2 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate5, new HashMap<>()));

    // Act and Assert
    assertNotEquals(ofResult, MarketDataFxRateProvider.of(marketData2, ObservableSource.NONE));
  }

  /**
   * Test {@link MarketDataFxRateProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataFxRateProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataFxRateProvider.equals(Object)",
    "int MarketDataFxRateProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    MarketDataFxRateProvider ofResult =
        MarketDataFxRateProvider.of(marketData, ObservableSource.of("Name"));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate3, new HashMap<>());
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    // Act and Assert
    assertNotEquals(ofResult, MarketDataFxRateProvider.of(marketData2, ObservableSource.NONE));
  }

  /**
   * Test {@link MarketDataFxRateProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataFxRateProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataFxRateProvider.equals(Object)",
    "int MarketDataFxRateProvider.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertNotEquals(MarketDataFxRateProvider.of(marketData, ObservableSource.NONE), null);
  }

  /**
   * Test {@link MarketDataFxRateProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataFxRateProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MarketDataFxRateProvider.equals(Object)",
    "int MarketDataFxRateProvider.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData marketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertNotEquals(
        MarketDataFxRateProvider.of(marketData, ObservableSource.NONE),
        "Different type to MarketDataFxRateProvider");
  }
}
