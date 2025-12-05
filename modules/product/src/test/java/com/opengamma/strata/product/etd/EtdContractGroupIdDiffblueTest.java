package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.ProductType;
import com.opengamma.strata.product.common.ExchangeId;
import com.opengamma.strata.product.common.ExchangeIds;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdContractGroupIdDiffblueTest {
  /**
   * Test {@link EtdContractGroupId#of(ExchangeId, EtdContractGroupCode)} with {@code ExchangeId},
   * {@code EtdContractGroupCode}.
   *
   * <p>Method under test: {@link EtdContractGroupId#of(ExchangeId, EtdContractGroupCode)}
   */
  @Test
  @DisplayName(
      "Test of(ExchangeId, EtdContractGroupCode) with 'ExchangeId', 'EtdContractGroupCode'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractGroupId EtdContractGroupId.of(ExchangeId, EtdContractGroupCode)"})
  void testOfWithExchangeIdEtdContractGroupCode() {
    // Arrange
    ExchangeId exchangeId = ExchangeIds.ECAG;
    EtdContractGroupCode contractGroupCode = EtdContractGroupCode.of("Name");

    // Act
    EtdContractGroupId actualOfResult = EtdContractGroupId.of(exchangeId, contractGroupCode);

    // Assert
    assertSame(contractGroupCode, actualOfResult.getCode());
    assertSame(exchangeId, actualOfResult.getExchangeId());
  }

  /**
   * Test {@link EtdContractGroupId#of(String, String)} with {@code String}, {@code String}.
   *
   * <ul>
   *   <li>When {@code Contract Group Code}.
   *   <li>Then return ExchangeId Name is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractGroupId#of(String, String)}
   */
  @Test
  @DisplayName(
      "Test of(String, String) with 'String', 'String'; when 'Contract Group Code'; then return ExchangeId Name is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractGroupId EtdContractGroupId.of(String, String)"})
  void testOfWithStringString_whenContractGroupCode_thenReturnExchangeIdNameIs42() {
    // Arrange and Act
    EtdContractGroupId actualOfResult = EtdContractGroupId.of("42", "Contract Group Code");

    // Assert
    ExchangeId exchangeId = actualOfResult.getExchangeId();
    assertEquals("42", exchangeId.getName());
    assertEquals("42", exchangeId.toString());
    EtdContractGroupCode code = actualOfResult.getCode();
    assertEquals("Contract Group Code", code.getName());
    assertEquals("Contract Group Code", code.toString());
  }

  /**
   * Test {@link EtdContractGroupId#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractGroupId#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Str'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractGroupId EtdContractGroupId.parse(String)"})
  void testParse_whenStr_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> EtdContractGroupId.parse("Str"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EtdContractGroupId#toString()}
   *   <li>{@link EtdContractGroupId#getCode()}
   *   <li>{@link EtdContractGroupId#getExchangeId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "EtdContractGroupCode EtdContractGroupId.getCode()",
    "ExchangeId EtdContractGroupId.getExchangeId()",
    "String EtdContractGroupId.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    EtdContractGroupCode contractGroupCode = EtdContractGroupCode.of("Name");
    EtdContractGroupId ofResult = EtdContractGroupId.of(ExchangeIds.ECAG, contractGroupCode);

    // Act
    String actualToStringResult = ofResult.toString();
    EtdContractGroupCode actualCode = ofResult.getCode();
    ExchangeId actualExchangeId = ofResult.getExchangeId();

    // Assert
    assertEquals("ECAG", actualExchangeId.getName());
    assertEquals("ECAG", actualExchangeId.toString());
    assertEquals("ECAG::Name", actualToStringResult);
    assertSame(contractGroupCode, actualCode);
  }

  /**
   * Test {@link EtdContractGroupId#equals(Object)}, and {@link EtdContractGroupId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EtdContractGroupId#equals(Object)}
   *   <li>{@link EtdContractGroupId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EtdContractGroupId.equals(Object)",
    "int EtdContractGroupId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    EtdContractGroupId ofResult =
        EtdContractGroupId.of(ExchangeIds.ECAG, EtdContractGroupCode.of("Name"));
    EtdContractGroupId ofResult2 =
        EtdContractGroupId.of(ExchangeIds.ECAG, EtdContractGroupCode.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link EtdContractGroupId#equals(Object)}, and {@link EtdContractGroupId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EtdContractGroupId#equals(Object)}
   *   <li>{@link EtdContractGroupId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EtdContractGroupId.equals(Object)",
    "int EtdContractGroupId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    EtdContractGroupId ofResult =
        EtdContractGroupId.of(ExchangeIds.ECAG, EtdContractGroupCode.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link EtdContractGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EtdContractGroupId.equals(Object)",
    "int EtdContractGroupId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        EtdContractGroupId.of(ExchangeIds.ECAG, EtdContractGroupCode.of("Name")), ProductType.BILL);
  }

  /**
   * Test {@link EtdContractGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EtdContractGroupId.equals(Object)",
    "int EtdContractGroupId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    EtdContractGroupId ofResult =
        EtdContractGroupId.of(ExchangeIds.HUDX, EtdContractGroupCode.of("Name"));

    // Act and Assert
    assertNotEquals(
        ofResult, EtdContractGroupId.of(ExchangeIds.ECAG, EtdContractGroupCode.of("Name")));
  }

  /**
   * Test {@link EtdContractGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EtdContractGroupId.equals(Object)",
    "int EtdContractGroupId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    EtdContractGroupId ofResult =
        EtdContractGroupId.of(ExchangeIds.ECAG, EtdContractGroupCode.of("42"));

    // Act and Assert
    assertNotEquals(
        ofResult, EtdContractGroupId.of(ExchangeIds.ECAG, EtdContractGroupCode.of("Name")));
  }

  /**
   * Test {@link EtdContractGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EtdContractGroupId.equals(Object)",
    "int EtdContractGroupId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(EtdContractGroupId.of(ExchangeIds.ECAG, EtdContractGroupCode.of("Name")), null);
  }

  /**
   * Test {@link EtdContractGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EtdContractGroupId.equals(Object)",
    "int EtdContractGroupId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        EtdContractGroupId.of(ExchangeIds.ECAG, EtdContractGroupCode.of("Name")),
        "Different type to EtdContractGroupId");
  }
}
