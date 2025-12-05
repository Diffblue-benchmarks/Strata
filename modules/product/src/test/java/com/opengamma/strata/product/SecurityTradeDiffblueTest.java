package com.opengamma.strata.product;

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
import com.opengamma.strata.product.SecurityTrade.Builder;
import com.opengamma.strata.product.SecurityTrade.Meta;
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

class SecurityTradeDiffblueTest {
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
    Object actualGetResult = SecurityTrade.builder().get("info");

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
    assertThrows(NoSuchElementException.class, () -> SecurityTrade.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code securityId}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'securityId'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSecurityId_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SecurityTrade.builder().get("securityId"));
  }

  /**
   * Test Builder {@link Builder#info(TradeInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#info(TradeInfo)}
   */
  @Test
  @DisplayName("Test Builder info(TradeInfo); when empty; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.info(TradeInfo)"})
  void testBuilderInfo_whenEmpty_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SecurityTrade.builder();

    // Act
    Builder actualInfoResult = builderResult.info(TradeInfo.empty());

    // Assert
    assertSame(builderResult, actualInfoResult);
  }

  /**
   * Test Builder {@link Builder#securityId(SecurityId)}.
   *
   * <ul>
   *   <li>Then builder build Price is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#securityId(SecurityId)}
   */
  @Test
  @DisplayName("Test Builder securityId(SecurityId); then builder build Price is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.securityId(SecurityId)"})
  void testBuilderSecurityId_thenBuilderBuildPriceIsZero() {
    // Arrange
    Builder builderResult = SecurityTrade.builder();
    SecurityId securityId = SecurityId.of(StandardId.of("Scheme", "42"));

    // Act
    Builder actualSecurityIdResult = builderResult.securityId(securityId);

    // Assert
    SecurityTrade securityTrade = builderResult.build();
    assertEquals(0.0d, securityTrade.getPrice());
    assertEquals(0.0d, securityTrade.getQuantity());
    assertSame(securityId, securityTrade.getSecurityId());
    assertSame(builderResult, actualSecurityIdResult);
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
        () -> SecurityTrade.builder().set("Property Name", "New Value"));
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
    Builder builderResult = SecurityTrade.builder();

    // Act
    Builder actualSetResult = builderResult.set("info", TradeInfo.empty());

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
    Builder builderResult = SecurityTrade.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Class<? extends SecurityTrade> actualBeanTypeResult = SecurityTrade.meta().beanType();

    // Assert
    Class<SecurityTrade> expectedBeanTypeResult = SecurityTrade.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#info()}
   *   <li>{@link Meta#price()}
   *   <li>{@link Meta#quantity()}
   *   <li>{@link Meta#securityId()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.info()",
    "MetaProperty Meta.price()",
    "MetaProperty Meta.quantity()",
    "MetaProperty Meta.securityId()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SecurityTrade.meta();

    // Act
    MetaProperty<TradeInfo> actualInfoResult = metaResult.info();
    MetaProperty<Double> actualPriceResult = metaResult.price();
    MetaProperty<Double> actualQuantityResult = metaResult.quantity();

    // Assert
    assertTrue(actualInfoResult instanceof DirectMetaProperty);
    assertTrue(actualPriceResult instanceof DirectMetaProperty);
    assertTrue(actualQuantityResult instanceof DirectMetaProperty);
    assertTrue(metaResult.securityId() instanceof DirectMetaProperty);
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
    MetaProperty<?> actualMetaPropertyGetResult = SecurityTrade.meta().metaPropertyGet("info");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> priceResult = ((Meta) metaBeanResult).price();
    assertTrue(priceResult instanceof DirectMetaProperty);
    MetaProperty<Double> quantityResult = ((Meta) metaBeanResult).quantity();
    assertTrue(quantityResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> securityIdResult = ((Meta) metaBeanResult).securityId();
    assertTrue(securityIdResult instanceof DirectMetaProperty);
    assertEquals("info", actualMetaPropertyGetResult.name());
    Class<TradeInfo> expectedPropertyTypeResult = TradeInfo.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).info());
    assertSame(metaBeanResult, priceResult.metaBean());
    assertSame(metaBeanResult, quantityResult.metaBean());
    assertSame(metaBeanResult, securityIdResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code price}.
   *   <li>Then return name is {@code price}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'price'; then return name is 'price'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPrice_thenReturnNameIsPrice() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = SecurityTrade.meta().metaPropertyGet("price");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<TradeInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> quantityResult = ((Meta) metaBeanResult).quantity();
    assertTrue(quantityResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> securityIdResult = ((Meta) metaBeanResult).securityId();
    assertTrue(securityIdResult instanceof DirectMetaProperty);
    assertEquals("price", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).price());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, quantityResult.metaBean());
    assertSame(metaBeanResult, securityIdResult.metaBean());
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
    assertNull(SecurityTrade.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code quantity}.
   *   <li>Then return name is {@code quantity}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'quantity'; then return name is 'quantity'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenQuantity_thenReturnNameIsQuantity() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = SecurityTrade.meta().metaPropertyGet("quantity");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<TradeInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> priceResult = ((Meta) metaBeanResult).price();
    assertTrue(priceResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> securityIdResult = ((Meta) metaBeanResult).securityId();
    assertTrue(securityIdResult instanceof DirectMetaProperty);
    assertEquals("quantity", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).quantity());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, priceResult.metaBean());
    assertSame(metaBeanResult, securityIdResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code securityId}.
   *   <li>Then return name is {@code securityId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'securityId'; then return name is 'securityId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSecurityId_thenReturnNameIsSecurityId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SecurityTrade.meta().metaPropertyGet("securityId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<TradeInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> priceResult = ((Meta) metaBeanResult).price();
    assertTrue(priceResult instanceof DirectMetaProperty);
    MetaProperty<Double> quantityResult = ((Meta) metaBeanResult).quantity();
    assertTrue(quantityResult instanceof DirectMetaProperty);
    assertEquals("securityId", actualMetaPropertyGetResult.name());
    Class<SecurityId> expectedPropertyTypeResult = SecurityId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).securityId());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, priceResult.metaBean());
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
        SecurityTrade.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("info") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("price") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("quantity") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("securityId") instanceof DirectMetaProperty);
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
        () -> SecurityTrade.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
    assertNull(SecurityTrade.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> SecurityTrade.meta().propertySet(mock(Bean.class), "info", "New Value", false));
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
        () -> SecurityTrade.meta().propertySet(mock(Bean.class), "info", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code price}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'price'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPrice_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> SecurityTrade.meta().propertySet(mock(Bean.class), "price", "New Value", true));
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
            SecurityTrade.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> SecurityTrade.meta().propertySet(mock(Bean.class), "quantity", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code securityId}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'securityId'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSecurityId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> SecurityTrade.meta().propertySet(mock(Bean.class), "securityId", "New Value", true));
  }

  /**
   * Test {@link SecurityTrade#of(TradeInfo, SecurityId, double, double)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return Price is ten.
   * </ul>
   *
   * <p>Method under test: {@link SecurityTrade#of(TradeInfo, SecurityId, double, double)}
   */
  @Test
  @DisplayName(
      "Test of(TradeInfo, SecurityId, double, double); when StandardId with 'Scheme' and value is '42'; then return Price is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityTrade SecurityTrade.of(TradeInfo, SecurityId, double, double)"})
  void testOf_whenStandardIdWithSchemeAndValueIs42_thenReturnPriceIsTen() {
    // Arrange
    TradeInfo tradeInfo = TradeInfo.empty();
    SecurityId securityId = SecurityId.of(StandardId.of("Scheme", "42"));

    // Act
    SecurityTrade actualOfResult = SecurityTrade.of(tradeInfo, securityId, 10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getPrice());
    assertEquals(10.0d, actualOfResult.getQuantity());
    assertFalse(actualOfResult.getId().isPresent());
    assertSame(securityId, actualOfResult.getSecurityId());
    assertSame(tradeInfo, actualOfResult.getInfo());
  }

  /**
   * Test {@link SecurityTrade#summarize()}.
   *
   * <ul>
   *   <li>Then return Description is {@code 42 x 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityTrade#summarize()}
   */
  @Test
  @DisplayName("Test summarize(); then return Description is '42 x 0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemSummary SecurityTrade.summarize()"})
  void testSummarize_thenReturnDescriptionIs42X05() {
    // Arrange
    TradeInfo tradeInfo = TradeInfo.empty();
    SecurityTrade ofResult =
        SecurityTrade.of(tradeInfo, SecurityId.of(StandardId.of("Scheme", "42")), 0.5d, 10.0d);

    // Act
    PortfolioItemSummary actualSummarizeResult = ofResult.summarize();

    // Assert
    assertEquals("42 x 0.5", actualSummarizeResult.getDescription());
    ProductType productType = actualSummarizeResult.getProductType();
    assertEquals("Security", productType.getName());
    assertEquals("Security", productType.toString());
    assertEquals("Security", productType.getDescription());
    assertEquals(PortfolioItemType.TRADE, actualSummarizeResult.getPortfolioItemType());
    assertFalse(actualSummarizeResult.getId().isPresent());
    assertTrue(actualSummarizeResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link SecurityTrade#summarize()}.
   *
   * <ul>
   *   <li>Then return Description is {@code 42 x 10}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityTrade#summarize()}
   */
  @Test
  @DisplayName("Test summarize(); then return Description is '42 x 10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemSummary SecurityTrade.summarize()"})
  void testSummarize_thenReturnDescriptionIs42X10() {
    // Arrange
    TradeInfo tradeInfo = TradeInfo.empty();
    SecurityTrade ofResult =
        SecurityTrade.of(tradeInfo, SecurityId.of(StandardId.of("Scheme", "42")), 10.0d, 10.0d);

    // Act
    PortfolioItemSummary actualSummarizeResult = ofResult.summarize();

    // Assert
    assertEquals("42 x 10", actualSummarizeResult.getDescription());
    ProductType productType = actualSummarizeResult.getProductType();
    assertEquals("Security", productType.getName());
    assertEquals("Security", productType.toString());
    assertEquals("Security", productType.getDescription());
    assertEquals(PortfolioItemType.TRADE, actualSummarizeResult.getPortfolioItemType());
    assertFalse(actualSummarizeResult.getId().isPresent());
    assertTrue(actualSummarizeResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link SecurityTrade#summarize()}.
   *
   * <ul>
   *   <li>Then return Description is {@code 42 x -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityTrade#summarize()}
   */
  @Test
  @DisplayName("Test summarize(); then return Description is '42 x -0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemSummary SecurityTrade.summarize()"})
  void testSummarize_thenReturnDescriptionIs42X052() {
    // Arrange
    TradeInfo tradeInfo = TradeInfo.empty();
    SecurityTrade ofResult =
        SecurityTrade.of(tradeInfo, SecurityId.of(StandardId.of("Scheme", "42")), -0.5d, 10.0d);

    // Act
    PortfolioItemSummary actualSummarizeResult = ofResult.summarize();

    // Assert
    assertEquals("42 x -0.5", actualSummarizeResult.getDescription());
    ProductType productType = actualSummarizeResult.getProductType();
    assertEquals("Security", productType.getName());
    assertEquals("Security", productType.toString());
    assertEquals("Security", productType.getDescription());
    assertEquals(PortfolioItemType.TRADE, actualSummarizeResult.getPortfolioItemType());
    assertFalse(actualSummarizeResult.getId().isPresent());
    assertTrue(actualSummarizeResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link SecurityTrade#withQuantity(double)}.
   *
   * <p>Method under test: {@link SecurityTrade#withQuantity(double)}
   */
  @Test
  @DisplayName("Test withQuantity(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityTrade SecurityTrade.withQuantity(double)"})
  void testWithQuantity() {
    // Arrange
    TradeInfo tradeInfo = TradeInfo.empty();
    SecurityTrade ofResult =
        SecurityTrade.of(tradeInfo, SecurityId.of(StandardId.of("Scheme", "42")), 10.0d, 10.0d);

    // Act
    SecurityTrade actualWithQuantityResult = ofResult.withQuantity(10.0d);

    // Assert
    assertEquals(ofResult, actualWithQuantityResult);
  }

  /**
   * Test {@link SecurityTrade#withPrice(double)}.
   *
   * <p>Method under test: {@link SecurityTrade#withPrice(double)}
   */
  @Test
  @DisplayName("Test withPrice(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityTrade SecurityTrade.withPrice(double)"})
  void testWithPrice() {
    // Arrange
    TradeInfo tradeInfo = TradeInfo.empty();
    SecurityTrade ofResult =
        SecurityTrade.of(tradeInfo, SecurityId.of(StandardId.of("Scheme", "42")), 10.0d, 10.0d);

    // Act
    SecurityTrade actualWithPriceResult = ofResult.withPrice(10.0d);

    // Assert
    assertEquals(ofResult, actualWithPriceResult);
  }

  /**
   * Test {@link SecurityTrade#meta()}.
   *
   * <p>Method under test: {@link SecurityTrade#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SecurityTrade.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SecurityTrade.meta();

    // Assert
    assertTrue(actualMetaResult.info() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.price() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.quantity() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.securityId() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link SecurityTrade#SecurityTrade(TradeInfo, SecurityId, double, double)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return Price is ten.
   * </ul>
   *
   * <p>Method under test: {@link SecurityTrade#SecurityTrade(TradeInfo, SecurityId, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new SecurityTrade(TradeInfo, SecurityId, double, double); when StandardId with 'Scheme' and value is '42'; then return Price is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SecurityTrade.<init>(TradeInfo, SecurityId, double, double)"})
  void testNewSecurityTrade_whenStandardIdWithSchemeAndValueIs42_thenReturnPriceIsTen() {
    // Arrange
    TradeInfo info = TradeInfo.empty();
    SecurityId securityId = SecurityId.of(StandardId.of("Scheme", "42"));

    // Act
    SecurityTrade actualSecurityTrade = new SecurityTrade(info, securityId, 10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualSecurityTrade.getPrice());
    assertEquals(10.0d, actualSecurityTrade.getQuantity());
    assertFalse(actualSecurityTrade.getId().isPresent());
    assertSame(securityId, actualSecurityTrade.getSecurityId());
    assertSame(info, actualSecurityTrade.getInfo());
  }

  /**
   * Test {@link SecurityTrade#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityTrade#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given StandardId with 'Scheme' and value is '42'; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SecurityTrade.metaBean()"})
  void testMetaBean_givenStandardIdWithSchemeAndValueIs42_thenReturnInstance() {
    // Arrange
    TradeInfo tradeInfo = TradeInfo.empty();
    SecurityTrade ofResult =
        SecurityTrade.of(tradeInfo, SecurityId.of(StandardId.of("Scheme", "42")), 10.0d, 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link SecurityTrade#getInfo()}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SecurityTrade#getInfo()}
   */
  @Test
  @DisplayName(
      "Test getInfo(); given StandardId with 'Scheme' and value is '42'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo SecurityTrade.getInfo()"})
  void testGetInfo_givenStandardIdWithSchemeAndValueIs42_thenReturnEmpty() {
    // Arrange
    TradeInfo tradeInfo = TradeInfo.empty();
    SecurityTrade ofResult =
        SecurityTrade.of(tradeInfo, SecurityId.of(StandardId.of("Scheme", "42")), 10.0d, 10.0d);

    // Act and Assert
    assertSame(tradeInfo, ofResult.getInfo());
  }
}
