package com.opengamma.strata.calc;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.calc.CalculationRules.Meta;
import com.opengamma.strata.calc.runner.CalculationFunctions;
import com.opengamma.strata.calc.runner.CalculationParameters;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculationRulesDiffblueTest {
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
    Class<? extends CalculationRules> actualBeanTypeResult = CalculationRules.meta().beanType();

    // Assert
    Class<CalculationRules> expectedBeanTypeResult = CalculationRules.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#functions()}
   *   <li>{@link Meta#parameters()}
   *   <li>{@link Meta#reportingCurrency()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.functions()",
    "MetaProperty Meta.parameters()",
    "MetaProperty Meta.reportingCurrency()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CalculationRules.meta();

    // Act
    MetaProperty<CalculationFunctions> actualFunctionsResult = metaResult.functions();
    MetaProperty<CalculationParameters> actualParametersResult = metaResult.parameters();

    // Assert
    assertTrue(actualFunctionsResult instanceof DirectMetaProperty);
    assertTrue(actualParametersResult instanceof DirectMetaProperty);
    assertTrue(metaResult.reportingCurrency() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code functions}.
   *   <li>Then return name is {@code functions}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'functions'; then return name is 'functions'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFunctions_thenReturnNameIsFunctions() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CalculationRules.meta().metaPropertyGet("functions");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CalculationParameters> parametersResult = ((Meta) metaBeanResult).parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    MetaProperty<ReportingCurrency> reportingCurrencyResult =
        ((Meta) metaBeanResult).reportingCurrency();
    assertTrue(reportingCurrencyResult instanceof DirectMetaProperty);
    assertEquals("functions", actualMetaPropertyGetResult.name());
    Class<CalculationFunctions> expectedPropertyTypeResult = CalculationFunctions.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).functions());
    assertSame(metaBeanResult, parametersResult.metaBean());
    assertSame(metaBeanResult, reportingCurrencyResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then return name is {@code parameters}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'parameters'; then return name is 'parameters'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenParameters_thenReturnNameIsParameters() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CalculationRules.meta().metaPropertyGet("parameters");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CalculationFunctions> functionsResult = ((Meta) metaBeanResult).functions();
    assertTrue(functionsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ReportingCurrency> reportingCurrencyResult =
        ((Meta) metaBeanResult).reportingCurrency();
    assertTrue(reportingCurrencyResult instanceof DirectMetaProperty);
    assertEquals("parameters", actualMetaPropertyGetResult.name());
    Class<CalculationParameters> expectedPropertyTypeResult = CalculationParameters.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).parameters());
    assertSame(metaBeanResult, functionsResult.metaBean());
    assertSame(metaBeanResult, reportingCurrencyResult.metaBean());
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
    assertNull(CalculationRules.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code reportingCurrency}.
   *   <li>Then return name is {@code reportingCurrency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'reportingCurrency'; then return name is 'reportingCurrency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenReportingCurrency_thenReturnNameIsReportingCurrency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CalculationRules.meta().metaPropertyGet("reportingCurrency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CalculationFunctions> functionsResult = ((Meta) metaBeanResult).functions();
    assertTrue(functionsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CalculationParameters> parametersResult = ((Meta) metaBeanResult).parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    assertEquals("reportingCurrency", actualMetaPropertyGetResult.name());
    Class<ReportingCurrency> expectedPropertyTypeResult = ReportingCurrency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).reportingCurrency());
    assertSame(metaBeanResult, functionsResult.metaBean());
    assertSame(metaBeanResult, parametersResult.metaBean());
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
        CalculationRules.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("functions");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("parameters");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("reportingCurrency");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("functions", getResult.name());
    assertEquals("parameters", getResult2.name());
    assertEquals("reportingCurrency", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<CalculationRules> expectedDeclaringTypeResult = CalculationRules.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<CalculationRules> expectedDeclaringTypeResult2 = CalculationRules.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<CalculationRules> expectedDeclaringTypeResult3 = CalculationRules.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<ReportingCurrency> expectedPropertyTypeResult = ReportingCurrency.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<CalculationFunctions> expectedPropertyTypeResult2 = CalculationFunctions.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<CalculationParameters> expectedPropertyTypeResult3 = CalculationParameters.class;
    assertEquals(expectedPropertyTypeResult3, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet() {
    // Arrange
    Meta metaResult = CalculationRules.meta();
    CalculationFunctions functions = mock(CalculationFunctions.class);
    CalculationRules bean = CalculationRules.of(functions, CalculationParameters.empty());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "reportingCurrency", true);

    // Assert
    ReportingCurrency reportingCurrency = ((ReportingCurrency) actualPropertyGetResult).NATURAL;
    assertSame(reportingCurrency, bean.getReportingCurrency());
    assertSame(reportingCurrency, actualPropertyGetResult);
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
    assertNull(CalculationRules.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = CalculationRules.meta();
    CalculationFunctions functions = mock(CalculationFunctions.class);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                CalculationRules.of(functions, CalculationParameters.empty()),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code functions}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'functions'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFunctions_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = CalculationRules.meta();
    CalculationFunctions functions = mock(CalculationFunctions.class);

    // Act
    assertDoesNotThrow(
        () ->
            metaResult.propertyGet(
                CalculationRules.of(functions, CalculationParameters.empty()), "functions", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then return {@link CalculationParameters}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'parameters'; then return CalculationParameters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenParameters_thenReturnCalculationParameters() {
    // Arrange
    Meta metaResult = CalculationRules.meta();
    CalculationFunctions functions = mock(CalculationFunctions.class);
    CalculationParameters parameters = CalculationParameters.empty();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(CalculationRules.of(functions, parameters), "parameters", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof CalculationParameters);
    assertTrue(((CalculationParameters) actualPropertyGetResult).getParameters().isEmpty());
    assertSame(parameters, actualPropertyGetResult);
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
            CalculationRules.meta().propertySet(mock(Bean.class), "functions", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code functions}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'functions'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFunctions_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CalculationRules.meta().propertySet(mock(Bean.class), "functions", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'parameters'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenParameters_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CalculationRules.meta().propertySet(mock(Bean.class), "parameters", "New Value", true));
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
            CalculationRules.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code reportingCurrency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'reportingCurrency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenReportingCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CalculationRules.meta()
                .propertySet(mock(Bean.class), "reportingCurrency", "New Value", true));
  }

  /**
   * Test {@link CalculationRules#of(CalculationFunctions, CalculationParameters)} with {@code
   * CalculationFunctions}, {@code CalculationParameters}.
   *
   * <p>Method under test: {@link CalculationRules#of(CalculationFunctions, CalculationParameters)}
   */
  @Test
  @DisplayName(
      "Test of(CalculationFunctions, CalculationParameters) with 'CalculationFunctions', 'CalculationParameters'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationRules CalculationRules.of(CalculationFunctions, CalculationParameters)"
  })
  void testOfWithCalculationFunctionsCalculationParameters() {
    // Arrange
    CalculationFunctions functions = mock(CalculationFunctions.class);
    CalculationParameters parameters = CalculationParameters.empty();

    // Act
    CalculationRules actualOfResult = CalculationRules.of(functions, parameters);

    // Assert
    ReportingCurrency reportingCurrency = actualOfResult.getReportingCurrency();
    assertEquals(ReportingCurrencyType.NATURAL, reportingCurrency.getType());
    assertFalse(reportingCurrency.isNone());
    assertFalse(reportingCurrency.isSpecific());
    CalculationParameters parameters2 = actualOfResult.getParameters();
    assertTrue(parameters2.getParameters().isEmpty());
    assertTrue(reportingCurrency.isNatural());
    assertSame(parameters, parameters2);
    assertSame(functions, actualOfResult.getFunctions());
  }

  /**
   * Test {@link CalculationRules#of(CalculationFunctions, ReportingCurrency,
   * CalculationParameters)} with {@code CalculationFunctions}, {@code ReportingCurrency}, {@code
   * CalculationParameters}.
   *
   * <p>Method under test: {@link CalculationRules#of(CalculationFunctions, ReportingCurrency,
   * CalculationParameters)}
   */
  @Test
  @DisplayName(
      "Test of(CalculationFunctions, ReportingCurrency, CalculationParameters) with 'CalculationFunctions', 'ReportingCurrency', 'CalculationParameters'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationRules CalculationRules.of(CalculationFunctions, ReportingCurrency, CalculationParameters)"
  })
  void testOfWithCalculationFunctionsReportingCurrencyCalculationParameters() {
    // Arrange
    CalculationFunctions functions = mock(CalculationFunctions.class);
    CalculationParameters parameters = CalculationParameters.empty();

    // Act
    CalculationRules actualOfResult =
        CalculationRules.of(functions, ReportingCurrency.NATURAL, parameters);

    // Assert
    CalculationParameters parameters2 = actualOfResult.getParameters();
    assertTrue(parameters2.getParameters().isEmpty());
    assertSame(parameters, parameters2);
    assertSame(ReportingCurrency.NATURAL, actualOfResult.getReportingCurrency());
    assertSame(functions, actualOfResult.getFunctions());
  }

  /**
   * Test {@link CalculationRules#meta()}.
   *
   * <p>Method under test: {@link CalculationRules#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CalculationRules.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CalculationRules.meta();

    // Assert
    MetaProperty<CalculationFunctions> functionsResult = actualMetaResult.functions();
    assertTrue(functionsResult instanceof DirectMetaProperty);
    MetaProperty<CalculationParameters> parametersResult = actualMetaResult.parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    MetaProperty<ReportingCurrency> reportingCurrencyResult = actualMetaResult.reportingCurrency();
    assertTrue(reportingCurrencyResult instanceof DirectMetaProperty);
    assertEquals("functions", functionsResult.name());
    assertEquals("parameters", parametersResult.name());
    assertEquals("reportingCurrency", reportingCurrencyResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, functionsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, parametersResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, reportingCurrencyResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CalculationRules> expectedDeclaringTypeResult = CalculationRules.class;
    assertEquals(expectedDeclaringTypeResult, functionsResult.declaringType());
    Class<CalculationRules> expectedDeclaringTypeResult2 = CalculationRules.class;
    assertEquals(expectedDeclaringTypeResult2, parametersResult.declaringType());
    Class<CalculationRules> expectedDeclaringTypeResult3 = CalculationRules.class;
    assertEquals(expectedDeclaringTypeResult3, reportingCurrencyResult.declaringType());
    Class<ReportingCurrency> expectedPropertyTypeResult = ReportingCurrency.class;
    assertEquals(expectedPropertyTypeResult, reportingCurrencyResult.propertyType());
    Class<CalculationFunctions> expectedPropertyTypeResult2 = CalculationFunctions.class;
    assertEquals(expectedPropertyTypeResult2, functionsResult.propertyType());
    Class<CalculationParameters> expectedPropertyTypeResult3 = CalculationParameters.class;
    assertEquals(expectedPropertyTypeResult3, parametersResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, functionsResult.metaBean());
    assertSame(meta, parametersResult.metaBean());
    assertSame(meta, reportingCurrencyResult.metaBean());
  }

  /**
   * Test {@link CalculationRules#metaBean()}.
   *
   * <p>Method under test: {@link CalculationRules#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CalculationRules.metaBean()"})
  void testMetaBean() {
    // Arrange
    CalculationFunctions functions = mock(CalculationFunctions.class);

    // Act and Assert
    assertSame(
        Meta.INSTANCE, CalculationRules.of(functions, CalculationParameters.empty()).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationRules#toString()}
   *   <li>{@link CalculationRules#getFunctions()}
   *   <li>{@link CalculationRules#getParameters()}
   *   <li>{@link CalculationRules#getReportingCurrency()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationFunctions CalculationRules.getFunctions()",
    "CalculationParameters CalculationRules.getParameters()",
    "ReportingCurrency CalculationRules.getReportingCurrency()",
    "String CalculationRules.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CalculationFunctions functions = mock(CalculationFunctions.class);
    CalculationParameters parameters = CalculationParameters.empty();

    CalculationRules ofResult = CalculationRules.of(functions, parameters);

    // Act
    ofResult.toString();
    ofResult.getFunctions();
    CalculationParameters actualParameters = ofResult.getParameters();

    // Assert
    assertSame(parameters, actualParameters);
    assertSame(ReportingCurrency.NATURAL, ofResult.getReportingCurrency());
  }

  /**
   * Test {@link CalculationRules#equals(Object)}, and {@link CalculationRules#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationRules#equals(Object)}
   *   <li>{@link CalculationRules#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CalculationRules.equals(Object)", "int CalculationRules.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CalculationFunctions functions = mock(CalculationFunctions.class);
    CalculationRules ofResult = CalculationRules.of(functions, CalculationParameters.empty());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CalculationRules#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationRules#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CalculationRules.equals(Object)", "int CalculationRules.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CalculationFunctions functions = mock(CalculationFunctions.class);
    CalculationRules ofResult = CalculationRules.of(functions, CalculationParameters.empty());
    CalculationFunctions functions2 = mock(CalculationFunctions.class);

    // Act and Assert
    assertNotEquals(ofResult, CalculationRules.of(functions2, CalculationParameters.empty()));
  }

  /**
   * Test {@link CalculationRules#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationRules#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CalculationRules.equals(Object)", "int CalculationRules.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CalculationFunctions functions = mock(CalculationFunctions.class);

    // Act and Assert
    assertNotEquals(CalculationRules.of(functions, CalculationParameters.empty()), null);
  }

  /**
   * Test {@link CalculationRules#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationRules#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CalculationRules.equals(Object)", "int CalculationRules.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CalculationFunctions functions = mock(CalculationFunctions.class);

    // Act and Assert
    assertNotEquals(
        CalculationRules.of(functions, CalculationParameters.empty()),
        "Different type to CalculationRules");
  }
}
