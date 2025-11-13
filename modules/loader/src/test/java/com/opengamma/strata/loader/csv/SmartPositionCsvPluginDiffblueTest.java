package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SmartPositionCsvPluginDiffblueTest {
  /**
   * Test {@link SmartPositionCsvPlugin#positionTypeNames()}.
   *
   * <p>Method under test: {@link SmartPositionCsvPlugin#positionTypeNames()}
   */
  @Test
  @DisplayName("Test positionTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SmartPositionCsvPlugin.positionTypeNames()"})
  void testPositionTypeNames() {
    // Arrange and Act
    Set<String> actualPositionTypeNamesResult = SmartPositionCsvPlugin.INSTANCE.positionTypeNames();

    // Assert
    assertEquals(1, actualPositionTypeNamesResult.size());
    assertTrue(actualPositionTypeNamesResult.contains("SMART"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link SmartPositionCsvPlugin}
   *   <li>{@link SmartPositionCsvPlugin#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SmartPositionCsvPlugin.<init>()",
    "String SmartPositionCsvPlugin.getName()"
  })
  void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("Smart", new SmartPositionCsvPlugin().getName());
  }
}
