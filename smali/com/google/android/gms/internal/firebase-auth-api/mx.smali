.class final Lcom/google/android/gms/internal/firebase-auth-api/mx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/o0;


# instance fields
.field final synthetic a:Lcom/google/firebase/auth/z0;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/g;

.field final synthetic c:Lcom/google/android/gms/internal/firebase-auth-api/rx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/rx;Lcom/google/firebase/auth/z0;Lcom/google/android/gms/internal/firebase-auth-api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->c:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->a:Lcom/google/firebase/auth/z0;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->b:Lcom/google/android/gms/internal/firebase-auth-api/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La6/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->b:Lcom/google/android/gms/internal/firebase-auth-api/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/g;->h(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/j2;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/v2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/v2;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/v2;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/v2;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->a:Lcom/google/firebase/auth/z0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/z0;->C()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->a:Lcom/google/firebase/auth/z0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/z0;->x()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->a:Lcom/google/firebase/auth/z0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/z0;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/v2;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/v2;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->a:Lcom/google/firebase/auth/z0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/z0;->D()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->a:Lcom/google/firebase/auth/z0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/z0;->B()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_3

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->a:Lcom/google/firebase/auth/z0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/z0;->zza()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/v2;->g(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/v2;

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->c:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mx;->b:Lcom/google/android/gms/internal/firebase-auth-api/g;

    invoke-static {v1, v2, p1, v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->w(Lcom/google/android/gms/internal/firebase-auth-api/rx;Lcom/google/android/gms/internal/firebase-auth-api/g;Lcom/google/android/gms/internal/firebase-auth-api/j2;Lcom/google/android/gms/internal/firebase-auth-api/v2;Lcom/google/android/gms/internal/firebase-auth-api/n0;)V

    return-void
.end method
