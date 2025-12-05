package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.product.PortfolioItemSummary.Builder;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.direct.MinimalMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PortfolioItemSummaryDiffblueTest {
  /**
   * Test Builder {@link Builder#currencies(Currency[])} with {@code Currency[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#currencies(Currency[])}
   */
  @Test
  @DisplayName("Test Builder currencies(Currency[]) with 'Currency[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.currencies(Currency[])"})
  void testBuilderCurrenciesWithCurrency_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PortfolioItemSummary.builder();

    // Act
    Builder actualCurrenciesResult = builderResult.currencies();

    // Assert
    assertSame(builderResult, actualCurrenciesResult);
  }

  /**
   * Test Builder {@link Builder#currencies(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#currencies(Set)}
   */
  @Test
  @DisplayName("Test Builder currencies(Set) with 'Set'; when HashSet(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.currencies(Set)"})
  void testBuilderCurrenciesWithSet_whenHashSet_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PortfolioItemSummary.builder();

    // Act
    Builder actualCurrenciesResult = builderResult.currencies(new HashSet<>());

    // Assert
    assertSame(builderResult, actualCurrenciesResult);
  }

  /**
   * Test Builder {@link Builder#description(String)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#description(String)}
   */
  @Test
  @DisplayName("Test Builder description(String); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.description(String)"})
  void testBuilderDescription_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PortfolioItemSummary.builder();

    // Act
    Builder actualDescriptionResult =
        builderResult.description("The characteristics of someone or something");

    // Assert
    assertSame(builderResult, actualDescriptionResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code currencies}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'currencies'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCurrencies_thenReturnSet() {
    // Arrange and Act
    Object actualGetResult = PortfolioItemSummary.builder().get("currencies");

    // Assert
    assertTrue(actualGetResult instanceof Set);
    assertTrue(((Set<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code description}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'description'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDescription_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PortfolioItemSummary.builder().get("description"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code portfolioItemType}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'portfolioItemType'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPortfolioItemType_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PortfolioItemSummary.builder().get("portfolioItemType"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code productType}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'productType'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenProductType_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PortfolioItemSummary.builder().get("productType"));
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
        NoSuchElementException.class, () -> PortfolioItemSummary.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#portfolioItemType(PortfolioItemType)}.
   *
   * <ul>
   *   <li>When {@code TRADE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#portfolioItemType(PortfolioItemType)}
   */
  @Test
  @DisplayName(
      "Test Builder portfolioItemType(PortfolioItemType); when 'TRADE'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.portfolioItemType(PortfolioItemType)"})
  void testBuilderPortfolioItemType_whenTrade_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PortfolioItemSummary.builder();

    // Act
    Builder actualPortfolioItemTypeResult =
        builderResult.portfolioItemType(PortfolioItemType.TRADE);

    // Assert
    assertSame(builderResult, actualPortfolioItemTypeResult);
  }

  /**
   * Test Builder {@link Builder#productType(ProductType)}.
   *
   * <ul>
   *   <li>When {@link ProductType#BILL}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#productType(ProductType)}
   */
  @Test
  @DisplayName("Test Builder productType(ProductType); when BILL; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.productType(ProductType)"})
  void testBuilderProductType_whenBill_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PortfolioItemSummary.builder();

    // Act
    Builder actualProductTypeResult = builderResult.productType(ProductType.BILL);

    // Assert
    assertSame(builderResult, actualProductTypeResult);
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
        () -> PortfolioItemSummary.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code currencies}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'currencies'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenCurrencies_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PortfolioItemSummary.builder();

    // Act
    Builder actualSetResult = builderResult.set("currencies", new HashSet<>());

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
    Builder builderResult = PortfolioItemSummary.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link PortfolioItemSummary#meta()}.
   *
   * <p>Method under test: {@link PortfolioItemSummary#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean PortfolioItemSummary.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<PortfolioItemSummary> actualMetaResult = PortfolioItemSummary.meta();

    // Assert
    assertTrue(actualMetaResult.builder() instanceof Builder);
    assertTrue(actualMetaResult instanceof MinimalMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(5, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("currencies"));
    assertTrue(metaPropertyMapResult.containsKey("description"));
    assertTrue(metaPropertyMapResult.containsKey("id"));
    assertTrue(metaPropertyMapResult.containsKey("portfolioItemType"));
    assertTrue(metaPropertyMapResult.containsKey("productType"));
    assertTrue(actualMetaResult.isBuildable());
    Class<PortfolioItemSummary> expectedBeanTypeResult = PortfolioItemSummary.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link PortfolioItemSummary#of(StandardId, PortfolioItemType, ProductType, Set, String)}.
   *
   * <ul>
   *   <li>Then return Description is {@code The characteristics of someone or something}.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemSummary#of(StandardId, PortfolioItemType,
   * ProductType, Set, String)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId, PortfolioItemType, ProductType, Set, String); then return Description is 'The characteristics of someone or something'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PortfolioItemSummary PortfolioItemSummary.of(StandardId, PortfolioItemType, ProductType, Set, String)"
  })
  void testOf_thenReturnDescriptionIsTheCharacteristicsOfSomeoneOrSomething() {
    // Arrange
    HashSet<Currency> currencies = new HashSet<>();

    // Act
    PortfolioItemSummary actualOfResult =
        PortfolioItemSummary.of(
            null,
            PortfolioItemType.TRADE,
            ProductType.BILL,
            currencies,
            "The characteristics of someone or something");

    // Assert
    assertEquals("The characteristics of someone or something", actualOfResult.getDescription());
    assertEquals(PortfolioItemType.TRADE, actualOfResult.getPortfolioItemType());
    assertFalse(actualOfResult.getId().isPresent());
    assertEquals(currencies, actualOfResult.getCurrencies());
    assertSame(ProductType.BILL, actualOfResult.getProductType());
  }

  /**
   * Test {@link PortfolioItemSummary#metaBean()}.
   *
   * <ul>
   *   <li>Then builder return {@link Builder}.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemSummary#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then builder return Builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean PortfolioItemSummary.metaBean()"})
  void testMetaBean_thenBuilderReturnBuilder() {
    // Arrange
    PortfolioItemSummary ofResult =
        PortfolioItemSummary.of(
            null,
            PortfolioItemType.TRADE,
            ProductType.BILL,
            new HashSet<>(),
            "The characteristics of someone or something");

    // Act
    TypedMetaBean<PortfolioItemSummary> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult.builder() instanceof Builder);
    assertTrue(actualMetaBeanResult instanceof MinimalMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(5, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("currencies"));
    assertTrue(metaPropertyMapResult.containsKey("description"));
    assertTrue(metaPropertyMapResult.containsKey("id"));
    assertTrue(metaPropertyMapResult.containsKey("portfolioItemType"));
    assertTrue(metaPropertyMapResult.containsKey("productType"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<PortfolioItemSummary> expectedBeanTypeResult = PortfolioItemSummary.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link PortfolioItemSummary#getId()}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemSummary#getId()}
   */
  @Test
  @DisplayName("Test getId(); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional PortfolioItemSummary.getId()"})
  void testGetId_thenReturnNotPresent() {
    // Arrange
    PortfolioItemSummary ofResult =
        PortfolioItemSummary.of(
            null,
            PortfolioItemType.TRADE,
            ProductType.BILL,
            new HashSet<>(),
            "The characteristics of someone or something");

    // Act and Assert
    assertFalse(ofResult.getId().isPresent());
  }
}
