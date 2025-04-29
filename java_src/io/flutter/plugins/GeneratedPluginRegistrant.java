package io.flutter.plugins;

import a9.l;
import androidx.annotation.Keep;
import com.mr.flutter.plugin.filepicker.FilePickerPlugin;
import d8.b;
import e9.s;
import io.flutter.embedding.engine.a;
import io.flutter.plugins.firebase.core.i;
import io.flutter.plugins.googlemaps.n;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import j0.c;
import n0.q;
import u8.t0;
import v7.e;
import v8.w;
import y8.t;
@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.p().i(new w());
        } catch (Exception e10) {
            b.c(TAG, "Error registering plugin cloud_firestore, io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin", e10);
        }
        try {
            aVar.p().i(new FilePickerPlugin());
        } catch (Exception e11) {
            b.c(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e11);
        }
        try {
            aVar.p().i(new t0());
        } catch (Exception e12) {
            b.c(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e12);
        }
        try {
            aVar.p().i(new i());
        } catch (Exception e13) {
            b.c(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e13);
        }
        try {
            aVar.p().i(new t());
        } catch (Exception e14) {
            b.c(TAG, "Error registering plugin firebase_storage, io.flutter.plugins.firebase.storage.FlutterFirebaseStoragePlugin", e14);
        }
        try {
            aVar.p().i(new c());
        } catch (Exception e15) {
            b.c(TAG, "Error registering plugin flutter_facebook_auth, app.meedu.flutter_facebook_auth.FlutterFacebookAuthPlugin", e15);
        }
        try {
            aVar.p().i(new z8.a());
        } catch (Exception e16) {
            b.c(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e16);
        }
        try {
            aVar.p().i(new e());
        } catch (Exception e17) {
            b.c(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e17);
        }
        try {
            aVar.p().i(new g9.a());
        } catch (Exception e18) {
            b.c(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e18);
        }
        try {
            aVar.p().i(new l0.b());
        } catch (Exception e19) {
            b.c(TAG, "Error registering plugin geocoding_android, com.baseflow.geocoding.GeocodingPlugin", e19);
        }
        try {
            aVar.p().i(new h9.a());
        } catch (Exception e20) {
            b.c(TAG, "Error registering plugin google_api_headers, io.github.zeshuaro.google_api_headers.GoogleApiHeadersPlugin", e20);
        }
        try {
            aVar.p().i(new n());
        } catch (Exception e21) {
            b.c(TAG, "Error registering plugin google_maps_flutter_android, io.flutter.plugins.googlemaps.GoogleMapsPlugin", e21);
        }
        try {
            aVar.p().i(new l());
        } catch (Exception e22) {
            b.c(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e22);
        }
        try {
            aVar.p().i(new ImagePickerPlugin());
        } catch (Exception e23) {
            b.c(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e23);
        }
        try {
            aVar.p().i(new com.lyokone.location.b());
        } catch (Exception e24) {
            b.c(TAG, "Error registering plugin location, com.lyokone.location.LocationPlugin", e24);
        }
        try {
            aVar.p().i(new o0.a());
        } catch (Exception e25) {
            b.c(TAG, "Error registering plugin maps_launcher, com.example.maps_launcher.MapsLauncherPlugin", e25);
        }
        try {
            aVar.p().i(new b8.a());
        } catch (Exception e26) {
            b.c(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e26);
        }
        try {
            aVar.p().i(new b9.i());
        } catch (Exception e27) {
            b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e27);
        }
        try {
            aVar.p().i(new c9.l());
        } catch (Exception e28) {
            b.c(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e28);
        }
        try {
            aVar.p().i(new q());
        } catch (Exception e29) {
            b.c(TAG, "Error registering plugin speech_to_text, com.csdcorp.speech_to_text.SpeechToTextPlugin", e29);
        }
        try {
            aVar.p().i(new y7.b());
        } catch (Exception e30) {
            b.c(TAG, "Error registering plugin twitter_login, com.maru.twitter_login.TwitterLoginPlugin", e30);
        }
        try {
            aVar.p().i(new d9.i());
        } catch (Exception e31) {
            b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e31);
        }
        try {
            aVar.p().i(new s());
        } catch (Exception e32) {
            b.c(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e32);
        }
        try {
            aVar.p().i(new c8.c());
        } catch (Exception e33) {
            b.c(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e33);
        }
    }
}
