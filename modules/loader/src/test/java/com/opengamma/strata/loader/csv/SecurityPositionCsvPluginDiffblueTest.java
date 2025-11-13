package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SecurityPositionCsvPluginDiffblueTest {
  /**
   * Test {@link SecurityPositionCsvPlugin#positionTypeNames()}.
   *
   * <p>Method under test: {@link SecurityPositionCsvPlugin#positionTypeNames()}
   */
  @Test
  @DisplayName("Test positionTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SecurityPositionCsvPlugin.positionTypeNames()"})
  void testPositionTypeNames() {
    // Arrange and Act
    Set<String> actualPositionTypeNamesResult =
        SecurityPositionCsvPlugin.INSTANCE.positionTypeNames();

    // Assert
    assertEquals(2, actualPositionTypeNamesResult.size());
    assertTrue(actualPositionTypeNamesResult.contains("SEC"));
    assertTrue(actualPositionTypeNamesResult.contains("SECURITY"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link SecurityPositionCsvPlugin}
   *   <li>{@link SecurityPositionCsvPlugin#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SecurityPositionCsvPlugin.<init>()",
    "String SecurityPositionCsvPlugin.getName()"
  })
  void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("Security", new SecurityPositionCsvPlugin().getName());
  }
}
