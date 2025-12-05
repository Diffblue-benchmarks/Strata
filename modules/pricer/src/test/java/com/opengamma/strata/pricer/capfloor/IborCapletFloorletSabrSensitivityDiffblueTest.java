package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.market.model.SabrParameterType;
import com.opengamma.strata.market.sensitivity.MutablePointSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivity;
import com.opengamma.strata.pricer.capfloor.IborCapletFloorletSabrSensitivity.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborCapletFloorletSabrSensitivityDiffblueTest {
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
    Class<? extends IborCapletFloorletSabrSensitivity> actualBeanTypeResult =
        IborCapletFloorletSabrSensitivity.meta().beanType();

    // Assert
    Class<IborCapletFloorletSabrSensitivity> expectedBeanTypeResult =
        IborCapletFloorletSabrSensitivity.class;
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
   *   <li>{@link Meta#sensitivity()}
   *   <li>{@link Meta#sensitivityType()}
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
    "MetaProperty Meta.sensitivity()",
    "MetaProperty Meta.sensitivityType()",
    "MetaProperty Meta.volatilitiesName()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = IborCapletFloorletSabrSensitivity.meta();

    // Act
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<Double> actualExpiryResult = metaResult.expiry();
    MetaProperty<Double> actualSensitivityResult = metaResult.sensitivity();
    MetaProperty<SabrParameterType> actualSensitivityTypeResult = metaResult.sensitivityType();

    // Assert
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryResult instanceof DirectMetaProperty);
    assertTrue(actualSensitivityResult instanceof DirectMetaProperty);
    assertTrue(actualSensitivityTypeResult instanceof DirectMetaProperty);
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
        IborCapletFloorletSabrSensitivity.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    MetaProperty<SabrParameterType> sensitivityTypeResult =
        ((Meta) metaBeanResult).sensitivityType();
    assertTrue(sensitivityTypeResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilitiesName> volatilitiesNameResult =
        ((Meta) metaBeanResult).volatilitiesName();
    assertTrue(volatilitiesNameResult instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
    assertSame(metaBeanResult, sensitivityTypeResult.metaBean());
    assertSame(metaBeanResult, volatilitiesNameResult.metaBean());
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
        IborCapletFloorletSabrSensitivity.meta().metaPropertyGet("expiry");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    MetaProperty<SabrParameterType> sensitivityTypeResult =
        ((Meta) metaBeanResult).sensitivityType();
    assertTrue(sensitivityTypeResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilitiesName> volatilitiesNameResult =
        ((Meta) metaBeanResult).volatilitiesName();
    assertTrue(volatilitiesNameResult instanceof DirectMetaProperty);
    assertEquals("expiry", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).expiry());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
    assertSame(metaBeanResult, sensitivityTypeResult.metaBean());
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
    assertNull(IborCapletFloorletSabrSensitivity.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code sensitivityType}.
   *   <li>Then return name is {@code sensitivityType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'sensitivityType'; then return name is 'sensitivityType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSensitivityType_thenReturnNameIsSensitivityType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborCapletFloorletSabrSensitivity.meta().metaPropertyGet("sensitivityType");

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
    MetaProperty<IborCapletFloorletVolatilitiesName> volatilitiesNameResult =
        ((Meta) metaBeanResult).volatilitiesName();
    assertTrue(volatilitiesNameResult instanceof DirectMetaProperty);
    assertEquals("sensitivityType", actualMetaPropertyGetResult.name());
    Class<SabrParameterType> expectedPropertyTypeResult = SabrParameterType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).sensitivityType());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
    assertSame(metaBeanResult, volatilitiesNameResult.metaBean());
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
        IborCapletFloorletSabrSensitivity.meta().metaPropertyGet("sensitivity");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<Double> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SabrParameterType> sensitivityTypeResult =
        ((Meta) metaBeanResult).sensitivityType();
    assertTrue(sensitivityTypeResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilitiesName> volatilitiesNameResult =
        ((Meta) metaBeanResult).volatilitiesName();
    assertTrue(volatilitiesNameResult instanceof DirectMetaProperty);
    assertEquals("sensitivity", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).sensitivity());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, sensitivityTypeResult.metaBean());
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
        IborCapletFloorletSabrSensitivity.meta().metaPropertyGet("volatilitiesName");

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
    MetaProperty<SabrParameterType> sensitivityTypeResult =
        ((Meta) metaBeanResult).sensitivityType();
    assertTrue(sensitivityTypeResult instanceof DirectMetaProperty);
    assertEquals("volatilitiesName", actualMetaPropertyGetResult.name());
    Class<IborCapletFloorletVolatilitiesName> expectedPropertyTypeResult =
        IborCapletFloorletVolatilitiesName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).volatilitiesName());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
    assertSame(metaBeanResult, sensitivityTypeResult.metaBean());
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
        IborCapletFloorletSabrSensitivity.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiry") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("sensitivity") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("sensitivityType") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("volatilitiesName") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@link IborCapletFloorletVolatilitiesName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then return IborCapletFloorletVolatilitiesName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnIborCapletFloorletVolatilitiesNameWithName() {
    // Arrange
    Meta metaResult = IborCapletFloorletSabrSensitivity.meta();
    IborCapletFloorletVolatilitiesName volatilitiesName =
        IborCapletFloorletVolatilitiesName.of("Name");
    IborCapletFloorletSabrSensitivity bean =
        IborCapletFloorletSabrSensitivity.of(
            volatilitiesName, 10.0d, SabrParameterType.ALPHA, null, 10.0d);

    // Act and Assert
    assertSame(volatilitiesName, metaResult.propertyGet(bean, "volatilitiesName", true));
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
        IborCapletFloorletSabrSensitivity.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'currency'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCurrency_thenReturnNull() {
    // Arrange
    Meta metaResult = IborCapletFloorletSabrSensitivity.meta();
    IborCapletFloorletSabrSensitivity bean =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act and Assert
    assertNull(metaResult.propertyGet(bean, "currency", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'expiry'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenExpiry_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = IborCapletFloorletSabrSensitivity.meta();
    IborCapletFloorletSabrSensitivity bean =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act and Assert
    assertEquals(10.0d, ((Double) metaResult.propertyGet(bean, "expiry", true)).doubleValue());
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
    // Arrange
    Meta metaResult = IborCapletFloorletSabrSensitivity.meta();
    IborCapletFloorletSabrSensitivity bean =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivityType}.
   *   <li>Then return {@link SabrParameterType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'sensitivityType'; then return SabrParameterType")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSensitivityType_thenReturnSabrParameterType() {
    // Arrange
    Meta metaResult = IborCapletFloorletSabrSensitivity.meta();
    IborCapletFloorletSabrSensitivity bean =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "sensitivityType", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof SabrParameterType);
    assertEquals(SabrParameterType.ALPHA, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivity}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'sensitivity'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSensitivity_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = IborCapletFloorletSabrSensitivity.meta();
    IborCapletFloorletSabrSensitivity bean =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act and Assert
    assertEquals(10.0d, ((Double) metaResult.propertyGet(bean, "sensitivity", true)).doubleValue());
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
            IborCapletFloorletSabrSensitivity.meta()
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
            IborCapletFloorletSabrSensitivity.meta()
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
            IborCapletFloorletSabrSensitivity.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", false));
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
            IborCapletFloorletSabrSensitivity.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivityType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'sensitivityType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSensitivityType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborCapletFloorletSabrSensitivity.meta()
                .propertySet(mock(Bean.class), "sensitivityType", "New Value", true));
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
            IborCapletFloorletSabrSensitivity.meta()
                .propertySet(mock(Bean.class), "sensitivity", "New Value", true));
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
            IborCapletFloorletSabrSensitivity.meta()
                .propertySet(mock(Bean.class), "volatilitiesName", "New Value", true));
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#of(IborCapletFloorletVolatilitiesName, double,
   * SabrParameterType, Currency, double)}.
   *
   * <ul>
   *   <li>When {@link IborCapletFloorletVolatilitiesName} with {@code Name}.
   *   <li>Then return Currency is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * IborCapletFloorletSabrSensitivity#of(IborCapletFloorletVolatilitiesName, double,
   * SabrParameterType, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(IborCapletFloorletVolatilitiesName, double, SabrParameterType, Currency, double); when IborCapletFloorletVolatilitiesName with 'Name'; then return Currency is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapletFloorletSabrSensitivity IborCapletFloorletSabrSensitivity.of(IborCapletFloorletVolatilitiesName, double, SabrParameterType, Currency, double)"
  })
  void testOf_whenIborCapletFloorletVolatilitiesNameWithName_thenReturnCurrencyIsNull() {
    // Arrange
    IborCapletFloorletVolatilitiesName volatilitiesName =
        IborCapletFloorletVolatilitiesName.of("Name");

    // Act
    IborCapletFloorletSabrSensitivity actualOfResult =
        IborCapletFloorletSabrSensitivity.of(
            volatilitiesName, 10.0d, SabrParameterType.ALPHA, null, 10.0d);

    // Assert
    assertNull(actualOfResult.getCurrency());
    assertEquals(10.0d, actualOfResult.getExpiry());
    assertEquals(10.0d, actualOfResult.getSensitivity());
    assertEquals(SabrParameterType.ALPHA, actualOfResult.getSensitivityType());
    assertSame(volatilitiesName, actualOfResult.getVolatilitiesName());
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#withSensitivity(double)}.
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#withSensitivity(double)}
   */
  @Test
  @DisplayName("Test withSensitivity(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapletFloorletSabrSensitivity IborCapletFloorletSabrSensitivity.withSensitivity(double)"
  })
  void testWithSensitivity() {
    // Arrange
    IborCapletFloorletSabrSensitivity ofResult =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act
    IborCapletFloorletSabrSensitivity actualWithSensitivityResult = ofResult.withSensitivity(10.0d);

    // Assert
    assertEquals(ofResult, actualWithSensitivityResult);
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#compareKey(PointSensitivity)}.
   *
   * <ul>
   *   <li>Given {@link IborCapletFloorletVolatilitiesName} with {@code name}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#compareKey(PointSensitivity)}
   */
  @Test
  @DisplayName(
      "Test compareKey(PointSensitivity); given IborCapletFloorletVolatilitiesName with 'name'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IborCapletFloorletSabrSensitivity.compareKey(PointSensitivity)"})
  void testCompareKey_givenIborCapletFloorletVolatilitiesNameWithName_thenReturnOne() {
    // Arrange
    IborCapletFloorletSabrSensitivity ofResult =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);
    IborCapletFloorletSabrSensitivity other =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act and Assert
    assertEquals(1, ofResult.compareKey(other));
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#compareKey(PointSensitivity)}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#compareKey(PointSensitivity)}
   */
  @Test
  @DisplayName("Test compareKey(PointSensitivity); then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IborCapletFloorletSabrSensitivity.compareKey(PointSensitivity)"})
  void testCompareKey_thenReturnMinusOne() {
    // Arrange
    IborCapletFloorletSabrSensitivity ofResult =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("42"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);
    IborCapletFloorletSabrSensitivity other =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act and Assert
    assertEquals(-1, ofResult.compareKey(other));
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#buildInto(MutablePointSensitivities)}.
   *
   * <ul>
   *   <li>Then {@link MutablePointSensitivities#MutablePointSensitivities()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * IborCapletFloorletSabrSensitivity#buildInto(MutablePointSensitivities)}
   */
  @Test
  @DisplayName(
      "Test buildInto(MutablePointSensitivities); then MutablePointSensitivities() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MutablePointSensitivities IborCapletFloorletSabrSensitivity.buildInto(MutablePointSensitivities)"
  })
  void testBuildInto_thenMutablePointSensitivitiesSizeIsOne() {
    // Arrange
    IborCapletFloorletSabrSensitivity ofResult =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);
    MutablePointSensitivities combination = new MutablePointSensitivities();

    // Act
    MutablePointSensitivities actualBuildIntoResult = ofResult.buildInto(combination);

    // Assert
    assertEquals(1, combination.size());
    ImmutableList<PointSensitivity> sensitivities = combination.getSensitivities();
    assertEquals(1, sensitivities.size());
    assertSame(combination, actualBuildIntoResult);
    assertSame(ofResult, sensitivities.get(0));
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#meta()}.
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborCapletFloorletSabrSensitivity.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = IborCapletFloorletSabrSensitivity.meta();

    // Assert
    assertTrue(actualMetaResult.currency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.expiry() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.sensitivity() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.sensitivityType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.volatilitiesName() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#metaBean()}.
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborCapletFloorletSabrSensitivity.metaBean()"})
  void testMetaBean() {
    // Arrange
    IborCapletFloorletSabrSensitivity ofResult =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#equals(Object)}, and {@link
   * IborCapletFloorletSabrSensitivity#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborCapletFloorletSabrSensitivity#equals(Object)}
   *   <li>{@link IborCapletFloorletSabrSensitivity#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletSabrSensitivity.equals(Object)",
    "int IborCapletFloorletSabrSensitivity.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IborCapletFloorletSabrSensitivity ofResult =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);
    IborCapletFloorletSabrSensitivity ofResult2 =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#equals(Object)}, and {@link
   * IborCapletFloorletSabrSensitivity#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborCapletFloorletSabrSensitivity#equals(Object)}
   *   <li>{@link IborCapletFloorletSabrSensitivity#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletSabrSensitivity.equals(Object)",
    "int IborCapletFloorletSabrSensitivity.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IborCapletFloorletSabrSensitivity ofResult =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletSabrSensitivity.equals(Object)",
    "int IborCapletFloorletSabrSensitivity.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d),
        1);
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletSabrSensitivity.equals(Object)",
    "int IborCapletFloorletSabrSensitivity.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    IborCapletFloorletSabrSensitivity ofResult =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d));
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletSabrSensitivity.equals(Object)",
    "int IborCapletFloorletSabrSensitivity.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    IborCapletFloorletSabrSensitivity ofResult =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            0.5d,
            SabrParameterType.ALPHA,
            null,
            10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d));
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletSabrSensitivity.equals(Object)",
    "int IborCapletFloorletSabrSensitivity.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    IborCapletFloorletSabrSensitivity ofResult =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"), 10.0d, null, null, 10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d));
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletSabrSensitivity.equals(Object)",
    "int IborCapletFloorletSabrSensitivity.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    IborCapletFloorletSabrSensitivity ofResult =
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            0.5d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d));
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletSabrSensitivity.equals(Object)",
    "int IborCapletFloorletSabrSensitivity.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d),
        null);
  }

  /**
   * Test {@link IborCapletFloorletSabrSensitivity#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletSabrSensitivity#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletSabrSensitivity.equals(Object)",
    "int IborCapletFloorletSabrSensitivity.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        IborCapletFloorletSabrSensitivity.of(
            IborCapletFloorletVolatilitiesName.of("Name"),
            10.0d,
            SabrParameterType.ALPHA,
            null,
            10.0d),
        "Different type to IborCapletFloorletSabrSensitivity");
  }
}
