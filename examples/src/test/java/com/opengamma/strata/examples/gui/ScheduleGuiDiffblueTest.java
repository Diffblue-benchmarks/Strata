package com.opengamma.strata.examples.gui;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.examples.gui.ScheduleGui.ReadOnlyCallback;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ScheduleGuiDiffblueTest {
  /**
   * Test ReadOnlyCallback {@link ReadOnlyCallback#of(ReadOnlyCallback)}.
   *
   * <p>Method under test: {@link ReadOnlyCallback#of(ReadOnlyCallback)}
   */
  @Test
  @DisplayName("Test ReadOnlyCallback of(ReadOnlyCallback)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Callback ReadOnlyCallback.of(ReadOnlyCallback)"})
  void testReadOnlyCallbackOf() {
    // Arrange and Act
    Callback<CellDataFeatures<Object, Object>, ObservableValue<Object>> actualOfResult =
        ReadOnlyCallback.of(null);

    // Assert
    assertNull(actualOfResult);
  }
}
