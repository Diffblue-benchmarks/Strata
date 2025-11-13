package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.common.PutCall;
import java.time.Month;
import java.time.YearMonth;
import java.util.Map;
import java.util.Optional;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SplitEtdOptionDiffblueTest {
  /**
   * Test {@link SplitEtdOption#of(int, PutCall, double, YearMonth)} with {@code version}, {@code
   * putCall}, {@code strikePrice}, {@code underlyingExpiryMonth}.
   *
   * <ul>
   *   <li>Then return Version is one.
   * </ul>
   *
   * <p>Method under test: {@link SplitEtdOption#of(int, PutCall, double, YearMonth)}
   */
  @Test
  @DisplayName(
      "Test of(int, PutCall, double, YearMonth) with 'version', 'putCall', 'strikePrice', 'underlyingExpiryMonth'; then return Version is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SplitEtdOption SplitEtdOption.of(int, PutCall, double, YearMonth)"})
  void testOfWithVersionPutCallStrikePriceUnderlyingExpiryMonth_thenReturnVersionIsOne() {
    // Arrange
    YearMonth underlyingExpiryMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    SplitEtdOption actualOfResult = SplitEtdOption.of(1, PutCall.PUT, 10.0d, underlyingExpiryMonth);

    // Assert
    assertEquals(1, actualOfResult.getVersion());
    assertEquals(10.0d, actualOfResult.getStrikePrice());
    assertEquals(PutCall.PUT, actualOfResult.getPutCall());
    Optional<YearMonth> underlyingExpiryMonth2 = actualOfResult.getUnderlyingExpiryMonth();
    assertTrue(underlyingExpiryMonth2.isPresent());
    assertSame(underlyingExpiryMonth, underlyingExpiryMonth2.get());
  }

  /**
   * Test {@link SplitEtdOption#of(int, PutCall, double)} with {@code version}, {@code putCall},
   * {@code strikePrice}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Version is one.
   * </ul>
   *
   * <p>Method under test: {@link SplitEtdOption#of(int, PutCall, double)}
   */
  @Test
  @DisplayName(
      "Test of(int, PutCall, double) with 'version', 'putCall', 'strikePrice'; when one; then return Version is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SplitEtdOption SplitEtdOption.of(int, PutCall, double)"})
  void testOfWithVersionPutCallStrikePrice_whenOne_thenReturnVersionIsOne() {
    // Arrange and Act
    SplitEtdOption actualOfResult = SplitEtdOption.of(1, PutCall.PUT, 10.0d);

    // Assert
    assertEquals(1, actualOfResult.getVersion());
    assertEquals(10.0d, actualOfResult.getStrikePrice());
    assertEquals(PutCall.PUT, actualOfResult.getPutCall());
    assertFalse(actualOfResult.getUnderlyingExpiryMonth().isPresent());
  }

  /**
   * Test {@link SplitEtdOption#meta()}.
   *
   * <p>Method under test: {@link SplitEtdOption#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SplitEtdOption.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SplitEtdOption> actualMetaResult = SplitEtdOption.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("putCall"));
    assertTrue(metaPropertyMapResult.containsKey("strikePrice"));
    assertTrue(metaPropertyMapResult.containsKey("underlyingExpiryMonth"));
    assertTrue(metaPropertyMapResult.containsKey("version"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SplitEtdOption> expectedBeanTypeResult = SplitEtdOption.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SplitEtdOption#metaBean()}.
   *
   * <p>Method under test: {@link SplitEtdOption#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SplitEtdOption.metaBean()"})
  void testMetaBean() {
    // Arrange
    SplitEtdOption ofResult = SplitEtdOption.of(1, PutCall.PUT, 10.0d);

    // Act
    TypedMetaBean<SplitEtdOption> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("putCall"));
    assertTrue(metaPropertyMapResult.containsKey("strikePrice"));
    assertTrue(metaPropertyMapResult.containsKey("underlyingExpiryMonth"));
    assertTrue(metaPropertyMapResult.containsKey("version"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SplitEtdOption> expectedBeanTypeResult = SplitEtdOption.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SplitEtdOption#toString()}
   *   <li>{@link SplitEtdOption#getPutCall()}
   *   <li>{@link SplitEtdOption#getStrikePrice()}
   *   <li>{@link SplitEtdOption#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PutCall SplitEtdOption.getPutCall()",
    "double SplitEtdOption.getStrikePrice()",
    "int SplitEtdOption.getVersion()",
    "String SplitEtdOption.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SplitEtdOption ofResult = SplitEtdOption.of(1, PutCall.PUT, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    PutCall actualPutCall = ofResult.getPutCall();
    double actualStrikePrice = ofResult.getStrikePrice();

    // Assert
    assertEquals(
        "SplitEtdOption{version=1, putCall=Put, strikePrice=10.0, underlyingExpiryMonth=null}",
        actualToStringResult);
    assertEquals(1, ofResult.getVersion());
    assertEquals(10.0d, actualStrikePrice);
    assertEquals(PutCall.PUT, actualPutCall);
  }

  /**
   * Test {@link SplitEtdOption#getUnderlyingExpiryMonth()}.
   *
   * <p>Method under test: {@link SplitEtdOption#getUnderlyingExpiryMonth()}
   */
  @Test
  @DisplayName("Test getUnderlyingExpiryMonth()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional SplitEtdOption.getUnderlyingExpiryMonth()"})
  void testGetUnderlyingExpiryMonth() {
    // Arrange
    SplitEtdOption ofResult = SplitEtdOption.of(1, PutCall.PUT, 10.0d);

    // Act and Assert
    assertFalse(ofResult.getUnderlyingExpiryMonth().isPresent());
  }

  /**
   * Test {@link SplitEtdOption#equals(Object)}, and {@link SplitEtdOption#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SplitEtdOption#equals(Object)}
   *   <li>{@link SplitEtdOption#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SplitEtdOption.equals(Object)", "int SplitEtdOption.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SplitEtdOption ofResult = SplitEtdOption.of(1, PutCall.PUT, 10.0d);
    SplitEtdOption ofResult2 = SplitEtdOption.of(1, PutCall.PUT, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link SplitEtdOption#equals(Object)}, and {@link SplitEtdOption#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SplitEtdOption#equals(Object)}
   *   <li>{@link SplitEtdOption#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SplitEtdOption.equals(Object)", "int SplitEtdOption.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SplitEtdOption ofResult = SplitEtdOption.of(1, PutCall.PUT, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link SplitEtdOption#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SplitEtdOption#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SplitEtdOption.equals(Object)", "int SplitEtdOption.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SplitEtdOption ofResult =
        SplitEtdOption.of(1, PutCall.PUT, 10.0d, YearMonth.of(1970, Month.JANUARY));

    // Act and Assert
    assertNotEquals(ofResult, SplitEtdOption.of(1, PutCall.PUT, 10.0d));
  }

  /**
   * Test {@link SplitEtdOption#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SplitEtdOption#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SplitEtdOption.equals(Object)", "int SplitEtdOption.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SplitEtdOption ofResult = SplitEtdOption.of(0, PutCall.PUT, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, SplitEtdOption.of(1, PutCall.PUT, 10.0d));
  }

  /**
   * Test {@link SplitEtdOption#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SplitEtdOption#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SplitEtdOption.equals(Object)", "int SplitEtdOption.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SplitEtdOption ofResult = SplitEtdOption.of(1, PutCall.CALL, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, SplitEtdOption.of(1, PutCall.PUT, 10.0d));
  }

  /**
   * Test {@link SplitEtdOption#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SplitEtdOption#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SplitEtdOption.equals(Object)", "int SplitEtdOption.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    SplitEtdOption ofResult = SplitEtdOption.of(1, PutCall.PUT, 0.5d);

    // Act and Assert
    assertNotEquals(ofResult, SplitEtdOption.of(1, PutCall.PUT, 10.0d));
  }

  /**
   * Test {@link SplitEtdOption#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SplitEtdOption#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SplitEtdOption.equals(Object)", "int SplitEtdOption.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    SplitEtdOption ofResult = SplitEtdOption.of(1, PutCall.PUT, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link SplitEtdOption#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SplitEtdOption#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SplitEtdOption.equals(Object)", "int SplitEtdOption.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    SplitEtdOption ofResult = SplitEtdOption.of(1, PutCall.PUT, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to SplitEtdOption");
  }
}
