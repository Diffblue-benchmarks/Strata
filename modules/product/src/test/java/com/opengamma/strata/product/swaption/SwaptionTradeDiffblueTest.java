package com.opengamma.strata.product.swaption;

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
import com.opengamma.strata.basics.currency.AdjustablePayment;
import com.opengamma.strata.product.TradeInfo;
import com.opengamma.strata.product.swaption.SwaptionTrade.Builder;
import com.opengamma.strata.product.swaption.SwaptionTrade.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwaptionTradeDiffblueTest {
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
    Object actualGetResult = SwaptionTrade.builder().get("info");

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
   *   <li>When {@code premium}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'premium'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPremium_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SwaptionTrade.builder().get("premium"));
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
    assertNull(SwaptionTrade.builder().get("product"));
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
    assertThrows(NoSuchElementException.class, () -> SwaptionTrade.builder().get("Property Name"));
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
    Builder builderResult = SwaptionTrade.builder();

    // Act
    Builder actualInfoResult = builderResult.info(TradeInfo.empty());

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
        () -> SwaptionTrade.builder().set("Property Name", "New Value"));
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
    Builder builderResult = SwaptionTrade.builder();

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
    Builder builderResult = SwaptionTrade.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link SwaptionTrade#meta()}.
   *
   * <p>Method under test: {@link SwaptionTrade#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SwaptionTrade.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SwaptionTrade.meta();

    // Assert
    MetaProperty<TradeInfo> infoResult = actualMetaResult.info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    MetaProperty<AdjustablePayment> premiumResult = actualMetaResult.premium();
    assertTrue(premiumResult instanceof DirectMetaProperty);
    MetaProperty<Swaption> productResult = actualMetaResult.product();
    assertTrue(productResult instanceof DirectMetaProperty);
    assertEquals("info", infoResult.name());
    assertEquals("premium", premiumResult.name());
    assertEquals("product", productResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, infoResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, premiumResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, productResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<AdjustablePayment> expectedPropertyTypeResult = AdjustablePayment.class;
    assertEquals(expectedPropertyTypeResult, premiumResult.propertyType());
    Class<TradeInfo> expectedPropertyTypeResult2 = TradeInfo.class;
    assertEquals(expectedPropertyTypeResult2, infoResult.propertyType());
    Class<Swaption> expectedPropertyTypeResult3 = Swaption.class;
    assertEquals(expectedPropertyTypeResult3, productResult.propertyType());
    Class<SwaptionTrade> expectedDeclaringTypeResult = SwaptionTrade.class;
    assertEquals(expectedDeclaringTypeResult, infoResult.declaringType());
    Class<SwaptionTrade> expectedDeclaringTypeResult2 = SwaptionTrade.class;
    assertEquals(expectedDeclaringTypeResult2, premiumResult.declaringType());
    Class<SwaptionTrade> expectedDeclaringTypeResult3 = SwaptionTrade.class;
    assertEquals(expectedDeclaringTypeResult3, productResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, infoResult.metaBean());
    assertSame(meta, premiumResult.metaBean());
    assertSame(meta, productResult.metaBean());
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
    Class<? extends SwaptionTrade> actualBeanTypeResult = SwaptionTrade.meta().beanType();

    // Assert
    Class<SwaptionTrade> expectedBeanTypeResult = SwaptionTrade.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#info()}
   *   <li>{@link Meta#premium()}
   *   <li>{@link Meta#product()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.info()",
    "MetaProperty Meta.premium()",
    "MetaProperty Meta.product()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SwaptionTrade.meta();

    // Act
    MetaProperty<TradeInfo> actualInfoResult = metaResult.info();
    MetaProperty<AdjustablePayment> actualPremiumResult = metaResult.premium();

    // Assert
    assertTrue(actualInfoResult instanceof DirectMetaProperty);
    assertTrue(actualPremiumResult instanceof DirectMetaProperty);
    assertTrue(metaResult.product() instanceof DirectMetaProperty);
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
    MetaProperty<?> actualMetaPropertyGetResult = SwaptionTrade.meta().metaPropertyGet("info");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<AdjustablePayment> premiumResult = ((Meta) metaBeanResult).premium();
    assertTrue(premiumResult instanceof DirectMetaProperty);
    MetaProperty<Swaption> productResult = ((Meta) metaBeanResult).product();
    assertTrue(productResult instanceof DirectMetaProperty);
    assertEquals("info", actualMetaPropertyGetResult.name());
    Class<TradeInfo> expectedPropertyTypeResult = TradeInfo.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).info());
    assertSame(metaBeanResult, premiumResult.metaBean());
    assertSame(metaBeanResult, productResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code premium}.
   *   <li>Then return name is {@code premium}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'premium'; then return name is 'premium'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPremium_thenReturnNameIsPremium() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = SwaptionTrade.meta().metaPropertyGet("premium");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<TradeInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Swaption> productResult = ((Meta) metaBeanResult).product();
    assertTrue(productResult instanceof DirectMetaProperty);
    assertEquals("premium", actualMetaPropertyGetResult.name());
    Class<AdjustablePayment> expectedPropertyTypeResult = AdjustablePayment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).premium());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, productResult.metaBean());
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
    MetaProperty<?> actualMetaPropertyGetResult = SwaptionTrade.meta().metaPropertyGet("product");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<TradeInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<AdjustablePayment> premiumResult = ((Meta) metaBeanResult).premium();
    assertTrue(premiumResult instanceof DirectMetaProperty);
    assertEquals("product", actualMetaPropertyGetResult.name());
    Class<Swaption> expectedPropertyTypeResult = Swaption.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).product());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, premiumResult.metaBean());
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
    assertNull(SwaptionTrade.meta().metaPropertyGet("Property Name"));
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
        SwaptionTrade.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("info");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("premium");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("product");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("info", getResult.name());
    assertEquals("premium", getResult2.name());
    assertEquals("product", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<AdjustablePayment> expectedPropertyTypeResult = AdjustablePayment.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<TradeInfo> expectedPropertyTypeResult2 = TradeInfo.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<Swaption> expectedPropertyTypeResult3 = Swaption.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
    Class<SwaptionTrade> expectedDeclaringTypeResult = SwaptionTrade.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<SwaptionTrade> expectedDeclaringTypeResult2 = SwaptionTrade.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<SwaptionTrade> expectedDeclaringTypeResult3 = SwaptionTrade.class;
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
        () -> SwaptionTrade.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
    assertNull(SwaptionTrade.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> SwaptionTrade.meta().propertySet(mock(Bean.class), "info", "New Value", false));
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
        () -> SwaptionTrade.meta().propertySet(mock(Bean.class), "info", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code premium}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'premium'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPremium_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> SwaptionTrade.meta().propertySet(mock(Bean.class), "premium", "New Value", true));
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
        () -> SwaptionTrade.meta().propertySet(mock(Bean.class), "product", "New Value", true));
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
            SwaptionTrade.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
