package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.FxMatrixId;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MatrixFxRateLookupDiffblueTest {
  /**
   * Test {@link MatrixFxRateLookup#meta()}.
   *
   * <p>Method under test: {@link MatrixFxRateLookup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean MatrixFxRateLookup.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<MatrixFxRateLookup> actualMetaResult = MatrixFxRateLookup.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("matrixId"));
    assertTrue(actualMetaResult.isBuildable());
    Class<MatrixFxRateLookup> expectedBeanTypeResult = MatrixFxRateLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link MatrixFxRateLookup#MatrixFxRateLookup(FxMatrixId)}.
   *
   * <ul>
   *   <li>When standard.
   *   <li>Then return MatrixId is standard.
   * </ul>
   *
   * <p>Method under test: {@link MatrixFxRateLookup#MatrixFxRateLookup(FxMatrixId)}
   */
  @Test
  @DisplayName(
      "Test new MatrixFxRateLookup(FxMatrixId); when standard; then return MatrixId is standard")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MatrixFxRateLookup.<init>(FxMatrixId)"})
  void testNewMatrixFxRateLookup_whenStandard_thenReturnMatrixIdIsStandard() {
    // Arrange
    FxMatrixId matrixId = FxMatrixId.standard();

    // Act and Assert
    assertSame(matrixId, new MatrixFxRateLookup(matrixId).getMatrixId());
  }

  /**
   * Test {@link MatrixFxRateLookup#metaBean()}.
   *
   * <p>Method under test: {@link MatrixFxRateLookup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean MatrixFxRateLookup.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<MatrixFxRateLookup> actualMetaBeanResult = MatrixFxRateLookup.DEFAULT.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("matrixId"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<MatrixFxRateLookup> expectedBeanTypeResult = MatrixFxRateLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MatrixFxRateLookup#toString()}
   *   <li>{@link MatrixFxRateLookup#getMatrixId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FxMatrixId MatrixFxRateLookup.getMatrixId()",
    "String MatrixFxRateLookup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    FxMatrixId matrixId = FxMatrixId.standard();
    MatrixFxRateLookup matrixFxRateLookup = new MatrixFxRateLookup(matrixId);

    // Act
    String actualToStringResult = matrixFxRateLookup.toString();

    // Assert
    assertEquals("MatrixFxRateLookup{matrixId=FxMatrixId}", actualToStringResult);
    assertSame(matrixId, matrixFxRateLookup.getMatrixId());
  }

  /**
   * Test {@link MatrixFxRateLookup#equals(Object)}, and {@link MatrixFxRateLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MatrixFxRateLookup#equals(Object)}
   *   <li>{@link MatrixFxRateLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MatrixFxRateLookup.equals(Object)",
    "int MatrixFxRateLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MatrixFxRateLookup matrixFxRateLookup = MatrixFxRateLookup.DEFAULT;
    MatrixFxRateLookup matrixFxRateLookup2 = MatrixFxRateLookup.DEFAULT;

    // Act and Assert
    assertEquals(matrixFxRateLookup, matrixFxRateLookup2);
    assertEquals(matrixFxRateLookup.hashCode(), matrixFxRateLookup2.hashCode());
  }

  /**
   * Test {@link MatrixFxRateLookup#equals(Object)}, and {@link MatrixFxRateLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MatrixFxRateLookup#equals(Object)}
   *   <li>{@link MatrixFxRateLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MatrixFxRateLookup.equals(Object)",
    "int MatrixFxRateLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    MatrixFxRateLookup matrixFxRateLookup = new MatrixFxRateLookup(FxMatrixId.standard());
    MatrixFxRateLookup matrixFxRateLookup2 = MatrixFxRateLookup.DEFAULT;

    // Act and Assert
    assertEquals(matrixFxRateLookup, matrixFxRateLookup2);
    assertEquals(matrixFxRateLookup.hashCode(), matrixFxRateLookup2.hashCode());
  }

  /**
   * Test {@link MatrixFxRateLookup#equals(Object)}, and {@link MatrixFxRateLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MatrixFxRateLookup#equals(Object)}
   *   <li>{@link MatrixFxRateLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MatrixFxRateLookup.equals(Object)",
    "int MatrixFxRateLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MatrixFxRateLookup matrixFxRateLookup = MatrixFxRateLookup.DEFAULT;

    // Act and Assert
    assertEquals(matrixFxRateLookup, matrixFxRateLookup);
    int expectedHashCodeResult = matrixFxRateLookup.hashCode();
    assertEquals(expectedHashCodeResult, matrixFxRateLookup.hashCode());
  }

  /**
   * Test {@link MatrixFxRateLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MatrixFxRateLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MatrixFxRateLookup.equals(Object)",
    "int MatrixFxRateLookup.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MatrixFxRateLookup(FxMatrixId.standard()), null);
  }

  /**
   * Test {@link MatrixFxRateLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MatrixFxRateLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MatrixFxRateLookup.equals(Object)",
    "int MatrixFxRateLookup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(MatrixFxRateLookup.DEFAULT, null);
  }

  /**
   * Test {@link MatrixFxRateLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MatrixFxRateLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MatrixFxRateLookup.equals(Object)",
    "int MatrixFxRateLookup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(MatrixFxRateLookup.DEFAULT, "Different type to MatrixFxRateLookup");
  }
}
