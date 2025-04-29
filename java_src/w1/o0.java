package w1;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class o0 extends IOException {

    /* renamed from: j  reason: collision with root package name */
    public final o3.p f19736j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f19737k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, List<String>> f19738l;

    /* renamed from: m  reason: collision with root package name */
    public final long f19739m;

    public o0(o3.p pVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f19736j = pVar;
        this.f19737k = uri;
        this.f19738l = map;
        this.f19739m = j10;
    }
}
