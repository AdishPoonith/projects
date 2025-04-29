.class public final Ln4/f;
.super Ln4/a;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService"

    invoke-direct {p0, p1, v0}, Ln4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final M(Ln4/h;)V
    .locals 1

    invoke-virtual {p0}, Ln4/a;->p()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Ln4/e;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Ln4/a;->x(ILandroid/os/Parcel;)V

    return-void
.end method
