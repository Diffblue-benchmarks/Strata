package com.opengamma.strata.calc;

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
import com.opengamma.strata.calc.Results.Meta;
import com.opengamma.strata.collect.result.Result;
import java.util.ArrayList;
import java.util.List;
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

class ResultsDiffblueTest {
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
    Class<? extends Results> actualBeanTypeResult = Results.meta().beanType();

    // Assert
    Class<Results> expectedBeanTypeResult = Results.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#cells()}
   *   <li>{@link Meta#columns()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.cells()", "MetaProperty Meta.columns()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = Results.meta();

    // Act
    MetaProperty<ImmutableList<Result<?>>> actualCellsResult = metaResult.cells();

    // Assert
    assertTrue(actualCellsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.columns() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code cells}.
   *   <li>Then metaBean columns return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'cells'; then metaBean columns return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCells_thenMetaBeanColumnsReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = Results.meta().metaPropertyGet("cells");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<ColumnHeader>> columnsResult = ((Meta) metaBeanResult).columns();
    assertTrue(columnsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("cells", actualMetaPropertyGetResult.name());
    assertEquals("columns", columnsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, columnsResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, columnsResult.propertyType());
    Class<Results> expectedDeclaringTypeResult = Results.class;
    assertEquals(expectedDeclaringTypeResult, columnsResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).cells());
    assertSame(Meta.INSTANCE, columnsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then metaBean cells return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'columns'; then metaBean cells return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenColumns_thenMetaBeanCellsReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = Results.meta().metaPropertyGet("columns");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<Result<?>>> cellsResult = ((Meta) metaBeanResult).cells();
    assertTrue(cellsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("cells", cellsResult.name());
    assertEquals("columns", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, cellsResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, cellsResult.propertyType());
    Class<Results> expectedDeclaringTypeResult = Results.class;
    assertEquals(expectedDeclaringTypeResult, cellsResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).columns());
    assertSame(Meta.INSTANCE, cellsResult.metaBean());
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
    assertNull(Results.meta().metaPropertyGet("Property Name"));
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = Results.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("columns");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("cells");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("cells", getResult2.name());
    assertEquals("columns", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ImmutableList> expectedPropertyTypeResult2 = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<Results> expectedDeclaringTypeResult = Results.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<Results> expectedDeclaringTypeResult2 = Results.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
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
    assertNull(Results.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code cells}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'cells'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCells_thenReturnList() {
    // Arrange
    Meta metaResult = Results.meta();
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results bean = Results.of(columns, new ArrayList<>());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "cells", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'columns'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenColumns_thenReturnList() {
    // Arrange
    Meta metaResult = Results.meta();
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results bean = Results.of(columns, new ArrayList<>());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "columns", true);

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
    // Arrange
    Meta metaResult = Results.meta();
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results bean = Results.of(columns, new ArrayList<>());

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code cells}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'cells'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCells_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> Results.meta().propertySet(mock(Bean.class), "cells", "New Value", true));
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
        () -> Results.meta().propertySet(mock(Bean.class), "columns", "New Value", true));
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
        () -> Results.meta().propertySet(mock(Bean.class), "cells", "New Value", false));
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
        () -> Results.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link Results#of(List, List)}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with name is {@code columns}.
   *   <li>Then return ColumnCount is one.
   * </ul>
   *
   * <p>Method under test: {@link Results#of(List, List)}
   */
  @Test
  @DisplayName(
      "Test of(List, List); given ColumnName with name is 'columns'; then return ColumnCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Results Results.of(List, List)"})
  void testOf_givenColumnNameWithNameIsColumns_thenReturnColumnCountIsOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("columns");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("columns")));
    ArrayList<Result<?>> cells = new ArrayList<>();

    // Act
    Results actualOfResult = Results.of(columns, cells);

    // Assert
    assertEquals(1, actualOfResult.getColumnCount());
    assertEquals(cells, actualOfResult.getCells());
    assertEquals(columns, actualOfResult.getColumns());
  }

  /**
   * Test {@link Results#of(List, List)}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with name is {@code columns}.
   *   <li>Then return ColumnCount is two.
   * </ul>
   *
   * <p>Method under test: {@link Results#of(List, List)}
   */
  @Test
  @DisplayName(
      "Test of(List, List); given ColumnName with name is 'columns'; then return ColumnCount is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Results Results.of(List, List)"})
  void testOf_givenColumnNameWithNameIsColumns_thenReturnColumnCountIsTwo() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("columns");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("columns")));
    ColumnName name2 = ColumnName.of("columns");
    ColumnHeader ofResult = ColumnHeader.of(name2, ImmutableMeasure.of("columns"));
    columns.add(ofResult);

    // Act
    Results actualOfResult = Results.of(columns, new ArrayList<>());

    // Assert
    assertEquals(2, actualOfResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = actualOfResult.getColumns();
    assertEquals(2, columns2.size());
    assertSame(ofResult, columns2.get(1));
  }

  /**
   * Test {@link Results#of(List, List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return ColumnCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link Results#of(List, List)}
   */
  @Test
  @DisplayName("Test of(List, List); when ArrayList(); then return ColumnCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Results Results.of(List, List)"})
  void testOf_whenArrayList_thenReturnColumnCountIsZero() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();

    // Act
    Results actualOfResult = Results.of(columns, new ArrayList<>());

    // Assert
    assertEquals(0, actualOfResult.getColumnCount());
    ImmutableList<Result<?>> cells = actualOfResult.getCells();
    assertTrue(cells.isEmpty());
    assertSame(cells, actualOfResult.getColumns());
  }

  /**
   * Test {@link Results#get(int, int, Class)} with {@code rowIndex}, {@code columnIndex}, {@code
   * type}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, int, Class)}
   */
  @Test
  @DisplayName("Test get(int, int, Class) with 'rowIndex', 'columnIndex', 'type'; when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, int, Class)"})
  void testGetWithRowIndexColumnIndexType_whenMinusOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(-1, 1, type));
  }

  /**
   * Test {@link Results#get(int, int, Class)} with {@code rowIndex}, {@code columnIndex}, {@code
   * type}.
   *
   * <ul>
   *   <li>When {@link Object}.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, int, Class)}
   */
  @Test
  @DisplayName("Test get(int, int, Class) with 'rowIndex', 'columnIndex', 'type'; when Object")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, int, Class)"})
  void testGetWithRowIndexColumnIndexType_whenObject() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(1, 1, type));
  }

  /**
   * Test {@link Results#get(int, int)} with {@code rowIndex}, {@code columnIndex}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, int)}
   */
  @Test
  @DisplayName("Test get(int, int) with 'rowIndex', 'columnIndex'; when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, int)"})
  void testGetWithRowIndexColumnIndex_whenMinusOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Results.of(columns, new ArrayList<>()).get(-1, 1));
  }

  /**
   * Test {@link Results#get(int, int)} with {@code rowIndex}, {@code columnIndex}.
   *
   * <ul>
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, int)}
   */
  @Test
  @DisplayName("Test get(int, int) with 'rowIndex', 'columnIndex'; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, int)"})
  void testGetWithRowIndexColumnIndex_whenOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Results.of(columns, new ArrayList<>()).get(1, 1));
  }

  /**
   * Test {@link Results#get(int, ColumnName, Class)} with {@code rowIndex}, {@code columnName},
   * {@code type}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with name is {@code Column name not found: {}}.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, ColumnName, Class)}
   */
  @Test
  @DisplayName(
      "Test get(int, ColumnName, Class) with 'rowIndex', 'columnName', 'type'; given ColumnName with name is 'Column name not found: {}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, ColumnName, Class)"})
  void testGetWithRowIndexColumnNameType_givenColumnNameWithNameIsColumnNameNotFound() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());
    ColumnName columnName = ColumnName.of("Name");
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(1, columnName, type));
  }

  /**
   * Test {@link Results#get(int, ColumnName, Class)} with {@code rowIndex}, {@code columnName},
   * {@code type}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with name is {@code Column name not found: {}}.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, ColumnName, Class)}
   */
  @Test
  @DisplayName(
      "Test get(int, ColumnName, Class) with 'rowIndex', 'columnName', 'type'; given ColumnName with name is 'Column name not found: {}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, ColumnName, Class)"})
  void testGetWithRowIndexColumnNameType_givenColumnNameWithNameIsColumnNameNotFound2() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    ColumnName name2 = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name2, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());
    ColumnName columnName = ColumnName.of("Name");
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(1, columnName, type));
  }

  /**
   * Test {@link Results#get(int, ColumnName, Class)} with {@code rowIndex}, {@code columnName},
   * {@code type}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with {@code Name}.
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, ColumnName, Class)}
   */
  @Test
  @DisplayName(
      "Test get(int, ColumnName, Class) with 'rowIndex', 'columnName', 'type'; given ColumnName with 'Name'; when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, ColumnName, Class)"})
  void testGetWithRowIndexColumnNameType_givenColumnNameWithName_whenMinusOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Name");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());
    ColumnName columnName = ColumnName.of("Name");
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(-1, columnName, type));
  }

  /**
   * Test {@link Results#get(int, ColumnName, Class)} with {@code rowIndex}, {@code columnName},
   * {@code type}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with {@code Name}.
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, ColumnName, Class)}
   */
  @Test
  @DisplayName(
      "Test get(int, ColumnName, Class) with 'rowIndex', 'columnName', 'type'; given ColumnName with 'Name'; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, ColumnName, Class)"})
  void testGetWithRowIndexColumnNameType_givenColumnNameWithName_whenOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Name");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());
    ColumnName columnName = ColumnName.of("Name");
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(1, columnName, type));
  }

  /**
   * Test {@link Results#get(int, ColumnName, Class)} with {@code rowIndex}, {@code columnName},
   * {@code type}.
   *
   * <ul>
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, ColumnName, Class)}
   */
  @Test
  @DisplayName("Test get(int, ColumnName, Class) with 'rowIndex', 'columnName', 'type'; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, ColumnName, Class)"})
  void testGetWithRowIndexColumnNameType_whenOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    ColumnName columnName = ColumnName.of("Name");
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(1, columnName, type));
  }

  /**
   * Test {@link Results#get(int, ColumnName)} with {@code rowIndex}, {@code columnName}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with name is {@code Column name not found: {}}.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, ColumnName)}
   */
  @Test
  @DisplayName(
      "Test get(int, ColumnName) with 'rowIndex', 'columnName'; given ColumnName with name is 'Column name not found: {}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, ColumnName)"})
  void testGetWithRowIndexColumnName_givenColumnNameWithNameIsColumnNameNotFound() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(1, ColumnName.of("Name")));
  }

  /**
   * Test {@link Results#get(int, ColumnName)} with {@code rowIndex}, {@code columnName}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with name is {@code Column name not found: {}}.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, ColumnName)}
   */
  @Test
  @DisplayName(
      "Test get(int, ColumnName) with 'rowIndex', 'columnName'; given ColumnName with name is 'Column name not found: {}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, ColumnName)"})
  void testGetWithRowIndexColumnName_givenColumnNameWithNameIsColumnNameNotFound2() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    ColumnName name2 = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name2, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(1, ColumnName.of("Name")));
  }

  /**
   * Test {@link Results#get(int, ColumnName)} with {@code rowIndex}, {@code columnName}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with {@code Name}.
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, ColumnName)}
   */
  @Test
  @DisplayName(
      "Test get(int, ColumnName) with 'rowIndex', 'columnName'; given ColumnName with 'Name'; when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, ColumnName)"})
  void testGetWithRowIndexColumnName_givenColumnNameWithName_whenMinusOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Name");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(-1, ColumnName.of("Name")));
  }

  /**
   * Test {@link Results#get(int, ColumnName)} with {@code rowIndex}, {@code columnName}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with {@code Name}.
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, ColumnName)}
   */
  @Test
  @DisplayName(
      "Test get(int, ColumnName) with 'rowIndex', 'columnName'; given ColumnName with 'Name'; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, ColumnName)"})
  void testGetWithRowIndexColumnName_givenColumnNameWithName_whenOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Name");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(1, ColumnName.of("Name")));
  }

  /**
   * Test {@link Results#get(int, ColumnName)} with {@code rowIndex}, {@code columnName}.
   *
   * <ul>
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Results#get(int, ColumnName)}
   */
  @Test
  @DisplayName("Test get(int, ColumnName) with 'rowIndex', 'columnName'; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.get(int, ColumnName)"})
  void testGetWithRowIndexColumnName_whenOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.get(1, ColumnName.of("Name")));
  }

  /**
   * Test {@link Results#getScenarios(int, int, Class)} with {@code rowIndex}, {@code columnIndex},
   * {@code componentType}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Results#getScenarios(int, int, Class)}
   */
  @Test
  @DisplayName(
      "Test getScenarios(int, int, Class) with 'rowIndex', 'columnIndex', 'componentType'; when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.getScenarios(int, int, Class)"})
  void testGetScenariosWithRowIndexColumnIndexComponentType_whenMinusOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    Class<Object> componentType = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getScenarios(-1, 1, componentType));
  }

  /**
   * Test {@link Results#getScenarios(int, int, Class)} with {@code rowIndex}, {@code columnIndex},
   * {@code componentType}.
   *
   * <ul>
   *   <li>When {@link Object}.
   * </ul>
   *
   * <p>Method under test: {@link Results#getScenarios(int, int, Class)}
   */
  @Test
  @DisplayName(
      "Test getScenarios(int, int, Class) with 'rowIndex', 'columnIndex', 'componentType'; when Object")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.getScenarios(int, int, Class)"})
  void testGetScenariosWithRowIndexColumnIndexComponentType_whenObject() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    Class<Object> componentType = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getScenarios(1, 1, componentType));
  }

  /**
   * Test {@link Results#getScenarios(int, ColumnName, Class)} with {@code rowIndex}, {@code
   * columnName}, {@code componentType}.
   *
   * <p>Method under test: {@link Results#getScenarios(int, ColumnName, Class)}
   */
  @Test
  @DisplayName(
      "Test getScenarios(int, ColumnName, Class) with 'rowIndex', 'columnName', 'componentType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.getScenarios(int, ColumnName, Class)"})
  void testGetScenariosWithRowIndexColumnNameComponentType() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());
    ColumnName columnName = ColumnName.of("Name");
    Class<Object> componentType = Object.class;

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.getScenarios(1, columnName, componentType));
  }

  /**
   * Test {@link Results#getScenarios(int, ColumnName, Class)} with {@code rowIndex}, {@code
   * columnName}, {@code componentType}.
   *
   * <p>Method under test: {@link Results#getScenarios(int, ColumnName, Class)}
   */
  @Test
  @DisplayName(
      "Test getScenarios(int, ColumnName, Class) with 'rowIndex', 'columnName', 'componentType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.getScenarios(int, ColumnName, Class)"})
  void testGetScenariosWithRowIndexColumnNameComponentType2() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    ColumnName name2 = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name2, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());
    ColumnName columnName = ColumnName.of("Name");
    Class<Object> componentType = Object.class;

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.getScenarios(1, columnName, componentType));
  }

  /**
   * Test {@link Results#getScenarios(int, ColumnName, Class)} with {@code rowIndex}, {@code
   * columnName}, {@code componentType}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Results#getScenarios(int, ColumnName, Class)}
   */
  @Test
  @DisplayName(
      "Test getScenarios(int, ColumnName, Class) with 'rowIndex', 'columnName', 'componentType'; given ColumnName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.getScenarios(int, ColumnName, Class)"})
  void testGetScenariosWithRowIndexColumnNameComponentType_givenColumnNameWithName() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Name");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());
    ColumnName columnName = ColumnName.of("Name");
    Class<Object> componentType = Object.class;

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.getScenarios(1, columnName, componentType));
  }

  /**
   * Test {@link Results#getScenarios(int, ColumnName, Class)} with {@code rowIndex}, {@code
   * columnName}, {@code componentType}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Results#getScenarios(int, ColumnName, Class)}
   */
  @Test
  @DisplayName(
      "Test getScenarios(int, ColumnName, Class) with 'rowIndex', 'columnName', 'componentType'; when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.getScenarios(int, ColumnName, Class)"})
  void testGetScenariosWithRowIndexColumnNameComponentType_whenMinusOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Name");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());
    ColumnName columnName = ColumnName.of("Name");
    Class<Object> componentType = Object.class;

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.getScenarios(-1, columnName, componentType));
  }

  /**
   * Test {@link Results#getScenarios(int, ColumnName, Class)} with {@code rowIndex}, {@code
   * columnName}, {@code componentType}.
   *
   * <ul>
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Results#getScenarios(int, ColumnName, Class)}
   */
  @Test
  @DisplayName(
      "Test getScenarios(int, ColumnName, Class) with 'rowIndex', 'columnName', 'componentType'; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Results.getScenarios(int, ColumnName, Class)"})
  void testGetScenariosWithRowIndexColumnNameComponentType_whenOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    ColumnName columnName = ColumnName.of("Name");
    Class<Object> componentType = Object.class;

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.getScenarios(1, columnName, componentType));
  }

  /**
   * Test {@link Results#columnIndexByName(ColumnName)}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with name is {@code Column name not found: {}}.
   * </ul>
   *
   * <p>Method under test: {@link Results#columnIndexByName(ColumnName)}
   */
  @Test
  @DisplayName(
      "Test columnIndexByName(ColumnName); given ColumnName with name is 'Column name not found: {}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Results.columnIndexByName(ColumnName)"})
  void testColumnIndexByName_givenColumnNameWithNameIsColumnNameNotFound() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.columnIndexByName(ColumnName.of("Name")));
  }

  /**
   * Test {@link Results#columnIndexByName(ColumnName)}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with name is {@code Column name not found: {}}.
   * </ul>
   *
   * <p>Method under test: {@link Results#columnIndexByName(ColumnName)}
   */
  @Test
  @DisplayName(
      "Test columnIndexByName(ColumnName); given ColumnName with name is 'Column name not found: {}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Results.columnIndexByName(ColumnName)"})
  void testColumnIndexByName_givenColumnNameWithNameIsColumnNameNotFound2() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    ColumnName name2 = ColumnName.of("Column name not found: {}");
    columns.add(ColumnHeader.of(name2, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.columnIndexByName(ColumnName.of("Name")));
  }

  /**
   * Test {@link Results#columnIndexByName(ColumnName)}.
   *
   * <ul>
   *   <li>Given {@link ColumnName} with {@code Name}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Results#columnIndexByName(ColumnName)}
   */
  @Test
  @DisplayName("Test columnIndexByName(ColumnName); given ColumnName with 'Name'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Results.columnIndexByName(ColumnName)"})
  void testColumnIndexByName_givenColumnNameWithName_thenReturnZero() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Name");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());

    // Act and Assert
    assertEquals(0, ofResult.columnIndexByName(ColumnName.of("Name")));
  }

  /**
   * Test {@link Results#columnIndexByName(ColumnName)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Results#columnIndexByName(ColumnName)}
   */
  @Test
  @DisplayName("Test columnIndexByName(ColumnName); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Results.columnIndexByName(ColumnName)"})
  void testColumnIndexByName_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.columnIndexByName(ColumnName.of("Name")));
  }

  /**
   * Test {@link Results#columnResults(int, Class)} with {@code columnIndex}, {@code type}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Results#columnResults(int, Class)}
   */
  @Test
  @DisplayName("Test columnResults(int, Class) with 'columnIndex', 'type'; when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.stream.Stream Results.columnResults(int, Class)"})
  void testColumnResultsWithColumnIndexType_whenMinusOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.columnResults(-1, type));
  }

  /**
   * Test {@link Results#columnResults(int, Class)} with {@code columnIndex}, {@code type}.
   *
   * <ul>
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Results#columnResults(int, Class)}
   */
  @Test
  @DisplayName("Test columnResults(int, Class) with 'columnIndex', 'type'; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.stream.Stream Results.columnResults(int, Class)"})
  void testColumnResultsWithColumnIndexType_whenOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.columnResults(1, type));
  }

  /**
   * Test {@link Results#columnResults(int)} with {@code columnIndex}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Results#columnResults(int)}
   */
  @Test
  @DisplayName("Test columnResults(int) with 'columnIndex'; when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.stream.Stream Results.columnResults(int)"})
  void testColumnResultsWithColumnIndex_whenMinusOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Results.of(columns, new ArrayList<>()).columnResults(-1));
  }

  /**
   * Test {@link Results#columnResults(int)} with {@code columnIndex}.
   *
   * <ul>
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Results#columnResults(int)}
   */
  @Test
  @DisplayName("Test columnResults(int) with 'columnIndex'; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.stream.Stream Results.columnResults(int)"})
  void testColumnResultsWithColumnIndex_whenOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Results.of(columns, new ArrayList<>()).columnResults(1));
  }

  /**
   * Test {@link Results#columnResultsScenarios(int, Class)}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link Results#columnResultsScenarios(int, Class)}
   */
  @Test
  @DisplayName("Test columnResultsScenarios(int, Class); when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.stream.Stream Results.columnResultsScenarios(int, Class)"})
  void testColumnResultsScenarios_whenMinusOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    Class<Object> componentType = Object.class;

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.columnResultsScenarios(-1, componentType));
  }

  /**
   * Test {@link Results#columnResultsScenarios(int, Class)}.
   *
   * <ul>
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Results#columnResultsScenarios(int, Class)}
   */
  @Test
  @DisplayName("Test columnResultsScenarios(int, Class); when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.stream.Stream Results.columnResultsScenarios(int, Class)"})
  void testColumnResultsScenarios_whenOne() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    Class<Object> componentType = Object.class;

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.columnResultsScenarios(1, componentType));
  }

  /**
   * Test {@link Results#meta()}.
   *
   * <p>Method under test: {@link Results#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Results.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = Results.meta();

    // Assert
    MetaProperty<ImmutableList<Result<?>>> cellsResult = actualMetaResult.cells();
    assertTrue(cellsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ColumnHeader>> columnsResult = actualMetaResult.columns();
    assertTrue(columnsResult instanceof DirectMetaProperty);
    assertEquals("cells", cellsResult.name());
    assertEquals("columns", columnsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, cellsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, columnsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, cellsResult.propertyType());
    Class<ImmutableList> expectedPropertyTypeResult2 = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult2, columnsResult.propertyType());
    Class<Results> expectedDeclaringTypeResult = Results.class;
    assertEquals(expectedDeclaringTypeResult, cellsResult.declaringType());
    Class<Results> expectedDeclaringTypeResult2 = Results.class;
    assertEquals(expectedDeclaringTypeResult2, columnsResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, cellsResult.metaBean());
    assertSame(meta, columnsResult.metaBean());
  }

  /**
   * Test {@link Results#metaBean()}.
   *
   * <p>Method under test: {@link Results#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Results.metaBean()"})
  void testMetaBean() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();

    // Act and Assert
    assertSame(Meta.INSTANCE, Results.of(columns, new ArrayList<>()).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Results#toString()}
   *   <li>{@link Results#getCells()}
   *   <li>{@link Results#getColumnCount()}
   *   <li>{@link Results#getColumns()}
   *   <li>{@link Results#getRowCount()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList Results.getCells()",
    "int Results.getColumnCount()",
    "ImmutableList Results.getColumns()",
    "int Results.getRowCount()",
    "String Results.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());

    // Act
    String actualToStringResult = ofResult.toString();
    ImmutableList<Result<?>> actualCells = ofResult.getCells();
    int actualColumnCount = ofResult.getColumnCount();
    ImmutableList<ColumnHeader> actualColumns = ofResult.getColumns();

    // Assert
    assertEquals("Results{columns=[], cells=[]}", actualToStringResult);
    assertEquals(0, actualColumnCount);
    assertEquals(0, ofResult.getRowCount());
    assertSame(actualCells, actualColumns);
  }

  /**
   * Test {@link Results#equals(Object)}, and {@link Results#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Results#equals(Object)}
   *   <li>{@link Results#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Results.equals(Object)", "int Results.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    ArrayList<ColumnHeader> columns2 = new ArrayList<>();
    Results ofResult2 = Results.of(columns2, new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link Results#equals(Object)}, and {@link Results#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Results#equals(Object)}
   *   <li>{@link Results#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Results.equals(Object)", "int Results.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link Results#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Results#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Results.equals(Object)", "int Results.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();

    // Act and Assert
    assertNotEquals(Results.of(columns, new ArrayList<>()), 1);
  }

  /**
   * Test {@link Results#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Results#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Results.equals(Object)", "int Results.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    ColumnName name = ColumnName.of("Name");
    columns.add(ColumnHeader.of(name, ImmutableMeasure.of("Name")));
    Results ofResult = Results.of(columns, new ArrayList<>());
    ArrayList<ColumnHeader> columns2 = new ArrayList<>();
    Results ofResult2 = Results.of(columns2, new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link Results#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Results#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Results.equals(Object)", "int Results.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();

    // Act and Assert
    assertNotEquals(Results.of(columns, new ArrayList<>()), null);
  }

  /**
   * Test {@link Results#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Results#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Results.equals(Object)", "int Results.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ArrayList<ColumnHeader> columns = new ArrayList<>();

    // Act and Assert
    assertNotEquals(Results.of(columns, new ArrayList<>()), "Different type to Results");
  }
}
