package com.opengamma.strata.market.param;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ParameterizedDataDiffblueTest {
  /**
   * Test {@link ParameterizedData#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Given {@link TestingParameterizedData#TestingParameterizedData(double)} with value is
   *       zero.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedData#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName(
      "Test withPerturbation(ParameterPerturbation); given TestingParameterizedData(double) with value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterizedData ParameterizedData.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation_givenTestingParameterizedDataWithValueIsZero() {
    // Arrange
    TestingParameterizedData testingParameterizedData = new TestingParameterizedData(0.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    ParameterizedData actualWithPerturbationResult =
        testingParameterizedData.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(0.0d), isA(ParameterMetadata.class));
    assertTrue(actualWithPerturbationResult instanceof TestingParameterizedData);
    assertEquals(1, actualWithPerturbationResult.getParameterCount());
  }

  /**
   * Test {@link ParameterizedData#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Then return {@link TestingParameterizedData#TestingParameterizedData(double)} with value
   *       is ten.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedData#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName(
      "Test withPerturbation(ParameterPerturbation); then return TestingParameterizedData(double) with value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterizedData ParameterizedData.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation_thenReturnTestingParameterizedDataWithValueIsTen() {
    // Arrange
    TestingParameterizedData testingParameterizedData = new TestingParameterizedData(10.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    ParameterizedData actualWithPerturbationResult =
        testingParameterizedData.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
    assertTrue(actualWithPerturbationResult instanceof TestingParameterizedData);
    assertEquals(1, actualWithPerturbationResult.getParameterCount());
    assertSame(testingParameterizedData, actualWithPerturbationResult);
  }
}
