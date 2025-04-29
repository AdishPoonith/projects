package e8;

import e8.c;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import r8.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements r8.c, e8.f {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f8142a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, f> f8143b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, List<b>> f8144c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f8145d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f8146e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, c.b> f8147f;

    /* renamed from: g  reason: collision with root package name */
    private int f8148g;

    /* renamed from: h  reason: collision with root package name */
    private final d f8149h;

    /* renamed from: i  reason: collision with root package name */
    private WeakHashMap<c.InterfaceC0246c, d> f8150i;

    /* renamed from: j  reason: collision with root package name */
    private i f8151j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f8152a;

        /* renamed from: b  reason: collision with root package name */
        int f8153b;

        /* renamed from: c  reason: collision with root package name */
        long f8154c;

        b(ByteBuffer byteBuffer, int i10, long j10) {
            this.f8152a = byteBuffer;
            this.f8153b = i10;
            this.f8154c = j10;
        }
    }

    /* renamed from: e8.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0136c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f8155a;

        C0136c(ExecutorService executorService) {
            this.f8155a = executorService;
        }

        @Override // e8.c.d
        public void a(Runnable runnable) {
            this.f8155a.execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d {
        void a(Runnable runnable);
    }

    /* loaded from: classes.dex */
    private static class e implements i {

        /* renamed from: a  reason: collision with root package name */
        ExecutorService f8156a = d8.a.e().b();

        e() {
        }

        @Override // e8.c.i
        public d a(c.d dVar) {
            return dVar.a() ? new h(this.f8156a) : new C0136c(this.f8156a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final c.a f8157a;

        /* renamed from: b  reason: collision with root package name */
        public final d f8158b;

        f(c.a aVar, d dVar) {
            this.f8157a = aVar;
            this.f8158b = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final FlutterJNI f8159a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8160b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f8161c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int i10) {
            this.f8159a = flutterJNI;
            this.f8160b = i10;
        }

        @Override // r8.c.b
        public void a(ByteBuffer byteBuffer) {
            if (this.f8161c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f8159a.invokePlatformMessageEmptyResponseCallback(this.f8160b);
            } else {
                this.f8159a.invokePlatformMessageResponseCallback(this.f8160b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f8162a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentLinkedQueue<Runnable> f8163b = new ConcurrentLinkedQueue<>();

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f8164c = new AtomicBoolean(false);

        h(ExecutorService executorService) {
            this.f8162a = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void f() {
            if (this.f8164c.compareAndSet(false, true)) {
                try {
                    Runnable poll = this.f8163b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.f8164c.set(false);
                    if (!this.f8163b.isEmpty()) {
                        this.f8162a.execute(new Runnable() { // from class: e8.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                c.h.this.f();
                            }
                        });
                    }
                }
            }
        }

        @Override // e8.c.d
        public void a(Runnable runnable) {
            this.f8163b.add(runnable);
            this.f8162a.execute(new Runnable() { // from class: e8.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.h.this.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface i {
        d a(c.d dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j implements c.InterfaceC0246c {
        private j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    c(FlutterJNI flutterJNI, i iVar) {
        this.f8143b = new HashMap();
        this.f8144c = new HashMap();
        this.f8145d = new Object();
        this.f8146e = new AtomicBoolean(false);
        this.f8147f = new HashMap();
        this.f8148g = 1;
        this.f8149h = new e8.g();
        this.f8150i = new WeakHashMap<>();
        this.f8142a = flutterJNI;
        this.f8151j = iVar;
    }

    private void j(final String str, final f fVar, final ByteBuffer byteBuffer, final int i10, final long j10) {
        d dVar = fVar != null ? fVar.f8158b : null;
        f9.e.b("PlatformChannel ScheduleHandler on " + str, i10);
        Runnable runnable = new Runnable() { // from class: e8.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.m(str, i10, fVar, byteBuffer, j10);
            }
        };
        if (dVar == null) {
            dVar = this.f8149h;
        }
        dVar.a(runnable);
    }

    private static void k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    private void l(f fVar, ByteBuffer byteBuffer, int i10) {
        if (fVar != null) {
            try {
                d8.b.f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f8157a.a(byteBuffer, new g(this.f8142a, i10));
                return;
            } catch (Error e10) {
                k(e10);
                return;
            } catch (Exception e11) {
                d8.b.c("DartMessenger", "Uncaught exception in binary message listener", e11);
            }
        } else {
            d8.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f8142a.invokePlatformMessageEmptyResponseCallback(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, int i10, f fVar, ByteBuffer byteBuffer, long j10) {
        f9.e.e("PlatformChannel ScheduleHandler on " + str, i10);
        f9.e.a("DartMessenger#handleMessageFromDart on " + str);
        try {
            l(fVar, byteBuffer, i10);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f8142a.cleanupMessageData(j10);
            f9.e.d();
        }
    }

    @Override // r8.c
    public c.InterfaceC0246c a(c.d dVar) {
        d a10 = this.f8151j.a(dVar);
        j jVar = new j();
        this.f8150i.put(jVar, a10);
        return jVar;
    }

    @Override // r8.c
    public void b(String str, c.a aVar, c.InterfaceC0246c interfaceC0246c) {
        if (aVar == null) {
            d8.b.f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f8145d) {
                this.f8143b.remove(str);
            }
            return;
        }
        d dVar = null;
        if (interfaceC0246c != null && (dVar = this.f8150i.get(interfaceC0246c)) == null) {
            throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
        }
        d8.b.f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f8145d) {
            this.f8143b.put(str, new f(aVar, dVar));
            List<b> remove = this.f8144c.remove(str);
            if (remove == null) {
                return;
            }
            for (b bVar : remove) {
                j(str, this.f8143b.get(str), bVar.f8152a, bVar.f8153b, bVar.f8154c);
            }
        }
    }

    @Override // r8.c
    public void c(String str, c.a aVar) {
        b(str, aVar, null);
    }

    @Override // r8.c
    public /* synthetic */ c.InterfaceC0246c d() {
        return r8.b.a(this);
    }

    @Override // r8.c
    public void e(String str, ByteBuffer byteBuffer, c.b bVar) {
        f9.e.a("DartMessenger#send on " + str);
        try {
            d8.b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i10 = this.f8148g;
            this.f8148g = i10 + 1;
            if (bVar != null) {
                this.f8147f.put(Integer.valueOf(i10), bVar);
            }
            if (byteBuffer == null) {
                this.f8142a.dispatchEmptyPlatformMessage(str, i10);
            } else {
                this.f8142a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i10);
            }
        } finally {
            f9.e.d();
        }
    }

    @Override // r8.c
    public void f(String str, ByteBuffer byteBuffer) {
        d8.b.f("DartMessenger", "Sending message over channel '" + str + "'");
        e(str, byteBuffer, null);
    }

    @Override // e8.f
    public void g(int i10, ByteBuffer byteBuffer) {
        d8.b.f("DartMessenger", "Received message reply from Dart.");
        c.b remove = this.f8147f.remove(Integer.valueOf(i10));
        if (remove != null) {
            try {
                d8.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e10) {
                k(e10);
            } catch (Exception e11) {
                d8.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e11);
            }
        }
    }

    @Override // e8.f
    public void h(String str, ByteBuffer byteBuffer, int i10, long j10) {
        f fVar;
        boolean z10;
        d8.b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f8145d) {
            fVar = this.f8143b.get(str);
            z10 = this.f8146e.get() && fVar == null;
            if (z10) {
                if (!this.f8144c.containsKey(str)) {
                    this.f8144c.put(str, new LinkedList());
                }
                this.f8144c.get(str).add(new b(byteBuffer, i10, j10));
            }
        }
        if (z10) {
            return;
        }
        j(str, fVar, byteBuffer, i10, j10);
    }
}
