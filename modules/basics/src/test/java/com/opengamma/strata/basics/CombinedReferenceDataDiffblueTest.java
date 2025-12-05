package com.opengamma.strata.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CombinedReferenceDataDiffblueTest {
  /**
   * Test {@link CombinedReferenceData#containsValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@link ReferenceData} {@link ReferenceData#containsValue(ReferenceDataId)} return
   *       {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedReferenceData#containsValue(ReferenceDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(ReferenceDataId); given ReferenceData containsValue(ReferenceDataId) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedReferenceData.containsValue(ReferenceDataId)"})
  void testContainsValue_givenReferenceDataContainsValueReturnFalse_thenReturnFalse() {
    // Arrange
    ReferenceData refData1 = mock(ReferenceData.class);
    when(refData1.containsValue(Mockito.<ReferenceDataId<?>>any())).thenReturn(false);

    ReferenceData refData2 = mock(ReferenceData.class);
    when(refData2.containsValue(Mockito.<ReferenceDataId<?>>any())).thenReturn(false);

    CombinedReferenceData combinedReferenceData = new CombinedReferenceData(refData1, refData2);

    // Act
    boolean actualContainsValueResult =
        combinedReferenceData.containsValue(mock(ReferenceDataId.class));

    // Assert
    verify(refData1).containsValue(isA(ReferenceDataId.class));
    verify(refData2).containsValue(isA(ReferenceDataId.class));
    assertFalse(actualContainsValueResult);
  }

  /**
   * Test {@link CombinedReferenceData#containsValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@link ReferenceData} {@link ReferenceData#containsValue(ReferenceDataId)} return
   *       {@code false}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedReferenceData#containsValue(ReferenceDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(ReferenceDataId); given ReferenceData containsValue(ReferenceDataId) return 'false'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedReferenceData.containsValue(ReferenceDataId)"})
  void testContainsValue_givenReferenceDataContainsValueReturnFalse_thenReturnTrue() {
    // Arrange
    ReferenceData refData1 = mock(ReferenceData.class);
    when(refData1.containsValue(Mockito.<ReferenceDataId<?>>any())).thenReturn(false);

    ReferenceData refData2 = mock(ReferenceData.class);
    when(refData2.containsValue(Mockito.<ReferenceDataId<?>>any())).thenReturn(true);

    CombinedReferenceData combinedReferenceData = new CombinedReferenceData(refData1, refData2);

    // Act
    boolean actualContainsValueResult =
        combinedReferenceData.containsValue(mock(ReferenceDataId.class));

    // Assert
    verify(refData1).containsValue(isA(ReferenceDataId.class));
    verify(refData2).containsValue(isA(ReferenceDataId.class));
    assertTrue(actualContainsValueResult);
  }

  /**
   * Test {@link CombinedReferenceData#containsValue(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Given {@link ReferenceData} {@link ReferenceData#containsValue(ReferenceDataId)} return
   *       {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedReferenceData#containsValue(ReferenceDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(ReferenceDataId); given ReferenceData containsValue(ReferenceDataId) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedReferenceData.containsValue(ReferenceDataId)"})
  void testContainsValue_givenReferenceDataContainsValueReturnTrue_thenReturnTrue() {
    // Arrange
    ReferenceData refData1 = mock(ReferenceData.class);
    when(refData1.containsValue(Mockito.<ReferenceDataId<?>>any())).thenReturn(true);
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(refData1, mock(ReferenceData.class));

    // Act
    boolean actualContainsValueResult =
        combinedReferenceData.containsValue(mock(ReferenceDataId.class));

    // Assert
    verify(refData1).containsValue(isA(ReferenceDataId.class));
    assertTrue(actualContainsValueResult);
  }

  /**
   * Test {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}.
   *
   * <p>Method under test: {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CombinedReferenceData.queryValueOrNull(ReferenceDataId)"})
  void testQueryValueOrNull() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    // Act and Assert
    assertNull(combinedReferenceData.queryValueOrNull(mock(ReferenceDataId.class)));
  }

  /**
   * Test {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}.
   *
   * <p>Method under test: {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CombinedReferenceData.queryValueOrNull(ReferenceDataId)"})
  void testQueryValueOrNull2() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(StandardReferenceData.MINIMAL, mock(ReferenceData.class));

    // Act and Assert
    assertNull(combinedReferenceData.queryValueOrNull(mock(ReferenceDataId.class)));
  }

  /**
   * Test {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}.
   *
   * <p>Method under test: {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CombinedReferenceData.queryValueOrNull(ReferenceDataId)"})
  void testQueryValueOrNull3() {
    // Arrange
    CombinedReferenceData refData1 =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(refData1, mock(ReferenceData.class));

    // Act and Assert
    assertNull(combinedReferenceData.queryValueOrNull(mock(ReferenceDataId.class)));
  }

  /**
   * Test {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}.
   *
   * <p>Method under test: {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CombinedReferenceData.queryValueOrNull(ReferenceDataId)"})
  void testQueryValueOrNull4() {
    // Arrange, Act and Assert
    assertNull(
        new CombinedReferenceData(mock(ReferenceData.class), StandardReferenceData.MINIMAL)
            .queryValueOrNull(mock(ReferenceDataId.class)));
  }

  /**
   * Test {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}.
   *
   * <p>Method under test: {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CombinedReferenceData.queryValueOrNull(ReferenceDataId)"})
  void testQueryValueOrNull5() {
    // Arrange
    ReferenceData refData1 = mock(ReferenceData.class);
    CombinedReferenceData refData2 =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    CombinedReferenceData combinedReferenceData = new CombinedReferenceData(refData1, refData2);

    // Act and Assert
    assertNull(combinedReferenceData.queryValueOrNull(mock(ReferenceDataId.class)));
  }

  /**
   * Test {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}.
   *
   * <ul>
   *   <li>Then return {@code Query Value Or Null}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedReferenceData#queryValueOrNull(ReferenceDataId)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceDataId); then return 'Query Value Or Null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object CombinedReferenceData.queryValueOrNull(ReferenceDataId)"})
  void testQueryValueOrNull_thenReturnQueryValueOrNull() {
    // Arrange
    ReferenceData refData1 = mock(ReferenceData.class);
    when(refData1.queryValueOrNull(Mockito.<ReferenceDataId<Object>>any()))
        .thenReturn("Query Value Or Null");
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(refData1, mock(ReferenceData.class));

    // Act
    Object actualQueryValueOrNullResult = combinedReferenceData.queryValueOrNull(null);

    // Assert
    verify(refData1).queryValueOrNull(isNull());
    assertEquals("Query Value Or Null", actualQueryValueOrNullResult);
  }

  /**
   * Test {@link CombinedReferenceData#meta()}.
   *
   * <p>Method under test: {@link CombinedReferenceData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CombinedReferenceData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CombinedReferenceData> actualMetaResult = CombinedReferenceData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("refData1"));
    assertTrue(metaPropertyMapResult.containsKey("refData2"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CombinedReferenceData> expectedBeanTypeResult = CombinedReferenceData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CombinedReferenceData#CombinedReferenceData(ReferenceData, ReferenceData)}.
   *
   * <ul>
   *   <li>When {@link ReferenceData}.
   *   <li>Then return RefData1 is {@link ReferenceData}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedReferenceData#CombinedReferenceData(ReferenceData,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test new CombinedReferenceData(ReferenceData, ReferenceData); when ReferenceData; then return RefData1 is ReferenceData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CombinedReferenceData.<init>(ReferenceData, ReferenceData)"})
  void testNewCombinedReferenceData_whenReferenceData_thenReturnRefData1IsReferenceData() {
    // Arrange
    ReferenceData refData1 = mock(ReferenceData.class);
    ReferenceData refData2 = mock(ReferenceData.class);

    // Act
    CombinedReferenceData actualCombinedReferenceData =
        new CombinedReferenceData(refData1, refData2);

    // Assert
    assertSame(refData1, actualCombinedReferenceData.getRefData1());
    assertSame(refData2, actualCombinedReferenceData.getRefData2());
  }

  /**
   * Test {@link CombinedReferenceData#metaBean()}.
   *
   * <p>Method under test: {@link CombinedReferenceData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CombinedReferenceData.metaBean()"})
  void testMetaBean() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    // Act
    TypedMetaBean<CombinedReferenceData> actualMetaBeanResult = combinedReferenceData.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("refData1"));
    assertTrue(metaPropertyMapResult.containsKey("refData2"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CombinedReferenceData> expectedBeanTypeResult = CombinedReferenceData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link CombinedReferenceData#equals(Object)}, and {@link
   * CombinedReferenceData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CombinedReferenceData#equals(Object)}
   *   <li>{@link CombinedReferenceData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedReferenceData.equals(Object)",
    "int CombinedReferenceData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    // Act and Assert
    assertEquals(combinedReferenceData, combinedReferenceData);
    int expectedHashCodeResult = combinedReferenceData.hashCode();
    assertEquals(expectedHashCodeResult, combinedReferenceData.hashCode());
  }

  /**
   * Test {@link CombinedReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedReferenceData.equals(Object)",
    "int CombinedReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));

    // Act and Assert
    assertNotEquals(
        combinedReferenceData,
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class)));
  }

  /**
   * Test {@link CombinedReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedReferenceData.equals(Object)",
    "int CombinedReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CombinedReferenceData refData1 =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(refData1, mock(ReferenceData.class));

    // Act and Assert
    assertNotEquals(
        combinedReferenceData,
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class)));
  }

  /**
   * Test {@link CombinedReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedReferenceData.equals(Object)",
    "int CombinedReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(StandardReferenceData.MINIMAL, mock(ReferenceData.class));

    // Act and Assert
    assertNotEquals(
        combinedReferenceData,
        new CombinedReferenceData(StandardReferenceData.MINIMAL, mock(ReferenceData.class)));
  }

  /**
   * Test {@link CombinedReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedReferenceData.equals(Object)",
    "int CombinedReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CombinedReferenceData refData2 =
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class));
    CombinedReferenceData combinedReferenceData =
        new CombinedReferenceData(StandardReferenceData.MINIMAL, refData2);

    // Act and Assert
    assertNotEquals(
        combinedReferenceData,
        new CombinedReferenceData(StandardReferenceData.MINIMAL, mock(ReferenceData.class)));
  }

  /**
   * Test {@link CombinedReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedReferenceData.equals(Object)",
    "int CombinedReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class)), null);
  }

  /**
   * Test {@link CombinedReferenceData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedReferenceData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedReferenceData.equals(Object)",
    "int CombinedReferenceData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new CombinedReferenceData(mock(ReferenceData.class), mock(ReferenceData.class)),
        "Different type to CombinedReferenceData");
  }
}
