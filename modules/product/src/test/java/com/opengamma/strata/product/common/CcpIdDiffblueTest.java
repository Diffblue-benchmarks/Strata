package com.opengamma.strata.product.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CcpIdDiffblueTest {
  /**
   * Test {@link CcpId#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link CcpId#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CcpId CcpId.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    CcpId actualOfResult = CcpId.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CcpId#getName()}
   *   <li>{@link CcpId#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CcpId.getName()", "String CcpId.toString()"})
  void testGettersAndSetters() {
    // Arrange
    CcpId ofResult = CcpId.of("Name");

    // Act
    String actualName = ofResult.getName();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Name", ofResult.toString());
  }

  /**
   * Test {@link CcpId#equals(Object)}, and {@link CcpId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CcpId#equals(Object)}
   *   <li>{@link CcpId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CcpId.equals(Object)", "int CcpId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CcpId ccpId = CcpIds.ASX;
    CcpId ccpId2 = CcpIds.ASX;

    // Act and Assert
    assertEquals(ccpId, ccpId2);
    assertEquals(ccpId.hashCode(), ccpId2.hashCode());
  }

  /**
   * Test {@link CcpId#equals(Object)}, and {@link CcpId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CcpId#equals(Object)}
   *   <li>{@link CcpId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CcpId.equals(Object)", "int CcpId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CcpId ccpId = CcpIds.ASX;

    // Act and Assert
    assertEquals(ccpId, ccpId);
    int expectedHashCodeResult = ccpId.hashCode();
    assertEquals(expectedHashCodeResult, ccpId.hashCode());
  }

  /**
   * Test {@link CcpId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CcpId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CcpId.equals(Object)", "int CcpId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CcpIds.BMD, CcpIds.ASX);
  }

  /**
   * Test {@link CcpId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CcpId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CcpId.equals(Object)", "int CcpId.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CcpIds.ASX, null);
  }

  /**
   * Test {@link CcpId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CcpId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CcpId.equals(Object)", "int CcpId.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CcpIds.ASX, "Different type to CcpId");
  }
}
