package com.opengamma.strata.market.param;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ParameterMetadataDiffblueTest {
  /**
   * Test {@link ParameterMetadata#empty()}.
   *
   * <p>Method under test: {@link ParameterMetadata#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata ParameterMetadata.empty()"})
  void testEmpty() {
    // Arrange and Act
    ParameterMetadata actualEmptyResult = ParameterMetadata.empty();

    // Assert
    assertTrue(actualEmptyResult instanceof EmptyParameterMetadata);
    assertEquals("", actualEmptyResult.getIdentifier());
    assertEquals("", actualEmptyResult.getLabel());
  }

  /**
   * Test {@link ParameterMetadata#listOfEmpty(int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link ParameterMetadata#listOfEmpty(int)}
   */
  @Test
  @DisplayName("Test listOfEmpty(int); when three; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ParameterMetadata.listOfEmpty(int)"})
  void testListOfEmpty_whenThree_thenReturnSizeIsThree() {
    // Arrange and Act
    List<ParameterMetadata> actualListOfEmptyResult = ParameterMetadata.listOfEmpty(3);

    // Assert
    assertEquals(3, actualListOfEmptyResult.size());
    ParameterMetadata getResult = actualListOfEmptyResult.get(0);
    assertTrue(getResult instanceof EmptyParameterMetadata);
    assertEquals("", getResult.getIdentifier());
    assertEquals("", getResult.getLabel());
    assertSame(getResult, actualListOfEmptyResult.get(1));
    assertSame(getResult, actualListOfEmptyResult.get(2));
  }
}
