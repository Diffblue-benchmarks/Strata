package com.opengamma.strata.product.fx;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Payment;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.product.fx.FxSingle.Meta;
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

class FxSingleDiffblueTest {
  /**
   * Test {@link FxSingle#meta()}.
   *
   * <p>Method under test: {@link FxSingle#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxSingle.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FxSingle.meta();

    // Assert
    MetaProperty<Payment> baseCurrencyPaymentResult = actualMetaResult.baseCurrencyPayment();
    assertTrue(baseCurrencyPaymentResult instanceof DirectMetaProperty);
    MetaProperty<Payment> counterCurrencyPaymentResult = actualMetaResult.counterCurrencyPayment();
    assertTrue(counterCurrencyPaymentResult instanceof DirectMetaProperty);
    MetaProperty<BusinessDayAdjustment> paymentDateAdjustmentResult =
        actualMetaResult.paymentDateAdjustment();
    assertTrue(paymentDateAdjustmentResult instanceof DirectMetaProperty);
    assertEquals("baseCurrencyPayment", baseCurrencyPaymentResult.name());
    assertEquals("counterCurrencyPayment", counterCurrencyPaymentResult.name());
    assertEquals("paymentDateAdjustment", paymentDateAdjustmentResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, baseCurrencyPaymentResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, counterCurrencyPaymentResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, paymentDateAdjustmentResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Payment> expectedPropertyTypeResult = Payment.class;
    assertEquals(expectedPropertyTypeResult, baseCurrencyPaymentResult.propertyType());
    Class<Payment> expectedPropertyTypeResult2 = Payment.class;
    assertEquals(expectedPropertyTypeResult2, counterCurrencyPaymentResult.propertyType());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult3 = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult3, paymentDateAdjustmentResult.propertyType());
    Class<FxSingle> expectedDeclaringTypeResult = FxSingle.class;
    assertEquals(expectedDeclaringTypeResult, baseCurrencyPaymentResult.declaringType());
    Class<FxSingle> expectedDeclaringTypeResult2 = FxSingle.class;
    assertEquals(expectedDeclaringTypeResult2, counterCurrencyPaymentResult.declaringType());
    Class<FxSingle> expectedDeclaringTypeResult3 = FxSingle.class;
    assertEquals(expectedDeclaringTypeResult3, paymentDateAdjustmentResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, baseCurrencyPaymentResult.metaBean());
    assertSame(meta, counterCurrencyPaymentResult.metaBean());
    assertSame(meta, paymentDateAdjustmentResult.metaBean());
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
    Class<? extends FxSingle> actualBeanTypeResult = FxSingle.meta().beanType();

    // Assert
    Class<FxSingle> expectedBeanTypeResult = FxSingle.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#baseCurrencyPayment()}
   *   <li>{@link Meta#counterCurrencyPayment()}
   *   <li>{@link Meta#paymentDateAdjustment()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.baseCurrencyPayment()",
    "MetaProperty Meta.counterCurrencyPayment()",
    "MetaProperty Meta.paymentDateAdjustment()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FxSingle.meta();

    // Act
    MetaProperty<Payment> actualBaseCurrencyPaymentResult = metaResult.baseCurrencyPayment();
    MetaProperty<Payment> actualCounterCurrencyPaymentResult = metaResult.counterCurrencyPayment();

    // Assert
    assertTrue(actualBaseCurrencyPaymentResult instanceof DirectMetaProperty);
    assertTrue(actualCounterCurrencyPaymentResult instanceof DirectMetaProperty);
    assertTrue(metaResult.paymentDateAdjustment() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code baseCurrencyPayment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'baseCurrencyPayment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsBaseCurrencyPayment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxSingle.meta().metaPropertyGet("baseCurrencyPayment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Payment> counterCurrencyPaymentResult =
        ((Meta) metaBeanResult).counterCurrencyPayment();
    assertTrue(counterCurrencyPaymentResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<BusinessDayAdjustment> paymentDateAdjustmentResult =
        ((Meta) metaBeanResult).paymentDateAdjustment();
    assertTrue(paymentDateAdjustmentResult instanceof DirectMetaProperty);
    assertEquals("baseCurrencyPayment", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).baseCurrencyPayment());
    assertSame(metaBeanResult, counterCurrencyPaymentResult.metaBean());
    assertSame(metaBeanResult, paymentDateAdjustmentResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code counterCurrencyPayment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'counterCurrencyPayment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsCounterCurrencyPayment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxSingle.meta().metaPropertyGet("counterCurrencyPayment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Payment> baseCurrencyPaymentResult = ((Meta) metaBeanResult).baseCurrencyPayment();
    assertTrue(baseCurrencyPaymentResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<BusinessDayAdjustment> paymentDateAdjustmentResult =
        ((Meta) metaBeanResult).paymentDateAdjustment();
    assertTrue(paymentDateAdjustmentResult instanceof DirectMetaProperty);
    assertEquals("counterCurrencyPayment", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).counterCurrencyPayment());
    assertSame(metaBeanResult, baseCurrencyPaymentResult.metaBean());
    assertSame(metaBeanResult, paymentDateAdjustmentResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code paymentDateAdjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'paymentDateAdjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsPaymentDateAdjustment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxSingle.meta().metaPropertyGet("paymentDateAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Payment> baseCurrencyPaymentResult = ((Meta) metaBeanResult).baseCurrencyPayment();
    assertTrue(baseCurrencyPaymentResult instanceof DirectMetaProperty);
    MetaProperty<Payment> counterCurrencyPaymentResult =
        ((Meta) metaBeanResult).counterCurrencyPayment();
    assertTrue(counterCurrencyPaymentResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("paymentDateAdjustment", actualMetaPropertyGetResult.name());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentDateAdjustment());
    assertSame(metaBeanResult, baseCurrencyPaymentResult.metaBean());
    assertSame(metaBeanResult, counterCurrencyPaymentResult.metaBean());
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
    assertNull(FxSingle.meta().metaPropertyGet("Property Name"));
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = FxSingle.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("baseCurrencyPayment");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("counterCurrencyPayment");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("paymentDateAdjustment");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("baseCurrencyPayment", getResult.name());
    assertEquals("counterCurrencyPayment", getResult2.name());
    assertEquals("paymentDateAdjustment", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<Payment> expectedPropertyTypeResult = Payment.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<Payment> expectedPropertyTypeResult2 = Payment.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult3 = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
    Class<FxSingle> expectedDeclaringTypeResult = FxSingle.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<FxSingle> expectedDeclaringTypeResult2 = FxSingle.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<FxSingle> expectedDeclaringTypeResult3 = FxSingle.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
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
    assertNull(FxSingle.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> FxSingle.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code baseCurrencyPayment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'baseCurrencyPayment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBaseCurrencyPayment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxSingle.meta()
                .propertySet(mock(Bean.class), "baseCurrencyPayment", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code counterCurrencyPayment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'counterCurrencyPayment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCounterCurrencyPayment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxSingle.meta()
                .propertySet(mock(Bean.class), "counterCurrencyPayment", "New Value", true));
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
            FxSingle.meta()
                .propertySet(mock(Bean.class), "baseCurrencyPayment", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code paymentDateAdjustment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'paymentDateAdjustment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPaymentDateAdjustment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxSingle.meta()
                .propertySet(mock(Bean.class), "paymentDateAdjustment", "New Value", true));
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
        () -> FxSingle.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
