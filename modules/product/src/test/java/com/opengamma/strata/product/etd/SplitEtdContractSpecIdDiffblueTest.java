package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.product.common.ExchangeId;
import com.opengamma.strata.product.common.ExchangeIds;
import com.opengamma.strata.product.etd.SplitEtdContractSpecId.Builder;
import java.util.NoSuchElementException;
import org.joda.beans.MetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SplitEtdContractSpecIdDiffblueTest {
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
    Builder builderResult = SplitEtdContractSpecId.builder();

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
    Builder builderResult = SplitEtdContractSpecId.builder();

    // Act
    Builder actualExchangeIdResult = builderResult.exchangeId(ExchangeIds.ECAG);

    // Assert
    assertSame(builderResult, actualExchangeIdResult);
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
    assertNull(SplitEtdContractSpecId.builder().get("contractCode"));
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
    assertNull(SplitEtdContractSpecId.builder().get("exchangeId"));
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
        NoSuchElementException.class, () -> SplitEtdContractSpecId.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code specId}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'specId'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSpecId_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SplitEtdContractSpecId.builder().get("specId"));
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
    assertNull(SplitEtdContractSpecId.builder().get("type"));
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
        () -> SplitEtdContractSpecId.builder().set("Property Name", "New Value"));
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
    Builder builderResult = SplitEtdContractSpecId.builder();

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
    Builder builderResult = SplitEtdContractSpecId.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#specId(EtdContractSpecId)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#specId(EtdContractSpecId)}
   */
  @Test
  @DisplayName(
      "Test Builder specId(EtdContractSpecId); when StandardId with 'Scheme' and value is '42'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.specId(EtdContractSpecId)"})
  void testBuilderSpecId_whenStandardIdWithSchemeAndValueIs42_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SplitEtdContractSpecId.builder();

    // Act
    Builder actualSpecIdResult =
        builderResult.specId(EtdContractSpecId.of(StandardId.of("Scheme", "42")));

    // Assert
    assertSame(builderResult, actualSpecIdResult);
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
    Builder builderResult = SplitEtdContractSpecId.builder();

    // Act
    Builder actualTypeResult = builderResult.type(EtdType.FUTURE);

    // Assert
    assertSame(builderResult, actualTypeResult);
  }
}
