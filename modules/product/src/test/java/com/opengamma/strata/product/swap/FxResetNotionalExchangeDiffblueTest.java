package com.opengamma.strata.product.swap;

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
import com.opengamma.strata.basics.index.FxIndexObservation;
import com.opengamma.strata.product.swap.FxResetNotionalExchange.Meta;
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

class FxResetNotionalExchangeDiffblueTest {
  /**
   * Test {@link FxResetNotionalExchange#meta()}.
   *
   * <p>Method under test: {@link FxResetNotionalExchange#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxResetNotionalExchange.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FxResetNotionalExchange.meta();

    // Assert
    MetaProperty<CurrencyAmount> notionalAmountResult = actualMetaResult.notionalAmount();
    assertTrue(notionalAmountResult instanceof DirectMetaProperty);
    MetaProperty<FxIndexObservation> observationResult = actualMetaResult.observation();
    assertTrue(observationResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> paymentDateResult = actualMetaResult.paymentDate();
    assertTrue(paymentDateResult instanceof DirectMetaProperty);
    assertEquals("notionalAmount", notionalAmountResult.name());
    assertEquals("observation", observationResult.name());
    assertEquals("paymentDate", paymentDateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, notionalAmountResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, observationResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, paymentDateResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, notionalAmountResult.propertyType());
    Class<FxIndexObservation> expectedPropertyTypeResult2 = FxIndexObservation.class;
    assertEquals(expectedPropertyTypeResult2, observationResult.propertyType());
    Class<FxResetNotionalExchange> expectedDeclaringTypeResult = FxResetNotionalExchange.class;
    assertEquals(expectedDeclaringTypeResult, notionalAmountResult.declaringType());
    Class<FxResetNotionalExchange> expectedDeclaringTypeResult2 = FxResetNotionalExchange.class;
    assertEquals(expectedDeclaringTypeResult2, observationResult.declaringType());
    Class<FxResetNotionalExchange> expectedDeclaringTypeResult3 = FxResetNotionalExchange.class;
    assertEquals(expectedDeclaringTypeResult3, paymentDateResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, paymentDateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, notionalAmountResult.metaBean());
    assertSame(meta, observationResult.metaBean());
    assertSame(meta, paymentDateResult.metaBean());
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
    Class<? extends FxResetNotionalExchange> actualBeanTypeResult =
        FxResetNotionalExchange.meta().beanType();

    // Assert
    Class<FxResetNotionalExchange> expectedBeanTypeResult = FxResetNotionalExchange.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#notionalAmount()}
   *   <li>{@link Meta#observation()}
   *   <li>{@link Meta#paymentDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.notionalAmount()",
    "MetaProperty Meta.observation()",
    "MetaProperty Meta.paymentDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FxResetNotionalExchange.meta();

    // Act
    MetaProperty<CurrencyAmount> actualNotionalAmountResult = metaResult.notionalAmount();
    MetaProperty<FxIndexObservation> actualObservationResult = metaResult.observation();

    // Assert
    assertTrue(actualNotionalAmountResult instanceof DirectMetaProperty);
    assertTrue(actualObservationResult instanceof DirectMetaProperty);
    assertTrue(metaResult.paymentDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code notionalAmount}.
   *   <li>Then return name is {@code notionalAmount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'notionalAmount'; then return name is 'notionalAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenNotionalAmount_thenReturnNameIsNotionalAmount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxResetNotionalExchange.meta().metaPropertyGet("notionalAmount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<FxIndexObservation> observationResult = ((Meta) metaBeanResult).observation();
    assertTrue(observationResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> paymentDateResult = ((Meta) metaBeanResult).paymentDate();
    assertTrue(paymentDateResult instanceof DirectMetaProperty);
    assertEquals("notionalAmount", actualMetaPropertyGetResult.name());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).notionalAmount());
    assertSame(metaBeanResult, observationResult.metaBean());
    assertSame(metaBeanResult, paymentDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code observation}.
   *   <li>Then return name is {@code observation}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'observation'; then return name is 'observation'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenObservation_thenReturnNameIsObservation() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxResetNotionalExchange.meta().metaPropertyGet("observation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> notionalAmountResult = ((Meta) metaBeanResult).notionalAmount();
    assertTrue(notionalAmountResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> paymentDateResult = ((Meta) metaBeanResult).paymentDate();
    assertTrue(paymentDateResult instanceof DirectMetaProperty);
    assertEquals("observation", actualMetaPropertyGetResult.name());
    Class<FxIndexObservation> expectedPropertyTypeResult = FxIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).observation());
    assertSame(metaBeanResult, notionalAmountResult.metaBean());
    assertSame(metaBeanResult, paymentDateResult.metaBean());
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
    MetaProperty<?> actualMetaPropertyGetResult =
        FxResetNotionalExchange.meta().metaPropertyGet("paymentDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> notionalAmountResult = ((Meta) metaBeanResult).notionalAmount();
    assertTrue(notionalAmountResult instanceof DirectMetaProperty);
    MetaProperty<FxIndexObservation> observationResult = ((Meta) metaBeanResult).observation();
    assertTrue(observationResult instanceof DirectMetaProperty);
    assertEquals("paymentDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentDate());
    assertSame(metaBeanResult, notionalAmountResult.metaBean());
    assertSame(metaBeanResult, observationResult.metaBean());
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
    assertNull(FxResetNotionalExchange.meta().metaPropertyGet("Property Name"));
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
        FxResetNotionalExchange.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("notionalAmount");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("observation");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("paymentDate");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("notionalAmount", getResult.name());
    assertEquals("observation", getResult2.name());
    assertEquals("paymentDate", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<FxIndexObservation> expectedPropertyTypeResult2 = FxIndexObservation.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<FxResetNotionalExchange> expectedDeclaringTypeResult = FxResetNotionalExchange.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<FxResetNotionalExchange> expectedDeclaringTypeResult2 = FxResetNotionalExchange.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<FxResetNotionalExchange> expectedDeclaringTypeResult3 = FxResetNotionalExchange.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
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
    assertNull(FxResetNotionalExchange.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> FxResetNotionalExchange.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
            FxResetNotionalExchange.meta()
                .propertySet(mock(Bean.class), "notionalAmount", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code notionalAmount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'notionalAmount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenNotionalAmount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxResetNotionalExchange.meta()
                .propertySet(mock(Bean.class), "notionalAmount", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code observation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'observation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenObservation_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxResetNotionalExchange.meta()
                .propertySet(mock(Bean.class), "observation", "New Value", true));
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
        () ->
            FxResetNotionalExchange.meta()
                .propertySet(mock(Bean.class), "paymentDate", "New Value", true));
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
            FxResetNotionalExchange.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
