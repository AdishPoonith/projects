package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements g {

    /* renamed from: j  reason: collision with root package name */
    private final DefaultLifecycleObserver f2485j;

    /* renamed from: k  reason: collision with root package name */
    private final g f2486k;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2487a;

        static {
            int[] iArr = new int[e.a.values().length];
            try {
                iArr[e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f2487a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, g gVar) {
        kotlin.jvm.internal.l.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f2485j = defaultLifecycleObserver;
        this.f2486k = gVar;
    }

    @Override // androidx.lifecycle.g
    public void q(i source, e.a event) {
        kotlin.jvm.internal.l.e(source, "source");
        kotlin.jvm.internal.l.e(event, "event");
        switch (a.f2487a[event.ordinal()]) {
            case 1:
                this.f2485j.j(source);
                break;
            case 2:
                this.f2485j.s(source);
                break;
            case 3:
                this.f2485j.g(source);
                break;
            case 4:
                this.f2485j.r(source);
                break;
            case 5:
                this.f2485j.O(source);
                break;
            case 6:
                this.f2485j.i(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        g gVar = this.f2486k;
        if (gVar != null) {
            gVar.q(source, event);
        }
    }
}
