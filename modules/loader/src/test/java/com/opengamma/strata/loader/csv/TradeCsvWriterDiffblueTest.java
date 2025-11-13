package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.Trade;
import java.io.CharArrayWriter;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeCsvWriterDiffblueTest {
  /**
   * Test {@link TradeCsvWriter#write(List, Appendable)}.
   *
   * <ul>
   *   <li>Given standard.
   *   <li>When {@link CharArrayWriter#CharArrayWriter()}.
   *   <li>Then {@link CharArrayWriter#CharArrayWriter()} size is eighteen.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvWriter#write(List, Appendable)}
   */
  @Test
  @DisplayName(
      "Test write(List, Appendable); given standard; when CharArrayWriter(); then CharArrayWriter() size is eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeCsvWriter.write(List, Appendable)"})
  void testWrite_givenStandard_whenCharArrayWriter_thenCharArrayWriterSizeIsEighteen() {
    // Arrange
    TradeCsvWriter standardResult = TradeCsvWriter.standard();
    ArrayList<Trade> trades = new ArrayList<>();
    CharArrayWriter output = new CharArrayWriter();

    // Act
    standardResult.write(trades, output);

    // Assert
    assertEquals(18, output.size());
  }

  /**
   * Test {@link TradeCsvWriter#write(List, Appendable)}.
   *
   * <ul>
   *   <li>Given {@link TradeCsvWriter} with supplier is {@link StandardCsvInfoImpl#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvWriter#write(List, Appendable)}
   */
  @Test
  @DisplayName("Test write(List, Appendable); given TradeCsvWriter with supplier is INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeCsvWriter.write(List, Appendable)"})
  void testWrite_givenTradeCsvWriterWithSupplierIsInstance() {
    // Arrange
    TradeCsvWriter ofResult = TradeCsvWriter.of(StandardCsvInfoImpl.INSTANCE);
    ArrayList<Trade> trades = new ArrayList<>();
    CharArrayWriter output = new CharArrayWriter();

    // Act
    ofResult.write(trades, output);

    // Assert
    assertEquals(18, output.size());
  }
}
