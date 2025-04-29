package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a  reason: collision with root package name */
    final Object f414a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f415b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<c, a> f416c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f417d;

    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: j  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f418j;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f418j.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f414a) {
                mediaControllerCompat$MediaControllerImplApi21.f417d.b(b.a.p(androidx.core.app.f.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f417d.c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void G2(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void b0(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void h(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void i() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void v(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void y(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f417d.a() == null) {
            return;
        }
        for (c cVar : this.f415b) {
            a aVar = new a(cVar);
            this.f416c.put(cVar, aVar);
            cVar.f450b = aVar;
            try {
                this.f417d.a().V(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
            }
        }
        this.f415b.clear();
    }
}
