package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EmptyMarketDataBoxDiffblueTest {
  /**
   * Test {@link EmptyMarketDataBox#getSingleValue()}.
   *
   * <p>Method under test: {@link EmptyMarketDataBox#getSingleValue()}
   */
  @Test
  @DisplayName("Test getSingleValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Void EmptyMarketDataBox.getSingleValue()"})
  void testGetSingleValue() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> new EmptyMarketDataBox().getSingleValue());
  }

  /**
   * Test {@link EmptyMarketDataBox#getScenarioValue()}.
   *
   * <p>Method under test: {@link EmptyMarketDataBox#getScenarioValue()}
   */
  @Test
  @DisplayName("Test getScenarioValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray EmptyMarketDataBox.getScenarioValue()"
  })
  void testGetScenarioValue() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class, () -> new EmptyMarketDataBox().getScenarioValue());
  }

  /**
   * Test {@link EmptyMarketDataBox#getValue(int)}.
   *
   * <p>Method under test: {@link EmptyMarketDataBox#getValue(int)}
   */
  @Test
  @DisplayName("Test getValue(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Void EmptyMarketDataBox.getValue(int)"})
  void testGetValue() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> new EmptyMarketDataBox().getValue(1));
  }

  /**
   * Test {@link EmptyMarketDataBox#stream()}.
   *
   * <p>Method under test: {@link EmptyMarketDataBox#stream()}
   */
  @Test
  @DisplayName("Test stream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream EmptyMarketDataBox.stream()"})
  void testStream() {
    // Arrange and Act
    Stream<Void> actualStreamResult = new EmptyMarketDataBox().stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link EmptyMarketDataBox}
   *   <li>{@link EmptyMarketDataBox#getMarketDataType()}
   *   <li>{@link EmptyMarketDataBox#getScenarioCount()}
   *   <li>{@link EmptyMarketDataBox#isSingleValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void EmptyMarketDataBox.<init>()",
    "Class EmptyMarketDataBox.getMarketDataType()",
    "int EmptyMarketDataBox.getScenarioCount()",
    "boolean EmptyMarketDataBox.isSingleValue()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    EmptyMarketDataBox actualEmptyMarketDataBox = new EmptyMarketDataBox();
    Class<Void> actualMarketDataType = actualEmptyMarketDataBox.getMarketDataType();
    int actualScenarioCount = actualEmptyMarketDataBox.getScenarioCount();

    // Assert
    assertEquals(0, actualScenarioCount);
    assertTrue(actualEmptyMarketDataBox.isSingleValue());
    Class<Void> expectedMarketDataType = Void.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
