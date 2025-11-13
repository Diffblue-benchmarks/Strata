package com.opengamma.strata.report.framework.format;

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
import com.opengamma.strata.report.framework.format.FormatSettings.Meta;
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

class FormatSettingsDiffblueTest {
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);

    // Act
    Class<? extends FormatSettings<Object>> actualBeanTypeResult =
        metaFormatSettingsResult.beanType();

    // Assert
    Class<FormatSettings> expectedBeanTypeResult = FormatSettings.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#category()}
   *   <li>{@link Meta#formatter()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.category()", "MetaProperty Meta.formatter()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FormatSettings.meta();

    // Act
    MetaProperty<FormatCategory> actualCategoryResult = metaResult.category();

    // Assert
    assertTrue(actualCategoryResult instanceof DirectMetaProperty);
    assertTrue(metaResult.formatter() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean category return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean category return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanCategoryReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaFormatSettingsResult.metaPropertyGet("formatter");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FormatCategory> categoryResult = ((Meta<Object>) metaBeanResult).category();
    assertTrue(categoryResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("category", categoryResult.name());
    assertEquals("formatter", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, categoryResult.style());
    Class<FormatCategory> expectedPropertyTypeResult = FormatCategory.class;
    assertEquals(expectedPropertyTypeResult, categoryResult.propertyType());
    Class<FormatSettings> expectedDeclaringTypeResult = FormatSettings.class;
    assertEquals(expectedDeclaringTypeResult, categoryResult.declaringType());
    Class<ValueFormatter> expectedPropertyTypeResult2 = ValueFormatter.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).formatter());
    assertSame(Meta.INSTANCE, categoryResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean formatter return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean formatter return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanFormatterReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaFormatSettingsResult.metaPropertyGet("category");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ValueFormatter<Object>> formatterResult =
        ((Meta<Object>) metaBeanResult).formatter();
    assertTrue(formatterResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("category", actualMetaPropertyGetResult.name());
    assertEquals("formatter", formatterResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, formatterResult.style());
    Class<FormatCategory> expectedPropertyTypeResult = FormatCategory.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<FormatSettings> expectedDeclaringTypeResult = FormatSettings.class;
    assertEquals(expectedDeclaringTypeResult, formatterResult.declaringType());
    Class<ValueFormatter> expectedPropertyTypeResult2 = ValueFormatter.class;
    assertEquals(expectedPropertyTypeResult2, formatterResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).category());
    assertSame(Meta.INSTANCE, formatterResult.metaBean());
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);

    // Act and Assert
    assertNull(metaFormatSettingsResult.metaPropertyGet("Property Name"));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        metaFormatSettingsResult.metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("category");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("formatter");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("category", getResult.name());
    assertEquals("formatter", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<FormatCategory> expectedPropertyTypeResult = FormatCategory.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<FormatSettings> expectedDeclaringTypeResult = FormatSettings.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<FormatSettings> expectedDeclaringTypeResult2 = FormatSettings.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<ValueFormatter> expectedPropertyTypeResult2 = ValueFormatter.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@link FormatCategory}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return FormatCategory")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnFormatCategory() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);
    FormatSettings<Object> bean =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act
    Object actualPropertyGetResult = metaFormatSettingsResult.propertyGet(bean, "category", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof FormatCategory);
    assertEquals(FormatCategory.DATE, actualPropertyGetResult);
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);

    // Act and Assert
    assertNull(metaFormatSettingsResult.propertyGet(mock(Bean.class), "Property Name", true));
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
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);
    FormatSettings<Object> bean =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaFormatSettingsResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code category}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'category'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCategory_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaFormatSettingsResult.propertySet(mock(Bean.class), "category", "New Value", true));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            metaFormatSettingsResult.propertySet(mock(Bean.class), "category", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code formatter}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'formatter'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFormatter_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaFormatSettingsResult.propertySet(mock(Bean.class), "formatter", "New Value", true));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaFormatSettingsResult.propertySet(
                mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link FormatSettings#of(FormatCategory, ValueFormatter)}.
   *
   * <ul>
   *   <li>When {@link ToStringValueFormatter#INSTANCE}.
   *   <li>Then Formatter return {@link ToStringValueFormatter}.
   * </ul>
   *
   * <p>Method under test: {@link FormatSettings#of(FormatCategory, ValueFormatter)}
   */
  @Test
  @DisplayName(
      "Test of(FormatCategory, ValueFormatter); when INSTANCE; then Formatter return ToStringValueFormatter")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FormatSettings FormatSettings.of(FormatCategory, ValueFormatter)"})
  void testOf_whenInstance_thenFormatterReturnToStringValueFormatter() {
    // Arrange and Act
    FormatSettings<Object> actualOfResult =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Assert
    ValueFormatter<Object> formatter = actualOfResult.getFormatter();
    assertTrue(formatter instanceof ToStringValueFormatter);
    assertEquals(FormatCategory.DATE, actualOfResult.getCategory());
    assertSame(ToStringValueFormatter.INSTANCE, formatter);
  }

  /**
   * Test {@link FormatSettings#meta()}.
   *
   * <p>Method under test: {@link FormatSettings#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FormatSettings.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FormatSettings.meta();

    // Assert
    MetaProperty<FormatCategory> categoryResult = actualMetaResult.category();
    assertTrue(categoryResult instanceof DirectMetaProperty);
    MetaProperty<ValueFormatter> formatterResult = actualMetaResult.formatter();
    assertTrue(formatterResult instanceof DirectMetaProperty);
    assertEquals("category", categoryResult.name());
    assertEquals("formatter", formatterResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, categoryResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, formatterResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<FormatCategory> expectedPropertyTypeResult = FormatCategory.class;
    assertEquals(expectedPropertyTypeResult, categoryResult.propertyType());
    Class<FormatSettings> expectedDeclaringTypeResult = FormatSettings.class;
    assertEquals(expectedDeclaringTypeResult, categoryResult.declaringType());
    Class<FormatSettings> expectedDeclaringTypeResult2 = FormatSettings.class;
    assertEquals(expectedDeclaringTypeResult2, formatterResult.declaringType());
    Class<ValueFormatter> expectedPropertyTypeResult2 = ValueFormatter.class;
    assertEquals(expectedPropertyTypeResult2, formatterResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, categoryResult.metaBean());
    assertSame(meta, formatterResult.metaBean());
  }

  /**
   * Test {@link FormatSettings#metaFormatSettings(Class)}.
   *
   * <p>Method under test: {@link FormatSettings#metaFormatSettings(Class)}
   */
  @Test
  @DisplayName("Test metaFormatSettings(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FormatSettings.metaFormatSettings(Class)"})
  void testMetaFormatSettings() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Meta<Object> actualMetaFormatSettingsResult = FormatSettings.metaFormatSettings(cls);

    // Assert
    MetaProperty<FormatCategory> categoryResult = actualMetaFormatSettingsResult.category();
    assertTrue(categoryResult instanceof DirectMetaProperty);
    MetaProperty<ValueFormatter<Object>> formatterResult =
        actualMetaFormatSettingsResult.formatter();
    assertTrue(formatterResult instanceof DirectMetaProperty);
    assertEquals("category", categoryResult.name());
    assertEquals("formatter", formatterResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, categoryResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, formatterResult.style());
    assertTrue(actualMetaFormatSettingsResult.isBuildable());
    Class<FormatCategory> expectedPropertyTypeResult = FormatCategory.class;
    assertEquals(expectedPropertyTypeResult, categoryResult.propertyType());
    Class<FormatSettings> expectedDeclaringTypeResult = FormatSettings.class;
    assertEquals(expectedDeclaringTypeResult, categoryResult.declaringType());
    Class<FormatSettings> expectedDeclaringTypeResult2 = FormatSettings.class;
    assertEquals(expectedDeclaringTypeResult2, formatterResult.declaringType());
    Class<ValueFormatter> expectedPropertyTypeResult2 = ValueFormatter.class;
    assertEquals(expectedPropertyTypeResult2, formatterResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, categoryResult.metaBean());
    assertSame(meta, formatterResult.metaBean());
  }

  /**
   * Test {@link FormatSettings#metaBean()}.
   *
   * <p>Method under test: {@link FormatSettings#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FormatSettings.metaBean()"})
  void testMetaBean() {
    // Arrange
    FormatSettings<Object> ofResult =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FormatSettings#toString()}
   *   <li>{@link FormatSettings#getCategory()}
   *   <li>{@link FormatSettings#getFormatter()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FormatCategory FormatSettings.getCategory()",
    "ValueFormatter FormatSettings.getFormatter()",
    "String FormatSettings.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    FormatSettings<Object> ofResult =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act
    ofResult.toString();
    FormatCategory actualCategory = ofResult.getCategory();

    // Assert
    assertTrue(ofResult.getFormatter() instanceof ToStringValueFormatter);
    assertEquals(FormatCategory.DATE, actualCategory);
  }

  /**
   * Test {@link FormatSettings#equals(Object)}, and {@link FormatSettings#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FormatSettings#equals(Object)}
   *   <li>{@link FormatSettings#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FormatSettings.equals(Object)", "int FormatSettings.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FormatSettings<Object> ofResult =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);
    FormatSettings<Object> ofResult2 =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link FormatSettings#equals(Object)}, and {@link FormatSettings#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FormatSettings#equals(Object)}
   *   <li>{@link FormatSettings#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FormatSettings.equals(Object)", "int FormatSettings.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FormatSettings<Object> ofResult =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link FormatSettings#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FormatSettings#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FormatSettings.equals(Object)", "int FormatSettings.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FormatSettings<Object> ofResult =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link FormatSettings#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FormatSettings#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FormatSettings.equals(Object)", "int FormatSettings.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FormatSettings<Object> ofResult =
        FormatSettings.of(FormatCategory.NUMERIC, ToStringValueFormatter.INSTANCE);
    FormatSettings<Object> ofResult2 =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link FormatSettings#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FormatSettings#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FormatSettings.equals(Object)", "int FormatSettings.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FormatSettings<Object> ofResult =
        FormatSettings.of(FormatCategory.DATE, UnsupportedValueFormatter.INSTANCE);
    FormatSettings<Object> ofResult2 =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link FormatSettings#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FormatSettings#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FormatSettings.equals(Object)", "int FormatSettings.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    FormatSettings<Object> ofResult =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link FormatSettings#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FormatSettings#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FormatSettings.equals(Object)", "int FormatSettings.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    FormatSettings<Object> ofResult =
        FormatSettings.of(FormatCategory.DATE, ToStringValueFormatter.INSTANCE);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to FormatSettings");
  }
}
