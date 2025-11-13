package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PositionDiffblueTest {
  /**
   * Test {@link Position#summarize()}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with scheme is {@code portfolioItemType} and value is {@code
   *       42}.
   * </ul>
   *
   * <p>Method under test: {@link Position#summarize()}
   */
  @Test
  @DisplayName(
      "Test summarize(); given StandardId with scheme is 'portfolioItemType' and value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemSummary Position.summarize()"})
  void testSummarize_givenStandardIdWithSchemeIsPortfolioItemTypeAndValueIs42() {
    // Arrange
    PositionInfo positionInfo = PositionInfo.empty();
    SecurityPosition ofLongShortResult =
        SecurityPosition.ofLongShort(
            positionInfo, SecurityId.of(StandardId.of("portfolioItemType", "42")), 10.0d, 10.0d);

    // Act
    PortfolioItemSummary actualSummarizeResult = ofLongShortResult.summarize();

    // Assert
    assertEquals("42 x 0", actualSummarizeResult.getDescription());
    ProductType productType = actualSummarizeResult.getProductType();
    assertEquals("Security", productType.getName());
    assertEquals("Security", productType.toString());
    assertEquals("Security", productType.getDescription());
    assertEquals(PortfolioItemType.POSITION, actualSummarizeResult.getPortfolioItemType());
    assertFalse(actualSummarizeResult.getId().isPresent());
    assertTrue(actualSummarizeResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link Position#summarize()}.
   *
   * <ul>
   *   <li>Then return Description is {@code 42 x 0}.
   * </ul>
   *
   * <p>Method under test: {@link Position#summarize()}
   */
  @Test
  @DisplayName("Test summarize(); then return Description is '42 x 0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemSummary Position.summarize()"})
  void testSummarize_thenReturnDescriptionIs42X0() {
    // Arrange
    PositionInfo positionInfo = PositionInfo.empty();
    SecurityPosition ofLongShortResult =
        SecurityPosition.ofLongShort(
            positionInfo, SecurityId.of(StandardId.of("Scheme", "42")), 10.0d, 10.0d);

    // Act
    PortfolioItemSummary actualSummarizeResult = ofLongShortResult.summarize();

    // Assert
    assertEquals("42 x 0", actualSummarizeResult.getDescription());
    ProductType productType = actualSummarizeResult.getProductType();
    assertEquals("Security", productType.getName());
    assertEquals("Security", productType.toString());
    assertEquals("Security", productType.getDescription());
    assertEquals(PortfolioItemType.POSITION, actualSummarizeResult.getPortfolioItemType());
    assertFalse(actualSummarizeResult.getId().isPresent());
    assertTrue(actualSummarizeResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link Position#summarize()}.
   *
   * <ul>
   *   <li>Then return Description is {@code 42 x -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Position#summarize()}
   */
  @Test
  @DisplayName("Test summarize(); then return Description is '42 x -0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemSummary Position.summarize()"})
  void testSummarize_thenReturnDescriptionIs42X05() {
    // Arrange
    PositionInfo positionInfo = PositionInfo.empty();
    SecurityPosition ofLongShortResult =
        SecurityPosition.ofLongShort(
            positionInfo, SecurityId.of(StandardId.of("Scheme", "42")), 0.0d, 0.5d);

    // Act
    PortfolioItemSummary actualSummarizeResult = ofLongShortResult.summarize();

    // Assert
    assertEquals("42 x -0.5", actualSummarizeResult.getDescription());
    ProductType productType = actualSummarizeResult.getProductType();
    assertEquals("Security", productType.getName());
    assertEquals("Security", productType.toString());
    assertEquals("Security", productType.getDescription());
    assertEquals(PortfolioItemType.POSITION, actualSummarizeResult.getPortfolioItemType());
    assertFalse(actualSummarizeResult.getId().isPresent());
    assertTrue(actualSummarizeResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link Position#summarize()}.
   *
   * <ul>
   *   <li>Then return Description is {@code 42 x -10}.
   * </ul>
   *
   * <p>Method under test: {@link Position#summarize()}
   */
  @Test
  @DisplayName("Test summarize(); then return Description is '42 x -10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemSummary Position.summarize()"})
  void testSummarize_thenReturnDescriptionIs42X10() {
    // Arrange
    PositionInfo positionInfo = PositionInfo.empty();
    SecurityPosition ofLongShortResult =
        SecurityPosition.ofLongShort(
            positionInfo, SecurityId.of(StandardId.of("Scheme", "42")), 0.0d, 10.0d);

    // Act
    PortfolioItemSummary actualSummarizeResult = ofLongShortResult.summarize();

    // Assert
    assertEquals("42 x -10", actualSummarizeResult.getDescription());
    ProductType productType = actualSummarizeResult.getProductType();
    assertEquals("Security", productType.getName());
    assertEquals("Security", productType.toString());
    assertEquals("Security", productType.getDescription());
    assertEquals(PortfolioItemType.POSITION, actualSummarizeResult.getPortfolioItemType());
    assertFalse(actualSummarizeResult.getId().isPresent());
    assertTrue(actualSummarizeResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link Position#summarize()}.
   *
   * <ul>
   *   <li>Then return Description is {@code 42 x -9.5}.
   * </ul>
   *
   * <p>Method under test: {@link Position#summarize()}
   */
  @Test
  @DisplayName("Test summarize(); then return Description is '42 x -9.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemSummary Position.summarize()"})
  void testSummarize_thenReturnDescriptionIs42X95() {
    // Arrange
    PositionInfo positionInfo = PositionInfo.empty();
    SecurityPosition ofLongShortResult =
        SecurityPosition.ofLongShort(
            positionInfo, SecurityId.of(StandardId.of("Scheme", "42")), 0.5d, 10.0d);

    // Act
    PortfolioItemSummary actualSummarizeResult = ofLongShortResult.summarize();

    // Assert
    assertEquals("42 x -9.5", actualSummarizeResult.getDescription());
    ProductType productType = actualSummarizeResult.getProductType();
    assertEquals("Security", productType.getName());
    assertEquals("Security", productType.toString());
    assertEquals("Security", productType.getDescription());
    assertEquals(PortfolioItemType.POSITION, actualSummarizeResult.getPortfolioItemType());
    assertFalse(actualSummarizeResult.getId().isPresent());
    assertTrue(actualSummarizeResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link Position#summarize()}.
   *
   * <ul>
   *   <li>Then return Description is {@code 42 x 9.5}.
   * </ul>
   *
   * <p>Method under test: {@link Position#summarize()}
   */
  @Test
  @DisplayName("Test summarize(); then return Description is '42 x 9.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemSummary Position.summarize()"})
  void testSummarize_thenReturnDescriptionIs42X952() {
    // Arrange
    PositionInfo positionInfo = PositionInfo.empty();
    SecurityPosition ofLongShortResult =
        SecurityPosition.ofLongShort(
            positionInfo, SecurityId.of(StandardId.of("Scheme", "42")), 10.0d, 0.5d);

    // Act
    PortfolioItemSummary actualSummarizeResult = ofLongShortResult.summarize();

    // Assert
    assertEquals("42 x 9.5", actualSummarizeResult.getDescription());
    ProductType productType = actualSummarizeResult.getProductType();
    assertEquals("Security", productType.getName());
    assertEquals("Security", productType.toString());
    assertEquals("Security", productType.getDescription());
    assertEquals(PortfolioItemType.POSITION, actualSummarizeResult.getPortfolioItemType());
    assertFalse(actualSummarizeResult.getId().isPresent());
    assertTrue(actualSummarizeResult.getCurrencies().isEmpty());
  }
}
