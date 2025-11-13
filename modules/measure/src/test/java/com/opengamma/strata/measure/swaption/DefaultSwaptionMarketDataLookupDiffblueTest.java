package com.opengamma.strata.measure.swaption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.index.RateIndex;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataNotFoundException;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.pricer.swaption.SwaptionVolatilitiesId;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultSwaptionMarketDataLookupDiffblueTest {
  /**
   * Test {@link DefaultSwaptionMarketDataLookup#of(RateIndex, SwaptionVolatilitiesId)} with {@code
   * index}, {@code volatilityId}.
   *
   * <ul>
   *   <li>When {@link RateIndex}.
   *   <li>Then return VolatilityIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#of(RateIndex,
   * SwaptionVolatilitiesId)}
   */
  @Test
  @DisplayName(
      "Test of(RateIndex, SwaptionVolatilitiesId) with 'index', 'volatilityId'; when RateIndex; then return VolatilityIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSwaptionMarketDataLookup DefaultSwaptionMarketDataLookup.of(RateIndex, SwaptionVolatilitiesId)"
  })
  void testOfWithIndexVolatilityId_whenRateIndex_thenReturnVolatilityIndicesSizeIsOne() {
    // Arrange
    RateIndex index = mock(RateIndex.class);

    // Act
    DefaultSwaptionMarketDataLookup actualOfResult =
        DefaultSwaptionMarketDataLookup.of(index, SwaptionVolatilitiesId.of("Name"));

    // Assert
    assertEquals(1, actualOfResult.getVolatilityIndices().size());
    assertEquals(1, actualOfResult.getVolatilityIds().size());
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'volatilityIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultSwaptionMarketDataLookup DefaultSwaptionMarketDataLookup.of(Map)"})
  void testOfWithVolatilityIds() {
    // Arrange
    HashMap<RateIndex, SwaptionVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    DefaultSwaptionMarketDataLookup actualOfResult =
        DefaultSwaptionMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult.getVolatilityIndices().isEmpty());
    assertEquals(volatilityIds, actualOfResult.getVolatilityIds());
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#getVolatilityIndices()}.
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#getVolatilityIndices()}
   */
  @Test
  @DisplayName("Test getVolatilityIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultSwaptionMarketDataLookup.getVolatilityIndices()"})
  void testGetVolatilityIndices() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertTrue(ofResult.getVolatilityIndices().isEmpty());
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#getVolatilityIds(RateIndex)} with {@code
   * RateIndex}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#getVolatilityIds(RateIndex)}
   */
  @Test
  @DisplayName("Test getVolatilityIds(RateIndex) with 'RateIndex'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultSwaptionMarketDataLookup.getVolatilityIds(RateIndex)"})
  void testGetVolatilityIdsWithRateIndex_whenNull() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getVolatilityIds(null));
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#getVolatilityIds(RateIndex)} with {@code
   * RateIndex}.
   *
   * <ul>
   *   <li>When {@link RateIndex}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#getVolatilityIds(RateIndex)}
   */
  @Test
  @DisplayName("Test getVolatilityIds(RateIndex) with 'RateIndex'; when RateIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultSwaptionMarketDataLookup.getVolatilityIds(RateIndex)"})
  void testGetVolatilityIdsWithRateIndex_whenRateIndex() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.getVolatilityIds(mock(RateIndex.class)));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultSwaptionMarketDataLookup#toString()}
   *   <li>{@link DefaultSwaptionMarketDataLookup#getVolatilityIds()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableMap DefaultSwaptionMarketDataLookup.getVolatilityIds()",
    "String DefaultSwaptionMarketDataLookup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("DefaultSwaptionMarketDataLookup{volatilityIds={}}", actualToStringResult);
    assertTrue(ofResult.getVolatilityIds().isEmpty());
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@link RateIndex}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; given RateIndex; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements DefaultSwaptionMarketDataLookup.requirements(Set)"})
  void testRequirementsWithSet_givenRateIndex_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    LinkedHashSet<RateIndex> indices = new LinkedHashSet<>();
    indices.add(mock(RateIndex.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.requirements(indices));
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; when HashSet(); then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements DefaultSwaptionMarketDataLookup.requirements(Set)"})
  void testRequirementsWithSet_whenHashSet_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

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
   * Test {@link DefaultSwaptionMarketDataLookup#volatilities(RateIndex, MarketData)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#volatilities(RateIndex,
   * MarketData)}
   */
  @Test
  @DisplayName("Test volatilities(RateIndex, MarketData); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.swaption.SwaptionVolatilities DefaultSwaptionMarketDataLookup.volatilities(RateIndex, MarketData)"
  })
  void testVolatilities_whenNull() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.volatilities(null, null));
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#volatilities(RateIndex, MarketData)}.
   *
   * <ul>
   *   <li>When {@link RateIndex}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#volatilities(RateIndex,
   * MarketData)}
   */
  @Test
  @DisplayName("Test volatilities(RateIndex, MarketData); when RateIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.swaption.SwaptionVolatilities DefaultSwaptionMarketDataLookup.volatilities(RateIndex, MarketData)"
  })
  void testVolatilities_whenRateIndex() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(
        MarketDataNotFoundException.class,
        () -> ofResult.volatilities(mock(RateIndex.class), null));
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#meta()}.
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultSwaptionMarketDataLookup.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultSwaptionMarketDataLookup> actualMetaResult =
        DefaultSwaptionMarketDataLookup.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultSwaptionMarketDataLookup> expectedBeanTypeResult =
        DefaultSwaptionMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#metaBean()}.
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultSwaptionMarketDataLookup.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act
    TypedMetaBean<DefaultSwaptionMarketDataLookup> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultSwaptionMarketDataLookup> expectedBeanTypeResult =
        DefaultSwaptionMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#equals(Object)}, and {@link
   * DefaultSwaptionMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultSwaptionMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultSwaptionMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSwaptionMarketDataLookup.equals(Object)",
    "int DefaultSwaptionMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    DefaultSwaptionMarketDataLookup ofResult2 = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#equals(Object)}, and {@link
   * DefaultSwaptionMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultSwaptionMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultSwaptionMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSwaptionMarketDataLookup.equals(Object)",
    "int DefaultSwaptionMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSwaptionMarketDataLookup.equals(Object)",
    "int DefaultSwaptionMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link DefaultSwaptionMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSwaptionMarketDataLookup.equals(Object)",
    "int DefaultSwaptionMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to DefaultSwaptionMarketDataLookup");
  }
}
