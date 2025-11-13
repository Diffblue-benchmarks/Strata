package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataNotFoundException;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.pricer.bond.BondFutureVolatilitiesId;
import com.opengamma.strata.product.SecurityId;
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

class DefaultBondFutureOptionMarketDataLookupDiffblueTest {
  /**
   * Test {@link DefaultBondFutureOptionMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return VolatilitySecurityIds Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'volatilityIds'; when HashMap(); then return VolatilitySecurityIds Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultBondFutureOptionMarketDataLookup DefaultBondFutureOptionMarketDataLookup.of(Map)"
  })
  void testOfWithVolatilityIds_whenHashMap_thenReturnVolatilitySecurityIdsEmpty() {
    // Arrange
    HashMap<SecurityId, BondFutureVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    DefaultBondFutureOptionMarketDataLookup actualOfResult =
        DefaultBondFutureOptionMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult.getVolatilitySecurityIds().isEmpty());
    assertEquals(volatilityIds, actualOfResult.getVolatilityIds());
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketDataLookup#getVolatilitySecurityIds()}.
   *
   * <p>Method under test: {@link
   * DefaultBondFutureOptionMarketDataLookup#getVolatilitySecurityIds()}
   */
  @Test
  @DisplayName("Test getVolatilitySecurityIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet DefaultBondFutureOptionMarketDataLookup.getVolatilitySecurityIds()"
  })
  void testGetVolatilitySecurityIds() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertTrue(ofResult.getVolatilitySecurityIds().isEmpty());
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketDataLookup#getVolatilityIds(SecurityId)} with {@code
   * SecurityId}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultBondFutureOptionMarketDataLookup#getVolatilityIds(SecurityId)}
   */
  @Test
  @DisplayName(
      "Test getVolatilityIds(SecurityId) with 'SecurityId'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet DefaultBondFutureOptionMarketDataLookup.getVolatilityIds(SecurityId)"
  })
  void testGetVolatilityIdsWithSecurityId_whenNull_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getVolatilityIds(null));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultBondFutureOptionMarketDataLookup#toString()}
   *   <li>{@link DefaultBondFutureOptionMarketDataLookup#getVolatilityIds()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableMap DefaultBondFutureOptionMarketDataLookup.getVolatilityIds()",
    "String DefaultBondFutureOptionMarketDataLookup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("DefaultBondFutureOptionMarketDataLookup{volatilityIds={}}", actualToStringResult);
    assertTrue(ofResult.getVolatilityIds().isEmpty());
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; given 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FunctionRequirements DefaultBondFutureOptionMarketDataLookup.requirements(Set)"
  })
  void testRequirementsWithSet_givenNull_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    HashSet<SecurityId> securityIds = new HashSet<>();
    securityIds.add(null);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.requirements(securityIds));
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketDataLookup#requirements(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set) with 'Set'; when HashSet(); then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FunctionRequirements DefaultBondFutureOptionMarketDataLookup.requirements(Set)"
  })
  void testRequirementsWithSet_whenHashSet_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

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
   * Test {@link DefaultBondFutureOptionMarketDataLookup#volatilities(SecurityId, MarketData)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionMarketDataLookup#volatilities(SecurityId,
   * MarketData)}
   */
  @Test
  @DisplayName(
      "Test volatilities(SecurityId, MarketData); when 'null'; then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.bond.BondFutureVolatilities DefaultBondFutureOptionMarketDataLookup.volatilities(SecurityId, MarketData)"
  })
  void testVolatilities_whenNull_thenThrowMarketDataNotFoundException() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.volatilities(null, null));
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketDataLookup#meta()}.
   *
   * <p>Method under test: {@link DefaultBondFutureOptionMarketDataLookup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultBondFutureOptionMarketDataLookup.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultBondFutureOptionMarketDataLookup> actualMetaResult =
        DefaultBondFutureOptionMarketDataLookup.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultBondFutureOptionMarketDataLookup> expectedBeanTypeResult =
        DefaultBondFutureOptionMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketDataLookup#metaBean()}.
   *
   * <p>Method under test: {@link DefaultBondFutureOptionMarketDataLookup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultBondFutureOptionMarketDataLookup.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act
    TypedMetaBean<DefaultBondFutureOptionMarketDataLookup> actualMetaBeanResult =
        ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("volatilityIds"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultBondFutureOptionMarketDataLookup> expectedBeanTypeResult =
        DefaultBondFutureOptionMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketDataLookup#equals(Object)}, and {@link
   * DefaultBondFutureOptionMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultBondFutureOptionMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultBondFutureOptionMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultBondFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultBondFutureOptionMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    DefaultBondFutureOptionMarketDataLookup ofResult2 =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketDataLookup#equals(Object)}, and {@link
   * DefaultBondFutureOptionMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultBondFutureOptionMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultBondFutureOptionMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultBondFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultBondFutureOptionMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultBondFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultBondFutureOptionMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultBondFutureOptionMarketDataLookup.equals(Object)",
    "int DefaultBondFutureOptionMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to DefaultBondFutureOptionMarketDataLookup");
  }
}
