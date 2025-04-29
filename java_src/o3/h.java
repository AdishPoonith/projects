package o3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f14444e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f14445f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f14446g;

    /* renamed from: h  reason: collision with root package name */
    private FileInputStream f14447h;

    /* renamed from: i  reason: collision with root package name */
    private long f14448i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14449j;

    /* loaded from: classes.dex */
    public static class a extends m {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public h(Context context) {
        super(false);
        this.f14444e = context.getContentResolver();
    }

    @Override // o3.l
    public void close() {
        this.f14445f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f14447h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f14447h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14446g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f14446g = null;
                        if (this.f14449j) {
                            this.f14449j = false;
                            r();
                        }
                    }
                } catch (IOException e10) {
                    throw new a(e10, 2000);
                }
            } catch (IOException e11) {
                throw new a(e11, 2000);
            }
        } catch (Throwable th) {
            this.f14447h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f14446g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f14446g = null;
                    if (this.f14449j) {
                        this.f14449j = false;
                        r();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new a(e12, 2000);
                }
            } finally {
                this.f14446g = null;
                if (this.f14449j) {
                    this.f14449j = false;
                    r();
                }
            }
        }
    }

    @Override // o3.l
    public Uri j() {
        return this.f14445f;
    }

    @Override // o3.l
    public long m(p pVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = pVar.f14512a;
            this.f14445f = uri;
            s(pVar);
            if ("content".equals(pVar.f14512a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f14444e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f14444e.openAssetFileDescriptor(uri, "r");
            }
            this.f14446g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f14447h = fileInputStream;
            int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            if (i10 != 0 && pVar.f14518g > length) {
                throw new a(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(pVar.f14518g + startOffset) - startOffset;
            if (skip == pVar.f14518g) {
                if (i10 == 0) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f14448i = -1L;
                    } else {
                        long position = size - channel.position();
                        this.f14448i = position;
                        if (position < 0) {
                            throw new a(null, 2008);
                        }
                    }
                } else {
                    long j10 = length - skip;
                    this.f14448i = j10;
                    if (j10 < 0) {
                        throw new a(null, 2008);
                    }
                }
                long j11 = pVar.f14519h;
                if (j11 != -1) {
                    long j12 = this.f14448i;
                    if (j12 != -1) {
                        j11 = Math.min(j12, j11);
                    }
                    this.f14448i = j11;
                }
                this.f14449j = true;
                t(pVar);
                long j13 = pVar.f14519h;
                return j13 != -1 ? j13 : this.f14448i;
            }
            throw new a(null, 2008);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // o3.i
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14448i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int read = ((FileInputStream) p3.n0.j(this.f14447h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f14448i;
        if (j11 != -1) {
            this.f14448i = j11 - read;
        }
        q(read);
        return read;
    }
}
