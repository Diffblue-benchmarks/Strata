package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
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

class IdFilterDiffblueTest {
  /**
   * Test {@link IdFilter#matches(MarketDataId, MarketDataBox, ReferenceData)}.
   *
   * <p>Method under test: {@link IdFilter#matches(MarketDataId, MarketDataBox, ReferenceData)}
   */
  @Test
  @DisplayName("Test matches(MarketDataId, MarketDataBox, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IdFilter.matches(MarketDataId, MarketDataBox, ReferenceData)"})
  void testMatches() {
    // Arrange
    IdFilter<Object> idFilter = new IdFilter<>(mock(MarketDataId.class));

    // Act and Assert
    assertFalse(
        idFilter.matches(
            mock(MarketDataId.class), mock(MarketDataBox.class), mock(ReferenceData.class)));
  }

  /**
   * Test {@link IdFilter#meta()}.
   *
   * <p>Method under test: {@link IdFilter#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean IdFilter.meta()"})
  void testMeta() {
    // Arrange and Act
    MetaBean actualMetaResult = IdFilter.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("id"));
    assertTrue(actualMetaResult.isBuildable());
    Class<IdFilter> expectedBeanTypeResult = IdFilter.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link IdFilter#IdFilter(MarketDataId)}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   *   <li>Then return Id is {@link MarketDataId}.
   * </ul>
   *
   * <p>Method under test: {@link IdFilter#IdFilter(MarketDataId)}
   */
  @Test
  @DisplayName("Test new IdFilter(MarketDataId); when MarketDataId; then return Id is MarketDataId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IdFilter.<init>(MarketDataId)"})
  void testNewIdFilter_whenMarketDataId_thenReturnIdIsMarketDataId() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);

    // Act
    IdFilter<Object> actualIdFilter = new IdFilter<>(id);

    // Assert
    assertSame(id, actualIdFilter.getId());
  }

  /**
   * Test {@link IdFilter#metaBean()}.
   *
   * <p>Method under test: {@link IdFilter#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean IdFilter.metaBean()"})
  void testMetaBean() {
    // Arrange
    IdFilter<Object> idFilter = new IdFilter<>(mock(MarketDataId.class));

    // Act
    TypedMetaBean<IdFilter<Object>> actualMetaBeanResult = idFilter.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("id"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<IdFilter> expectedBeanTypeResult = IdFilter.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link IdFilter#equals(Object)}, and {@link IdFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IdFilter#equals(Object)}
   *   <li>{@link IdFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IdFilter.equals(Object)", "int IdFilter.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IdFilter<Object> idFilter = new IdFilter<>(mock(MarketDataId.class));

    // Act and Assert
    assertEquals(idFilter, idFilter);
    int expectedHashCodeResult = idFilter.hashCode();
    assertEquals(expectedHashCodeResult, idFilter.hashCode());
  }

  /**
   * Test {@link IdFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IdFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IdFilter.equals(Object)", "int IdFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    IdFilter<Object> idFilter = new IdFilter<>(mock(MarketDataId.class));

    // Act and Assert
    assertNotEquals(idFilter, new IdFilter<>(mock(MarketDataId.class)));
  }

  /**
   * Test {@link IdFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IdFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IdFilter.equals(Object)", "int IdFilter.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    IdFilter<Object> idFilter = new IdFilter<>(mock(MarketDataId.class));

    // Act and Assert
    assertNotEquals(idFilter, null);
  }

  /**
   * Test {@link IdFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IdFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IdFilter.equals(Object)", "int IdFilter.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    IdFilter<Object> idFilter = new IdFilter<>(mock(MarketDataId.class));

    // Act and Assert
    assertNotEquals(idFilter, "Different type to IdFilter");
  }
}
