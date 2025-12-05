package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.product.common.ExchangeId;
import com.opengamma.strata.product.common.ExchangeIds;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdContractSpecBuilderDiffblueTest {
  /**
   * Test {@link EtdContractSpecBuilder#id(EtdContractSpecId)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractSpecBuilder#id(EtdContractSpecId)}
   */
  @Test
  @DisplayName(
      "Test id(EtdContractSpecId); when StandardId with 'Scheme' and value is '42'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractSpecBuilder EtdContractSpecBuilder.id(EtdContractSpecId)"})
  void testId_whenStandardIdWithSchemeAndValueIs42_thenReturnBuilder() {
    // Arrange
    EtdContractSpecBuilder builderResult = EtdContractSpec.builder();

    // Act
    EtdContractSpecBuilder actualIdResult =
        builderResult.id(EtdContractSpecId.of(StandardId.of("Scheme", "42")));

    // Assert
    assertSame(builderResult, actualIdResult);
  }

  /**
   * Test {@link EtdContractSpecBuilder#type(EtdType)}.
   *
   * <ul>
   *   <li>When {@code FUTURE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractSpecBuilder#type(EtdType)}
   */
  @Test
  @DisplayName("Test type(EtdType); when 'FUTURE'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractSpecBuilder EtdContractSpecBuilder.type(EtdType)"})
  void testType_whenFuture_thenReturnBuilder() {
    // Arrange
    EtdContractSpecBuilder builderResult = EtdContractSpec.builder();

    // Act
    EtdContractSpecBuilder actualTypeResult = builderResult.type(EtdType.FUTURE);

    // Assert
    assertSame(builderResult, actualTypeResult);
  }

  /**
   * Test {@link EtdContractSpecBuilder#exchangeId(ExchangeId)}.
   *
   * <ul>
   *   <li>When {@link ExchangeIds#ECAG}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractSpecBuilder#exchangeId(ExchangeId)}
   */
  @Test
  @DisplayName("Test exchangeId(ExchangeId); when ECAG; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractSpecBuilder EtdContractSpecBuilder.exchangeId(ExchangeId)"})
  void testExchangeId_whenEcag_thenReturnBuilder() {
    // Arrange
    EtdContractSpecBuilder builderResult = EtdContractSpec.builder();

    // Act
    EtdContractSpecBuilder actualExchangeIdResult = builderResult.exchangeId(ExchangeIds.ECAG);

    // Assert
    assertSame(builderResult, actualExchangeIdResult);
  }

  /**
   * Test {@link EtdContractSpecBuilder#contractCode(EtdContractCode)}.
   *
   * <ul>
   *   <li>When {@link EtdContractCode} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractSpecBuilder#contractCode(EtdContractCode)}
   */
  @Test
  @DisplayName(
      "Test contractCode(EtdContractCode); when EtdContractCode with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractSpecBuilder EtdContractSpecBuilder.contractCode(EtdContractCode)"})
  void testContractCode_whenEtdContractCodeWithName_thenReturnBuilder() {
    // Arrange
    EtdContractSpecBuilder builderResult = EtdContractSpec.builder();

    // Act
    EtdContractSpecBuilder actualContractCodeResult =
        builderResult.contractCode(EtdContractCode.of("Name"));

    // Assert
    assertSame(builderResult, actualContractCodeResult);
  }

  /**
   * Test {@link EtdContractSpecBuilder#description(String)}.
   *
   * <ul>
   *   <li>When {@code The characteristics of someone or something}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractSpecBuilder#description(String)}
   */
  @Test
  @DisplayName(
      "Test description(String); when 'The characteristics of someone or something'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractSpecBuilder EtdContractSpecBuilder.description(String)"})
  void testDescription_whenTheCharacteristicsOfSomeoneOrSomething_thenReturnBuilder() {
    // Arrange
    EtdContractSpecBuilder builderResult = EtdContractSpec.builder();

    // Act
    EtdContractSpecBuilder actualDescriptionResult =
        builderResult.description("The characteristics of someone or something");

    // Assert
    assertSame(builderResult, actualDescriptionResult);
  }
}
