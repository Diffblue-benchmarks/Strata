package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.ResolvableCalculationTarget;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculationResultsDiffblueTest {
  /**
   * Test {@link CalculationResults#of(CalculationTarget, List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then Target return {@link UnresolvableTarget}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationResults#of(CalculationTarget, List)}
   */
  @Test
  @DisplayName(
      "Test of(CalculationTarget, List); when ArrayList(); then Target return UnresolvableTarget")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationResults CalculationResults.of(CalculationTarget, List)"})
  void testOf_whenArrayList_thenTargetReturnUnresolvableTarget() {
    // Arrange
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    ArrayList<CalculationResult> results = new ArrayList<>();

    // Act
    CalculationResults actualOfResult = CalculationResults.of(target, results);

    // Assert
    CalculationTarget target2 = actualOfResult.getTarget();
    assertTrue(target2 instanceof UnresolvableTarget);
    assertEquals("Not all who wander are lost", ((UnresolvableTarget) target2).getMessage());
    assertEquals(results, actualOfResult.getCells());
    assertSame(target, target2);
  }

  /**
   * Test {@link CalculationResults#meta()}.
   *
   * <p>Method under test: {@link CalculationResults#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationResults.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CalculationResults> actualMetaResult = CalculationResults.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("cells"));
    assertTrue(metaPropertyMapResult.containsKey("target"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CalculationResults> expectedBeanTypeResult = CalculationResults.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CalculationResults#metaBean()}.
   *
   * <p>Method under test: {@link CalculationResults#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationResults.metaBean()"})
  void testMetaBean() {
    // Arrange
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act
    TypedMetaBean<CalculationResults> actualMetaBeanResult =
        CalculationResults.of(target, new ArrayList<>()).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("cells"));
    assertTrue(metaPropertyMapResult.containsKey("target"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CalculationResults> expectedBeanTypeResult = CalculationResults.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationResults#toString()}
   *   <li>{@link CalculationResults#getCells()}
   *   <li>{@link CalculationResults#getTarget()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList CalculationResults.getCells()",
    "CalculationTarget CalculationResults.getTarget()",
    "String CalculationResults.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    CalculationResults ofResult = CalculationResults.of(target, new ArrayList<>());

    // Act
    ofResult.toString();
    ImmutableList<CalculationResult> actualCells = ofResult.getCells();
    CalculationTarget actualTarget = ofResult.getTarget();

    // Assert
    assertTrue(actualCells.isEmpty());
    assertSame(target, actualTarget);
  }

  /**
   * Test {@link CalculationResults#equals(Object)}, and {@link CalculationResults#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationResults#equals(Object)}
   *   <li>{@link CalculationResults#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationResults.equals(Object)",
    "int CalculationResults.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    CalculationResults ofResult = CalculationResults.of(target, new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CalculationResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationResults.equals(Object)",
    "int CalculationResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    CalculationResults ofResult = CalculationResults.of(target, new ArrayList<>());
    UnresolvableTarget target2 =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act and Assert
    assertNotEquals(ofResult, CalculationResults.of(target2, new ArrayList<>()));
  }

  /**
   * Test {@link CalculationResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationResults.equals(Object)",
    "int CalculationResults.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act and Assert
    assertNotEquals(CalculationResults.of(target, new ArrayList<>()), null);
  }

  /**
   * Test {@link CalculationResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationResults.equals(Object)",
    "int CalculationResults.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act and Assert
    assertNotEquals(
        CalculationResults.of(target, new ArrayList<>()), "Different type to CalculationResults");
  }
}
