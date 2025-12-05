package com.opengamma.strata.data;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CombinedMarketDataDiffblueTest {
  /**
   * Test {@link CombinedMarketData#getValuationDate()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CombinedMarketData.getValuationDate()"})
  void testGetValuationDate() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act
    LocalDate actualValuationDate = combinedMarketData.getValuationDate();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link CombinedMarketData#getValuationDate()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CombinedMarketData.getValuationDate()"})
  void testGetValuationDate2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act
    LocalDate actualValuationDate = combinedMarketData.getValuationDate();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link CombinedMarketData#getValuationDate()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CombinedMarketData.getValuationDate()"})
  void testGetValuationDate3() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act
    LocalDate actualValuationDate = combinedMarketData.getValuationDate();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link CombinedMarketData#getValuationDate()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CombinedMarketData.getValuationDate()"})
  void testGetValuationDate4() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id2, "Value", underlying);

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying2);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act
    LocalDate actualValuationDate = combinedMarketData.getValuationDate();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link CombinedMarketData#getValuationDate()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CombinedMarketData.getValuationDate()"})
  void testGetValuationDate5() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> underlying1 =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act
    LocalDate actualValuationDate = combinedMarketData.getValuationDate();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link CombinedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedMarketData.containsValue(MarketDataId)"})
  void testContainsValue() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link CombinedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedMarketData.containsValue(MarketDataId)"})
  void testContainsValue2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link CombinedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedMarketData.containsValue(MarketDataId)"})
  void testContainsValue3() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link CombinedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedMarketData.containsValue(MarketDataId)"})
  void testContainsValue4() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link CombinedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedMarketData.containsValue(MarketDataId)"})
  void testContainsValue5() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id, "Value", underlying);

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link CombinedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedMarketData.containsValue(MarketDataId)"})
  void testContainsValue6() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id2, "Value", underlying);

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying2);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link CombinedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedMarketData.containsValue(MarketDataId)"})
  void testContainsValue7() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> underlying1 =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link CombinedMarketData#getValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CombinedMarketData.getValue(MarketDataId)"})
  void testGetValue() {
    // Arrange
    MarketData underlying1 = mock(MarketData.class);
    Optional<Object> emptyResult = Optional.empty();
    when(underlying1.findValue(Mockito.<MarketDataId<Object>>any())).thenReturn(emptyResult);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(ImmutableMarketData.of(valuationDate, new HashMap<>()), underlying2);
    ExtendedMarketData<Object> underlying22 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying22);

    // Act
    Object actualValue = combinedMarketData.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying1).findValue(isA(MarketDataId.class));
    verify(underlying1).getValuationDate();
    verify(underlying2).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link CombinedMarketData#getValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CombinedMarketData.getValue(MarketDataId)"})
  void testGetValue2() {
    // Arrange
    MarketData underlying1 = mock(MarketData.class);
    Optional<Object> emptyResult = Optional.empty();
    when(underlying1.findValue(Mockito.<MarketDataId<Object>>any())).thenReturn(emptyResult);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying13 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    CombinedMarketData underlying = new CombinedMarketData(underlying13, underlying2);
    ExtendedMarketData<Object> underlying22 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying22);

    // Act
    Object actualValue = combinedMarketData.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying1).findValue(isA(MarketDataId.class));
    verify(underlying1).getValuationDate();
    verify(underlying2).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link CombinedMarketData#getValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CombinedMarketData.getValue(MarketDataId)"})
  void testGetValue3() {
    // Arrange
    MarketData underlying1 = mock(MarketData.class);
    Optional<Object> emptyResult = Optional.empty();
    when(underlying1.findValue(Mockito.<MarketDataId<Object>>any())).thenReturn(emptyResult);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    MarketData underlying = mock(MarketData.class);
    when(underlying.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    ExtendedMarketData<Object> underlying2 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act
    Object actualValue = combinedMarketData.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying1).findValue(isA(MarketDataId.class));
    verify(underlying1).getValuationDate();
    verify(underlying).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link CombinedMarketData#getValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@link MarketData} {@link MarketData#findValue(MarketDataId)} return {@link
   *       Optional} with {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test getValue(MarketDataId); given MarketData findValue(MarketDataId) return Optional with 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CombinedMarketData.getValue(MarketDataId)"})
  void testGetValue_givenMarketDataFindValueReturnOptionalWithValue_thenReturnValue() {
    // Arrange
    MarketData underlying1 = mock(MarketData.class);
    Optional<Object> ofResult = Optional.of("Value");
    when(underlying1.findValue(Mockito.<MarketDataId<Object>>any())).thenReturn(ofResult);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act
    Object actualValue = combinedMarketData.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying1).findValue(isA(MarketDataId.class));
    verify(underlying1).getValuationDate();
    assertEquals("Value", actualValue);
  }

  /**
   * Test {@link CombinedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CombinedMarketData.findValue(MarketDataId)"})
  void testFindValue() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.findValue(mock(MarketDataId.class)).isPresent());
  }

  /**
   * Test {@link CombinedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CombinedMarketData.findValue(MarketDataId)"})
  void testFindValue2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.findValue(mock(MarketDataId.class)).isPresent());
  }

  /**
   * Test {@link CombinedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CombinedMarketData.findValue(MarketDataId)"})
  void testFindValue3() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.findValue(mock(MarketDataId.class)).isPresent());
  }

  /**
   * Test {@link CombinedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CombinedMarketData.findValue(MarketDataId)"})
  void testFindValue4() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertFalse(combinedMarketData.findValue(mock(MarketDataId.class)).isPresent());
  }

  /**
   * Test {@link CombinedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CombinedMarketData.findValue(MarketDataId)"})
  void testFindValue5() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id, "Value", underlying);

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertFalse(combinedMarketData.findValue(mock(MarketDataId.class)).isPresent());
  }

  /**
   * Test {@link CombinedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CombinedMarketData.findValue(MarketDataId)"})
  void testFindValue6() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id2, "Value", underlying);

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying2);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.findValue(mock(MarketDataId.class)).isPresent());
  }

  /**
   * Test {@link CombinedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CombinedMarketData.findValue(MarketDataId)"})
  void testFindValue7() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> underlying1 =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.findValue(mock(MarketDataId.class)).isPresent());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertTrue(combinedMarketData.getIds().isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertTrue(combinedMarketData.getIds().isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds3() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id2, "Value", underlying);

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying2);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertEquals(2, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds4() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> underlying1 =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertEquals(1, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_givenJavaLangObject_thenCallsGetMarketDataType() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act
    Set<MarketDataId<?>> actualIds = combinedMarketData.getIds();

    // Assert
    verify(marketDataId).getMarketDataType();
    assertEquals(1, actualIds.size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_givenJavaLangObject_thenCallsGetMarketDataType2() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act
    Set<MarketDataId<?>> actualIds = combinedMarketData.getIds();

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertEquals(2, actualIds.size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_thenReturnEmpty() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertTrue(combinedMarketData.getIds().isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is five.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsFive() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    MarketDataId<Object> id3 = mock(MarketDataId.class);
    MarketDataId<Object> id4 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id4, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying13 = ExtendedMarketData.of(id3, "Value", underlying2);
    MarketDataId<Object> id5 = mock(MarketDataId.class);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying14 = ImmutableMarketData.of(valuationDate4, new HashMap<>());
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying3 =
        new CombinedMarketData(
            underlying14, ImmutableMarketData.of(valuationDate5, new HashMap<>()));

    ExtendedMarketData<Object> underlying23 = ExtendedMarketData.of(id5, "Value", underlying3);

    CombinedMarketData underlying4 = new CombinedMarketData(underlying13, underlying23);

    ExtendedMarketData<Object> underlying15 = ExtendedMarketData.of(id2, "Value", underlying4);
    LocalDate valuationDate6 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying5 =
        new CombinedMarketData(
            underlying15, ImmutableMarketData.of(valuationDate6, new HashMap<>()));

    ExtendedMarketData<Object> underlying16 = ExtendedMarketData.of(id, "Value", underlying5);
    LocalDate valuationDate7 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying16, ImmutableMarketData.of(valuationDate7, new HashMap<>()));

    // Act and Assert
    assertEquals(5, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsFour() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    MarketDataId<Object> id3 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id3, "Value", underlying);
    MarketDataId<Object> id4 = mock(MarketDataId.class);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying13 = ImmutableMarketData.of(valuationDate3, new HashMap<>());
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    ExtendedMarketData<Object> underlying23 = ExtendedMarketData.of(id4, "Value", underlying2);

    CombinedMarketData underlying3 = new CombinedMarketData(underlying12, underlying23);

    ExtendedMarketData<Object> underlying14 = ExtendedMarketData.of(id2, "Value", underlying3);
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying4 =
        new CombinedMarketData(
            underlying14, ImmutableMarketData.of(valuationDate5, new HashMap<>()));

    ExtendedMarketData<Object> underlying15 = ExtendedMarketData.of(id, "Value", underlying4);
    LocalDate valuationDate6 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying15, ImmutableMarketData.of(valuationDate6, new HashMap<>()));

    // Act and Assert
    assertEquals(4, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsFour2() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id3 = mock(MarketDataId.class);
    MarketDataId<Object> id4 = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying13 = ExtendedMarketData.of(id4, "Value", underlying);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    ExtendedMarketData<Object> underlying23 = ExtendedMarketData.of(id3, "Value", underlying2);

    CombinedMarketData underlying3 = new CombinedMarketData(underlying1, underlying23);

    ExtendedMarketData<Object> underlying14 = ExtendedMarketData.of(id2, "Value", underlying3);
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying4 =
        new CombinedMarketData(
            underlying14, ImmutableMarketData.of(valuationDate5, new HashMap<>()));

    ExtendedMarketData<Object> underlying15 = ExtendedMarketData.of(id, "Value", underlying4);
    LocalDate valuationDate6 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying15, ImmutableMarketData.of(valuationDate6, new HashMap<>()));

    // Act and Assert
    assertEquals(4, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsOne() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertEquals(1, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsOne2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id, "Value", underlying);

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertEquals(1, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is six.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsSix() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    MarketDataId<Object> id3 = mock(MarketDataId.class);
    MarketDataId<Object> id4 = mock(MarketDataId.class);
    MarketDataId<Object> id5 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id5, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying13 = ExtendedMarketData.of(id4, "Value", underlying2);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying3 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    ExtendedMarketData<Object> underlying14 = ExtendedMarketData.of(id3, "Value", underlying3);
    MarketDataId<Object> id6 = mock(MarketDataId.class);
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying15 = ImmutableMarketData.of(valuationDate5, new HashMap<>());
    LocalDate valuationDate6 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying4 =
        new CombinedMarketData(
            underlying15, ImmutableMarketData.of(valuationDate6, new HashMap<>()));

    ExtendedMarketData<Object> underlying23 = ExtendedMarketData.of(id6, "Value", underlying4);

    CombinedMarketData underlying5 = new CombinedMarketData(underlying14, underlying23);

    ExtendedMarketData<Object> underlying16 = ExtendedMarketData.of(id2, "Value", underlying5);
    LocalDate valuationDate7 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying6 =
        new CombinedMarketData(
            underlying16, ImmutableMarketData.of(valuationDate7, new HashMap<>()));

    ExtendedMarketData<Object> underlying17 = ExtendedMarketData.of(id, "Value", underlying6);
    LocalDate valuationDate8 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying17, ImmutableMarketData.of(valuationDate8, new HashMap<>()));

    // Act and Assert
    assertEquals(6, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is six.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsSix2() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    MarketDataId<Object> id3 = mock(MarketDataId.class);
    MarketDataId<Object> id4 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id5 = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id5, "Value", underlying);

    CombinedMarketData underlying3 = new CombinedMarketData(underlying1, underlying2);

    ExtendedMarketData<Object> underlying13 = ExtendedMarketData.of(id4, "Value", underlying3);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying4 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    ExtendedMarketData<Object> underlying14 = ExtendedMarketData.of(id3, "Value", underlying4);
    MarketDataId<Object> id6 = mock(MarketDataId.class);
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying15 = ImmutableMarketData.of(valuationDate5, new HashMap<>());
    LocalDate valuationDate6 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying5 =
        new CombinedMarketData(
            underlying15, ImmutableMarketData.of(valuationDate6, new HashMap<>()));

    ExtendedMarketData<Object> underlying22 = ExtendedMarketData.of(id6, "Value", underlying5);

    CombinedMarketData underlying6 = new CombinedMarketData(underlying14, underlying22);

    ExtendedMarketData<Object> underlying16 = ExtendedMarketData.of(id2, "Value", underlying6);
    LocalDate valuationDate7 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying7 =
        new CombinedMarketData(
            underlying16, ImmutableMarketData.of(valuationDate7, new HashMap<>()));

    ExtendedMarketData<Object> underlying17 = ExtendedMarketData.of(id, "Value", underlying7);
    LocalDate valuationDate8 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying17, ImmutableMarketData.of(valuationDate8, new HashMap<>()));

    // Act and Assert
    assertEquals(6, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsThree() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id3 = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id3, "Value", underlying);

    CombinedMarketData underlying3 = new CombinedMarketData(underlying1, underlying2);

    ExtendedMarketData<Object> underlying13 = ExtendedMarketData.of(id2, "Value", underlying3);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying4 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    ExtendedMarketData<Object> underlying14 = ExtendedMarketData.of(id, "Value", underlying4);
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying14, ImmutableMarketData.of(valuationDate5, new HashMap<>()));

    // Act and Assert
    assertEquals(3, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsTwo() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id2, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying13 = ExtendedMarketData.of(id, "Value", underlying2);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    // Act and Assert
    assertEquals(2, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsTwo2() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id2, "Value", underlying);

    CombinedMarketData underlying3 = new CombinedMarketData(underlying1, underlying2);

    ExtendedMarketData<Object> underlying13 = ExtendedMarketData.of(id, "Value", underlying3);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    // Act and Assert
    assertEquals(2, combinedMarketData.getIds().size());
  }

  /**
   * Test {@link CombinedMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.findIds(MarketDataName)"})
  void testFindIds() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertTrue(combinedMarketData.findIds(mock(MarketDataName.class)).isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.findIds(MarketDataName)"})
  void testFindIds2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertTrue(combinedMarketData.findIds(mock(MarketDataName.class)).isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.findIds(MarketDataName)"})
  void testFindIds3() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertTrue(combinedMarketData.findIds(mock(MarketDataName.class)).isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.findIds(MarketDataName)"})
  void testFindIds4() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying13 = ImmutableMarketData.of(valuationDate3, new HashMap<>());
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying12, underlying2);

    // Act and Assert
    assertTrue(combinedMarketData.findIds(mock(MarketDataName.class)).isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.findIds(MarketDataName)"})
  void testFindIds5() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> underlying1 =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertTrue(combinedMarketData.findIds(mock(MarketDataName.class)).isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link CombinedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.findIds(MarketDataName)"})
  void testFindIds6() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying13 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id, "Value", underlying);

    CombinedMarketData underlying22 = new CombinedMarketData(underlying12, underlying2);

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying22);

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult =
        combinedMarketData.findIds(mock(MarketDataName.class));

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findIds(MarketDataName); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.findIds(MarketDataName)"})
  void testFindIds_givenJavaLangObject_thenCallsGetMarketDataType() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult =
        combinedMarketData.findIds(mock(MarketDataName.class));

    // Assert
    verify(marketDataId).getMarketDataType();
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findIds(MarketDataName); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.findIds(MarketDataName)"})
  void testFindIds_givenJavaLangObject_thenCallsGetMarketDataType2() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult =
        combinedMarketData.findIds(mock(MarketDataName.class));

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertTrue(combinedMarketData.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertTrue(combinedMarketData.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds3() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertTrue(combinedMarketData.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds4() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertTrue(combinedMarketData.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds5() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id, "Value", underlying);

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertTrue(combinedMarketData.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds6() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id2, "Value", underlying);

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying2);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertTrue(combinedMarketData.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CombinedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds7() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> underlying1 =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertTrue(combinedMarketData.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeries(ObservableId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName("Test getTimeSeries(ObservableId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries CombinedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act
    assertDoesNotThrow(() -> combinedMarketData.getTimeSeries(new TestingObservableId("42")));
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeries(ObservableId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName("Test getTimeSeries(ObservableId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries CombinedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act
    assertDoesNotThrow(() -> combinedMarketData.getTimeSeries(new TestingObservableId("42")));
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeries(ObservableId)}.
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName("Test getTimeSeries(ObservableId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries CombinedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries3() {
    // Arrange
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenThrow(new IllegalArgumentException());

    MarketData underlying1 = mock(MarketData.class);
    when(underlying1.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> combinedMarketData.getTimeSeries(new TestingObservableId("42")));
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(underlying1).getTimeSeries(isA(ObservableId.class));
    verify(underlying1).getValuationDate();
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Given {@link LocalDateDoubleTimeSeries} {@link LocalDateDoubleTimeSeries#isEmpty()}
   *       return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName(
      "Test getTimeSeries(ObservableId); given LocalDateDoubleTimeSeries isEmpty() return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries CombinedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries_givenLocalDateDoubleTimeSeriesIsEmptyReturnFalse() {
    // Arrange
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenReturn(false);

    MarketData underlying1 = mock(MarketData.class);
    when(underlying1.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act
    combinedMarketData.getTimeSeries(new TestingObservableId("42"));

    // Assert
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(underlying1).getTimeSeries(isA(ObservableId.class));
    verify(underlying1).getValuationDate();
    verify(underlying2).getValuationDate();
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Given {@link LocalDateDoubleTimeSeries} {@link LocalDateDoubleTimeSeries#isEmpty()}
   *       return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName(
      "Test getTimeSeries(ObservableId); given LocalDateDoubleTimeSeries isEmpty() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries CombinedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries_givenLocalDateDoubleTimeSeriesIsEmptyReturnTrue() {
    // Arrange
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenReturn(true);

    MarketData underlying1 = mock(MarketData.class);
    when(underlying1.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act
    combinedMarketData.getTimeSeries(new TestingObservableId("42"));

    // Assert
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(underlying1).getTimeSeries(isA(ObservableId.class));
    verify(underlying1).getValuationDate();
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Given {@link LocalDateDoubleTimeSeries} {@link LocalDateDoubleTimeSeries#isEmpty()}
   *       return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName(
      "Test getTimeSeries(ObservableId); given LocalDateDoubleTimeSeries isEmpty() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries CombinedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries_givenLocalDateDoubleTimeSeriesIsEmptyReturnTrue2() {
    // Arrange
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenReturn(true);

    MarketData underlying1 = mock(MarketData.class);
    when(underlying1.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act
    combinedMarketData.getTimeSeries(new TestingObservableId("42"));

    // Assert
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(underlying1).getTimeSeries(isA(ObservableId.class));
    verify(underlying2).getTimeSeries(isA(ObservableId.class));
    verify(underlying1).getValuationDate();
    verify(underlying2).getValuationDate();
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Given {@link MarketData} {@link MarketData#getTimeSeries(ObservableId)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName(
      "Test getTimeSeries(ObservableId); given MarketData getTimeSeries(ObservableId) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries CombinedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries_givenMarketDataGetTimeSeriesThrowIllegalArgumentException() {
    // Arrange
    MarketData underlying1 = mock(MarketData.class);
    when(underlying1.getTimeSeries(Mockito.<ObservableId>any()))
        .thenThrow(new IllegalArgumentException());
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> combinedMarketData.getTimeSeries(new TestingObservableId("42")));
    verify(underlying1).getTimeSeries(isA(ObservableId.class));
    verify(underlying1).getValuationDate();
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Given {@link MarketData} {@link MarketData#getTimeSeries(ObservableId)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName(
      "Test getTimeSeries(ObservableId); given MarketData getTimeSeries(ObservableId) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries CombinedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries_givenMarketDataGetTimeSeriesThrowIllegalArgumentException2() {
    // Arrange
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenReturn(true);

    MarketData underlying1 = mock(MarketData.class);
    when(underlying1.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getTimeSeries(Mockito.<ObservableId>any()))
        .thenThrow(new IllegalArgumentException());
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> combinedMarketData.getTimeSeries(new TestingObservableId("42")));
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(underlying1).getTimeSeries(isA(ObservableId.class));
    verify(underlying2).getTimeSeries(isA(ObservableId.class));
    verify(underlying1).getValuationDate();
    verify(underlying2).getValuationDate();
  }

  /**
   * Test {@link CombinedMarketData#getTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName("Test getTimeSeries(ObservableId); then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries CombinedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries_thenDoesNotThrow() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act
    assertDoesNotThrow(() -> combinedMarketData.getTimeSeries(new TestingObservableId("42")));
  }

  /**
   * Test {@link CombinedMarketData#meta()}.
   *
   * <p>Method under test: {@link CombinedMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CombinedMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CombinedMarketData> actualMetaResult = CombinedMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("underlying1"));
    assertTrue(metaPropertyMapResult.containsKey("underlying2"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CombinedMarketData> expectedBeanTypeResult = CombinedMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}.
   *
   * <p>Method under test: {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}
   */
  @Test
  @DisplayName("Test new CombinedMarketData(MarketData, MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CombinedMarketData.<init>(MarketData, MarketData)"})
  void testNewCombinedMarketData() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying13 = ImmutableMarketData.of(valuationDate3, new HashMap<>());
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    // Act
    CombinedMarketData actualCombinedMarketData = new CombinedMarketData(underlying12, underlying2);

    // Assert
    assertSame(underlying12, actualCombinedMarketData.getUnderlying1());
    assertSame(underlying2, actualCombinedMarketData.getUnderlying2());
  }

  /**
   * Test {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}.
   *
   * <p>Method under test: {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}
   */
  @Test
  @DisplayName("Test new CombinedMarketData(MarketData, MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CombinedMarketData.<init>(MarketData, MarketData)"})
  void testNewCombinedMarketData2() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);

    // Act
    CombinedMarketData actualCombinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Assert
    assertTrue(actualCombinedMarketData.getUnderlying2() instanceof ImmutableMarketData);
    assertSame(underlying12, actualCombinedMarketData.getUnderlying1());
  }

  /**
   * Test {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}.
   *
   * <p>Method under test: {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}
   */
  @Test
  @DisplayName("Test new CombinedMarketData(MarketData, MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CombinedMarketData.<init>(MarketData, MarketData)"})
  void testNewCombinedMarketData3() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    CombinedMarketData actualCombinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Assert
    assertTrue(actualCombinedMarketData.getUnderlying1() instanceof ImmutableMarketData);
    assertSame(underlying2, actualCombinedMarketData.getUnderlying2());
  }

  /**
   * Test {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}.
   *
   * <p>Method under test: {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}
   */
  @Test
  @DisplayName("Test new CombinedMarketData(MarketData, MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CombinedMarketData.<init>(MarketData, MarketData)"})
  void testNewCombinedMarketData4() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying13 = ExtendedMarketData.of(id, "Value", underlying);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);

    // Act
    CombinedMarketData actualCombinedMarketData =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    // Assert
    assertTrue(actualCombinedMarketData.getUnderlying2() instanceof ImmutableMarketData);
    assertSame(underlying13, actualCombinedMarketData.getUnderlying1());
  }

  /**
   * Test {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}.
   *
   * <p>Method under test: {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}
   */
  @Test
  @DisplayName("Test new CombinedMarketData(MarketData, MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CombinedMarketData.<init>(MarketData, MarketData)"})
  void testNewCombinedMarketData5() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id2, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying13 = ExtendedMarketData.of(id, "Value", underlying2);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);

    // Act
    CombinedMarketData actualCombinedMarketData =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    // Assert
    assertTrue(actualCombinedMarketData.getUnderlying2() instanceof ImmutableMarketData);
    assertSame(underlying13, actualCombinedMarketData.getUnderlying1());
  }

  /**
   * Test {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}.
   *
   * <p>Method under test: {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}
   */
  @Test
  @DisplayName("Test new CombinedMarketData(MarketData, MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CombinedMarketData.<init>(MarketData, MarketData)"})
  void testNewCombinedMarketData6() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id2, "Value", underlying);

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying2);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);

    // Act
    CombinedMarketData actualCombinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Assert
    assertTrue(actualCombinedMarketData.getUnderlying2() instanceof ImmutableMarketData);
    assertSame(underlying12, actualCombinedMarketData.getUnderlying1());
  }

  /**
   * Test {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}.
   *
   * <p>Method under test: {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}
   */
  @Test
  @DisplayName("Test new CombinedMarketData(MarketData, MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CombinedMarketData.<init>(MarketData, MarketData)"})
  void testNewCombinedMarketData7() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> underlying1 =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act
    CombinedMarketData actualCombinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Assert
    assertTrue(actualCombinedMarketData.getUnderlying2() instanceof ImmutableMarketData);
    assertSame(underlying1, actualCombinedMarketData.getUnderlying1());
  }

  /**
   * Test {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}.
   *
   * <ul>
   *   <li>Then return Underlying2 is Underlying1.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#CombinedMarketData(MarketData, MarketData)}
   */
  @Test
  @DisplayName(
      "Test new CombinedMarketData(MarketData, MarketData); then return Underlying2 is Underlying1")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CombinedMarketData.<init>(MarketData, MarketData)"})
  void testNewCombinedMarketData_thenReturnUnderlying2IsUnderlying1() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act
    CombinedMarketData actualCombinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Assert
    MarketData underlying12 = actualCombinedMarketData.getUnderlying1();
    assertTrue(underlying12 instanceof ImmutableMarketData);
    MarketData underlying2 = actualCombinedMarketData.getUnderlying2();
    assertTrue(underlying2 instanceof ImmutableMarketData);
    assertEquals(underlying12, underlying2);
  }

  /**
   * Test {@link CombinedMarketData#metaBean()}.
   *
   * <p>Method under test: {@link CombinedMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CombinedMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act
    TypedMetaBean<CombinedMarketData> actualMetaBeanResult = combinedMarketData.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("underlying1"));
    assertTrue(metaPropertyMapResult.containsKey("underlying2"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CombinedMarketData> expectedBeanTypeResult = CombinedMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CombinedMarketData#toString()}
   *   <li>{@link CombinedMarketData#getUnderlying1()}
   *   <li>{@link CombinedMarketData#getUnderlying2()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketData CombinedMarketData.getUnderlying1()",
    "MarketData CombinedMarketData.getUnderlying2()",
    "String CombinedMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying2 = ImmutableMarketData.of(valuationDate2, new HashMap<>());

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act
    String actualToStringResult = combinedMarketData.toString();
    MarketData actualUnderlying1 = combinedMarketData.getUnderlying1();

    // Assert
    assertEquals(
        "CombinedMarketData{underlying1=ImmutableMarketData{valuationDate=1970-01-01, values={}, timeSeries={}},"
            + " underlying2=ImmutableMarketData{valuationDate=1970-01-01, values={}, timeSeries={}}}",
        actualToStringResult);
    assertSame(underlying1, actualUnderlying1);
    assertSame(underlying2, combinedMarketData.getUnderlying2());
  }

  /**
   * Test {@link CombinedMarketData#equals(Object)}, and {@link CombinedMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CombinedMarketData#equals(Object)}
   *   <li>{@link CombinedMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedMarketData.equals(Object)",
    "int CombinedMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate3, new HashMap<>());
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    // Act and Assert
    assertEquals(combinedMarketData, combinedMarketData2);
    assertEquals(combinedMarketData.hashCode(), combinedMarketData2.hashCode());
  }

  /**
   * Test {@link CombinedMarketData#equals(Object)}, and {@link CombinedMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CombinedMarketData#equals(Object)}
   *   <li>{@link CombinedMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedMarketData.equals(Object)",
    "int CombinedMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertEquals(combinedMarketData, combinedMarketData);
    int expectedHashCodeResult = combinedMarketData.hashCode();
    assertEquals(expectedHashCodeResult, combinedMarketData.hashCode());
  }

  /**
   * Test {@link CombinedMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedMarketData.equals(Object)",
    "int CombinedMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying13 = ImmutableMarketData.of(valuationDate4, new HashMap<>());
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(
        combinedMarketData,
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate5, new HashMap<>())));
  }

  /**
   * Test {@link CombinedMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedMarketData.equals(Object)",
    "int CombinedMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying13 = ImmutableMarketData.of(valuationDate4, new HashMap<>());
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(
        combinedMarketData,
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate5, new HashMap<>())));
  }

  /**
   * Test {@link CombinedMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedMarketData.equals(Object)",
    "int CombinedMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>())),
        null);
  }

  /**
   * Test {@link CombinedMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedMarketData.equals(Object)",
    "int CombinedMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>())),
        "Different type to CombinedMarketData");
  }
}
