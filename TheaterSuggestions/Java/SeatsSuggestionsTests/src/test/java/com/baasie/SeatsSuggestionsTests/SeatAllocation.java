package com.baasie.SeatsSuggestionsTests;

import java.util.ArrayList;
import java.util.List;

public class SeatAllocation {

    private PricingCategory pricingCategory;
    private List<Seat> seats = new ArrayList<>();
    private int partyRequested;

    public SeatAllocation(int partyRequested, PricingCategory pricingCategory) {
        this.pricingCategory = pricingCategory;
        this.partyRequested = partyRequested;
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public boolean matchExpectation() {
        return seats.size() == partyRequested;
    }

    public SuggestionMade confirmInterest() {

        seats.forEach(Seat::markAsAlreadySuggested);

        return new SuggestionMade(seats, partyRequested, pricingCategory);
    }

}