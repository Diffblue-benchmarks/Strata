package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ImmutableReferenceData;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.direct.MinimalMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HolidaySafeReferenceDataDiffblueTest {
  /**
   * Test {@link HolidaySafeReferenceData#containsValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@link ReferenceData} {@link ReferenceData#queryValueOrNull(ReferenceDataId)}
   *       return {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#containsValue(ReferenceDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(ReferenceDataId); given ReferenceData queryValueOrNull(ReferenceDataId) return FRI_SAT; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidaySafeReferenceData.containsValue(ReferenceDataId)"})
  void testContainsValue_givenReferenceDataQueryValueOrNullReturnFri_sat_thenReturnTrue() {
    // Arrange
    ReferenceData underlying = mock(ReferenceData.class);
    when(underlying.queryValueOrNull(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    boolean actualContainsValueResult =
        new HolidaySafeReferenceData(underlying).containsValue(HolidayCalendarIds.AUSY);

    // Assert
    verify(underlying).queryValueOrNull(isA(ReferenceDataId.class));
    assertTrue(actualContainsValueResult);
  }

  /**
   * Test {@link HolidaySafeReferenceData#containsValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@link ReferenceData} {@link ReferenceData#queryValueOrNull(ReferenceDataId)}
   *       return {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#containsValue(ReferenceDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(ReferenceDataId); given ReferenceData queryValueOrNull(ReferenceDataId) return 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidaySafeReferenceData.containsValue(ReferenceDataId)"})
  void testContainsValue_givenReferenceDataQueryValueOrNullReturnNull_thenReturnTrue() {
    // Arrange
    ReferenceData underlying = mock(ReferenceData.class);
    when(underlying.queryValueOrNull(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(null);

    // Act
    boolean actualContainsValueResult =
        new HolidaySafeReferenceData(underlying).containsValue(HolidayCalendarIds.AUSY);

    // Assert
    verify(underlying).queryValueOrNull(isA(ReferenceDataId.class));
    assertTrue(actualContainsValueResult);
  }

  /**
   * Test {@link HolidaySafeReferenceData#containsValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>When {@link ReferenceDataId}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#containsValue(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test containsValue(ReferenceDataId); when ReferenceDataId; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidaySafeReferenceData.containsValue(ReferenceDataId)"})
  void testContainsValue_whenReferenceDataId_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(
        new HolidaySafeReferenceData(mock(ReferenceData.class))
            .containsValue(mock(ReferenceDataId.class)));
  }

  /**
   * Test {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}.
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData HolidaySafeReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith() {
    // Arrange
    ImmutableReferenceData underlying = ImmutableReferenceData.empty();
    HolidaySafeReferenceData holidaySafeReferenceData = new HolidaySafeReferenceData(underlying);
    HolidaySafeReferenceData underlying2 = new HolidaySafeReferenceData(mock(ReferenceData.class));
    HolidaySafeReferenceData other = new HolidaySafeReferenceData(underlying2);

    // Act
    ReferenceData actualCombinedWithResult = holidaySafeReferenceData.combinedWith(other);
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    ReferenceData underlying3 = holidaySafeReferenceData.getUnderlying();
    assertTrue(underlying3 instanceof ImmutableReferenceData);
    assertTrue(actualCombinedWithResult instanceof HolidaySafeReferenceData);
    ReferenceData underlying4 = other.getUnderlying();
    assertTrue(underlying4 instanceof HolidaySafeReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertTrue(((ImmutableReferenceData) underlying3).getValues().isEmpty());
    assertSame(underlying2, underlying4);
    assertSame(underlying, underlying3);
  }

  /**
   * Test {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}.
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData HolidaySafeReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith2() {
    // Arrange
    ImmutableReferenceData underlying = ImmutableReferenceData.empty();
    HolidaySafeReferenceData holidaySafeReferenceData = new HolidaySafeReferenceData(underlying);

    // Act
    ReferenceData actualCombinedWithResult =
        holidaySafeReferenceData.combinedWith(
            new HolidaySafeReferenceData(mock(ReferenceData.class)));
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    ReferenceData underlying2 = holidaySafeReferenceData.getUnderlying();
    assertTrue(underlying2 instanceof ImmutableReferenceData);
    assertTrue(actualCombinedWithResult instanceof HolidaySafeReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertTrue(((ImmutableReferenceData) underlying2).getValues().isEmpty());
    assertSame(underlying, underlying2);
  }

  /**
   * Test {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then calls {@link ReferenceData#combinedWith(ReferenceData)}.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData); then calls combinedWith(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData HolidaySafeReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenCallsCombinedWith() {
    // Arrange
    ReferenceData underlying = mock(ReferenceData.class);
    when(underlying.combinedWith(Mockito.<ReferenceData>any()))
        .thenReturn(mock(ReferenceData.class));

    // Act
    ReferenceData actualCombinedWithResult =
        new HolidaySafeReferenceData(underlying).combinedWith(mock(ReferenceData.class));

    // Assert
    verify(underlying).combinedWith(isA(ReferenceData.class));
    assertTrue(actualCombinedWithResult instanceof HolidaySafeReferenceData);
  }

  /**
   * Test {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then calls {@link ReferenceData#combinedWith(ReferenceData)}.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData); then calls combinedWith(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData HolidaySafeReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenCallsCombinedWith2() {
    // Arrange
    ReferenceData underlying = mock(ReferenceData.class);
    when(underlying.combinedWith(Mockito.<ReferenceData>any()))
        .thenReturn(mock(ReferenceData.class));

    // Act
    ReferenceData actualCombinedWithResult =
        new HolidaySafeReferenceData(underlying).combinedWith(mock(ReferenceData.class));
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    verify(underlying).combinedWith(isA(ReferenceData.class));
    assertTrue(actualCombinedWithResult instanceof HolidaySafeReferenceData);
    assertNull(actualQueryValueOrNullResult);
  }

  /**
   * Test {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then {@link HolidaySafeReferenceData#HolidaySafeReferenceData(ReferenceData)} with
   *       underlying is empty.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ReferenceData); then HolidaySafeReferenceData(ReferenceData) with underlying is empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData HolidaySafeReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenHolidaySafeReferenceDataWithUnderlyingIsEmpty() {
    // Arrange
    HolidaySafeReferenceData holidaySafeReferenceData =
        new HolidaySafeReferenceData(ImmutableReferenceData.empty());
    HolidaySafeReferenceData other = new HolidaySafeReferenceData(ImmutableReferenceData.empty());

    // Act
    ReferenceData actualCombinedWithResult = holidaySafeReferenceData.combinedWith(other);
    Object actualQueryValueOrNullResult = actualCombinedWithResult.queryValueOrNull(null);

    // Assert
    assertTrue(actualCombinedWithResult instanceof HolidaySafeReferenceData);
    assertNull(null);
    assertNull(actualQueryValueOrNullResult);
    assertEquals(holidaySafeReferenceData, other);
  }

  /**
   * Test {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return {@link HolidaySafeReferenceData#HolidaySafeReferenceData(ReferenceData)} with
   *       underlying is empty.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ReferenceData); then return HolidaySafeReferenceData(ReferenceData) with underlying is empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData HolidaySafeReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenReturnHolidaySafeReferenceDataWithUnderlyingIsEmpty() {
    // Arrange
    HolidaySafeReferenceData holidaySafeReferenceData =
        new HolidaySafeReferenceData(ImmutableReferenceData.empty());
    ImmutableReferenceData other = ImmutableReferenceData.empty();

    // Act
    ReferenceData actualCombinedWithResult = holidaySafeReferenceData.combinedWith(other);
    Object actualQueryValueOrNullResult = actualCombinedWithResult.queryValueOrNull(null);

    // Assert
    assertTrue(actualCombinedWithResult instanceof HolidaySafeReferenceData);
    assertNull(null);
    assertNull(actualQueryValueOrNullResult);
    assertEquals(holidaySafeReferenceData, actualCombinedWithResult);
    assertSame(other, holidaySafeReferenceData.getUnderlying());
  }

  /**
   * Test {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return queryValueOrNull {@code null} is {@code Query Value Or Null}.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ReferenceData); then return queryValueOrNull 'null' is 'Query Value Or Null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData HolidaySafeReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenReturnQueryValueOrNullNullIsQueryValueOrNull() {
    // Arrange
    ImmutableReferenceData underlying = ImmutableReferenceData.empty();
    HolidaySafeReferenceData holidaySafeReferenceData = new HolidaySafeReferenceData(underlying);

    ReferenceData underlying2 = mock(ReferenceData.class);
    when(underlying2.queryValueOrNull(Mockito.<ReferenceDataId<Object>>any()))
        .thenReturn("Query Value Or Null");
    HolidaySafeReferenceData underlying3 = new HolidaySafeReferenceData(underlying2);
    HolidaySafeReferenceData other = new HolidaySafeReferenceData(underlying3);

    // Act
    ReferenceData actualCombinedWithResult = holidaySafeReferenceData.combinedWith(other);
    Object actualQueryValueOrNullResult = actualCombinedWithResult.queryValueOrNull(null);

    // Assert
    verify(underlying2).queryValueOrNull(isNull());
    ReferenceData underlying4 = holidaySafeReferenceData.getUnderlying();
    assertTrue(underlying4 instanceof ImmutableReferenceData);
    assertTrue(actualCombinedWithResult instanceof HolidaySafeReferenceData);
    ReferenceData underlying5 = other.getUnderlying();
    assertTrue(underlying5 instanceof HolidaySafeReferenceData);
    assertEquals("Query Value Or Null", actualQueryValueOrNullResult);
    assertNull(null);
    assertTrue(((ImmutableReferenceData) underlying4).getValues().isEmpty());
    assertSame(underlying3, underlying5);
    assertSame(underlying, underlying4);
  }

  /**
   * Test {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then Underlying return {@link HolidaySafeReferenceData}.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData); then Underlying return HolidaySafeReferenceData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData HolidaySafeReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenUnderlyingReturnHolidaySafeReferenceData() {
    // Arrange
    ReferenceData underlying = mock(ReferenceData.class);
    when(underlying.combinedWith(Mockito.<ReferenceData>any()))
        .thenReturn(mock(ReferenceData.class));
    HolidaySafeReferenceData underlying2 = new HolidaySafeReferenceData(underlying);
    HolidaySafeReferenceData holidaySafeReferenceData = new HolidaySafeReferenceData(underlying2);

    // Act
    ReferenceData actualCombinedWithResult =
        holidaySafeReferenceData.combinedWith(
            new HolidaySafeReferenceData(mock(ReferenceData.class)));
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    verify(underlying).combinedWith(isA(ReferenceData.class));
    assertTrue(actualCombinedWithResult instanceof HolidaySafeReferenceData);
    ReferenceData underlying3 = holidaySafeReferenceData.getUnderlying();
    assertTrue(underlying3 instanceof HolidaySafeReferenceData);
    assertTrue(
        ((HolidaySafeReferenceData) actualCombinedWithResult).getUnderlying()
            instanceof HolidaySafeReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertSame(underlying2, underlying3);
  }

  /**
   * Test {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>When {@link ReferenceData}.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData); when ReferenceData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData HolidaySafeReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_whenReferenceData() {
    // Arrange
    ImmutableReferenceData underlying = ImmutableReferenceData.empty();
    HolidaySafeReferenceData holidaySafeReferenceData = new HolidaySafeReferenceData(underlying);

    // Act
    ReferenceData actualCombinedWithResult =
        holidaySafeReferenceData.combinedWith(mock(ReferenceData.class));
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    ReferenceData underlying2 = holidaySafeReferenceData.getUnderlying();
    assertTrue(underlying2 instanceof ImmutableReferenceData);
    assertTrue(actualCombinedWithResult instanceof HolidaySafeReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertTrue(((ImmutableReferenceData) underlying2).getValues().isEmpty());
    assertSame(underlying, underlying2);
  }

  /**
   * Test {@link HolidaySafeReferenceData#meta()}.
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean HolidaySafeReferenceData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<HolidaySafeReferenceData> actualMetaResult = HolidaySafeReferenceData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof MinimalMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("underlying"));
    assertTrue(actualMetaResult.isBuildable());
    Class<HolidaySafeReferenceData> expectedBeanTypeResult = HolidaySafeReferenceData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link HolidaySafeReferenceData#HolidaySafeReferenceData(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return Underlying is {@link ReferenceData}.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#HolidaySafeReferenceData(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test new HolidaySafeReferenceData(ReferenceData); then return Underlying is ReferenceData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HolidaySafeReferenceData.<init>(ReferenceData)"})
  void testNewHolidaySafeReferenceData_thenReturnUnderlyingIsReferenceData() {
    // Arrange
    ReferenceData underlying = mock(ReferenceData.class);

    // Act and Assert
    assertSame(underlying, new HolidaySafeReferenceData(underlying).getUnderlying());
  }

  /**
   * Test {@link HolidaySafeReferenceData#metaBean()}.
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean HolidaySafeReferenceData.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<HolidaySafeReferenceData> actualMetaBeanResult =
        new HolidaySafeReferenceData(mock(ReferenceData.class)).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof MinimalMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("underlying"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<HolidaySafeReferenceData> expectedBeanTypeResult = HolidaySafeReferenceData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link HolidaySafeReferenceData#equals(Object)}, and {@link
   * HolidaySafeReferenceData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HolidaySafeReferenceData#equals(Object)}
   *   <li>{@link HolidaySafeReferenceData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HolidaySafeReferenceData.equals(Object)",
    "int HolidaySafeReferenceData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HolidaySafeReferenceData holidaySafeReferenceData =
        new HolidaySafeReferenceData(mock(ReferenceData.class));

    // Act and Assert
    assertEquals(holidaySafeReferenceData, holidaySafeReferenceData);
    int expectedHashCodeResult = holidaySafeReferenceData.hashCode();
    assertEquals(expectedHashCodeResult, holidaySafeReferenceData.hashCode());
  }

  /**
   * Test {@link HolidaySafeReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HolidaySafeReferenceData.equals(Object)",
    "int HolidaySafeReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HolidaySafeReferenceData holidaySafeReferenceData =
        new HolidaySafeReferenceData(mock(ReferenceData.class));

    // Act and Assert
    assertNotEquals(
        holidaySafeReferenceData, new HolidaySafeReferenceData(mock(ReferenceData.class)));
  }

  /**
   * Test {@link HolidaySafeReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HolidaySafeReferenceData.equals(Object)",
    "int HolidaySafeReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HolidaySafeReferenceData underlying = new HolidaySafeReferenceData(mock(ReferenceData.class));
    HolidaySafeReferenceData holidaySafeReferenceData = new HolidaySafeReferenceData(underlying);

    // Act and Assert
    assertNotEquals(
        holidaySafeReferenceData, new HolidaySafeReferenceData(mock(ReferenceData.class)));
  }

  /**
   * Test {@link HolidaySafeReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HolidaySafeReferenceData.equals(Object)",
    "int HolidaySafeReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new HolidaySafeReferenceData(mock(ReferenceData.class)), null);
  }

  /**
   * Test {@link HolidaySafeReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HolidaySafeReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HolidaySafeReferenceData.equals(Object)",
    "int HolidaySafeReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new HolidaySafeReferenceData(mock(ReferenceData.class)),
        "Different type to HolidaySafeReferenceData");
  }
}
