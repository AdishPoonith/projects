package la;
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.b0 f13635a = new kotlinx.coroutines.internal.b0("REMOVED_TASK");

    /* renamed from: b  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.b0 f13636b = new kotlinx.coroutines.internal.b0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
