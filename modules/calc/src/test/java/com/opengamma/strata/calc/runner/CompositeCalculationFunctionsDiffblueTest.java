package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CompositeCalculationFunctionsDiffblueTest {
  /**
   * Test {@link CompositeCalculationFunctions#of(CalculationFunctions, CalculationFunctions)}.
   *
   * <ul>
   *   <li>When {@link CalculationFunctions}.
   *   <li>Then return Functions1 is {@link CalculationFunctions}.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCalculationFunctions#of(CalculationFunctions,
   * CalculationFunctions)}
   */
  @Test
  @DisplayName(
      "Test of(CalculationFunctions, CalculationFunctions); when CalculationFunctions; then return Functions1 is CalculationFunctions")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CompositeCalculationFunctions CompositeCalculationFunctions.of(CalculationFunctions, CalculationFunctions)"
  })
  void testOf_whenCalculationFunctions_thenReturnFunctions1IsCalculationFunctions() {
    // Arrange
    CalculationFunctions functions1 = mock(CalculationFunctions.class);
    CalculationFunctions functions2 = mock(CalculationFunctions.class);

    // Act
    CompositeCalculationFunctions actualOfResult =
        CompositeCalculationFunctions.of(functions1, functions2);

    // Assert
    assertSame(functions1, actualOfResult.getFunctions1());
    assertSame(functions2, actualOfResult.getFunctions2());
  }

  /**
   * Test {@link CompositeCalculationFunctions#meta()}.
   *
   * <p>Method under test: {@link CompositeCalculationFunctions#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CompositeCalculationFunctions.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CompositeCalculationFunctions> actualMetaResult =
        CompositeCalculationFunctions.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("functions1"));
    assertTrue(metaPropertyMapResult.containsKey("functions2"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CompositeCalculationFunctions> expectedBeanTypeResult =
        CompositeCalculationFunctions.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CompositeCalculationFunctions#metaBean()}.
   *
   * <p>Method under test: {@link CompositeCalculationFunctions#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CompositeCalculationFunctions.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<CompositeCalculationFunctions> actualMetaBeanResult =
        CompositeCalculationFunctions.of(
                mock(CalculationFunctions.class), mock(CalculationFunctions.class))
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("functions1"));
    assertTrue(metaPropertyMapResult.containsKey("functions2"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CompositeCalculationFunctions> expectedBeanTypeResult =
        CompositeCalculationFunctions.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link CompositeCalculationFunctions#equals(Object)}, and {@link
   * CompositeCalculationFunctions#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompositeCalculationFunctions#equals(Object)}
   *   <li>{@link CompositeCalculationFunctions#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompositeCalculationFunctions.equals(Object)",
    "int CompositeCalculationFunctions.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompositeCalculationFunctions ofResult =
        CompositeCalculationFunctions.of(
            mock(CalculationFunctions.class), mock(CalculationFunctions.class));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CompositeCalculationFunctions#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCalculationFunctions#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompositeCalculationFunctions.equals(Object)",
    "int CompositeCalculationFunctions.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CompositeCalculationFunctions ofResult =
        CompositeCalculationFunctions.of(
            mock(CalculationFunctions.class), mock(CalculationFunctions.class));

    // Act and Assert
    assertNotEquals(
        ofResult,
        CompositeCalculationFunctions.of(
            mock(CalculationFunctions.class), mock(CalculationFunctions.class)));
  }

  /**
   * Test {@link CompositeCalculationFunctions#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCalculationFunctions#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompositeCalculationFunctions.equals(Object)",
    "int CompositeCalculationFunctions.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CompositeCalculationFunctions ofResult =
        CompositeCalculationFunctions.of(
            CompositeCalculationFunctions.of(
                mock(CalculationFunctions.class), mock(CalculationFunctions.class)),
            mock(CalculationFunctions.class));

    // Act and Assert
    assertNotEquals(
        ofResult,
        CompositeCalculationFunctions.of(
            mock(CalculationFunctions.class), mock(CalculationFunctions.class)));
  }

  /**
   * Test {@link CompositeCalculationFunctions#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCalculationFunctions#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompositeCalculationFunctions.equals(Object)",
    "int CompositeCalculationFunctions.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CompositeCalculationFunctions ofResult =
        CompositeCalculationFunctions.of(
            DefaultCalculationFunctions.EMPTY, mock(CalculationFunctions.class));

    // Act and Assert
    assertNotEquals(
        ofResult,
        CompositeCalculationFunctions.of(
            DefaultCalculationFunctions.EMPTY, mock(CalculationFunctions.class)));
  }

  /**
   * Test {@link CompositeCalculationFunctions#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCalculationFunctions#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompositeCalculationFunctions.equals(Object)",
    "int CompositeCalculationFunctions.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CompositeCalculationFunctions ofResult =
        CompositeCalculationFunctions.of(
            DefaultCalculationFunctions.EMPTY,
            CompositeCalculationFunctions.of(
                mock(CalculationFunctions.class), mock(CalculationFunctions.class)));

    // Act and Assert
    assertNotEquals(
        ofResult,
        CompositeCalculationFunctions.of(
            DefaultCalculationFunctions.EMPTY, mock(CalculationFunctions.class)));
  }

  /**
   * Test {@link CompositeCalculationFunctions#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCalculationFunctions#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompositeCalculationFunctions.equals(Object)",
    "int CompositeCalculationFunctions.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CompositeCalculationFunctions.of(
            mock(CalculationFunctions.class), mock(CalculationFunctions.class)),
        null);
  }

  /**
   * Test {@link CompositeCalculationFunctions#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompositeCalculationFunctions#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompositeCalculationFunctions.equals(Object)",
    "int CompositeCalculationFunctions.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CompositeCalculationFunctions.of(
            mock(CalculationFunctions.class), mock(CalculationFunctions.class)),
        "Different type to CompositeCalculationFunctions");
  }
}
