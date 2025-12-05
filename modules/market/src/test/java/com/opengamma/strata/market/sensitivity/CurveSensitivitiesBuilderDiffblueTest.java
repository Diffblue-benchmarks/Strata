package com.opengamma.strata.market.sensitivity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.product.PortfolioItemInfo;
import com.opengamma.strata.product.PositionInfo;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveSensitivitiesBuilderDiffblueTest {
  /**
   * Test {@link CurveSensitivitiesBuilder#build()}.
   *
   * <p>Method under test: {@link CurveSensitivitiesBuilder#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CurveSensitivitiesBuilder.<init>(PortfolioItemInfo)",
    "CurveSensitivities CurveSensitivitiesBuilder.build()"
  })
  void testBuild() {
    // Arrange and Act
    CurveSensitivitiesBuilder actualBuilderResult =
        CurveSensitivities.builder(PositionInfo.empty());
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities actualCurveSensitivities =
        actualBuilderResult.combine(CurveSensitivities.builder(info)).build();

    // Assert
    PortfolioItemInfo info2 = actualCurveSensitivities.getInfo();
    assertTrue(info2 instanceof PositionInfo);
    assertFalse(actualCurveSensitivities.getId().isPresent());
    assertEquals(info, info2);
  }

  /**
   * Test {@link CurveSensitivitiesBuilder#combine(CurveSensitivitiesBuilder)}.
   *
   * <ul>
   *   <li>Given builder empty add {@link CurveSensitivitiesType#ZERO_RATE_DELTA} and empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivitiesBuilder#combine(CurveSensitivitiesBuilder)}
   */
  @Test
  @DisplayName(
      "Test combine(CurveSensitivitiesBuilder); given builder empty add ZERO_RATE_DELTA and empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveSensitivitiesBuilder CurveSensitivitiesBuilder.combine(CurveSensitivitiesBuilder)"
  })
  void testCombine_givenBuilderEmptyAddZero_rate_deltaAndEmpty() {
    // Arrange
    CurveSensitivitiesBuilder builderResult = CurveSensitivities.builder(PositionInfo.empty());
    builderResult.add(
        CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    CurveSensitivitiesBuilder other = CurveSensitivities.builder(PositionInfo.empty());
    other.add(CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivitiesBuilder actualCombineResult = builderResult.combine(other);

    // Assert
    assertSame(builderResult, actualCombineResult);
  }

  /**
   * Test {@link CurveSensitivitiesBuilder#combine(CurveSensitivitiesBuilder)}.
   *
   * <ul>
   *   <li>Given {@link CurveSensitivitiesType#ZERO_RATE_DELTA}.
   *   <li>When builder empty add {@link CurveSensitivitiesType#ZERO_RATE_DELTA} and empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivitiesBuilder#combine(CurveSensitivitiesBuilder)}
   */
  @Test
  @DisplayName(
      "Test combine(CurveSensitivitiesBuilder); given ZERO_RATE_DELTA; when builder empty add ZERO_RATE_DELTA and empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveSensitivitiesBuilder CurveSensitivitiesBuilder.combine(CurveSensitivitiesBuilder)"
  })
  void testCombine_givenZero_rate_delta_whenBuilderEmptyAddZero_rate_deltaAndEmpty() {
    // Arrange
    CurveSensitivitiesBuilder builderResult = CurveSensitivities.builder(PositionInfo.empty());

    CurveSensitivitiesBuilder other = CurveSensitivities.builder(PositionInfo.empty());
    other.add(CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivitiesBuilder actualCombineResult = builderResult.combine(other);

    // Assert
    assertSame(builderResult, actualCombineResult);
  }

  /**
   * Test {@link CurveSensitivitiesBuilder#combine(CurveSensitivitiesBuilder)}.
   *
   * <ul>
   *   <li>Given {@link CurveSensitivitiesType#ZERO_RATE_GAMMA}.
   *   <li>When builder empty add {@link CurveSensitivitiesType#ZERO_RATE_GAMMA} and empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivitiesBuilder#combine(CurveSensitivitiesBuilder)}
   */
  @Test
  @DisplayName(
      "Test combine(CurveSensitivitiesBuilder); given ZERO_RATE_GAMMA; when builder empty add ZERO_RATE_GAMMA and empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveSensitivitiesBuilder CurveSensitivitiesBuilder.combine(CurveSensitivitiesBuilder)"
  })
  void testCombine_givenZero_rate_gamma_whenBuilderEmptyAddZero_rate_gammaAndEmpty() {
    // Arrange
    CurveSensitivitiesBuilder builderResult = CurveSensitivities.builder(PositionInfo.empty());

    CurveSensitivitiesBuilder other = CurveSensitivities.builder(PositionInfo.empty());
    other.add(CurveSensitivitiesType.ZERO_RATE_GAMMA, CurrencyParameterSensitivities.empty());
    other.add(CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivitiesBuilder actualCombineResult = builderResult.combine(other);

    // Assert
    assertSame(builderResult, actualCombineResult);
  }

  /**
   * Test {@link CurveSensitivitiesBuilder#add(CurveSensitivities)} with {@code other}.
   *
   * <p>Method under test: {@link CurveSensitivitiesBuilder#add(CurveSensitivities)}
   */
  @Test
  @DisplayName("Test add(CurveSensitivities) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivitiesBuilder CurveSensitivitiesBuilder.add(CurveSensitivities)"})
  void testAddWithOther() {
    // Arrange
    CurveSensitivitiesBuilder builderResult = CurveSensitivities.builder(PositionInfo.empty());
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities other = CurveSensitivities.of(info, new HashMap<>());

    // Act and Assert
    CurveSensitivities actualCurveSensitivities = builderResult.add(other).build();
    assertEquals(other, actualCurveSensitivities);
  }

  /**
   * Test {@link CurveSensitivitiesBuilder#add(CurveSensitivities)} with {@code other}.
   *
   * <ul>
   *   <li>Given builder empty add {@link CurveSensitivitiesType#ZERO_RATE_DELTA} and empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivitiesBuilder#add(CurveSensitivities)}
   */
  @Test
  @DisplayName(
      "Test add(CurveSensitivities) with 'other'; given builder empty add ZERO_RATE_DELTA and empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivitiesBuilder CurveSensitivitiesBuilder.add(CurveSensitivities)"})
  void testAddWithOther_givenBuilderEmptyAddZero_rate_deltaAndEmpty() {
    // Arrange
    CurveSensitivitiesBuilder builderResult = CurveSensitivities.builder(PositionInfo.empty());
    builderResult.add(
        CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities other =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivitiesBuilder actualAddResult = builderResult.add(other);

    // Assert
    assertEquals(1, builderResult.build().getTypedSensitivities().size());
    CurveSensitivities actualCurveSensitivities = actualAddResult.build();
    assertEquals(other, actualCurveSensitivities);
  }

  /**
   * Test {@link CurveSensitivitiesBuilder#add(CurveSensitivities)} with {@code other}.
   *
   * <ul>
   *   <li>Given builder empty.
   *   <li>When empty.
   *   <li>Then return builder empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivitiesBuilder#add(CurveSensitivities)}
   */
  @Test
  @DisplayName(
      "Test add(CurveSensitivities) with 'other'; given builder empty; when empty; then return builder empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivitiesBuilder CurveSensitivitiesBuilder.add(CurveSensitivities)"})
  void testAddWithOther_givenBuilderEmpty_whenEmpty_thenReturnBuilderEmpty() {
    // Arrange
    CurveSensitivitiesBuilder builderResult = CurveSensitivities.builder(PositionInfo.empty());

    // Act
    CurveSensitivitiesBuilder actualAddResult = builderResult.add(CurveSensitivities.empty());

    // Assert
    assertSame(builderResult, actualAddResult);
  }

  /**
   * Test {@link CurveSensitivitiesBuilder#add(CurveSensitivities)} with {@code other}.
   *
   * <ul>
   *   <li>Then builder empty build TypedSensitivities size is one.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivitiesBuilder#add(CurveSensitivities)}
   */
  @Test
  @DisplayName(
      "Test add(CurveSensitivities) with 'other'; then builder empty build TypedSensitivities size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivitiesBuilder CurveSensitivitiesBuilder.add(CurveSensitivities)"})
  void testAddWithOther_thenBuilderEmptyBuildTypedSensitivitiesSizeIsOne() {
    // Arrange
    CurveSensitivitiesBuilder builderResult = CurveSensitivities.builder(PositionInfo.empty());
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities other =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivitiesBuilder actualAddResult = builderResult.add(other);

    // Assert
    assertEquals(1, builderResult.build().getTypedSensitivities().size());
    CurveSensitivities actualCurveSensitivities = actualAddResult.build();
    assertEquals(other, actualCurveSensitivities);
  }

  /**
   * Test {@link CurveSensitivitiesBuilder#add(CurveSensitivitiesType,
   * CurrencyParameterSensitivities)} with {@code type}, {@code sensitivities}.
   *
   * <ul>
   *   <li>Given builder empty add {@link CurveSensitivitiesType#ZERO_RATE_DELTA} and empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivitiesBuilder#add(CurveSensitivitiesType,
   * CurrencyParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test add(CurveSensitivitiesType, CurrencyParameterSensitivities) with 'type', 'sensitivities'; given builder empty add ZERO_RATE_DELTA and empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveSensitivitiesBuilder CurveSensitivitiesBuilder.add(CurveSensitivitiesType, CurrencyParameterSensitivities)"
  })
  void testAddWithTypeSensitivities_givenBuilderEmptyAddZero_rate_deltaAndEmpty() {
    // Arrange
    CurveSensitivitiesBuilder builderResult = CurveSensitivities.builder(PositionInfo.empty());
    builderResult.add(
        CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivitiesBuilder actualAddResult =
        builderResult.add(
            CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Assert
    assertEquals(1, builderResult.build().getTypedSensitivities().size());
    assertSame(builderResult, actualAddResult);
  }

  /**
   * Test {@link CurveSensitivitiesBuilder#add(CurveSensitivitiesType,
   * CurrencyParameterSensitivities)} with {@code type}, {@code sensitivities}.
   *
   * <ul>
   *   <li>Then builder empty build TypedSensitivities size is one.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivitiesBuilder#add(CurveSensitivitiesType,
   * CurrencyParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test add(CurveSensitivitiesType, CurrencyParameterSensitivities) with 'type', 'sensitivities'; then builder empty build TypedSensitivities size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveSensitivitiesBuilder CurveSensitivitiesBuilder.add(CurveSensitivitiesType, CurrencyParameterSensitivities)"
  })
  void testAddWithTypeSensitivities_thenBuilderEmptyBuildTypedSensitivitiesSizeIsOne() {
    // Arrange
    CurveSensitivitiesBuilder builderResult = CurveSensitivities.builder(PositionInfo.empty());

    // Act
    CurveSensitivitiesBuilder actualAddResult =
        builderResult.add(
            CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Assert
    assertEquals(1, builderResult.build().getTypedSensitivities().size());
    assertSame(builderResult, actualAddResult);
  }
}
