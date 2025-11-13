package com.opengamma.strata.report;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.calc.Column;
import com.opengamma.strata.calc.Results;
import com.opengamma.strata.calc.runner.CalculationFunctions;
import com.opengamma.strata.report.ReportCalculationResults.Meta;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReportCalculationResultsDiffblueTest {
  /**
   * Test {@link ReportCalculationResults#meta()}.
   *
   * <p>Method under test: {@link ReportCalculationResults#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ReportCalculationResults.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ReportCalculationResults.meta();

    // Assert
    assertTrue(actualMetaResult.calculationFunctions() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.calculationResults() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.columns() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.referenceData() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.targets() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.valuationDate() instanceof DirectMetaProperty);
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
    Class<? extends ReportCalculationResults> actualBeanTypeResult =
        ReportCalculationResults.meta().beanType();

    // Assert
    Class<ReportCalculationResults> expectedBeanTypeResult = ReportCalculationResults.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#calculationFunctions()}
   *   <li>{@link Meta#calculationResults()}
   *   <li>{@link Meta#columns()}
   *   <li>{@link Meta#referenceData()}
   *   <li>{@link Meta#targets()}
   *   <li>{@link Meta#valuationDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.calculationFunctions()",
    "MetaProperty Meta.calculationResults()",
    "MetaProperty Meta.columns()",
    "MetaProperty Meta.referenceData()",
    "MetaProperty Meta.targets()",
    "MetaProperty Meta.valuationDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ReportCalculationResults.meta();

    // Act
    MetaProperty<CalculationFunctions> actualCalculationFunctionsResult =
        metaResult.calculationFunctions();
    MetaProperty<Results> actualCalculationResultsResult = metaResult.calculationResults();
    MetaProperty<List<Column>> actualColumnsResult = metaResult.columns();
    MetaProperty<ReferenceData> actualReferenceDataResult = metaResult.referenceData();
    MetaProperty<List<CalculationTarget>> actualTargetsResult = metaResult.targets();

    // Assert
    assertTrue(actualCalculationFunctionsResult instanceof DirectMetaProperty);
    assertTrue(actualCalculationResultsResult instanceof DirectMetaProperty);
    assertTrue(actualColumnsResult instanceof DirectMetaProperty);
    assertTrue(actualReferenceDataResult instanceof DirectMetaProperty);
    assertTrue(actualTargetsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code calculationFunctions}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'calculationFunctions'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsCalculationFunctions() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ReportCalculationResults.meta().metaPropertyGet("calculationFunctions");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).calculationResults() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).columns() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).referenceData() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).targets() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valuationDate() instanceof DirectMetaProperty);
    assertEquals("calculationFunctions", actualMetaPropertyGetResult.name());
    Class<CalculationFunctions> expectedPropertyTypeResult = CalculationFunctions.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).calculationFunctions());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code calculationResults}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'calculationResults'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsCalculationResults() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ReportCalculationResults.meta().metaPropertyGet("calculationResults");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).calculationFunctions() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).columns() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).referenceData() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).targets() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valuationDate() instanceof DirectMetaProperty);
    assertEquals("calculationResults", actualMetaPropertyGetResult.name());
    Class<Results> expectedPropertyTypeResult = Results.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).calculationResults());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then return name is {@code columns}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'columns'; then return name is 'columns'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenColumns_thenReturnNameIsColumns() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ReportCalculationResults.meta().metaPropertyGet("columns");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CalculationFunctions> calculationFunctionsResult =
        ((Meta) metaBeanResult).calculationFunctions();
    assertTrue(calculationFunctionsResult instanceof DirectMetaProperty);
    MetaProperty<Results> calculationResultsResult = ((Meta) metaBeanResult).calculationResults();
    assertTrue(calculationResultsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ReferenceData> referenceDataResult = ((Meta) metaBeanResult).referenceData();
    assertTrue(referenceDataResult instanceof DirectMetaProperty);
    MetaProperty<List<CalculationTarget>> targetsResult = ((Meta) metaBeanResult).targets();
    assertTrue(targetsResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("columns", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).columns());
    assertSame(metaBeanResult, calculationFunctionsResult.metaBean());
    assertSame(metaBeanResult, calculationResultsResult.metaBean());
    assertSame(metaBeanResult, referenceDataResult.metaBean());
    assertSame(metaBeanResult, targetsResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
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
    assertNull(ReportCalculationResults.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code referenceData}.
   *   <li>Then return name is {@code referenceData}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'referenceData'; then return name is 'referenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenReferenceData_thenReturnNameIsReferenceData() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ReportCalculationResults.meta().metaPropertyGet("referenceData");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).calculationFunctions() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).calculationResults() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).columns() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).targets() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valuationDate() instanceof DirectMetaProperty);
    assertEquals("referenceData", actualMetaPropertyGetResult.name());
    Class<ReferenceData> expectedPropertyTypeResult = ReferenceData.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).referenceData());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code targets}.
   *   <li>Then return name is {@code targets}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'targets'; then return name is 'targets'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTargets_thenReturnNameIsTargets() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ReportCalculationResults.meta().metaPropertyGet("targets");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CalculationFunctions> calculationFunctionsResult =
        ((Meta) metaBeanResult).calculationFunctions();
    assertTrue(calculationFunctionsResult instanceof DirectMetaProperty);
    MetaProperty<Results> calculationResultsResult = ((Meta) metaBeanResult).calculationResults();
    assertTrue(calculationResultsResult instanceof DirectMetaProperty);
    MetaProperty<List<Column>> columnsResult = ((Meta) metaBeanResult).columns();
    assertTrue(columnsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ReferenceData> referenceDataResult = ((Meta) metaBeanResult).referenceData();
    assertTrue(referenceDataResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("targets", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).targets());
    assertSame(metaBeanResult, calculationFunctionsResult.metaBean());
    assertSame(metaBeanResult, calculationResultsResult.metaBean());
    assertSame(metaBeanResult, columnsResult.metaBean());
    assertSame(metaBeanResult, referenceDataResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return name is {@code valuationDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valuationDate'; then return name is 'valuationDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValuationDate_thenReturnNameIsValuationDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ReportCalculationResults.meta().metaPropertyGet("valuationDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).calculationFunctions() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).calculationResults() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).columns() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).referenceData() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).targets() instanceof DirectMetaProperty);
    assertEquals("valuationDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDate());
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
        ReportCalculationResults.meta().metaPropertyMap();

    // Assert
    assertEquals(6, actualMetaPropertyMapResult.size());
    assertTrue(
        actualMetaPropertyMapResult.get("calculationFunctions") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("calculationResults") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("columns") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("referenceData") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("targets") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("valuationDate") instanceof DirectMetaProperty);
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
        ReportCalculationResults.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            ReportCalculationResults.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code calculationFunctions}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'calculationFunctions'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCalculationFunctions_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ReportCalculationResults.meta()
                .propertySet(mock(Bean.class), "calculationFunctions", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code calculationResults}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'calculationResults'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCalculationResults_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ReportCalculationResults.meta()
                .propertySet(mock(Bean.class), "calculationResults", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'columns'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenColumns_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ReportCalculationResults.meta()
                .propertySet(mock(Bean.class), "columns", "New Value", true));
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
            ReportCalculationResults.meta()
                .propertySet(mock(Bean.class), "calculationFunctions", "New Value", false));
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
            ReportCalculationResults.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code referenceData}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'referenceData'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenReferenceData_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ReportCalculationResults.meta()
                .propertySet(mock(Bean.class), "referenceData", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code targets}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'targets'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTargets_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ReportCalculationResults.meta()
                .propertySet(mock(Bean.class), "targets", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valuationDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValuationDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ReportCalculationResults.meta()
                .propertySet(mock(Bean.class), "valuationDate", "New Value", true));
  }
}
