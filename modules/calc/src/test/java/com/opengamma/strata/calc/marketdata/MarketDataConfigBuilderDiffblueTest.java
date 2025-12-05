package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.calc.ColumnName;
import com.opengamma.strata.collect.TypedString;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataConfigBuilderDiffblueTest {
  /**
   * Test {@link MarketDataConfigBuilder#add(String, Object)} with {@code String}, {@code Object}.
   *
   * <ul>
   *   <li>Given builder add {@code name} and {@code Value}.
   *   <li>When {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfigBuilder#add(String, Object)}
   */
  @Test
  @DisplayName(
      "Test add(String, Object) with 'String', 'Object'; given builder add 'name' and 'Value'; when 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataConfigBuilder MarketDataConfigBuilder.add(String, Object)"})
  void testAddWithStringObject_givenBuilderAddNameAndValue_whenName_thenReturnBuilder() {
    // Arrange
    MarketDataConfigBuilder builderResult = MarketDataConfig.builder();
    builderResult.add("name", "Value");

    // Act
    MarketDataConfigBuilder actualAddResult = builderResult.add("Name", "Value");

    // Assert
    assertSame(builderResult, actualAddResult);
  }

  /**
   * Test {@link MarketDataConfigBuilder#add(String, Object)} with {@code String}, {@code Object}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>When {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfigBuilder#add(String, Object)}
   */
  @Test
  @DisplayName(
      "Test add(String, Object) with 'String', 'Object'; given builder; when 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataConfigBuilder MarketDataConfigBuilder.add(String, Object)"})
  void testAddWithStringObject_givenBuilder_whenName_thenReturnBuilder() {
    // Arrange
    MarketDataConfigBuilder builderResult = MarketDataConfig.builder();

    // Act
    MarketDataConfigBuilder actualAddResult = builderResult.add("Name", "Value");

    // Assert
    assertSame(builderResult, actualAddResult);
  }

  /**
   * Test {@link MarketDataConfigBuilder#add(TypedString, Object)} with {@code TypedString}, {@code
   * Object}.
   *
   * <ul>
   *   <li>Given builder add {@code name} and {@code Value}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfigBuilder#add(TypedString, Object)}
   */
  @Test
  @DisplayName(
      "Test add(TypedString, Object) with 'TypedString', 'Object'; given builder add 'name' and 'Value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataConfigBuilder MarketDataConfigBuilder.add(TypedString, Object)"})
  void testAddWithTypedStringObject_givenBuilderAddNameAndValue_thenReturnBuilder() {
    // Arrange
    MarketDataConfigBuilder builderResult = MarketDataConfig.builder();
    builderResult.add("name", "Value");

    // Act
    MarketDataConfigBuilder actualAddResult = builderResult.add(ColumnName.of("Name"), "Value");

    // Assert
    assertSame(builderResult, actualAddResult);
  }

  /**
   * Test {@link MarketDataConfigBuilder#add(TypedString, Object)} with {@code TypedString}, {@code
   * Object}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfigBuilder#add(TypedString, Object)}
   */
  @Test
  @DisplayName(
      "Test add(TypedString, Object) with 'TypedString', 'Object'; given builder; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataConfigBuilder MarketDataConfigBuilder.add(TypedString, Object)"})
  void testAddWithTypedStringObject_givenBuilder_thenReturnBuilder() {
    // Arrange
    MarketDataConfigBuilder builderResult = MarketDataConfig.builder();

    // Act
    MarketDataConfigBuilder actualAddResult = builderResult.add(ColumnName.of("Name"), "Value");

    // Assert
    assertSame(builderResult, actualAddResult);
  }

  /**
   * Test {@link MarketDataConfigBuilder#addDefault(Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfigBuilder#addDefault(Object)}
   */
  @Test
  @DisplayName("Test addDefault(Object); when 'Value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataConfigBuilder MarketDataConfigBuilder.addDefault(Object)"})
  void testAddDefault_whenValue_thenReturnBuilder() {
    // Arrange
    MarketDataConfigBuilder builderResult = MarketDataConfig.builder();

    // Act
    MarketDataConfigBuilder actualAddDefaultResult = builderResult.addDefault("Value");

    // Assert
    assertSame(builderResult, actualAddDefaultResult);
  }
}
