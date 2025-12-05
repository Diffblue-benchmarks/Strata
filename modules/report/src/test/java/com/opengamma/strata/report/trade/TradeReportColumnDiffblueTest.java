package com.opengamma.strata.report.trade;

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
import com.opengamma.strata.report.trade.TradeReportColumn.Builder;
import com.opengamma.strata.report.trade.TradeReportColumn.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeReportColumnDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Builder#build()}
   *   <li>{@link Builder#ignoreFailures(boolean)}
   *   <li>{@link Builder#value(String)}
   * </ul>
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TradeReportColumn Builder.build()",
    "Builder Builder.ignoreFailures(boolean)",
    "String Builder.toString()",
    "Builder Builder.value(String)"
  })
  void testBuilderBuild() {
    // Arrange and Act
    TradeReportColumn actualTradeReportColumn =
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build();

    // Assert
    Optional<String> value = actualTradeReportColumn.getValue();
    assertEquals("42", value.get());
    assertEquals("Header", actualTradeReportColumn.getHeader());
    assertTrue(actualTradeReportColumn.isIgnoreFailures());
    assertTrue(value.isPresent());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code header}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'header'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenHeader_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TradeReportColumn.builder().get("header"));
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
        NoSuchElementException.class, () -> TradeReportColumn.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#header(String)}.
   *
   * <ul>
   *   <li>When {@code Header}.
   *   <li>Then builder build Header is {@code Header}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#header(String)}
   */
  @Test
  @DisplayName("Test Builder header(String); when 'Header'; then builder build Header is 'Header'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.header(String)"})
  void testBuilderHeader_whenHeader_thenBuilderBuildHeaderIsHeader() {
    // Arrange
    Builder builderResult = TradeReportColumn.builder();

    // Act
    Builder actualHeaderResult = builderResult.header("Header");

    // Assert
    TradeReportColumn tradeReportColumn = builderResult.build();
    assertEquals("Header", tradeReportColumn.getHeader());
    assertFalse(tradeReportColumn.isIgnoreFailures());
    assertSame(builderResult, actualHeaderResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then builder build Header is {@code New Value}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then builder build Header is 'New Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenBuilderBuildHeaderIsNewValue() {
    // Arrange
    Builder builderResult = TradeReportColumn.builder();

    // Act
    Builder actualSetResult = builderResult.set("header", "New Value");

    // Assert
    TradeReportColumn tradeReportColumn = builderResult.build();
    assertEquals("New Value", tradeReportColumn.getHeader());
    assertFalse(tradeReportColumn.isIgnoreFailures());
    assertSame(builderResult, actualSetResult);
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
        () -> TradeReportColumn.builder().set("Property Name", "New Value"));
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
    Builder builderResult = TradeReportColumn.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link TradeReportColumn#meta()}.
   *
   * <p>Method under test: {@link TradeReportColumn#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TradeReportColumn.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = TradeReportColumn.meta();

    // Assert
    MetaProperty<String> headerResult = actualMetaResult.header();
    assertTrue(headerResult instanceof DirectMetaProperty);
    MetaProperty<Boolean> ignoreFailuresResult = actualMetaResult.ignoreFailures();
    assertTrue(ignoreFailuresResult instanceof DirectMetaProperty);
    MetaProperty<String> valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("boolean", ignoreFailuresResult.propertyType().getName());
    assertEquals("header", headerResult.name());
    assertEquals("ignoreFailures", ignoreFailuresResult.name());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, headerResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, ignoreFailuresResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<TradeReportColumn> expectedDeclaringTypeResult = TradeReportColumn.class;
    assertEquals(expectedDeclaringTypeResult, headerResult.declaringType());
    Class<TradeReportColumn> expectedDeclaringTypeResult2 = TradeReportColumn.class;
    assertEquals(expectedDeclaringTypeResult2, ignoreFailuresResult.declaringType());
    Class<TradeReportColumn> expectedDeclaringTypeResult3 = TradeReportColumn.class;
    assertEquals(expectedDeclaringTypeResult3, valueResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, headerResult.propertyType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, valueResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, headerResult.metaBean());
    assertSame(meta, ignoreFailuresResult.metaBean());
    assertSame(meta, valueResult.metaBean());
  }

  /**
   * Test {@link TradeReportColumn#metaBean()}.
   *
   * <p>Method under test: {@link TradeReportColumn#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TradeReportColumn.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        TradeReportColumn.builder()
            .header("Header")
            .ignoreFailures(true)
            .value("42")
            .build()
            .metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeReportColumn#toString()}
   *   <li>{@link TradeReportColumn#getHeader()}
   *   <li>{@link TradeReportColumn#isIgnoreFailures()}
   *   <li>{@link TradeReportColumn#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String TradeReportColumn.getHeader()",
    "boolean TradeReportColumn.isIgnoreFailures()",
    "Builder TradeReportColumn.toBuilder()",
    "String TradeReportColumn.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    TradeReportColumn tradeReportColumn =
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build();

    // Act
    String actualToStringResult = tradeReportColumn.toString();
    String actualHeader = tradeReportColumn.getHeader();
    boolean actualIsIgnoreFailuresResult = tradeReportColumn.isIgnoreFailures();
    tradeReportColumn.toBuilder();

    // Assert
    assertEquals("Header", actualHeader);
    assertEquals(
        "TradeReportColumn{header=Header, value=42, ignoreFailures=true}", actualToStringResult);
    assertTrue(actualIsIgnoreFailuresResult);
  }

  /**
   * Test {@link TradeReportColumn#getValue()}.
   *
   * <p>Method under test: {@link TradeReportColumn#getValue()}
   */
  @Test
  @DisplayName("Test getValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional TradeReportColumn.getValue()"})
  void testGetValue() {
    // Arrange and Act
    Optional<String> actualValue =
        TradeReportColumn.builder()
            .header("Header")
            .ignoreFailures(true)
            .value("42")
            .build()
            .getValue();

    // Assert
    assertEquals("42", actualValue.get());
    assertTrue(actualValue.isPresent());
  }

  /**
   * Test {@link TradeReportColumn#equals(Object)}, and {@link TradeReportColumn#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeReportColumn#equals(Object)}
   *   <li>{@link TradeReportColumn#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportColumn.equals(Object)",
    "int TradeReportColumn.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TradeReportColumn tradeReportColumn =
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build();
    TradeReportColumn tradeReportColumn2 =
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build();

    // Act and Assert
    assertEquals(tradeReportColumn, tradeReportColumn2);
    assertEquals(tradeReportColumn.hashCode(), tradeReportColumn2.hashCode());
  }

  /**
   * Test {@link TradeReportColumn#equals(Object)}, and {@link TradeReportColumn#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeReportColumn#equals(Object)}
   *   <li>{@link TradeReportColumn#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportColumn.equals(Object)",
    "int TradeReportColumn.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TradeReportColumn tradeReportColumn =
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build();

    // Act and Assert
    assertEquals(tradeReportColumn, tradeReportColumn);
    int expectedHashCodeResult = tradeReportColumn.hashCode();
    assertEquals(expectedHashCodeResult, tradeReportColumn.hashCode());
  }

  /**
   * Test {@link TradeReportColumn#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportColumn#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportColumn.equals(Object)",
    "int TradeReportColumn.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TradeReportColumn tradeReportColumn =
        TradeReportColumn.builder().header("header").ignoreFailures(true).value("42").build();

    // Act and Assert
    assertNotEquals(
        tradeReportColumn,
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
  }

  /**
   * Test {@link TradeReportColumn#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportColumn#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportColumn.equals(Object)",
    "int TradeReportColumn.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TradeReportColumn tradeReportColumn =
        TradeReportColumn.builder().header("Header").ignoreFailures(false).value("42").build();

    // Act and Assert
    assertNotEquals(
        tradeReportColumn,
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
  }

  /**
   * Test {@link TradeReportColumn#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportColumn#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportColumn.equals(Object)",
    "int TradeReportColumn.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TradeReportColumn tradeReportColumn =
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("Value").build();

    // Act and Assert
    assertNotEquals(
        tradeReportColumn,
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
  }

  /**
   * Test {@link TradeReportColumn#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportColumn#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportColumn.equals(Object)",
    "int TradeReportColumn.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build(),
        null);
  }

  /**
   * Test {@link TradeReportColumn#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportColumn#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TradeReportColumn.equals(Object)",
    "int TradeReportColumn.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build(),
        "Different type to TradeReportColumn");
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
    Class<? extends TradeReportColumn> actualBeanTypeResult = TradeReportColumn.meta().beanType();

    // Assert
    Class<TradeReportColumn> expectedBeanTypeResult = TradeReportColumn.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#header()}
   *   <li>{@link Meta#ignoreFailures()}
   *   <li>{@link Meta#value()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.header()",
    "MetaProperty Meta.ignoreFailures()",
    "MetaProperty Meta.value()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = TradeReportColumn.meta();

    // Act
    MetaProperty<String> actualHeaderResult = metaResult.header();
    MetaProperty<Boolean> actualIgnoreFailuresResult = metaResult.ignoreFailures();

    // Assert
    assertTrue(actualHeaderResult instanceof DirectMetaProperty);
    assertTrue(actualIgnoreFailuresResult instanceof DirectMetaProperty);
    assertTrue(metaResult.value() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code header}.
   *   <li>Then return name is {@code header}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'header'; then return name is 'header'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenHeader_thenReturnNameIsHeader() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TradeReportColumn.meta().metaPropertyGet("header");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> ignoreFailuresResult = ((Meta) metaBeanResult).ignoreFailures();
    assertTrue(ignoreFailuresResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> valueResult = ((Meta) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("header", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).header());
    assertSame(metaBeanResult, ignoreFailuresResult.metaBean());
    assertSame(metaBeanResult, valueResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code ignoreFailures}.
   *   <li>Then return propertyType Name is {@code boolean}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'ignoreFailures'; then return propertyType Name is 'boolean'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIgnoreFailures_thenReturnPropertyTypeNameIsBoolean() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TradeReportColumn.meta().metaPropertyGet("ignoreFailures");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> headerResult = ((Meta) metaBeanResult).header();
    assertTrue(headerResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> valueResult = ((Meta) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("boolean", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("ignoreFailures", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).ignoreFailures());
    assertSame(metaBeanResult, headerResult.metaBean());
    assertSame(metaBeanResult, valueResult.metaBean());
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
    assertNull(TradeReportColumn.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return name is {@code value}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'value'; then return name is 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValue_thenReturnNameIsValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = TradeReportColumn.meta().metaPropertyGet("value");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> headerResult = ((Meta) metaBeanResult).header();
    assertTrue(headerResult instanceof DirectMetaProperty);
    MetaProperty<Boolean> ignoreFailuresResult = ((Meta) metaBeanResult).ignoreFailures();
    assertTrue(ignoreFailuresResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("value", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).value());
    assertSame(metaBeanResult, headerResult.metaBean());
    assertSame(metaBeanResult, ignoreFailuresResult.metaBean());
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
        TradeReportColumn.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("header");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("ignoreFailures");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("value");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("boolean", getResult2.propertyType().getName());
    assertEquals("header", getResult.name());
    assertEquals("ignoreFailures", getResult2.name());
    assertEquals("value", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<TradeReportColumn> expectedDeclaringTypeResult = TradeReportColumn.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<TradeReportColumn> expectedDeclaringTypeResult2 = TradeReportColumn.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<TradeReportColumn> expectedDeclaringTypeResult3 = TradeReportColumn.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnFalse() {
    // Arrange
    Meta metaResult = TradeReportColumn.meta();

    // Act and Assert
    assertFalse(
        (Boolean)
            metaResult.propertyGet(
                TradeReportColumn.builder()
                    .header("Header")
                    .ignoreFailures(false)
                    .value("42")
                    .build(),
                "ignoreFailures",
                true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnTrue() {
    // Arrange
    Meta metaResult = TradeReportColumn.meta();

    // Act and Assert
    assertTrue(
        (Boolean)
            metaResult.propertyGet(
                TradeReportColumn.builder()
                    .header("Header")
                    .ignoreFailures(true)
                    .value("42")
                    .build(),
                "ignoreFailures",
                true));
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
    assertNull(TradeReportColumn.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> TradeReportColumn.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code header}.
   *   <li>Then return {@code Header}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'header'; then return 'Header'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenHeader_thenReturnHeader() {
    // Arrange
    Meta metaResult = TradeReportColumn.meta();

    // Act and Assert
    assertEquals(
        "Header",
        metaResult.propertyGet(
            TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build(),
            "header",
            true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'value'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValue_thenReturn42() {
    // Arrange
    Meta metaResult = TradeReportColumn.meta();

    // Act and Assert
    assertEquals(
        "42",
        metaResult.propertyGet(
            TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build(),
            "value",
            true));
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
        () -> TradeReportColumn.meta().propertySet(mock(Bean.class), "header", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code header}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'header'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenHeader_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> TradeReportColumn.meta().propertySet(mock(Bean.class), "header", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code ignoreFailures}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'ignoreFailures'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIgnoreFailures_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            TradeReportColumn.meta()
                .propertySet(mock(Bean.class), "ignoreFailures", "New Value", true));
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
            TradeReportColumn.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'value'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> TradeReportColumn.meta().propertySet(mock(Bean.class), "value", "New Value", true));
  }
}
