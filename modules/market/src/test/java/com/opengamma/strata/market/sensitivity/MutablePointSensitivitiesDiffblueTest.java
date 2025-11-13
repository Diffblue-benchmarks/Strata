package com.opengamma.strata.market.sensitivity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.currency.Currency;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MutablePointSensitivitiesDiffblueTest {
  /**
   * Test {@link MutablePointSensitivities#build()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MutablePointSensitivities#build()}
   *   <li>{@link MutablePointSensitivities#MutablePointSensitivities()}
   * </ul>
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MutablePointSensitivities.<init>()",
    "PointSensitivities MutablePointSensitivities.build()",
    "java.lang.String MutablePointSensitivities.toString()"
  })
  void testBuild() {
    // Arrange and Act
    MutablePointSensitivities actualMutablePointSensitivities = new MutablePointSensitivities();
    PointSensitivities actualPointSensitivities = actualMutablePointSensitivities.build();

    // Assert
    assertEquals(0, actualPointSensitivities.size());
    assertEquals(actualMutablePointSensitivities, actualPointSensitivities.toMutable());
    assertSame(
        actualMutablePointSensitivities.getSensitivities(),
        actualPointSensitivities.getSensitivities());
  }

  /**
   * Test {@link MutablePointSensitivities#MutablePointSensitivities(List)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#MutablePointSensitivities(List)}
   */
  @Test
  @DisplayName("Test new MutablePointSensitivities(List); given 'null'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MutablePointSensitivities.<init>(List)"})
  void testNewMutablePointSensitivities_givenNull_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<PointSensitivity> sensitivities = new ArrayList<>();
    sensitivities.add(null);

    // Act and Assert
    assertEquals(1, new MutablePointSensitivities(sensitivities).size());
  }

  /**
   * Test {@link MutablePointSensitivities#MutablePointSensitivities(List)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#MutablePointSensitivities(List)}
   */
  @Test
  @DisplayName("Test new MutablePointSensitivities(List); given 'null'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MutablePointSensitivities.<init>(List)"})
  void testNewMutablePointSensitivities_givenNull_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<PointSensitivity> sensitivities = new ArrayList<>();
    sensitivities.add(null);
    sensitivities.add(null);

    // Act and Assert
    assertEquals(2, new MutablePointSensitivities(sensitivities).size());
  }

  /**
   * Test {@link MutablePointSensitivities#MutablePointSensitivities(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#MutablePointSensitivities(List)}
   */
  @Test
  @DisplayName(
      "Test new MutablePointSensitivities(List); when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MutablePointSensitivities.<init>(List)"})
  void testNewMutablePointSensitivities_whenArrayList_thenReturnSizeIsZero() {
    // Arrange
    ArrayList<PointSensitivity> sensitivities = new ArrayList<>();

    // Act
    MutablePointSensitivities actualMutablePointSensitivities =
        new MutablePointSensitivities(sensitivities);

    // Assert
    assertEquals(0, actualMutablePointSensitivities.size());
    assertEquals(sensitivities, actualMutablePointSensitivities.getSensitivities());
  }

  /**
   * Test {@link MutablePointSensitivities#MutablePointSensitivities(PointSensitivity)}.
   *
   * <ul>
   *   <li>When {@link PointSensitivity}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * MutablePointSensitivities#MutablePointSensitivities(PointSensitivity)}
   */
  @Test
  @DisplayName(
      "Test new MutablePointSensitivities(PointSensitivity); when PointSensitivity; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MutablePointSensitivities.<init>(PointSensitivity)"})
  void testNewMutablePointSensitivities_whenPointSensitivity_thenReturnSizeIsOne() {
    // Arrange
    PointSensitivity sensitivity = mock(PointSensitivity.class);

    // Act
    MutablePointSensitivities actualMutablePointSensitivities =
        new MutablePointSensitivities(sensitivity);

    // Assert
    assertEquals(1, actualMutablePointSensitivities.size());
    ImmutableList<PointSensitivity> sensitivities =
        actualMutablePointSensitivities.getSensitivities();
    assertEquals(1, sensitivities.size());
    assertSame(sensitivity, sensitivities.get(0));
  }

  /**
   * Test {@link MutablePointSensitivities#size()}.
   *
   * <p>Method under test: {@link MutablePointSensitivities#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MutablePointSensitivities.size()"})
  void testSize() {
    // Arrange, Act and Assert
    assertEquals(0, new MutablePointSensitivities().size());
  }

  /**
   * Test {@link MutablePointSensitivities#getSensitivities()}.
   *
   * <p>Method under test: {@link MutablePointSensitivities#getSensitivities()}
   */
  @Test
  @DisplayName("Test getSensitivities()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList MutablePointSensitivities.getSensitivities()"})
  void testGetSensitivities() {
    // Arrange, Act and Assert
    assertTrue(new MutablePointSensitivities().getSensitivities().isEmpty());
  }

  /**
   * Test {@link MutablePointSensitivities#add(PointSensitivity)}.
   *
   * <ul>
   *   <li>When {@link PointSensitivity}.
   *   <li>Then {@link MutablePointSensitivities#MutablePointSensitivities()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#add(PointSensitivity)}
   */
  @Test
  @DisplayName(
      "Test add(PointSensitivity); when PointSensitivity; then MutablePointSensitivities() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities MutablePointSensitivities.add(PointSensitivity)"})
  void testAdd_whenPointSensitivity_thenMutablePointSensitivitiesSizeIsOne() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();
    PointSensitivity sensitivity = mock(PointSensitivity.class);

    // Act
    MutablePointSensitivities actualAddResult = mutablePointSensitivities.add(sensitivity);

    // Assert
    assertEquals(1, mutablePointSensitivities.size());
    ImmutableList<PointSensitivity> sensitivities = mutablePointSensitivities.getSensitivities();
    assertEquals(1, sensitivities.size());
    assertSame(mutablePointSensitivities, actualAddResult);
    assertSame(sensitivity, sensitivities.get(0));
  }

  /**
   * Test {@link MutablePointSensitivities#addAll(MutablePointSensitivities)} with {@code other}.
   *
   * <ul>
   *   <li>Then return {@link MutablePointSensitivities#MutablePointSensitivities()}.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#addAll(MutablePointSensitivities)}
   */
  @Test
  @DisplayName(
      "Test addAll(MutablePointSensitivities) with 'other'; then return MutablePointSensitivities()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MutablePointSensitivities MutablePointSensitivities.addAll(MutablePointSensitivities)"
  })
  void testAddAllWithOther_thenReturnMutablePointSensitivities() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    // Act
    MutablePointSensitivities actualAddAllResult =
        mutablePointSensitivities.addAll(new MutablePointSensitivities());

    // Assert
    assertSame(mutablePointSensitivities, actualAddAllResult);
  }

  /**
   * Test {@link MutablePointSensitivities#addAll(List)} with {@code sensitivities}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>Then {@link MutablePointSensitivities#MutablePointSensitivities()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#addAll(List)}
   */
  @Test
  @DisplayName(
      "Test addAll(List) with 'sensitivities'; given 'null'; then MutablePointSensitivities() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities MutablePointSensitivities.addAll(List)"})
  void testAddAllWithSensitivities_givenNull_thenMutablePointSensitivitiesSizeIsOne() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    ArrayList<PointSensitivity> sensitivities = new ArrayList<>();
    sensitivities.add(null);

    // Act
    MutablePointSensitivities actualAddAllResult = mutablePointSensitivities.addAll(sensitivities);

    // Assert
    assertEquals(1, mutablePointSensitivities.size());
    assertSame(mutablePointSensitivities, actualAddAllResult);
  }

  /**
   * Test {@link MutablePointSensitivities#addAll(List)} with {@code sensitivities}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>Then {@link MutablePointSensitivities#MutablePointSensitivities()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#addAll(List)}
   */
  @Test
  @DisplayName(
      "Test addAll(List) with 'sensitivities'; given 'null'; then MutablePointSensitivities() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities MutablePointSensitivities.addAll(List)"})
  void testAddAllWithSensitivities_givenNull_thenMutablePointSensitivitiesSizeIsTwo() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    ArrayList<PointSensitivity> sensitivities = new ArrayList<>();
    sensitivities.add(null);
    sensitivities.add(null);

    // Act
    MutablePointSensitivities actualAddAllResult = mutablePointSensitivities.addAll(sensitivities);

    // Assert
    assertEquals(2, mutablePointSensitivities.size());
    assertSame(mutablePointSensitivities, actualAddAllResult);
  }

  /**
   * Test {@link MutablePointSensitivities#addAll(List)} with {@code sensitivities}.
   *
   * <ul>
   *   <li>Then {@link MutablePointSensitivities#MutablePointSensitivities()} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#addAll(List)}
   */
  @Test
  @DisplayName(
      "Test addAll(List) with 'sensitivities'; then MutablePointSensitivities() size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities MutablePointSensitivities.addAll(List)"})
  void testAddAllWithSensitivities_thenMutablePointSensitivitiesSizeIsZero() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    // Act
    MutablePointSensitivities actualAddAllResult =
        mutablePointSensitivities.addAll(new ArrayList<>());

    // Assert
    assertEquals(0, mutablePointSensitivities.size());
    assertSame(mutablePointSensitivities, actualAddAllResult);
  }

  /**
   * Test {@link MutablePointSensitivities#withCurrency(Currency)}.
   *
   * <p>Method under test: {@link MutablePointSensitivities#withCurrency(Currency)}
   */
  @Test
  @DisplayName("Test withCurrency(Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities MutablePointSensitivities.withCurrency(Currency)"})
  void testWithCurrency() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    // Act
    MutablePointSensitivities actualWithCurrencyResult =
        mutablePointSensitivities.withCurrency(null);

    // Assert
    assertSame(mutablePointSensitivities, actualWithCurrencyResult);
  }

  /**
   * Test {@link MutablePointSensitivities#multipliedBy(double)}.
   *
   * <p>Method under test: {@link MutablePointSensitivities#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities MutablePointSensitivities.multipliedBy(double)"})
  void testMultipliedBy() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    // Act
    MutablePointSensitivities actualMultipliedByResult =
        mutablePointSensitivities.multipliedBy(10.0d);

    // Assert
    assertSame(mutablePointSensitivities, actualMultipliedByResult);
  }

  /**
   * Test {@link MutablePointSensitivities#mapSensitivity(DoubleUnaryOperator)}.
   *
   * <p>Method under test: {@link MutablePointSensitivities#mapSensitivity(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapSensitivity(DoubleUnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MutablePointSensitivities MutablePointSensitivities.mapSensitivity(DoubleUnaryOperator)"
  })
  void testMapSensitivity() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    // Act
    MutablePointSensitivities actualMapSensitivityResult =
        mutablePointSensitivities.mapSensitivity(mock(DoubleUnaryOperator.class));

    // Assert
    assertSame(mutablePointSensitivities, actualMapSensitivityResult);
  }

  /**
   * Test {@link MutablePointSensitivities#combinedWith(PointSensitivityBuilder)}.
   *
   * <ul>
   *   <li>When {@link NoPointSensitivity#INSTANCE}.
   *   <li>Then return {@link MutablePointSensitivities#MutablePointSensitivities()}.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#combinedWith(PointSensitivityBuilder)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(PointSensitivityBuilder); when INSTANCE; then return MutablePointSensitivities()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MutablePointSensitivities MutablePointSensitivities.combinedWith(PointSensitivityBuilder)"
  })
  void testCombinedWith_whenInstance_thenReturnMutablePointSensitivities() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    // Act
    MutablePointSensitivities actualCombinedWithResult =
        mutablePointSensitivities.combinedWith(NoPointSensitivity.INSTANCE);

    // Assert
    assertSame(mutablePointSensitivities, actualCombinedWithResult);
  }

  /**
   * Test {@link MutablePointSensitivities#combinedWith(PointSensitivityBuilder)}.
   *
   * <ul>
   *   <li>When {@link MutablePointSensitivities#MutablePointSensitivities()}.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#combinedWith(PointSensitivityBuilder)}
   */
  @Test
  @DisplayName("Test combinedWith(PointSensitivityBuilder); when MutablePointSensitivities()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MutablePointSensitivities MutablePointSensitivities.combinedWith(PointSensitivityBuilder)"
  })
  void testCombinedWith_whenMutablePointSensitivities() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    // Act
    MutablePointSensitivities actualCombinedWithResult =
        mutablePointSensitivities.combinedWith(new MutablePointSensitivities());

    // Assert
    assertSame(mutablePointSensitivities, actualCombinedWithResult);
  }

  /**
   * Test {@link MutablePointSensitivities#buildInto(MutablePointSensitivities)}.
   *
   * <ul>
   *   <li>When {@link MutablePointSensitivities#MutablePointSensitivities()}.
   *   <li>Then return {@link MutablePointSensitivities#MutablePointSensitivities()}.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#buildInto(MutablePointSensitivities)}
   */
  @Test
  @DisplayName(
      "Test buildInto(MutablePointSensitivities); when MutablePointSensitivities(); then return MutablePointSensitivities()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MutablePointSensitivities MutablePointSensitivities.buildInto(MutablePointSensitivities)"
  })
  void testBuildInto_whenMutablePointSensitivities_thenReturnMutablePointSensitivities() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();
    MutablePointSensitivities combination = new MutablePointSensitivities();

    // Act
    MutablePointSensitivities actualBuildIntoResult =
        mutablePointSensitivities.buildInto(combination);

    // Assert
    assertSame(combination, actualBuildIntoResult);
  }

  /**
   * Test {@link MutablePointSensitivities#cloned()}.
   *
   * <p>Method under test: {@link MutablePointSensitivities#cloned()}
   */
  @Test
  @DisplayName("Test cloned()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities MutablePointSensitivities.cloned()"})
  void testCloned() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    // Act
    MutablePointSensitivities actualClonedResult = mutablePointSensitivities.cloned();

    // Assert
    assertEquals(mutablePointSensitivities, actualClonedResult);
  }

  /**
   * Test {@link MutablePointSensitivities#sort()}.
   *
   * <p>Method under test: {@link MutablePointSensitivities#sort()}
   */
  @Test
  @DisplayName("Test sort()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities MutablePointSensitivities.sort()"})
  void testSort() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    // Act
    MutablePointSensitivities actualSortResult = mutablePointSensitivities.sort();

    // Assert
    assertSame(mutablePointSensitivities, actualSortResult);
  }

  /**
   * Test {@link MutablePointSensitivities#normalize()}.
   *
   * <p>Method under test: {@link MutablePointSensitivities#normalize()}
   */
  @Test
  @DisplayName("Test normalize()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities MutablePointSensitivities.normalize()"})
  void testNormalize() {
    // Arrange
    PointSensitivity sensitivity = mock(PointSensitivity.class);
    when(sensitivity.compareKey(Mockito.<PointSensitivity>any())).thenReturn(1);

    MutablePointSensitivities mutablePointSensitivities =
        new MutablePointSensitivities(mock(PointSensitivity.class));
    mutablePointSensitivities.add(sensitivity);

    // Act
    MutablePointSensitivities actualNormalizeResult = mutablePointSensitivities.normalize();

    // Assert
    verify(sensitivity, atLeast(1)).compareKey(isA(PointSensitivity.class));
    assertEquals(2, mutablePointSensitivities.size());
    assertSame(mutablePointSensitivities, actualNormalizeResult);
  }

  /**
   * Test {@link MutablePointSensitivities#normalize()}.
   *
   * <ul>
   *   <li>Given {@link MutablePointSensitivities#MutablePointSensitivities(PointSensitivity)} with
   *       sensitivity is {@link PointSensitivity}.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#normalize()}
   */
  @Test
  @DisplayName(
      "Test normalize(); given MutablePointSensitivities(PointSensitivity) with sensitivity is PointSensitivity")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities MutablePointSensitivities.normalize()"})
  void testNormalize_givenMutablePointSensitivitiesWithSensitivityIsPointSensitivity() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities =
        new MutablePointSensitivities(mock(PointSensitivity.class));

    // Act
    MutablePointSensitivities actualNormalizeResult = mutablePointSensitivities.normalize();

    // Assert
    assertEquals(1, mutablePointSensitivities.size());
    assertSame(mutablePointSensitivities, actualNormalizeResult);
  }

  /**
   * Test {@link MutablePointSensitivities#normalize()}.
   *
   * <ul>
   *   <li>Given {@link PointSensitivity} {@link PointSensitivity#compareKey(PointSensitivity)}
   *       return zero.
   *   <li>Then calls {@link PointSensitivity#getSensitivity()}.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#normalize()}
   */
  @Test
  @DisplayName(
      "Test normalize(); given PointSensitivity compareKey(PointSensitivity) return zero; then calls getSensitivity()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities MutablePointSensitivities.normalize()"})
  void testNormalize_givenPointSensitivityCompareKeyReturnZero_thenCallsGetSensitivity() {
    // Arrange
    PointSensitivity sensitivity = mock(PointSensitivity.class);
    when(sensitivity.compareKey(Mockito.<PointSensitivity>any())).thenReturn(0);
    when(sensitivity.getSensitivity()).thenReturn(10.0d);

    PointSensitivity sensitivity2 = mock(PointSensitivity.class);
    when(sensitivity2.withSensitivity(anyDouble())).thenReturn(null);
    when(sensitivity2.getSensitivity()).thenReturn(10.0d);
    when(sensitivity2.compareKey(Mockito.<PointSensitivity>any())).thenReturn(-1);

    MutablePointSensitivities mutablePointSensitivities =
        new MutablePointSensitivities(sensitivity);
    mutablePointSensitivities.add(sensitivity2);

    // Act
    MutablePointSensitivities actualNormalizeResult = mutablePointSensitivities.normalize();

    // Assert
    verify(sensitivity).compareKey(isA(PointSensitivity.class));
    verify(sensitivity2).compareKey(isA(PointSensitivity.class));
    verify(sensitivity).getSensitivity();
    verify(sensitivity2).getSensitivity();
    verify(sensitivity2).withSensitivity(20.0d);
    assertEquals(1, mutablePointSensitivities.size());
    assertSame(mutablePointSensitivities, actualNormalizeResult);
  }

  /**
   * Test {@link MutablePointSensitivities#toImmutable()}.
   *
   * <p>Method under test: {@link MutablePointSensitivities#toImmutable()}
   */
  @Test
  @DisplayName("Test toImmutable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivities MutablePointSensitivities.toImmutable()"})
  void testToImmutable() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    // Act
    PointSensitivities actualToImmutableResult = mutablePointSensitivities.toImmutable();

    // Assert
    assertEquals(0, actualToImmutableResult.size());
    assertTrue(actualToImmutableResult.getSensitivities().isEmpty());
    assertEquals(mutablePointSensitivities, actualToImmutableResult.toMutable());
  }

  /**
   * Test {@link MutablePointSensitivities#equals(Object)}, and {@link
   * MutablePointSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MutablePointSensitivities#equals(Object)}
   *   <li>{@link MutablePointSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MutablePointSensitivities.equals(Object)",
    "int MutablePointSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();
    MutablePointSensitivities mutablePointSensitivities2 = new MutablePointSensitivities();

    // Act and Assert
    assertEquals(mutablePointSensitivities, mutablePointSensitivities2);
    assertEquals(mutablePointSensitivities.hashCode(), mutablePointSensitivities2.hashCode());
  }

  /**
   * Test {@link MutablePointSensitivities#equals(Object)}, and {@link
   * MutablePointSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MutablePointSensitivities#equals(Object)}
   *   <li>{@link MutablePointSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MutablePointSensitivities.equals(Object)",
    "int MutablePointSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MutablePointSensitivities mutablePointSensitivities = new MutablePointSensitivities();

    // Act and Assert
    assertEquals(mutablePointSensitivities, mutablePointSensitivities);
    int expectedHashCodeResult = mutablePointSensitivities.hashCode();
    assertEquals(expectedHashCodeResult, mutablePointSensitivities.hashCode());
  }

  /**
   * Test {@link MutablePointSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MutablePointSensitivities.equals(Object)",
    "int MutablePointSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MutablePointSensitivities(), 1);
  }

  /**
   * Test {@link MutablePointSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MutablePointSensitivities.equals(Object)",
    "int MutablePointSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MutablePointSensitivities(), null);
  }

  /**
   * Test {@link MutablePointSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MutablePointSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MutablePointSensitivities.equals(Object)",
    "int MutablePointSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MutablePointSensitivities(), "Different type to MutablePointSensitivities");
  }
}
