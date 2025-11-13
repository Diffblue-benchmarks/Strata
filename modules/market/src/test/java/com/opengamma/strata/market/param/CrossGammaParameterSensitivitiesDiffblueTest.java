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
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.market.cube.CubeName;
import com.opengamma.strata.market.param.CrossGammaParameterSensitivities.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CrossGammaParameterSensitivitiesDiffblueTest {
  /**
   * Test {@link CrossGammaParameterSensitivities#empty()}.
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CrossGammaParameterSensitivities CrossGammaParameterSensitivities.empty()"})
  void testEmpty() {
    // Arrange and Act
    CrossGammaParameterSensitivities actualEmptyResult = CrossGammaParameterSensitivities.empty();

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
    Class<? extends CrossGammaParameterSensitivities> actualBeanTypeResult =
        CrossGammaParameterSensitivities.meta().beanType();

    // Assert
    Class<CrossGammaParameterSensitivities> expectedBeanTypeResult =
        CrossGammaParameterSensitivities.class;
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
    assertNull(CrossGammaParameterSensitivities.meta().metaPropertyGet("Property Name"));
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
        CrossGammaParameterSensitivities.meta().metaPropertyGet("sensitivities");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<CrossGammaParameterSensitivities> expectedDeclaringTypeResult =
        CrossGammaParameterSensitivities.class;
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
        CrossGammaParameterSensitivities.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("sensitivities");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<CrossGammaParameterSensitivities> expectedDeclaringTypeResult =
        CrossGammaParameterSensitivities.class;
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
        CrossGammaParameterSensitivities.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = CrossGammaParameterSensitivities.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(CrossGammaParameterSensitivities.empty(), "sensitivities", true);

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
    Meta metaResult = CrossGammaParameterSensitivities.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                CrossGammaParameterSensitivities.empty(), "Property Name", false));
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
            CrossGammaParameterSensitivities.meta()
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
            CrossGammaParameterSensitivities.meta()
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
            CrossGammaParameterSensitivities.meta()
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
    assertTrue(
        CrossGammaParameterSensitivities.meta().sensitivities() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#of(CrossGammaParameterSensitivity[])} with {@code
   * CrossGammaParameterSensitivity[]}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * CrossGammaParameterSensitivities#of(CrossGammaParameterSensitivity[])}
   */
  @Test
  @DisplayName(
      "Test of(CrossGammaParameterSensitivity[]) with 'CrossGammaParameterSensitivity[]'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivities CrossGammaParameterSensitivities.of(CrossGammaParameterSensitivity[])"
  })
  void testOfWithCrossGammaParameterSensitivity_thenReturnSizeIsZero() {
    // Arrange and Act
    CrossGammaParameterSensitivities actualOfResult = CrossGammaParameterSensitivities.of();

    // Assert
    assertEquals(0, actualOfResult.size());
    assertTrue(actualOfResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CrossGammaParameterSensitivities CrossGammaParameterSensitivities.of(List)"})
  void testOfWithList_whenArrayList_thenReturnSizeIsZero() {
    // Arrange
    ArrayList<CrossGammaParameterSensitivity> sensitivities = new ArrayList<>();

    // Act
    CrossGammaParameterSensitivities actualOfResult =
        CrossGammaParameterSensitivities.of(sensitivities);

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(sensitivities, actualOfResult.getSensitivities());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#size()}.
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CrossGammaParameterSensitivities.size()"})
  void testSize() {
    // Arrange, Act and Assert
    assertEquals(0, CrossGammaParameterSensitivities.empty().size());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#getSensitivity(MarketDataName, Currency)} with
   * {@code name}, {@code currency}.
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#getSensitivity(MarketDataName,
   * Currency)}
   */
  @Test
  @DisplayName("Test getSensitivity(MarketDataName, Currency) with 'name', 'currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivity CrossGammaParameterSensitivities.getSensitivity(MarketDataName, Currency)"
  })
  void testGetSensitivityWithNameCurrency() {
    // Arrange
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> emptyResult.getSensitivity(CubeName.of("Name"), null));
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#getSensitivity(MarketDataName, MarketDataName,
   * Currency)} with {@code nameFirst}, {@code nameSecond}, {@code currency}.
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#getSensitivity(MarketDataName,
   * MarketDataName, Currency)}
   */
  @Test
  @DisplayName(
      "Test getSensitivity(MarketDataName, MarketDataName, Currency) with 'nameFirst', 'nameSecond', 'currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivity CrossGammaParameterSensitivities.getSensitivity(MarketDataName, MarketDataName, Currency)"
  })
  void testGetSensitivityWithNameFirstNameSecondCurrency() {
    // Arrange
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();
    CubeName nameFirst = CubeName.of("Name");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> emptyResult.getSensitivity(nameFirst, CubeName.of("Name"), null));
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#findSensitivity(MarketDataName, Currency)}.
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#findSensitivity(MarketDataName,
   * Currency)}
   */
  @Test
  @DisplayName("Test findSensitivity(MarketDataName, Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional CrossGammaParameterSensitivities.findSensitivity(MarketDataName, Currency)"
  })
  void testFindSensitivity() {
    // Arrange
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();

    // Act and Assert
    assertFalse(emptyResult.findSensitivity(CubeName.of("Name"), null).isPresent());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#combinedWith(CrossGammaParameterSensitivities)}
   * with {@code CrossGammaParameterSensitivities}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * CrossGammaParameterSensitivities#combinedWith(CrossGammaParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(CrossGammaParameterSensitivities) with 'CrossGammaParameterSensitivities'; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivities CrossGammaParameterSensitivities.combinedWith(CrossGammaParameterSensitivities)"
  })
  void testCombinedWithWithCrossGammaParameterSensitivities_whenEmpty_thenReturnEmpty() {
    // Arrange
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();
    CrossGammaParameterSensitivities other = CrossGammaParameterSensitivities.empty();

    // Act
    CrossGammaParameterSensitivities actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#convertedTo(Currency, FxRateProvider)}.
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#convertedTo(Currency,
   * FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivities CrossGammaParameterSensitivities.convertedTo(Currency, FxRateProvider)"
  })
  void testConvertedTo() {
    // Arrange
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();

    // Act
    CrossGammaParameterSensitivities actualConvertedToResult =
        emptyResult.convertedTo(null, mock(FxRateProvider.class));

    // Assert
    assertEquals(emptyResult, actualConvertedToResult);
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#total()}.
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#total()}
   */
  @Test
  @DisplayName("Test total()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount CrossGammaParameterSensitivities.total()"})
  void testTotal() {
    // Arrange and Act
    MultiCurrencyAmount actualTotalResult = CrossGammaParameterSensitivities.empty().total();

    // Assert
    assertEquals(0, actualTotalResult.size());
    assertTrue(actualTotalResult.getAmounts().isEmpty());
    assertTrue(actualTotalResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualTotalResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#diagonal()}.
   *
   * <ul>
   *   <li>Given {@link CrossGammaParameterSensitivities} with sensitivities is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#diagonal()}
   */
  @Test
  @DisplayName(
      "Test diagonal(); given CrossGammaParameterSensitivities with sensitivities is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyParameterSensitivities CrossGammaParameterSensitivities.diagonal()"})
  void testDiagonal_givenCrossGammaParameterSensitivitiesWithSensitivitiesIsArrayList() {
    // Arrange
    CrossGammaParameterSensitivities ofResult =
        CrossGammaParameterSensitivities.of(new ArrayList<>());

    // Act
    CurrencyParameterSensitivities actualDiagonalResult = ofResult.diagonal();

    // Assert
    assertEquals(0, actualDiagonalResult.size());
    assertTrue(actualDiagonalResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#diagonal()}.
   *
   * <ul>
   *   <li>Given empty.
   * </ul>
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#diagonal()}
   */
  @Test
  @DisplayName("Test diagonal(); given empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyParameterSensitivities CrossGammaParameterSensitivities.diagonal()"})
  void testDiagonal_givenEmpty() {
    // Arrange and Act
    CurrencyParameterSensitivities actualDiagonalResult =
        CrossGammaParameterSensitivities.empty().diagonal();

    // Assert
    assertEquals(0, actualDiagonalResult.size());
    assertTrue(actualDiagonalResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#multipliedBy(double)}.
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivities CrossGammaParameterSensitivities.multipliedBy(double)"
  })
  void testMultipliedBy() {
    // Arrange
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();

    // Act
    CrossGammaParameterSensitivities actualMultipliedByResult = emptyResult.multipliedBy(10.0d);

    // Assert
    assertEquals(emptyResult, actualMultipliedByResult);
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#mapSensitivities(DoubleUnaryOperator)}.
   *
   * <p>Method under test: {@link
   * CrossGammaParameterSensitivities#mapSensitivities(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapSensitivities(DoubleUnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivities CrossGammaParameterSensitivities.mapSensitivities(DoubleUnaryOperator)"
  })
  void testMapSensitivities() {
    // Arrange
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();

    // Act
    CrossGammaParameterSensitivities actualMapSensitivitiesResult =
        emptyResult.mapSensitivities(mock(DoubleUnaryOperator.class));

    // Assert
    assertEquals(emptyResult, actualMapSensitivitiesResult);
  }

  /**
   * Test {@link
   * CrossGammaParameterSensitivities#equalWithTolerance(CrossGammaParameterSensitivities, double)}
   * with {@code other}, {@code tolerance}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CrossGammaParameterSensitivities#equalWithTolerance(CrossGammaParameterSensitivities, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(CrossGammaParameterSensitivities, double) with 'other', 'tolerance'; when empty; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CrossGammaParameterSensitivities.equalWithTolerance(CrossGammaParameterSensitivities, double)"
  })
  void testEqualWithToleranceWithOtherTolerance_whenEmpty_thenReturnTrue() {
    // Arrange
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();

    // Act and Assert
    assertTrue(emptyResult.equalWithTolerance(CrossGammaParameterSensitivities.empty(), 10.0d));
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#meta()}.
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CrossGammaParameterSensitivities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CrossGammaParameterSensitivities.meta();

    // Assert
    MetaProperty<ImmutableList<CrossGammaParameterSensitivity>> sensitivitiesResult =
        actualMetaResult.sensitivities();
    assertTrue(sensitivitiesResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", sensitivitiesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, sensitivitiesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, sensitivitiesResult.propertyType());
    Class<CrossGammaParameterSensitivities> expectedDeclaringTypeResult =
        CrossGammaParameterSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, sensitivitiesResult.declaringType());
    assertSame(Meta.INSTANCE, sensitivitiesResult.metaBean());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#metaBean()}.
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CrossGammaParameterSensitivities.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, CrossGammaParameterSensitivities.empty().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CrossGammaParameterSensitivities#toString()}
   *   <li>{@link CrossGammaParameterSensitivities#getSensitivities()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList CrossGammaParameterSensitivities.getSensitivities()",
    "String CrossGammaParameterSensitivities.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();

    // Act
    String actualToStringResult = emptyResult.toString();

    // Assert
    assertEquals("CrossGammaParameterSensitivities{sensitivities=[]}", actualToStringResult);
    assertTrue(emptyResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#equals(Object)}, and {@link
   * CrossGammaParameterSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CrossGammaParameterSensitivities#equals(Object)}
   *   <li>{@link CrossGammaParameterSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CrossGammaParameterSensitivities.equals(Object)",
    "int CrossGammaParameterSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();
    CrossGammaParameterSensitivities emptyResult2 = CrossGammaParameterSensitivities.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#equals(Object)}, and {@link
   * CrossGammaParameterSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CrossGammaParameterSensitivities#equals(Object)}
   *   <li>{@link CrossGammaParameterSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CrossGammaParameterSensitivities.equals(Object)",
    "int CrossGammaParameterSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    CrossGammaParameterSensitivities ofResult =
        CrossGammaParameterSensitivities.of(new ArrayList<>());
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();

    // Act and Assert
    assertEquals(ofResult, emptyResult);
    assertEquals(ofResult.hashCode(), emptyResult.hashCode());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#equals(Object)}, and {@link
   * CrossGammaParameterSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CrossGammaParameterSensitivities#equals(Object)}
   *   <li>{@link CrossGammaParameterSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CrossGammaParameterSensitivities.equals(Object)",
    "int CrossGammaParameterSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CrossGammaParameterSensitivities emptyResult = CrossGammaParameterSensitivities.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CrossGammaParameterSensitivities.equals(Object)",
    "int CrossGammaParameterSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CrossGammaParameterSensitivities ofResult =
        CrossGammaParameterSensitivities.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CrossGammaParameterSensitivities.equals(Object)",
    "int CrossGammaParameterSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CrossGammaParameterSensitivities.empty(), null);
  }

  /**
   * Test {@link CrossGammaParameterSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CrossGammaParameterSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CrossGammaParameterSensitivities.equals(Object)",
    "int CrossGammaParameterSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CrossGammaParameterSensitivities.empty(),
        "Different type to CrossGammaParameterSensitivities");
  }
}
