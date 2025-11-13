package com.opengamma.strata.product.fx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Payment;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.product.fx.FxSingle.Meta;
import java.time.LocalDate;
import org.joda.beans.BeanBuilder;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.BufferingBeanBuilder;
import org.joda.beans.impl.StandaloneMetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxSingleDeserializerDiffblueTest {
  /**
   * Test {@link FxSingleDeserializer#createBuilder(Class, MetaBean)}.
   *
   * <ul>
   *   <li>When {@link FxNdf.Meta#INSTANCE}.
   *   <li>Then return {@link BufferingBeanBuilder}.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleDeserializer#createBuilder(Class, MetaBean)}
   */
  @Test
  @DisplayName(
      "Test createBuilder(Class, MetaBean); when INSTANCE; then return BufferingBeanBuilder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BeanBuilder FxSingleDeserializer.createBuilder(Class, MetaBean)"})
  void testCreateBuilder_whenInstance_thenReturnBufferingBeanBuilder() {
    // Arrange
    FxSingleDeserializer fxSingleDeserializer = new FxSingleDeserializer();
    Class<Object> beanType = Object.class;

    // Act
    BeanBuilder<?> actualCreateBuilderResult =
        fxSingleDeserializer.createBuilder(beanType, FxNdf.Meta.INSTANCE);

    // Assert
    assertTrue(actualCreateBuilderResult instanceof BufferingBeanBuilder);
    assertTrue(((BufferingBeanBuilder) actualCreateBuilderResult).getBuffer().isEmpty());
    assertSame(
        FxNdf.Meta.INSTANCE, ((BufferingBeanBuilder) actualCreateBuilderResult).getMetaBean());
  }

  /**
   * Test {@link FxSingleDeserializer#findMetaProperty(Class, MetaBean, String)}.
   *
   * <ul>
   *   <li>Then return name is {@code counterCurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleDeserializer#findMetaProperty(Class, MetaBean, String)}
   */
  @Test
  @DisplayName(
      "Test findMetaProperty(Class, MetaBean, String); then return name is 'counterCurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty FxSingleDeserializer.findMetaProperty(Class, MetaBean, String)"})
  void testFindMetaProperty_thenReturnNameIsCounterCurrencyAmount() {
    // Arrange
    FxSingleDeserializer fxSingleDeserializer = new FxSingleDeserializer();
    Class<Object> beanType = Object.class;

    // Act
    MetaProperty<?> actualFindMetaPropertyResult =
        fxSingleDeserializer.findMetaProperty(
            beanType, FxNdf.Meta.INSTANCE, "counterCurrencyAmount");

    // Assert
    MetaBean metaBeanResult = actualFindMetaPropertyResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualFindMetaPropertyResult instanceof StandaloneMetaProperty);
    MetaProperty<Payment> baseCurrencyPaymentResult = ((Meta) metaBeanResult).baseCurrencyPayment();
    assertTrue(baseCurrencyPaymentResult instanceof DirectMetaProperty);
    MetaProperty<Payment> counterCurrencyPaymentResult =
        ((Meta) metaBeanResult).counterCurrencyPayment();
    assertTrue(counterCurrencyPaymentResult instanceof DirectMetaProperty);
    MetaProperty<BusinessDayAdjustment> paymentDateAdjustmentResult =
        ((Meta) metaBeanResult).paymentDateAdjustment();
    assertTrue(paymentDateAdjustmentResult instanceof DirectMetaProperty);
    assertEquals("counterCurrencyAmount", actualFindMetaPropertyResult.name());
    assertSame(metaBeanResult, baseCurrencyPaymentResult.metaBean());
    assertSame(metaBeanResult, counterCurrencyPaymentResult.metaBean());
    assertSame(metaBeanResult, paymentDateAdjustmentResult.metaBean());
  }

  /**
   * Test {@link FxSingleDeserializer#findMetaProperty(Class, MetaBean, String)}.
   *
   * <ul>
   *   <li>When {@code baseCurrencyAmount}.
   *   <li>Then return name is {@code baseCurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleDeserializer#findMetaProperty(Class, MetaBean, String)}
   */
  @Test
  @DisplayName(
      "Test findMetaProperty(Class, MetaBean, String); when 'baseCurrencyAmount'; then return name is 'baseCurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty FxSingleDeserializer.findMetaProperty(Class, MetaBean, String)"})
  void testFindMetaProperty_whenBaseCurrencyAmount_thenReturnNameIsBaseCurrencyAmount() {
    // Arrange
    FxSingleDeserializer fxSingleDeserializer = new FxSingleDeserializer();
    Class<Object> beanType = Object.class;

    // Act
    MetaProperty<?> actualFindMetaPropertyResult =
        fxSingleDeserializer.findMetaProperty(beanType, FxNdf.Meta.INSTANCE, "baseCurrencyAmount");

    // Assert
    MetaBean metaBeanResult = actualFindMetaPropertyResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualFindMetaPropertyResult instanceof StandaloneMetaProperty);
    MetaProperty<Payment> baseCurrencyPaymentResult = ((Meta) metaBeanResult).baseCurrencyPayment();
    assertTrue(baseCurrencyPaymentResult instanceof DirectMetaProperty);
    MetaProperty<Payment> counterCurrencyPaymentResult =
        ((Meta) metaBeanResult).counterCurrencyPayment();
    assertTrue(counterCurrencyPaymentResult instanceof DirectMetaProperty);
    MetaProperty<BusinessDayAdjustment> paymentDateAdjustmentResult =
        ((Meta) metaBeanResult).paymentDateAdjustment();
    assertTrue(paymentDateAdjustmentResult instanceof DirectMetaProperty);
    assertEquals("baseCurrencyAmount", actualFindMetaPropertyResult.name());
    assertSame(metaBeanResult, baseCurrencyPaymentResult.metaBean());
    assertSame(metaBeanResult, counterCurrencyPaymentResult.metaBean());
    assertSame(metaBeanResult, paymentDateAdjustmentResult.metaBean());
  }

  /**
   * Test {@link FxSingleDeserializer#findMetaProperty(Class, MetaBean, String)}.
   *
   * <ul>
   *   <li>When {@link FxNdfTrade.Meta#INSTANCE}.
   *   <li>Then return name is {@code paymentDate}.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleDeserializer#findMetaProperty(Class, MetaBean, String)}
   */
  @Test
  @DisplayName(
      "Test findMetaProperty(Class, MetaBean, String); when INSTANCE; then return name is 'paymentDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty FxSingleDeserializer.findMetaProperty(Class, MetaBean, String)"})
  void testFindMetaProperty_whenInstance_thenReturnNameIsPaymentDate() {
    // Arrange
    FxSingleDeserializer fxSingleDeserializer = new FxSingleDeserializer();
    Class<Object> beanType = Object.class;

    // Act
    MetaProperty<?> actualFindMetaPropertyResult =
        fxSingleDeserializer.findMetaProperty(beanType, FxNdfTrade.Meta.INSTANCE, "paymentDate");

    // Assert
    MetaBean metaBeanResult = actualFindMetaPropertyResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualFindMetaPropertyResult instanceof StandaloneMetaProperty);
    MetaProperty<Payment> baseCurrencyPaymentResult = ((Meta) metaBeanResult).baseCurrencyPayment();
    assertTrue(baseCurrencyPaymentResult instanceof DirectMetaProperty);
    MetaProperty<Payment> counterCurrencyPaymentResult =
        ((Meta) metaBeanResult).counterCurrencyPayment();
    assertTrue(counterCurrencyPaymentResult instanceof DirectMetaProperty);
    MetaProperty<BusinessDayAdjustment> paymentDateAdjustmentResult =
        ((Meta) metaBeanResult).paymentDateAdjustment();
    assertTrue(paymentDateAdjustmentResult instanceof DirectMetaProperty);
    assertEquals("paymentDate", actualFindMetaPropertyResult.name());
    assertSame(metaBeanResult, baseCurrencyPaymentResult.metaBean());
    assertSame(metaBeanResult, counterCurrencyPaymentResult.metaBean());
    assertSame(metaBeanResult, paymentDateAdjustmentResult.metaBean());
  }

  /**
   * Test {@link FxSingleDeserializer#findMetaProperty(Class, MetaBean, String)}.
   *
   * <ul>
   *   <li>When {@code paymentDate}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleDeserializer#findMetaProperty(Class, MetaBean, String)}
   */
  @Test
  @DisplayName(
      "Test findMetaProperty(Class, MetaBean, String); when 'paymentDate'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty FxSingleDeserializer.findMetaProperty(Class, MetaBean, String)"})
  void testFindMetaProperty_whenPaymentDate_thenReturnDirectMetaProperty() {
    // Arrange
    FxSingleDeserializer fxSingleDeserializer = new FxSingleDeserializer();
    Class<Object> beanType = Object.class;

    // Act
    MetaProperty<?> actualFindMetaPropertyResult =
        fxSingleDeserializer.findMetaProperty(beanType, FxNdf.Meta.INSTANCE, "paymentDate");

    // Assert
    assertTrue(actualFindMetaPropertyResult instanceof DirectMetaProperty);
    assertEquals(PropertyStyle.IMMUTABLE, actualFindMetaPropertyResult.style());
    Class<FxNdf> expectedDeclaringTypeResult = FxNdf.class;
    assertEquals(expectedDeclaringTypeResult, actualFindMetaPropertyResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualFindMetaPropertyResult.propertyType());
    assertSame(FxNdf.Meta.INSTANCE, actualFindMetaPropertyResult.metaBean());
  }
}
