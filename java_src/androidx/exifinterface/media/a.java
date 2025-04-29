package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* loaded from: classes.dex */
public class a {
    private static SimpleDateFormat U;
    private static SimpleDateFormat V;
    private static final e[] Z;

    /* renamed from: a0  reason: collision with root package name */
    private static final e[] f2016a0;

    /* renamed from: b0  reason: collision with root package name */
    private static final e[] f2017b0;

    /* renamed from: c0  reason: collision with root package name */
    private static final e[] f2018c0;

    /* renamed from: d0  reason: collision with root package name */
    private static final e[] f2019d0;

    /* renamed from: e0  reason: collision with root package name */
    private static final e f2020e0;

    /* renamed from: f0  reason: collision with root package name */
    private static final e[] f2021f0;

    /* renamed from: g0  reason: collision with root package name */
    private static final e[] f2022g0;

    /* renamed from: h0  reason: collision with root package name */
    private static final e[] f2023h0;

    /* renamed from: i0  reason: collision with root package name */
    private static final e[] f2024i0;

    /* renamed from: j0  reason: collision with root package name */
    static final e[][] f2025j0;

    /* renamed from: k0  reason: collision with root package name */
    private static final e[] f2026k0;

    /* renamed from: l0  reason: collision with root package name */
    private static final HashMap<Integer, e>[] f2027l0;

    /* renamed from: m0  reason: collision with root package name */
    private static final HashMap<String, e>[] f2028m0;

    /* renamed from: n0  reason: collision with root package name */
    private static final HashSet<String> f2029n0;

    /* renamed from: o0  reason: collision with root package name */
    private static final HashMap<Integer, Integer> f2030o0;

    /* renamed from: p0  reason: collision with root package name */
    static final Charset f2031p0;

    /* renamed from: q0  reason: collision with root package name */
    static final byte[] f2032q0;

    /* renamed from: r0  reason: collision with root package name */
    private static final byte[] f2033r0;

    /* renamed from: s0  reason: collision with root package name */
    private static final Pattern f2034s0;

    /* renamed from: t0  reason: collision with root package name */
    private static final Pattern f2035t0;

    /* renamed from: u0  reason: collision with root package name */
    private static final Pattern f2036u0;

    /* renamed from: v0  reason: collision with root package name */
    private static final Pattern f2038v0;

    /* renamed from: a  reason: collision with root package name */
    private String f2043a;

    /* renamed from: b  reason: collision with root package name */
    private FileDescriptor f2044b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager.AssetInputStream f2045c;

    /* renamed from: d  reason: collision with root package name */
    private int f2046d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2047e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, d>[] f2048f;

    /* renamed from: g  reason: collision with root package name */
    private Set<Integer> f2049g;

    /* renamed from: h  reason: collision with root package name */
    private ByteOrder f2050h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2051i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2052j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2053k;

    /* renamed from: l  reason: collision with root package name */
    private int f2054l;

    /* renamed from: m  reason: collision with root package name */
    private int f2055m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f2056n;

    /* renamed from: o  reason: collision with root package name */
    private int f2057o;

    /* renamed from: p  reason: collision with root package name */
    private int f2058p;

    /* renamed from: q  reason: collision with root package name */
    private int f2059q;

    /* renamed from: r  reason: collision with root package name */
    private int f2060r;

    /* renamed from: s  reason: collision with root package name */
    private int f2061s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f2062t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f2063u;

    /* renamed from: v  reason: collision with root package name */
    private static final boolean f2037v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w  reason: collision with root package name */
    private static final List<Integer> f2039w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x  reason: collision with root package name */
    private static final List<Integer> f2040x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f2041y = {8, 8, 8};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f2042z = {4};
    public static final int[] A = {8};
    static final byte[] B = {-1, -40, -1};
    private static final byte[] C = {102, 116, 121, 112};
    private static final byte[] D = {109, 105, 102, 49};
    private static final byte[] E = {104, 101, 105, 99};
    private static final byte[] F = {79, 76, 89, 77, 80, 0};
    private static final byte[] G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] H = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] I = {101, 88, 73, 102};
    private static final byte[] J = {73, 72, 68, 82};
    private static final byte[] K = {73, 69, 78, 68};
    private static final byte[] L = {82, 73, 70, 70};
    private static final byte[] M = {87, 69, 66, 80};
    private static final byte[] N = {69, 88, 73, 70};
    private static final byte[] O = {-99, 1, 42};
    private static final byte[] P = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] R = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] T = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0033a extends MediaDataSource {

        /* renamed from: j  reason: collision with root package name */
        long f2064j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ g f2065k;

        C0033a(g gVar) {
            this.f2065k = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f2064j;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f2065k.available()) {
                        return -1;
                    }
                    this.f2065k.i(j10);
                    this.f2064j = j10;
                }
                if (i11 > this.f2065k.available()) {
                    i11 = this.f2065k.available();
                }
                int read = this.f2065k.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f2064j += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f2064j = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: n  reason: collision with root package name */
        private static final ByteOrder f2067n = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: o  reason: collision with root package name */
        private static final ByteOrder f2068o = ByteOrder.BIG_ENDIAN;

        /* renamed from: j  reason: collision with root package name */
        final DataInputStream f2069j;

        /* renamed from: k  reason: collision with root package name */
        private ByteOrder f2070k;

        /* renamed from: l  reason: collision with root package name */
        int f2071l;

        /* renamed from: m  reason: collision with root package name */
        private byte[] f2072m;

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f2070k = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f2069j = dataInputStream;
            dataInputStream.mark(0);
            this.f2071l = 0;
            this.f2070k = byteOrder;
        }

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f2071l;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f2069j.available();
        }

        public long b() {
            return readInt() & 4294967295L;
        }

        public void e(ByteOrder byteOrder) {
            this.f2070k = byteOrder;
        }

        public void h(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f2069j.skip(i12);
                if (skip <= 0) {
                    if (this.f2072m == null) {
                        this.f2072m = new byte[8192];
                    }
                    skip = this.f2069j.read(this.f2072m, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f2071l += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f2071l++;
            return this.f2069j.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f2069j.read(bArr, i10, i11);
            this.f2071l += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f2071l++;
            return this.f2069j.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f2071l++;
            int read = this.f2069j.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f2071l += 2;
            return this.f2069j.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f2071l += bArr.length;
            this.f2069j.readFully(bArr);
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            this.f2071l += i11;
            this.f2069j.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f2071l += 4;
            int read = this.f2069j.read();
            int read2 = this.f2069j.read();
            int read3 = this.f2069j.read();
            int read4 = this.f2069j.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f2070k;
                if (byteOrder == f2067n) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f2068o) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f2070k);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f2071l += 8;
            int read = this.f2069j.read();
            int read2 = this.f2069j.read();
            int read3 = this.f2069j.read();
            int read4 = this.f2069j.read();
            int read5 = this.f2069j.read();
            int read6 = this.f2069j.read();
            int read7 = this.f2069j.read();
            int read8 = this.f2069j.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f2070k;
                if (byteOrder == f2067n) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f2068o) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f2070k);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f2071l += 2;
            int read = this.f2069j.read();
            int read2 = this.f2069j.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f2070k;
                if (byteOrder == f2067n) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f2068o) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f2070k);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f2071l += 2;
            return this.f2069j.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f2071l++;
            return this.f2069j.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f2071l += 2;
            int read = this.f2069j.read();
            int read2 = this.f2069j.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f2070k;
                if (byteOrder == f2067n) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f2068o) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f2070k);
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends FilterOutputStream {

        /* renamed from: j  reason: collision with root package name */
        final OutputStream f2073j;

        /* renamed from: k  reason: collision with root package name */
        private ByteOrder f2074k;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f2073j = outputStream;
            this.f2074k = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f2074k = byteOrder;
        }

        public void b(int i10) {
            this.f2073j.write(i10);
        }

        public void e(int i10) {
            OutputStream outputStream;
            int i11;
            ByteOrder byteOrder = this.f2074k;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f2073j.write((i10 >>> 0) & 255);
                this.f2073j.write((i10 >>> 8) & 255);
                this.f2073j.write((i10 >>> 16) & 255);
                outputStream = this.f2073j;
                i11 = i10 >>> 24;
            } else if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            } else {
                this.f2073j.write((i10 >>> 24) & 255);
                this.f2073j.write((i10 >>> 16) & 255);
                this.f2073j.write((i10 >>> 8) & 255);
                outputStream = this.f2073j;
                i11 = i10 >>> 0;
            }
            outputStream.write(i11 & 255);
        }

        public void h(short s10) {
            OutputStream outputStream;
            int i10;
            ByteOrder byteOrder = this.f2074k;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f2073j.write((s10 >>> 0) & 255);
                outputStream = this.f2073j;
                i10 = s10 >>> 8;
            } else if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            } else {
                this.f2073j.write((s10 >>> 8) & 255);
                outputStream = this.f2073j;
                i10 = s10 >>> 0;
            }
            outputStream.write(i10 & 255);
        }

        public void i(long j10) {
            e((int) j10);
        }

        public void k(int i10) {
            h((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f2073j.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            this.f2073j.write(bArr, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f2075a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2076b;

        /* renamed from: c  reason: collision with root package name */
        public final long f2077c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f2078d;

        d(int i10, int i11, long j10, byte[] bArr) {
            this.f2075a = i10;
            this.f2076b = i11;
            this.f2077c = j10;
            this.f2078d = bArr;
        }

        d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(a.f2031p0);
                return new d(1, bytes.length, bytes);
            }
            return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d10 : dArr) {
                wrap.putDouble(d10);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putInt(i10);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f2083a);
                wrap.putInt((int) fVar.f2084b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f2031p0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f2083a);
                wrap.putInt((int) fVar.f2084b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 != null) {
                if (o10 instanceof String) {
                    return Double.parseDouble((String) o10);
                }
                if (o10 instanceof long[]) {
                    long[] jArr = (long[]) o10;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof int[]) {
                    int[] iArr = (int[]) o10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof double[]) {
                    double[] dArr = (double[]) o10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof f[]) {
                    f[] fVarArr = (f[]) o10;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int m(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 != null) {
                if (o10 instanceof String) {
                    return Integer.parseInt((String) o10);
                }
                if (o10 instanceof long[]) {
                    long[] jArr = (long[]) o10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof int[]) {
                    int[] iArr = (int[]) o10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String n(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                return null;
            }
            if (o10 instanceof String) {
                return (String) o10;
            }
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            if (o10 instanceof long[]) {
                long[] jArr = (long[]) o10;
                while (i10 < jArr.length) {
                    sb.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (o10 instanceof int[]) {
                int[] iArr = (int[]) o10;
                while (i10 < iArr.length) {
                    sb.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (o10 instanceof double[]) {
                double[] dArr = (double[]) o10;
                while (i10 < dArr.length) {
                    sb.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (o10 instanceof f[]) {
                f[] fVarArr = (f[]) o10;
                while (i10 < fVarArr.length) {
                    sb.append(fVarArr[i10].f2083a);
                    sb.append('/');
                    sb.append(fVarArr[i10].f2084b);
                    i10++;
                    if (i10 != fVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019c */
        /* JADX WARN: Removed duplicated region for block: B:176:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object o(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.X[this.f2075a] * this.f2076b;
        }

        public String toString() {
            return "(" + a.W[this.f2075a] + ", data length:" + this.f2078d.length + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f2079a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2080b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2081c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2082d;

        e(String str, int i10, int i11) {
            this.f2080b = str;
            this.f2079a = i10;
            this.f2081c = i11;
            this.f2082d = -1;
        }

        e(String str, int i10, int i11, int i12) {
            this.f2080b = str;
            this.f2079a = i10;
            this.f2081c = i11;
            this.f2082d = i12;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f2081c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f2082d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f2083a;

        /* renamed from: b  reason: collision with root package name */
        public final long f2084b;

        f(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        f(long j10, long j11) {
            if (j11 == 0) {
                this.f2083a = 0L;
                this.f2084b = 1L;
                return;
            }
            this.f2083a = j10;
            this.f2084b = j11;
        }

        public double a() {
            return this.f2083a / this.f2084b;
        }

        public String toString() {
            return this.f2083a + "/" + this.f2084b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends b {
        g(InputStream inputStream) {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f2069j.mark(Integer.MAX_VALUE);
        }

        g(byte[] bArr) {
            super(bArr);
            this.f2069j.mark(Integer.MAX_VALUE);
        }

        public void i(long j10) {
            int i10 = this.f2071l;
            if (i10 > j10) {
                this.f2071l = 0;
                this.f2069j.reset();
            } else {
                j10 -= i10;
            }
            h((int) j10);
        }
    }

    static {
        e[] eVarArr;
        e[] eVarArr2 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        Z = eVarArr2;
        e[] eVarArr3 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f2016a0 = eVarArr3;
        e[] eVarArr4 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f2017b0 = eVarArr4;
        e[] eVarArr5 = {new e("InteroperabilityIndex", 1, 2)};
        f2018c0 = eVarArr5;
        e[] eVarArr6 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f2019d0 = eVarArr6;
        f2020e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr7 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f2021f0 = eVarArr7;
        e[] eVarArr8 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f2022g0 = eVarArr8;
        e[] eVarArr9 = {new e("AspectFrame", 4371, 3)};
        f2023h0 = eVarArr9;
        e[] eVarArr10 = {new e("ColorSpace", 55, 3)};
        f2024i0 = eVarArr10;
        e[][] eVarArr11 = {eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr6, eVarArr2, eVarArr7, eVarArr8, eVarArr9, eVarArr10};
        f2025j0 = eVarArr11;
        f2026k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f2027l0 = new HashMap[eVarArr11.length];
        f2028m0 = new HashMap[eVarArr11.length];
        f2029n0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f2030o0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f2031p0 = forName;
        f2032q0 = "Exif\u0000\u0000".getBytes(forName);
        f2033r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr12 = f2025j0;
            if (i10 >= eVarArr12.length) {
                HashMap<Integer, Integer> hashMap = f2030o0;
                e[] eVarArr13 = f2026k0;
                hashMap.put(Integer.valueOf(eVarArr13[0].f2079a), 5);
                hashMap.put(Integer.valueOf(eVarArr13[1].f2079a), 1);
                hashMap.put(Integer.valueOf(eVarArr13[2].f2079a), 2);
                hashMap.put(Integer.valueOf(eVarArr13[3].f2079a), 3);
                hashMap.put(Integer.valueOf(eVarArr13[4].f2079a), 7);
                hashMap.put(Integer.valueOf(eVarArr13[5].f2079a), 8);
                f2034s0 = Pattern.compile(".*[1-9].*");
                f2035t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f2036u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f2038v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f2027l0[i10] = new HashMap<>();
            f2028m0[i10] = new HashMap<>();
            for (e eVar : eVarArr12[i10]) {
                f2027l0[i10].put(Integer.valueOf(eVar.f2079a), eVar);
                f2028m0[i10].put(eVar.f2080b, eVar);
            }
            i10++;
        }
    }

    public a(String str) {
        e[][] eVarArr = f2025j0;
        this.f2048f = new HashMap[eVarArr.length];
        this.f2049g = new HashSet(eVarArr.length);
        this.f2050h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        u(str);
    }

    private boolean A(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder J2 = J(bVar2);
                this.f2050h = J2;
                bVar2.e(J2);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean B(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (f2037v) {
                Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                return false;
            }
            return false;
        }
    }

    private boolean C(HashMap hashMap) {
        d dVar;
        int m10;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f2050h);
            int[] iArr2 = f2041y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f2046d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m10 = dVar.m(this.f2050h)) == 1 && Arrays.equals(iArr, A)) || (m10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (f2037v) {
            Log.d("ExifInterface", "Unsupported data type value");
            return false;
        }
        return false;
    }

    private static boolean D(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    private boolean E(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f2050h) <= 512 && dVar2.m(this.f2050h) <= 512;
    }

    private boolean F(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = L;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = M;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[L.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else if (bArr[i10] != bArr2[i10]) {
                return false;
            } else {
                i10++;
            }
        }
    }

    private void G(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i10 = 0; i10 < f2025j0.length; i10++) {
            try {
                try {
                    this.f2048f[i10] = new HashMap<>();
                } finally {
                    a();
                    if (f2037v) {
                        I();
                    }
                }
            } catch (IOException | UnsupportedOperationException e10) {
                boolean z10 = f2037v;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                }
                a();
                if (!z10) {
                    return;
                }
            }
        }
        if (!this.f2047e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f2046d = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (V(this.f2046d)) {
            g gVar = new g(inputStream);
            if (this.f2047e) {
                n(gVar);
            } else {
                int i11 = this.f2046d;
                if (i11 == 12) {
                    f(gVar);
                } else if (i11 == 7) {
                    i(gVar);
                } else if (i11 == 10) {
                    m(gVar);
                } else {
                    l(gVar);
                }
            }
            gVar.i(this.f2058p);
            U(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f2046d;
            if (i12 == 4) {
                g(bVar, 0, 0);
            } else if (i12 == 13) {
                j(bVar);
            } else if (i12 == 9) {
                k(bVar);
            } else if (i12 == 14) {
                q(bVar);
            }
        }
    }

    private void H(b bVar) {
        ByteOrder J2 = J(bVar);
        this.f2050h = J2;
        bVar.e(J2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f2046d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i11 = readInt - 8;
        if (i11 > 0) {
            bVar.h(i11);
        }
    }

    private void I() {
        for (int i10 = 0; i10 < this.f2048f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f2048f[i10].size());
            for (Map.Entry<String, d> entry : this.f2048f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.n(this.f2050h) + "'");
            }
        }
    }

    private ByteOrder J(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f2037v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f2037v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    private void K(byte[] bArr, int i10) {
        g gVar = new g(bArr);
        H(gVar);
        L(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void L(androidx.exifinterface.media.a.g r30, int r31) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.L(androidx.exifinterface.media.a$g, int):void");
    }

    private void M(String str) {
        for (int i10 = 0; i10 < f2025j0.length; i10++) {
            this.f2048f[i10].remove(str);
        }
    }

    private void N(int i10, String str, String str2) {
        if (this.f2048f[i10].isEmpty() || this.f2048f[i10].get(str) == null) {
            return;
        }
        HashMap<String, d>[] hashMapArr = this.f2048f;
        hashMapArr[i10].put(str2, hashMapArr[i10].get(str));
        this.f2048f[i10].remove(str);
    }

    private void O(g gVar, int i10) {
        d dVar = this.f2048f[i10].get("ImageLength");
        d dVar2 = this.f2048f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f2048f[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.f2048f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m10 = dVar3.m(this.f2050h);
            int m11 = dVar3.m(this.f2050h);
            gVar.i(m10);
            byte[] bArr = new byte[m11];
            gVar.read(bArr);
            g(new b(bArr), m10, i10);
        }
    }

    private void Q(InputStream inputStream, OutputStream outputStream) {
        if (f2037v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        d dVar = null;
        if (d("Xmp") != null && this.f2063u) {
            dVar = this.f2048f[0].remove("Xmp");
        }
        cVar.b(-1);
        cVar.b(-31);
        Z(cVar);
        if (dVar != null) {
            this.f2048f[0].put("Xmp", dVar);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.b(-1);
                cVar.b(readByte);
                androidx.exifinterface.media.b.e(bVar, cVar);
                return;
            } else if (readByte != -31) {
                cVar.b(-1);
                cVar.b(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.k(readUnsignedShort);
                int i10 = readUnsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i10, 4096));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i10 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                if (readUnsignedShort2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (readUnsignedShort2 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f2032q0)) {
                        bVar.h(readUnsignedShort2 - 6);
                    }
                }
                cVar.b(-1);
                cVar.b(readByte);
                cVar.k(readUnsignedShort2 + 2);
                if (readUnsignedShort2 >= 6) {
                    readUnsignedShort2 -= 6;
                    cVar.write(bArr2);
                }
                while (readUnsignedShort2 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        readUnsignedShort2 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void R(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f2037v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = H;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        int i10 = this.f2058p;
        if (i10 == 0) {
            int readInt = bVar.readInt();
            cVar.e(readInt);
            androidx.exifinterface.media.b.f(bVar, cVar, readInt + 4 + 4);
        } else {
            androidx.exifinterface.media.b.f(bVar, cVar, ((i10 - bArr.length) - 4) - 4);
            bVar.h(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            Z(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f2073j).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.e((int) crc32.getValue());
            androidx.exifinterface.media.b.c(byteArrayOutputStream);
            androidx.exifinterface.media.b.e(bVar, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.b.c(byteArrayOutputStream2);
            throw th;
        }
    }

    private void S(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        int i10;
        int i11;
        int i12;
        if (f2037v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = L;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        byte[] bArr2 = M;
        bVar.h(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i13 = this.f2058p;
            if (i13 != 0) {
                androidx.exifinterface.media.b.f(bVar, cVar2, ((i13 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                bVar.h(4);
                int readInt = bVar.readInt();
                if (readInt % 2 != 0) {
                    readInt++;
                }
                bVar.h(readInt);
            } else {
                byte[] bArr3 = new byte[4];
                if (bVar.read(bArr3) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
                byte[] bArr4 = P;
                boolean z10 = true;
                if (!Arrays.equals(bArr3, bArr4)) {
                    byte[] bArr5 = R;
                    if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, Q)) {
                        int readInt2 = bVar.readInt();
                        int i14 = readInt2 % 2 == 1 ? readInt2 + 1 : readInt2;
                        byte[] bArr6 = new byte[3];
                        if (Arrays.equals(bArr3, bArr5)) {
                            bVar.read(bArr6);
                            byte[] bArr7 = new byte[3];
                            if (bVar.read(bArr7) != 3 || !Arrays.equals(O, bArr7)) {
                                throw new IOException("Encountered error while checking VP8 signature");
                            }
                            i10 = bVar.readInt();
                            i14 -= 10;
                            i12 = (i10 << 2) >> 18;
                            i11 = (i10 << 18) >> 18;
                            z10 = false;
                        } else if (!Arrays.equals(bArr3, Q)) {
                            i10 = 0;
                            z10 = false;
                            i11 = 0;
                            i12 = 0;
                        } else if (bVar.readByte() != 47) {
                            throw new IOException("Encountered error while checking VP8L signature");
                        } else {
                            i10 = bVar.readInt();
                            i11 = (i10 & 16383) + 1;
                            i12 = ((i10 & 268419072) >>> 14) + 1;
                            if ((i10 & 268435456) == 0) {
                                z10 = false;
                            }
                            i14 -= 5;
                        }
                        cVar2.write(bArr4);
                        cVar2.e(10);
                        byte[] bArr8 = new byte[10];
                        if (z10) {
                            bArr8[0] = (byte) (bArr8[0] | 16);
                        }
                        bArr8[0] = (byte) (bArr8[0] | 8);
                        int i15 = i11 - 1;
                        int i16 = i12 - 1;
                        bArr8[4] = (byte) i15;
                        bArr8[5] = (byte) (i15 >> 8);
                        bArr8[6] = (byte) (i15 >> 16);
                        bArr8[7] = (byte) i16;
                        bArr8[8] = (byte) (i16 >> 8);
                        bArr8[9] = (byte) (i16 >> 16);
                        cVar2.write(bArr8);
                        cVar2.write(bArr3);
                        cVar2.e(readInt2);
                        if (Arrays.equals(bArr3, bArr5)) {
                            cVar2.write(bArr6);
                            cVar2.write(O);
                        } else {
                            if (Arrays.equals(bArr3, Q)) {
                                cVar2.write(47);
                            }
                            androidx.exifinterface.media.b.f(bVar, cVar2, i14);
                        }
                        cVar2.e(i10);
                        androidx.exifinterface.media.b.f(bVar, cVar2, i14);
                    }
                    androidx.exifinterface.media.b.e(bVar, cVar2);
                    int size = byteArrayOutputStream.size();
                    byte[] bArr9 = M;
                    cVar.e(size + bArr9.length);
                    cVar.write(bArr9);
                    byteArrayOutputStream.writeTo(cVar);
                    androidx.exifinterface.media.b.c(byteArrayOutputStream);
                }
                int readInt3 = bVar.readInt();
                byte[] bArr10 = new byte[readInt3 % 2 == 1 ? readInt3 + 1 : readInt3];
                bVar.read(bArr10);
                bArr10[0] = (byte) (8 | bArr10[0]);
                if (((bArr10[0] >> 1) & 1) != 1) {
                    z10 = false;
                }
                cVar2.write(bArr4);
                cVar2.e(readInt3);
                cVar2.write(bArr10);
                if (z10) {
                    b(bVar, cVar2, S, null);
                    while (true) {
                        byte[] bArr11 = new byte[4];
                        inputStream.read(bArr11);
                        if (!Arrays.equals(bArr11, T)) {
                            break;
                        }
                        c(bVar, cVar2, bArr11);
                    }
                } else {
                    b(bVar, cVar2, R, Q);
                }
            }
            Z(cVar2);
            androidx.exifinterface.media.b.e(bVar, cVar2);
            int size2 = byteArrayOutputStream.size();
            byte[] bArr92 = M;
            cVar.e(size2 + bArr92.length);
            cVar.write(bArr92);
            byteArrayOutputStream.writeTo(cVar);
            androidx.exifinterface.media.b.c(byteArrayOutputStream);
        } catch (Exception e11) {
            e = e11;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.b.c(byteArrayOutputStream2);
            throw th;
        }
    }

    private void U(b bVar) {
        HashMap<String, d> hashMap = this.f2048f[4];
        d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m10 = dVar.m(this.f2050h);
            this.f2057o = m10;
            if (m10 != 1) {
                if (m10 != 6) {
                    if (m10 != 7) {
                        return;
                    }
                }
            }
            if (C(hashMap)) {
                t(bVar, hashMap);
                return;
            }
            return;
        }
        this.f2057o = 6;
        s(bVar, hashMap);
    }

    private static boolean V(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void W(int i10, int i11) {
        String str;
        if (this.f2048f[i10].isEmpty() || this.f2048f[i11].isEmpty()) {
            if (f2037v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f2048f[i10].get("ImageLength");
        d dVar2 = this.f2048f[i10].get("ImageWidth");
        d dVar3 = this.f2048f[i11].get("ImageLength");
        d dVar4 = this.f2048f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (!f2037v) {
                return;
            }
            str = "First image does not contain valid size information";
        } else if (dVar3 != null && dVar4 != null) {
            int m10 = dVar.m(this.f2050h);
            int m11 = dVar2.m(this.f2050h);
            int m12 = dVar3.m(this.f2050h);
            int m13 = dVar4.m(this.f2050h);
            if (m10 >= m12 || m11 >= m13) {
                return;
            }
            HashMap<String, d>[] hashMapArr = this.f2048f;
            HashMap<String, d> hashMap = hashMapArr[i10];
            hashMapArr[i10] = hashMapArr[i11];
            hashMapArr[i11] = hashMap;
            return;
        } else if (!f2037v) {
            return;
        } else {
            str = "Second image does not contain valid size information";
        }
        Log.d("ExifInterface", str);
    }

    private void X(g gVar, int i10) {
        StringBuilder sb;
        String arrays;
        d j10;
        d j11;
        d dVar = this.f2048f[i10].get("DefaultCropSize");
        d dVar2 = this.f2048f[i10].get("SensorTopBorder");
        d dVar3 = this.f2048f[i10].get("SensorLeftBorder");
        d dVar4 = this.f2048f[i10].get("SensorBottomBorder");
        d dVar5 = this.f2048f[i10].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                O(gVar, i10);
                return;
            }
            int m10 = dVar2.m(this.f2050h);
            int m11 = dVar4.m(this.f2050h);
            int m12 = dVar5.m(this.f2050h);
            int m13 = dVar3.m(this.f2050h);
            if (m11 <= m10 || m12 <= m13) {
                return;
            }
            d j12 = d.j(m11 - m10, this.f2050h);
            d j13 = d.j(m12 - m13, this.f2050h);
            this.f2048f[i10].put("ImageLength", j12);
            this.f2048f[i10].put("ImageWidth", j13);
        } else if (dVar.f2075a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f2050h);
            if (fVarArr != null && fVarArr.length == 2) {
                j10 = d.h(fVarArr[0], this.f2050h);
                j11 = d.h(fVarArr[1], this.f2050h);
                this.f2048f[i10].put("ImageWidth", j10);
                this.f2048f[i10].put("ImageLength", j11);
                return;
            }
            sb = new StringBuilder();
            sb.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(fVarArr);
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        } else {
            int[] iArr = (int[]) dVar.o(this.f2050h);
            if (iArr != null && iArr.length == 2) {
                j10 = d.j(iArr[0], this.f2050h);
                j11 = d.j(iArr[1], this.f2050h);
                this.f2048f[i10].put("ImageWidth", j10);
                this.f2048f[i10].put("ImageLength", j11);
                return;
            }
            sb = new StringBuilder();
            sb.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(iArr);
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        }
    }

    private void Y() {
        W(0, 5);
        W(0, 4);
        W(5, 4);
        d dVar = this.f2048f[1].get("PixelXDimension");
        d dVar2 = this.f2048f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f2048f[0].put("ImageWidth", dVar);
            this.f2048f[0].put("ImageLength", dVar2);
        }
        if (this.f2048f[4].isEmpty() && E(this.f2048f[5])) {
            HashMap<String, d>[] hashMapArr = this.f2048f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!E(this.f2048f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        N(0, "ThumbnailOrientation", "Orientation");
        N(0, "ThumbnailImageLength", "ImageLength");
        N(0, "ThumbnailImageWidth", "ImageWidth");
        N(5, "ThumbnailOrientation", "Orientation");
        N(5, "ThumbnailImageLength", "ImageLength");
        N(5, "ThumbnailImageWidth", "ImageWidth");
        N(4, "Orientation", "ThumbnailOrientation");
        N(4, "ImageLength", "ThumbnailImageLength");
        N(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private int Z(c cVar) {
        e[][] eVarArr = f2025j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f2026k0) {
            M(eVar.f2080b);
        }
        if (this.f2051i) {
            if (this.f2052j) {
                M("StripOffsets");
                M("StripByteCounts");
            } else {
                M("JPEGInterchangeFormat");
                M("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f2025j0.length; i10++) {
            for (Object obj : this.f2048f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f2048f[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f2048f[1].isEmpty()) {
            this.f2048f[0].put(f2026k0[1].f2080b, d.f(0L, this.f2050h));
        }
        if (!this.f2048f[2].isEmpty()) {
            this.f2048f[0].put(f2026k0[2].f2080b, d.f(0L, this.f2050h));
        }
        if (!this.f2048f[3].isEmpty()) {
            this.f2048f[1].put(f2026k0[3].f2080b, d.f(0L, this.f2050h));
        }
        if (this.f2051i) {
            if (this.f2052j) {
                this.f2048f[4].put("StripOffsets", d.j(0, this.f2050h));
                this.f2048f[4].put("StripByteCounts", d.j(this.f2055m, this.f2050h));
            } else {
                this.f2048f[4].put("JPEGInterchangeFormat", d.f(0L, this.f2050h));
                this.f2048f[4].put("JPEGInterchangeFormatLength", d.f(this.f2055m, this.f2050h));
            }
        }
        for (int i11 = 0; i11 < f2025j0.length; i11++) {
            int i12 = 0;
            for (Map.Entry<String, d> entry2 : this.f2048f[i11].entrySet()) {
                int p10 = entry2.getValue().p();
                if (p10 > 4) {
                    i12 += p10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < f2025j0.length; i14++) {
            if (!this.f2048f[i14].isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f2048f[i14].size() * 12) + 2 + 4 + iArr2[i14];
            }
        }
        if (this.f2051i) {
            if (this.f2052j) {
                this.f2048f[4].put("StripOffsets", d.j(i13, this.f2050h));
            } else {
                this.f2048f[4].put("JPEGInterchangeFormat", d.f(i13, this.f2050h));
            }
            this.f2054l = i13;
            i13 += this.f2055m;
        }
        if (this.f2046d == 4) {
            i13 += 8;
        }
        if (f2037v) {
            for (int i15 = 0; i15 < f2025j0.length; i15++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f2048f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(i13)));
            }
        }
        if (!this.f2048f[1].isEmpty()) {
            this.f2048f[0].put(f2026k0[1].f2080b, d.f(iArr[1], this.f2050h));
        }
        if (!this.f2048f[2].isEmpty()) {
            this.f2048f[0].put(f2026k0[2].f2080b, d.f(iArr[2], this.f2050h));
        }
        if (!this.f2048f[3].isEmpty()) {
            this.f2048f[1].put(f2026k0[3].f2080b, d.f(iArr[3], this.f2050h));
        }
        int i16 = this.f2046d;
        if (i16 == 4) {
            cVar.k(i13);
            cVar.write(f2032q0);
        } else if (i16 == 13) {
            cVar.e(i13);
            cVar.write(I);
        } else if (i16 == 14) {
            cVar.write(N);
            cVar.e(i13);
        }
        cVar.h(this.f2050h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.a(this.f2050h);
        cVar.k(42);
        cVar.i(8L);
        for (int i17 = 0; i17 < f2025j0.length; i17++) {
            if (!this.f2048f[i17].isEmpty()) {
                cVar.k(this.f2048f[i17].size());
                int size = iArr[i17] + 2 + (this.f2048f[i17].size() * 12) + 4;
                for (Map.Entry<String, d> entry3 : this.f2048f[i17].entrySet()) {
                    int i18 = f2028m0[i17].get(entry3.getKey()).f2079a;
                    d value = entry3.getValue();
                    int p11 = value.p();
                    cVar.k(i18);
                    cVar.k(value.f2075a);
                    cVar.e(value.f2076b);
                    if (p11 > 4) {
                        cVar.i(size);
                        size += p11;
                    } else {
                        cVar.write(value.f2078d);
                        if (p11 < 4) {
                            while (p11 < 4) {
                                cVar.b(0);
                                p11++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f2048f[4].isEmpty()) {
                    cVar.i(0L);
                } else {
                    cVar.i(iArr[4]);
                }
                for (Map.Entry<String, d> entry4 : this.f2048f[i17].entrySet()) {
                    byte[] bArr = entry4.getValue().f2078d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f2051i) {
            cVar.write(p());
        }
        if (this.f2046d == 14 && i13 % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return i13;
    }

    private void a() {
        String d10 = d("DateTimeOriginal");
        if (d10 != null && d("DateTime") == null) {
            this.f2048f[0].put("DateTime", d.e(d10));
        }
        if (d("ImageWidth") == null) {
            this.f2048f[0].put("ImageWidth", d.f(0L, this.f2050h));
        }
        if (d("ImageLength") == null) {
            this.f2048f[0].put("ImageLength", d.f(0L, this.f2050h));
        }
        if (d("Orientation") == null) {
            this.f2048f[0].put("Orientation", d.f(0L, this.f2050h));
        }
        if (d("LightSource") == null) {
            this.f2048f[1].put("LightSource", d.f(0L, this.f2050h));
        }
    }

    private void b(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        Charset charset;
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                sb.append(new String(bArr, f2031p0));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            c(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void c(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.e(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        androidx.exifinterface.media.b.f(bVar, cVar, readInt);
    }

    private d e(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f2037v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f2025j0.length; i10++) {
            d dVar = this.f2048f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void f(g gVar) {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0034b.a(mediaMetadataRetriever, new C0033a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                String str3 = null;
                if ("yes".equals(extractMetadata3)) {
                    str3 = mediaMetadataRetriever.extractMetadata(29);
                    str = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str3 = mediaMetadataRetriever.extractMetadata(18);
                    str = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                }
                if (str3 != null) {
                    this.f2048f[0].put("ImageWidth", d.j(Integer.parseInt(str3), this.f2050h));
                }
                if (str != null) {
                    this.f2048f[0].put("ImageLength", d.j(Integer.parseInt(str), this.f2050h));
                }
                if (str2 != null) {
                    int i10 = 1;
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt == 90) {
                        i10 = 6;
                    } else if (parseInt == 180) {
                        i10 = 3;
                    } else if (parseInt == 270) {
                        i10 = 8;
                    }
                    this.f2048f[0].put("Orientation", d.j(i10, this.f2050h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.i(parseInt2);
                    byte[] bArr = new byte[6];
                    if (gVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i11 = parseInt2 + 6;
                    int i12 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f2032q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i12];
                    if (gVar.read(bArr2) != i12) {
                        throw new IOException("Can't read exif");
                    }
                    this.f2058p = i11;
                    K(bArr2, 0);
                }
                if (f2037v) {
                    Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str + ", rotation " + str2);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x019a, code lost:
        r22.e(r21.f2050h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019f, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184 A[LOOP:0: B:10:0x0038->B:63:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g(androidx.exifinterface.media.a.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.g(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int h(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (w(bArr)) {
            return 4;
        }
        if (z(bArr)) {
            return 9;
        }
        if (v(bArr)) {
            return 12;
        }
        if (x(bArr)) {
            return 7;
        }
        if (A(bArr)) {
            return 10;
        }
        if (y(bArr)) {
            return 13;
        }
        return F(bArr) ? 14 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(androidx.exifinterface.media.a.g r7) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.i(androidx.exifinterface.media.a$g):void");
    }

    private void j(b bVar) {
        if (f2037v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.BIG_ENDIAN);
        byte[] bArr = H;
        bVar.h(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = i10 + 4;
                if (i11 == 16 && !Arrays.equals(bArr2, J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, K)) {
                    return;
                }
                if (Arrays.equals(bArr2, I)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f2058p = i11;
                        K(bArr3, 0);
                        Y();
                        U(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i12 = readInt + 4;
                bVar.h(i12);
                length = i11 + i12;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void k(b bVar) {
        boolean z10 = f2037v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.h(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.h(i10 - bVar.a());
        bVar.read(bArr4);
        g(new b(bArr4), i10, 5);
        bVar.h(i12 - bVar.a());
        bVar.e(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f2020e0.f2079a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j10 = d.j(readShort, this.f2050h);
                d j11 = d.j(readShort2, this.f2050h);
                this.f2048f[0].put("ImageLength", j10);
                this.f2048f[0].put("ImageWidth", j11);
                if (f2037v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.h(readUnsignedShort2);
        }
    }

    private void l(g gVar) {
        d dVar;
        H(gVar);
        L(gVar, 0);
        X(gVar, 0);
        X(gVar, 5);
        X(gVar, 4);
        Y();
        if (this.f2046d != 8 || (dVar = this.f2048f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f2078d);
        gVar2.e(this.f2050h);
        gVar2.h(6);
        L(gVar2, 9);
        d dVar2 = this.f2048f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f2048f[1].put("ColorSpace", dVar2);
        }
    }

    private void m(g gVar) {
        if (f2037v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        l(gVar);
        d dVar = this.f2048f[0].get("JpgFromRaw");
        if (dVar != null) {
            g(new b(dVar.f2078d), (int) dVar.f2077c, 5);
        }
        d dVar2 = this.f2048f[0].get("ISO");
        d dVar3 = this.f2048f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f2048f[1].put("PhotographicSensitivity", dVar2);
    }

    private void n(g gVar) {
        byte[] bArr = f2032q0;
        gVar.h(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f2058p = bArr.length;
        K(bArr2, 0);
    }

    private void q(b bVar) {
        if (f2037v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.LITTLE_ENDIAN);
        bVar.h(L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = M;
        bVar.h(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i10 = length + 4 + 4;
                if (Arrays.equals(N, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.f2058p = i10;
                        K(bArr3, 0);
                        U(new b(bArr3));
                        return;
                    }
                    throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i10 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.h(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> r(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> r10 = r(split[0]);
            if (((Integer) r10.first).intValue() == 2) {
                return r10;
            }
            for (int i10 = 1; i10 < split.length; i10++) {
                Pair<Integer, Integer> r11 = r(split[i10]);
                int intValue = (((Integer) r11.first).equals(r10.first) || ((Integer) r11.second).equals(r10.first)) ? ((Integer) r10.first).intValue() : -1;
                int intValue2 = (((Integer) r10.second).intValue() == -1 || !(((Integer) r11.first).equals(r10.second) || ((Integer) r11.second).equals(r10.second))) ? -1 : ((Integer) r10.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    r10 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    r10 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return r10;
        } else if (!str.contains("/")) {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    return (valueOf.longValue() < 0 || valueOf.longValue() > 65535) ? valueOf.longValue() < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        } else {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }
    }

    private void s(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m10 = dVar.m(this.f2050h);
        int m11 = dVar2.m(this.f2050h);
        if (this.f2046d == 7) {
            m10 += this.f2059q;
        }
        if (m10 > 0 && m11 > 0) {
            this.f2051i = true;
            if (this.f2043a == null && this.f2045c == null && this.f2044b == null) {
                byte[] bArr = new byte[m11];
                bVar.skip(m10);
                bVar.read(bArr);
                this.f2056n = bArr;
            }
            this.f2054l = m10;
            this.f2055m = m11;
        }
        if (f2037v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m10 + ", length: " + m11);
        }
    }

    private void t(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] d10 = androidx.exifinterface.media.b.d(dVar.o(this.f2050h));
        long[] d11 = androidx.exifinterface.media.b.d(dVar2.o(this.f2050h));
        if (d10 == null || d10.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        } else if (d11 == null || d11.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
        } else if (d10.length != d11.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
        } else {
            long j10 = 0;
            for (long j11 : d11) {
                j10 += j11;
            }
            int i10 = (int) j10;
            byte[] bArr = new byte[i10];
            int i11 = 1;
            this.f2053k = true;
            this.f2052j = true;
            this.f2051i = true;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < d10.length) {
                int i15 = (int) d10[i12];
                int i16 = (int) d11[i12];
                if (i12 < d10.length - i11 && i15 + i16 != d10[i12 + 1]) {
                    this.f2053k = false;
                }
                int i17 = i15 - i13;
                if (i17 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                    return;
                }
                long j12 = i17;
                if (bVar.skip(j12) != j12) {
                    Log.d("ExifInterface", "Failed to skip " + i17 + " bytes.");
                    return;
                }
                int i18 = i13 + i17;
                byte[] bArr2 = new byte[i16];
                if (bVar.read(bArr2) != i16) {
                    Log.d("ExifInterface", "Failed to read " + i16 + " bytes.");
                    return;
                }
                i13 = i18 + i16;
                System.arraycopy(bArr2, 0, bArr, i14, i16);
                i14 += i16;
                i12++;
                i11 = 1;
            }
            this.f2056n = bArr;
            if (this.f2053k) {
                this.f2054l = (int) d10[0];
                this.f2055m = i10;
            }
        }
    }

    private void u(String str) {
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream = null;
        this.f2045c = null;
        this.f2043a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (B(fileInputStream2.getFD())) {
                    this.f2044b = fileInputStream2.getFD();
                } else {
                    this.f2044b = null;
                }
                G(fileInputStream2);
                androidx.exifinterface.media.b.c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.b.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean v(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e11) {
            e = e11;
            bVar2 = bVar;
            if (f2037v) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, C)) {
            bVar.close();
            return false;
        }
        long j10 = 16;
        if (readInt == 1) {
            readInt = bVar.readLong();
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j12 != 1) {
                if (Arrays.equals(bArr3, D)) {
                    z10 = true;
                } else if (Arrays.equals(bArr3, E)) {
                    z11 = true;
                }
                if (z10 && z11) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean w(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = B;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean x(byte[] bArr) {
        boolean z10 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder J2 = J(bVar2);
                this.f2050h = J2;
                bVar2.e(J2);
                short readShort = bVar2.readShort();
                z10 = (readShort == 20306 || readShort == 21330) ? true : true;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean y(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = H;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean z(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4 A[Catch: all -> 0x010c, Exception -> 0x010f, TryCatch #20 {Exception -> 0x010f, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:121:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3 A[Catch: all -> 0x010c, Exception -> 0x010f, TryCatch #20 {Exception -> 0x010f, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:121:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P() {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.P():void");
    }

    public void T(String str, String str2) {
        StringBuilder sb;
        e eVar;
        int i10;
        HashMap<String, d> hashMap;
        d a10;
        HashMap<String, d> hashMap2;
        d c10;
        Matcher matcher;
        String str3 = str;
        String str4 = str2;
        Objects.requireNonNull(str3, "tag shouldn't be null");
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = f2036u0.matcher(str4).find();
            boolean find2 = f2038v0.matcher(str4).find();
            if (str2.length() != 19 || (!find && !find2)) {
                sb = new StringBuilder();
                sb.append("Invalid value for ");
                sb.append(str3);
                sb.append(" : ");
                sb.append(str4);
                Log.w("ExifInterface", sb.toString());
                return;
            } else if (find2) {
                str4 = str4.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f2037v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i11 = 2;
        int i12 = 1;
        if (str4 != null && f2029n0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                if (!f2035t0.matcher(str4).find()) {
                    sb = new StringBuilder();
                    sb.append("Invalid value for ");
                    sb.append(str3);
                    sb.append(" : ");
                    sb.append(str4);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new f(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                }
            }
        }
        char c11 = 0;
        int i13 = 0;
        while (i13 < f2025j0.length) {
            if ((i13 != 4 || this.f2051i) && (eVar = f2028m0[i13].get(str3)) != null) {
                if (str4 == null) {
                    this.f2048f[i13].remove(str3);
                } else {
                    Pair<Integer, Integer> r10 = r(str4);
                    int i14 = -1;
                    if (eVar.f2081c == ((Integer) r10.first).intValue() || eVar.f2081c == ((Integer) r10.second).intValue()) {
                        i10 = eVar.f2081c;
                    } else {
                        int i15 = eVar.f2082d;
                        if (i15 == -1 || !(i15 == ((Integer) r10.first).intValue() || eVar.f2082d == ((Integer) r10.second).intValue())) {
                            int i16 = eVar.f2081c;
                            if (i16 == i12 || i16 == 7 || i16 == i11) {
                                i10 = i16;
                            } else if (f2037v) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str3);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = W;
                                sb2.append(strArr[eVar.f2081c]);
                                sb2.append(eVar.f2082d == -1 ? "" : ", " + strArr[eVar.f2082d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) r10.first).intValue()]);
                                sb2.append(((Integer) r10.second).intValue() != -1 ? ", " + strArr[((Integer) r10.second).intValue()] : "");
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i10 = eVar.f2082d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            hashMap = this.f2048f[i13];
                            a10 = d.a(str4);
                            hashMap.put(str3, a10);
                            break;
                        case 2:
                        case 7:
                            hashMap = this.f2048f[i13];
                            a10 = d.e(str4);
                            hashMap.put(str3, a10);
                            break;
                        case 3:
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i17 = 0; i17 < split.length; i17++) {
                                iArr[i17] = Integer.parseInt(split[i17]);
                            }
                            hashMap = this.f2048f[i13];
                            a10 = d.k(iArr, this.f2050h);
                            hashMap.put(str3, a10);
                            break;
                        case 4:
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i18 = 0; i18 < split2.length; i18++) {
                                jArr[i18] = Long.parseLong(split2[i18]);
                            }
                            hashMap = this.f2048f[i13];
                            a10 = d.g(jArr, this.f2050h);
                            hashMap.put(str3, a10);
                            break;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i19 = 0;
                            while (i19 < split3.length) {
                                String[] split4 = split3[i19].split("/", i14);
                                fVarArr[i19] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i19++;
                                i14 = -1;
                            }
                            hashMap = this.f2048f[i13];
                            a10 = d.i(fVarArr, this.f2050h);
                            hashMap.put(str3, a10);
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f2037v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i10);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i20 = 0; i20 < split5.length; i20++) {
                                iArr2[i20] = Integer.parseInt(split5[i20]);
                            }
                            hashMap2 = this.f2048f[i13];
                            c10 = d.c(iArr2, this.f2050h);
                            hashMap2.put(str3, c10);
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i21 = 0;
                            while (i21 < split6.length) {
                                String[] split7 = split6[i21].split("/", -1);
                                fVarArr2[i21] = new f((long) Double.parseDouble(split7[c11]), (long) Double.parseDouble(split7[i12]));
                                i21++;
                                split6 = split6;
                                c11 = 0;
                                i12 = 1;
                            }
                            hashMap2 = this.f2048f[i13];
                            c10 = d.d(fVarArr2, this.f2050h);
                            hashMap2.put(str3, c10);
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i22 = 0; i22 < split8.length; i22++) {
                                dArr[i22] = Double.parseDouble(split8[i22]);
                            }
                            this.f2048f[i13].put(str3, d.b(dArr, this.f2050h));
                            break;
                    }
                    i13++;
                    i11 = 2;
                    c11 = 0;
                    i12 = 1;
                }
            }
            i13++;
            i11 = 2;
            c11 = 0;
            i12 = 1;
        }
    }

    public String d(String str) {
        String str2;
        Objects.requireNonNull(str, "tag shouldn't be null");
        d e10 = e(str);
        if (e10 != null) {
            if (!f2029n0.contains(str)) {
                return e10.n(this.f2050h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = e10.f2075a;
                if (i10 == 5 || i10 == 10) {
                    f[] fVarArr = (f[]) e10.o(this.f2050h);
                    if (fVarArr != null && fVarArr.length == 3) {
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVarArr[0].f2083a) / ((float) fVarArr[0].f2084b))), Integer.valueOf((int) (((float) fVarArr[1].f2083a) / ((float) fVarArr[1].f2084b))), Integer.valueOf((int) (((float) fVarArr[2].f2083a) / ((float) fVarArr[2].f2084b))));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr);
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + e10.f2075a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(e10.l(this.f2050h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public byte[] o() {
        int i10 = this.f2057o;
        if (i10 == 6 || i10 == 7) {
            return p();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[Catch: Exception -> 0x0088, all -> 0x00a7, TRY_ENTER, TryCatch #3 {all -> 0x00a7, blocks: (B:28:0x004f, B:31:0x0065, B:33:0x0071, B:38:0x007c, B:39:0x0081, B:40:0x0082, B:41:0x0087, B:52:0x0099), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082 A[Catch: Exception -> 0x0088, all -> 0x00a7, TryCatch #3 {all -> 0x00a7, blocks: (B:28:0x004f, B:31:0x0065, B:33:0x0071, B:38:0x007c, B:39:0x0081, B:40:0x0082, B:41:0x0087, B:52:0x0099), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] p() {
        /*
            r11 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r11.f2051i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r11.f2056n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r11.f2045c     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r1 == 0) goto L2e
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            if (r3 == 0) goto L1c
            r1.reset()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
        L1a:
            r3 = r2
            goto L4f
        L1c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            androidx.exifinterface.media.b.c(r1)
            return r2
        L25:
            r0 = move-exception
            r3 = r2
            goto La8
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L99
        L2e:
            java.lang.String r1 = r11.f2043a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r1 == 0) goto L3a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r3 = r11.f2043a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            goto L1a
        L3a:
            java.io.FileDescriptor r1 = r11.f2044b     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.io.FileDescriptor r1 = androidx.exifinterface.media.b.a.b(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r3 = 0
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            androidx.exifinterface.media.b.a.c(r1, r3, r5)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r10 = r3
            r3 = r1
            r1 = r10
        L4f:
            int r4 = r11.f2054l     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r5 = r11.f2058p     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            long r4 = r1.skip(r4)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r11.f2054l     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r7 = r11.f2058p     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r6 + r7
            long r6 = (long) r6
            java.lang.String r8 = "Corrupted image"
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L82
            int r4 = r11.f2055m     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r5 = r1.read(r4)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r11.f2055m     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            if (r5 != r6) goto L7c
            r11.f2056n = r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            androidx.exifinterface.media.b.c(r1)
            if (r3 == 0) goto L7b
            androidx.exifinterface.media.b.b(r3)
        L7b:
            return r4
        L7c:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            r4.<init>(r8)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            throw r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
        L82:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            r4.<init>(r8)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            throw r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
        L88:
            r4 = move-exception
            goto L99
        L8a:
            r0 = move-exception
            r3 = r1
            goto La9
        L8d:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L99
        L92:
            r0 = move-exception
            r3 = r2
            goto La9
        L95:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L99:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> La7
            androidx.exifinterface.media.b.c(r1)
            if (r3 == 0) goto La6
            androidx.exifinterface.media.b.b(r3)
        La6:
            return r2
        La7:
            r0 = move-exception
        La8:
            r2 = r1
        La9:
            androidx.exifinterface.media.b.c(r2)
            if (r3 == 0) goto Lb1
            androidx.exifinterface.media.b.b(r3)
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.p():byte[]");
    }
}
