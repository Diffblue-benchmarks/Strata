package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdContractGroupCodeDiffblueTest {
  /**
   * Test {@link EtdContractGroupCode#of(String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractGroupCode#of(String)}
   */
  @Test
  @DisplayName("Test of(String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractGroupCode EtdContractGroupCode.of(String)"})
  void testOf_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            EtdContractGroupCode.of(
                "Code must only contain printable ASCII characters except ':' and '~'"));
  }

  /**
   * Test {@link EtdContractGroupCode#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link EtdContractGroupCode#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdContractGroupCode EtdContractGroupCode.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    EtdContractGroupCode actualOfResult = EtdContractGroupCode.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
  }
}
