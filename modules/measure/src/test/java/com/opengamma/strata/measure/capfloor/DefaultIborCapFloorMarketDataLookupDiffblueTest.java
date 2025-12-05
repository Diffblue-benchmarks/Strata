package com.opengamma.strata.measure.capfloor;

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
import com.opengamma.strata.pricer.capfloor.IborCapletFloorletVolatilitiesId;
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

class DefaultIborCapFloorMarketDataLookupDiffblueTest {
  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#of(IborIndex,
   * IborCapletFloorletVolatilitiesId)} with {@code index}, {@code volatilityId}.
   *
   * <ul>
   *   <li>When {@link IborIndex}.
   *   <li>Then return VolatilityIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#of(IborIndex,
   * IborCapletFloorletVolatilitiesId)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, IborCapletFloorletVolatilitiesId) with 'index', 'volatilityId'; when IborIndex; then return VolatilityIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultIborCapFloorMarketDataLookup DefaultIborCapFloorMarketDataLookup.of(IborIndex, IborCapletFloorletVolatilitiesId)"
  })
  void testOfWithIndexVolatilityId_whenIborIndex_thenReturnVolatilityIndicesSizeIsOne() {
    // Arrange
    IborIndex index = mock(IborIndex.class);

    // Act
    DefaultIborCapFloorMarketDataLookup actualOfResult =
        DefaultIborCapFloorMarketDataLookup.of(index, IborCapletFloorletVolatilitiesId.of("Name"));

    // Assert
    assertEquals(1, actualOfResult.getVolatilityIndices().size());
    assertEquals(1, actualOfResult.getVolatilityIds().size());
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'volatilityIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultIborCapFloorMarketDataLookup DefaultIborCapFloorMarketDataLookup.of(Map)"
  })
  void testOfWithVolatilityIds() {
    // Arrange
    HashMap<IborIndex, IborCapletFloorletVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    DefaultIborCapFloorMarketDataLookup actualOfResult =
        DefaultIborCapFloorMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult.getVolatilityIndices().isEmpty());
    assertEquals(volatilityIds, actualOfResult.getVolatilityIds());
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#getVolatilityIndices()}.
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#getVolatilityIndices()}
   */
  @Test
  @DisplayName("Test getVolatilityIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultIborCapFloorMarketDataLookup.getVolatilityIndices()"})
  void testGetVolatilityIndices() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertTrue(ofResult.getVolatilityIndices().isEmpty());
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#getVolatilityIds(IborIndex)} with {@code
   * IborIndex}.
   *
   * <ul>
   *   <li>When {@link IborIndex}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#getVolatilityIds(IborIndex)}
   */
  @Test
  @DisplayName("Test getVolatilityIds(IborIndex) with 'IborIndex'; when IborIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet DefaultIborCapFloorMarketDataLookup.getVolatilityIds(IborIndex)"
  })
  void testGetVolatilityIdsWithIborIndex_whenIborIndex() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.getVolatilityIds(mock(IborIndex.class)));
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#getVolatilityIds(IborIndex)} with {@code
   * IborIndex}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#getVolatilityIds(IborIndex)}
   */
  @Test
  @DisplayName("Test getVolatilityIds(IborIndex) with 'IborIndex'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet DefaultIborCapFloorMarketDataLookup.getVolatilityIds(IborIndex)"
  })
  void testGetVolatilityIdsWithIborIndex_whenNull() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getVolatilityIds(null));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultIborCapFloorMarketDataLookup#toString()}
   *   <li>{@link DefaultIborCapFloorMarketDataLookup#getVolatilityIds()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableMap DefaultIborCapFloorMarketDataLookup.getVolatilityIds()",
    "String DefaultIborCapFloorMarketDataLookup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("DefaultIborCapFloorMarketDataLookup{volatilityIds={}}", actualToStringResult);
    assertTrue(ofResult.getVolatilityIds().isEmpty());
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@link IborIndex}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; given IborIndex; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements DefaultIborCapFloorMarketDataLookup.requirements(Set)"})
  void testRequirementsWithSet_givenIborIndex_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    LinkedHashSet<IborIndex> indices = new LinkedHashSet<>();
    indices.add(mock(IborIndex.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.requirements(indices));
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; when HashSet(); then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements DefaultIborCapFloorMarketDataLookup.requirements(Set)"})
  void testRequirementsWithSet_whenHashSet_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

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
   * Test {@link DefaultIborCapFloorMarketDataLookup#volatilities(IborIndex, MarketData)}.
   *
   * <ul>
   *   <li>When {@link IborIndex}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#volatilities(IborIndex,
   * MarketData)}
   */
  @Test
  @DisplayName("Test volatilities(IborIndex, MarketData); when IborIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.capfloor.IborCapletFloorletVolatilities DefaultIborCapFloorMarketDataLookup.volatilities(IborIndex, MarketData)"
  })
  void testVolatilities_whenIborIndex() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(
        MarketDataNotFoundException.class,
        () -> ofResult.volatilities(mock(IborIndex.class), null));
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#volatilities(IborIndex, MarketData)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#volatilities(IborIndex,
   * MarketData)}
   */
  @Test
  @DisplayName("Test volatilities(IborIndex, MarketData); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.capfloor.IborCapletFloorletVolatilities DefaultIborCapFloorMarketDataLookup.volatilities(IborIndex, MarketData)"
  })
  void testVolatilities_whenNull() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.volatilities(null, null));
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#meta()}.
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultIborCapFloorMarketDataLookup.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultIborCapFloorMarketDataLookup> actualMetaResult =
        DefaultIborCapFloorMarketDataLookup.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultIborCapFloorMarketDataLookup> expectedBeanTypeResult =
        DefaultIborCapFloorMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#metaBean()}.
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultIborCapFloorMarketDataLookup.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act
    TypedMetaBean<DefaultIborCapFloorMarketDataLookup> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultIborCapFloorMarketDataLookup> expectedBeanTypeResult =
        DefaultIborCapFloorMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#equals(Object)}, and {@link
   * DefaultIborCapFloorMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultIborCapFloorMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultIborCapFloorMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborCapFloorMarketDataLookup.equals(Object)",
    "int DefaultIborCapFloorMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    DefaultIborCapFloorMarketDataLookup ofResult2 =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#equals(Object)}, and {@link
   * DefaultIborCapFloorMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultIborCapFloorMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultIborCapFloorMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborCapFloorMarketDataLookup.equals(Object)",
    "int DefaultIborCapFloorMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborCapFloorMarketDataLookup.equals(Object)",
    "int DefaultIborCapFloorMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link DefaultIborCapFloorMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborCapFloorMarketDataLookup.equals(Object)",
    "int DefaultIborCapFloorMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to DefaultIborCapFloorMarketDataLookup");
  }
}
