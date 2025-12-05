package com.opengamma.strata.product.index.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DateSequence;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.index.OvernightIndex;
import com.opengamma.strata.product.index.type.ImmutableOvernightFutureContractSpec.Builder;
import com.opengamma.strata.product.swap.OvernightAccrualMethod;
import java.util.NoSuchElementException;
import org.joda.beans.MetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableOvernightFutureContractSpecDiffblueTest {
  /**
   * Test Builder {@link Builder#accrualMethod(OvernightAccrualMethod)}.
   *
   * <ul>
   *   <li>When {@code COMPOUNDED}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#accrualMethod(OvernightAccrualMethod)}
   */
  @Test
  @DisplayName(
      "Test Builder accrualMethod(OvernightAccrualMethod); when 'COMPOUNDED'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.accrualMethod(OvernightAccrualMethod)"})
  void testBuilderAccrualMethod_whenCompounded_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableOvernightFutureContractSpec.builder();

    // Act
    Builder actualAccrualMethodResult =
        builderResult.accrualMethod(OvernightAccrualMethod.COMPOUNDED);

    // Assert
    assertSame(builderResult, actualAccrualMethodResult);
  }

  /**
   * Test Builder {@link Builder#dateSequence(DateSequence)}.
   *
   * <ul>
   *   <li>When {@link DateSequence}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dateSequence(DateSequence)}
   */
  @Test
  @DisplayName("Test Builder dateSequence(DateSequence); when DateSequence; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dateSequence(DateSequence)"})
  void testBuilderDateSequence_whenDateSequence_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableOvernightFutureContractSpec.builder();

    // Act
    Builder actualDateSequenceResult = builderResult.dateSequence(mock(DateSequence.class));

    // Assert
    assertSame(builderResult, actualDateSequenceResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code accrualMethod}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'accrualMethod'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenAccrualMethod_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableOvernightFutureContractSpec.builder().get("accrualMethod"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code dateSequence}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'dateSequence'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDateSequence_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableOvernightFutureContractSpec.builder().get("dateSequence"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'index'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenIndex_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableOvernightFutureContractSpec.builder().get("index"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code lastTradeDateAdjustment}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'lastTradeDateAdjustment'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLastTradeDateAdjustment_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableOvernightFutureContractSpec.builder().get("lastTradeDateAdjustment"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableOvernightFutureContractSpec.builder().get("name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code notional}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'notional'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenNotional_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ((Double) ImmutableOvernightFutureContractSpec.builder().get("notional")).doubleValue());
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
        NoSuchElementException.class,
        () -> ImmutableOvernightFutureContractSpec.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#index(OvernightIndex)}.
   *
   * <ul>
   *   <li>When {@link OvernightIndex}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#index(OvernightIndex)}
   */
  @Test
  @DisplayName("Test Builder index(OvernightIndex); when OvernightIndex; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.index(OvernightIndex)"})
  void testBuilderIndex_whenOvernightIndex_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableOvernightFutureContractSpec.builder();

    // Act
    Builder actualIndexResult = builderResult.index(mock(OvernightIndex.class));

    // Assert
    assertSame(builderResult, actualIndexResult);
  }

  /**
   * Test Builder {@link Builder#lastTradeDateAdjustment(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#lastTradeDateAdjustment(DaysAdjustment)}
   */
  @Test
  @DisplayName(
      "Test Builder lastTradeDateAdjustment(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.lastTradeDateAdjustment(DaysAdjustment)"})
  void testBuilderLastTradeDateAdjustment_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableOvernightFutureContractSpec.builder();

    // Act
    Builder actualLastTradeDateAdjustmentResult =
        builderResult.lastTradeDateAdjustment(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualLastTradeDateAdjustmentResult);
  }

  /**
   * Test Builder {@link Builder#name(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(String)}
   */
  @Test
  @DisplayName("Test Builder name(String); when 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(String)"})
  void testBuilderName_whenName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableOvernightFutureContractSpec.builder();

    // Act
    Builder actualNameResult = builderResult.name("Name");

    // Assert
    assertSame(builderResult, actualNameResult);
  }

  /**
   * Test Builder {@link Builder#notional(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#notional(double)}
   */
  @Test
  @DisplayName("Test Builder notional(double); when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.notional(double)"})
  void testBuilderNotional_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableOvernightFutureContractSpec.builder();

    // Act
    Builder actualNotionalResult = builderResult.notional(10.0d);

    // Assert
    assertSame(builderResult, actualNotionalResult);
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
        () -> ImmutableOvernightFutureContractSpec.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code accrualMethod}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'accrualMethod'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenAccrualMethod_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableOvernightFutureContractSpec.builder();

    // Act
    Builder actualSetResult = builderResult.set("accrualMethod", OvernightAccrualMethod.COMPOUNDED);

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
    Builder builderResult = ImmutableOvernightFutureContractSpec.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }
}
