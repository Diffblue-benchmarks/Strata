package com.opengamma.strata.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ReferenceDataDiffblueTest {
  /**
   * Test {@link ReferenceData#of(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link ImmutableReferenceData}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceData#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map); when HashMap(); then return ImmutableReferenceData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ReferenceData.of(Map)"})
  void testOf_whenHashMap_thenReturnImmutableReferenceData() {
    // Arrange and Act
    ReferenceData actualOfResult = ReferenceData.of(new HashMap<>());
    Object actualQueryValueOrNullResult =
        actualOfResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualOfResult instanceof ImmutableReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertEquals(4, ((ImmutableReferenceData) actualOfResult).getValues().size());
  }

  /**
   * Test {@link ReferenceData#standard()}.
   *
   * <p>Method under test: {@link ReferenceData#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ReferenceData.standard()"})
  void testStandard() {
    // Arrange and Act
    ReferenceData actualStandardResult = ReferenceData.standard();
    Object actualQueryValueOrNullResult =
        actualStandardResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualStandardResult instanceof ImmutableReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertEquals(30, ((ImmutableReferenceData) actualStandardResult).getValues().size());
  }

  /**
   * Test {@link ReferenceData#minimal()}.
   *
   * <p>Method under test: {@link ReferenceData#minimal()}
   */
  @Test
  @DisplayName("Test minimal()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ReferenceData.minimal()"})
  void testMinimal() {
    // Arrange and Act
    ReferenceData actualMinimalResult = ReferenceData.minimal();
    Object actualQueryValueOrNullResult =
        actualMinimalResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualMinimalResult instanceof ImmutableReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertEquals(4, ((ImmutableReferenceData) actualMinimalResult).getValues().size());
  }

  /**
   * Test {@link ReferenceData#empty()}.
   *
   * <p>Method under test: {@link ReferenceData#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ReferenceData.empty()"})
  void testEmpty() {
    // Arrange and Act
    ReferenceData actualEmptyResult = ReferenceData.empty();
    Object actualQueryValueOrNullResult =
        actualEmptyResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualEmptyResult instanceof ImmutableReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertTrue(((ImmutableReferenceData) actualEmptyResult).getValues().isEmpty());
  }

  /**
   * Test {@link ReferenceData#containsValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceData#containsValue(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test containsValue(ReferenceDataId); given 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceData.containsValue(ReferenceDataId)"})
  void testContainsValue_givenNull_thenReturnFalse() {
    // Arrange
    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    when(id.queryValueOrNull(Mockito.<ReferenceData>any())).thenReturn(null);

    // Act
    boolean actualContainsValueResult = StandardReferenceData.MINIMAL.containsValue(id);

    // Assert
    verify(id).queryValueOrNull(isA(ReferenceData.class));
    assertFalse(actualContainsValueResult);
  }

  /**
   * Test {@link ReferenceData#containsValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@code Query Value Or Null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceData#containsValue(ReferenceDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(ReferenceDataId); given 'Query Value Or Null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceData.containsValue(ReferenceDataId)"})
  void testContainsValue_givenQueryValueOrNull_thenReturnTrue() {
    // Arrange
    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    when(id.queryValueOrNull(Mockito.<ReferenceData>any())).thenReturn("Query Value Or Null");

    // Act
    boolean actualContainsValueResult = StandardReferenceData.MINIMAL.containsValue(id);

    // Assert
    verify(id).queryValueOrNull(isA(ReferenceData.class));
    assertTrue(actualContainsValueResult);
  }

  /**
   * Test {@link ReferenceData#containsValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Then throw {@link ReferenceDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceData#containsValue(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test containsValue(ReferenceDataId); then throw ReferenceDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReferenceData.containsValue(ReferenceDataId)"})
  void testContainsValue_thenThrowReferenceDataNotFoundException() {
    // Arrange
    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    when(id.queryValueOrNull(Mockito.<ReferenceData>any()))
        .thenThrow(new ReferenceDataNotFoundException("An error occurred"));

    // Act and Assert
    assertThrows(
        ReferenceDataNotFoundException.class,
        () -> StandardReferenceData.MINIMAL.containsValue(id));
    verify(id).queryValueOrNull(isA(ReferenceData.class));
  }

  /**
   * Test {@link ReferenceData#getValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ReferenceDataId} {@link ReferenceDataId#queryValueOrNull(ReferenceData)}
   *       return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceData#getValue(ReferenceDataId)}
   */
  @Test
  @DisplayName(
      "Test getValue(ReferenceDataId); given 'null'; when ReferenceDataId queryValueOrNull(ReferenceData) return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceData.getValue(ReferenceDataId)"})
  void testGetValue_givenNull_whenReferenceDataIdQueryValueOrNullReturnNull() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    when(id.queryValueOrNull(Mockito.<ReferenceData>any())).thenReturn(null);

    // Act and Assert
    assertThrows(ReferenceDataNotFoundException.class, () -> combinedReferenceData.getValue(id));
    verify(id).queryValueOrNull(isA(ReferenceData.class));
  }

  /**
   * Test {@link ReferenceData#getValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@code Query Value Or Null}.
   *   <li>Then return {@code Query Value Or Null}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceData#getValue(ReferenceDataId)}
   */
  @Test
  @DisplayName(
      "Test getValue(ReferenceDataId); given 'Query Value Or Null'; then return 'Query Value Or Null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceData.getValue(ReferenceDataId)"})
  void testGetValue_givenQueryValueOrNull_thenReturnQueryValueOrNull() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    when(id.queryValueOrNull(Mockito.<ReferenceData>any())).thenReturn("Query Value Or Null");

    // Act
    Object actualValue = combinedReferenceData.getValue(id);

    // Assert
    verify(id).queryValueOrNull(isA(ReferenceData.class));
    assertEquals("Query Value Or Null", actualValue);
  }

  /**
   * Test {@link ReferenceData#getValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@link ReferenceDataNotFoundException#ReferenceDataNotFoundException(String)} with
   *       message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceData#getValue(ReferenceDataId)}
   */
  @Test
  @DisplayName(
      "Test getValue(ReferenceDataId); given ReferenceDataNotFoundException(String) with message is 'An error occurred'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ReferenceData.getValue(ReferenceDataId)"})
  void testGetValue_givenReferenceDataNotFoundExceptionWithMessageIsAnErrorOccurred() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    when(id.queryValueOrNull(Mockito.<ReferenceData>any()))
        .thenThrow(new ReferenceDataNotFoundException("An error occurred"));

    // Act and Assert
    assertThrows(ReferenceDataNotFoundException.class, () -> combinedReferenceData.getValue(id));
    verify(id).queryValueOrNull(isA(ReferenceData.class));
  }

  /**
   * Test {@link ReferenceData#findValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@code Query Value Or Null}.
   *   <li>Then return {@link Optional#get()} is {@code Query Value Or Null}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceData#findValue(ReferenceDataId)}
   */
  @Test
  @DisplayName(
      "Test findValue(ReferenceDataId); given 'Query Value Or Null'; then return get() is 'Query Value Or Null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ReferenceData.findValue(ReferenceDataId)"})
  void testFindValue_givenQueryValueOrNull_thenReturnGetIsQueryValueOrNull() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    when(id.queryValueOrNull(Mockito.<ReferenceData>any())).thenReturn("Query Value Or Null");

    // Act
    Optional<Object> actualFindValueResult = combinedReferenceData.findValue(id);

    // Assert
    verify(id).queryValueOrNull(isA(ReferenceData.class));
    assertEquals("Query Value Or Null", actualFindValueResult.get());
    assertTrue(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link ReferenceData#findValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Then throw {@link ReferenceDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceData#findValue(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test findValue(ReferenceDataId); then throw ReferenceDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ReferenceData.findValue(ReferenceDataId)"})
  void testFindValue_thenThrowReferenceDataNotFoundException() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    when(id.queryValueOrNull(Mockito.<ReferenceData>any()))
        .thenThrow(new ReferenceDataNotFoundException("An error occurred"));

    // Act and Assert
    assertThrows(ReferenceDataNotFoundException.class, () -> combinedReferenceData.findValue(id));
    verify(id).queryValueOrNull(isA(ReferenceData.class));
  }

  /**
   * Test {@link ReferenceData#combinedWith(ReferenceData)}.
   *
   * <p>Method under test: {@link ReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));
    ReferenceData other = mock(ReferenceData.class);

    // Act
    ReferenceData actualCombinedWithResult = combinedReferenceData.combinedWith(other);
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    ReferenceData refData1 = ((CombinedReferenceData) actualCombinedWithResult).getRefData1();
    assertTrue(refData1 instanceof CombinedReferenceData);
    assertTrue(actualCombinedWithResult instanceof CombinedReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertSame(combinedReferenceData, refData1);
    assertSame(other, ((CombinedReferenceData) actualCombinedWithResult).getRefData2());
  }

  /**
   * Test {@link ReferenceData#combinedWith(ReferenceData)}.
   *
   * <p>Method under test: {@link ReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith2() {
    // Arrange
    ReferenceData refData1 = mock(ReferenceData.class);
    CombinedReferenceData refData2 =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    CombinedReferenceData combinedReferenceData = new CombinedReferenceData(refData1, refData2);
    ReferenceData other = mock(ReferenceData.class);

    // Act
    ReferenceData actualCombinedWithResult = combinedReferenceData.combinedWith(other);
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualCombinedWithResult instanceof CombinedReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertSame(
        combinedReferenceData, ((CombinedReferenceData) actualCombinedWithResult).getRefData1());
    assertSame(other, ((CombinedReferenceData) actualCombinedWithResult).getRefData2());
  }

  /**
   * Test {@link ReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then RefData1 RefData1 return {@link ImmutableReferenceData}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ReferenceData); then RefData1 RefData1 return ImmutableReferenceData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenRefData1RefData1ReturnImmutableReferenceData() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(StandardReferenceData.MINIMAL, mock(ReferenceData.class));

    // Act
    ReferenceData actualCombinedWithResult =
        combinedReferenceData.combinedWith(mock(ReferenceData.class));
    actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    ReferenceData refData1 = ((CombinedReferenceData) actualCombinedWithResult).getRefData1();
    assertTrue(refData1 instanceof CombinedReferenceData);
    assertTrue(actualCombinedWithResult instanceof CombinedReferenceData);
    ReferenceData refData12 = ((CombinedReferenceData) refData1).getRefData1();
    assertTrue(refData12 instanceof ImmutableReferenceData);
    assertEquals(4, ((ImmutableReferenceData) refData12).getValues().size());
    assertSame(combinedReferenceData, refData1);
  }

  /**
   * Test {@link ReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then RefData1 RefData2 return {@link ImmutableReferenceData}.
   * </ul>
   *
   * <p>Method under test: {@link ReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ReferenceData); then RefData1 RefData2 return ImmutableReferenceData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenRefData1RefData2ReturnImmutableReferenceData() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(mock(ReferenceData.class), StandardReferenceData.MINIMAL);

    // Act
    ReferenceData actualCombinedWithResult =
        combinedReferenceData.combinedWith(mock(ReferenceData.class));
    actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    ReferenceData refData1 = ((CombinedReferenceData) actualCombinedWithResult).getRefData1();
    assertTrue(refData1 instanceof CombinedReferenceData);
    assertTrue(actualCombinedWithResult instanceof CombinedReferenceData);
    ReferenceData refData2 = ((CombinedReferenceData) refData1).getRefData2();
    assertTrue(refData2 instanceof ImmutableReferenceData);
    assertEquals(4, ((ImmutableReferenceData) refData2).getValues().size());
    assertSame(combinedReferenceData, refData1);
  }
}
