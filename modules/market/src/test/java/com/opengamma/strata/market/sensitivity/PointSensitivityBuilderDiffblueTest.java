package com.opengamma.strata.market.sensitivity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PointSensitivityBuilderDiffblueTest {
  /**
   * Test {@link PointSensitivityBuilder#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link NoPointSensitivity}.
   * </ul>
   *
   * <p>Method under test: {@link PointSensitivityBuilder#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return NoPointSensitivity")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivityBuilder PointSensitivityBuilder.of(List)"})
  void testOfWithList_whenArrayList_thenReturnNoPointSensitivity() {
    // Arrange
    ArrayList<PointSensitivity> sensitivities = new ArrayList<>();

    // Act
    PointSensitivityBuilder actualOfResult = PointSensitivityBuilder.of(sensitivities);

    // Assert
    assertTrue(actualOfResult instanceof NoPointSensitivity);
    PointSensitivities pointSensitivities = actualOfResult.build();
    MutablePointSensitivities toMutableResult = pointSensitivities.toMutable();
    assertEquals(0, toMutableResult.size());
    assertEquals(0, pointSensitivities.size());
    ImmutableList<PointSensitivity> sensitivities2 = pointSensitivities.getSensitivities();
    assertEquals(sensitivities, sensitivities2);
    assertSame(sensitivities2, toMutableResult.getSensitivities());
  }

  /**
   * Test {@link PointSensitivityBuilder#of(PointSensitivity[])} with {@code PointSensitivity[]}.
   *
   * <ul>
   *   <li>Then return {@link NoPointSensitivity}.
   * </ul>
   *
   * <p>Method under test: {@link PointSensitivityBuilder#of(PointSensitivity[])}
   */
  @Test
  @DisplayName(
      "Test of(PointSensitivity[]) with 'PointSensitivity[]'; then return NoPointSensitivity")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivityBuilder PointSensitivityBuilder.of(PointSensitivity[])"})
  void testOfWithPointSensitivity_thenReturnNoPointSensitivity() {
    // Arrange and Act
    PointSensitivityBuilder actualOfResult = PointSensitivityBuilder.of();

    // Assert
    assertTrue(actualOfResult instanceof NoPointSensitivity);
    PointSensitivities pointSensitivities = actualOfResult.build();
    MutablePointSensitivities toMutableResult = pointSensitivities.toMutable();
    assertEquals(0, toMutableResult.size());
    assertEquals(0, pointSensitivities.size());
    ImmutableList<PointSensitivity> sensitivities = pointSensitivities.getSensitivities();
    assertTrue(sensitivities.isEmpty());
    assertSame(sensitivities, toMutableResult.getSensitivities());
  }

  /**
   * Test {@link PointSensitivityBuilder#multipliedBy(double)}.
   *
   * <ul>
   *   <li>Given {@link NoPointSensitivity#INSTANCE}.
   *   <li>Then return {@link NoPointSensitivity#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link PointSensitivityBuilder#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double); given INSTANCE; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivityBuilder PointSensitivityBuilder.multipliedBy(double)"})
  void testMultipliedBy_givenInstance_thenReturnInstance() {
    // Arrange and Act
    PointSensitivityBuilder actualMultipliedByResult =
        NoPointSensitivity.INSTANCE.multipliedBy(10.0d);

    // Assert
    assertSame(((NoPointSensitivity) actualMultipliedByResult).INSTANCE, actualMultipliedByResult);
  }

  /**
   * Test {@link PointSensitivityBuilder#build()}.
   *
   * <p>Method under test: {@link PointSensitivityBuilder#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivities PointSensitivityBuilder.build()"})
  void testBuild() {
    // Arrange and Act
    PointSensitivities actualPointSensitivities = PointSensitivityBuilder.none().build();

    // Assert
    MutablePointSensitivities toMutableResult = actualPointSensitivities.toMutable();
    assertEquals(0, toMutableResult.size());
    assertEquals(0, actualPointSensitivities.size());
    assertSame(actualPointSensitivities.getSensitivities(), toMutableResult.getSensitivities());
  }
}
