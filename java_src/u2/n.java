package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLong f18918h = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final long f18919a;

    /* renamed from: b  reason: collision with root package name */
    public final o3.p f18920b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f18921c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, List<String>> f18922d;

    /* renamed from: e  reason: collision with root package name */
    public final long f18923e;

    /* renamed from: f  reason: collision with root package name */
    public final long f18924f;

    /* renamed from: g  reason: collision with root package name */
    public final long f18925g;

    public n(long j10, o3.p pVar, long j11) {
        this(j10, pVar, pVar.f14512a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public n(long j10, o3.p pVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f18919a = j10;
        this.f18920b = pVar;
        this.f18921c = uri;
        this.f18922d = map;
        this.f18923e = j11;
        this.f18924f = j12;
        this.f18925g = j13;
    }

    public static long a() {
        return f18918h.getAndIncrement();
    }
}
