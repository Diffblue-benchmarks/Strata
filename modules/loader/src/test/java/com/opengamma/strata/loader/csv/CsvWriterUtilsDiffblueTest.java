package com.opengamma.strata.loader.csv;

import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.io.CsvOutput;
import com.opengamma.strata.collect.io.CsvOutput.CsvRowOutputWithHeaders;
import com.opengamma.strata.product.option.Barrier;
import com.opengamma.strata.product.option.BarrierType;
import com.opengamma.strata.product.option.KnockType;
import com.opengamma.strata.product.option.SimpleConstantContinuousBarrier;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CsvWriterUtilsDiffblueTest {
  /**
   * Test {@link CsvWriterUtils#writeZonedDateTime(CsvRowOutputWithHeaders, ZonedDateTime, String,
   * String, String)}.
   *
   * <p>Method under test: {@link
   * CsvWriterUtils#writeZonedDateTime(CsvOutput.CsvRowOutputWithHeaders, ZonedDateTime, String,
   * String, String)}
   */
  @Test
  @DisplayName(
      "Test writeZonedDateTime(CsvRowOutputWithHeaders, ZonedDateTime, String, String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CsvWriterUtils.writeZonedDateTime(CsvOutput.CsvRowOutputWithHeaders, ZonedDateTime, String, String, String)"
  })
  void testWriteZonedDateTime() {
    // Arrange
    CsvRowOutputWithHeaders csv = mock(CsvRowOutputWithHeaders.class);
    when(csv.writeCell(Mockito.<String>any(), Mockito.<Object>any()))
        .thenReturn(mock(CsvRowOutputWithHeaders.class));

    // Act
    CsvWriterUtils.writeZonedDateTime(
        csv,
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC),
        "2020-03-01",
        "Time Field",
        "Zone Field");

    // Assert
    verify(csv, atLeast(1)).writeCell(Mockito.<String>any(), Mockito.<Object>any());
  }

  /**
   * Test {@link CsvWriterUtils#writeBarrier(CsvRowOutputWithHeaders, Barrier, LocalDate)}.
   *
   * <ul>
   *   <li>Then calls {@link CsvOutput.CsvRowOutputWithHeaders#writeCell(String, double)}.
   * </ul>
   *
   * <p>Method under test: {@link CsvWriterUtils#writeBarrier(CsvOutput.CsvRowOutputWithHeaders,
   * Barrier, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test writeBarrier(CsvRowOutputWithHeaders, Barrier, LocalDate); then calls writeCell(String, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CsvWriterUtils.writeBarrier(CsvOutput.CsvRowOutputWithHeaders, Barrier, LocalDate)"
  })
  void testWriteBarrier_thenCallsWriteCell() {
    // Arrange
    CsvRowOutputWithHeaders csv = mock(CsvRowOutputWithHeaders.class);
    when(csv.writeCell(Mockito.<String>any(), anyDouble()))
        .thenReturn(mock(CsvRowOutputWithHeaders.class));
    when(csv.writeCell(Mockito.<String>any(), Mockito.<Object>any()))
        .thenReturn(mock(CsvRowOutputWithHeaders.class));

    // Act
    CsvWriterUtils.writeBarrier(
        csv,
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d),
        LocalDate.of(1970, 1, 1));

    // Assert
    verify(csv).writeCell("Barrier Level", 10.0d);
    verify(csv, atLeast(1)).writeCell(Mockito.<String>any(), Mockito.<Object>any());
  }
}
