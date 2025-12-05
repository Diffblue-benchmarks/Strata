package com.opengamma.strata.report.trade;

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
import com.opengamma.strata.report.trade.TradeReportTemplate.Builder;
import com.opengamma.strata.report.trade.TradeReportTemplate.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeReportTemplateDiffblueTest {
  /**
   * Test Builder {@link Builder#columns(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return build Columns is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columns(List)}
   */
  @Test
  @DisplayName("Test Builder columns(List) with 'List'; then return build Columns is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(List)"})
  void testBuilderColumnsWithList_thenReturnBuildColumnsIsArrayList() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();

    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    // Act and Assert
    assertEquals(columns, builderResult.columns(columns).build().getColumns());
    assertEquals(columns, builderResult.build().getColumns());
  }

  /**
   * Test Builder {@link Builder#columns(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return build Columns size is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columns(List)}
   */
  @Test
  @DisplayName("Test Builder columns(List) with 'List'; then return build Columns size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(List)"})
  void testBuilderColumnsWithList_thenReturnBuildColumnsSizeIsTwo() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();

    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    // Act and Assert
    List<TradeReportColumn> columns2 = builderResult.columns(columns).build().getColumns();
    assertEquals(2, columns2.size());
    TradeReportColumn expectedGetResult = columns2.get(0);
    assertEquals(expectedGetResult, columns2.get(1));
  }

  /**
   * Test Builder {@link Builder#columns(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return build Columns Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columns(List)}
   */
  @Test
  @DisplayName(
      "Test Builder columns(List) with 'List'; when ArrayList(); then return build Columns Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(List)"})
  void testBuilderColumnsWithList_whenArrayList_thenReturnBuildColumnsEmpty() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();

    // Act
    Builder actualColumnsResult = builderResult.columns(new ArrayList<>());

    // Assert
    assertTrue(actualColumnsResult.build().getColumns().isEmpty());
    assertSame(builderResult, actualColumnsResult);
  }

  /**
   * Test Builder {@link Builder#columns(TradeReportColumn[])} with {@code TradeReportColumn[]}.
   *
   * <ul>
   *   <li>Then return build Columns Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columns(TradeReportColumn[])}
   */
  @Test
  @DisplayName(
      "Test Builder columns(TradeReportColumn[]) with 'TradeReportColumn[]'; then return build Columns Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(TradeReportColumn[])"})
  void testBuilderColumnsWithTradeReportColumn_thenReturnBuildColumnsEmpty() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();

    // Act
    Builder actualColumnsResult = builderResult.columns();

    // Assert
    assertTrue(actualColumnsResult.build().getColumns().isEmpty());
    assertSame(builderResult, actualColumnsResult);
  }

  /**
   * Test Builder {@link Builder#columns(TradeReportColumn[])} with {@code TradeReportColumn[]}.
   *
   * <ul>
   *   <li>Then return build Columns size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columns(TradeReportColumn[])}
   */
  @Test
  @DisplayName(
      "Test Builder columns(TradeReportColumn[]) with 'TradeReportColumn[]'; then return build Columns size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(TradeReportColumn[])"})
  void testBuilderColumnsWithTradeReportColumn_thenReturnBuildColumnsSizeIsOne() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();

    // Act and Assert
    List<TradeReportColumn> columns =
        builderResult
            .columns(
                TradeReportColumn.builder()
                    .header("Header")
                    .ignoreFailures(true)
                    .value("42")
                    .build())
            .build()
            .getColumns();
    assertEquals(1, columns.size());
    TradeReportColumn getResult = columns.get(0);
    Optional<String> value = getResult.getValue();
    assertEquals("42", value.get());
    assertEquals("Header", getResult.getHeader());
    assertTrue(getResult.isIgnoreFailures());
    assertTrue(value.isPresent());
  }

  /**
   * Test Builder {@link Builder#columns(TradeReportColumn[])} with {@code TradeReportColumn[]}.
   *
   * <ul>
   *   <li>Then return build Columns size is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columns(TradeReportColumn[])}
   */
  @Test
  @DisplayName(
      "Test Builder columns(TradeReportColumn[]) with 'TradeReportColumn[]'; then return build Columns size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(TradeReportColumn[])"})
  void testBuilderColumnsWithTradeReportColumn_thenReturnBuildColumnsSizeIsTwo() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();
    TradeReportColumn tradeReportColumn =
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build();

    // Act and Assert
    List<TradeReportColumn> columns =
        builderResult
            .columns(
                tradeReportColumn,
                TradeReportColumn.builder()
                    .header("Header")
                    .ignoreFailures(true)
                    .value("42")
                    .build())
            .build()
            .getColumns();
    assertEquals(2, columns.size());
    TradeReportColumn expectedGetResult = columns.get(0);
    assertEquals(expectedGetResult, columns.get(1));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'columns'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenColumns_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = TradeReportTemplate.builder().get("columns");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
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
    assertThrows(
        NoSuchElementException.class, () -> TradeReportTemplate.builder().get("Property Name"));
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
        NoSuchElementException.class,
        () -> TradeReportTemplate.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then return build Columns Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'columns'; then return build Columns Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenColumns_thenReturnBuildColumnsEmpty() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();

    // Act
    Builder actualSetResult = builderResult.set("columns", new ArrayList<>());

    // Assert
    assertTrue(actualSetResult.build().getColumns().isEmpty());
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return build Columns Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return build Columns Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuildColumnsEmpty() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertTrue(actualSetResult.build().getColumns().isEmpty());
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link TradeReportTemplate#meta()}.
   *
   * <p>Method under test: {@link TradeReportTemplate#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TradeReportTemplate.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = TradeReportTemplate.meta();

    // Assert
    MetaProperty<List<TradeReportColumn>> columnsResult = actualMetaResult.columns();
    assertTrue(columnsResult instanceof DirectMetaProperty);
    assertEquals("columns", columnsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, columnsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<TradeReportTemplate> expectedDeclaringTypeResult = TradeReportTemplate.class;
    assertEquals(expectedDeclaringTypeResult, columnsResult.declaringType());
    Class<List> expectedPropertyTypeResult = List.class;
    assertEquals(expectedPropertyTypeResult, columnsResult.propertyType());
    assertSame(Meta.INSTANCE, columnsResult.metaBean());
  }

  /**
   * Test {@link TradeReportTemplate#metaBean()}.
   *
   * <p>Method under test: {@link TradeReportTemplate#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TradeReportTemplate.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();

    // Act and Assert
    assertSame(Meta.INSTANCE, builderResult.columns(new ArrayList<>()).build().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeReportTemplate#toString()}
   *   <li>{@link TradeReportTemplate#getColumns()}
   *   <li>{@link TradeReportTemplate#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List TradeReportTemplate.getColumns()",
    "Builder TradeReportTemplate.toBuilder()",
    "String TradeReportTemplate.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();
    TradeReportTemplate tradeReportTemplate = builderResult.columns(new ArrayList<>()).build();

    // Act
    String actualToStringResult = tradeReportTemplate.toString();
    List<TradeReportColumn> actualColumns = tradeReportTemplate.getColumns();
    tradeReportTemplate.toBuilder();

    // Assert
    assertEquals("TradeReportTemplate{columns=[]}", actualToStringResult);
    assertTrue(actualColumns.isEmpty());
  }

  /**
   * Test {@link TradeReportTemplate#equals(Object)}, and {@link TradeReportTemplate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeReportTemplate#equals(Object)}
   *   <li>{@link TradeReportTemplate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportTemplate.equals(Object)",
    "int TradeReportTemplate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();
    TradeReportTemplate tradeReportTemplate = builderResult.columns(new ArrayList<>()).build();

    Builder builderResult2 = TradeReportTemplate.builder();
    TradeReportTemplate tradeReportTemplate2 = builderResult2.columns(new ArrayList<>()).build();

    // Act and Assert
    assertEquals(tradeReportTemplate, tradeReportTemplate2);
    assertEquals(tradeReportTemplate.hashCode(), tradeReportTemplate2.hashCode());
  }

  /**
   * Test {@link TradeReportTemplate#equals(Object)}, and {@link TradeReportTemplate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeReportTemplate#equals(Object)}
   *   <li>{@link TradeReportTemplate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportTemplate.equals(Object)",
    "int TradeReportTemplate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();
    TradeReportTemplate tradeReportTemplate = builderResult.columns(new ArrayList<>()).build();

    // Act and Assert
    assertEquals(tradeReportTemplate, tradeReportTemplate);
    int expectedHashCodeResult = tradeReportTemplate.hashCode();
    assertEquals(expectedHashCodeResult, tradeReportTemplate.hashCode());
  }

  /**
   * Test {@link TradeReportTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportTemplate.equals(Object)",
    "int TradeReportTemplate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    TradeReportTemplate tradeReportTemplate =
        TradeReportTemplate.builder().columns(columns).build();

    Builder builderResult = TradeReportTemplate.builder();

    // Act and Assert
    assertNotEquals(tradeReportTemplate, builderResult.columns(new ArrayList<>()).build());
  }

  /**
   * Test {@link TradeReportTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportTemplate.equals(Object)",
    "int TradeReportTemplate.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();

    // Act and Assert
    assertNotEquals(builderResult.columns(new ArrayList<>()).build(), null);
  }

  /**
   * Test {@link TradeReportTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportTemplate.equals(Object)",
    "int TradeReportTemplate.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();

    // Act and Assert
    assertNotEquals(
        builderResult.columns(new ArrayList<>()).build(), "Different type to TradeReportTemplate");
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
    Class<? extends TradeReportTemplate> actualBeanTypeResult =
        TradeReportTemplate.meta().beanType();

    // Assert
    Class<TradeReportTemplate> expectedBeanTypeResult = TradeReportTemplate.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#builder()}.
   *
   * <p>Method under test: {@link Meta#builder()}
   */
  @Test
  @DisplayName("Test Meta builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Meta.builder()"})
  void testMetaBuilder() {
    // Arrange, Act and Assert
    assertTrue(TradeReportTemplate.meta().builder().build().getColumns().isEmpty());
  }

  /**
   * Test Meta {@link Meta#columns()}.
   *
   * <p>Method under test: {@link Meta#columns()}
   */
  @Test
  @DisplayName("Test Meta columns()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.columns()"})
  void testMetaColumns() {
    // Arrange, Act and Assert
    assertTrue(TradeReportTemplate.meta().columns() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'columns'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenColumns_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TradeReportTemplate.meta().metaPropertyGet("columns");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("columns", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<TradeReportTemplate> expectedDeclaringTypeResult = TradeReportTemplate.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    Class<List> expectedPropertyTypeResult = List.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
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
    assertNull(TradeReportTemplate.meta().metaPropertyGet("Property Name"));
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
        TradeReportTemplate.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("columns");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("columns", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<TradeReportTemplate> expectedDeclaringTypeResult = TradeReportTemplate.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<List> expectedPropertyTypeResult = List.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
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
    assertNull(TradeReportTemplate.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When builder columns {@link ArrayList#ArrayList()} build.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when builder columns ArrayList() build; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBuilderColumnsArrayListBuild_thenReturnList() {
    // Arrange
    Meta metaResult = TradeReportTemplate.meta();

    Builder builderResult = TradeReportTemplate.builder();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(builderResult.columns(new ArrayList<>()).build(), "columns", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
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
        () -> TradeReportTemplate.meta().propertyGet(null, "Property Name", false));
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
            TradeReportTemplate.meta().propertySet(mock(Bean.class), "columns", "New Value", true));
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
            TradeReportTemplate.meta()
                .propertySet(mock(Bean.class), "columns", "New Value", false));
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
            TradeReportTemplate.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
