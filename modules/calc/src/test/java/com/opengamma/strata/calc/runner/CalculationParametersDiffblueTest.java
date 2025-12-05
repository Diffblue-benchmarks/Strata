package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.ResolvableCalculationTarget;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.Measure;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculationParametersDiffblueTest {
  /**
   * Test {@link CalculationParameters#empty()}.
   *
   * <p>Method under test: {@link CalculationParameters#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationParameters CalculationParameters.empty()"})
  void testEmpty() {
    // Arrange, Act and Assert
    assertTrue(CalculationParameters.empty().getParameters().isEmpty());
  }

  /**
   * Test {@link CalculationParameters#without(Class)}.
   *
   * <p>Method under test: {@link CalculationParameters#without(Class)}
   */
  @Test
  @DisplayName("Test without(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationParameters CalculationParameters.without(Class)"})
  void testWithout() {
    // Arrange
    CalculationParameters ofResult =
        CalculationParameters.of(new TestParameter(), DefaultFxRateLookup.DEFAULT);
    Class<CalculationParameter> type = CalculationParameter.class;

    // Act
    CalculationParameters actualWithoutResult = ofResult.without(type);

    // Assert
    assertSame(ofResult, actualWithoutResult);
  }

  /**
   * Test {@link CalculationParameters#without(Class)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Parameters Empty.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#without(Class)}
   */
  @Test
  @DisplayName("Test without(Class); given empty; then return Parameters Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationParameters CalculationParameters.without(Class)"})
  void testWithout_givenEmpty_thenReturnParametersEmpty() {
    // Arrange
    CalculationParameters emptyResult = CalculationParameters.empty();
    Class<CalculationParameter> type = CalculationParameter.class;

    // Act
    CalculationParameters actualWithoutResult = emptyResult.without(type);

    // Assert
    assertTrue(actualWithoutResult.getParameters().isEmpty());
    assertSame(emptyResult, actualWithoutResult);
  }

  /**
   * Test {@link CalculationParameters#without(Class)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code null}.
   *   <li>Then return Parameters Empty.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#without(Class)}
   */
  @Test
  @DisplayName("Test without(Class); given empty; when 'null'; then return Parameters Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationParameters CalculationParameters.without(Class)"})
  void testWithout_givenEmpty_whenNull_thenReturnParametersEmpty() {
    // Arrange
    CalculationParameters emptyResult = CalculationParameters.empty();

    // Act
    CalculationParameters actualWithoutResult = emptyResult.without(null);

    // Assert
    assertTrue(actualWithoutResult.getParameters().isEmpty());
    assertSame(emptyResult, actualWithoutResult);
  }

  /**
   * Test {@link CalculationParameters#without(Class)}.
   *
   * <ul>
   *   <li>Then return {@link CalculationParameters} with parameters is {@link
   *       DefaultFxRateLookup#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#without(Class)}
   */
  @Test
  @DisplayName("Test without(Class); then return CalculationParameters with parameters is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationParameters CalculationParameters.without(Class)"})
  void testWithout_thenReturnCalculationParametersWithParametersIsDefault() {
    // Arrange
    CalculationParameters ofResult = CalculationParameters.of(DefaultFxRateLookup.DEFAULT);
    Class<CalculationParameter> type = CalculationParameter.class;

    // Act
    CalculationParameters actualWithoutResult = ofResult.without(type);

    // Assert
    assertSame(ofResult, actualWithoutResult);
  }

  /**
   * Test {@link CalculationParameters#filter(CalculationTarget, Measure)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Parameters Empty.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#filter(CalculationTarget, Measure)}
   */
  @Test
  @DisplayName("Test filter(CalculationTarget, Measure); given empty; then return Parameters Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationParameters CalculationParameters.filter(CalculationTarget, Measure)"
  })
  void testFilter_givenEmpty_thenReturnParametersEmpty() {
    // Arrange
    CalculationParameters emptyResult = CalculationParameters.empty();
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act
    CalculationParameters actualFilterResult =
        emptyResult.filter(target, ImmutableMeasure.of("Name"));

    // Assert
    assertTrue(actualFilterResult.getParameters().isEmpty());
    assertSame(emptyResult, actualFilterResult);
  }

  /**
   * Test {@link CalculationParameters#filter(CalculationTarget, Measure)}.
   *
   * <ul>
   *   <li>Then return {@link CalculationParameters} with parameters is {@link
   *       DefaultFxRateLookup#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#filter(CalculationTarget, Measure)}
   */
  @Test
  @DisplayName(
      "Test filter(CalculationTarget, Measure); then return CalculationParameters with parameters is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationParameters CalculationParameters.filter(CalculationTarget, Measure)"
  })
  void testFilter_thenReturnCalculationParametersWithParametersIsDefault() {
    // Arrange
    CalculationParameters ofResult = CalculationParameters.of(DefaultFxRateLookup.DEFAULT);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act
    CalculationParameters actualFilterResult = ofResult.filter(target, ImmutableMeasure.of("Name"));

    // Assert
    assertEquals(ofResult, actualFilterResult);
  }

  /**
   * Test {@link CalculationParameters#filter(CalculationTarget, Measure)}.
   *
   * <ul>
   *   <li>Then return {@link CalculationParameters} with parameters is {@link TestParameter}
   *       (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#filter(CalculationTarget, Measure)}
   */
  @Test
  @DisplayName(
      "Test filter(CalculationTarget, Measure); then return CalculationParameters with parameters is TestParameter (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationParameters CalculationParameters.filter(CalculationTarget, Measure)"
  })
  void testFilter_thenReturnCalculationParametersWithParametersIsTestParameter() {
    // Arrange
    CalculationParameters ofResult = CalculationParameters.of(new TestParameter());
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act
    CalculationParameters actualFilterResult = ofResult.filter(target, ImmutableMeasure.of("Name"));

    // Assert
    assertEquals(ofResult, actualFilterResult);
  }

  /**
   * Test {@link CalculationParameters#filter(CalculationTarget, Measure)}.
   *
   * <ul>
   *   <li>Then return {@link CalculationParameters} with parameters is {@link TestParameter2}
   *       (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#filter(CalculationTarget, Measure)}
   */
  @Test
  @DisplayName(
      "Test filter(CalculationTarget, Measure); then return CalculationParameters with parameters is TestParameter2 (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationParameters CalculationParameters.filter(CalculationTarget, Measure)"
  })
  void testFilter_thenReturnCalculationParametersWithParametersIsTestParameter2() {
    // Arrange
    CalculationParameters ofResult = CalculationParameters.of(new TestParameter2());
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act
    CalculationParameters actualFilterResult = ofResult.filter(target, ImmutableMeasure.of("Name"));

    // Assert
    assertEquals(ofResult, actualFilterResult);
  }

  /**
   * Test {@link CalculationParameters#findParameter(Class)}.
   *
   * <p>Method under test: {@link CalculationParameters#findParameter(Class)}
   */
  @Test
  @DisplayName("Test findParameter(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional CalculationParameters.findParameter(Class)"})
  void testFindParameter() {
    // Arrange
    CalculationParameters ofResult =
        CalculationParameters.of(new TestParameter(), DefaultFxRateLookup.DEFAULT);
    Class<CalculationParameter> type = CalculationParameter.class;

    // Act and Assert
    assertFalse(ofResult.findParameter(type).isPresent());
  }

  /**
   * Test {@link CalculationParameters#findParameter(Class)}.
   *
   * <ul>
   *   <li>Given {@link CalculationParameters} with parameters is {@link
   *       DefaultFxRateLookup#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#findParameter(Class)}
   */
  @Test
  @DisplayName("Test findParameter(Class); given CalculationParameters with parameters is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional CalculationParameters.findParameter(Class)"})
  void testFindParameter_givenCalculationParametersWithParametersIsDefault() {
    // Arrange
    CalculationParameters ofResult = CalculationParameters.of(DefaultFxRateLookup.DEFAULT);
    Class<CalculationParameter> type = CalculationParameter.class;

    // Act and Assert
    assertFalse(ofResult.findParameter(type).isPresent());
  }

  /**
   * Test {@link CalculationParameters#findParameter(Class)}.
   *
   * <ul>
   *   <li>Given {@link CalculationParameters} with parameters is {@link TestParameter2} (default
   *       constructor).
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#findParameter(Class)}
   */
  @Test
  @DisplayName(
      "Test findParameter(Class); given CalculationParameters with parameters is TestParameter2 (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional CalculationParameters.findParameter(Class)"})
  void testFindParameter_givenCalculationParametersWithParametersIsTestParameter2() {
    // Arrange
    CalculationParameters ofResult = CalculationParameters.of(new TestParameter2());
    Class<CalculationParameter> type = CalculationParameter.class;

    // Act and Assert
    assertFalse(ofResult.findParameter(type).isPresent());
  }

  /**
   * Test {@link CalculationParameters#findParameter(Class)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#findParameter(Class)}
   */
  @Test
  @DisplayName("Test findParameter(Class); given empty; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional CalculationParameters.findParameter(Class)"})
  void testFindParameter_givenEmpty_thenReturnNotPresent() {
    // Arrange
    CalculationParameters emptyResult = CalculationParameters.empty();
    Class<CalculationParameter> type = CalculationParameter.class;

    // Act and Assert
    assertFalse(emptyResult.findParameter(type).isPresent());
  }

  /**
   * Test {@link CalculationParameters#getParameter(Class)}.
   *
   * <p>Method under test: {@link CalculationParameters#getParameter(Class)}
   */
  @Test
  @DisplayName("Test getParameter(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationParameter CalculationParameters.getParameter(Class)"})
  void testGetParameter() {
    // Arrange
    CalculationParameters ofResult =
        CalculationParameters.of(new TestParameter(), DefaultFxRateLookup.DEFAULT);
    Class<CalculationParameter> type = CalculationParameter.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getParameter(type));
  }

  /**
   * Test {@link CalculationParameters#getParameter(Class)}.
   *
   * <ul>
   *   <li>Given {@link CalculationParameters} with parameters is {@link
   *       DefaultFxRateLookup#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#getParameter(Class)}
   */
  @Test
  @DisplayName("Test getParameter(Class); given CalculationParameters with parameters is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationParameter CalculationParameters.getParameter(Class)"})
  void testGetParameter_givenCalculationParametersWithParametersIsDefault() {
    // Arrange
    CalculationParameters ofResult = CalculationParameters.of(DefaultFxRateLookup.DEFAULT);
    Class<CalculationParameter> type = CalculationParameter.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getParameter(type));
  }

  /**
   * Test {@link CalculationParameters#getParameter(Class)}.
   *
   * <ul>
   *   <li>Given {@link CalculationParameters} with parameters is {@link TestParameter2} (default
   *       constructor).
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#getParameter(Class)}
   */
  @Test
  @DisplayName(
      "Test getParameter(Class); given CalculationParameters with parameters is TestParameter2 (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationParameter CalculationParameters.getParameter(Class)"})
  void testGetParameter_givenCalculationParametersWithParametersIsTestParameter2() {
    // Arrange
    CalculationParameters ofResult = CalculationParameters.of(new TestParameter2());
    Class<CalculationParameter> type = CalculationParameter.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getParameter(type));
  }

  /**
   * Test {@link CalculationParameters#getParameter(Class)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#getParameter(Class)}
   */
  @Test
  @DisplayName("Test getParameter(Class); given empty; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationParameter CalculationParameters.getParameter(Class)"})
  void testGetParameter_givenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    CalculationParameters emptyResult = CalculationParameters.empty();
    Class<CalculationParameter> type = CalculationParameter.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> emptyResult.getParameter(type));
  }

  /**
   * Test {@link CalculationParameters#meta()}.
   *
   * <p>Method under test: {@link CalculationParameters#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationParameters.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CalculationParameters> actualMetaResult = CalculationParameters.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CalculationParameters> expectedBeanTypeResult = CalculationParameters.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CalculationParameters#metaBean()}.
   *
   * <p>Method under test: {@link CalculationParameters#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationParameters.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<CalculationParameters> actualMetaBeanResult =
        CalculationParameters.empty().metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CalculationParameters> expectedBeanTypeResult = CalculationParameters.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationParameters#toString()}
   *   <li>{@link CalculationParameters#getParameters()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableMap CalculationParameters.getParameters()",
    "String CalculationParameters.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CalculationParameters emptyResult = CalculationParameters.empty();

    // Act
    String actualToStringResult = emptyResult.toString();

    // Assert
    assertEquals("CalculationParameters{parameters={}}", actualToStringResult);
    assertTrue(emptyResult.getParameters().isEmpty());
  }

  /**
   * Test {@link CalculationParameters#equals(Object)}, and {@link
   * CalculationParameters#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationParameters#equals(Object)}
   *   <li>{@link CalculationParameters#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationParameters.equals(Object)",
    "int CalculationParameters.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CalculationParameters emptyResult = CalculationParameters.empty();
    CalculationParameters emptyResult2 = CalculationParameters.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link CalculationParameters#equals(Object)}, and {@link
   * CalculationParameters#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationParameters#equals(Object)}
   *   <li>{@link CalculationParameters#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationParameters.equals(Object)",
    "int CalculationParameters.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CalculationParameters emptyResult = CalculationParameters.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link CalculationParameters#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationParameters.equals(Object)",
    "int CalculationParameters.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CalculationParameters ofResult = CalculationParameters.of(DefaultFxRateLookup.DEFAULT);

    // Act and Assert
    assertNotEquals(ofResult, CalculationParameters.empty());
  }

  /**
   * Test {@link CalculationParameters#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationParameters.equals(Object)",
    "int CalculationParameters.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CalculationParameters.empty(), null);
  }

  /**
   * Test {@link CalculationParameters#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationParameters#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationParameters.equals(Object)",
    "int CalculationParameters.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CalculationParameters.empty(), "Different type to CalculationParameters");
  }
}
