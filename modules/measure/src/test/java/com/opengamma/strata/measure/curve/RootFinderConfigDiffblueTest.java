package com.opengamma.strata.measure.curve;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.measure.curve.RootFinderConfig.Builder;
import com.opengamma.strata.measure.curve.RootFinderConfig.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RootFinderConfigDiffblueTest {
  /**
   * Test Builder {@link Builder#absoluteTolerance(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then builder build AbsoluteTolerance is ten.
   * </ul>
   *
   * <p>Method under test: {@link Builder#absoluteTolerance(double)}
   */
  @Test
  @DisplayName(
      "Test Builder absoluteTolerance(double); when ten; then builder build AbsoluteTolerance is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.absoluteTolerance(double)"})
  void testBuilderAbsoluteTolerance_whenTen_thenBuilderBuildAbsoluteToleranceIsTen() {
    // Arrange
    Builder builderResult = RootFinderConfig.builder();

    // Act
    Builder actualAbsoluteToleranceResult = builderResult.absoluteTolerance(10.0d);

    // Assert
    assertEquals(10.0d, builderResult.build().getAbsoluteTolerance());
    assertSame(builderResult, actualAbsoluteToleranceResult);
  }

  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RootFinderConfig Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange and Act
    RootFinderConfig actualRootFinderConfig =
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(3)
            .relativeTolerance(10.0d)
            .build();

    // Assert
    assertEquals(10.0d, actualRootFinderConfig.getAbsoluteTolerance());
    assertEquals(10.0d, actualRootFinderConfig.getRelativeTolerance());
    assertEquals(3, actualRootFinderConfig.getMaximumSteps());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>Then return intValue is {@link RootFinderConfig#DEFAULT_MAXIMUM_STEPS}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; then return intValue is DEFAULT_MAXIMUM_STEPS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_thenReturnIntValueIsDefault_maximum_steps() {
    // Arrange, Act and Assert
    assertEquals(
        RootFinderConfig.DEFAULT_MAXIMUM_STEPS,
        ((Integer) RootFinderConfig.builder().get("maximumSteps")).intValue());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code absoluteTolerance}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'absoluteTolerance'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenAbsoluteTolerance() {
    // Arrange, Act and Assert
    assertEquals(
        RootFinderConfig.DEFAULT_ABSOLUTE_TOLERANCE,
        ((Double) RootFinderConfig.builder().get("absoluteTolerance")).doubleValue());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> RootFinderConfig.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code relativeTolerance}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'relativeTolerance'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenRelativeTolerance() {
    // Arrange, Act and Assert
    assertEquals(
        RootFinderConfig.DEFAULT_ABSOLUTE_TOLERANCE,
        ((Double) RootFinderConfig.builder().get("relativeTolerance")).doubleValue());
  }

  /**
   * Test Builder {@link Builder#maximumSteps(int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then builder build MaximumSteps is three.
   * </ul>
   *
   * <p>Method under test: {@link Builder#maximumSteps(int)}
   */
  @Test
  @DisplayName(
      "Test Builder maximumSteps(int); when three; then builder build MaximumSteps is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.maximumSteps(int)"})
  void testBuilderMaximumSteps_whenThree_thenBuilderBuildMaximumStepsIsThree() {
    // Arrange
    Builder builderResult = RootFinderConfig.builder();

    // Act
    Builder actualMaximumStepsResult = builderResult.maximumSteps(3);

    // Assert
    assertEquals(3, builderResult.build().getMaximumSteps());
    assertSame(builderResult, actualMaximumStepsResult);
  }

  /**
   * Test Builder {@link Builder#relativeTolerance(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then builder build RelativeTolerance is ten.
   * </ul>
   *
   * <p>Method under test: {@link Builder#relativeTolerance(double)}
   */
  @Test
  @DisplayName(
      "Test Builder relativeTolerance(double); when ten; then builder build RelativeTolerance is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.relativeTolerance(double)"})
  void testBuilderRelativeTolerance_whenTen_thenBuilderBuildRelativeToleranceIsTen() {
    // Arrange
    Builder builderResult = RootFinderConfig.builder();

    // Act
    Builder actualRelativeToleranceResult = builderResult.relativeTolerance(10.0d);

    // Assert
    assertEquals(10.0d, builderResult.build().getRelativeTolerance());
    assertSame(builderResult, actualRelativeToleranceResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then builder build AbsoluteTolerance is ten.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then builder build AbsoluteTolerance is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenBuilderBuildAbsoluteToleranceIsTen() {
    // Arrange
    Builder builderResult = RootFinderConfig.builder();

    // Act
    Builder actualSetResult = builderResult.set("absoluteTolerance", 10.0d);

    // Assert
    assertEquals(10.0d, builderResult.build().getAbsoluteTolerance());
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> RootFinderConfig.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RootFinderConfig.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends RootFinderConfig> actualBeanTypeResult = RootFinderConfig.meta().beanType();

    // Assert
    Class<RootFinderConfig> expectedBeanTypeResult = RootFinderConfig.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#builder()}.
   *
   * <p>Method under test: {@link Meta#builder()}
   */
  @Test
  @DisplayName("Test Meta builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Meta.builder()"})
  void testMetaBuilder() {
    // Arrange, Act and Assert
    RootFinderConfig rootFinderConfig = RootFinderConfig.meta().builder().build();
    assertEquals(
        RootFinderConfig.DEFAULT_ABSOLUTE_TOLERANCE, rootFinderConfig.getAbsoluteTolerance());
    assertEquals(
        RootFinderConfig.DEFAULT_ABSOLUTE_TOLERANCE, rootFinderConfig.getRelativeTolerance());
    assertEquals(RootFinderConfig.DEFAULT_MAXIMUM_STEPS, rootFinderConfig.getMaximumSteps());
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#absoluteTolerance()}
   *   <li>{@link Meta#maximumSteps()}
   *   <li>{@link Meta#relativeTolerance()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.absoluteTolerance()",
    "MetaProperty Meta.maximumSteps()",
    "MetaProperty Meta.relativeTolerance()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RootFinderConfig.meta();

    // Act
    MetaProperty<Double> actualAbsoluteToleranceResult = metaResult.absoluteTolerance();
    MetaProperty<Integer> actualMaximumStepsResult = metaResult.maximumSteps();

    // Assert
    assertTrue(actualAbsoluteToleranceResult instanceof DirectMetaProperty);
    assertTrue(actualMaximumStepsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.relativeTolerance() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code absoluteTolerance}.
   *   <li>Then return name is {@code absoluteTolerance}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'absoluteTolerance'; then return name is 'absoluteTolerance'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAbsoluteTolerance_thenReturnNameIsAbsoluteTolerance() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RootFinderConfig.meta().metaPropertyGet("absoluteTolerance");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Integer> maximumStepsResult = ((Meta) metaBeanResult).maximumSteps();
    assertTrue(maximumStepsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> relativeToleranceResult = ((Meta) metaBeanResult).relativeTolerance();
    assertTrue(relativeToleranceResult instanceof DirectMetaProperty);
    assertEquals("absoluteTolerance", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).absoluteTolerance());
    assertSame(metaBeanResult, maximumStepsResult.metaBean());
    assertSame(metaBeanResult, relativeToleranceResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code maximumSteps}.
   *   <li>Then return propertyType Name is {@code int}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'maximumSteps'; then return propertyType Name is 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMaximumSteps_thenReturnPropertyTypeNameIsInt() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RootFinderConfig.meta().metaPropertyGet("maximumSteps");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> absoluteToleranceResult = ((Meta) metaBeanResult).absoluteTolerance();
    assertTrue(absoluteToleranceResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> relativeToleranceResult = ((Meta) metaBeanResult).relativeTolerance();
    assertTrue(relativeToleranceResult instanceof DirectMetaProperty);
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("maximumSteps", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).maximumSteps());
    assertSame(metaBeanResult, absoluteToleranceResult.metaBean());
    assertSame(metaBeanResult, relativeToleranceResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RootFinderConfig.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code relativeTolerance}.
   *   <li>Then return name is {@code relativeTolerance}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'relativeTolerance'; then return name is 'relativeTolerance'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRelativeTolerance_thenReturnNameIsRelativeTolerance() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RootFinderConfig.meta().metaPropertyGet("relativeTolerance");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> absoluteToleranceResult = ((Meta) metaBeanResult).absoluteTolerance();
    assertTrue(absoluteToleranceResult instanceof DirectMetaProperty);
    MetaProperty<Integer> maximumStepsResult = ((Meta) metaBeanResult).maximumSteps();
    assertTrue(maximumStepsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("relativeTolerance", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).relativeTolerance());
    assertSame(metaBeanResult, absoluteToleranceResult.metaBean());
    assertSame(metaBeanResult, maximumStepsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        RootFinderConfig.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("absoluteTolerance");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("maximumSteps");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("relativeTolerance");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("absoluteTolerance", getResult.name());
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("double", getResult3.propertyType().getName());
    assertEquals("int", getResult2.propertyType().getName());
    assertEquals("maximumSteps", getResult2.name());
    assertEquals("relativeTolerance", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<RootFinderConfig> expectedDeclaringTypeResult = RootFinderConfig.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<RootFinderConfig> expectedDeclaringTypeResult2 = RootFinderConfig.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<RootFinderConfig> expectedDeclaringTypeResult3 = RootFinderConfig.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code absoluteTolerance}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'absoluteTolerance'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenAbsoluteTolerance_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = RootFinderConfig.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    RootFinderConfig.builder()
                        .absoluteTolerance(10.0d)
                        .maximumSteps(3)
                        .relativeTolerance(10.0d)
                        .build(),
                    "absoluteTolerance",
                    true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RootFinderConfig.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code maximumSteps}.
   *   <li>Then return intValue is three.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'maximumSteps'; then return intValue is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenMaximumSteps_thenReturnIntValueIsThree() {
    // Arrange
    Meta metaResult = RootFinderConfig.meta();

    // Act and Assert
    assertEquals(
        3,
        ((Integer)
                metaResult.propertyGet(
                    RootFinderConfig.builder()
                        .absoluteTolerance(10.0d)
                        .maximumSteps(3)
                        .relativeTolerance(10.0d)
                        .build(),
                    "maximumSteps",
                    true))
            .intValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code relativeTolerance}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'relativeTolerance'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenRelativeTolerance_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = RootFinderConfig.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    RootFinderConfig.builder()
                        .absoluteTolerance(10.0d)
                        .maximumSteps(3)
                        .relativeTolerance(10.0d)
                        .build(),
                    "relativeTolerance",
                    true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When standard.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when standard; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenStandard_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = RootFinderConfig.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(RootFinderConfig.standard(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code absoluteTolerance}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'absoluteTolerance'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAbsoluteTolerance_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RootFinderConfig.meta()
                .propertySet(mock(Bean.class), "absoluteTolerance", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            RootFinderConfig.meta()
                .propertySet(mock(Bean.class), "absoluteTolerance", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code maximumSteps}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'maximumSteps'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMaximumSteps_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RootFinderConfig.meta()
                .propertySet(mock(Bean.class), "maximumSteps", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            RootFinderConfig.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code relativeTolerance}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'relativeTolerance'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRelativeTolerance_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RootFinderConfig.meta()
                .propertySet(mock(Bean.class), "relativeTolerance", "New Value", true));
  }

  /**
   * Test {@link RootFinderConfig#standard()}.
   *
   * <p>Method under test: {@link RootFinderConfig#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RootFinderConfig RootFinderConfig.standard()"})
  void testStandard() {
    // Arrange and Act
    RootFinderConfig actualStandardResult = RootFinderConfig.standard();

    // Assert
    assertEquals(
        RootFinderConfig.DEFAULT_ABSOLUTE_TOLERANCE, actualStandardResult.getAbsoluteTolerance());
    assertEquals(
        RootFinderConfig.DEFAULT_ABSOLUTE_TOLERANCE, actualStandardResult.getRelativeTolerance());
    assertEquals(RootFinderConfig.DEFAULT_MAXIMUM_STEPS, actualStandardResult.getMaximumSteps());
  }

  /**
   * Test {@link RootFinderConfig#meta()}.
   *
   * <p>Method under test: {@link RootFinderConfig#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RootFinderConfig.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = RootFinderConfig.meta();

    // Assert
    MetaProperty<Double> absoluteToleranceResult = actualMetaResult.absoluteTolerance();
    assertTrue(absoluteToleranceResult instanceof DirectMetaProperty);
    MetaProperty<Integer> maximumStepsResult = actualMetaResult.maximumSteps();
    assertTrue(maximumStepsResult instanceof DirectMetaProperty);
    MetaProperty<Double> relativeToleranceResult = actualMetaResult.relativeTolerance();
    assertTrue(relativeToleranceResult instanceof DirectMetaProperty);
    assertEquals("absoluteTolerance", absoluteToleranceResult.name());
    assertEquals("double", absoluteToleranceResult.propertyType().getName());
    assertEquals("double", relativeToleranceResult.propertyType().getName());
    assertEquals("int", maximumStepsResult.propertyType().getName());
    assertEquals("maximumSteps", maximumStepsResult.name());
    assertEquals("relativeTolerance", relativeToleranceResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, absoluteToleranceResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, maximumStepsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, relativeToleranceResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<RootFinderConfig> expectedDeclaringTypeResult = RootFinderConfig.class;
    assertEquals(expectedDeclaringTypeResult, absoluteToleranceResult.declaringType());
    Class<RootFinderConfig> expectedDeclaringTypeResult2 = RootFinderConfig.class;
    assertEquals(expectedDeclaringTypeResult2, maximumStepsResult.declaringType());
    Class<RootFinderConfig> expectedDeclaringTypeResult3 = RootFinderConfig.class;
    assertEquals(expectedDeclaringTypeResult3, relativeToleranceResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, absoluteToleranceResult.metaBean());
    assertSame(meta, maximumStepsResult.metaBean());
    assertSame(meta, relativeToleranceResult.metaBean());
  }

  /**
   * Test {@link RootFinderConfig#metaBean()}.
   *
   * <p>Method under test: {@link RootFinderConfig#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RootFinderConfig.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, RootFinderConfig.standard().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RootFinderConfig#toString()}
   *   <li>{@link RootFinderConfig#getAbsoluteTolerance()}
   *   <li>{@link RootFinderConfig#getMaximumSteps()}
   *   <li>{@link RootFinderConfig#getRelativeTolerance()}
   *   <li>{@link RootFinderConfig#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double RootFinderConfig.getAbsoluteTolerance()",
    "int RootFinderConfig.getMaximumSteps()",
    "double RootFinderConfig.getRelativeTolerance()",
    "Builder RootFinderConfig.toBuilder()",
    "String RootFinderConfig.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    RootFinderConfig rootFinderConfig =
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(3)
            .relativeTolerance(10.0d)
            .build();

    // Act
    String actualToStringResult = rootFinderConfig.toString();
    double actualAbsoluteTolerance = rootFinderConfig.getAbsoluteTolerance();
    int actualMaximumSteps = rootFinderConfig.getMaximumSteps();
    double actualRelativeTolerance = rootFinderConfig.getRelativeTolerance();
    rootFinderConfig.toBuilder();

    // Assert
    assertEquals(
        "RootFinderConfig{absoluteTolerance=10.0, relativeTolerance=10.0, maximumSteps=3}",
        actualToStringResult);
    assertEquals(10.0d, actualAbsoluteTolerance);
    assertEquals(10.0d, actualRelativeTolerance);
    assertEquals(3, actualMaximumSteps);
  }

  /**
   * Test {@link RootFinderConfig#equals(Object)}, and {@link RootFinderConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RootFinderConfig#equals(Object)}
   *   <li>{@link RootFinderConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RootFinderConfig.equals(Object)", "int RootFinderConfig.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RootFinderConfig rootFinderConfig =
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(3)
            .relativeTolerance(10.0d)
            .build();
    RootFinderConfig rootFinderConfig2 =
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(3)
            .relativeTolerance(10.0d)
            .build();

    // Act and Assert
    assertEquals(rootFinderConfig, rootFinderConfig2);
    assertEquals(rootFinderConfig.hashCode(), rootFinderConfig2.hashCode());
  }

  /**
   * Test {@link RootFinderConfig#equals(Object)}, and {@link RootFinderConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RootFinderConfig#equals(Object)}
   *   <li>{@link RootFinderConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RootFinderConfig.equals(Object)", "int RootFinderConfig.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RootFinderConfig rootFinderConfig =
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(3)
            .relativeTolerance(10.0d)
            .build();

    // Act and Assert
    assertEquals(rootFinderConfig, rootFinderConfig);
    int expectedHashCodeResult = rootFinderConfig.hashCode();
    assertEquals(expectedHashCodeResult, rootFinderConfig.hashCode());
  }

  /**
   * Test {@link RootFinderConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RootFinderConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RootFinderConfig.equals(Object)", "int RootFinderConfig.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RootFinderConfig rootFinderConfig =
        RootFinderConfig.builder()
            .absoluteTolerance(0.5d)
            .maximumSteps(3)
            .relativeTolerance(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(
        rootFinderConfig,
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(3)
            .relativeTolerance(10.0d)
            .build());
  }

  /**
   * Test {@link RootFinderConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RootFinderConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RootFinderConfig.equals(Object)", "int RootFinderConfig.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RootFinderConfig rootFinderConfig =
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(1)
            .relativeTolerance(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(
        rootFinderConfig,
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(3)
            .relativeTolerance(10.0d)
            .build());
  }

  /**
   * Test {@link RootFinderConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RootFinderConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RootFinderConfig.equals(Object)", "int RootFinderConfig.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RootFinderConfig rootFinderConfig =
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(3)
            .relativeTolerance(0.5d)
            .build();

    // Act and Assert
    assertNotEquals(
        rootFinderConfig,
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(3)
            .relativeTolerance(10.0d)
            .build());
  }

  /**
   * Test {@link RootFinderConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RootFinderConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RootFinderConfig.equals(Object)", "int RootFinderConfig.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(3)
            .relativeTolerance(10.0d)
            .build(),
        null);
  }

  /**
   * Test {@link RootFinderConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RootFinderConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RootFinderConfig.equals(Object)", "int RootFinderConfig.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        RootFinderConfig.builder()
            .absoluteTolerance(10.0d)
            .maximumSteps(3)
            .relativeTolerance(10.0d)
            .build(),
        "Different type to RootFinderConfig");
  }
}
