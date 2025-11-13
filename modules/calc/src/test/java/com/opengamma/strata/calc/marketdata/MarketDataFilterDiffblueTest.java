package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.data.NamedMarketDataId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataFilterDiffblueTest {
  /**
   * Test {@link MarketDataFilter#ofIdType(Class)}.
   *
   * <ul>
   *   <li>When {@code MarketDataId}.
   *   <li>Then return {@link IdTypeFilter}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataFilter#ofIdType(Class)}
   */
  @Test
  @DisplayName(
      "Test ofIdType(Class); when 'com.opengamma.strata.data.MarketDataId'; then return IdTypeFilter")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataFilter MarketDataFilter.ofIdType(Class)"})
  void testOfIdType_whenComOpengammaStrataDataMarketDataId_thenReturnIdTypeFilter() {
    // Arrange
    Class<MarketDataId> forNameResult = MarketDataId.class;

    // Act
    MarketDataFilter<Object, MarketDataId<Object>> actualOfIdTypeResult =
        MarketDataFilter.ofIdType((Class<MarketDataId<Object>>) (Class) forNameResult);

    // Assert
    assertTrue(actualOfIdTypeResult instanceof IdTypeFilter);
    Class<MarketDataId> expectedType = MarketDataId.class;
    assertEquals(expectedType, ((IdTypeFilter<Object>) actualOfIdTypeResult).getType());
    Class<MarketDataId> expectedMarketDataIdType = MarketDataId.class;
    assertEquals(expectedMarketDataIdType, actualOfIdTypeResult.getMarketDataIdType());
  }

  /**
   * Test {@link MarketDataFilter#ofId(MarketDataId)}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   *   <li>Then return {@link IdFilter}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataFilter#ofId(MarketDataId)}
   */
  @Test
  @DisplayName("Test ofId(MarketDataId); when MarketDataId; then return IdFilter")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataFilter MarketDataFilter.ofId(MarketDataId)"})
  void testOfId_whenMarketDataId_thenReturnIdFilter() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);

    // Act
    MarketDataFilter<Object, MarketDataId<Object>> actualOfIdResult = MarketDataFilter.ofId(id);

    // Assert
    assertTrue(actualOfIdResult instanceof IdFilter);
    assertSame(id, ((IdFilter<Object>) actualOfIdResult).getId());
  }

  /**
   * Test {@link MarketDataFilter#ofName(MarketDataName)}.
   *
   * <ul>
   *   <li>When {@link MarketDataName}.
   *   <li>Then return {@link NameFilter}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataFilter#ofName(MarketDataName)}
   */
  @Test
  @DisplayName("Test ofName(MarketDataName); when MarketDataName; then return NameFilter")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataFilter MarketDataFilter.ofName(MarketDataName)"})
  void testOfName_whenMarketDataName_thenReturnNameFilter() {
    // Arrange
    MarketDataName<Object> name = mock(MarketDataName.class);

    // Act
    MarketDataFilter<Object, NamedMarketDataId<Object>> actualOfNameResult =
        MarketDataFilter.ofName(name);

    // Assert
    assertTrue(actualOfNameResult instanceof NameFilter);
    Class<NamedMarketDataId> expectedMarketDataIdType = NamedMarketDataId.class;
    assertEquals(expectedMarketDataIdType, actualOfNameResult.getMarketDataIdType());
    assertSame(name, ((NameFilter<Object>) actualOfNameResult).getName());
  }
}
