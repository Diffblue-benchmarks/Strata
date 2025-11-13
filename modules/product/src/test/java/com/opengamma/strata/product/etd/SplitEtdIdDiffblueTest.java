package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.common.ExchangeId;
import com.opengamma.strata.product.common.ExchangeIds;
import com.opengamma.strata.product.etd.SplitEtdId.Builder;
import java.time.Month;
import java.time.YearMonth;
import java.util.NoSuchElementException;
import org.joda.beans.MetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SplitEtdIdDiffblueTest {
  /**
   * Test Builder {@link Builder#contractCode(EtdContractCode)}.
   *
   * <ul>
   *   <li>When {@link EtdContractCode} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#contractCode(EtdContractCode)}
   */
  @Test
  @DisplayName(
      "Test Builder contractCode(EtdContractCode); when EtdContractCode with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.contractCode(EtdContractCode)"})
  void testBuilderContractCode_whenEtdContractCodeWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SplitEtdId.builder();

    // Act
    Builder actualContractCodeResult = builderResult.contractCode(EtdContractCode.of("Name"));

    // Assert
    assertSame(builderResult, actualContractCodeResult);
  }

  /**
   * Test Builder {@link Builder#exchangeId(ExchangeId)}.
   *
   * <ul>
   *   <li>When {@link ExchangeIds#ECAG}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#exchangeId(ExchangeId)}
   */
  @Test
  @DisplayName("Test Builder exchangeId(ExchangeId); when ECAG; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.exchangeId(ExchangeId)"})
  void testBuilderExchangeId_whenEcag_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SplitEtdId.builder();

    // Act
    Builder actualExchangeIdResult = builderResult.exchangeId(ExchangeIds.ECAG);

    // Assert
    assertSame(builderResult, actualExchangeIdResult);
  }

  /**
   * Test Builder {@link Builder#expiry(YearMonth)}.
   *
   * <ul>
   *   <li>When {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#expiry(YearMonth)}
   */
  @Test
  @DisplayName(
      "Test Builder expiry(YearMonth); when YearMonth with '1970' and 'JANUARY'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.expiry(YearMonth)"})
  void testBuilderExpiry_whenYearMonthWith1970AndJanuary_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SplitEtdId.builder();

    // Act
    Builder actualExpiryResult = builderResult.expiry(YearMonth.of(1970, Month.JANUARY));

    // Assert
    assertSame(builderResult, actualExpiryResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code contractCode}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'contractCode'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenContractCode_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SplitEtdId.builder().get("contractCode"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code exchangeId}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'exchangeId'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExchangeId_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SplitEtdId.builder().get("exchangeId"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'expiry'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExpiry_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SplitEtdId.builder().get("expiry"));
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
    assertThrows(NoSuchElementException.class, () -> SplitEtdId.builder().get("Property Name"));
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
    assertNull(SplitEtdId.builder().get("securityId"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'type'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenType_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SplitEtdId.builder().get("type"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code variant}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'variant'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenVariant_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SplitEtdId.builder().get("variant"));
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
        NoSuchElementException.class, () -> SplitEtdId.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code contractCode}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'contractCode'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenContractCode_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SplitEtdId.builder();

    // Act
    Builder actualSetResult = builderResult.set("contractCode", EtdContractCode.of("Name"));

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
    Builder builderResult = SplitEtdId.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#type(EtdType)}.
   *
   * <ul>
   *   <li>When {@code FUTURE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#type(EtdType)}
   */
  @Test
  @DisplayName("Test Builder type(EtdType); when 'FUTURE'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.type(EtdType)"})
  void testBuilderType_whenFuture_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SplitEtdId.builder();

    // Act
    Builder actualTypeResult = builderResult.type(EtdType.FUTURE);

    // Assert
    assertSame(builderResult, actualTypeResult);
  }

  /**
   * Test Builder {@link Builder#variant(EtdVariant)}.
   *
   * <ul>
   *   <li>When {@link EtdVariant#MONTHLY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#variant(EtdVariant)}
   */
  @Test
  @DisplayName("Test Builder variant(EtdVariant); when MONTHLY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.variant(EtdVariant)"})
  void testBuilderVariant_whenMonthly_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SplitEtdId.builder();

    // Act
    Builder actualVariantResult = builderResult.variant(EtdVariant.MONTHLY);

    // Assert
    assertSame(builderResult, actualVariantResult);
  }
}
