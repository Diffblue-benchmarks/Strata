package com.opengamma.strata.measure.fxopt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataNotFoundException;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.pricer.fxopt.FxOptionVolatilitiesId;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultFxOptionMarketDataLookupDiffblueTest {
  /**
   * Test {@link DefaultFxOptionMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return VolatilityCurrencyPairs Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxOptionMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'volatilityIds'; when HashMap(); then return VolatilityCurrencyPairs Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultFxOptionMarketDataLookup DefaultFxOptionMarketDataLookup.of(Map)"})
  void testOfWithVolatilityIds_whenHashMap_thenReturnVolatilityCurrencyPairsEmpty() {
    // Arrange
    HashMap<CurrencyPair, FxOptionVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    DefaultFxOptionMarketDataLookup actualOfResult =
        DefaultFxOptionMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult.getVolatilityCurrencyPairs().isEmpty());
    assertEquals(volatilityIds, actualOfResult.getVolatilityIds());
  }

  /**
   * Test {@link DefaultFxOptionMarketDataLookup#getVolatilityCurrencyPairs()}.
   *
   * <p>Method under test: {@link DefaultFxOptionMarketDataLookup#getVolatilityCurrencyPairs()}
   */
  @Test
  @DisplayName("Test getVolatilityCurrencyPairs()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultFxOptionMarketDataLookup.getVolatilityCurrencyPairs()"})
  void testGetVolatilityCurrencyPairs() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertTrue(ofResult.getVolatilityCurrencyPairs().isEmpty());
  }

  /**
   * Test {@link DefaultFxOptionMarketDataLookup#getVolatilityIds(CurrencyPair)} with {@code
   * CurrencyPair}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxOptionMarketDataLookup#getVolatilityIds(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test getVolatilityIds(CurrencyPair) with 'CurrencyPair'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultFxOptionMarketDataLookup.getVolatilityIds(CurrencyPair)"})
  void testGetVolatilityIdsWithCurrencyPair_whenNull_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getVolatilityIds(null));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultFxOptionMarketDataLookup#toString()}
   *   <li>{@link DefaultFxOptionMarketDataLookup#getVolatilityIds()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableMap DefaultFxOptionMarketDataLookup.getVolatilityIds()",
    "String DefaultFxOptionMarketDataLookup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("DefaultFxOptionMarketDataLookup{volatilityIds={}}", actualToStringResult);
    assertTrue(ofResult.getVolatilityIds().isEmpty());
  }

  /**
   * Test {@link DefaultFxOptionMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxOptionMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; given 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements DefaultFxOptionMarketDataLookup.requirements(Set)"})
  void testRequirementsWithSet_givenNull_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    HashSet<CurrencyPair> currencyPairs = new HashSet<>();
    currencyPairs.add(null);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.requirements(currencyPairs));
  }

  /**
   * Test {@link DefaultFxOptionMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxOptionMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; when HashSet(); then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements DefaultFxOptionMarketDataLookup.requirements(Set)"})
  void testRequirementsWithSet_whenHashSet_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act
    FunctionRequirements actualRequirementsResult = ofResult.requirements(new HashSet<>());

    // Assert
    ObservableSource observableSource = actualRequirementsResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    ImmutableSet<Currency> outputCurrencies = actualRequirementsResult.getOutputCurrencies();
    assertTrue(outputCurrencies.isEmpty());
    assertSame(outputCurrencies, actualRequirementsResult.getTimeSeriesRequirements());
    assertSame(outputCurrencies, actualRequirementsResult.getValueRequirements());
  }

  /**
   * Test {@link DefaultFxOptionMarketDataLookup#volatilities(CurrencyPair, MarketData)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxOptionMarketDataLookup#volatilities(CurrencyPair,
   * MarketData)}
   */
  @Test
  @DisplayName(
      "Test volatilities(CurrencyPair, MarketData); when 'null'; then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.fxopt.FxOptionVolatilities DefaultFxOptionMarketDataLookup.volatilities(CurrencyPair, MarketData)"
  })
  void testVolatilities_whenNull_thenThrowMarketDataNotFoundException() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.volatilities(null, null));
  }

  /**
   * Test {@link DefaultFxOptionMarketDataLookup#meta()}.
   *
   * <p>Method under test: {@link DefaultFxOptionMarketDataLookup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultFxOptionMarketDataLookup.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultFxOptionMarketDataLookup> actualMetaResult =
        DefaultFxOptionMarketDataLookup.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultFxOptionMarketDataLookup> expectedBeanTypeResult =
        DefaultFxOptionMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultFxOptionMarketDataLookup#metaBean()}.
   *
   * <p>Method under test: {@link DefaultFxOptionMarketDataLookup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultFxOptionMarketDataLookup.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act
    TypedMetaBean<DefaultFxOptionMarketDataLookup> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultFxOptionMarketDataLookup> expectedBeanTypeResult =
        DefaultFxOptionMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link DefaultFxOptionMarketDataLookup#equals(Object)}, and {@link
   * DefaultFxOptionMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultFxOptionMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultFxOptionMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultFxOptionMarketDataLookup.equals(Object)",
    "int DefaultFxOptionMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());
    DefaultFxOptionMarketDataLookup ofResult2 = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultFxOptionMarketDataLookup#equals(Object)}, and {@link
   * DefaultFxOptionMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultFxOptionMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultFxOptionMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultFxOptionMarketDataLookup.equals(Object)",
    "int DefaultFxOptionMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultFxOptionMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxOptionMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultFxOptionMarketDataLookup.equals(Object)",
    "int DefaultFxOptionMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link DefaultFxOptionMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxOptionMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultFxOptionMarketDataLookup.equals(Object)",
    "int DefaultFxOptionMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to DefaultFxOptionMarketDataLookup");
  }
}
