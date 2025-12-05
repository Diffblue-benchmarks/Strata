package com.opengamma.strata.pricer.impl.option;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.product.option.BarrierType;
import com.opengamma.strata.product.option.KnockType;
import com.opengamma.strata.product.option.SimpleConstantContinuousBarrier;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BlackBarrierPriceFormulaRepositoryDiffblueTest {
  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        Double.NaN,
        blackBarrierPriceFormulaRepository.price(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, -0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice2() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        Double.NaN,
        blackBarrierPriceFormulaRepository.price(
            Double.NaN,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice3() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackBarrierPriceFormulaRepository.price(
            10.0d,
            10.0d,
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice4() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackBarrierPriceFormulaRepository.price(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            false,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice5() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        Double.NaN,
        blackBarrierPriceFormulaRepository.price(
            Double.NaN,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            false,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice6() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        Double.NaN,
        blackBarrierPriceFormulaRepository.price(
            Double.NaN,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 10.0d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice7() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackBarrierPriceFormulaRepository.price(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_OUT, 10.0d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice8() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackBarrierPriceFormulaRepository.price(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            false,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice9() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackBarrierPriceFormulaRepository.price(
            Double.NaN,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            false,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 10.0d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice10() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackBarrierPriceFormulaRepository.price(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_OUT, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 1.0E-6}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return '1.0E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn10e6() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        1.0E-6d,
        blackBarrierPriceFormulaRepository.price(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 1.0E-6}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return '1.0E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn10e62() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        1.0E-6d,
        blackBarrierPriceFormulaRepository.price(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 9.34440836835149E-49}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return '9.34440836835149E-49'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn934440836835149e49() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        9.34440836835149E-49d,
        blackBarrierPriceFormulaRepository.price(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            false,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 9.72535986417347}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return '9.72535986417347'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn972535986417347() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        9.72535986417347d,
        blackBarrierPriceFormulaRepository.price(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 3.720066631612468E-43}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return '3.720066631612468E-43'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn3720066631612468e43() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        3.720066631612468E-43d,
        blackBarrierPriceFormulaRepository.price(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            false,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_OUT, 10.0d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 9.999950000150193E-5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return '9.999950000150193E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn9999950000150193e5() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        9.999950000150193E-5d,
        blackBarrierPriceFormulaRepository.price(
            10.0d,
            10.0d,
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 1.0265398334010447E-47}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return '1.0265398334010447E-47'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn10265398334010447e47() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        1.0265398334010447E-47d,
        blackBarrierPriceFormulaRepository.price(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            false,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 0.27464013582652946}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return '0.27464013582652946'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn027464013582652946() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.27464013582652946d,
        blackBarrierPriceFormulaRepository.price(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 9.64211927921248E-7}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); when '0.5'; then return '9.64211927921248E-7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when05_thenReturn964211927921248e7() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        9.64211927921248E-7d,
        blackBarrierPriceFormulaRepository.price(
            1.0E-6d,
            10.0d,
            0.5d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.2744582339809216}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); when '0.5'; then return '0.2744582339809216'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when05_thenReturn02744582339809216() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.2744582339809216d,
        blackBarrierPriceFormulaRepository.price(
            10.0d,
            10.0d,
            0.5d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); when '-0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when05_thenReturnZero() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackBarrierPriceFormulaRepository.price(
            10.0d,
            10.0d,
            -0.5d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#price(double, double, double, double, double,
   * double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-6}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#price(double, double, double,
   * double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); when '-1.0E-6'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackBarrierPriceFormulaRepository.price(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when10e6_thenReturnZero() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackBarrierPriceFormulaRepository.price(
            10.0d,
            10.0d,
            -1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d)));
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, -0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(Double.NaN, actualPriceAdjointResult.getValue());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(5).doubleValue());
    assertEquals(Double.NaN, toListResult.get(6).doubleValue());
    assertArrayEquals(
        new double[] {
          Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint2() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            Double.NaN,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(Double.NaN, actualPriceAdjointResult.getValue());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(5).doubleValue());
    assertEquals(Double.NaN, toListResult.get(6).doubleValue());
    assertArrayEquals(
        new double[] {
          Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint3() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-4.5154519673174097E-97d, toListResult.get(1).doubleValue());
    assertEquals(-9.999999999999999E-6d, derivatives.min());
    assertEquals(1.0E-6d, actualPriceAdjointResult.getValue());
    assertEquals(1.0d, derivatives.max());
    assertEquals(1.0d, derivatives.sum());
    assertEquals(1.178935345607066E-70d, toListResult.get(6).doubleValue());
    assertEquals(5.894676728035336E-81d, toListResult.get(5).doubleValue());
    assertArrayEquals(
        new double[] {
          1.0d,
          -4.5154519673174097E-97d,
          -9.999999999999999E-6d,
          9.999999999999999E-6d,
          1.1789353456070663E-80d,
          5.894676728035336E-81d,
          1.178935345607066E-70d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint4() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            10.0d,
            10.0d,
            0.5d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-0.0054979417767746265d, toListResult.get(0).doubleValue());
    assertEquals(-0.1372291169904608d, derivatives.min());
    assertEquals(-8.777097156190424E-6d, toListResult.get(1).doubleValue());
    assertEquals(0.00330903590953411d, toListResult.get(5).doubleValue());
    assertEquals(0.015192940037040614d, derivatives.sum());
    assertEquals(0.12082893469065618d, derivatives.max());
    assertEquals(0.2744582339809216d, actualPriceAdjointResult.getValue());
    assertEquals(6.595371106792433E-4d, toListResult.get(6).doubleValue());
    assertArrayEquals(
        new double[] {
          -0.0054979417767746265d,
          -8.777097156190424E-6d,
          -0.1372291169904608d,
          0.12082893469065618d,
          0.033131268190562696d,
          0.00330903590953411d,
          6.595371106792433E-4d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint5() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-6.591363259836709E-4d, toListResult.get(6).doubleValue());
    assertEquals(-6.758259531091912E-82d, toListResult.get(1).doubleValue());
    assertEquals(-97.2535986417347d, derivatives.min());
    assertEquals(0.9883787000203729d, derivatives.sum());
    assertEquals(1.0054928027165306d, toListResult.get(0).doubleValue());
    assertEquals(1.4292120678807908E-79d, toListResult.get(5).doubleValue());
    assertEquals(9.72535986417347d, actualPriceAdjointResult.getValue());
    assertEquals(97.27005360810487d, derivatives.max());
    assertArrayEquals(
        new double[] {
          1.0054928027165306d,
          -6.758259531091912E-82d,
          -97.2535986417347d,
          97.27005360810487d,
          -0.03290993274035144d,
          1.4292120678807908E-79d,
          -6.591363259836709E-4d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint6() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            Double.NaN,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            false,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(Double.NaN, actualPriceAdjointResult.getValue());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(5).doubleValue());
    assertEquals(Double.NaN, toListResult.get(6).doubleValue());
    assertArrayEquals(
        new double[] {
          Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint7() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            Double.NaN,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 10.0d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(Double.NaN, actualPriceAdjointResult.getValue());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(5).doubleValue());
    assertEquals(Double.NaN, toListResult.get(6).doubleValue());
    assertArrayEquals(
        new double[] {
          Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint8() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            1.0E-6d,
            10.0d,
            0.5d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-1.0976471153494258E-9d, toListResult.get(1).doubleValue());
    assertEquals(-4.82105963960624E-7d, derivatives.min());
    assertEquals(0.9751883990747424d, toListResult.get(0).doubleValue());
    assertEquals(5.204205817143075E-7d, toListResult.get(5).doubleValue());
    assertEquals(8213.117403587308d, derivatives.max());
    assertEquals(8213.117403587308d, toListResult.get(6).doubleValue());
    assertEquals(8214.09259255226d, derivatives.sum());
    assertEquals(9.64211927921248E-7d, actualPriceAdjointResult.getValue());
    assertArrayEquals(
        new double[] {
          0.9751883990747424d,
          -1.0976471153494258E-9d,
          -4.82105963960624E-7d,
          4.875941995373712E-7d,
          4.106558701793655E-8d,
          5.204205817143075E-7d,
          8213.117403587308d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint9() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-2.8170883735278278E-83d, toListResult.get(1).doubleValue());
    assertEquals(-9.999999999999999E-6d, derivatives.min());
    assertEquals(1.0E-6d, actualPriceAdjointResult.getValue());
    assertEquals(1.0d, derivatives.max());
    assertEquals(1.0d, derivatives.sum());
    assertEquals(1.178935345607066E-70d, toListResult.get(6).doubleValue());
    assertEquals(8.711765101563158E-81d, toListResult.get(5).doubleValue());
    assertArrayEquals(
        new double[] {
          1.0d,
          -2.8170883735278278E-83d,
          -9.999999999999999E-6d,
          9.999999999999999E-6d,
          1.178935345607066E-80d,
          8.711765101563158E-81d,
          1.178935345607066E-70d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint10() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    DoubleArray derivatives =
        blackBarrierPriceFormulaRepository
            .priceAdjoint(
                10.0d,
                10.0d,
                10.0d,
                10.0d,
                10.0d,
                10.0d,
                false,
                SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d))
            .getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-1.0629032373830294E-81d, toListResult.get(6).doubleValue());
    assertEquals(-4.8563552642405595E-80d, derivatives.min());
    assertEquals(-4.8563552642405595E-80d, toListResult.get(1).doubleValue());
    assertEquals(4.852152489362027E-78d, toListResult.get(5).doubleValue());
    assertEquals(4.856355264240558E-78d, derivatives.max());
    assertEquals(5.31031341203661E-80d, toListResult.get(0).doubleValue());
    assertEquals(9.703578882086058E-78d, derivatives.sum());
    assertArrayEquals(
        new double[] {
          5.31031341203661E-80d,
          -4.8563552642405595E-80d,
          4.856355264240558E-78d,
          4.1538604956788514E-92d,
          -8.405549757146087E-81d,
          4.852152489362027E-78d,
          -1.0629032373830294E-81d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint11() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    DoubleArray derivatives =
        blackBarrierPriceFormulaRepository
            .priceAdjoint(
                Double.NaN,
                10.0d,
                10.0d,
                10.0d,
                10.0d,
                10.0d,
                false,
                SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 10.0d))
            .getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(5).doubleValue());
    assertEquals(Double.NaN, toListResult.get(6).doubleValue());
    assertArrayEquals(
        new double[] {
          Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint12() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            false,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-1.0265398334010446E-46d, toListResult.get(5).doubleValue());
    assertEquals(-1.6424555213299798E-36d, derivatives.sum());
    assertEquals(-1.6424637334416714E-36d, derivatives.min());
    assertEquals(-1.6424637334416714E-36d, toListResult.get(6).doubleValue());
    assertEquals(1.0265398334010446E-48d, toListResult.get(1).doubleValue());
    assertEquals(1.0265398334010447E-47d, actualPriceAdjointResult.getValue());
    assertEquals(8.212318667208359E-42d, derivatives.max());
    assertEquals(8.212318667208359E-42d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {
          8.212318667208359E-42d,
          1.0265398334010446E-48d,
          -1.0265398334010446E-46d,
          2.6941257430537216E-48d,
          -5.388251486107443E-48d,
          -1.0265398334010446E-46d,
          -1.6424637334416714E-36d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives max is zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return Derivatives max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesMaxIsZero() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    DoubleArray derivatives =
        blackBarrierPriceFormulaRepository
            .priceAdjoint(
                10.0d,
                10.0d,
                1.0E-6d,
                10.0d,
                10.0d,
                10.0d,
                true,
                SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d))
            .getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return Derivatives min is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesMinIs00() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    DoubleArray derivatives =
        blackBarrierPriceFormulaRepository
            .priceAdjoint(
                1.0E-6d,
                10.0d,
                10.0d,
                10.0d,
                10.0d,
                10.0d,
                true,
                SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_OUT, 10.0d))
            .getDerivatives();
    assertEquals(-0.0d, derivatives.min());
    assertEquals(4.012090108665633E-97d, derivatives.max());
    assertEquals(4.012090108665633E-97d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(4.012090108665633E-97d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {0.0d, 4.012090108665633E-97d, -0.0d, 0.0d, 0.0d, 0.0d, 0.0d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code -3.720075976020836E-42}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return Derivatives min is '-3.720075976020836E-42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesMinIs3720075976020836e42() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    DoubleArray derivatives =
        blackBarrierPriceFormulaRepository
            .priceAdjoint(
                10.0d,
                10.0d,
                10.0d,
                10.0d,
                10.0d,
                10.0d,
                false,
                SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d))
            .getDerivatives();
    assertEquals(-3.720075976020836E-42d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-3.720075976020836E-42d, toListResult.get(5).doubleValue());
    assertEquals(-5.310313412036586E-80d, toListResult.get(0).doubleValue());
    assertEquals(-7.402951192281462E-42d, derivatives.sum());
    assertEquals(1.909942074204187E-81d, toListResult.get(6).doubleValue());
    assertEquals(3.720075976020836E-44d, derivatives.max());
    assertEquals(3.720075976020836E-44d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {
          -5.310313412036586E-80d,
          3.720075976020836E-44d,
          -3.720075976020836E-42d,
          -1.7282485273992304E-92d,
          8.47879391796873E-78d,
          -3.720075976020836E-42d,
          1.909942074204187E-81d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code -0.9999900000499998}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return Derivatives min is '-0.9999900000499998'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesMinIs09999900000499998() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            10.0d,
            10.0d,
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-0.9999900000499998d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-0.9999900000499998d, toListResult.get(1).doubleValue());
    assertEquals(9.999950000150193E-5d, actualPriceAdjointResult.getValue());
    assertEquals(99.99900000499998d, derivatives.max());
    assertEquals(99.99900000499998d, toListResult.get(5).doubleValue());
    assertEquals(99.99902000484998d, derivatives.sum());
    assertArrayEquals(
        new double[] {
          1.0d,
          -0.9999900000499998d,
          -9.999950000150193E-11d,
          9.999999999999999E-6d,
          0.0d,
          99.99900000499998d,
          0.0d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code -3.7200666316124675E-42}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return Derivatives min is '-3.7200666316124675E-42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesMinIs37200666316124675e42() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            false,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_OUT, 10.0d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-3.7200666316124675E-42d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-3.7200666316124675E-42d, toListResult.get(5).doubleValue());
    assertEquals(-7.475526694681192E-43d, toListResult.get(0).doubleValue());
    assertEquals(1.4950238340865868E-37d, derivatives.sum());
    assertEquals(1.4951053389362383E-37d, derivatives.max());
    assertEquals(1.4951053389362383E-37d, toListResult.get(6).doubleValue());
    assertEquals(3.720066631612468E-43d, actualPriceAdjointResult.getValue());
    assertEquals(3.720066631612468E-44d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {
          -7.475526694681192E-43d,
          3.720066631612468E-44d,
          -3.7200666316124675E-42d,
          -3.0122813576540935E-49d,
          6.024562715308188E-49d,
          -3.7200666316124675E-42d,
          1.4951053389362383E-37d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives sum is {@code -1.4950978635985096E-37}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return Derivatives sum is '-1.4950978635985096E-37'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesSumIs14950978635985096e37() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            false,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-1.4950978635985096E-37d, derivatives.sum());
    assertEquals(-1.4951053389362383E-37d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-1.4951053389362383E-37d, toListResult.get(6).doubleValue());
    assertEquals(-9.34440836835149E-48d, toListResult.get(5).doubleValue());
    assertEquals(7.475526694681192E-43d, derivatives.max());
    assertEquals(7.475526694681192E-43d, toListResult.get(0).doubleValue());
    assertEquals(9.34440836835149E-49d, actualPriceAdjointResult.getValue());
    assertEquals(9.34440836835149E-50d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {
          7.475526694681192E-43d,
          9.34440836835149E-50d,
          -9.34440836835149E-48d,
          3.0122813576540935E-49d,
          -6.024562715308188E-49d,
          -9.34440836835149E-48d,
          -1.4951053389362383E-37d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives toList first doubleValue is {@code -0.00549280271653059}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); then return Derivatives toList first doubleValue is '-0.00549280271653059'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesToListFirstDoubleValueIs000549280271653059() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackBarrierPriceFormulaRepository.priceAdjoint(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            true,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(-0.00549280271653059d, toListResult.get(0).doubleValue());
    assertEquals(-2.0370202373596218E-80d, toListResult.get(1).doubleValue());
    assertEquals(-2.7464013582652944d, derivatives.min());
    assertEquals(0.011621299979628855d, derivatives.sum());
    assertEquals(0.27464013582652946d, actualPriceAdjointResult.getValue());
    assertEquals(2.7299463918951186d, derivatives.max());
    assertEquals(6.196875809988252E-78d, toListResult.get(5).doubleValue());
    assertEquals(6.591363259836709E-4d, toListResult.get(6).doubleValue());
    assertArrayEquals(
        new double[] {
          -0.00549280271653059d,
          -2.0370202373596218E-80d,
          -2.7464013582652944d,
          2.7299463918951186d,
          0.03290993274035144d,
          6.196875809988252E-78d,
          6.591363259836709E-4d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-6}.
   *   <li>Then return Derivatives max is zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); when '-1.0E-6'; then return Derivatives max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_when10e6_thenReturnDerivativesMaxIsZero() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    DoubleArray derivatives =
        blackBarrierPriceFormulaRepository
            .priceAdjoint(
                10.0d,
                10.0d,
                -1.0E-6d,
                10.0d,
                10.0d,
                10.0d,
                true,
                SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d))
            .getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double, double, double,
   * double, double, boolean, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return Derivatives max is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BlackBarrierPriceFormulaRepository#priceAdjoint(double, double,
   * double, double, double, double, boolean, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier); when '-6.0136873569177505'; then return Derivatives max is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackBarrierPriceFormulaRepository.priceAdjoint(double, double, double, double, double, double, boolean, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_when60136873569177505_thenReturnDerivativesMaxIsNaN() {
    // Arrange
    BlackBarrierPriceFormulaRepository blackBarrierPriceFormulaRepository =
        new BlackBarrierPriceFormulaRepository();

    // Act and Assert
    DoubleArray derivatives =
        blackBarrierPriceFormulaRepository
            .priceAdjoint(
                10.0d,
                10.0d,
                -6.0136873569177505d,
                10.0d,
                10.0d,
                10.0d,
                true,
                SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d))
            .getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(7, toListResult.size());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(5).doubleValue());
    assertEquals(Double.NaN, toListResult.get(6).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, 0.0d, Double.NaN, Double.NaN, Double.NaN, Double.NaN},
        derivatives.toArrayUnsafe(),
        0.0);
  }
}
