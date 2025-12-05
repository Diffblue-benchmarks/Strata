package com.opengamma.strata.collect.timeseries;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.timeseries.SparseLocalDateDoubleTimeSeries.Meta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SparseLocalDateDoubleTimeSeriesDiffblueTest {
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
    Class<? extends SparseLocalDateDoubleTimeSeries> actualBeanTypeResult =
        SparseLocalDateDoubleTimeSeries.meta().beanType();

    // Assert
    Class<SparseLocalDateDoubleTimeSeries> expectedBeanTypeResult =
        SparseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#dates()}
   *   <li>{@link Meta#values()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.dates()", "MetaProperty Meta.values()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SparseLocalDateDoubleTimeSeries.meta();

    // Act
    MetaProperty<LocalDate[]> actualDatesResult = metaResult.dates();

    // Assert
    assertTrue(actualDatesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.values() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dates}.
   *   <li>Then metaBean values return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'dates'; then metaBean values return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDates_thenMetaBeanValuesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SparseLocalDateDoubleTimeSeries.meta().metaPropertyGet("dates");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<double[]> valuesResult = ((Meta) metaBeanResult).values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("[D", valuesResult.propertyType().getName());
    assertEquals("[Ljava.time.LocalDate;", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("dates", actualMetaPropertyGetResult.name());
    assertEquals("values", valuesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valuesResult.style());
    Class<SparseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult =
        SparseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult, valuesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dates());
    assertSame(Meta.INSTANCE, valuesResult.metaBean());
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
    assertNull(SparseLocalDateDoubleTimeSeries.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then metaBean dates return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'values'; then metaBean dates return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValues_thenMetaBeanDatesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SparseLocalDateDoubleTimeSeries.meta().metaPropertyGet("values");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate[]> datesResult = ((Meta) metaBeanResult).dates();
    assertTrue(datesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("[D", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("[Ljava.time.LocalDate;", datesResult.propertyType().getName());
    assertEquals("dates", datesResult.name());
    assertEquals("values", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, datesResult.style());
    Class<SparseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult =
        SparseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult, datesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).values());
    assertSame(Meta.INSTANCE, datesResult.metaBean());
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
        SparseLocalDateDoubleTimeSeries.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("dates");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("values");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("[D", getResult2.propertyType().getName());
    assertEquals("[Ljava.time.LocalDate;", getResult.propertyType().getName());
    assertEquals("dates", getResult.name());
    assertEquals("values", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<SparseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult =
        SparseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<SparseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult2 =
        SparseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
        SparseLocalDateDoubleTimeSeries.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> SparseLocalDateDoubleTimeSeries.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dates}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dates'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDates_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SparseLocalDateDoubleTimeSeries.meta()
                .propertySet(mock(Bean.class), "dates", "New Value", true));
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
            SparseLocalDateDoubleTimeSeries.meta()
                .propertySet(mock(Bean.class), "dates", "New Value", false));
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
            SparseLocalDateDoubleTimeSeries.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'values'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValues_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SparseLocalDateDoubleTimeSeries.meta()
                .propertySet(mock(Bean.class), "values", "New Value", true));
  }

  /**
   * Test {@link SparseLocalDateDoubleTimeSeries#of(Collection, Collection)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add ten.
   *   <li>Then return EarliestDate toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link SparseLocalDateDoubleTimeSeries#of(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test of(Collection, Collection); given ten; when LinkedHashSet() add ten; then return EarliestDate toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SparseLocalDateDoubleTimeSeries SparseLocalDateDoubleTimeSeries.of(Collection, Collection)"
  })
  void testOf_givenTen_whenLinkedHashSetAddTen_thenReturnEarliestDateToStringIs19700101() {
    // Arrange
    LinkedHashSet<LocalDate> dates = new LinkedHashSet<>();
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    dates.add(ofResult);

    LinkedHashSet<Double> values = new LinkedHashSet<>();
    values.add(10.0d);

    // Act
    SparseLocalDateDoubleTimeSeries actualOfResult =
        SparseLocalDateDoubleTimeSeries.of(dates, values);

    // Assert
    LocalDate earliestDate = actualOfResult.getEarliestDate();
    assertEquals("1970-01-01", earliestDate.toString());
    assertEquals(1, actualOfResult.size());
    assertEquals(10.0d, actualOfResult.getEarliestValue());
    assertEquals(10.0d, actualOfResult.getLatestValue());
    assertFalse(actualOfResult.isEmpty());
    assertSame(ofResult, earliestDate);
    assertSame(ofResult, actualOfResult.getLatestDate());
  }

  /**
   * Test {@link SparseLocalDateDoubleTimeSeries#of(Collection, Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SparseLocalDateDoubleTimeSeries#of(Collection, Collection)}
   */
  @Test
  @DisplayName("Test of(Collection, Collection); when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SparseLocalDateDoubleTimeSeries SparseLocalDateDoubleTimeSeries.of(Collection, Collection)"
  })
  void testOf_whenArrayList_thenReturnSizeIsZero() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();

    // Act
    SparseLocalDateDoubleTimeSeries actualOfResult =
        SparseLocalDateDoubleTimeSeries.of(dates, new ArrayList<>());

    // Assert
    assertEquals(0, actualOfResult.size());
    assertTrue(actualOfResult.isEmpty());
  }

  /**
   * Test {@link SparseLocalDateDoubleTimeSeries#meta()}.
   *
   * <p>Method under test: {@link SparseLocalDateDoubleTimeSeries#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SparseLocalDateDoubleTimeSeries.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SparseLocalDateDoubleTimeSeries.meta();

    // Assert
    MetaProperty<LocalDate[]> datesResult = actualMetaResult.dates();
    assertTrue(datesResult instanceof DirectMetaProperty);
    MetaProperty<double[]> valuesResult = actualMetaResult.values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("[D", valuesResult.propertyType().getName());
    assertEquals("[Ljava.time.LocalDate;", datesResult.propertyType().getName());
    assertEquals("dates", datesResult.name());
    assertEquals("values", valuesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, datesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valuesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<SparseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult =
        SparseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult, datesResult.declaringType());
    Class<SparseLocalDateDoubleTimeSeries> expectedDeclaringTypeResult2 =
        SparseLocalDateDoubleTimeSeries.class;
    assertEquals(expectedDeclaringTypeResult2, valuesResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, datesResult.metaBean());
    assertSame(meta, valuesResult.metaBean());
  }
}
