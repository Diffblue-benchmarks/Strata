package com.opengamma.strata.product.swaption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.common.SettlementType;
import com.opengamma.strata.product.swaption.PhysicalSwaptionSettlement.Meta;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PhysicalSwaptionSettlementDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PhysicalSwaptionSettlement#toString()}
   *   <li>{@link PhysicalSwaptionSettlement#getSettlementType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SettlementType PhysicalSwaptionSettlement.getSettlementType()",
    "String PhysicalSwaptionSettlement.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    PhysicalSwaptionSettlement physicalSwaptionSettlement = PhysicalSwaptionSettlement.DEFAULT;

    // Act
    String actualToStringResult = physicalSwaptionSettlement.toString();

    // Assert
    assertEquals("PhysicalSwaptionSettlement{}", actualToStringResult);
    assertEquals(SettlementType.PHYSICAL, physicalSwaptionSettlement.getSettlementType());
  }

  /**
   * Test {@link PhysicalSwaptionSettlement#meta()}.
   *
   * <p>Method under test: {@link PhysicalSwaptionSettlement#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PhysicalSwaptionSettlement.meta()"})
  void testMeta() {
    // Arrange, Act and Assert
    assertTrue(PhysicalSwaptionSettlement.meta().isBuildable());
  }

  /**
   * Test {@link PhysicalSwaptionSettlement#metaBean()}.
   *
   * <p>Method under test: {@link PhysicalSwaptionSettlement#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PhysicalSwaptionSettlement.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    Meta actualMetaBeanResult = PhysicalSwaptionSettlement.DEFAULT.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult.isBuildable());
    assertSame(Meta.INSTANCE, actualMetaBeanResult);
  }

  /**
   * Test {@link PhysicalSwaptionSettlement#equals(Object)}, and {@link
   * PhysicalSwaptionSettlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PhysicalSwaptionSettlement#equals(Object)}
   *   <li>{@link PhysicalSwaptionSettlement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PhysicalSwaptionSettlement.equals(Object)",
    "int PhysicalSwaptionSettlement.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PhysicalSwaptionSettlement physicalSwaptionSettlement = PhysicalSwaptionSettlement.DEFAULT;
    PhysicalSwaptionSettlement physicalSwaptionSettlement2 = PhysicalSwaptionSettlement.DEFAULT;

    // Act and Assert
    assertEquals(physicalSwaptionSettlement, physicalSwaptionSettlement2);
    assertEquals(physicalSwaptionSettlement.hashCode(), physicalSwaptionSettlement2.hashCode());
  }

  /**
   * Test {@link PhysicalSwaptionSettlement#equals(Object)}, and {@link
   * PhysicalSwaptionSettlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PhysicalSwaptionSettlement#equals(Object)}
   *   <li>{@link PhysicalSwaptionSettlement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PhysicalSwaptionSettlement.equals(Object)",
    "int PhysicalSwaptionSettlement.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PhysicalSwaptionSettlement physicalSwaptionSettlement = PhysicalSwaptionSettlement.DEFAULT;

    // Act and Assert
    assertEquals(physicalSwaptionSettlement, physicalSwaptionSettlement);
    int expectedHashCodeResult = physicalSwaptionSettlement.hashCode();
    assertEquals(expectedHashCodeResult, physicalSwaptionSettlement.hashCode());
  }

  /**
   * Test {@link PhysicalSwaptionSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PhysicalSwaptionSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PhysicalSwaptionSettlement.equals(Object)",
    "int PhysicalSwaptionSettlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PhysicalSwaptionSettlement.DEFAULT, 1);
  }

  /**
   * Test {@link PhysicalSwaptionSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PhysicalSwaptionSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PhysicalSwaptionSettlement.equals(Object)",
    "int PhysicalSwaptionSettlement.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PhysicalSwaptionSettlement.DEFAULT, null);
  }

  /**
   * Test {@link PhysicalSwaptionSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PhysicalSwaptionSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PhysicalSwaptionSettlement.equals(Object)",
    "int PhysicalSwaptionSettlement.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        PhysicalSwaptionSettlement.DEFAULT, "Different type to PhysicalSwaptionSettlement");
  }

  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends PhysicalSwaptionSettlement> actualBeanTypeResult =
        PhysicalSwaptionSettlement.meta().beanType();

    // Assert
    Class<PhysicalSwaptionSettlement> expectedBeanTypeResult = PhysicalSwaptionSettlement.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange, Act and Assert
    assertTrue(PhysicalSwaptionSettlement.meta().metaPropertyMap().isEmpty());
  }
}
