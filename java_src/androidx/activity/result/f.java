package androidx.activity.result;

import e.d;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private d.f f562a = d.b.f7962a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private d.f f563a = d.b.f7962a;

        public final f a() {
            f fVar = new f();
            fVar.b(this.f563a);
            return fVar;
        }

        public final a b(d.f mediaType) {
            l.e(mediaType, "mediaType");
            this.f563a = mediaType;
            return this;
        }
    }

    public final d.f a() {
        return this.f562a;
    }

    public final void b(d.f fVar) {
        l.e(fVar, "<set-?>");
        this.f562a = fVar;
    }
}
