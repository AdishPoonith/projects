package k9;

import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
class j {

    /* renamed from: a  reason: collision with root package name */
    private final Logger f12755a;

    /* renamed from: b  reason: collision with root package name */
    private final Level f12756b;

    /* loaded from: classes.dex */
    enum a {
        INBOUND,
        OUTBOUND
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f12767j;

        b(int i10) {
            this.f12767j = i10;
        }

        public int b() {
            return this.f12767j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    j(Level level, Logger logger) {
        this.f12756b = (Level) b5.n.o(level, "level");
        this.f12755a = (Logger) b5.n.o(logger, "logger");
    }

    private boolean a() {
        return this.f12755a.isLoggable(this.f12756b);
    }

    private static String l(m9.i iVar) {
        b[] values;
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (iVar.d(bVar.b())) {
                enumMap.put((EnumMap) bVar, (b) Integer.valueOf(iVar.a(bVar.b())));
            }
        }
        return enumMap.toString();
    }

    private static String m(okio.c cVar) {
        if (cVar.b0() <= 64) {
            return cVar.c0().l();
        }
        int min = (int) Math.min(cVar.b0(), 64L);
        return cVar.e0(min).l() + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar, int i10, okio.c cVar, int i11, boolean z10) {
        if (a()) {
            Logger logger = this.f12755a;
            Level level = this.f12756b;
            logger.log(level, aVar + " DATA: streamId=" + i10 + " endStream=" + z10 + " length=" + i11 + " bytes=" + m(cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(a aVar, int i10, m9.a aVar2, okio.f fVar) {
        if (a()) {
            Logger logger = this.f12755a;
            Level level = this.f12756b;
            logger.log(level, aVar + " GO_AWAY: lastStreamId=" + i10 + " errorCode=" + aVar2 + " length=" + fVar.r() + " bytes=" + m(new okio.c().g0(fVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(a aVar, int i10, List<m9.d> list, boolean z10) {
        if (a()) {
            Logger logger = this.f12755a;
            Level level = this.f12756b;
            logger.log(level, aVar + " HEADERS: streamId=" + i10 + " headers=" + list + " endStream=" + z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a aVar, long j10) {
        if (a()) {
            Logger logger = this.f12755a;
            Level level = this.f12756b;
            logger.log(level, aVar + " PING: ack=false bytes=" + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(a aVar, long j10) {
        if (a()) {
            Logger logger = this.f12755a;
            Level level = this.f12756b;
            logger.log(level, aVar + " PING: ack=true bytes=" + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(a aVar, int i10, int i11, List<m9.d> list) {
        if (a()) {
            Logger logger = this.f12755a;
            Level level = this.f12756b;
            logger.log(level, aVar + " PUSH_PROMISE: streamId=" + i10 + " promisedStreamId=" + i11 + " headers=" + list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(a aVar, int i10, m9.a aVar2) {
        if (a()) {
            Logger logger = this.f12755a;
            Level level = this.f12756b;
            logger.log(level, aVar + " RST_STREAM: streamId=" + i10 + " errorCode=" + aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(a aVar, m9.i iVar) {
        if (a()) {
            Logger logger = this.f12755a;
            Level level = this.f12756b;
            logger.log(level, aVar + " SETTINGS: ack=false settings=" + l(iVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(a aVar) {
        if (a()) {
            Logger logger = this.f12755a;
            Level level = this.f12756b;
            logger.log(level, aVar + " SETTINGS: ack=true");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(a aVar, int i10, long j10) {
        if (a()) {
            Logger logger = this.f12755a;
            Level level = this.f12756b;
            logger.log(level, aVar + " WINDOW_UPDATE: streamId=" + i10 + " windowSizeIncrement=" + j10);
        }
    }
}
