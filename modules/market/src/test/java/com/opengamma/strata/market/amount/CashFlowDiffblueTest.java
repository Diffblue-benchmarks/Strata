package com.opengamma.strata.market.amount;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.market.amount.CashFlow.Meta;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CashFlowDiffblueTest {
  /**
   * Test {@link CashFlow#meta()}.
   *
   * <p>Method under test: {@link CashFlow#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CashFlow.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CashFlow.meta();

    // Assert
    assertTrue(actualMetaResult.discountFactor() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.forecastValue() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.paymentDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.presentValue() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
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
    Class<? extends CashFlow> actualBeanTypeResult = CashFlow.meta().beanType();

    // Assert
    Class<CashFlow> expectedBeanTypeResult = CashFlow.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#discountFactor()}
   *   <li>{@link Meta#forecastValue()}
   *   <li>{@link Meta#paymentDate()}
   *   <li>{@link Meta#presentValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.discountFactor()",
    "MetaProperty Meta.forecastValue()",
    "MetaProperty Meta.paymentDate()",
    "MetaProperty Meta.presentValue()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CashFlow.meta();

    // Act
    MetaProperty<Double> actualDiscountFactorResult = metaResult.discountFactor();
    MetaProperty<CurrencyAmount> actualForecastValueResult = metaResult.forecastValue();
    MetaProperty<LocalDate> actualPaymentDateResult = metaResult.paymentDate();

    // Assert
    assertTrue(actualDiscountFactorResult instanceof DirectMetaProperty);
    assertTrue(actualForecastValueResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.presentValue() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code discountFactor}.
   *   <li>Then return name is {@code discountFactor}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'discountFactor'; then return name is 'discountFactor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDiscountFactor_thenReturnNameIsDiscountFactor() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CashFlow.meta().metaPropertyGet("discountFactor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurrencyAmount> forecastValueResult = ((Meta) metaBeanResult).forecastValue();
    assertTrue(forecastValueResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> paymentDateResult = ((Meta) metaBeanResult).paymentDate();
    assertTrue(paymentDateResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> presentValueResult = ((Meta) metaBeanResult).presentValue();
    assertTrue(presentValueResult instanceof DirectMetaProperty);
    assertEquals("discountFactor", actualMetaPropertyGetResult.name());
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).discountFactor());
    assertSame(metaBeanResult, forecastValueResult.metaBean());
    assertSame(metaBeanResult, paymentDateResult.metaBean());
    assertSame(metaBeanResult, presentValueResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code forecastValue}.
   *   <li>Then return name is {@code forecastValue}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'forecastValue'; then return name is 'forecastValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenForecastValue_thenReturnNameIsForecastValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CashFlow.meta().metaPropertyGet("forecastValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> discountFactorResult = ((Meta) metaBeanResult).discountFactor();
    assertTrue(discountFactorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> paymentDateResult = ((Meta) metaBeanResult).paymentDate();
    assertTrue(paymentDateResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> presentValueResult = ((Meta) metaBeanResult).presentValue();
    assertTrue(presentValueResult instanceof DirectMetaProperty);
    assertEquals("forecastValue", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).forecastValue());
    assertSame(metaBeanResult, discountFactorResult.metaBean());
    assertSame(metaBeanResult, paymentDateResult.metaBean());
    assertSame(metaBeanResult, presentValueResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code paymentDate}.
   *   <li>Then return name is {@code paymentDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'paymentDate'; then return name is 'paymentDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPaymentDate_thenReturnNameIsPaymentDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CashFlow.meta().metaPropertyGet("paymentDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> discountFactorResult = ((Meta) metaBeanResult).discountFactor();
    assertTrue(discountFactorResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> forecastValueResult = ((Meta) metaBeanResult).forecastValue();
    assertTrue(forecastValueResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> presentValueResult = ((Meta) metaBeanResult).presentValue();
    assertTrue(presentValueResult instanceof DirectMetaProperty);
    assertEquals("paymentDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentDate());
    assertSame(metaBeanResult, discountFactorResult.metaBean());
    assertSame(metaBeanResult, forecastValueResult.metaBean());
    assertSame(metaBeanResult, presentValueResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code presentValue}.
   *   <li>Then return name is {@code presentValue}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'presentValue'; then return name is 'presentValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPresentValue_thenReturnNameIsPresentValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CashFlow.meta().metaPropertyGet("presentValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> discountFactorResult = ((Meta) metaBeanResult).discountFactor();
    assertTrue(discountFactorResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> forecastValueResult = ((Meta) metaBeanResult).forecastValue();
    assertTrue(forecastValueResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> paymentDateResult = ((Meta) metaBeanResult).paymentDate();
    assertTrue(paymentDateResult instanceof DirectMetaProperty);
    assertEquals("presentValue", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).presentValue());
    assertSame(metaBeanResult, discountFactorResult.metaBean());
    assertSame(metaBeanResult, forecastValueResult.metaBean());
    assertSame(metaBeanResult, paymentDateResult.metaBean());
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
    assertNull(CashFlow.meta().metaPropertyGet("Property Name"));
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = CashFlow.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("discountFactor") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("forecastValue") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("presentValue") instanceof DirectMetaProperty);
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
    assertNull(CashFlow.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> CashFlow.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code discountFactor}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'discountFactor'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDiscountFactor_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CashFlow.meta().propertySet(mock(Bean.class), "discountFactor", "New Value", true));
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
        () -> CashFlow.meta().propertySet(mock(Bean.class), "discountFactor", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code forecastValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'forecastValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenForecastValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CashFlow.meta().propertySet(mock(Bean.class), "forecastValue", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code paymentDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'paymentDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPaymentDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CashFlow.meta().propertySet(mock(Bean.class), "paymentDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code presentValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'presentValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPresentValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CashFlow.meta().propertySet(mock(Bean.class), "presentValue", "New Value", true));
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
        () -> CashFlow.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
