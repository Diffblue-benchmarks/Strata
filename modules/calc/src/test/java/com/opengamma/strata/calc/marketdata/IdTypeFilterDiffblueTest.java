package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.scenario.MarketDataBox;
import java.util.Map;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IdTypeFilterDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IdTypeFilter#toString()}
   *   <li>{@link IdTypeFilter#getMarketDataIdType()}
   *   <li>{@link IdTypeFilter#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class IdTypeFilter.getMarketDataIdType()",
    "Class IdTypeFilter.getType()",
    "String IdTypeFilter.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Class<MarketDataId> forNameResult = MarketDataId.class;
    IdTypeFilter<Object> idTypeFilter =
        new IdTypeFilter<>((Class<MarketDataId<Object>>) (Class) forNameResult);

    // Act
    String actualToStringResult = idTypeFilter.toString();
    Class<?> actualMarketDataIdType = idTypeFilter.getMarketDataIdType();
    Class<? extends MarketDataId<Object>> actualType = idTypeFilter.getType();

    // Assert
    assertEquals(
        "IdTypeFilter{type=interface com.opengamma.strata.data.MarketDataId}",
        actualToStringResult);
    Class<MarketDataId> expectedMarketDataIdType = MarketDataId.class;
    assertEquals(expectedMarketDataIdType, actualMarketDataIdType);
    Class<MarketDataId> expectedType = MarketDataId.class;
    assertEquals(expectedType, actualType);
  }

  /**
   * Test {@link IdTypeFilter#matches(MarketDataId, MarketDataBox, ReferenceData)}.
   *
   * <p>Method under test: {@link IdTypeFilter#matches(MarketDataId, MarketDataBox, ReferenceData)}
   */
  @Test
  @DisplayName("Test matches(MarketDataId, MarketDataBox, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IdTypeFilter.matches(MarketDataId, MarketDataBox, ReferenceData)"})
  void testMatches() {
    // Arrange
    Class<MarketDataId> forNameResult = MarketDataId.class;
    IdTypeFilter<Object> idTypeFilter =
        new IdTypeFilter<>((Class<MarketDataId<Object>>) (Class) forNameResult);

    // Act and Assert
    assertTrue(
        idTypeFilter.matches(
            mock(MarketDataId.class), mock(MarketDataBox.class), mock(ReferenceData.class)));
  }

  /**
   * Test {@link IdTypeFilter#meta()}.
   *
   * <p>Method under test: {@link IdTypeFilter#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean IdTypeFilter.meta()"})
  void testMeta() {
    // Arrange and Act
    MetaBean actualMetaResult = IdTypeFilter.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("type"));
    assertTrue(actualMetaResult.isBuildable());
    Class<IdTypeFilter> expectedBeanTypeResult = IdTypeFilter.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link IdTypeFilter#IdTypeFilter(Class)}.
   *
   * <ul>
   *   <li>Then return MarketDataIdType is {@link MarketDataId}.
   * </ul>
   *
   * <p>Method under test: {@link IdTypeFilter#IdTypeFilter(Class)}
   */
  @Test
  @DisplayName("Test new IdTypeFilter(Class); then return MarketDataIdType is MarketDataId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IdTypeFilter.<init>(Class)"})
  void testNewIdTypeFilter_thenReturnMarketDataIdTypeIsMarketDataId() {
    // Arrange
    Class<MarketDataId> forNameResult = MarketDataId.class;

    // Act
    IdTypeFilter<Object> actualIdTypeFilter =
        new IdTypeFilter<>((Class<MarketDataId<Object>>) (Class) forNameResult);

    // Assert
    Class<MarketDataId> expectedMarketDataIdType = MarketDataId.class;
    assertEquals(expectedMarketDataIdType, actualIdTypeFilter.getMarketDataIdType());
    Class<MarketDataId> expectedType = MarketDataId.class;
    assertEquals(expectedType, actualIdTypeFilter.getType());
  }

  /**
   * Test {@link IdTypeFilter#metaBean()}.
   *
   * <p>Method under test: {@link IdTypeFilter#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean IdTypeFilter.metaBean()"})
  void testMetaBean() {
    // Arrange
    Class<MarketDataId> forNameResult = MarketDataId.class;
    IdTypeFilter<Object> idTypeFilter =
        new IdTypeFilter<>((Class<MarketDataId<Object>>) (Class) forNameResult);

    // Act
    TypedMetaBean<IdTypeFilter<Object>> actualMetaBeanResult = idTypeFilter.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("type"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<IdTypeFilter> expectedBeanTypeResult = IdTypeFilter.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link IdTypeFilter#equals(Object)}, and {@link IdTypeFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IdTypeFilter#equals(Object)}
   *   <li>{@link IdTypeFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IdTypeFilter.equals(Object)", "int IdTypeFilter.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Class<MarketDataId> forNameResult = MarketDataId.class;
    IdTypeFilter<Object> idTypeFilter =
        new IdTypeFilter<>((Class<MarketDataId<Object>>) (Class) forNameResult);
    Class<MarketDataId> forNameResult2 = MarketDataId.class;
    IdTypeFilter<Object> idTypeFilter2 =
        new IdTypeFilter<>((Class<MarketDataId<Object>>) (Class) forNameResult2);

    // Act and Assert
    assertEquals(idTypeFilter, idTypeFilter2);
    assertEquals(idTypeFilter.hashCode(), idTypeFilter2.hashCode());
  }

  /**
   * Test {@link IdTypeFilter#equals(Object)}, and {@link IdTypeFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IdTypeFilter#equals(Object)}
   *   <li>{@link IdTypeFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IdTypeFilter.equals(Object)", "int IdTypeFilter.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Class<MarketDataId> forNameResult = MarketDataId.class;
    IdTypeFilter<Object> idTypeFilter =
        new IdTypeFilter<>((Class<MarketDataId<Object>>) (Class) forNameResult);

    // Act and Assert
    assertEquals(idTypeFilter, idTypeFilter);
    int expectedHashCodeResult = idTypeFilter.hashCode();
    assertEquals(expectedHashCodeResult, idTypeFilter.hashCode());
  }

  /**
   * Test {@link IdTypeFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IdTypeFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IdTypeFilter.equals(Object)", "int IdTypeFilter.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Class<MarketDataId> forNameResult = MarketDataId.class;
    IdTypeFilter<Object> idTypeFilter =
        new IdTypeFilter<>((Class<MarketDataId<Object>>) (Class) forNameResult);

    // Act and Assert
    assertNotEquals(idTypeFilter, null);
  }

  /**
   * Test {@link IdTypeFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IdTypeFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IdTypeFilter.equals(Object)", "int IdTypeFilter.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Class<MarketDataId> forNameResult = MarketDataId.class;
    IdTypeFilter<Object> idTypeFilter =
        new IdTypeFilter<>((Class<MarketDataId<Object>>) (Class) forNameResult);

    // Act and Assert
    assertNotEquals(idTypeFilter, "Different type to IdTypeFilter");
  }
}
