package com.opengamma.strata.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
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
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExtendedMarketDataDiffblueTest {
  /**
   * Test {@link ExtendedMarketData#of(MarketDataId, Object, MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   *   <li>Then return ValuationDate toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#of(MarketDataId, Object, MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataId, Object, MarketData); when MarketDataId; then return ValuationDate toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedMarketData ExtendedMarketData.of(MarketDataId, Object, MarketData)"})
  void testOf_whenMarketDataId_thenReturnValuationDateToStringIs19700101() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act
    ExtendedMarketData<Object> actualOfResult = ExtendedMarketData.of(id, "Value", underlying);

    // Assert
    LocalDate valuationDate3 = actualOfResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate3.toString());
    assertEquals("Value", actualOfResult.getValue());
    assertEquals(1, actualOfResult.getIds().size());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertSame(underlying, actualOfResult.getUnderlying());
    assertSame(valuationDate, valuationDate3);
    assertSame(id, actualOfResult.getId());
  }

  /**
   * Test {@link ExtendedMarketData#getValuationDate()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ExtendedMarketData.getValuationDate()"})
  void testGetValuationDate() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    LocalDate actualValuationDate = ofResult.getValuationDate();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link ExtendedMarketData#getValuationDate()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ExtendedMarketData.getValuationDate()"})
  void testGetValuationDate2() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    LocalDate actualValuationDate = ofResult.getValuationDate();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link ExtendedMarketData#getValuationDate()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ExtendedMarketData.getValuationDate()"})
  void testGetValuationDate3() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying2);

    // Act
    LocalDate actualValuationDate = ofResult.getValuationDate();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link ExtendedMarketData#getValuationDate()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ExtendedMarketData.getValuationDate()"})
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying2);

    // Act
    LocalDate actualValuationDate = ofResult.getValuationDate();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link ExtendedMarketData#getValuationDate()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ExtendedMarketData.getValuationDate()"})
  void testGetValuationDate5() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act
    LocalDate actualValuationDate = ofResult.getValuationDate();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link ExtendedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExtendedMarketData.containsValue(MarketDataId)"})
  void testContainsValue() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertFalse(ofResult.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ExtendedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExtendedMarketData.containsValue(MarketDataId)"})
  void testContainsValue2() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertFalse(ofResult.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ExtendedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExtendedMarketData.containsValue(MarketDataId)"})
  void testContainsValue3() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying2);

    // Act and Assert
    assertFalse(ofResult.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ExtendedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExtendedMarketData.containsValue(MarketDataId)"})
  void testContainsValue4() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData underlying = new CombinedMarketData(underlying1, underlying2);

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertFalse(ofResult.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ExtendedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExtendedMarketData.containsValue(MarketDataId)"})
  void testContainsValue5() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying3);

    // Act and Assert
    assertFalse(ofResult.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ExtendedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExtendedMarketData.containsValue(MarketDataId)"})
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying2);

    // Act and Assert
    assertFalse(ofResult.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ExtendedMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExtendedMarketData.containsValue(MarketDataId)"})
  void testContainsValue7() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act and Assert
    assertFalse(ofResult.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId() {
    // Arrange
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", mock(MarketData.class));

    // Act and Assert
    assertNull(ofResult.getValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId2() {
    // Arrange
    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(ImmutableMarketData.of(valuationDate, new HashMap<>()), underlying2);
    ExtendedMarketData<Object> underlying3 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), 42, underlying3);

    // Act
    Object actualValue = ofResult.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying2).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId3() {
    // Arrange
    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    CombinedMarketData underlying = new CombinedMarketData(underlying12, underlying2);
    ExtendedMarketData<Object> underlying3 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), 42, underlying3);

    // Act
    Object actualValue = ofResult.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying2).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId4() {
    // Arrange
    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying);

    CombinedMarketData underlying3 = new CombinedMarketData(underlying12, underlying2);
    ExtendedMarketData<Object> underlying4 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying3);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), 42, underlying4);

    // Act
    Object actualValue = ofResult.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying2).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId5() {
    // Arrange
    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying13 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData underlying = new CombinedMarketData(underlying13, underlying2);
    ExtendedMarketData<Object> underlying3 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), 42, underlying3);

    // Act
    Object actualValue = ofResult.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying2).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId6() {
    // Arrange
    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying13 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData underlying3 = new CombinedMarketData(underlying13, underlying2);
    ExtendedMarketData<Object> underlying4 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying3);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), 42, underlying4);

    // Act
    Object actualValue = ofResult.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying2).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId7() {
    // Arrange
    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying22 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData underlying13 = new CombinedMarketData(underlying1, underlying22);

    CombinedMarketData underlying = new CombinedMarketData(underlying13, underlying2);
    ExtendedMarketData<Object> underlying3 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), 42, underlying3);

    // Act
    Object actualValue = ofResult.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying2).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId8() {
    // Arrange
    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying22 = ExtendedMarketData.of(id, "Value", underlying);

    CombinedMarketData underlying13 = new CombinedMarketData(underlying1, underlying22);

    CombinedMarketData underlying3 = new CombinedMarketData(underlying13, underlying2);
    ExtendedMarketData<Object> underlying4 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying3);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), 42, underlying4);

    // Act
    Object actualValue = ofResult.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying2).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId9() {
    // Arrange
    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying3 = ExtendedMarketData.of(id2, "Value", underlying);

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying3);

    CombinedMarketData underlying4 = new CombinedMarketData(underlying12, underlying2);
    ExtendedMarketData<Object> underlying5 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying4);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), 42, underlying5);

    // Act
    Object actualValue = ofResult.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying2).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId10() {
    // Arrange
    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> underlying1 =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));

    CombinedMarketData underlying = new CombinedMarketData(underlying1, underlying2);
    ExtendedMarketData<Object> underlying3 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), 42, underlying3);

    // Act
    Object actualValue = ofResult.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying2).getValuationDate();
    assertNull(actualValue);
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <ul>
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId_thenReturnValue() {
    // Arrange
    MarketData underlying1 = mock(MarketData.class);
    Optional<Object> ofResult = Optional.of("Value");
    when(underlying1.findValue(Mockito.<MarketDataId<Object>>any())).thenReturn(ofResult);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));
    ExtendedMarketData<Object> ofResult2 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);

    // Act
    Object actualValue = ofResult2.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying1).findValue(isA(MarketDataId.class));
    verify(underlying1).getValuationDate();
    assertEquals("Value", actualValue);
  }

  /**
   * Test {@link ExtendedMarketData#getValue(MarketDataId)} with {@code MarketDataId}.
   *
   * <ul>
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test getValue(MarketDataId) with 'MarketDataId'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedMarketData.getValue(MarketDataId)"})
  void testGetValueWithMarketDataId_thenReturnValue2() {
    // Arrange
    MarketData underlying1 = mock(MarketData.class);
    Optional<Object> ofResult = Optional.of("Value");
    when(underlying1.findValue(Mockito.<MarketDataId<Object>>any())).thenReturn(ofResult);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    MarketData underlying2 = mock(MarketData.class);
    when(underlying2.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    CombinedMarketData underlying = new CombinedMarketData(underlying12, underlying2);
    ExtendedMarketData<Object> underlying3 =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);
    ExtendedMarketData<Object> ofResult2 =
        ExtendedMarketData.of(mock(MarketDataId.class), 42, underlying3);

    // Act
    Object actualValue = ofResult2.getValue(mock(MarketDataId.class));

    // Assert
    verify(underlying1).findValue(isA(MarketDataId.class));
    verify(underlying2).getValuationDate();
    verify(underlying1, atLeast(1)).getValuationDate();
    assertEquals("Value", actualValue);
  }

  /**
   * Test {@link ExtendedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExtendedMarketData.findValue(MarketDataId)"})
  void testFindValue() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    Optional<Object> actualFindValueResult = ofResult.findValue(mock(MarketDataId.class));

    // Assert
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link ExtendedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExtendedMarketData.findValue(MarketDataId)"})
  void testFindValue2() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    Optional<Object> actualFindValueResult = ofResult.findValue(mock(MarketDataId.class));

    // Assert
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link ExtendedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExtendedMarketData.findValue(MarketDataId)"})
  void testFindValue3() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying2);

    // Act
    Optional<Object> actualFindValueResult = ofResult.findValue(mock(MarketDataId.class));

    // Assert
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link ExtendedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExtendedMarketData.findValue(MarketDataId)"})
  void testFindValue4() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData underlying = new CombinedMarketData(underlying1, underlying2);

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    Optional<Object> actualFindValueResult = ofResult.findValue(mock(MarketDataId.class));

    // Assert
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link ExtendedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExtendedMarketData.findValue(MarketDataId)"})
  void testFindValue5() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying3);

    // Act
    Optional<Object> actualFindValueResult = ofResult.findValue(mock(MarketDataId.class));

    // Assert
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link ExtendedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExtendedMarketData.findValue(MarketDataId)"})
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying2);

    // Act
    Optional<Object> actualFindValueResult = ofResult.findValue(mock(MarketDataId.class));

    // Assert
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link ExtendedMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExtendedMarketData.findValue(MarketDataId)"})
  void testFindValue7() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act
    Optional<Object> actualFindValueResult = ofResult.findValue(mock(MarketDataId.class));

    // Assert
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertEquals(1, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds2() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData underlying = new CombinedMarketData(underlying1, underlying2);

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertEquals(1, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds3() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying3);

    // Act and Assert
    assertEquals(2, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds4() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying2);

    // Act and Assert
    assertEquals(2, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds5() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act and Assert
    assertEquals(1, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds_givenJavaLangObject_thenCallsGetMarketDataType() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);

    // Act
    Set<MarketDataId<?>> actualIds = ofResult.getIds();

    // Assert
    verify(marketDataId).getMarketDataType();
    assertEquals(2, actualIds.size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); given 'java.lang.Object'; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds_givenJavaLangObject_thenReturnSizeIsThree() {
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
    CombinedMarketData underlying =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);

    // Act
    Set<MarketDataId<?>> actualIds = ofResult.getIds();

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertEquals(3, actualIds.size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is five.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsFive() {
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
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying4 =
        new CombinedMarketData(
            underlying14, ImmutableMarketData.of(valuationDate5, new HashMap<>()));

    ExtendedMarketData<Object> underlying15 = ExtendedMarketData.of(id2, "Value", underlying4);
    LocalDate valuationDate6 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying5 =
        new CombinedMarketData(
            underlying15, ImmutableMarketData.of(valuationDate6, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying5);

    // Act and Assert
    assertEquals(5, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsFour() {
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
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying3 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    ExtendedMarketData<Object> underlying14 = ExtendedMarketData.of(id2, "Value", underlying3);
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying4 =
        new CombinedMarketData(
            underlying14, ImmutableMarketData.of(valuationDate5, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying4);

    // Act and Assert
    assertEquals(4, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsOne() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertEquals(1, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is six.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsSix() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    MarketDataId<Object> id3 = mock(MarketDataId.class);
    MarketDataId<Object> id4 = mock(MarketDataId.class);
    MarketDataId<Object> id5 = mock(MarketDataId.class);
    MarketDataId<Object> id6 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id6, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying13 = ExtendedMarketData.of(id5, "Value", underlying2);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying3 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    ExtendedMarketData<Object> underlying14 = ExtendedMarketData.of(id4, "Value", underlying3);
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying4 =
        new CombinedMarketData(
            underlying14, ImmutableMarketData.of(valuationDate5, new HashMap<>()));

    ExtendedMarketData<Object> underlying15 = ExtendedMarketData.of(id3, "Value", underlying4);
    LocalDate valuationDate6 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying5 =
        new CombinedMarketData(
            underlying15, ImmutableMarketData.of(valuationDate6, new HashMap<>()));

    ExtendedMarketData<Object> underlying16 = ExtendedMarketData.of(id2, "Value", underlying5);
    LocalDate valuationDate7 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying6 =
        new CombinedMarketData(
            underlying16, ImmutableMarketData.of(valuationDate7, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying6);

    // Act and Assert
    assertEquals(6, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsThree() {
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
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying13 = ExtendedMarketData.of(id2, "Value", underlying2);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying3 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying3);

    // Act and Assert
    assertEquals(3, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getIds()"})
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying2);

    // Act and Assert
    assertEquals(2, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.findIds(MarketDataName)"})
  void testFindIds() {
    // Arrange
    MarketDataName<Object> marketDataName = mock(MarketDataName.class);
    when(marketDataName.getName()).thenReturn("Name");

    NamedMarketDataId<Object> id = mock(NamedMarketDataId.class);
    when(id.getMarketDataName()).thenReturn(marketDataName);
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("Name");

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult = ofResult.findIds(name);

    // Assert
    verify(marketDataName).getName();
    verify(name).getName();
    verify(id).getMarketDataName();
    assertEquals(1, actualFindIdsResult.size());
  }

  /**
   * Test {@link ExtendedMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.findIds(MarketDataName)"})
  void testFindIds2() {
    // Arrange
    MarketDataName<Object> marketDataName = mock(MarketDataName.class);
    when(marketDataName.getName()).thenReturn("Name");

    NamedMarketDataId<Object> id = mock(NamedMarketDataId.class);
    when(id.getMarketDataName()).thenReturn(marketDataName);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData underlying = new CombinedMarketData(underlying1, underlying2);

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("Name");

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult = ofResult.findIds(name);

    // Assert
    verify(marketDataName).getName();
    verify(name).getName();
    verify(id).getMarketDataName();
    assertEquals(1, actualFindIdsResult.size());
  }

  /**
   * Test {@link ExtendedMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.findIds(MarketDataName)"})
  void testFindIds3() {
    // Arrange
    MarketDataName<Object> marketDataName = mock(MarketDataName.class);
    when(marketDataName.getName()).thenReturn("Name");

    NamedMarketDataId<Object> id = mock(NamedMarketDataId.class);
    when(id.getMarketDataName()).thenReturn(marketDataName);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));

    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("Name");

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult = ofResult.findIds(name);

    // Assert
    verify(marketDataName).getName();
    verify(name).getName();
    verify(id).getMarketDataName();
    assertEquals(1, actualFindIdsResult.size());
  }

  /**
   * Test {@link ExtendedMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.findIds(MarketDataName)"})
  void testFindIds4() {
    // Arrange
    MarketDataName<Object> marketDataName = mock(MarketDataName.class);
    when(marketDataName.getName()).thenReturn("Name");

    NamedMarketDataId<Object> id = mock(NamedMarketDataId.class);
    when(id.getMarketDataName()).thenReturn(marketDataName);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id2, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying13 = ImmutableMarketData.of(valuationDate3, new HashMap<>());
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    CombinedMarketData underlying3 = new CombinedMarketData(underlying12, underlying2);

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying3);

    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("Name");

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult = ofResult.findIds(name);

    // Assert
    verify(marketDataName).getName();
    verify(name).getName();
    verify(id).getMarketDataName();
    assertEquals(1, actualFindIdsResult.size());
  }

  /**
   * Test {@link ExtendedMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.findIds(MarketDataName)"})
  void testFindIds5() {
    // Arrange
    NamedMarketDataId<Object> id = mock(NamedMarketDataId.class);
    when(id.getMarketDataName()).thenReturn(mock(MarketDataName.class));
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

    CombinedMarketData underlying13 = new CombinedMarketData(underlying1, underlying2);
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying3 =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying3);

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult = ofResult.findIds(null);

    // Assert
    verify(id).getMarketDataName();
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link ExtendedMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findIds(MarketDataName); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.findIds(MarketDataName)"})
  void testFindIds_givenJavaLangObject_thenCallsGetMarketDataType() {
    // Arrange
    MarketDataName<Object> marketDataName = mock(MarketDataName.class);
    when(marketDataName.getName()).thenReturn("Name");

    NamedMarketDataId<Object> id = mock(NamedMarketDataId.class);
    when(id.getMarketDataName()).thenReturn(marketDataName);

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("Name");

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult = ofResult.findIds(name);

    // Assert
    verify(marketDataId).getMarketDataType();
    verify(marketDataName).getName();
    verify(name).getName();
    verify(id).getMarketDataName();
    assertEquals(1, actualFindIdsResult.size());
  }

  /**
   * Test {@link ExtendedMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findIds(MarketDataName); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.findIds(MarketDataName)"})
  void testFindIds_givenJavaLangObject_thenCallsGetMarketDataType2() {
    // Arrange
    MarketDataName<Object> marketDataName = mock(MarketDataName.class);
    when(marketDataName.getName()).thenReturn("Name");

    NamedMarketDataId<Object> id = mock(NamedMarketDataId.class);
    when(id.getMarketDataName()).thenReturn(marketDataName);

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
    CombinedMarketData underlying =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("Name");

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult = ofResult.findIds(name);

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    verify(marketDataName).getName();
    verify(name).getName();
    verify(id).getMarketDataName();
    assertEquals(1, actualFindIdsResult.size());
  }

  /**
   * Test {@link ExtendedMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@link MarketDataName} {@link MarketDataName#getName()} return {@code foo}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findIds(MarketDataName); given MarketDataName getName() return 'foo'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.findIds(MarketDataName)"})
  void testFindIds_givenMarketDataNameGetNameReturnFoo_thenReturnEmpty() {
    // Arrange
    MarketDataName<Object> marketDataName = mock(MarketDataName.class);
    when(marketDataName.getName()).thenReturn("foo");

    NamedMarketDataId<Object> id = mock(NamedMarketDataId.class);
    when(id.getMarketDataName()).thenReturn(marketDataName);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("Name");

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult = ofResult.findIds(name);

    // Assert
    verify(marketDataName).getName();
    verify(name).getName();
    verify(id).getMarketDataName();
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link ExtendedMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@link MarketDataName} {@link MarketDataName#getName()} return {@code Name}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findIds(MarketDataName); given MarketDataName getName() return 'Name'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.findIds(MarketDataName)"})
  void testFindIds_givenMarketDataNameGetNameReturnName_thenReturnSizeIsOne() {
    // Arrange
    MarketDataName<Object> marketDataName = mock(MarketDataName.class);
    when(marketDataName.getName()).thenReturn("Name");

    NamedMarketDataId<Object> id = mock(NamedMarketDataId.class);
    when(id.getMarketDataName()).thenReturn(marketDataName);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("Name");

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult = ofResult.findIds(name);

    // Assert
    verify(marketDataName).getName();
    verify(name).getName();
    verify(id).getMarketDataName();
    assertEquals(1, actualFindIdsResult.size());
  }

  /**
   * Test {@link ExtendedMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>When {@link MarketDataName}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName); when MarketDataName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.findIds(MarketDataName)"})
  void testFindIds_whenMarketDataName() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult = ofResult.findIds(mock(MarketDataName.class));

    // Assert
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link ExtendedMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.findIds(MarketDataName)"})
  void testFindIds_whenNull_thenReturnEmpty() {
    // Arrange
    NamedMarketDataId<Object> id = mock(NamedMarketDataId.class);
    when(id.getMarketDataName()).thenReturn(mock(MarketDataName.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult = ofResult.findIds(null);

    // Assert
    verify(id).getMarketDataName();
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link ExtendedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertTrue(ofResult.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link ExtendedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds2() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertTrue(ofResult.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link ExtendedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds3() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying2);

    // Act and Assert
    assertTrue(ofResult.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link ExtendedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds4() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData underlying = new CombinedMarketData(underlying1, underlying2);

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertTrue(ofResult.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link ExtendedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds5() {
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying3);

    // Act and Assert
    assertTrue(ofResult.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link ExtendedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getTimeSeriesIds()"})
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

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying2);

    // Act and Assert
    assertTrue(ofResult.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link ExtendedMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ExtendedMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds7() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act and Assert
    assertTrue(ofResult.getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link ExtendedMarketData#getTimeSeries(ObservableId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName("Test getTimeSeries(ObservableId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries ExtendedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries() {
    // Arrange
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenReturn(true);

    MarketData underlying1 = mock(MarketData.class);
    when(underlying1.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);
    when(underlying1.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);

    // Act
    ofResult.getTimeSeries(new TestingObservableId("42"));

    // Assert
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(underlying1).getTimeSeries(isA(ObservableId.class));
    verify(underlying1).getValuationDate();
  }

  /**
   * Test {@link ExtendedMarketData#getTimeSeries(ObservableId)}.
   *
   * <p>Method under test: {@link ExtendedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName("Test getTimeSeries(ObservableId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries ExtendedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries2() {
    // Arrange
    MarketData underlying = mock(MarketData.class);
    when(underlying.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);

    // Act
    ofResult.getTimeSeries(new TestingObservableId("42"));

    // Assert
    verify(underlying).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link ExtendedMarketData#getTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Given {@link LocalDateDoubleTimeSeries} {@link LocalDateDoubleTimeSeries#isEmpty()}
   *       return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName(
      "Test getTimeSeries(ObservableId); given LocalDateDoubleTimeSeries isEmpty() return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries ExtendedMarketData.getTimeSeries(ObservableId)"})
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

    CombinedMarketData underlying = new CombinedMarketData(underlying1, underlying2);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);

    // Act
    ofResult.getTimeSeries(new TestingObservableId("42"));

    // Assert
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(underlying1).getTimeSeries(isA(ObservableId.class));
    verify(underlying1).getValuationDate();
    verify(underlying2).getValuationDate();
  }

  /**
   * Test {@link ExtendedMarketData#getTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Given {@link LocalDateDoubleTimeSeries} {@link LocalDateDoubleTimeSeries#isEmpty()}
   *       return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName(
      "Test getTimeSeries(ObservableId); given LocalDateDoubleTimeSeries isEmpty() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries ExtendedMarketData.getTimeSeries(ObservableId)"})
  void testGetTimeSeries_givenLocalDateDoubleTimeSeriesIsEmptyReturnTrue() {
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

    CombinedMarketData underlying = new CombinedMarketData(underlying1, underlying2);
    ExtendedMarketData<Object> ofResult =
        ExtendedMarketData.of(mock(MarketDataId.class), "Value", underlying);

    // Act
    ofResult.getTimeSeries(new TestingObservableId("42"));

    // Assert
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(underlying1).getTimeSeries(isA(ObservableId.class));
    verify(underlying2).getTimeSeries(isA(ObservableId.class));
    verify(underlying1).getValuationDate();
    verify(underlying2).getValuationDate();
  }

  /**
   * Test {@link ExtendedMarketData#meta()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean ExtendedMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    MetaBean actualMetaResult = ExtendedMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("id"));
    assertTrue(metaPropertyMapResult.containsKey("underlying"));
    assertTrue(metaPropertyMapResult.containsKey("value"));
    assertTrue(actualMetaResult.isBuildable());
    Class<ExtendedMarketData> expectedBeanTypeResult = ExtendedMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link ExtendedMarketData#metaBean()}.
   *
   * <p>Method under test: {@link ExtendedMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean ExtendedMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    TypedMetaBean<ExtendedMarketData<Object>> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("id"));
    assertTrue(metaPropertyMapResult.containsKey("underlying"));
    assertTrue(metaPropertyMapResult.containsKey("value"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<ExtendedMarketData> expectedBeanTypeResult = ExtendedMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExtendedMarketData#toString()}
   *   <li>{@link ExtendedMarketData#getId()}
   *   <li>{@link ExtendedMarketData#getUnderlying()}
   *   <li>{@link ExtendedMarketData#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataId ExtendedMarketData.getId()",
    "MarketData ExtendedMarketData.getUnderlying()",
    "Object ExtendedMarketData.getValue()",
    "String ExtendedMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    ofResult.toString();
    ofResult.getId();
    MarketData actualUnderlying = ofResult.getUnderlying();

    // Assert
    assertEquals("Value", ofResult.getValue());
    assertSame(underlying, actualUnderlying);
  }

  /**
   * Test {@link ExtendedMarketData#equals(Object)}, and {@link ExtendedMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExtendedMarketData#equals(Object)}
   *   <li>{@link ExtendedMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtendedMarketData.equals(Object)",
    "int ExtendedMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link ExtendedMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtendedMarketData.equals(Object)",
    "int ExtendedMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate3, new HashMap<>());
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    ExtendedMarketData<Object> ofResult2 = ExtendedMarketData.of(id2, "Value", underlying2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link ExtendedMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtendedMarketData.equals(Object)",
    "int ExtendedMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link ExtendedMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ExtendedMarketData.equals(Object)",
    "int ExtendedMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> ofResult = ExtendedMarketData.of(id, "Value", underlying);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to ExtendedMarketData");
  }
}
