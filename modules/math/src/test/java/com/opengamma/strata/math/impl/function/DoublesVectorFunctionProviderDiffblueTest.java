package com.opengamma.strata.math.impl.function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DoublesVectorFunctionProviderDiffblueTest {
  /**
   * Test {@link DoublesVectorFunctionProvider#from(Double[])} with {@code Double[]}.
   *
   * <ul>
   *   <li>Then return {@link ParameterizedCurveVectorFunction}.
   * </ul>
   *
   * <p>Method under test: {@link DoublesVectorFunctionProvider#from(Double[])}
   */
  @Test
  @DisplayName("Test from(Double[]) with 'Double[]'; then return ParameterizedCurveVectorFunction")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"VectorFunction DoublesVectorFunctionProvider.from(Double[])"})
  void testFromWithDouble_thenReturnParameterizedCurveVectorFunction() {
    // Arrange and Act
    VectorFunction actualFromResult =
        new ParameterizedCurveVectorFunctionProvider(mock(ParameterizedCurve.class))
            .from(new Double[] {2.0d});

    // Assert
    assertTrue(actualFromResult instanceof ParameterizedCurveVectorFunction);
    assertEquals(0, actualFromResult.getLengthOfDomain());
    assertEquals(1, actualFromResult.getLengthOfRange());
  }

  /**
   * Test {@link DoublesVectorFunctionProvider#from(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code 0.5}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 0.5}.
   *   <li>Then return LengthOfRange is two.
   * </ul>
   *
   * <p>Method under test: {@link DoublesVectorFunctionProvider#from(List)}
   */
  @Test
  @DisplayName(
      "Test from(List) with 'List'; given '0.5'; when ArrayList() add '0.5'; then return LengthOfRange is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"VectorFunction DoublesVectorFunctionProvider.from(List)"})
  void testFromWithList_given05_whenArrayListAdd05_thenReturnLengthOfRangeIsTwo() {
    // Arrange
    ParameterizedCurveVectorFunctionProvider parameterizedCurveVectorFunctionProvider =
        new ParameterizedCurveVectorFunctionProvider(mock(ParameterizedCurve.class));

    ArrayList<Double> x = new ArrayList<>();
    x.add(0.5d);
    x.add(10.0d);

    // Act
    VectorFunction actualFromResult = parameterizedCurveVectorFunctionProvider.from(x);

    // Assert
    assertTrue(actualFromResult instanceof ParameterizedCurveVectorFunction);
    assertEquals(0, actualFromResult.getLengthOfDomain());
    assertEquals(2, actualFromResult.getLengthOfRange());
  }

  /**
   * Test {@link DoublesVectorFunctionProvider#from(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link ArrayList#ArrayList()} add ten.
   *   <li>Then return LengthOfRange is one.
   * </ul>
   *
   * <p>Method under test: {@link DoublesVectorFunctionProvider#from(List)}
   */
  @Test
  @DisplayName(
      "Test from(List) with 'List'; given ten; when ArrayList() add ten; then return LengthOfRange is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"VectorFunction DoublesVectorFunctionProvider.from(List)"})
  void testFromWithList_givenTen_whenArrayListAddTen_thenReturnLengthOfRangeIsOne() {
    // Arrange
    ParameterizedCurveVectorFunctionProvider parameterizedCurveVectorFunctionProvider =
        new ParameterizedCurveVectorFunctionProvider(mock(ParameterizedCurve.class));

    ArrayList<Double> x = new ArrayList<>();
    x.add(10.0d);

    // Act
    VectorFunction actualFromResult = parameterizedCurveVectorFunctionProvider.from(x);

    // Assert
    assertTrue(actualFromResult instanceof ParameterizedCurveVectorFunction);
    assertEquals(0, actualFromResult.getLengthOfDomain());
    assertEquals(1, actualFromResult.getLengthOfRange());
  }
}
