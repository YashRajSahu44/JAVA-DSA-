class koko{
public int minEatingSpeed(int[] piles, int h) {
    int start = 1, end = 0;
    for (int p : piles) end = Math.max(end, p);

    while (start < end) {
        int mid = start + (end - start) / 2;

        int hours = 0;
        for (int pile : piles) {
            hours += (pile + mid - 1) / mid;
        }

        if (hours <= h) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }
    return start;
}
}