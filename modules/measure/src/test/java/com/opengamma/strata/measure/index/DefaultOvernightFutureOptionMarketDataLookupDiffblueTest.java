package com.opengamma.strata.measure.index;

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
import com.opengamma.strata.basics.index.OvernightIndex;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataNotFoundException;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.pricer.index.OvernightFutureOptionVolatilitiesId;
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

class DefaultOvernightFutureOptionMarketDataLookupDiffblueTest {
  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#of(OvernightIndex,
   * OvernightFutureOptionVolatilitiesId)} with {@code index}, {@code volatilityId}.
   *
   * <ul>
   *   <li>Then return VolatilityIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionMarketDataLookup#of(OvernightIndex,
   * OvernightFutureOptionVolatilitiesId)}
   */
  @Test
  @DisplayName(
      "Test of(OvernightIndex, OvernightFutureOptionVolatilitiesId) with 'index', 'volatilityId'; then return VolatilityIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultOvernightFutureOptionMarketDataLookup DefaultOvernightFutureOptionMarketDataLookup.of(OvernightIndex, OvernightFutureOptionVolatilitiesId)"
  })
  void testOfWithIndexVolatilityId_thenReturnVolatilityIndicesSizeIsOne() {
    // Arrange
    OvernightIndex index = mock(OvernightIndex.class);

    // Act
    DefaultOvernightFutureOptionMarketDataLookup actualOfResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(
            index, OvernightFutureOptionVolatilitiesId.of("Name"));

    // Assert
    assertEquals(1, actualOfResult.getVolatilityIndices().size());
    assertEquals(1, actualOfResult.getVolatilityIds().size());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'volatilityIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultOvernightFutureOptionMarketDataLookup DefaultOvernightFutureOptionMarketDataLookup.of(Map)"
  })
  void testOfWithVolatilityIds() {
    // Arrange
    HashMap<OvernightIndex, OvernightFutureOptionVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    DefaultOvernightFutureOptionMarketDataLookup actualOfResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult.getVolatilityIndices().isEmpty());
    assertEquals(volatilityIds, actualOfResult.getVolatilityIds());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#getVolatilityIndices()}.
   *
   * <p>Method under test: {@link
   * DefaultOvernightFutureOptionMarketDataLookup#getVolatilityIndices()}
   */
  @Test
  @DisplayName("Test getVolatilityIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet DefaultOvernightFutureOptionMarketDataLookup.getVolatilityIndices()"
  })
  void testGetVolatilityIndices() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertTrue(ofResult.getVolatilityIndices().isEmpty());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#getVolatilityIds(OvernightIndex)} with
   * {@code OvernightIndex}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultOvernightFutureOptionMarketDataLookup#getVolatilityIds(OvernightIndex)}
   */
  @Test
  @DisplayName("Test getVolatilityIds(OvernightIndex) with 'OvernightIndex'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet DefaultOvernightFutureOptionMarketDataLookup.getVolatilityIds(OvernightIndex)"
  })
  void testGetVolatilityIdsWithOvernightIndex_whenNull() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getVolatilityIds(null));
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#getVolatilityIds(OvernightIndex)} with
   * {@code OvernightIndex}.
   *
   * <ul>
   *   <li>When {@link OvernightIndex}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultOvernightFutureOptionMarketDataLookup#getVolatilityIds(OvernightIndex)}
   */
  @Test
  @DisplayName("Test getVolatilityIds(OvernightIndex) with 'OvernightIndex'; when OvernightIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet DefaultOvernightFutureOptionMarketDataLookup.getVolatilityIds(OvernightIndex)"
  })
  void testGetVolatilityIdsWithOvernightIndex_whenOvernightIndex() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.getVolatilityIds(mock(OvernightIndex.class)));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultOvernightFutureOptionMarketDataLookup#toString()}
   *   <li>{@link DefaultOvernightFutureOptionMarketDataLookup#getVolatilityIds()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableMap DefaultOvernightFutureOptionMarketDataLookup.getVolatilityIds()",
    "String DefaultOvernightFutureOptionMarketDataLookup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals(
        "DefaultOvernightFutureOptionMarketDataLookup{volatilityIds={}}", actualToStringResult);
    assertTrue(ofResult.getVolatilityIds().isEmpty());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@link OvernightIndex}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; given OvernightIndex; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FunctionRequirements DefaultOvernightFutureOptionMarketDataLookup.requirements(Set)"
  })
  void testRequirementsWithSet_givenOvernightIndex_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    LinkedHashSet<OvernightIndex> indices = new LinkedHashSet<>();
    indices.add(mock(OvernightIndex.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.requirements(indices));
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; when HashSet(); then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FunctionRequirements DefaultOvernightFutureOptionMarketDataLookup.requirements(Set)"
  })
  void testRequirementsWithSet_whenHashSet_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

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
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#volatilities(OvernightIndex,
   * MarketData)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultOvernightFutureOptionMarketDataLookup#volatilities(OvernightIndex, MarketData)}
   */
  @Test
  @DisplayName("Test volatilities(OvernightIndex, MarketData); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.index.OvernightFutureOptionVolatilities DefaultOvernightFutureOptionMarketDataLookup.volatilities(OvernightIndex, MarketData)"
  })
  void testVolatilities_whenNull() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.volatilities(null, null));
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#volatilities(OvernightIndex,
   * MarketData)}.
   *
   * <ul>
   *   <li>When {@link OvernightIndex}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultOvernightFutureOptionMarketDataLookup#volatilities(OvernightIndex, MarketData)}
   */
  @Test
  @DisplayName("Test volatilities(OvernightIndex, MarketData); when OvernightIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.index.OvernightFutureOptionVolatilities DefaultOvernightFutureOptionMarketDataLookup.volatilities(OvernightIndex, MarketData)"
  })
  void testVolatilities_whenOvernightIndex() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(
        MarketDataNotFoundException.class,
        () -> ofResult.volatilities(mock(OvernightIndex.class), null));
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#meta()}.
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionMarketDataLookup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultOvernightFutureOptionMarketDataLookup.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultOvernightFutureOptionMarketDataLookup> actualMetaResult =
        DefaultOvernightFutureOptionMarketDataLookup.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultOvernightFutureOptionMarketDataLookup> expectedBeanTypeResult =
        DefaultOvernightFutureOptionMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#metaBean()}.
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionMarketDataLookup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultOvernightFutureOptionMarketDataLookup.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act
    TypedMetaBean<DefaultOvernightFutureOptionMarketDataLookup> actualMetaBeanResult =
        ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultOvernightFutureOptionMarketDataLookup> expectedBeanTypeResult =
        DefaultOvernightFutureOptionMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#equals(Object)}, and {@link
   * DefaultOvernightFutureOptionMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultOvernightFutureOptionMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultOvernightFutureOptionMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultOvernightFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultOvernightFutureOptionMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    DefaultOvernightFutureOptionMarketDataLookup ofResult2 =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#equals(Object)}, and {@link
   * DefaultOvernightFutureOptionMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultOvernightFutureOptionMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultOvernightFutureOptionMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultOvernightFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultOvernightFutureOptionMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultOvernightFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultOvernightFutureOptionMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultOvernightFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultOvernightFutureOptionMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to DefaultOvernightFutureOptionMarketDataLookup");
  }
}
