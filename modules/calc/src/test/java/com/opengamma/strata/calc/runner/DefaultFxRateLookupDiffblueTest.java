package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.data.ObservableSource;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultFxRateLookupDiffblueTest {
  /**
   * Test {@link DefaultFxRateLookup#DefaultFxRateLookup(Currency, ObservableSource)}.
   *
   * <ul>
   *   <li>Then return not Currency Present.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxRateLookup#DefaultFxRateLookup(Currency,
   * ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test new DefaultFxRateLookup(Currency, ObservableSource); then return not Currency Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultFxRateLookup.<init>(Currency, ObservableSource)"})
  void testNewDefaultFxRateLookup_thenReturnNotCurrencyPresent() {
    // Arrange
    ObservableSource observableSource = ObservableSource.of("Name");

    // Act
    DefaultFxRateLookup actualDefaultFxRateLookup = new DefaultFxRateLookup(null, observableSource);

    // Assert
    assertFalse(actualDefaultFxRateLookup.getCurrency().isPresent());
    assertSame(observableSource, actualDefaultFxRateLookup.getObservableSource());
  }

  /**
   * Test {@link DefaultFxRateLookup#DefaultFxRateLookup(ObservableSource)}.
   *
   * <ul>
   *   <li>Then return not Currency Present.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxRateLookup#DefaultFxRateLookup(ObservableSource)}
   */
  @Test
  @DisplayName("Test new DefaultFxRateLookup(ObservableSource); then return not Currency Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultFxRateLookup.<init>(ObservableSource)"})
  void testNewDefaultFxRateLookup_thenReturnNotCurrencyPresent2() {
    // Arrange
    ObservableSource observableSource = ObservableSource.of("Name");

    // Act
    DefaultFxRateLookup actualDefaultFxRateLookup = new DefaultFxRateLookup(observableSource);

    // Assert
    assertFalse(actualDefaultFxRateLookup.getCurrency().isPresent());
    assertSame(observableSource, actualDefaultFxRateLookup.getObservableSource());
  }

  /**
   * Test {@link DefaultFxRateLookup#metaBean()}.
   *
   * <p>Method under test: {@link DefaultFxRateLookup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultFxRateLookup.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<DefaultFxRateLookup> actualMetaBeanResult =
        DefaultFxRateLookup.DEFAULT.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("currency"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultFxRateLookup> expectedBeanTypeResult = DefaultFxRateLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link DefaultFxRateLookup#meta()}.
   *
   * <p>Method under test: {@link DefaultFxRateLookup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultFxRateLookup.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultFxRateLookup> actualMetaResult = DefaultFxRateLookup.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("currency"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultFxRateLookup> expectedBeanTypeResult = DefaultFxRateLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultFxRateLookup#getCurrency()}.
   *
   * <p>Method under test: {@link DefaultFxRateLookup#getCurrency()}
   */
  @Test
  @DisplayName("Test getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional DefaultFxRateLookup.getCurrency()"})
  void testGetCurrency() {
    // Arrange, Act and Assert
    assertFalse(DefaultFxRateLookup.DEFAULT.getCurrency().isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultFxRateLookup#toString()}
   *   <li>{@link DefaultFxRateLookup#getObservableSource()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ObservableSource DefaultFxRateLookup.getObservableSource()",
    "String DefaultFxRateLookup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ObservableSource observableSource = ObservableSource.of("Name");
    DefaultFxRateLookup defaultFxRateLookup = new DefaultFxRateLookup(observableSource);

    // Act
    String actualToStringResult = defaultFxRateLookup.toString();

    // Assert
    assertEquals("DefaultFxRateLookup{currency=null, observableSource=Name}", actualToStringResult);
    assertSame(observableSource, defaultFxRateLookup.getObservableSource());
  }

  /**
   * Test {@link DefaultFxRateLookup#equals(Object)}, and {@link DefaultFxRateLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultFxRateLookup#equals(Object)}
   *   <li>{@link DefaultFxRateLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultFxRateLookup.equals(Object)",
    "int DefaultFxRateLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultFxRateLookup defaultFxRateLookup = DefaultFxRateLookup.DEFAULT;
    DefaultFxRateLookup defaultFxRateLookup2 = DefaultFxRateLookup.DEFAULT;

    // Act and Assert
    assertEquals(defaultFxRateLookup, defaultFxRateLookup2);
    assertEquals(defaultFxRateLookup.hashCode(), defaultFxRateLookup2.hashCode());
  }

  /**
   * Test {@link DefaultFxRateLookup#equals(Object)}, and {@link DefaultFxRateLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultFxRateLookup#equals(Object)}
   *   <li>{@link DefaultFxRateLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultFxRateLookup.equals(Object)",
    "int DefaultFxRateLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    DefaultFxRateLookup defaultFxRateLookup = new DefaultFxRateLookup(ObservableSource.of("Name"));
    DefaultFxRateLookup defaultFxRateLookup2 = new DefaultFxRateLookup(ObservableSource.of("Name"));

    // Act and Assert
    assertEquals(defaultFxRateLookup, defaultFxRateLookup2);
    assertEquals(defaultFxRateLookup.hashCode(), defaultFxRateLookup2.hashCode());
  }

  /**
   * Test {@link DefaultFxRateLookup#equals(Object)}, and {@link DefaultFxRateLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultFxRateLookup#equals(Object)}
   *   <li>{@link DefaultFxRateLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultFxRateLookup.equals(Object)",
    "int DefaultFxRateLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultFxRateLookup defaultFxRateLookup = DefaultFxRateLookup.DEFAULT;

    // Act and Assert
    assertEquals(defaultFxRateLookup, defaultFxRateLookup);
    int expectedHashCodeResult = defaultFxRateLookup.hashCode();
    assertEquals(expectedHashCodeResult, defaultFxRateLookup.hashCode());
  }

  /**
   * Test {@link DefaultFxRateLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxRateLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultFxRateLookup.equals(Object)",
    "int DefaultFxRateLookup.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new DefaultFxRateLookup(ObservableSource.of("Name")), DefaultFxRateLookup.DEFAULT);
  }

  /**
   * Test {@link DefaultFxRateLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxRateLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultFxRateLookup.equals(Object)",
    "int DefaultFxRateLookup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DefaultFxRateLookup.DEFAULT, null);
  }

  /**
   * Test {@link DefaultFxRateLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxRateLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultFxRateLookup.equals(Object)",
    "int DefaultFxRateLookup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DefaultFxRateLookup.DEFAULT, "Different type to DefaultFxRateLookup");
  }
}
