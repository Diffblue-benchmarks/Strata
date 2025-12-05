package com.opengamma.strata.basics.value;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.NoRounding.Meta;
import com.opengamma.strata.collect.Decimal;
import java.math.BigDecimal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NoRoundingDiffblueTest {
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
    Class<? extends NoRounding> actualBeanTypeResult = NoRounding.meta().beanType();

    // Assert
    Class<NoRounding> expectedBeanTypeResult = NoRounding.class;
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
    assertTrue(NoRounding.meta().metaPropertyMap().isEmpty());
  }

  /**
   * Test {@link NoRounding#round(BigDecimal)} with {@code BigDecimal}.
   *
   * <p>Method under test: {@link NoRounding#round(BigDecimal)}
   */
  @Test
  @DisplayName("Test round(BigDecimal) with 'BigDecimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal NoRounding.round(BigDecimal)"})
  void testRoundWithBigDecimal() {
    // Arrange and Act
    BigDecimal actualRoundResult = NoRounding.INSTANCE.round(new BigDecimal("2.3"));

    // Assert
    assertEquals(new BigDecimal("2.3"), actualRoundResult);
  }

  /**
   * Test {@link NoRounding#round(Decimal)} with {@code Decimal}.
   *
   * <p>Method under test: {@link NoRounding#round(Decimal)}
   */
  @Test
  @DisplayName("Test round(Decimal) with 'Decimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal NoRounding.round(Decimal)"})
  void testRoundWithDecimal() {
    // Arrange
    Decimal value = Decimal.of(42L);

    // Act
    Decimal actualRoundResult = NoRounding.INSTANCE.round(value);

    // Assert
    assertSame(value, actualRoundResult);
  }

  /**
   * Test {@link NoRounding#round(double)} with {@code double}.
   *
   * <p>Method under test: {@link NoRounding#round(double)}
   */
  @Test
  @DisplayName("Test round(double) with 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NoRounding.round(double)"})
  void testRoundWithDouble() {
    // Arrange, Act and Assert
    assertEquals(10.0d, NoRounding.INSTANCE.round(10.0d));
  }

  /**
   * Test {@link NoRounding#toString()}.
   *
   * <p>Method under test: {@link NoRounding#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String NoRounding.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("No rounding", NoRounding.INSTANCE.toString());
  }

  /**
   * Test {@link NoRounding#meta()}.
   *
   * <p>Method under test: {@link NoRounding#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta NoRounding.meta()"})
  void testMeta() {
    // Arrange, Act and Assert
    assertTrue(NoRounding.meta().isBuildable());
  }

  /**
   * Test {@link NoRounding#metaBean()}.
   *
   * <p>Method under test: {@link NoRounding#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta NoRounding.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    Meta actualMetaBeanResult = NoRounding.INSTANCE.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult.isBuildable());
    assertSame(Meta.INSTANCE, actualMetaBeanResult);
  }

  /**
   * Test {@link NoRounding#equals(Object)}, and {@link NoRounding#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NoRounding#equals(Object)}
   *   <li>{@link NoRounding#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NoRounding.equals(Object)", "int NoRounding.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    NoRounding noRounding = NoRounding.INSTANCE;
    NoRounding noRounding2 = NoRounding.INSTANCE;

    // Act and Assert
    assertEquals(noRounding, noRounding2);
    assertEquals(noRounding.hashCode(), noRounding2.hashCode());
  }

  /**
   * Test {@link NoRounding#equals(Object)}, and {@link NoRounding#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NoRounding#equals(Object)}
   *   <li>{@link NoRounding#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NoRounding.equals(Object)", "int NoRounding.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    NoRounding noRounding = NoRounding.INSTANCE;

    // Act and Assert
    assertEquals(noRounding, noRounding);
    int expectedHashCodeResult = noRounding.hashCode();
    assertEquals(expectedHashCodeResult, noRounding.hashCode());
  }

  /**
   * Test {@link NoRounding#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NoRounding#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NoRounding.equals(Object)", "int NoRounding.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NoRounding.INSTANCE, 1);
  }

  /**
   * Test {@link NoRounding#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NoRounding#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NoRounding.equals(Object)", "int NoRounding.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NoRounding.INSTANCE, null);
  }

  /**
   * Test {@link NoRounding#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NoRounding#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NoRounding.equals(Object)", "int NoRounding.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NoRounding.INSTANCE, "Different type to NoRounding");
  }
}
