﻿namespace SeatsSuggestions
{
    internal class AllocationNotAvailable : SeatAllocation
    {
        public AllocationNotAvailable(int partyRequested, PricingCategory pricingCategory) : base(partyRequested,
            pricingCategory)
        {
        }
    }
}