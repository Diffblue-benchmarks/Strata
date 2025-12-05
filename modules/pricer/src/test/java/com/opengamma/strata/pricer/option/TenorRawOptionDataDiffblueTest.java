package com.opengamma.strata.pricer.option;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.market.ValueType;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TenorRawOptionDataDiffblueTest {
  /**
   * Test {@link TenorRawOptionData#of(Map)}.
   *
   * <ul>
   *   <li>Given ofWeeks one.
   *   <li>Then return Tenors size is three.
   * </ul>
   *
   * <p>Method under test: {@link TenorRawOptionData#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map); given ofWeeks one; then return Tenors size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorRawOptionData TenorRawOptionData.of(Map)"})
  void testOf_givenOfWeeksOne_thenReturnTenorsSizeIsThree() {
    // Arrange
    HashMap<Tenor, RawOptionData> data = new HashMap<>();
    Tenor ofWeeksResult = Tenor.ofWeeks(1);
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("data");
    DoubleMatrix data2 = DoubleMatrix.of();

    RawOptionData ofResult =
        RawOptionData.of(expiries, strikes, strikeType, data2, ValueType.of("data"));

    data.put(ofWeeksResult, ofResult);
    Tenor ofDaysResult = Tenor.ofDays(1);
    ArrayList<Period> expiries2 = new ArrayList<>();
    DoubleArray strikes2 = DoubleArray.of();
    ValueType strikeType2 = ValueType.of("data");
    DoubleMatrix data3 = DoubleMatrix.of();

    RawOptionData ofResult2 =
        RawOptionData.of(expiries2, strikes2, strikeType2, data3, ValueType.of("data"));

    data.put(ofDaysResult, ofResult2);
    Tenor ofMonthsResult = Tenor.ofMonths(1);
    ArrayList<Period> expiries3 = new ArrayList<>();
    DoubleArray strikes3 = DoubleArray.of();
    ValueType strikeType3 = ValueType.of("data");
    DoubleMatrix data4 = DoubleMatrix.of();

    RawOptionData ofResult3 =
        RawOptionData.of(expiries3, strikes3, strikeType3, data4, ValueType.of("data"));

    data.put(ofMonthsResult, ofResult3);

    // Act
    TenorRawOptionData actualOfResult = TenorRawOptionData.of(data);

    // Assert
    assertEquals(3, actualOfResult.getTenors().size());
    assertEquals(data, actualOfResult.getData());
  }

  /**
   * Test {@link TenorRawOptionData#of(Map)}.
   *
   * <ul>
   *   <li>Then return Tenors size is one.
   * </ul>
   *
   * <p>Method under test: {@link TenorRawOptionData#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map); then return Tenors size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorRawOptionData TenorRawOptionData.of(Map)"})
  void testOf_thenReturnTenorsSizeIsOne() {
    // Arrange
    HashMap<Tenor, RawOptionData> data = new HashMap<>();
    Tenor ofDaysResult = Tenor.ofDays(1);
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("data");
    DoubleMatrix data2 = DoubleMatrix.of();

    RawOptionData ofResult =
        RawOptionData.of(expiries, strikes, strikeType, data2, ValueType.of("data"));

    data.put(ofDaysResult, ofResult);

    // Act
    TenorRawOptionData actualOfResult = TenorRawOptionData.of(data);

    // Assert
    assertEquals(1, actualOfResult.getTenors().size());
    assertEquals(data, actualOfResult.getData());
  }

  /**
   * Test {@link TenorRawOptionData#of(Map)}.
   *
   * <ul>
   *   <li>Then return Tenors size is two.
   * </ul>
   *
   * <p>Method under test: {@link TenorRawOptionData#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map); then return Tenors size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorRawOptionData TenorRawOptionData.of(Map)"})
  void testOf_thenReturnTenorsSizeIsTwo() {
    // Arrange
    HashMap<Tenor, RawOptionData> data = new HashMap<>();
    Tenor ofDaysResult = Tenor.ofDays(1);
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("data");
    DoubleMatrix data2 = DoubleMatrix.of();

    RawOptionData ofResult =
        RawOptionData.of(expiries, strikes, strikeType, data2, ValueType.of("data"));

    data.put(ofDaysResult, ofResult);
    Tenor ofMonthsResult = Tenor.ofMonths(1);
    ArrayList<Period> expiries2 = new ArrayList<>();
    DoubleArray strikes2 = DoubleArray.of();
    ValueType strikeType2 = ValueType.of("data");
    DoubleMatrix data3 = DoubleMatrix.of();

    RawOptionData ofResult2 =
        RawOptionData.of(expiries2, strikes2, strikeType2, data3, ValueType.of("data"));

    data.put(ofMonthsResult, ofResult2);

    // Act
    TenorRawOptionData actualOfResult = TenorRawOptionData.of(data);

    // Assert
    assertEquals(2, actualOfResult.getTenors().size());
    assertEquals(data, actualOfResult.getData());
  }

  /**
   * Test {@link TenorRawOptionData#of(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Data Empty.
   * </ul>
   *
   * <p>Method under test: {@link TenorRawOptionData#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map); when HashMap(); then return Data Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorRawOptionData TenorRawOptionData.of(Map)"})
  void testOf_whenHashMap_thenReturnDataEmpty() {
    // Arrange and Act
    TenorRawOptionData actualOfResult = TenorRawOptionData.of(new HashMap<>());

    // Assert
    assertTrue(actualOfResult.getData().isEmpty());
    assertTrue(actualOfResult.getTenors().isEmpty());
  }

  /**
   * Test {@link TenorRawOptionData#getTenors()}.
   *
   * <p>Method under test: {@link TenorRawOptionData#getTenors()}
   */
  @Test
  @DisplayName("Test getTenors()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet TenorRawOptionData.getTenors()"})
  void testGetTenors() {
    // Arrange
    TenorRawOptionData ofResult = TenorRawOptionData.of(new HashMap<>());

    // Act and Assert
    assertTrue(ofResult.getTenors().isEmpty());
  }

  /**
   * Test {@link TenorRawOptionData#getData(Tenor)} with {@code Tenor}.
   *
   * <p>Method under test: {@link TenorRawOptionData#getData(Tenor)}
   */
  @Test
  @DisplayName("Test getData(Tenor) with 'Tenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RawOptionData TenorRawOptionData.getData(Tenor)"})
  void testGetDataWithTenor() {
    // Arrange
    HashMap<Tenor, RawOptionData> data = new HashMap<>();
    Tenor ofDaysResult = Tenor.ofDays(1);
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");

    RawOptionData ofBlackVolatilityResult =
        RawOptionData.ofBlackVolatility(expiries, strikes, strikeType, DoubleMatrix.of(), 10.0d);

    data.put(ofDaysResult, ofBlackVolatilityResult);
    TenorRawOptionData ofResult = TenorRawOptionData.of(data);

    // Act and Assert
    assertSame(ofBlackVolatilityResult, ofResult.getData(Tenor.ofDays(1)));
  }

  /**
   * Test {@link TenorRawOptionData#getData(Tenor)} with {@code Tenor}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link TenorRawOptionData#getData(Tenor)}
   */
  @Test
  @DisplayName("Test getData(Tenor) with 'Tenor'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RawOptionData TenorRawOptionData.getData(Tenor)"})
  void testGetDataWithTenor_whenNull_thenThrowIllegalArgumentException() {
    // Arrange
    TenorRawOptionData ofResult = TenorRawOptionData.of(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getData(null));
  }

  /**
   * Test {@link TenorRawOptionData#getData(Tenor)} with {@code Tenor}.
   *
   * <ul>
   *   <li>When ofDays one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link TenorRawOptionData#getData(Tenor)}
   */
  @Test
  @DisplayName(
      "Test getData(Tenor) with 'Tenor'; when ofDays one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RawOptionData TenorRawOptionData.getData(Tenor)"})
  void testGetDataWithTenor_whenOfDaysOne_thenThrowIllegalArgumentException() {
    // Arrange
    TenorRawOptionData ofResult = TenorRawOptionData.of(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getData(Tenor.ofDays(1)));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorRawOptionData#toString()}
   *   <li>{@link TenorRawOptionData#getData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableSortedMap TenorRawOptionData.getData()",
    "String TenorRawOptionData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    TenorRawOptionData ofResult = TenorRawOptionData.of(new HashMap<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("TenorRawOptionData{data={}}", actualToStringResult);
    assertTrue(ofResult.getData().isEmpty());
  }

  /**
   * Test {@link TenorRawOptionData#meta()}.
   *
   * <p>Method under test: {@link TenorRawOptionData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean TenorRawOptionData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<TenorRawOptionData> actualMetaResult = TenorRawOptionData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("data"));
    assertTrue(actualMetaResult.isBuildable());
    Class<TenorRawOptionData> expectedBeanTypeResult = TenorRawOptionData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link TenorRawOptionData#metaBean()}.
   *
   * <p>Method under test: {@link TenorRawOptionData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean TenorRawOptionData.metaBean()"})
  void testMetaBean() {
    // Arrange
    TenorRawOptionData ofResult = TenorRawOptionData.of(new HashMap<>());

    // Act
    TypedMetaBean<TenorRawOptionData> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("data"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<TenorRawOptionData> expectedBeanTypeResult = TenorRawOptionData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link TenorRawOptionData#equals(Object)}, and {@link TenorRawOptionData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorRawOptionData#equals(Object)}
   *   <li>{@link TenorRawOptionData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorRawOptionData.equals(Object)",
    "int TenorRawOptionData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TenorRawOptionData ofResult = TenorRawOptionData.of(new HashMap<>());
    TenorRawOptionData ofResult2 = TenorRawOptionData.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link TenorRawOptionData#equals(Object)}, and {@link TenorRawOptionData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorRawOptionData#equals(Object)}
   *   <li>{@link TenorRawOptionData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorRawOptionData.equals(Object)",
    "int TenorRawOptionData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TenorRawOptionData ofResult = TenorRawOptionData.of(new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link TenorRawOptionData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorRawOptionData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorRawOptionData.equals(Object)",
    "int TenorRawOptionData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TenorRawOptionData ofResult = TenorRawOptionData.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link TenorRawOptionData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorRawOptionData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorRawOptionData.equals(Object)",
    "int TenorRawOptionData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TenorRawOptionData ofResult = TenorRawOptionData.of(new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to TenorRawOptionData");
  }
}
