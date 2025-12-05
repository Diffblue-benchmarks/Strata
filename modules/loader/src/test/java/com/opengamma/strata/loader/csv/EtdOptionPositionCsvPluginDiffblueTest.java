package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdOptionPositionCsvPluginDiffblueTest {
  /**
   * Test {@link EtdOptionPositionCsvPlugin#positionTypeNames()}.
   *
   * <p>Method under test: {@link EtdOptionPositionCsvPlugin#positionTypeNames()}
   */
  @Test
  @DisplayName("Test positionTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set EtdOptionPositionCsvPlugin.positionTypeNames()"})
  void testPositionTypeNames() {
    // Arrange and Act
    Set<String> actualPositionTypeNamesResult =
        EtdOptionPositionCsvPlugin.INSTANCE.positionTypeNames();

    // Assert
    assertEquals(2, actualPositionTypeNamesResult.size());
    assertTrue(actualPositionTypeNamesResult.contains("OPT"));
    assertTrue(actualPositionTypeNamesResult.contains("OPTION"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link EtdOptionPositionCsvPlugin}
   *   <li>{@link EtdOptionPositionCsvPlugin#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void EtdOptionPositionCsvPlugin.<init>()",
    "String EtdOptionPositionCsvPlugin.getName()"
  })
  void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("EtdOption", new EtdOptionPositionCsvPlugin().getName());
  }
}
