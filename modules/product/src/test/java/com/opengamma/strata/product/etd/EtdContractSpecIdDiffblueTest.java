package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdContractSpecIdDiffblueTest {
  /**
   * Test {@link EtdContractSpecId#of(String, String)} with {@code scheme}, {@code value}.
   *
   * <ul>
   *   <li>When {@code Scheme}.
   *   <li>Then return StandardId Value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractSpecId#of(String, String)}
   */
  @Test
  @DisplayName(
      "Test of(String, String) with 'scheme', 'value'; when 'Scheme'; then return StandardId Value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractSpecId EtdContractSpecId.of(String, String)"})
  void testOfWithSchemeValue_whenScheme_thenReturnStandardIdValueIs42() {
    // Arrange and Act
    EtdContractSpecId actualOfResult = EtdContractSpecId.of("Scheme", "42");

    // Assert
    StandardId standardId = actualOfResult.getStandardId();
    assertEquals("42", standardId.getValue());
    assertEquals("Scheme", standardId.getScheme());
    Class<EtdContractSpec> expectedReferenceDataType = EtdContractSpec.class;
    assertEquals(expectedReferenceDataType, actualOfResult.getReferenceDataType());
  }

  /**
   * Test {@link EtdContractSpecId#of(StandardId)} with {@code standardId}.
   *
   * <ul>
   *   <li>Then return ReferenceDataType is {@link EtdContractSpec}.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractSpecId#of(StandardId)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId) with 'standardId'; then return ReferenceDataType is EtdContractSpec")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractSpecId EtdContractSpecId.of(StandardId)"})
  void testOfWithStandardId_thenReturnReferenceDataTypeIsEtdContractSpec() {
    // Arrange
    StandardId standardId = StandardId.of("Scheme", "42");

    // Act
    EtdContractSpecId actualOfResult = EtdContractSpecId.of(standardId);

    // Assert
    Class<EtdContractSpec> expectedReferenceDataType = EtdContractSpec.class;
    assertEquals(expectedReferenceDataType, actualOfResult.getReferenceDataType());
    assertSame(standardId, actualOfResult.getStandardId());
  }

  /**
   * Test {@link EtdContractSpecId#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Str~Str}.
   *   <li>Then return StandardId Scheme is {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractSpecId#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Str~Str'; then return StandardId Scheme is 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractSpecId EtdContractSpecId.parse(String)"})
  void testParse_whenStrStr_thenReturnStandardIdSchemeIsStr() {
    // Arrange and Act
    EtdContractSpecId actualParseResult = EtdContractSpecId.parse("Str~Str");

    // Assert
    StandardId standardId = actualParseResult.getStandardId();
    assertEquals("Str", standardId.getScheme());
    assertEquals("Str", standardId.getValue());
    Class<EtdContractSpec> expectedReferenceDataType = EtdContractSpec.class;
    assertEquals(expectedReferenceDataType, actualParseResult.getReferenceDataType());
  }
}
