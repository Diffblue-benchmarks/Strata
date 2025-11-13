package com.opengamma.strata.market.param;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.DoublePredicate;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurrencyParameterSensitivitiesBuilderDiffblueTest {
  /**
   * Test {@link CurrencyParameterSensitivitiesBuilder#build()}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivitiesBuilder#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CurrencyParameterSensitivitiesBuilder.<init>()",
    "CurrencyParameterSensitivities CurrencyParameterSensitivitiesBuilder.build()"
  })
  void testBuild() {
    // Arrange, Act and Assert
    assertEquals(0, CurrencyParameterSensitivities.builder().build().size());
  }

  /**
   * Test {@link CurrencyParameterSensitivitiesBuilder#CurrencyParameterSensitivitiesBuilder(List)}.
   *
   * <p>Method under test: {@link
   * CurrencyParameterSensitivitiesBuilder#CurrencyParameterSensitivitiesBuilder(List)}
   */
  @Test
  @DisplayName("Test new CurrencyParameterSensitivitiesBuilder(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CurrencyParameterSensitivitiesBuilder.<init>(List)"})
  void testNewCurrencyParameterSensitivitiesBuilder() {
    // Arrange
    ArrayList<CurrencyParameterSensitivity> sensitivities = new ArrayList<>();

    // Act and Assert
    CurrencyParameterSensitivities currencyParameterSensitivities =
        new CurrencyParameterSensitivitiesBuilder(sensitivities).build();
    assertEquals(0, currencyParameterSensitivities.size());
    assertEquals(sensitivities, currencyParameterSensitivities.getSensitivities());
  }

  /**
   * Test {@link CurrencyParameterSensitivitiesBuilder#add(CurrencyParameterSensitivities)} with
   * {@code CurrencyParameterSensitivities}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link
   * CurrencyParameterSensitivitiesBuilder#add(CurrencyParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test add(CurrencyParameterSensitivities) with 'CurrencyParameterSensitivities'; when empty; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivitiesBuilder CurrencyParameterSensitivitiesBuilder.add(CurrencyParameterSensitivities)"
  })
  void testAddWithCurrencyParameterSensitivities_whenEmpty_thenReturnBuilder() {
    // Arrange
    CurrencyParameterSensitivitiesBuilder builderResult = CurrencyParameterSensitivities.builder();

    // Act
    CurrencyParameterSensitivitiesBuilder actualAddResult =
        builderResult.add(CurrencyParameterSensitivities.empty());

    // Assert
    assertSame(builderResult, actualAddResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivitiesBuilder#add(List)} with {@code List}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivitiesBuilder#add(List)}
   */
  @Test
  @DisplayName("Test add(List) with 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivitiesBuilder CurrencyParameterSensitivitiesBuilder.add(List)"
  })
  void testAddWithList() {
    // Arrange
    CurrencyParameterSensitivitiesBuilder builderResult = CurrencyParameterSensitivities.builder();

    // Act
    CurrencyParameterSensitivitiesBuilder actualAddResult = builderResult.add(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualAddResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivitiesBuilder#mapMetadata(UnaryOperator)}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivitiesBuilder#mapMetadata(UnaryOperator)}
   */
  @Test
  @DisplayName("Test mapMetadata(UnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivitiesBuilder CurrencyParameterSensitivitiesBuilder.mapMetadata(UnaryOperator)"
  })
  void testMapMetadata() {
    // Arrange
    CurrencyParameterSensitivitiesBuilder builderResult = CurrencyParameterSensitivities.builder();

    // Act
    CurrencyParameterSensitivitiesBuilder actualMapMetadataResult =
        builderResult.mapMetadata(mock(UnaryOperator.class));

    // Assert
    assertSame(builderResult, actualMapMetadataResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivitiesBuilder#mapSensitivities(BiFunction)}.
   *
   * <p>Method under test: {@link
   * CurrencyParameterSensitivitiesBuilder#mapSensitivities(BiFunction)}
   */
  @Test
  @DisplayName("Test mapSensitivities(BiFunction)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivitiesBuilder CurrencyParameterSensitivitiesBuilder.mapSensitivities(BiFunction)"
  })
  void testMapSensitivities() {
    // Arrange
    CurrencyParameterSensitivitiesBuilder builderResult = CurrencyParameterSensitivities.builder();

    // Act
    CurrencyParameterSensitivitiesBuilder actualMapSensitivitiesResult =
        builderResult.mapSensitivities(mock(BiFunction.class));

    // Assert
    assertSame(builderResult, actualMapSensitivitiesResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivitiesBuilder#filterSensitivity(DoublePredicate)}.
   *
   * <p>Method under test: {@link
   * CurrencyParameterSensitivitiesBuilder#filterSensitivity(DoublePredicate)}
   */
  @Test
  @DisplayName("Test filterSensitivity(DoublePredicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivitiesBuilder CurrencyParameterSensitivitiesBuilder.filterSensitivity(DoublePredicate)"
  })
  void testFilterSensitivity() {
    // Arrange
    CurrencyParameterSensitivitiesBuilder builderResult = CurrencyParameterSensitivities.builder();

    // Act
    CurrencyParameterSensitivitiesBuilder actualFilterSensitivityResult =
        builderResult.filterSensitivity(mock(DoublePredicate.class));

    // Assert
    assertSame(builderResult, actualFilterSensitivityResult);
  }
}
