package p3;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import o3.h0;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f15349a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f15350b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f15351c = false;

    /* renamed from: d  reason: collision with root package name */
    private static long f15352d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static String f15353e = "time.android.com";

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(IOException iOException);
    }

    /* loaded from: classes.dex */
    private static final class c implements h0.b<h0.e> {

        /* renamed from: j  reason: collision with root package name */
        private final b f15354j;

        public c(b bVar) {
            this.f15354j = bVar;
        }

        @Override // o3.h0.b
        public void i(h0.e eVar, long j10, long j11, boolean z10) {
        }

        @Override // o3.h0.b
        public void o(h0.e eVar, long j10, long j11) {
            if (this.f15354j != null) {
                if (e0.k()) {
                    this.f15354j.a();
                } else {
                    this.f15354j.b(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // o3.h0.b
        public h0.c u(h0.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f15354j;
            if (bVar != null) {
                bVar.b(iOException);
            }
            return o3.h0.f14452f;
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements h0.e {
        private d() {
        }

        @Override // o3.h0.e
        public void b() {
            synchronized (e0.f15349a) {
                synchronized (e0.f15350b) {
                    if (e0.f15351c) {
                        return;
                    }
                    long e10 = e0.e();
                    synchronized (e0.f15350b) {
                        long unused = e0.f15352d = e10;
                        boolean unused2 = e0.f15351c = true;
                    }
                }
            }
        }

        @Override // o3.h0.e
        public void c() {
        }
    }

    static /* synthetic */ long e() {
        return l();
    }

    private static void g(byte b10, byte b11, int i10, long j10) {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        } else if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long h() {
        long j10;
        synchronized (f15350b) {
            j10 = f15351c ? f15352d : -9223372036854775807L;
        }
        return j10;
    }

    public static String i() {
        String str;
        synchronized (f15350b) {
            str = f15353e;
        }
        return str;
    }

    public static void j(o3.h0 h0Var, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        if (h0Var == null) {
            h0Var = new o3.h0("SntpClient");
        }
        h0Var.n(new d(), new c(bVar), 1);
    }

    public static boolean k() {
        boolean z10;
        synchronized (f15350b) {
            z10 = f15351c;
        }
        return z10;
    }

    private static long l() {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, (int) f.j.M0);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            long n10 = n(bArr, 24);
            long n11 = n(bArr, 32);
            long n12 = n(bArr, 40);
            g((byte) ((bArr[0] >> 6) & 3), (byte) (bArr[0] & 7), bArr[1] & 255, n12);
            long j11 = (j10 + (((n11 - n10) + (n12 - j10)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j11;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long m(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    private static long n(byte[] bArr, int i10) {
        long m10 = m(bArr, i10);
        long m11 = m(bArr, i10 + 4);
        if (m10 == 0 && m11 == 0) {
            return 0L;
        }
        return ((m10 - 2208988800L) * 1000) + ((m11 * 1000) / 4294967296L);
    }

    private static void o(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j13 >> 24);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j13 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j13 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j13 >> 0);
        long j14 = (j12 * 4294967296L) / 1000;
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j14 >> 24);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j14 >> 16);
        bArr[i16] = (byte) (j14 >> 8);
        bArr[i16 + 1] = (byte) (Math.random() * 255.0d);
    }
}
