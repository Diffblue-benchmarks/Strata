package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.ResolvableCalculationTarget;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultCalculationFunctionsDiffblueTest {
  /**
   * Test {@link DefaultCalculationFunctions#of(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Functions is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationFunctions#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map); when HashMap(); then return Functions is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCalculationFunctions DefaultCalculationFunctions.of(Map)"})
  void testOf_whenHashMap_thenReturnFunctionsIsHashMap() {
    // Arrange
    HashMap<Class<?>, CalculationFunction<?>> functions = new HashMap<>();

    // Act
    DefaultCalculationFunctions actualOfResult = DefaultCalculationFunctions.of(functions);

    // Assert
    assertEquals(functions, actualOfResult.getFunctions());
  }

  /**
   * Test {@link DefaultCalculationFunctions#getFunction(CalculationTarget)}.
   *
   * <ul>
   *   <li>Then return {@link MissingConfigCalculationFunction#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationFunctions#getFunction(CalculationTarget)}
   */
  @Test
  @DisplayName("Test getFunction(CalculationTarget); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationFunction DefaultCalculationFunctions.getFunction(CalculationTarget)"
  })
  void testGetFunction_thenReturnInstance() {
    // Arrange and Act
    CalculationFunction<? super CalculationTarget> actualFunction =
        DefaultCalculationFunctions.EMPTY.getFunction(
            new UnresolvableTarget(
                mock(ResolvableCalculationTarget.class), "Not all who wander are lost"));

    // Assert
    assertSame(((MissingConfigCalculationFunction) actualFunction).INSTANCE, actualFunction);
  }

  /**
   * Test {@link DefaultCalculationFunctions#meta()}.
   *
   * <p>Method under test: {@link DefaultCalculationFunctions#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultCalculationFunctions.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultCalculationFunctions> actualMetaResult =
        DefaultCalculationFunctions.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("functions"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultCalculationFunctions> expectedBeanTypeResult = DefaultCalculationFunctions.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultCalculationFunctions#metaBean()}.
   *
   * <p>Method under test: {@link DefaultCalculationFunctions#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultCalculationFunctions.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<DefaultCalculationFunctions> actualMetaBeanResult =
        DefaultCalculationFunctions.EMPTY.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("functions"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultCalculationFunctions> expectedBeanTypeResult = DefaultCalculationFunctions.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCalculationFunctions#toString()}
   *   <li>{@link DefaultCalculationFunctions#getFunctions()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableMap DefaultCalculationFunctions.getFunctions()",
    "String DefaultCalculationFunctions.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultCalculationFunctions ofResult = DefaultCalculationFunctions.of(new HashMap<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("DefaultCalculationFunctions{functions={}}", actualToStringResult);
    assertTrue(ofResult.getFunctions().isEmpty());
  }

  /**
   * Test {@link DefaultCalculationFunctions#equals(Object)}, and {@link
   * DefaultCalculationFunctions#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCalculationFunctions#equals(Object)}
   *   <li>{@link DefaultCalculationFunctions#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCalculationFunctions.equals(Object)",
    "int DefaultCalculationFunctions.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultCalculationFunctions defaultCalculationFunctions = DefaultCalculationFunctions.EMPTY;
    DefaultCalculationFunctions defaultCalculationFunctions2 = DefaultCalculationFunctions.EMPTY;

    // Act and Assert
    assertEquals(defaultCalculationFunctions, defaultCalculationFunctions2);
    assertEquals(defaultCalculationFunctions.hashCode(), defaultCalculationFunctions2.hashCode());
  }

  /**
   * Test {@link DefaultCalculationFunctions#equals(Object)}, and {@link
   * DefaultCalculationFunctions#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCalculationFunctions#equals(Object)}
   *   <li>{@link DefaultCalculationFunctions#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCalculationFunctions.equals(Object)",
    "int DefaultCalculationFunctions.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    DefaultCalculationFunctions ofResult = DefaultCalculationFunctions.of(new HashMap<>());
    DefaultCalculationFunctions defaultCalculationFunctions = DefaultCalculationFunctions.EMPTY;

    // Act and Assert
    assertEquals(ofResult, defaultCalculationFunctions);
    assertEquals(ofResult.hashCode(), defaultCalculationFunctions.hashCode());
  }

  /**
   * Test {@link DefaultCalculationFunctions#equals(Object)}, and {@link
   * DefaultCalculationFunctions#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCalculationFunctions#equals(Object)}
   *   <li>{@link DefaultCalculationFunctions#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCalculationFunctions.equals(Object)",
    "int DefaultCalculationFunctions.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultCalculationFunctions defaultCalculationFunctions = DefaultCalculationFunctions.EMPTY;

    // Act and Assert
    assertEquals(defaultCalculationFunctions, defaultCalculationFunctions);
    int expectedHashCodeResult = defaultCalculationFunctions.hashCode();
    assertEquals(expectedHashCodeResult, defaultCalculationFunctions.hashCode());
  }

  /**
   * Test {@link DefaultCalculationFunctions#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationFunctions#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCalculationFunctions.equals(Object)",
    "int DefaultCalculationFunctions.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultCalculationFunctions ofResult = DefaultCalculationFunctions.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link DefaultCalculationFunctions#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationFunctions#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCalculationFunctions.equals(Object)",
    "int DefaultCalculationFunctions.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DefaultCalculationFunctions.EMPTY, null);
  }

  /**
   * Test {@link DefaultCalculationFunctions#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationFunctions#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCalculationFunctions.equals(Object)",
    "int DefaultCalculationFunctions.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        DefaultCalculationFunctions.EMPTY, "Different type to DefaultCalculationFunctions");
  }
}
