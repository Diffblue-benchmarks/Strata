package com.opengamma.strata.report.framework.format;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FormatSettingsProviderDiffblueTest {
  /**
   * Test {@link FormatSettingsProvider#settings(Class, FormatSettings)}.
   *
   * <ul>
   *   <li>Then return {@link FormatSettings} with category is {@code DATE} and formatter is {@link
   *       ToStringValueFormatter#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link FormatSettingsProvider#settings(Class, FormatSettings)}
   */
  @Test
  @DisplayName(
      "Test settings(Class, FormatSettings); then return FormatSettings with category is 'DATE' and formatter is INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FormatSettings FormatSettingsProvider.settings(Class, FormatSettings)"})
  void testSettings_thenReturnFormatSettingsWithCategoryIsDateAndFormatterIsInstance() {
    // Arrange
    FormatSettingsProvider formatSettingsProvider = new FormatSettingsProvider();
    Class<Object> clazz = Object.class;
    FormatSettings<Object> defaultSettings =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act
    FormatSettings<Object> actualSettingsResult =
        formatSettingsProvider.settings(clazz, defaultSettings);

    // Assert
    assertSame(defaultSettings, actualSettingsResult);
  }
}
