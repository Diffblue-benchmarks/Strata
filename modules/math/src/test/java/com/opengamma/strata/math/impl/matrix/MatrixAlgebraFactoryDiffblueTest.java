package com.opengamma.strata.math.impl.matrix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MatrixAlgebraFactoryDiffblueTest {
  /**
   * Test {@link MatrixAlgebraFactory#getMatrixAlgebra(String)}.
   *
   * <ul>
   *   <li>When {@code Algebra Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebraFactory#getMatrixAlgebra(String)}
   */
  @Test
  @DisplayName(
      "Test getMatrixAlgebra(String); when 'Algebra Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MatrixAlgebra MatrixAlgebraFactory.getMatrixAlgebra(String)"})
  void testGetMatrixAlgebra_whenAlgebraName_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MatrixAlgebraFactory.getMatrixAlgebra("Algebra Name"));
  }

  /**
   * Test {@link MatrixAlgebraFactory#getMatrixAlgebra(String)}.
   *
   * <ul>
   *   <li>When {@link MatrixAlgebraFactory#OG}.
   *   <li>Then return {@link OGMatrixAlgebra}.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebraFactory#getMatrixAlgebra(String)}
   */
  @Test
  @DisplayName("Test getMatrixAlgebra(String); when OG; then return OGMatrixAlgebra")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MatrixAlgebra MatrixAlgebraFactory.getMatrixAlgebra(String)"})
  void testGetMatrixAlgebra_whenOg_thenReturnOGMatrixAlgebra() {
    // Arrange, Act and Assert
    assertTrue(
        MatrixAlgebraFactory.getMatrixAlgebra(MatrixAlgebraFactory.OG) instanceof OGMatrixAlgebra);
  }

  /**
   * Test {@link MatrixAlgebraFactory#getMatrixAlgebraName(MatrixAlgebra)}.
   *
   * <ul>
   *   <li>When {@link MatrixAlgebraFactory#COMMONS_ALGEBRA}.
   *   <li>Then return {@link MatrixAlgebraFactory#COMMONS}.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebraFactory#getMatrixAlgebraName(MatrixAlgebra)}
   */
  @Test
  @DisplayName(
      "Test getMatrixAlgebraName(MatrixAlgebra); when COMMONS_ALGEBRA; then return COMMONS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MatrixAlgebraFactory.getMatrixAlgebraName(MatrixAlgebra)"})
  void testGetMatrixAlgebraName_whenCommons_algebra_thenReturnCommons() {
    // Arrange, Act and Assert
    assertEquals(
        MatrixAlgebraFactory.COMMONS,
        MatrixAlgebraFactory.getMatrixAlgebraName(MatrixAlgebraFactory.COMMONS_ALGEBRA));
  }

  /**
   * Test {@link MatrixAlgebraFactory#getMatrixAlgebraName(MatrixAlgebra)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebraFactory#getMatrixAlgebraName(MatrixAlgebra)}
   */
  @Test
  @DisplayName("Test getMatrixAlgebraName(MatrixAlgebra); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MatrixAlgebraFactory.getMatrixAlgebraName(MatrixAlgebra)"})
  void testGetMatrixAlgebraName_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(MatrixAlgebraFactory.getMatrixAlgebraName(null));
  }
}
