package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class QRDecompositionCommonsDiffblueTest {
  /**
   * Test {@link QRDecompositionCommons#apply(DoubleMatrix)} with {@code DoubleMatrix}.
   *
   * <ul>
   *   <li>When filled one and one.
   *   <li>Then return Q size is one.
   * </ul>
   *
   * <p>Method under test: {@link QRDecompositionCommons#apply(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test apply(DoubleMatrix) with 'DoubleMatrix'; when filled one and one; then return Q size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QRDecompositionResult QRDecompositionCommons.apply(DoubleMatrix)"})
  void testApplyWithDoubleMatrix_whenFilledOneAndOne_thenReturnQSizeIsOne() {
    // Arrange
    QRDecompositionCommons qrDecompositionCommons = new QRDecompositionCommons();
    DoubleMatrix x = DoubleMatrix.filled(1, 1);

    // Act
    QRDecompositionResult actualApplyResult = qrDecompositionCommons.apply(x);

    // Assert
    assertTrue(actualApplyResult instanceof QRDecompositionCommonsResult);
    DoubleMatrix q = actualApplyResult.getQ();
    assertEquals(1, q.size());
    double[][] toArrayUnsafeResult = q.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, q.total());
    assertEquals(q, actualApplyResult.getQT());
    assertEquals(x, actualApplyResult.getR());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link QRDecompositionCommons#apply(DoubleMatrix)} with {@code DoubleMatrix}.
   *
   * <ul>
   *   <li>When identity three.
   *   <li>Then return Q total is minus three.
   * </ul>
   *
   * <p>Method under test: {@link QRDecompositionCommons#apply(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test apply(DoubleMatrix) with 'DoubleMatrix'; when identity three; then return Q total is minus three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QRDecompositionResult QRDecompositionCommons.apply(DoubleMatrix)"})
  void testApplyWithDoubleMatrix_whenIdentityThree_thenReturnQTotalIsMinusThree() {
    // Arrange
    QRDecompositionCommons qrDecompositionCommons = new QRDecompositionCommons();

    // Act
    QRDecompositionResult actualApplyResult =
        qrDecompositionCommons.apply(DoubleMatrix.identity(3));

    // Assert
    assertTrue(actualApplyResult instanceof QRDecompositionCommonsResult);
    DoubleMatrix q = actualApplyResult.getQ();
    assertEquals(-3.0d, q.total());
    double[][] toArrayUnsafeResult = q.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, q.size());
    assertEquals(q, actualApplyResult.getQT());
    assertEquals(q, actualApplyResult.getR());
    assertArrayEquals(new double[] {-1.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, -1.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, -1.0d}, toArrayUnsafeResult[2], 0.0);
  }
}
