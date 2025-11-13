package com.opengamma.strata.market.curve;

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
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.market.curve.RatesCurveGroupEntry.Builder;
import com.opengamma.strata.market.curve.RatesCurveGroupEntry.Meta;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatesCurveGroupEntryDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroupEntry Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualBuilderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");
    Builder actualCurveNameResult = actualBuilderResult.curveName(curveName);
    Builder actualDiscountCurrenciesResult =
        actualCurveNameResult.discountCurrencies(new HashSet<>());
    RatesCurveGroupEntry actualRatesCurveGroupEntry =
        actualDiscountCurrenciesResult.indices(new HashSet<>()).build();

    // Assert
    assertSame(curveName, actualRatesCurveGroupEntry.getCurveName());
    assertSame(
        actualRatesCurveGroupEntry.getDiscountCurrencies(),
        actualRatesCurveGroupEntry.getIndices());
  }

  /**
   * Test Builder {@link Builder#curveName(CurveName)}.
   *
   * <ul>
   *   <li>Then builder build CurveName is {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#curveName(CurveName)}
   */
  @Test
  @DisplayName(
      "Test Builder curveName(CurveName); then builder build CurveName is CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.curveName(CurveName)"})
  void testBuilderCurveName_thenBuilderBuildCurveNameIsCurveNameWithName() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    // Act
    Builder actualCurveNameResult = builderResult.curveName(curveName);

    // Assert
    assertSame(curveName, builderResult.build().getCurveName());
    assertSame(builderResult, actualCurveNameResult);
  }

  /**
   * Test Builder {@link Builder#discountCurrencies(Currency[])} with {@code Currency[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#discountCurrencies(Currency[])}
   */
  @Test
  @DisplayName("Test Builder discountCurrencies(Currency[]) with 'Currency[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.discountCurrencies(Currency[])"})
  void testBuilderDiscountCurrenciesWithCurrency_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    // Act
    Builder actualDiscountCurrenciesResult = builderResult.discountCurrencies();

    // Assert
    assertSame(builderResult, actualDiscountCurrenciesResult);
  }

  /**
   * Test Builder {@link Builder#discountCurrencies(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#discountCurrencies(Set)}
   */
  @Test
  @DisplayName(
      "Test Builder discountCurrencies(Set) with 'Set'; when HashSet(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.discountCurrencies(Set)"})
  void testBuilderDiscountCurrenciesWithSet_whenHashSet_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    // Act
    Builder actualDiscountCurrenciesResult = builderResult.discountCurrencies(new HashSet<>());

    // Assert
    assertSame(builderResult, actualDiscountCurrenciesResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code curveName}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'curveName'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCurveName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RatesCurveGroupEntry.builder().get("curveName"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code discountCurrencies}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'discountCurrencies'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDiscountCurrencies_thenReturnSet() {
    // Arrange and Act
    Object actualGetResult = RatesCurveGroupEntry.builder().get("discountCurrencies");

    // Assert
    assertTrue(actualGetResult instanceof Set);
    assertTrue(((Set<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code indices}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'indices'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenIndices_thenReturnSet() {
    // Arrange and Act
    Object actualGetResult = RatesCurveGroupEntry.builder().get("indices");

    // Assert
    assertTrue(actualGetResult instanceof Set);
    assertTrue(((Set<Object>) actualGetResult).isEmpty());
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
        NoSuchElementException.class, () -> RatesCurveGroupEntry.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#indices(Index[])} with {@code Index[]}.
   *
   * <p>Method under test: {@link Builder#indices(Index[])}
   */
  @Test
  @DisplayName("Test Builder indices(Index[]) with 'Index[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indices(Index[])"})
  void testBuilderIndicesWithIndex() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("indicesName");
    builderResult.curveName(curveName);

    // Act and Assert
    RatesCurveGroupEntry ratesCurveGroupEntry =
        builderResult.indices(mock(Index.class), mock(Index.class), mock(Index.class)).build();
    assertEquals(3, ratesCurveGroupEntry.getIndices().size());
    assertTrue(ratesCurveGroupEntry.getDiscountCurrencies().isEmpty());
    assertSame(curveName, ratesCurveGroupEntry.getCurveName());
  }

  /**
   * Test Builder {@link Builder#indices(Index[])} with {@code Index[]}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#indices(Index[])}
   */
  @Test
  @DisplayName("Test Builder indices(Index[]) with 'Index[]'; given builder; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indices(Index[])"})
  void testBuilderIndicesWithIndex_givenBuilder_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    // Act
    Builder actualIndicesResult = builderResult.indices();

    // Assert
    assertSame(builderResult, actualIndicesResult);
  }

  /**
   * Test Builder {@link Builder#indices(Index[])} with {@code Index[]}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>When {@link Index} and {@link Index}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#indices(Index[])}
   */
  @Test
  @DisplayName(
      "Test Builder indices(Index[]) with 'Index[]'; given builder; when Index and Index; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indices(Index[])"})
  void testBuilderIndicesWithIndex_givenBuilder_whenIndexAndIndex_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    // Act
    Builder actualIndicesResult = builderResult.indices(mock(Index.class), mock(Index.class));

    // Assert
    assertSame(builderResult, actualIndicesResult);
  }

  /**
   * Test Builder {@link Builder#indices(Index[])} with {@code Index[]}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>When {@link Index}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#indices(Index[])}
   */
  @Test
  @DisplayName(
      "Test Builder indices(Index[]) with 'Index[]'; given builder; when Index; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indices(Index[])"})
  void testBuilderIndicesWithIndex_givenBuilder_whenIndex_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    // Act
    Builder actualIndicesResult = builderResult.indices(mock(Index.class));

    // Assert
    assertSame(builderResult, actualIndicesResult);
  }

  /**
   * Test Builder {@link Builder#indices(Index[])} with {@code Index[]}.
   *
   * <ul>
   *   <li>Then return build CurveName is {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#indices(Index[])}
   */
  @Test
  @DisplayName(
      "Test Builder indices(Index[]) with 'Index[]'; then return build CurveName is CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indices(Index[])"})
  void testBuilderIndicesWithIndex_thenReturnBuildCurveNameIsCurveNameWithName() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");
    builderResult.curveName(curveName);

    // Act and Assert
    RatesCurveGroupEntry ratesCurveGroupEntry =
        builderResult.indices(mock(Index.class), mock(Index.class)).build();
    assertEquals(2, ratesCurveGroupEntry.getIndices().size());
    assertTrue(ratesCurveGroupEntry.getDiscountCurrencies().isEmpty());
    assertSame(curveName, ratesCurveGroupEntry.getCurveName());
  }

  /**
   * Test Builder {@link Builder#indices(Index[])} with {@code Index[]}.
   *
   * <ul>
   *   <li>Then return build Indices size is three.
   * </ul>
   *
   * <p>Method under test: {@link Builder#indices(Index[])}
   */
  @Test
  @DisplayName(
      "Test Builder indices(Index[]) with 'Index[]'; then return build Indices size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indices(Index[])"})
  void testBuilderIndicesWithIndex_thenReturnBuildIndicesSizeIsThree() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("indices");
    builderResult.curveName(curveName);

    // Act and Assert
    RatesCurveGroupEntry ratesCurveGroupEntry =
        builderResult.indices(mock(Index.class), mock(Index.class), mock(Index.class)).build();
    assertEquals(3, ratesCurveGroupEntry.getIndices().size());
    assertTrue(ratesCurveGroupEntry.getDiscountCurrencies().isEmpty());
    assertSame(curveName, ratesCurveGroupEntry.getCurveName());
  }

  /**
   * Test Builder {@link Builder#indices(Index[])} with {@code Index[]}.
   *
   * <ul>
   *   <li>Then return build Indices size is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#indices(Index[])}
   */
  @Test
  @DisplayName(
      "Test Builder indices(Index[]) with 'Index[]'; then return build Indices size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indices(Index[])"})
  void testBuilderIndicesWithIndex_thenReturnBuildIndicesSizeIsTwo() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("indices");
    builderResult.curveName(curveName);

    // Act and Assert
    RatesCurveGroupEntry ratesCurveGroupEntry =
        builderResult.indices(mock(Index.class), mock(Index.class)).build();
    assertEquals(2, ratesCurveGroupEntry.getIndices().size());
    assertTrue(ratesCurveGroupEntry.getDiscountCurrencies().isEmpty());
    assertSame(curveName, ratesCurveGroupEntry.getCurveName());
  }

  /**
   * Test Builder {@link Builder#indices(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>When {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#indices(Set)}
   */
  @Test
  @DisplayName(
      "Test Builder indices(Set) with 'Set'; given Index; when HashSet() add Index; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indices(Set)"})
  void testBuilderIndicesWithSet_givenIndex_whenHashSetAddIndex_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));

    // Act
    Builder actualIndicesResult = builderResult.indices(indices);

    // Assert
    assertSame(builderResult, actualIndicesResult);
  }

  /**
   * Test Builder {@link Builder#indices(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>When {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#indices(Set)}
   */
  @Test
  @DisplayName(
      "Test Builder indices(Set) with 'Set'; given Index; when HashSet() add Index; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indices(Set)"})
  void testBuilderIndicesWithSet_givenIndex_whenHashSetAddIndex_thenReturnBuilder2() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    // Act
    Builder actualIndicesResult = builderResult.indices(indices);

    // Assert
    assertSame(builderResult, actualIndicesResult);
  }

  /**
   * Test Builder {@link Builder#indices(Set)} with {@code Set}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#indices(Set)}
   */
  @Test
  @DisplayName("Test Builder indices(Set) with 'Set'; when HashSet(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indices(Set)"})
  void testBuilderIndicesWithSet_whenHashSet_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    // Act
    Builder actualIndicesResult = builderResult.indices(new HashSet<>());

    // Assert
    assertSame(builderResult, actualIndicesResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName("Test Builder set(String, Object) with 'propertyName', 'newValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName ofResult = CurveName.of("Name");

    // Act
    Builder actualSetResult = builderResult.set("curveName", ofResult);

    // Assert
    assertSame(ofResult, builderResult.build().getCurveName());
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
        () -> RatesCurveGroupEntry.builder().set("Property Name", "New Value"));
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
    Builder builderResult = RatesCurveGroupEntry.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link RatesCurveGroupEntry#getIndices(Class)} with {@code Class}.
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#getIndices(Class)}
   */
  @Test
  @DisplayName("Test getIndices(Class) with 'Class'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet RatesCurveGroupEntry.getIndices(Class)"})
  void testGetIndicesWithClass() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();
    Class<Index> indexType = Index.class;

    // Act and Assert
    assertEquals(indices, ratesCurveGroupEntry.getIndices(indexType));
  }

  /**
   * Test {@link RatesCurveGroupEntry#getIndices(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given builder discountCurrencies {@link HashSet#HashSet()}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#getIndices(Class)}
   */
  @Test
  @DisplayName(
      "Test getIndices(Class) with 'Class'; given builder discountCurrencies HashSet(); then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet RatesCurveGroupEntry.getIndices(Class)"})
  void testGetIndicesWithClass_givenBuilderDiscountCurrenciesHashSet_thenReturnHashSet() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();
    builderResult.discountCurrencies(new HashSet<>());

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());

    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    RatesCurveGroupEntry ratesCurveGroupEntry = discountCurrenciesResult.indices(indices).build();
    Class<Index> indexType = Index.class;

    // Act and Assert
    assertEquals(indices, ratesCurveGroupEntry.getIndices(indexType));
  }

  /**
   * Test {@link RatesCurveGroupEntry#getIndices(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given builder indices {@link HashSet#HashSet()}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#getIndices(Class)}
   */
  @Test
  @DisplayName(
      "Test getIndices(Class) with 'Class'; given builder indices HashSet(); then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet RatesCurveGroupEntry.getIndices(Class)"})
  void testGetIndicesWithClass_givenBuilderIndicesHashSet_thenReturnHashSet() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();
    builderResult.indices(new HashSet<>());
    builderResult.discountCurrencies(new HashSet<>());

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());

    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    RatesCurveGroupEntry ratesCurveGroupEntry = discountCurrenciesResult.indices(indices).build();
    Class<Index> indexType = Index.class;

    // Act and Assert
    assertEquals(indices, ratesCurveGroupEntry.getIndices(indexType));
  }

  /**
   * Test {@link RatesCurveGroupEntry#getIndices(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#getIndices(Class)}
   */
  @Test
  @DisplayName(
      "Test getIndices(Class) with 'Class'; given HashSet() add Index; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet RatesCurveGroupEntry.getIndices(Class)"})
  void testGetIndicesWithClass_givenHashSetAddIndex_thenReturnHashSet() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();
    Class<Index> indexType = Index.class;

    // Act and Assert
    assertEquals(indices, ratesCurveGroupEntry.getIndices(indexType));
  }

  /**
   * Test {@link RatesCurveGroupEntry#getIndices(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#getIndices(Class)}
   */
  @Test
  @DisplayName(
      "Test getIndices(Class) with 'Class'; given HashSet() add Index; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet RatesCurveGroupEntry.getIndices(Class)"})
  void testGetIndicesWithClass_givenHashSetAddIndex_thenReturnHashSet2() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();
    Class<Index> indexType = Index.class;

    // Act and Assert
    assertEquals(indices, ratesCurveGroupEntry.getIndices(indexType));
  }

  /**
   * Test {@link RatesCurveGroupEntry#getIndices(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#getIndices(Class)}
   */
  @Test
  @DisplayName(
      "Test getIndices(Class) with 'Class'; given HashSet() add Index; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet RatesCurveGroupEntry.getIndices(Class)"})
  void testGetIndicesWithClass_givenHashSetAddIndex_thenReturnHashSet3() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();
    Class<Index> indexType = Index.class;

    // Act and Assert
    assertEquals(indices, ratesCurveGroupEntry.getIndices(indexType));
  }

  /**
   * Test {@link RatesCurveGroupEntry#getIndices(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#getIndices(Class)}
   */
  @Test
  @DisplayName(
      "Test getIndices(Class) with 'Class'; given HashSet() add Index; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet RatesCurveGroupEntry.getIndices(Class)"})
  void testGetIndicesWithClass_givenHashSetAddIndex_thenReturnHashSet4() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();
    Class<Index> indexType = Index.class;

    // Act and Assert
    assertEquals(indices, ratesCurveGroupEntry.getIndices(indexType));
  }

  /**
   * Test {@link RatesCurveGroupEntry#getIndices(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link Index}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#getIndices(Class)}
   */
  @Test
  @DisplayName(
      "Test getIndices(Class) with 'Class'; given HashSet() add Index; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet RatesCurveGroupEntry.getIndices(Class)"})
  void testGetIndicesWithClass_givenHashSetAddIndex_thenReturnSizeIsOne() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();
    Class<Index> indexType = Index.class;

    // Act and Assert
    assertEquals(1, ratesCurveGroupEntry.getIndices(indexType).size());
  }

  /**
   * Test {@link RatesCurveGroupEntry#getIndices(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#getIndices(Class)}
   */
  @Test
  @DisplayName("Test getIndices(Class) with 'Class'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet RatesCurveGroupEntry.getIndices(Class)"})
  void testGetIndicesWithClass_thenReturnEmpty() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    RatesCurveGroupEntry ratesCurveGroupEntry =
        discountCurrenciesResult.indices(new HashSet<>()).build();
    Class<Index> indexType = Index.class;

    // Act and Assert
    assertTrue(ratesCurveGroupEntry.getIndices(indexType).isEmpty());
  }

  /**
   * Test {@link RatesCurveGroupEntry#meta()}.
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RatesCurveGroupEntry.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = RatesCurveGroupEntry.meta();

    // Assert
    MetaProperty<CurveName> curveNameResult = actualMetaResult.curveName();
    assertTrue(curveNameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<Currency>> discountCurrenciesResult =
        actualMetaResult.discountCurrencies();
    assertTrue(discountCurrenciesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<Index>> indicesResult = actualMetaResult.indices();
    assertTrue(indicesResult instanceof DirectMetaProperty);
    assertEquals("curveName", curveNameResult.name());
    assertEquals("discountCurrencies", discountCurrenciesResult.name());
    assertEquals("indices", indicesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, curveNameResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, discountCurrenciesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, indicesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableSet> expectedPropertyTypeResult = ImmutableSet.class;
    assertEquals(expectedPropertyTypeResult, discountCurrenciesResult.propertyType());
    Class<ImmutableSet> expectedPropertyTypeResult2 = ImmutableSet.class;
    assertEquals(expectedPropertyTypeResult2, indicesResult.propertyType());
    Class<CurveName> expectedPropertyTypeResult3 = CurveName.class;
    assertEquals(expectedPropertyTypeResult3, curveNameResult.propertyType());
    Class<RatesCurveGroupEntry> expectedDeclaringTypeResult = RatesCurveGroupEntry.class;
    assertEquals(expectedDeclaringTypeResult, curveNameResult.declaringType());
    Class<RatesCurveGroupEntry> expectedDeclaringTypeResult2 = RatesCurveGroupEntry.class;
    assertEquals(expectedDeclaringTypeResult2, discountCurrenciesResult.declaringType());
    Class<RatesCurveGroupEntry> expectedDeclaringTypeResult3 = RatesCurveGroupEntry.class;
    assertEquals(expectedDeclaringTypeResult3, indicesResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, curveNameResult.metaBean());
    assertSame(meta, discountCurrenciesResult.metaBean());
    assertSame(meta, indicesResult.metaBean());
  }

  /**
   * Test {@link RatesCurveGroupEntry#metaBean()}.
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RatesCurveGroupEntry.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, discountCurrenciesResult.indices(new HashSet<>()).build().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroupEntry#toString()}
   *   <li>{@link RatesCurveGroupEntry#getCurveName()}
   *   <li>{@link RatesCurveGroupEntry#getDiscountCurrencies()}
   *   <li>{@link RatesCurveGroupEntry#getIndices()}
   *   <li>{@link RatesCurveGroupEntry#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveName RatesCurveGroupEntry.getCurveName()",
    "ImmutableSet RatesCurveGroupEntry.getDiscountCurrencies()",
    "ImmutableSet RatesCurveGroupEntry.getIndices()",
    "Builder RatesCurveGroupEntry.toBuilder()",
    "String RatesCurveGroupEntry.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    RatesCurveGroupEntry ratesCurveGroupEntry =
        discountCurrenciesResult.indices(new HashSet<>()).build();

    // Act
    String actualToStringResult = ratesCurveGroupEntry.toString();
    CurveName actualCurveName = ratesCurveGroupEntry.getCurveName();
    ImmutableSet<Currency> actualDiscountCurrencies = ratesCurveGroupEntry.getDiscountCurrencies();
    ImmutableSet<Index> actualIndices = ratesCurveGroupEntry.getIndices();
    ratesCurveGroupEntry.toBuilder();

    // Assert
    assertEquals(
        "RatesCurveGroupEntry{curveName=Name, discountCurrencies=[], indices=[]}",
        actualToStringResult);
    assertSame(actualDiscountCurrencies, actualIndices);
    assertSame(curveName, actualCurveName);
  }

  /**
   * Test {@link RatesCurveGroupEntry#equals(Object)}, and {@link RatesCurveGroupEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroupEntry#equals(Object)}
   *   <li>{@link RatesCurveGroupEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupEntry.equals(Object)",
    "int RatesCurveGroupEntry.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    RatesCurveGroupEntry ratesCurveGroupEntry =
        discountCurrenciesResult.indices(new HashSet<>()).build();

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());
    RatesCurveGroupEntry ratesCurveGroupEntry2 =
        discountCurrenciesResult2.indices(new HashSet<>()).build();

    // Act and Assert
    assertEquals(ratesCurveGroupEntry, ratesCurveGroupEntry2);
    assertEquals(ratesCurveGroupEntry.hashCode(), ratesCurveGroupEntry2.hashCode());
  }

  /**
   * Test {@link RatesCurveGroupEntry#equals(Object)}, and {@link RatesCurveGroupEntry#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroupEntry#equals(Object)}
   *   <li>{@link RatesCurveGroupEntry#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupEntry.equals(Object)",
    "int RatesCurveGroupEntry.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    RatesCurveGroupEntry ratesCurveGroupEntry =
        discountCurrenciesResult.indices(new HashSet<>()).build();

    // Act and Assert
    assertEquals(ratesCurveGroupEntry, ratesCurveGroupEntry);
    int expectedHashCodeResult = ratesCurveGroupEntry.hashCode();
    assertEquals(expectedHashCodeResult, ratesCurveGroupEntry.hashCode());
  }

  /**
   * Test {@link RatesCurveGroupEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupEntry.equals(Object)",
    "int RatesCurveGroupEntry.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());
    RatesCurveGroupEntry ratesCurveGroupEntry =
        discountCurrenciesResult.indices(new HashSet<>()).build();

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult2 = curveNameResult2.discountCurrencies(new HashSet<>());

    // Act and Assert
    assertNotEquals(
        ratesCurveGroupEntry, discountCurrenciesResult2.indices(new HashSet<>()).build());
  }

  /**
   * Test {@link RatesCurveGroupEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupEntry.equals(Object)",
    "int RatesCurveGroupEntry.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    Builder builderResult2 = RatesCurveGroupEntry.builder();

    Builder curveNameResult2 = builderResult2.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult2.discountCurrencies(new HashSet<>());

    // Act and Assert
    assertNotEquals(
        ratesCurveGroupEntry, discountCurrenciesResult.indices(new HashSet<>()).build());
  }

  /**
   * Test {@link RatesCurveGroupEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupEntry.equals(Object)",
    "int RatesCurveGroupEntry.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());

    // Act and Assert
    assertNotEquals(discountCurrenciesResult.indices(new HashSet<>()).build(), null);
  }

  /**
   * Test {@link RatesCurveGroupEntry#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupEntry#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupEntry.equals(Object)",
    "int RatesCurveGroupEntry.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());

    // Act and Assert
    assertNotEquals(
        discountCurrenciesResult.indices(new HashSet<>()).build(),
        "Different type to RatesCurveGroupEntry");
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
    Class<? extends RatesCurveGroupEntry> actualBeanTypeResult =
        RatesCurveGroupEntry.meta().beanType();

    // Assert
    Class<RatesCurveGroupEntry> expectedBeanTypeResult = RatesCurveGroupEntry.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#curveName()}
   *   <li>{@link Meta#discountCurrencies()}
   *   <li>{@link Meta#indices()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.curveName()",
    "MetaProperty Meta.discountCurrencies()",
    "MetaProperty Meta.indices()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RatesCurveGroupEntry.meta();

    // Act
    MetaProperty<CurveName> actualCurveNameResult = metaResult.curveName();
    MetaProperty<ImmutableSet<Currency>> actualDiscountCurrenciesResult =
        metaResult.discountCurrencies();

    // Assert
    assertTrue(actualCurveNameResult instanceof DirectMetaProperty);
    assertTrue(actualDiscountCurrenciesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.indices() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code discountCurrencies}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'discountCurrencies'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsDiscountCurrencies() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveGroupEntry.meta().metaPropertyGet("discountCurrencies");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveName> curveNameResult = ((Meta) metaBeanResult).curveName();
    assertTrue(curveNameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<Index>> indicesResult = ((Meta) metaBeanResult).indices();
    assertTrue(indicesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("discountCurrencies", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).discountCurrencies());
    assertSame(metaBeanResult, curveNameResult.metaBean());
    assertSame(metaBeanResult, indicesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code curveName}.
   *   <li>Then return name is {@code curveName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'curveName'; then return name is 'curveName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurveName_thenReturnNameIsCurveName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveGroupEntry.meta().metaPropertyGet("curveName");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableSet<Currency>> discountCurrenciesResult =
        ((Meta) metaBeanResult).discountCurrencies();
    assertTrue(discountCurrenciesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<Index>> indicesResult = ((Meta) metaBeanResult).indices();
    assertTrue(indicesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("curveName", actualMetaPropertyGetResult.name());
    Class<CurveName> expectedPropertyTypeResult = CurveName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).curveName());
    assertSame(metaBeanResult, discountCurrenciesResult.metaBean());
    assertSame(metaBeanResult, indicesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code indices}.
   *   <li>Then return name is {@code indices}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'indices'; then return name is 'indices'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndices_thenReturnNameIsIndices() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveGroupEntry.meta().metaPropertyGet("indices");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveName> curveNameResult = ((Meta) metaBeanResult).curveName();
    assertTrue(curveNameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSet<Currency>> discountCurrenciesResult =
        ((Meta) metaBeanResult).discountCurrencies();
    assertTrue(discountCurrenciesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("indices", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).indices());
    assertSame(metaBeanResult, curveNameResult.metaBean());
    assertSame(metaBeanResult, discountCurrenciesResult.metaBean());
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
    assertNull(RatesCurveGroupEntry.meta().metaPropertyGet("Property Name"));
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
        RatesCurveGroupEntry.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("curveName");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("discountCurrencies");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("indices");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("curveName", getResult.name());
    assertEquals("discountCurrencies", getResult2.name());
    assertEquals("indices", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<ImmutableSet> expectedPropertyTypeResult = ImmutableSet.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ImmutableSet> expectedPropertyTypeResult2 = ImmutableSet.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<CurveName> expectedPropertyTypeResult3 = CurveName.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
    Class<RatesCurveGroupEntry> expectedDeclaringTypeResult = RatesCurveGroupEntry.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<RatesCurveGroupEntry> expectedDeclaringTypeResult2 = RatesCurveGroupEntry.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<RatesCurveGroupEntry> expectedDeclaringTypeResult3 = RatesCurveGroupEntry.class;
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
    assertNull(RatesCurveGroupEntry.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code curveName}.
   *   <li>Then return {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'curveName'; then return CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCurveName_thenReturnCurveNameWithName() {
    // Arrange
    Meta metaResult = RatesCurveGroupEntry.meta();

    Builder builderResult = RatesCurveGroupEntry.builder();
    CurveName curveName = CurveName.of("Name");

    Builder curveNameResult = builderResult.curveName(curveName);

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());

    // Act and Assert
    assertSame(
        curveName,
        metaResult.propertyGet(
            discountCurrenciesResult.indices(new HashSet<>()).build(), "curveName", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code discountCurrencies}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'discountCurrencies'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDiscountCurrencies_thenReturnSet() {
    // Arrange
    Meta metaResult = RatesCurveGroupEntry.meta();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            discountCurrenciesResult.indices(new HashSet<>()).build(), "discountCurrencies", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Set);
    assertTrue(((Set<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code indices}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'indices'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenIndices_thenReturnSet() {
    // Arrange
    Meta metaResult = RatesCurveGroupEntry.meta();

    Builder builderResult = RatesCurveGroupEntry.builder();

    Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    Builder discountCurrenciesResult = curveNameResult.discountCurrencies(new HashSet<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            discountCurrenciesResult.indices(new HashSet<>()).build(), "indices", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Set);
    assertTrue(((Set<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> RatesCurveGroupEntry.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code curveName}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'curveName'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurveName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveGroupEntry.meta()
                .propertySet(mock(Bean.class), "curveName", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code discountCurrencies}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'discountCurrencies'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDiscountCurrencies_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveGroupEntry.meta()
                .propertySet(mock(Bean.class), "discountCurrencies", "New Value", true));
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
            RatesCurveGroupEntry.meta()
                .propertySet(mock(Bean.class), "curveName", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code indices}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'indices'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndices_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveGroupEntry.meta()
                .propertySet(mock(Bean.class), "indices", "New Value", true));
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
            RatesCurveGroupEntry.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
