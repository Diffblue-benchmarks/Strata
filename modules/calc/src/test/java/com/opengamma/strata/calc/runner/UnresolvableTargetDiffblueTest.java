package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ResolvableCalculationTarget;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnresolvableTargetDiffblueTest {
  /**
   * Test {@link UnresolvableTarget#meta()}.
   *
   * <p>Method under test: {@link UnresolvableTarget#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean UnresolvableTarget.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<UnresolvableTarget> actualMetaResult = UnresolvableTarget.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("message"));
    assertTrue(metaPropertyMapResult.containsKey("target"));
    assertTrue(actualMetaResult.isBuildable());
    Class<UnresolvableTarget> expectedBeanTypeResult = UnresolvableTarget.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link UnresolvableTarget#UnresolvableTarget(ResolvableCalculationTarget, String)}.
   *
   * <ul>
   *   <li>Then return Message is {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link UnresolvableTarget#UnresolvableTarget(ResolvableCalculationTarget,
   * String)}
   */
  @Test
  @DisplayName(
      "Test new UnresolvableTarget(ResolvableCalculationTarget, String); then return Message is 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnresolvableTarget.<init>(ResolvableCalculationTarget, String)"})
  void testNewUnresolvableTarget_thenReturnMessageIsNotAllWhoWanderAreLost() {
    // Arrange
    ResolvableCalculationTarget target = mock(ResolvableCalculationTarget.class);

    // Act
    UnresolvableTarget actualUnresolvableTarget =
        new UnresolvableTarget(target, "Not all who wander are lost");

    // Assert
    assertEquals("Not all who wander are lost", actualUnresolvableTarget.getMessage());
    assertSame(target, actualUnresolvableTarget.getTarget());
  }

  /**
   * Test {@link UnresolvableTarget#metaBean()}.
   *
   * <p>Method under test: {@link UnresolvableTarget#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean UnresolvableTarget.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<UnresolvableTarget> actualMetaBeanResult =
        new UnresolvableTarget(
                mock(ResolvableCalculationTarget.class), "Not all who wander are lost")
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("message"));
    assertTrue(metaPropertyMapResult.containsKey("target"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<UnresolvableTarget> expectedBeanTypeResult = UnresolvableTarget.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UnresolvableTarget#toString()}
   *   <li>{@link UnresolvableTarget#getMessage()}
   *   <li>{@link UnresolvableTarget#getTarget()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String UnresolvableTarget.getMessage()",
    "ResolvableCalculationTarget UnresolvableTarget.getTarget()",
    "String UnresolvableTarget.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    UnresolvableTarget unresolvableTarget =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act
    unresolvableTarget.toString();
    String actualMessage = unresolvableTarget.getMessage();
    unresolvableTarget.getTarget();

    // Assert
    assertEquals("Not all who wander are lost", actualMessage);
  }

  /**
   * Test {@link UnresolvableTarget#equals(Object)}, and {@link UnresolvableTarget#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UnresolvableTarget#equals(Object)}
   *   <li>{@link UnresolvableTarget#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnresolvableTarget.equals(Object)",
    "int UnresolvableTarget.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UnresolvableTarget unresolvableTarget =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act and Assert
    assertEquals(unresolvableTarget, unresolvableTarget);
    int expectedHashCodeResult = unresolvableTarget.hashCode();
    assertEquals(expectedHashCodeResult, unresolvableTarget.hashCode());
  }

  /**
   * Test {@link UnresolvableTarget#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UnresolvableTarget#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnresolvableTarget.equals(Object)",
    "int UnresolvableTarget.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UnresolvableTarget unresolvableTarget =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act and Assert
    assertNotEquals(
        unresolvableTarget,
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost"));
  }

  /**
   * Test {@link UnresolvableTarget#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UnresolvableTarget#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnresolvableTarget.equals(Object)",
    "int UnresolvableTarget.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost"),
        null);
  }

  /**
   * Test {@link UnresolvableTarget#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UnresolvableTarget#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnresolvableTarget.equals(Object)",
    "int UnresolvableTarget.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost"),
        "Different type to UnresolvableTarget");
  }
}
