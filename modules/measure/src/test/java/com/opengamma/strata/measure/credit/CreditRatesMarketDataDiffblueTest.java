package com.opengamma.strata.measure.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.market.curve.CurveId;
import java.time.LocalDate;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CreditRatesMarketDataDiffblueTest {
  /**
   * Test {@link CreditRatesMarketData#getValuationDate()}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link CreditRatesMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CreditRatesMarketData.getValuationDate()"})
  void testGetValuationDate_thenReturnToStringIs19700101() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    DefaultCreditRatesMarketData ofResult2 = DefaultCreditRatesMarketData.of(lookup, marketData);

    // Act
    LocalDate actualValuationDate = ofResult2.getValuationDate();

    // Assert
    verify(marketData).getValuationDate();
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(ofResult, actualValuationDate);
  }
}
