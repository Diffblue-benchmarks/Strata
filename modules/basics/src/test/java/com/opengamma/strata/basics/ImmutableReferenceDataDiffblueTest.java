package com.opengamma.strata.basics;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.ImmutableReferenceData.Meta;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableReferenceDataDiffblueTest {
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
    Class<? extends ImmutableReferenceData> actualBeanTypeResult =
        ImmutableReferenceData.meta().beanType();

    // Assert
    Class<ImmutableReferenceData> expectedBeanTypeResult = ImmutableReferenceData.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
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
    assertNull(ImmutableReferenceData.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'values'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValues_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableReferenceData.meta().metaPropertyGet("values");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("values", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<ImmutableReferenceData> expectedDeclaringTypeResult = ImmutableReferenceData.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
        ImmutableReferenceData.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("values");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("values", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<ImmutableReferenceData> expectedDeclaringTypeResult = ImmutableReferenceData.class;
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
    assertNull(ImmutableReferenceData.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            ImmutableReferenceData.meta()
                .propertyGet(StandardReferenceData.MINIMAL, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link StandardReferenceData#MINIMAL}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when MINIMAL; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenMinimal_thenReturnMap() {
    // Arrange and Act
    Object actualPropertyGetResult =
        ImmutableReferenceData.meta().propertyGet(StandardReferenceData.MINIMAL, "values", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertEquals(4, ((Map<HolidayCalendarId, Object>) actualPropertyGetResult).size());
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
            ImmutableReferenceData.meta()
                .propertySet(mock(Bean.class), "values", "New Value", false));
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
            ImmutableReferenceData.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'values'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValues_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableReferenceData.meta()
                .propertySet(mock(Bean.class), "values", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#values()}.
   *
   * <p>Method under test: {@link Meta#values()}
   */
  @Test
  @DisplayName("Test Meta values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.values()"})
  void testMetaValues() {
    // Arrange, Act and Assert
    assertTrue(ImmutableReferenceData.meta().values() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link ImmutableReferenceData#of(ReferenceDataId, Object)} with {@code id}, {@code value}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#of(ReferenceDataId, Object)}
   */
  @Test
  @DisplayName(
      "Test of(ReferenceDataId, Object) with 'id', 'value'; given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableReferenceData ImmutableReferenceData.of(ReferenceDataId, Object)"})
  void testOfWithIdValue_givenIllegalArgumentException() {
    // Arrange
    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    when(id.getReferenceDataType()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ImmutableReferenceData.of(id, "Value"));
    verify(id).getReferenceDataType();
  }

  /**
   * Test {@link ImmutableReferenceData#of(ReferenceDataId, Object)} with {@code id}, {@code value}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#of(ReferenceDataId, Object)}
   */
  @Test
  @DisplayName(
      "Test of(ReferenceDataId, Object) with 'id', 'value'; given 'java.lang.Object'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableReferenceData ImmutableReferenceData.of(ReferenceDataId, Object)"})
  void testOfWithIdValue_givenJavaLangObject_thenReturnValuesSizeIsOne() {
    // Arrange
    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getReferenceDataType()).thenReturn(forNameResult);

    // Act
    ImmutableReferenceData actualOfResult = ImmutableReferenceData.of(id, "Value");

    // Assert
    verify(id).getReferenceDataType();
    assertEquals(1, actualOfResult.getValues().size());
  }

  /**
   * Test {@link ImmutableReferenceData#of(ReferenceDataId, Object)} with {@code id}, {@code value}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#of(ReferenceDataId, Object)}
   */
  @Test
  @DisplayName(
      "Test of(ReferenceDataId, Object) with 'id', 'value'; given 'java.lang.Object'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableReferenceData ImmutableReferenceData.of(ReferenceDataId, Object)"})
  void testOfWithIdValue_givenJavaLangObject_whenNull_thenThrowIllegalArgumentException() {
    // Arrange
    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getReferenceDataType()).thenReturn(forNameResult);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ImmutableReferenceData.of(id, null));
    verify(id).getReferenceDataType();
  }

  /**
   * Test {@link ImmutableReferenceData#of(Map)} with {@code values}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return Values is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'values'; given 'java.lang.Object'; then return Values is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableReferenceData ImmutableReferenceData.of(Map)"})
  void testOfWithValues_givenJavaLangObject_thenReturnValuesIsHashMap() {
    // Arrange
    ReferenceDataId<Object> referenceDataId = mock(ReferenceDataId.class);
    Class<Object> forNameResult = Object.class;
    when(referenceDataId.getReferenceDataType()).thenReturn(forNameResult);

    HashMap<ReferenceDataId<?>, Object> values = new HashMap<>();
    values.put(referenceDataId, "Value");

    // Act
    ImmutableReferenceData actualOfResult = ImmutableReferenceData.of(values);

    // Assert
    verify(referenceDataId).getReferenceDataType();
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableReferenceData#of(Map)} with {@code values}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return Values is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'values'; given 'java.lang.Object'; then return Values is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableReferenceData ImmutableReferenceData.of(Map)"})
  void testOfWithValues_givenJavaLangObject_thenReturnValuesIsHashMap2() {
    // Arrange
    ReferenceDataId<Object> referenceDataId = mock(ReferenceDataId.class);
    Class<Object> forNameResult = Object.class;
    when(referenceDataId.getReferenceDataType()).thenReturn(forNameResult);

    ReferenceDataId<Object> referenceDataId2 = mock(ReferenceDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(referenceDataId2.getReferenceDataType()).thenReturn(forNameResult2);

    HashMap<ReferenceDataId<?>, Object> values = new HashMap<>();
    values.put(referenceDataId2, "Value");
    values.put(referenceDataId, "Value");

    // Act
    ImmutableReferenceData actualOfResult = ImmutableReferenceData.of(values);

    // Assert
    verify(referenceDataId2).getReferenceDataType();
    verify(referenceDataId).getReferenceDataType();
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableReferenceData#of(Map)} with {@code values}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return Values is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'values'; given 'java.lang.Object'; then return Values is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableReferenceData ImmutableReferenceData.of(Map)"})
  void testOfWithValues_givenJavaLangObject_thenReturnValuesIsHashMap3() {
    // Arrange
    ReferenceDataId<Object> referenceDataId = mock(ReferenceDataId.class);
    Class<Object> forNameResult = Object.class;
    when(referenceDataId.getReferenceDataType()).thenReturn(forNameResult);

    ReferenceDataId<Object> referenceDataId2 = mock(ReferenceDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(referenceDataId2.getReferenceDataType()).thenReturn(forNameResult2);

    ReferenceDataId<Object> referenceDataId3 = mock(ReferenceDataId.class);
    Class<Object> forNameResult3 = Object.class;
    when(referenceDataId3.getReferenceDataType()).thenReturn(forNameResult3);

    ReferenceDataId<Object> referenceDataId4 = mock(ReferenceDataId.class);
    Class<Object> forNameResult4 = Object.class;
    when(referenceDataId4.getReferenceDataType()).thenReturn(forNameResult4);

    ReferenceDataId<Object> referenceDataId5 = mock(ReferenceDataId.class);
    Class<Object> forNameResult5 = Object.class;
    when(referenceDataId5.getReferenceDataType()).thenReturn(forNameResult5);

    HashMap<ReferenceDataId<?>, Object> values = new HashMap<>();
    values.put(referenceDataId5, "Value");
    values.put(referenceDataId4, "Value");
    values.put(referenceDataId3, "Value");
    values.put(referenceDataId2, "Value");
    values.put(referenceDataId, "Value");

    // Act
    ImmutableReferenceData actualOfResult = ImmutableReferenceData.of(values);

    // Assert
    verify(referenceDataId5).getReferenceDataType();
    verify(referenceDataId4).getReferenceDataType();
    verify(referenceDataId3).getReferenceDataType();
    verify(referenceDataId2).getReferenceDataType();
    verify(referenceDataId).getReferenceDataType();
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableReferenceData#of(Map)} with {@code values}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'values'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableReferenceData ImmutableReferenceData.of(Map)"})
  void testOfWithValues_thenThrowIllegalArgumentException() {
    // Arrange
    ReferenceDataId<Object> referenceDataId = mock(ReferenceDataId.class);
    when(referenceDataId.getReferenceDataType()).thenThrow(new IllegalArgumentException());

    HashMap<ReferenceDataId<?>, Object> values = new HashMap<>();
    values.put(referenceDataId, "Value");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ImmutableReferenceData.of(values));
    verify(referenceDataId).getReferenceDataType();
  }

  /**
   * Test {@link ImmutableReferenceData#of(Map)} with {@code values}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Values is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'values'; when HashMap(); then return Values is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableReferenceData ImmutableReferenceData.of(Map)"})
  void testOfWithValues_whenHashMap_thenReturnValuesIsHashMap() {
    // Arrange
    HashMap<ReferenceDataId<?>, Object> values = new HashMap<>();

    // Act
    ImmutableReferenceData actualOfResult = ImmutableReferenceData.of(values);

    // Assert
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link ImmutableReferenceData#empty()}.
   *
   * <p>Method under test: {@link ImmutableReferenceData#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableReferenceData ImmutableReferenceData.empty()"})
  void testEmpty() {
    // Arrange, Act and Assert
    assertTrue(ImmutableReferenceData.empty().getValues().isEmpty());
  }

  /**
   * Test {@link ImmutableReferenceData#queryValueOrNull(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#queryValueOrNull(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceDataId); given empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ImmutableReferenceData.queryValueOrNull(ReferenceDataId)"})
  void testQueryValueOrNull_givenEmpty() {
    // Arrange, Act and Assert
    assertNull(ImmutableReferenceData.empty().queryValueOrNull(mock(ReferenceDataId.class)));
  }

  /**
   * Test {@link ImmutableReferenceData#queryValueOrNull(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link ReferenceDataId#getReferenceDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#queryValueOrNull(ReferenceDataId)}
   */
  @Test
  @DisplayName(
      "Test queryValueOrNull(ReferenceDataId); given 'java.lang.Object'; then calls getReferenceDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ImmutableReferenceData.queryValueOrNull(ReferenceDataId)"})
  void testQueryValueOrNull_givenJavaLangObject_thenCallsGetReferenceDataType() {
    // Arrange
    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getReferenceDataType()).thenReturn(forNameResult);

    // Act
    Object actualQueryValueOrNullResult =
        ImmutableReferenceData.of(id, "Value").queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    verify(id).getReferenceDataType();
    assertNull(actualQueryValueOrNullResult);
  }

  /**
   * Test {@link ImmutableReferenceData#queryValueOrNull(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@link StandardReferenceData#MINIMAL}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#queryValueOrNull(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceDataId); given MINIMAL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ImmutableReferenceData.queryValueOrNull(ReferenceDataId)"})
  void testQueryValueOrNull_givenMinimal() {
    // Arrange, Act and Assert
    assertNull(StandardReferenceData.MINIMAL.queryValueOrNull(mock(ReferenceDataId.class)));
  }

  /**
   * Test {@link ImmutableReferenceData#queryValueOrNull(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@link StandardReferenceData#STANDARD}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#queryValueOrNull(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceDataId); given STANDARD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ImmutableReferenceData.queryValueOrNull(ReferenceDataId)"})
  void testQueryValueOrNull_givenStandard() {
    // Arrange, Act and Assert
    assertNull(StandardReferenceData.STANDARD.queryValueOrNull(mock(ReferenceDataId.class)));
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith() {
    // Arrange
    CombinedReferenceData refData1 =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));
    CombinedReferenceData other = new CombinedReferenceData(refData1, mock(ReferenceData.class));

    // Act
    ReferenceData actualCombinedWithResult = StandardReferenceData.MINIMAL.combinedWith(other);
    actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualCombinedWithResult instanceof CombinedReferenceData);
    assertSame(other, ((CombinedReferenceData) actualCombinedWithResult).getRefData2());
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith2() {
    // Arrange
    CombinedReferenceData other =
        new CombinedReferenceData(mock(ReferenceData.class), StandardReferenceData.MINIMAL);

    // Act
    ReferenceData actualCombinedWithResult = StandardReferenceData.MINIMAL.combinedWith(other);
    actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualCombinedWithResult instanceof CombinedReferenceData);
    assertSame(other, ((CombinedReferenceData) actualCombinedWithResult).getRefData2());
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When empty.
   *   <li>Then return Values Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ReferenceData); given empty; when empty; then return Values Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_givenEmpty_whenEmpty_thenReturnValuesEmpty() {
    // Arrange
    ImmutableReferenceData emptyResult = ImmutableReferenceData.empty();

    // Act
    ReferenceData actualCombinedWithResult =
        emptyResult.combinedWith(ImmutableReferenceData.empty());
    actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualCombinedWithResult instanceof ImmutableReferenceData);
    assertTrue(((ImmutableReferenceData) actualCombinedWithResult).getValues().isEmpty());
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link ReferenceData}.
   *   <li>Then return RefData1 Values Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ReferenceData); given empty; when ReferenceData; then return RefData1 Values Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_givenEmpty_whenReferenceData_thenReturnRefData1ValuesEmpty() {
    // Arrange
    ImmutableReferenceData emptyResult = ImmutableReferenceData.empty();
    ReferenceData other = mock(ReferenceData.class);

    // Act
    ReferenceData actualCombinedWithResult = emptyResult.combinedWith(other);
    actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualCombinedWithResult instanceof CombinedReferenceData);
    ReferenceData refData1 = ((CombinedReferenceData) actualCombinedWithResult).getRefData1();
    assertTrue(refData1 instanceof ImmutableReferenceData);
    assertTrue(((ImmutableReferenceData) refData1).getValues().isEmpty());
    assertSame(emptyResult, refData1);
    assertSame(other, ((CombinedReferenceData) actualCombinedWithResult).getRefData2());
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link StandardReferenceData#MINIMAL}.
   *   <li>When {@link StandardReferenceData#MINIMAL}.
   *   <li>Then return {@link StandardReferenceData#MINIMAL}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData); given MINIMAL; when MINIMAL; then return MINIMAL")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_givenMinimal_whenMinimal_thenReturnMinimal() {
    // Arrange
    ImmutableReferenceData other = StandardReferenceData.MINIMAL;

    // Act
    ReferenceData actualCombinedWithResult = StandardReferenceData.MINIMAL.combinedWith(other);
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualCombinedWithResult instanceof ImmutableReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link Object}.
   *   <li>Then return Values size is five.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData); given Object; then return Values size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_givenObject_thenReturnValuesSizeIsFive() {
    // Arrange
    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getReferenceDataType()).thenReturn(forNameResult);

    // Act
    ReferenceData actualCombinedWithResult =
        StandardReferenceData.MINIMAL.combinedWith(ImmutableReferenceData.of(id, "Value"));
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    verify(id).getReferenceDataType();
    assertTrue(actualCombinedWithResult instanceof ImmutableReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertEquals(5, ((ImmutableReferenceData) actualCombinedWithResult).getValues().size());
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link StandardReferenceData#STANDARD}.
   *   <li>When {@link StandardReferenceData#MINIMAL}.
   *   <li>Then return {@link StandardReferenceData#STANDARD}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ReferenceData); given STANDARD; when MINIMAL; then return STANDARD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_givenStandard_whenMinimal_thenReturnStandard() {
    // Arrange
    ImmutableReferenceData immutableReferenceData = StandardReferenceData.STANDARD;

    // Act
    ReferenceData actualCombinedWithResult =
        immutableReferenceData.combinedWith(StandardReferenceData.MINIMAL);
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualCombinedWithResult instanceof ImmutableReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertEquals(immutableReferenceData, actualCombinedWithResult);
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then RefData2 return {@link CombinedReferenceData}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData); then RefData2 return CombinedReferenceData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenRefData2ReturnCombinedReferenceData() {
    // Arrange
    ImmutableReferenceData immutableReferenceData = StandardReferenceData.MINIMAL;
    CombinedReferenceData other =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    // Act
    ReferenceData actualCombinedWithResult = immutableReferenceData.combinedWith(other);
    actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    ReferenceData refData2 = ((CombinedReferenceData) actualCombinedWithResult).getRefData2();
    assertTrue(refData2 instanceof CombinedReferenceData);
    assertTrue(actualCombinedWithResult instanceof CombinedReferenceData);
    ReferenceData refData1 = ((CombinedReferenceData) actualCombinedWithResult).getRefData1();
    assertTrue(refData1 instanceof ImmutableReferenceData);
    assertEquals(4, ((ImmutableReferenceData) refData1).getValues().size());
    assertSame(other, refData2);
    assertSame(immutableReferenceData, refData1);
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return {@link ImmutableReferenceData} with id is {@link ReferenceDataId} and {@code
   *       Value}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ReferenceData); then return ImmutableReferenceData with id is ReferenceDataId and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenReturnImmutableReferenceDataWithIdIsReferenceDataIdAndValue() {
    // Arrange
    ImmutableReferenceData emptyResult = ImmutableReferenceData.empty();

    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getReferenceDataType()).thenReturn(forNameResult);
    ImmutableReferenceData other = ImmutableReferenceData.of(id, "Value");

    // Act
    ReferenceData actualCombinedWithResult = emptyResult.combinedWith(other);
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    verify(id).getReferenceDataType();
    assertTrue(actualCombinedWithResult instanceof ImmutableReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return RefData1 Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData); then return RefData1 Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenReturnRefData1ValuesSizeIsOne() {
    // Arrange
    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getReferenceDataType()).thenReturn(forNameResult);
    ImmutableReferenceData ofResult = ImmutableReferenceData.of(id, "Value");
    ReferenceData other = mock(ReferenceData.class);

    // Act
    ReferenceData actualCombinedWithResult = ofResult.combinedWith(other);
    actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    verify(id).getReferenceDataType();
    assertTrue(actualCombinedWithResult instanceof CombinedReferenceData);
    ReferenceData refData1 = ((CombinedReferenceData) actualCombinedWithResult).getRefData1();
    assertTrue(refData1 instanceof ImmutableReferenceData);
    assertEquals(1, ((ImmutableReferenceData) refData1).getValues().size());
    assertSame(ofResult, refData1);
    assertSame(other, ((CombinedReferenceData) actualCombinedWithResult).getRefData2());
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return Values size is five.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName("Test combinedWith(ReferenceData); then return Values size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_thenReturnValuesSizeIsFive() {
    // Arrange
    ReferenceDataId<Object> id = mock(ReferenceDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getReferenceDataType()).thenReturn(forNameResult);

    // Act
    ReferenceData actualCombinedWithResult =
        ImmutableReferenceData.of(id, "Value").combinedWith(StandardReferenceData.MINIMAL);
    Object actualQueryValueOrNullResult =
        actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    verify(id).getReferenceDataType();
    assertTrue(actualCombinedWithResult instanceof ImmutableReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertEquals(5, ((ImmutableReferenceData) actualCombinedWithResult).getValues().size());
  }

  /**
   * Test {@link ImmutableReferenceData#combinedWith(ReferenceData)}.
   *
   * <ul>
   *   <li>When {@link ReferenceData}.
   *   <li>Then return RefData1 Values size is four.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#combinedWith(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ReferenceData); when ReferenceData; then return RefData1 Values size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData ImmutableReferenceData.combinedWith(ReferenceData)"})
  void testCombinedWith_whenReferenceData_thenReturnRefData1ValuesSizeIsFour() {
    // Arrange
    ImmutableReferenceData immutableReferenceData = StandardReferenceData.MINIMAL;
    ReferenceData other = mock(ReferenceData.class);

    // Act
    ReferenceData actualCombinedWithResult = immutableReferenceData.combinedWith(other);
    actualCombinedWithResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualCombinedWithResult instanceof CombinedReferenceData);
    ReferenceData refData1 = ((CombinedReferenceData) actualCombinedWithResult).getRefData1();
    assertTrue(refData1 instanceof ImmutableReferenceData);
    assertEquals(4, ((ImmutableReferenceData) refData1).getValues().size());
    assertSame(immutableReferenceData, refData1);
    assertSame(other, ((CombinedReferenceData) actualCombinedWithResult).getRefData2());
  }

  /**
   * Test {@link ImmutableReferenceData#meta()}.
   *
   * <p>Method under test: {@link ImmutableReferenceData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableReferenceData.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableReferenceData.meta();

    // Assert
    MetaProperty<ImmutableMap<ReferenceDataId<?>, Object>> valuesResult = actualMetaResult.values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("values", valuesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valuesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, valuesResult.propertyType());
    Class<ImmutableReferenceData> expectedDeclaringTypeResult = ImmutableReferenceData.class;
    assertEquals(expectedDeclaringTypeResult, valuesResult.declaringType());
    assertSame(Meta.INSTANCE, valuesResult.metaBean());
  }

  /**
   * Test {@link ImmutableReferenceData#metaBean()}.
   *
   * <p>Method under test: {@link ImmutableReferenceData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableReferenceData.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, StandardReferenceData.MINIMAL.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableReferenceData#toString()}
   *   <li>{@link ImmutableReferenceData#getValues()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap ImmutableReferenceData.getValues()",
    "String ImmutableReferenceData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ImmutableReferenceData emptyResult = ImmutableReferenceData.empty();

    // Act
    String actualToStringResult = emptyResult.toString();

    // Assert
    assertEquals("ImmutableReferenceData{values={}}", actualToStringResult);
    assertTrue(emptyResult.getValues().isEmpty());
  }

  /**
   * Test {@link ImmutableReferenceData#equals(Object)}, and {@link
   * ImmutableReferenceData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableReferenceData#equals(Object)}
   *   <li>{@link ImmutableReferenceData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableReferenceData.equals(Object)",
    "int ImmutableReferenceData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImmutableReferenceData immutableReferenceData = StandardReferenceData.MINIMAL;
    ImmutableReferenceData immutableReferenceData2 = StandardReferenceData.MINIMAL;

    // Act and Assert
    assertEquals(immutableReferenceData, immutableReferenceData2);
    assertEquals(immutableReferenceData.hashCode(), immutableReferenceData2.hashCode());
  }

  /**
   * Test {@link ImmutableReferenceData#equals(Object)}, and {@link
   * ImmutableReferenceData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableReferenceData#equals(Object)}
   *   <li>{@link ImmutableReferenceData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableReferenceData.equals(Object)",
    "int ImmutableReferenceData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImmutableReferenceData immutableReferenceData = StandardReferenceData.MINIMAL;

    // Act and Assert
    assertEquals(immutableReferenceData, immutableReferenceData);
    int expectedHashCodeResult = immutableReferenceData.hashCode();
    assertEquals(expectedHashCodeResult, immutableReferenceData.hashCode());
  }

  /**
   * Test {@link ImmutableReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableReferenceData.equals(Object)",
    "int ImmutableReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(StandardReferenceData.STANDARD, StandardReferenceData.MINIMAL);
  }

  /**
   * Test {@link ImmutableReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableReferenceData.equals(Object)",
    "int ImmutableReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(StandardReferenceData.MINIMAL, null);
  }

  /**
   * Test {@link ImmutableReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableReferenceData.equals(Object)",
    "int ImmutableReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(StandardReferenceData.MINIMAL, "Different type to ImmutableReferenceData");
  }
}
