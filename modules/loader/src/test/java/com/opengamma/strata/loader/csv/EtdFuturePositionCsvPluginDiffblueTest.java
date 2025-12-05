package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdFuturePositionCsvPluginDiffblueTest {
  /**
   * Test {@link EtdFuturePositionCsvPlugin#positionTypeNames()}.
   *
   * <p>Method under test: {@link EtdFuturePositionCsvPlugin#positionTypeNames()}
   */
  @Test
  @DisplayName("Test positionTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set EtdFuturePositionCsvPlugin.positionTypeNames()"})
  void testPositionTypeNames() {
    // Arrange and Act
    Set<String> actualPositionTypeNamesResult =
        EtdFuturePositionCsvPlugin.INSTANCE.positionTypeNames();

    // Assert
    assertEquals(2, actualPositionTypeNamesResult.size());
    assertTrue(actualPositionTypeNamesResult.contains("FUT"));
    assertTrue(actualPositionTypeNamesResult.contains("FUTURE"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link EtdFuturePositionCsvPlugin}
   *   <li>{@link EtdFuturePositionCsvPlugin#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void EtdFuturePositionCsvPlugin.<init>()",
    "String EtdFuturePositionCsvPlugin.getName()"
  })
  void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("EtdFuture", new EtdFuturePositionCsvPlugin().getName());
  }
}
