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
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataNotFoundException;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.pricer.index.IborFutureOptionVolatilitiesId;
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

class DefaultIborFutureOptionMarketDataLookupDiffblueTest {
  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#of(IborIndex,
   * IborFutureOptionVolatilitiesId)} with {@code index}, {@code volatilityId}.
   *
   * <ul>
   *   <li>When {@link IborIndex}.
   *   <li>Then return VolatilityIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketDataLookup#of(IborIndex,
   * IborFutureOptionVolatilitiesId)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, IborFutureOptionVolatilitiesId) with 'index', 'volatilityId'; when IborIndex; then return VolatilityIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultIborFutureOptionMarketDataLookup DefaultIborFutureOptionMarketDataLookup.of(IborIndex, IborFutureOptionVolatilitiesId)"
  })
  void testOfWithIndexVolatilityId_whenIborIndex_thenReturnVolatilityIndicesSizeIsOne() {
    // Arrange
    IborIndex index = mock(IborIndex.class);

    // Act
    DefaultIborFutureOptionMarketDataLookup actualOfResult =
        DefaultIborFutureOptionMarketDataLookup.of(
            index, IborFutureOptionVolatilitiesId.of("Name"));

    // Assert
    assertEquals(1, actualOfResult.getVolatilityIndices().size());
    assertEquals(1, actualOfResult.getVolatilityIds().size());
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'volatilityIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultIborFutureOptionMarketDataLookup DefaultIborFutureOptionMarketDataLookup.of(Map)"
  })
  void testOfWithVolatilityIds() {
    // Arrange
    HashMap<IborIndex, IborFutureOptionVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    DefaultIborFutureOptionMarketDataLookup actualOfResult =
        DefaultIborFutureOptionMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult.getVolatilityIndices().isEmpty());
    assertEquals(volatilityIds, actualOfResult.getVolatilityIds());
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#getVolatilityIndices()}.
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketDataLookup#getVolatilityIndices()}
   */
  @Test
  @DisplayName("Test getVolatilityIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultIborFutureOptionMarketDataLookup.getVolatilityIndices()"})
  void testGetVolatilityIndices() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertTrue(ofResult.getVolatilityIndices().isEmpty());
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#getVolatilityIds(IborIndex)} with {@code
   * IborIndex}.
   *
   * <ul>
   *   <li>When {@link IborIndex}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultIborFutureOptionMarketDataLookup#getVolatilityIds(IborIndex)}
   */
  @Test
  @DisplayName("Test getVolatilityIds(IborIndex) with 'IborIndex'; when IborIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet DefaultIborFutureOptionMarketDataLookup.getVolatilityIds(IborIndex)"
  })
  void testGetVolatilityIdsWithIborIndex_whenIborIndex() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.getVolatilityIds(mock(IborIndex.class)));
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#getVolatilityIds(IborIndex)} with {@code
   * IborIndex}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultIborFutureOptionMarketDataLookup#getVolatilityIds(IborIndex)}
   */
  @Test
  @DisplayName("Test getVolatilityIds(IborIndex) with 'IborIndex'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet DefaultIborFutureOptionMarketDataLookup.getVolatilityIds(IborIndex)"
  })
  void testGetVolatilityIdsWithIborIndex_whenNull() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getVolatilityIds(null));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultIborFutureOptionMarketDataLookup#toString()}
   *   <li>{@link DefaultIborFutureOptionMarketDataLookup#getVolatilityIds()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableMap DefaultIborFutureOptionMarketDataLookup.getVolatilityIds()",
    "String DefaultIborFutureOptionMarketDataLookup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("DefaultIborFutureOptionMarketDataLookup{volatilityIds={}}", actualToStringResult);
    assertTrue(ofResult.getVolatilityIds().isEmpty());
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@link IborIndex}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; given IborIndex; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FunctionRequirements DefaultIborFutureOptionMarketDataLookup.requirements(Set)"
  })
  void testRequirementsWithSet_givenIborIndex_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    LinkedHashSet<IborIndex> indices = new LinkedHashSet<>();
    indices.add(mock(IborIndex.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.requirements(indices));
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; when HashSet(); then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FunctionRequirements DefaultIborFutureOptionMarketDataLookup.requirements(Set)"
  })
  void testRequirementsWithSet_whenHashSet_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

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
   * Test {@link DefaultIborFutureOptionMarketDataLookup#volatilities(IborIndex, MarketData)}.
   *
   * <ul>
   *   <li>When {@link IborIndex}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketDataLookup#volatilities(IborIndex,
   * MarketData)}
   */
  @Test
  @DisplayName("Test volatilities(IborIndex, MarketData); when IborIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.index.IborFutureOptionVolatilities DefaultIborFutureOptionMarketDataLookup.volatilities(IborIndex, MarketData)"
  })
  void testVolatilities_whenIborIndex() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(
        MarketDataNotFoundException.class,
        () -> ofResult.volatilities(mock(IborIndex.class), null));
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#volatilities(IborIndex, MarketData)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketDataLookup#volatilities(IborIndex,
   * MarketData)}
   */
  @Test
  @DisplayName("Test volatilities(IborIndex, MarketData); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.index.IborFutureOptionVolatilities DefaultIborFutureOptionMarketDataLookup.volatilities(IborIndex, MarketData)"
  })
  void testVolatilities_whenNull() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.volatilities(null, null));
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#meta()}.
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketDataLookup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultIborFutureOptionMarketDataLookup.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultIborFutureOptionMarketDataLookup> actualMetaResult =
        DefaultIborFutureOptionMarketDataLookup.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultIborFutureOptionMarketDataLookup> expectedBeanTypeResult =
        DefaultIborFutureOptionMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#metaBean()}.
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketDataLookup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultIborFutureOptionMarketDataLookup.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act
    TypedMetaBean<DefaultIborFutureOptionMarketDataLookup> actualMetaBeanResult =
        ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultIborFutureOptionMarketDataLookup> expectedBeanTypeResult =
        DefaultIborFutureOptionMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#equals(Object)}, and {@link
   * DefaultIborFutureOptionMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultIborFutureOptionMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultIborFutureOptionMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultIborFutureOptionMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    DefaultIborFutureOptionMarketDataLookup ofResult2 =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#equals(Object)}, and {@link
   * DefaultIborFutureOptionMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultIborFutureOptionMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultIborFutureOptionMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultIborFutureOptionMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultIborFutureOptionMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultIborFutureOptionMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to DefaultIborFutureOptionMarketDataLookup");
  }
}
