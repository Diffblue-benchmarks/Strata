package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdContractCodeDiffblueTest {
  /**
   * Test {@link EtdContractCode#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractCode#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractCode EtdContractCode.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    EtdContractCode actualOfResult = EtdContractCode.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
  }
}
