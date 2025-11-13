package com.opengamma.strata.pricer.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.pricer.impl.volatility.smile.SabrHaganVolatilityFunctionProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrVolatilityFormulaDiffblueTest {
  /**
   * Test {@link SabrVolatilityFormula#hagan()}.
   *
   * <p>Method under test: {@link SabrVolatilityFormula#hagan()}
   */
  @Test
  @DisplayName("Test hagan()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SabrVolatilityFormula SabrVolatilityFormula.hagan()"})
  void testHagan() {
    // Arrange and Act
    SabrVolatilityFormula actualHaganResult = SabrVolatilityFormula.hagan();

    // Assert
    assertTrue(actualHaganResult instanceof SabrHaganVolatilityFunctionProvider);
    ValueType volatilityType = actualHaganResult.getVolatilityType();
    assertEquals("BlackVolatility", volatilityType.getName());
    assertEquals("BlackVolatility", volatilityType.toString());
  }
}
