package com.opengamma.strata.report;

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
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.calc.Column;
import com.opengamma.strata.calc.Column.Builder;
import com.opengamma.strata.calc.ColumnName;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.runner.CalculationParameters;
import com.opengamma.strata.report.ReportRequirements.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReportRequirementsDiffblueTest {
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
    Class<? extends ReportRequirements> actualBeanTypeResult = ReportRequirements.meta().beanType();

    // Assert
    Class<ReportRequirements> expectedBeanTypeResult = ReportRequirements.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ReportRequirements.meta().metaPropertyGet("tradeMeasureRequirements");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("tradeMeasureRequirements", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<ReportRequirements> expectedDeclaringTypeResult = ReportRequirements.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
    assertNull(ReportRequirements.meta().metaPropertyGet("Property Name"));
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
        ReportRequirements.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("tradeMeasureRequirements");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("tradeMeasureRequirements", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<ReportRequirements> expectedDeclaringTypeResult = ReportRequirements.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
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
    assertNull(ReportRequirements.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = ReportRequirements.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                ReportRequirements.of(new ArrayList<>()), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link ReportRequirements} with columns is {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when ReportRequirements with columns is ArrayList(); then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenReportRequirementsWithColumnsIsArrayList_thenReturnList() {
    // Arrange
    Meta metaResult = ReportRequirements.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            ReportRequirements.of(new ArrayList<>()), "tradeMeasureRequirements", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
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
            ReportRequirements.meta()
                .propertySet(mock(Bean.class), "tradeMeasureRequirements", "New Value", false));
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
            ReportRequirements.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code tradeMeasureRequirements}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'tradeMeasureRequirements'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTradeMeasureRequirements_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ReportRequirements.meta()
                .propertySet(mock(Bean.class), "tradeMeasureRequirements", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#tradeMeasureRequirements()}.
   *
   * <p>Method under test: {@link Meta#tradeMeasureRequirements()}
   */
  @Test
  @DisplayName("Test Meta tradeMeasureRequirements()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.tradeMeasureRequirements()"})
  void testMetaTradeMeasureRequirements() {
    // Arrange, Act and Assert
    assertTrue(ReportRequirements.meta().tradeMeasureRequirements() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link ReportRequirements#of(Column[])} with {@code Column[]}.
   *
   * <ul>
   *   <li>Then return TradeMeasureRequirements Empty.
   * </ul>
   *
   * <p>Method under test: {@link ReportRequirements#of(Column[])}
   */
  @Test
  @DisplayName("Test of(Column[]) with 'Column[]'; then return TradeMeasureRequirements Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReportRequirements ReportRequirements.of(Column[])"})
  void testOfWithColumn_thenReturnTradeMeasureRequirementsEmpty() {
    // Arrange, Act and Assert
    assertTrue(ReportRequirements.of().getTradeMeasureRequirements().isEmpty());
  }

  /**
   * Test {@link ReportRequirements#of(Column[])} with {@code Column[]}.
   *
   * <ul>
   *   <li>Then return TradeMeasureRequirements size is one.
   * </ul>
   *
   * <p>Method under test: {@link ReportRequirements#of(Column[])}
   */
  @Test
  @DisplayName(
      "Test of(Column[]) with 'Column[]'; then return TradeMeasureRequirements size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReportRequirements ReportRequirements.of(Column[])"})
  void testOfWithColumn_thenReturnTradeMeasureRequirementsSizeIsOne() {
    // Arrange
    Builder builderResult = Column.builder();
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    Builder measureResult = builderResult.measure(measure);
    ColumnName name = ColumnName.of("Name");

    Builder nameResult = measureResult.name(name);
    CalculationParameters parameters = CalculationParameters.empty();
    Column column = nameResult.parameters(parameters).reportingCurrency(null).build();

    // Act and Assert
    ImmutableList<Column> tradeMeasureRequirements =
        ReportRequirements.of(column).getTradeMeasureRequirements();
    assertEquals(1, tradeMeasureRequirements.size());
    Column getResult = tradeMeasureRequirements.get(0);
    assertFalse(getResult.getReportingCurrency().isPresent());
    CalculationParameters parameters2 = getResult.getParameters();
    assertTrue(parameters2.getParameters().isEmpty());
    assertSame(name, getResult.getName());
    assertSame(measure, getResult.getMeasure());
    assertSame(parameters, parameters2);
  }

  /**
   * Test {@link ReportRequirements#of(Column[])} with {@code Column[]}.
   *
   * <ul>
   *   <li>Then return TradeMeasureRequirements size is two.
   * </ul>
   *
   * <p>Method under test: {@link ReportRequirements#of(Column[])}
   */
  @Test
  @DisplayName(
      "Test of(Column[]) with 'Column[]'; then return TradeMeasureRequirements size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReportRequirements ReportRequirements.of(Column[])"})
  void testOfWithColumn_thenReturnTradeMeasureRequirementsSizeIsTwo() {
    // Arrange
    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    Column column =
        nameResult.parameters(CalculationParameters.empty()).reportingCurrency(null).build();

    Builder builderResult2 = Column.builder();

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    Column column2 =
        nameResult2.parameters(CalculationParameters.empty()).reportingCurrency(null).build();

    // Act and Assert
    ImmutableList<Column> tradeMeasureRequirements =
        ReportRequirements.of(column, column2).getTradeMeasureRequirements();
    assertEquals(2, tradeMeasureRequirements.size());
    Column expectedGetResult = tradeMeasureRequirements.get(0);
    assertEquals(expectedGetResult, tradeMeasureRequirements.get(1));
  }

  /**
   * Test {@link ReportRequirements#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return TradeMeasureRequirements size is one.
   * </ul>
   *
   * <p>Method under test: {@link ReportRequirements#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; then return TradeMeasureRequirements size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReportRequirements ReportRequirements.of(List)"})
  void testOfWithList_thenReturnTradeMeasureRequirementsSizeIsOne() {
    // Arrange
    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    Builder measureResult = builderResult.measure(measure);
    ColumnName name = ColumnName.of("Name");

    Builder nameResult = measureResult.name(name);
    CalculationParameters parameters = CalculationParameters.empty();
    columns.add(nameResult.parameters(parameters).reportingCurrency(null).build());

    // Act
    ReportRequirements actualOfResult = ReportRequirements.of(columns);

    // Assert
    ImmutableList<Column> tradeMeasureRequirements = actualOfResult.getTradeMeasureRequirements();
    assertEquals(1, tradeMeasureRequirements.size());
    Column getResult = tradeMeasureRequirements.get(0);
    assertFalse(getResult.getReportingCurrency().isPresent());
    CalculationParameters parameters2 = getResult.getParameters();
    assertTrue(parameters2.getParameters().isEmpty());
    assertSame(name, getResult.getName());
    assertSame(measure, getResult.getMeasure());
    assertSame(parameters, parameters2);
  }

  /**
   * Test {@link ReportRequirements#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return TradeMeasureRequirements size is two.
   * </ul>
   *
   * <p>Method under test: {@link ReportRequirements#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; then return TradeMeasureRequirements size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReportRequirements ReportRequirements.of(List)"})
  void testOfWithList_thenReturnTradeMeasureRequirementsSizeIsTwo() {
    // Arrange
    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult.parameters(CalculationParameters.empty()).reportingCurrency(null).build());

    Builder builderResult2 = Column.builder();

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    columns.add(
        nameResult2.parameters(CalculationParameters.empty()).reportingCurrency(null).build());

    // Act
    ReportRequirements actualOfResult = ReportRequirements.of(columns);

    // Assert
    ImmutableList<Column> tradeMeasureRequirements = actualOfResult.getTradeMeasureRequirements();
    assertEquals(2, tradeMeasureRequirements.size());
    Column expectedGetResult = tradeMeasureRequirements.get(0);
    assertEquals(expectedGetResult, tradeMeasureRequirements.get(1));
  }

  /**
   * Test {@link ReportRequirements#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return TradeMeasureRequirements is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ReportRequirements#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; when ArrayList(); then return TradeMeasureRequirements is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReportRequirements ReportRequirements.of(List)"})
  void testOfWithList_whenArrayList_thenReturnTradeMeasureRequirementsIsArrayList() {
    // Arrange
    ArrayList<Column> columns = new ArrayList<>();

    // Act
    ReportRequirements actualOfResult = ReportRequirements.of(columns);

    // Assert
    assertEquals(columns, actualOfResult.getTradeMeasureRequirements());
  }

  /**
   * Test {@link ReportRequirements#meta()}.
   *
   * <p>Method under test: {@link ReportRequirements#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ReportRequirements.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ReportRequirements.meta();

    // Assert
    MetaProperty<ImmutableList<Column>> tradeMeasureRequirementsResult =
        actualMetaResult.tradeMeasureRequirements();
    assertTrue(tradeMeasureRequirementsResult instanceof DirectMetaProperty);
    assertEquals("tradeMeasureRequirements", tradeMeasureRequirementsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, tradeMeasureRequirementsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, tradeMeasureRequirementsResult.propertyType());
    Class<ReportRequirements> expectedDeclaringTypeResult = ReportRequirements.class;
    assertEquals(expectedDeclaringTypeResult, tradeMeasureRequirementsResult.declaringType());
    assertSame(Meta.INSTANCE, tradeMeasureRequirementsResult.metaBean());
  }

  /**
   * Test {@link ReportRequirements#metaBean()}.
   *
   * <p>Method under test: {@link ReportRequirements#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ReportRequirements.metaBean()"})
  void testMetaBean() {
    // Arrange
    ReportRequirements ofResult = ReportRequirements.of(new ArrayList<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReportRequirements#toString()}
   *   <li>{@link ReportRequirements#getTradeMeasureRequirements()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList ReportRequirements.getTradeMeasureRequirements()",
    "String ReportRequirements.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ReportRequirements ofResult = ReportRequirements.of(new ArrayList<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("ReportRequirements{tradeMeasureRequirements=[]}", actualToStringResult);
    assertTrue(ofResult.getTradeMeasureRequirements().isEmpty());
  }

  /**
   * Test {@link ReportRequirements#equals(Object)}, and {@link ReportRequirements#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReportRequirements#equals(Object)}
   *   <li>{@link ReportRequirements#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReportRequirements.equals(Object)",
    "int ReportRequirements.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ReportRequirements ofResult = ReportRequirements.of(new ArrayList<>());
    ReportRequirements ofResult2 = ReportRequirements.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link ReportRequirements#equals(Object)}, and {@link ReportRequirements#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReportRequirements#equals(Object)}
   *   <li>{@link ReportRequirements#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReportRequirements.equals(Object)",
    "int ReportRequirements.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ReportRequirements ofResult = ReportRequirements.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link ReportRequirements#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReportRequirements#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReportRequirements.equals(Object)",
    "int ReportRequirements.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    Column column =
        nameResult.parameters(CalculationParameters.empty()).reportingCurrency(null).build();
    ReportRequirements ofResult = ReportRequirements.of(column);

    // Act and Assert
    assertNotEquals(ofResult, ReportRequirements.of(new ArrayList<>()));
  }

  /**
   * Test {@link ReportRequirements#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReportRequirements#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReportRequirements.equals(Object)",
    "int ReportRequirements.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ReportRequirements ofResult = ReportRequirements.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link ReportRequirements#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReportRequirements#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReportRequirements.equals(Object)",
    "int ReportRequirements.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ReportRequirements ofResult = ReportRequirements.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to ReportRequirements");
  }
}
