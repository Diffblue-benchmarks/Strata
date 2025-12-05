package com.opengamma.strata.pricer.fx;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.pricer.DiscountFactors;
import com.opengamma.strata.pricer.fx.DiscountFxForwardRates.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountFxForwardRatesDiffblueTest {
  /**
   * Test {@link DiscountFxForwardRates#meta()}.
   *
   * <p>Method under test: {@link DiscountFxForwardRates#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DiscountFxForwardRates.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DiscountFxForwardRates.meta();

    // Assert
    assertTrue(actualMetaResult.baseCurrencyDiscountFactors() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.counterCurrencyDiscountFactors() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.currencyPair() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.fxRateProvider() instanceof DirectMetaProperty);
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
    Class<? extends DiscountFxForwardRates> actualBeanTypeResult =
        DiscountFxForwardRates.meta().beanType();

    // Assert
    Class<DiscountFxForwardRates> expectedBeanTypeResult = DiscountFxForwardRates.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#baseCurrencyDiscountFactors()}
   *   <li>{@link Meta#counterCurrencyDiscountFactors()}
   *   <li>{@link Meta#currencyPair()}
   *   <li>{@link Meta#fxRateProvider()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.baseCurrencyDiscountFactors()",
    "MetaProperty Meta.counterCurrencyDiscountFactors()",
    "MetaProperty Meta.currencyPair()",
    "MetaProperty Meta.fxRateProvider()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = DiscountFxForwardRates.meta();

    // Act
    MetaProperty<DiscountFactors> actualBaseCurrencyDiscountFactorsResult =
        metaResult.baseCurrencyDiscountFactors();
    MetaProperty<DiscountFactors> actualCounterCurrencyDiscountFactorsResult =
        metaResult.counterCurrencyDiscountFactors();
    MetaProperty<CurrencyPair> actualCurrencyPairResult = metaResult.currencyPair();

    // Assert
    assertTrue(actualBaseCurrencyDiscountFactorsResult instanceof DirectMetaProperty);
    assertTrue(actualCounterCurrencyDiscountFactorsResult instanceof DirectMetaProperty);
    assertTrue(actualCurrencyPairResult instanceof DirectMetaProperty);
    assertTrue(metaResult.fxRateProvider() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code baseCurrencyDiscountFactors}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then return name is 'baseCurrencyDiscountFactors'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsBaseCurrencyDiscountFactors() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DiscountFxForwardRates.meta().metaPropertyGet("baseCurrencyDiscountFactors");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DiscountFactors> counterCurrencyDiscountFactorsResult =
        ((Meta) metaBeanResult).counterCurrencyDiscountFactors();
    assertTrue(counterCurrencyDiscountFactorsResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyPair> currencyPairResult = ((Meta) metaBeanResult).currencyPair();
    assertTrue(currencyPairResult instanceof DirectMetaProperty);
    MetaProperty<FxRateProvider> fxRateProviderResult = ((Meta) metaBeanResult).fxRateProvider();
    assertTrue(fxRateProviderResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("baseCurrencyDiscountFactors", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).baseCurrencyDiscountFactors());
    assertSame(metaBeanResult, counterCurrencyDiscountFactorsResult.metaBean());
    assertSame(metaBeanResult, currencyPairResult.metaBean());
    assertSame(metaBeanResult, fxRateProviderResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code counterCurrencyDiscountFactors}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then return name is 'counterCurrencyDiscountFactors'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsCounterCurrencyDiscountFactors() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DiscountFxForwardRates.meta().metaPropertyGet("counterCurrencyDiscountFactors");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DiscountFactors> baseCurrencyDiscountFactorsResult =
        ((Meta) metaBeanResult).baseCurrencyDiscountFactors();
    assertTrue(baseCurrencyDiscountFactorsResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyPair> currencyPairResult = ((Meta) metaBeanResult).currencyPair();
    assertTrue(currencyPairResult instanceof DirectMetaProperty);
    MetaProperty<FxRateProvider> fxRateProviderResult = ((Meta) metaBeanResult).fxRateProvider();
    assertTrue(fxRateProviderResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("counterCurrencyDiscountFactors", actualMetaPropertyGetResult.name());
    assertSame(
        actualMetaPropertyGetResult, ((Meta) metaBeanResult).counterCurrencyDiscountFactors());
    assertSame(metaBeanResult, baseCurrencyDiscountFactorsResult.metaBean());
    assertSame(metaBeanResult, currencyPairResult.metaBean());
    assertSame(metaBeanResult, fxRateProviderResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currencyPair}.
   *   <li>Then return name is {@code currencyPair}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'currencyPair'; then return name is 'currencyPair'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrencyPair_thenReturnNameIsCurrencyPair() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DiscountFxForwardRates.meta().metaPropertyGet("currencyPair");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DiscountFactors> baseCurrencyDiscountFactorsResult =
        ((Meta) metaBeanResult).baseCurrencyDiscountFactors();
    assertTrue(baseCurrencyDiscountFactorsResult instanceof DirectMetaProperty);
    MetaProperty<DiscountFactors> counterCurrencyDiscountFactorsResult =
        ((Meta) metaBeanResult).counterCurrencyDiscountFactors();
    assertTrue(counterCurrencyDiscountFactorsResult instanceof DirectMetaProperty);
    MetaProperty<FxRateProvider> fxRateProviderResult = ((Meta) metaBeanResult).fxRateProvider();
    assertTrue(fxRateProviderResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("currencyPair", actualMetaPropertyGetResult.name());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currencyPair());
    assertSame(metaBeanResult, baseCurrencyDiscountFactorsResult.metaBean());
    assertSame(metaBeanResult, counterCurrencyDiscountFactorsResult.metaBean());
    assertSame(metaBeanResult, fxRateProviderResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fxRateProvider}.
   *   <li>Then return name is {@code fxRateProvider}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fxRateProvider'; then return name is 'fxRateProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFxRateProvider_thenReturnNameIsFxRateProvider() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DiscountFxForwardRates.meta().metaPropertyGet("fxRateProvider");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DiscountFactors> baseCurrencyDiscountFactorsResult =
        ((Meta) metaBeanResult).baseCurrencyDiscountFactors();
    assertTrue(baseCurrencyDiscountFactorsResult instanceof DirectMetaProperty);
    MetaProperty<DiscountFactors> counterCurrencyDiscountFactorsResult =
        ((Meta) metaBeanResult).counterCurrencyDiscountFactors();
    assertTrue(counterCurrencyDiscountFactorsResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyPair> currencyPairResult = ((Meta) metaBeanResult).currencyPair();
    assertTrue(currencyPairResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fxRateProvider", actualMetaPropertyGetResult.name());
    Class<FxRateProvider> expectedPropertyTypeResult = FxRateProvider.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fxRateProvider());
    assertSame(metaBeanResult, baseCurrencyDiscountFactorsResult.metaBean());
    assertSame(metaBeanResult, counterCurrencyDiscountFactorsResult.metaBean());
    assertSame(metaBeanResult, currencyPairResult.metaBean());
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
    assertNull(DiscountFxForwardRates.meta().metaPropertyGet("Property Name"));
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
        DiscountFxForwardRates.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(
        actualMetaPropertyMapResult.get("baseCurrencyDiscountFactors")
            instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("counterCurrencyDiscountFactors")
            instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("currencyPair") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fxRateProvider") instanceof DirectMetaProperty);
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
    assertNull(DiscountFxForwardRates.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> DiscountFxForwardRates.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code baseCurrencyDiscountFactors}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'baseCurrencyDiscountFactors'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBaseCurrencyDiscountFactors_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DiscountFxForwardRates.meta()
                .propertySet(mock(Bean.class), "baseCurrencyDiscountFactors", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code counterCurrencyDiscountFactors}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'counterCurrencyDiscountFactors'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCounterCurrencyDiscountFactors_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DiscountFxForwardRates.meta()
                .propertySet(
                    mock(Bean.class), "counterCurrencyDiscountFactors", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currencyPair}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currencyPair'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrencyPair_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DiscountFxForwardRates.meta()
                .propertySet(mock(Bean.class), "currencyPair", "New Value", true));
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
            DiscountFxForwardRates.meta()
                .propertySet(mock(Bean.class), "baseCurrencyDiscountFactors", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fxRateProvider}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fxRateProvider'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFxRateProvider_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DiscountFxForwardRates.meta()
                .propertySet(mock(Bean.class), "fxRateProvider", "New Value", true));
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
            DiscountFxForwardRates.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
