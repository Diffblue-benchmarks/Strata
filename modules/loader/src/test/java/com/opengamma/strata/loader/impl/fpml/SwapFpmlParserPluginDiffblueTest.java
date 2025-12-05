package com.opengamma.strata.loader.impl.fpml;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwapFpmlParserPluginDiffblueTest {
  /**
   * Test {@link SwapFpmlParserPlugin#getName()}.
   *
   * <p>Method under test: {@link SwapFpmlParserPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String SwapFpmlParserPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("swap", SwapFpmlParserPlugin.INSTANCE.getName());
  }
}
