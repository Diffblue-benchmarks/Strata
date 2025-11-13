package com.opengamma.strata.pricer.sensitivity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveSensitivityUtilsDiffblueTest {
  /**
   * Test {@link CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List,
   * LocalDate)} with {@code sensitivities}, {@code targetDates}, {@code sensitivityDate}.
   *
   * <p>Method under test: {@link
   * CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test linearRebucketing(CurrencyParameterSensitivities, List, LocalDate) with 'sensitivities', 'targetDates', 'sensitivityDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurveSensitivityUtils.linearRebucketing(CurrencyParameterSensitivities, List, LocalDate)"
  })
  void testLinearRebucketingWithSensitivitiesTargetDatesSensitivityDate() {
    // Arrange
    CurrencyParameterSensitivities sensitivities = CurrencyParameterSensitivities.empty();

    ArrayList<LocalDate> targetDates = new ArrayList<>();
    targetDates.add(LocalDate.ofYearDay(1, 1));
    targetDates.add(LocalDate.of(1970, 1, 1));

    // Act
    CurrencyParameterSensitivities actualLinearRebucketingResult =
        CurveSensitivityUtils.linearRebucketing(
            sensitivities, targetDates, LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals(sensitivities, actualLinearRebucketingResult);
  }

  /**
   * Test {@link CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List,
   * LocalDate)} with {@code sensitivities}, {@code targetDates}, {@code sensitivityDate}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test linearRebucketing(CurrencyParameterSensitivities, List, LocalDate) with 'sensitivities', 'targetDates', 'sensitivityDate'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurveSensitivityUtils.linearRebucketing(CurrencyParameterSensitivities, List, LocalDate)"
  })
  void testLinearRebucketingWithSensitivitiesTargetDatesSensitivityDate_thenReturnEmpty() {
    // Arrange
    CurrencyParameterSensitivities sensitivities = CurrencyParameterSensitivities.empty();

    ArrayList<LocalDate> targetDates = new ArrayList<>();
    targetDates.add(LocalDate.of(1970, 1, 1));

    // Act
    CurrencyParameterSensitivities actualLinearRebucketingResult =
        CurveSensitivityUtils.linearRebucketing(
            sensitivities, targetDates, LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals(sensitivities, actualLinearRebucketingResult);
  }

  /**
   * Test {@link CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List,
   * LocalDate)} with {@code sensitivities}, {@code targetDates}, {@code sensitivityDate}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test linearRebucketing(CurrencyParameterSensitivities, List, LocalDate) with 'sensitivities', 'targetDates', 'sensitivityDate'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurveSensitivityUtils.linearRebucketing(CurrencyParameterSensitivities, List, LocalDate)"
  })
  void testLinearRebucketingWithSensitivitiesTargetDatesSensitivityDate_whenArrayList() {
    // Arrange
    CurrencyParameterSensitivities sensitivities = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualLinearRebucketingResult =
        CurveSensitivityUtils.linearRebucketing(
            sensitivities, new ArrayList<>(), LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals(sensitivities, actualLinearRebucketingResult);
  }

  /**
   * Test {@link CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List)} with
   * {@code sensitivities}, {@code targetDates}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List)}
   */
  @Test
  @DisplayName(
      "Test linearRebucketing(CurrencyParameterSensitivities, List) with 'sensitivities', 'targetDates'; given ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurveSensitivityUtils.linearRebucketing(CurrencyParameterSensitivities, List)"
  })
  void testLinearRebucketingWithSensitivitiesTargetDates_givenArrayList() {
    // Arrange
    CurrencyParameterSensitivities sensitivities = CurrencyParameterSensitivities.empty();

    ArrayList<LocalDate> targetDates = new ArrayList<>();
    targetDates.addAll(new ArrayList<>());
    targetDates.add(LocalDate.of(1970, 1, 1));

    // Act
    CurrencyParameterSensitivities actualLinearRebucketingResult =
        CurveSensitivityUtils.linearRebucketing(sensitivities, targetDates);

    // Assert
    assertEquals(sensitivities, actualLinearRebucketingResult);
  }

  /**
   * Test {@link CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List)} with
   * {@code sensitivities}, {@code targetDates}.
   *
   * <ul>
   *   <li>Given ofYearDay one and one.
   * </ul>
   *
   * <p>Method under test: {@link
   * CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List)}
   */
  @Test
  @DisplayName(
      "Test linearRebucketing(CurrencyParameterSensitivities, List) with 'sensitivities', 'targetDates'; given ofYearDay one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurveSensitivityUtils.linearRebucketing(CurrencyParameterSensitivities, List)"
  })
  void testLinearRebucketingWithSensitivitiesTargetDates_givenOfYearDayOneAndOne() {
    // Arrange
    CurrencyParameterSensitivities sensitivities = CurrencyParameterSensitivities.empty();

    ArrayList<LocalDate> targetDates = new ArrayList<>();
    targetDates.add(LocalDate.ofYearDay(1, 1));
    targetDates.add(LocalDate.of(1970, 1, 1));

    // Act
    CurrencyParameterSensitivities actualLinearRebucketingResult =
        CurveSensitivityUtils.linearRebucketing(sensitivities, targetDates);

    // Assert
    assertEquals(sensitivities, actualLinearRebucketingResult);
  }

  /**
   * Test {@link CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List)} with
   * {@code sensitivities}, {@code targetDates}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List)}
   */
  @Test
  @DisplayName(
      "Test linearRebucketing(CurrencyParameterSensitivities, List) with 'sensitivities', 'targetDates'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurveSensitivityUtils.linearRebucketing(CurrencyParameterSensitivities, List)"
  })
  void testLinearRebucketingWithSensitivitiesTargetDates_thenReturnEmpty() {
    // Arrange
    CurrencyParameterSensitivities sensitivities = CurrencyParameterSensitivities.empty();

    ArrayList<LocalDate> targetDates = new ArrayList<>();
    targetDates.add(LocalDate.of(1970, 1, 1));

    // Act
    CurrencyParameterSensitivities actualLinearRebucketingResult =
        CurveSensitivityUtils.linearRebucketing(sensitivities, targetDates);

    // Assert
    assertEquals(sensitivities, actualLinearRebucketingResult);
  }

  /**
   * Test {@link CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List)} with
   * {@code sensitivities}, {@code targetDates}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * CurveSensitivityUtils#linearRebucketing(CurrencyParameterSensitivities, List)}
   */
  @Test
  @DisplayName(
      "Test linearRebucketing(CurrencyParameterSensitivities, List) with 'sensitivities', 'targetDates'; when ArrayList(); then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurveSensitivityUtils.linearRebucketing(CurrencyParameterSensitivities, List)"
  })
  void testLinearRebucketingWithSensitivitiesTargetDates_whenArrayList_thenReturnEmpty() {
    // Arrange
    CurrencyParameterSensitivities sensitivities = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualLinearRebucketingResult =
        CurveSensitivityUtils.linearRebucketing(sensitivities, new ArrayList<>());

    // Assert
    assertEquals(sensitivities, actualLinearRebucketingResult);
  }
}
