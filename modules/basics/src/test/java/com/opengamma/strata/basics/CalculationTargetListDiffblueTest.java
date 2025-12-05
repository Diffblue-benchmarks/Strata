package com.opengamma.strata.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.CalculationTargetListTest.TestTarget;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculationTargetListDiffblueTest {
  /**
   * Test {@link CalculationTargetList#of(CalculationTarget[])} with {@code CalculationTarget[]}.
   *
   * <ul>
   *   <li>Then return Targets Empty.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTargetList#of(CalculationTarget[])}
   */
  @Test
  @DisplayName("Test of(CalculationTarget[]) with 'CalculationTarget[]'; then return Targets Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationTargetList CalculationTargetList.of(CalculationTarget[])"})
  void testOfWithCalculationTarget_thenReturnTargetsEmpty() {
    // Arrange, Act and Assert
    assertTrue(CalculationTargetList.of().getTargets().isEmpty());
  }

  /**
   * Test {@link CalculationTargetList#of(CalculationTarget[])} with {@code CalculationTarget[]}.
   *
   * <ul>
   *   <li>Then return Targets size is one.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTargetList#of(CalculationTarget[])}
   */
  @Test
  @DisplayName(
      "Test of(CalculationTarget[]) with 'CalculationTarget[]'; then return Targets size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationTargetList CalculationTargetList.of(CalculationTarget[])"})
  void testOfWithCalculationTarget_thenReturnTargetsSizeIsOne() {
    // Arrange
    TestTarget testTarget = new TestTarget(42);

    // Act and Assert
    ImmutableList<CalculationTarget> targets = CalculationTargetList.of(testTarget).getTargets();
    assertEquals(1, targets.size());
    CalculationTarget getResult = targets.get(0);
    assertTrue(getResult instanceof TestTarget);
    assertSame(testTarget, getResult);
  }

  /**
   * Test {@link CalculationTargetList#of(CalculationTarget[])} with {@code CalculationTarget[]}.
   *
   * <ul>
   *   <li>Then return Targets size is two.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTargetList#of(CalculationTarget[])}
   */
  @Test
  @DisplayName(
      "Test of(CalculationTarget[]) with 'CalculationTarget[]'; then return Targets size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationTargetList CalculationTargetList.of(CalculationTarget[])"})
  void testOfWithCalculationTarget_thenReturnTargetsSizeIsTwo() {
    // Arrange
    TestTarget testTarget = new TestTarget(42);
    TestTarget testTarget2 = new TestTarget(42);

    // Act and Assert
    ImmutableList<CalculationTarget> targets =
        CalculationTargetList.of(testTarget, testTarget2).getTargets();
    assertEquals(2, targets.size());
    assertSame(testTarget2, targets.get(1));
  }

  /**
   * Test {@link CalculationTargetList#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@link TestTarget#TestTarget(int)} with value is forty-two.
   *   <li>Then return Targets size is one.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTargetList#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given TestTarget(int) with value is forty-two; then return Targets size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationTargetList CalculationTargetList.of(List)"})
  void testOfWithList_givenTestTargetWithValueIsFortyTwo_thenReturnTargetsSizeIsOne() {
    // Arrange
    ArrayList<CalculationTarget> targets = new ArrayList<>();
    TestTarget testTarget = new TestTarget(42);
    targets.add(testTarget);

    // Act
    CalculationTargetList actualOfResult = CalculationTargetList.of(targets);

    // Assert
    ImmutableList<CalculationTarget> targets2 = actualOfResult.getTargets();
    assertEquals(1, targets2.size());
    CalculationTarget getResult = targets2.get(0);
    assertTrue(getResult instanceof TestTarget);
    assertSame(testTarget, getResult);
  }

  /**
   * Test {@link CalculationTargetList#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@link TestTarget#TestTarget(int)} with value is forty-two.
   *   <li>Then return Targets size is two.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTargetList#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given TestTarget(int) with value is forty-two; then return Targets size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationTargetList CalculationTargetList.of(List)"})
  void testOfWithList_givenTestTargetWithValueIsFortyTwo_thenReturnTargetsSizeIsTwo() {
    // Arrange
    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(new TestTarget(42));
    TestTarget testTarget = new TestTarget(42);
    targets.add(testTarget);

    // Act
    CalculationTargetList actualOfResult = CalculationTargetList.of(targets);

    // Assert
    ImmutableList<CalculationTarget> targets2 = actualOfResult.getTargets();
    assertEquals(2, targets2.size());
    assertSame(testTarget, targets2.get(1));
  }

  /**
   * Test {@link CalculationTargetList#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Targets is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTargetList#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return Targets is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationTargetList CalculationTargetList.of(List)"})
  void testOfWithList_whenArrayList_thenReturnTargetsIsArrayList() {
    // Arrange
    ArrayList<CalculationTarget> targets = new ArrayList<>();

    // Act
    CalculationTargetList actualOfResult = CalculationTargetList.of(targets);

    // Assert
    assertEquals(targets, actualOfResult.getTargets());
  }

  /**
   * Test {@link CalculationTargetList#meta()}.
   *
   * <p>Method under test: {@link CalculationTargetList#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationTargetList.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CalculationTargetList> actualMetaResult = CalculationTargetList.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("targets"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CalculationTargetList> expectedBeanTypeResult = CalculationTargetList.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CalculationTargetList#metaBean()}.
   *
   * <p>Method under test: {@link CalculationTargetList#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationTargetList.metaBean()"})
  void testMetaBean() {
    // Arrange
    CalculationTargetList ofResult = CalculationTargetList.of(new ArrayList<>());

    // Act
    TypedMetaBean<CalculationTargetList> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("targets"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CalculationTargetList> expectedBeanTypeResult = CalculationTargetList.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationTargetList#toString()}
   *   <li>{@link CalculationTargetList#getTargets()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList CalculationTargetList.getTargets()",
    "String CalculationTargetList.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CalculationTargetList ofResult = CalculationTargetList.of(new ArrayList<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("CalculationTargetList{targets=[]}", actualToStringResult);
    assertTrue(ofResult.getTargets().isEmpty());
  }

  /**
   * Test {@link CalculationTargetList#equals(Object)}, and {@link
   * CalculationTargetList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationTargetList#equals(Object)}
   *   <li>{@link CalculationTargetList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTargetList.equals(Object)",
    "int CalculationTargetList.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CalculationTargetList ofResult = CalculationTargetList.of(new ArrayList<>());
    CalculationTargetList ofResult2 = CalculationTargetList.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CalculationTargetList#equals(Object)}, and {@link
   * CalculationTargetList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationTargetList#equals(Object)}
   *   <li>{@link CalculationTargetList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTargetList.equals(Object)",
    "int CalculationTargetList.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CalculationTargetList ofResult = CalculationTargetList.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CalculationTargetList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTargetList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTargetList.equals(Object)",
    "int CalculationTargetList.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CalculationTargetList ofResult = CalculationTargetList.of(new TestTarget(42));

    // Act and Assert
    assertNotEquals(ofResult, CalculationTargetList.of(new ArrayList<>()));
  }

  /**
   * Test {@link CalculationTargetList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTargetList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTargetList.equals(Object)",
    "int CalculationTargetList.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CalculationTargetList ofResult = CalculationTargetList.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link CalculationTargetList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTargetList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTargetList.equals(Object)",
    "int CalculationTargetList.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CalculationTargetList ofResult = CalculationTargetList.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to CalculationTargetList");
  }
}
