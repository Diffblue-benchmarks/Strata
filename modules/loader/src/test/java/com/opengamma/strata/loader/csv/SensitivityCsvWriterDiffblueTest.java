package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.sensitivity.CurveSensitivities;
import java.io.CharArrayWriter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SensitivityCsvWriterDiffblueTest {
  /**
   * Test {@link SensitivityCsvWriter#write(CurveSensitivities, Appendable)} with {@code curveSens},
   * {@code output}.
   *
   * <ul>
   *   <li>When {@link CharArrayWriter#CharArrayWriter()}.
   *   <li>Then {@link CharArrayWriter#CharArrayWriter()} size is sixty.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvWriter#write(CurveSensitivities, Appendable)}
   */
  @Test
  @DisplayName(
      "Test write(CurveSensitivities, Appendable) with 'curveSens', 'output'; when CharArrayWriter(); then CharArrayWriter() size is sixty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SensitivityCsvWriter.write(CurveSensitivities, Appendable)"})
  void testWriteWithCurveSensOutput_whenCharArrayWriter_thenCharArrayWriterSizeIsSixty() {
    // Arrange
    SensitivityCsvWriter standardResult = SensitivityCsvWriter.standard();
    CurveSensitivities curveSens = CurveSensitivities.empty();
    CharArrayWriter output = new CharArrayWriter();

    // Act
    standardResult.write(curveSens, output);

    // Assert
    assertEquals(60, output.size());
  }
}
