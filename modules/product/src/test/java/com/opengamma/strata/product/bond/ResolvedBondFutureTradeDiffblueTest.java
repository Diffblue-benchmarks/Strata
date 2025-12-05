package com.opengamma.strata.product.bond;

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
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.product.PortfolioItemInfo;
import com.opengamma.strata.product.PositionInfo;
import com.opengamma.strata.product.TradeInfo;
import com.opengamma.strata.product.TradedPrice;
import com.opengamma.strata.product.bond.ResolvedBondFutureTrade.Builder;
import com.opengamma.strata.product.bond.ResolvedBondFutureTrade.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ResolvedBondFutureTradeDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then return {@link TradeInfo}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'info'; then return TradeInfo")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenInfo_thenReturnTradeInfo() {
    // Arrange and Act
    Object actualGetResult = ResolvedBondFutureTrade.builder().get("info");

    // Assert
    assertTrue(actualGetResult instanceof TradeInfo);
    Optional<StandardId> counterparty = ((TradeInfo) actualGetResult).getCounterparty();
    assertFalse(counterparty.isPresent());
    assertTrue(((TradeInfo) actualGetResult).getAttributes().isEmpty());
    assertTrue(((TradeInfo) actualGetResult).getAttributeTypes().isEmpty());
    assertSame(counterparty, ((TradeInfo) actualGetResult).getId());
    assertSame(counterparty, ((TradeInfo) actualGetResult).getSettlementDate());
    assertSame(counterparty, ((TradeInfo) actualGetResult).getTradeDate());
    assertSame(counterparty, ((TradeInfo) actualGetResult).getTradeTime());
    assertSame(counterparty, ((TradeInfo) actualGetResult).getZone());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code product}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'product'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenProduct_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedBondFutureTrade.builder().get("product"));
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
    assertThrows(
        NoSuchElementException.class, () -> ResolvedBondFutureTrade.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#info(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#info(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test Builder info(PortfolioItemInfo); when empty; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.info(PortfolioItemInfo)"})
  void testBuilderInfo_whenEmpty_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedBondFutureTrade.builder();

    // Act
    Builder actualInfoResult = builderResult.info(PositionInfo.empty());

    // Assert
    assertSame(builderResult, actualInfoResult);
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
        NoSuchElementException.class,
        () -> ResolvedBondFutureTrade.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'info'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenInfo_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedBondFutureTrade.builder();

    // Act
    Builder actualSetResult = builderResult.set("info", PositionInfo.empty());

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
    Builder builderResult = ResolvedBondFutureTrade.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link ResolvedBondFutureTrade#meta()}.
   *
   * <p>Method under test: {@link ResolvedBondFutureTrade#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ResolvedBondFutureTrade.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ResolvedBondFutureTrade.meta();

    // Assert
    assertTrue(actualMetaResult.info() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.product() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.quantity() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.tradedPrice() instanceof DirectMetaProperty);
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
    Class<? extends ResolvedBondFutureTrade> actualBeanTypeResult =
        ResolvedBondFutureTrade.meta().beanType();

    // Assert
    Class<ResolvedBondFutureTrade> expectedBeanTypeResult = ResolvedBondFutureTrade.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#info()}
   *   <li>{@link Meta#product()}
   *   <li>{@link Meta#quantity()}
   *   <li>{@link Meta#tradedPrice()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.info()",
    "MetaProperty Meta.product()",
    "MetaProperty Meta.quantity()",
    "MetaProperty Meta.tradedPrice()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ResolvedBondFutureTrade.meta();

    // Act
    MetaProperty<PortfolioItemInfo> actualInfoResult = metaResult.info();
    MetaProperty<ResolvedBondFuture> actualProductResult = metaResult.product();
    MetaProperty<Double> actualQuantityResult = metaResult.quantity();

    // Assert
    assertTrue(actualInfoResult instanceof DirectMetaProperty);
    assertTrue(actualProductResult instanceof DirectMetaProperty);
    assertTrue(actualQuantityResult instanceof DirectMetaProperty);
    assertTrue(metaResult.tradedPrice() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then return name is {@code info}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'info'; then return name is 'info'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenInfo_thenReturnNameIsInfo() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedBondFutureTrade.meta().metaPropertyGet("info");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedBondFuture> productResult = ((Meta) metaBeanResult).product();
    assertTrue(productResult instanceof DirectMetaProperty);
    MetaProperty<Double> quantityResult = ((Meta) metaBeanResult).quantity();
    assertTrue(quantityResult instanceof DirectMetaProperty);
    MetaProperty<TradedPrice> tradedPriceResult = ((Meta) metaBeanResult).tradedPrice();
    assertTrue(tradedPriceResult instanceof DirectMetaProperty);
    assertEquals("info", actualMetaPropertyGetResult.name());
    Class<PortfolioItemInfo> expectedPropertyTypeResult = PortfolioItemInfo.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).info());
    assertSame(metaBeanResult, productResult.metaBean());
    assertSame(metaBeanResult, quantityResult.metaBean());
    assertSame(metaBeanResult, tradedPriceResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code product}.
   *   <li>Then return name is {@code product}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'product'; then return name is 'product'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenProduct_thenReturnNameIsProduct() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedBondFutureTrade.meta().metaPropertyGet("product");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PortfolioItemInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> quantityResult = ((Meta) metaBeanResult).quantity();
    assertTrue(quantityResult instanceof DirectMetaProperty);
    MetaProperty<TradedPrice> tradedPriceResult = ((Meta) metaBeanResult).tradedPrice();
    assertTrue(tradedPriceResult instanceof DirectMetaProperty);
    assertEquals("product", actualMetaPropertyGetResult.name());
    Class<ResolvedBondFuture> expectedPropertyTypeResult = ResolvedBondFuture.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).product());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, quantityResult.metaBean());
    assertSame(metaBeanResult, tradedPriceResult.metaBean());
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
    assertNull(ResolvedBondFutureTrade.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code quantity}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'quantity'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenQuantity_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedBondFutureTrade.meta().metaPropertyGet("quantity");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PortfolioItemInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedBondFuture> productResult = ((Meta) metaBeanResult).product();
    assertTrue(productResult instanceof DirectMetaProperty);
    MetaProperty<TradedPrice> tradedPriceResult = ((Meta) metaBeanResult).tradedPrice();
    assertTrue(tradedPriceResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("quantity", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).quantity());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, productResult.metaBean());
    assertSame(metaBeanResult, tradedPriceResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code tradedPrice}.
   *   <li>Then return name is {@code tradedPrice}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'tradedPrice'; then return name is 'tradedPrice'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTradedPrice_thenReturnNameIsTradedPrice() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedBondFutureTrade.meta().metaPropertyGet("tradedPrice");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PortfolioItemInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedBondFuture> productResult = ((Meta) metaBeanResult).product();
    assertTrue(productResult instanceof DirectMetaProperty);
    MetaProperty<Double> quantityResult = ((Meta) metaBeanResult).quantity();
    assertTrue(quantityResult instanceof DirectMetaProperty);
    assertEquals("tradedPrice", actualMetaPropertyGetResult.name());
    Class<TradedPrice> expectedPropertyTypeResult = TradedPrice.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).tradedPrice());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, productResult.metaBean());
    assertSame(metaBeanResult, quantityResult.metaBean());
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
        ResolvedBondFutureTrade.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("info") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("product") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("quantity") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("tradedPrice") instanceof DirectMetaProperty);
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
        () -> ResolvedBondFutureTrade.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTrue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedBondFutureTrade.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            ResolvedBondFutureTrade.meta()
                .propertySet(mock(Bean.class), "info", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'info'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInfo_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ResolvedBondFutureTrade.meta()
                .propertySet(mock(Bean.class), "info", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code product}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'product'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenProduct_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ResolvedBondFutureTrade.meta()
                .propertySet(mock(Bean.class), "product", "New Value", true));
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
            ResolvedBondFutureTrade.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code quantity}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'quantity'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenQuantity_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ResolvedBondFutureTrade.meta()
                .propertySet(mock(Bean.class), "quantity", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code tradedPrice}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'tradedPrice'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTradedPrice_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ResolvedBondFutureTrade.meta()
                .propertySet(mock(Bean.class), "tradedPrice", "New Value", true));
  }
}
