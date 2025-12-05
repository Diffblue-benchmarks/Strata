package com.opengamma.strata.market.param;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.collect.function.IntDoubleToDoubleFunction;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.market.cube.CubeName;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurrencyParameterSensitivitiesDiffblueTest {
  /**
   * Test {@link CurrencyParameterSensitivities#empty()}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyParameterSensitivities CurrencyParameterSensitivities.empty()"})
  void testEmpty() {
    // Arrange and Act
    CurrencyParameterSensitivities actualEmptyResult = CurrencyParameterSensitivities.empty();

    // Assert
    assertEquals(0, actualEmptyResult.size());
    assertTrue(actualEmptyResult.getSensitivities().isEmpty());
  }

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
    Class<? extends CurrencyParameterSensitivities> actualBeanTypeResult =
        CurrencyParameterSensitivities.meta().beanType();

    // Assert
    Class<CurrencyParameterSensitivities> expectedBeanTypeResult =
        CurrencyParameterSensitivities.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
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
    assertNull(CurrencyParameterSensitivities.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code sensitivities}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'sensitivities'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSensitivities_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurrencyParameterSensitivities.meta().metaPropertyGet("sensitivities");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<CurrencyParameterSensitivities> expectedDeclaringTypeResult =
        CurrencyParameterSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
        CurrencyParameterSensitivities.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("sensitivities");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<CurrencyParameterSensitivities> expectedDeclaringTypeResult =
        CurrencyParameterSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
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
        CurrencyParameterSensitivities.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when empty; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEmpty_thenReturnList() {
    // Arrange
    Meta metaResult = CurrencyParameterSensitivities.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(CurrencyParameterSensitivities.empty(), "sensitivities", true);

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
    Meta metaResult = CurrencyParameterSensitivities.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(CurrencyParameterSensitivities.empty(), "Property Name", false));
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
            CurrencyParameterSensitivities.meta()
                .propertySet(mock(Bean.class), "sensitivities", "New Value", false));
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
            CurrencyParameterSensitivities.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivities}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'sensitivities'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSensitivities_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CurrencyParameterSensitivities.meta()
                .propertySet(mock(Bean.class), "sensitivities", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#sensitivities()}.
   *
   * <p>Method under test: {@link Meta#sensitivities()}
   */
  @Test
  @DisplayName("Test Meta sensitivities()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.sensitivities()"})
  void testMetaSensitivities() {
    // Arrange, Act and Assert
    assertTrue(CurrencyParameterSensitivities.meta().sensitivities() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link CurrencyParameterSensitivities#of(CurrencyParameterSensitivity[])} with {@code
   * CurrencyParameterSensitivity[]}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#of(CurrencyParameterSensitivity[])}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyParameterSensitivity[]) with 'CurrencyParameterSensitivity[]'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurrencyParameterSensitivities.of(CurrencyParameterSensitivity[])"
  })
  void testOfWithCurrencyParameterSensitivity_thenReturnSizeIsZero() {
    // Arrange and Act
    CurrencyParameterSensitivities actualOfResult = CurrencyParameterSensitivities.of();

    // Assert
    assertEquals(0, actualOfResult.size());
    assertTrue(actualOfResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link CurrencyParameterSensitivities#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyParameterSensitivities CurrencyParameterSensitivities.of(List)"})
  void testOfWithList_whenArrayList_thenReturnSizeIsZero() {
    // Arrange
    ArrayList<CurrencyParameterSensitivity> sensitivities = new ArrayList<>();

    // Act
    CurrencyParameterSensitivities actualOfResult =
        CurrencyParameterSensitivities.of(sensitivities);

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(sensitivities, actualOfResult.getSensitivities());
  }

  /**
   * Test {@link CurrencyParameterSensitivities#size()}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CurrencyParameterSensitivities.size()"})
  void testSize() {
    // Arrange, Act and Assert
    assertEquals(0, CurrencyParameterSensitivities.empty().size());
  }

  /**
   * Test {@link CurrencyParameterSensitivities#getSensitivity(MarketDataName, Currency)}.
   *
   * <ul>
   *   <li>When {@link CubeName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#getSensitivity(MarketDataName,
   * Currency)}
   */
  @Test
  @DisplayName("Test getSensitivity(MarketDataName, Currency); when CubeName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivity CurrencyParameterSensitivities.getSensitivity(MarketDataName, Currency)"
  })
  void testGetSensitivity_whenCubeNameWithName() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> emptyResult.getSensitivity(CubeName.of("Name"), null));
  }

  /**
   * Test {@link CurrencyParameterSensitivities#getSensitivity(MarketDataName, Currency)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#getSensitivity(MarketDataName,
   * Currency)}
   */
  @Test
  @DisplayName("Test getSensitivity(MarketDataName, Currency); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivity CurrencyParameterSensitivities.getSensitivity(MarketDataName, Currency)"
  })
  void testGetSensitivity_whenNull() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> CurrencyParameterSensitivities.empty().getSensitivity(null, null));
  }

  /**
   * Test {@link CurrencyParameterSensitivities#findSensitivity(MarketDataName, Currency)}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#findSensitivity(MarketDataName,
   * Currency)}
   */
  @Test
  @DisplayName("Test findSensitivity(MarketDataName, Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional CurrencyParameterSensitivities.findSensitivity(MarketDataName, Currency)"
  })
  void testFindSensitivity() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act and Assert
    assertFalse(emptyResult.findSensitivity(CubeName.of("Name"), null).isPresent());
  }

  /**
   * Test {@link CurrencyParameterSensitivities#combinedWith(CurrencyParameterSensitivities)} with
   * {@code CurrencyParameterSensitivities}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * CurrencyParameterSensitivities#combinedWith(CurrencyParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(CurrencyParameterSensitivities) with 'CurrencyParameterSensitivities'; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurrencyParameterSensitivities.combinedWith(CurrencyParameterSensitivities)"
  })
  void testCombinedWithWithCurrencyParameterSensitivities_whenEmpty_thenReturnEmpty() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    CurrencyParameterSensitivities other = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivities#mergedWith(CurrencyParameterSensitivities)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * CurrencyParameterSensitivities#mergedWith(CurrencyParameterSensitivities)}
   */
  @Test
  @DisplayName("Test mergedWith(CurrencyParameterSensitivities); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurrencyParameterSensitivities.mergedWith(CurrencyParameterSensitivities)"
  })
  void testMergedWith_whenEmpty_thenReturnEmpty() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    CurrencyParameterSensitivities other = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualMergedWithResult = emptyResult.mergedWith(other);

    // Assert
    assertEquals(other, actualMergedWithResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivities#withMarketDataNames(Function)}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#withMarketDataNames(Function)}
   */
  @Test
  @DisplayName("Test withMarketDataNames(Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurrencyParameterSensitivities.withMarketDataNames(Function)"
  })
  void testWithMarketDataNames() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualWithMarketDataNamesResult =
        emptyResult.withMarketDataNames(mock(Function.class));

    // Assert
    assertEquals(emptyResult, actualWithMarketDataNamesResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivities#withParameterMetadatas(UnaryOperator)}.
   *
   * <p>Method under test: {@link
   * CurrencyParameterSensitivities#withParameterMetadatas(UnaryOperator)}
   */
  @Test
  @DisplayName("Test withParameterMetadatas(UnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurrencyParameterSensitivities.withParameterMetadatas(UnaryOperator)"
  })
  void testWithParameterMetadatas() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualWithParameterMetadatasResult =
        emptyResult.withParameterMetadatas(mock(UnaryOperator.class));

    // Assert
    assertEquals(emptyResult, actualWithParameterMetadatasResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivities#convertedTo(Currency, FxRateProvider)}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#convertedTo(Currency,
   * FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurrencyParameterSensitivities.convertedTo(Currency, FxRateProvider)"
  })
  void testConvertedTo() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualConvertedToResult =
        emptyResult.convertedTo(null, mock(FxRateProvider.class));

    // Assert
    assertEquals(emptyResult, actualConvertedToResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivities#split()}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#split()}
   */
  @Test
  @DisplayName("Test split()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyParameterSensitivities CurrencyParameterSensitivities.split()"})
  void testSplit() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualSplitResult = emptyResult.split();

    // Assert
    assertSame(emptyResult, actualSplitResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivities#total()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyParameterSensitivities} with sensitivities is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#total()}
   */
  @Test
  @DisplayName(
      "Test total(); given CurrencyParameterSensitivities with sensitivities is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount CurrencyParameterSensitivities.total()"})
  void testTotal_givenCurrencyParameterSensitivitiesWithSensitivitiesIsArrayList() {
    // Arrange
    CurrencyParameterSensitivities ofResult = CurrencyParameterSensitivities.of(new ArrayList<>());

    // Act
    MultiCurrencyAmount actualTotalResult = ofResult.total();

    // Assert
    assertEquals(0, actualTotalResult.size());
    assertTrue(actualTotalResult.getAmounts().isEmpty());
    assertTrue(actualTotalResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualTotalResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link CurrencyParameterSensitivities#total()}.
   *
   * <ul>
   *   <li>Given empty.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#total()}
   */
  @Test
  @DisplayName("Test total(); given empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount CurrencyParameterSensitivities.total()"})
  void testTotal_givenEmpty() {
    // Arrange and Act
    MultiCurrencyAmount actualTotalResult = CurrencyParameterSensitivities.empty().total();

    // Assert
    assertEquals(0, actualTotalResult.size());
    assertTrue(actualTotalResult.getAmounts().isEmpty());
    assertTrue(actualTotalResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualTotalResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link CurrencyParameterSensitivities#multipliedBy(double)}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurrencyParameterSensitivities.multipliedBy(double)"
  })
  void testMultipliedBy() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualMultipliedByResult = emptyResult.multipliedBy(10.0d);

    // Assert
    assertEquals(emptyResult, actualMultipliedByResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivities#mapSensitivities(DoubleUnaryOperator)}.
   *
   * <p>Method under test: {@link
   * CurrencyParameterSensitivities#mapSensitivities(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapSensitivities(DoubleUnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurrencyParameterSensitivities.mapSensitivities(DoubleUnaryOperator)"
  })
  void testMapSensitivities() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualMapSensitivitiesResult =
        emptyResult.mapSensitivities(mock(DoubleUnaryOperator.class));

    // Assert
    assertEquals(emptyResult, actualMapSensitivitiesResult);
  }

  /**
   * Test {@link
   * CurrencyParameterSensitivities#mapSensitivitiesWithIndex(IntDoubleToDoubleFunction)}.
   *
   * <p>Method under test: {@link
   * CurrencyParameterSensitivities#mapSensitivitiesWithIndex(IntDoubleToDoubleFunction)}
   */
  @Test
  @DisplayName("Test mapSensitivitiesWithIndex(IntDoubleToDoubleFunction)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurrencyParameterSensitivities.mapSensitivitiesWithIndex(IntDoubleToDoubleFunction)"
  })
  void testMapSensitivitiesWithIndex() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualMapSensitivitiesWithIndexResult =
        emptyResult.mapSensitivitiesWithIndex(mock(IntDoubleToDoubleFunction.class));

    // Assert
    assertEquals(emptyResult, actualMapSensitivitiesWithIndexResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivities#equalWithTolerance(CurrencyParameterSensitivities,
   * double)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CurrencyParameterSensitivities#equalWithTolerance(CurrencyParameterSensitivities, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(CurrencyParameterSensitivities, double); when empty; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurrencyParameterSensitivities.equalWithTolerance(CurrencyParameterSensitivities, double)"
  })
  void testEqualWithTolerance_whenEmpty_thenReturnTrue() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act and Assert
    assertTrue(emptyResult.equalWithTolerance(CurrencyParameterSensitivities.empty(), 10.0d));
  }

  /**
   * Test {@link CurrencyParameterSensitivities#meta()}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurrencyParameterSensitivities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CurrencyParameterSensitivities.meta();

    // Assert
    MetaProperty<ImmutableList<CurrencyParameterSensitivity>> sensitivitiesResult =
        actualMetaResult.sensitivities();
    assertTrue(sensitivitiesResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", sensitivitiesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, sensitivitiesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, sensitivitiesResult.propertyType());
    Class<CurrencyParameterSensitivities> expectedDeclaringTypeResult =
        CurrencyParameterSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, sensitivitiesResult.declaringType());
    assertSame(Meta.INSTANCE, sensitivitiesResult.metaBean());
  }

  /**
   * Test {@link CurrencyParameterSensitivities#metaBean()}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurrencyParameterSensitivities.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, CurrencyParameterSensitivities.empty().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurrencyParameterSensitivities#toString()}
   *   <li>{@link CurrencyParameterSensitivities#getSensitivities()}
   *   <li>{@link CurrencyParameterSensitivities#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList CurrencyParameterSensitivities.getSensitivities()",
    "CurrencyParameterSensitivitiesBuilder CurrencyParameterSensitivities.toBuilder()",
    "String CurrencyParameterSensitivities.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act
    String actualToStringResult = emptyResult.toString();
    ImmutableList<CurrencyParameterSensitivity> actualSensitivities =
        emptyResult.getSensitivities();
    emptyResult.toBuilder();

    // Assert
    assertEquals("CurrencyParameterSensitivities{sensitivities=[]}", actualToStringResult);
    assertTrue(actualSensitivities.isEmpty());
  }

  /**
   * Test {@link CurrencyParameterSensitivities#equals(Object)}, and {@link
   * CurrencyParameterSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurrencyParameterSensitivities#equals(Object)}
   *   <li>{@link CurrencyParameterSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurrencyParameterSensitivities.equals(Object)",
    "int CurrencyParameterSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    CurrencyParameterSensitivities emptyResult2 = CurrencyParameterSensitivities.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link CurrencyParameterSensitivities#equals(Object)}, and {@link
   * CurrencyParameterSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurrencyParameterSensitivities#equals(Object)}
   *   <li>{@link CurrencyParameterSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurrencyParameterSensitivities.equals(Object)",
    "int CurrencyParameterSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    CurrencyParameterSensitivities ofResult = CurrencyParameterSensitivities.of(new ArrayList<>());
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act and Assert
    assertEquals(ofResult, emptyResult);
    assertEquals(ofResult.hashCode(), emptyResult.hashCode());
  }

  /**
   * Test {@link CurrencyParameterSensitivities#equals(Object)}, and {@link
   * CurrencyParameterSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurrencyParameterSensitivities#equals(Object)}
   *   <li>{@link CurrencyParameterSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurrencyParameterSensitivities.equals(Object)",
    "int CurrencyParameterSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link CurrencyParameterSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurrencyParameterSensitivities.equals(Object)",
    "int CurrencyParameterSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CurrencyParameterSensitivities ofResult = CurrencyParameterSensitivities.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link CurrencyParameterSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurrencyParameterSensitivities.equals(Object)",
    "int CurrencyParameterSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurrencyParameterSensitivities.empty(), null);
  }

  /**
   * Test {@link CurrencyParameterSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyParameterSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurrencyParameterSensitivities.equals(Object)",
    "int CurrencyParameterSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CurrencyParameterSensitivities.empty(), "Different type to CurrencyParameterSensitivities");
  }
}
