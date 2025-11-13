package com.opengamma.strata.product.index.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborFutureContractSpecDiffblueTest {
  /**
   * Test {@link IborFutureContractSpec#extendedEnum()}.
   *
   * <p>Method under test: {@link IborFutureContractSpec#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum IborFutureContractSpec.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<IborFutureContractSpec> actualExtendedEnumResult =
        IborFutureContractSpec.extendedEnum();

    // Assert
    ImmutableMap<String, String> alternateNamesResult = actualExtendedEnumResult.alternateNames();
    assertEquals(12, alternateNamesResult.size());
    assertEquals(
        "EUR-EURIBOR-3M-IMM-ICE", alternateNamesResult.get("EUR-EURIBOR-3M-QUARTERLY-IMM"));
    assertEquals(
        "EUR-EURIBOR-3M-IMM-ICE", alternateNamesResult.get("EUR-EURIBOR-3M-Quarterly-IMM"));
    assertEquals(
        "EUR-EURIBOR-3M-IMM-ICE-SERIAL", alternateNamesResult.get("EUR-EURIBOR-3M-MONTHLY-IMM"));
    assertEquals("GBP-LIBOR-3M-IMM-ICE", alternateNamesResult.get("GBP-LIBOR-3M-Quarterly-IMM"));
    assertEquals("USD-LIBOR-3M-IMM-CME", alternateNamesResult.get("USD-LIBOR-3M-QUARTERLY-IMM"));
    assertEquals("USD-LIBOR-3M-IMM-CME", alternateNamesResult.get("USD-LIBOR-3M-Quarterly-IMM"));
    Class<IborFutureContractSpec> expectedType = IborFutureContractSpec.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
