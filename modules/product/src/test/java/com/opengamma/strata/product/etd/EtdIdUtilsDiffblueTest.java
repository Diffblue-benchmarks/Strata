package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.product.Security;
import com.opengamma.strata.product.SecurityId;
import com.opengamma.strata.product.common.ExchangeId;
import com.opengamma.strata.product.common.ExchangeIds;
import com.opengamma.strata.product.common.PutCall;
import java.time.Month;
import java.time.YearMonth;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdIdUtilsDiffblueTest {
  /**
   * Test {@link EtdIdUtils#contractSpecId(EtdType, ExchangeId, EtdContractCode)} with {@code type},
   * {@code exchangeId}, {@code contractCode}.
   *
   * <p>Method under test: {@link EtdIdUtils#contractSpecId(EtdType, ExchangeId, EtdContractCode)}
   */
  @Test
  @DisplayName(
      "Test contractSpecId(EtdType, ExchangeId, EtdContractCode) with 'type', 'exchangeId', 'contractCode'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "EtdContractSpecId EtdIdUtils.contractSpecId(EtdType, ExchangeId, EtdContractCode)"
  })
  void testContractSpecIdWithTypeExchangeIdContractCode() {
    // Arrange and Act
    EtdContractSpecId actualContractSpecIdResult =
        EtdIdUtils.contractSpecId(EtdType.FUTURE, ExchangeIds.ECAG, EtdContractCode.of("Name"));

    // Assert
    StandardId standardId = actualContractSpecIdResult.getStandardId();
    assertEquals("F-ECAG-Name", standardId.getValue());
    Class<EtdContractSpec> expectedReferenceDataType = EtdContractSpec.class;
    assertEquals(expectedReferenceDataType, actualContractSpecIdResult.getReferenceDataType());
    assertEquals(EtdIdUtils.ETD_SCHEME, standardId.getScheme());
  }

  /**
   * Test {@link EtdIdUtils#contractSpecId(EtdType, ExchangeId, EtdContractCode)} with {@code type},
   * {@code exchangeId}, {@code contractCode}.
   *
   * <p>Method under test: {@link EtdIdUtils#contractSpecId(EtdType, ExchangeId, EtdContractCode)}
   */
  @Test
  @DisplayName(
      "Test contractSpecId(EtdType, ExchangeId, EtdContractCode) with 'type', 'exchangeId', 'contractCode'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "EtdContractSpecId EtdIdUtils.contractSpecId(EtdType, ExchangeId, EtdContractCode)"
  })
  void testContractSpecIdWithTypeExchangeIdContractCode2() {
    // Arrange and Act
    EtdContractSpecId actualContractSpecIdResult =
        EtdIdUtils.contractSpecId(EtdType.OPTION, ExchangeIds.ECAG, EtdContractCode.of("Name"));

    // Assert
    StandardId standardId = actualContractSpecIdResult.getStandardId();
    assertEquals("O-ECAG-Name", standardId.getValue());
    Class<EtdContractSpec> expectedReferenceDataType = EtdContractSpec.class;
    assertEquals(expectedReferenceDataType, actualContractSpecIdResult.getReferenceDataType());
    assertEquals(EtdIdUtils.ETD_SCHEME, standardId.getScheme());
  }

  /**
   * Test {@link EtdIdUtils#futureId(ExchangeId, EtdContractCode, YearMonth, EtdVariant)}.
   *
   * <ul>
   *   <li>When {@link ExchangeIds#ECAG}.
   *   <li>Then return StandardId Value is {@code F-ECAG-Name-197001}.
   * </ul>
   *
   * <p>Method under test: {@link EtdIdUtils#futureId(ExchangeId, EtdContractCode, YearMonth,
   * EtdVariant)}
   */
  @Test
  @DisplayName(
      "Test futureId(ExchangeId, EtdContractCode, YearMonth, EtdVariant); when ECAG; then return StandardId Value is 'F-ECAG-Name-197001'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SecurityId EtdIdUtils.futureId(ExchangeId, EtdContractCode, YearMonth, EtdVariant)"
  })
  void testFutureId_whenEcag_thenReturnStandardIdValueIsFEcagName197001() {
    // Arrange and Act
    SecurityId actualFutureIdResult =
        EtdIdUtils.futureId(
            ExchangeIds.ECAG,
            EtdContractCode.of("Name"),
            YearMonth.of(1970, Month.JANUARY),
            EtdVariant.MONTHLY);

    // Assert
    StandardId standardId = actualFutureIdResult.getStandardId();
    assertEquals("F-ECAG-Name-197001", standardId.getValue());
    Class<Security> expectedReferenceDataType = Security.class;
    assertEquals(expectedReferenceDataType, actualFutureIdResult.getReferenceDataType());
    assertEquals(EtdIdUtils.ETD_SCHEME, standardId.getScheme());
  }

  /**
   * Test {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int,
   * PutCall, double)} with {@code exchangeId}, {@code contractCode}, {@code expiryMonth}, {@code
   * variant}, {@code version}, {@code putCall}, {@code strikePrice}.
   *
   * <p>Method under test: {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth,
   * EtdVariant, int, PutCall, double)}
   */
  @Test
  @DisplayName(
      "Test optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double) with 'exchangeId', 'contractCode', 'expiryMonth', 'variant', 'version', 'putCall', 'strikePrice'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SecurityId EtdIdUtils.optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double)"
  })
  void testOptionIdWithExchangeIdContractCodeExpiryMonthVariantVersionPutCallStrikePrice() {
    // Arrange and Act
    SecurityId actualOptionIdResult =
        EtdIdUtils.optionId(
            ExchangeIds.ECAG,
            EtdContractCode.of("Name"),
            YearMonth.of(1970, Month.JANUARY),
            EtdVariant.MONTHLY,
            1,
            PutCall.PUT,
            10.0d);

    // Assert
    StandardId standardId = actualOptionIdResult.getStandardId();
    assertEquals("O-ECAG-Name-197001-V1-P10", standardId.getValue());
    Class<Security> expectedReferenceDataType = Security.class;
    assertEquals(expectedReferenceDataType, actualOptionIdResult.getReferenceDataType());
    assertEquals(EtdIdUtils.ETD_SCHEME, standardId.getScheme());
  }

  /**
   * Test {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int,
   * PutCall, double)} with {@code exchangeId}, {@code contractCode}, {@code expiryMonth}, {@code
   * variant}, {@code version}, {@code putCall}, {@code strikePrice}.
   *
   * <p>Method under test: {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth,
   * EtdVariant, int, PutCall, double)}
   */
  @Test
  @DisplayName(
      "Test optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double) with 'exchangeId', 'contractCode', 'expiryMonth', 'variant', 'version', 'putCall', 'strikePrice'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SecurityId EtdIdUtils.optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double)"
  })
  void testOptionIdWithExchangeIdContractCodeExpiryMonthVariantVersionPutCallStrikePrice2() {
    // Arrange and Act
    SecurityId actualOptionIdResult =
        EtdIdUtils.optionId(
            ExchangeIds.ECAG,
            EtdContractCode.of("Name"),
            YearMonth.of(1970, Month.JANUARY),
            EtdVariant.MONTHLY,
            0,
            PutCall.PUT,
            10.0d);

    // Assert
    StandardId standardId = actualOptionIdResult.getStandardId();
    assertEquals("O-ECAG-Name-197001-P10", standardId.getValue());
    Class<Security> expectedReferenceDataType = Security.class;
    assertEquals(expectedReferenceDataType, actualOptionIdResult.getReferenceDataType());
    assertEquals(EtdIdUtils.ETD_SCHEME, standardId.getScheme());
  }

  /**
   * Test {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int,
   * PutCall, double)} with {@code exchangeId}, {@code contractCode}, {@code expiryMonth}, {@code
   * variant}, {@code version}, {@code putCall}, {@code strikePrice}.
   *
   * <p>Method under test: {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth,
   * EtdVariant, int, PutCall, double)}
   */
  @Test
  @DisplayName(
      "Test optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double) with 'exchangeId', 'contractCode', 'expiryMonth', 'variant', 'version', 'putCall', 'strikePrice'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SecurityId EtdIdUtils.optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double)"
  })
  void testOptionIdWithExchangeIdContractCodeExpiryMonthVariantVersionPutCallStrikePrice3() {
    // Arrange and Act
    SecurityId actualOptionIdResult =
        EtdIdUtils.optionId(
            ExchangeIds.ECAG,
            EtdContractCode.of("Name"),
            YearMonth.of(1970, Month.JANUARY),
            EtdVariant.MONTHLY,
            1,
            PutCall.CALL,
            10.0d);

    // Assert
    StandardId standardId = actualOptionIdResult.getStandardId();
    assertEquals("O-ECAG-Name-197001-V1-C10", standardId.getValue());
    Class<Security> expectedReferenceDataType = Security.class;
    assertEquals(expectedReferenceDataType, actualOptionIdResult.getReferenceDataType());
    assertEquals(EtdIdUtils.ETD_SCHEME, standardId.getScheme());
  }

  /**
   * Test {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int,
   * PutCall, double, YearMonth)} with {@code exchangeId}, {@code contractCode}, {@code
   * expiryMonth}, {@code variant}, {@code version}, {@code putCall}, {@code strikePrice}, {@code
   * underlyingExpiryMonth}.
   *
   * <p>Method under test: {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth,
   * EtdVariant, int, PutCall, double, YearMonth)}
   */
  @Test
  @DisplayName(
      "Test optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double, YearMonth) with 'exchangeId', 'contractCode', 'expiryMonth', 'variant', 'version', 'putCall', 'strikePrice', 'underlyingExpiryMonth'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SecurityId EtdIdUtils.optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double, YearMonth)"
  })
  void
      testOptionIdWithExchangeIdContractCodeExpiryMonthVariantVersionPutCallStrikePriceUnderlyingExpiryMonth() {
    // Arrange and Act
    SecurityId actualOptionIdResult =
        EtdIdUtils.optionId(
            ExchangeIds.ECAG,
            EtdContractCode.of("Name"),
            YearMonth.of(1970, Month.JANUARY),
            EtdVariant.MONTHLY,
            1,
            PutCall.PUT,
            10.0d,
            YearMonth.of(1970, Month.JANUARY));

    // Assert
    StandardId standardId = actualOptionIdResult.getStandardId();
    assertEquals("O-ECAG-Name-197001-V1-P10", standardId.getValue());
    Class<Security> expectedReferenceDataType = Security.class;
    assertEquals(expectedReferenceDataType, actualOptionIdResult.getReferenceDataType());
    assertEquals(EtdIdUtils.ETD_SCHEME, standardId.getScheme());
  }

  /**
   * Test {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int,
   * PutCall, double, YearMonth)} with {@code exchangeId}, {@code contractCode}, {@code
   * expiryMonth}, {@code variant}, {@code version}, {@code putCall}, {@code strikePrice}, {@code
   * underlyingExpiryMonth}.
   *
   * <p>Method under test: {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth,
   * EtdVariant, int, PutCall, double, YearMonth)}
   */
  @Test
  @DisplayName(
      "Test optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double, YearMonth) with 'exchangeId', 'contractCode', 'expiryMonth', 'variant', 'version', 'putCall', 'strikePrice', 'underlyingExpiryMonth'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SecurityId EtdIdUtils.optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double, YearMonth)"
  })
  void
      testOptionIdWithExchangeIdContractCodeExpiryMonthVariantVersionPutCallStrikePriceUnderlyingExpiryMonth2() {
    // Arrange and Act
    SecurityId actualOptionIdResult =
        EtdIdUtils.optionId(
            ExchangeIds.ECAG,
            EtdContractCode.of("Name"),
            YearMonth.of(1970, Month.JANUARY),
            EtdVariant.MONTHLY,
            0,
            PutCall.PUT,
            10.0d,
            YearMonth.of(1970, Month.JANUARY));

    // Assert
    StandardId standardId = actualOptionIdResult.getStandardId();
    assertEquals("O-ECAG-Name-197001-P10", standardId.getValue());
    Class<Security> expectedReferenceDataType = Security.class;
    assertEquals(expectedReferenceDataType, actualOptionIdResult.getReferenceDataType());
    assertEquals(EtdIdUtils.ETD_SCHEME, standardId.getScheme());
  }

  /**
   * Test {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int,
   * PutCall, double, YearMonth)} with {@code exchangeId}, {@code contractCode}, {@code
   * expiryMonth}, {@code variant}, {@code version}, {@code putCall}, {@code strikePrice}, {@code
   * underlyingExpiryMonth}.
   *
   * <p>Method under test: {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth,
   * EtdVariant, int, PutCall, double, YearMonth)}
   */
  @Test
  @DisplayName(
      "Test optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double, YearMonth) with 'exchangeId', 'contractCode', 'expiryMonth', 'variant', 'version', 'putCall', 'strikePrice', 'underlyingExpiryMonth'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SecurityId EtdIdUtils.optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double, YearMonth)"
  })
  void
      testOptionIdWithExchangeIdContractCodeExpiryMonthVariantVersionPutCallStrikePriceUnderlyingExpiryMonth3() {
    // Arrange and Act
    SecurityId actualOptionIdResult =
        EtdIdUtils.optionId(
            ExchangeIds.ECAG,
            EtdContractCode.of("Name"),
            YearMonth.of(1970, Month.JANUARY),
            EtdVariant.MONTHLY,
            0,
            PutCall.PUT,
            10.0d,
            null);

    // Assert
    StandardId standardId = actualOptionIdResult.getStandardId();
    assertEquals("O-ECAG-Name-197001-P10", standardId.getValue());
    Class<Security> expectedReferenceDataType = Security.class;
    assertEquals(expectedReferenceDataType, actualOptionIdResult.getReferenceDataType());
    assertEquals(EtdIdUtils.ETD_SCHEME, standardId.getScheme());
  }

  /**
   * Test {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int,
   * PutCall, double, YearMonth)} with {@code exchangeId}, {@code contractCode}, {@code
   * expiryMonth}, {@code variant}, {@code version}, {@code putCall}, {@code strikePrice}, {@code
   * underlyingExpiryMonth}.
   *
   * <p>Method under test: {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth,
   * EtdVariant, int, PutCall, double, YearMonth)}
   */
  @Test
  @DisplayName(
      "Test optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double, YearMonth) with 'exchangeId', 'contractCode', 'expiryMonth', 'variant', 'version', 'putCall', 'strikePrice', 'underlyingExpiryMonth'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SecurityId EtdIdUtils.optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double, YearMonth)"
  })
  void
      testOptionIdWithExchangeIdContractCodeExpiryMonthVariantVersionPutCallStrikePriceUnderlyingExpiryMonth4() {
    // Arrange and Act
    SecurityId actualOptionIdResult =
        EtdIdUtils.optionId(
            ExchangeIds.ECAG,
            EtdContractCode.of("Name"),
            YearMonth.now(),
            EtdVariant.MONTHLY,
            1,
            PutCall.PUT,
            10.0d,
            YearMonth.of(1970, Month.JANUARY));

    // Assert
    Class<Security> expectedReferenceDataType = Security.class;
    assertEquals(expectedReferenceDataType, actualOptionIdResult.getReferenceDataType());
    assertEquals(EtdIdUtils.ETD_SCHEME, actualOptionIdResult.getStandardId().getScheme());
  }

  /**
   * Test {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int,
   * PutCall, double, YearMonth)} with {@code exchangeId}, {@code contractCode}, {@code
   * expiryMonth}, {@code variant}, {@code version}, {@code putCall}, {@code strikePrice}, {@code
   * underlyingExpiryMonth}.
   *
   * <p>Method under test: {@link EtdIdUtils#optionId(ExchangeId, EtdContractCode, YearMonth,
   * EtdVariant, int, PutCall, double, YearMonth)}
   */
  @Test
  @DisplayName(
      "Test optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double, YearMonth) with 'exchangeId', 'contractCode', 'expiryMonth', 'variant', 'version', 'putCall', 'strikePrice', 'underlyingExpiryMonth'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SecurityId EtdIdUtils.optionId(ExchangeId, EtdContractCode, YearMonth, EtdVariant, int, PutCall, double, YearMonth)"
  })
  void
      testOptionIdWithExchangeIdContractCodeExpiryMonthVariantVersionPutCallStrikePriceUnderlyingExpiryMonth5() {
    // Arrange and Act
    SecurityId actualOptionIdResult =
        EtdIdUtils.optionId(
            ExchangeIds.ECAG,
            EtdContractCode.of("Name"),
            YearMonth.of(1970, Month.JANUARY),
            EtdVariant.MONTHLY,
            1,
            PutCall.CALL,
            10.0d,
            YearMonth.of(1970, Month.JANUARY));

    // Assert
    StandardId standardId = actualOptionIdResult.getStandardId();
    assertEquals("O-ECAG-Name-197001-V1-C10", standardId.getValue());
    Class<Security> expectedReferenceDataType = Security.class;
    assertEquals(expectedReferenceDataType, actualOptionIdResult.getReferenceDataType());
    assertEquals(EtdIdUtils.ETD_SCHEME, standardId.getScheme());
  }

  /**
   * Test {@link EtdIdUtils#splitId(EtdContractSpecId)} with {@code specId}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link EtdIdUtils#splitId(EtdContractSpecId)}
   */
  @Test
  @DisplayName(
      "Test splitId(EtdContractSpecId) with 'specId'; when StandardId with 'Scheme' and value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.product.etd.SplitEtdContractSpecId EtdIdUtils.splitId(EtdContractSpecId)"
  })
  void testSplitIdWithSpecId_whenStandardIdWithSchemeAndValueIs42() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> EtdIdUtils.splitId(EtdContractSpecId.of(StandardId.of("Scheme", "42"))));
  }

  /**
   * Test {@link EtdIdUtils#splitId(EtdContractSpecId)} with {@code specId}.
   *
   * <ul>
   *   <li>When {@link StandardId} with scheme is {@link EtdIdUtils#ETD_SCHEME} and value is {@code
   *       42}.
   * </ul>
   *
   * <p>Method under test: {@link EtdIdUtils#splitId(EtdContractSpecId)}
   */
  @Test
  @DisplayName(
      "Test splitId(EtdContractSpecId) with 'specId'; when StandardId with scheme is ETD_SCHEME and value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.product.etd.SplitEtdContractSpecId EtdIdUtils.splitId(EtdContractSpecId)"
  })
  void testSplitIdWithSpecId_whenStandardIdWithSchemeIsEtd_schemeAndValueIs42() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> EtdIdUtils.splitId(EtdContractSpecId.of(StandardId.of(EtdIdUtils.ETD_SCHEME, "42"))));
  }

  /**
   * Test {@link EtdIdUtils#splitId(EtdContractSpecId)} with {@code specId}.
   *
   * <ul>
   *   <li>When {@link StandardId} with scheme is {@link EtdIdUtils#ETD_SCHEME} and value is {@link
   *       EtdIdUtils#ETD_SCHEME}.
   * </ul>
   *
   * <p>Method under test: {@link EtdIdUtils#splitId(EtdContractSpecId)}
   */
  @Test
  @DisplayName(
      "Test splitId(EtdContractSpecId) with 'specId'; when StandardId with scheme is ETD_SCHEME and value is ETD_SCHEME")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.product.etd.SplitEtdContractSpecId EtdIdUtils.splitId(EtdContractSpecId)"
  })
  void testSplitIdWithSpecId_whenStandardIdWithSchemeIsEtd_schemeAndValueIsEtd_scheme() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            EtdIdUtils.splitId(
                EtdContractSpecId.of(StandardId.of(EtdIdUtils.ETD_SCHEME, EtdIdUtils.ETD_SCHEME))));
  }
}
