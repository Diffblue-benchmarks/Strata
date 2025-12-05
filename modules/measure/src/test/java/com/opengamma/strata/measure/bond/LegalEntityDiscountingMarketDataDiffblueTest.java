package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.market.curve.RepoGroup;
import com.opengamma.strata.product.LegalEntityId;
import java.time.LocalDate;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LegalEntityDiscountingMarketDataDiffblueTest {
  /**
   * Test {@link LegalEntityDiscountingMarketData#getValuationDate()}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate LegalEntityDiscountingMarketData.getValuationDate()"})
  void testGetValuationDate_thenReturnToStringIs19700101() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    DefaultLegalEntityDiscountingMarketData ofResult2 =
        DefaultLegalEntityDiscountingMarketData.of(lookup, marketData);

    // Act
    LocalDate actualValuationDate = ofResult2.getValuationDate();

    // Assert
    verify(marketData).getValuationDate();
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(ofResult, actualValuationDate);
  }
}
