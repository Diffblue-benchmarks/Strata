package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.currency.FxMatrix.Meta;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FxMatrixDiffblueTest {
  /**
   * Test {@link FxMatrix#empty()}.
   *
   * <p>Method under test: {@link FxMatrix#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrix FxMatrix.empty()"})
  void testEmpty() {
    // Arrange and Act
    FxMatrix actualEmptyResult = FxMatrix.empty();

    // Assert
    DoubleMatrix rates = actualEmptyResult.getRates();
    assertEquals(0, rates.size());
    assertEquals(0, rates.toArrayUnsafe().length);
    assertEquals(0.0d, rates.total());
    assertEquals(2, rates.dimensions());
    assertTrue(rates.isEmpty());
    assertTrue(rates.isSquare());
    assertTrue(actualEmptyResult.getCurrencies().isEmpty());
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
    Class<? extends FxMatrix> actualBeanTypeResult = FxMatrix.meta().beanType();

    // Assert
    Class<FxMatrix> expectedBeanTypeResult = FxMatrix.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currencies()}
   *   <li>{@link Meta#rates()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.currencies()", "MetaProperty Meta.rates()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FxMatrix.meta();

    // Act
    MetaProperty<ImmutableMap<Currency, Integer>> actualCurrenciesResult = metaResult.currencies();

    // Assert
    assertTrue(actualCurrenciesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.rates() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currencies}.
   *   <li>Then metaBean rates return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'currencies'; then metaBean rates return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrencies_thenMetaBeanRatesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = FxMatrix.meta().metaPropertyGet("currencies");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleMatrix> ratesResult = ((Meta) metaBeanResult).rates();
    assertTrue(ratesResult instanceof DirectMetaProperty);
    assertEquals("currencies", actualMetaPropertyGetResult.name());
    assertEquals("rates", ratesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, ratesResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<FxMatrix> expectedDeclaringTypeResult = FxMatrix.class;
    assertEquals(expectedDeclaringTypeResult, ratesResult.declaringType());
    Class<DoubleMatrix> expectedPropertyTypeResult2 = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult2, ratesResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currencies());
    assertSame(Meta.INSTANCE, ratesResult.metaBean());
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
    assertNull(FxMatrix.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code rates}.
   *   <li>Then metaBean currencies return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'rates'; then metaBean currencies return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRates_thenMetaBeanCurrenciesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = FxMatrix.meta().metaPropertyGet("rates");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Currency, Integer>> currenciesResult =
        ((Meta) metaBeanResult).currencies();
    assertTrue(currenciesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("currencies", currenciesResult.name());
    assertEquals("rates", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, currenciesResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, currenciesResult.propertyType());
    Class<FxMatrix> expectedDeclaringTypeResult = FxMatrix.class;
    assertEquals(expectedDeclaringTypeResult, currenciesResult.declaringType());
    Class<DoubleMatrix> expectedPropertyTypeResult2 = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rates());
    assertSame(Meta.INSTANCE, currenciesResult.metaBean());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = FxMatrix.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("currencies");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("rates");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("currencies", getResult.name());
    assertEquals("rates", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<FxMatrix> expectedDeclaringTypeResult = FxMatrix.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<FxMatrix> expectedDeclaringTypeResult2 = FxMatrix.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<DoubleMatrix> expectedPropertyTypeResult2 = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
    assertNull(FxMatrix.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code currencies}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'currencies'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCurrencies_thenReturnMap() {
    // Arrange
    Meta metaResult = FxMatrix.meta();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(FxMatrix.empty(), "currencies", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
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
    Meta metaResult = FxMatrix.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(FxMatrix.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code rates}.
   *   <li>Then empty Rates is {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'rates'; then empty Rates is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenRates_thenEmptyRatesIsEmpty() {
    // Arrange
    Meta metaResult = FxMatrix.meta();
    FxMatrix bean = FxMatrix.empty();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "rates", true);

    // Assert
    DoubleMatrix doubleMatrix = ((DoubleMatrix) actualPropertyGetResult).EMPTY;
    assertSame(doubleMatrix, bean.getRates());
    assertSame(doubleMatrix, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currencies}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currencies'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrencies_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FxMatrix.meta().propertySet(mock(Bean.class), "currencies", "New Value", true));
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
        () -> FxMatrix.meta().propertySet(mock(Bean.class), "currencies", "New Value", false));
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
        () -> FxMatrix.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code rates}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'rates'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRates_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FxMatrix.meta().propertySet(mock(Bean.class), "rates", "New Value", true));
  }

  /**
   * Test {@link FxMatrix#of(Currency, Currency, double)} with {@code ccy1}, {@code ccy2}, {@code
   * rate}.
   *
   * <p>Method under test: {@link FxMatrix#of(Currency, Currency, double)}
   */
  @Test
  @DisplayName("Test of(Currency, Currency, double) with 'ccy1', 'ccy2', 'rate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrix FxMatrix.of(Currency, Currency, double)"})
  void testOfWithCcy1Ccy2Rate() {
    // Arrange
    Currency ccy1 = new Currency("ccy1", 8, "GBP");

    // Act
    FxMatrix actualOfResult = FxMatrix.of(ccy1, new Currency("ccy1", 8, "GBP"), 10.0d);

    // Assert
    DoubleMatrix rates = actualOfResult.getRates();
    assertEquals(1, rates.size());
    assertEquals(1, actualOfResult.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, rates.total());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrix#of(Currency, Currency, double)} with {@code ccy1}, {@code ccy2}, {@code
   * rate}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return Rates size is one.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#of(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Currency, double) with 'ccy1', 'ccy2', 'rate'; when AED; then return Rates size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrix FxMatrix.of(Currency, Currency, double)"})
  void testOfWithCcy1Ccy2Rate_whenAed_thenReturnRatesSizeIsOne() {
    // Arrange and Act
    FxMatrix actualOfResult = FxMatrix.of(Currency.AED, Currency.AED, 10.0d);

    // Assert
    DoubleMatrix rates = actualOfResult.getRates();
    assertEquals(1, rates.size());
    assertEquals(1, actualOfResult.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, rates.total());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrix#of(Currency, Currency, double)} with {@code ccy1}, {@code ccy2}, {@code
   * rate}.
   *
   * <ul>
   *   <li>When {@link Currency#ARS}.
   *   <li>Then return Rates total is {@code 12.1}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#of(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Currency, double) with 'ccy1', 'ccy2', 'rate'; when ARS; then return Rates total is '12.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrix FxMatrix.of(Currency, Currency, double)"})
  void testOfWithCcy1Ccy2Rate_whenArs_thenReturnRatesTotalIs121() {
    // Arrange and Act
    FxMatrix actualOfResult = FxMatrix.of(Currency.ARS, Currency.AED, 10.0d);

    // Assert
    DoubleMatrix rates = actualOfResult.getRates();
    assertEquals(12.1d, rates.total());
    assertEquals(2, actualOfResult.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4, rates.size());
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrix#of(Currency, Currency, double)} with {@code ccy1}, {@code ccy2}, {@code
   * rate}.
   *
   * <ul>
   *   <li>When {@link Currency#AUD}.
   *   <li>Then return Rates total is {@code 12.1}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#of(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Currency, double) with 'ccy1', 'ccy2', 'rate'; when AUD; then return Rates total is '12.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrix FxMatrix.of(Currency, Currency, double)"})
  void testOfWithCcy1Ccy2Rate_whenAud_thenReturnRatesTotalIs121() {
    // Arrange and Act
    FxMatrix actualOfResult = FxMatrix.of(Currency.AUD, Currency.AED, 10.0d);

    // Assert
    DoubleMatrix rates = actualOfResult.getRates();
    assertEquals(12.1d, rates.total());
    assertEquals(2, actualOfResult.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4, rates.size());
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrix#of(CurrencyPair, double)} with {@code currencyPair}, {@code rate}.
   *
   * <p>Method under test: {@link FxMatrix#of(CurrencyPair, double)}
   */
  @Test
  @DisplayName("Test of(CurrencyPair, double) with 'currencyPair', 'rate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrix FxMatrix.of(CurrencyPair, double)"})
  void testOfWithCurrencyPairRate() {
    // Arrange
    Currency base = new Currency("ccy1", 8, "GBP");
    CurrencyPair currencyPair = CurrencyPair.of(base, new Currency("ccy1", 8, "GBP"));

    // Act
    FxMatrix actualOfResult = FxMatrix.of(currencyPair, 10.0d);

    // Assert
    DoubleMatrix rates = actualOfResult.getRates();
    assertEquals(1, rates.size());
    assertEquals(1, actualOfResult.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, rates.total());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrix#of(CurrencyPair, double)} with {@code currencyPair}, {@code rate}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#of(CurrencyPair, double)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyPair, double) with 'currencyPair', 'rate'; when CurrencyPair with base is AED and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrix FxMatrix.of(CurrencyPair, double)"})
  void testOfWithCurrencyPairRate_whenCurrencyPairWithBaseIsAedAndCounterIsAed() {
    // Arrange and Act
    FxMatrix actualOfResult = FxMatrix.of(CurrencyPair.of(Currency.AED, Currency.AED), 10.0d);

    // Assert
    DoubleMatrix rates = actualOfResult.getRates();
    assertEquals(1, rates.size());
    assertEquals(1, actualOfResult.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, rates.total());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrix#of(CurrencyPair, double)} with {@code currencyPair}, {@code rate}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#ARS} and counter is {@link
   *       Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#of(CurrencyPair, double)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyPair, double) with 'currencyPair', 'rate'; when CurrencyPair with base is ARS and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrix FxMatrix.of(CurrencyPair, double)"})
  void testOfWithCurrencyPairRate_whenCurrencyPairWithBaseIsArsAndCounterIsAed() {
    // Arrange and Act
    FxMatrix actualOfResult = FxMatrix.of(CurrencyPair.of(Currency.ARS, Currency.AED), 10.0d);

    // Assert
    DoubleMatrix rates = actualOfResult.getRates();
    assertEquals(12.1d, rates.total());
    assertEquals(2, actualOfResult.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4, rates.size());
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrix#of(CurrencyPair, double)} with {@code currencyPair}, {@code rate}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#of(CurrencyPair, double)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyPair, double) with 'currencyPair', 'rate'; when CurrencyPair with base is AUD and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrix FxMatrix.of(CurrencyPair, double)"})
  void testOfWithCurrencyPairRate_whenCurrencyPairWithBaseIsAudAndCounterIsAed() {
    // Arrange and Act
    FxMatrix actualOfResult = FxMatrix.of(CurrencyPair.of(Currency.AUD, Currency.AED), 10.0d);

    // Assert
    DoubleMatrix rates = actualOfResult.getRates();
    assertEquals(12.1d, rates.total());
    assertEquals(2, actualOfResult.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4, rates.size());
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrix#getCurrencies()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#getCurrencies()}
   */
  @Test
  @DisplayName("Test getCurrencies(); given empty; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet FxMatrix.getCurrencies()"})
  void testGetCurrencies_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(FxMatrix.empty().getCurrencies().isEmpty());
  }

  /**
   * Test {@link FxMatrix#getCurrencies()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Currency#AED} is forty-two.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#getCurrencies()}
   */
  @Test
  @DisplayName("Test getCurrencies(); given HashMap() AED is forty-two; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet FxMatrix.getCurrencies()"})
  void testGetCurrencies_givenHashMapAedIsFortyTwo_thenReturnSizeIsOne() {
    // Arrange
    HashMap<Currency, Integer> currencies = new HashMap<>();
    currencies.put(Currency.AED, 42);

    // Act and Assert
    assertEquals(1, new FxMatrix(currencies, DoubleMatrix.of()).getCurrencies().size());
  }

  /**
   * Test {@link FxMatrix#getCurrencies()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Currency#ARS} is one.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#getCurrencies()}
   */
  @Test
  @DisplayName("Test getCurrencies(); given HashMap() ARS is one; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet FxMatrix.getCurrencies()"})
  void testGetCurrencies_givenHashMapArsIsOne_thenReturnSizeIsTwo() {
    // Arrange
    HashMap<Currency, Integer> currencies = new HashMap<>();
    currencies.put(Currency.ARS, 1);
    currencies.put(Currency.AED, 42);

    // Act and Assert
    assertEquals(2, new FxMatrix(currencies, DoubleMatrix.of()).getCurrencies().size());
  }

  /**
   * Test {@link FxMatrix#fxRate(Currency, Currency)} with {@code baseCurrency}, {@code
   * counterCurrency}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FxMatrix.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> FxMatrix.empty().fxRate(Currency.ARS, Currency.AED));
  }

  /**
   * Test {@link FxMatrix#fxRate(Currency, Currency)} with {@code baseCurrency}, {@code
   * counterCurrency}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; when AED; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FxMatrix.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_whenAed_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, FxMatrix.empty().fxRate(Currency.AED, Currency.AED));
  }

  /**
   * Test {@link FxMatrix#convert(CurrencyAmount, Currency)} with {@code CurrencyAmount}, {@code
   * Currency}.
   *
   * <p>Method under test: {@link FxMatrix#convert(CurrencyAmount, Currency)}
   */
  @Test
  @DisplayName("Test convert(CurrencyAmount, Currency) with 'CurrencyAmount', 'Currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount FxMatrix.convert(CurrencyAmount, Currency)"})
  void testConvertWithCurrencyAmountCurrency() {
    // Arrange
    FxMatrix emptyResult = FxMatrix.empty();
    CurrencyAmount amount = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    CurrencyAmount actualConvertResult = emptyResult.convert(amount, Currency.AED);

    // Assert
    assertSame(amount, actualConvertResult);
  }

  /**
   * Test {@link FxMatrix#convert(CurrencyAmount, Currency)} with {@code CurrencyAmount}, {@code
   * Currency}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#convert(CurrencyAmount, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(CurrencyAmount, Currency) with 'CurrencyAmount', 'Currency'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount FxMatrix.convert(CurrencyAmount, Currency)"})
  void testConvertWithCurrencyAmountCurrency_thenThrowIllegalArgumentException() {
    // Arrange
    FxMatrix emptyResult = FxMatrix.empty();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> emptyResult.convert(CurrencyAmount.of(Currency.ARS, 10.0d), Currency.AED));
  }

  /**
   * Test {@link FxMatrix#convert(MultiCurrencyAmount, Currency)} with {@code MultiCurrencyAmount},
   * {@code Currency}.
   *
   * <ul>
   *   <li>Then return Amount is ten.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#convert(MultiCurrencyAmount, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(MultiCurrencyAmount, Currency) with 'MultiCurrencyAmount', 'Currency'; then return Amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount FxMatrix.convert(MultiCurrencyAmount, Currency)"})
  void testConvertWithMultiCurrencyAmountCurrency_thenReturnAmountIsTen() {
    // Arrange
    FxMatrix emptyResult = FxMatrix.empty();

    // Act
    CurrencyAmount actualConvertResult =
        emptyResult.convert(MultiCurrencyAmount.of(Currency.AED, 10.0d), Currency.AED);

    // Assert
    assertEquals(10.0d, actualConvertResult.getAmount());
    assertFalse(actualConvertResult.isZero());
    assertTrue(actualConvertResult.isPositive());
    CurrencyAmount actualPositiveResult = actualConvertResult.positive();
    assertSame(actualConvertResult, actualPositiveResult);
  }

  /**
   * Test {@link FxMatrix#convert(MultiCurrencyAmount, Currency)} with {@code MultiCurrencyAmount},
   * {@code Currency}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#convert(MultiCurrencyAmount, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(MultiCurrencyAmount, Currency) with 'MultiCurrencyAmount', 'Currency'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount FxMatrix.convert(MultiCurrencyAmount, Currency)"})
  void testConvertWithMultiCurrencyAmountCurrency_thenThrowIllegalArgumentException() {
    // Arrange
    FxMatrix emptyResult = FxMatrix.empty();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> emptyResult.convert(MultiCurrencyAmount.of(Currency.ARS, 10.0d), Currency.AED));
  }

  /**
   * Test {@link FxMatrix#convert(MultiCurrencyAmount, Currency)} with {@code MultiCurrencyAmount},
   * {@code Currency}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return Amount is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#convert(MultiCurrencyAmount, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(MultiCurrencyAmount, Currency) with 'MultiCurrencyAmount', 'Currency'; when empty; then return Amount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount FxMatrix.convert(MultiCurrencyAmount, Currency)"})
  void testConvertWithMultiCurrencyAmountCurrency_whenEmpty_thenReturnAmountIsZero() {
    // Arrange
    FxMatrix emptyResult = FxMatrix.empty();

    // Act
    CurrencyAmount actualConvertResult =
        emptyResult.convert(MultiCurrencyAmount.empty(), Currency.AED);

    // Assert
    assertEquals(0.0d, actualConvertResult.getAmount());
    assertFalse(actualConvertResult.isPositive());
    assertTrue(actualConvertResult.isZero());
    CurrencyAmount actualNegatedResult = actualConvertResult.negated();
    assertEquals(actualConvertResult, actualNegatedResult);
    CurrencyAmount actualNegativeResult = actualConvertResult.negative();
    assertSame(actualConvertResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = actualConvertResult.positive();
    assertSame(actualConvertResult, actualPositiveResult);
  }

  /**
   * Test {@link FxMatrix#meta()}.
   *
   * <p>Method under test: {@link FxMatrix#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxMatrix.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FxMatrix.meta();

    // Assert
    MetaProperty<ImmutableMap<Currency, Integer>> currenciesResult = actualMetaResult.currencies();
    assertTrue(currenciesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleMatrix> ratesResult = actualMetaResult.rates();
    assertTrue(ratesResult instanceof DirectMetaProperty);
    assertEquals("currencies", currenciesResult.name());
    assertEquals("rates", ratesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, currenciesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, ratesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, currenciesResult.propertyType());
    Class<FxMatrix> expectedDeclaringTypeResult = FxMatrix.class;
    assertEquals(expectedDeclaringTypeResult, currenciesResult.declaringType());
    Class<FxMatrix> expectedDeclaringTypeResult2 = FxMatrix.class;
    assertEquals(expectedDeclaringTypeResult2, ratesResult.declaringType());
    Class<DoubleMatrix> expectedPropertyTypeResult2 = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult2, ratesResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, currenciesResult.metaBean());
    assertSame(meta, ratesResult.metaBean());
  }

  /**
   * Test {@link FxMatrix#FxMatrix(Map, DoubleMatrix)}.
   *
   * <ul>
   *   <li>Given {@link Currency#ARS}.
   *   <li>When {@link HashMap#HashMap()} {@link Currency#ARS} is one.
   *   <li>Then return Currencies size is two.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#FxMatrix(Map, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test new FxMatrix(Map, DoubleMatrix); given ARS; when HashMap() ARS is one; then return Currencies size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FxMatrix.<init>(Map, DoubleMatrix)"})
  void testNewFxMatrix_givenArs_whenHashMapArsIsOne_thenReturnCurrenciesSizeIsTwo() {
    // Arrange
    BiFunction<Currency, Integer, Integer> biFunction = mock(BiFunction.class);
    when(biFunction.apply(Mockito.<Currency>any(), Mockito.<Integer>any())).thenReturn(1);

    HashMap<Currency, Integer> currencies = new HashMap<>();
    currencies.put(Currency.ARS, 1);
    currencies.put(Currency.AED, 1);
    currencies.replaceAll(biFunction);

    // Act
    FxMatrix actualFxMatrix = new FxMatrix(currencies, DoubleMatrix.of());

    // Assert
    verify(biFunction, atLeast(1)).apply(Mockito.<Currency>any(), eq(1));
    assertEquals(2, actualFxMatrix.getCurrencies().size());
    assertSame(DoubleMatrix.EMPTY, actualFxMatrix.getRates());
  }

  /**
   * Test {@link FxMatrix#FxMatrix(Map, DoubleMatrix)}.
   *
   * <ul>
   *   <li>Given {@link Currency#AUD}.
   *   <li>When {@link HashMap#HashMap()} {@link Currency#AUD} is one.
   *   <li>Then return Currencies size is two.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#FxMatrix(Map, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test new FxMatrix(Map, DoubleMatrix); given AUD; when HashMap() AUD is one; then return Currencies size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FxMatrix.<init>(Map, DoubleMatrix)"})
  void testNewFxMatrix_givenAud_whenHashMapAudIsOne_thenReturnCurrenciesSizeIsTwo() {
    // Arrange
    BiFunction<Currency, Integer, Integer> biFunction = mock(BiFunction.class);
    when(biFunction.apply(Mockito.<Currency>any(), Mockito.<Integer>any())).thenReturn(1);

    HashMap<Currency, Integer> currencies = new HashMap<>();
    currencies.put(Currency.AUD, 1);
    currencies.put(Currency.AED, 1);
    currencies.replaceAll(biFunction);

    // Act
    FxMatrix actualFxMatrix = new FxMatrix(currencies, DoubleMatrix.of());

    // Assert
    verify(biFunction, atLeast(1)).apply(Mockito.<Currency>any(), eq(1));
    assertEquals(2, actualFxMatrix.getCurrencies().size());
    assertSame(DoubleMatrix.EMPTY, actualFxMatrix.getRates());
  }

  /**
   * Test {@link FxMatrix#FxMatrix(Map, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@link Currency#AED} is forty-two.
   *   <li>Then return Currencies size is one.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#FxMatrix(Map, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test new FxMatrix(Map, DoubleMatrix); when HashMap() AED is forty-two; then return Currencies size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FxMatrix.<init>(Map, DoubleMatrix)"})
  void testNewFxMatrix_whenHashMapAedIsFortyTwo_thenReturnCurrenciesSizeIsOne() {
    // Arrange
    HashMap<Currency, Integer> currencies = new HashMap<>();
    currencies.put(Currency.AED, 42);

    // Act
    FxMatrix actualFxMatrix = new FxMatrix(currencies, DoubleMatrix.of());

    // Assert
    assertEquals(1, actualFxMatrix.getCurrencies().size());
    assertSame(DoubleMatrix.EMPTY, actualFxMatrix.getRates());
  }

  /**
   * Test {@link FxMatrix#FxMatrix(Map, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Currencies Empty.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#FxMatrix(Map, DoubleMatrix)}
   */
  @Test
  @DisplayName("Test new FxMatrix(Map, DoubleMatrix); when HashMap(); then return Currencies Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FxMatrix.<init>(Map, DoubleMatrix)"})
  void testNewFxMatrix_whenHashMap_thenReturnCurrenciesEmpty() {
    // Arrange
    HashMap<Currency, Integer> currencies = new HashMap<>();

    // Act
    FxMatrix actualFxMatrix = new FxMatrix(currencies, DoubleMatrix.of());

    // Assert
    assertTrue(actualFxMatrix.getCurrencies().isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualFxMatrix.getRates());
  }

  /**
   * Test {@link FxMatrix#metaBean()}.
   *
   * <p>Method under test: {@link FxMatrix#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxMatrix.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, FxMatrix.empty().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxMatrix#toString()}
   *   <li>{@link FxMatrix#getRates()}
   *   <li>{@link FxMatrix#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix FxMatrix.getRates()",
    "FxMatrixBuilder FxMatrix.toBuilder()",
    "String FxMatrix.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    FxMatrix emptyResult = FxMatrix.empty();

    // Act
    String actualToStringResult = emptyResult.toString();
    DoubleMatrix actualRates = emptyResult.getRates();
    emptyResult.toBuilder();

    // Assert
    assertEquals("FxMatrix[ : ]", actualToStringResult);
    assertSame(DoubleMatrix.EMPTY, actualRates);
  }

  /**
   * Test {@link FxMatrix#equals(Object)}, and {@link FxMatrix#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxMatrix#equals(Object)}
   *   <li>{@link FxMatrix#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrix.equals(Object)", "int FxMatrix.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FxMatrix emptyResult = FxMatrix.empty();
    FxMatrix emptyResult2 = FxMatrix.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link FxMatrix#equals(Object)}, and {@link FxMatrix#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxMatrix#equals(Object)}
   *   <li>{@link FxMatrix#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrix.equals(Object)", "int FxMatrix.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    HashMap<Currency, Integer> currencies = new HashMap<>();
    FxMatrix fxMatrix = new FxMatrix(currencies, DoubleMatrix.of());
    FxMatrix emptyResult = FxMatrix.empty();

    // Act and Assert
    assertEquals(fxMatrix, emptyResult);
    assertEquals(fxMatrix.hashCode(), emptyResult.hashCode());
  }

  /**
   * Test {@link FxMatrix#equals(Object)}, and {@link FxMatrix#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxMatrix#equals(Object)}
   *   <li>{@link FxMatrix#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrix.equals(Object)", "int FxMatrix.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FxMatrix emptyResult = FxMatrix.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link FxMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrix.equals(Object)", "int FxMatrix.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMap<Currency, Integer> currencies = new HashMap<>();
    FxMatrix fxMatrix = new FxMatrix(currencies, DoubleMatrix.identity(3));

    // Act and Assert
    assertNotEquals(fxMatrix, FxMatrix.empty());
  }

  /**
   * Test {@link FxMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrix.equals(Object)", "int FxMatrix.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<Currency, Integer> currencies = new HashMap<>();
    currencies.put(Currency.AED, 42);
    FxMatrix fxMatrix = new FxMatrix(currencies, DoubleMatrix.of());

    // Act and Assert
    assertNotEquals(fxMatrix, FxMatrix.empty());
  }

  /**
   * Test {@link FxMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrix.equals(Object)", "int FxMatrix.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FxMatrix.empty(), null);
  }

  /**
   * Test {@link FxMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrix.equals(Object)", "int FxMatrix.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FxMatrix.empty(), "Different type to FxMatrix");
  }
}
