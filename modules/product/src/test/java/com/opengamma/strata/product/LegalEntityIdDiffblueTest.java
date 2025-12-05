package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LegalEntityIdDiffblueTest {
  /**
   * Test {@link LegalEntityId#of(String, String)} with {@code scheme}, {@code value}.
   *
   * <ul>
   *   <li>When {@code Scheme}.
   *   <li>Then return StandardId Value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityId#of(String, String)}
   */
  @Test
  @DisplayName(
      "Test of(String, String) with 'scheme', 'value'; when 'Scheme'; then return StandardId Value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegalEntityId LegalEntityId.of(String, String)"})
  void testOfWithSchemeValue_whenScheme_thenReturnStandardIdValueIs42() {
    // Arrange and Act
    LegalEntityId actualOfResult = LegalEntityId.of("Scheme", "42");

    // Assert
    StandardId standardId = actualOfResult.getStandardId();
    assertEquals("42", standardId.getValue());
    assertEquals("Scheme", standardId.getScheme());
    Class<LegalEntity> expectedReferenceDataType = LegalEntity.class;
    assertEquals(expectedReferenceDataType, actualOfResult.getReferenceDataType());
  }

  /**
   * Test {@link LegalEntityId#of(StandardId)} with {@code standardId}.
   *
   * <ul>
   *   <li>Then return ReferenceDataType is {@link LegalEntity}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityId#of(StandardId)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId) with 'standardId'; then return ReferenceDataType is LegalEntity")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegalEntityId LegalEntityId.of(StandardId)"})
  void testOfWithStandardId_thenReturnReferenceDataTypeIsLegalEntity() {
    // Arrange
    StandardId standardId = StandardId.of("Scheme", "42");

    // Act
    LegalEntityId actualOfResult = LegalEntityId.of(standardId);

    // Assert
    Class<LegalEntity> expectedReferenceDataType = LegalEntity.class;
    assertEquals(expectedReferenceDataType, actualOfResult.getReferenceDataType());
    assertSame(standardId, actualOfResult.getStandardId());
  }

  /**
   * Test {@link LegalEntityId#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Str~Str}.
   *   <li>Then return StandardId Scheme is {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityId#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Str~Str'; then return StandardId Scheme is 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegalEntityId LegalEntityId.parse(String)"})
  void testParse_whenStrStr_thenReturnStandardIdSchemeIsStr() {
    // Arrange and Act
    LegalEntityId actualParseResult = LegalEntityId.parse("Str~Str");

    // Assert
    StandardId standardId = actualParseResult.getStandardId();
    assertEquals("Str", standardId.getScheme());
    assertEquals("Str", standardId.getValue());
    Class<LegalEntity> expectedReferenceDataType = LegalEntity.class;
    assertEquals(expectedReferenceDataType, actualParseResult.getReferenceDataType());
  }
}
