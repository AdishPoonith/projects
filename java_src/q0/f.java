package q0;

import android.content.Context;
import android.util.Log;
import f1.l0;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import q0.a;
import q0.d;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f15932a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final String f15933b = f.class.getName();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends ObjectInputStream {

        /* renamed from: j  reason: collision with root package name */
        public static final C0232a f15934j = new C0232a(null);

        /* renamed from: q0.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0232a {
            private C0232a() {
            }

            public /* synthetic */ C0232a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() {
            Class cls;
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (!kotlin.jvm.internal.l.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                cls = kotlin.jvm.internal.l.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2") ? d.b.class : d.b.class;
                kotlin.jvm.internal.l.d(resultClassDescriptor, "resultClassDescriptor");
                return resultClassDescriptor;
            }
            cls = a.b.class;
            resultClassDescriptor = ObjectStreamClass.lookup(cls);
            kotlin.jvm.internal.l.d(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    private f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x0003, B:10:0x002c, B:11:0x0031, B:45:0x00a5, B:14:0x003c, B:25:0x005c, B:26:0x0061, B:29:0x006c, B:30:0x0070, B:32:0x0075, B:33:0x007a, B:37:0x008c, B:36:0x0085, B:39:0x008e, B:40:0x0093, B:43:0x009e), top: B:61:0x0003, inners: #1, #4, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized q0.d0 a() {
        /*
            java.lang.Class<q0.f> r0 = q0.f.class
            monitor-enter(r0)
            y0.g r1 = y0.g.f20314a     // Catch: java.lang.Throwable -> Lac
            y0.g.b()     // Catch: java.lang.Throwable -> Lac
            p0.f0 r1 = p0.f0.f14852a     // Catch: java.lang.Throwable -> Lac
            android.content.Context r1 = p0.f0.l()     // Catch: java.lang.Throwable -> Lac
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.l.d(r3, r4)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            q0.f$a r4 = new q0.f$a     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L74 java.io.FileNotFoundException -> L8e
            if (r3 == 0) goto L45
            q0.d0 r3 = (q0.d0) r3     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L74 java.io.FileNotFoundException -> L8e
            f1.l0 r2 = f1.l0.f8470a     // Catch: java.lang.Throwable -> Lac
            f1.l0.j(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lac
            r1.delete()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lac
            goto L43
        L3b:
            r1 = move-exception
            java.lang.String r2 = q0.f.f15933b     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> Lac
        L43:
            r2 = r3
            goto La3
        L45:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L74 java.io.FileNotFoundException -> L8e
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L74 java.io.FileNotFoundException -> L8e
            throw r3     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L74 java.io.FileNotFoundException -> L8e
        L4d:
            r3 = move-exception
            goto L55
        L4f:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L75
        L53:
            r3 = move-exception
            r4 = r2
        L55:
            java.lang.String r5 = q0.f.f15933b     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L74
            f1.l0 r3 = f1.l0.f8470a     // Catch: java.lang.Throwable -> Lac
            f1.l0.j(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Lac
            r1.delete()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Lac
            goto La3
        L6b:
            r1 = move-exception
            java.lang.String r3 = q0.f.f15933b     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L70:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> Lac
            goto La3
        L74:
            r2 = move-exception
        L75:
            f1.l0 r3 = f1.l0.f8470a     // Catch: java.lang.Throwable -> Lac
            f1.l0.j(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lac
            r1.delete()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lac
            goto L8c
        L84:
            r1 = move-exception
            java.lang.String r3 = q0.f.f15933b     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> Lac
        L8c:
            throw r2     // Catch: java.lang.Throwable -> Lac
        L8d:
            r4 = r2
        L8e:
            f1.l0 r3 = f1.l0.f8470a     // Catch: java.lang.Throwable -> Lac
            f1.l0.j(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lac
            r1.delete()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lac
            goto La3
        L9d:
            r1 = move-exception
            java.lang.String r3 = q0.f.f15933b     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L70
        La3:
            if (r2 != 0) goto Laa
            q0.d0 r2 = new q0.d0     // Catch: java.lang.Throwable -> Lac
            r2.<init>()     // Catch: java.lang.Throwable -> Lac
        Laa:
            monitor-exit(r0)
            return r2
        Lac:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.f.a():q0.d0");
    }

    public static final void b(d0 d0Var) {
        p0.f0 f0Var = p0.f0.f14852a;
        Context l10 = p0.f0.l();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(l10.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(d0Var);
                l0 l0Var = l0.f8470a;
                l0.j(objectOutputStream2);
            } catch (Throwable th) {
                th = th;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f15933b, "Got unexpected exception while persisting events: ", th);
                    try {
                        l10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    l0 l0Var2 = l0.f8470a;
                    l0.j(objectOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
