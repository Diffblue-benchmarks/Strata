package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ImmutableReferenceData;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.product.Trade;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeCsvInfoSupplierDiffblueTest {
  /**
   * Test {@link TradeCsvInfoSupplier#standard()}.
   *
   * <p>Method under test: {@link TradeCsvInfoSupplier#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeCsvInfoSupplier TradeCsvInfoSupplier.standard()"})
  void testStandard() {
    // Arrange and Act
    TradeCsvInfoSupplier actualStandardResult = TradeCsvInfoSupplier.standard();

    // Assert
    ReferenceData referenceData = ((StandardCsvInfoImpl) actualStandardResult).getReferenceData();
    assertTrue(referenceData instanceof ImmutableReferenceData);
    assertTrue(actualStandardResult instanceof StandardCsvInfoImpl);
    assertEquals(30, ((ImmutableReferenceData) referenceData).getValues().size());
    assertTrue(((StandardCsvInfoImpl) actualStandardResult).isTenorRequired());
  }

  /**
   * Test {@link TradeCsvInfoSupplier#headers(Trade)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoSupplier#headers(Trade)}
   */
  @Test
  @DisplayName("Test headers(Trade); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List TradeCsvInfoSupplier.headers(Trade)"})
  void testHeaders_whenNull_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(StandardCsvInfoImpl.INSTANCE.headers((Trade) null).isEmpty());
  }

  /**
   * Test {@link TradeCsvInfoSupplier#values(List, Trade)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoSupplier#values(List, Trade)}
   */
  @Test
  @DisplayName("Test values(List, Trade); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map TradeCsvInfoSupplier.values(List, Trade)"})
  void testValues_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("42");

    // Act and Assert
    assertTrue(StandardCsvInfoImpl.INSTANCE.values(headers, null).isEmpty());
  }

  /**
   * Test {@link TradeCsvInfoSupplier#values(List, Trade)}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link ArrayList#ArrayList()} add empty string.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoSupplier#values(List, Trade)}
   */
  @Test
  @DisplayName("Test values(List, Trade); given empty string; when ArrayList() add empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map TradeCsvInfoSupplier.values(List, Trade)"})
  void testValues_givenEmptyString_whenArrayListAddEmptyString() {
    // Arrange
    ArrayList<String> headers = new ArrayList<>();
    headers.add("");
    headers.add("42");

    // Act and Assert
    assertTrue(StandardCsvInfoImpl.INSTANCE.values(headers, null).isEmpty());
  }

  /**
   * Test {@link TradeCsvInfoSupplier#values(List, Trade)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoSupplier#values(List, Trade)}
   */
  @Test
  @DisplayName("Test values(List, Trade); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map TradeCsvInfoSupplier.values(List, Trade)"})
  void testValues_whenArrayList() {
    // Arrange, Act and Assert
    assertTrue(StandardCsvInfoImpl.INSTANCE.values(new ArrayList<>(), null).isEmpty());
  }
}
