@outputSchema("tuple(region:chararray, gold:int, silver:int)")
def fill_missing_silver(region, gold, silver):
    if silver is None:
        return (region, gold, 0)
    else:
        return (region, gold, silver)

