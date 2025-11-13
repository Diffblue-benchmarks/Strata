package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.index.FloatingRateName;
import com.opengamma.strata.basics.index.FloatingRateType;
import com.opengamma.strata.basics.index.ImmutableFloatingRateName;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.market.curve.RatesCurveGroupDefinition.Meta;
import com.opengamma.strata.market.curve.RatesCurveGroupEntry.Builder;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatesCurveGroupDefinitionDiffblueTest {
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
    Class<? extends RatesCurveGroupDefinition> actualBeanTypeResult =
        RatesCurveGroupDefinition.meta().beanType();

    // Assert
    Class<RatesCurveGroupDefinition> expectedBeanTypeResult = RatesCurveGroupDefinition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#computeJacobian()}
   *   <li>{@link Meta#computePvSensitivityToMarketQuote()}
   *   <li>{@link Meta#curveDefinitions()}
   *   <li>{@link Meta#entries()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#seasonalityDefinitions()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.computeJacobian()",
    "MetaProperty Meta.computePvSensitivityToMarketQuote()",
    "MetaProperty Meta.curveDefinitions()",
    "MetaProperty Meta.entries()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.seasonalityDefinitions()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RatesCurveGroupDefinition.meta();

    // Act
    MetaProperty<Boolean> actualComputeJacobianResult = metaResult.computeJacobian();
    MetaProperty<Boolean> actualComputePvSensitivityToMarketQuoteResult =
        metaResult.computePvSensitivityToMarketQuote();
    MetaProperty<ImmutableList<CurveDefinition>> actualCurveDefinitionsResult =
        metaResult.curveDefinitions();
    MetaProperty<ImmutableList<RatesCurveGroupEntry>> actualEntriesResult = metaResult.entries();
    MetaProperty<CurveGroupName> actualNameResult = metaResult.name();

    // Assert
    assertTrue(actualComputeJacobianResult instanceof DirectMetaProperty);
    assertTrue(actualComputePvSensitivityToMarketQuoteResult instanceof DirectMetaProperty);
    assertTrue(actualCurveDefinitionsResult instanceof DirectMetaProperty);
    assertTrue(actualEntriesResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(metaResult.seasonalityDefinitions() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code computePvSensitivityToMarketQuote}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then return name is 'computePvSensitivityToMarketQuote'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsComputePvSensitivityToMarketQuote() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveGroupDefinition.meta().metaPropertyGet("computePvSensitivityToMarketQuote");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> computeJacobianResult = ((Meta) metaBeanResult).computeJacobian();
    assertTrue(computeJacobianResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<CurveDefinition>> curveDefinitionsResult =
        ((Meta) metaBeanResult).curveDefinitions();
    assertTrue(curveDefinitionsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<RatesCurveGroupEntry>> entriesResult =
        ((Meta) metaBeanResult).entries();
    assertTrue(entriesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveGroupName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<CurveName, SeasonalityDefinition>> seasonalityDefinitionsResult =
        ((Meta) metaBeanResult).seasonalityDefinitions();
    assertTrue(seasonalityDefinitionsResult instanceof DirectMetaProperty);
    assertEquals("computePvSensitivityToMarketQuote", actualMetaPropertyGetResult.name());
    assertSame(
        actualMetaPropertyGetResult, ((Meta) metaBeanResult).computePvSensitivityToMarketQuote());
    assertSame(metaBeanResult, computeJacobianResult.metaBean());
    assertSame(metaBeanResult, curveDefinitionsResult.metaBean());
    assertSame(metaBeanResult, entriesResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, seasonalityDefinitionsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code seasonalityDefinitions}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'seasonalityDefinitions'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsSeasonalityDefinitions() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveGroupDefinition.meta().metaPropertyGet("seasonalityDefinitions");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).computeJacobian() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).computePvSensitivityToMarketQuote() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).curveDefinitions() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).entries() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertEquals("seasonalityDefinitions", actualMetaPropertyGetResult.name());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).seasonalityDefinitions());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code computeJacobian}.
   *   <li>Then return name is {@code computeJacobian}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'computeJacobian'; then return name is 'computeJacobian'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenComputeJacobian_thenReturnNameIsComputeJacobian() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveGroupDefinition.meta().metaPropertyGet("computeJacobian");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> computePvSensitivityToMarketQuoteResult =
        ((Meta) metaBeanResult).computePvSensitivityToMarketQuote();
    assertTrue(computePvSensitivityToMarketQuoteResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<CurveDefinition>> curveDefinitionsResult =
        ((Meta) metaBeanResult).curveDefinitions();
    assertTrue(curveDefinitionsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<RatesCurveGroupEntry>> entriesResult =
        ((Meta) metaBeanResult).entries();
    assertTrue(entriesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveGroupName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<CurveName, SeasonalityDefinition>> seasonalityDefinitionsResult =
        ((Meta) metaBeanResult).seasonalityDefinitions();
    assertTrue(seasonalityDefinitionsResult instanceof DirectMetaProperty);
    assertEquals("computeJacobian", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).computeJacobian());
    assertSame(metaBeanResult, computePvSensitivityToMarketQuoteResult.metaBean());
    assertSame(metaBeanResult, curveDefinitionsResult.metaBean());
    assertSame(metaBeanResult, entriesResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, seasonalityDefinitionsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code curveDefinitions}.
   *   <li>Then return name is {@code curveDefinitions}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'curveDefinitions'; then return name is 'curveDefinitions'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurveDefinitions_thenReturnNameIsCurveDefinitions() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveGroupDefinition.meta().metaPropertyGet("curveDefinitions");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> computeJacobianResult = ((Meta) metaBeanResult).computeJacobian();
    assertTrue(computeJacobianResult instanceof DirectMetaProperty);
    MetaProperty<Boolean> computePvSensitivityToMarketQuoteResult =
        ((Meta) metaBeanResult).computePvSensitivityToMarketQuote();
    assertTrue(computePvSensitivityToMarketQuoteResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<RatesCurveGroupEntry>> entriesResult =
        ((Meta) metaBeanResult).entries();
    assertTrue(entriesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveGroupName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<CurveName, SeasonalityDefinition>> seasonalityDefinitionsResult =
        ((Meta) metaBeanResult).seasonalityDefinitions();
    assertTrue(seasonalityDefinitionsResult instanceof DirectMetaProperty);
    assertEquals("curveDefinitions", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).curveDefinitions());
    assertSame(metaBeanResult, computeJacobianResult.metaBean());
    assertSame(metaBeanResult, computePvSensitivityToMarketQuoteResult.metaBean());
    assertSame(metaBeanResult, entriesResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, seasonalityDefinitionsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code entries}.
   *   <li>Then return name is {@code entries}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'entries'; then return name is 'entries'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenEntries_thenReturnNameIsEntries() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveGroupDefinition.meta().metaPropertyGet("entries");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> computeJacobianResult = ((Meta) metaBeanResult).computeJacobian();
    assertTrue(computeJacobianResult instanceof DirectMetaProperty);
    MetaProperty<Boolean> computePvSensitivityToMarketQuoteResult =
        ((Meta) metaBeanResult).computePvSensitivityToMarketQuote();
    assertTrue(computePvSensitivityToMarketQuoteResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<CurveDefinition>> curveDefinitionsResult =
        ((Meta) metaBeanResult).curveDefinitions();
    assertTrue(curveDefinitionsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveGroupName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<CurveName, SeasonalityDefinition>> seasonalityDefinitionsResult =
        ((Meta) metaBeanResult).seasonalityDefinitions();
    assertTrue(seasonalityDefinitionsResult instanceof DirectMetaProperty);
    assertEquals("entries", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).entries());
    assertSame(metaBeanResult, computeJacobianResult.metaBean());
    assertSame(metaBeanResult, computePvSensitivityToMarketQuoteResult.metaBean());
    assertSame(metaBeanResult, curveDefinitionsResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, seasonalityDefinitionsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'name'; then return 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenName_thenReturnName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveGroupDefinition.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).computeJacobian() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).computePvSensitivityToMarketQuote() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).curveDefinitions() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).entries() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).seasonalityDefinitions() instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<CurveGroupName> expectedPropertyTypeResult = CurveGroupName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
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
    assertNull(RatesCurveGroupDefinition.meta().metaPropertyGet("Property Name"));
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
        RatesCurveGroupDefinition.meta().metaPropertyMap();

    // Assert
    assertEquals(6, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("computeJacobian") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("computePvSensitivityToMarketQuote")
            instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("curveDefinitions") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("entries") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("seasonalityDefinitions") instanceof DirectMetaProperty);
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
    assertNull(
        RatesCurveGroupDefinition.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code computeJacobian}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'computeJacobian'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenComputeJacobian_thenReturnTrue() {
    // Arrange
    Meta metaResult = RatesCurveGroupDefinition.meta();
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition bean = RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertTrue((Boolean) metaResult.propertyGet(bean, "computeJacobian", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code computePvSensitivityToMarketQuote}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'computePvSensitivityToMarketQuote'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenComputePvSensitivityToMarketQuote_thenReturnFalse() {
    // Arrange
    Meta metaResult = RatesCurveGroupDefinition.meta();
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition bean = RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertFalse((Boolean) metaResult.propertyGet(bean, "computePvSensitivityToMarketQuote", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code curveDefinitions}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'curveDefinitions'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCurveDefinitions_thenReturnList() {
    // Arrange
    Meta metaResult = RatesCurveGroupDefinition.meta();
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition bean = RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "curveDefinitions", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code entries}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'entries'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEntries_thenReturnList() {
    // Arrange
    Meta metaResult = RatesCurveGroupDefinition.meta();
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition bean = RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "entries", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
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
    Meta metaResult = RatesCurveGroupDefinition.meta();
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition bean = RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@link CurveGroupName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'name'; then return CurveGroupName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenName_thenReturnCurveGroupNameWithName() {
    // Arrange
    Meta metaResult = RatesCurveGroupDefinition.meta();
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition bean = RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertSame(name, metaResult.propertyGet(bean, "name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code seasonalityDefinitions}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'seasonalityDefinitions'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSeasonalityDefinitions_thenReturnMap() {
    // Arrange
    Meta metaResult = RatesCurveGroupDefinition.meta();
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition bean = RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "seasonalityDefinitions", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code computeJacobian}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'computeJacobian'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenComputeJacobian_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveGroupDefinition.meta()
                .propertySet(mock(Bean.class), "computeJacobian", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code computePvSensitivityToMarketQuote}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'computePvSensitivityToMarketQuote'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenComputePvSensitivityToMarketQuote_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveGroupDefinition.meta()
                .propertySet(
                    mock(Bean.class), "computePvSensitivityToMarketQuote", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code curveDefinitions}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'curveDefinitions'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurveDefinitions_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveGroupDefinition.meta()
                .propertySet(mock(Bean.class), "curveDefinitions", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code entries}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'entries'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenEntries_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveGroupDefinition.meta()
                .propertySet(mock(Bean.class), "entries", "New Value", true));
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
            RatesCurveGroupDefinition.meta()
                .propertySet(mock(Bean.class), "computeJacobian", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'name'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveGroupDefinition.meta()
                .propertySet(mock(Bean.class), "name", "New Value", true));
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
            RatesCurveGroupDefinition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code seasonalityDefinitions}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'seasonalityDefinitions'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSeasonalityDefinitions_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveGroupDefinition.meta()
                .propertySet(mock(Bean.class), "seasonalityDefinitions", "New Value", true));
  }

  /**
   * Test {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection, Collection)} with {@code
   * name}, {@code entries}, {@code curveDefinitions}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Collection, Collection) with 'name', 'entries', 'curveDefinitions'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.of(CurveGroupName, Collection, Collection)"
  })
  void testOfWithNameEntriesCurveDefinitions() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("curveName");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());

    // Act
    RatesCurveGroupDefinition actualOfResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries2 = actualOfResult.getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("curveName", curveName3.getName());
    assertSame(curveName2, entries2.get(1).getCurveName());
    assertSame(curveName, curveName3);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection, Collection, Map)} with
   * {@code name}, {@code entries}, {@code curveDefinitions}, {@code seasonalityDefinitions}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection,
   * Collection, Map)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Collection, Collection, Map) with 'name', 'entries', 'curveDefinitions', 'seasonalityDefinitions'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.of(CurveGroupName, Collection, Collection, Map)"
  })
  void testOfWithNameEntriesCurveDefinitionsSeasonalityDefinitions() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    // Act
    RatesCurveGroupDefinition actualOfResult =
        RatesCurveGroupDefinition.of(name, entries, curveDefinitions, new HashMap<>());

    // Assert
    ImmutableList<CurveDefinition> curveDefinitions2 = actualOfResult.getCurveDefinitions();
    assertTrue(curveDefinitions2.isEmpty());
    assertSame(curveDefinitions2, actualOfResult.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection, Collection, Map)} with
   * {@code name}, {@code entries}, {@code curveDefinitions}, {@code seasonalityDefinitions}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection,
   * Collection, Map)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Collection, Collection, Map) with 'name', 'entries', 'curveDefinitions', 'seasonalityDefinitions'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.of(CurveGroupName, Collection, Collection, Map)"
  })
  void testOfWithNameEntriesCurveDefinitionsSeasonalityDefinitions2() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    // Act
    RatesCurveGroupDefinition actualOfResult =
        RatesCurveGroupDefinition.of(name, entries, curveDefinitions, new HashMap<>());

    // Assert
    assertEquals(curveDefinitions, actualOfResult.getCurveDefinitions());
    assertEquals(entries, actualOfResult.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection, Collection, Map)} with
   * {@code name}, {@code entries}, {@code curveDefinitions}, {@code seasonalityDefinitions}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection,
   * Collection, Map)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Collection, Collection, Map) with 'name', 'entries', 'curveDefinitions', 'seasonalityDefinitions'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.of(CurveGroupName, Collection, Collection, Map)"
  })
  void testOfWithNameEntriesCurveDefinitionsSeasonalityDefinitions3() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    // Act
    RatesCurveGroupDefinition actualOfResult =
        RatesCurveGroupDefinition.of(name, entries, curveDefinitions, new HashMap<>());

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries2 = actualOfResult.getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("name", curveName3.getName());
    assertSame(curveName2, entries2.get(1).getCurveName());
    assertSame(curveName, curveName3);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection, Collection, Map)} with
   * {@code name}, {@code entries}, {@code curveDefinitions}, {@code seasonalityDefinitions}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection,
   * Collection, Map)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Collection, Collection, Map) with 'name', 'entries', 'curveDefinitions', 'seasonalityDefinitions'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.of(CurveGroupName, Collection, Collection, Map)"
  })
  void testOfWithNameEntriesCurveDefinitionsSeasonalityDefinitions4() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("curveName");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    // Act
    RatesCurveGroupDefinition actualOfResult =
        RatesCurveGroupDefinition.of(name, entries, curveDefinitions, new HashMap<>());

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries2 = actualOfResult.getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("curveName", curveName3.getName());
    assertSame(curveName2, entries2.get(1).getCurveName());
    assertSame(curveName, curveName3);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection, Collection)} with {@code
   * name}, {@code entries}, {@code curveDefinitions}.
   *
   * <ul>
   *   <li>Then return CurveDefinitions Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Collection, Collection) with 'name', 'entries', 'curveDefinitions'; then return CurveDefinitions Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.of(CurveGroupName, Collection, Collection)"
  })
  void testOfWithNameEntriesCurveDefinitions_thenReturnCurveDefinitionsEmpty() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    // Act
    RatesCurveGroupDefinition actualOfResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Assert
    ImmutableList<CurveDefinition> curveDefinitions = actualOfResult.getCurveDefinitions();
    assertTrue(curveDefinitions.isEmpty());
    assertSame(curveDefinitions, actualOfResult.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection, Collection)} with {@code
   * name}, {@code entries}, {@code curveDefinitions}.
   *
   * <ul>
   *   <li>Then return CurveDefinitions is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Collection, Collection) with 'name', 'entries', 'curveDefinitions'; then return CurveDefinitions is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.of(CurveGroupName, Collection, Collection)"
  })
  void testOfWithNameEntriesCurveDefinitions_thenReturnCurveDefinitionsIsArrayList() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    // Act
    RatesCurveGroupDefinition actualOfResult =
        RatesCurveGroupDefinition.of(name, entries, curveDefinitions);

    // Assert
    assertEquals(curveDefinitions, actualOfResult.getCurveDefinitions());
    assertEquals(entries, actualOfResult.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection, Collection)} with {@code
   * name}, {@code entries}, {@code curveDefinitions}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#of(CurveGroupName, Collection,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Collection, Collection) with 'name', 'entries', 'curveDefinitions'; then return Entries first CurveName Name is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.of(CurveGroupName, Collection, Collection)"
  })
  void testOfWithNameEntriesCurveDefinitions_thenReturnEntriesFirstCurveNameNameIsName() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());

    // Act
    RatesCurveGroupDefinition actualOfResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries2 = actualOfResult.getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("name", curveName3.getName());
    assertSame(curveName2, entries2.get(1).getCurveName());
    assertSame(curveName, curveName3);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#RatesCurveGroupDefinition(CurveGroupName, Collection,
   * Collection, Map, boolean, boolean)}.
   *
   * <ul>
   *   <li>Then return CurveDefinitions Empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinition#RatesCurveGroupDefinition(CurveGroupName, Collection, Collection,
   * Map, boolean, boolean)}
   */
  @Test
  @DisplayName(
      "Test new RatesCurveGroupDefinition(CurveGroupName, Collection, Collection, Map, boolean, boolean); then return CurveDefinitions Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurveGroupDefinition.<init>(CurveGroupName, Collection, Collection, Map, boolean, boolean)"
  })
  void testNewRatesCurveGroupDefinition_thenReturnCurveDefinitionsEmpty() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    // Act
    RatesCurveGroupDefinition actualRatesCurveGroupDefinition =
        new RatesCurveGroupDefinition(name, entries, curveDefinitions, new HashMap<>(), true, true);

    // Assert
    ImmutableList<CurveDefinition> curveDefinitions2 =
        actualRatesCurveGroupDefinition.getCurveDefinitions();
    assertTrue(curveDefinitions2.isEmpty());
    assertSame(curveDefinitions2, actualRatesCurveGroupDefinition.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#RatesCurveGroupDefinition(CurveGroupName, Collection,
   * Collection, Map, boolean, boolean)}.
   *
   * <ul>
   *   <li>Then return CurveDefinitions is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinition#RatesCurveGroupDefinition(CurveGroupName, Collection, Collection,
   * Map, boolean, boolean)}
   */
  @Test
  @DisplayName(
      "Test new RatesCurveGroupDefinition(CurveGroupName, Collection, Collection, Map, boolean, boolean); then return CurveDefinitions is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurveGroupDefinition.<init>(CurveGroupName, Collection, Collection, Map, boolean, boolean)"
  })
  void testNewRatesCurveGroupDefinition_thenReturnCurveDefinitionsIsArrayList() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    // Act
    RatesCurveGroupDefinition actualRatesCurveGroupDefinition =
        new RatesCurveGroupDefinition(name, entries, curveDefinitions, new HashMap<>(), true, true);

    // Assert
    assertEquals(curveDefinitions, actualRatesCurveGroupDefinition.getCurveDefinitions());
    assertEquals(entries, actualRatesCurveGroupDefinition.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#RatesCurveGroupDefinition(CurveGroupName, Collection,
   * Collection, Map, boolean, boolean)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code curveName}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinition#RatesCurveGroupDefinition(CurveGroupName, Collection, Collection,
   * Map, boolean, boolean)}
   */
  @Test
  @DisplayName(
      "Test new RatesCurveGroupDefinition(CurveGroupName, Collection, Collection, Map, boolean, boolean); then return Entries first CurveName Name is 'curveName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurveGroupDefinition.<init>(CurveGroupName, Collection, Collection, Map, boolean, boolean)"
  })
  void testNewRatesCurveGroupDefinition_thenReturnEntriesFirstCurveNameNameIsCurveName() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("curveName");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    // Act
    RatesCurveGroupDefinition actualRatesCurveGroupDefinition =
        new RatesCurveGroupDefinition(name, entries, curveDefinitions, new HashMap<>(), true, true);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries2 = actualRatesCurveGroupDefinition.getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("curveName", curveName3.getName());
    assertSame(curveName2, entries2.get(1).getCurveName());
    assertSame(curveName, curveName3);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#RatesCurveGroupDefinition(CurveGroupName, Collection,
   * Collection, Map, boolean, boolean)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinition#RatesCurveGroupDefinition(CurveGroupName, Collection, Collection,
   * Map, boolean, boolean)}
   */
  @Test
  @DisplayName(
      "Test new RatesCurveGroupDefinition(CurveGroupName, Collection, Collection, Map, boolean, boolean); then return Entries first CurveName Name is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurveGroupDefinition.<init>(CurveGroupName, Collection, Collection, Map, boolean, boolean)"
  })
  void testNewRatesCurveGroupDefinition_thenReturnEntriesFirstCurveNameNameIsName() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    // Act
    RatesCurveGroupDefinition actualRatesCurveGroupDefinition =
        new RatesCurveGroupDefinition(name, entries, curveDefinitions, new HashMap<>(), true, true);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries2 = actualRatesCurveGroupDefinition.getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("name", curveName3.getName());
    assertSame(curveName2, entries2.get(1).getCurveName());
    assertSame(curveName, curveName3);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#createGroupId(ObservableSource)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#createGroupId(ObservableSource)}
   */
  @Test
  @DisplayName("Test createGroupId(ObservableSource)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroupId RatesCurveGroupDefinition.createGroupId(ObservableSource)"})
  void testCreateGroupId() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("curveGroupName");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, curveDefinitions, new HashMap<>());
    ObservableSource source = ObservableSource.of("Name");

    // Act
    RatesCurveGroupId actualCreateGroupIdResult = ofResult.createGroupId(source);

    // Assert
    Class<RatesCurveGroup> expectedMarketDataType = RatesCurveGroup.class;
    assertEquals(expectedMarketDataType, actualCreateGroupIdResult.getMarketDataType());
    assertSame(source, actualCreateGroupIdResult.getObservableSource());
    assertSame(name, actualCreateGroupIdResult.getCurveGroupName());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#createGroupId(ObservableSource)}.
   *
   * <ul>
   *   <li>Then return CurveGroupName is {@link CurveGroupName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#createGroupId(ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test createGroupId(ObservableSource); then return CurveGroupName is CurveGroupName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroupId RatesCurveGroupDefinition.createGroupId(ObservableSource)"})
  void testCreateGroupId_thenReturnCurveGroupNameIsCurveGroupNameWithName() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());
    ObservableSource source = ObservableSource.of("Name");

    // Act
    RatesCurveGroupId actualCreateGroupIdResult = ofResult.createGroupId(source);

    // Assert
    Class<RatesCurveGroup> expectedMarketDataType = RatesCurveGroup.class;
    assertEquals(expectedMarketDataType, actualCreateGroupIdResult.getMarketDataType());
    assertSame(source, actualCreateGroupIdResult.getObservableSource());
    assertSame(name, actualCreateGroupIdResult.getCurveGroupName());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#filtered(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#filtered(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test filtered(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.filtered(LocalDate, ReferenceData)"
  })
  void testFiltered() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualFilteredResult =
        ofResult.filtered(LocalDate.of(1970, 1, 1), mock(ReferenceData.class));

    // Assert
    assertEquals(ofResult, actualFilteredResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#filtered(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return CurveDefinitions is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#filtered(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test filtered(LocalDate, ReferenceData); then return CurveDefinitions is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.filtered(LocalDate, ReferenceData)"
  })
  void testFiltered_thenReturnCurveDefinitionsIsArrayList() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, curveDefinitions);

    // Act
    RatesCurveGroupDefinition actualFilteredResult =
        ofResult.filtered(LocalDate.of(1970, 1, 1), mock(ReferenceData.class));

    // Assert
    assertEquals(curveDefinitions, actualFilteredResult.getCurveDefinitions());
    assertEquals(entries, actualFilteredResult.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#filtered(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#filtered(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test filtered(LocalDate, ReferenceData); then return Entries first CurveName Name is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.filtered(LocalDate, ReferenceData)"
  })
  void testFiltered_thenReturnEntriesFirstCurveNameNameIs42() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("42");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    ImmutableList<RatesCurveGroupEntry> entries2 =
        ofResult.filtered(LocalDate.of(1970, 1, 1), mock(ReferenceData.class)).getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("42", curveName3.getName());
    assertSame(curveName, curveName3);
    assertSame(curveName2, entries2.get(1).getCurveName());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#filtered(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#filtered(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test filtered(LocalDate, ReferenceData); then return Entries first CurveName Name is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.filtered(LocalDate, ReferenceData)"
  })
  void testFiltered_thenReturnEntriesFirstCurveNameNameIsName() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    ImmutableList<RatesCurveGroupEntry> entries2 =
        ofResult.filtered(LocalDate.of(1970, 1, 1), mock(ReferenceData.class)).getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("name", curveName3.getName());
    assertSame(curveName2, entries2.get(1).getCurveName());
    assertSame(curveName, curveName3);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#bindTimeSeries(LocalDate, Map)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#bindTimeSeries(LocalDate, Map)}
   */
  @Test
  @DisplayName("Test bindTimeSeries(LocalDate, Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.bindTimeSeries(LocalDate, Map)"
  })
  void testBindTimeSeries() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act
    RatesCurveGroupDefinition actualBindTimeSeriesResult =
        ofResult.bindTimeSeries(valuationDate, new HashMap<>());

    // Assert
    assertEquals(ofResult, actualBindTimeSeriesResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findDiscountCurveName(Currency)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findDiscountCurveName(Currency)}
   */
  @Test
  @DisplayName("Test findDiscountCurveName(Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findDiscountCurveName(Currency)"})
  void testFindDiscountCurveName() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.findDiscountCurveName(null).isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findDiscountCurveName(Currency)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findDiscountCurveName(Currency)}
   */
  @Test
  @DisplayName("Test findDiscountCurveName(Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findDiscountCurveName(Currency)"})
  void testFindDiscountCurveName2() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.findDiscountCurveName(null).isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findDiscountCurveName(Currency)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findDiscountCurveName(Currency)}
   */
  @Test
  @DisplayName("Test findDiscountCurveName(Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findDiscountCurveName(Currency)"})
  void testFindDiscountCurveName3() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.findDiscountCurveName(null).isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findForwardCurveName(Index)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findForwardCurveName(Index)}
   */
  @Test
  @DisplayName("Test findForwardCurveName(Index)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findForwardCurveName(Index)"})
  void testFindForwardCurveName() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Optional<CurveName> actualFindForwardCurveNameResult =
        ofResult.findForwardCurveName(mock(Index.class));

    // Assert
    assertFalse(actualFindForwardCurveNameResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findForwardCurveName(Index)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findForwardCurveName(Index)}
   */
  @Test
  @DisplayName("Test findForwardCurveName(Index)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findForwardCurveName(Index)"})
  void testFindForwardCurveName2() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Optional<CurveName> actualFindForwardCurveNameResult =
        ofResult.findForwardCurveName(mock(Index.class));

    // Assert
    assertFalse(actualFindForwardCurveNameResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findForwardCurveName(Index)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findForwardCurveName(Index)}
   */
  @Test
  @DisplayName("Test findForwardCurveName(Index)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findForwardCurveName(Index)"})
  void testFindForwardCurveName3() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Optional<CurveName> actualFindForwardCurveNameResult =
        ofResult.findForwardCurveName(mock(Index.class));

    // Assert
    assertFalse(actualFindForwardCurveNameResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findForwardCurveName(Index)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findForwardCurveName(Index)}
   */
  @Test
  @DisplayName("Test findForwardCurveName(Index); given HashSet() add Index")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findForwardCurveName(Index)"})
  void testFindForwardCurveName_givenHashSetAddIndex() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Optional<CurveName> actualFindForwardCurveNameResult =
        ofResult.findForwardCurveName(mock(Index.class));

    // Assert
    assertFalse(actualFindForwardCurveNameResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findForwardCurveNames(FloatingRateName)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findForwardCurveNames(FloatingRateName)}
   */
  @Test
  @DisplayName("Test findForwardCurveNames(FloatingRateName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet RatesCurveGroupDefinition.findForwardCurveNames(FloatingRateName)"
  })
  void testFindForwardCurveNames() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    FloatingRateName forwardName = mock(FloatingRateName.class);
    when(forwardName.normalized())
        .thenReturn(
            ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.IBOR));

    // Act
    ImmutableSet<CurveName> actualFindForwardCurveNamesResult =
        ofResult.findForwardCurveNames(forwardName);

    // Assert
    verify(forwardName).normalized();
    assertTrue(actualFindForwardCurveNamesResult.isEmpty());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findForwardCurveNames(FloatingRateName)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findForwardCurveNames(FloatingRateName)}
   */
  @Test
  @DisplayName(
      "Test findForwardCurveNames(FloatingRateName); given HashSet() add Index; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet RatesCurveGroupDefinition.findForwardCurveNames(FloatingRateName)"
  })
  void testFindForwardCurveNames_givenHashSetAddIndex_thenReturnEmpty() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    FloatingRateName forwardName = mock(FloatingRateName.class);
    when(forwardName.normalized())
        .thenReturn(
            ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.IBOR));

    // Act
    ImmutableSet<CurveName> actualFindForwardCurveNamesResult =
        ofResult.findForwardCurveNames(forwardName);

    // Assert
    verify(forwardName).normalized();
    assertTrue(actualFindForwardCurveNamesResult.isEmpty());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findForwardCurveNames(FloatingRateName)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findForwardCurveNames(FloatingRateName)}
   */
  @Test
  @DisplayName(
      "Test findForwardCurveNames(FloatingRateName); given HashSet() add Index; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet RatesCurveGroupDefinition.findForwardCurveNames(FloatingRateName)"
  })
  void testFindForwardCurveNames_givenHashSetAddIndex_thenReturnEmpty2() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    FloatingRateName forwardName = mock(FloatingRateName.class);
    when(forwardName.normalized())
        .thenReturn(
            ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.IBOR));

    // Act
    ImmutableSet<CurveName> actualFindForwardCurveNamesResult =
        ofResult.findForwardCurveNames(forwardName);

    // Assert
    verify(forwardName).normalized();
    assertTrue(actualFindForwardCurveNamesResult.isEmpty());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findForwardCurveNames(FloatingRateName)}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findForwardCurveNames(FloatingRateName)}
   */
  @Test
  @DisplayName("Test findForwardCurveNames(FloatingRateName); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet RatesCurveGroupDefinition.findForwardCurveNames(FloatingRateName)"
  })
  void testFindForwardCurveNames_thenReturnEmpty() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    FloatingRateName forwardName = mock(FloatingRateName.class);
    when(forwardName.normalized())
        .thenReturn(
            ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.IBOR));

    // Act
    ImmutableSet<CurveName> actualFindForwardCurveNamesResult =
        ofResult.findForwardCurveNames(forwardName);

    // Assert
    verify(forwardName).normalized();
    assertTrue(actualFindForwardCurveNamesResult.isEmpty());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findEntry(CurveName)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findEntry(CurveName)}
   */
  @Test
  @DisplayName("Test findEntry(CurveName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findEntry(CurveName)"})
  void testFindEntry() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("42"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Optional<RatesCurveGroupEntry> actualFindEntryResult = ofResult.findEntry(CurveName.of("Name"));

    // Assert
    RatesCurveGroupEntry getResult = actualFindEntryResult.get();
    ImmutableSet<Currency> discountCurrencies = getResult.getDiscountCurrencies();
    assertTrue(discountCurrencies.isEmpty());
    assertTrue(actualFindEntryResult.isPresent());
    assertSame(curveName, getResult.getCurveName());
    assertSame(discountCurrencies, getResult.getIndices());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findEntry(CurveName)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findEntry(CurveName)}
   */
  @Test
  @DisplayName("Test findEntry(CurveName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findEntry(CurveName)"})
  void testFindEntry2() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("42"));

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Optional<RatesCurveGroupEntry> actualFindEntryResult = ofResult.findEntry(CurveName.of("Name"));

    // Assert
    assertFalse(actualFindEntryResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findEntry(CurveName)}.
   *
   * <ul>
   *   <li>Then return {@link Optional#get()} DiscountCurrencies Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findEntry(CurveName)}
   */
  @Test
  @DisplayName("Test findEntry(CurveName); then return get() DiscountCurrencies Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findEntry(CurveName)"})
  void testFindEntry_thenReturnGetDiscountCurrenciesEmpty() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Optional<RatesCurveGroupEntry> actualFindEntryResult = ofResult.findEntry(CurveName.of("Name"));

    // Assert
    RatesCurveGroupEntry getResult = actualFindEntryResult.get();
    ImmutableSet<Currency> discountCurrencies = getResult.getDiscountCurrencies();
    assertTrue(discountCurrencies.isEmpty());
    assertTrue(actualFindEntryResult.isPresent());
    assertSame(curveName, getResult.getCurveName());
    assertSame(discountCurrencies, getResult.getIndices());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findEntry(CurveName)}.
   *
   * <ul>
   *   <li>Then return {@link Optional#get()} DiscountCurrencies Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findEntry(CurveName)}
   */
  @Test
  @DisplayName("Test findEntry(CurveName); then return get() DiscountCurrencies Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findEntry(CurveName)"})
  void testFindEntry_thenReturnGetDiscountCurrenciesEmpty2() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Optional<RatesCurveGroupEntry> actualFindEntryResult = ofResult.findEntry(CurveName.of("Name"));

    // Assert
    RatesCurveGroupEntry getResult = actualFindEntryResult.get();
    ImmutableSet<Currency> discountCurrencies = getResult.getDiscountCurrencies();
    assertTrue(discountCurrencies.isEmpty());
    assertTrue(actualFindEntryResult.isPresent());
    assertSame(curveName, getResult.getCurveName());
    assertSame(discountCurrencies, getResult.getIndices());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findEntry(CurveName)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findEntry(CurveName)}
   */
  @Test
  @DisplayName("Test findEntry(CurveName); when CurveName with 'Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findEntry(CurveName)"})
  void testFindEntry_whenCurveNameWithName_thenReturnNotPresent() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Optional<RatesCurveGroupEntry> actualFindEntryResult = ofResult.findEntry(CurveName.of("Name"));

    // Assert
    assertFalse(actualFindEntryResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findEntry(CurveName)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findEntry(CurveName)}
   */
  @Test
  @DisplayName("Test findEntry(CurveName); when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findEntry(CurveName)"})
  void testFindEntry_whenNull_thenReturnNotPresent() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.findEntry(null).isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findCurveDefinition(CurveName)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findCurveDefinition(CurveName)}
   */
  @Test
  @DisplayName("Test findCurveDefinition(CurveName); when CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findCurveDefinition(CurveName)"})
  void testFindCurveDefinition_whenCurveNameWithName() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    Optional<CurveDefinition> actualFindCurveDefinitionResult =
        ofResult.findCurveDefinition(CurveName.of("Name"));

    // Assert
    assertFalse(actualFindCurveDefinitionResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#findCurveDefinition(CurveName)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#findCurveDefinition(CurveName)}
   */
  @Test
  @DisplayName("Test findCurveDefinition(CurveName); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroupDefinition.findCurveDefinition(CurveName)"})
  void testFindCurveDefinition_whenNull() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.findCurveDefinition(null).isPresent());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#metadata(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#metadata(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test metadata(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList RatesCurveGroupDefinition.metadata(LocalDate, ReferenceData)"})
  void testMetadata() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.metadata(LocalDate.of(1970, 1, 1), mock(ReferenceData.class)).isEmpty());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#getTotalParameterCount()}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#getTotalParameterCount()}
   */
  @Test
  @DisplayName("Test getTotalParameterCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int RatesCurveGroupDefinition.getTotalParameterCount()"})
  void testGetTotalParameterCount() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertEquals(0, ofResult.getTotalParameterCount());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#resolvedTrades(MarketData, ReferenceData)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#resolvedTrades(MarketData,
   * ReferenceData)}
   */
  @Test
  @DisplayName("Test resolvedTrades(MarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList RatesCurveGroupDefinition.resolvedTrades(MarketData, ReferenceData)"
  })
  void testResolvedTrades() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.resolvedTrades(null, mock(ReferenceData.class)).isEmpty());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#initialGuesses(MarketData)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#initialGuesses(MarketData)}
   */
  @Test
  @DisplayName("Test initialGuesses(MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList RatesCurveGroupDefinition.initialGuesses(MarketData)"})
  void testInitialGuesses() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.initialGuesses(null).isEmpty());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withCurveDefinitions(List)}.
   *
   * <ul>
   *   <li>Then return CurveDefinitions Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withCurveDefinitions(List)}
   */
  @Test
  @DisplayName("Test withCurveDefinitions(List); then return CurveDefinitions Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withCurveDefinitions(List)"
  })
  void testWithCurveDefinitions_thenReturnCurveDefinitionsEmpty() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualWithCurveDefinitionsResult =
        ofResult.withCurveDefinitions(new ArrayList<>());

    // Assert
    ImmutableList<CurveDefinition> curveDefinitions =
        actualWithCurveDefinitionsResult.getCurveDefinitions();
    assertTrue(curveDefinitions.isEmpty());
    assertSame(curveDefinitions, actualWithCurveDefinitionsResult.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withCurveDefinitions(List)}.
   *
   * <ul>
   *   <li>Then return CurveDefinitions is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withCurveDefinitions(List)}
   */
  @Test
  @DisplayName("Test withCurveDefinitions(List); then return CurveDefinitions is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withCurveDefinitions(List)"
  })
  void testWithCurveDefinitions_thenReturnCurveDefinitionsIsArrayList() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, curveDefinitions);

    // Act
    RatesCurveGroupDefinition actualWithCurveDefinitionsResult =
        ofResult.withCurveDefinitions(new ArrayList<>());

    // Assert
    assertEquals(curveDefinitions, actualWithCurveDefinitionsResult.getCurveDefinitions());
    assertEquals(entries, actualWithCurveDefinitionsResult.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withCurveDefinitions(List)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withCurveDefinitions(List)}
   */
  @Test
  @DisplayName("Test withCurveDefinitions(List); then return Entries first CurveName Name is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withCurveDefinitions(List)"
  })
  void testWithCurveDefinitions_thenReturnEntriesFirstCurveNameNameIs42() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("42");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    ImmutableList<RatesCurveGroupEntry> entries2 =
        ofResult.withCurveDefinitions(new ArrayList<>()).getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("42", curveName3.getName());
    assertSame(curveName, curveName3);
    assertSame(curveName2, entries2.get(1).getCurveName());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withCurveDefinitions(List)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withCurveDefinitions(List)}
   */
  @Test
  @DisplayName(
      "Test withCurveDefinitions(List); then return Entries first CurveName Name is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withCurveDefinitions(List)"
  })
  void testWithCurveDefinitions_thenReturnEntriesFirstCurveNameNameIsName() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    ImmutableList<RatesCurveGroupEntry> entries2 =
        ofResult.withCurveDefinitions(new ArrayList<>()).getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("name", curveName3.getName());
    assertSame(curveName2, entries2.get(1).getCurveName());
    assertSame(curveName, curveName3);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withSeasonalityDefinitions(Map)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withSeasonalityDefinitions(Map)}
   */
  @Test
  @DisplayName("Test withSeasonalityDefinitions(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withSeasonalityDefinitions(Map)"
  })
  void testWithSeasonalityDefinitions() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualWithSeasonalityDefinitionsResult =
        ofResult.withSeasonalityDefinitions(new HashMap<>());

    // Assert
    assertEquals(ofResult, actualWithSeasonalityDefinitionsResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withSeasonalityDefinitions(Map)}.
   *
   * <ul>
   *   <li>Then return CurveDefinitions is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withSeasonalityDefinitions(Map)}
   */
  @Test
  @DisplayName("Test withSeasonalityDefinitions(Map); then return CurveDefinitions is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withSeasonalityDefinitions(Map)"
  })
  void testWithSeasonalityDefinitions_thenReturnCurveDefinitionsIsArrayList() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, curveDefinitions);

    // Act
    RatesCurveGroupDefinition actualWithSeasonalityDefinitionsResult =
        ofResult.withSeasonalityDefinitions(new HashMap<>());

    // Assert
    assertEquals(curveDefinitions, actualWithSeasonalityDefinitionsResult.getCurveDefinitions());
    assertEquals(entries, actualWithSeasonalityDefinitionsResult.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withSeasonalityDefinitions(Map)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withSeasonalityDefinitions(Map)}
   */
  @Test
  @DisplayName(
      "Test withSeasonalityDefinitions(Map); then return Entries first CurveName Name is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withSeasonalityDefinitions(Map)"
  })
  void testWithSeasonalityDefinitions_thenReturnEntriesFirstCurveNameNameIs42() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("42");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    ImmutableList<RatesCurveGroupEntry> entries2 =
        ofResult.withSeasonalityDefinitions(new HashMap<>()).getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("42", curveName3.getName());
    assertSame(curveName, curveName3);
    assertSame(curveName2, entries2.get(1).getCurveName());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withSeasonalityDefinitions(Map)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withSeasonalityDefinitions(Map)}
   */
  @Test
  @DisplayName(
      "Test withSeasonalityDefinitions(Map); then return Entries first CurveName Name is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withSeasonalityDefinitions(Map)"
  })
  void testWithSeasonalityDefinitions_thenReturnEntriesFirstCurveNameNameIsName() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    ImmutableList<RatesCurveGroupEntry> entries2 =
        ofResult.withSeasonalityDefinitions(new HashMap<>()).getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("name", curveName3.getName());
    assertSame(curveName2, entries2.get(1).getCurveName());
    assertSame(curveName, curveName3);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withName(CurveGroupName)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withName(CurveGroupName)}
   */
  @Test
  @DisplayName("Test withName(CurveGroupName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withName(CurveGroupName)"
  })
  void testWithName() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualWithNameResult = ofResult.withName(CurveGroupName.of("Name"));

    // Assert
    assertEquals(ofResult, actualWithNameResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withName(CurveGroupName)}.
   *
   * <ul>
   *   <li>Then return CurveDefinitions is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withName(CurveGroupName)}
   */
  @Test
  @DisplayName("Test withName(CurveGroupName); then return CurveDefinitions is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withName(CurveGroupName)"
  })
  void testWithName_thenReturnCurveDefinitionsIsArrayList() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, curveDefinitions);

    // Act
    RatesCurveGroupDefinition actualWithNameResult = ofResult.withName(CurveGroupName.of("Name"));

    // Assert
    assertEquals(curveDefinitions, actualWithNameResult.getCurveDefinitions());
    assertEquals(entries, actualWithNameResult.getEntries());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withName(CurveGroupName)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withName(CurveGroupName)}
   */
  @Test
  @DisplayName("Test withName(CurveGroupName); then return Entries first CurveName Name is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withName(CurveGroupName)"
  })
  void testWithName_thenReturnEntriesFirstCurveNameNameIs42() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("42");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualWithNameResult = ofResult.withName(CurveGroupName.of("Name"));

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries2 = actualWithNameResult.getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("42", curveName3.getName());
    assertSame(curveName, curveName3);
    assertSame(curveName2, entries2.get(1).getCurveName());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#withName(CurveGroupName)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#withName(CurveGroupName)}
   */
  @Test
  @DisplayName("Test withName(CurveGroupName); then return Entries first CurveName Name is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.withName(CurveGroupName)"
  })
  void testWithName_thenReturnEntriesFirstCurveNameNameIsName() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualWithNameResult = ofResult.withName(CurveGroupName.of("Name"));

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries2 = actualWithNameResult.getEntries();
    assertEquals(2, entries2.size());
    CurveName curveName3 = entries2.get(0).getCurveName();
    assertEquals("name", curveName3.getName());
    assertSame(curveName2, entries2.get(1).getCurveName());
    assertSame(curveName, curveName3);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName("Test combinedWith(RatesCurveGroupDefinition)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());
    CurveGroupName name2 = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    assertEquals(ofResult, actualCombinedWithResult);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return Entries first Indices is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(RatesCurveGroupDefinition); given HashSet() add Index; then return Entries first Indices is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_givenHashSetAddIndex_thenReturnEntriesFirstIndicesIsHashSet() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult2.discountCurrencies(new HashSet<>());
    entries2.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(1, entries3.size());
    RatesCurveGroupEntry getResult = entries3.get(0);
    CurveName curveName2 = getResult.getCurveName();
    assertEquals("Name", curveName2.getName());
    assertEquals(indices, getResult.getIndices());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return Entries first Indices is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(RatesCurveGroupDefinition); given HashSet() add Index; then return Entries first Indices is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_givenHashSetAddIndex_thenReturnEntriesFirstIndicesIsHashSet2() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult2.discountCurrencies(new HashSet<>());
    entries2.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(1, entries3.size());
    RatesCurveGroupEntry getResult = entries3.get(0);
    CurveName curveName2 = getResult.getCurveName();
    assertEquals("Name", curveName2.getName());
    assertEquals(indices, getResult.getIndices());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return Entries first Indices is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(RatesCurveGroupDefinition); given HashSet() add Index; then return Entries first Indices is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_givenHashSetAddIndex_thenReturnEntriesFirstIndicesIsHashSet3() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult2.discountCurrencies(new HashSet<>());
    entries2.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(1, entries3.size());
    RatesCurveGroupEntry getResult = entries3.get(0);
    CurveName curveName2 = getResult.getCurveName();
    assertEquals("Name", curveName2.getName());
    assertEquals(indices, getResult.getIndices());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return Entries first Indices size is one.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(RatesCurveGroupDefinition); given HashSet() add Index; then return Entries first Indices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_givenHashSetAddIndex_thenReturnEntriesFirstIndicesSizeIsOne() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult2.discountCurrencies(new HashSet<>());
    entries2.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(1, entries3.size());
    RatesCurveGroupEntry getResult = entries3.get(0);
    CurveName curveName2 = getResult.getCurveName();
    assertEquals("Name", curveName2.getName());
    assertEquals(1, getResult.getIndices().size());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return Entries first Indices size is one.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(RatesCurveGroupDefinition); given HashSet() add Index; then return Entries first Indices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_givenHashSetAddIndex_thenReturnEntriesFirstIndicesSizeIsOne2() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult2.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();
    entries2.add(ratesCurveGroupEntry);
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(1, entries3.size());
    RatesCurveGroupEntry getResult = entries3.get(0);
    CurveName curveName2 = getResult.getCurveName();
    assertEquals("Name", curveName2.getName());
    assertEquals(1, getResult.getIndices().size());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return Entries first Indices size is two.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(RatesCurveGroupDefinition); given HashSet() add Index; then return Entries first Indices size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_givenHashSetAddIndex_thenReturnEntriesFirstIndicesSizeIsTwo() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    HashSet<Index> indices2 = new HashSet<>();
    indices2.add(mock(Index.class));

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry2 =
        curveNameResult2.discountCurrencies(new HashSet<>()).indices(indices2).build();

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();
    entries2.add(ratesCurveGroupEntry2);
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(1, entries3.size());
    RatesCurveGroupEntry getResult = entries3.get(0);
    CurveName curveName2 = getResult.getCurveName();
    assertEquals("Name", curveName2.getName());
    assertEquals(2, getResult.getIndices().size());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Then return CurveDefinitions is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(RatesCurveGroupDefinition); then return CurveDefinitions is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_thenReturnCurveDefinitionsIsArrayList() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries2.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(1, entries3.size());
    CurveName curveName2 = entries3.get(0).getCurveName();
    assertEquals("Name", curveName2.getName());
    assertEquals(entries, actualCombinedWithResult.getCurveDefinitions());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(RatesCurveGroupDefinition); then return Entries first CurveName Name is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_thenReturnEntriesFirstCurveNameNameIs42() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("42");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());
    CurveGroupName name2 = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(2, entries3.size());
    CurveName curveName3 = entries3.get(0).getCurveName();
    assertEquals("42", curveName3.getName());
    CurveName curveName4 = entries3.get(1).getCurveName();
    assertEquals("Name", curveName4.getName());
    assertSame(curveName, curveName3);
    assertSame(curveName2, curveName4);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(RatesCurveGroupDefinition); then return Entries first CurveName Name is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_thenReturnEntriesFirstCurveNameNameIs422() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("42");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    Builder builderResult3 = RatesCurveGroupEntry.builder();

    Builder curveNameResult3 = builderResult3.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult3 = curveNameResult3.discountCurrencies(new HashSet<>());
    entries2.add(discountCurrenciesResult3.indices(new HashSet<>()).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(2, entries3.size());
    CurveName curveName3 = entries3.get(0).getCurveName();
    assertEquals("42", curveName3.getName());
    CurveName curveName4 = entries3.get(1).getCurveName();
    assertEquals("Name", curveName4.getName());
    assertSame(curveName, curveName3);
    assertSame(curveName2, curveName4);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(RatesCurveGroupDefinition); then return Entries first CurveName Name is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_thenReturnEntriesFirstCurveNameNameIsName() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());
    CurveGroupName name2 = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(2, entries3.size());
    CurveName curveName3 = entries3.get(1).getCurveName();
    assertEquals("Name", curveName3.getName());
    CurveName curveName4 = entries3.get(0).getCurveName();
    assertEquals("name", curveName4.getName());
    assertSame(curveName2, curveName3);
    assertSame(curveName, curveName4);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Then return Entries first CurveName Name is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(RatesCurveGroupDefinition); then return Entries first CurveName Name is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_thenReturnEntriesFirstCurveNameNameIsName2() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult2 = builderResult2.curveName(curveName2);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    Builder builderResult3 = RatesCurveGroupEntry.builder();

    Builder curveNameResult3 = builderResult3.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult3 = curveNameResult3.discountCurrencies(new HashSet<>());
    entries2.add(discountCurrenciesResult3.indices(new HashSet<>()).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(2, entries3.size());
    CurveName curveName3 = entries3.get(1).getCurveName();
    assertEquals("Name", curveName3.getName());
    CurveName curveName4 = entries3.get(0).getCurveName();
    assertEquals("name", curveName4.getName());
    assertSame(curveName2, curveName3);
    assertSame(curveName, curveName4);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Then return Entries size is four.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName("Test combinedWith(RatesCurveGroupDefinition); then return Entries size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_thenReturnEntriesSizeIsFour() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("42"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("name");

    Builder curveNameResult2 = builderResult2.curveName(curveName);

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());

    Builder builderResult3 = RatesCurveGroupEntry.builder();
    CurveName curveName2 = CurveName.of("Name");

    Builder curveNameResult3 = builderResult3.curveName(curveName2);

    Builder discountCurrenciesResult3 = curveNameResult3.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult3.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    Builder builderResult4 = RatesCurveGroupEntry.builder();
    CurveName curveName3 = CurveName.of("curveName");

    Builder curveNameResult4 = builderResult4.curveName(curveName3);

    Builder discountCurrenciesResult4 = curveNameResult4.discountCurrencies(new HashSet<>());
    entries2.add(discountCurrenciesResult4.indices(new HashSet<>()).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(4, entries3.size());
    CurveName curveName4 = entries3.get(2).getCurveName();
    assertEquals("Name", curveName4.getName());
    CurveName curveName5 = entries3.get(1).getCurveName();
    assertEquals("name", curveName5.getName());
    assertSame(curveName2, curveName4);
    assertSame(curveName3, entries3.get(3).getCurveName());
    assertSame(curveName, curveName5);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Then return Entries size is one.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName("Test combinedWith(RatesCurveGroupDefinition); then return Entries size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_thenReturnEntriesSizeIsOne() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());
    CurveGroupName name2 = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(1, entries3.size());
    CurveName curveName2 = entries3.get(0).getCurveName();
    assertEquals("Name", curveName2.getName());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Then return Entries size is one.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName("Test combinedWith(RatesCurveGroupDefinition); then return Entries size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_thenReturnEntriesSizeIsOne2() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries2.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(1, entries3.size());
    CurveName curveName2 = entries3.get(0).getCurveName();
    assertEquals("Name", curveName2.getName());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}.
   *
   * <ul>
   *   <li>Then return Entries size is three.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#combinedWith(RatesCurveGroupDefinition)}
   */
  @Test
  @DisplayName("Test combinedWith(RatesCurveGroupDefinition); then return Entries size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroupDefinition RatesCurveGroupDefinition.combinedWith(RatesCurveGroupDefinition)"
  })
  void testCombinedWith_thenReturnEntriesSizeIsThree() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult2.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    Builder builderResult3 = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("curveName");

    Builder curveNameResult3 = builderResult3.curveName(curveName);

    Builder discountCurrenciesResult3 = curveNameResult3.discountCurrencies(new HashSet<>());
    entries2.add(discountCurrenciesResult3.indices(new HashSet<>()).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroupDefinition other =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act
    RatesCurveGroupDefinition actualCombinedWithResult = ofResult.combinedWith(other);

    // Assert
    ImmutableList<RatesCurveGroupEntry> entries3 = actualCombinedWithResult.getEntries();
    assertEquals(3, entries3.size());
    assertSame(curveName, entries3.get(2).getCurveName());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#meta()}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RatesCurveGroupDefinition.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = RatesCurveGroupDefinition.meta();

    // Assert
    assertTrue(actualMetaResult.computeJacobian() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.computePvSensitivityToMarketQuote() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.curveDefinitions() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.entries() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.seasonalityDefinitions() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#metaBean()}.
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RatesCurveGroupDefinition.metaBean()"})
  void testMetaBean() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroupDefinition#toString()}
   *   <li>{@link RatesCurveGroupDefinition#getCurveDefinitions()}
   *   <li>{@link RatesCurveGroupDefinition#getEntries()}
   *   <li>{@link RatesCurveGroupDefinition#getName()}
   *   <li>{@link RatesCurveGroupDefinition#getSeasonalityDefinitions()}
   *   <li>{@link RatesCurveGroupDefinition#isComputeJacobian()}
   *   <li>{@link RatesCurveGroupDefinition#isComputePvSensitivityToMarketQuote()}
   *   <li>{@link RatesCurveGroupDefinition#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList RatesCurveGroupDefinition.getCurveDefinitions()",
    "ImmutableList RatesCurveGroupDefinition.getEntries()",
    "CurveGroupName RatesCurveGroupDefinition.getName()",
    "ImmutableMap RatesCurveGroupDefinition.getSeasonalityDefinitions()",
    "boolean RatesCurveGroupDefinition.isComputeJacobian()",
    "boolean RatesCurveGroupDefinition.isComputePvSensitivityToMarketQuote()",
    "RatesCurveGroupDefinitionBuilder RatesCurveGroupDefinition.toBuilder()",
    "String RatesCurveGroupDefinition.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    String actualToStringResult = ofResult.toString();
    ImmutableList<CurveDefinition> actualCurveDefinitions = ofResult.getCurveDefinitions();
    ImmutableList<RatesCurveGroupEntry> actualEntries = ofResult.getEntries();
    CurveGroupName actualName = ofResult.getName();
    ImmutableMap<CurveName, SeasonalityDefinition> actualSeasonalityDefinitions =
        ofResult.getSeasonalityDefinitions();
    boolean actualIsComputeJacobianResult = ofResult.isComputeJacobian();
    boolean actualIsComputePvSensitivityToMarketQuoteResult =
        ofResult.isComputePvSensitivityToMarketQuote();
    ofResult.toBuilder();

    // Assert
    assertEquals(
        "RatesCurveGroupDefinition{name=Name, entries=[], curveDefinitions=[], seasonalityDefinitions={},"
            + " computeJacobian=true, computePvSensitivityToMarketQuote=false}",
        actualToStringResult);
    assertFalse(actualIsComputePvSensitivityToMarketQuoteResult);
    assertTrue(actualSeasonalityDefinitions.isEmpty());
    assertTrue(actualIsComputeJacobianResult);
    assertSame(actualCurveDefinitions, actualEntries);
    assertSame(name, actualName);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#equals(Object)}, and {@link
   * RatesCurveGroupDefinition#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroupDefinition#equals(Object)}
   *   <li>{@link RatesCurveGroupDefinition#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupDefinition.equals(Object)",
    "int RatesCurveGroupDefinition.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());
    CurveGroupName name2 = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    RatesCurveGroupDefinition ofResult2 =
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#equals(Object)}, and {@link
   * RatesCurveGroupDefinition#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroupDefinition#equals(Object)}
   *   <li>{@link RatesCurveGroupDefinition#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupDefinition.equals(Object)",
    "int RatesCurveGroupDefinition.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link RatesCurveGroupDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupDefinition.equals(Object)",
    "int RatesCurveGroupDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    RatesCurveGroupDefinition ratesCurveGroupDefinition =
        new RatesCurveGroupDefinition(name, entries, curveDefinitions, new HashMap<>(), true, true);
    CurveGroupName name2 = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    // Act and Assert
    assertNotEquals(
        ratesCurveGroupDefinition,
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>()));
  }

  /**
   * Test {@link RatesCurveGroupDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupDefinition.equals(Object)",
    "int RatesCurveGroupDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();

    RatesCurveGroupDefinition ratesCurveGroupDefinition =
        new RatesCurveGroupDefinition(
            name, entries, curveDefinitions, new HashMap<>(), false, true);
    CurveGroupName name2 = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    // Act and Assert
    assertNotEquals(
        ratesCurveGroupDefinition,
        RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>()));
  }

  /**
   * Test {@link RatesCurveGroupDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupDefinition.equals(Object)",
    "int RatesCurveGroupDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("42");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());
    CurveGroupName name2 = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    // Act and Assert
    assertNotEquals(ofResult, RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>()));
  }

  /**
   * Test {@link RatesCurveGroupDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupDefinition.equals(Object)",
    "int RatesCurveGroupDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition ofResult =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());
    CurveGroupName name2 = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries2 = new ArrayList<>();

    // Act and Assert
    assertNotEquals(ofResult, RatesCurveGroupDefinition.of(name2, entries2, new ArrayList<>()));
  }

  /**
   * Test {@link RatesCurveGroupDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupDefinition.equals(Object)",
    "int RatesCurveGroupDefinition.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    // Act and Assert
    assertNotEquals(RatesCurveGroupDefinition.of(name, entries, new ArrayList<>()), null);
  }

  /**
   * Test {@link RatesCurveGroupDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupDefinition.equals(Object)",
    "int RatesCurveGroupDefinition.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    // Act and Assert
    assertNotEquals(
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>()),
        "Different type to RatesCurveGroupDefinition");
  }
}
