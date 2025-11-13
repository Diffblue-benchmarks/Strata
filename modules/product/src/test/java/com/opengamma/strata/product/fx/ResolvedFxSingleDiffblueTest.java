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
import com.opengamma.strata.product.fx.ResolvedFxSingle.Meta;
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

class ResolvedFxSingleDiffblueTest {
  /**
   * Test {@link ResolvedFxSingle#meta()}.
   *
   * <p>Method under test: {@link ResolvedFxSingle#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ResolvedFxSingle.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ResolvedFxSingle.meta();

    // Assert
    MetaProperty<Payment> baseCurrencyPaymentResult = actualMetaResult.baseCurrencyPayment();
    assertTrue(baseCurrencyPaymentResult instanceof DirectMetaProperty);
    MetaProperty<Payment> counterCurrencyPaymentResult = actualMetaResult.counterCurrencyPayment();
    assertTrue(counterCurrencyPaymentResult instanceof DirectMetaProperty);
    assertEquals("baseCurrencyPayment", baseCurrencyPaymentResult.name());
    assertEquals("counterCurrencyPayment", counterCurrencyPaymentResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, baseCurrencyPaymentResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, counterCurrencyPaymentResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Payment> expectedPropertyTypeResult = Payment.class;
    assertEquals(expectedPropertyTypeResult, baseCurrencyPaymentResult.propertyType());
    Class<Payment> expectedPropertyTypeResult2 = Payment.class;
    assertEquals(expectedPropertyTypeResult2, counterCurrencyPaymentResult.propertyType());
    Class<ResolvedFxSingle> expectedDeclaringTypeResult = ResolvedFxSingle.class;
    assertEquals(expectedDeclaringTypeResult, baseCurrencyPaymentResult.declaringType());
    Class<ResolvedFxSingle> expectedDeclaringTypeResult2 = ResolvedFxSingle.class;
    assertEquals(expectedDeclaringTypeResult2, counterCurrencyPaymentResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, baseCurrencyPaymentResult.metaBean());
    assertSame(meta, counterCurrencyPaymentResult.metaBean());
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
    Class<? extends ResolvedFxSingle> actualBeanTypeResult = ResolvedFxSingle.meta().beanType();

    // Assert
    Class<ResolvedFxSingle> expectedBeanTypeResult = ResolvedFxSingle.class;
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
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.baseCurrencyPayment()",
    "MetaProperty Meta.counterCurrencyPayment()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ResolvedFxSingle.meta();

    // Act
    MetaProperty<Payment> actualBaseCurrencyPaymentResult = metaResult.baseCurrencyPayment();

    // Assert
    assertTrue(actualBaseCurrencyPaymentResult instanceof DirectMetaProperty);
    assertTrue(metaResult.counterCurrencyPayment() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedFxSingle.meta().metaPropertyGet("baseCurrencyPayment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Payment> counterCurrencyPaymentResult =
        ((Meta) metaBeanResult).counterCurrencyPayment();
    assertTrue(counterCurrencyPaymentResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("baseCurrencyPayment", actualMetaPropertyGetResult.name());
    assertEquals("counterCurrencyPayment", counterCurrencyPaymentResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, counterCurrencyPaymentResult.style());
    Class<Payment> expectedPropertyTypeResult = Payment.class;
    assertEquals(expectedPropertyTypeResult, counterCurrencyPaymentResult.propertyType());
    Class<ResolvedFxSingle> expectedDeclaringTypeResult = ResolvedFxSingle.class;
    assertEquals(expectedDeclaringTypeResult, counterCurrencyPaymentResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).baseCurrencyPayment());
    assertSame(Meta.INSTANCE, counterCurrencyPaymentResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean baseCurrencyPayment return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean baseCurrencyPayment return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanBaseCurrencyPaymentReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedFxSingle.meta().metaPropertyGet("counterCurrencyPayment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Payment> baseCurrencyPaymentResult = ((Meta) metaBeanResult).baseCurrencyPayment();
    assertTrue(baseCurrencyPaymentResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("baseCurrencyPayment", baseCurrencyPaymentResult.name());
    assertEquals("counterCurrencyPayment", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, baseCurrencyPaymentResult.style());
    Class<Payment> expectedPropertyTypeResult = Payment.class;
    assertEquals(expectedPropertyTypeResult, baseCurrencyPaymentResult.propertyType());
    Class<ResolvedFxSingle> expectedDeclaringTypeResult = ResolvedFxSingle.class;
    assertEquals(expectedDeclaringTypeResult, baseCurrencyPaymentResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).counterCurrencyPayment());
    assertSame(Meta.INSTANCE, baseCurrencyPaymentResult.metaBean());
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
    assertNull(ResolvedFxSingle.meta().metaPropertyGet("Property Name"));
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
        ResolvedFxSingle.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("baseCurrencyPayment");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("counterCurrencyPayment");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("baseCurrencyPayment", getResult.name());
    assertEquals("counterCurrencyPayment", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<Payment> expectedPropertyTypeResult = Payment.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<Payment> expectedPropertyTypeResult2 = Payment.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<ResolvedFxSingle> expectedDeclaringTypeResult = ResolvedFxSingle.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ResolvedFxSingle> expectedDeclaringTypeResult2 = ResolvedFxSingle.class;
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
    assertNull(ResolvedFxSingle.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            ResolvedFxSingle.meta()
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
            ResolvedFxSingle.meta()
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
            ResolvedFxSingle.meta()
                .propertySet(mock(Bean.class), "baseCurrencyPayment", "New Value", false));
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
            ResolvedFxSingle.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
