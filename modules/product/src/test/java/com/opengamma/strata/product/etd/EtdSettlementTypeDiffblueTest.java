package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdSettlementTypeDiffblueTest {
  /**
   * Test {@link EtdSettlementType#of(String)}.
   *
   * <ul>
   *   <li>When {@code ALTERNATE}.
   *   <li>Then return {@code ALTERNATE}.
   * </ul>
   *
   * <p>Method under test: {@link EtdSettlementType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'ALTERNATE'; then return 'ALTERNATE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType EtdSettlementType.of(String)"})
  void testOf_whenAlternate_thenReturnAlternate() {
    // Arrange, Act and Assert
    assertEquals(EtdSettlementType.ALTERNATE, EtdSettlementType.of("ALTERNATE"));
  }

  /**
   * Test {@link EtdSettlementType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then return {@code ALTERNATE}.
   * </ul>
   *
   * <p>Method under test: {@link EtdSettlementType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'A'; then return 'ALTERNATE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType EtdSettlementType.parseCode(String)"})
  void testParseCode_whenA_thenReturnAlternate() {
    // Arrange, Act and Assert
    assertEquals(EtdSettlementType.ALTERNATE, EtdSettlementType.parseCode("A"));
  }

  /**
   * Test {@link EtdSettlementType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code C}.
   *   <li>Then return {@code CASH}.
   * </ul>
   *
   * <p>Method under test: {@link EtdSettlementType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'C'; then return 'CASH'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType EtdSettlementType.parseCode(String)"})
  void testParseCode_whenC_thenReturnCash() {
    // Arrange, Act and Assert
    assertEquals(EtdSettlementType.CASH, EtdSettlementType.parseCode("C"));
  }

  /**
   * Test {@link EtdSettlementType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code Code}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link EtdSettlementType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'Code'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType EtdSettlementType.parseCode(String)"})
  void testParseCode_whenCode_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> EtdSettlementType.parseCode("Code"));
  }

  /**
   * Test {@link EtdSettlementType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code D}.
   *   <li>Then return {@code DERIVATIVE}.
   * </ul>
   *
   * <p>Method under test: {@link EtdSettlementType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'D'; then return 'DERIVATIVE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType EtdSettlementType.parseCode(String)"})
  void testParseCode_whenD_thenReturnDerivative() {
    // Arrange, Act and Assert
    assertEquals(EtdSettlementType.DERIVATIVE, EtdSettlementType.parseCode("D"));
  }

  /**
   * Test {@link EtdSettlementType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code E}.
   *   <li>Then return {@code PHYSICAL}.
   * </ul>
   *
   * <p>Method under test: {@link EtdSettlementType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'E'; then return 'PHYSICAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType EtdSettlementType.parseCode(String)"})
  void testParseCode_whenE_thenReturnPhysical() {
    // Arrange, Act and Assert
    assertEquals(EtdSettlementType.PHYSICAL, EtdSettlementType.parseCode("E"));
  }

  /**
   * Test {@link EtdSettlementType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code N}.
   *   <li>Then return {@code NOTIONAL}.
   * </ul>
   *
   * <p>Method under test: {@link EtdSettlementType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'N'; then return 'NOTIONAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType EtdSettlementType.parseCode(String)"})
  void testParseCode_whenN_thenReturnNotional() {
    // Arrange, Act and Assert
    assertEquals(EtdSettlementType.NOTIONAL, EtdSettlementType.parseCode("N"));
  }

  /**
   * Test {@link EtdSettlementType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code P}.
   *   <li>Then return {@code PAYMENT_VS_PAYMENT}.
   * </ul>
   *
   * <p>Method under test: {@link EtdSettlementType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'P'; then return 'PAYMENT_VS_PAYMENT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType EtdSettlementType.parseCode(String)"})
  void testParseCode_whenP_thenReturnPaymentVsPayment() {
    // Arrange, Act and Assert
    assertEquals(EtdSettlementType.PAYMENT_VS_PAYMENT, EtdSettlementType.parseCode("P"));
  }

  /**
   * Test {@link EtdSettlementType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code S}.
   *   <li>Then return {@code STOCK}.
   * </ul>
   *
   * <p>Method under test: {@link EtdSettlementType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'S'; then return 'STOCK'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType EtdSettlementType.parseCode(String)"})
  void testParseCode_whenS_thenReturnStock() {
    // Arrange, Act and Assert
    assertEquals(EtdSettlementType.STOCK, EtdSettlementType.parseCode("S"));
  }

  /**
   * Test {@link EtdSettlementType#parseCode(String)}.
   *
   * <ul>
   *   <li>When {@code T}.
   *   <li>Then return {@code CASCADE}.
   * </ul>
   *
   * <p>Method under test: {@link EtdSettlementType#parseCode(String)}
   */
  @Test
  @DisplayName("Test parseCode(String); when 'T'; then return 'CASCADE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType EtdSettlementType.parseCode(String)"})
  void testParseCode_whenT_thenReturnCascade() {
    // Arrange, Act and Assert
    assertEquals(EtdSettlementType.CASCADE, EtdSettlementType.parseCode("T"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EtdSettlementType#toString()}
   *   <li>{@link EtdSettlementType#getCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String EtdSettlementType.getCode()", "String EtdSettlementType.toString()"})
  void testGettersAndSetters() {
    // Arrange
    EtdSettlementType valueOfResult = EtdSettlementType.valueOf("CASH");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("C", valueOfResult.getCode());
    assertEquals("Cash", actualToStringResult);
  }
}
