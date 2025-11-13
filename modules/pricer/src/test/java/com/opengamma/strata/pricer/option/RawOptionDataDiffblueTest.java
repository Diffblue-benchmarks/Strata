package com.opengamma.strata.pricer.option;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.market.ValueType;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RawOptionDataDiffblueTest {
  /**
   * Test {@link RawOptionData#of(List, DoubleArray, ValueType, DoubleMatrix, ValueType)} with
   * {@code expiries}, {@code strikes}, {@code strikeType}, {@code data}, {@code dataType}.
   *
   * <ul>
   *   <li>Then return not Error Present.
   * </ul>
   *
   * <p>Method under test: {@link RawOptionData#of(List, DoubleArray, ValueType, DoubleMatrix,
   * ValueType)}
   */
  @Test
  @DisplayName(
      "Test of(List, DoubleArray, ValueType, DoubleMatrix, ValueType) with 'expiries', 'strikes', 'strikeType', 'data', 'dataType'; then return not Error Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RawOptionData RawOptionData.of(List, DoubleArray, ValueType, DoubleMatrix, ValueType)"
  })
  void testOfWithExpiriesStrikesStrikeTypeDataDataType_thenReturnNotErrorPresent() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();
    ValueType dataType = ValueType.of("Name");

    // Act
    RawOptionData actualOfResult = RawOptionData.of(expiries, strikes, strikeType, data, dataType);

    // Assert
    assertFalse(actualOfResult.getError().isPresent());
    assertEquals(expiries, actualOfResult.getExpiries());
    assertSame(dataType, actualOfResult.getDataType());
    assertSame(strikeType, actualOfResult.getStrikeType());
    assertSame(DoubleArray.EMPTY, actualOfResult.getStrikes());
    assertSame(DoubleMatrix.EMPTY, actualOfResult.getData());
  }

  /**
   * Test {@link RawOptionData#of(List, DoubleArray, ValueType, DoubleMatrix, DoubleMatrix,
   * ValueType)} with {@code expiries}, {@code strikes}, {@code strikeType}, {@code data}, {@code
   * error}, {@code dataType}.
   *
   * <p>Method under test: {@link RawOptionData#of(List, DoubleArray, ValueType, DoubleMatrix,
   * DoubleMatrix, ValueType)}
   */
  @Test
  @DisplayName(
      "Test of(List, DoubleArray, ValueType, DoubleMatrix, DoubleMatrix, ValueType) with 'expiries', 'strikes', 'strikeType', 'data', 'error', 'dataType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RawOptionData RawOptionData.of(List, DoubleArray, ValueType, DoubleMatrix, DoubleMatrix, ValueType)"
  })
  void testOfWithExpiriesStrikesStrikeTypeDataErrorDataType() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();
    DoubleMatrix error = DoubleMatrix.of();
    ValueType dataType = ValueType.of("Name");

    // Act
    RawOptionData actualOfResult =
        RawOptionData.of(expiries, strikes, strikeType, data, error, dataType);

    // Assert
    assertEquals(expiries, actualOfResult.getExpiries());
    assertSame(dataType, actualOfResult.getDataType());
    assertSame(strikeType, actualOfResult.getStrikeType());
    assertSame(DoubleArray.EMPTY, actualOfResult.getStrikes());
    assertSame(DoubleMatrix.EMPTY, actualOfResult.getData());
  }

  /**
   * Test {@link RawOptionData#ofBlackVolatility(List, DoubleArray, ValueType, DoubleMatrix,
   * DoubleMatrix, Double)} with {@code expiries}, {@code strikes}, {@code strikeType}, {@code
   * data}, {@code error}, {@code shift}.
   *
   * <p>Method under test: {@link RawOptionData#ofBlackVolatility(List, DoubleArray, ValueType,
   * DoubleMatrix, DoubleMatrix, Double)}
   */
  @Test
  @DisplayName(
      "Test ofBlackVolatility(List, DoubleArray, ValueType, DoubleMatrix, DoubleMatrix, Double) with 'expiries', 'strikes', 'strikeType', 'data', 'error', 'shift'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RawOptionData RawOptionData.ofBlackVolatility(List, DoubleArray, ValueType, DoubleMatrix, DoubleMatrix, Double)"
  })
  void testOfBlackVolatilityWithExpiriesStrikesStrikeTypeDataErrorShift() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();

    // Act
    RawOptionData actualOfBlackVolatilityResult =
        RawOptionData.ofBlackVolatility(
            expiries, strikes, strikeType, data, DoubleMatrix.of(), 10.0d);

    // Assert
    assertEquals(expiries, actualOfBlackVolatilityResult.getExpiries());
    assertSame(strikeType, actualOfBlackVolatilityResult.getStrikeType());
    assertSame(DoubleArray.EMPTY, actualOfBlackVolatilityResult.getStrikes());
    assertSame(DoubleMatrix.EMPTY, actualOfBlackVolatilityResult.getData());
    assertSame(ValueType.BLACK_VOLATILITY, actualOfBlackVolatilityResult.getDataType());
  }

  /**
   * Test {@link RawOptionData#ofBlackVolatility(List, DoubleArray, ValueType, DoubleMatrix,
   * Double)} with {@code expiries}, {@code strikes}, {@code strikeType}, {@code data}, {@code
   * shift}.
   *
   * <p>Method under test: {@link RawOptionData#ofBlackVolatility(List, DoubleArray, ValueType,
   * DoubleMatrix, Double)}
   */
  @Test
  @DisplayName(
      "Test ofBlackVolatility(List, DoubleArray, ValueType, DoubleMatrix, Double) with 'expiries', 'strikes', 'strikeType', 'data', 'shift'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RawOptionData RawOptionData.ofBlackVolatility(List, DoubleArray, ValueType, DoubleMatrix, Double)"
  })
  void testOfBlackVolatilityWithExpiriesStrikesStrikeTypeDataShift() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");

    // Act
    RawOptionData actualOfBlackVolatilityResult =
        RawOptionData.ofBlackVolatility(expiries, strikes, strikeType, DoubleMatrix.of(), 10.0d);

    // Assert
    assertFalse(actualOfBlackVolatilityResult.getError().isPresent());
    assertEquals(expiries, actualOfBlackVolatilityResult.getExpiries());
    assertSame(strikeType, actualOfBlackVolatilityResult.getStrikeType());
    assertSame(DoubleArray.EMPTY, actualOfBlackVolatilityResult.getStrikes());
    assertSame(DoubleMatrix.EMPTY, actualOfBlackVolatilityResult.getData());
    assertSame(ValueType.BLACK_VOLATILITY, actualOfBlackVolatilityResult.getDataType());
  }

  /**
   * Test {@link RawOptionData#meta()}.
   *
   * <p>Method under test: {@link RawOptionData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean RawOptionData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<RawOptionData> actualMetaResult = RawOptionData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(7, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("data"));
    assertTrue(metaPropertyMapResult.containsKey("dataType"));
    assertTrue(metaPropertyMapResult.containsKey("error"));
    assertTrue(metaPropertyMapResult.containsKey("expiries"));
    assertTrue(metaPropertyMapResult.containsKey("strikeType"));
    assertTrue(metaPropertyMapResult.containsKey("strikes"));
    assertTrue(actualMetaResult.isBuildable());
    Class<RawOptionData> expectedBeanTypeResult = RawOptionData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link RawOptionData#metaBean()}.
   *
   * <p>Method under test: {@link RawOptionData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean RawOptionData.metaBean()"})
  void testMetaBean() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();

    RawOptionData ofResult =
        RawOptionData.of(expiries, strikes, strikeType, data, ValueType.of("Name"));

    // Act
    TypedMetaBean<RawOptionData> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(7, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("data"));
    assertTrue(metaPropertyMapResult.containsKey("dataType"));
    assertTrue(metaPropertyMapResult.containsKey("error"));
    assertTrue(metaPropertyMapResult.containsKey("expiries"));
    assertTrue(metaPropertyMapResult.containsKey("strikeType"));
    assertTrue(metaPropertyMapResult.containsKey("strikes"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<RawOptionData> expectedBeanTypeResult = RawOptionData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RawOptionData#toString()}
   *   <li>{@link RawOptionData#getData()}
   *   <li>{@link RawOptionData#getDataType()}
   *   <li>{@link RawOptionData#getExpiries()}
   *   <li>{@link RawOptionData#getStrikeType()}
   *   <li>{@link RawOptionData#getStrikes()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix RawOptionData.getData()",
    "ValueType RawOptionData.getDataType()",
    "ImmutableList RawOptionData.getExpiries()",
    "ValueType RawOptionData.getStrikeType()",
    "DoubleArray RawOptionData.getStrikes()",
    "String RawOptionData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();
    ValueType dataType = ValueType.of("Name");

    RawOptionData ofResult = RawOptionData.of(expiries, strikes, strikeType, data, dataType);

    // Act
    String actualToStringResult = ofResult.toString();
    DoubleMatrix actualData = ofResult.getData();
    ValueType actualDataType = ofResult.getDataType();
    ImmutableList<Period> actualExpiries = ofResult.getExpiries();
    ValueType actualStrikeType = ofResult.getStrikeType();
    DoubleArray actualStrikes = ofResult.getStrikes();

    // Assert
    assertEquals(
        "RawOptionData{expiries=[], strikes=[], strikeType=Name, data=, error=null, dataType=Name, shift=0.0}",
        actualToStringResult);
    assertTrue(actualExpiries.isEmpty());
    assertSame(dataType, actualDataType);
    assertSame(strikeType, actualStrikeType);
    assertSame(DoubleArray.EMPTY, actualStrikes);
    assertSame(DoubleMatrix.EMPTY, actualData);
  }

  /**
   * Test {@link RawOptionData#getError()}.
   *
   * <p>Method under test: {@link RawOptionData#getError()}
   */
  @Test
  @DisplayName("Test getError()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional RawOptionData.getError()"})
  void testGetError() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();

    RawOptionData ofResult =
        RawOptionData.of(expiries, strikes, strikeType, data, ValueType.of("Name"));

    // Act and Assert
    assertFalse(ofResult.getError().isPresent());
  }

  /**
   * Test {@link RawOptionData#equals(Object)}, and {@link RawOptionData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RawOptionData#equals(Object)}
   *   <li>{@link RawOptionData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RawOptionData.equals(Object)", "int RawOptionData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();

    RawOptionData ofResult =
        RawOptionData.of(expiries, strikes, strikeType, data, ValueType.of("Name"));
    ArrayList<Period> expiries2 = new ArrayList<>();
    DoubleArray strikes2 = DoubleArray.of();
    ValueType strikeType2 = ValueType.of("Name");
    DoubleMatrix data2 = DoubleMatrix.of();

    RawOptionData ofResult2 =
        RawOptionData.of(expiries2, strikes2, strikeType2, data2, ValueType.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link RawOptionData#equals(Object)}, and {@link RawOptionData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RawOptionData#equals(Object)}
   *   <li>{@link RawOptionData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RawOptionData.equals(Object)", "int RawOptionData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();

    RawOptionData ofResult =
        RawOptionData.of(expiries, strikes, strikeType, data, ValueType.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link RawOptionData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RawOptionData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RawOptionData.equals(Object)", "int RawOptionData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");

    RawOptionData ofBlackVolatilityResult =
        RawOptionData.ofBlackVolatility(expiries, strikes, strikeType, DoubleMatrix.of(), 10.0d);
    ArrayList<Period> expiries2 = new ArrayList<>();
    DoubleArray strikes2 = DoubleArray.of();
    ValueType strikeType2 = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();

    // Act and Assert
    assertNotEquals(
        ofBlackVolatilityResult,
        RawOptionData.of(expiries2, strikes2, strikeType2, data, ValueType.of("Name")));
  }

  /**
   * Test {@link RawOptionData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RawOptionData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RawOptionData.equals(Object)", "int RawOptionData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();
    DoubleMatrix error = DoubleMatrix.of();

    RawOptionData ofResult =
        RawOptionData.of(expiries, strikes, strikeType, data, error, ValueType.of("Name"));
    ArrayList<Period> expiries2 = new ArrayList<>();
    DoubleArray strikes2 = DoubleArray.of();
    ValueType strikeType2 = ValueType.of("Name");
    DoubleMatrix data2 = DoubleMatrix.of();

    // Act and Assert
    assertNotEquals(
        ofResult, RawOptionData.of(expiries2, strikes2, strikeType2, data2, ValueType.of("Name")));
  }

  /**
   * Test {@link RawOptionData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RawOptionData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RawOptionData.equals(Object)", "int RawOptionData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.filled(3);
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();

    RawOptionData ofResult =
        RawOptionData.of(expiries, strikes, strikeType, data, ValueType.of("Name"));
    ArrayList<Period> expiries2 = new ArrayList<>();
    DoubleArray strikes2 = DoubleArray.of();
    ValueType strikeType2 = ValueType.of("Name");
    DoubleMatrix data2 = DoubleMatrix.of();

    // Act and Assert
    assertNotEquals(
        ofResult, RawOptionData.of(expiries2, strikes2, strikeType2, data2, ValueType.of("Name")));
  }

  /**
   * Test {@link RawOptionData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RawOptionData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RawOptionData.equals(Object)", "int RawOptionData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("42");
    DoubleMatrix data = DoubleMatrix.of();

    RawOptionData ofResult =
        RawOptionData.of(expiries, strikes, strikeType, data, ValueType.of("Name"));
    ArrayList<Period> expiries2 = new ArrayList<>();
    DoubleArray strikes2 = DoubleArray.of();
    ValueType strikeType2 = ValueType.of("Name");
    DoubleMatrix data2 = DoubleMatrix.of();

    // Act and Assert
    assertNotEquals(
        ofResult, RawOptionData.of(expiries2, strikes2, strikeType2, data2, ValueType.of("Name")));
  }

  /**
   * Test {@link RawOptionData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RawOptionData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RawOptionData.equals(Object)", "int RawOptionData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");

    RawOptionData ofBlackVolatilityResult =
        RawOptionData.ofBlackVolatility(expiries, strikes, strikeType, DoubleMatrix.of(), 10.0d);
    ArrayList<Period> expiries2 = new ArrayList<>();
    DoubleArray strikes2 = DoubleArray.of();
    ValueType strikeType2 = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();

    // Act and Assert
    assertNotEquals(
        ofBlackVolatilityResult,
        RawOptionData.of(expiries2, strikes2, strikeType2, data, ValueType.of("BlackVolatility")));
  }

  /**
   * Test {@link RawOptionData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RawOptionData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RawOptionData.equals(Object)", "int RawOptionData.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();

    // Act and Assert
    assertNotEquals(
        RawOptionData.of(expiries, strikes, strikeType, data, ValueType.of("Name")), null);
  }

  /**
   * Test {@link RawOptionData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RawOptionData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RawOptionData.equals(Object)", "int RawOptionData.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ArrayList<Period> expiries = new ArrayList<>();
    DoubleArray strikes = DoubleArray.of();
    ValueType strikeType = ValueType.of("Name");
    DoubleMatrix data = DoubleMatrix.of();

    // Act and Assert
    assertNotEquals(
        RawOptionData.of(expiries, strikes, strikeType, data, ValueType.of("Name")),
        "Different type to RawOptionData");
  }
}
