package u2;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o3.l;
import o3.t;
import u2.u;
/* loaded from: classes.dex */
public final class j implements u.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f18856a;

    /* renamed from: b  reason: collision with root package name */
    private l.a f18857b;

    /* renamed from: c  reason: collision with root package name */
    private long f18858c;

    /* renamed from: d  reason: collision with root package name */
    private long f18859d;

    /* renamed from: e  reason: collision with root package name */
    private long f18860e;

    /* renamed from: f  reason: collision with root package name */
    private float f18861f;

    /* renamed from: g  reason: collision with root package name */
    private float f18862g;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final x1.r f18863a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<Integer, b5.t<u.a>> f18864b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private final Set<Integer> f18865c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private final Map<Integer, u.a> f18866d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private l.a f18867e;

        public a(x1.r rVar) {
            this.f18863a = rVar;
        }

        public void a(l.a aVar) {
            if (aVar != this.f18867e) {
                this.f18867e = aVar;
                this.f18864b.clear();
                this.f18866d.clear();
            }
        }
    }

    public j(Context context, x1.r rVar) {
        this(new t.a(context), rVar);
    }

    public j(l.a aVar, x1.r rVar) {
        this.f18857b = aVar;
        a aVar2 = new a(rVar);
        this.f18856a = aVar2;
        aVar2.a(aVar);
        this.f18858c = -9223372036854775807L;
        this.f18859d = -9223372036854775807L;
        this.f18860e = -9223372036854775807L;
        this.f18861f = -3.4028235E38f;
        this.f18862g = -3.4028235E38f;
    }
}
