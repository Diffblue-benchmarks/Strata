package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import com.opengamma.strata.basics.currency.AdjustablePayment.Meta;
import com.opengamma.strata.basics.date.AdjustableDate;
import com.opengamma.strata.basics.date.HolidayCalendar;
import com.opengamma.strata.basics.date.HolidayCalendars;
import java.time.LocalDate;
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
import org.mockito.Mockito;

class AdjustablePaymentDiffblueTest {
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
    Class<? extends AdjustablePayment> actualBeanTypeResult = AdjustablePayment.meta().beanType();

    // Assert
    Class<AdjustablePayment> expectedBeanTypeResult = AdjustablePayment.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#date()}
   *   <li>{@link Meta#value()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.date()", "MetaProperty Meta.value()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = AdjustablePayment.meta();

    // Act
    MetaProperty<AdjustableDate> actualDateResult = metaResult.date();

    // Assert
    assertTrue(actualDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.value() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then metaBean value return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'date'; then metaBean value return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDate_thenMetaBeanValueReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = AdjustablePayment.meta().metaPropertyGet("date");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> valueResult = ((Meta) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("date", actualMetaPropertyGetResult.name());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    Class<AdjustablePayment> expectedDeclaringTypeResult = AdjustablePayment.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    Class<AdjustableDate> expectedPropertyTypeResult2 = AdjustableDate.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).date());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
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
    assertNull(AdjustablePayment.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then metaBean date return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'value'; then metaBean date return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValue_thenMetaBeanDateReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = AdjustablePayment.meta().metaPropertyGet("value");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<AdjustableDate> dateResult = ((Meta) metaBeanResult).date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("date", dateResult.name());
    assertEquals("value", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dateResult.style());
    Class<AdjustablePayment> expectedDeclaringTypeResult = AdjustablePayment.class;
    assertEquals(expectedDeclaringTypeResult, dateResult.declaringType());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<AdjustableDate> expectedPropertyTypeResult2 = AdjustableDate.class;
    assertEquals(expectedPropertyTypeResult2, dateResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).value());
    assertSame(Meta.INSTANCE, dateResult.metaBean());
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
        AdjustablePayment.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("value");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("date");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("date", getResult2.name());
    assertEquals("value", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<AdjustablePayment> expectedDeclaringTypeResult = AdjustablePayment.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<AdjustablePayment> expectedDeclaringTypeResult2 = AdjustablePayment.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<AdjustableDate> expectedPropertyTypeResult2 = AdjustableDate.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
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
    assertNull(AdjustablePayment.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> AdjustablePayment.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'date'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> AdjustablePayment.meta().propertySet(mock(Bean.class), "date", "New Value", true));
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
        () -> AdjustablePayment.meta().propertySet(mock(Bean.class), "date", "New Value", false));
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
            AdjustablePayment.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'value'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> AdjustablePayment.meta().propertySet(mock(Bean.class), "value", "New Value", true));
  }

  /**
   * Test {@link AdjustablePayment#of(CurrencyAmount, LocalDate)} with {@code CurrencyAmount},
   * {@code LocalDate}.
   *
   * <ul>
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#of(CurrencyAmount, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyAmount, LocalDate) with 'CurrencyAmount', 'LocalDate'; then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustablePayment AdjustablePayment.of(CurrencyAmount, LocalDate)"})
  void testOfWithCurrencyAmountLocalDate_thenReturnCurrencyCodeIsAed() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, 10.0d);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    AdjustablePayment actualOfResult = AdjustablePayment.of(value, date);

    // Assert
    Currency currency = actualOfResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    assertEquals(10.0d, actualOfResult.getAmount());
    assertEquals(2, currency.getMinorUnitDigits());
    assertSame(value, actualOfResult.getValue());
    assertSame(date, actualOfResult.getDate().getUnadjusted());
  }

  /**
   * Test {@link AdjustablePayment#of(Currency, double, LocalDate)} with {@code Currency}, {@code
   * double}, {@code LocalDate}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return Amount is ten.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#of(Currency, double, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double, LocalDate) with 'Currency', 'double', 'LocalDate'; when AED; then return Amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustablePayment AdjustablePayment.of(Currency, double, LocalDate)"})
  void testOfWithCurrencyDoubleLocalDate_whenAed_thenReturnAmountIsTen() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    AdjustablePayment actualOfResult = AdjustablePayment.of(Currency.AED, 10.0d, date);

    // Assert
    assertEquals(10.0d, actualOfResult.getAmount());
    CurrencyAmount value = actualOfResult.getValue();
    assertEquals(10.0d, value.getAmount());
    assertFalse(value.isNegative());
    assertFalse(value.isZero());
    assertTrue(value.isPositive());
    CurrencyAmount actualPositiveResult = value.positive();
    assertSame(value, actualPositiveResult);
    assertSame(date, actualOfResult.getDate().getUnadjusted());
    Currency currency = Currency.AED;
    assertSame(currency, actualOfResult.getCurrency());
    assertSame(currency, value.getCurrency());
  }

  /**
   * Test {@link AdjustablePayment#of(Payment)} with {@code Payment}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#of(Payment)}
   */
  @Test
  @DisplayName(
      "Test of(Payment) with 'Payment'; when LocalDate with '1970' and one and one; then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustablePayment AdjustablePayment.of(Payment)"})
  void testOfWithPayment_whenLocalDateWith1970AndOneAndOne_thenReturnCurrencyCodeIsAed() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    AdjustablePayment actualOfResult = AdjustablePayment.of(Payment.of(Currency.AED, 10.0d, date));

    // Assert
    Currency currency = actualOfResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    assertEquals(10.0d, actualOfResult.getAmount());
    CurrencyAmount value = actualOfResult.getValue();
    assertEquals(10.0d, value.getAmount());
    assertEquals(2, currency.getMinorUnitDigits());
    assertFalse(value.isNegative());
    assertFalse(value.isZero());
    assertTrue(value.isPositive());
    assertSame(currency, value.getCurrency());
    CurrencyAmount actualPositiveResult = value.positive();
    assertSame(value, actualPositiveResult);
    assertSame(date, actualOfResult.getDate().getUnadjusted());
  }

  /**
   * Test {@link AdjustablePayment#ofPay(CurrencyAmount, LocalDate)} with {@code CurrencyAmount},
   * {@code LocalDate}.
   *
   * <ul>
   *   <li>Then return Amount is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#ofPay(CurrencyAmount, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test ofPay(CurrencyAmount, LocalDate) with 'CurrencyAmount', 'LocalDate'; then return Amount is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustablePayment AdjustablePayment.ofPay(CurrencyAmount, LocalDate)"})
  void testOfPayWithCurrencyAmountLocalDate_thenReturnAmountIsMinusTen() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    AdjustablePayment actualOfPayResult = AdjustablePayment.ofPay(value, LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals(-10.0d, actualOfPayResult.getAmount());
    CurrencyAmount value2 = actualOfPayResult.getValue();
    assertEquals(-10.0d, value2.getAmount());
    assertFalse(value2.isZero());
    assertTrue(value2.isNegative());
    assertEquals(value, value2.negated());
    assertEquals(value, value2.positive());
    CurrencyAmount actualNegativeResult = value2.negative();
    assertSame(value2, actualNegativeResult);
  }

  /**
   * Test {@link AdjustablePayment#ofPay(CurrencyAmount, LocalDate)} with {@code CurrencyAmount},
   * {@code LocalDate}.
   *
   * <ul>
   *   <li>Then return Amount is zero.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#ofPay(CurrencyAmount, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test ofPay(CurrencyAmount, LocalDate) with 'CurrencyAmount', 'LocalDate'; then return Amount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustablePayment AdjustablePayment.ofPay(CurrencyAmount, LocalDate)"})
  void testOfPayWithCurrencyAmountLocalDate_thenReturnAmountIsZero() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, 0.0d);

    // Act
    AdjustablePayment actualOfPayResult = AdjustablePayment.ofPay(value, LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals(0.0d, actualOfPayResult.getAmount());
    assertSame(value, actualOfPayResult.getValue());
  }

  /**
   * Test {@link AdjustablePayment#ofReceive(CurrencyAmount, LocalDate)} with {@code
   * CurrencyAmount}, {@code LocalDate}.
   *
   * <ul>
   *   <li>Then return Amount is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#ofReceive(CurrencyAmount, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test ofReceive(CurrencyAmount, LocalDate) with 'CurrencyAmount', 'LocalDate'; then return Amount is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustablePayment AdjustablePayment.ofReceive(CurrencyAmount, LocalDate)"})
  void testOfReceiveWithCurrencyAmountLocalDate_thenReturnAmountIs05() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, -0.5d);

    // Act
    AdjustablePayment actualOfReceiveResult =
        AdjustablePayment.ofReceive(value, LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals(0.5d, actualOfReceiveResult.getAmount());
    CurrencyAmount value2 = actualOfReceiveResult.getValue();
    assertEquals(0.5d, value2.getAmount());
    assertEquals(value, value2.negated());
    assertEquals(value, value2.negative());
    Currency currency = actualOfReceiveResult.getCurrency();
    assertSame(currency, value2.getCurrency());
    CurrencyAmount actualPositiveResult = value2.positive();
    assertSame(value2, actualPositiveResult);
    assertSame(
        currency.getTriangulationCurrency().getTriangulationCurrency(),
        currency.getTriangulationCurrency().getTriangulationCurrency());
  }

  /**
   * Test {@link AdjustablePayment#ofReceive(CurrencyAmount, LocalDate)} with {@code
   * CurrencyAmount}, {@code LocalDate}.
   *
   * <ul>
   *   <li>Then return Amount is ten.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#ofReceive(CurrencyAmount, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test ofReceive(CurrencyAmount, LocalDate) with 'CurrencyAmount', 'LocalDate'; then return Amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustablePayment AdjustablePayment.ofReceive(CurrencyAmount, LocalDate)"})
  void testOfReceiveWithCurrencyAmountLocalDate_thenReturnAmountIsTen() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    AdjustablePayment actualOfReceiveResult =
        AdjustablePayment.ofReceive(value, LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals(10.0d, actualOfReceiveResult.getAmount());
    assertSame(
        actualOfReceiveResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualOfReceiveResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    assertSame(value, actualOfReceiveResult.getValue());
  }

  /**
   * Test {@link AdjustablePayment#getCurrency()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is ten.
   *   <li>Then return {@link Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#getCurrency()}
   */
  @Test
  @DisplayName(
      "Test getCurrency(); given CurrencyAmount with currency is AED and amount is ten; then return AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency AdjustablePayment.getCurrency()"})
  void testGetCurrency_givenCurrencyAmountWithCurrencyIsAedAndAmountIsTen_thenReturnAed() {
    // Arrange
    AdjustablePayment ofResult =
        AdjustablePayment.of(CurrencyAmount.of(Currency.AED, 10.0d), LocalDate.of(1970, 1, 1));

    // Act and Assert
    Currency currency = Currency.AED;
    assertSame(currency, ofResult.getCurrency());
    CurrencyAmount value = ofResult.getValue();
    assertSame(currency, value.getCurrency());
    assertSame(currency, value.negated().getCurrency());
    assertSame(currency, value.negative().getCurrency());
  }

  /**
   * Test {@link AdjustablePayment#getAmount()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#getAmount()}
   */
  @Test
  @DisplayName(
      "Test getAmount(); given CurrencyAmount with currency is AED and amount is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AdjustablePayment.getAmount()"})
  void testGetAmount_givenCurrencyAmountWithCurrencyIsAedAndAmountIsTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        AdjustablePayment.of(CurrencyAmount.of(Currency.AED, 10.0d), LocalDate.of(1970, 1, 1))
            .getAmount());
  }

  /**
   * Test {@link AdjustablePayment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return Date toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData); then return Date toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment AdjustablePayment.resolve(ReferenceData)"})
  void testResolve_thenReturnDateToStringIs19700101() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, 10.0d);
    LocalDate date = LocalDate.of(1970, 1, 1);

    AdjustablePayment ofResult = AdjustablePayment.of(value, date);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    Payment actualResolveResult = ofResult.resolve(refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    LocalDate date2 = actualResolveResult.getDate();
    assertEquals("1970-01-01", date2.toString());
    Currency currency = actualResolveResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    assertEquals(10.0d, actualResolveResult.getAmount());
    assertEquals(2, currency.getMinorUnitDigits());
    assertSame(value, actualResolveResult.getValue());
    assertSame(date, date2);
  }

  /**
   * Test {@link AdjustablePayment#negated()}.
   *
   * <ul>
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#negated()}
   */
  @Test
  @DisplayName("Test negated(); then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustablePayment AdjustablePayment.negated()"})
  void testNegated_thenReturnCurrencyCodeIsAed() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, 10.0d);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    AdjustablePayment actualNegatedResult = AdjustablePayment.of(value, date).negated();

    // Assert
    Currency currency = actualNegatedResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    assertEquals(-10.0d, actualNegatedResult.getAmount());
    CurrencyAmount value2 = actualNegatedResult.getValue();
    assertEquals(-10.0d, value2.getAmount());
    assertEquals(2, currency.getMinorUnitDigits());
    assertFalse(value2.isPositive());
    assertFalse(value2.isZero());
    assertTrue(value2.isNegative());
    assertEquals(value, value2.negated());
    assertEquals(value, value2.positive());
    assertSame(currency, value2.getCurrency());
    CurrencyAmount actualNegativeResult = value2.negative();
    assertSame(value2, actualNegativeResult);
    assertSame(date, actualNegatedResult.getDate().getUnadjusted());
  }

  /**
   * Test {@link AdjustablePayment#meta()}.
   *
   * <p>Method under test: {@link AdjustablePayment#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta AdjustablePayment.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = AdjustablePayment.meta();

    // Assert
    MetaProperty<AdjustableDate> dateResult = actualMetaResult.date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("date", dateResult.name());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<AdjustablePayment> expectedDeclaringTypeResult = AdjustablePayment.class;
    assertEquals(expectedDeclaringTypeResult, dateResult.declaringType());
    Class<AdjustablePayment> expectedDeclaringTypeResult2 = AdjustablePayment.class;
    assertEquals(expectedDeclaringTypeResult2, valueResult.declaringType());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    Class<AdjustableDate> expectedPropertyTypeResult2 = AdjustableDate.class;
    assertEquals(expectedPropertyTypeResult2, dateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, dateResult.metaBean());
    assertSame(meta, valueResult.metaBean());
  }

  /**
   * Test {@link AdjustablePayment#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustablePayment#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta AdjustablePayment.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        AdjustablePayment.of(CurrencyAmount.of(Currency.AED, 10.0d), LocalDate.of(1970, 1, 1))
            .metaBean());
  }
}
