package com.opengamma.strata.pricer.bond;

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
import com.opengamma.strata.market.curve.RepoGroup;
import com.opengamma.strata.pricer.bond.RepoCurveZeroRateSensitivity.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RepoCurveZeroRateSensitivityDiffblueTest {
  /**
   * Test {@link RepoCurveZeroRateSensitivity#meta()}.
   *
   * <p>Method under test: {@link RepoCurveZeroRateSensitivity#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RepoCurveZeroRateSensitivity.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = RepoCurveZeroRateSensitivity.meta();

    // Assert
    assertTrue(actualMetaResult.currency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.curveCurrency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.repoGroup() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.sensitivity() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yearFraction() instanceof DirectMetaProperty);
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
    Class<? extends RepoCurveZeroRateSensitivity> actualBeanTypeResult =
        RepoCurveZeroRateSensitivity.meta().beanType();

    // Assert
    Class<RepoCurveZeroRateSensitivity> expectedBeanTypeResult = RepoCurveZeroRateSensitivity.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#curveCurrency()}
   *   <li>{@link Meta#repoGroup()}
   *   <li>{@link Meta#sensitivity()}
   *   <li>{@link Meta#yearFraction()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.curveCurrency()",
    "MetaProperty Meta.repoGroup()",
    "MetaProperty Meta.sensitivity()",
    "MetaProperty Meta.yearFraction()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RepoCurveZeroRateSensitivity.meta();

    // Act
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<Currency> actualCurveCurrencyResult = metaResult.curveCurrency();
    MetaProperty<RepoGroup> actualRepoGroupResult = metaResult.repoGroup();
    MetaProperty<Double> actualSensitivityResult = metaResult.sensitivity();

    // Assert
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualCurveCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualRepoGroupResult instanceof DirectMetaProperty);
    assertTrue(actualSensitivityResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yearFraction() instanceof DirectMetaProperty);
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
        RepoCurveZeroRateSensitivity.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> curveCurrencyResult = ((Meta) metaBeanResult).curveCurrency();
    assertTrue(curveCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<RepoGroup> repoGroupResult = ((Meta) metaBeanResult).repoGroup();
    assertTrue(repoGroupResult instanceof DirectMetaProperty);
    MetaProperty<Double> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
    assertSame(metaBeanResult, curveCurrencyResult.metaBean());
    assertSame(metaBeanResult, repoGroupResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code curveCurrency}.
   *   <li>Then return name is {@code curveCurrency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'curveCurrency'; then return name is 'curveCurrency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurveCurrency_thenReturnNameIsCurveCurrency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RepoCurveZeroRateSensitivity.meta().metaPropertyGet("curveCurrency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<RepoGroup> repoGroupResult = ((Meta) metaBeanResult).repoGroup();
    assertTrue(repoGroupResult instanceof DirectMetaProperty);
    MetaProperty<Double> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("curveCurrency", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).curveCurrency());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, repoGroupResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
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
    assertNull(RepoCurveZeroRateSensitivity.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code repoGroup}.
   *   <li>Then return name is {@code repoGroup}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'repoGroup'; then return name is 'repoGroup'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRepoGroup_thenReturnNameIsRepoGroup() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RepoCurveZeroRateSensitivity.meta().metaPropertyGet("repoGroup");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<Currency> curveCurrencyResult = ((Meta) metaBeanResult).curveCurrency();
    assertTrue(curveCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("repoGroup", actualMetaPropertyGetResult.name());
    Class<RepoGroup> expectedPropertyTypeResult = RepoGroup.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).repoGroup());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, curveCurrencyResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
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
        RepoCurveZeroRateSensitivity.meta().metaPropertyGet("sensitivity");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<Currency> curveCurrencyResult = ((Meta) metaBeanResult).curveCurrency();
    assertTrue(curveCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<RepoGroup> repoGroupResult = ((Meta) metaBeanResult).repoGroup();
    assertTrue(repoGroupResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("sensitivity", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).sensitivity());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, curveCurrencyResult.metaBean());
    assertSame(metaBeanResult, repoGroupResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then return name is {@code yearFraction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yearFraction'; then return name is 'yearFraction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYearFraction_thenReturnNameIsYearFraction() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RepoCurveZeroRateSensitivity.meta().metaPropertyGet("yearFraction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<Currency> curveCurrencyResult = ((Meta) metaBeanResult).curveCurrency();
    assertTrue(curveCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<RepoGroup> repoGroupResult = ((Meta) metaBeanResult).repoGroup();
    assertTrue(repoGroupResult instanceof DirectMetaProperty);
    MetaProperty<Double> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    assertEquals("yearFraction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yearFraction());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, curveCurrencyResult.metaBean());
    assertSame(metaBeanResult, repoGroupResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
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
        RepoCurveZeroRateSensitivity.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("curveCurrency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("repoGroup") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("sensitivity") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yearFraction") instanceof DirectMetaProperty);
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
        RepoCurveZeroRateSensitivity.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            RepoCurveZeroRateSensitivity.meta()
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
            RepoCurveZeroRateSensitivity.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code curveCurrency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'curveCurrency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurveCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RepoCurveZeroRateSensitivity.meta()
                .propertySet(mock(Bean.class), "curveCurrency", "New Value", true));
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
            RepoCurveZeroRateSensitivity.meta()
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
            RepoCurveZeroRateSensitivity.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code repoGroup}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'repoGroup'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRepoGroup_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RepoCurveZeroRateSensitivity.meta()
                .propertySet(mock(Bean.class), "repoGroup", "New Value", true));
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
            RepoCurveZeroRateSensitivity.meta()
                .propertySet(mock(Bean.class), "sensitivity", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yearFraction'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYearFraction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RepoCurveZeroRateSensitivity.meta()
                .propertySet(mock(Bean.class), "yearFraction", "New Value", true));
  }
}
