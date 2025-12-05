package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Collection;
import java.util.Optional;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdVariantDiffblueTest {
  /**
   * Test {@link EtdVariant#ofFlexFuture(int, EtdSettlementType)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Code is {@code 01}.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#ofFlexFuture(int, EtdSettlementType)}
   */
  @Test
  @DisplayName("Test ofFlexFuture(int, EtdSettlementType); when 'null'; then return Code is '01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdVariant EtdVariant.ofFlexFuture(int, EtdSettlementType)"})
  void testOfFlexFuture_whenNull_thenReturnCodeIs01() {
    // Arrange and Act
    EtdVariant actualOfFlexFutureResult = EtdVariant.ofFlexFuture(1, null);

    // Assert
    assertEquals("01", actualOfFlexFutureResult.getCode());
    assertEquals(1, actualOfFlexFutureResult.getDateCode().getAsInt());
    assertFalse(actualOfFlexFutureResult.isFlex());
  }

  /**
   * Test {@link EtdVariant#ofFlexFuture(int, EtdSettlementType)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Code is {@code 01C}.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#ofFlexFuture(int, EtdSettlementType)}
   */
  @Test
  @DisplayName("Test ofFlexFuture(int, EtdSettlementType); when one; then return Code is '01C'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdVariant EtdVariant.ofFlexFuture(int, EtdSettlementType)"})
  void testOfFlexFuture_whenOne_thenReturnCodeIs01c() {
    // Arrange and Act
    EtdVariant actualOfFlexFutureResult = EtdVariant.ofFlexFuture(1, EtdSettlementType.CASH);

    // Assert
    assertEquals("01C", actualOfFlexFutureResult.getCode());
    assertEquals(1, actualOfFlexFutureResult.getDateCode().getAsInt());
    Optional<EtdSettlementType> settlementType = actualOfFlexFutureResult.getSettlementType();
    assertEquals(EtdSettlementType.CASH, settlementType.get());
    assertTrue(actualOfFlexFutureResult.isFlex());
    assertTrue(settlementType.isPresent());
  }

  /**
   * Test {@link EtdVariant#ofFlexFuture(int, EtdSettlementType)}.
   *
   * <ul>
   *   <li>When thirty-one.
   *   <li>Then return Code is {@code 31C}.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#ofFlexFuture(int, EtdSettlementType)}
   */
  @Test
  @DisplayName(
      "Test ofFlexFuture(int, EtdSettlementType); when thirty-one; then return Code is '31C'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdVariant EtdVariant.ofFlexFuture(int, EtdSettlementType)"})
  void testOfFlexFuture_whenThirtyOne_thenReturnCodeIs31c() {
    // Arrange and Act
    EtdVariant actualOfFlexFutureResult = EtdVariant.ofFlexFuture(31, EtdSettlementType.CASH);

    // Assert
    assertEquals("31C", actualOfFlexFutureResult.getCode());
    assertEquals(31, actualOfFlexFutureResult.getDateCode().getAsInt());
    Optional<EtdSettlementType> settlementType = actualOfFlexFutureResult.getSettlementType();
    assertEquals(EtdSettlementType.CASH, settlementType.get());
    assertTrue(actualOfFlexFutureResult.isFlex());
    assertTrue(settlementType.isPresent());
  }

  /**
   * Test {@link EtdVariant#ofFlexOption(int, EtdSettlementType, EtdOptionType)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Code is {@code 01}.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#ofFlexOption(int, EtdSettlementType, EtdOptionType)}
   */
  @Test
  @DisplayName(
      "Test ofFlexOption(int, EtdSettlementType, EtdOptionType); when 'null'; then return Code is '01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdVariant EtdVariant.ofFlexOption(int, EtdSettlementType, EtdOptionType)"})
  void testOfFlexOption_whenNull_thenReturnCodeIs01() {
    // Arrange and Act
    EtdVariant actualOfFlexOptionResult = EtdVariant.ofFlexOption(1, null, null);

    // Assert
    assertEquals("01", actualOfFlexOptionResult.getCode());
    assertFalse(actualOfFlexOptionResult.isFlex());
    Optional<EtdOptionType> optionType = actualOfFlexOptionResult.getOptionType();
    assertFalse(optionType.isPresent());
    assertSame(optionType, actualOfFlexOptionResult.getSettlementType());
  }

  /**
   * Test {@link EtdVariant#ofFlexOption(int, EtdSettlementType, EtdOptionType)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Code is {@code 01C}.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#ofFlexOption(int, EtdSettlementType, EtdOptionType)}
   */
  @Test
  @DisplayName(
      "Test ofFlexOption(int, EtdSettlementType, EtdOptionType); when 'null'; then return Code is '01C'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdVariant EtdVariant.ofFlexOption(int, EtdSettlementType, EtdOptionType)"})
  void testOfFlexOption_whenNull_thenReturnCodeIs01c() {
    // Arrange and Act
    EtdVariant actualOfFlexOptionResult = EtdVariant.ofFlexOption(1, EtdSettlementType.CASH, null);

    // Assert
    assertEquals("01C", actualOfFlexOptionResult.getCode());
    assertEquals(1, actualOfFlexOptionResult.getDateCode().getAsInt());
    Optional<EtdSettlementType> settlementType = actualOfFlexOptionResult.getSettlementType();
    assertEquals(EtdSettlementType.CASH, settlementType.get());
    assertFalse(actualOfFlexOptionResult.getOptionType().isPresent());
    assertTrue(actualOfFlexOptionResult.isFlex());
    assertTrue(settlementType.isPresent());
  }

  /**
   * Test {@link EtdVariant#ofFlexOption(int, EtdSettlementType, EtdOptionType)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Code is {@code 01CA}.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#ofFlexOption(int, EtdSettlementType, EtdOptionType)}
   */
  @Test
  @DisplayName(
      "Test ofFlexOption(int, EtdSettlementType, EtdOptionType); when one; then return Code is '01CA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdVariant EtdVariant.ofFlexOption(int, EtdSettlementType, EtdOptionType)"})
  void testOfFlexOption_whenOne_thenReturnCodeIs01ca() {
    // Arrange and Act
    EtdVariant actualOfFlexOptionResult =
        EtdVariant.ofFlexOption(1, EtdSettlementType.CASH, EtdOptionType.AMERICAN);

    // Assert
    assertEquals("01CA", actualOfFlexOptionResult.getCode());
    assertEquals(1, actualOfFlexOptionResult.getDateCode().getAsInt());
    Optional<EtdOptionType> optionType = actualOfFlexOptionResult.getOptionType();
    assertEquals(EtdOptionType.AMERICAN, optionType.get());
    Optional<EtdSettlementType> settlementType = actualOfFlexOptionResult.getSettlementType();
    assertEquals(EtdSettlementType.CASH, settlementType.get());
    assertTrue(actualOfFlexOptionResult.isFlex());
    assertTrue(optionType.isPresent());
    assertTrue(settlementType.isPresent());
  }

  /**
   * Test {@link EtdVariant#ofFlexOption(int, EtdSettlementType, EtdOptionType)}.
   *
   * <ul>
   *   <li>When thirty-one.
   *   <li>Then return Code is {@code 31CA}.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#ofFlexOption(int, EtdSettlementType, EtdOptionType)}
   */
  @Test
  @DisplayName(
      "Test ofFlexOption(int, EtdSettlementType, EtdOptionType); when thirty-one; then return Code is '31CA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdVariant EtdVariant.ofFlexOption(int, EtdSettlementType, EtdOptionType)"})
  void testOfFlexOption_whenThirtyOne_thenReturnCodeIs31ca() {
    // Arrange and Act
    EtdVariant actualOfFlexOptionResult =
        EtdVariant.ofFlexOption(31, EtdSettlementType.CASH, EtdOptionType.AMERICAN);

    // Assert
    assertEquals("31CA", actualOfFlexOptionResult.getCode());
    assertEquals(31, actualOfFlexOptionResult.getDateCode().getAsInt());
    Optional<EtdOptionType> optionType = actualOfFlexOptionResult.getOptionType();
    assertEquals(EtdOptionType.AMERICAN, optionType.get());
    assertTrue(optionType.isPresent());
  }

  /**
   * Test {@link EtdVariant#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 1}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '1'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdVariant EtdVariant.parse(String)"})
  void testParse_when1_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> EtdVariant.parse("1"));
  }

  /**
   * Test {@link EtdVariant#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 01}.
   *   <li>Then return Code is {@code 01}.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '01'; then return Code is '01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdVariant EtdVariant.parse(String)"})
  void testParse_when01_thenReturnCodeIs01() {
    // Arrange and Act
    EtdVariant actualParseResult = EtdVariant.parse("01");

    // Assert
    assertEquals("01", actualParseResult.getCode());
    assertEquals(1, actualParseResult.getDateCode().getAsInt());
    assertEquals(EtdExpiryType.DAILY, actualParseResult.getType());
  }

  /**
   * Test {@link EtdVariant#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 11}.
   *   <li>Then return Code is {@code 11}.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '11'; then return Code is '11'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdVariant EtdVariant.parse(String)"})
  void testParse_when11_thenReturnCodeIs11() {
    // Arrange and Act
    EtdVariant actualParseResult = EtdVariant.parse("11");

    // Assert
    assertEquals("11", actualParseResult.getCode());
    assertEquals(11, actualParseResult.getDateCode().getAsInt());
    assertEquals(EtdExpiryType.DAILY, actualParseResult.getType());
  }

  /**
   * Test {@link EtdVariant#parse(String)}.
   *
   * <ul>
   *   <li>When {@code W1}.
   *   <li>Then return Code is {@code W1}.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'W1'; then return Code is 'W1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdVariant EtdVariant.parse(String)"})
  void testParse_whenW1_thenReturnCodeIsW1() {
    // Arrange and Act
    EtdVariant actualParseResult = EtdVariant.parse("W1");

    // Assert
    assertEquals("W1", actualParseResult.getCode());
    assertEquals(1, actualParseResult.getDateCode().getAsInt());
    assertEquals(EtdExpiryType.WEEKLY, actualParseResult.getType());
  }

  /**
   * Test {@link EtdVariant#isFlex()}.
   *
   * <p>Method under test: {@link EtdVariant#isFlex()}
   */
  @Test
  @DisplayName("Test isFlex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EtdVariant.isFlex()"})
  void testIsFlex() {
    // Arrange, Act and Assert
    assertFalse(EtdVariant.MONTHLY.isFlex());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EtdVariant#toString()}
   *   <li>{@link EtdVariant#getCode()}
   *   <li>{@link EtdVariant#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String EtdVariant.getCode()",
    "EtdExpiryType EtdVariant.getType()",
    "String EtdVariant.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    EtdVariant ofMonthlyResult = EtdVariant.ofMonthly();

    // Act
    String actualToStringResult = ofMonthlyResult.toString();
    String actualCode = ofMonthlyResult.getCode();

    // Assert
    assertEquals("", actualCode);
    assertEquals(
        "EtdVariant{type=Monthly, dateCode=null, settlementType=null, optionType=null}",
        actualToStringResult);
    assertEquals(EtdExpiryType.MONTHLY, ofMonthlyResult.getType());
  }

  /**
   * Test {@link EtdVariant#meta()}.
   *
   * <p>Method under test: {@link EtdVariant#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean EtdVariant.meta()"})
  void testMeta() {
    // Arrange and Act
    MetaBean actualMetaResult = EtdVariant.meta();

    // Assert
    Iterable<MetaProperty<?>> metaPropertyIterableResult = actualMetaResult.metaPropertyIterable();
    assertTrue(metaPropertyIterableResult instanceof Collection);
    assertEquals("com.opengamma.strata.product.etd.EtdVariant", actualMetaResult.beanName());
    assertEquals(1, actualMetaResult.annotations().size());
    assertEquals(4, ((Collection<MetaProperty<?>>) metaPropertyIterableResult).size());
    assertEquals(4, actualMetaResult.metaPropertyCount());
  }

  /**
   * Test {@link EtdVariant#getSettlementType()}.
   *
   * <p>Method under test: {@link EtdVariant#getSettlementType()}
   */
  @Test
  @DisplayName("Test getSettlementType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional EtdVariant.getSettlementType()"})
  void testGetSettlementType() {
    // Arrange, Act and Assert
    assertFalse(EtdVariant.MONTHLY.getSettlementType().isPresent());
  }

  /**
   * Test {@link EtdVariant#getOptionType()}.
   *
   * <p>Method under test: {@link EtdVariant#getOptionType()}
   */
  @Test
  @DisplayName("Test getOptionType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional EtdVariant.getOptionType()"})
  void testGetOptionType() {
    // Arrange, Act and Assert
    assertFalse(EtdVariant.MONTHLY.getOptionType().isPresent());
  }

  /**
   * Test {@link EtdVariant#equals(Object)}, and {@link EtdVariant#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EtdVariant#equals(Object)}
   *   <li>{@link EtdVariant#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EtdVariant.equals(Object)", "int EtdVariant.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    EtdVariant etdVariant = EtdVariant.MONTHLY;
    EtdVariant etdVariant2 = EtdVariant.MONTHLY;

    // Act and Assert
    assertEquals(etdVariant, etdVariant2);
    assertEquals(etdVariant.hashCode(), etdVariant2.hashCode());
  }

  /**
   * Test {@link EtdVariant#equals(Object)}, and {@link EtdVariant#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EtdVariant#equals(Object)}
   *   <li>{@link EtdVariant#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EtdVariant.equals(Object)", "int EtdVariant.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    EtdVariant etdVariant = EtdVariant.MONTHLY;

    // Act and Assert
    assertEquals(etdVariant, etdVariant);
    int expectedHashCodeResult = etdVariant.hashCode();
    assertEquals(expectedHashCodeResult, etdVariant.hashCode());
  }

  /**
   * Test {@link EtdVariant#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EtdVariant.equals(Object)", "int EtdVariant.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(EtdVariant.MONTHLY, 1);
  }

  /**
   * Test {@link EtdVariant#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EtdVariant.equals(Object)", "int EtdVariant.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(EtdVariant.MONTHLY, null);
  }

  /**
   * Test {@link EtdVariant#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EtdVariant#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean EtdVariant.equals(Object)", "int EtdVariant.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(EtdVariant.MONTHLY, "Different type to EtdVariant");
  }
}
