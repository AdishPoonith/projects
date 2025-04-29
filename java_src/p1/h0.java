package p1;

import android.content.Context;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class h0 extends f1.f0 {

    /* renamed from: w  reason: collision with root package name */
    public static final a f15142w = new a(null);

    /* renamed from: t  reason: collision with root package name */
    private final String f15143t;

    /* renamed from: u  reason: collision with root package name */
    private final String f15144u;

    /* renamed from: v  reason: collision with root package name */
    private final long f15145v;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final h0 a(Context context, String applicationId, String loggerRef, String graphApiVersion, long j10, String str) {
            kotlin.jvm.internal.l.e(context, "context");
            kotlin.jvm.internal.l.e(applicationId, "applicationId");
            kotlin.jvm.internal.l.e(loggerRef, "loggerRef");
            kotlin.jvm.internal.l.e(graphApiVersion, "graphApiVersion");
            return new h0(context, applicationId, loggerRef, graphApiVersion, j10, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, String applicationId, String loggerRef, String graphApiVersion, long j10, String str) {
        super(context, 65546, 65547, 20170411, applicationId, str);
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(applicationId, "applicationId");
        kotlin.jvm.internal.l.e(loggerRef, "loggerRef");
        kotlin.jvm.internal.l.e(graphApiVersion, "graphApiVersion");
        this.f15143t = loggerRef;
        this.f15144u = graphApiVersion;
        this.f15145v = j10;
    }

    @Override // f1.f0
    protected void e(Bundle data) {
        kotlin.jvm.internal.l.e(data, "data");
        data.putString("com.facebook.platform.extra.LOGGER_REF", this.f15143t);
        data.putString("com.facebook.platform.extra.GRAPH_API_VERSION", this.f15144u);
        data.putLong("com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS", this.f15145v);
    }
}
