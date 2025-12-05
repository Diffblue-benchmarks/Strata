package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.pricer.capfloor.IborCapletFloorletSensitivity.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborCapletFloorletSensitivityDiffblueTest {
  /**
   * Test {@link IborCapletFloorletSensitivity#meta()}.
   *
   * <p>Method under test: {@link IborCapletFloorletSensitivity#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborCapletFloorletSensitivity.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = IborCapletFloorletSensitivity.meta();

    // Assert
    assertTrue(actualMetaResult.currency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.expiry() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.forward() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.sensitivity() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.strike() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.volatilitiesName() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
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
    Class<? extends IborCapletFloorletSensitivity> actualBeanTypeResult =
        IborCapletFloorletSensitivity.meta().beanType();

    // Assert
    Class<IborCapletFloorletSensitivity> expectedBeanTypeResult =
        IborCapletFloorletSensitivity.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#expiry()}
   *   <li>{@link Meta#forward()}
   *   <li>{@link Meta#sensitivity()}
   *   <li>{@link Meta#strike()}
   *   <li>{@link Meta#volatilitiesName()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.expiry()",
    "MetaProperty Meta.forward()",
    "MetaProperty Meta.sensitivity()",
    "MetaProperty Meta.strike()",
    "MetaProperty Meta.volatilitiesName()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = IborCapletFloorletSensitivity.meta();

    // Act
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<Double> actualExpiryResult = metaResult.expiry();
    MetaProperty<Double> actualForwardResult = metaResult.forward();
    MetaProperty<Double> actualSensitivityResult = metaResult.sensitivity();
    MetaProperty<Double> actualStrikeResult = metaResult.strike();

    // Assert
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryResult instanceof DirectMetaProperty);
    assertTrue(actualForwardResult instanceof DirectMetaProperty);
    assertTrue(actualSensitivityResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.volatilitiesName() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return name is {@code currency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'currency'; then return name is 'currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrency_thenReturnNameIsCurrency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborCapletFloorletSensitivity.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).expiry() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).forward() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sensitivity() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strike() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).volatilitiesName() instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then return name is {@code expiry}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'expiry'; then return name is 'expiry'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExpiry_thenReturnNameIsExpiry() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborCapletFloorletSensitivity.meta().metaPropertyGet("expiry");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<Double> forwardResult = ((Meta) metaBeanResult).forward();
    assertTrue(forwardResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilitiesName> volatilitiesNameResult =
        ((Meta) metaBeanResult).volatilitiesName();
    assertTrue(volatilitiesNameResult instanceof DirectMetaProperty);
    assertEquals("expiry", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).expiry());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, forwardResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, volatilitiesNameResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code forward}.
   *   <li>Then return name is {@code forward}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'forward'; then return name is 'forward'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenForward_thenReturnNameIsForward() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborCapletFloorletSensitivity.meta().metaPropertyGet("forward");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<Double> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilitiesName> volatilitiesNameResult =
        ((Meta) metaBeanResult).volatilitiesName();
    assertTrue(volatilitiesNameResult instanceof DirectMetaProperty);
    assertEquals("forward", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).forward());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, volatilitiesNameResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IborCapletFloorletSensitivity.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code sensitivity}.
   *   <li>Then return name is {@code sensitivity}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'sensitivity'; then return name is 'sensitivity'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSensitivity_thenReturnNameIsSensitivity() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborCapletFloorletSensitivity.meta().metaPropertyGet("sensitivity");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<Double> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    MetaProperty<Double> forwardResult = ((Meta) metaBeanResult).forward();
    assertTrue(forwardResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilitiesName> volatilitiesNameResult =
        ((Meta) metaBeanResult).volatilitiesName();
    assertTrue(volatilitiesNameResult instanceof DirectMetaProperty);
    assertEquals("sensitivity", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).sensitivity());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, forwardResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, volatilitiesNameResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then return name is {@code strike}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'strike'; then return name is 'strike'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStrike_thenReturnNameIsStrike() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborCapletFloorletSensitivity.meta().metaPropertyGet("strike");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<Double> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    MetaProperty<Double> forwardResult = ((Meta) metaBeanResult).forward();
    assertTrue(forwardResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilitiesName> volatilitiesNameResult =
        ((Meta) metaBeanResult).volatilitiesName();
    assertTrue(volatilitiesNameResult instanceof DirectMetaProperty);
    assertEquals("strike", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strike());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, forwardResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
    assertSame(metaBeanResult, volatilitiesNameResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code volatilitiesName}.
   *   <li>Then return name is {@code volatilitiesName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'volatilitiesName'; then return name is 'volatilitiesName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenVolatilitiesName_thenReturnNameIsVolatilitiesName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborCapletFloorletSensitivity.meta().metaPropertyGet("volatilitiesName");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiry() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).forward() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sensitivity() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strike() instanceof DirectMetaProperty);
    assertEquals("volatilitiesName", actualMetaPropertyGetResult.name());
    Class<IborCapletFloorletVolatilitiesName> expectedPropertyTypeResult =
        IborCapletFloorletVolatilitiesName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).volatilitiesName());
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
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        IborCapletFloorletSensitivity.meta().metaPropertyMap();

    // Assert
    assertEquals(6, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiry") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("forward") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("sensitivity") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("strike") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("volatilitiesName") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        IborCapletFloorletSensitivity.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            IborCapletFloorletSensitivity.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborCapletFloorletSensitivity.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'expiry'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExpiry_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborCapletFloorletSensitivity.meta()
                .propertySet(mock(Bean.class), "expiry", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            IborCapletFloorletSensitivity.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code forward}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'forward'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenForward_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborCapletFloorletSensitivity.meta()
                .propertySet(mock(Bean.class), "forward", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            IborCapletFloorletSensitivity.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivity}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'sensitivity'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSensitivity_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborCapletFloorletSensitivity.meta()
                .propertySet(mock(Bean.class), "sensitivity", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'strike'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStrike_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborCapletFloorletSensitivity.meta()
                .propertySet(mock(Bean.class), "strike", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code volatilitiesName}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'volatilitiesName'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenVolatilitiesName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborCapletFloorletSensitivity.meta()
                .propertySet(mock(Bean.class), "volatilitiesName", "New Value", true));
  }
}
