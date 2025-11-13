package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.FxRate.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxRateDiffblueTest {
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
    Class<? extends FxRate> actualBeanTypeResult = FxRate.meta().beanType();

    // Assert
    Class<FxRate> expectedBeanTypeResult = FxRate.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#pair()}
   *   <li>{@link Meta#rate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.pair()", "MetaProperty Meta.rate()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FxRate.meta();

    // Act
    MetaProperty<CurrencyPair> actualPairResult = metaResult.pair();

    // Assert
    assertTrue(actualPairResult instanceof DirectMetaProperty);
    assertTrue(metaResult.rate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code pair}.
   *   <li>Then metaBean rate return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'pair'; then metaBean rate return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPair_thenMetaBeanRateReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = FxRate.meta().metaPropertyGet("pair");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> rateResult = ((Meta) metaBeanResult).rate();
    assertTrue(rateResult instanceof DirectMetaProperty);
    assertEquals("double", rateResult.propertyType().getName());
    assertEquals("pair", actualMetaPropertyGetResult.name());
    assertEquals("rate", rateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, rateResult.style());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<FxRate> expectedDeclaringTypeResult = FxRate.class;
    assertEquals(expectedDeclaringTypeResult, rateResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).pair());
    assertSame(Meta.INSTANCE, rateResult.metaBean());
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
    assertNull(FxRate.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code rate}.
   *   <li>Then metaBean pair return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'rate'; then metaBean pair return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRate_thenMetaBeanPairReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = FxRate.meta().metaPropertyGet("rate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyPair> pairResult = ((Meta) metaBeanResult).pair();
    assertTrue(pairResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("pair", pairResult.name());
    assertEquals("rate", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, pairResult.style());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, pairResult.propertyType());
    Class<FxRate> expectedDeclaringTypeResult = FxRate.class;
    assertEquals(expectedDeclaringTypeResult, pairResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rate());
    assertSame(Meta.INSTANCE, pairResult.metaBean());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = FxRate.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("pair");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("rate");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("pair", getResult.name());
    assertEquals("rate", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<FxRate> expectedDeclaringTypeResult = FxRate.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<FxRate> expectedDeclaringTypeResult2 = FxRate.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
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
    assertNull(FxRate.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> FxRate.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
        () -> FxRate.meta().propertySet(mock(Bean.class), "pair", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code pair}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'pair'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPair_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FxRate.meta().propertySet(mock(Bean.class), "pair", "New Value", true));
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
        () -> FxRate.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code rate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'rate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FxRate.meta().propertySet(mock(Bean.class), "rate", "New Value", true));
  }

  /**
   * Test {@link FxRate#of(Currency, Currency, double)} with {@code base}, {@code counter}, {@code
   * rate}.
   *
   * <ul>
   *   <li>When {@link Currency#ARS}.
   *   <li>Then return not Pair Identity.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#of(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Currency, double) with 'base', 'counter', 'rate'; when ARS; then return not Pair Identity")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.of(Currency, Currency, double)"})
  void testOfWithBaseCounterRate_whenArs_thenReturnNotPairIdentity() {
    // Arrange and Act
    FxRate actualOfResult = FxRate.of(Currency.ARS, Currency.AED, 10.0d);

    // Assert
    CurrencyPair pair = actualOfResult.getPair();
    assertFalse(pair.isIdentity());
    assertEquals(actualOfResult, actualOfResult.inverse().inverse());
    assertSame(Currency.ARS, pair.getBase());
  }

  /**
   * Test {@link FxRate#of(Currency, Currency, double)} with {@code base}, {@code counter}, {@code
   * rate}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Pair Identity.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#of(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Currency, double) with 'base', 'counter', 'rate'; when one; then return Pair Identity")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.of(Currency, Currency, double)"})
  void testOfWithBaseCounterRate_whenOne_thenReturnPairIdentity() {
    // Arrange and Act
    FxRate actualOfResult = FxRate.of(Currency.AED, Currency.AED, 1.0d);

    // Assert
    CurrencyPair pair = actualOfResult.getPair();
    assertTrue(pair.isIdentity());
    CurrencyPair actualInverseResult = pair.inverse();
    assertEquals(pair, actualInverseResult);
    FxRate actualInverseResult2 = actualOfResult.inverse();
    assertEquals(actualOfResult, actualInverseResult2);
    Currency base = pair.getBase();
    assertSame(base, pair.getCounter());
    CurrencyPair actualToConventionalResult = pair.toConventional();
    assertSame(pair, actualToConventionalResult);
    assertSame(Currency.AED, base);
  }

  /**
   * Test {@link FxRate#of(Currency, Currency, double)} with {@code base}, {@code counter}, {@code
   * rate}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#of(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Currency, double) with 'base', 'counter', 'rate'; when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.of(Currency, Currency, double)"})
  void testOfWithBaseCounterRate_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> FxRate.of(Currency.AED, Currency.AED, 10.0d));
  }

  /**
   * Test {@link FxRate#of(CurrencyPair, double)} with {@code pair}, {@code rate}.
   *
   * <ul>
   *   <li>Then return Pair is {@link CurrencyPair} with base is {@link Currency#AED} and counter is
   *       {@link Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#of(CurrencyPair, double)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyPair, double) with 'pair', 'rate'; then return Pair is CurrencyPair with base is AED and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.of(CurrencyPair, double)"})
  void testOfWithPairRate_thenReturnPairIsCurrencyPairWithBaseIsAedAndCounterIsAed() {
    // Arrange
    CurrencyPair pair = CurrencyPair.of(Currency.AED, Currency.AED);

    // Act
    FxRate actualOfResult = FxRate.of(pair, 1.0d);

    // Assert
    FxRate actualInverseResult = actualOfResult.inverse();
    assertEquals(actualOfResult, actualInverseResult);
    assertSame(pair, actualOfResult.getPair());
  }

  /**
   * Test {@link FxRate#of(CurrencyPair, double)} with {@code pair}, {@code rate}.
   *
   * <ul>
   *   <li>Then return Pair is {@link CurrencyPair} with base is {@link Currency#ARS} and counter is
   *       {@link Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#of(CurrencyPair, double)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyPair, double) with 'pair', 'rate'; then return Pair is CurrencyPair with base is ARS and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.of(CurrencyPair, double)"})
  void testOfWithPairRate_thenReturnPairIsCurrencyPairWithBaseIsArsAndCounterIsAed() {
    // Arrange
    CurrencyPair pair = CurrencyPair.of(Currency.ARS, Currency.AED);

    // Act
    FxRate actualOfResult = FxRate.of(pair, 10.0d);

    // Assert
    assertEquals(actualOfResult, actualOfResult.inverse().inverse());
    assertSame(pair, actualOfResult.getPair());
  }

  /**
   * Test {@link FxRate#of(CurrencyPair, double)} with {@code pair}, {@code rate}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#of(CurrencyPair, double)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyPair, double) with 'pair', 'rate'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.of(CurrencyPair, double)"})
  void testOfWithPairRate_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FxRate.of(CurrencyPair.of(Currency.AED, Currency.AED), 10.0d));
  }

  /**
   * Test {@link FxRate#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Rate Str}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Rate Str'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.parse(String)"})
  void testParse_whenRateStr_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> FxRate.parse("Rate Str"));
  }

  /**
   * Test {@link FxRate#parse(String)}.
   *
   * <ul>
   *   <li>When {@code UUU/UUU 9}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'UUU/UUU 9'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.parse(String)"})
  void testParse_whenUuuUuu9_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> FxRate.parse("UUU/UUU 9"));
  }

  /**
   * Test {@link FxRate#inverse()}.
   *
   * <ul>
   *   <li>Then return {@link FxRate} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED} and rate is one.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#inverse()}
   */
  @Test
  @DisplayName(
      "Test inverse(); then return FxRate with base is AED and counter is AED and rate is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.inverse()"})
  void testInverse_thenReturnFxRateWithBaseIsAedAndCounterIsAedAndRateIsOne() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.AED, Currency.AED, 1.0d);

    // Act
    FxRate actualInverseResult = ofResult.inverse();

    // Assert
    assertEquals(ofResult, actualInverseResult);
  }

  /**
   * Test {@link FxRate#inverse()}.
   *
   * <ul>
   *   <li>Then return Pair Counter Code is {@code ARS}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#inverse()}
   */
  @Test
  @DisplayName("Test inverse(); then return Pair Counter Code is 'ARS'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.inverse()"})
  void testInverse_thenReturnPairCounterCodeIsArs() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AED, 10.0d);

    // Act and Assert
    CurrencyPair pair = ofResult.inverse().getPair();
    Currency counter = pair.getCounter();
    assertEquals("ARS", counter.getCode());
    assertEquals("ARS", counter.toString());
    assertEquals(2, counter.getMinorUnitDigits());
    CurrencyPair inverseResult = pair.inverse();
    assertFalse(inverseResult.isIdentity());
    assertFalse(pair.isIdentity());
    assertEquals(pair, inverseResult.inverse());
    assertEquals(pair, inverseResult.toConventional());
    assertSame(counter, inverseResult.getBase());
    CurrencyPair actualToConventionalResult = pair.toConventional();
    assertSame(pair, actualToConventionalResult);
  }

  /**
   * Test {@link FxRate#fxRate(Currency, Currency)} with {@code baseCurrency}, {@code
   * counterCurrency}.
   *
   * <p>Method under test: {@link FxRate#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName("Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FxRate.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AUD, 10.0d);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.fxRate(Currency.ARS, Currency.AED));
  }

  /**
   * Test {@link FxRate#fxRate(Currency, Currency)} with {@code baseCurrency}, {@code
   * counterCurrency}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FxRate.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_thenReturnOne() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AED, 10.0d);

    // Act and Assert
    assertEquals(1.0d, ofResult.fxRate(Currency.AED, Currency.AED));
  }

  /**
   * Test {@link FxRate#fxRate(Currency, Currency)} with {@code baseCurrency}, {@code
   * counterCurrency}.
   *
   * <ul>
   *   <li>When {@link Currency#ARS}.
   *   <li>Then return {@code 0.1}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; when ARS; then return '0.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FxRate.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_whenArs_thenReturn01() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AED, 10.0d);

    // Act and Assert
    assertEquals(0.1d, ofResult.fxRate(Currency.AED, Currency.ARS));
  }

  /**
   * Test {@link FxRate#fxRate(Currency, Currency)} with {@code baseCurrency}, {@code
   * counterCurrency}.
   *
   * <ul>
   *   <li>When {@link Currency#ARS}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; when ARS; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FxRate.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_whenArs_thenReturnTen() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AED, 10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.fxRate(Currency.ARS, Currency.AED));
  }

  /**
   * Test {@link FxRate#fxRate(Currency, Currency)} with {@code baseCurrency}, {@code
   * counterCurrency}.
   *
   * <ul>
   *   <li>When {@link Currency#AUD}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName("Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; when AUD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FxRate.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_whenAud() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AED, 10.0d);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.fxRate(Currency.AUD, Currency.AED));
  }

  /**
   * Test {@link FxRate#fxRate(Currency, Currency)} with {@code baseCurrency}, {@code
   * counterCurrency}.
   *
   * <ul>
   *   <li>When {@link Currency#AUD}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName("Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; when AUD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FxRate.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_whenAud2() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AED, 10.0d);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.fxRate(Currency.AUD, Currency.ARS));
  }

  /**
   * Test {@link FxRate#toConventional()}.
   *
   * <p>Method under test: {@link FxRate#toConventional()}
   */
  @Test
  @DisplayName("Test toConventional()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.toConventional()"})
  void testToConventional() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AUD, 10.0d);

    // Act
    FxRate actualToConventionalResult = ofResult.toConventional();

    // Assert
    CurrencyPair pair = actualToConventionalResult.getPair();
    CurrencyPair inverseResult = pair.inverse();
    assertEquals(pair, inverseResult.inverse());
    assertEquals(pair, inverseResult.toConventional());
    assertEquals(ofResult, actualToConventionalResult.inverse());
    assertSame(pair.getCounter(), inverseResult.getBase());
    CurrencyPair actualToConventionalResult2 = pair.toConventional();
    assertSame(pair, actualToConventionalResult2);
  }

  /**
   * Test {@link FxRate#toConventional()}.
   *
   * <ul>
   *   <li>Then return {@link FxRate} with base is {@link Currency#ARS} and counter is {@link
   *       Currency#BGN} and rate is ten.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#toConventional()}
   */
  @Test
  @DisplayName(
      "Test toConventional(); then return FxRate with base is ARS and counter is BGN and rate is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.toConventional()"})
  void testToConventional_thenReturnFxRateWithBaseIsArsAndCounterIsBgnAndRateIsTen() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.BGN, 10.0d);

    // Act
    FxRate actualToConventionalResult = ofResult.toConventional();

    // Assert
    assertSame(ofResult, actualToConventionalResult);
  }

  /**
   * Test {@link FxRate#toConventional()}.
   *
   * <ul>
   *   <li>Then return {@link FxRate} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#AED} and rate is ten.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#toConventional()}
   */
  @Test
  @DisplayName(
      "Test toConventional(); then return FxRate with base is AUD and counter is AED and rate is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.toConventional()"})
  void testToConventional_thenReturnFxRateWithBaseIsAudAndCounterIsAedAndRateIsTen() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.AUD, Currency.AED, 10.0d);

    // Act
    FxRate actualToConventionalResult = ofResult.toConventional();

    // Assert
    assertSame(ofResult, actualToConventionalResult);
  }

  /**
   * Test {@link FxRate#toConventional()}.
   *
   * <ul>
   *   <li>Then return {@link FxRate} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#CAD} and rate is ten.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#toConventional()}
   */
  @Test
  @DisplayName(
      "Test toConventional(); then return FxRate with base is AUD and counter is CAD and rate is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.toConventional()"})
  void testToConventional_thenReturnFxRateWithBaseIsAudAndCounterIsCadAndRateIsTen() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.AUD, Currency.CAD, 10.0d);

    // Act
    FxRate actualToConventionalResult = ofResult.toConventional();

    // Assert
    assertSame(ofResult, actualToConventionalResult);
  }

  /**
   * Test {@link FxRate#toConventional()}.
   *
   * <ul>
   *   <li>Then return Pair Base Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#toConventional()}
   */
  @Test
  @DisplayName("Test toConventional(); then return Pair Base Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.toConventional()"})
  void testToConventional_thenReturnPairBaseCodeIsAed() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AED, 10.0d);

    // Act
    FxRate actualToConventionalResult = ofResult.toConventional();

    // Assert
    CurrencyPair pair = actualToConventionalResult.getPair();
    Currency base = pair.getBase();
    assertEquals("AED", base.getCode());
    assertEquals("AED", base.toString());
    CurrencyPair inverseResult = pair.inverse();
    assertEquals(pair, inverseResult.inverse());
    assertEquals(pair, inverseResult.toConventional());
    assertEquals(ofResult, actualToConventionalResult.inverse());
    assertSame(base, inverseResult.getCounter());
    assertSame(pair.getCounter(), inverseResult.getBase());
    CurrencyPair actualToConventionalResult2 = pair.toConventional();
    assertSame(pair, actualToConventionalResult2);
  }

  /**
   * Test {@link FxRate#toConventional()}.
   *
   * <ul>
   *   <li>Then return Pair Base Code is {@code CAD}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#toConventional()}
   */
  @Test
  @DisplayName("Test toConventional(); then return Pair Base Code is 'CAD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.toConventional()"})
  void testToConventional_thenReturnPairBaseCodeIsCad() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.COP, Currency.CAD, 10.0d);

    // Act
    FxRate actualToConventionalResult = ofResult.toConventional();

    // Assert
    CurrencyPair pair = actualToConventionalResult.getPair();
    Currency base = pair.getBase();
    assertEquals("CAD", base.getCode());
    assertEquals("CAD", base.toString());
    Currency counter = pair.getCounter();
    assertEquals("COP", counter.getCode());
    assertEquals("COP", counter.toString());
    CurrencyPair inverseResult = pair.inverse();
    assertEquals(pair, inverseResult.inverse());
    assertEquals(pair, inverseResult.toConventional());
    assertEquals(ofResult, actualToConventionalResult.inverse());
    assertSame(base, inverseResult.getCounter());
    assertSame(counter, inverseResult.getBase());
    CurrencyPair actualToConventionalResult2 = pair.toConventional();
    assertSame(pair, actualToConventionalResult2);
  }

  /**
   * Test {@link FxRate#toConventional()}.
   *
   * <ul>
   *   <li>Then return Pair RateDigits is five.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#toConventional()}
   */
  @Test
  @DisplayName("Test toConventional(); then return Pair RateDigits is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRate FxRate.toConventional()"})
  void testToConventional_thenReturnPairRateDigitsIsFive() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.AUD, Currency.EUR, 10.0d);

    // Act
    FxRate actualToConventionalResult = ofResult.toConventional();

    // Assert
    CurrencyPair pair = actualToConventionalResult.getPair();
    assertEquals(5, pair.getRateDigits());
    assertEquals(ofResult, actualToConventionalResult.inverse());
    CurrencyPair actualToConventionalResult2 = pair.toConventional();
    assertSame(pair, actualToConventionalResult2);
  }

  /**
   * Test {@link FxRate#toString()}.
   *
   * <ul>
   *   <li>Then return {@code ARS/AED 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'ARS/AED 0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxRate.toString()"})
  void testToString_thenReturnArsAed05() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AED, 0.5d);

    // Act and Assert
    assertEquals("ARS/AED 0.5", ofResult.toString());
  }

  /**
   * Test {@link FxRate#toString()}.
   *
   * <ul>
   *   <li>Then return {@code ARS/AED 10}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'ARS/AED 10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxRate.toString()"})
  void testToString_thenReturnArsAed10() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AED, 10.0d);

    // Act and Assert
    assertEquals("ARS/AED 10", ofResult.toString());
  }

  /**
   * Test {@link FxRate#toString()}.
   *
   * <ul>
   *   <li>Then return {@code ARS/AED NaN}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'ARS/AED NaN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxRate.toString()"})
  void testToString_thenReturnArsAedNaN() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AED, Double.NaN);

    // Act and Assert
    assertEquals("ARS/AED NaN", ofResult.toString());
  }

  /**
   * Test {@link FxRate#meta()}.
   *
   * <p>Method under test: {@link FxRate#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxRate.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FxRate.meta();

    // Assert
    MetaProperty<CurrencyPair> pairResult = actualMetaResult.pair();
    assertTrue(pairResult instanceof DirectMetaProperty);
    MetaProperty<Double> rateResult = actualMetaResult.rate();
    assertTrue(rateResult instanceof DirectMetaProperty);
    assertEquals("double", rateResult.propertyType().getName());
    assertEquals("pair", pairResult.name());
    assertEquals("rate", rateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, pairResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, rateResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, pairResult.propertyType());
    Class<FxRate> expectedDeclaringTypeResult = FxRate.class;
    assertEquals(expectedDeclaringTypeResult, pairResult.declaringType());
    Class<FxRate> expectedDeclaringTypeResult2 = FxRate.class;
    assertEquals(expectedDeclaringTypeResult2, rateResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, pairResult.metaBean());
    assertSame(meta, rateResult.metaBean());
  }

  /**
   * Test {@link FxRate#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link FxRate#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxRate.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange
    FxRate ofResult = FxRate.of(Currency.ARS, Currency.AED, 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }
}
