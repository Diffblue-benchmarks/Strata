package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ImmutableReferenceData;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.market.param.CurrencyParameterSensitivity;
import com.opengamma.strata.market.sensitivity.CurveSensitivities;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SensitivityCsvInfoSupplierDiffblueTest {
  /**
   * Test {@link SensitivityCsvInfoSupplier#standard()}.
   *
   * <p>Method under test: {@link SensitivityCsvInfoSupplier#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SensitivityCsvInfoSupplier SensitivityCsvInfoSupplier.standard()"})
  void testStandard() {
    // Arrange and Act
    SensitivityCsvInfoSupplier actualStandardResult = SensitivityCsvInfoSupplier.standard();

    // Assert
    ReferenceData referenceData = ((StandardCsvInfoImpl) actualStandardResult).getReferenceData();
    assertTrue(referenceData instanceof ImmutableReferenceData);
    assertTrue(actualStandardResult instanceof StandardCsvInfoImpl);
    assertEquals(30, ((ImmutableReferenceData) referenceData).getValues().size());
    assertTrue(((StandardCsvInfoImpl) actualStandardResult).isTenorRequired());
  }

  /**
   * Test {@link SensitivityCsvInfoSupplier#headers(CurveSensitivities)}.
   *
   * <p>Method under test: {@link SensitivityCsvInfoSupplier#headers(CurveSensitivities)}
   */
  @Test
  @DisplayName("Test headers(CurveSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List SensitivityCsvInfoSupplier.headers(CurveSensitivities)"})
  void testHeaders() {
    // Arrange, Act and Assert
    assertTrue(StandardCsvInfoImpl.INSTANCE.headers(CurveSensitivities.empty()).isEmpty());
  }

  /**
   * Test {@link SensitivityCsvInfoSupplier#values(List, CurveSensitivities,
   * CurrencyParameterSensitivity)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvInfoSupplier#values(List, CurveSensitivities,
   * CurrencyParameterSensitivity)}
   */
  @Test
  @DisplayName(
      "Test values(List, CurveSensitivities, CurrencyParameterSensitivity); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List SensitivityCsvInfoSupplier.values(List, CurveSensitivities, CurrencyParameterSensitivity)"
  })
  void testValues_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<String> additionalHeaders = new ArrayList<>();
    additionalHeaders.add("42");
    additionalHeaders.add("foo");

    // Act and Assert
    assertTrue(
        StandardCsvInfoImpl.INSTANCE
            .values(additionalHeaders, CurveSensitivities.empty(), null)
            .isEmpty());
  }

  /**
   * Test {@link SensitivityCsvInfoSupplier#values(List, CurveSensitivities,
   * CurrencyParameterSensitivity)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvInfoSupplier#values(List, CurveSensitivities,
   * CurrencyParameterSensitivity)}
   */
  @Test
  @DisplayName(
      "Test values(List, CurveSensitivities, CurrencyParameterSensitivity); given 'foo'; when ArrayList() add 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List SensitivityCsvInfoSupplier.values(List, CurveSensitivities, CurrencyParameterSensitivity)"
  })
  void testValues_givenFoo_whenArrayListAddFoo() {
    // Arrange
    ArrayList<String> additionalHeaders = new ArrayList<>();
    additionalHeaders.add("foo");

    // Act and Assert
    assertTrue(
        StandardCsvInfoImpl.INSTANCE
            .values(additionalHeaders, CurveSensitivities.empty(), null)
            .isEmpty());
  }

  /**
   * Test {@link SensitivityCsvInfoSupplier#values(List, CurveSensitivities,
   * CurrencyParameterSensitivity)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvInfoSupplier#values(List, CurveSensitivities,
   * CurrencyParameterSensitivity)}
   */
  @Test
  @DisplayName(
      "Test values(List, CurveSensitivities, CurrencyParameterSensitivity); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List SensitivityCsvInfoSupplier.values(List, CurveSensitivities, CurrencyParameterSensitivity)"
  })
  void testValues_whenArrayList() {
    // Arrange
    ArrayList<String> additionalHeaders = new ArrayList<>();

    // Act and Assert
    assertTrue(
        StandardCsvInfoImpl.INSTANCE
            .values(additionalHeaders, CurveSensitivities.empty(), null)
            .isEmpty());
  }
}
