package com.opengamma.strata.pricer.fxopt;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.market.option.Strike;
import com.opengamma.strata.pricer.fxopt.FxVolatilitySurfaceYearFractionParameterMetadata.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxVolatilitySurfaceYearFractionParameterMetadataDiffblueTest {
  /**
   * Test {@link FxVolatilitySurfaceYearFractionParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link FxVolatilitySurfaceYearFractionParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxVolatilitySurfaceYearFractionParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FxVolatilitySurfaceYearFractionParameterMetadata.meta();

    // Assert
    assertTrue(actualMetaResult.currencyPair() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.label() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.strike() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yearFraction() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yearFractionTenor() instanceof DirectMetaProperty);
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
    Class<? extends FxVolatilitySurfaceYearFractionParameterMetadata> actualBeanTypeResult =
        FxVolatilitySurfaceYearFractionParameterMetadata.meta().beanType();

    // Assert
    Class<FxVolatilitySurfaceYearFractionParameterMetadata> expectedBeanTypeResult =
        FxVolatilitySurfaceYearFractionParameterMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currencyPair()}
   *   <li>{@link Meta#label()}
   *   <li>{@link Meta#strike()}
   *   <li>{@link Meta#yearFraction()}
   *   <li>{@link Meta#yearFractionTenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.currencyPair()",
    "MetaProperty Meta.label()",
    "MetaProperty Meta.strike()",
    "MetaProperty Meta.yearFraction()",
    "MetaProperty Meta.yearFractionTenor()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FxVolatilitySurfaceYearFractionParameterMetadata.meta();

    // Act
    MetaProperty<CurrencyPair> actualCurrencyPairResult = metaResult.currencyPair();
    MetaProperty<String> actualLabelResult = metaResult.label();
    MetaProperty<Strike> actualStrikeResult = metaResult.strike();
    MetaProperty<Double> actualYearFractionResult = metaResult.yearFraction();

    // Assert
    assertTrue(actualCurrencyPairResult instanceof DirectMetaProperty);
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeResult instanceof DirectMetaProperty);
    assertTrue(actualYearFractionResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yearFractionTenor() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currencyPair}.
   *   <li>Then return name is {@code currencyPair}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'currencyPair'; then return name is 'currencyPair'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrencyPair_thenReturnNameIsCurrencyPair() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxVolatilitySurfaceYearFractionParameterMetadata.meta().metaPropertyGet("currencyPair");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Strike> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> yearFractionTenorResult = ((Meta) metaBeanResult).yearFractionTenor();
    assertTrue(yearFractionTenorResult instanceof DirectMetaProperty);
    assertEquals("currencyPair", actualMetaPropertyGetResult.name());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currencyPair());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
    assertSame(metaBeanResult, yearFractionTenorResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return name is {@code label}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'label'; then return name is 'label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLabel_thenReturnNameIsLabel() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxVolatilitySurfaceYearFractionParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurrencyPair> currencyPairResult = ((Meta) metaBeanResult).currencyPair();
    assertTrue(currencyPairResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Strike> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> yearFractionTenorResult = ((Meta) metaBeanResult).yearFractionTenor();
    assertTrue(yearFractionTenorResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
    assertSame(metaBeanResult, currencyPairResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
    assertSame(metaBeanResult, yearFractionTenorResult.metaBean());
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
    assertNull(
        FxVolatilitySurfaceYearFractionParameterMetadata.meta().metaPropertyGet("Property Name"));
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
        FxVolatilitySurfaceYearFractionParameterMetadata.meta().metaPropertyGet("strike");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurrencyPair> currencyPairResult = ((Meta) metaBeanResult).currencyPair();
    assertTrue(currencyPairResult instanceof DirectMetaProperty);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> yearFractionTenorResult = ((Meta) metaBeanResult).yearFractionTenor();
    assertTrue(yearFractionTenorResult instanceof DirectMetaProperty);
    assertEquals("strike", actualMetaPropertyGetResult.name());
    Class<Strike> expectedPropertyTypeResult = Strike.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strike());
    assertSame(metaBeanResult, currencyPairResult.metaBean());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
    assertSame(metaBeanResult, yearFractionTenorResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yearFractionTenor}.
   *   <li>Then return name is {@code yearFractionTenor}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yearFractionTenor'; then return name is 'yearFractionTenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYearFractionTenor_thenReturnNameIsYearFractionTenor() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxVolatilitySurfaceYearFractionParameterMetadata.meta()
            .metaPropertyGet("yearFractionTenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurrencyPair> currencyPairResult = ((Meta) metaBeanResult).currencyPair();
    assertTrue(currencyPairResult instanceof DirectMetaProperty);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Strike> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("yearFractionTenor", actualMetaPropertyGetResult.name());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yearFractionTenor());
    assertSame(metaBeanResult, currencyPairResult.metaBean());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yearFraction'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYearFraction_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxVolatilitySurfaceYearFractionParameterMetadata.meta().metaPropertyGet("yearFraction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurrencyPair> currencyPairResult = ((Meta) metaBeanResult).currencyPair();
    assertTrue(currencyPairResult instanceof DirectMetaProperty);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Strike> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> yearFractionTenorResult = ((Meta) metaBeanResult).yearFractionTenor();
    assertTrue(yearFractionTenorResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("yearFraction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yearFraction());
    assertSame(metaBeanResult, currencyPairResult.metaBean());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, yearFractionTenorResult.metaBean());
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
        FxVolatilitySurfaceYearFractionParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("currencyPair") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("label") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("strike") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yearFraction") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yearFractionTenor") instanceof DirectMetaProperty);
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
        FxVolatilitySurfaceYearFractionParameterMetadata.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
            FxVolatilitySurfaceYearFractionParameterMetadata.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currencyPair}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currencyPair'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrencyPair_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxVolatilitySurfaceYearFractionParameterMetadata.meta()
                .propertySet(mock(Bean.class), "currencyPair", "New Value", true));
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
            FxVolatilitySurfaceYearFractionParameterMetadata.meta()
                .propertySet(mock(Bean.class), "currencyPair", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'label'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLabel_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxVolatilitySurfaceYearFractionParameterMetadata.meta()
                .propertySet(mock(Bean.class), "label", "New Value", true));
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
            FxVolatilitySurfaceYearFractionParameterMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
            FxVolatilitySurfaceYearFractionParameterMetadata.meta()
                .propertySet(mock(Bean.class), "strike", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yearFractionTenor}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yearFractionTenor'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYearFractionTenor_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxVolatilitySurfaceYearFractionParameterMetadata.meta()
                .propertySet(mock(Bean.class), "yearFractionTenor", "New Value", true));
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
            FxVolatilitySurfaceYearFractionParameterMetadata.meta()
                .propertySet(mock(Bean.class), "yearFraction", "New Value", true));
  }
}
