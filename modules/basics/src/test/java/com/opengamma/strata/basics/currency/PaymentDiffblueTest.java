package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Payment.Builder;
import com.opengamma.strata.basics.currency.Payment.Meta;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
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

class PaymentDiffblueTest {
  /**
   * Test Builder {@link Builder#date(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#date(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder date(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.date(LocalDate)"})
  void testBuilderDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Payment.builder();

    // Act
    Builder actualDateResult = builderResult.date(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualDateResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'date'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Payment.builder().get("date"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(NoSuchElementException.class, () -> Payment.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenValue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Payment.builder().get("value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> Payment.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'date'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Payment.builder();

    // Act
    Builder actualSetResult = builderResult.set("date", LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Payment.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#value(CurrencyAmount)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#value(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test Builder value(CurrencyAmount); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.value(CurrencyAmount)"})
  void testBuilderValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Payment.builder();

    // Act
    Builder actualValueResult = builderResult.value(CurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    assertSame(builderResult, actualValueResult);
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
    Class<? extends Payment> actualBeanTypeResult = Payment.meta().beanType();

    // Assert
    Class<Payment> expectedBeanTypeResult = Payment.class;
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
    Meta metaResult = Payment.meta();

    // Act
    MetaProperty<LocalDate> actualDateResult = metaResult.date();

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
    MetaProperty<?> actualMetaPropertyGetResult = Payment.meta().metaPropertyGet("date");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> valueResult = ((Meta) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("date", actualMetaPropertyGetResult.name());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    Class<Payment> expectedDeclaringTypeResult = Payment.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
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
    assertNull(Payment.meta().metaPropertyGet("Property Name"));
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
    MetaProperty<?> actualMetaPropertyGetResult = Payment.meta().metaPropertyGet("value");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> dateResult = ((Meta) metaBeanResult).date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("date", dateResult.name());
    assertEquals("value", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dateResult.style());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<Payment> expectedDeclaringTypeResult = Payment.class;
    assertEquals(expectedDeclaringTypeResult, dateResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = Payment.meta().metaPropertyMap();

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
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<Payment> expectedDeclaringTypeResult = Payment.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<Payment> expectedDeclaringTypeResult2 = Payment.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
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
    assertNull(Payment.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'date'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = Payment.meta();
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(Payment.of(Currency.AED, 10.0d, date), "date", true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(date, actualPropertyGetResult);
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
    Meta metaResult = Payment.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                Payment.of(Currency.AED, 10.0d, LocalDate.of(1970, 1, 1)), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return {@link CurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'value'; then return CurrencyAmount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValue_thenReturnCurrencyAmount() {
    // Arrange
    Meta metaResult = Payment.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            Payment.of(Currency.AED, 10.0d, LocalDate.of(1970, 1, 1)), "value", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof CurrencyAmount);
    assertEquals(10.0d, ((CurrencyAmount) actualPropertyGetResult).getAmount());
    assertFalse(((CurrencyAmount) actualPropertyGetResult).isNegative());
    assertFalse(((CurrencyAmount) actualPropertyGetResult).isZero());
    assertTrue(((CurrencyAmount) actualPropertyGetResult).isPositive());
    assertSame(actualPropertyGetResult, ((CurrencyAmount) actualPropertyGetResult).positive());
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
        () -> Payment.meta().propertySet(mock(Bean.class), "date", "New Value", true));
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
        () -> Payment.meta().propertySet(mock(Bean.class), "date", "New Value", false));
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
        () -> Payment.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> Payment.meta().propertySet(mock(Bean.class), "value", "New Value", true));
  }

  /**
   * Test {@link Payment#of(Currency, double, LocalDate)} with {@code currency}, {@code amount},
   * {@code date}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return Value Amount is ten.
   * </ul>
   *
   * <p>Method under test: {@link Payment#of(Currency, double, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double, LocalDate) with 'currency', 'amount', 'date'; when AED; then return Value Amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment Payment.of(Currency, double, LocalDate)"})
  void testOfWithCurrencyAmountDate_whenAed_thenReturnValueAmountIsTen() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    Payment actualOfResult = Payment.of(Currency.AED, 10.0d, date);

    // Assert
    CurrencyAmount value = actualOfResult.getValue();
    assertEquals(10.0d, value.getAmount());
    assertEquals(10.0d, actualOfResult.getAmount());
    assertFalse(value.isNegative());
    assertFalse(value.isZero());
    assertTrue(value.isPositive());
    CurrencyAmount actualPositiveResult = value.positive();
    assertSame(value, actualPositiveResult);
    assertSame(date, actualOfResult.getDate());
    Currency currency = Currency.AED;
    assertSame(currency, value.getCurrency());
    assertSame(currency, actualOfResult.getCurrency());
  }

  /**
   * Test {@link Payment#of(CurrencyAmount, LocalDate)} with {@code value}, {@code date}.
   *
   * <ul>
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link Payment#of(CurrencyAmount, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyAmount, LocalDate) with 'value', 'date'; then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment Payment.of(CurrencyAmount, LocalDate)"})
  void testOfWithValueDate_thenReturnCurrencyCodeIsAed() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, 10.0d);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    Payment actualOfResult = Payment.of(value, date);

    // Assert
    Currency currency = actualOfResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    assertEquals(10.0d, actualOfResult.getAmount());
    assertEquals(2, currency.getMinorUnitDigits());
    assertSame(value, actualOfResult.getValue());
    assertSame(date, actualOfResult.getDate());
  }

  /**
   * Test {@link Payment#ofPay(CurrencyAmount, LocalDate)}.
   *
   * <ul>
   *   <li>Then return Amount is zero.
   * </ul>
   *
   * <p>Method under test: {@link Payment#ofPay(CurrencyAmount, LocalDate)}
   */
  @Test
  @DisplayName("Test ofPay(CurrencyAmount, LocalDate); then return Amount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment Payment.ofPay(CurrencyAmount, LocalDate)"})
  void testOfPay_thenReturnAmountIsZero() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, 0.0d);

    // Act
    Payment actualOfPayResult = Payment.ofPay(value, LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals(0.0d, actualOfPayResult.getAmount());
    assertSame(value, actualOfPayResult.getValue());
  }

  /**
   * Test {@link Payment#ofPay(CurrencyAmount, LocalDate)}.
   *
   * <ul>
   *   <li>Then return Value Amount is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link Payment#ofPay(CurrencyAmount, LocalDate)}
   */
  @Test
  @DisplayName("Test ofPay(CurrencyAmount, LocalDate); then return Value Amount is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment Payment.ofPay(CurrencyAmount, LocalDate)"})
  void testOfPay_thenReturnValueAmountIsMinusTen() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    Payment actualOfPayResult = Payment.ofPay(value, LocalDate.of(1970, 1, 1));

    // Assert
    CurrencyAmount value2 = actualOfPayResult.getValue();
    assertEquals(-10.0d, value2.getAmount());
    assertEquals(-10.0d, actualOfPayResult.getAmount());
    assertFalse(value2.isZero());
    assertTrue(value2.isNegative());
    assertEquals(value, value2.negated());
    assertEquals(value, value2.positive());
    CurrencyAmount actualNegativeResult = value2.negative();
    assertSame(value2, actualNegativeResult);
  }

  /**
   * Test {@link Payment#ofReceive(CurrencyAmount, LocalDate)}.
   *
   * <ul>
   *   <li>Then return Amount is ten.
   * </ul>
   *
   * <p>Method under test: {@link Payment#ofReceive(CurrencyAmount, LocalDate)}
   */
  @Test
  @DisplayName("Test ofReceive(CurrencyAmount, LocalDate); then return Amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment Payment.ofReceive(CurrencyAmount, LocalDate)"})
  void testOfReceive_thenReturnAmountIsTen() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    Payment actualOfReceiveResult = Payment.ofReceive(value, LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals(10.0d, actualOfReceiveResult.getAmount());
    assertSame(
        actualOfReceiveResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualOfReceiveResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    assertSame(value, actualOfReceiveResult.getValue());
  }

  /**
   * Test {@link Payment#ofReceive(CurrencyAmount, LocalDate)}.
   *
   * <ul>
   *   <li>Then return Value Amount is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Payment#ofReceive(CurrencyAmount, LocalDate)}
   */
  @Test
  @DisplayName("Test ofReceive(CurrencyAmount, LocalDate); then return Value Amount is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment Payment.ofReceive(CurrencyAmount, LocalDate)"})
  void testOfReceive_thenReturnValueAmountIs05() {
    // Arrange
    CurrencyAmount value = CurrencyAmount.of(Currency.AED, -0.5d);

    // Act
    Payment actualOfReceiveResult = Payment.ofReceive(value, LocalDate.of(1970, 1, 1));

    // Assert
    CurrencyAmount value2 = actualOfReceiveResult.getValue();
    assertEquals(0.5d, value2.getAmount());
    assertEquals(0.5d, actualOfReceiveResult.getAmount());
    assertEquals(value, value2.negated());
    assertEquals(value, value2.negative());
    Currency currency = actualOfReceiveResult.getCurrency();
    assertSame(
        currency.getTriangulationCurrency().getTriangulationCurrency(),
        currency.getTriangulationCurrency().getTriangulationCurrency());
    assertSame(currency, value2.getCurrency());
    CurrencyAmount actualPositiveResult = value2.positive();
    assertSame(value2, actualPositiveResult);
  }

  /**
   * Test {@link Payment#getCurrency()}.
   *
   * <p>Method under test: {@link Payment#getCurrency()}
   */
  @Test
  @DisplayName("Test getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency Payment.getCurrency()"})
  void testGetCurrency() {
    // Arrange
    Payment ofResult = Payment.of(Currency.AED, 10.0d, LocalDate.of(1970, 1, 1));

    // Act
    Currency actualCurrency = ofResult.getCurrency();

    // Assert
    Currency currency = Currency.AED;
    CurrencyAmount value = ofResult.getValue();
    assertSame(currency, value.negated().getCurrency());
    assertSame(currency, value.negative().getCurrency());
    assertSame(currency, value.getCurrency());
    assertSame(currency, actualCurrency);
  }

  /**
   * Test {@link Payment#getAmount()}.
   *
   * <p>Method under test: {@link Payment#getAmount()}
   */
  @Test
  @DisplayName("Test getAmount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Payment.getAmount()"})
  void testGetAmount() {
    // Arrange, Act and Assert
    assertEquals(10.0d, Payment.of(Currency.AED, 10.0d, LocalDate.of(1970, 1, 1)).getAmount());
  }

  /**
   * Test {@link Payment#adjustDate(TemporalAdjuster)}.
   *
   * <p>Method under test: {@link Payment#adjustDate(TemporalAdjuster)}
   */
  @Test
  @DisplayName("Test adjustDate(TemporalAdjuster)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment Payment.adjustDate(TemporalAdjuster)"})
  void testAdjustDate() {
    // Arrange
    Payment ofResult = Payment.of(Currency.AED, 10.0d, LocalDate.ofEpochDay(1L));

    TemporalAdjuster adjuster = mock(TemporalAdjuster.class);
    when(adjuster.adjustInto(Mockito.<Temporal>any())).thenReturn(LocalDate.ofEpochDay(1L));

    // Act
    Payment actualAdjustDateResult = ofResult.adjustDate(adjuster);

    // Assert
    verify(adjuster).adjustInto(isA(Temporal.class));
    assertSame(ofResult, actualAdjustDateResult);
  }

  /**
   * Test {@link Payment#adjustDate(TemporalAdjuster)}.
   *
   * <ul>
   *   <li>Then return Value negated negated is Value.
   * </ul>
   *
   * <p>Method under test: {@link Payment#adjustDate(TemporalAdjuster)}
   */
  @Test
  @DisplayName("Test adjustDate(TemporalAdjuster); then return Value negated negated is Value")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment Payment.adjustDate(TemporalAdjuster)"})
  void testAdjustDate_thenReturnValueNegatedNegatedIsValue() {
    // Arrange
    Payment ofResult = Payment.of(Currency.AED, 10.0d, LocalDate.of(1970, 1, 1));

    TemporalAdjuster adjuster = mock(TemporalAdjuster.class);
    when(adjuster.adjustInto(Mockito.<Temporal>any())).thenReturn(LocalDate.ofEpochDay(1L));

    // Act
    Payment actualAdjustDateResult = ofResult.adjustDate(adjuster);

    // Assert
    verify(adjuster).adjustInto(isA(Temporal.class));
    CurrencyAmount value = actualAdjustDateResult.getValue();
    CurrencyAmount negatedResult = value.negated();
    assertEquals(value, negatedResult.negated());
    assertEquals(value, negatedResult.positive());
    Currency currency = actualAdjustDateResult.getCurrency();
    assertSame(
        currency.getTriangulationCurrency().getTriangulationCurrency(),
        currency.getTriangulationCurrency().getTriangulationCurrency());
    assertSame(currency, negatedResult.getCurrency());
    assertSame(currency, value.getCurrency());
    CurrencyAmount actualPositiveResult = value.positive();
    assertSame(value, actualPositiveResult);
  }

  /**
   * Test {@link Payment#negated()}.
   *
   * <p>Method under test: {@link Payment#negated()}
   */
  @Test
  @DisplayName("Test negated()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment Payment.negated()"})
  void testNegated() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    Payment actualNegatedResult = Payment.of(Currency.AED, 10.0d, date).negated();

    // Assert
    LocalDate date2 = actualNegatedResult.getDate();
    assertEquals("1970-01-01", date2.toString());
    Currency currency = actualNegatedResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    CurrencyAmount value = actualNegatedResult.getValue();
    assertEquals(-10.0d, value.getAmount());
    assertEquals(-10.0d, actualNegatedResult.getAmount());
    assertEquals(2, currency.getMinorUnitDigits());
    assertFalse(value.isPositive());
    assertFalse(value.isZero());
    assertTrue(value.isNegative());
    assertSame(currency, value.getCurrency());
    CurrencyAmount actualNegativeResult = value.negative();
    assertSame(value, actualNegativeResult);
    assertSame(date, date2);
  }

  /**
   * Test {@link Payment#convertedTo(Currency, FxRateProvider)}.
   *
   * <p>Method under test: {@link Payment#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment Payment.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo() {
    // Arrange
    Payment ofResult = Payment.of(Currency.AED, 10.0d, LocalDate.of(1970, 1, 1));

    // Act
    Payment actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, mock(FxRateProvider.class));

    // Assert
    assertSame(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link Payment#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return Value negated negated is Value.
   * </ul>
   *
   * <p>Method under test: {@link Payment#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider); given ten; then return Value negated negated is Value")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Payment Payment.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo_givenTen_thenReturnValueNegatedNegatedIsValue() {
    // Arrange
    Payment ofResult = Payment.of(Currency.ARS, 10.0d, LocalDate.of(1970, 1, 1));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(10.0d);

    // Act
    Payment actualConvertedToResult = ofResult.convertedTo(Currency.AED, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
    CurrencyAmount value = actualConvertedToResult.getValue();
    CurrencyAmount negatedResult = value.negated();
    assertEquals(value, negatedResult.negated());
    assertEquals(value, negatedResult.positive());
    Currency currency = actualConvertedToResult.getCurrency();
    assertSame(
        currency.getTriangulationCurrency().getTriangulationCurrency(),
        currency.getTriangulationCurrency().getTriangulationCurrency());
    assertSame(currency, negatedResult.getCurrency());
    assertSame(currency, value.getCurrency());
    CurrencyAmount actualPositiveResult = value.positive();
    assertSame(value, actualPositiveResult);
  }

  /**
   * Test {@link Payment#meta()}.
   *
   * <p>Method under test: {@link Payment#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Payment.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = Payment.meta();

    // Assert
    MetaProperty<LocalDate> dateResult = actualMetaResult.date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("date", dateResult.name());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    Class<Payment> expectedDeclaringTypeResult = Payment.class;
    assertEquals(expectedDeclaringTypeResult, dateResult.declaringType());
    Class<Payment> expectedDeclaringTypeResult2 = Payment.class;
    assertEquals(expectedDeclaringTypeResult2, valueResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, dateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, dateResult.metaBean());
    assertSame(meta, valueResult.metaBean());
  }

  /**
   * Test {@link Payment#metaBean()}.
   *
   * <p>Method under test: {@link Payment#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Payment.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, Payment.of(Currency.AED, 10.0d, LocalDate.of(1970, 1, 1)).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Payment#toString()}
   *   <li>{@link Payment#getDate()}
   *   <li>{@link Payment#getValue()}
   *   <li>{@link Payment#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDate Payment.getDate()",
    "CurrencyAmount Payment.getValue()",
    "Builder Payment.toBuilder()",
    "String Payment.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    Payment ofResult = Payment.of(Currency.AED, 10.0d, date);

    // Act
    String actualToStringResult = ofResult.toString();
    LocalDate actualDate = ofResult.getDate();
    CurrencyAmount actualValue = ofResult.getValue();
    ofResult.toBuilder();

    // Assert
    assertEquals("1970-01-01", actualDate.toString());
    Currency currency = actualValue.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    assertEquals("Payment{value=AED 10, date=1970-01-01}", actualToStringResult);
    Currency triangulationCurrency = currency.getTriangulationCurrency();
    assertEquals("USD", triangulationCurrency.getCode());
    assertEquals("USD", triangulationCurrency.toString());
    CurrencyAmount negatedResult = actualValue.negated();
    assertEquals(-10.0d, negatedResult.getAmount());
    assertEquals(10.0d, actualValue.getAmount());
    assertEquals(2, triangulationCurrency.getMinorUnitDigits());
    assertEquals(2, currency.getMinorUnitDigits());
    assertFalse(actualValue.isNegative());
    assertFalse(negatedResult.isPositive());
    assertFalse(negatedResult.isZero());
    assertFalse(actualValue.isZero());
    assertTrue(negatedResult.isNegative());
    assertTrue(actualValue.isPositive());
    assertSame(date, actualDate);
  }

  /**
   * Test {@link Payment#equals(Object)}, and {@link Payment#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Payment#equals(Object)}
   *   <li>{@link Payment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Payment.equals(Object)", "int Payment.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder dateResult = Payment.builder().date(LocalDate.of(1970, 1, 1));
    Payment payment = dateResult.value(CurrencyAmount.of(Currency.AED, 10.0d)).build();

    Builder dateResult2 = Payment.builder().date(LocalDate.of(1970, 1, 1));
    Payment payment2 = dateResult2.value(CurrencyAmount.of(Currency.AED, 10.0d)).build();

    // Act and Assert
    assertEquals(payment, payment2);
    assertEquals(payment.hashCode(), payment2.hashCode());
  }

  /**
   * Test {@link Payment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Payment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Payment.equals(Object)", "int Payment.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder dateResult = Payment.builder().date(LocalDate.of(1970, 1, 1));
    Payment payment = dateResult.value(CurrencyAmount.of(Currency.ARS, 10.0d)).build();

    Builder dateResult2 = Payment.builder().date(LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertNotEquals(payment, dateResult2.value(CurrencyAmount.of(Currency.AED, 10.0d)).build());
  }

  /**
   * Test {@link Payment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Payment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Payment.equals(Object)", "int Payment.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder dateResult = Payment.builder().date(LocalDate.now());
    Payment payment = dateResult.value(CurrencyAmount.of(Currency.AED, 10.0d)).build();

    Builder dateResult2 = Payment.builder().date(LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertNotEquals(payment, dateResult2.value(CurrencyAmount.of(Currency.AED, 10.0d)).build());
  }
}
