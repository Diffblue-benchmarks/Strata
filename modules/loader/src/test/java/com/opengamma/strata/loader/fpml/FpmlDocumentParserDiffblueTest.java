package com.opengamma.strata.loader.fpml;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.io.ByteSource;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.collect.io.ArrayByteSource;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FpmlDocumentParserDiffblueTest {
  /**
   * Test {@link FpmlDocumentParser#isKnownFormat(ByteSource)}.
   *
   * <ul>
   *   <li>When fromBase64 {@code Base64}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FpmlDocumentParser#isKnownFormat(ByteSource)}
   */
  @Test
  @DisplayName("Test isKnownFormat(ByteSource); when fromBase64 'Base64'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FpmlDocumentParser.isKnownFormat(ByteSource)"})
  void testIsKnownFormat_whenFromBase64Base64_thenReturnFalse() {
    // Arrange
    FpmlPartySelector ourPartySelector = mock(FpmlPartySelector.class);
    FpmlTradeInfoParserPlugin tradeInfoParser = mock(FpmlTradeInfoParserPlugin.class);

    FpmlDocumentParser ofResult =
        FpmlDocumentParser.of(
            ourPartySelector, tradeInfoParser, new HashMap<>(), mock(ReferenceData.class));

    // Act and Assert
    assertFalse(ofResult.isKnownFormat(ArrayByteSource.fromBase64("Base64")));
  }

  /**
   * Test {@link FpmlDocumentParser#isKnownFormat(ByteSource)}.
   *
   * <ul>
   *   <li>When fromHex {@code 0123456789ABCDEF}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FpmlDocumentParser#isKnownFormat(ByteSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(ByteSource); when fromHex '0123456789ABCDEF'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FpmlDocumentParser.isKnownFormat(ByteSource)"})
  void testIsKnownFormat_whenFromHex0123456789abcdef_thenReturnFalse() {
    // Arrange
    FpmlPartySelector ourPartySelector = mock(FpmlPartySelector.class);
    FpmlTradeInfoParserPlugin tradeInfoParser = mock(FpmlTradeInfoParserPlugin.class);

    FpmlDocumentParser ofResult =
        FpmlDocumentParser.of(
            ourPartySelector, tradeInfoParser, new HashMap<>(), mock(ReferenceData.class));

    // Act and Assert
    assertFalse(ofResult.isKnownFormat(ArrayByteSource.fromHex("0123456789ABCDEF")));
  }

  /**
   * Test {@link FpmlDocumentParser#isKnownFormat(ByteSource)}.
   *
   * <ul>
   *   <li>When ofUtf8 {@code offset (%s) may not be negative}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FpmlDocumentParser#isKnownFormat(ByteSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(ByteSource); when ofUtf8 'offset (%s) may not be negative'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FpmlDocumentParser.isKnownFormat(ByteSource)"})
  void testIsKnownFormat_whenOfUtf8OffsetSMayNotBeNegative_thenReturnFalse() {
    // Arrange
    FpmlPartySelector ourPartySelector = mock(FpmlPartySelector.class);
    FpmlTradeInfoParserPlugin tradeInfoParser = mock(FpmlTradeInfoParserPlugin.class);

    FpmlDocumentParser ofResult =
        FpmlDocumentParser.of(
            ourPartySelector, tradeInfoParser, new HashMap<>(), mock(ReferenceData.class));

    // Act and Assert
    assertFalse(ofResult.isKnownFormat(ArrayByteSource.ofUtf8("offset (%s) may not be negative")));
  }
}
