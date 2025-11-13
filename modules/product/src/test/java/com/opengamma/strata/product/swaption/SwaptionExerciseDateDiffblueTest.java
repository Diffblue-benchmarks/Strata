package com.opengamma.strata.product.swaption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.swaption.SwaptionExerciseDate.Builder;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.direct.MinimalMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwaptionExerciseDateDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionExerciseDate Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange
    LocalDate exerciseDate = LocalDate.of(1970, 1, 1);
    LocalDate swapStartDate = LocalDate.of(1970, 1, 1);
    LocalDate unadjustedExerciseDate = LocalDate.of(1970, 1, 1);

    // Act
    SwaptionExerciseDate actualSwaptionExerciseDate =
        SwaptionExerciseDate.builder()
            .exerciseDate(exerciseDate)
            .swapStartDate(swapStartDate)
            .unadjustedExerciseDate(unadjustedExerciseDate)
            .build();

    // Assert
    LocalDate exerciseDate2 = actualSwaptionExerciseDate.getExerciseDate();
    assertEquals("1970-01-01", exerciseDate2.toString());
    LocalDate swapStartDate2 = actualSwaptionExerciseDate.getSwapStartDate();
    assertEquals("1970-01-01", swapStartDate2.toString());
    LocalDate unadjustedExerciseDate2 = actualSwaptionExerciseDate.getUnadjustedExerciseDate();
    assertEquals("1970-01-01", unadjustedExerciseDate2.toString());
    assertSame(exerciseDate, exerciseDate2);
    assertSame(swapStartDate, swapStartDate2);
    assertSame(unadjustedExerciseDate, unadjustedExerciseDate2);
  }

  /**
   * Test Builder {@link Builder#exerciseDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#exerciseDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder exerciseDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.exerciseDate(LocalDate)"})
  void testBuilderExerciseDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SwaptionExerciseDate.builder();

    // Act
    Builder actualExerciseDateResult = builderResult.exerciseDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualExerciseDateResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code exerciseDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'exerciseDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExerciseDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SwaptionExerciseDate.builder().get("exerciseDate"));
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
        NoSuchElementException.class, () -> SwaptionExerciseDate.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code swapStartDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'swapStartDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSwapStartDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SwaptionExerciseDate.builder().get("swapStartDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code unadjustedExerciseDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'unadjustedExerciseDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenUnadjustedExerciseDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SwaptionExerciseDate.builder().get("unadjustedExerciseDate"));
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
        () -> SwaptionExerciseDate.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code exerciseDate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'exerciseDate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenExerciseDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SwaptionExerciseDate.builder();

    // Act
    Builder actualSetResult = builderResult.set("exerciseDate", LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code swapStartDate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'swapStartDate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenSwapStartDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SwaptionExerciseDate.builder();

    // Act
    Builder actualSetResult = builderResult.set("swapStartDate", LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code unadjustedExerciseDate}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'unadjustedExerciseDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenUnadjustedExerciseDate() {
    // Arrange
    Builder builderResult = SwaptionExerciseDate.builder();

    // Act
    Builder actualSetResult = builderResult.set("unadjustedExerciseDate", LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Builder builderResult = SwaptionExerciseDate.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#swapStartDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#swapStartDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder swapStartDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.swapStartDate(LocalDate)"})
  void testBuilderSwapStartDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SwaptionExerciseDate.builder();

    // Act
    Builder actualSwapStartDateResult = builderResult.swapStartDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualSwapStartDateResult);
  }

  /**
   * Test Builder {@link Builder#unadjustedExerciseDate(LocalDate)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#unadjustedExerciseDate(LocalDate)}
   */
  @Test
  @DisplayName("Test Builder unadjustedExerciseDate(LocalDate); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.unadjustedExerciseDate(LocalDate)"})
  void testBuilderUnadjustedExerciseDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SwaptionExerciseDate.builder();

    // Act
    Builder actualUnadjustedExerciseDateResult =
        builderResult.unadjustedExerciseDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualUnadjustedExerciseDateResult);
  }

  /**
   * Test {@link SwaptionExerciseDate#compareTo(SwaptionExerciseDate)} with {@code
   * SwaptionExerciseDate}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDate#compareTo(SwaptionExerciseDate)}
   */
  @Test
  @DisplayName(
      "Test compareTo(SwaptionExerciseDate) with 'SwaptionExerciseDate'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SwaptionExerciseDate.compareTo(SwaptionExerciseDate)"})
  void testCompareToWithSwaptionExerciseDate_thenReturnMinusOne() {
    // Arrange
    SwaptionExerciseDate ofResult =
        SwaptionExerciseDate.of(
            LocalDate.of(1970, 1, 1), LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1));
    SwaptionExerciseDate other =
        SwaptionExerciseDate.of(
            LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertEquals(-1, ofResult.compareTo(other));
  }

  /**
   * Test {@link SwaptionExerciseDate#compareTo(SwaptionExerciseDate)} with {@code
   * SwaptionExerciseDate}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDate#compareTo(SwaptionExerciseDate)}
   */
  @Test
  @DisplayName("Test compareTo(SwaptionExerciseDate) with 'SwaptionExerciseDate'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SwaptionExerciseDate.compareTo(SwaptionExerciseDate)"})
  void testCompareToWithSwaptionExerciseDate_thenReturnZero() {
    // Arrange
    SwaptionExerciseDate ofResult =
        SwaptionExerciseDate.of(
            LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));
    SwaptionExerciseDate other =
        SwaptionExerciseDate.of(
            LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertEquals(0, ofResult.compareTo(other));
  }

  /**
   * Test {@link SwaptionExerciseDate#meta()}.
   *
   * <p>Method under test: {@link SwaptionExerciseDate#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SwaptionExerciseDate.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SwaptionExerciseDate> actualMetaResult = SwaptionExerciseDate.meta();

    // Assert
    assertTrue(actualMetaResult.builder() instanceof Builder);
    assertTrue(actualMetaResult instanceof MinimalMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("exerciseDate"));
    assertTrue(metaPropertyMapResult.containsKey("swapStartDate"));
    assertTrue(metaPropertyMapResult.containsKey("unadjustedExerciseDate"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SwaptionExerciseDate> expectedBeanTypeResult = SwaptionExerciseDate.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SwaptionExerciseDate#of(LocalDate, LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Then return ExerciseDate is {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDate#of(LocalDate, LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate, LocalDate); then return ExerciseDate is LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwaptionExerciseDate SwaptionExerciseDate.of(LocalDate, LocalDate, LocalDate)"
  })
  void testOf_thenReturnExerciseDateIsLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate exerciseDate = LocalDate.of(1970, 1, 1);
    LocalDate unadjustedExerciseDate = LocalDate.of(1970, 1, 1);
    LocalDate swapStartDate = LocalDate.of(1970, 1, 1);

    // Act
    SwaptionExerciseDate actualOfResult =
        SwaptionExerciseDate.of(exerciseDate, unadjustedExerciseDate, swapStartDate);

    // Assert
    assertSame(exerciseDate, actualOfResult.getExerciseDate());
    assertSame(swapStartDate, actualOfResult.getSwapStartDate());
    assertSame(unadjustedExerciseDate, actualOfResult.getUnadjustedExerciseDate());
  }

  /**
   * Test {@link SwaptionExerciseDate#metaBean()}.
   *
   * <p>Method under test: {@link SwaptionExerciseDate#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SwaptionExerciseDate.metaBean()"})
  void testMetaBean() {
    // Arrange
    SwaptionExerciseDate ofResult =
        SwaptionExerciseDate.of(
            LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Act
    TypedMetaBean<SwaptionExerciseDate> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult.builder() instanceof Builder);
    assertTrue(actualMetaBeanResult instanceof MinimalMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("exerciseDate"));
    assertTrue(metaPropertyMapResult.containsKey("swapStartDate"));
    assertTrue(metaPropertyMapResult.containsKey("unadjustedExerciseDate"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SwaptionExerciseDate> expectedBeanTypeResult = SwaptionExerciseDate.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionExerciseDate#toString()}
   *   <li>{@link SwaptionExerciseDate#getExerciseDate()}
   *   <li>{@link SwaptionExerciseDate#getSwapStartDate()}
   *   <li>{@link SwaptionExerciseDate#getUnadjustedExerciseDate()}
   *   <li>{@link SwaptionExerciseDate#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDate SwaptionExerciseDate.getExerciseDate()",
    "LocalDate SwaptionExerciseDate.getSwapStartDate()",
    "LocalDate SwaptionExerciseDate.getUnadjustedExerciseDate()",
    "Builder SwaptionExerciseDate.toBuilder()",
    "String SwaptionExerciseDate.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate exerciseDate = LocalDate.of(1970, 1, 1);
    LocalDate swapStartDate = LocalDate.of(1970, 1, 1);
    LocalDate unadjustedExerciseDate = LocalDate.of(1970, 1, 1);
    SwaptionExerciseDate swaptionExerciseDate =
        SwaptionExerciseDate.builder()
            .exerciseDate(exerciseDate)
            .swapStartDate(swapStartDate)
            .unadjustedExerciseDate(unadjustedExerciseDate)
            .build();

    // Act
    String actualToStringResult = swaptionExerciseDate.toString();
    LocalDate actualExerciseDate = swaptionExerciseDate.getExerciseDate();
    LocalDate actualSwapStartDate = swaptionExerciseDate.getSwapStartDate();
    LocalDate actualUnadjustedExerciseDate = swaptionExerciseDate.getUnadjustedExerciseDate();
    swaptionExerciseDate.toBuilder();

    // Assert
    assertEquals("1970-01-01", actualExerciseDate.toString());
    assertEquals("1970-01-01", actualSwapStartDate.toString());
    assertEquals("1970-01-01", actualUnadjustedExerciseDate.toString());
    assertEquals(
        "SwaptionExerciseDate{exerciseDate=1970-01-01, unadjustedExerciseDate=1970-01-01, swapStartDate"
            + "=1970-01-01}",
        actualToStringResult);
    assertSame(exerciseDate, actualExerciseDate);
    assertSame(swapStartDate, actualSwapStartDate);
    assertSame(unadjustedExerciseDate, actualUnadjustedExerciseDate);
  }

  /**
   * Test {@link SwaptionExerciseDate#equals(Object)}, and {@link SwaptionExerciseDate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionExerciseDate#equals(Object)}
   *   <li>{@link SwaptionExerciseDate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionExerciseDate.equals(Object)",
    "int SwaptionExerciseDate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SwaptionExerciseDate swaptionExerciseDate =
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build();
    SwaptionExerciseDate swaptionExerciseDate2 =
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertEquals(swaptionExerciseDate, swaptionExerciseDate2);
    assertEquals(swaptionExerciseDate.hashCode(), swaptionExerciseDate2.hashCode());
  }

  /**
   * Test {@link SwaptionExerciseDate#equals(Object)}, and {@link SwaptionExerciseDate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionExerciseDate#equals(Object)}
   *   <li>{@link SwaptionExerciseDate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionExerciseDate.equals(Object)",
    "int SwaptionExerciseDate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SwaptionExerciseDate swaptionExerciseDate =
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertEquals(swaptionExerciseDate, swaptionExerciseDate);
    int expectedHashCodeResult = swaptionExerciseDate.hashCode();
    assertEquals(expectedHashCodeResult, swaptionExerciseDate.hashCode());
  }

  /**
   * Test {@link SwaptionExerciseDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionExerciseDate.equals(Object)",
    "int SwaptionExerciseDate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SwaptionExerciseDate swaptionExerciseDate =
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.now())
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertNotEquals(
        swaptionExerciseDate,
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link SwaptionExerciseDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionExerciseDate.equals(Object)",
    "int SwaptionExerciseDate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SwaptionExerciseDate swaptionExerciseDate =
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.now())
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertNotEquals(
        swaptionExerciseDate,
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link SwaptionExerciseDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionExerciseDate.equals(Object)",
    "int SwaptionExerciseDate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SwaptionExerciseDate swaptionExerciseDate =
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.now())
            .build();

    // Act and Assert
    assertNotEquals(
        swaptionExerciseDate,
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link SwaptionExerciseDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionExerciseDate.equals(Object)",
    "int SwaptionExerciseDate.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build(),
        null);
  }

  /**
   * Test {@link SwaptionExerciseDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionExerciseDate.equals(Object)",
    "int SwaptionExerciseDate.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build(),
        "Different type to SwaptionExerciseDate");
  }
}
