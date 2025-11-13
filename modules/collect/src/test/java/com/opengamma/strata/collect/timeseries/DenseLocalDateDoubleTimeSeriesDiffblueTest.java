package com.opengamma.strata.collect.timeseries;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.timeseries.DenseLocalDateDoubleTimeSeries.DenseTimeSeriesCalculation;
import com.opengamma.strata.collect.timeseries.DenseLocalDateDoubleTimeSeries.Meta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DenseLocalDateDoubleTimeSeriesDiffblueTest {
  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends DenseLocalDateDoubleTimeSeries> actualBeanTypeResult =
        DenseLocalDateDoubleTimeSeries.meta().beanType();

    // Assert
    Class<DenseLocalDateDoubleTimeSeries> expectedBeanTypeResult =
        DenseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#dateCalculation()}
   *   <li>{@link Meta#points()}
   *   <li>{@link Meta#startDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.dateCalculation()",
    "MetaProperty Meta.points()",
    "MetaProperty Meta.startDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = DenseLocalDateDoubleTimeSeries.meta();

    // Act
    MetaProperty<DenseTimeSeriesCalculation> actualDateCalculationResult =
        metaResult.dateCalculation();
    MetaProperty<double[]> actualPointsResult = metaResult.points();

    // Assert
    assertTrue(actualDateCalculationResult instanceof DirectMetaProperty);
    assertTrue(actualPointsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.startDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dateCalculation}.
   *   <li>Then return name is {@code dateCalculation}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'dateCalculation'; then return name is 'dateCalculation'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDateCalculation_thenReturnNameIsDateCalculation() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DenseLocalDateDoubleTimeSeries.meta().metaPropertyGet("dateCalculation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<double[]> pointsResult = ((Meta) metaBeanResult).points();
    assertTrue(pointsResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    assertEquals("dateCalculation", actualMetaPropertyGetResult.name());
    Class<DenseTimeSeriesCalculation> expectedPropertyTypeResult = DenseTimeSeriesCalculation.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dateCalculation());
    assertSame(metaBeanResult, pointsResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code points}.
   *   <li>Then return propertyType Name is {@code [D}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'points'; then return propertyType Name is '[D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPoints_thenReturnPropertyTypeNameIsD() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DenseLocalDateDoubleTimeSeries.meta().metaPropertyGet("points");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DenseTimeSeriesCalculation> dateCalculationResult =
        ((Meta) metaBeanResult).dateCalculation();
    assertTrue(dateCalculationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    assertEquals("[D", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("points", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).points());
    assertSame(metaBeanResult, dateCalculationResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(DenseLocalDateDoubleTimeSeries.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then return name is {@code startDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'startDate'; then return name is 'startDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStartDate_thenReturnNameIsStartDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DenseLocalDateDoubleTimeSeries.meta().metaPropertyGet("startDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DenseTimeSeriesCalculation> dateCalculationResult =
        ((Meta) metaBeanResult).dateCalculation();
    assertTrue(dateCalculationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<double[]> pointsResult = ((Meta) metaBeanResult).points();
    assertTrue(pointsResult instanceof DirectMetaProperty);
    assertEquals("startDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startDate());
    assertSame(metaBeanResult, dateCalculationResult.metaBean());
    assertSame(metaBeanResult, pointsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        DenseLocalDateDoubleTimeSeries.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("startDate");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("dateCalculation");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("points");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("[D", getResult3.propertyType().getName());
    assertEquals("dateCalculation", getResult2.name());
    assertEquals("points", getResult3.name());
    assertEquals("startDate", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<DenseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult =
        DenseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<DenseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult2 =
        DenseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<DenseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult3 =
        DenseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<DenseTimeSeriesCalculation> expectedPropertyTypeResult = DenseTimeSeriesCalculation.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        DenseLocalDateDoubleTimeSeries.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> DenseLocalDateDoubleTimeSeries.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dateCalculation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dateCalculation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDateCalculation_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DenseLocalDateDoubleTimeSeries.meta()
                .propertySet(mock(Bean.class), "dateCalculation", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            DenseLocalDateDoubleTimeSeries.meta()
                .propertySet(mock(Bean.class), "dateCalculation", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code points}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'points'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPoints_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DenseLocalDateDoubleTimeSeries.meta()
                .propertySet(mock(Bean.class), "points", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            DenseLocalDateDoubleTimeSeries.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'startDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStartDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DenseLocalDateDoubleTimeSeries.meta()
                .propertySet(mock(Bean.class), "startDate", "New Value", true));
  }

  /**
   * Test {@link DenseLocalDateDoubleTimeSeries#of(LocalDate, LocalDate, Stream,
   * DenseTimeSeriesCalculation)}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DenseLocalDateDoubleTimeSeries#of(LocalDate, LocalDate, Stream,
   * DenseTimeSeriesCalculation)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate, Stream, DenseTimeSeriesCalculation); given LocalDate with '1970' and one and one; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeries DenseLocalDateDoubleTimeSeries.of(LocalDate, LocalDate, Stream, DenseTimeSeriesCalculation)"
  })
  void testOf_givenLocalDateWith1970AndOneAndOne_thenReturnSizeIsOne() {
    // Arrange
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    localDateDoublePointList.add(LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), Double.NaN));
    Stream<LocalDateDoublePoint> values = localDateDoublePointList.stream();

    // Act
    LocalDateDoubleTimeSeries actualOfResult =
        DenseLocalDateDoubleTimeSeries.of(
            startDate, endDate, values, DenseTimeSeriesCalculation.SKIP_WEEKENDS);

    // Assert
    assertTrue(actualOfResult instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, actualOfResult.size());
    assertSame(startDate, ((DenseLocalDateDoubleTimeSeries) actualOfResult).getStartDate());
  }

  /**
   * Test {@link DenseLocalDateDoubleTimeSeries#of(LocalDate, LocalDate, Stream,
   * DenseTimeSeriesCalculation)}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DenseLocalDateDoubleTimeSeries#of(LocalDate, LocalDate, Stream,
   * DenseTimeSeriesCalculation)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate, Stream, DenseTimeSeriesCalculation); given LocalDate with '1970' and one and one; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeries DenseLocalDateDoubleTimeSeries.of(LocalDate, LocalDate, Stream, DenseTimeSeriesCalculation)"
  })
  void testOf_givenLocalDateWith1970AndOneAndOne_thenReturnSizeIsOne2() {
    // Arrange
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    localDateDoublePointList.add(LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), Double.NaN));
    Stream<LocalDateDoublePoint> values = localDateDoublePointList.stream();

    // Act
    LocalDateDoubleTimeSeries actualOfResult =
        DenseLocalDateDoubleTimeSeries.of(
            startDate, endDate, values, DenseTimeSeriesCalculation.INCLUDE_WEEKENDS);

    // Assert
    assertTrue(actualOfResult instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, actualOfResult.size());
    assertSame(startDate, ((DenseLocalDateDoubleTimeSeries) actualOfResult).getStartDate());
  }

  /**
   * Test {@link DenseLocalDateDoubleTimeSeries#of(LocalDate, LocalDate, Stream,
   * DenseTimeSeriesCalculation)}.
   *
   * <ul>
   *   <li>When {@code INCLUDE_WEEKENDS}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DenseLocalDateDoubleTimeSeries#of(LocalDate, LocalDate, Stream,
   * DenseTimeSeriesCalculation)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate, Stream, DenseTimeSeriesCalculation); when 'INCLUDE_WEEKENDS'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeries DenseLocalDateDoubleTimeSeries.of(LocalDate, LocalDate, Stream, DenseTimeSeriesCalculation)"
  })
  void testOf_whenIncludeWeekends_thenReturnSizeIsZero() {
    // Arrange
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    Stream<LocalDateDoublePoint> values = localDateDoublePointList.stream();

    // Act
    LocalDateDoubleTimeSeries actualOfResult =
        DenseLocalDateDoubleTimeSeries.of(
            startDate, endDate, values, DenseTimeSeriesCalculation.INCLUDE_WEEKENDS);

    // Assert
    assertTrue(actualOfResult instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(0, actualOfResult.size());
    assertSame(startDate, ((DenseLocalDateDoubleTimeSeries) actualOfResult).getStartDate());
  }

  /**
   * Test {@link DenseLocalDateDoubleTimeSeries#of(LocalDate, LocalDate, Stream,
   * DenseTimeSeriesCalculation)}.
   *
   * <ul>
   *   <li>When now.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DenseLocalDateDoubleTimeSeries#of(LocalDate, LocalDate, Stream,
   * DenseTimeSeriesCalculation)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate, Stream, DenseTimeSeriesCalculation); when now; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeries DenseLocalDateDoubleTimeSeries.of(LocalDate, LocalDate, Stream, DenseTimeSeriesCalculation)"
  })
  void testOf_whenNow_thenReturnSizeIsZero() {
    // Arrange
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.now();

    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    Stream<LocalDateDoublePoint> values = localDateDoublePointList.stream();

    // Act
    LocalDateDoubleTimeSeries actualOfResult =
        DenseLocalDateDoubleTimeSeries.of(
            startDate, endDate, values, DenseTimeSeriesCalculation.SKIP_WEEKENDS);

    // Assert
    assertTrue(actualOfResult instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(0, actualOfResult.size());
    assertSame(startDate, ((DenseLocalDateDoubleTimeSeries) actualOfResult).getStartDate());
  }

  /**
   * Test {@link DenseLocalDateDoubleTimeSeries#of(LocalDate, LocalDate, Stream,
   * DenseTimeSeriesCalculation)}.
   *
   * <ul>
   *   <li>When {@code SKIP_WEEKENDS}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DenseLocalDateDoubleTimeSeries#of(LocalDate, LocalDate, Stream,
   * DenseTimeSeriesCalculation)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate, Stream, DenseTimeSeriesCalculation); when 'SKIP_WEEKENDS'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeries DenseLocalDateDoubleTimeSeries.of(LocalDate, LocalDate, Stream, DenseTimeSeriesCalculation)"
  })
  void testOf_whenSkipWeekends_thenReturnSizeIsZero() {
    // Arrange
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    Stream<LocalDateDoublePoint> values = localDateDoublePointList.stream();

    // Act
    LocalDateDoubleTimeSeries actualOfResult =
        DenseLocalDateDoubleTimeSeries.of(
            startDate, endDate, values, DenseTimeSeriesCalculation.SKIP_WEEKENDS);

    // Assert
    assertTrue(actualOfResult instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(0, actualOfResult.size());
    assertSame(startDate, ((DenseLocalDateDoubleTimeSeries) actualOfResult).getStartDate());
  }

  /**
   * Test {@link DenseLocalDateDoubleTimeSeries#meta()}.
   *
   * <p>Method under test: {@link DenseLocalDateDoubleTimeSeries#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DenseLocalDateDoubleTimeSeries.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DenseLocalDateDoubleTimeSeries.meta();

    // Assert
    MetaProperty<DenseTimeSeriesCalculation> dateCalculationResult =
        actualMetaResult.dateCalculation();
    assertTrue(dateCalculationResult instanceof DirectMetaProperty);
    MetaProperty<double[]> pointsResult = actualMetaResult.points();
    assertTrue(pointsResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = actualMetaResult.startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    assertEquals("[D", pointsResult.propertyType().getName());
    assertEquals("dateCalculation", dateCalculationResult.name());
    assertEquals("points", pointsResult.name());
    assertEquals("startDate", startDateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dateCalculationResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, pointsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, startDateResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DenseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult =
        DenseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult, dateCalculationResult.declaringType());
    Class<DenseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult2 =
        DenseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult2, pointsResult.declaringType());
    Class<DenseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult3 =
        DenseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult3, startDateResult.declaringType());
    Class<DenseTimeSeriesCalculation> expectedPropertyTypeResult = DenseTimeSeriesCalculation.class;
    assertEquals(expectedPropertyTypeResult, dateCalculationResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, startDateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, dateCalculationResult.metaBean());
    assertSame(meta, pointsResult.metaBean());
    assertSame(meta, startDateResult.metaBean());
  }
}
