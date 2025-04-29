package m9;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import m9.b;
import m9.f;
import okio.n;
/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f13926a = Logger.getLogger(b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final okio.f f13927b = okio.f.i("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements n {

        /* renamed from: j  reason: collision with root package name */
        private final okio.e f13928j;

        /* renamed from: k  reason: collision with root package name */
        int f13929k;

        /* renamed from: l  reason: collision with root package name */
        byte f13930l;

        /* renamed from: m  reason: collision with root package name */
        int f13931m;

        /* renamed from: n  reason: collision with root package name */
        int f13932n;

        /* renamed from: o  reason: collision with root package name */
        short f13933o;

        public a(okio.e eVar) {
            this.f13928j = eVar;
        }

        private void a() {
            int i10 = this.f13931m;
            int m10 = g.m(this.f13928j);
            this.f13932n = m10;
            this.f13929k = m10;
            byte readByte = (byte) (this.f13928j.readByte() & 255);
            this.f13930l = (byte) (this.f13928j.readByte() & 255);
            if (g.f13926a.isLoggable(Level.FINE)) {
                g.f13926a.fine(b.b(true, this.f13931m, this.f13929k, readByte, this.f13930l));
            }
            int readInt = this.f13928j.readInt() & Integer.MAX_VALUE;
            this.f13931m = readInt;
            if (readByte != 9) {
                throw g.k("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i10) {
                throw g.k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // okio.n
        public long Q(okio.c cVar, long j10) {
            while (true) {
                int i10 = this.f13932n;
                if (i10 != 0) {
                    long Q = this.f13928j.Q(cVar, Math.min(j10, i10));
                    if (Q == -1) {
                        return -1L;
                    }
                    this.f13932n -= (int) Q;
                    return Q;
                }
                this.f13928j.skip(this.f13933o);
                this.f13933o = (short) 0;
                if ((this.f13930l & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }

        @Override // okio.n, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f13934a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f13935b = new String[64];

        /* renamed from: c  reason: collision with root package name */
        private static final String[] f13936c = new String[256];

        static {
            String[] strArr;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr2 = f13936c;
                if (i11 >= strArr2.length) {
                    break;
                }
                strArr2[i11] = String.format("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
                i11++;
            }
            String[] strArr3 = f13935b;
            strArr3[0] = "";
            strArr3[1] = "END_STREAM";
            int[] iArr = {1};
            strArr3[8] = "PADDED";
            for (int i12 = 0; i12 < 1; i12++) {
                int i13 = iArr[i12];
                f13935b[i13 | 8] = strArr[i13] + "|PADDED";
            }
            String[] strArr4 = f13935b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i14 = 0; i14 < 3; i14++) {
                int i15 = iArr2[i14];
                for (int i16 = 0; i16 < 1; i16++) {
                    int i17 = iArr[i16];
                    String[] strArr5 = f13935b;
                    int i18 = i17 | i15;
                    strArr5[i18] = strArr5[i17] + '|' + strArr5[i15];
                    strArr5[i18 | 8] = strArr5[i17] + '|' + strArr5[i15] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr6 = f13935b;
                if (i10 >= strArr6.length) {
                    return;
                }
                if (strArr6[i10] == null) {
                    strArr6[i10] = f13936c[i10];
                }
                i10++;
            }
        }

        b() {
        }

        static String a(byte b10, byte b11) {
            if (b11 == 0) {
                return "";
            }
            if (b10 != 2 && b10 != 3) {
                if (b10 == 4 || b10 == 6) {
                    return b11 == 1 ? "ACK" : f13936c[b11];
                } else if (b10 != 7 && b10 != 8) {
                    String[] strArr = f13935b;
                    String str = b11 < strArr.length ? strArr[b11] : f13936c[b11];
                    return (b10 != 5 || (b11 & 4) == 0) ? (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f13936c[b11];
        }

        static String b(boolean z10, int i10, int i11, byte b10, byte b11) {
            String[] strArr = f13934a;
            String format = b10 < strArr.length ? strArr[b10] : String.format("0x%02x", Byte.valueOf(b10));
            String a10 = a(b10, b11);
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = z10 ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = Integer.valueOf(i11);
            objArr[3] = format;
            objArr[4] = a10;
            return String.format(locale, "%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* loaded from: classes.dex */
    static final class c implements m9.b {

        /* renamed from: j  reason: collision with root package name */
        private final okio.e f13937j;

        /* renamed from: k  reason: collision with root package name */
        private final a f13938k;

        /* renamed from: l  reason: collision with root package name */
        private final boolean f13939l;

        /* renamed from: m  reason: collision with root package name */
        final f.a f13940m;

        c(okio.e eVar, int i10, boolean z10) {
            this.f13937j = eVar;
            this.f13939l = z10;
            a aVar = new a(eVar);
            this.f13938k = aVar;
            this.f13940m = new f.a(i10, aVar);
        }

        private void a(b.a aVar, int i10, byte b10, int i11) {
            boolean z10 = (b10 & 1) != 0;
            if ((b10 & 32) != 0) {
                throw g.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short readByte = (b10 & 8) != 0 ? (short) (this.f13937j.readByte() & 255) : (short) 0;
            aVar.j(z10, i11, this.f13937j, g.l(i10, b10, readByte));
            this.f13937j.skip(readByte);
        }

        private void b(b.a aVar, int i10, byte b10, int i11) {
            if (i10 < 8) {
                throw g.k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw g.k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int readInt = this.f13937j.readInt();
            int readInt2 = this.f13937j.readInt();
            int i12 = i10 - 8;
            m9.a b11 = m9.a.b(readInt2);
            if (b11 == null) {
                throw g.k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            okio.f fVar = okio.f.f14754n;
            if (i12 > 0) {
                fVar = this.f13937j.n(i12);
            }
            aVar.l(readInt, b11, fVar);
        }

        private List<m9.d> e(int i10, short s10, byte b10, int i11) {
            a aVar = this.f13938k;
            aVar.f13932n = i10;
            aVar.f13929k = i10;
            aVar.f13933o = s10;
            aVar.f13930l = b10;
            aVar.f13931m = i11;
            this.f13940m.l();
            return this.f13940m.e();
        }

        private void h(b.a aVar, int i10, byte b10, int i11) {
            if (i11 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z10 = (b10 & 1) != 0;
            short readByte = (b10 & 8) != 0 ? (short) (this.f13937j.readByte() & 255) : (short) 0;
            if ((b10 & 32) != 0) {
                k(aVar, i11);
                i10 -= 5;
            }
            aVar.i(false, z10, i11, -1, e(g.l(i10, b10, readByte), readByte, b10, i11), e.HTTP_20_HEADERS);
        }

        private void i(b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 8) {
                throw g.k("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw g.k("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.f((b10 & 1) != 0, this.f13937j.readInt(), this.f13937j.readInt());
        }

        private void k(b.a aVar, int i10) {
            int readInt = this.f13937j.readInt();
            aVar.k(i10, readInt & Integer.MAX_VALUE, (this.f13937j.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        private void l(b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 5) {
                throw g.k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw g.k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            k(aVar, i11);
        }

        private void m(b.a aVar, int i10, byte b10, int i11) {
            if (i11 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short readByte = (b10 & 8) != 0 ? (short) (this.f13937j.readByte() & 255) : (short) 0;
            aVar.n(i11, this.f13937j.readInt() & Integer.MAX_VALUE, e(g.l(i10 - 4, b10, readByte), readByte, b10, i11));
        }

        private void q(b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 4) {
                throw g.k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw g.k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int readInt = this.f13937j.readInt();
            m9.a b11 = m9.a.b(readInt);
            if (b11 == null) {
                throw g.k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            aVar.d(i11, b11);
        }

        private void r(b.a aVar, int i10, byte b10, int i11) {
            if (i11 != 0) {
                throw g.k("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b10 & 1) != 0) {
                if (i10 != 0) {
                    throw g.k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.h();
            } else if (i10 % 6 != 0) {
                throw g.k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
            } else {
                i iVar = new i();
                for (int i12 = 0; i12 < i10; i12 += 6) {
                    short readShort = this.f13937j.readShort();
                    int readInt = this.f13937j.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (readInt != 0 && readInt != 1) {
                                throw g.k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                            break;
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            readShort = 7;
                            if (readInt < 0) {
                                throw g.k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                            break;
                        case 5:
                            if (readInt < 16384 || readInt > 16777215) {
                                throw g.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            }
                            break;
                        default:
                    }
                    iVar.e(readShort, 0, readInt);
                }
                aVar.m(false, iVar);
                if (iVar.b() >= 0) {
                    this.f13940m.g(iVar.b());
                }
            }
        }

        private void t(b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 4) {
                throw g.k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
            }
            long readInt = this.f13937j.readInt() & 2147483647L;
            if (readInt == 0) {
                throw g.k("windowSizeIncrement was 0", new Object[0]);
            }
            aVar.g(i11, readInt);
        }

        @Override // m9.b
        public boolean M(b.a aVar) {
            try {
                this.f13937j.Y(9L);
                int m10 = g.m(this.f13937j);
                if (m10 < 0 || m10 > 16384) {
                    throw g.k("FRAME_SIZE_ERROR: %s", Integer.valueOf(m10));
                }
                byte readByte = (byte) (this.f13937j.readByte() & 255);
                byte readByte2 = (byte) (this.f13937j.readByte() & 255);
                int readInt = this.f13937j.readInt() & Integer.MAX_VALUE;
                if (g.f13926a.isLoggable(Level.FINE)) {
                    g.f13926a.fine(b.b(true, readInt, m10, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        a(aVar, m10, readByte2, readInt);
                        break;
                    case 1:
                        h(aVar, m10, readByte2, readInt);
                        break;
                    case 2:
                        l(aVar, m10, readByte2, readInt);
                        break;
                    case 3:
                        q(aVar, m10, readByte2, readInt);
                        break;
                    case 4:
                        r(aVar, m10, readByte2, readInt);
                        break;
                    case 5:
                        m(aVar, m10, readByte2, readInt);
                        break;
                    case 6:
                        i(aVar, m10, readByte2, readInt);
                        break;
                    case 7:
                        b(aVar, m10, readByte2, readInt);
                        break;
                    case 8:
                        t(aVar, m10, readByte2, readInt);
                        break;
                    default:
                        this.f13937j.skip(m10);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f13937j.close();
        }
    }

    /* loaded from: classes.dex */
    static final class d implements m9.c {

        /* renamed from: j  reason: collision with root package name */
        private final okio.d f13941j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f13942k;

        /* renamed from: l  reason: collision with root package name */
        private final okio.c f13943l;

        /* renamed from: m  reason: collision with root package name */
        private final f.b f13944m;

        /* renamed from: n  reason: collision with root package name */
        private int f13945n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f13946o;

        d(okio.d dVar, boolean z10) {
            this.f13941j = dVar;
            this.f13942k = z10;
            okio.c cVar = new okio.c();
            this.f13943l = cVar;
            this.f13944m = new f.b(cVar);
            this.f13945n = 16384;
        }

        private void h(int i10, long j10) {
            while (j10 > 0) {
                int min = (int) Math.min(this.f13945n, j10);
                long j11 = min;
                j10 -= j11;
                b(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
                this.f13941j.j(this.f13943l, j11);
            }
        }

        @Override // m9.c
        public synchronized void E() {
            if (this.f13946o) {
                throw new IOException("closed");
            }
            if (this.f13942k) {
                if (g.f13926a.isLoggable(Level.FINE)) {
                    g.f13926a.fine(String.format(">> CONNECTION %s", g.f13927b.l()));
                }
                this.f13941j.J(g.f13927b.v());
                this.f13941j.flush();
            }
        }

        @Override // m9.c
        public synchronized void F(i iVar) {
            if (this.f13946o) {
                throw new IOException("closed");
            }
            this.f13945n = iVar.c(this.f13945n);
            b(0, 0, (byte) 4, (byte) 1);
            this.f13941j.flush();
        }

        @Override // m9.c
        public synchronized void I(i iVar) {
            if (this.f13946o) {
                throw new IOException("closed");
            }
            int i10 = 0;
            b(0, iVar.f() * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (iVar.d(i10)) {
                    this.f13941j.p(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.f13941j.s(iVar.a(i10));
                }
                i10++;
            }
            this.f13941j.flush();
        }

        @Override // m9.c
        public synchronized void K(boolean z10, int i10, okio.c cVar, int i11) {
            if (this.f13946o) {
                throw new IOException("closed");
            }
            a(i10, z10 ? (byte) 1 : (byte) 0, cVar, i11);
        }

        @Override // m9.c
        public synchronized void R(int i10, m9.a aVar, byte[] bArr) {
            if (this.f13946o) {
                throw new IOException("closed");
            }
            if (aVar.f13887j == -1) {
                throw g.j("errorCode.httpCode == -1", new Object[0]);
            }
            b(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f13941j.s(i10);
            this.f13941j.s(aVar.f13887j);
            if (bArr.length > 0) {
                this.f13941j.J(bArr);
            }
            this.f13941j.flush();
        }

        @Override // m9.c
        public int V() {
            return this.f13945n;
        }

        @Override // m9.c
        public synchronized void X(boolean z10, boolean z11, int i10, int i11, List<m9.d> list) {
            try {
                if (z11) {
                    throw new UnsupportedOperationException();
                }
                if (this.f13946o) {
                    throw new IOException("closed");
                }
                e(z10, i10, list);
            } catch (Throwable th) {
                throw th;
            }
        }

        void a(int i10, byte b10, okio.c cVar, int i11) {
            b(i10, i11, (byte) 0, b10);
            if (i11 > 0) {
                this.f13941j.j(cVar, i11);
            }
        }

        void b(int i10, int i11, byte b10, byte b11) {
            if (g.f13926a.isLoggable(Level.FINE)) {
                g.f13926a.fine(b.b(false, i10, i11, b10, b11));
            }
            int i12 = this.f13945n;
            if (i11 > i12) {
                throw g.j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            if ((Integer.MIN_VALUE & i10) != 0) {
                throw g.j("reserved bit set: %s", Integer.valueOf(i10));
            }
            g.n(this.f13941j, i11);
            this.f13941j.D(b10 & 255);
            this.f13941j.D(b11 & 255);
            this.f13941j.s(i10 & Integer.MAX_VALUE);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f13946o = true;
            this.f13941j.close();
        }

        @Override // m9.c
        public synchronized void d(int i10, m9.a aVar) {
            if (this.f13946o) {
                throw new IOException("closed");
            }
            if (aVar.f13887j == -1) {
                throw new IllegalArgumentException();
            }
            b(i10, 4, (byte) 3, (byte) 0);
            this.f13941j.s(aVar.f13887j);
            this.f13941j.flush();
        }

        void e(boolean z10, int i10, List<m9.d> list) {
            if (this.f13946o) {
                throw new IOException("closed");
            }
            this.f13944m.e(list);
            long b02 = this.f13943l.b0();
            int min = (int) Math.min(this.f13945n, b02);
            long j10 = min;
            int i11 = (b02 > j10 ? 1 : (b02 == j10 ? 0 : -1));
            byte b10 = i11 == 0 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            b(i10, min, (byte) 1, b10);
            this.f13941j.j(this.f13943l, j10);
            if (i11 > 0) {
                h(i10, b02 - j10);
            }
        }

        @Override // m9.c
        public synchronized void f(boolean z10, int i10, int i11) {
            if (this.f13946o) {
                throw new IOException("closed");
            }
            b(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f13941j.s(i10);
            this.f13941j.s(i11);
            this.f13941j.flush();
        }

        @Override // m9.c
        public synchronized void flush() {
            if (this.f13946o) {
                throw new IOException("closed");
            }
            this.f13941j.flush();
        }

        @Override // m9.c
        public synchronized void g(int i10, long j10) {
            if (this.f13946o) {
                throw new IOException("closed");
            }
            if (j10 == 0 || j10 > 2147483647L) {
                throw g.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
            }
            b(i10, 4, (byte) 8, (byte) 0);
            this.f13941j.s((int) j10);
            this.f13941j.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IllegalArgumentException j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException k(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i10, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(okio.e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(okio.d dVar, int i10) {
        dVar.D((i10 >>> 16) & 255);
        dVar.D((i10 >>> 8) & 255);
        dVar.D(i10 & 255);
    }

    @Override // m9.j
    public m9.b a(okio.e eVar, boolean z10) {
        return new c(eVar, 4096, z10);
    }

    @Override // m9.j
    public m9.c b(okio.d dVar, boolean z10) {
        return new d(dVar, z10);
    }
}
