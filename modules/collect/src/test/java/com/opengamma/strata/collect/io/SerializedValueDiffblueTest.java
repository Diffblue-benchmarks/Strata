package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.io.BeanByteSource.AsBeanCharSource;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.flexi.FlexiBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SerializedValueDiffblueTest {
  /**
   * Test {@link SerializedValue#serialize(Class, Object)}.
   *
   * <ul>
   *   <li>When {@link AsBeanCharSource#AsBeanCharSource(BeanByteSource, Charset)} with underlying
   *       is {@link ArrayByteSource#EMPTY} and charset is forName {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#serialize(Class, Object)}
   */
  @Test
  @DisplayName(
      "Test serialize(Class, Object); when AsBeanCharSource(BeanByteSource, Charset) with underlying is EMPTY and charset is forName 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SerializedValue SerializedValue.serialize(Class, Object)"})
  void testSerialize_whenAsBeanCharSourceWithUnderlyingIsEmptyAndCharsetIsForNameUtf8() {
    // Arrange
    Class<Object> javaType = Object.class;
    AsBeanCharSource asBeanCharSource =
        new AsBeanCharSource(ArrayByteSource.EMPTY, Charset.forName("UTF-8"));

    // Act
    SerializedValue actualSerializeResult = SerializedValue.serialize(javaType, asBeanCharSource);

    // Assert
    TypedMetaBean<SerializedValue> metaBeanResult = actualSerializeResult.metaBean();
    assertTrue(metaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = metaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    Set<String> propertyNamesResult = actualSerializeResult.propertyNames();
    assertEquals(3, propertyNamesResult.size());
    assertTrue(metaPropertyMapResult.containsKey("bean"));
    assertTrue(metaPropertyMapResult.containsKey("convert"));
    assertTrue(metaPropertyMapResult.containsKey("java"));
    assertTrue(propertyNamesResult.contains("bean"));
    assertTrue(propertyNamesResult.contains("convert"));
    assertTrue(propertyNamesResult.contains("java"));
    assertTrue(metaBeanResult.isBuildable());
    Class<SerializedValue> expectedBeanTypeResult = SerializedValue.class;
    assertEquals(expectedBeanTypeResult, metaBeanResult.beanType());
  }

  /**
   * Test {@link SerializedValue#serialize(Class, Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayByteSource#EMPTY}.
   *   <li>Then metaBean return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#serialize(Class, Object)}
   */
  @Test
  @DisplayName("Test serialize(Class, Object); when EMPTY; then metaBean return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SerializedValue SerializedValue.serialize(Class, Object)"})
  void testSerialize_whenEmpty_thenMetaBeanReturnLightMetaBean() {
    // Arrange
    Class<Object> javaType = Object.class;

    // Act
    SerializedValue actualSerializeResult =
        SerializedValue.serialize(javaType, ArrayByteSource.EMPTY);

    // Assert
    TypedMetaBean<SerializedValue> metaBeanResult = actualSerializeResult.metaBean();
    assertTrue(metaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = metaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    Set<String> propertyNamesResult = actualSerializeResult.propertyNames();
    assertEquals(3, propertyNamesResult.size());
    assertTrue(metaPropertyMapResult.containsKey("bean"));
    assertTrue(metaPropertyMapResult.containsKey("convert"));
    assertTrue(metaPropertyMapResult.containsKey("java"));
    assertTrue(propertyNamesResult.contains("bean"));
    assertTrue(propertyNamesResult.contains("convert"));
    assertTrue(propertyNamesResult.contains("java"));
    assertTrue(metaBeanResult.isBuildable());
    Class<SerializedValue> expectedBeanTypeResult = SerializedValue.class;
    assertEquals(expectedBeanTypeResult, metaBeanResult.beanType());
  }

  /**
   * Test {@link SerializedValue#serialize(Class, Object)}.
   *
   * <ul>
   *   <li>When {@link FlexiBean#FlexiBean()}.
   *   <li>Then metaBean return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#serialize(Class, Object)}
   */
  @Test
  @DisplayName(
      "Test serialize(Class, Object); when FlexiBean(); then metaBean return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SerializedValue SerializedValue.serialize(Class, Object)"})
  void testSerialize_whenFlexiBean_thenMetaBeanReturnLightMetaBean() {
    // Arrange
    Class<Object> javaType = Object.class;

    // Act
    SerializedValue actualSerializeResult = SerializedValue.serialize(javaType, new FlexiBean());

    // Assert
    TypedMetaBean<SerializedValue> metaBeanResult = actualSerializeResult.metaBean();
    assertTrue(metaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = metaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    Set<String> propertyNamesResult = actualSerializeResult.propertyNames();
    assertEquals(3, propertyNamesResult.size());
    assertTrue(metaPropertyMapResult.containsKey("bean"));
    assertTrue(metaPropertyMapResult.containsKey("convert"));
    assertTrue(metaPropertyMapResult.containsKey("java"));
    assertTrue(propertyNamesResult.contains("bean"));
    assertTrue(propertyNamesResult.contains("convert"));
    assertTrue(propertyNamesResult.contains("java"));
    assertTrue(metaBeanResult.isBuildable());
    Class<SerializedValue> expectedBeanTypeResult = SerializedValue.class;
    assertEquals(expectedBeanTypeResult, metaBeanResult.beanType());
  }

  /**
   * Test {@link SerializedValue#serialize(Class, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then metaBean return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#serialize(Class, Object)}
   */
  @Test
  @DisplayName("Test serialize(Class, Object); when 'null'; then metaBean return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SerializedValue SerializedValue.serialize(Class, Object)"})
  void testSerialize_whenNull_thenMetaBeanReturnLightMetaBean() {
    // Arrange
    Class<Object> javaType = Object.class;

    // Act
    SerializedValue actualSerializeResult = SerializedValue.serialize(javaType, null);

    // Assert
    TypedMetaBean<SerializedValue> metaBeanResult = actualSerializeResult.metaBean();
    assertTrue(metaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = metaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    Set<String> propertyNamesResult = actualSerializeResult.propertyNames();
    assertEquals(3, propertyNamesResult.size());
    assertTrue(metaPropertyMapResult.containsKey("bean"));
    assertTrue(metaPropertyMapResult.containsKey("convert"));
    assertTrue(metaPropertyMapResult.containsKey("java"));
    assertTrue(propertyNamesResult.contains("bean"));
    assertTrue(propertyNamesResult.contains("convert"));
    assertTrue(propertyNamesResult.contains("java"));
    assertTrue(metaBeanResult.isBuildable());
    Class<SerializedValue> expectedBeanTypeResult = SerializedValue.class;
    assertEquals(expectedBeanTypeResult, metaBeanResult.beanType());
  }

  /**
   * Test {@link SerializedValue#serialize(Class, Object)}.
   *
   * <ul>
   *   <li>When serialize {@link Object} and {@code Value}.
   *   <li>Then metaBean return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#serialize(Class, Object)}
   */
  @Test
  @DisplayName(
      "Test serialize(Class, Object); when serialize Object and 'Value'; then metaBean return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SerializedValue SerializedValue.serialize(Class, Object)"})
  void testSerialize_whenSerializeObjectAndValue_thenMetaBeanReturnLightMetaBean() {
    // Arrange
    Class<Object> javaType = Object.class;
    Class<Object> javaType2 = Object.class;

    // Act
    SerializedValue actualSerializeResult =
        SerializedValue.serialize(javaType, SerializedValue.serialize(javaType2, "Value"));

    // Assert
    TypedMetaBean<SerializedValue> metaBeanResult = actualSerializeResult.metaBean();
    assertTrue(metaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = metaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    Set<String> propertyNamesResult = actualSerializeResult.propertyNames();
    assertEquals(3, propertyNamesResult.size());
    assertTrue(metaPropertyMapResult.containsKey("bean"));
    assertTrue(metaPropertyMapResult.containsKey("convert"));
    assertTrue(metaPropertyMapResult.containsKey("java"));
    assertTrue(propertyNamesResult.contains("bean"));
    assertTrue(propertyNamesResult.contains("convert"));
    assertTrue(propertyNamesResult.contains("java"));
    assertTrue(metaBeanResult.isBuildable());
    Class<SerializedValue> expectedBeanTypeResult = SerializedValue.class;
    assertEquals(expectedBeanTypeResult, metaBeanResult.beanType());
  }

  /**
   * Test {@link SerializedValue#serialize(Class, Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then metaBean return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#serialize(Class, Object)}
   */
  @Test
  @DisplayName("Test serialize(Class, Object); when 'Value'; then metaBean return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SerializedValue SerializedValue.serialize(Class, Object)"})
  void testSerialize_whenValue_thenMetaBeanReturnLightMetaBean() {
    // Arrange
    Class<Object> javaType = Object.class;

    // Act
    SerializedValue actualSerializeResult = SerializedValue.serialize(javaType, "Value");

    // Assert
    TypedMetaBean<SerializedValue> metaBeanResult = actualSerializeResult.metaBean();
    assertTrue(metaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = metaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    Set<String> propertyNamesResult = actualSerializeResult.propertyNames();
    assertEquals(3, propertyNamesResult.size());
    assertTrue(metaPropertyMapResult.containsKey("bean"));
    assertTrue(metaPropertyMapResult.containsKey("convert"));
    assertTrue(metaPropertyMapResult.containsKey("java"));
    assertTrue(propertyNamesResult.contains("bean"));
    assertTrue(propertyNamesResult.contains("convert"));
    assertTrue(propertyNamesResult.contains("java"));
    assertTrue(metaBeanResult.isBuildable());
    Class<SerializedValue> expectedBeanTypeResult = SerializedValue.class;
    assertEquals(expectedBeanTypeResult, metaBeanResult.beanType());
  }

  /**
   * Test {@link SerializedValue#serialize(Class, Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then metaBean return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#serialize(Class, Object)}
   */
  @Test
  @DisplayName("Test serialize(Class, Object); when 'Value'; then metaBean return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SerializedValue SerializedValue.serialize(Class, Object)"})
  void testSerialize_whenValue_thenMetaBeanReturnLightMetaBean2() {
    // Arrange and Act
    SerializedValue actualSerializeResult = SerializedValue.serialize(null, "Value");

    // Assert
    TypedMetaBean<SerializedValue> metaBeanResult = actualSerializeResult.metaBean();
    assertTrue(metaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = metaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    Set<String> propertyNamesResult = actualSerializeResult.propertyNames();
    assertEquals(3, propertyNamesResult.size());
    assertTrue(metaPropertyMapResult.containsKey("bean"));
    assertTrue(metaPropertyMapResult.containsKey("convert"));
    assertTrue(metaPropertyMapResult.containsKey("java"));
    assertTrue(propertyNamesResult.contains("bean"));
    assertTrue(propertyNamesResult.contains("convert"));
    assertTrue(propertyNamesResult.contains("java"));
    assertTrue(metaBeanResult.isBuildable());
    Class<SerializedValue> expectedBeanTypeResult = SerializedValue.class;
    assertEquals(expectedBeanTypeResult, metaBeanResult.beanType());
  }

  /**
   * Test {@link SerializedValue#deserialize(Class)}.
   *
   * <ul>
   *   <li>Given serialize {@link Object} and {@code null}.
   *   <li>When {@code Object}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#deserialize(Class)}
   */
  @Test
  @DisplayName(
      "Test deserialize(Class); given serialize Object and 'null'; when 'java.lang.Object'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SerializedValue.deserialize(Class)"})
  void testDeserialize_givenSerializeObjectAndNull_whenJavaLangObject_thenReturnNull() {
    // Arrange
    Class<Object> javaType = Object.class;
    SerializedValue serializeResult = SerializedValue.serialize(javaType, null);
    Class<Object> javaType2 = Object.class;

    // Act and Assert
    assertNull(serializeResult.deserialize(javaType2));
  }

  /**
   * Test {@link SerializedValue#deserialize(Class)}.
   *
   * <ul>
   *   <li>Given serialize {@link Object} and {@code Value}.
   *   <li>When {@code Object}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#deserialize(Class)}
   */
  @Test
  @DisplayName(
      "Test deserialize(Class); given serialize Object and 'Value'; when 'java.lang.Object'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SerializedValue.deserialize(Class)"})
  void testDeserialize_givenSerializeObjectAndValue_whenJavaLangObject_thenReturnValue() {
    // Arrange
    Class<Object> javaType = Object.class;
    SerializedValue serializeResult = SerializedValue.serialize(javaType, "Value");
    Class<Object> javaType2 = Object.class;

    // Act and Assert
    assertEquals("Value", serializeResult.deserialize(javaType2));
  }

  /**
   * Test {@link SerializedValue#meta()}.
   *
   * <p>Method under test: {@link SerializedValue#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SerializedValue.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SerializedValue> actualMetaResult = SerializedValue.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("bean"));
    assertTrue(metaPropertyMapResult.containsKey("convert"));
    assertTrue(metaPropertyMapResult.containsKey("java"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SerializedValue> expectedBeanTypeResult = SerializedValue.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SerializedValue#metaBean()}.
   *
   * <p>Method under test: {@link SerializedValue#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SerializedValue.metaBean()"})
  void testMetaBean() {
    // Arrange
    Class<Object> javaType = Object.class;

    // Act
    TypedMetaBean<SerializedValue> actualMetaBeanResult =
        SerializedValue.serialize(javaType, "Value").metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("bean"));
    assertTrue(metaPropertyMapResult.containsKey("convert"));
    assertTrue(metaPropertyMapResult.containsKey("java"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SerializedValue> expectedBeanTypeResult = SerializedValue.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link SerializedValue#equals(Object)}, and {@link SerializedValue#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SerializedValue#equals(Object)}
   *   <li>{@link SerializedValue#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SerializedValue.equals(Object)", "int SerializedValue.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Class<Object> javaType = Object.class;
    SerializedValue serializeResult = SerializedValue.serialize(javaType, "Value");
    Class<Object> javaType2 = Object.class;
    SerializedValue serializeResult2 = SerializedValue.serialize(javaType2, "Value");

    // Act and Assert
    assertEquals(serializeResult, serializeResult2);
    assertEquals(serializeResult.hashCode(), serializeResult2.hashCode());
  }

  /**
   * Test {@link SerializedValue#equals(Object)}, and {@link SerializedValue#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SerializedValue#equals(Object)}
   *   <li>{@link SerializedValue#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SerializedValue.equals(Object)", "int SerializedValue.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Class<Object> javaType = Object.class;
    SerializedValue serializeResult = SerializedValue.serialize(javaType, "Value");

    // Act and Assert
    assertEquals(serializeResult, serializeResult);
    int expectedHashCodeResult = serializeResult.hashCode();
    assertEquals(expectedHashCodeResult, serializeResult.hashCode());
  }

  /**
   * Test {@link SerializedValue#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SerializedValue.equals(Object)", "int SerializedValue.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Class<Object> javaType = Object.class;

    // Act and Assert
    assertNotEquals(SerializedValue.serialize(javaType, "Value"), 1);
  }

  /**
   * Test {@link SerializedValue#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SerializedValue.equals(Object)", "int SerializedValue.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Class<Object> javaType = Object.class;
    SerializedValue serializeResult = SerializedValue.serialize(javaType, 42);
    Class<Object> javaType2 = Object.class;

    // Act and Assert
    assertNotEquals(serializeResult, SerializedValue.serialize(javaType2, "Value"));
  }

  /**
   * Test {@link SerializedValue#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SerializedValue.equals(Object)", "int SerializedValue.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Class<Object> javaType = Object.class;
    Class<Object> javaType2 = Object.class;
    SerializedValue serializeResult =
        SerializedValue.serialize(javaType, SerializedValue.serialize(javaType2, "Value"));
    Class<Object> javaType3 = Object.class;

    // Act and Assert
    assertNotEquals(serializeResult, SerializedValue.serialize(javaType3, "Value"));
  }

  /**
   * Test {@link SerializedValue#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SerializedValue.equals(Object)", "int SerializedValue.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Class<Object> javaType = Object.class;

    // Act and Assert
    assertNotEquals(SerializedValue.serialize(javaType, "Value"), null);
  }

  /**
   * Test {@link SerializedValue#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SerializedValue#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SerializedValue.equals(Object)", "int SerializedValue.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Class<Object> javaType = Object.class;

    // Act and Assert
    assertNotEquals(
        SerializedValue.serialize(javaType, "Value"), "Different type to SerializedValue");
  }

  /**
   * Test {@link SerializedValue#toString()}.
   *
   * <p>Method under test: {@link SerializedValue#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SerializedValue.toString()"})
  void testToString() {
    // Arrange
    Class<Object> javaType = Object.class;

    // Act and Assert
    assertEquals(
        "SerializedValue{convert=null, bean=null, java=[-84, -19, 0, 5, 116, 0, 5, 86, 97, 108, 117, 101]}",
        SerializedValue.serialize(javaType, "Value").toString());
  }
}
