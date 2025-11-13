package com.opengamma.strata.product.rate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.basics.index.IborIndexObservation;
import com.opengamma.strata.product.rate.IborInterpolatedRateComputation.Meta;
import java.time.LocalDate;
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
import org.mockito.Mockito;

class IborInterpolatedRateComputationDiffblueTest {
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
    Class<? extends IborInterpolatedRateComputation> actualBeanTypeResult =
        IborInterpolatedRateComputation.meta().beanType();

    // Assert
    Class<IborInterpolatedRateComputation> expectedBeanTypeResult =
        IborInterpolatedRateComputation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#longObservation()}
   *   <li>{@link Meta#shortObservation()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.longObservation()", "MetaProperty Meta.shortObservation()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = IborInterpolatedRateComputation.meta();

    // Act
    MetaProperty<IborIndexObservation> actualLongObservationResult = metaResult.longObservation();

    // Assert
    assertTrue(actualLongObservationResult instanceof DirectMetaProperty);
    assertTrue(metaResult.shortObservation() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean longObservation return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean longObservation return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanLongObservationReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborInterpolatedRateComputation.meta().metaPropertyGet("shortObservation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<IborIndexObservation> longObservationResult =
        ((Meta) metaBeanResult).longObservation();
    assertTrue(longObservationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("longObservation", longObservationResult.name());
    assertEquals("shortObservation", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, longObservationResult.style());
    Class<IborIndexObservation> expectedPropertyTypeResult = IborIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, longObservationResult.propertyType());
    Class<IborInterpolatedRateComputation> expectedDeclaringTypeResult =
        IborInterpolatedRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, longObservationResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shortObservation());
    assertSame(Meta.INSTANCE, longObservationResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean shortObservation return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean shortObservation return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanShortObservationReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborInterpolatedRateComputation.meta().metaPropertyGet("longObservation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<IborIndexObservation> shortObservationResult =
        ((Meta) metaBeanResult).shortObservation();
    assertTrue(shortObservationResult instanceof DirectMetaProperty);
    assertEquals("longObservation", actualMetaPropertyGetResult.name());
    assertEquals("shortObservation", shortObservationResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, shortObservationResult.style());
    Class<IborIndexObservation> expectedPropertyTypeResult = IborIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, shortObservationResult.propertyType());
    Class<IborInterpolatedRateComputation> expectedDeclaringTypeResult =
        IborInterpolatedRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, shortObservationResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).longObservation());
    assertSame(Meta.INSTANCE, shortObservationResult.metaBean());
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
    assertNull(IborInterpolatedRateComputation.meta().metaPropertyGet("Property Name"));
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
        IborInterpolatedRateComputation.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("shortObservation");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("longObservation");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("longObservation", getResult2.name());
    assertEquals("shortObservation", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<IborIndexObservation> expectedPropertyTypeResult = IborIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<IborIndexObservation> expectedPropertyTypeResult2 = IborIndexObservation.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<IborInterpolatedRateComputation> expectedDeclaringTypeResult =
        IborInterpolatedRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<IborInterpolatedRateComputation> expectedDeclaringTypeResult2 =
        IborInterpolatedRateComputation.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
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
        IborInterpolatedRateComputation.meta()
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
        () ->
            IborInterpolatedRateComputation.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
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
            IborInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "longObservation", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code longObservation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'longObservation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLongObservation_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "longObservation", "New Value", true));
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
            IborInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code shortObservation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'shortObservation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenShortObservation_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "shortObservation", "New Value", true));
  }

  /**
   * Test {@link IborInterpolatedRateComputation#of(IborIndex, IborIndex, LocalDate, ReferenceData)}
   * with {@code index1}, {@code index2}, {@code fixingDate}, {@code refData}.
   *
   * <p>Method under test: {@link IborInterpolatedRateComputation#of(IborIndex, IborIndex,
   * LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, IborIndex, LocalDate, ReferenceData) with 'index1', 'index2', 'fixingDate', 'refData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborInterpolatedRateComputation IborInterpolatedRateComputation.of(IborIndex, IborIndex, LocalDate, ReferenceData)"
  })
  void testOfWithIndex1Index2FixingDateRefData() {
    // Arrange
    IborIndex index1 = mock(IborIndex.class);
    when(index1.getTenor()).thenReturn(Tenor.ofDays(1));

    IborIndex index2 = mock(IborIndex.class);
    when(index2.getTenor()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            IborInterpolatedRateComputation.of(
                index1, index2, LocalDate.of(1970, 1, 1), mock(ReferenceData.class)));
    verify(index1).getTenor();
    verify(index2).getTenor();
  }

  /**
   * Test {@link IborInterpolatedRateComputation#of(IborIndex, IborIndex, LocalDate, ReferenceData)}
   * with {@code index1}, {@code index2}, {@code fixingDate}, {@code refData}.
   *
   * <ul>
   *   <li>Given ofMonths one.
   *   <li>Then calls {@link DayCount#yearFraction(LocalDate, LocalDate)}.
   * </ul>
   *
   * <p>Method under test: {@link IborInterpolatedRateComputation#of(IborIndex, IborIndex,
   * LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, IborIndex, LocalDate, ReferenceData) with 'index1', 'index2', 'fixingDate', 'refData'; given ofMonths one; then calls yearFraction(LocalDate, LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborInterpolatedRateComputation IborInterpolatedRateComputation.of(IborIndex, IborIndex, LocalDate, ReferenceData)"
  })
  void testOfWithIndex1Index2FixingDateRefData_givenOfMonthsOne_thenCallsYearFraction() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);

    IborIndex index1 = mock(IborIndex.class);
    when(index1.getCurrency()).thenReturn(null);
    when(index1.getDayCount()).thenReturn(dayCount);
    when(index1.calculateEffectiveFromFixing(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(LocalDate.of(1970, 1, 1));
    when(index1.calculateMaturityFromEffective(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(LocalDate.of(1970, 1, 1));
    when(index1.getTenor()).thenReturn(Tenor.ofDays(1));

    DayCount dayCount2 = mock(DayCount.class);
    when(dayCount2.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);

    IborIndex index2 = mock(IborIndex.class);
    when(index2.getCurrency()).thenThrow(new IllegalArgumentException());
    when(index2.getDayCount()).thenReturn(dayCount2);
    when(index2.calculateEffectiveFromFixing(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(LocalDate.of(1970, 1, 1));
    when(index2.calculateMaturityFromEffective(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(LocalDate.of(1970, 1, 1));
    when(index2.getTenor()).thenReturn(Tenor.ofMonths(1));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            IborInterpolatedRateComputation.of(
                index1, index2, LocalDate.of(1970, 1, 1), mock(ReferenceData.class)));
    verify(dayCount).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    verify(dayCount2).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    verify(index1).getCurrency();
    verify(index2).getCurrency();
    verify(index1).getDayCount();
    verify(index2).getDayCount();
    verify(index1).calculateEffectiveFromFixing(isA(LocalDate.class), isA(ReferenceData.class));
    verify(index2).calculateEffectiveFromFixing(isA(LocalDate.class), isA(ReferenceData.class));
    verify(index1).calculateMaturityFromEffective(isA(LocalDate.class), isA(ReferenceData.class));
    verify(index2).calculateMaturityFromEffective(isA(LocalDate.class), isA(ReferenceData.class));
    verify(index1).getTenor();
    verify(index2).getTenor();
  }

  /**
   * Test {@link IborInterpolatedRateComputation#of(IborIndex, IborIndex, LocalDate, ReferenceData)}
   * with {@code index1}, {@code index2}, {@code fixingDate}, {@code refData}.
   *
   * <ul>
   *   <li>Then calls {@link DayCount#yearFraction(LocalDate, LocalDate)}.
   * </ul>
   *
   * <p>Method under test: {@link IborInterpolatedRateComputation#of(IborIndex, IborIndex,
   * LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, IborIndex, LocalDate, ReferenceData) with 'index1', 'index2', 'fixingDate', 'refData'; then calls yearFraction(LocalDate, LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborInterpolatedRateComputation IborInterpolatedRateComputation.of(IborIndex, IborIndex, LocalDate, ReferenceData)"
  })
  void testOfWithIndex1Index2FixingDateRefData_thenCallsYearFraction() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);

    IborIndex index1 = mock(IborIndex.class);
    when(index1.getDayCount()).thenReturn(dayCount);
    when(index1.calculateEffectiveFromFixing(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(LocalDate.of(1970, 1, 1));
    when(index1.calculateMaturityFromEffective(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(LocalDate.of(1970, 1, 1));
    when(index1.getTenor()).thenReturn(Tenor.ofDays(1));

    DayCount dayCount2 = mock(DayCount.class);
    when(dayCount2.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);

    IborIndex index2 = mock(IborIndex.class);
    when(index2.getCurrency()).thenThrow(new IllegalArgumentException());
    when(index2.getDayCount()).thenReturn(dayCount2);
    when(index2.calculateEffectiveFromFixing(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(LocalDate.of(1970, 1, 1));
    when(index2.calculateMaturityFromEffective(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(LocalDate.of(1970, 1, 1));
    when(index2.getTenor()).thenReturn(Tenor.ofDays(1));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            IborInterpolatedRateComputation.of(
                index1, index2, LocalDate.of(1970, 1, 1), mock(ReferenceData.class)));
    verify(dayCount).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    verify(dayCount2).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    verify(index2).getCurrency();
    verify(index1).getDayCount();
    verify(index2).getDayCount();
    verify(index1).calculateEffectiveFromFixing(isA(LocalDate.class), isA(ReferenceData.class));
    verify(index2).calculateEffectiveFromFixing(isA(LocalDate.class), isA(ReferenceData.class));
    verify(index1).calculateMaturityFromEffective(isA(LocalDate.class), isA(ReferenceData.class));
    verify(index2).calculateMaturityFromEffective(isA(LocalDate.class), isA(ReferenceData.class));
    verify(index1).getTenor();
    verify(index2).getTenor();
  }

  /**
   * Test {@link IborInterpolatedRateComputation#meta()}.
   *
   * <p>Method under test: {@link IborInterpolatedRateComputation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborInterpolatedRateComputation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = IborInterpolatedRateComputation.meta();

    // Assert
    MetaProperty<IborIndexObservation> longObservationResult = actualMetaResult.longObservation();
    assertTrue(longObservationResult instanceof DirectMetaProperty);
    MetaProperty<IborIndexObservation> shortObservationResult = actualMetaResult.shortObservation();
    assertTrue(shortObservationResult instanceof DirectMetaProperty);
    assertEquals("longObservation", longObservationResult.name());
    assertEquals("shortObservation", shortObservationResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, longObservationResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, shortObservationResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<IborIndexObservation> expectedPropertyTypeResult = IborIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, longObservationResult.propertyType());
    Class<IborIndexObservation> expectedPropertyTypeResult2 = IborIndexObservation.class;
    assertEquals(expectedPropertyTypeResult2, shortObservationResult.propertyType());
    Class<IborInterpolatedRateComputation> expectedDeclaringTypeResult =
        IborInterpolatedRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, longObservationResult.declaringType());
    Class<IborInterpolatedRateComputation> expectedDeclaringTypeResult2 =
        IborInterpolatedRateComputation.class;
    assertEquals(expectedDeclaringTypeResult2, shortObservationResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, longObservationResult.metaBean());
    assertSame(meta, shortObservationResult.metaBean());
  }
}
