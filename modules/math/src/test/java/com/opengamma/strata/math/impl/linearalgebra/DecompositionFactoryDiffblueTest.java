package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.linearalgebra.Decomposition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DecompositionFactoryDiffblueTest {
  /**
   * Test {@link DecompositionFactory#getDecomposition(String)}.
   *
   * <ul>
   *   <li>When {@link DecompositionFactory#SV_COMMONS_NAME}.
   *   <li>Then return {@link SVDecompositionCommons}.
   * </ul>
   *
   * <p>Method under test: {@link DecompositionFactory#getDecomposition(String)}
   */
  @Test
  @DisplayName(
      "Test getDecomposition(String); when SV_COMMONS_NAME; then return SVDecompositionCommons")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decomposition DecompositionFactory.getDecomposition(String)"})
  void testGetDecomposition_whenSv_commons_name_thenReturnSVDecompositionCommons() {
    // Arrange and Act
    Decomposition<?> actualDecomposition =
        DecompositionFactory.getDecomposition(DecompositionFactory.SV_COMMONS_NAME);
    DoubleMatrix input = DoubleMatrix.identity(3);
    Object actualApplyResult = actualDecomposition.apply(input);

    // Assert
    assertTrue(actualDecomposition instanceof SVDecompositionCommons);
    assertTrue(actualApplyResult instanceof SVDecompositionCommonsResult);
    assertEquals(1.0d, ((SVDecompositionCommonsResult) actualApplyResult).getConditionNumber());
    assertEquals(1.0d, ((SVDecompositionCommonsResult) actualApplyResult).getNorm());
    assertEquals(3, ((SVDecompositionCommonsResult) actualApplyResult).getRank());
    assertEquals(input, ((SVDecompositionCommonsResult) actualApplyResult).getS());
    assertArrayEquals(
        new double[] {1.0d, 1.0d, 1.0d},
        ((SVDecompositionCommonsResult) actualApplyResult).getSingularValues(),
        0.0);
  }

  /**
   * Test {@link DecompositionFactory#getDecompositionName(Decomposition)}.
   *
   * <ul>
   *   <li>When {@link Decomposition}.
   * </ul>
   *
   * <p>Method under test: {@link DecompositionFactory#getDecompositionName(Decomposition)}
   */
  @Test
  @DisplayName("Test getDecompositionName(Decomposition); when Decomposition")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DecompositionFactory.getDecompositionName(Decomposition)"})
  void testGetDecompositionName_whenDecomposition() {
    // Arrange, Act and Assert
    assertNull(DecompositionFactory.getDecompositionName(mock(Decomposition.class)));
  }

  /**
   * Test {@link DecompositionFactory#getDecompositionName(Decomposition)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DecompositionFactory#getDecompositionName(Decomposition)}
   */
  @Test
  @DisplayName("Test getDecompositionName(Decomposition); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DecompositionFactory.getDecompositionName(Decomposition)"})
  void testGetDecompositionName_whenNull() {
    // Arrange, Act and Assert
    assertNull(DecompositionFactory.getDecompositionName(null));
  }
}
