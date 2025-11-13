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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.Column.Builder;
import com.opengamma.strata.calc.Column.Meta;
import com.opengamma.strata.calc.runner.CalculationParameters;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ColumnDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Builder#build()}
   *   <li>{@link Builder#parameters(CalculationParameters)}
   *   <li>{@link Builder#reportingCurrency(ReportingCurrency)}
   * </ul>
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Column Builder.build()",
    "Builder Builder.parameters(CalculationParameters)",
    "Builder Builder.reportingCurrency(ReportingCurrency)",
    "String Builder.toString()"
  })
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualBuilderResult = Column.builder();
    ImmutableMeasure measure = ImmutableMeasure.of("Name");
    Builder actualMeasureResult = actualBuilderResult.measure(measure);
    ColumnName name = ColumnName.of("Name");
    Builder actualNameResult = actualMeasureResult.name(name);
    CalculationParameters parameters = CalculationParameters.empty();
    Column actualColumn =
        actualNameResult
            .parameters(parameters)
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build();

    // Assert
    Optional<ReportingCurrency> reportingCurrency = actualColumn.getReportingCurrency();
    assertTrue(reportingCurrency.isPresent());
    assertSame(name, actualColumn.getName());
    assertSame(measure, actualColumn.getMeasure());
    assertSame(parameters, actualColumn.getParameters());
    assertSame(ReportingCurrency.NATURAL, reportingCurrency.get());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code measure}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'measure'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenMeasure_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Column.builder().get("measure"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Column.builder().get("name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(NoSuchElementException.class, () -> Column.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#measure(Measure)}.
   *
   * <ul>
   *   <li>When {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#measure(Measure)}
   */
  @Test
  @DisplayName(
      "Test Builder measure(Measure); when ImmutableMeasure with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.measure(Measure)"})
  void testBuilderMeasure_whenImmutableMeasureWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Column.builder();
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    // Act
    Builder actualMeasureResult = builderResult.measure(measure);

    // Assert
    assertSame(builderResult, actualMeasureResult);
    assertSame(measure, builderResult.build().getMeasure());
  }

  /**
   * Test Builder {@link Builder#name(ColumnName)}.
   *
   * <ul>
   *   <li>When {@link ColumnName} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(ColumnName)}
   */
  @Test
  @DisplayName("Test Builder name(ColumnName); when ColumnName with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(ColumnName)"})
  void testBuilderName_whenColumnNameWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Column.builder();

    // Act
    Builder actualNameResult = builderResult.name(ColumnName.of("Name"));

    // Assert
    assertSame(builderResult, actualNameResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> Column.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code measure}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'measure'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenMeasure_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Column.builder();
    ImmutableMeasure ofResult = ImmutableMeasure.of("Name");

    // Act
    Builder actualSetResult = builderResult.set("measure", ofResult);

    // Assert
    assertSame(builderResult, actualSetResult);
    assertSame(ofResult, builderResult.build().getMeasure());
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Column.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Class<? extends Column> actualBeanTypeResult = Column.meta().beanType();

    // Assert
    Class<Column> expectedBeanTypeResult = Column.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#measure()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#parameters()}
   *   <li>{@link Meta#reportingCurrency()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.measure()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.parameters()",
    "MetaProperty Meta.reportingCurrency()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = Column.meta();

    // Act
    MetaProperty<Measure> actualMeasureResult = metaResult.measure();
    MetaProperty<ColumnName> actualNameResult = metaResult.name();
    MetaProperty<CalculationParameters> actualParametersResult = metaResult.parameters();

    // Assert
    assertTrue(actualMeasureResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(actualParametersResult instanceof DirectMetaProperty);
    assertTrue(metaResult.reportingCurrency() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code measure}.
   *   <li>Then return name is {@code measure}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'measure'; then return name is 'measure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMeasure_thenReturnNameIsMeasure() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = Column.meta().metaPropertyGet("measure");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ColumnName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<CalculationParameters> parametersResult = ((Meta) metaBeanResult).parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    MetaProperty<ReportingCurrency> reportingCurrencyResult =
        ((Meta) metaBeanResult).reportingCurrency();
    assertTrue(reportingCurrencyResult instanceof DirectMetaProperty);
    assertEquals("measure", actualMetaPropertyGetResult.name());
    Class<Measure> expectedPropertyTypeResult = Measure.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).measure());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, parametersResult.metaBean());
    assertSame(metaBeanResult, reportingCurrencyResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'name'; then return 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenName_thenReturnName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = Column.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Measure> measureResult = ((Meta) metaBeanResult).measure();
    assertTrue(measureResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CalculationParameters> parametersResult = ((Meta) metaBeanResult).parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    MetaProperty<ReportingCurrency> reportingCurrencyResult =
        ((Meta) metaBeanResult).reportingCurrency();
    assertTrue(reportingCurrencyResult instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<ColumnName> expectedPropertyTypeResult = ColumnName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(metaBeanResult, measureResult.metaBean());
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
    MetaProperty<?> actualMetaPropertyGetResult = Column.meta().metaPropertyGet("parameters");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Measure> measureResult = ((Meta) metaBeanResult).measure();
    assertTrue(measureResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ColumnName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<ReportingCurrency> reportingCurrencyResult =
        ((Meta) metaBeanResult).reportingCurrency();
    assertTrue(reportingCurrencyResult instanceof DirectMetaProperty);
    assertEquals("parameters", actualMetaPropertyGetResult.name());
    Class<CalculationParameters> expectedPropertyTypeResult = CalculationParameters.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).parameters());
    assertSame(metaBeanResult, measureResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
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
    assertNull(Column.meta().metaPropertyGet("Property Name"));
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
        Column.meta().metaPropertyGet("reportingCurrency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Measure> measureResult = ((Meta) metaBeanResult).measure();
    assertTrue(measureResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ColumnName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<CalculationParameters> parametersResult = ((Meta) metaBeanResult).parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    assertEquals("reportingCurrency", actualMetaPropertyGetResult.name());
    Class<ReportingCurrency> expectedPropertyTypeResult = ReportingCurrency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).reportingCurrency());
    assertSame(metaBeanResult, measureResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = Column.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("measure") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("parameters") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("reportingCurrency") instanceof DirectMetaProperty);
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
    assertNull(Column.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when ImmutableMeasure with 'Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenImmutableMeasureWithName_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = Column.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(Column.of(ImmutableMeasure.of("Name")), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code measure}.
   *   <li>Then return {@link ImmutableMeasure} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'measure'; then return ImmutableMeasure with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenMeasure_thenReturnImmutableMeasureWithName() {
    // Arrange
    Meta metaResult = Column.meta();

    Builder builderResult = Column.builder();
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    Builder measureResult = builderResult.measure(measure);

    Builder nameResult = measureResult.name(ColumnName.of("Name"));

    // Act and Assert
    assertSame(
        measure,
        metaResult.propertyGet(
            nameResult
                .parameters(CalculationParameters.empty())
                .reportingCurrency(ReportingCurrency.NATURAL)
                .build(),
            "measure",
            true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@link ColumnName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'name'; then return ColumnName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenName_thenReturnColumnNameWithName() {
    // Arrange
    Meta metaResult = Column.meta();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));
    ColumnName name = ColumnName.of("Name");

    Builder nameResult = measureResult.name(name);

    // Act and Assert
    assertSame(
        name,
        metaResult.propertyGet(
            nameResult
                .parameters(CalculationParameters.empty())
                .reportingCurrency(ReportingCurrency.NATURAL)
                .build(),
            "name",
            true));
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
    Meta metaResult = Column.meta();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    CalculationParameters parameters = CalculationParameters.empty();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            nameResult.parameters(parameters).reportingCurrency(ReportingCurrency.NATURAL).build(),
            "parameters",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof CalculationParameters);
    assertTrue(((CalculationParameters) actualPropertyGetResult).getParameters().isEmpty());
    assertSame(parameters, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code reportingCurrency}.
   *   <li>Then return {@link ReportingCurrency#NATURAL}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'reportingCurrency'; then return NATURAL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenReportingCurrency_thenReturnNatural() {
    // Arrange
    Meta metaResult = Column.meta();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    Column bean =
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "reportingCurrency", true);

    // Assert
    ReportingCurrency reportingCurrency = ((ReportingCurrency) actualPropertyGetResult).NATURAL;
    assertSame(reportingCurrency, actualPropertyGetResult);
    assertSame(reportingCurrency, bean.getReportingCurrency().get());
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
        () -> Column.meta().propertySet(mock(Bean.class), "measure", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code measure}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'measure'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMeasure_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> Column.meta().propertySet(mock(Bean.class), "measure", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'name'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> Column.meta().propertySet(mock(Bean.class), "name", "New Value", true));
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
        () -> Column.meta().propertySet(mock(Bean.class), "parameters", "New Value", true));
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
        () -> Column.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> Column.meta().propertySet(mock(Bean.class), "reportingCurrency", "New Value", true));
  }

  /**
   * Test {@link Column#of(Measure, String, Currency)} with {@code measure}, {@code columnName},
   * {@code currency}.
   *
   * <ul>
   *   <li>Then return Name Name is {@code Column Name}.
   * </ul>
   *
   * <p>Method under test: {@link Column#of(Measure, String, Currency)}
   */
  @Test
  @DisplayName(
      "Test of(Measure, String, Currency) with 'measure', 'columnName', 'currency'; then return Name Name is 'Column Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Column Column.of(Measure, String, Currency)"})
  void testOfWithMeasureColumnNameCurrency_thenReturnNameNameIsColumnName() {
    // Arrange
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    // Act
    Column actualOfResult = Column.of(measure, "Column Name", (Currency) null);

    // Assert
    ColumnName name = actualOfResult.getName();
    assertEquals("Column Name", name.getName());
    assertEquals("Column Name", name.toString());
    Optional<ReportingCurrency> reportingCurrency = actualOfResult.getReportingCurrency();
    ReportingCurrency getResult = reportingCurrency.get();
    assertNull(getResult.getCurrency());
    assertEquals(ReportingCurrencyType.SPECIFIC, getResult.getType());
    assertFalse(getResult.isNatural());
    assertFalse(getResult.isNone());
    assertTrue(actualOfResult.getParameters().getParameters().isEmpty());
    assertTrue(getResult.isSpecific());
    assertTrue(reportingCurrency.isPresent());
    assertSame(measure, actualOfResult.getMeasure());
  }

  /**
   * Test {@link Column#of(Measure, String)} with {@code measure}, {@code columnName}.
   *
   * <ul>
   *   <li>When {@code Column Name}.
   *   <li>Then return Name Name is {@code Column Name}.
   * </ul>
   *
   * <p>Method under test: {@link Column#of(Measure, String)}
   */
  @Test
  @DisplayName(
      "Test of(Measure, String) with 'measure', 'columnName'; when 'Column Name'; then return Name Name is 'Column Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Column Column.of(Measure, String)"})
  void testOfWithMeasureColumnName_whenColumnName_thenReturnNameNameIsColumnName() {
    // Arrange
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    // Act
    Column actualOfResult = Column.of(measure, "Column Name");

    // Assert
    ColumnName name = actualOfResult.getName();
    assertEquals("Column Name", name.getName());
    assertEquals("Column Name", name.toString());
    assertFalse(actualOfResult.getReportingCurrency().isPresent());
    assertTrue(actualOfResult.getParameters().getParameters().isEmpty());
    assertSame(measure, actualOfResult.getMeasure());
  }

  /**
   * Test {@link Column#of(Measure, Currency)} with {@code measure}, {@code currency}.
   *
   * <ul>
   *   <li>When {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then return Name Name is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Column#of(Measure, Currency)}
   */
  @Test
  @DisplayName(
      "Test of(Measure, Currency) with 'measure', 'currency'; when ImmutableMeasure with 'Name'; then return Name Name is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Column Column.of(Measure, Currency)"})
  void testOfWithMeasureCurrency_whenImmutableMeasureWithName_thenReturnNameNameIsName() {
    // Arrange
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    // Act
    Column actualOfResult = Column.of(measure, (Currency) null);

    // Assert
    ColumnName name = actualOfResult.getName();
    assertEquals("Name", name.getName());
    assertEquals("Name", name.toString());
    Optional<ReportingCurrency> reportingCurrency = actualOfResult.getReportingCurrency();
    ReportingCurrency getResult = reportingCurrency.get();
    assertNull(getResult.getCurrency());
    assertEquals(ReportingCurrencyType.SPECIFIC, getResult.getType());
    assertFalse(getResult.isNatural());
    assertFalse(getResult.isNone());
    assertTrue(actualOfResult.getParameters().getParameters().isEmpty());
    assertTrue(getResult.isSpecific());
    assertTrue(reportingCurrency.isPresent());
    assertSame(measure, actualOfResult.getMeasure());
  }

  /**
   * Test {@link Column#of(Measure)} with {@code measure}.
   *
   * <ul>
   *   <li>When {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then return Name Name is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Column#of(Measure)}
   */
  @Test
  @DisplayName(
      "Test of(Measure) with 'measure'; when ImmutableMeasure with 'Name'; then return Name Name is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Column Column.of(Measure)"})
  void testOfWithMeasure_whenImmutableMeasureWithName_thenReturnNameNameIsName() {
    // Arrange
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    // Act
    Column actualOfResult = Column.of(measure);

    // Assert
    ColumnName name = actualOfResult.getName();
    assertEquals("Name", name.getName());
    assertEquals("Name", name.toString());
    assertFalse(actualOfResult.getReportingCurrency().isPresent());
    assertTrue(actualOfResult.getParameters().getParameters().isEmpty());
    assertSame(measure, actualOfResult.getMeasure());
  }

  /**
   * Test {@link Column#toHeader()}.
   *
   * <p>Method under test: {@link Column#toHeader()}
   */
  @Test
  @DisplayName("Test toHeader()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ColumnHeader Column.toHeader()"})
  void testToHeader() {
    // Arrange
    ImmutableMeasure measure = ImmutableMeasure.of("name", false);

    // Act
    ColumnHeader actualToHeaderResult = Column.of(measure).toHeader();

    // Assert
    ColumnName name = actualToHeaderResult.getName();
    assertEquals("name", name.getName());
    assertEquals("name", name.toString());
    assertSame(measure, actualToHeaderResult.getMeasure());
  }

  /**
   * Test {@link Column#toHeader()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then Measure return {@link ImmutableMeasure}.
   * </ul>
   *
   * <p>Method under test: {@link Column#toHeader()}
   */
  @Test
  @DisplayName(
      "Test toHeader(); given ImmutableMeasure with 'Name'; then Measure return ImmutableMeasure")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ColumnHeader Column.toHeader()"})
  void testToHeader_givenImmutableMeasureWithName_thenMeasureReturnImmutableMeasure() {
    // Arrange
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    // Act
    ColumnHeader actualToHeaderResult = Column.of(measure).toHeader();

    // Assert
    Measure measure2 = actualToHeaderResult.getMeasure();
    assertTrue(measure2 instanceof ImmutableMeasure);
    assertEquals("Name", measure2.getName());
    ColumnName name = actualToHeaderResult.getName();
    assertEquals("Name", name.getName());
    assertEquals("Name", name.toString());
    assertSame(measure, measure2);
  }

  /**
   * Test {@link Column#toHeader()}.
   *
   * <ul>
   *   <li>Then return Measure is {@link ImmutableMeasure} with {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link Column#toHeader()}
   */
  @Test
  @DisplayName("Test toHeader(); then return Measure is ImmutableMeasure with 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ColumnHeader Column.toHeader()"})
  void testToHeader_thenReturnMeasureIsImmutableMeasureWithName() {
    // Arrange
    ImmutableMeasure measure = ImmutableMeasure.of("name");

    // Act
    ColumnHeader actualToHeaderResult = Column.of(measure, (Currency) null).toHeader();

    // Assert
    ColumnName name = actualToHeaderResult.getName();
    assertEquals("name", name.getName());
    assertEquals("name", name.toString());
    assertSame(measure, actualToHeaderResult.getMeasure());
  }

  /**
   * Test {@link Column#meta()}.
   *
   * <p>Method under test: {@link Column#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Column.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = Column.meta();

    // Assert
    assertTrue(actualMetaResult.measure() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameters() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.reportingCurrency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link Column#metaBean()}.
   *
   * <p>Method under test: {@link Column#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Column.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, Column.of(ImmutableMeasure.of("Name")).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Column#toString()}
   *   <li>{@link Column#getMeasure()}
   *   <li>{@link Column#getName()}
   *   <li>{@link Column#getParameters()}
   *   <li>{@link Column#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Measure Column.getMeasure()",
    "ColumnName Column.getName()",
    "CalculationParameters Column.getParameters()",
    "Builder Column.toBuilder()",
    "String Column.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = Column.builder();
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    Builder measureResult = builderResult.measure(measure);
    ColumnName name = ColumnName.of("Name");

    Builder nameResult = measureResult.name(name);
    CalculationParameters parameters = CalculationParameters.empty();
    Column column =
        nameResult.parameters(parameters).reportingCurrency(ReportingCurrency.NATURAL).build();

    // Act
    String actualToStringResult = column.toString();
    Measure actualMeasure = column.getMeasure();
    ColumnName actualName = column.getName();
    CalculationParameters actualParameters = column.getParameters();
    column.toBuilder();

    // Assert
    assertEquals(
        "Column{name=Name, measure=Name, reportingCurrency=Natural, parameters=CalculationParameters{parameters"
            + "={}}}",
        actualToStringResult);
    assertSame(name, actualName);
    assertSame(measure, actualMeasure);
    assertSame(parameters, actualParameters);
  }

  /**
   * Test {@link Column#getReportingCurrency()}.
   *
   * <p>Method under test: {@link Column#getReportingCurrency()}
   */
  @Test
  @DisplayName("Test getReportingCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Column.getReportingCurrency()"})
  void testGetReportingCurrency() {
    // Arrange, Act and Assert
    assertFalse(Column.of(ImmutableMeasure.of("Name")).getReportingCurrency().isPresent());
  }

  /**
   * Test {@link Column#equals(Object)}, and {@link Column#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Column#equals(Object)}
   *   <li>{@link Column#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Column.equals(Object)", "int Column.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    Column column =
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build();

    Builder builderResult2 = Column.builder();

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    Column column2 =
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build();

    // Act and Assert
    assertEquals(column, column2);
    assertEquals(column.hashCode(), column2.hashCode());
  }

  /**
   * Test {@link Column#equals(Object)}, and {@link Column#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Column#equals(Object)}
   *   <li>{@link Column#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Column.equals(Object)", "int Column.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    Column column =
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build();

    // Act and Assert
    assertEquals(column, column);
    int expectedHashCodeResult = column.hashCode();
    assertEquals(expectedHashCodeResult, column.hashCode());
  }

  /**
   * Test {@link Column#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Column#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Column.equals(Object)", "int Column.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder measureResult = Column.builder().measure(mock(Measure.class));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    Column column =
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build();

    Builder builderResult = Column.builder();

    Builder measureResult2 = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));

    // Act and Assert
    assertNotEquals(
        column,
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
  }

  /**
   * Test {@link Column#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Column#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Column.equals(Object)", "int Column.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("42"));
    Column column =
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build();

    Builder builderResult2 = Column.builder();

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));

    // Act and Assert
    assertNotEquals(
        column,
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
  }

  /**
   * Test {@link Column#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Column#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Column.equals(Object)", "int Column.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));
    Column column =
        measureResult
            .name(ColumnName.of("Name"))
            .parameters(null)
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build();

    Builder builderResult2 = Column.builder();

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult2.name(ColumnName.of("Name"));

    // Act and Assert
    assertNotEquals(
        column,
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
  }

  /**
   * Test {@link Column#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Column#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Column.equals(Object)", "int Column.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    Column column =
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NONE)
            .build();

    Builder builderResult2 = Column.builder();

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));

    // Act and Assert
    assertNotEquals(
        column,
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
  }

  /**
   * Test {@link Column#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Column#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Column.equals(Object)", "int Column.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));

    // Act and Assert
    assertNotEquals(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build(),
        null);
  }

  /**
   * Test {@link Column#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Column#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Column.equals(Object)", "int Column.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));

    // Act and Assert
    assertNotEquals(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build(),
        "Different type to Column");
  }
}
